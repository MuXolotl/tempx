package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9896l {
    public final long crashlytics;
    public final int loadAd;
    public final AbstractC1186l yandex;

    public C9896l(int i, long j, List list) {
        this.yandex = AbstractC1186l.Signature(list);
        this.loadAd = i;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9896l)) {
            return false;
        }
        C9896l c9896l = (C9896l) obj;
        return this.yandex.equals(c9896l.yandex) && this.loadAd == c9896l.loadAd && this.crashlytics == c9896l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC3105l.billing(this.crashlytics) + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }
}
