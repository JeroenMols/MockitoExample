package com.jeroenmols.mockitoexample;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class User {

    private final WebService webService;
    private final String userName;
    private final String password;

    public User(WebService webService, String userName, String password) {
        this.webService = webService;
        this.userName = userName;
        this.password = password;
    }

    public void login(final LoginInterface loginInterface) {
        webService.login(userName, password, new Response() {
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
}
