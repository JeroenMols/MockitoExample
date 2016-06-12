package com.jeroenmols.mockitoexample;

import android.os.Handler;
import android.os.Message;

/**
 * @author Jeroen Mols on 12/06/16.
 */
public class HandlerWrapper {

    private final Handler handler;

    public HandlerWrapper() {
        handler = new Handler();
    }

    public boolean post(Runnable r) {
        return handler.post(r);
    }

    public boolean sendMessage(Message msg) {
        return handler.sendMessage(msg);
    }
}
