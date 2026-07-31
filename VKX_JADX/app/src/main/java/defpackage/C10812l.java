package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Unit;

/* JADX INFO: renamed from: lُُؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10812l extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C2397l loadAd;
    public final /* synthetic */ C7026l yandex;

    public C10812l(C7026l c7026l, C2397l c2397l) {
        this.yandex = c7026l;
        this.loadAd = c2397l;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((ConnectivityManager) this.yandex.f14720l).unregisterNetworkCallback(this);
        C2397l c2397l = this.loadAd;
        if (c2397l.premium()) {
            return;
        }
        c2397l.subs(Unit.INSTANCE);
    }
}
