package defpackage;

import java.io.EOFException;
import java.io.Flushable;

/* JADX INFO: renamed from: lّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18476l implements InterfaceC14189l, AutoCloseable, Flushable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f36079l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2139l f36080l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C2139l f36081l;

    public final /* synthetic */ void adcel() {
        C2139l c2139l = this.f36080l;
        C2139l c2139l2 = c2139l.mopub;
        this.f36080l = c2139l2;
        if (c2139l2 == null) {
            this.f36081l = null;
        } else {
            c2139l2.billing = null;
        }
        c2139l.mopub = null;
        AbstractC7163l.yandex(c2139l);
    }

    public final void ads(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f36079l + ", required: " + j + ')');
    }

    @Override // defpackage.InterfaceC16090l
    /* JADX INFO: renamed from: extends */
    public final long mo1064extends(C18476l c18476l, long j) {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
            return 0L;
        }
        long j2 = this.f36079l;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c18476l.m4561package(this, j);
        return j;
    }

    public final /* synthetic */ C2139l inmobi(int i) {
        if (i < 1 || i > 8192) {
            C10754l.metrica(AbstractC15560l.tapsense("unexpected capacity (", i, "), should be in range [1, 8192]"));
            return null;
        }
        C2139l c2139l = this.f36080l;
        if (c2139l == null) {
            C2139l c2139lLoadAd = AbstractC7163l.loadAd();
            this.f36081l = c2139lLoadAd;
            this.f36080l = c2139lLoadAd;
            return c2139lLoadAd;
        }
        if (c2139l.crashlytics + i <= 8192 && c2139l.purchase) {
            return c2139l;
        }
        C2139l c2139lLoadAd2 = AbstractC7163l.loadAd();
        c2139l.amazon(c2139lLoadAd2);
        this.f36080l = c2139lLoadAd2;
        return c2139lLoadAd2;
    }

    public final long isVip(InterfaceC16090l interfaceC16090l) {
        long j = 0;
        while (true) {
            long jMo1064extends = interfaceC16090l.mo1064extends(this, 8192L);
            if (jMo1064extends == -1) {
                return j;
            }
            j += jMo1064extends;
        }
    }

    @Override // defpackage.InterfaceC14189l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final int mo1455l(int i, int i2, byte[] bArr) {
        AbstractC17463l.crashlytics(bArr.length, i, i2);
        C2139l c2139l = this.f36081l;
        if (c2139l == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, c2139l.loadAd());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = c2139l.yandex;
        int i4 = c2139l.loadAd;
        AbstractC8669l.advert(bArr2, i, i4, bArr, i4 + i3);
        c2139l.loadAd += i3;
        this.f36079l -= (long) iMin;
        if (AbstractC2044l.billing(c2139l)) {
            vip();
        }
        return iMin;
    }

    public final void mopub(C18476l c18476l, long j) {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = this.f36079l;
        if (j2 >= j) {
            c18476l.m4561package(this, j);
        } else {
            c18476l.m4561package(this, j2);
            throw new EOFException(AbstractC15560l.ads(this.f36079l, " bytes were written.", AbstractC0653l.Signature(j, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m4561package(C18476l c18476l, long j) {
        C2139l c2139lLoadAd;
        if (c18476l == this) {
            C8339l.metrica("source == this");
            return;
        }
        AbstractC17463l.amazon(c18476l.f36079l, 0L, j);
        while (j > 0) {
            if (j < c18476l.f36081l.loadAd()) {
                C2139l c2139l = this.f36080l;
                if (c2139l != null && c2139l.purchase) {
                    long j2 = ((long) c2139l.crashlytics) + j;
                    C2256l c2256l = c2139l.amazon;
                    if (j2 - ((long) ((c2256l == null || c2256l.yandex <= 0) ? c2139l.loadAd : 0)) <= 8192) {
                        c18476l.f36081l.billing(c2139l, (int) j);
                        c18476l.f36079l -= j;
                        this.f36079l += j;
                        return;
                    }
                }
                C2139l c2139l2 = c18476l.f36081l;
                int i = (int) j;
                if (i <= 0) {
                    c2139l2.getClass();
                } else if (i <= c2139l2.crashlytics - c2139l2.loadAd) {
                    if (i >= 1024) {
                        c2139lLoadAd = c2139l2.purchase();
                    } else {
                        c2139lLoadAd = AbstractC7163l.loadAd();
                        byte[] bArr = c2139l2.yandex;
                        byte[] bArr2 = c2139lLoadAd.yandex;
                        int i2 = c2139l2.loadAd;
                        AbstractC8669l.applovin(bArr, 0, i2, bArr2, i2 + i, 2);
                    }
                    c2139lLoadAd.crashlytics = c2139lLoadAd.loadAd + i;
                    c2139l2.loadAd += i;
                    C2139l c2139l3 = c2139l2.mopub;
                    if (c2139l3 != null) {
                        c2139l3.amazon(c2139lLoadAd);
                    } else {
                        c2139lLoadAd.billing = c2139l2;
                        c2139l2.mopub = c2139lLoadAd;
                    }
                    c18476l.f36081l = c2139lLoadAd;
                }
                C8339l.metrica("byteCount out of range");
                return;
            }
            C2139l c2139l4 = c18476l.f36081l;
            long jLoadAd = c2139l4.loadAd();
            C2139l c2139l5 = c2139l4.billing;
            C2139l c2139l6 = c2139l4.mopub;
            if (c2139l6 != null) {
                c2139l6.billing = c2139l5;
            }
            C2139l c2139l7 = c2139l4.billing;
            if (c2139l7 != null) {
                c2139l7.mopub = c2139l6;
            }
            c2139l4.billing = null;
            c2139l4.mopub = null;
            c18476l.f36081l = c2139l5;
            if (c2139l5 == null) {
                c18476l.f36080l = null;
            }
            if (this.f36081l == null) {
                this.f36081l = c2139l4;
                this.f36080l = c2139l4;
            } else {
                this.f36080l.amazon(c2139l4);
                C2139l c2139l8 = c2139l4.mopub;
                if (c2139l8 == null) {
                    C8339l.smaato("cannot compact");
                    return;
                }
                if (c2139l8.purchase) {
                    int i3 = c2139l4.crashlytics - c2139l4.loadAd;
                    int i4 = 8192 - c2139l8.crashlytics;
                    C2256l c2256l2 = c2139l8.amazon;
                    if (i3 <= i4 + ((c2256l2 == null || c2256l2.yandex <= 0) ? c2139l4.mopub.loadAd : 0)) {
                        C2139l c2139l9 = c2139l4.mopub;
                        c2139l4.billing(c2139l9, i3);
                        C2139l c2139l10 = c2139l4.billing;
                        C2139l c2139l11 = c2139l4.mopub;
                        if (c2139l11 != null) {
                            c2139l11.billing = c2139l10;
                        }
                        C2139l c2139l12 = c2139l4.billing;
                        if (c2139l12 != null) {
                            c2139l12.mopub = c2139l11;
                        }
                        c2139l4.billing = null;
                        c2139l4.mopub = null;
                        if (c2139l10 != null) {
                            C8339l.smaato("Check failed.");
                            return;
                        } else {
                            AbstractC7163l.yandex(c2139l4);
                            c2139l4 = c2139l9;
                        }
                    }
                }
                this.f36080l = c2139l4;
                if (c2139l4.mopub == null) {
                    this.f36081l = c2139l4;
                }
            }
            c18476l.f36079l -= jLoadAd;
            this.f36079l += jLoadAd;
            j -= jLoadAd;
        }
    }

    @Override // defpackage.InterfaceC14189l
    public final byte readByte() throws EOFException {
        C2139l c2139l = this.f36081l;
        if (c2139l == null) {
            ads(1L);
            throw null;
        }
        int iLoadAd = c2139l.loadAd();
        if (iLoadAd == 0) {
            vip();
            return readByte();
        }
        byte[] bArr = c2139l.yandex;
        int i = c2139l.loadAd;
        c2139l.loadAd = i + 1;
        byte b = bArr[i];
        this.f36079l--;
        if (iLoadAd == 1) {
            vip();
        }
        return b;
    }

    public final short readShort() throws EOFException {
        C2139l c2139l = this.f36081l;
        if (c2139l == null) {
            ads(2L);
            throw null;
        }
        int iLoadAd = c2139l.loadAd();
        if (iLoadAd < 2) {
            subscription(2L);
            if (iLoadAd == 0) {
                vip();
                return readShort();
            }
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = c2139l.yandex;
        int i = c2139l.loadAd;
        short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
        c2139l.loadAd = i + 2;
        this.f36079l -= 2;
        if (iLoadAd == 2) {
            vip();
        }
        return s;
    }

    @Override // defpackage.InterfaceC14189l
    public final boolean request(long j) {
        if (j >= 0) {
            return this.f36079l >= j;
        }
        C10754l.metrica(AbstractC2812l.subscription(j, "byteCount: ", " < 0"));
        return false;
    }

    public final long signatures(C18476l c18476l) {
        long j = this.f36079l;
        if (j > 0) {
            c18476l.m4561package(this, j);
        }
        return j;
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            C2139l c2139l = this.f36081l;
            if (c2139l == null) {
                throw new EOFException(AbstractC2812l.subscription(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j2, c2139l.crashlytics - c2139l.loadAd);
            long j3 = iMin;
            this.f36079l -= j3;
            j2 -= j3;
            int i = c2139l.loadAd + iMin;
            c2139l.loadAd = i;
            if (i == c2139l.crashlytics) {
                vip();
            }
        }
    }

    @Override // defpackage.InterfaceC14189l
    public final boolean subs() {
        return this.f36079l == 0;
    }

    @Override // defpackage.InterfaceC14189l
    public final void subscription(long j) throws EOFException {
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount: "));
            return;
        }
        if (this.f36079l >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f36079l + ", required: " + j + ')');
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m4562synchronized(byte b) {
        C2139l c2139lInmobi = inmobi(1);
        byte[] bArr = c2139lInmobi.yandex;
        int i = c2139lInmobi.crashlytics;
        c2139lInmobi.crashlytics = i + 1;
        bArr[i] = b;
        this.f36079l++;
    }

    public final String toString() {
        long j = this.f36079l;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.f36079l > 64 ? 1 : 0));
        int i = 0;
        for (C2139l c2139l = this.f36081l; c2139l != null; c2139l = c2139l.billing) {
            int i2 = 0;
            while (i < iMin && i2 < c2139l.loadAd()) {
                int i3 = i2 + 1;
                byte bCrashlytics = c2139l.crashlytics(i2);
                i++;
                char[] cArr = AbstractC17463l.yandex;
                sb.append(cArr[(bCrashlytics >> 4) & 15]);
                sb.append(cArr[bCrashlytics & 15]);
                i2 = i3;
            }
        }
        if (this.f36079l > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.f36079l + " hex=" + ((Object) sb) + ')';
    }

    public final void vip() {
        C2139l c2139l = this.f36081l;
        C2139l c2139l2 = c2139l.billing;
        this.f36081l = c2139l2;
        if (c2139l2 == null) {
            this.f36080l = null;
        } else {
            c2139l2.mopub = null;
        }
        c2139l.billing = null;
        AbstractC7163l.yandex(c2139l);
    }

    public final void write(byte[] bArr, int i, int i2) {
        AbstractC17463l.crashlytics(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            C2139l c2139lInmobi = inmobi(1);
            int iMin = Math.min(i2 - i3, c2139lInmobi.yandex()) + i3;
            AbstractC8669l.advert(bArr, c2139lInmobi.crashlytics, i3, c2139lInmobi.yandex, iMin);
            c2139lInmobi.crashlytics = (iMin - i3) + c2139lInmobi.crashlytics;
            i3 = iMin;
        }
        this.f36079l += (long) (i2 - i);
    }

    public final byte yandex(long j) {
        C2139l c2139l;
        long j2;
        long j3 = 0;
        if (j < 0 || j >= this.f36079l) {
            C18262l.adcel(AbstractC15560l.ads(this.f36079l, "))", AbstractC0653l.Signature(j, "position (", ") is not within the range [0..size(")));
            return (byte) 0;
        }
        C2139l c2139l2 = this.f36081l;
        if (j == 0) {
            return c2139l2.crashlytics(0);
        }
        c2139l2.getClass();
        long j4 = this.f36079l;
        if (j4 - j < j) {
            c2139l = this.f36080l;
            while (c2139l != null && j4 > j) {
                j4 -= (long) (c2139l.crashlytics - c2139l.loadAd);
                if (j4 <= j) {
                    break;
                }
                c2139l = c2139l.mopub;
            }
            j2 = j - j4;
        } else {
            c2139l = this.f36081l;
            while (c2139l != null) {
                long j5 = ((long) (c2139l.crashlytics - c2139l.loadAd)) + j3;
                if (j5 > j) {
                    break;
                }
                c2139l = c2139l.billing;
                j3 = j5;
            }
            j2 = j - j3;
        }
        return c2139l.crashlytics((int) j2);
    }

    public final void billing() {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.InterfaceC14189l
    public final C18476l crashlytics() {
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
