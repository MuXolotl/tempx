package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1092l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f3025l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C5616l f3026l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C5810l f3027l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C6570l f3028l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f3029l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f3030l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C9122l f3031l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ long f3032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092l(C5616l c5616l, Object obj, C5810l c5810l, long j, Function1 function1, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f3026l = c5616l;
        this.f3030l = obj;
        this.f3027l = c5810l;
        this.f3032l = j;
        this.f3029l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C6570l c6570l;
        C9122l c9122l;
        C5810l c5810l = this.f3027l;
        C5616l c5616l = this.f3026l;
        C6570l c6570l2 = c5616l.crashlytics;
        int i = this.f3025l;
        int i2 = 1;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                c6570l2.f13719l = (AbstractC2249l) c5616l.yandex.yandex.invoke(this.f3030l);
                c5616l.purchase.setValue(c5810l.crashlytics);
                c5616l.amazon.setValue(Boolean.TRUE);
                C6570l c6570l3 = new C6570l(c6570l2.f13721l, c6570l2.f13720l.getValue(), AbstractC4959l.amazon(c6570l2.f13719l), c6570l2.f13723l, Long.MIN_VALUE, c6570l2.f13724l);
                C9122l c9122l2 = new C9122l();
                long j = this.f3032l;
                C17796l c17796l = new C17796l(c5616l, c6570l3, this.f3029l, c9122l2, 1);
                this.f3028l = c6570l3;
                this.f3031l = c9122l2;
                this.f3025l = 1;
                Object objCrashlytics = AbstractC18719l.crashlytics(c6570l3, c5810l, j, c17796l, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objCrashlytics == enumC9342l) {
                    return enumC9342l;
                }
                c6570l = c6570l3;
                c9122l = c9122l2;
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c9122l = this.f3031l;
                c6570l = this.f3028l;
                AbstractC2829l.crashlytics(obj);
            }
            if (!c9122l.f18750l) {
                i2 = 2;
            }
            C5616l.yandex(c5616l);
            return new C18549l(i2, c6570l);
        } catch (CancellationException e) {
            C5616l.yandex(c5616l);
            throw e;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C1092l(this.f3026l, this.f3030l, this.f3027l, this.f3032l, this.f3029l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1092l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
