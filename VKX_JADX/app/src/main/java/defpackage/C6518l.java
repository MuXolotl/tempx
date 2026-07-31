package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6518l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5803l f13587l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13588l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6518l(C5803l c5803l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f13588l = i;
        this.f13587l = c5803l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f13588l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C5803l c5803l = this.f13587l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f13589l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c5803l.isPro.subscription(C11507l.f23131l);
                    this.f13589l = 1;
                    if (c5803l.yandex(this) == enumC9342l) {
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
            case 1:
                int i3 = this.f13589l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lIsPro = AbstractC0622l.isPro(AbstractC0622l.subs(new C9125l(c5803l.subs), 300L));
                    C6518l c6518l = new C6518l(c5803l, interfaceC14029l, 0);
                    this.f13589l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lIsPro, c6518l, this) == enumC9342l) {
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
                int i4 = this.f13589l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (((Boolean) c5803l.mopub.admob()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f13589l = 1;
                    if (c5803l.yandex(this) == enumC9342l) {
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

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f13588l;
        C5803l c5803l = this.f13587l;
        switch (i) {
            case 0:
                return new C6518l(c5803l, interfaceC14029l, 0);
            case 1:
                return new C6518l(c5803l, interfaceC14029l, 1);
            default:
                return new C6518l(c5803l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13588l) {
            case 0:
                return ((C6518l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C6518l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C6518l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
