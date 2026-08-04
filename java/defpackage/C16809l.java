package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16809l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f32832l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32833l;

    public /* synthetic */ C16809l(C9430l c9430l) {
        this.f32833l = 1;
        this.f32832l = c9430l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32833l;
        C9430l c9430l = this.f32832l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c9430l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C9430l c9430l2 = this.f32832l;
                    boolean zAdmob = c6956l.admob(c9430l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C2944l c2944l = new C2944l(0, c9430l2, C9430l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 8);
                        c6956l.m2147try(c2944l);
                        objM2132native = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC6974l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c9430l.m2653public((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16809l(C9430l c9430l, int i, int i2) {
        this.f32833l = i2;
        this.f32832l = c9430l;
    }
}
