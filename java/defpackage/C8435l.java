package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lًۧۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8435l extends MediaRouter.Callback {
    public final C14633l yandex;

    public C8435l(C14633l c14633l) {
        this.yandex = c14633l;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C14633l c14633l = this.yandex;
        if (c14633l.admob(routeInfo)) {
            c14633l.ads();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iSubs;
        C14633l c14633l = this.yandex;
        c14633l.getClass();
        if (C14633l.remoteconfig(routeInfo) != null || (iSubs = c14633l.subs(routeInfo)) < 0) {
            return;
        }
        C4152l c4152l = (C4152l) c14633l.f28643l.get(iSubs);
        C10038l c10038l = new C10038l(c4152l.loadAd, c14633l.smaato(c4152l.yandex));
        c14633l.vip(c4152l, c10038l);
        c4152l.crashlytics = c10038l.m2840class();
        c14633l.ads();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.yandex.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C14633l c14633l = this.yandex;
        int iSubs = c14633l.subs(routeInfo);
        if (iSubs >= 0) {
            C4152l c4152l = (C4152l) c14633l.f28643l.get(iSubs);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != c4152l.crashlytics.yandex.getInt("presentationDisplayId", -1)) {
                C13187l c13187l = c4152l.crashlytics;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (c13187l == null) {
                    C8339l.metrica("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(c13187l.yandex);
                ArrayList arrayListCrashlytics = c13187l.crashlytics();
                ArrayList arrayListLoadAd = c13187l.loadAd();
                HashSet hashSetYandex = c13187l.yandex();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListLoadAd));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListCrashlytics));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetYandex));
                c4152l.crashlytics = new C13187l(bundle);
                c14633l.ads();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iSubs;
        C14633l c14633l = this.yandex;
        c14633l.getClass();
        if (C14633l.remoteconfig(routeInfo) != null || (iSubs = c14633l.subs(routeInfo)) < 0) {
            return;
        }
        c14633l.f28643l.remove(iSubs);
        c14633l.ads();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        C12736l c12736l;
        C14633l c14633l = this.yandex;
        if (routeInfo != c14633l.f28644l.getSelectedRoute(8388611)) {
            return;
        }
        C5211l c5211lRemoteconfig = C14633l.remoteconfig(routeInfo);
        if (c5211lRemoteconfig != null) {
            c5211lRemoteconfig.yandex.mopub(false);
            return;
        }
        int iSubs = c14633l.subs(routeInfo);
        if (iSubs >= 0) {
            C4152l c4152l = (C4152l) c14633l.f28643l.get(iSubs);
            C17646l c17646l = c14633l.f28647l;
            String str = c4152l.loadAd;
            c17646l.yandex.removeMessages(262);
            C12545l c12545lAmazon = c17646l.amazon(c17646l.subscription);
            if (c12545lAmazon != null) {
                Iterator it = c12545lAmazon.loadAd.iterator();
                do {
                    if (!it.hasNext()) {
                        c12736l = null;
                        break;
                    }
                    c12736l = (C12736l) it.next();
                } while (!c12736l.loadAd.equals(str));
                if (c12736l != null) {
                    c12736l.mopub(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.yandex.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.yandex.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iSubs;
        C14633l c14633l = this.yandex;
        c14633l.getClass();
        if (C14633l.remoteconfig(routeInfo) != null || (iSubs = c14633l.subs(routeInfo)) < 0) {
            return;
        }
        C4152l c4152l = (C4152l) c14633l.f28643l.get(iSubs);
        int volume = routeInfo.getVolume();
        if (volume != c4152l.crashlytics.yandex.getInt("volume")) {
            C13187l c13187l = c4152l.crashlytics;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (c13187l == null) {
                C8339l.metrica("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(c13187l.yandex);
            ArrayList arrayListCrashlytics = c13187l.crashlytics();
            ArrayList arrayListLoadAd = c13187l.loadAd();
            HashSet hashSetYandex = c13187l.yandex();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListLoadAd));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListCrashlytics));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetYandex));
            c4152l.crashlytics = new C13187l(bundle);
            c14633l.ads();
        }
    }
}
