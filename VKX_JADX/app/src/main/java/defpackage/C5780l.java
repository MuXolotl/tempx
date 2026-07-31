package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5780l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8748l f12193l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12194l;

    public /* synthetic */ C5780l(C8748l c8748l, int i) {
        this.f12194l = i;
        this.f12193l = c8748l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f12194l;
        C13863l c13863l = C1867l.yandex;
        C8748l c8748l = this.f12193l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c8748l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C8748l c8748l2 = this.f12193l;
                    boolean zAdmob = c6956l.admob(c8748l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C10832l c10832l = new C10832l(0, c8748l2, C8748l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 18);
                        c6956l.m2147try(c10832l);
                        objM2132native = c10832l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC10999l.yandex, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C8748l c8748l3 = this.f12193l;
                    boolean zAdmob2 = c6956l2.admob(c8748l3);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C10832l c10832l2 = new C10832l(0, c8748l3, C8748l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 19);
                        c6956l2.m2147try(c10832l2);
                        objM2132native2 = c10832l2;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native2), null, false, null, null, null, AbstractC10999l.crashlytics, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c8748l.m2425public((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5780l(C8748l c8748l, int i, int i2) {
        this.f12194l = i2;
        this.f12193l = c8748l;
    }
}
