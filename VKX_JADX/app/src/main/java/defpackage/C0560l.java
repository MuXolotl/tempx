package defpackage;

/* JADX INFO: renamed from: lؑۙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0560l {
    public final int amazon;
    public final float crashlytics;
    public final float loadAd;
    public final long purchase;
    public final float yandex;

    public C0560l(C0005l c0005l) {
        float f = c0005l.crashlytics;
        float f2 = c0005l.amazon;
        float f3 = c0005l.loadAd;
        int i = c0005l.yandex;
        long j = c0005l.purchase;
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = i;
        this.purchase = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.yandex);
        sb.append(", touchY=");
        sb.append(this.loadAd);
        sb.append(", progress=");
        sb.append(this.crashlytics);
        sb.append(", swipeEdge=");
        sb.append(this.amazon);
        sb.append(", frameTimeMillis=");
        return AbstractC12900l.smaato(sb, this.purchase, ')');
    }
}
