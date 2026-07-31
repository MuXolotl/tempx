package androidx.car.app.utils;

import defpackage.C15858l;
import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yandex implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15858l f333l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f334l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f335l;

    public /* synthetic */ yandex(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, C15858l c15858l, int i) {
        this.f335l = i;
        this.f334l = remoteUtils$SurfaceCallbackStub;
        this.f333l = c15858l;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f335l;
        C15858l c15858l = this.f333l;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.f334l;
        switch (i) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(c15858l);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(c15858l);
        }
    }
}
