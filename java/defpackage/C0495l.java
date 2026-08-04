package defpackage;

/* JADX INFO: renamed from: lٟؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0495l {
    public AbstractC3394l amazon;
    public AbstractC17409l billing;
    public AbstractC5909l crashlytics;
    public String loadAd;
    public byte mopub;
    public AbstractC3802l purchase;
    public long yandex;

    public final C17358l yandex() {
        String str;
        AbstractC5909l abstractC5909l;
        AbstractC3394l abstractC3394l;
        if (this.mopub == 1 && (str = this.loadAd) != null && (abstractC5909l = this.crashlytics) != null && (abstractC3394l = this.amazon) != null) {
            return new C17358l(this.yandex, str, abstractC5909l, abstractC3394l, this.purchase, this.billing);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.mopub) == 0) {
            sb.append(" timestamp");
        }
        if (this.loadAd == null) {
            sb.append(" type");
        }
        if (this.crashlytics == null) {
            sb.append(" app");
        }
        if (this.amazon == null) {
            sb.append(" device");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
