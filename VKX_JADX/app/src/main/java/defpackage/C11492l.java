package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11492l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5891l f23105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23106l;

    public /* synthetic */ C11492l(C5891l c5891l, int i) {
        this.f23106l = i;
        this.f23105l = c5891l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f23106l;
        C13863l c13863l = C1867l.yandex;
        C5891l c5891l = this.f23105l;
        byte b = 0;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C2491l.yandex.getClass();
                    C4348l c4348l = C2491l.crashlytics;
                    boolean zAdmob = c6956l.admob(c5891l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C16169l(c5891l, b == true ? 1 : 0);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC2991l.purchase(c4348l, false, null, (Function1) objM2132native, c6956l, 0, 6);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C2491l.yandex.getClass();
                    C4348l c4348l2 = C2491l.crashlytics;
                    boolean zAdmob2 = c6956l.admob(c5891l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C16169l(c5891l, i2);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) objM2132native2, c6956l, 0, 6);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
