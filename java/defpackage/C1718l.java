package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٌؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1718l {
    public int billing;
    public int crashlytics;
    public final InputStream purchase;
    public int subs;
    public int admob = Alert.DURATION_SHOW_INDEFINITELY;
    public final byte[] yandex = new byte[4096];
    public int loadAd = 0;
    public int amazon = 0;
    public int mopub = 0;

    public C1718l(InputStream inputStream) {
        this.purchase = inputStream;
    }

    public final void adcel(int i) throws C12383l {
        if (!tapsense(i)) {
            throw C12383l.loadAd();
        }
    }

    public final AbstractC14080l admob(C2630l c2630l, C3429l c3429l) throws C12383l {
        int iSmaato = smaato();
        loadAd();
        int iPurchase = purchase(iSmaato);
        this.subs++;
        AbstractC14080l abstractC14080l = (AbstractC14080l) c2630l.crashlytics(this, c3429l);
        yandex(0);
        this.subs--;
        amazon(iPurchase);
        return abstractC14080l;
    }

    public final boolean ads(int i, C11522l c11522l) throws IOException {
        boolean zAds;
        int i2 = i & 7;
        if (i2 == 0) {
            long jRemoteconfig = remoteconfig();
            c11522l.m3130while(i);
            c11522l.m3111implements(jRemoteconfig);
            return true;
        }
        if (i2 == 1) {
            long jFirebase = firebase();
            c11522l.m3130while(i);
            c11522l.m3119protected(jFirebase);
            return true;
        }
        if (i2 == 2) {
            C7362l c7362lBilling = billing();
            c11522l.m3130while(i);
            c11522l.m3130while(c7362lBilling.size());
            c11522l.m3129try(c7362lBilling);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new C12383l("Protocol message tag had invalid wire type.");
            }
            int iIsPro = isPro();
            c11522l.m3130while(i);
            c11522l.m3128transient(iIsPro);
            return true;
        }
        c11522l.m3130while(i);
        do {
            int iMetrica = metrica();
            if (iMetrica == 0) {
                break;
            }
            loadAd();
            this.subs++;
            zAds = ads(iMetrica, c11522l);
            this.subs--;
        } while (zAds);
        int i3 = ((i >>> 3) << 3) | 4;
        yandex(i3);
        c11522l.m3130while(i3);
        return true;
    }

    public final void amazon(int i) {
        this.admob = i;
        startapp();
    }

    public final C7362l billing() {
        int iSmaato = smaato();
        int i = this.loadAd;
        int i2 = this.amazon;
        if (iSmaato > i - i2 || iSmaato <= 0) {
            return iSmaato == 0 ? AbstractC7735l.f16231l : new C7362l(subs(iSmaato));
        }
        byte[] bArr = new byte[iSmaato];
        System.arraycopy(this.yandex, i2, bArr, 0, iSmaato);
        C7362l c7362l = new C7362l(bArr);
        this.amazon += iSmaato;
        return c7362l;
    }

    public final int crashlytics() {
        int i = this.admob;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.mopub + this.amazon);
    }

    public final long firebase() throws C12383l {
        int i = this.amazon;
        if (this.loadAd - i < 8) {
            adcel(8);
            i = this.amazon;
        }
        this.amazon = i + 8;
        byte[] bArr = this.yandex;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int isPro() throws C12383l {
        int i = this.amazon;
        if (this.loadAd - i < 4) {
            adcel(4);
            i = this.amazon;
        }
        this.amazon = i + 4;
        byte[] bArr = this.yandex;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final void loadAd() throws C12383l {
        if (this.subs >= 64) {
            throw new C12383l("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public final int metrica() throws C12383l {
        if (this.amazon == this.loadAd && !tapsense(1)) {
            this.billing = 0;
            return 0;
        }
        int iSmaato = smaato();
        this.billing = iSmaato;
        if ((iSmaato >>> 3) != 0) {
            return iSmaato;
        }
        throw new C12383l("Protocol message contained an invalid tag (zero).");
    }

    public final int mopub() {
        return smaato();
    }

    public final int purchase(int i) throws C12383l {
        if (i < 0) {
            throw new C12383l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.mopub + this.amazon + i;
        int i3 = this.admob;
        if (i2 > i3) {
            throw C12383l.loadAd();
        }
        this.admob = i2;
        startapp();
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long remoteconfig() {
        /*
            r12 = this;
            int r0 = r12.amazon
            int r1 = r12.loadAd
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.yandex
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.amazon = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.vip()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.amazon = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1718l.remoteconfig():long");
    }

    public final int smaato() {
        int i;
        int i2 = this.amazon;
        int i3 = this.loadAd;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.yandex;
            byte b = bArr[i2];
            if (b >= 0) {
                this.amazon = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.amazon = i5;
                return i;
            }
        }
        return (int) vip();
    }

    public final void startapp() {
        int i = this.loadAd + this.crashlytics;
        this.loadAd = i;
        int i2 = this.mopub + i;
        int i3 = this.admob;
        if (i2 <= i3) {
            this.crashlytics = 0;
            return;
        }
        int i4 = i2 - i3;
        this.crashlytics = i4;
        this.loadAd = i - i4;
    }

    public final byte[] subs(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return AbstractC3119l.yandex;
            }
            throw new C12383l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.mopub;
        int i3 = this.amazon;
        int i4 = i2 + i3 + i;
        int i5 = this.admob;
        if (i4 > i5) {
            subscription((i5 - i2) - i3);
            throw C12383l.loadAd();
        }
        byte[] bArr = this.yandex;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.loadAd - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.amazon = this.loadAd;
            int i7 = i - i6;
            if (i7 > 0) {
                adcel(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.amazon = i7;
            return bArr2;
        }
        int i8 = this.loadAd;
        this.mopub = i2 + i8;
        this.amazon = 0;
        this.loadAd = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.purchase.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw C12383l.loadAd();
                }
                this.mopub += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final void subscription(int i) throws C12383l {
        int i2 = this.loadAd;
        int i3 = this.amazon;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.amazon = i3 + i;
            return;
        }
        if (i < 0) {
            throw new C12383l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.mopub;
        int i6 = i5 + i3 + i;
        int i7 = this.admob;
        if (i6 > i7) {
            subscription((i7 - i5) - i3);
            throw C12383l.loadAd();
        }
        this.amazon = i2;
        adcel(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.loadAd;
            if (i8 <= i9) {
                this.amazon = i8;
                return;
            } else {
                i4 += i9;
                this.amazon = i9;
                adcel(1);
            }
        }
    }

    public final boolean tapsense(int i) throws IOException {
        int i2 = this.amazon;
        int i3 = i2 + i;
        int i4 = this.loadAd;
        if (i3 <= i4) {
            C8339l.smaato(AbstractC15560l.tapsense("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        if (this.mopub + i2 + i <= this.admob) {
            byte[] bArr = this.yandex;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.mopub += i2;
                this.loadAd -= i2;
                this.amazon = 0;
            }
            int i5 = this.loadAd;
            int i6 = this.purchase.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                C8339l.smaato(AbstractC15560l.tapsense("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy."));
                return false;
            }
            if (i6 > 0) {
                this.loadAd += i6;
                if ((this.mopub + i) - 67108864 > 0) {
                    throw new C12383l("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                startapp();
                if (this.loadAd >= i) {
                    return true;
                }
                return tapsense(i);
            }
        }
        return false;
    }

    public final long vip() throws C12383l {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.amazon == this.loadAd) {
                adcel(1);
            }
            int i2 = this.amazon;
            this.amazon = i2 + 1;
            byte b = this.yandex[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new C12383l("CodedInputStream encountered a malformed varint.");
    }

    public final void yandex(int i) throws C12383l {
        if (this.billing != i) {
            throw new C12383l("Protocol message end-group tag did not match expected tag.");
        }
    }
}
