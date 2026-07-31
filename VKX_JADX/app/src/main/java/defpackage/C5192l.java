package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؗ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5192l {
    public static final HashMap crashlytics = new HashMap();
    public final InterfaceC1388l loadAd;
    public final String yandex;

    public C5192l(InterfaceC1388l interfaceC1388l, String str) {
        this.yandex = str;
        this.loadAd = interfaceC1388l;
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("Metadata.Key("), this.yandex, ')');
    }
}
