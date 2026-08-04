package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8100l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f16880l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16881l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16882l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8100l(C0471l c0471l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16881l = i;
        this.f16880l = c0471l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f16881l;
        C0471l c0471l = this.f16880l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f16882l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC8576l.yandex(c0471l.m564finally(), C17202l.yandex)) {
                        this.f16882l = 1;
                        if (C0471l.m562abstract(c0471l, this) == enumC9342l) {
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
                int i3 = this.f16882l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f16882l = 1;
                    if (C0471l.m562abstract(c0471l, this) == enumC9342l) {
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
            case 2:
                int i4 = this.f16882l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f16882l = 1;
                    if (C0471l.m563instanceof(c0471l, this) == enumC9342l) {
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
                int i5 = this.f16882l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f16882l = 1;
                    if (C0471l.m563instanceof(c0471l, this) == enumC9342l) {
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
        int i = this.f16881l;
        C0471l c0471l = this.f16880l;
        switch (i) {
            case 0:
                return new C8100l(c0471l, interfaceC14029l, 0);
            case 1:
                return new C8100l(c0471l, interfaceC14029l, 1);
            case 2:
                return new C8100l(c0471l, interfaceC14029l, 2);
            default:
                return new C8100l(c0471l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f16881l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C8100l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
