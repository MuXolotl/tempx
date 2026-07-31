package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16213l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16852l f31727l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31728l = 1;

    public /* synthetic */ C16213l(C16852l c16852l) {
        this.f31727l = c16852l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31728l) {
            case 0:
                ((Integer) obj2).getClass();
                this.f31727l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C16852l c16852l = this.f31727l;
                    boolean zAdmob = c6956l.admob(c16852l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C6814l c6814l = new C6814l(0, c16852l, C16852l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 11);
                        c6956l.m2147try(c6814l);
                        objM2132native = c6814l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC3670l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16213l(C16852l c16852l, int i) {
        this.f31727l = c16852l;
    }
}
