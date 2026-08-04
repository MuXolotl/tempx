package defpackage;

/* JADX INFO: renamed from: lٌٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1859l {
    public int amazon;
    public int crashlytics;
    public long loadAd;
    public final int yandex;

    public AbstractC1859l(AbstractC1859l abstractC1859l) {
        this.yandex = abstractC1859l.crashlytics;
        this.loadAd = abstractC1859l.loadAd;
        this.crashlytics = abstractC1859l.yandex;
        this.amazon = abstractC1859l.amazon;
    }

    public byte[] yandex() {
        byte[] bArr = new byte[32];
        AbstractC10000l.isPro(this.yandex, 0, bArr);
        AbstractC10000l.Signature(this.loadAd, bArr, 4);
        AbstractC10000l.isPro(this.crashlytics, 12, bArr);
        AbstractC10000l.isPro(this.amazon, 28, bArr);
        return bArr;
    }

    public AbstractC1859l(int i) {
        this.crashlytics = 0;
        this.loadAd = 0L;
        this.amazon = 0;
        this.yandex = i;
    }
}
