package com.jeroenmols.mockitoexample;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class UserTest {

    public static final String USER_NAME = "myUserName";
    public static final String PASSWORD = "n1c3try";

    @Test
    public void createUserWithWebService() throws Exception {
        WebService mockWebService = mock(WebService.class);

        new User(mockWebService, null, null);
    }

    @Test
    public void loginWithUserNameAndPassword() throws Exception {
        WebService mockWebService = mock(WebService.class);
        User user = new User(mockWebService, USER_NAME, PASSWORD);

        user.login(null);

        verify(mockWebService).login(eq(USER_NAME), eq(PASSWORD), any(Response.class));
    }
}