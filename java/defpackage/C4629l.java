package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4629l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12752l f9412l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9413l;

    public /* synthetic */ C4629l(C12752l c12752l, int i) {
        this.f9413l = 1;
        this.f9412l = c12752l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        int i = this.f9413l;
        C13863l c13863l = C1867l.yandex;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C12752l c12752l = this.f9412l;
                    if (((EnumC0442l) c12752l.f25126l.getValue()) == c12752l.m3501abstract()) {
                        c6956l.m2123default(2055064598);
                        float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 96.0f;
                        c6956l.startapp(false);
                        f = fYandex;
                    } else {
                        c6956l.m2123default(2055066964);
                        c6956l.startapp(false);
                        f = 0.0f;
                    }
                    InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(f, AbstractC0532l.admob(0.0f, 1000.0f, null, 5), null, c6956l, 48, 12);
                    boolean zAdmob = c6956l.admob(c12752l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C6335l c6335l = new C6335l(0, c12752l, C12752l.class, "commitChanges", "commitChanges()V", 0, 0, 2);
                        c6956l.m2147try(c6335l);
                        objM2132native = c6335l;
                    }
                    Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                    boolean zBilling = c6956l.billing(interfaceC12244lYandex);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C2116l(interfaceC12244lYandex, b == true ? 1 : 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC4115l.purchase(C4346l.f8873l, (Function1) objM2132native2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC11184l.yandex(function0, interfaceC17242lPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.license, null, AbstractC7902l.crashlytics, c6956l, 12582912, 100);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                this.f9412l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C12752l c12752l2 = this.f9412l;
                    boolean zAdmob2 = c6956l2.admob(c12752l2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        C6335l c6335l2 = new C6335l(0, c12752l2, C12752l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 1);
                        c6956l2.m2147try(c6335l2);
                        objM2132native3 = c6335l2;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC7902l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4629l(C12752l c12752l, int i, byte b) {
        this.f9413l = i;
        this.f9412l = c12752l;
    }
}
