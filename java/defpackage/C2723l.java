package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؘؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2723l {
    public final C7026l loadAd;
    public final C0458l yandex;

    public C2723l(AbstractC11861l abstractC11861l, C0458l c0458l) {
        this.yandex = c0458l;
        this.loadAd = new C7026l(20, abstractC11861l.isPro((BigInteger) c0458l.f1691l));
    }

    public final BigInteger[] yandex(BigInteger bigInteger) {
        C11906l c11906l = (C11906l) this.yandex.f1690l;
        int i = c11906l.loadAd;
        BigInteger bigIntegerPurchase = AbstractC16291l.purchase(i, bigInteger, (BigInteger) c11906l.mopub);
        BigInteger bigIntegerPurchase2 = AbstractC16291l.purchase(i, bigInteger, (BigInteger) c11906l.admob);
        return new BigInteger[]{bigInteger.subtract(bigIntegerPurchase.multiply((BigInteger) c11906l.crashlytics).add(bigIntegerPurchase2.multiply((BigInteger) c11906l.purchase))), bigIntegerPurchase.multiply((BigInteger) c11906l.amazon).add(bigIntegerPurchase2.multiply((BigInteger) c11906l.billing)).negate()};
    }
}
