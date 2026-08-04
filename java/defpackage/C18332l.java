package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18332l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7650l f35840l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35841l;

    public /* synthetic */ C18332l(C7650l c7650l, int i) {
        this.f35841l = 1;
        this.f35840l = c7650l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35841l;
        C7650l c7650l = this.f35840l;
        byte b = 0;
        int i2 = 2;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C14282l c14282lBilling = AbstractC0831l.billing(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0L, 0L, 0L, c6956l, 62);
                    AbstractC18079l.amazon(AbstractC1315l.yandex, null, AbstractC14566l.amazon(1540124012, new C18332l(c7650l, i2, b == true ? 1 : 0), c6956l), null, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), c14282lBilling, null, null, c6956l, 390, 410);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7650l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C7650l c7650l2 = this.f35840l;
                    boolean zAdmob = c6956l2.admob(c7650l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C10832l c10832l = new C10832l(0, c7650l2, C7650l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 23);
                        c6956l2.m2147try(c10832l);
                        objM2132native = c10832l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC1315l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18332l(C7650l c7650l, int i, byte b) {
        this.f35841l = i;
        this.f35840l = c7650l;
    }
}
