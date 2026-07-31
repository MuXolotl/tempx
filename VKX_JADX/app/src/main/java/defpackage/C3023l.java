package defpackage;

import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؔۥؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3023l implements InterfaceC11167l {
    public final /* synthetic */ AppActivity yandex;

    public C3023l(AppActivity appActivity) {
        this.yandex = appActivity;
    }

    @Override // defpackage.InterfaceC11167l
    public final void yandex() {
        AppActivity appActivity = this.yandex;
        AbstractC10242l abstractC10242lRemoteconfig = appActivity.remoteconfig();
        abstractC10242lRemoteconfig.amazon();
        ((C18396l) appActivity.f28688l.f26580l).tapsense("androidx:appcompat");
        abstractC10242lRemoteconfig.mopub();
    }
}
