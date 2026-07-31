package defpackage;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؒۗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1276l implements InterfaceC15273l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7420l f3327l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6916l f3319l = new C6916l("camerax.core.appConfig.cameraFactoryProvider", C10203l.class, null);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C6916l f3316l = new C6916l("camerax.core.appConfig.deviceSurfaceManagerProvider", C10980l.class, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6916l f3322l = new C6916l("camerax.core.appConfig.useCaseConfigFactoryProvider", C6046l.class, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6916l f3321l = new C6916l("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C6916l f3325l = new C6916l("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6916l f3317l = new C6916l("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6916l f3318l = new C6916l("camerax.core.appConfig.availableCamerasLimiter", C7542l.class, null);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C6916l f3324l = new C6916l("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6916l f3320l = new C6916l("camerax.core.appConfig.cameraProviderInitRetryPolicy", InterfaceC17472l.class, null);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C6916l f3326l = new C6916l("camerax.core.appConfig.quirksSettings", C1071l.class, null);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C6916l f3323l = new C6916l("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);

    public C1276l(C7420l c7420l) {
        this.f3327l = c7420l;
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Set Signature(C6916l c6916l) {
        return AbstractC4338l.billing(this, c6916l);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object adcel(C6916l c6916l) {
        return AbstractC4338l.firebase(this, c6916l);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object advert(C6916l c6916l, EnumC10534l enumC10534l) {
        return AbstractC4338l.remoteconfig(this, c6916l, enumC10534l);
    }

    public final long amazon() {
        return ((Long) this.f3327l.smaato(f3324l, -1L)).longValue();
    }

    @Override // defpackage.InterfaceC15273l
    public final /* synthetic */ String applovin(String str) {
        throw null;
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final /* synthetic */ EnumC10534l mo860class(C6916l c6916l) {
        return AbstractC4338l.purchase(this, c6916l);
    }

    public final C10203l crashlytics() {
        return (C10203l) this.f3327l.smaato(f3319l, null);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ void inmobi(C5131l c5131l) {
        AbstractC4338l.amazon(this, c5131l);
    }

    public final C6046l mopub() {
        return (C6046l) this.f3327l.smaato(f3322l, null);
    }

    public final C10980l purchase() {
        return (C10980l) this.f3327l.smaato(f3316l, null);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Object smaato(C6916l c6916l, Object obj) {
        return AbstractC4338l.smaato(this, c6916l, obj);
    }

    @Override // defpackage.InterfaceC17944l
    public final /* synthetic */ Set startapp() {
        return AbstractC4338l.isPro(this);
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final /* synthetic */ boolean mo861strictfp(C6916l c6916l) {
        return AbstractC4338l.crashlytics(this, c6916l);
    }

    @Override // defpackage.InterfaceC15866l
    public final InterfaceC17944l subs() {
        return this.f3327l;
    }

    @Override // defpackage.InterfaceC15273l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final /* synthetic */ String mo862switch() {
        throw null;
    }

    public final C7542l yandex() {
        return (C7542l) this.f3327l.smaato(f3318l, null);
    }
}
