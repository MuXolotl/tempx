package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0167l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f1115l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f1116l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15595l f1117l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7257l f1118l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f1119l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f1120l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f1121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167l(C7257l c7257l, C17421l c17421l, long j, long j2, long j3, AbstractC10113l abstractC10113l, long j4, C15595l c15595l) {
        super(1);
        this.f1118l = c7257l;
        this.f1115l = c17421l;
        this.f1120l = j2;
        this.f1119l = j3;
        this.f1121l = abstractC10113l;
        this.f1116l = j4;
        this.f1117l = c15595l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        C7257l c7257l = this.f1118l;
        C13551l c13551l = c7257l.f15094l;
        long jYandex = 0;
        InterfaceC12244l interfaceC12244l = this.f1115l;
        long j = interfaceC12244l != null ? ((C5177l) interfaceC12244l.getValue()).yandex : 0L;
        c13551l.loadAd();
        if (c13551l.loadAd()) {
            c13551l.crashlytics.getClass();
        }
        long jAmazon = C5177l.amazon(j, 0L);
        if (c13551l.loadAd()) {
            c13551l.subs = jAmazon;
        }
        InterfaceC13460l interfaceC13460l = c7257l.f15103l;
        if (interfaceC13460l != null) {
            jYandex = interfaceC13460l.yandex(this.f1120l, this.f1119l, EnumC9931l.f20223l);
        }
        long jAmazon2 = C5177l.amazon(jYandex, jAmazon);
        long j2 = this.f1116l;
        abstractC9601l.getClass();
        long j3 = (((long) (((int) (jAmazon2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jAmazon2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
        AbstractC10113l abstractC10113l = this.f1121l;
        AbstractC9601l.yandex(abstractC9601l, abstractC10113l);
        abstractC10113l.mo883interface(C5177l.amazon(j3, abstractC10113l.f20593l), 0.0f, this.f1117l);
        return Unit.INSTANCE;
    }
}
