package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* JADX INFO: renamed from: lَؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1764l extends MediaRouter2$RouteCallback {
    public final /* synthetic */ C3288l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C1764l(C3288l c3288l, int i) {
        this.yandex = i;
        this.loadAd = c3288l;
    }

    public void onRoutesAdded(List list) {
        switch (this.yandex) {
            case 0:
                this.loadAd.isPro();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.yandex) {
            case 0:
                this.loadAd.isPro();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.yandex) {
            case 0:
                this.loadAd.isPro();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.yandex) {
            case 1:
                this.loadAd.isPro();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
