package defpackage;

/* JADX INFO: renamed from: lَّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0960l {
    public long amazon;
    public String crashlytics;
    public String loadAd;
    public byte purchase;
    public C9895l yandex;

    public final C12069l yandex() {
        C9895l c9895l;
        String str;
        String str2;
        if (this.purchase == 1 && (c9895l = this.yandex) != null && (str = this.loadAd) != null && (str2 = this.crashlytics) != null) {
            return new C12069l(c9895l, str, str2, this.amazon);
        }
        StringBuilder sb = new StringBuilder();
        if (this.yandex == null) {
            sb.append(" rolloutVariant");
        }
        if (this.loadAd == null) {
            sb.append(" parameterKey");
        }
        if (this.crashlytics == null) {
            sb.append(" parameterValue");
        }
        if ((this.purchase & 1) == 0) {
            sb.append(" templateVersion");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
