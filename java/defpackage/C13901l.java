package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13901l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f27195l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27196l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27197l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13901l(C17398l c17398l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27196l = i;
        this.f27195l = c17398l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f27196l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C17398l c17398l = this.f27195l;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f27197l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l = new C16534l(c17398l.f33899l, 8);
                this.f27197l = 1;
                if (c16534l.ads(this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex;
                C5574l c5574l = new C5574l(c17398l, interfaceC14029l, 0);
                this.f27197l = 2;
                if (AbstractC10999l.firebase(c2975l, c5574l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f27197l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l2 = new C16534l(c17398l.f33899l, 2);
                this.f27197l = 1;
                if (c16534l2.ads(this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l2 = AbstractC11463l.yandex;
                C2975l c2975l2 = AbstractC17278l.yandex;
                C5574l c5574l2 = new C5574l(c17398l, interfaceC14029l, i2);
                this.f27197l = 2;
                if (AbstractC10999l.firebase(c2975l2, c5574l2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f27196l;
        C17398l c17398l = this.f27195l;
        switch (i) {
            case 0:
                return new C13901l(c17398l, interfaceC14029l, 0);
            default:
                return new C13901l(c17398l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f27196l) {
            case 0:
                break;
        }
        return ((C13901l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
