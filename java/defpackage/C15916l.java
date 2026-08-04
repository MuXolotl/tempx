package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15916l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f31245l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6843l f31246l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31247l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31248l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31249l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15916l(InterfaceC6843l interfaceC6843l, C12217l c12217l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f31246l = interfaceC6843l;
        this.f31245l = c12217l;
        this.f31248l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f31247l;
        boolean z = this.f31248l;
        InterfaceC6843l interfaceC6843l = this.f31246l;
        C12217l c12217l = this.f31245l;
        Object obj2 = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f31249l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6921l c6921l = new C6921l(c12217l, z, 12);
                    C18497l c18497l = new C18497l(c12217l, 6);
                    this.f31249l = 1;
                    Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new C3977l(c6921l, c18497l, (InterfaceC14029l) null, 2), this);
                    if (objCrashlytics != obj2) {
                        objCrashlytics = Unit.INSTANCE;
                    }
                    if (objCrashlytics == obj2) {
                        return obj2;
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
                int i3 = this.f31249l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f31249l = 1;
                    if (C12217l.loadAd(c12217l, interfaceC6843l, z, this) == obj2) {
                        return obj2;
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
        int i = this.f31247l;
        boolean z = this.f31248l;
        InterfaceC6843l interfaceC6843l = this.f31246l;
        C12217l c12217l = this.f31245l;
        switch (i) {
            case 0:
                return new C15916l(interfaceC6843l, c12217l, z, interfaceC14029l);
            default:
                return new C15916l(c12217l, interfaceC6843l, z, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f31247l) {
            case 0:
                break;
        }
        return ((C15916l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15916l(C12217l c12217l, InterfaceC6843l interfaceC6843l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f31245l = c12217l;
        this.f31246l = interfaceC6843l;
        this.f31248l = z;
    }
}
