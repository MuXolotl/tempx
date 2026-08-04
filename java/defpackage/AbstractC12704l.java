package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lّٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12704l implements InterfaceC15681l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static Thread f25023l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static volatile Handler f25024l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C0847l f25026l = new C0847l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C0847l f25025l = new C0847l();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C0847l f25022l = new C0847l();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C0847l f25028l = new C0847l();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0847l f25027l = new C0847l();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Object f25029l = new Object();

    public static boolean amazon(Thread thread) {
        if (f25023l == null) {
            f25023l = Looper.getMainLooper().getThread();
        }
        return thread == f25023l;
    }

    public static int crashlytics(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static float loadAd(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static Handler purchase() {
        if (f25024l == null) {
            synchronized (f25029l) {
                try {
                    if (f25024l == null) {
                        f25024l = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25024l;
    }

    public static final void yandex(int i) {
        if (i > 0) {
            return;
        }
        C8339l.metrica("px must be > 0.");
    }
}
