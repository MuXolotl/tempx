package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17573l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f34197l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f34198l = new C0869l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f34199l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0374l f34200l;

    public C17573l(C0374l c0374l, boolean z) {
        this.f34200l = c0374l;
        this.f34199l = z;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        TimeZone timeZone = AbstractC11432l.yandex;
        C0869l c0869l2 = this.f34198l;
        c0869l2.mo390break(c0869l, j);
        while (c0869l2.f2526l >= 16384) {
            yandex(false);
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0374l c0374l = this.f34200l;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (c0374l) {
            if (this.f34197l) {
                return;
            }
            boolean z = c0374l.mopub() == 0;
            Unit unit = Unit.INSTANCE;
            C0374l c0374l2 = this.f34200l;
            if (!c0374l2.f1459l.f34199l) {
                if (this.f34198l.f2526l > 0) {
                    while (this.f34198l.f2526l > 0) {
                        yandex(true);
                    }
                } else if (z) {
                    c0374l2.f1453l.isVip(c0374l2.f1454l, true, null, 0L);
                }
            }
            C0374l c0374l3 = this.f34200l;
            synchronized (c0374l3) {
                this.f34197l = true;
                c0374l3.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
            this.f34200l.f1453l.f16777l.flush();
            this.f34200l.yandex();
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        C0374l c0374l = this.f34200l;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (c0374l) {
            c0374l.loadAd();
            Unit unit = Unit.INSTANCE;
        }
        while (this.f34198l.f2526l > 0) {
            yandex(false);
            this.f34200l.f1453l.f16777l.flush();
        }
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f34200l.f1461l;
    }

    public final void yandex(boolean z) throws IOException {
        long jMin;
        boolean z2;
        C0374l c0374l = this.f34200l;
        synchronized (c0374l) {
            try {
                c0374l.f1461l.admob();
                while (c0374l.f1457l >= c0374l.f1456l && !this.f34199l && !this.f34197l && c0374l.mopub() == 0) {
                    try {
                        try {
                            c0374l.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        c0374l.f1461l.smaato();
                        throw th;
                    }
                }
                c0374l.f1461l.smaato();
                c0374l.loadAd();
                jMin = Math.min(c0374l.f1456l - c0374l.f1457l, this.f34198l.f2526l);
                c0374l.f1457l += jMin;
                z2 = z && jMin == this.f34198l.f2526l;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34200l.f1461l.admob();
        try {
            C0374l c0374l2 = this.f34200l;
            c0374l2.f1453l.isVip(c0374l2.f1454l, z2, this.f34198l, jMin);
        } finally {
            this.f34200l.f1461l.smaato();
        }
    }
}
