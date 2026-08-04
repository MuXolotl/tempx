package defpackage;

/* JADX INFO: renamed from: lٔٛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15017l {
    public String admob;
    public long amazon;
    public boolean billing;
    public int crashlytics;
    public byte isPro;
    public String loadAd;
    public int mopub;
    public long purchase;
    public String subs;
    public int yandex;

    public final C8997l yandex() {
        String str;
        String str2;
        String str3;
        if (this.isPro == 63 && (str = this.loadAd) != null && (str2 = this.admob) != null && (str3 = this.subs) != null) {
            return new C8997l(this.yandex, str, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.isPro & 1) == 0) {
            sb.append(" arch");
        }
        if (this.loadAd == null) {
            sb.append(" model");
        }
        if ((this.isPro & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.isPro & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.isPro & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.isPro & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.isPro & 32) == 0) {
            sb.append(" state");
        }
        if (this.admob == null) {
            sb.append(" manufacturer");
        }
        if (this.subs == null) {
            sb.append(" modelClass");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
