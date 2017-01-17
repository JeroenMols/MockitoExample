package com.jeroenmols.mockitoexample;

import java.util.Arrays;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class User {

    private final WebService webService;
    private final int userId;
    private final String password;

    public User(WebService webService, int userId, String password) {
        if (webService == null) {
            throw new RuntimeException("Webservice required");
        }
        this.webService = webService;
        this.userId = userId;
        this.password = password;
    }

    public void login(final LoginInterface loginInterface) {
        if (webService.isNetworkOffline()) {
            loginInterface.onLoginFailed();
            return;
        }

        Response response = new Response() {
            @Override
            public void onRequestCompleted(boolean isSuccess, String data) {
                if (isSuccess) {
                    loginInterface.onLoginSuccess();
                } else {
                    loginInterface.onLoginFailed();
                }
            }
        };
        webService.login(userId, password, response);
    }

    public void logout() {
        webService.logout();
    }

    public void sendMessage(String message) {
        // For demonstration purposes just fire and forget
        webService.sendMessages(this, Arrays.asList(message));
    }

    public void getMessages() {
        // For demonstration purposes just fire and forget
        webService.getMessages(this);
    }
}
