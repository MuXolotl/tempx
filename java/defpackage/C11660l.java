package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11660l {
    public static final String amazon;
    public static final String billing;
    public static final String purchase;
    public final String crashlytics;
    public final long loadAd;
    public final long yandex;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
    }

    public C11660l(String str, long j, long j2) {
        AbstractC12442l.admob((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.yandex = j == -9223372036854775807L ? 0L : j;
        this.loadAd = j2;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11660l.class == obj.getClass()) {
            C11660l c11660l = (C11660l) obj;
            if (this.yandex == c11660l.yandex && this.loadAd == c11660l.loadAd && Objects.equals(this.crashlytics, c11660l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.yandex), Long.valueOf(this.loadAd), this.crashlytics);
    }
}
