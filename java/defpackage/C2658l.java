package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٖؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2658l implements InterfaceC2406l {
    public boolean crashlytics;
    public final Object loadAd = new Object();
    public final InterfaceC2406l yandex;

    public C2658l(InterfaceC2406l interfaceC2406l) {
        this.yandex = interfaceC2406l;
    }

    @Override // defpackage.InterfaceC2406l
    public final void clear() {
        yandex();
    }

    public final void loadAd() {
        synchronized (this.loadAd) {
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void yandex() {
        synchronized (this.loadAd) {
            try {
                if (this.crashlytics) {
                    InterfaceC2406l interfaceC2406l = this.yandex;
                    if (interfaceC2406l != null) {
                        interfaceC2406l.clear();
                    } else {
                        AbstractC5088l.crashlytics("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC5088l.tapsense("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.crashlytics = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
