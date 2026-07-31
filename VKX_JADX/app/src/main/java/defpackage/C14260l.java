package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14260l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18159l f27858l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27859l;

    public /* synthetic */ C14260l(C18159l c18159l, int i) {
        this.f27859l = 2;
        this.f27858l = c18159l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f27859l;
        C13863l c13863l = C1867l.yandex;
        C18159l c18159l = this.f27858l;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C18159l c18159l2 = this.f27858l;
                    boolean zAdmob = c6956l.admob(c18159l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        Cconst cconst = new Cconst(0, c18159l2, C18159l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 23);
                        c6956l.m2147try(cconst);
                        objM2132native = cconst;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC0837l.billing, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob2 = c6956l2.admob(c18159l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C0705l(c18159l, b == true ? 1 : 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC0837l.loadAd, c6956l2, 805306368, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c18159l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14260l(C18159l c18159l, int i, byte b) {
        this.f27859l = i;
        this.f27858l = c18159l;
    }
}
