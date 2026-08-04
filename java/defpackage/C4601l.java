package defpackage;

/* JADX INFO: renamed from: lؗؒۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4601l {
    public final long loadAd;
    public final long yandex;

    public C4601l(long j, long j2) {
        if (j2 == 0) {
            this.yandex = 0L;
            this.loadAd = 1L;
        } else {
            this.yandex = j;
            this.loadAd = j2;
        }
    }

    public final String toString() {
        return this.yandex + "/" + this.loadAd;
    }
}
