package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15412l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f30117l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f30118l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30119l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C11644l f30120l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15412l(C9879l c9879l, C11644l c11644l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30119l = i;
        this.f30118l = c9879l;
        this.f30120l = c11644l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f30119l;
        C11644l c11644l = this.f30120l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C9879l c9879l = this.f30118l;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f30117l;
                int i2 = this.f30121l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
                    C15215l c15215l = new C15215l(c9879l, interfaceC2262l, c11644l);
                    this.f30117l = null;
                    this.f30121l = 1;
                    if (interfaceC6942lYandex.yandex(c15215l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f30117l;
                int i3 = this.f30121l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int i4 = 0;
                    InterfaceC6942l interfaceC6942lSubs = AbstractC0622l.subs(AbstractC3206l.amazon(new C14970l(0, new C6783l(AbstractC14024l.startapp(AbstractC8020l.metrica(new C1224l(c9879l, i4)), c9879l.yandex.f23523l, EnumC8981l.f18523l), i4)), new C13206l(0), AbstractC3206l.loadAd), 250L);
                    C13067l c13067l = new C13067l(interfaceC2262l2, c11644l, c9879l, (InterfaceC14029l) null);
                    this.f30117l = null;
                    this.f30121l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lSubs, c13067l, this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f30119l) {
            case 0:
                C15412l c15412l = new C15412l(this.f30118l, this.f30120l, interfaceC14029l, 0);
                c15412l.f30117l = obj;
                return c15412l;
            default:
                C15412l c15412l2 = new C15412l(this.f30118l, this.f30120l, interfaceC14029l, 1);
                c15412l2.f30117l = obj;
                return c15412l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f30119l) {
            case 0:
                break;
        }
        return ((C15412l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
