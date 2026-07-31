package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9778l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f19923l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13695l f19924l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19925l;

    public /* synthetic */ C9778l(C13695l c13695l, int i, int i2) {
        this.f19925l = i2;
        this.f19924l = c13695l;
        this.f19923l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19925l;
        C13863l c13863l = C1867l.yandex;
        int i2 = this.f19923l;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C13695l c13695l = this.f19924l;
                    InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(c13695l.m3663abstract() == ((EnumC7331l) c13695l.f26737l.getValue()) ? 96.0f : 0.0f, AbstractC0532l.admob(0.0f, 1000.0f, null, 5), null, c6956l, 48, 12);
                    boolean zAdmob = c6956l.admob(c13695l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C5735l c5735l = new C5735l(0, c13695l, C13695l.class, "commitChanges", "commitChanges()V", 0, 0, 0);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                    boolean zBilling = c6956l.billing(interfaceC12244lYandex);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C2116l(interfaceC12244lYandex, 3);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC4115l.purchase(C4346l.f8873l, (Function1) objM2132native2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC11184l.yandex(function0, interfaceC17242lPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.license, null, AbstractC14566l.amazon(-418097066, new C9778l(c13695l, i2, i3), c6956l), c6956l, 12582912, 100);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) this.f19924l.f26739l.getValue();
                    bool.booleanValue();
                    boolean zAmazon = c6956l2.amazon(i2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAmazon || objM2132native3 == c13863l) {
                        objM2132native3 = new C2221l(i2, 13);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC7741l.loadAd(bool, null, (Function1) objM2132native3, null, null, null, AbstractC13273l.crashlytics, c6956l2, 1572864, 58);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
