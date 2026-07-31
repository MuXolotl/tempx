package defpackage;

/* JADX INFO: renamed from: lؘ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5761l {
    public final C9516l yandex;
    public static final C9228l loadAd = new C9228l();
    public static final String crashlytics = yandex("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String amazon = yandex("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final C18725l purchase = new C18725l(5);

    public C5761l(C9516l c9516l) {
        this.yandex = c9516l;
    }

    public static String yandex(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C8339l.metrica("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
