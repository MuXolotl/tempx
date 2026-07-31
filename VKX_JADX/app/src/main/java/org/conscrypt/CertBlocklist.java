package org.conscrypt;

import java.math.BigInteger;
import java.security.PublicKey;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface CertBlocklist {
    boolean isPublicKeyBlockListed(PublicKey publicKey);

    boolean isSerialNumberBlockListed(BigInteger bigInteger);
}
