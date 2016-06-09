package com.jeroenmols.mockitoexample;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public class UserTest {

    public static final int USER_ID = 1111007;
    public static final String PASSWORD = "n1c3try";

    @Test
    public void createUserWithWebService() throws Exception {
        WebService mockWebService = mock(WebService.class);

        new User(mockWebService, 0, null);
    }

    @Test
    public void logoutOfWebservice() throws Exception {
        WebService mockWebService = mock(WebService.class);
        User user = new User(mockWebService, USER_ID, PASSWORD);

        user.logout();

        verify(mockWebService).logout();
        verify(mockWebService, times(1)).logout();
        verify(mockWebService, atLeast(1)).logout();
        verify(mockWebService, atLeastOnce()).logout();
        verify(mockWebService, atMost(1)).logout();
        verify(mockWebService, only()).logout();
        verify(mockWebService, never()).login(0, null, null);
    }

    @Test
    public void loginToWebservice() throws Exception {
        WebService mockWebService = mock(WebService.class);
        User user = new User(mockWebService, USER_ID, PASSWORD);

        user.login(null);

        verify(mockWebService).login(anyInt(), anyString(), any(Response.class));
    }


    @Test
    public void loginWithUserNameAndPassword() throws Exception {
        WebService mockWebService = mock(WebService.class);
        User user = new User(mockWebService, USER_ID, PASSWORD);

        user.login(null);

        verify(mockWebService).login(eq(USER_ID), eq(PASSWORD), any(Response.class));
    }
}