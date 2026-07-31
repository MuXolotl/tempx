package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7690l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f16137l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f16138l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16139l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16140l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7690l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f16139l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        AbstractC8870l c4935l;
        int i = this.f16139l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f16137l;
                Object obj2 = this.f16138l;
                int i2 = this.f16140l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!(obj2 instanceof AbstractC8870l)) {
                        C1365l c1365l = new C1365l(C2759l.f5982l);
                        this.f16137l = null;
                        this.f16138l = null;
                        this.f16140l = 1;
                        if (abstractC12074l.purchase(this, c1365l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC12074l abstractC12074l2 = this.f16137l;
                Object obj3 = this.f16138l;
                int i3 = this.f16140l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                Object obj4 = abstractC12074l2.f24000l;
                C11911l c11911l = AbstractC11626l.yandex;
                if (((InterfaceC9955l) obj4).adcel().smaato()) {
                    return Unit.INSTANCE;
                }
                if (!(obj3 instanceof AbstractC8870l)) {
                    C4875l.smaato(AbstractC18202l.yandex.loadAd(obj3.getClass()), "' to the OutgoingContent", "Response pipeline couldn't transform '");
                    return null;
                }
                InterfaceC9955l interfaceC9955l = (InterfaceC9955l) obj4;
                InterfaceC6581l interfaceC6581lAdcel = interfaceC9955l.adcel();
                C12210l c12210l = interfaceC6581lAdcel instanceof C12210l ? (C12210l) interfaceC6581lAdcel : null;
                if (c12210l == null) {
                    c12210l = (C12210l) interfaceC9955l.getAttributes().crashlytics(C12210l.f24263l);
                }
                this.f16137l = null;
                this.f16138l = null;
                this.f16140l = 1;
                if (c12210l.vip((AbstractC8870l) obj3, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC12074l abstractC12074l3 = this.f16137l;
                Object obj5 = this.f16138l;
                int i4 = this.f16140l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Object obj6 = abstractC12074l3.f24000l;
                    if (((C6806l) obj6).crashlytics.m217l("Accept") == null) {
                        ((C6806l) obj6).crashlytics.mo214l("Accept", "*/*");
                    }
                    C5254l c5254lAmazon = AbstractC11036l.amazon((InterfaceC18419l) obj6);
                    if (obj5 instanceof String) {
                        String str = (String) obj5;
                        if (c5254lAmazon == null) {
                            c5254lAmazon = AbstractC2460l.loadAd;
                        }
                        c4935l = new C2627l(str, c5254lAmazon, null);
                    } else if (obj5 instanceof byte[]) {
                        c4935l = new C4994l(c5254lAmazon, obj5);
                    } else if (obj5 instanceof InterfaceC9354l) {
                        c4935l = new C4935l(abstractC12074l3, c5254lAmazon, obj5);
                    } else if (obj5 instanceof AbstractC8870l) {
                        c4935l = (AbstractC8870l) obj5;
                    } else {
                        c4935l = obj5 instanceof InputStream ? new C4935l((C6806l) obj6, c5254lAmazon, obj5) : null;
                    }
                    if ((c4935l != null ? c4935l.loadAd() : null) != null) {
                        C6806l c6806l = (C6806l) obj6;
                        c6806l.crashlytics.m205l("Content-Type");
                        AbstractC15330l.yandex.vip("Transformed with default transformers request body for " + c6806l.yandex + " from " + AbstractC18202l.yandex.loadAd(obj5.getClass()));
                        this.f16137l = null;
                        this.f16138l = null;
                        this.f16140l = 1;
                        if (abstractC12074l3.purchase(this, c4935l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC12074l abstractC12074l4 = this.f16137l;
                Object obj7 = this.f16138l;
                int i5 = this.f16140l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AbstractC8870l abstractC8870lIsVip = AbstractC6791l.isVip((InterfaceC9955l) abstractC12074l4.f24000l, obj7);
                    if (abstractC8870lIsVip != null) {
                        this.f16137l = null;
                        this.f16138l = null;
                        this.f16140l = 1;
                        if (abstractC12074l4.purchase(this, abstractC8870lIsVip) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l5 = this.f16137l;
                Object obj8 = this.f16138l;
                int i6 = this.f16140l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i6 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC9354l interfaceC9354l = obj8 instanceof InterfaceC9354l ? (InterfaceC9354l) obj8 : null;
                if (interfaceC9354l == null) {
                    return Unit.INSTANCE;
                }
                if (!AbstractC8576l.yandex(AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l5.f24000l).yandex, AbstractC18202l.yandex.loadAd(String.class))) {
                    return Unit.INSTANCE;
                }
                Object obj9 = abstractC12074l5.f24000l;
                InterfaceC9955l interfaceC9955l2 = (InterfaceC9955l) obj9;
                try {
                    Charset charsetYandex = AbstractC15755l.yandex(AbstractC7000l.yandex(((InterfaceC9955l) obj9).billing()));
                    if (charsetYandex == null) {
                        charsetYandex = AbstractC9050l.yandex;
                    }
                    this.f16137l = abstractC12074l5;
                    this.f16138l = null;
                    this.f16140l = 1;
                    obj = AbstractC12761l.yandex(interfaceC9354l, charsetYandex, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } catch (C2120l e) {
                    throw new C12789l("Illegal Content-Type header format: " + interfaceC9955l2.billing().yandex().signatures("Content-Type"), e);
                }
                this.f16137l = null;
                this.f16138l = null;
                this.f16140l = 2;
                if (abstractC12074l5.purchase(this, (String) obj) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f16139l) {
            case 0:
                C7690l c7690l = new C7690l(3, interfaceC14029l, 0);
                c7690l.f16137l = abstractC12074l;
                c7690l.f16138l = obj2;
                return c7690l.Signature(Unit.INSTANCE);
            case 1:
                C7690l c7690l2 = new C7690l(3, interfaceC14029l, 1);
                c7690l2.f16137l = abstractC12074l;
                c7690l2.f16138l = obj2;
                return c7690l2.Signature(Unit.INSTANCE);
            case 2:
                C7690l c7690l3 = new C7690l(3, interfaceC14029l, 2);
                c7690l3.f16137l = abstractC12074l;
                c7690l3.f16138l = obj2;
                return c7690l3.Signature(Unit.INSTANCE);
            case 3:
                C7690l c7690l4 = new C7690l(3, interfaceC14029l, 3);
                c7690l4.f16137l = abstractC12074l;
                c7690l4.f16138l = obj2;
                return c7690l4.Signature(Unit.INSTANCE);
            default:
                C7690l c7690l5 = new C7690l(3, interfaceC14029l, 4);
                c7690l5.f16137l = abstractC12074l;
                c7690l5.f16138l = obj2;
                return c7690l5.Signature(Unit.INSTANCE);
        }
    }
}
