package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3381l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13242l f7204l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7205l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3381l(C13242l c13242l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f7205l = i;
        this.f7204l = c13242l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f7205l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C13242l c13242l = this.f7204l;
        switch (i) {
            case 0:
                int i2 = this.f7206l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f7206l = 1;
                    if (c13242l.yandex(this) == enumC9342l) {
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
                int i3 = this.f7206l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (((Boolean) c13242l.admob.admob()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f7206l = 1;
                    if (c13242l.yandex(this) == enumC9342l) {
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
        int i = this.f7205l;
        C13242l c13242l = this.f7204l;
        switch (i) {
            case 0:
                return new C3381l(c13242l, interfaceC14029l, 0);
            default:
                return new C3381l(c13242l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7205l) {
            case 0:
                break;
        }
        return ((C3381l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
