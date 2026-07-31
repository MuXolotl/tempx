package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import defpackage.AbstractC0653l;
import defpackage.AbstractC12179l;
import defpackage.AbstractC16181l;
import defpackage.AbstractC6475l;
import defpackage.AbstractC9859l;
import defpackage.C15858l;
import defpackage.C17568l;
import defpackage.C18353l;
import defpackage.C2415l;
import defpackage.C3185l;
import defpackage.C4444l;
import defpackage.C5268l;
import defpackage.C7297l;
import defpackage.C8339l;
import defpackage.C9954l;
import defpackage.EnumC14812l;
import defpackage.EnumC8981l;
import defpackage.InterfaceC11652l;
import j$.util.Objects;
import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private AbstractC12179l mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private C4444l mHostValidator;
    private CarAppService mService;

    public CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private AbstractC6475l getCurrentLifecycle() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        if (abstractC12179l == null) {
            return null;
        }
        return abstractC12179l.f24198l;
    }

    private C4444l getHostValidator() {
        if (this.mHostValidator == null) {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            this.mHostValidator = carAppService.yandex();
        }
        return this.mHostValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        subs subsVar = abstractC12179l.f24197l;
        str.getClass();
        if (str.equals("app")) {
            Objects.requireNonNull(subsVar);
            androidx.car.app.utils.billing.mopub(iOnDoneCallback, "getManager", ((loadAd) subsVar.loadAd(loadAd.class)).loadAd);
        } else if (str.equals("navigation")) {
            Objects.requireNonNull(subsVar);
            androidx.car.app.utils.billing.mopub(iOnDoneCallback, "getManager", ((androidx.car.app.navigation.loadAd) subsVar.loadAd(androidx.car.app.navigation.loadAd.class)).yandex);
        } else {
            Log.e("CarApp", str.concat("%s is not a valid manager"));
            androidx.car.app.utils.billing.billing(iOnDoneCallback, "getManager", new InvalidParameterException(str.concat(" is not a valid manager type")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        AbstractC12179l abstractC12179lLoadAd = this.mCurrentSession;
        EnumC8981l enumC8981l = EnumC8981l.f18522l;
        if (abstractC12179lLoadAd == null || abstractC12179lLoadAd.f24198l.subs == enumC8981l) {
            Objects.requireNonNull(this.mCurrentSessionInfo);
            abstractC12179lLoadAd = carAppService.loadAd();
            this.mCurrentSession = abstractC12179lLoadAd;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        Objects.requireNonNull(handshakeInfo);
        Objects.requireNonNull(carAppService.f277l);
        subs subsVar = abstractC12179lLoadAd.f24197l;
        subsVar.getClass();
        subsVar.amazon = handshakeInfo.getHostCarAppApiLevel();
        subsVar.yandex(carAppService, configuration);
        AbstractC9859l.yandex();
        isPro ispro = subsVar.loadAd;
        Objects.requireNonNull(iCarHost);
        ispro.getClass();
        AbstractC9859l.yandex();
        AbstractC9859l.yandex();
        ispro.loadAd = null;
        ispro.amazon = null;
        ispro.yandex = iCarHost;
        C5268l c5268l = abstractC12179lLoadAd.f24198l;
        EnumC8981l enumC8981l2 = c5268l.subs;
        Objects.requireNonNull(subsVar);
        int size = ((C17568l) subsVar.loadAd(C17568l.class)).yandex.size();
        if (!enumC8981l2.yandex(EnumC8981l.f18520l) || size < 1) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + c5268l.subs + ", stack size: " + size);
            }
            abstractC12179lLoadAd.crashlytics(EnumC14812l.ON_CREATE);
            C17568l c17568l = (C17568l) subsVar.loadAd(C17568l.class);
            subs subsVar2 = ((C2415l) abstractC12179lLoadAd).f24197l;
            Objects.requireNonNull(subsVar2);
            C7297l c7297l = new C7297l(subsVar2);
            c17568l.getClass();
            AbstractC9859l.yandex();
            C5268l c5268l2 = c17568l.crashlytics;
            if (c5268l2.subs.equals(enumC8981l)) {
                if (Log.isLoggable("CarApp", 3)) {
                    Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
                }
            } else {
                if (c7297l.f15145l.subs.equals(enumC8981l)) {
                    Locale locale = Locale.US;
                    C18353l.vip(c7297l, "), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", "Failed to push screen (");
                    return null;
                }
                ArrayDeque arrayDeque = c17568l.yandex;
                if (Log.isLoggable("CarApp", 3)) {
                    Log.d("CarApp", "Pushing screen " + c7297l + " to the top of the screen stack");
                }
                boolean zContains = arrayDeque.contains(c7297l);
                EnumC8981l enumC8981l3 = EnumC8981l.f18523l;
                if (zContains) {
                    C7297l c7297l2 = (C7297l) arrayDeque.peek();
                    if (c7297l2 != null && c7297l2 != c7297l) {
                        arrayDeque.remove(c7297l);
                        c17568l.yandex(c7297l, false);
                        C17568l.loadAd(c7297l2, false);
                        if (c5268l2.subs.yandex(enumC8981l3)) {
                            c7297l.crashlytics(EnumC14812l.ON_RESUME);
                        }
                    }
                } else {
                    C7297l c7297l3 = (C7297l) arrayDeque.peek();
                    c17568l.yandex(c7297l, true);
                    if (arrayDeque.contains(c7297l)) {
                        if (c7297l3 != null) {
                            C17568l.loadAd(c7297l3, false);
                        }
                        if (c5268l2.subs.yandex(enumC8981l3)) {
                            c7297l.crashlytics(EnumC14812l.ON_RESUME);
                        }
                    }
                }
            }
        } else {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was already created");
            }
            onNewIntentInternal(abstractC12179lLoadAd, intent);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        abstractC12179l.crashlytics(EnumC14812l.ON_PAUSE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        abstractC12179l.crashlytics(EnumC14812l.ON_RESUME);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        abstractC12179l.crashlytics(EnumC14812l.ON_START);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        abstractC12179l.crashlytics(EnumC14812l.ON_STOP);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        onConfigurationChangedInternal(abstractC12179l, configuration);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        Objects.requireNonNull(abstractC12179l);
        onNewIntentInternal(abstractC12179l, intent);
        return null;
    }

    private void onConfigurationChangedInternal(AbstractC12179l abstractC12179l, Configuration configuration) {
        AbstractC9859l.yandex();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        subs subsVar = abstractC12179l.f24197l;
        subsVar.crashlytics(configuration);
        subsVar.getResources().getConfiguration();
    }

    private void onNewIntentInternal(AbstractC12179l abstractC12179l, Intent intent) {
        AbstractC9859l.yandex();
        abstractC12179l.getClass();
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            if (carAppService.f278l == null) {
                carAppService.f278l = AppInfo.create(carAppService);
            }
            androidx.car.app.utils.billing.mopub(iOnDoneCallback, "getAppInfo", carAppService.f278l);
        } catch (IllegalArgumentException e) {
            androidx.car.app.utils.billing.billing(iOnDoneCallback, "getAppInfo", e);
        }
    }

    public CarAppService getCarAppService() {
        return this.mService;
    }

    public AbstractC12179l getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        AbstractC9859l.loadAd(new Runnable() { // from class: androidx.car.app.billing
            @Override // java.lang.Runnable
            public final void run() {
                this.f287l.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate intent: " + intent);
        }
        androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onAppCreate", new InterfaceC11652l() { // from class: androidx.car.app.purchase
            @Override // defpackage.InterfaceC11652l
            public final Object yandex() {
                return this.f316l.lambda$onAppCreate$0(iCarHost, configuration, intent);
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new amazon(this, 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new amazon(this, 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new amazon(this, 1));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new amazon(this, 2));
    }

    public void onAutoDriveEnabled() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        if (abstractC12179l != null) {
            subs subsVar = abstractC12179l.f24197l;
            Objects.requireNonNull(subsVar);
            ((androidx.car.app.navigation.loadAd) subsVar.loadAd(androidx.car.app.navigation.loadAd.class)).getClass();
            AbstractC9859l.yandex();
            if (Log.isLoggable("CarApp.Nav", 3)) {
                Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
            }
            Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new crashlytics(this, configuration, 0));
    }

    public void onDestroyLifecycle() {
        AbstractC12179l abstractC12179l = this.mCurrentSession;
        if (abstractC12179l != null) {
            abstractC12179l.crashlytics(EnumC14812l.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(C15858l c15858l, IOnDoneCallback iOnDoneCallback) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) c15858l.yandex();
            String hostPackageName = handshakeInfo.getHostPackageName();
            int callingUid = Binder.getCallingUid();
            C3185l c3185l = new C3185l(hostPackageName, callingUid);
            if (!getHostValidator().yandex(c3185l)) {
                androidx.car.app.utils.billing.billing(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Unknown host '" + hostPackageName + "', uid:" + callingUid));
                return;
            }
            if (carAppService.f278l == null) {
                carAppService.f278l = AppInfo.create(carAppService);
            }
            AppInfo appInfo = carAppService.f278l;
            int minCarAppApiLevel = appInfo.getMinCarAppApiLevel();
            int latestCarAppApiLevel = appInfo.getLatestCarAppApiLevel();
            int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
            if (minCarAppApiLevel > hostCarAppApiLevel) {
                androidx.car.app.utils.billing.billing(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is less than the app's min API level (" + minCarAppApiLevel + ")"));
                return;
            }
            if (latestCarAppApiLevel >= hostCarAppApiLevel) {
                carAppService.f277l = c3185l;
                this.mHandshakeInfo = handshakeInfo;
                androidx.car.app.utils.billing.mopub(iOnDoneCallback, "onHandshakeCompleted", null);
            } else {
                androidx.car.app.utils.billing.billing(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is greater than the app's max API level (" + latestCarAppApiLevel + ")"));
            }
        } catch (IllegalArgumentException e) {
            e = e;
            carAppService.f277l = null;
            androidx.car.app.utils.billing.billing(iOnDoneCallback, "onHandshakeCompleted", e);
        } catch (C9954l e2) {
            e = e2;
            carAppService.f277l = null;
            androidx.car.app.utils.billing.billing(iOnDoneCallback, "onHandshakeCompleted", e);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new crashlytics(this, intent, 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > AbstractC16181l.loadAd()) {
            C8339l.metrica(AbstractC0653l.vip(hostCarAppApiLevel, "Invalid Car App API level received: "));
        } else {
            this.mHandshakeInfo = handshakeInfo;
        }
    }
}
