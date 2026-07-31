package defpackage;

import android.graphics.LightingColorFilter;

/* JADX INFO: renamed from: lؑؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0030l extends AbstractC8939l {
    public final long crashlytics;
    public final long loadAd;

    public C0030l(long j, long j2) {
        super(new LightingColorFilter(AbstractC12953l.startapp(j), AbstractC12953l.startapp(j2)));
        this.loadAd = j;
        this.crashlytics = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0030l)) {
            return false;
        }
        C0030l c0030l = (C0030l) obj;
        return C9735l.crashlytics(this.loadAd, c0030l.loadAd) && C9735l.crashlytics(this.crashlytics, c0030l.crashlytics);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.crashlytics) + (C10882l.yandex(this.loadAd) * 31);
    }

    public final String toString() {
        return AbstractC14814l.ads("LightingColorFilter(multiply=", C9735l.subs(this.loadAd), ", add=", C9735l.subs(this.crashlytics), ")");
    }
}
