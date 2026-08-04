package defpackage;

/* JADX INFO: renamed from: lَْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10028l {
    public boolean amazon;
    public String crashlytics;
    public String loadAd;
    public byte purchase;
    public int yandex;

    public final C1006l yandex() {
        String str;
        String str2;
        if (this.purchase == 3 && (str = this.loadAd) != null && (str2 = this.crashlytics) != null) {
            return new C1006l(this.yandex, str, str2, this.amazon);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.purchase & 1) == 0) {
            sb.append(" platform");
        }
        if (this.loadAd == null) {
            sb.append(" version");
        }
        if (this.crashlytics == null) {
            sb.append(" buildVersion");
        }
        if ((this.purchase & 2) == 0) {
            sb.append(" jailbroken");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
