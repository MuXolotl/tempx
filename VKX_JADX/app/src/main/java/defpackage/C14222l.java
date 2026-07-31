package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14222l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0072l f27822l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27823l = 1;

    public /* synthetic */ C14222l(C0072l c0072l) {
        this.f27822l = c0072l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27823l) {
            case 0:
                ((Integer) obj2).getClass();
                this.f27822l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0072l c0072l = this.f27822l;
                    boolean zAdmob = c6956l.admob(c0072l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C6814l c6814l = new C6814l(0, c0072l, C0072l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 10);
                        c6956l.m2147try(c6814l);
                        objM2132native = c6814l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11036l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14222l(C0072l c0072l, int i) {
        this.f27822l = c0072l;
    }
}
