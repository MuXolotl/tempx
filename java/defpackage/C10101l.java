package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10101l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f20569l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1489l f20570l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f20571l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f20572l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f20573l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10101l(float f, InterfaceC1489l interfaceC1489l, C13250l c13250l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20569l = f;
        this.f20570l = interfaceC1489l;
        this.f20572l = c13250l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f20571l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C10848l c10848l = new C10848l(this.f20572l, (InterfaceC1555l) this.f20573l, 16);
            this.f20571l = 1;
            Object objAmazon = AbstractC18719l.amazon(0.0f, this.f20569l, this.f20570l, c10848l, this, 4);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
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
        C10101l c10101l = new C10101l(this.f20569l, this.f20570l, this.f20572l, interfaceC14029l);
        c10101l.f20573l = obj;
        return c10101l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10101l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
    }
}
