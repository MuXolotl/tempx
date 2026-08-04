package defpackage;

import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؓۜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2125l implements Function4 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3242l f4764l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4765l;

    public /* synthetic */ C2125l(C3242l c3242l, int i) {
        this.f4765l = i;
        this.f4764l = c3242l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f4765l;
        C3242l c3242l = this.f4764l;
        switch (i) {
            case 0:
                C3737l c3737l = (C3737l) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue = ((Integer) obj3).intValue();
                ((Boolean) obj4).getClass();
                boolean z = c3242l.crashlytics;
                if (zBooleanValue) {
                    return z ? c3737l.crashlytics(iIntValue, 0) : c3737l.crashlytics(iIntValue, c3737l.billing.yandex.yandex.f7563l.length());
                }
                return z ? c3737l.crashlytics(c3737l.billing.yandex.yandex.f7563l.length(), iIntValue) : c3737l.crashlytics(0, iIntValue);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Integer) obj3).getClass();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                C3242l c3242lAmazon = ((C18329l) obj).amazon();
                if (c3242lAmazon == null) {
                    return null;
                }
                C15812l c15812l = c3242lAmazon.loadAd;
                C15812l c15812l2 = c3242lAmazon.yandex;
                if (zBooleanValue2) {
                    C15812l c15812l3 = c3242l.yandex;
                    return zBooleanValue3 ? new C3242l(c15812l3, c15812l2, true) : new C3242l(c15812l3, c15812l, false);
                }
                C15812l c15812l4 = c3242l.loadAd;
                return zBooleanValue3 ? new C3242l(c15812l, c15812l4, true) : new C3242l(c15812l2, c15812l4, false);
        }
    }
}
