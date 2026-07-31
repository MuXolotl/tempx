package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7443l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10038l f15417l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5415l f15418l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final OutputStream f15419l;

    public C7443l(C10038l c10038l) {
        this.f15417l = c10038l;
        Socket socket = (Socket) c10038l.f20463l;
        this.f15419l = socket.getOutputStream();
        this.f15418l = new C5415l(socket);
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        AbstractC9334l.crashlytics(c0869l.f2526l, 0L, j);
        while (j > 0) {
            C5415l c5415l = this.f15418l;
            c5415l.billing();
            C18346l c18346l = c0869l.f2527l;
            int iMin = (int) Math.min(j, c18346l.crashlytics - c18346l.loadAd);
            c5415l.admob();
            try {
                try {
                    this.f15419l.write(c18346l.yandex, c18346l.loadAd, iMin);
                    Unit unit = Unit.INSTANCE;
                    if (c5415l.subs()) {
                        throw c5415l.isPro(null);
                    }
                    int i = c18346l.loadAd + iMin;
                    c18346l.loadAd = i;
                    long j2 = iMin;
                    j -= j2;
                    c0869l.f2526l -= j2;
                    if (i == c18346l.crashlytics) {
                        c0869l.f2527l = c18346l.yandex();
                        AbstractC18391l.yandex(c18346l);
                    }
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
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f15419l;
        C10038l c10038l = this.f15417l;
        C5415l c5415l = this.f15418l;
        c5415l.admob();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) c10038l.f20462l;
                Socket socket = (Socket) c10038l.f20463l;
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    c5415l.subs();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    c5415l.subs();
                    return;
                }
                socket.close();
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

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        C5415l c5415l = this.f15418l;
        c5415l.admob();
        try {
            try {
                this.f15419l.flush();
                Unit unit = Unit.INSTANCE;
                if (c5415l.subs()) {
                    throw c5415l.isPro(null);
                }
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
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f15418l;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f15417l.f20463l) + ')';
    }
}
