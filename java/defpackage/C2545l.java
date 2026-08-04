package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2545l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5374l f5541l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5542l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5543l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2545l(C5374l c5374l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f5542l = i;
        this.f5541l = c5374l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f5542l;
        C5374l c5374l = this.f5541l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f5543l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f5543l = 1;
                    C11911l c11911l = C5374l.firebase;
                    if (c5374l.crashlytics(this) == enumC9342l) {
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
                int i3 = this.f5543l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C2545l c2545l = new C2545l(c5374l, interfaceC14029l, 0);
                    this.f5543l = 1;
                    if (AbstractC10999l.firebase(executorC6708l, c2545l, this) == enumC9342l) {
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
        int i = this.f5542l;
        C5374l c5374l = this.f5541l;
        switch (i) {
            case 0:
                return new C2545l(c5374l, interfaceC14029l, 0);
            default:
                return new C2545l(c5374l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f5542l) {
            case 0:
                break;
        }
        return ((C2545l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
