package defpackage;

/* JADX INFO: renamed from: import, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class Cimport {
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public Cimport(int i, int i2, String str) {
        this.loadAd = i;
        this.crashlytics = i2;
        this.yandex = str;
    }

    public Cimport(int i, int i2, int i3, long j, String str) {
        this.yandex = str;
        this.crashlytics = i;
        this.loadAd = i2;
    }
}
