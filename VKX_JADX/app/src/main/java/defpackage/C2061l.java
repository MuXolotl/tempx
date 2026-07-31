package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* JADX INFO: renamed from: lؓۘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2061l extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2061l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C14677l c14677l = (C14677l) obj;
                c14677l.f28725l.m787catch(Boolean.valueOf(C14677l.crashlytics(c14677l.f28724l)));
                break;
            default:
                ((C3288l) obj).firebase(routingController);
                break;
        }
    }
}
