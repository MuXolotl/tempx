package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓۡۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2185l extends AbstractC5729l {
    public final C11760l amazon;
    public final C18548l crashlytics;
    public final List loadAd;
    public final C17266l yandex;

    public C2185l(C17266l c17266l, List list, C18548l c18548l, C11760l c11760l) {
        this.yandex = c17266l;
        this.loadAd = list;
        this.crashlytics = c18548l;
        this.amazon = c11760l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2185l) {
            C2185l c2185l = (C2185l) obj;
            return this.yandex == c2185l.yandex && this.loadAd.equals(c2185l.loadAd) && this.crashlytics == c2185l.crashlytics && this.amazon == c2185l.amazon;
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((((this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.yandex + ", sharedCameraIds=" + this.loadAd + ", graphListener=" + this.crashlytics + ", isPrewarm=false, isForegroundObserver=" + this.amazon + ')';
    }
}
