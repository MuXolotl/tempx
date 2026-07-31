package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18198l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f35638l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35639l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35640l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f35641l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f35642l;

    public /* synthetic */ C18198l(C16820l c16820l, EnumC11447l enumC11447l, String str, Function0 function0, int i) {
        this.f35639l = c16820l;
        this.f35638l = enumC11447l;
        this.f35642l = str;
        this.f35641l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35640l;
        Object obj3 = this.f35641l;
        Object obj4 = this.f35642l;
        Object obj5 = this.f35638l;
        Object obj6 = this.f35639l;
        switch (i) {
            case 0:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj6;
                C6523l c6523l = (C6523l) obj5;
                C6523l c6523l2 = (C6523l) obj4;
                C11047l c11047l = (C11047l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC6745l.purchase(AbstractC9966l.billing(interfaceC17242l, c6523l), c6523l2);
                    boolean zAdmob = c6956l.admob(c11047l) | c6956l.billing(c6523l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C15575l((Object) c11047l, c6523l2, 3);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.loadAd(interfaceC17242lPurchase, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24960, 490);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC10114l.yandex((C16820l) obj6, (EnumC11447l) obj5, (String) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18198l(InterfaceC17242l interfaceC17242l, C6523l c6523l, C6523l c6523l2, C11047l c11047l) {
        this.f35639l = interfaceC17242l;
        this.f35638l = c6523l;
        this.f35642l = c6523l2;
        this.f35641l = c11047l;
    }
}
