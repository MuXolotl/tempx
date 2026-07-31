package androidx.car.app;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.HandlerThread;
import androidx.car.app.utils.billing;
import defpackage.C10533l;
import defpackage.C5268l;
import defpackage.InterfaceC10744l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class loadAd implements InterfaceC10744l {
    public final C5268l amazon;
    public final isPro crashlytics;
    public final IAppManager.Stub loadAd;
    public final subs yandex;
    public final HandlerThread billing = new HandlerThread("LocationUpdateThread");
    public final C10533l purchase = new LocationListener() { // from class: lَؘۙ
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            billing.amazon("sendLocation", new C17706l(this.yandex.crashlytics, "sendLocation", new C2683l(4, location), 5));
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [lَؘۙ] */
    public loadAd(subs subsVar, isPro ispro, C5268l c5268l) {
        this.yandex = subsVar;
        this.crashlytics = ispro;
        this.amazon = c5268l;
        this.loadAd = new AppManager$1(this, subsVar);
    }
}
