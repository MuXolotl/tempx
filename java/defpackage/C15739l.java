package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٕٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15739l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f30909l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f30910l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f30911l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final byte[] f30912l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f30913l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f30914l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final byte[] f30915l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f30916l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f30917l;

    public C15739l(C11196l c11196l, byte[] bArr, C3427l c3427l) throws Throwable {
        C15739l c15739l;
        int i;
        Throwable th;
        super((Object) c11196l, true);
        C16827l c16827l = new C16827l(c11196l.yandex);
        int i2 = c16827l.crashlytics;
        int i3 = c16827l.yandex;
        int i4 = c16827l.loadAd;
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[64];
            byte[] bArr6 = new byte[32];
            C16543l c16543l = new C16543l(c16827l);
            C18449l[] c18449lArr = (C18449l[]) new C3585l(c16827l).f7511l;
            C18449l[] c18449lArr2 = (C18449l[]) new C7972l(c16827l).f16631l;
            C7972l c7972l = new C7972l(c16827l);
            C7972l c7972l2 = new C7972l(c16827l);
            C17951l c17951l = (C17951l) c16827l.mopub;
            c17951l.billing(0, 32, bArr);
            c17951l.update((byte) i4);
            c17951l.update((byte) i2);
            c17951l.crashlytics(0, 128, bArr2);
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 64);
            System.arraycopy(bArr2, 96, bArr6, 0, 32);
            c16543l.startapp(bArr4);
            int i5 = 0;
            short s = 0;
            while (i5 < c18449lArr.length) {
                c18449lArr[i5].m4559try(bArr5, s);
                i5++;
                s = (short) (s + 1);
            }
            short s2 = (short) i2;
            int i6 = 0;
            while (i6 < c18449lArr2.length) {
                c18449lArr2[i6].m4559try(bArr5, s2);
                i6++;
                s2 = (short) (s2 + 1);
            }
            C3585l c3585l = new C3585l(c16827l);
            for (int i7 = 0; i7 < c18449lArr.length; i7++) {
                System.arraycopy((int[]) c18449lArr[i7].f36010l, 0, (int[]) ((C18449l[]) c3585l.f7511l)[i7].f36010l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            c3585l.applovin();
            c16543l.Signature(c7972l, c3585l);
            c7972l.m2227default();
            c7972l.m2244switch();
            int i8 = 0;
            while (true) {
                C18449l[] c18449lArr3 = (C18449l[]) c7972l.f16631l;
                if (i8 >= c18449lArr3.length) {
                    break;
                }
                C18449l c18449l = c18449lArr3[i8];
                C18449l c18449l2 = c18449lArr2[i8];
                int i9 = 0;
                while (i9 < 256) {
                    int[] iArr = (int[]) c18449l.f36010l;
                    iArr[i9] = iArr[i9] + ((int[]) c18449l2.f36010l)[i9];
                    i9++;
                    i8 = i8;
                }
                c18449l.getClass();
                i8++;
            }
            c7972l.inmobi();
            c7972l.m2234interface(c7972l2);
            byte[] bArrMopub = AbstractC5889l.mopub(c7972l, c16827l);
            c17951l.billing(0, 32, bArr4);
            c17951l.billing(0, bArrMopub.length, bArrMopub);
            c17951l.crashlytics(0, 64, bArr3);
            byte[][] bArr7 = new byte[6][];
            bArr7[0] = bArr4;
            bArr7[1] = bArr6;
            bArr7[2] = bArr3;
            bArr7[3] = new byte[i2 * i3];
            for (int i10 = 0; i10 < i2; i10++) {
                c18449lArr[i10].m4539continue(i10 * i3, bArr7[3]);
            }
            bArr7[4] = new byte[i4 * i3];
            for (int i11 = 0; i11 < i4; i11++) {
                c18449lArr2[i11].m4539continue(i11 * i3, bArr7[4]);
            }
            bArr7[5] = new byte[i4 * 416];
            for (int i12 = 0; i12 < i4; i12++) {
                C18449l c18449l3 = ((C18449l[]) c7972l2.f16631l)[i12];
                byte[] bArr8 = bArr7[5];
                int i13 = i12 * 416;
                int i14 = 0;
                while (i14 < 32) {
                    int i15 = i14 * 8;
                    int[] iArr2 = (int[]) c18449l3.f36010l;
                    byte[] bArr9 = bArrMopub;
                    int[] iArr3 = {4096 - iArr2[i15], 4096 - iArr2[i15 + 1], 4096 - iArr2[i15 + 2], 4096 - iArr2[i15 + 3], 4096 - iArr2[i15 + 4], 4096 - iArr2[i15 + 5], 4096 - iArr2[i15 + 6], 4096 - iArr2[i15 + 7]};
                    int i16 = (i14 * 13) + i13;
                    int i17 = iArr3[0];
                    bArr8[i16] = (byte) i17;
                    int i18 = i16 + 1;
                    byte b = (byte) (i17 >> 8);
                    bArr8[i18] = b;
                    int i19 = iArr3[1];
                    bArr8[i18] = (byte) (b | ((byte) (i19 << 5)));
                    bArr8[i16 + 2] = (byte) (i19 >> 3);
                    int i20 = i16 + 3;
                    byte b2 = (byte) (i19 >> 11);
                    bArr8[i20] = b2;
                    int i21 = iArr3[2];
                    bArr8[i20] = (byte) (b2 | ((byte) (i21 << 2)));
                    int i22 = i16 + 4;
                    byte b3 = (byte) (i21 >> 6);
                    bArr8[i22] = b3;
                    int i23 = iArr3[3];
                    bArr8[i22] = (byte) (b3 | ((byte) (i23 << 7)));
                    bArr8[i16 + 5] = (byte) (i23 >> 1);
                    int i24 = i16 + 6;
                    byte b4 = (byte) (i23 >> 9);
                    bArr8[i24] = b4;
                    int i25 = iArr3[4];
                    bArr8[i24] = (byte) (b4 | ((byte) (i25 << 4)));
                    bArr8[i16 + 7] = (byte) (i25 >> 4);
                    int i26 = i16 + 8;
                    byte b5 = (byte) (i25 >> 12);
                    bArr8[i26] = b5;
                    int i27 = iArr3[5];
                    bArr8[i26] = (byte) (b5 | ((byte) (i27 << 1)));
                    int i28 = i16 + 9;
                    byte b6 = (byte) (i27 >> 7);
                    bArr8[i28] = b6;
                    int i29 = iArr3[6];
                    bArr8[i28] = (byte) (b6 | ((byte) (i29 << 6)));
                    bArr8[i16 + 10] = (byte) (i29 >> 2);
                    int i30 = i16 + 11;
                    byte b7 = (byte) (i29 >> 10);
                    bArr8[i30] = b7;
                    int i31 = iArr3[7];
                    bArr8[i30] = (byte) (b7 | ((byte) (i31 << 3)));
                    bArr8[i16 + 12] = (byte) (i31 >> 5);
                    i14++;
                    bArrMopub = bArr9;
                }
                c18449l3.getClass();
            }
            byte[][] bArr10 = {bArr7[0], bArr7[1], bArr7[2], bArr7[3], bArr7[4], bArr7[5], bArrMopub, bArr};
            c15739l = this;
            c15739l.f30909l = bArr10[0];
            c15739l.f30914l = bArr10[1];
            c15739l.f30913l = bArr10[2];
            c15739l.f30916l = bArr10[3];
            c15739l.f30910l = bArr10[4];
            c15739l.f30911l = bArr10[5];
            c15739l.f30915l = bArr10[6];
            c15739l.f30912l = bArr10[7];
            th = null;
            i = 0;
        } else {
            c15739l = this;
            byte[] bArrVip = AbstractC14024l.vip(0, 32, bArr);
            c15739l.f30909l = bArrVip;
            c15739l.f30914l = AbstractC14024l.vip(32, 64, bArr);
            c15739l.f30913l = AbstractC14024l.vip(64, 128, bArr);
            int i32 = (i2 * i3) + 128;
            byte[] bArrVip2 = AbstractC14024l.vip(128, i32, bArr);
            c15739l.f30916l = bArrVip2;
            int i33 = (i4 * i3) + i32;
            byte[] bArrVip3 = AbstractC14024l.vip(i32, i33, bArr);
            c15739l.f30910l = bArrVip3;
            byte[] bArrVip4 = AbstractC14024l.vip(i33, (i4 * 416) + i33, bArr);
            c15739l.f30911l = bArrVip4;
            C16543l c16543l2 = new C16543l(c16827l);
            C18449l[] c18449lArr4 = (C18449l[]) new C3585l(c16827l).f7511l;
            C18449l[] c18449lArr5 = (C18449l[]) new C7972l(c16827l).f16631l;
            C7972l c7972l3 = new C7972l(c16827l);
            C7972l c7972l4 = new C7972l(c16827l);
            for (int i34 = 0; i34 < i2; i34++) {
                c18449lArr4[i34].m4538class(i34 * i3, bArrVip2);
            }
            for (int i35 = 0; i35 < i4; i35++) {
                c18449lArr5[i35].m4538class(i35 * i3, bArrVip3);
            }
            for (int i36 = 0; i36 < i4; i36++) {
                C18449l c18449l4 = ((C18449l[]) c7972l4.f16631l)[i36];
                int i37 = i36 * 416;
                c18449l4.getClass();
                int i38 = 0;
                while (i38 < 32) {
                    int i39 = (i38 * 13) + i37;
                    int i40 = i38 * 8;
                    int i41 = bArrVip4[i39] & 255;
                    byte[] bArr11 = bArrVip4;
                    int i42 = bArr11[i39 + 1] & 255;
                    int i43 = (i41 | (i42 << 8)) & 8191;
                    int[] iArr4 = (int[]) c18449l4.f36010l;
                    iArr4[i40] = i43;
                    int i44 = i40 + 1;
                    int i45 = (i42 >> 5) | ((bArr11[i39 + 2] & 255) << 3);
                    int i46 = bArr11[i39 + 3] & 255;
                    iArr4[i44] = (i45 | (i46 << 11)) & 8191;
                    int i47 = i40 + 2;
                    int i48 = i46 >> 2;
                    int i49 = bArr11[i39 + 4] & 255;
                    iArr4[i47] = (i48 | (i49 << 6)) & 8191;
                    int i50 = i40 + 3;
                    int i51 = (i49 >> 7) | ((bArr11[i39 + 5] & 255) << 1);
                    int i52 = bArr11[i39 + 6] & 255;
                    iArr4[i50] = (i51 | (i52 << 9)) & 8191;
                    int i53 = i40 + 4;
                    int i54 = (i52 >> 4) | ((bArr11[i39 + 7] & 255) << 4);
                    int i55 = bArr11[i39 + 8] & 255;
                    iArr4[i53] = (i54 | (i55 << 12)) & 8191;
                    int i56 = i40 + 5;
                    int i57 = i55 >> 1;
                    int i58 = bArr11[i39 + 9] & 255;
                    iArr4[i56] = (i57 | (i58 << 7)) & 8191;
                    int i59 = i40 + 6;
                    int i60 = (i58 >> 6) | ((bArr11[i39 + 10] & 255) << 2);
                    int i61 = bArr11[i39 + 11] & 255;
                    iArr4[i59] = (i60 | (i61 << 10)) & 8191;
                    int i62 = i40 + 7;
                    iArr4[i62] = ((i61 >> 3) | ((bArr11[i39 + 12] & 255) << 5)) & 8191;
                    iArr4[i40] = 4096 - iArr4[i40];
                    iArr4[i44] = 4096 - iArr4[i44];
                    iArr4[i47] = 4096 - iArr4[i47];
                    iArr4[i50] = 4096 - iArr4[i50];
                    iArr4[i53] = 4096 - iArr4[i53];
                    iArr4[i56] = 4096 - iArr4[i56];
                    iArr4[i59] = 4096 - iArr4[i59];
                    iArr4[i62] = 4096 - iArr4[i62];
                    i38++;
                    bArrVip4 = bArr11;
                }
            }
            c16543l2.startapp(bArrVip);
            C3585l c3585l2 = new C3585l(c16827l);
            for (int i63 = 0; i63 < c18449lArr4.length; i63++) {
                System.arraycopy((int[]) c18449lArr4[i63].f36010l, 0, (int[]) ((C18449l[]) c3585l2.f7511l)[i63].f36010l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            i = 0;
            c3585l2.applovin();
            c16543l2.Signature(c7972l3, c3585l2);
            c7972l3.m2227default();
            c7972l3.m2244switch();
            int i64 = 0;
            while (true) {
                C18449l[] c18449lArr6 = (C18449l[]) c7972l3.f16631l;
                if (i64 >= c18449lArr6.length) {
                    break;
                }
                C18449l c18449l5 = c18449lArr6[i64];
                C18449l c18449l6 = c18449lArr5[i64];
                for (int i65 = 0; i65 < 256; i65++) {
                    int[] iArr5 = (int[]) c18449l5.f36010l;
                    iArr5[i65] = iArr5[i65] + ((int[]) c18449l6.f36010l)[i65];
                }
                c18449l5.getClass();
                i64++;
            }
            c7972l3.inmobi();
            c7972l3.m2234interface(c7972l4);
            c15739l.f30915l = AbstractC5889l.mopub(c7972l3, c16827l);
            th = null;
            c15739l.f30912l = null;
        }
        if (c3427l != null && !AbstractC14024l.smaato(c15739l.f30915l, AbstractC14024l.crashlytics(c3427l.f7285l))) {
            C8339l.metrica("passed in public key does not match private values");
            throw th;
        }
        c15739l.f30917l = c15739l.f30912l == null ? 2 : i;
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.isPro(new byte[][]{this.f30909l, this.f30914l, this.f30913l, this.f30916l, this.f30910l, this.f30911l});
    }
}
