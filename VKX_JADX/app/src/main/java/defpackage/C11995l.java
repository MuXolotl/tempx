package defpackage;

/* JADX INFO: renamed from: lِِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11995l {
    public byte admob;
    public String amazon;
    public long billing;
    public String crashlytics;
    public int loadAd;
    public String mopub;
    public long purchase;
    public String yandex;

    public final C16745l yandex() {
        if (this.admob == 3 && this.loadAd != 0) {
            return new C16745l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub);
        }
        StringBuilder sb = new StringBuilder();
        if (this.loadAd == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.admob & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.admob & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
