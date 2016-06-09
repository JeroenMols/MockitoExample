package com.jeroenmols.mockitoexample;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class UserTestAnnotation {

    public static final int USER_ID = 1111007;
    public static final String PASSWORD = "n1c3try";

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private WebService mockWebService;

    @Test
    public void createUserWithWebService() throws Exception {
        new User(mockWebService, 0, null);
    }

    @Test
    public void loginWithUserNameAndPassword() throws Exception {
        User user = new User(mockWebService, USER_ID, PASSWORD);

        user.login(null);

        verify(mockWebService).login(eq(USER_ID), eq(PASSWORD), any(Response.class));
    }
}