package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lًُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8375l {
    public static C8375l yandex(C6533l c6533l, Provider provider) throws GeneralSecurityException {
        C8375l c8375l = new C8375l();
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            c6533l.isPro.loadAd();
            new SecretKeySpec(((C0346l) c6533l.subs.f16631l).loadAd(), "AES");
            return c8375l;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
