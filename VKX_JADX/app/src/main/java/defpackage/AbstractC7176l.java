package defpackage;

/* JADX INFO: renamed from: lَؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7176l {
    public static final C6466l loadAd;
    public static final String[] yandex = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    static {
        C6466l c6466l;
        for (int i = 0; i < 2; i++) {
            c6466l = null;
            try {
                c6466l = (C6466l) Class.forName(yandex[i]).asSubclass(C6466l.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (c6466l != null) {
                loadAd = c6466l;
            }
        }
        c6466l = new C6466l();
        loadAd = c6466l;
    }
}
