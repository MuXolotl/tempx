package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12567l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f24751l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13191l f24752l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f24753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12567l(C13191l c13191l, AbstractC10113l abstractC10113l, long j) {
        super(1);
        this.f24752l = c13191l;
        this.f24751l = abstractC10113l;
        this.f24753l = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC13460l interfaceC13460l = this.f24752l.f25804l.loadAd;
        AbstractC10113l abstractC10113l = this.f24751l;
        AbstractC9601l.isPro((AbstractC9601l) obj, abstractC10113l, interfaceC13460l.yandex((((long) abstractC10113l.f20591l) & 4294967295L) | (((long) abstractC10113l.f20592l) << 32), this.f24753l, EnumC9931l.f20223l));
        return Unit.INSTANCE;
    }
}
