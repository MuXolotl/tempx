package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lْۧؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13813l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final AbstractC17549l f26938l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final boolean f26941l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile C14714l f26942l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile C14266l f26943l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile Object f26944l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object f26940l = new Object();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C5885l f26939l = new C5885l(2);

    static {
        boolean z;
        AbstractC17549l c18425l;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f26941l = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                c18425l = new C6593l();
            } catch (Error | Exception e) {
                try {
                    c18425l = new C4412l();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    c18425l = new C18425l();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                c18425l = new C4412l();
            } catch (NoClassDefFoundError unused2) {
                c18425l = new C18425l();
            }
        }
        th = null;
        th2 = null;
        f26938l = c18425l;
        if (th != null) {
            C5885l c5885l = f26939l;
            Logger loggerLoadAd = c5885l.loadAd();
            Level level = Level.SEVERE;
            loggerLoadAd.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c5885l.loadAd().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void loadAd(C14714l c14714l) {
        c14714l.yandex = null;
        while (true) {
            C14714l c14714l2 = this.f26942l;
            if (c14714l2 != C14714l.crashlytics) {
                C14714l c14714l3 = null;
                while (c14714l2 != null) {
                    C14714l c14714l4 = c14714l2.loadAd;
                    if (c14714l2.yandex != null) {
                        c14714l3 = c14714l2;
                    } else if (c14714l3 != null) {
                        c14714l3.loadAd = c14714l4;
                        if (c14714l3.yandex == null) {
                        }
                    } else if (!f26938l.firebase(this, c14714l2, c14714l4)) {
                    }
                    c14714l2 = c14714l4;
                }
                return;
            }
            return;
        }
    }
}
