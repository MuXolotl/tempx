package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7728l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16221l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ long f16222l;

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        long j = this.f16222l;
        int i = this.f16221l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f16222l = j;
            this.f16221l = 1;
            Object objPurchase = AbstractC8532l.purchase(j, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
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
        C7728l c7728l = new C7728l(2, interfaceC14029l);
        c7728l.f16222l = ((Number) obj).longValue();
        return c7728l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7728l) ads((InterfaceC14029l) obj2, Long.valueOf(((Number) obj).longValue()))).Signature(Unit.INSTANCE);
    }
}
