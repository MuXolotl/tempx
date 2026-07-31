package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.AbstractC1805l;
import defpackage.AbstractServiceC4696l;
import defpackage.C13432l;
import defpackage.C14513l;
import defpackage.C14891l;
import defpackage.Ctry;
import defpackage.RunnableC9929l;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC4696l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f483l = C14513l.applovin("SystemFgService");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C14891l f484l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f485l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public NotificationManager f486l;

    public final void crashlytics() {
        this.f486l = (NotificationManager) getApplicationContext().getSystemService("notification");
        C14891l c14891l = new C14891l(getApplicationContext());
        this.f484l = c14891l;
        if (c14891l.f29286l != null) {
            C14513l.tapsense().startapp(C14891l.f29278l, "A callback already exists.");
        } else {
            c14891l.f29286l = this;
        }
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        crashlytics();
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f484l.purchase();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f485l;
        boolean z2 = false;
        String str = f483l;
        if (z) {
            C14513l.tapsense().isVip(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f484l.purchase();
            crashlytics();
            this.f485l = false;
        }
        if (intent == null) {
            return 3;
        }
        C14891l c14891l = this.f484l;
        c14891l.getClass();
        String str2 = C14891l.f29278l;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C14513l.tapsense().isVip(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            c14891l.f29282l.yandex.execute(new RunnableC9929l(c14891l, stringExtra, z2, 20));
            c14891l.amazon(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c14891l.amazon(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            C14513l.tapsense().isVip(str2, "Stopping foreground work for " + intent);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            C13432l c13432l = c14891l.f29283l;
            AbstractC1805l.purchase(c13432l.loadAd.remoteconfig, "CancelWorkById", c13432l.amazon.yandex, new Ctry(c13432l, UUID.fromString(stringExtra2), 29));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        C14513l.tapsense().isVip(str2, "Stopping foreground service");
        SystemForegroundService systemForegroundService = c14891l.f29286l;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f485l = true;
        C14513l.tapsense().vip(str, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf(i2);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f484l.billing(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.f484l.billing(i, i2);
    }
}
