package androidx.car.app.utils;

import defpackage.InterfaceC18325l;
import defpackage.InterfaceC3177l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class purchase implements InterfaceC18325l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f332l;

    public purchase(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub) {
        this.f332l = remoteUtils$SurfaceCallbackStub;
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        RemoteUtils$SurfaceCallbackStub.access$002(this.f332l, null);
        interfaceC3177l.loadAd().loadAd(this);
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStart(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStop(InterfaceC3177l interfaceC3177l) {
    }
}
