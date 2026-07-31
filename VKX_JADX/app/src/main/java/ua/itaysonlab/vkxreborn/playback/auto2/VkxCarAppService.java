package ua.itaysonlab.vkxreborn.playback.auto2;

import androidx.car.app.CarAppService;
import defpackage.AbstractC12179l;
import defpackage.C2415l;
import defpackage.C4444l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class VkxCarAppService extends CarAppService {
    @Override // androidx.car.app.CarAppService
    public final AbstractC12179l loadAd() {
        return new C2415l();
    }

    @Override // androidx.car.app.CarAppService
    public final C4444l yandex() {
        return C4444l.crashlytics;
    }
}
