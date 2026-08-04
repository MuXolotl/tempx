package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: lۚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18567l implements InterfaceC9273l, InterfaceC11512l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final byte[] f36235l = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final byte[] f36236l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f36237l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f36238l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f36239l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final byte[] f36240l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f36241l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC2441l f36242l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final byte[] f36243l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final byte[] f36244l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10358l f36245l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final short[] f36246l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f36247l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f36248l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final byte[] f36249l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f36250l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[][] f36251l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte[] f36252l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final short[] f36253l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public byte[] f36254l;

    public C18567l(EnumC2441l enumC2441l) {
        this.f36241l = new byte[32];
        this.f36237l = new byte[32];
        this.f36248l = new byte[32];
        this.f36247l = new byte[32];
        this.f36251l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f36238l = new byte[32];
        C10358l c10358l = new C10358l();
        this.f36245l = c10358l;
        this.f36249l = new byte[32];
        this.f36236l = new byte[8];
        this.f36253l = new short[16];
        this.f36246l = new short[16];
        this.f36240l = new byte[32];
        this.f36244l = new byte[32];
        this.f36254l = new byte[32];
        this.f36243l = new byte[32];
        this.f36242l = enumC2441l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        byte[] bArrAmazon = C10358l.amazon("D-A");
        this.f36252l = bArrAmazon;
        c10358l.init(true, new C2294l(null, bArrAmazon));
        reset();
    }

    public final void admob(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f36247l;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }

    public final void amazon(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f36236l;
            if (i >= 8) {
                System.arraycopy(bArr, 8, bArr, 0, 24);
                System.arraycopy(bArr2, 0, bArr, 24, 8);
                return;
            } else {
                bArr2[i] = (byte) (bArr[i] ^ bArr[i + 8]);
                i++;
            }
        }
    }

    public final void billing(byte[] bArr) {
        short[] sArr;
        int i = 0;
        while (true) {
            int length = bArr.length / 2;
            sArr = this.f36253l;
            if (i >= length) {
                break;
            }
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
            i++;
        }
        short s = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        short[] sArr2 = this.f36246l;
        sArr2[15] = s;
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            int i4 = i3 * 2;
            short s2 = sArr2[i3];
            bArr[i4 + 1] = (byte) (s2 >> 8);
            bArr[i4] = (byte) s2;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        long j = this.f36250l * 8;
        byte[] bArr2 = this.f36237l;
        AbstractC10000l.pro(j, bArr2, 0);
        while (this.f36239l != 0) {
            update((byte) 0);
        }
        mopub(bArr2);
        mopub(this.f36247l);
        byte[] bArr3 = this.f36241l;
        System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C18567l c18567l = (C18567l) interfaceC11512l;
        byte[] bArr = c18567l.f36252l;
        this.f36252l = bArr;
        this.f36245l.init(true, new C2294l(null, bArr));
        reset();
        byte[] bArr2 = c18567l.f36241l;
        System.arraycopy(bArr2, 0, this.f36241l, 0, bArr2.length);
        byte[] bArr3 = c18567l.f36237l;
        System.arraycopy(bArr3, 0, this.f36237l, 0, bArr3.length);
        byte[] bArr4 = c18567l.f36248l;
        System.arraycopy(bArr4, 0, this.f36248l, 0, bArr4.length);
        byte[] bArr5 = c18567l.f36247l;
        System.arraycopy(bArr5, 0, this.f36247l, 0, bArr5.length);
        byte[][] bArr6 = c18567l.f36251l;
        byte[] bArr7 = bArr6[1];
        byte[][] bArr8 = this.f36251l;
        System.arraycopy(bArr7, 0, bArr8[1], 0, bArr7.length);
        byte[] bArr9 = bArr6[2];
        System.arraycopy(bArr9, 0, bArr8[2], 0, bArr9.length);
        byte[] bArr10 = bArr6[3];
        System.arraycopy(bArr10, 0, bArr8[3], 0, bArr10.length);
        byte[] bArr11 = c18567l.f36238l;
        System.arraycopy(bArr11, 0, this.f36238l, 0, bArr11.length);
        this.f36239l = c18567l.f36239l;
        this.f36250l = c18567l.f36250l;
    }

    public final void mopub(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = this.f36248l;
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        byte[] bArr4 = this.f36241l;
        byte[] bArr5 = this.f36244l;
        System.arraycopy(bArr4, 0, bArr5, 0, 32);
        System.arraycopy(bArr3, 0, this.f36254l, 0, 32);
        int i = 0;
        while (true) {
            bArr2 = this.f36243l;
            if (i >= 32) {
                break;
            }
            bArr2[i] = (byte) (bArr5[i] ^ this.f36254l[i]);
            i++;
        }
        C13886l c13886l = new C13886l(purchase(bArr2));
        C10358l c10358l = this.f36245l;
        c10358l.init(true, c13886l);
        byte[] bArr6 = this.f36240l;
        c10358l.tapsense(0, 0, bArr4, bArr6);
        for (int i2 = 1; i2 < 4; i2++) {
            amazon(bArr5);
            for (int i3 = 0; i3 < 32; i3++) {
                bArr5[i3] = (byte) (bArr5[i3] ^ this.f36251l[i2][i3]);
            }
            byte[] bArr7 = this.f36254l;
            amazon(bArr7);
            amazon(bArr7);
            this.f36254l = bArr7;
            for (int i4 = 0; i4 < 32; i4++) {
                bArr2[i4] = (byte) (bArr5[i4] ^ this.f36254l[i4]);
            }
            int i5 = i2 * 8;
            c10358l.init(true, new C13886l(purchase(bArr2)));
            c10358l.tapsense(i5, i5, bArr4, bArr6);
        }
        for (int i6 = 0; i6 < 12; i6++) {
            billing(bArr6);
        }
        for (int i7 = 0; i7 < 32; i7++) {
            bArr6[i7] = (byte) (bArr6[i7] ^ bArr3[i7]);
        }
        billing(bArr6);
        for (int i8 = 0; i8 < 32; i8++) {
            bArr6[i8] = (byte) (bArr4[i8] ^ bArr6[i8]);
        }
        for (int i9 = 0; i9 < 61; i9++) {
            billing(bArr6);
        }
        System.arraycopy(bArr6, 0, bArr4, 0, bArr4.length);
    }

    public final byte[] purchase(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f36249l;
            if (i >= 8) {
                return bArr2;
            }
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
            i++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        byte[][] bArr;
        this.f36250l = 0L;
        this.f36239l = 0;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f36241l;
            if (i >= bArr2.length) {
                break;
            }
            bArr2[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.f36237l;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.f36248l;
            if (i3 >= bArr4.length) {
                break;
            }
            bArr4[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            bArr = this.f36251l;
            byte[] bArr5 = bArr[1];
            if (i4 >= bArr5.length) {
                break;
            }
            bArr5[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i5 >= bArr6.length) {
                break;
            }
            bArr6[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr7 = this.f36247l;
            if (i6 >= bArr7.length) {
                break;
            }
            bArr7[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr8 = this.f36238l;
            if (i7 >= bArr8.length) {
                System.arraycopy(f36235l, 0, bArr[2], 0, 32);
                return;
            } else {
                bArr8[i7] = 0;
                i7++;
            }
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f36239l != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f36238l;
            if (i2 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            admob(bArr2);
            mopub(bArr2);
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f36250l += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C18567l(this);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f36239l;
        int i2 = i + 1;
        this.f36239l = i2;
        byte[] bArr = this.f36238l;
        bArr[i] = b;
        if (i2 == bArr.length) {
            admob(bArr);
            mopub(bArr);
            this.f36239l = 0;
        }
        this.f36250l++;
    }

    public C18567l() {
        this(EnumC2441l.f5219l);
    }

    public C18567l(C18567l c18567l) {
        this.f36241l = new byte[32];
        this.f36237l = new byte[32];
        this.f36248l = new byte[32];
        this.f36247l = new byte[32];
        this.f36251l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f36238l = new byte[32];
        this.f36245l = new C10358l();
        this.f36249l = new byte[32];
        this.f36236l = new byte[8];
        this.f36253l = new short[16];
        this.f36246l = new short[16];
        this.f36240l = new byte[32];
        this.f36244l = new byte[32];
        this.f36254l = new byte[32];
        this.f36243l = new byte[32];
        this.f36242l = c18567l.f36242l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        loadAd(c18567l);
    }

    public C18567l(byte[] bArr) {
        this.f36241l = new byte[32];
        this.f36237l = new byte[32];
        this.f36248l = new byte[32];
        this.f36247l = new byte[32];
        this.f36251l = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f36238l = new byte[32];
        C10358l c10358l = new C10358l();
        this.f36245l = c10358l;
        this.f36249l = new byte[32];
        this.f36236l = new byte[8];
        this.f36253l = new short[16];
        this.f36246l = new short[16];
        this.f36240l = new byte[32];
        this.f36244l = new byte[32];
        this.f36254l = new byte[32];
        this.f36243l = new byte[32];
        this.f36242l = EnumC2441l.f5219l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        this.f36252l = bArrCrashlytics;
        c10358l.init(true, new C2294l(null, bArrCrashlytics));
        reset();
    }
}
