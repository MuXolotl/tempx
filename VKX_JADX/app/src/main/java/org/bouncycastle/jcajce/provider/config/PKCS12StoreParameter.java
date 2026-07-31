package org.bouncycastle.jcajce.provider.config;

import defpackage.C7809l;
import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12StoreParameter extends C7809l {
    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr) {
        super(outputStream, new KeyStore.PasswordProtection(cArr), false, true);
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z) {
        super(outputStream, protectionParameter, z, true);
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        super(outputStream, protectionParameter, false, true);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z) {
        super(outputStream, new KeyStore.PasswordProtection(cArr), z, true);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z, boolean z2) {
        super(outputStream, new KeyStore.PasswordProtection(cArr), z, z2);
    }
}
