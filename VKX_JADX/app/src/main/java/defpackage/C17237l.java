package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17237l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f33454l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Inflater f33455l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9473l f33456l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f33457l;

    public C17237l(InterfaceC9473l interfaceC9473l, Inflater inflater) {
        this.f33456l = interfaceC9473l;
        this.f33455l = inflater;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        long j2;
        while (j >= 0) {
            if (this.f33457l) {
                C8339l.smaato("closed");
                return 0L;
            }
            InterfaceC9473l interfaceC9473l = this.f33456l;
            Inflater inflater = this.f33455l;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    C18346l c18346lM730super = c0869l.m730super(1);
                    int iMin = (int) Math.min(j, 8192 - c18346lM730super.crashlytics);
                    if (inflater.needsInput() && !interfaceC9473l.subs()) {
                        C18346l c18346l = interfaceC9473l.crashlytics().f2527l;
                        int i = c18346l.crashlytics;
                        int i2 = c18346l.loadAd;
                        int i3 = i - i2;
                        this.f33454l = i3;
                        inflater.setInput(c18346l.yandex, i2, i3);
                    }
                    int iInflate = inflater.inflate(c18346lM730super.yandex, c18346lM730super.crashlytics, iMin);
                    int i4 = this.f33454l;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f33454l -= remaining;
                        interfaceC9473l.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c18346lM730super.crashlytics += iInflate;
                        j2 = iInflate;
                        c0869l.f2526l += j2;
                    } else {
                        if (c18346lM730super.loadAd == c18346lM730super.crashlytics) {
                            c0869l.f2527l = c18346lM730super.yandex();
                            AbstractC18391l.yandex(c18346lM730super);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (interfaceC9473l.subs()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f33457l) {
            return;
        }
        this.f33455l.end();
        this.f33457l = true;
        this.f33456l.close();
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f33456l.isPro();
    }
}
