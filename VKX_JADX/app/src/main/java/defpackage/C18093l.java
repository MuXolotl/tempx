package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lۣ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18093l {
    public final int crashlytics;
    public final LinkedHashMap loadAd;
    public final LinkedHashMap yandex;

    public C18093l(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.yandex = linkedHashMap;
        this.loadAd = linkedHashMap2;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18093l)) {
            return false;
        }
        C18093l c18093l = (C18093l) obj;
        return this.yandex.equals(c18093l.yandex) && this.loadAd.equals(c18093l.loadAd) && this.crashlytics == c18093l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC15560l.metrica(this.loadAd, this.yandex.hashCode() * 31, 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.yandex);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.loadAd);
        sb.append(", maxSupportedFrameRate=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
