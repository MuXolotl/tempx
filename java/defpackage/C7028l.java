package defpackage;

/* JADX INFO: renamed from: lؚٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7028l {
    public int amazon;
    public long billing;
    public boolean crashlytics;
    public int loadAd;
    public byte mopub;
    public long purchase;
    public Double yandex;

    public final C9947l yandex() {
        if (this.mopub == 31) {
            return new C9947l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.mopub & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.mopub & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.mopub & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.mopub & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.mopub & 16) == 0) {
            sb.append(" diskUsed");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
