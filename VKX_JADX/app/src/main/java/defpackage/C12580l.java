package defpackage;

/* JADX INFO: renamed from: lّْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12580l {
    public long amazon;
    public byte billing;
    public String crashlytics;
    public String loadAd;
    public int purchase;
    public long yandex;

    public final C7422l yandex() {
        String str;
        if (this.billing == 7 && (str = this.loadAd) != null) {
            return new C7422l(this.yandex, str, this.crashlytics, this.amazon, this.purchase);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.billing & 1) == 0) {
            sb.append(" pc");
        }
        if (this.loadAd == null) {
            sb.append(" symbol");
        }
        if ((this.billing & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.billing & 4) == 0) {
            sb.append(" importance");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
