package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7652l {
    public final String crashlytics;
    public final ArrayList loadAd;
    public final C2757l yandex;

    public C7652l(C2757l c2757l, ArrayList arrayList) {
        this.yandex = c2757l;
        this.loadAd = arrayList;
        String str = c2757l.f5966extends;
        this.crashlytics = str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7652l)) {
            return false;
        }
        C7652l c7652l = (C7652l) obj;
        return AbstractC8576l.yandex(this.yandex, c7652l.yandex) && this.loadAd.equals(c7652l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "DuplicateEntry(mainTrack=" + this.yandex + ", duplicates=" + this.loadAd + ')';
    }
}
