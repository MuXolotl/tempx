package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12526l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11967l f24679l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24680l;

    public /* synthetic */ C12526l(C11967l c11967l, int i) {
        this.f24680l = 3;
        this.f24679l = c11967l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24680l;
        C11967l c11967l = this.f24679l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c11967l.yandex, 0, c6956l), null, null, 0L, c6956l, 56, 12);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(c11967l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (c11967l.crashlytics) {
                        c6956l3.m2123default(1161774960);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                    } else {
                        c6956l3.m2123default(1159350357);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c11967l.yandex((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12526l(C11967l c11967l, int i, byte b) {
        this.f24680l = i;
        this.f24679l = c11967l;
    }
}
