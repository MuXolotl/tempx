package defpackage;

/* JADX INFO: renamed from: lِؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1514l {
    public final int crashlytics;
    public final String loadAd;
    public final C2312l yandex;

    public AbstractC1514l(C2312l c2312l, String str, int i) {
        this.yandex = c2312l;
        this.loadAd = str;
        this.crashlytics = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append('.');
        return AbstractC2812l.tapsense(sb, this.loadAd, 'N');
    }

    public final C3498l yandex(int i) {
        return C3498l.purchase(this.loadAd + i);
    }
}
