package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC14024l;
import defpackage.C10551l;
import defpackage.C10754l;
import defpackage.C1196l;
import defpackage.C13886l;
import defpackage.C17837l;
import defpackage.C7110l;
import defpackage.C7804l;
import defpackage.InterfaceC12184l;
import defpackage.metrica;
import defpackage.pro;
import java.security.InvalidKeyException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class WrapUtil {
    public static InterfaceC12184l getKeyUnwrapper(C17837l c17837l, byte[] bArr) {
        c17837l.getClass();
        InterfaceC12184l wrapper = getWrapper("AES-KWP");
        wrapper.init(false, new C13886l(makeKeyBytes(c17837l, bArr)));
        return wrapper;
    }

    public static InterfaceC12184l getKeyWrapper(C17837l c17837l, byte[] bArr) {
        c17837l.getClass();
        InterfaceC12184l wrapper = getWrapper("AES-KWP");
        wrapper.init(true, new C13886l(makeKeyBytes(c17837l, bArr)));
        return wrapper;
    }

    public static InterfaceC12184l getWrapper(String str) {
        if (str.equalsIgnoreCase("AESWRAP") || str.equalsIgnoreCase("AES")) {
            return new C7804l(metrica.loadAd());
        }
        if (str.equalsIgnoreCase("ARIA")) {
            return new C7804l(new pro());
        }
        if (str.equalsIgnoreCase("Camellia")) {
            return new C7804l(new C1196l(2));
        }
        if (str.equalsIgnoreCase("SEED")) {
            return new C7804l(new C7110l(1, false));
        }
        if (str.equalsIgnoreCase("AES-KWP")) {
            return new C10551l(metrica.loadAd());
        }
        if (str.equalsIgnoreCase("Camellia-KWP")) {
            return new C10551l(new C1196l(2));
        }
        if (str.equalsIgnoreCase("ARIA-KWP")) {
            return new C10551l(new pro());
        }
        C10754l.ads("unknown key algorithm: ".concat(str));
        return null;
    }

    private static byte[] makeKeyBytes(C17837l c17837l, byte[] bArr) throws InvalidKeyException {
        try {
            return KdfUtil.makeKeyBytes(c17837l.f11406l, bArr, AbstractC14024l.crashlytics(c17837l.f11405l), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } catch (IllegalArgumentException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public static byte[] trimSecret(String str, byte[] bArr) {
        return str.equals("SEED") ? AbstractC14024l.vip(0, 16, bArr) : bArr;
    }
}
