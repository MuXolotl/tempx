package org.conscrypt;

import java.net.Socket;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface PSKKeyManager extends KeyManager {
    public static final int MAX_IDENTITY_HINT_LENGTH_BYTES = 128;
    public static final int MAX_IDENTITY_LENGTH_BYTES = 128;
    public static final int MAX_KEY_LENGTH_BYTES = 256;

    String chooseClientKeyIdentity(String str, Socket socket);

    String chooseClientKeyIdentity(String str, SSLEngine sSLEngine);

    String chooseServerKeyIdentityHint(Socket socket);

    String chooseServerKeyIdentityHint(SSLEngine sSLEngine);

    SecretKey getKey(String str, String str2, Socket socket);

    SecretKey getKey(String str, String str2, SSLEngine sSLEngine);
}
