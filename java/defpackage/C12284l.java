package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12284l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f24348l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f24349l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24350l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C9649l f24351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12284l(C9649l c9649l, float f, float f2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f24351l = c9649l;
        this.f24348l = f;
        this.f24349l = f2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f24350l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C4154l c4154l = this.f24351l.f19680l;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f24348l)) << 32) | (((long) Float.floatToRawIntBits(this.f24349l)) & 4294967295L);
            this.f24350l = 1;
            Object objLoadAd = AbstractC13611l.loadAd(c4154l, jFloatToRawIntBits, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
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
        return new C12284l(this.f24351l, this.f24348l, this.f24349l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12284l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
