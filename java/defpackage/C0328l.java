package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lُؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0328l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3446l f1373l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final OutputStream f1374l;

    public C0328l(OutputStream outputStream, C3446l c3446l) {
        this.f1374l = outputStream;
        this.f1373l = c3446l;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        AbstractC9334l.crashlytics(c0869l.f2526l, 0L, j);
        while (j > 0) {
            this.f1373l.billing();
            C18346l c18346l = c0869l.f2527l;
            int iMin = (int) Math.min(j, c18346l.crashlytics - c18346l.loadAd);
            this.f1374l.write(c18346l.yandex, c18346l.loadAd, iMin);
            int i = c18346l.loadAd + iMin;
            c18346l.loadAd = i;
            long j2 = iMin;
            j -= j2;
            c0869l.f2526l -= j2;
            if (i == c18346l.crashlytics) {
                c0869l.f2527l = c18346l.yandex();
                AbstractC18391l.yandex(c18346l);
            }
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1374l.close();
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        this.f1374l.flush();
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f1373l;
    }

    public final String toString() {
        return "sink(" + this.f1374l + ')';
    }
}
