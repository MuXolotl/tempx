package defpackage;

import android.media.MediaRouter;

/* JADX INFO: renamed from: lًٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8301l extends MediaRouter.VolumeCallback {
    public final C14633l yandex;

    public C8301l(C14633l c14633l) {
        this.yandex = c14633l;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.yandex.getClass();
        C5211l c5211lRemoteconfig = C14633l.remoteconfig(routeInfo);
        if (c5211lRemoteconfig != null) {
            C12736l c12736l = c5211lRemoteconfig.yandex;
            c12736l.getClass();
            C9961l.loadAd();
            C17646l c17646lCrashlytics = C9961l.crashlytics();
            int iMin = Math.min(c12736l.adcel, Math.max(0, i));
            AbstractC16531l abstractC16531lBilling = c17646lCrashlytics.billing(c12736l);
            if (abstractC16531lBilling != null) {
                abstractC16531lBilling.billing(iMin);
            }
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        AbstractC16531l abstractC16531lBilling;
        this.yandex.getClass();
        C5211l c5211lRemoteconfig = C14633l.remoteconfig(routeInfo);
        if (c5211lRemoteconfig != null) {
            C12736l c12736l = c5211lRemoteconfig.yandex;
            c12736l.getClass();
            C9961l.loadAd();
            if (i == 0 || (abstractC16531lBilling = C9961l.crashlytics().billing(c12736l)) == null) {
                return;
            }
            abstractC16531lBilling.subs(i);
        }
    }
}
