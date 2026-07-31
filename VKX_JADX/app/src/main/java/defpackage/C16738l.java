package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۣۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16738l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3372l f32744l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32745l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32746l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32747l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16738l(AbstractC3372l abstractC3372l, int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f32746l = i2;
        this.f32744l = abstractC3372l;
        this.f32745l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f32746l;
        int i2 = this.f32745l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        AbstractC3372l abstractC3372l = this.f32744l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f32747l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32747l = 1;
                    Object objMo850break = abstractC3372l.mo850break(i2, this);
                    return objMo850break == enumC9342l ? enumC9342l : objMo850break;
                }
                if (i3 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f32747l;
                int i5 = 0;
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
                    abstractC3372l.m3094public();
                    abstractC3372l.f23163l = true;
                    abstractC3372l.f23171l = false;
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C16738l c16738l = new C16738l(abstractC3372l, i2, interfaceC14029l, i5);
                this.f32747l = 1;
                obj = AbstractC10999l.firebase(executorC6708l, c16738l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l2 = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex.f6462l;
                C6637l c6637l = new C6637l(abstractC3372l, (List) obj, interfaceC14029l, 14);
                this.f32747l = 2;
                if (AbstractC10999l.firebase(c2975l, c6637l, this) == enumC9342l) {
                    return enumC9342l;
                }
                abstractC3372l.m3094public();
                abstractC3372l.f23163l = true;
                abstractC3372l.f23171l = false;
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32746l;
        int i2 = this.f32745l;
        AbstractC3372l abstractC3372l = this.f32744l;
        switch (i) {
            case 0:
                return new C16738l(abstractC3372l, i2, interfaceC14029l, 0);
            default:
                return new C16738l(abstractC3372l, i2, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32746l) {
            case 0:
                break;
        }
        return ((C16738l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
