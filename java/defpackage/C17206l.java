package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17206l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f33389l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f33390l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33391l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33392l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f33393l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33394l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f33395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17206l(C9970l c9970l, String str, C3469l c3469l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f33390l = c9970l;
        this.f33393l = str;
        this.f33391l = c3469l;
        this.f33395l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objBilling;
        InterfaceC13012l interfaceC13012lYandex;
        C6472l c6472l;
        Object objBilling2;
        InterfaceC13012l interfaceC13012lYandex2;
        C14249l c14249l;
        C11911l c11911l;
        Object obj2;
        AbstractC10022l abstractC10022l;
        int i = this.f33392l;
        Object obj3 = this.f33395l;
        Object obj4 = this.f33391l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f33389l;
                Object obj5 = this.f33390l;
                int i2 = this.f33394l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Object obj6 = abstractC12074l.f24000l;
                    if (obj6 instanceof C4543l) {
                        C2234l c2234l = ((C4543l) obj6).f9183l;
                        C2177l c2177l = (C2177l) this.f33393l;
                        C2234l c2234l2 = c2234l;
                        while (true) {
                            objBilling = AbstractC0007l.crashlytics(c2234l2).billing(c2177l.getKey());
                            if (objBilling == null) {
                                C2234l c2234l3 = c2234l2.f4918l;
                                if (c2234l3 == null) {
                                    objBilling = c2234l2 instanceof C0720l ? AbstractC0007l.crashlytics(AbstractC5708l.yandex(c2234l)).billing(c2177l.getKey()) : null;
                                } else {
                                    c2234l2 = c2234l3;
                                }
                            }
                        }
                        if (AbstractC8576l.yandex(objBilling, (C7472l) obj4)) {
                            this.f33389l = null;
                            this.f33390l = null;
                            this.f33394l = 1;
                            if (((Function3) obj3).invoke(abstractC12074l, obj5, this) == enumC9342l) {
                                return enumC9342l;
                            }
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
                C2885l c2885l = (C2885l) obj3;
                C16864l c16864l = (C16864l) obj4;
                C1770l c1770l = c16864l.f32923l;
                AbstractC12074l abstractC12074l2 = this.f33389l;
                Object obj7 = this.f33390l;
                int i3 = this.f33394l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6806l c6806l = new C6806l();
                    C6806l c6806l2 = (C6806l) abstractC12074l2.f24000l;
                    c6806l.purchase = c6806l2.purchase;
                    c6806l.crashlytics(c6806l2);
                    if (obj7 != null) {
                        if (obj7 instanceof AbstractC8870l) {
                            c6806l.amazon = obj7;
                            c6806l.loadAd(null);
                        } else {
                            c6806l.amazon = obj7;
                            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Object.class);
                            try {
                                interfaceC13012lYandex = AbstractC18202l.yandex(Object.class);
                            } catch (Throwable unused) {
                                interfaceC13012lYandex = null;
                            }
                            c6806l.loadAd(new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
                        }
                        break;
                    } else {
                        c6806l.amazon = C6130l.yandex;
                        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(Object.class);
                        try {
                            interfaceC13012lYandex2 = AbstractC18202l.yandex(Object.class);
                        } catch (Throwable unused2) {
                            interfaceC13012lYandex2 = null;
                        }
                        c6806l.loadAd(new C11310l(interfaceC1388lLoadAd2, interfaceC13012lYandex2));
                        break;
                    }
                    c1770l.vip(AbstractC12704l.f25025l, c6806l);
                    C2540l c2540lLoadAd = c6806l.yandex.loadAd();
                    C17721l c17721l = c6806l.loadAd;
                    C3223l c3223lM273l = c6806l.crashlytics.m273l();
                    Object obj8 = c6806l.amazon;
                    AbstractC8870l abstractC8870l = obj8 instanceof AbstractC8870l ? (AbstractC8870l) obj8 : null;
                    if (abstractC8870l != null) {
                        C2993l c2993l = c6806l.purchase;
                        C17535l c17535l = c6806l.billing;
                        c6472l = new C6472l(c2540lLoadAd, c17721l, c3223lM273l, abstractC8870l, c2993l, c17535l);
                        c17535l.mopub(AbstractC1285l.loadAd, c16864l.f32920l);
                        Set setNames = c3223lM273l.names();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj9 : setNames) {
                            if (AbstractC10588l.loadAd.contains((String) obj9)) {
                                arrayList.add(obj9);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            throw new C14612l(arrayList.toString());
                        }
                        for (InterfaceC17183l interfaceC17183l : (Set) c6472l.f13511l) {
                            if (!c2885l.f6286l.contains(interfaceC17183l)) {
                                C8936l.smaato(interfaceC17183l, "Engine doesn't support ");
                            }
                        }
                        this.f33389l = abstractC12074l2;
                        this.f33390l = null;
                        this.f33393l = c6472l;
                        this.f33394l = 1;
                        objBilling2 = AbstractC2812l.billing(c2885l, c6472l, this);
                        if (objBilling2 == enumC9342l) {
                            return enumC9342l;
                        }
                        C3603l c3603l = (C3603l) objBilling2;
                        c14249l = new C14249l(c16864l);
                        c14249l.f27846l = new C16666l(c14249l, c6472l);
                        c14249l.f27845l = new C0766l(c14249l, c3603l);
                        C17535l attributes = c14249l.getAttributes();
                        c11911l = C14249l.f27843l;
                        attributes.purchase().remove(c11911l);
                        obj2 = c3603l.purchase;
                        if (!(obj2 instanceof InterfaceC9354l)) {
                            c14249l.getAttributes().mopub(c11911l, obj2);
                        }
                        abstractC10022l = c14249l.f27845l;
                        if (abstractC10022l == null) {
                            abstractC10022l = null;
                        }
                        c1770l.vip(AbstractC12704l.f25022l, abstractC10022l);
                        AbstractC11174l.mopub(abstractC10022l.vip()).mo2154l(new C3005l(c16864l, abstractC10022l, 20));
                        this.f33389l = null;
                        this.f33390l = null;
                        this.f33393l = null;
                        this.f33394l = 2;
                        if (abstractC12074l2.purchase(this, c14249l) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        C11983l.advert(c6806l.amazon, "No request transformation found: ");
                    }
                    return null;
                }
                if (i3 == 1) {
                    C6472l c6472l2 = (C6472l) this.f33393l;
                    AbstractC2829l.crashlytics(obj);
                    c6472l = c6472l2;
                    objBilling2 = obj;
                    C3603l c3603l2 = (C3603l) objBilling2;
                    c14249l = new C14249l(c16864l);
                    c14249l.f27846l = new C16666l(c14249l, c6472l);
                    c14249l.f27845l = new C0766l(c14249l, c3603l2);
                    C17535l attributes2 = c14249l.getAttributes();
                    c11911l = C14249l.f27843l;
                    attributes2.purchase().remove(c11911l);
                    obj2 = c3603l2.purchase;
                    if (!(obj2 instanceof InterfaceC9354l)) {
                        c14249l.getAttributes().mopub(c11911l, obj2);
                    }
                    abstractC10022l = c14249l.f27845l;
                    if (abstractC10022l == null) {
                        abstractC10022l = null;
                    }
                    c1770l.vip(AbstractC12704l.f25022l, abstractC10022l);
                    AbstractC11174l.mopub(abstractC10022l.vip()).mo2154l(new C3005l(c16864l, abstractC10022l, 20));
                    this.f33389l = null;
                    this.f33390l = null;
                    this.f33393l = null;
                    this.f33394l = 2;
                    if (abstractC12074l2.purchase(this, c14249l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l3 = this.f33389l;
                int i4 = this.f33394l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C9970l c9970l = (C9970l) this.f33390l;
                    C11911l c11911l2 = c9970l.yandex;
                    Object obj10 = c9970l.subs;
                    String str = c11911l2.yandex;
                    C11371l c11371l = new C11371l(c11911l2, (String) this.f33393l, (C3469l) obj4, (Function2) obj3, obj10, abstractC12074l3, null);
                    this.f33389l = null;
                    this.f33394l = 1;
                    if ((AbstractC16828l.yandex() ? AbstractC10999l.firebase(this.f1295l.mo246l(new C18071l(str)), new C11039l(c11371l, interfaceC14029l, 16), this) : c11371l.invoke(this)) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f33392l;
        Object obj4 = this.f33395l;
        Object obj5 = this.f33391l;
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        switch (i) {
            case 0:
                C17206l c17206l = new C17206l((C2177l) this.f33393l, (C7472l) obj5, (Function3) obj4, (InterfaceC14029l) obj3);
                c17206l.f33389l = abstractC12074l;
                c17206l.f33390l = obj2;
                return c17206l.Signature(Unit.INSTANCE);
            case 1:
                C17206l c17206l2 = new C17206l((C16864l) obj5, (C2885l) obj4, (InterfaceC14029l) obj3);
                c17206l2.f33389l = abstractC12074l;
                c17206l2.f33390l = obj2;
                return c17206l2.Signature(Unit.INSTANCE);
            default:
                C17206l c17206l3 = new C17206l((C9970l) this.f33390l, (String) this.f33393l, (C3469l) obj5, (Function2) obj4, (InterfaceC14029l) obj3);
                c17206l3.f33389l = abstractC12074l;
                return c17206l3.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17206l(C16864l c16864l, C2885l c2885l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f33391l = c16864l;
        this.f33395l = c2885l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17206l(C2177l c2177l, C7472l c7472l, Function3 function3, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f33393l = c2177l;
        this.f33391l = c7472l;
        this.f33395l = function3;
    }
}
