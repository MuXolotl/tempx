package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.LocationManager;
import defpackage.C17568l;
import defpackage.C2683l;
import defpackage.C5268l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class AppManager$1 extends IAppManager.Stub {
    final /* synthetic */ loadAd this$0;
    final /* synthetic */ subs val$carContext;

    public AppManager$1(loadAd loadad, subs subsVar) {
        this.this$0 = loadad;
        this.val$carContext = subsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$onBackPressed$0(subs subsVar) {
        subsVar.yandex.loadAd().yandex();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$startLocationUpdates$1(subs subsVar) {
        loadAd loadad = (loadAd) subsVar.loadAd(loadAd.class);
        ((LocationManager) loadad.yandex.getSystemService("location")).removeUpdates(loadad.purchase);
        ((LocationManager) loadad.yandex.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, loadad.purchase, loadad.billing.getLooper());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$stopLocationUpdates$2(subs subsVar) {
        loadAd loadad = (loadAd) subsVar.loadAd(loadAd.class);
        ((LocationManager) loadad.yandex.getSystemService("location")).removeUpdates(loadad.purchase);
        return null;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        C5268l c5268l = this.this$0.amazon;
        C17568l c17568l = (C17568l) this.val$carContext.loadAd(C17568l.class);
        Objects.requireNonNull(c17568l);
        androidx.car.app.utils.billing.loadAd(c5268l, iOnDoneCallback, "getTemplate", new C2683l(5, c17568l));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(this.this$0.amazon, iOnDoneCallback, "onBackPressed", new yandex(this.val$carContext, 0));
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        PackageManager packageManager = this.val$carContext.getPackageManager();
        boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
        if (z && z2) {
            androidx.car.app.utils.billing.billing(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
        }
        androidx.car.app.utils.billing.loadAd(this.this$0.amazon, iOnDoneCallback, "startLocationUpdates", new yandex(this.val$carContext, 2));
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.billing.loadAd(this.this$0.amazon, iOnDoneCallback, "stopLocationUpdates", new yandex(this.val$carContext, 1));
    }
}
