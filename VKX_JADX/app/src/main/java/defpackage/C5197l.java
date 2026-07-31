package defpackage;

/* JADX INFO: renamed from: lؚؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5197l {
    public static int firebase;
    public static final C4269l smaato = new C4269l(3);
    public final int admob;
    public final float amazon;
    public final C4623l billing;
    public final float crashlytics;
    public final int isPro;
    public final float loadAd;
    public final long mopub;
    public final float purchase;
    public final boolean subs;
    public final String yandex;

    public C5197l(String str, float f, float f2, float f3, float f4, C4623l c4623l, long j, int i, boolean z) {
        int i2;
        synchronized (smaato) {
            i2 = firebase;
            firebase = i2 + 1;
        }
        this.yandex = str;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = f4;
        this.billing = c4623l;
        this.mopub = j;
        this.admob = i;
        this.subs = z;
        this.isPro = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5197l)) {
            return false;
        }
        C5197l c5197l = (C5197l) obj;
        return AbstractC8576l.yandex(this.yandex, c5197l.yandex) && C14467l.loadAd(this.loadAd, c5197l.loadAd) && C14467l.loadAd(this.crashlytics, c5197l.crashlytics) && this.amazon == c5197l.amazon && this.purchase == c5197l.purchase && this.billing.equals(c5197l.billing) && C9735l.crashlytics(this.mopub, c5197l.mopub) && this.admob == c5197l.admob && this.subs == c5197l.subs;
    }

    public final int hashCode() {
        int iHashCode = (this.billing.hashCode() + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(this.yandex.hashCode() * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31)) * 31;
        int i = C9735l.smaato;
        return ((AbstractC1757l.m1038strictfp(iHashCode, this.mopub, 31) + this.admob) * 31) + (this.subs ? 1231 : 1237);
    }
}
