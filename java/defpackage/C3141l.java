package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* JADX INFO: renamed from: lؚؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3141l extends MediaRouter2$TransferCallback {
    public final /* synthetic */ C3288l yandex;

    public C3141l(C3288l c3288l) {
        this.yandex = c3288l;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        C3288l c3288l = this.yandex;
        c3288l.f7027l = null;
        AbstractC16531l abstractC16531l = (AbstractC16531l) c3288l.f7033l.remove(routingController);
        if (abstractC16531l == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        C17646l c17646l = (C17646l) c3288l.f7029l.f14720l;
        if (abstractC16531l != c17646l.purchase) {
            int i = C17646l.inmobi;
            return;
        }
        C12736l c12736lCrashlytics = c17646l.crashlytics();
        if (c17646l.mopub() != c12736lCrashlytics) {
            c17646l.firebase(c12736lCrashlytics, 2, true);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        C3288l c3288l = this.yandex;
        C12736l c12736l = null;
        c3288l.f7027l = null;
        c3288l.f7033l.remove(routingController);
        if (routingController2 == c3288l.f7032l.getSystemController()) {
            C17646l c17646l = (C17646l) c3288l.f7029l.f14720l;
            C12736l c12736lCrashlytics = c17646l.crashlytics();
            if (c17646l.mopub() != c12736lCrashlytics) {
                c17646l.firebase(c12736lCrashlytics, 3, true);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = C17132l.subs(selectedRoutes.get(0)).getId();
        c3288l.f7033l.put(routingController2, new C1636l(routingController2, id));
        C17646l c17646l2 = (C17646l) c3288l.f7029l.f14720l;
        for (C12736l c12736l2 : c17646l2.subs) {
            if (c12736l2.yandex() == c17646l2.ads && TextUtils.equals(id, c12736l2.loadAd)) {
                c12736l = c12736l2;
                break;
            }
        }
        if (c12736l == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            c17646l2.firebase(c12736l, 3, true);
        }
        c3288l.firebase(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.yandex.f7027l = null;
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
