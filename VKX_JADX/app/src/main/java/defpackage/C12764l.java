package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12764l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18306l f25148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25149l;

    public /* synthetic */ C12764l(C18306l c18306l, int i) {
        this.f25149l = i;
        this.f25148l = c18306l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25149l;
        C13863l c13863l = C1867l.yandex;
        C18306l c18306l = this.f25148l;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C18306l c18306l2 = this.f25148l;
                    boolean zAdmob = c6956l.admob(c18306l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C5735l c5735l = new C5735l(0, c18306l2, C18306l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC10851l.f21921l, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c18306l.m4521try((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c18306l.m4512implements((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                c18306l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 4:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob2 = c6956l2.admob(c18306l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C12478l(c18306l, i2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC10851l.f21920l, c6956l2, 805306368, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 5:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob3 = c6956l3.admob(c18306l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C12478l(c18306l, 8);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC10851l.f21923l, c6956l3, 805306368, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c18306l.m4519this((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12764l(C18306l c18306l, int i, int i2) {
        this.f25149l = i2;
        this.f25148l = c18306l;
    }
}
