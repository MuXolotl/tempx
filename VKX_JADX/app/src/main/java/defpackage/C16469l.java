package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16469l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32191l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ long f32192l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32193l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16469l(int i, long j, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f32193l = i2;
        this.f32191l = i;
        this.f32192l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f32193l;
        long j = this.f32192l;
        int i2 = this.f32191l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i3 = this.f32194l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11485l c11485l = C11485l.f23075l;
                    this.f32194l = 1;
                    obj = c11485l.vip(i2, j, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Boolean.valueOf(obj != null);
            default:
                int i4 = this.f32194l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32194l = 1;
                    C16552l c16552l = AbstractC11463l.yandex;
                    Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C9718l(i2, j, null), this);
                    if (objFirebase != enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == enumC9342l) {
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
        switch (this.f32193l) {
            case 0:
                return new C16469l(this.f32191l, this.f32192l, interfaceC14029l, 0);
            default:
                return new C16469l(this.f32191l, this.f32192l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32193l) {
            case 0:
                break;
        }
        return ((C16469l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
