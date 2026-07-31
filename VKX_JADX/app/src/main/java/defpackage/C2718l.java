package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔٙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2718l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C10987l f5901l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f5902l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5903l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f5904l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f5905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2718l(C10987l c10987l, C13250l c13250l, float f, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f5901l = c10987l;
        this.f5902l = c13250l;
        this.f5904l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C13250l c13250l;
        int i = this.f5903l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C10987l c10987l = this.f5901l;
            C3093l c3093l = new C3093l(c10987l, (C14061l) this.f5905l, 0);
            InterfaceC14745l interfaceC14745l = c10987l.f22134l;
            InterfaceC14745l interfaceC14745l2 = interfaceC14745l != null ? interfaceC14745l : null;
            C13250l c13250l2 = this.f5902l;
            this.f5905l = c13250l2;
            this.f5903l = 1;
            Object objYandex = interfaceC14745l2.yandex(c3093l, this.f5904l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            obj = objYandex;
            c13250l = c13250l2;
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13250l = (C13250l) this.f5905l;
            AbstractC2829l.crashlytics(obj);
        }
        c13250l.f26029l = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13250l c13250l = this.f5902l;
        float f = this.f5904l;
        C2718l c2718l = new C2718l(this.f5901l, c13250l, f, (InterfaceC14029l) obj3);
        c2718l.f5905l = (C14061l) obj;
        return c2718l.Signature(Unit.INSTANCE);
    }
}
