package defpackage;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.PowerManager;
import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC5477l extends AbstractServiceC4696l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final String f11723l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC7317l f11724l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8688l f11725l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8688l f11726l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public PowerManager.WakeLock f11728l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AudioTrack f11730l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f11731l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f11732l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8688l f11733l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public WifiManager.WifiLock f11734l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7119l f11727l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public CancellationSignal f11729l = new CancellationSignal();

    static {
        StringBuilder sb = new StringBuilder();
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        sb.append(vKXApplication.getPackageName());
        sb.append(".action.STOP_DL");
        f11723l = sb.toString();
    }

    public AbstractServiceC5477l() {
        final int i = 0;
        this.f11733l = new C8688l(new Function0(this) { // from class: lٌَؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5477l f4166l;

            {
                this.f4166l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractServiceC5477l abstractServiceC5477l = this.f4166l;
                switch (i2) {
                    case 0:
                        return abstractServiceC5477l.purchase();
                    case 1:
                        if (Build.VERSION.SDK_INT >= 29) {
                            return new C13070l(abstractServiceC5477l.getApplicationContext());
                        }
                        C8994l c8994l = C8994l.yandex;
                        c8994l.getClass();
                        C8634l c8634l = C8994l.purchase;
                        InterfaceC13922l interfaceC13922l = C8994l.loadAd[2];
                        return ((Boolean) c8634l.pro(c8994l)).booleanValue() ? new C13070l(abstractServiceC5477l.getApplicationContext()) : new C5129l();
                    case 2:
                        return (PowerManager) abstractServiceC5477l.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) abstractServiceC5477l.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i2 = 1;
        this.f11725l = new C8688l(new Function0(this) { // from class: lٌَؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5477l f4166l;

            {
                this.f4166l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AbstractServiceC5477l abstractServiceC5477l = this.f4166l;
                switch (i3) {
                    case 0:
                        return abstractServiceC5477l.purchase();
                    case 1:
                        if (Build.VERSION.SDK_INT >= 29) {
                            return new C13070l(abstractServiceC5477l.getApplicationContext());
                        }
                        C8994l c8994l = C8994l.yandex;
                        c8994l.getClass();
                        C8634l c8634l = C8994l.purchase;
                        InterfaceC13922l interfaceC13922l = C8994l.loadAd[2];
                        return ((Boolean) c8634l.pro(c8994l)).booleanValue() ? new C13070l(abstractServiceC5477l.getApplicationContext()) : new C5129l();
                    case 2:
                        return (PowerManager) abstractServiceC5477l.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) abstractServiceC5477l.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i3 = 2;
        this.f11726l = new C8688l(new Function0(this) { // from class: lٌَؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5477l f4166l;

            {
                this.f4166l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                AbstractServiceC5477l abstractServiceC5477l = this.f4166l;
                switch (i4) {
                    case 0:
                        return abstractServiceC5477l.purchase();
                    case 1:
                        if (Build.VERSION.SDK_INT >= 29) {
                            return new C13070l(abstractServiceC5477l.getApplicationContext());
                        }
                        C8994l c8994l = C8994l.yandex;
                        c8994l.getClass();
                        C8634l c8634l = C8994l.purchase;
                        InterfaceC13922l interfaceC13922l = C8994l.loadAd[2];
                        return ((Boolean) c8634l.pro(c8994l)).booleanValue() ? new C13070l(abstractServiceC5477l.getApplicationContext()) : new C5129l();
                    case 2:
                        return (PowerManager) abstractServiceC5477l.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) abstractServiceC5477l.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i4 = 3;
        this.f11732l = new C8688l(new Function0(this) { // from class: lٌَؓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5477l f4166l;

            {
                this.f4166l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                AbstractServiceC5477l abstractServiceC5477l = this.f4166l;
                switch (i5) {
                    case 0:
                        return abstractServiceC5477l.purchase();
                    case 1:
                        if (Build.VERSION.SDK_INT >= 29) {
                            return new C13070l(abstractServiceC5477l.getApplicationContext());
                        }
                        C8994l c8994l = C8994l.yandex;
                        c8994l.getClass();
                        C8634l c8634l = C8994l.purchase;
                        InterfaceC13922l interfaceC13922l = C8994l.loadAd[2];
                        return ((Boolean) c8634l.pro(c8994l)).booleanValue() ? new C13070l(abstractServiceC5477l.getApplicationContext()) : new C5129l();
                    case 2:
                        return (PowerManager) abstractServiceC5477l.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) abstractServiceC5477l.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        C6356l.amazon().metrica = true;
    }

    public final InterfaceC11497l admob() {
        return (InterfaceC11497l) this.f11725l.getValue();
    }

    public final void amazon() {
        AbstractC16377l abstractC16377lMopub = mopub();
        NotificationManager notificationManager = abstractC16377lMopub.f32026l;
        AbstractServiceC5477l abstractServiceC5477l = abstractC16377lMopub.f32027l;
        if (abstractServiceC5477l.f11724l != null) {
            abstractC16377lMopub.f32029l = true;
            notificationManager.cancel(abstractC16377lMopub.amazon());
            notificationManager.cancel(abstractServiceC5477l.f11724l.yandex.hashCode());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.premium(abstractServiceC5477l, 1);
            } else {
                abstractServiceC5477l.stopForeground(true);
            }
        }
        this.f11729l.cancel();
        subs();
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), AbstractC11463l.yandex, 0, new C17009l(this, null, 0), 2);
    }

    public abstract Object billing(AbstractC7317l abstractC7317l, AbstractC0283l abstractC0283l);

    public final void crashlytics() {
        PowerManager.WakeLock wakeLockNewWakeLock;
        PowerManager.WakeLock wakeLock = this.f11728l;
        if (wakeLock == null || this.f11734l == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = null;
            if (wakeLock == null) {
                try {
                    PowerManager powerManager = (PowerManager) this.f11726l.getValue();
                    wakeLockNewWakeLock = powerManager != null ? powerManager.newWakeLock(1, "VKX:BdsWakeLock-".concat(mopub().mopub())) : null;
                } catch (Exception unused) {
                }
                this.f11728l = wakeLockNewWakeLock;
            }
            if (this.f11734l == null) {
                try {
                    WifiManager wifiManager = (WifiManager) this.f11732l.getValue();
                    if (wifiManager != null) {
                        wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "VKX:BdsWifiLock-".concat(mopub().mopub()));
                    }
                } catch (Exception unused2) {
                }
                this.f11734l = wifiLockCreateWifiLock;
            }
        }
        try {
            PowerManager.WakeLock wakeLock2 = this.f11728l;
            if (wakeLock2 != null) {
                C6760l c6760l = C9658l.f19699l;
                wakeLock2.acquire(C9658l.amazon(AbstractC15918l.tapsense(5, EnumC16636l.MINUTES)));
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused3) {
        }
        try {
            WifiManager.WifiLock wifiLock = this.f11734l;
            if (wifiLock != null) {
                wifiLock.acquire();
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Throwable unused4) {
        }
    }

    public final AbstractC16377l mopub() {
        return (AbstractC16377l) this.f11733l.getValue();
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC16377l abstractC16377lMopub = mopub();
        AbstractC5941l.startapp(abstractC16377lMopub.f32027l, abstractC16377lMopub.loadAd(), abstractC16377lMopub.crashlytics(), abstractC16377lMopub.yandex());
        C18351l c18351lFirebase = AbstractC11990l.firebase(this);
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(c18351lFirebase, ExecutorC6708l.f14063l, 0, new C17009l(this, null, 1), 2);
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final void onDestroy() {
        subs();
        this.f11724l = null;
        this.f11730l = null;
        this.f11728l = null;
        this.f11734l = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (!AbstractC8576l.yandex(intent != null ? intent.getAction() : null, f11723l)) {
            return 1;
        }
        amazon();
        return 1;
    }

    public abstract AbstractC16377l purchase();

    public final void subs() {
        try {
            PowerManager.WakeLock wakeLock = this.f11728l;
            if (wakeLock != null) {
                wakeLock.release();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
        try {
            WifiManager.WifiLock wifiLock = this.f11734l;
            if (wifiLock != null) {
                wifiLock.release();
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Throwable unused2) {
        }
    }
}
