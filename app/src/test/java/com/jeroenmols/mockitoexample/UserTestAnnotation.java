package com.jeroenmols.mockitoexample;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class UserTestAnnotation {

    public static final String USER_NAME = "myUserName";
    public static final String PASSWORD = "n1c3try";

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private WebService mockWebService;

    @Test
    public void createUserWithWebService() throws Exception {
        new User(mockWebService, null, null);
    }

    @Test
    public void loginWithUserNameAndPassword() throws Exception {
        User user = new User(mockWebService, USER_NAME, PASSWORD);

        user.login(null);

        verify(mockWebService).login(eq(USER_NAME), eq(PASSWORD), any(Response.class));
    }
}