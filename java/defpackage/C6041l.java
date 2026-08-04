package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6041l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13157l f12815l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12816l;

    public /* synthetic */ C6041l(C13157l c13157l, int i) {
        this.f12816l = 5;
        this.f12815l = c13157l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f12816l;
        C13863l c13863l = C1867l.yandex;
        C13157l c13157l = this.f12815l;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C13157l c13157l2 = this.f12815l;
                    boolean zAdmob = c6956l.admob(c13157l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        Cconst cconst = new Cconst(0, c13157l2, C13157l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 26);
                        c6956l.m2147try(cconst);
                        objM2132native = cconst;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC4072l.isPro, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) c13157l.f25770l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l2.admob(c13157l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C7701l(c13157l, i2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native2, null, false, null, c6956l2, 0, 124);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob3 = c6956l3.admob(c13157l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C4217l(c13157l, 3);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC4072l.yandex, c6956l3, 805306368, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zAdmob4 = c6956l4.admob(c13157l);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C4217l(c13157l, 5);
                        c6956l4.m2147try(objM2132native4);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native4, null, false, null, null, null, AbstractC4072l.loadAd, c6956l4, 805306368, 510);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zAdmob5 = c6956l5.admob(c13157l);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C4217l(c13157l, 4);
                        c6956l5.m2147try(objM2132native5);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native5, null, false, null, null, null, AbstractC4072l.purchase, c6956l5, 805306368, 510);
                } else {
                    c6956l5.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c13157l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6041l(C13157l c13157l, int i, byte b) {
        this.f12816l = i;
        this.f12815l = c13157l;
    }
}
