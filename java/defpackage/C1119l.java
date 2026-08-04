package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1119l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7721l f3070l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3071l;

    public /* synthetic */ C1119l(C7721l c7721l, int i) {
        this.f3071l = 1;
        this.f3070l = c7721l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3071l;
        C7721l c7721l = this.f3070l;
        byte b = 0;
        int i2 = 2;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC14205l.yandex, null, AbstractC14566l.amazon(217201498, new C1119l(c7721l, i2, b == true ? 1 : 0), c6956l), null, 0.0f, null, null, null, null, c6956l, 390, 506);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7721l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C7721l c7721l2 = this.f3070l;
                    boolean zAdmob = c6956l2.admob(c7721l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        Cconst cconst = new Cconst(0, c7721l2, C7721l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 29);
                        c6956l2.m2147try(cconst);
                        objM2132native = cconst;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC14205l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1119l(C7721l c7721l, int i, byte b) {
        this.f3071l = i;
        this.f3070l = c7721l;
    }
}
