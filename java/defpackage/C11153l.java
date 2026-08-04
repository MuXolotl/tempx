package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: renamed from: lُٛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11153l extends AbstractC1975l {
    public final C4822l admob;
    public final C7972l subs;

    public C11153l(C4822l c4822l, C7972l c7972l) {
        this.admob = c4822l;
        this.subs = c7972l;
    }

    public static C11153l firebase(C4822l c4822l, C7972l c7972l) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        C11232l c11232l = c4822l.admob;
        C0346l c0346l = (C0346l) c7972l.f16631l;
        C15026l c15026l = c11232l.yandex;
        int length = c0346l.yandex.length;
        String str = "Encoded private key byte length for " + String.valueOf(c15026l) + " must be %d, not " + length;
        C15026l c15026l2 = C15026l.admob;
        C15026l c15026l3 = C15026l.mopub;
        C15026l c15026l4 = C15026l.billing;
        C15026l c15026l5 = C15026l.purchase;
        C15026l c15026l6 = C15026l.amazon;
        if (c15026l == c15026l6) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (c15026l == c15026l5) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (c15026l == c15026l4) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else if (c15026l == c15026l3) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            if (c15026l != c15026l2) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(c15026l)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] bArrLoadAd = c4822l.subs.loadAd();
        byte[] bArrLoadAd2 = c0346l.loadAd();
        if (c15026l == c15026l6 || c15026l == c15026l5 || c15026l == c15026l4) {
            if (c15026l == c15026l6) {
                eCParameterSpec = AbstractC12312l.yandex;
            } else if (c15026l == c15026l5) {
                eCParameterSpec = AbstractC12312l.loadAd;
            } else {
                if (c15026l != c15026l4) {
                    C8339l.metrica("Unable to determine NIST curve params for ".concat(String.valueOf(c15026l)));
                    return null;
                }
                eCParameterSpec = AbstractC12312l.crashlytics;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerLoadAd = AbstractC17185l.loadAd(bArrLoadAd2);
            if (bigIntegerLoadAd.signum() <= 0 || bigIntegerLoadAd.compareTo(order) >= 0) {
                C18262l.ads("Invalid private key.");
                return null;
            }
            if (!AbstractC12312l.mopub(bigIntegerLoadAd, eCParameterSpec).equals(C17423l.subs(eCParameterSpec.getCurve(), EnumC5521l.f11790l, bArrLoadAd))) {
                C18262l.ads("Invalid private key for public key.");
                return null;
            }
        } else if (c15026l == c15026l3) {
            if (!Arrays.equals(AbstractC10478l.mopub(bArrLoadAd2), bArrLoadAd)) {
                C18262l.ads("Invalid private key for public key.");
                return null;
            }
        } else if (c15026l != c15026l2) {
            C8339l.metrica("Unable to validate key pair for ".concat(String.valueOf(c15026l)));
            return null;
        }
        return new C11153l(c4822l, c7972l);
    }

    @Override // defpackage.AbstractC1975l
    public final AbstractC6968l isPro() {
        return this.admob;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob.admob;
    }

    @Override // defpackage.AbstractC1975l
    public final AbstractC7490l subs() {
        return this.admob;
    }
}
