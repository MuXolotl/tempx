package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14995l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f29505l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29506l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29507l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14995l(AbstractC18604l abstractC18604l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f29506l = 2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        InterfaceC13012l interfaceC13012lYandex;
        int i = this.f29506l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f29505l;
                int i2 = this.f29507l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Object obj2 = abstractC12074l.f24000l;
                    C11911l c11911l = AbstractC11626l.yandex;
                    if (((InterfaceC9955l) obj2).adcel().smaato()) {
                        return Unit.INSTANCE;
                    }
                    InterfaceC9955l interfaceC9955l = (InterfaceC9955l) obj2;
                    C2759l c2759lIsPro = interfaceC9955l.adcel().isPro();
                    if (c2759lIsPro == null && (c2759lIsPro = (C2759l) interfaceC9955l.getAttributes().billing(AbstractC5708l.yandex)) == null) {
                        c2759lIsPro = C2759l.f5976l;
                    }
                    InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C2759l.class);
                    try {
                        interfaceC13012lYandex = AbstractC18202l.yandex(C2759l.class);
                    } catch (Throwable unused) {
                        interfaceC13012lYandex = null;
                    }
                    C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
                    this.f29505l = null;
                    this.f29507l = 1;
                    if (interfaceC9955l.mo1554while(c2759lIsPro, c11310l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC12074l abstractC12074l2 = this.f29505l;
                int i3 = this.f29507l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f29505l = null;
                    this.f29507l = 1;
                    if (AbstractC5473l.billing(abstractC12074l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l3 = this.f29505l;
                int i4 = this.f29507l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f29505l = null;
                this.f29507l = 1;
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f29506l) {
            case 0:
                C14995l c14995l = new C14995l(3, interfaceC14029l, 0);
                c14995l.f29505l = abstractC12074l;
                return c14995l.Signature(Unit.INSTANCE);
            case 1:
                C14995l c14995l2 = new C14995l(3, interfaceC14029l, 1);
                c14995l2.f29505l = abstractC12074l;
                return c14995l2.Signature(Unit.INSTANCE);
            default:
                C14995l c14995l3 = new C14995l(null, interfaceC14029l);
                c14995l3.f29505l = abstractC12074l;
                return c14995l3.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14995l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f29506l = i2;
    }
}
