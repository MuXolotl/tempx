package androidx.car.app.utils;

import android.graphics.Rect;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class crashlytics implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Rect f325l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f326l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f327l;

    public /* synthetic */ crashlytics(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i) {
        this.f327l = i;
        this.f326l = remoteUtils$SurfaceCallbackStub;
        this.f325l = rect;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f327l;
        Rect rect = this.f325l;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.f326l;
        switch (i) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onVisibleAreaChanged$1(rect);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onStableAreaChanged$2(rect);
        }
    }
}
