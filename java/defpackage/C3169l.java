package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3169l {
    public static final C3169l amazon;
    public final BigInteger crashlytics;
    public final BigInteger loadAd;
    public final BigInteger yandex;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        amazon = new C3169l(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public C3169l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.yandex = bigInteger;
        this.loadAd = bigInteger2;
        this.crashlytics = bigInteger3;
    }
}
