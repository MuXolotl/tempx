package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: renamed from: lُؒۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1327l {
    public final int crashlytics;
    public final long loadAd;
    public final long yandex;

    public C1327l(int i, long j, long j2) {
        AbstractC12442l.admob(j < j2);
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1327l.class == obj.getClass()) {
            C1327l c1327l = (C1327l) obj;
            if (this.yandex == c1327l.yandex && this.loadAd == c1327l.loadAd && this.crashlytics == c1327l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.yandex), Long.valueOf(this.loadAd), Integer.valueOf(this.crashlytics));
    }

    public final String toString() {
        String str = AbstractC15323l.yandex;
        Locale locale = Locale.US;
        StringBuilder sbSignature = AbstractC0653l.Signature(this.yandex, "Segment: startTimeMs=", ", endTimeMs=");
        sbSignature.append(this.loadAd);
        sbSignature.append(", speedDivisor=");
        sbSignature.append(this.crashlytics);
        return sbSignature.toString();
    }
}
