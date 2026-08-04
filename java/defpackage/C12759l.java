package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lّٟٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12759l {
    public final boolean crashlytics;
    public final List loadAd;
    public final LinkedHashMap yandex;

    public C12759l(LinkedHashMap linkedHashMap, List list, boolean z) {
        this.yandex = linkedHashMap;
        this.loadAd = list;
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12759l)) {
            return false;
        }
        C12759l c12759l = (C12759l) obj;
        return this.yandex.equals(c12759l.yandex) && AbstractC8576l.yandex(this.loadAd, c12759l.loadAd) && this.crashlytics == c12759l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceResolveResult(tracks=");
        sb.append(this.yandex);
        sb.append(", queue=");
        sb.append(this.loadAd);
        sb.append(", shouldSpawnIdLoad=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}
