package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lٖٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16430l implements InterfaceC6697l {
    public final /* synthetic */ int crashlytics;

    @Override // defpackage.InterfaceC6697l
    public final void yandex(View view, int i) {
        switch (this.crashlytics) {
            case 0:
                if (view != null) {
                    view.setOutlineSpotShadowColor(i);
                }
                break;
            default:
                if (view != null) {
                    view.setOutlineAmbientShadowColor(i);
                }
                break;
        }
    }
}
