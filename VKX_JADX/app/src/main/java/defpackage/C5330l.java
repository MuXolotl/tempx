package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5330l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17386l f11463l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11464l;

    public /* synthetic */ C5330l(C17386l c17386l, int i) {
        this.f11464l = i;
        this.f11463l = c17386l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11464l;
        C17386l c17386l = this.f11463l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, c17386l.loadAd), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    int i2 = c17386l.crashlytics;
                    String strMopub = c17386l.amazon;
                    if (i2 != -1 || strMopub.length() > 0) {
                        c6956l2.m2123default(1073215183);
                        if (i2 != -1) {
                            strMopub = AbstractC12900l.mopub(c6956l2, 1073302820, i2, c6956l2, false);
                        } else {
                            c6956l2.m2123default(1073409491);
                            c6956l2.startapp(false);
                        }
                        AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(1058026826);
                        c6956l2.startapp(false);
                    }
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c17386l.yandex, 0, c6956l3), AbstractC11999l.purchase(c6956l3, c17386l.loadAd), null, 0L, c6956l3, 8, 12);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
