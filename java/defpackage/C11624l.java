package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: lِؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11624l implements InterfaceC9974l {
    public final ConnectivityManager crashlytics;
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C11624l(ConnectivityManager connectivityManager, int i) {
        this.loadAd = i;
        this.crashlytics = connectivityManager;
    }

    @Override // defpackage.InterfaceC9974l
    public final boolean yandex() {
        int i = this.loadAd;
        ConnectivityManager connectivityManager = this.crashlytics;
        switch (i) {
            case 0:
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            default:
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12);
        }
    }
}
