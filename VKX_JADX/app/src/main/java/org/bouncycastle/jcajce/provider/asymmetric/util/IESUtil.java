package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.C0800l;
import defpackage.C1838l;
import defpackage.InterfaceC10952l;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class IESUtil {
    public static C1838l guessParameterSpec(C0800l c0800l, byte[] bArr) {
        if (c0800l == null) {
            return new C1838l(null, null, 128, -1, null, false);
        }
        InterfaceC10952l interfaceC10952lAmazon = c0800l.amazon();
        if (interfaceC10952lAmazon.getAlgorithmName().equals("DES") || interfaceC10952lAmazon.getAlgorithmName().equals("RC2") || interfaceC10952lAmazon.getAlgorithmName().equals("RC5-32") || interfaceC10952lAmazon.getAlgorithmName().equals("RC5-64")) {
            return new C1838l(null, null, 64, 64, bArr, false);
        }
        if (interfaceC10952lAmazon.getAlgorithmName().equals("SKIPJACK")) {
            return new C1838l(null, null, 80, 80, bArr, false);
        }
        return interfaceC10952lAmazon.getAlgorithmName().equals("GOST28147") ? new C1838l(null, null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr, false) : new C1838l(null, null, 128, 128, bArr, false);
    }
}
