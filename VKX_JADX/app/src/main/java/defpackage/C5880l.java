package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5880l implements InterfaceC9273l, InterfaceC11512l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final short[] f12382l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f12391l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long[] f12392l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long[] f12393l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC2441l f12394l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long[] f12395l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long[] f12396l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final short[] f12397l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f12398l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long[] f12399l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long[] f12400l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final int[] f12388l = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, ModuleDescriptor.MODULE_VERSION, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final long[] f12387l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final long[] f12381l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final long[] f12389l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final long[] f12386l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final long[] f12383l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final long[] f12385l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final long[] f12390l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final long[] f12384l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        short[] sArr = new short[32];
        f12382l = sArr;
        sArr[31] = 8;
        for (int i = 0; i < 256; i++) {
            int i2 = f12388l[i];
            int i3 = ((-(i2 >>> 7)) & 285) ^ (i2 << 1);
            int i4 = ((-(i3 >>> 7)) & 285) ^ (i3 << 1);
            int i5 = i4 ^ i2;
            int i6 = ((-(i4 >>> 7)) & 285) ^ (i4 << 1);
            int i7 = i6 ^ i2;
            f12387l[i] = amazon(i2, i2, i4, i2, i6, i5, i3, i7);
            f12381l[i] = amazon(i7, i2, i2, i4, i2, i6, i5, i3);
            f12389l[i] = amazon(i3, i7, i2, i2, i4, i2, i6, i5);
            f12386l[i] = amazon(i5, i3, i7, i2, i2, i4, i2, i6);
            f12383l[i] = amazon(i6, i5, i3, i7, i2, i2, i4, i2);
            f12385l[i] = amazon(i2, i6, i5, i3, i7, i2, i2, i4);
            f12390l[i] = amazon(i4, i2, i6, i5, i3, i7, i2, i2);
            f12384l[i] = amazon(i2, i4, i2, i6, i5, i3, i7, i2);
        }
    }

    public C5880l() {
        long[] jArr = new long[11];
        this.f12395l = jArr;
        this.f12391l = new byte[64];
        this.f12398l = 0;
        this.f12397l = new short[32];
        this.f12400l = new long[8];
        this.f12392l = new long[8];
        this.f12393l = new long[8];
        this.f12399l = new long[8];
        this.f12396l = new long[8];
        jArr[0] = 0;
        for (int i = 1; i <= 10; i++) {
            int i2 = (i - 1) * 8;
            this.f12395l[i] = (((((((f12387l[i2] & (-72057594037927936L)) ^ (f12381l[i2 + 1] & 71776119061217280L)) ^ (f12389l[i2 + 2] & 280375465082880L)) ^ (f12386l[i2 + 3] & 1095216660480L)) ^ (f12383l[i2 + 4] & 4278190080L)) ^ (f12385l[i2 + 5] & 16711680)) ^ (f12390l[i2 + 6] & 65280)) ^ (f12384l[i2 + 7] & 255);
        }
        this.f12394l = EnumC2441l.f5219l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }

    public static long amazon(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            bArr2[i3] = (byte) (this.f12397l[i3] & 255);
        }
        int i4 = this.f12398l;
        byte[] bArr3 = this.f12391l;
        bArr3[i4] = (byte) (bArr3[i4] | 128);
        int i5 = i4 + 1;
        this.f12398l = i5;
        if (i5 == bArr3.length) {
            purchase();
        }
        if (this.f12398l > 32) {
            while (this.f12398l != 0) {
                update((byte) 0);
            }
        }
        while (this.f12398l <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArr2, 0, bArr3, 32, 32);
        purchase();
        while (true) {
            long[] jArr = this.f12400l;
            if (i2 >= jArr.length) {
                reset();
                return 64;
            }
            AbstractC10000l.Signature(jArr[i2], bArr, i);
            i += 8;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return 64;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return 64;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C5880l c5880l = (C5880l) interfaceC11512l;
        long[] jArr = c5880l.f12395l;
        long[] jArr2 = this.f12395l;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = c5880l.f12391l;
        byte[] bArr2 = this.f12391l;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f12398l = c5880l.f12398l;
        short[] sArr = c5880l.f12397l;
        short[] sArr2 = this.f12397l;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = c5880l.f12400l;
        long[] jArr4 = this.f12400l;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = c5880l.f12392l;
        long[] jArr6 = this.f12392l;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = c5880l.f12393l;
        long[] jArr8 = this.f12393l;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = c5880l.f12399l;
        long[] jArr10 = this.f12399l;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = c5880l.f12396l;
        long[] jArr12 = this.f12396l;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    public final void purchase() {
        long[] jArr;
        int i;
        byte[] bArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        long[] jArr7;
        long[] jArr8;
        long[] jArr9;
        long[] jArr10;
        long[] jArr11;
        long[] jArr12;
        long[] jArr13;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            jArr = this.f12399l;
            int length = jArr.length;
            i = 8;
            bArr = this.f12391l;
            if (i3 >= length) {
                break;
            }
            jArr[i3] = AbstractC10000l.loadAd(i4, bArr);
            i4 += 8;
            i3++;
        }
        int i5 = 0;
        while (true) {
            jArr2 = this.f12400l;
            jArr3 = this.f12396l;
            jArr4 = this.f12392l;
            if (i5 >= 8) {
                break;
            }
            long j = jArr[i5];
            long j2 = jArr2[i5];
            jArr4[i5] = j2;
            jArr3[i5] = j ^ j2;
            i5++;
        }
        int i6 = 1;
        while (i6 <= 10) {
            int i7 = i2;
            while (true) {
                jArr5 = f12384l;
                jArr6 = f12390l;
                jArr7 = f12385l;
                jArr8 = f12383l;
                jArr9 = f12386l;
                jArr10 = f12389l;
                jArr11 = f12381l;
                jArr12 = f12387l;
                jArr13 = this.f12393l;
                if (i7 >= i) {
                    break;
                }
                jArr13[i7] = 0;
                long j3 = jArr12[((int) (jArr4[i7 & 7] >>> 56)) & 255];
                jArr13[i7] = j3;
                int i8 = i;
                long j4 = jArr11[((int) (jArr4[(i7 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr13[i7] = j4;
                long j5 = j4 ^ jArr10[((int) (jArr4[(i7 - 2) & 7] >>> 40)) & 255];
                jArr13[i7] = j5;
                long j6 = j5 ^ jArr9[((int) (jArr4[(i7 - 3) & 7] >>> 32)) & 255];
                jArr13[i7] = j6;
                long j7 = j6 ^ jArr8[((int) (jArr4[(i7 - 4) & 7] >>> 24)) & 255];
                jArr13[i7] = j7;
                long j8 = j7 ^ jArr7[((int) (jArr4[(i7 - 5) & 7] >>> 16)) & 255];
                jArr13[i7] = j8;
                long j9 = j8 ^ jArr6[((int) (jArr4[(i7 - 6) & 7] >>> i8)) & 255];
                jArr13[i7] = j9;
                jArr13[i7] = j9 ^ jArr5[((int) jArr4[(i7 - 7) & 7]) & 255];
                i7++;
                bArr = bArr;
                i = i8;
            }
            int i9 = i;
            byte[] bArr2 = bArr;
            System.arraycopy(jArr13, i2, jArr4, i2, jArr4.length);
            jArr4[i2] = jArr4[i2] ^ this.f12395l[i6];
            int i10 = i2;
            for (int i11 = i9; i10 < i11; i11 = 8) {
                long j10 = jArr4[i10];
                jArr13[i10] = j10;
                long j11 = jArr12[((int) (jArr3[i10 & 7] >>> 56)) & 255] ^ j10;
                jArr13[i10] = j11;
                long j12 = j11 ^ jArr11[((int) (jArr3[(i10 - 1) & 7] >>> 48)) & 255];
                jArr13[i10] = j12;
                long j13 = j12 ^ jArr10[((int) (jArr3[(i10 - 2) & 7] >>> 40)) & 255];
                jArr13[i10] = j13;
                long j14 = j13 ^ jArr9[((int) (jArr3[(i10 - 3) & 7] >>> 32)) & 255];
                jArr13[i10] = j14;
                long j15 = j14 ^ jArr8[((int) (jArr3[(i10 - 4) & 7] >>> 24)) & 255];
                jArr13[i10] = j15;
                long j16 = j15 ^ jArr7[((int) (jArr3[(i10 - 5) & 7] >>> 16)) & 255];
                jArr13[i10] = j16;
                long j17 = j16 ^ jArr6[((int) (jArr3[(i10 - 6) & 7] >>> 8)) & 255];
                jArr13[i10] = j17;
                jArr13[i10] = j17 ^ jArr5[((int) jArr3[(i10 - 7) & 7]) & 255];
                i10++;
                i6 = i6;
            }
            System.arraycopy(jArr13, 0, jArr3, 0, jArr3.length);
            i6++;
            bArr = bArr2;
            i2 = 0;
            i = 8;
        }
        byte[] bArr3 = bArr;
        int i12 = i;
        for (int i13 = 0; i13 < i12; i13++) {
            jArr2[i13] = jArr2[i13] ^ (jArr3[i13] ^ jArr[i13]);
        }
        this.f12398l = 0;
        Arrays.fill(bArr3, (byte) 0);
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f12398l = 0;
        Arrays.fill(this.f12397l, (short) 0);
        Arrays.fill(this.f12391l, (byte) 0);
        Arrays.fill(this.f12400l, 0L);
        Arrays.fill(this.f12392l, 0L);
        Arrays.fill(this.f12393l, 0L);
        Arrays.fill(this.f12399l, 0L);
        Arrays.fill(this.f12396l, 0L);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f12398l;
        byte[] bArr = this.f12391l;
        bArr[i] = b;
        int i2 = i + 1;
        this.f12398l = i2;
        if (i2 == bArr.length) {
            purchase();
        }
        short[] sArr = this.f12397l;
        int i3 = 0;
        for (int length = sArr.length - 1; length >= 0; length--) {
            int i4 = (sArr[length] & 255) + f12382l[length] + i3;
            i3 = i4 >>> 8;
            sArr[length] = (short) (i4 & 255);
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C5880l(this);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public C5880l(C5880l c5880l) {
        this.f12395l = new long[11];
        this.f12391l = new byte[64];
        this.f12398l = 0;
        this.f12397l = new short[32];
        this.f12400l = new long[8];
        this.f12392l = new long[8];
        this.f12393l = new long[8];
        this.f12399l = new long[8];
        this.f12396l = new long[8];
        this.f12394l = c5880l.f12394l;
        loadAd(c5880l);
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }
}
