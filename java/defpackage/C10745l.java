package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10745l extends AbstractC6144l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21755l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ appmetrica f21756l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ C9166l f21757l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10745l(appmetrica appmetricaVar, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f21756l = appmetricaVar;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        appmetrica appmetricaVar = this.f21756l;
        AbstractC0576l abstractC0576l = (AbstractC0576l) appmetricaVar.f492l;
        C9166l c9166l = this.f21757l;
        int i = this.f21755l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            byte bAdvert = abstractC0576l.advert();
            if (bAdvert == 1) {
                return appmetricaVar.m168synchronized(true);
            }
            if (bAdvert == 0) {
                return appmetricaVar.m168synchronized(false);
            }
            if (bAdvert != 6) {
                if (bAdvert == 8) {
                    return appmetricaVar.applovin();
                }
                AbstractC0576l.tapsense(abstractC0576l, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f21757l = null;
            this.f21755l = 1;
            obj = appmetrica.amazon(appmetricaVar, c9166l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return (AbstractC9914l) obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10745l c10745l = new C10745l(this.f21756l, (InterfaceC14029l) obj3);
        c10745l.f21757l = (C9166l) obj;
        return c10745l.Signature(Unit.INSTANCE);
    }
}
