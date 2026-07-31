package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15571l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C17284l f30410l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30411l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30412l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15571l(C17284l c17284l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30411l = i;
        this.f30410l = c17284l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f30411l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C17284l c17284l = this.f30410l;
        switch (i) {
            case 0:
                int i2 = this.f30412l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC8576l.yandex((C4065l) c17284l.f33541l.getValue(), C4065l.billing)) {
                        this.f30412l = 1;
                        if (c17284l.m4298try(this) == enumC9342l) {
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
            default:
                int i3 = this.f30412l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c17284l.f33537l.setValue(Boolean.FALSE);
                    this.f30412l = 1;
                    c17284l.f33541l.setValue(C4065l.billing);
                    Object objM4298try = c17284l.m4298try(this);
                    if (objM4298try != enumC9342l) {
                        objM4298try = Unit.INSTANCE;
                    }
                    if (objM4298try == enumC9342l) {
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
        int i = this.f30411l;
        C17284l c17284l = this.f30410l;
        switch (i) {
            case 0:
                return new C15571l(c17284l, interfaceC14029l, 0);
            default:
                return new C15571l(c17284l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30411l) {
            case 0:
                return ((C15571l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C15571l) ads((InterfaceC14029l) obj2, (C15021l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
