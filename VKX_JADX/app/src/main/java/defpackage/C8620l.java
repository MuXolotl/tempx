package defpackage;

/* JADX INFO: renamed from: lٌؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8620l {
    public final long loadAd;
    public final long yandex;

    public C8620l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8620l)) {
            return false;
        }
        C8620l c8620l = (C8620l) obj;
        return C9735l.crashlytics(this.yandex, c8620l.yandex) && C9735l.crashlytics(this.loadAd, c8620l.loadAd);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.loadAd) + (C10882l.yandex(this.yandex) * 31);
    }

    public final String toString() {
        return AbstractC14814l.ads("SelectionColors(selectionHandleColor=", C9735l.subs(this.yandex), ", selectionBackgroundColor=", C9735l.subs(this.loadAd), ")");
    }
}
