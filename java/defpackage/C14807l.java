package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14807l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f28957l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28958l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C7473l f28959l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14807l(C7473l c7473l, float f, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f28959l = c7473l;
        this.f28957l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f28958l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C7473l c7473l = this.f28959l;
            float fAdmob = c7473l.purchase.admob();
            C4951l c4951l = new C4951l(24, c7473l);
            this.f28958l = 1;
            Object objAmazon = AbstractC18719l.amazon(fAdmob, this.f28957l, null, c4951l, this, 12);
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
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C14807l(this.f28959l, this.f28957l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C14807l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
