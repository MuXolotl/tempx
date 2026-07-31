package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2881l {
    public int admob;
    public int amazon;
    public int crashlytics;
    public C11395l isPro;
    public final byte[] yandex;
    public int loadAd = 0;
    public int purchase = 2;
    public int billing = -1;
    public int mopub = -1;
    public final ArrayList subs = new ArrayList();

    public C2881l(byte[] bArr, int i) {
        this.yandex = bArr;
        this.crashlytics = i;
    }

    public final C3844l admob() throws ProtocolException, EOFException {
        int iLoadAd = loadAd();
        int i = this.loadAd;
        int i2 = i + iLoadAd;
        if (i2 > this.crashlytics) {
            C8339l.vip();
            return null;
        }
        byte[] bArr = this.yandex;
        AbstractC9334l.crashlytics(bArr.length, i, iLoadAd);
        C3844l c3844l = new C3844l(AbstractC8669l.inmobi(i, i2, bArr));
        this.loadAd = i2;
        return c3844l;
    }

    public final C3844l amazon(int i) throws IOException {
        if (this.purchase != 6) {
            C8339l.smaato("Unexpected call to endMessage()");
            return null;
        }
        int i2 = this.amazon - 1;
        this.amazon = i2;
        if (i2 < 0 || this.mopub != -1) {
            C8339l.smaato("No corresponding call to beginMessage()");
            return null;
        }
        if (this.loadAd != this.crashlytics && i2 != 0) {
            C3010l.isPro(this.crashlytics, this.loadAd, " but was ", "Expected to end at ");
            return null;
        }
        this.crashlytics = i;
        C0869l c0869l = (C0869l) this.subs.get(i2);
        long j = c0869l.f2526l;
        return j > 0 ? c0869l.premium(j) : C3844l.f7950l;
    }

    public final int billing() throws IOException {
        int i = this.purchase;
        if (i == 7) {
            this.purchase = 2;
            return this.billing;
        }
        if (i != 6) {
            C8339l.smaato("Unexpected call to nextTag()");
            return 0;
        }
        while (this.loadAd < this.crashlytics) {
            int iPurchase = purchase();
            if (iPurchase == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.loadAd);
                sb.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
            }
            int i2 = iPurchase >>> 3;
            this.billing = i2;
            int i3 = iPurchase & 7;
            if (i3 == 0) {
                this.admob = 1;
                this.purchase = 0;
                return i2;
            }
            if (i3 == 1) {
                this.admob = 2;
                this.purchase = 1;
                return i2;
            }
            if (i3 == 2) {
                this.admob = 3;
                this.purchase = 2;
                int iPurchase2 = purchase();
                if (iPurchase2 < 0) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Negative length: ", iPurchase2, ". Reader position: ");
                    sbSignature.append(this.loadAd);
                    sbSignature.append(". Last read tag: ");
                    throw new ProtocolException(AbstractC0653l.adcel(sbSignature, this.billing, '.'));
                }
                if (this.mopub != -1) {
                    C18073l.admob();
                    return 0;
                }
                int i4 = this.crashlytics;
                this.mopub = i4;
                int i5 = this.loadAd + iPurchase2;
                this.crashlytics = i5;
                if (i5 <= i4) {
                    return this.billing;
                }
                C8339l.vip();
                return 0;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.loadAd);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(AbstractC0653l.adcel(sb2, this.billing, '.'));
                }
                if (i3 == 5) {
                    this.admob = 4;
                    this.purchase = 5;
                    return i2;
                }
                StringBuilder sbSignature2 = AbstractC2812l.Signature("Unexpected field encoding: ", i3, ". Reader position: ");
                sbSignature2.append(this.loadAd);
                sbSignature2.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sbSignature2, this.billing, '.'));
            }
            startapp(i2);
        }
        return -1;
    }

    public final int crashlytics() throws IOException {
        if (this.purchase != 2) {
            C8339l.smaato("Unexpected call to beginMessage()");
            return 0;
        }
        int i = this.amazon + 1;
        this.amazon = i;
        if (i > 100) {
            C18262l.metrica("Wire recursion limit exceeded");
            return 0;
        }
        ArrayList arrayList = this.subs;
        if (i > arrayList.size()) {
            arrayList.add(new C0869l());
        }
        int i2 = this.mopub;
        this.mopub = -1;
        this.purchase = 6;
        return i2;
    }

    public final String firebase() throws ProtocolException, EOFException {
        int iLoadAd = loadAd();
        int i = this.loadAd;
        int i2 = iLoadAd + i;
        if (i2 > this.crashlytics) {
            C8339l.vip();
            return null;
        }
        String strSubscription = AbstractC16648l.subscription(this.yandex, i, i2, 4);
        this.loadAd = i2;
        return strSubscription;
    }

    public final long isPro() throws IOException {
        int i = this.purchase;
        if (i != 1 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sb.append(this.purchase);
            sb.append(". Reader position: ");
            sb.append(this.loadAd);
            sb.append(". Last read tag: ");
            throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
        }
        int i2 = this.loadAd;
        int i3 = i2 + 8;
        if (i3 > this.crashlytics) {
            C8339l.vip();
            return 0L;
        }
        int i4 = i2 + 1;
        this.loadAd = i4;
        byte[] bArr = this.yandex;
        long j = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.loadAd = i5;
        long j2 = j | ((((long) bArr[i4]) & 255) << 8);
        int i6 = i2 + 3;
        this.loadAd = i6;
        long j3 = j2 | ((((long) bArr[i5]) & 255) << 16);
        int i7 = i2 + 4;
        this.loadAd = i7;
        long j4 = j3 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i2 + 5;
        this.loadAd = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i2 + 6;
        this.loadAd = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 40);
        int i10 = i2 + 7;
        this.loadAd = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 48);
        this.loadAd = i3;
        long j8 = ((((long) bArr[i10]) & 255) << 56) | j7;
        yandex(1);
        return j8;
    }

    public final int loadAd() throws ProtocolException {
        if (this.purchase == 2) {
            int i = this.crashlytics - this.loadAd;
            this.purchase = 6;
            this.crashlytics = this.mopub;
            this.mopub = -1;
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.purchase);
        sb.append(". Reader position: ");
        sb.append(this.loadAd);
        sb.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
    }

    public final void metrica() throws IOException {
        int i = this.purchase;
        if (i == 0) {
            vip();
            return;
        }
        if (i == 1) {
            isPro();
            return;
        }
        if (i != 2) {
            if (i == 5) {
                subs();
                return;
            } else {
                C8339l.smaato("Unexpected call to skip()");
                return;
            }
        }
        int iLoadAd = this.loadAd + loadAd();
        if (iLoadAd <= this.crashlytics) {
            this.loadAd = iLoadAd;
        } else {
            C8339l.vip();
        }
    }

    public final byte mopub() throws EOFException {
        int i = this.loadAd;
        if (i != this.crashlytics) {
            this.loadAd = i + 1;
            return this.yandex[i];
        }
        C8339l.vip();
        return (byte) 0;
    }

    public final int purchase() throws ProtocolException, EOFException {
        int i;
        byte bMopub = mopub();
        if (bMopub >= 0) {
            return bMopub;
        }
        int i2 = bMopub & 127;
        byte bMopub2 = mopub();
        if (bMopub2 >= 0) {
            i = bMopub2 << 7;
        } else {
            i2 |= (bMopub2 & 127) << 7;
            byte bMopub3 = mopub();
            if (bMopub3 >= 0) {
                i = bMopub3 << 14;
            } else {
                i2 |= (bMopub3 & 127) << 14;
                byte bMopub4 = mopub();
                if (bMopub4 < 0) {
                    int i3 = i2 | ((bMopub4 & 127) << 21);
                    byte bMopub5 = mopub();
                    int i4 = i3 | (bMopub5 << 28);
                    if (bMopub5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (mopub() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.loadAd);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
                    }
                    return i4;
                }
                i = bMopub4 << 21;
            }
        }
        return i | i2;
    }

    public final int remoteconfig() {
        int i = this.purchase;
        if (i == 0 || i == 2) {
            int iPurchase = purchase();
            yandex(0);
            return iPurchase;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.purchase);
        sb.append(". Reader position: ");
        sb.append(this.loadAd);
        sb.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
    }

    public final void smaato(int i) {
        int i2 = this.admob;
        AbstractC9361l.billing(i2).admob(new C13161l((InterfaceC16805l) this.subs.get(this.amazon - 1)), i, AbstractC9361l.billing(i2).loadAd(this));
    }

    public final void startapp(int i) throws IOException {
        while (this.loadAd < this.crashlytics) {
            int iPurchase = purchase();
            if (iPurchase == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.loadAd);
                sb.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
            }
            int i2 = iPurchase >>> 3;
            int i3 = iPurchase & 7;
            if (i3 == 0) {
                this.purchase = 0;
                vip();
            } else if (i3 == 1) {
                this.purchase = 1;
                isPro();
            } else if (i3 == 2) {
                int iPurchase2 = purchase();
                if (iPurchase2 < 0) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Negative length: ", iPurchase2, ". Reader position: ");
                    sbSignature.append(this.loadAd);
                    sbSignature.append(". Last read tag: ");
                    sbSignature.append(i2);
                    sbSignature.append('.');
                    throw new ProtocolException(sbSignature.toString());
                }
                int i4 = this.loadAd + iPurchase2;
                if (i4 > this.crashlytics) {
                    C8339l.vip();
                    return;
                }
                this.loadAd = i4;
            } else {
                if (i3 == 3) {
                    int i5 = this.amazon + 1;
                    this.amazon = i5;
                    if (i5 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        startapp(i2);
                        this.amazon--;
                    } catch (Throwable th) {
                        this.amazon--;
                        throw th;
                    }
                    this.amazon--;
                    throw th;
                }
                if (i3 == 4) {
                    if (i2 == i) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.loadAd + ". Last read tag: " + i2 + '.');
                }
                if (i3 != 5) {
                    StringBuilder sbSignature2 = AbstractC2812l.Signature("Unexpected field encoding: ", i3, ". Reader position: ");
                    sbSignature2.append(this.loadAd);
                    sbSignature2.append(". Last read tag: ");
                    sbSignature2.append(i2);
                    sbSignature2.append('.');
                    throw new ProtocolException(sbSignature2.toString());
                }
                this.purchase = 5;
                subs();
            }
        }
        C8339l.vip();
    }

    public final int subs() throws IOException {
        int i = this.purchase;
        if (i != 5 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sb.append(this.purchase);
            sb.append(". Reader position: ");
            sb.append(this.loadAd);
            sb.append(". Last read tag: ");
            throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
        }
        int i2 = this.loadAd;
        int i3 = i2 + 4;
        if (i3 > this.crashlytics) {
            C8339l.vip();
            return 0;
        }
        int i4 = i2 + 1;
        this.loadAd = i4;
        byte[] bArr = this.yandex;
        int i5 = bArr[i2] & 255;
        int i6 = i2 + 2;
        this.loadAd = i6;
        int i7 = ((bArr[i4] & 255) << 8) | i5;
        int i8 = i2 + 3;
        this.loadAd = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 16);
        this.loadAd = i3;
        int i10 = ((bArr[i8] & 255) << 24) | i9;
        yandex(5);
        return i10;
    }

    public final long vip() throws IOException {
        int i = this.purchase;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.purchase);
            sb.append(". Reader position: ");
            sb.append(this.loadAd);
            sb.append(". Last read tag: ");
            throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bMopub = mopub();
            j |= ((long) (bMopub & 127)) << i2;
            if ((bMopub & 128) == 0) {
                yandex(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("WireInput encountered a malformed varint. Reader position: ");
        sb2.append(this.loadAd);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb2, this.billing, '.'));
    }

    public final void yandex(int i) throws IOException {
        if (this.purchase == i) {
            this.purchase = 6;
            return;
        }
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        if (i2 > i3) {
            C3010l.isPro(this.crashlytics, this.loadAd, " but was ", "Expected to end at ");
        } else {
            if (i2 != i3) {
                this.purchase = 7;
                return;
            }
            this.crashlytics = this.mopub;
            this.mopub = -1;
            this.purchase = 6;
        }
    }
}
