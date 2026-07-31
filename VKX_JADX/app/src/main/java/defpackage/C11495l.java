package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lُۦٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11495l {
    public final long crashlytics;
    public final float loadAd;
    public final long yandex;

    public C11495l(C7751l c7751l) {
        this.yandex = c7751l.yandex;
        this.loadAd = c7751l.loadAd;
        this.crashlytics = c7751l.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11495l)) {
            return false;
        }
        C11495l c11495l = (C11495l) obj;
        return this.yandex == c11495l.yandex && this.loadAd == c11495l.loadAd && this.crashlytics == c11495l.crashlytics;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.yandex), Float.valueOf(this.loadAd), Long.valueOf(this.crashlytics));
    }
}
