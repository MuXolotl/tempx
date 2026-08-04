package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٖٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16498l extends AbstractC5906l {
    public final List crashlytics;
    public final int loadAd;
    public final String yandex;

    public C16498l(int i, String str, List list) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5906l) {
            C16498l c16498l = (C16498l) ((AbstractC5906l) obj);
            if (this.yandex.equals(c16498l.yandex) && this.loadAd == c16498l.loadAd && this.crashlytics.equals(c16498l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.yandex + ", importance=" + this.loadAd + ", frames=" + this.crashlytics + "}";
    }
}
