package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9759l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17984l f19897l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19898l;

    public /* synthetic */ C9759l(C17984l c17984l) {
        this.f19898l = 2;
        this.f19897l = c17984l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19898l;
        C17984l c17984l = this.f19897l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c17984l.m4452abstract((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c17984l.m4454instanceof((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17984l c17984l2 = this.f19897l;
                    boolean zAdmob = c6956l.admob(c17984l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C13246l c13246l = new C13246l(0, c17984l2, C17984l.class, "activateQrScanner", "activateQrScanner()V", 0, 0, 17);
                        c6956l.m2147try(c13246l);
                        objM2132native = c13246l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC4959l.adcel, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c17984l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9759l(C17984l c17984l, int i, int i2) {
        this.f19898l = i2;
        this.f19897l = c17984l;
    }
}
