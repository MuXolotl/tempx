package defpackage;

/* JADX INFO: renamed from: lِٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16647l {
    public boolean amazon;
    public int crashlytics;
    public int loadAd;
    public byte purchase;
    public String yandex;

    public final C4702l yandex() {
        String str;
        if (this.purchase == 7 && (str = this.yandex) != null) {
            return new C4702l(this.loadAd, this.crashlytics, str, this.amazon);
        }
        StringBuilder sb = new StringBuilder();
        if (this.yandex == null) {
            sb.append(" processName");
        }
        if ((this.purchase & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.purchase & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.purchase & 4) == 0) {
            sb.append(" defaultProcess");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
