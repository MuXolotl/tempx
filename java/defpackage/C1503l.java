package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؒۧۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1503l implements InterfaceC9473l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f3754l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f3755l = new C0869l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14991l f3756l;

    public C1503l(InterfaceC14991l interfaceC14991l) {
        this.f3756l = interfaceC14991l;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f3754l) {
            C8339l.smaato("closed");
            return 0L;
        }
        C0869l c0869l2 = this.f3755l;
        if (c0869l2.f2526l == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f3756l.ad(c0869l2, 8192L) == -1) {
                return -1L;
            }
        }
        return c0869l2.ad(c0869l, Math.min(j, c0869l2.f2526l));
    }

    public final short adcel() {
        subscription(2L);
        return this.f3755l.m731switch();
    }

    @Override // defpackage.InterfaceC9473l
    public final long advert(C3844l c3844l) {
        long jMax = 0;
        if (this.f3754l) {
            C8339l.smaato("closed");
            return 0L;
        }
        while (true) {
            C0869l c0869l = this.f3755l;
            long jSignatures = c0869l.signatures(jMax, c3844l);
            if (jSignatures != -1) {
                return jSignatures;
            }
            long j = c0869l.f2526l;
            if (this.f3756l.ad(c0869l, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public final byte[] billing(long j) {
        subscription(j);
        return this.f3755l.m725package(j);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: catch */
    public final long mo701catch(InterfaceC10506l interfaceC10506l) {
        C0869l c0869l;
        long j = 0;
        while (true) {
            InterfaceC14991l interfaceC14991l = this.f3756l;
            c0869l = this.f3755l;
            if (interfaceC14991l.ad(c0869l, 8192L) == -1) {
                break;
            }
            long jVip = c0869l.vip();
            if (jVip > 0) {
                j += jVip;
                interfaceC10506l.mo390break(c0869l, jVip);
            }
        }
        long j2 = c0869l.f2526l;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC10506l.mo390break(c0869l, j2);
        return j3;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: class */
    public final String mo702class() {
        long jYandex = yandex((byte) 10, 0L, Long.MAX_VALUE);
        C0869l c0869l = this.f3755l;
        if (jYandex != -1) {
            return loadAd.crashlytics(c0869l, jYandex);
        }
        long j = c0869l.f2526l;
        if (j != 0) {
            return pro(j);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f3754l) {
            return;
        }
        this.f3754l = true;
        this.f3756l.close();
        this.f3755l.yandex();
    }

    @Override // defpackage.InterfaceC9473l, defpackage.InterfaceC16805l
    public final C0869l crashlytics() {
        return this.f3755l;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: else */
    public final int mo705else(C5884l c5884l) {
        C0869l c0869l;
        if (this.f3754l) {
            C8339l.smaato("closed");
            return 0;
        }
        do {
            c0869l = this.f3755l;
            int iAmazon = loadAd.amazon(c0869l, c5884l, true);
            if (iAmazon != -2) {
                if (iAmazon == -1) {
                    break;
                }
                c0869l.skip(c5884l.f12402l[iAmazon].purchase());
                return iAmazon;
            }
        } while (this.f3756l.ad(c0869l, 8192L) != -1);
        return -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3754l;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f3756l.isPro();
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final long mo711l() {
        subscription(8L);
        return this.f3755l.mo711l();
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final String mo712l(long j, Charset charset) {
        subscription(4L);
        return this.f3755l.mo712l(4L, charset);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final InputStream mo713l() {
        return new C11270l(4, this);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo715l() {
        subscription(4L);
        return this.f3755l.mo715l();
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lّؗؑ */
    public final boolean mo716l(long j, C3844l c3844l) {
        int iPurchase = c3844l.purchase();
        if (!this.f3754l) {
            return iPurchase >= 0 && j >= 0 && iPurchase <= c3844l.purchase() && (iPurchase == 0 || AbstractC2533l.yandex(this, c3844l, iPurchase, j, j + 1) != -1);
        }
        C8339l.smaato("closed");
        return false;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lْٓؒ */
    public final long mo719l(long j, C3844l c3844l) {
        return AbstractC2533l.yandex(this, c3844l, c3844l.purchase(), 0L, j);
    }

    public final void mopub(C0869l c0869l, long j) {
        C0869l c0869l2 = this.f3755l;
        try {
            subscription(j);
            c0869l2.m732synchronized(c0869l, j);
        } catch (EOFException e) {
            c0869l.mo736volatile(c0869l2);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: native */
    public final byte[] mo723native() {
        InterfaceC14991l interfaceC14991l = this.f3756l;
        C0869l c0869l = this.f3755l;
        c0869l.mo736volatile(interfaceC14991l);
        return c0869l.m725package(c0869l.f2526l);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: new */
    public final String mo724new(long j) throws EOFException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jYandex = yandex((byte) 10, 0L, j2);
        C0869l c0869l = this.f3755l;
        if (jYandex != -1) {
            return loadAd.crashlytics(c0869l, jYandex);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && c0869l.ads(j2 - 1) == 13 && request(j2 + 1) && c0869l.ads(j2) == 10) {
            return loadAd.crashlytics(c0869l, j2);
        }
        C0869l c0869l2 = new C0869l();
        c0869l.adcel(0L, Math.min(32L, c0869l.f2526l), c0869l2);
        throw new EOFException("\\n not found: limit=" + Math.min(c0869l.f2526l, j) + " content=" + c0869l2.premium(c0869l2.f2526l).billing() + (char) 8230);
    }

    @Override // defpackage.InterfaceC9473l
    public final C1503l peek() {
        return new C1503l(new C4790l(this));
    }

    @Override // defpackage.InterfaceC9473l
    public final C3844l premium(long j) {
        subscription(j);
        return this.f3755l.premium(j);
    }

    @Override // defpackage.InterfaceC9473l
    public final String pro(long j) {
        subscription(j);
        return this.f3755l.mo712l(j, AbstractC9050l.yandex);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: protected */
    public final int mo727protected() {
        subscription(1L);
        C0869l c0869l = this.f3755l;
        byte bAds = c0869l.ads(0L);
        if ((bAds & 224) == 192) {
            subscription(2L);
        } else if ((bAds & 240) == 224) {
            subscription(3L);
        } else if ((bAds & 248) == 240) {
            subscription(4L);
        }
        return c0869l.mo727protected();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0869l c0869l = this.f3755l;
        if (c0869l.f2526l == 0 && this.f3756l.ad(c0869l, 8192L) == -1) {
            return -1;
        }
        return c0869l.read(byteBuffer);
    }

    @Override // defpackage.InterfaceC9473l
    public final byte readByte() {
        subscription(1L);
        return this.f3755l.readByte();
    }

    @Override // defpackage.InterfaceC9473l
    public final int readInt() {
        subscription(4L);
        return this.f3755l.readInt();
    }

    @Override // defpackage.InterfaceC9473l
    public final short readShort() {
        subscription(2L);
        return this.f3755l.readShort();
    }

    @Override // defpackage.InterfaceC9473l
    public final boolean request(long j) {
        C0869l c0869l;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return false;
        }
        if (this.f3754l) {
            C8339l.smaato("closed");
            return false;
        }
        do {
            c0869l = this.f3755l;
            if (c0869l.f2526l >= j) {
                return true;
            }
        } while (this.f3756l.ad(c0869l, 8192L) != -1);
        return false;
    }

    @Override // defpackage.InterfaceC9473l
    public final void skip(long j) throws EOFException {
        if (this.f3754l) {
            C8339l.smaato("closed");
            return;
        }
        while (j > 0) {
            C0869l c0869l = this.f3755l;
            if (c0869l.f2526l == 0 && this.f3756l.ad(c0869l, 8192L) == -1) {
                C8339l.vip();
                return;
            } else {
                long jMin = Math.min(j, c0869l.f2526l);
                c0869l.skip(jMin);
                j -= jMin;
            }
        }
    }

    @Override // defpackage.InterfaceC9473l
    public final boolean subs() {
        if (this.f3754l) {
            C8339l.smaato("closed");
            return false;
        }
        C0869l c0869l = this.f3755l;
        return c0869l.subs() && this.f3756l.ad(c0869l, 8192L) == -1;
    }

    @Override // defpackage.InterfaceC9473l
    public final void subscription(long j) {
        if (request(j)) {
            return;
        }
        C8339l.vip();
    }

    public final String toString() {
        return "buffer(" + this.f3756l + ')';
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: transient */
    public final String mo735transient(Charset charset) {
        InterfaceC14991l interfaceC14991l = this.f3756l;
        C0869l c0869l = this.f3755l;
        c0869l.mo736volatile(interfaceC14991l);
        return c0869l.mo712l(c0869l.f2526l, charset);
    }

    public final long vip() {
        subscription(8L);
        return this.f3755l.m733throw();
    }

    public final long yandex(byte b, long j, long j2) {
        if (this.f3754l) {
            C8339l.smaato("closed");
            return 0L;
        }
        if (0 > j2) {
            C10754l.metrica(AbstractC2812l.ads(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C0869l c0869l = this.f3755l;
            byte b2 = b;
            long j3 = j2;
            long jIsVip = c0869l.isVip(b2, jMax, j3);
            if (jIsVip != -1) {
                return jIsVip;
            }
            long j4 = c0869l.f2526l;
            if (j4 >= j3 || this.f3756l.ad(c0869l, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }
}
