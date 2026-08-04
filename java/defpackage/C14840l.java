package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14840l extends AbstractC16915l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f29053l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18297l f29054l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f29055l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11485l f29056l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Function0 f29057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14840l(C18297l c18297l, C2403l c2403l, C11485l c11485l, Function1 function1, Function0 function0) {
        super(3);
        this.f29054l = c18297l;
        this.f29053l = c2403l;
        this.f29056l = c11485l;
        this.f29055l = function1;
        this.f29057l = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
        C6956l c6956l = (C6956l) obj2;
        ((Number) obj3).intValue();
        c6956l.m2123default(231415144);
        c6956l.m2123default(-1020090083);
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC8020l.smaato(new C1187l(0L));
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        c6956l.startapp(false);
        c6956l.m2123default(-1020087938);
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == c13863l) {
            objM2132native2 = AbstractC8020l.smaato(new C4999l(0L));
            c6956l.m2147try(objM2132native2);
        }
        InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
        c6956l.startapp(false);
        Object objM2132native3 = c6956l.m2132native();
        if (objM2132native3 == c13863l) {
            C0417l c0417l = new C0417l(AbstractC12311l.isPro(c6956l));
            c6956l.m2147try(c0417l);
            objM2132native3 = c0417l;
        }
        InterfaceC2262l interfaceC2262l = ((C0417l) objM2132native3).f1535l;
        c6956l.m2123default(-1020083824);
        Object objM2132native4 = c6956l.m2132native();
        if (objM2132native4 == c13863l) {
            objM2132native4 = new C2655l(interfaceC8714l, interfaceC8714l2, 2);
            c6956l.m2147try(objM2132native4);
        }
        c6956l.startapp(false);
        InterfaceC17242l interfaceC17242lBilling = AbstractC8238l.billing(interfaceC17242l, (Function1) objM2132native4);
        C18297l c18297l = this.f29054l;
        C5056l c5056l = c18297l.yandex;
        Object obj4 = c18297l.loadAd;
        c5056l.getClass();
        boolean z = ((Boolean) AbstractC8020l.mopub(new C4307l(obj4, c5056l, 10)).getValue()).booleanValue() || !((Boolean) c18297l.yandex.smaato.getValue()).booleanValue();
        c6956l.m2123default(-1020069521);
        boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.billing(c18297l);
        Function1 function1 = this.f29055l;
        boolean zBilling = zAdmob | c6956l.billing(function1);
        Object objM2132native5 = c6956l.m2132native();
        if (zBilling || objM2132native5 == c13863l) {
            objM2132native5 = new C4879l(interfaceC2262l, function1, this.f29054l, interfaceC8714l, interfaceC8714l2, 3);
            c6956l.m2147try(objM2132native5);
        }
        Function1 function2 = (Function1) objM2132native5;
        c6956l.startapp(false);
        c6956l.m2123default(-1020052768);
        boolean zBilling2 = c6956l.billing(c18297l);
        Function0 function0 = this.f29057l;
        boolean zBilling3 = zBilling2 | c6956l.billing(function0);
        Object objM2132native6 = c6956l.m2132native();
        int i = 9;
        if (zBilling3 || objM2132native6 == c13863l) {
            objM2132native6 = new C4307l(c18297l, function0, i);
            c6956l.m2147try(objM2132native6);
        }
        Function0 function3 = (Function0) objM2132native6;
        c6956l.startapp(false);
        c6956l.m2123default(-1020048579);
        boolean zBilling4 = c6956l.billing(c18297l);
        Object objM2132native7 = c6956l.m2132native();
        if (zBilling4 || objM2132native7 == c13863l) {
            objM2132native7 = new C3956l(i, c18297l);
            c6956l.m2147try(objM2132native7);
        }
        c6956l.startapp(false);
        InterfaceC17242l interfaceC17242lLoadAd = AbstractC17541l.loadAd(interfaceC17242lBilling, new C3431l(c5056l, this.f29053l, function3, z, this.f29056l, function2, (Function2) objM2132native7));
        c6956l.startapp(false);
        return interfaceC17242lLoadAd;
    }
}
