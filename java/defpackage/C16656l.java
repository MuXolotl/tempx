package defpackage;

import android.util.Log;

/* JADX INFO: renamed from: lٖۜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16656l implements InterfaceC0930l {
    public final C11879l yandex = AbstractC1805l.loadAd(0);

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        this.yandex.yandex = 0;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "reset: videoUsage = 0");
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
    }
}
