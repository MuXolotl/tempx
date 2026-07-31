package defpackage;

/* JADX INFO: renamed from: lؗؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4589l {
    public boolean admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public int loadAd;
    public boolean mopub;
    public int purchase;
    public int yandex;

    public final void yandex(int i, int i2) {
        this.crashlytics = i;
        this.amazon = i2;
        this.admob = true;
        if (this.mopub) {
            if (i2 != Integer.MIN_VALUE) {
                this.yandex = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.loadAd = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.yandex = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.loadAd = i2;
        }
    }
}
