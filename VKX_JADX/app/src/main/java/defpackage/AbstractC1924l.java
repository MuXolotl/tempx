package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1924l {
    public static final /* synthetic */ int loadAd = 0;
    public static final long yandex = AbstractC7563l.loadAd(0, 0, 0, 0, 5);

    public static void crashlytics(String str) {
        throw new IllegalArgumentException(AbstractC14814l.adcel("Unsupported type: ", str, ". ", AbstractC15560l.Signature("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final long loadAd(long j) {
        int iAds = AbstractC5573l.ads(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) AbstractC5573l.ads(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iAds) << 32);
    }

    public static final InterfaceC0476l yandex(InterfaceC17030l interfaceC17030l, C6956l c6956l) {
        Object obj;
        Object obj2;
        boolean zYandex = AbstractC8576l.yandex(interfaceC17030l, C4176l.purchase);
        boolean zMopub = c6956l.mopub(zYandex);
        Object objM2132native = c6956l.m2132native();
        if (zMopub || objM2132native == C1867l.yandex) {
            if (zYandex) {
                obj = InterfaceC0476l.f1732l;
            } else {
                C15466l c15466l = new C15466l();
                c15466l.f30261l = yandex;
                c15466l.f30260l = new ArrayList();
                obj = c15466l;
            }
            Object obj3 = obj;
            c6956l.m2147try(obj3);
            obj2 = obj3;
        }
        obj2 = objM2132native;
        return (InterfaceC0476l) obj2;
    }
}
