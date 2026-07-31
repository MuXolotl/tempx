package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3083l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11279l f6617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6618l;

    public /* synthetic */ C3083l(C11279l c11279l, int i) {
        this.f6618l = i;
        this.f6617l = c11279l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6618l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C11279l c11279l = this.f6617l;
                    boolean zBooleanValue = ((Boolean) c11279l.purchase.getValue()).booleanValue();
                    boolean zAdmob = c6956l.admob(c11279l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C3151l c3151l = new C3151l(1, c11279l, C11279l.class, "set", "set(Z)V", 0, 0, 2);
                        c6956l.m2147try(c3151l);
                        objM2132native = c3151l;
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) ((InterfaceC5059l) objM2132native), null, false, null, c6956l, 0, 124);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C11279l c11279l2 = this.f6617l;
                    boolean zBooleanValue2 = ((Boolean) c11279l2.purchase.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l2.admob(c11279l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C3151l c3151l2 = new C3151l(1, c11279l2, C11279l.class, "set", "set(Z)V", 0, 0, 1);
                        c6956l2.m2147try(c3151l2);
                        objM2132native2 = c3151l2;
                    }
                    AbstractC2021l.yandex(zBooleanValue2, (Function1) ((InterfaceC5059l) objM2132native2), null, false, null, c6956l2, 0, 124);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
