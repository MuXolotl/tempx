package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4670l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7883l f9500l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9501l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9502l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4670l(C7883l c7883l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9501l = i;
        this.f9500l = c7883l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f9501l;
        EnumC3909l enumC3909l = EnumC3909l.f8051l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C7883l c7883l = this.f9500l;
        switch (i) {
            case 0:
                int i2 = this.f9502l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f9502l = 1;
                    if (AbstractC8532l.purchase(500L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                int i3 = C7883l.f16437l;
                c7883l.m2211package(enumC3909l);
                c7883l.f16443l = null;
                return Unit.INSTANCE;
            default:
                int i4 = this.f9502l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f9502l = 1;
                    if (AbstractC8532l.purchase(1000L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                int i5 = C7883l.f16437l;
                c7883l.m2211package(enumC3909l);
                c7883l.f16443l = null;
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f9501l) {
            case 0:
                return new C4670l(this.f9500l, interfaceC14029l, 0);
            default:
                return new C4670l(this.f9500l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f9501l) {
            case 0:
                break;
        }
        return ((C4670l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
