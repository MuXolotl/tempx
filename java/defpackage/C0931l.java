package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0931l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18014l f2608l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2609l;

    public /* synthetic */ C0931l(C18014l c18014l, int i) {
        this.f2609l = 2;
        this.f2608l = c18014l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2609l;
        C18014l c18014l = this.f2608l;
        byte b = 0;
        byte b2 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C18014l c18014l2 = this.f2608l;
                    boolean zAdmob = c6956l.admob(c18014l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C2944l c2944l = new C2944l(0, c18014l2, C18014l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 21);
                        c6956l.m2147try(c2944l);
                        objM2132native = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11028l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(AbstractC11028l.yandex, AbstractC4927l.amazon(C4346l.f8873l, ((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), AbstractC14566l.amazon(2126600792, new C0931l(c18014l, b2 == true ? 1 : 0, b == true ? 1 : 0), c6956l2), null, 0.0f, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).purchase(c6956l2), AbstractC0831l.billing(((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l2, 60), null, null, c6956l2, 390, 408);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c18014l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0931l(C18014l c18014l, int i, byte b) {
        this.f2609l = i;
        this.f2608l = c18014l;
    }
}
