package com.mycompany.soapconnector;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * Callback handler to set correct password for the client's private key (used for signing and decrypting).
 */
public class ClientKeystorePasswordCallbackHandler implements CallbackHandler {
    public void handle(Callback[] callbacks) {
        for (Callback callback : callbacks) {
            WSPasswordCallback pc = (WSPasswordCallback) callback;
            if (pc.getIdentifier().equals("cert")) {
                pc.setPassword("damith");
                return;
            }
        }
    }
}
