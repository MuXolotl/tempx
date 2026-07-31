package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13320l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f26122l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f26123l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26124l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C12362l f26125l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26126l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13320l(C9879l c9879l, C12362l c12362l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f26124l = i;
        this.f26123l = c9879l;
        this.f26125l = c12362l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f26124l;
        EnumC8981l enumC8981l = EnumC8981l.f18523l;
        C9879l c9879l = this.f26123l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        final C12362l c12362l = this.f26125l;
        final int i2 = 0;
        InterfaceC14029l interfaceC14029l = null;
        final int i3 = 1;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f26122l;
                int i4 = this.f26126l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lSubs = AbstractC0622l.subs(new C8766l(AbstractC3206l.amazon(new C14970l(6, new C6783l(AbstractC14024l.startapp(AbstractC8020l.metrica(new C1224l(c9879l, 4)), c9879l.yandex.f23523l, enumC8981l), i3)), new C1306l(9), AbstractC3206l.loadAd), AbstractC8020l.metrica(new Function0() { // from class: lؖۥۤ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i2;
                            C12362l c12362l2 = c12362l;
                            switch (i5) {
                                case 0:
                                    return (EnumC12999l) c12362l2.amazon.getValue();
                                default:
                                    Boolean bool = (Boolean) c12362l2.admob.getValue();
                                    bool.getClass();
                                    return bool;
                            }
                        }
                    }), new C13749l(3, interfaceC14029l, 5), i3), 500L);
                    C0384l c0384l = new C0384l(interfaceC2262l, c12362l, interfaceC14029l, 25);
                    this.f26122l = null;
                    this.f26126l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lSubs, c0384l, this) == enumC9342l) {
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
            default:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f26122l;
                int i5 = this.f26126l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15796l c15796l = new C15796l(AbstractC14024l.startapp(new C15796l(AbstractC8020l.metrica(new Function0() { // from class: lؖۥۤ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = i3;
                            C12362l c12362l2 = c12362l;
                            switch (i6) {
                                case 0:
                                    return (EnumC12999l) c12362l2.amazon.getValue();
                                default:
                                    Boolean bool = (Boolean) c12362l2.admob.getValue();
                                    bool.getClass();
                                    return bool;
                            }
                        }
                    }), new C3751l(c12362l, null, 0), 0), c9879l.yandex.f23523l, enumC8981l), new C3751l(c12362l, null, 1), 0);
                    C2354l c2354l = new C2354l(interfaceC2262l2, c12362l);
                    this.f26122l = null;
                    this.f26126l = 1;
                    if (c15796l.yandex(c2354l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
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
        switch (this.f26124l) {
            case 0:
                C13320l c13320l = new C13320l(this.f26123l, this.f26125l, interfaceC14029l, 0);
                c13320l.f26122l = obj;
                return c13320l;
            default:
                C13320l c13320l2 = new C13320l(this.f26123l, this.f26125l, interfaceC14029l, 1);
                c13320l2.f26122l = obj;
                return c13320l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f26124l) {
            case 0:
                break;
        }
        return ((C13320l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
