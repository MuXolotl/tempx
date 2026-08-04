package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2190l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f4839l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f4840l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7448l f4841l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f4842l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f4843l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2190l(C12515l c12515l, long j, int i, int i2, InterfaceC7448l interfaceC7448l, AbstractC10113l abstractC10113l) {
        super(1);
        this.f4840l = j;
        this.f4839l = i;
        this.f4842l = i2;
        this.f4841l = interfaceC7448l;
        this.f4843l = abstractC10113l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        long j = (((long) this.f4839l) << 32) | (((long) this.f4842l) & 4294967295L);
        EnumC9931l layoutDirection = this.f4841l.getLayoutDirection();
        long j2 = this.f4840l;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == EnumC9931l.f20223l ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        AbstractC9601l.isPro(abstractC9601l, this.f4843l, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return Unit.INSTANCE;
    }
}
