package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؘؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0869l implements InterfaceC9473l, InterfaceC16805l, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f2526l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18346l f2527l;

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.f2526l;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0869l.mo390break(this, j);
        return j;
    }

    public final void adcel(long j, long j2, C0869l c0869l) {
        long j3 = j;
        AbstractC9334l.crashlytics(this.f2526l, j3, j2);
        if (j2 == 0) {
            return;
        }
        c0869l.f2526l += j2;
        C18346l c18346l = this.f2527l;
        while (true) {
            long j4 = c18346l.crashlytics - c18346l.loadAd;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c18346l = c18346l.billing;
        }
        long j5 = j2;
        while (j5 > 0) {
            C18346l c18346lCrashlytics = c18346l.crashlytics();
            int i = c18346lCrashlytics.loadAd + ((int) j3);
            c18346lCrashlytics.loadAd = i;
            c18346lCrashlytics.crashlytics = Math.min(i + ((int) j5), c18346lCrashlytics.crashlytics);
            C18346l c18346l2 = c0869l.f2527l;
            if (c18346l2 == null) {
                c18346lCrashlytics.mopub = c18346lCrashlytics;
                c18346lCrashlytics.billing = c18346lCrashlytics;
                c0869l.f2527l = c18346lCrashlytics;
            } else {
                c18346l2.mopub.loadAd(c18346lCrashlytics);
            }
            j5 -= (long) (c18346lCrashlytics.crashlytics - c18346lCrashlytics.loadAd);
            c18346l = c18346l.billing;
            j3 = 0;
        }
    }

    public final byte ads(long j) {
        AbstractC9334l.crashlytics(this.f2526l, j, 1L);
        C18346l c18346l = this.f2527l;
        c18346l.getClass();
        long j2 = this.f2526l;
        if (j2 - j < j) {
            while (j2 > j) {
                c18346l = c18346l.mopub;
                j2 -= (long) (c18346l.crashlytics - c18346l.loadAd);
            }
            return c18346l.yandex[(int) ((((long) c18346l.loadAd) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c18346l.crashlytics;
            int i2 = c18346l.loadAd;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c18346l.yandex[(int) ((((long) i2) + j) - j3)];
            }
            c18346l = c18346l.billing;
            j3 = j4;
        }
    }

    @Override // defpackage.InterfaceC9473l
    public final long advert(C3844l c3844l) {
        return signatures(0L, c3844l);
    }

    @Override // defpackage.InterfaceC16805l
    public final /* bridge */ /* synthetic */ InterfaceC16805l appmetrica(C3844l c3844l) {
        m708import(c3844l);
        return this;
    }

    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final C0869l clone() {
        C0869l c0869l = new C0869l();
        if (this.f2526l == 0) {
            return c0869l;
        }
        C18346l c18346l = this.f2527l;
        C18346l c18346lCrashlytics = c18346l.crashlytics();
        c0869l.f2527l = c18346lCrashlytics;
        c18346lCrashlytics.mopub = c18346lCrashlytics;
        c18346lCrashlytics.billing = c18346lCrashlytics;
        for (C18346l c18346l2 = c18346l.billing; c18346l2 != c18346l; c18346l2 = c18346l2.billing) {
            c18346lCrashlytics.mopub.loadAd(c18346l2.crashlytics());
        }
        c0869l.f2526l = this.f2526l;
        return c0869l;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) {
        C18346l c18346lLoadAd;
        if (c0869l == this) {
            C8339l.metrica("source == this");
            return;
        }
        AbstractC9334l.crashlytics(c0869l.f2526l, 0L, j);
        while (j > 0) {
            C18346l c18346l = c0869l.f2527l;
            int i = c18346l.crashlytics - c18346l.loadAd;
            if (j < i) {
                C18346l c18346l2 = this.f2527l;
                C18346l c18346l3 = c18346l2 != null ? c18346l2.mopub : null;
                if (c18346l3 != null && c18346l3.purchase) {
                    if ((((long) c18346l3.crashlytics) + j) - ((long) (c18346l3.amazon ? 0 : c18346l3.loadAd)) <= 8192) {
                        c18346l.amazon(c18346l3, (int) j);
                        c0869l.f2526l -= j;
                        this.f2526l += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    C8339l.metrica("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c18346lLoadAd = c18346l.crashlytics();
                } else {
                    c18346lLoadAd = AbstractC18391l.loadAd();
                    byte[] bArr = c18346l.yandex;
                    byte[] bArr2 = c18346lLoadAd.yandex;
                    int i3 = c18346l.loadAd;
                    AbstractC8669l.applovin(bArr, 0, i3, bArr2, i3 + i2, 2);
                }
                c18346lLoadAd.crashlytics = c18346lLoadAd.loadAd + i2;
                c18346l.loadAd += i2;
                c18346l.mopub.loadAd(c18346lLoadAd);
                c0869l.f2527l = c18346lLoadAd;
            }
            C18346l c18346l4 = c0869l.f2527l;
            long j2 = c18346l4.crashlytics - c18346l4.loadAd;
            c0869l.f2527l = c18346l4.yandex();
            C18346l c18346l5 = this.f2527l;
            if (c18346l5 == null) {
                this.f2527l = c18346l4;
                c18346l4.mopub = c18346l4;
                c18346l4.billing = c18346l4;
            } else {
                c18346l5.mopub.loadAd(c18346l4);
                C18346l c18346l6 = c18346l4.mopub;
                if (c18346l6 == c18346l4) {
                    C8339l.smaato("cannot compact");
                    return;
                } else if (c18346l6.purchase) {
                    int i4 = c18346l4.crashlytics - c18346l4.loadAd;
                    if (i4 <= (8192 - c18346l6.crashlytics) + (c18346l6.amazon ? 0 : c18346l6.loadAd)) {
                        c18346l4.amazon(c18346l6, i4);
                        c18346l4.yandex();
                        AbstractC18391l.yandex(c18346l4);
                    }
                }
            }
            c0869l.f2526l -= j2;
            this.f2526l += j2;
            j -= j2;
        }
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final long mo701catch(InterfaceC10506l interfaceC10506l) {
        long j = this.f2526l;
        if (j > 0) {
            interfaceC10506l.mo390break(this, j);
        }
        return j;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final String mo702class() {
        long jIsVip = isVip((byte) 10, 0L, Long.MAX_VALUE);
        if (jIsVip != -1) {
            return loadAd.crashlytics(this, jIsVip);
        }
        long j = this.f2526l;
        if (j != 0) {
            return mo712l(j, AbstractC9050l.yandex);
        }
        return null;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final String m703continue() {
        return mo712l(this.f2526l, AbstractC9050l.yandex);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C3844l m704default(int i) {
        if (i == 0) {
            return C3844l.f7950l;
        }
        AbstractC9334l.crashlytics(this.f2526l, 0L, i);
        C18346l c18346l = this.f2527l;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c18346l.crashlytics;
            int i6 = c18346l.loadAd;
            if (i5 == i6) {
                C8339l.subs("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            c18346l = c18346l.billing;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C18346l c18346l2 = this.f2527l;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c18346l2.yandex;
            i2 += c18346l2.crashlytics - c18346l2.loadAd;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c18346l2.loadAd;
            c18346l2.amazon = true;
            i7++;
            c18346l2 = c18346l2.billing;
        }
        return new C8034l(bArr, iArr);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final int mo705else(C5884l c5884l) {
        int iAmazon = loadAd.amazon(this, c5884l, false);
        if (iAmazon == -1) {
            return -1;
        }
        skip(c5884l.f12402l[iAmazon].purchase());
        return iAmazon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0869l)) {
            return false;
        }
        long j = this.f2526l;
        C0869l c0869l = (C0869l) obj;
        if (j != c0869l.f2526l) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C18346l c18346l = this.f2527l;
        C18346l c18346l2 = c0869l.f2527l;
        int i = c18346l.loadAd;
        int i2 = c18346l2.loadAd;
        long j2 = 0;
        while (j2 < this.f2526l) {
            long jMin = Math.min(c18346l.crashlytics - i, c18346l2.crashlytics - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c18346l.yandex[i] != c18346l2.yandex[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c18346l.crashlytics) {
                c18346l = c18346l.billing;
                i = c18346l.loadAd;
            }
            if (i2 == c18346l2.crashlytics) {
                c18346l2 = c18346l2.billing;
                i2 = c18346l2.loadAd;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final /* bridge */ /* synthetic */ InterfaceC16805l mo706finally(String str) {
        m718l(str);
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final InterfaceC16805l mo707for(int i) {
        m714l(AbstractC9334l.subs(i));
        return this;
    }

    public final int hashCode() {
        C18346l c18346l = this.f2527l;
        if (c18346l == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c18346l.crashlytics;
            for (int i3 = c18346l.loadAd; i3 < i2; i3++) {
                i = (i * 31) + c18346l.yandex[i3];
            }
            c18346l = c18346l.billing;
        } while (c18346l != this.f2527l);
        return i;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m708import(C3844l c3844l) {
        c3844l.Signature(this, c3844l.purchase());
    }

    public final boolean inmobi(long j, C3844l c3844l, int i) {
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.f2526l && i <= c3844l.purchase()) {
            return i == 0 || loadAd.yandex(this, c3844l, j, j + 1, i) != -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m709instanceof(int i) {
        C18346l c18346lM730super = m730super(1);
        byte[] bArr = c18346lM730super.yandex;
        int i2 = c18346lM730super.crashlytics;
        c18346lM730super.crashlytics = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2526l++;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return C3446l.amazon;
    }

    public final long isVip(byte b, long j, long j2) {
        C18346l c18346l;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f2526l + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f2526l;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (c18346l = this.f2527l) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                c18346l = c18346l.mopub;
                j6 -= (long) (c18346l.crashlytics - c18346l.loadAd);
            }
            while (j6 < j4) {
                byte[] bArr = c18346l.yandex;
                long j8 = j7;
                int iMin = (int) Math.min(c18346l.crashlytics, (((long) c18346l.loadAd) + j4) - j6);
                for (int i = (int) ((((long) c18346l.loadAd) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c18346l.loadAd)) + j6;
                    }
                }
                j6 += (long) (c18346l.crashlytics - c18346l.loadAd);
                c18346l = c18346l.billing;
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (c18346l.crashlytics - c18346l.loadAd)) + j5;
            if (j9 > j3) {
                break;
            }
            c18346l = c18346l.billing;
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = c18346l.yandex;
            int iMin2 = (int) Math.min(c18346l.crashlytics, (((long) c18346l.loadAd) + j4) - j5);
            for (int i2 = (int) ((((long) c18346l.loadAd) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c18346l.loadAd)) + j5;
                }
            }
            j5 += (long) (c18346l.crashlytics - c18346l.loadAd);
            c18346l = c18346l.billing;
            j3 = j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final void m710l(int i) {
        C18346l c18346lM730super = m730super(2);
        byte[] bArr = c18346lM730super.yandex;
        int i2 = c18346lM730super.crashlytics;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c18346lM730super.crashlytics = i2 + 2;
        this.f2526l += 2;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final long mo711l() {
        return AbstractC9334l.isPro(m733throw());
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final String mo712l(long j, Charset charset) {
        if (j < 0 || j > 2147483647L) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return null;
        }
        if (this.f2526l < j) {
            C8339l.vip();
            return null;
        }
        if (j == 0) {
            return "";
        }
        C18346l c18346l = this.f2527l;
        int i = c18346l.loadAd;
        if (((long) i) + j > c18346l.crashlytics) {
            return new String(m725package(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c18346l.yandex, i, i2, charset);
        int i3 = c18346l.loadAd + i2;
        c18346l.loadAd = i3;
        this.f2526l -= j;
        if (i3 == c18346l.crashlytics) {
            this.f2527l = c18346l.yandex();
            AbstractC18391l.yandex(c18346l);
        }
        return str;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final InputStream mo713l() {
        return new C11270l(1, this);
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final void m714l(int i) {
        C18346l c18346lM730super = m730super(4);
        byte[] bArr = c18346lM730super.yandex;
        int i2 = c18346lM730super.crashlytics;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c18346lM730super.crashlytics = i2 + 4;
        this.f2526l += 4;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final int mo715l() {
        return AbstractC9334l.subs(readInt());
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final boolean mo716l(long j, C3844l c3844l) {
        return inmobi(j, c3844l, c3844l.purchase());
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m717l(long j) {
        if (j == 0) {
            m709instanceof(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C18346l c18346lM730super = m730super(i);
        byte[] bArr = c18346lM730super.yandex;
        int i2 = c18346lM730super.crashlytics;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = loadAd.yandex[(int) (15 & j)];
            j >>>= 4;
        }
        c18346lM730super.crashlytics += i;
        this.f2526l += (long) i;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void m718l(String str) {
        m721l(0, str.length(), str);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final long mo719l(long j, C3844l c3844l) {
        byte[] bArr = loadAd.yandex;
        return loadAd.yandex(this, c3844l, 0L, j, c3844l.purchase());
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final void m720l(int i) {
        if (i < 128) {
            m709instanceof(i);
            return;
        }
        if (i < 2048) {
            C18346l c18346lM730super = m730super(2);
            byte[] bArr = c18346lM730super.yandex;
            int i2 = c18346lM730super.crashlytics;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c18346lM730super.crashlytics = i2 + 2;
            this.f2526l += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m709instanceof(63);
            return;
        }
        if (i < 65536) {
            C18346l c18346lM730super2 = m730super(3);
            byte[] bArr2 = c18346lM730super2.yandex;
            int i3 = c18346lM730super2.crashlytics;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c18346lM730super2.crashlytics = i3 + 3;
            this.f2526l += 3;
            return;
        }
        if (i > 1114111) {
            C8339l.metrica("Unexpected code point: 0x".concat(AbstractC9334l.firebase(i)));
            return;
        }
        C18346l c18346lM730super3 = m730super(4);
        byte[] bArr3 = c18346lM730super3.yandex;
        int i4 = c18346lM730super3.crashlytics;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c18346lM730super3.crashlytics = i4 + 4;
        this.f2526l += 4;
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final void m721l(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C10754l.metrica(AbstractC12589l.premium(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C10754l.remoteconfig(str.length(), AbstractC2812l.Signature("endIndex > string.length: ", i2, " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C18346l c18346lM730super = m730super(1);
                byte[] bArr = c18346lM730super.yandex;
                int i3 = c18346lM730super.crashlytics - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c18346lM730super.crashlytics;
                int i6 = (i3 + i) - i5;
                c18346lM730super.crashlytics = i5 + i6;
                this.f2526l += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C18346l c18346lM730super2 = m730super(2);
                    byte[] bArr2 = c18346lM730super2.yandex;
                    int i7 = c18346lM730super2.crashlytics;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c18346lM730super2.crashlytics = i7 + 2;
                    this.f2526l += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C18346l c18346lM730super3 = m730super(3);
                    byte[] bArr3 = c18346lM730super3.yandex;
                    int i8 = c18346lM730super3.crashlytics;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c18346lM730super3.crashlytics = i8 + 3;
                    this.f2526l += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m709instanceof(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C18346l c18346lM730super4 = m730super(4);
                        byte[] bArr4 = c18346lM730super4.yandex;
                        int i11 = c18346lM730super4.crashlytics;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c18346lM730super4.crashlytics = i11 + 4;
                        this.f2526l += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final void m722l(long j) {
        C18346l c18346lM730super = m730super(8);
        byte[] bArr = c18346lM730super.yandex;
        int i = c18346lM730super.crashlytics;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c18346lM730super.crashlytics = i + 8;
        this.f2526l += 8;
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final byte[] mo723native() {
        return m725package(this.f2526l);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final String mo724new(long j) throws EOFException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIsVip = isVip((byte) 10, 0L, j2);
        if (jIsVip != -1) {
            return loadAd.crashlytics(this, jIsVip);
        }
        if (j2 < this.f2526l && ads(j2 - 1) == 13 && ads(j2) == 10) {
            return loadAd.crashlytics(this, j2);
        }
        C0869l c0869l = new C0869l();
        adcel(0L, Math.min(32L, this.f2526l), c0869l);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2526l, j) + " content=" + c0869l.premium(c0869l.f2526l).billing() + (char) 8230);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final byte[] m725package(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return null;
        }
        if (this.f2526l < j) {
            C8339l.vip();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                C8339l.vip();
                break;
            }
            i += i2;
        }
        return bArr;
    }

    @Override // defpackage.InterfaceC9473l
    public final C1503l peek() {
        return new C1503l(new C4790l(this));
    }

    @Override // defpackage.InterfaceC9473l
    public final C3844l premium(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return null;
        }
        if (this.f2526l < j) {
            C8339l.vip();
            return null;
        }
        if (j < 4096) {
            return new C3844l(m725package(j));
        }
        C3844l c3844lM704default = m704default((int) j);
        skip(j);
        return c3844lM704default;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final long m726private() throws EOFException {
        int i;
        if (this.f2526l == 0) {
            C8339l.vip();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C18346l c18346l = this.f2527l;
            byte[] bArr = c18346l.yandex;
            int i3 = c18346l.loadAd;
            int i4 = c18346l.crashlytics;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC2632l.loadAd;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C0869l c0869l = new C0869l();
                    c0869l.m717l(j);
                    c0869l.m709instanceof(b);
                    throw new NumberFormatException("Number too large: ".concat(c0869l.m703continue()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f2527l = c18346l.yandex();
                AbstractC18391l.yandex(c18346l);
            } else {
                c18346l.loadAd = i3;
            }
            if (z) {
                break;
            }
        } while (this.f2527l != null);
        this.f2526l -= (long) i2;
        return j;
    }

    @Override // defpackage.InterfaceC9473l
    public final String pro(long j) {
        return mo712l(j, AbstractC9050l.yandex);
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final int mo727protected() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f2526l == 0) {
            C8339l.vip();
            return 0;
        }
        byte bAds = ads(0L);
        if ((bAds & 128) == 0) {
            i = bAds & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bAds & 224) == 192) {
            i = bAds & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bAds & 240) == 224) {
            i = bAds & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bAds & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bAds & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f2526l < j) {
            StringBuilder sbSignature = AbstractC2812l.Signature("size < ", i2, ": ");
            sbSignature.append(this.f2526l);
            sbSignature.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC2632l.loadAd;
            sbSignature.append(new String(new char[]{cArr[(bAds >> 4) & 15], cArr[bAds & 15]}));
            sbSignature.append(')');
            throw new EOFException(sbSignature.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bAds2 = ads(j2);
            if ((bAds2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bAds2 & 63);
        }
        skip(j);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final /* bridge */ /* synthetic */ InterfaceC16805l mo728public(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC9334l.crashlytics(bArr.length, i, i2);
        C18346l c18346l = this.f2527l;
        if (c18346l == null) {
            return -1;
        }
        int iMin = Math.min(i2, c18346l.crashlytics - c18346l.loadAd);
        byte[] bArr2 = c18346l.yandex;
        int i3 = c18346l.loadAd;
        AbstractC8669l.advert(bArr2, i, i3, bArr, i3 + iMin);
        int i4 = c18346l.loadAd + iMin;
        c18346l.loadAd = i4;
        this.f2526l -= (long) iMin;
        if (i4 == c18346l.crashlytics) {
            this.f2527l = c18346l.yandex();
            AbstractC18391l.yandex(c18346l);
        }
        return iMin;
    }

    @Override // defpackage.InterfaceC9473l
    public final byte readByte() {
        long j = this.f2526l;
        if (j == 0) {
            C8339l.vip();
            return (byte) 0;
        }
        C18346l c18346l = this.f2527l;
        int i = c18346l.loadAd;
        int i2 = c18346l.crashlytics;
        int i3 = i + 1;
        byte b = c18346l.yandex[i];
        this.f2526l = j - 1;
        if (i3 != i2) {
            c18346l.loadAd = i3;
            return b;
        }
        this.f2527l = c18346l.yandex();
        AbstractC18391l.yandex(c18346l);
        return b;
    }

    @Override // defpackage.InterfaceC9473l
    public final int readInt() throws EOFException {
        long j = this.f2526l;
        if (j < 4) {
            C8339l.vip();
            return 0;
        }
        C18346l c18346l = this.f2527l;
        int i = c18346l.loadAd;
        int i2 = c18346l.crashlytics;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = c18346l.yandex;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2526l = j - 4;
        if (i5 != i2) {
            c18346l.loadAd = i5;
            return i6;
        }
        this.f2527l = c18346l.yandex();
        AbstractC18391l.yandex(c18346l);
        return i6;
    }

    @Override // defpackage.InterfaceC9473l
    public final short readShort() throws EOFException {
        long j = this.f2526l;
        if (j < 2) {
            C8339l.vip();
            return (short) 0;
        }
        C18346l c18346l = this.f2527l;
        int i = c18346l.loadAd;
        int i2 = c18346l.crashlytics;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = c18346l.yandex;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f2526l = j - 2;
        if (i5 == i2) {
            this.f2527l = c18346l.yandex();
            AbstractC18391l.yandex(c18346l);
        } else {
            c18346l.loadAd = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.InterfaceC9473l
    public final boolean request(long j) {
        return this.f2526l >= j;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final /* bridge */ /* synthetic */ InterfaceC16805l mo729return(int i, int i2, String str) {
        m721l(i, i2, str);
        return this;
    }

    public final long signatures(long j, C3844l c3844l) {
        long j2 = 0;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "fromIndex < 0: "));
            return 0L;
        }
        C18346l c18346l = this.f2527l;
        if (c18346l == null) {
            return -1L;
        }
        long j3 = this.f2526l;
        if (j3 - j < j) {
            while (j3 > j) {
                c18346l = c18346l.mopub;
                j3 -= (long) (c18346l.crashlytics - c18346l.loadAd);
            }
            if (c3844l.purchase() == 2) {
                byte bIsPro = c3844l.isPro(0);
                byte bIsPro2 = c3844l.isPro(1);
                while (j3 < this.f2526l) {
                    byte[] bArr = c18346l.yandex;
                    int i = c18346l.crashlytics;
                    for (int i2 = (int) ((((long) c18346l.loadAd) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bIsPro || b == bIsPro2) {
                            return ((long) (i2 - c18346l.loadAd)) + j3;
                        }
                    }
                    j3 += (long) (c18346l.crashlytics - c18346l.loadAd);
                    c18346l = c18346l.billing;
                    j = j3;
                }
            } else {
                byte[] bArrSubs = c3844l.subs();
                while (j3 < this.f2526l) {
                    byte[] bArr2 = c18346l.yandex;
                    int i3 = c18346l.crashlytics;
                    for (int i4 = (int) ((((long) c18346l.loadAd) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrSubs) {
                            if (b2 == b3) {
                                return ((long) (i4 - c18346l.loadAd)) + j3;
                            }
                        }
                    }
                    j3 += (long) (c18346l.crashlytics - c18346l.loadAd);
                    c18346l = c18346l.billing;
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c18346l.crashlytics - c18346l.loadAd)) + j2;
            if (j4 > j) {
                break;
            }
            c18346l = c18346l.billing;
            j2 = j4;
        }
        if (c3844l.purchase() == 2) {
            byte bIsPro3 = c3844l.isPro(0);
            byte bIsPro4 = c3844l.isPro(1);
            while (j2 < this.f2526l) {
                byte[] bArr3 = c18346l.yandex;
                int i5 = c18346l.crashlytics;
                for (int i6 = (int) ((((long) c18346l.loadAd) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bIsPro3 || b4 == bIsPro4) {
                        return ((long) (i6 - c18346l.loadAd)) + j2;
                    }
                }
                j2 += (long) (c18346l.crashlytics - c18346l.loadAd);
                c18346l = c18346l.billing;
                j = j2;
            }
        } else {
            byte[] bArrSubs2 = c3844l.subs();
            while (j2 < this.f2526l) {
                byte[] bArr4 = c18346l.yandex;
                int i7 = c18346l.crashlytics;
                for (int i8 = (int) ((((long) c18346l.loadAd) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrSubs2) {
                        if (b5 == b6) {
                            return ((long) (i8 - c18346l.loadAd)) + j2;
                        }
                    }
                }
                j2 += (long) (c18346l.crashlytics - c18346l.loadAd);
                c18346l = c18346l.billing;
                j = j2;
            }
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC9473l
    public final void skip(long j) {
        while (j > 0) {
            C18346l c18346l = this.f2527l;
            if (c18346l == null) {
                C8339l.vip();
                return;
            }
            int iMin = (int) Math.min(j, c18346l.crashlytics - c18346l.loadAd);
            long j2 = iMin;
            this.f2526l -= j2;
            j -= j2;
            int i = c18346l.loadAd + iMin;
            c18346l.loadAd = i;
            if (i == c18346l.crashlytics) {
                this.f2527l = c18346l.yandex();
                AbstractC18391l.yandex(c18346l);
            }
        }
    }

    @Override // defpackage.InterfaceC9473l
    public final boolean subs() {
        return this.f2526l == 0;
    }

    @Override // defpackage.InterfaceC9473l
    public final void subscription(long j) throws EOFException {
        if (this.f2526l >= j) {
            return;
        }
        C8339l.vip();
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final C18346l m730super(int i) {
        if (i < 1 || i > 8192) {
            C8339l.metrica("unexpected capacity");
            return null;
        }
        C18346l c18346l = this.f2527l;
        if (c18346l == null) {
            C18346l c18346lLoadAd = AbstractC18391l.loadAd();
            this.f2527l = c18346lLoadAd;
            c18346lLoadAd.mopub = c18346lLoadAd;
            c18346lLoadAd.billing = c18346lLoadAd;
            return c18346lLoadAd;
        }
        C18346l c18346l2 = c18346l.mopub;
        if (c18346l2.crashlytics + i <= 8192 && c18346l2.purchase) {
            return c18346l2;
        }
        C18346l c18346lLoadAd2 = AbstractC18391l.loadAd();
        c18346l2.loadAd(c18346lLoadAd2);
        return c18346lLoadAd2;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final short m731switch() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m732synchronized(C0869l c0869l, long j) throws EOFException {
        long j2 = this.f2526l;
        if (j2 >= j) {
            c0869l.mo390break(this, j);
        } else {
            c0869l.mo390break(this, j2);
            C8339l.vip();
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final long m733throw() throws EOFException {
        long j = this.f2526l;
        if (j < 8) {
            C8339l.vip();
            return 0L;
        }
        C18346l c18346l = this.f2527l;
        int i = c18346l.loadAd;
        int i2 = c18346l.crashlytics;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c18346l.yandex;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f2526l = j - 8;
        if (i4 != i2) {
            c18346l.loadAd = i4;
            return j3;
        }
        this.f2527l = c18346l.yandex();
        AbstractC18391l.yandex(c18346l);
        return j3;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final InterfaceC16805l mo734throws(long j) {
        m722l(AbstractC9334l.isPro(j));
        return this;
    }

    public final String toString() {
        long j = this.f2526l;
        if (j <= 2147483647L) {
            return m704default((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2526l).toString());
    }

    @Override // defpackage.InterfaceC9473l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final String mo735transient(Charset charset) {
        return mo712l(this.f2526l, charset);
    }

    public final long vip() {
        long j = this.f2526l;
        if (j == 0) {
            return 0L;
        }
        C18346l c18346l = this.f2527l.mopub;
        int i = c18346l.crashlytics;
        return (i >= 8192 || !c18346l.purchase) ? j : j - ((long) (i - c18346l.loadAd));
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final long mo736volatile(InterfaceC14991l interfaceC14991l) {
        long j = 0;
        while (true) {
            long jAd = interfaceC14991l.ad(this, 8192L);
            if (jAd == -1) {
                return j;
            }
            j += jAd;
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m737while(long j) {
        boolean z;
        if (j == 0) {
            m709instanceof(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m718l("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = loadAd.yandex;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > loadAd.loadAd[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C18346l c18346lM730super = m730super(i);
        byte[] bArr2 = c18346lM730super.yandex;
        int i2 = c18346lM730super.crashlytics + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = loadAd.yandex[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c18346lM730super.crashlytics += i;
        this.f2526l += (long) i;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC9334l.crashlytics(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C18346l c18346lM730super = m730super(1);
            int iMin = Math.min(i3 - i, 8192 - c18346lM730super.crashlytics);
            int i4 = i + iMin;
            AbstractC8669l.advert(bArr, c18346lM730super.crashlytics, i, c18346lM730super.yandex, i4);
            c18346lM730super.crashlytics += iMin;
            i = i4;
        }
        this.f2526l += j;
    }

    @Override // defpackage.InterfaceC16805l
    public final /* bridge */ /* synthetic */ InterfaceC16805l writeByte(int i) {
        m709instanceof(i);
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    public final /* bridge */ /* synthetic */ InterfaceC16805l writeInt(int i) {
        m714l(i);
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    public final /* bridge */ /* synthetic */ InterfaceC16805l writeShort(int i) {
        m710l(i);
        return this;
    }

    public final void yandex() {
        skip(this.f2526l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.InterfaceC10506l
    public final void close() {
    }

    @Override // defpackage.InterfaceC9473l, defpackage.InterfaceC16805l
    public final C0869l crashlytics() {
        return this;
    }

    @Override // defpackage.InterfaceC16805l, defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m738write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C18346l c18346lM730super = m730super(1);
            int iMin = Math.min(i, 8192 - c18346lM730super.crashlytics);
            byteBuffer.get(c18346lM730super.yandex, c18346lM730super.crashlytics, iMin);
            i -= iMin;
            c18346lM730super.crashlytics += iMin;
        }
        this.f2526l += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C18346l c18346l = this.f2527l;
        if (c18346l == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c18346l.crashlytics - c18346l.loadAd);
        byteBuffer.put(c18346l.yandex, c18346l.loadAd, iMin);
        int i = c18346l.loadAd + iMin;
        c18346l.loadAd = i;
        this.f2526l -= (long) iMin;
        if (i == c18346l.crashlytics) {
            this.f2527l = c18346l.yandex();
            AbstractC18391l.yandex(c18346l);
        }
        return iMin;
    }
}
