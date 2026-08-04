package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٖؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3431l extends AbstractC16915l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f7290l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7291l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7292l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7293l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7294l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f7295l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11485l f7296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3431l(Object obj, C2403l c2403l, Function0 function0, boolean z, C11485l c11485l, Function1 function1, Function2 function2) {
        super(3);
        this.f7293l = obj;
        this.f7290l = c2403l;
        this.f7295l = function0;
        this.f7294l = z;
        this.f7296l = c11485l;
        this.f7291l = function1;
        this.f7292l = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
        C6956l c6956l = (C6956l) obj2;
        ((Number) obj3).intValue();
        c6956l.m2123default(1321786060);
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            C0417l c0417l = new C0417l(AbstractC12311l.isPro(c6956l));
            c6956l.m2147try(c0417l);
            objM2132native = c0417l;
        }
        InterfaceC2262l interfaceC2262l = ((C0417l) objM2132native).f1535l;
        c6956l.m2123default(-98757340);
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == c13863l) {
            objM2132native2 = AbstractC8020l.smaato(null);
            c6956l.m2147try(objM2132native2);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
        c6956l.startapp(false);
        c6956l.m2123default(-98754771);
        Object objM2132native3 = c6956l.m2132native();
        if (objM2132native3 == c13863l) {
            objM2132native3 = AbstractC8020l.smaato(Boolean.FALSE);
            c6956l.m2147try(objM2132native3);
        }
        InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
        c6956l.startapp(false);
        c6956l.m2123default(-98752375);
        boolean zAdmob = c6956l.admob(interfaceC2262l);
        C2403l c2403l = this.f7290l;
        boolean zBilling = zAdmob | c6956l.billing(c2403l);
        Function0 function0 = this.f7295l;
        boolean zBilling2 = zBilling | c6956l.billing(function0);
        Object objM2132native4 = c6956l.m2132native();
        if (zBilling2 || objM2132native4 == c13863l) {
            C4879l c4879l = new C4879l(function0, interfaceC8714l2, interfaceC8714l, interfaceC2262l, this.f7290l);
            c6956l.m2147try(c4879l);
            objM2132native4 = c4879l;
        }
        c6956l.startapp(false);
        AbstractC12311l.loadAd(this.f7293l, (Function1) objM2132native4, c6956l);
        boolean z = this.f7294l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c6956l.m2123default(-98737076);
        boolean zMopub = c6956l.mopub(z);
        C11485l c11485l = this.f7296l;
        boolean zAdmob2 = zMopub | c6956l.admob(c11485l) | c6956l.admob(interfaceC2262l) | c6956l.billing(c2403l);
        Function1 function1 = this.f7291l;
        boolean zBilling3 = zAdmob2 | c6956l.billing(function1) | c6956l.billing(function0);
        Function2 function2 = this.f7292l;
        boolean zBilling4 = zBilling3 | c6956l.billing(function2);
        Object objM2132native5 = c6956l.m2132native();
        if (zBilling4 || objM2132native5 == c13863l) {
            C0606l c0606l = new C0606l(this.f7294l, c11485l, function2, function1, interfaceC8714l2, interfaceC2262l, this.f7290l, interfaceC8714l, function0, null);
            c6956l.m2147try(c0606l);
            objM2132native5 = c0606l;
        }
        c6956l.startapp(false);
        C9185l c9185l = AbstractC1782l.yandex;
        InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(new C8110l(this.f7293l, boolValueOf, null, new C15463l((Function2) objM2132native5), 4));
        c6956l.startapp(false);
        return interfaceC17242lPremium;
    }
}
