package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16683l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14968l f32704l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32705l;

    public /* synthetic */ C16683l(AbstractC14968l abstractC14968l, int i) {
        this.f32705l = i;
        this.f32704l = abstractC14968l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32705l;
        AbstractC14968l abstractC14968l = this.f32704l;
        int i2 = 2;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, abstractC14968l.mo2657instanceof()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC14968l abstractC14968l2 = this.f32704l;
                    boolean zAdmob = c6956l2.admob(abstractC14968l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C10832l c10832l = new C10832l(0, abstractC14968l2, AbstractC14968l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 9);
                        c6956l2.m2147try(c10832l);
                        objM2132native = c10832l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC14566l.amazon(-108629938, new C16683l(abstractC14968l2, i2), c6956l2), c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l3.m2124else();
                } else if (abstractC14968l instanceof C12467l) {
                    c6956l3.m2123default(-2084055686);
                    AbstractC4597l.yandex(AbstractC2648l.amazon(), null, null, 0L, c6956l3, 48, 12);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(-2083926509);
                    AbstractC4597l.yandex(AbstractC2296l.purchase(), AbstractC11999l.purchase(c6956l3, R.string.talkback_back), null, 0L, c6956l3, 0, 12);
                    c6956l3.startapp(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
