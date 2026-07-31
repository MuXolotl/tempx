package defpackage;

/* JADX INFO: renamed from: lٍۗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9761l {
    public final float[] amazon;
    public final AbstractC11833l crashlytics;
    public final AbstractC11833l loadAd;
    public final AbstractC11833l yandex;

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C9761l(AbstractC11833l abstractC11833l, AbstractC11833l abstractC11833l2, int i) {
        float[] fArr;
        AbstractC11833l abstractC11833lCrashlytics = AbstractC9843l.mopub(abstractC11833l.loadAd, 12884901888L) ? AbstractC0136l.crashlytics(abstractC11833l) : abstractC11833l;
        AbstractC11833l abstractC11833lCrashlytics2 = AbstractC9843l.mopub(abstractC11833l2.loadAd, 12884901888L) ? AbstractC0136l.crashlytics(abstractC11833l2) : abstractC11833l2;
        if (i == 3) {
            boolean zMopub = AbstractC9843l.mopub(abstractC11833l.loadAd, 12884901888L);
            boolean zMopub2 = AbstractC9843l.mopub(abstractC11833l2.loadAd, 12884901888L);
            if (!(zMopub && zMopub2) && (zMopub || zMopub2)) {
                C18558l c18558l = ((C0777l) (zMopub ? abstractC11833l : abstractC11833l2)).amazon;
                float[] fArrYandex = AbstractC2238l.purchase;
                float[] fArrYandex2 = zMopub ? c18558l.yandex() : fArrYandex;
                fArrYandex = zMopub2 ? c18558l.yandex() : fArrYandex;
                fArr = new float[]{fArrYandex2[0] / fArrYandex[0], fArrYandex2[1] / fArrYandex[1], fArrYandex2[2] / fArrYandex[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(abstractC11833l2, abstractC11833lCrashlytics, abstractC11833lCrashlytics2, fArr);
    }

    public long yandex(long j) {
        float fAdmob = C9735l.admob(j);
        float fMopub = C9735l.mopub(j);
        float fPurchase = C9735l.purchase(j);
        float fAmazon = C9735l.amazon(j);
        AbstractC11833l abstractC11833l = this.loadAd;
        long jAmazon = abstractC11833l.amazon(fAdmob, fMopub, fPurchase);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAmazon >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAmazon & 4294967295L));
        float fPurchase2 = abstractC11833l.purchase(fAdmob, fMopub, fPurchase);
        float[] fArr = this.amazon;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fPurchase2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.crashlytics.billing(f, f2, fPurchase2, fAmazon, this.yandex);
    }

    public C9761l(AbstractC11833l abstractC11833l, AbstractC11833l abstractC11833l2, AbstractC11833l abstractC11833l3, float[] fArr) {
        this.yandex = abstractC11833l;
        this.loadAd = abstractC11833l2;
        this.crashlytics = abstractC11833l3;
        this.amazon = fArr;
    }
}
