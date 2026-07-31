package defpackage;

/* JADX INFO: renamed from: lؘۥؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6082l implements InterfaceC0330l {
    public static final C10485l yandex = new C10485l();

    public abstract String amazon();

    public abstract int crashlytics();

    public abstract String loadAd();

    public String purchase() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(yandex());
        sb.append(", method=");
        sb.append(loadAd());
        sb.append(", line=");
        sb.append(crashlytics());
        if (amazon() != null) {
            sb.append(", file=");
            sb.append(amazon());
        }
        if (purchase() != null) {
            sb.append(", filePath=");
            sb.append(purchase());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract String yandex();
}
