package defpackage;

import android.app.Activity;

/* JADX INFO: renamed from: lٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9353l implements InterfaceC13914l {
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ Activity yandex;

    public C9353l(Activity activity, int i) {
        this.yandex = activity;
        this.loadAd = i;
    }

    @Override // defpackage.InterfaceC13914l
    public final void yandex() {
        this.yandex.setRequestedOrientation(this.loadAd);
    }
}
