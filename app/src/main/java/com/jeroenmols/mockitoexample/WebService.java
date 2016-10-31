package com.jeroenmols.mockitoexample;

import java.util.List;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class WebService {

    public void login(int userId, String password, Response response) {
        throw new RuntimeException("Not implemented");
    }

    public void logout() {
        throw new RuntimeException("Not implemented");
    }

    public boolean isNetworkOffline() {
        throw new RuntimeException("Not implemented");
    }

    public void sendMessages(User user, List<String> messages) {
        throw new RuntimeException("Not implemented");
    }
}
