package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lْٟؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0493l {
    public final String crashlytics;
    public final String loadAd;
    public final C5978l yandex;

    public C0493l(C5978l c5978l, String str, String str2) {
        C12984l c12984lYandex = c5978l.yandex();
        c12984lYandex.yandex = null;
        c12984lYandex.firebase = null;
        this.yandex = new C5978l(c12984lYandex);
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493l)) {
            return false;
        }
        C0493l c0493l = (C0493l) obj;
        return Objects.equals(this.yandex, c0493l.yandex) && Objects.equals(this.loadAd, c0493l.loadAd) && Objects.equals(this.crashlytics, c0493l.crashlytics);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics);
    }
}
