package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1114l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f3051l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f3052l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3053l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f3054l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f3055l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114l(float f, float f2, float f3, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f3051l = f;
        this.f3052l = f2;
        this.f3054l = f3;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3053l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C12469l c12469l = (C12469l) this.f3055l;
            C13250l c13250l = new C13250l();
            float f = this.f3051l;
            c13250l.f26029l = f;
            C5616l c5616lYandex = AbstractC6791l.yandex(f);
            Float f2 = new Float(this.f3052l);
            C4776l c4776l = AbstractC11840l.loadAd;
            Float f3 = new Float(this.f3054l);
            C10207l c10207l = new C10207l(c12469l, c13250l, 14);
            this.f3053l = 1;
            Object objAmazon = c5616lYandex.amazon();
            C0010l c0010l = AbstractC3483l.purchase;
            Object objYandex = C4793l.yandex(c5616lYandex.billing, new C1092l(c5616lYandex, f3, new C5810l(c4776l, c0010l, objAmazon, f2, (AbstractC2249l) c0010l.yandex.invoke(f3)), c5616lYandex.crashlytics.f13723l, c10207l, null), this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1114l c1114l = new C1114l(this.f3051l, this.f3052l, this.f3054l, interfaceC14029l);
        c1114l.f3055l = obj;
        return c1114l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1114l) ads((InterfaceC14029l) obj2, (C12469l) obj)).Signature(Unit.INSTANCE);
    }
}
