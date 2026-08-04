package defpackage;

import java.io.PrintStream;

/* JADX INFO: renamed from: lَۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1768l {
    public static final int loadAd;
    public static final int yandex;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property != null && !property.isEmpty()) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    i = 1;
                    break;
                } else {
                    if (strArr[i3].equalsIgnoreCase(property)) {
                        i = 2;
                        break;
                    }
                    i3++;
                }
            }
        } else {
            i = 1;
            break;
        }
        yandex = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        loadAd = i2;
    }

    public static final void crashlytics(String str) {
        if (AbstractC5020l.inmobi(3) >= AbstractC5020l.inmobi(loadAd)) {
            loadAd().println("SLF4J(W): ".concat(str));
        }
    }

    public static PrintStream loadAd() {
        return AbstractC5020l.inmobi(yandex) != 1 ? System.err : System.out;
    }

    public static final void yandex(String str, Throwable th) {
        loadAd().println("SLF4J(E): ".concat(str));
        loadAd().println("SLF4J(E): Reported exception:");
        th.printStackTrace(loadAd());
    }
}
