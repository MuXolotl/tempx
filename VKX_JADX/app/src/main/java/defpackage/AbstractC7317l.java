package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7317l {
    public final C8688l amazon = new C8688l(new C1018l(this, 0));
    public final List crashlytics;
    public final String loadAd;
    public final String yandex;

    public AbstractC7317l(String str, String str2, List list) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = list;
    }

    public final C6142l yandex() {
        return (C6142l) this.amazon.getValue();
    }
}
