package androidx.car.app.utils;

import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class loadAd implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f328l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f329l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f330l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ float f331l;

    public /* synthetic */ loadAd(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, int i) {
        this.f330l = i;
        this.f329l = remoteUtils$SurfaceCallbackStub;
        this.f328l = f;
        this.f331l = f2;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f330l;
        float f = this.f331l;
        float f2 = this.f328l;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.f329l;
        switch (i) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onClick$7(f2, f);
            case 1:
                return remoteUtils$SurfaceCallbackStub.lambda$onScroll$4(f2, f);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onFling$5(f2, f);
        }
    }
}
