package defpackage;

/* JADX INFO: renamed from: lَُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10221l {
    public String admob;
    public String amazon;
    public String billing;
    public int crashlytics;
    public AbstractC2869l firebase;
    public AbstractC5638l isPro;
    public String loadAd;
    public String mopub;
    public String purchase;
    public byte remoteconfig;
    public AbstractC5235l smaato;
    public String subs;
    public String yandex;

    public final C11091l yandex() {
        if (this.remoteconfig == 1 && this.yandex != null && this.loadAd != null && this.amazon != null && this.admob != null && this.subs != null) {
            return new C11091l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato);
        }
        StringBuilder sb = new StringBuilder();
        if (this.yandex == null) {
            sb.append(" sdkVersion");
        }
        if (this.loadAd == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.remoteconfig) == 0) {
            sb.append(" platform");
        }
        if (this.amazon == null) {
            sb.append(" installationUuid");
        }
        if (this.admob == null) {
            sb.append(" buildVersion");
        }
        if (this.subs == null) {
            sb.append(" displayVersion");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
