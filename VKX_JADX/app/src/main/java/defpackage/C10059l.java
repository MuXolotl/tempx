package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10059l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20517l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11644l f20518l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C2063l f20519l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f20520l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C12125l f20521l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f20522l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C7504l f20523l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10059l(boolean z, C11644l c11644l, C12125l c12125l, C2063l c2063l, C7504l c7504l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20517l = z;
        this.f20518l = c11644l;
        this.f20521l = c12125l;
        this.f20519l = c2063l;
        this.f20523l = c7504l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C12125l c12125l = this.f20521l;
        C1008l c1008l = (C1008l) this.f20518l.f23362l;
        int i = this.f20520l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            if (this.f20517l) {
                String str = C14025l.f27330l;
                C8688l c8688l = AbstractC0085l.yandex;
                C14025l c14025lAds = C6162l.ads(AbstractC8182l.loadAd().loadAd());
                C14025l c14025lAds2 = C6162l.ads(AbstractC8182l.loadAd().crashlytics());
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                C14025l c14025lPurchase = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_main");
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                C14025l c14025lPurchase2 = C6162l.ads(vKXApplication2.getFilesDir()).purchase("vkx_main_cdcm");
                C12382l c12382l = AbstractC5921l.f12465l;
                c12382l.ads(c14025lAds);
                c12382l.billing(c14025lAds2, c14025lAds);
                c12382l.adcel(c14025lPurchase, false);
                c12382l.billing(c14025lPurchase2, c14025lPurchase);
            } else {
                C12382l c12382l2 = AbstractC5921l.f12465l;
                String str2 = C14025l.f27330l;
                C8688l c8688l2 = AbstractC0085l.yandex;
                c12382l2.ads(C6162l.ads(AbstractC8182l.loadAd().crashlytics()));
                VKXApplication vKXApplication3 = VKXApplication.f36631l;
                if (vKXApplication3 == null) {
                    vKXApplication3 = null;
                }
                c12382l2.adcel(C6162l.ads(vKXApplication3.getFilesDir()).purchase("vkx_main_cdcm"), false);
            }
            try {
                C5198l c5198l = new C5198l(c12125l);
                c1008l.getClass();
                c1008l.remoteconfig(null, c5198l);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !AbstractC12024l.appmetrica(message, "RLM_ERR_INVALID_SCHEMA_VERSION", false)) {
                    throw e;
                }
                C12382l c12382l3 = AbstractC5921l.f12465l;
                String str3 = C14025l.f27330l;
                C8688l c8688l3 = AbstractC0085l.yandex;
                c12382l3.ads(C6162l.ads(AbstractC8182l.loadAd().loadAd()));
                VKXApplication vKXApplication4 = VKXApplication.f36631l;
                if (vKXApplication4 == null) {
                    vKXApplication4 = null;
                }
                c12382l3.adcel(C6162l.ads(vKXApplication4.getFilesDir()).purchase("vkx_main"), false);
                C5198l c5198l2 = new C5198l(c12125l);
                c1008l.getClass();
                c1008l.remoteconfig(null, c5198l2);
            }
            this.f20522l = null;
            this.f20520l = 1;
            Object objInvoke = this.f20519l.invoke(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        this.f20523l.ads(null);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C10059l c10059l = new C10059l(this.f20517l, this.f20518l, this.f20521l, this.f20519l, this.f20523l, interfaceC14029l);
        c10059l.f20522l = obj;
        return c10059l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10059l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
