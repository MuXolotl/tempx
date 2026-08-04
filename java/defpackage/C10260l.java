package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: renamed from: lَْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10260l implements InterfaceC4117l {
    public final ConnectivityManager yandex;

    public C10260l(ConnectivityManager connectivityManager) {
        this.yandex = connectivityManager;
    }

    @Override // defpackage.InterfaceC4117l
    public final boolean crashlytics(C7718l c7718l) {
        return (c7718l.isPro.yandex() == null && c7718l.isPro.yandex == 1) ? false : true;
    }

    @Override // defpackage.InterfaceC4117l
    public final C4394l loadAd(C13152l c13152l) {
        return AbstractC0622l.amazon(new C17949l(c13152l, this, null, 3));
    }

    @Override // defpackage.InterfaceC4117l
    public final boolean yandex(C7718l c7718l) {
        if (!crashlytics(c7718l)) {
            return false;
        }
        C8339l.smaato("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }
}
