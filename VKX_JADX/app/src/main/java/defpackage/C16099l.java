package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۨۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16099l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7044l f31556l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31557l;

    public /* synthetic */ C16099l(C7044l c7044l, int i) {
        this.f31557l = i;
        this.f31556l = c7044l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31557l;
        byte b = 0;
        C7044l c7044l = this.f31556l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C7044l c7044l2 = this.f31556l;
                    boolean zAdmob = c6956l.admob(c7044l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C2944l c2944l = new C2944l(0, c7044l2, C7044l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 26);
                        c6956l.m2147try(c2944l);
                        objM2132native = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, C17423l.crashlytics, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7044l.m2161import((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(C17423l.loadAd, AbstractC4927l.amazon(C4346l.f8873l, ((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), AbstractC14566l.amazon(-818967342, new C16099l(c7044l, b == true ? 1 : 0), c6956l2), null, 0.0f, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).purchase(c6956l2), AbstractC0831l.billing(((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l2, 60), null, null, c6956l2, 390, 408);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c7044l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16099l(C7044l c7044l, int i, int i2) {
        this.f31557l = i2;
        this.f31556l = c7044l;
    }
}
