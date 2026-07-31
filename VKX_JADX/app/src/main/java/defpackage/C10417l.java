package defpackage;

/* JADX INFO: renamed from: lَٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10417l {
    public final long crashlytics;
    public final long loadAd;
    public final InterfaceC8097l yandex;

    public C10417l(InterfaceC8097l interfaceC8097l, long j, long j2) {
        this.yandex = interfaceC8097l;
        this.loadAd = j;
        this.crashlytics = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10417l)) {
            return false;
        }
        C10417l c10417l = (C10417l) obj;
        return AbstractC8576l.yandex(this.yandex, c10417l.yandex) && C1187l.loadAd(this.loadAd, c10417l.loadAd) && Float.compare(1.0f, 1.0f) == 0 && C1187l.loadAd(this.crashlytics, c10417l.crashlytics) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(0.0f) + ((C1187l.mopub(this.crashlytics) + AbstractC9029l.mopub((C1187l.mopub(this.loadAd) + (this.yandex.hashCode() * 31)) * 31, 1.0f, 31)) * 31)) * 31) + 1237;
    }

    public final String toString() {
        String strFirebase = C1187l.firebase(this.loadAd);
        String strFirebase2 = C1187l.firebase(this.crashlytics);
        StringBuilder sb = new StringBuilder("LinearGradient(easing=");
        sb.append(this.yandex);
        sb.append(", start=");
        sb.append(strFirebase);
        sb.append(", startIntensity=1.0, end=");
        return AbstractC0653l.ads(sb, strFirebase2, ", endIntensity=0.0, preferPerformance=false)");
    }
}
