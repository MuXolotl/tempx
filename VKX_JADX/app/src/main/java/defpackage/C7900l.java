package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7900l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6038l f16478l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16479l;

    public /* synthetic */ C7900l(C6038l c6038l, int i) {
        this.f16479l = 2;
        this.f16478l = c6038l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16479l;
        C6038l c6038l = this.f16478l;
        byte b = 0;
        byte b2 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C6038l c6038l2 = this.f16478l;
                    boolean zAdmob = c6956l.admob(c6038l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C4936l c4936l = new C4936l(0, c6038l2, C6038l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 16);
                        c6956l.m2147try(c4936l);
                        objM2132native = c4936l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC5889l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC5889l.yandex, null, AbstractC14566l.amazon(-1643696457, new C7900l(c6038l, b2 == true ? 1 : 0, b == true ? 1 : 0), c6956l2), null, 0.0f, null, null, null, null, c6956l2, 390, 506);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c6038l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7900l(C6038l c6038l, int i, byte b) {
        this.f16479l = i;
        this.f16478l = c6038l;
    }
}
