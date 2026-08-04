package defpackage;

import android.media.MediaRouter;

/* JADX INFO: renamed from: lؕ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3691l extends AbstractC16531l {
    public final MediaRouter.RouteInfo yandex;

    public C3691l(MediaRouter.RouteInfo routeInfo) {
        this.yandex = routeInfo;
    }

    @Override // defpackage.AbstractC16531l
    public final void billing(int i) {
        this.yandex.requestSetVolume(i);
    }

    @Override // defpackage.AbstractC16531l
    public final void subs(int i) {
        this.yandex.requestUpdateVolume(i);
    }
}
