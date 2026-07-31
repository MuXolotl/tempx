package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16660l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10038l f32659l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5415l f32660l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InputStream f32661l;

    public C16660l(C10038l c10038l) {
        this.f32659l = c10038l;
        Socket socket = (Socket) c10038l.f20463l;
        this.f32661l = socket.getInputStream();
        this.f32660l = new C5415l(socket);
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        C5415l c5415l = this.f32660l;
        c5415l.billing();
        C18346l c18346lM730super = c0869l.m730super(1);
        int iMin = (int) Math.min(j, 8192 - c18346lM730super.crashlytics);
        try {
            c5415l.admob();
            try {
                try {
                    int i = this.f32661l.read(c18346lM730super.yandex, c18346lM730super.crashlytics, iMin);
                    if (c5415l.subs()) {
                        throw c5415l.isPro(null);
                    }
                    if (i != -1) {
                        c18346lM730super.crashlytics += i;
                        long j2 = i;
                        c0869l.f2526l += j2;
                        return j2;
                    }
                    if (c18346lM730super.loadAd != c18346lM730super.crashlytics) {
                        return -1L;
                    }
                    c0869l.f2527l = c18346lM730super.yandex();
                    AbstractC18391l.yandex(c18346lM730super);
                    return -1L;
                } catch (Throwable th) {
                    c5415l.subs();
                    throw th;
                }
            } catch (IOException e) {
                if (c5415l.subs()) {
                    throw c5415l.isPro(e);
                }
                throw e;
            }
        } catch (AssertionError e2) {
            if (AbstractC7169l.yandex(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        C10038l c10038l = this.f32659l;
        C5415l c5415l = this.f32660l;
        c5415l.admob();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) c10038l.f20462l;
                Socket socket = (Socket) c10038l.f20463l;
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    c5415l.subs();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    c5415l.subs();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f32661l.close();
                    }
                }
                Unit unit = Unit.INSTANCE;
                if (c5415l.subs()) {
                    throw c5415l.isPro(null);
                }
                return;
            } catch (IOException e) {
                if (!c5415l.subs()) {
                    throw e;
                }
                throw c5415l.isPro(e);
            }
        } catch (Throwable th) {
            c5415l.subs();
            throw th;
        }
        c5415l.subs();
        throw th;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f32660l;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f32659l.f20463l) + ')';
    }
}
