package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lۣؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0692l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f2174l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f2175l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2176l = 0;

    public /* synthetic */ C0692l(C6111l c6111l, InterfaceC12244l interfaceC12244l) {
        this.f2174l = c6111l;
        this.f2175l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2176l;
        InterfaceC12244l interfaceC12244l = this.f2175l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C6111l c6111l = this.f2174l;
                    c6111l.m1950public(null, AbstractC14566l.amazon(-766911673, new C10848l(c6111l, interfaceC12244l, 27), c6956l), AbstractC14566l.amazon(-633324762, new C5383l(c6111l), c6956l), c6956l, 432);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C17253l c17253lAmazon = AbstractC3605l.amazon(16.0f, 0.0f, 16.0f, 8.0f, 2);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    boolean zBilling = c6956l2.billing(interfaceC12244l);
                    C6111l c6111l2 = this.f2174l;
                    boolean zAdmob = zBilling | c6956l2.admob(c6111l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C10207l(interfaceC12244l, c6111l2, 10);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC16336l.loadAd(null, null, c17253lAmazon, c7537l, null, null, false, null, (Function1) objM2132native, c6956l2, 24960, 491);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0692l(InterfaceC12244l interfaceC12244l, C6111l c6111l) {
        this.f2175l = interfaceC12244l;
        this.f2174l = c6111l;
    }
}
