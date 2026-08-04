package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;

/* JADX INFO: renamed from: l٘ٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17982l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f35153l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f35154l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f35155l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C0374l f35157l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0869l f35152l = new C0869l();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0869l f35156l = new C0869l();

    public C17982l(C0374l c0374l, long j, boolean z) {
        this.f35157l = c0374l;
        this.f35154l = j;
        this.f35153l = z;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws Throwable {
        boolean z;
        Throwable c5333l;
        long j2;
        long jAd;
        long j3 = 0;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            C0374l c0374l = this.f35157l;
            synchronized (c0374l) {
                c0374l.f1453l.getClass();
                C17573l c17573l = c0374l.f1459l;
                z = true;
                boolean z2 = c17573l.f34197l || c17573l.f34199l;
                if (z2) {
                    c0374l.f1455l.admob();
                }
                try {
                    if (c0374l.mopub() == 0 || this.f35153l) {
                        c5333l = null;
                    } else {
                        c5333l = c0374l.f1449l;
                        if (c5333l == null) {
                            c5333l = new C5333l(c0374l.mopub());
                        }
                    }
                    if (this.f35155l) {
                        throw new IOException("stream closed");
                    }
                    C0869l c0869l2 = this.f35156l;
                    long j4 = c0869l2.f2526l;
                    if (j4 > j3) {
                        jAd = c0869l2.ad(c0869l, Math.min(j, j4));
                        C0386l.crashlytics(c0374l.f1450l, jAd, 0L, 2);
                        long jLoadAd = c0374l.f1450l.loadAd();
                        if (c5333l == null) {
                            j2 = j3;
                            if (jLoadAd >= c0374l.f1453l.f16765l.yandex() / 2) {
                                c0374l.f1453l.inmobi(c0374l.f1454l, jLoadAd);
                                C0386l.crashlytics(c0374l.f1450l, 0L, jLoadAd, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.f35153l || c5333l != null) {
                            z = false;
                        } else {
                            try {
                                c0374l.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jAd = -1;
                    }
                    if (z2) {
                        c0374l.f1455l.smaato();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    if (z2) {
                        c0374l.f1455l.smaato();
                    }
                    throw th;
                }
            }
            this.f35157l.f1453l.f16760l.getClass();
            if (!z) {
                if (jAd != -1) {
                    return jAd;
                }
                if (c5333l == null) {
                    return -1L;
                }
                throw c5333l;
            }
            j3 = j2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C0374l c0374l = this.f35157l;
        synchronized (c0374l) {
            this.f35155l = true;
            C0869l c0869l = this.f35156l;
            j = c0869l.f2526l;
            c0869l.yandex();
            c0374l.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (j > 0) {
            C0374l c0374l2 = this.f35157l;
            TimeZone timeZone = AbstractC11432l.yandex;
            c0374l2.f1453l.ads(j);
        }
        this.f35157l.yandex();
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f35157l.f1455l;
    }
}
