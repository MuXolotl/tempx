package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؕٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3508l {
    public static final String amazon;
    public static final C3508l crashlytics = new C3508l(false, false);
    public static final String purchase;
    public final boolean loadAd;
    public final boolean yandex;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
    }

    public C3508l(boolean z, boolean z2) {
        this.yandex = z;
        this.loadAd = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3508l)) {
            return false;
        }
        C3508l c3508l = (C3508l) obj;
        return this.yandex == c3508l.yandex && this.loadAd == c3508l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.yandex), Boolean.valueOf(this.loadAd));
    }
}
