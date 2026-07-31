package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7430l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13530l f15376l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15377l;

    public /* synthetic */ C7430l(C13530l c13530l, int i) {
        this.f15377l = i;
        this.f15376l = c13530l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15377l;
        C13530l c13530l = this.f15376l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC2431l.yandex.yandex(c13530l.yandex), AbstractC14566l.amazon(-843593693, new C7430l(c13530l, i2), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c13530l.crashlytics.amazon(c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
