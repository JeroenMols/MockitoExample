package com.jeroenmols.mockitoexample;

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
        webService.login(userId, password, new Response() {
            @Override
            public void onRequestCompleted(boolean isSuccess, String data) {
                if (isSuccess) {
                    loginInterface.onLoginSuccess();
                } else {
                    loginInterface.onLoginFailed();
                }
            }
        });
    }

    public void logout() {
        webService.logout();
    }
}
