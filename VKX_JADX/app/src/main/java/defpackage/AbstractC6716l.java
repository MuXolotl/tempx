package defpackage;

import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: lؙۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6716l {
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int isPro;
    public final int loadAd = 4;
    public final int mopub;
    public final int purchase;
    public final int subs;
    public final int yandex;

    public AbstractC6716l(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.yandex = i;
        int i7 = (i * 8) / 4;
        this.amazon = i7;
        if (i > 8) {
            if (i <= 136) {
                i6 = 3;
            } else {
                if (i > 256) {
                    C8339l.metrica("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                    throw null;
                }
                this.purchase = 4;
            }
            this.crashlytics = i7 + this.purchase;
            this.billing = i2;
            this.mopub = i3;
            this.admob = i4;
            this.subs = i5;
            this.isPro = i5 / i2;
        }
        i6 = 2;
        this.purchase = i6;
        this.crashlytics = i7 + this.purchase;
        this.billing = i2;
        this.mopub = i3;
        this.admob = i4;
        this.subs = i5;
        this.isPro = i5 / i2;
    }

    public static byte[] admob(C18097l c18097l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        C11644l c11644l;
        C5138l c5138l;
        int i;
        byte[] bArr8;
        AbstractC6716l abstractC6716lLoadAd = c18097l.loadAd.loadAd();
        abstractC6716lLoadAd.mopub(bArr3);
        int i2 = abstractC6716lLoadAd.billing;
        C7026l c7026l = new C7026l(8, abstractC6716lLoadAd);
        byte[] bArrPurchase = abstractC6716lLoadAd.purchase(bArr2, bArr7, bArr5, bArr6);
        C9489l c9489lCrashlytics = abstractC6716lLoadAd.crashlytics(bArrPurchase, bArr3, bArr4, bArr5, bArr6);
        byte[] bArr9 = bArrPurchase;
        byte[] bArr10 = (byte[]) c9489lCrashlytics.crashlytics;
        long j = c9489lCrashlytics.loadAd;
        int i3 = c9489lCrashlytics.yandex;
        int i4 = 0;
        C5138l c5138l2 = new C5138l((byte) 0, 3);
        c5138l2.m1715l(3);
        c5138l2.m1718l(j);
        c5138l2.m1709const(i3);
        C5138l c5138l3 = new C5138l(c5138l2);
        int i5 = abstractC6716lLoadAd.mopub;
        int i6 = abstractC6716lLoadAd.admob;
        int[] iArrStartapp = C7026l.startapp(i5, i6, bArr10);
        C18396l[] c18396lArr = new C18396l[i6];
        while (i4 < i6) {
            int i7 = iArrStartapp[i4];
            int i8 = 1;
            c5138l3.m1715l(6);
            c5138l3.m1709const(c5138l2.m1711goto());
            c5138l3.m1714l(0);
            int i9 = i4 << i5;
            c5138l3.m1717l(i9 + i7);
            byte[] bArrAmazon = abstractC6716lLoadAd.amazon(c5138l3, bArr3, bArr);
            byte[] bArr11 = bArr9;
            int i10 = i4;
            int i11 = i6;
            AbstractC10000l.isPro(3, 16, (byte[]) c5138l3.f11181l);
            byte[][] bArr12 = new byte[i5][];
            int i12 = 0;
            while (i12 < i5) {
                int i13 = i9 + (((i7 >>> i12) ^ 1) << i12);
                int i14 = i12;
                if (((i13 >>> i12) << i14) != i13) {
                    bArr8 = null;
                    i = i2;
                    c5138l = c5138l3;
                } else {
                    LinkedList linkedList = new LinkedList();
                    C5138l c5138l4 = new C5138l(c5138l3);
                    c5138l = c5138l3;
                    int i15 = 0;
                    while (i15 < (i8 << i14)) {
                        c5138l4.m1715l(6);
                        c5138l4.m1709const(c5138l.m1711goto());
                        c5138l4.m1714l(0);
                        int i16 = i13 + i15;
                        c5138l4.m1717l(i16);
                        int i17 = i15;
                        byte[] bArrAmazon2 = abstractC6716lLoadAd.amazon(c5138l4, bArr3, bArr);
                        int i18 = i2;
                        AbstractC10000l.isPro(3, 16, (byte[]) c5138l4.f11181l);
                        byte[] bArrYandex = abstractC6716lLoadAd.yandex(c5138l4, bArr3, bArrAmazon2);
                        int i19 = i8;
                        c5138l4.m1714l(i19);
                        int i20 = i19;
                        int i21 = i16;
                        while (true) {
                            i8 = i19;
                            if (linkedList.isEmpty() || ((C1943l) linkedList.get(0)).loadAd != i20) {
                                break;
                            }
                            i21 = (i21 - 1) / 2;
                            c5138l4.m1717l(i21);
                            bArrYandex = abstractC6716lLoadAd.loadAd(bArr3, c5138l4, ((C1943l) linkedList.remove(0)).yandex, bArrYandex);
                            i20++;
                            c5138l4.m1714l(i20);
                            i19 = i8;
                        }
                        linkedList.add(0, new C1943l(bArrYandex, i20));
                        i15 = i17 + 1;
                        bArr = bArr;
                        i2 = i18;
                    }
                    i = i2;
                    bArr8 = ((C1943l) linkedList.get(0)).yandex;
                }
                bArr12[i14] = bArr8;
                i12 = i14 + 1;
                bArr = bArr;
                i5 = i5;
                c5138l3 = c5138l;
                i2 = i;
            }
            c18396lArr[i10] = new C18396l(bArrAmazon, bArr12, false, 17);
            i4 = i10 + 1;
            bArr9 = bArr11;
            i6 = i11;
        }
        byte[] bArr13 = bArr9;
        int i22 = i2;
        int i23 = i6;
        C5138l c5138l5 = new C5138l((byte) 0, 3);
        c5138l5.m1715l(3);
        c5138l5.m1718l(j);
        c5138l5.m1709const(i3);
        byte[] bArrAd = c7026l.ad(c18396lArr, bArr10, bArr3, c5138l5);
        byte[] bArr14 = new byte[32];
        AbstractC10000l.isPro(2, 16, bArr14);
        Arrays.fill(bArr14, 20, 32, (byte) 0);
        C11644l c11644l2 = new C11644l(abstractC6716lLoadAd, bArr, bArr3);
        C5138l c5138l6 = new C5138l((byte) 0, 3);
        c5138l6.m1721return(0);
        c5138l6.m1718l(j);
        C13568l c13568lM3176l = c11644l2.m3176l(bArrAd, bArr, i3, bArr3, c5138l6);
        C13568l[] c13568lArr = new C13568l[i22];
        c13568lArr[0] = c13568lM3176l;
        c5138l6.m1721return(0);
        c5138l6.m1718l(j);
        byte[] bArrM3177l = c11644l2.m3177l(i3, c13568lM3176l, bArrAd, bArr3, c5138l6);
        int i24 = 1;
        while (i24 < i22) {
            int i25 = abstractC6716lLoadAd.isPro;
            int i26 = (int) (((long) ((1 << i25) - 1)) & j);
            j >>>= i25;
            c5138l6.m1721return(i24);
            c5138l6.m1718l(j);
            C13568l c13568lM3176l2 = c11644l2.m3176l(bArrM3177l, (byte[]) c11644l2.f23358l, i26, (byte[]) c11644l2.f23357l, c5138l6);
            c13568lArr[i24] = c13568lM3176l2;
            if (i24 < i22 - 1) {
                c11644l = c11644l2;
                bArrM3177l = c11644l.m3177l(i26, c13568lM3176l2, bArrM3177l, (byte[]) c11644l2.f23357l, c5138l6);
            } else {
                c11644l = c11644l2;
            }
            i24++;
            c11644l2 = c11644l;
        }
        byte[][] bArr15 = new byte[i22][];
        for (int i27 = 0; i27 != i22; i27++) {
            C13568l c13568l = c13568lArr[i27];
            bArr15[i27] = AbstractC14024l.mopub((byte[]) c13568l.f26581l, AbstractC14024l.isPro((byte[][]) c13568l.f26580l));
        }
        byte[] bArrIsPro = AbstractC14024l.isPro(bArr15);
        byte[][] bArr16 = new byte[i23 + 2][];
        bArr16[0] = bArr13;
        int i28 = 0;
        while (i28 != i23) {
            int i29 = i28 + 1;
            C18396l c18396l = c18396lArr[i28];
            bArr16[i29] = AbstractC14024l.mopub((byte[]) c18396l.f35933l, AbstractC14024l.isPro((byte[][]) c18396l.f35934l));
            i28 = i29;
        }
        bArr16[i23 + 1] = bArrIsPro;
        return AbstractC14024l.isPro(bArr16);
    }

    public static boolean subs(C18097l c18097l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC6716l abstractC6716lLoadAd = c18097l.loadAd.loadAd();
        abstractC6716lLoadAd.mopub(bArr);
        C5138l c5138l = new C5138l((byte) 0, 3);
        int i = abstractC6716lLoadAd.admob;
        int i2 = abstractC6716lLoadAd.mopub;
        int i3 = ((i2 + 1) * i) + 1 + abstractC6716lLoadAd.subs;
        int i4 = abstractC6716lLoadAd.billing;
        int i5 = abstractC6716lLoadAd.crashlytics;
        int i6 = abstractC6716lLoadAd.yandex;
        if (((i4 * i5) + i3) * i6 != bArr5.length) {
            return false;
        }
        C4816l c4816l = new C4816l(i6, i, i2, i4, abstractC6716lLoadAd.isPro, i5, bArr5);
        byte[] bArr6 = (byte[]) c4816l.f9860l;
        C18396l[] c18396lArr = (C18396l[]) c4816l.f9859l;
        C13568l[] c13568lArr = (C13568l[]) c4816l.f9862l;
        C9489l c9489lCrashlytics = abstractC6716lLoadAd.crashlytics(bArr6, bArr, bArr2, bArr3, bArr4);
        byte[] bArr7 = (byte[]) c9489lCrashlytics.crashlytics;
        long j = c9489lCrashlytics.loadAd;
        int i7 = c9489lCrashlytics.yandex;
        c5138l.m1715l(3);
        c5138l.m1721return(0);
        c5138l.m1718l(j);
        c5138l.m1709const(i7);
        byte[] bArrAd = new C7026l(8, abstractC6716lLoadAd).ad(c18396lArr, bArr7, bArr, c5138l);
        c5138l.m1715l(2);
        c5138l.m1721return(0);
        c5138l.m1718l(j);
        c5138l.m1709const(i7);
        C11644l c11644l = new C11644l(abstractC6716lLoadAd, (byte[]) null, bArr);
        C5138l c5138l2 = new C5138l((byte) 0, 3);
        C13568l c13568l = c13568lArr[0];
        c5138l2.m1721return(0);
        c5138l2.m1718l(j);
        byte[] bArrM3177l = c11644l.m3177l(i7, c13568l, bArrAd, bArr, c5138l2);
        int i8 = 1;
        while (true) {
            AbstractC6716l abstractC6716l = (AbstractC6716l) c11644l.f23361l;
            if (i8 >= abstractC6716l.billing) {
                return Arrays.equals(bArr2, bArrM3177l);
            }
            int i9 = abstractC6716l.isPro;
            int i10 = (int) (((long) ((1 << i9) - 1)) & j);
            j >>>= i9;
            C13568l c13568l2 = c13568lArr[i8];
            c5138l2.m1721return(i8);
            c5138l2.m1718l(j);
            bArrM3177l = c11644l.m3177l(i10, c13568l2, bArrM3177l, bArr, c5138l2);
            i8++;
        }
    }

    public abstract byte[] amazon(C5138l c5138l, byte[] bArr, byte[] bArr2);

    public abstract byte[] billing(C5138l c5138l, byte[] bArr, byte[] bArr2);

    public abstract C9489l crashlytics(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public abstract byte[] loadAd(byte[] bArr, C5138l c5138l, byte[] bArr2, byte[] bArr3);

    public abstract void mopub(byte[] bArr);

    public abstract byte[] purchase(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract byte[] yandex(C5138l c5138l, byte[] bArr, byte[] bArr2);
}
