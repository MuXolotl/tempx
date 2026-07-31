package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: lؖۨٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4554l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2781l f9203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Deflater f9204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7167l f9205l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CRC32 f9206l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f9207l;

    public C4554l(InterfaceC10506l interfaceC10506l) {
        C7167l c7167l = new C7167l(interfaceC10506l);
        this.f9205l = c7167l;
        Deflater deflater = new Deflater(-1, true);
        this.f9204l = deflater;
        this.f9203l = new C2781l(c7167l, deflater, 0);
        this.f9206l = new CRC32();
        C0869l c0869l = c7167l.f14998l;
        c0869l.m710l(8075);
        c0869l.m709instanceof(8);
        c0869l.m709instanceof(0);
        c0869l.m714l(0);
        c0869l.m709instanceof(0);
        c0869l.m709instanceof(0);
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        C18346l c18346l = c0869l.f2527l;
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, c18346l.crashlytics - c18346l.loadAd);
            this.f9206l.update(c18346l.yandex, c18346l.loadAd, iMin);
            j2 -= (long) iMin;
            c18346l = c18346l.billing;
        }
        this.f9203l.mo390break(c0869l, j);
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f9204l;
        C7167l c7167l = this.f9205l;
        if (this.f9207l) {
            return;
        }
        C2781l c2781l = this.f9203l;
        ((Deflater) c2781l.f6048l).finish();
        c2781l.yandex(false);
        c7167l.mo707for((int) this.f9206l.getValue());
        c7167l.mo707for((int) deflater.getBytesRead());
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            c7167l.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9207l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        this.f9203l.flush();
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f9205l.f14999l.isPro();
    }
}
