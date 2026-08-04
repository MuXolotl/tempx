package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؑٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0334l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f1378l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14745l f1379l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ float f1380l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f1381l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C8954l f1382l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f1383l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334l(C13250l c13250l, InterfaceC14745l interfaceC14745l, C8954l c8954l, float f, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f1378l = c13250l;
        this.f1379l = interfaceC14745l;
        this.f1382l = c8954l;
        this.f1380l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C13250l c13250l;
        int i = this.f1381l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C3093l c3093l = new C3093l(this.f1382l, (C14061l) this.f1383l, 2);
            C13250l c13250l2 = this.f1378l;
            this.f1383l = c13250l2;
            this.f1381l = 1;
            Object objYandex = this.f1379l.yandex(c3093l, this.f1380l, this);
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
            c13250l = (C13250l) this.f1383l;
            AbstractC2829l.crashlytics(obj);
        }
        c13250l.f26029l = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C8954l c8954l = this.f1382l;
        float f = this.f1380l;
        C0334l c0334l = new C0334l(this.f1378l, this.f1379l, c8954l, f, (InterfaceC14029l) obj3);
        c0334l.f1383l = (C14061l) obj;
        return c0334l.Signature(Unit.INSTANCE);
    }
}
