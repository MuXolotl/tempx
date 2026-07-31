package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13944l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f27239l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27240l = 1;

    public /* synthetic */ C13944l(C13849l c13849l) {
        this.f27239l = c13849l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27240l) {
            case 0:
                ((Integer) obj2).getClass();
                this.f27239l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C13849l c13849l = this.f27239l;
                    boolean zAdmob = c6956l.admob(c13849l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C2944l c2944l = new C2944l(0, c13849l, C13849l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 0);
                        c6956l.m2147try(c2944l);
                        objM2132native = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC15918l.yandex, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13944l(C13849l c13849l, int i) {
        this.f27239l = c13849l;
    }
}
