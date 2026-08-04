package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5523l extends AbstractC1975l {
    public final C5454l admob;
    public final C7972l isPro;
    public final C5138l subs;

    public C5523l(C5454l c5454l, C5138l c5138l, C7972l c7972l) {
        this.admob = c5454l;
        this.subs = c5138l;
        this.isPro = c7972l;
    }

    public static C5523l firebase(C5454l c5454l, C7972l c7972l) throws GeneralSecurityException {
        C0346l c0346l = c5454l.isPro;
        if (c0346l == null) {
            C18262l.ads("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
            return null;
        }
        byte[] bArrLoadAd = ((C0346l) c7972l.f16631l).loadAd();
        byte[] bArrLoadAd2 = c0346l.loadAd();
        if (bArrLoadAd.length != 32) {
            C18262l.ads("Private key bytes length for X25519 curve must be 32");
            return null;
        }
        if (Arrays.equals(AbstractC10478l.mopub(bArrLoadAd), bArrLoadAd2)) {
            return new C5523l(c5454l, null, c7972l);
        }
        C18262l.ads("Invalid private key for public key.");
        return null;
    }

    public static ECParameterSpec remoteconfig(C15059l c15059l) {
        if (c15059l == C15059l.loadAd) {
            return AbstractC12312l.yandex;
        }
        if (c15059l == C15059l.crashlytics) {
            return AbstractC12312l.loadAd;
        }
        if (c15059l == C15059l.amazon) {
            return AbstractC12312l.crashlytics;
        }
        C8339l.metrica("Unable to determine NIST curve type for ".concat(String.valueOf(c15059l)));
        return null;
    }

    public static C5523l smaato(C5454l c5454l, C5138l c5138l) throws GeneralSecurityException {
        ECPoint eCPoint = c5454l.subs;
        if (eCPoint == null) {
            C18262l.ads("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            return null;
        }
        BigInteger bigInteger = (BigInteger) c5138l.f11181l;
        C15059l c15059l = c5454l.admob.yandex;
        BigInteger order = remoteconfig(c15059l).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            C18262l.ads("Invalid private value");
            return null;
        }
        if (AbstractC12312l.mopub(bigInteger, remoteconfig(c15059l)).equals(eCPoint)) {
            return new C5523l(c5454l, c5138l, null);
        }
        C18262l.ads("Invalid private value");
        return null;
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
