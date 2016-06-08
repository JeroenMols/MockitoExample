package com.jeroenmols.mockitoexample;

/**
 * @author Jeroen Mols on 08/06/16.
 */
public interface Response {
    void onRequestCompleted(boolean isSuccess, String data);
}
