package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16951l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f33063l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f33064l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final byte[] f33065l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f33066l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f33067l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f33068l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f33069l;

    public C16951l(C8719l c8719l, byte[] bArr, C18547l c18547l) {
        C16951l c16951l;
        int i;
        short[] sArr;
        super((Object) c8719l, true);
        C16825l c16825l = c8719l.f17938l;
        if (bArr.length == 64) {
            byte[] bArrVip = AbstractC14024l.vip(0, 32, bArr);
            byte[] bArrVip2 = AbstractC14024l.vip(32, bArr.length, bArr);
            C16825l c16825l2 = (C16825l) c16825l.yandex.f11181l;
            int i2 = c16825l2.loadAd;
            int i3 = c16825l2.crashlytics;
            C13161l c13161l = new C13161l(i2);
            C14965l[] c14965lArr = (C14965l[]) c13161l.f25776l;
            C13161l c13161l2 = new C13161l(i2);
            C14965l[] c14965lArr2 = (C14965l[]) c13161l2.f25776l;
            byte[] bArr2 = new byte[64];
            byte[] bArrYandex = AbstractC14024l.yandex((byte) i2, bArrVip);
            C4604l c4604l = new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
            c4604l.billing(0, bArrYandex.length, bArrYandex);
            c4604l.doFinal(bArr2, 0);
            C13161l[] c13161lArr = new C13161l[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                c13161lArr[i4] = new C13161l(i2);
            }
            C17951l c17951l = new C17951l(128);
            byte[] bArr3 = new byte[506];
            int i5 = 0;
            while (i5 < i2) {
                C13161l[] c13161lArr2 = c13161lArr;
                int i6 = 0;
                while (i6 < i2) {
                    c17951l.reset();
                    C13161l c13161l3 = c13161l2;
                    C14965l[] c14965lArr3 = c14965lArr2;
                    c17951l.billing(0, 32, bArr2);
                    c17951l.update((byte) i6);
                    c17951l.update((byte) i5);
                    int i7 = 504;
                    c17951l.remoteconfig(0, 504, bArr3);
                    C14965l c14965l = ((C14965l[]) c13161lArr2[i5].f25776l)[i6];
                    int i8 = i6;
                    int i9 = i5;
                    int iM1706while = C5138l.m1706while(c14965l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr3, 504);
                    for (int i10 = PSKKeyManager.MAX_KEY_LENGTH_BYTES; iM1706while < i10; i10 = PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                        int i11 = i7 % 3;
                        for (int i12 = 0; i12 < i11; i12++) {
                            bArr3[i12] = bArr3[(i7 - i11) + i12];
                        }
                        c17951l.remoteconfig(i11, 336, bArr3);
                        i7 = i11 + 168;
                        iM1706while += C5138l.m1706while(((C14965l[]) c13161lArr2[i9].f25776l)[i8], iM1706while, 256 - iM1706while, bArr3, i7);
                    }
                    i6 = i8 + 1;
                    c13161l2 = c13161l3;
                    c14965lArr2 = c14965lArr3;
                    i5 = i9;
                }
                i5++;
                c13161lArr = c13161lArr2;
            }
            C13161l[] c13161lArr3 = c13161lArr;
            C13161l c13161l4 = c13161l2;
            C14965l[] c14965lArr4 = c14965lArr2;
            C17951l c17951l2 = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            if (c16825l2.amazon == 2) {
                int i13 = 0;
                byte b = 0;
                while (i13 < i2) {
                    c14965lArr[i13].admob(b, c17951l2, bArr2);
                    i13++;
                    b = (byte) (b + 1);
                }
                int i14 = 0;
                while (i14 < i2) {
                    c14965lArr4[i14].admob(b, c17951l2, bArr2);
                    i14++;
                    b = (byte) (b + 1);
                }
            } else {
                int i15 = 0;
                byte b2 = 0;
                while (i15 < i2) {
                    c14965lArr[i15].subs(b2, c17951l2, bArr2);
                    i15++;
                    b2 = (byte) (b2 + 1);
                }
                int i16 = 0;
                while (i16 < i2) {
                    c14965lArr4[i16].subs(b2, c17951l2, bArr2);
                    i16++;
                    b2 = (byte) (b2 + 1);
                }
            }
            c13161l.pro();
            c13161l4.pro();
            C13161l c13161l5 = new C13161l(i2);
            C14965l[] c14965lArr5 = (C14965l[]) c13161l5.f25776l;
            int i17 = 0;
            while (i17 < i2) {
                C14965l c14965l2 = c14965lArr5[i17];
                C13161l c13161l6 = c13161lArr3[i17];
                int i18 = i17;
                short[] sArr2 = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                C14965l c14965l3 = ((C14965l[]) c13161l6.f25776l)[0];
                C14965l c14965l4 = c14965lArr[0];
                int i19 = 0;
                while (true) {
                    sArr = AbstractC15929l.yandex;
                    if (i19 >= 64) {
                        break;
                    }
                    short[] sArr3 = (short[]) c14965l2.f29441l;
                    int i20 = i19 * 4;
                    short[] sArr4 = (short[]) c14965l3.f29441l;
                    short s = sArr4[i20];
                    int i21 = i20 + 1;
                    short s2 = sArr4[i21];
                    short[] sArr5 = (short[]) c14965l4.f29441l;
                    short s3 = sArr5[i20];
                    short s4 = sArr5[i21];
                    int i22 = i19 + 64;
                    AbstractC15929l.loadAd(sArr3, i20, s, s2, s3, s4, sArr[i22]);
                    short[] sArr6 = (short[]) c14965l2.f29441l;
                    int i23 = i20 + 2;
                    short[] sArr7 = (short[]) c14965l3.f29441l;
                    short s5 = sArr7[i23];
                    int i24 = i20 + 3;
                    short s6 = sArr7[i24];
                    short[] sArr8 = (short[]) c14965l4.f29441l;
                    AbstractC15929l.loadAd(sArr6, i23, s5, s6, sArr8[i23], sArr8[i24], (short) (sArr[i22] * (-1)));
                    i19++;
                }
                int i25 = 1;
                while (i25 < i2) {
                    C14965l c14965l5 = ((C14965l[]) c13161l6.f25776l)[i25];
                    C14965l c14965l6 = c14965lArr[i25];
                    int i26 = i25;
                    for (int i27 = 0; i27 < 64; i27++) {
                        int i28 = i27 * 4;
                        short[] sArr9 = (short[]) c14965l5.f29441l;
                        short s7 = sArr9[i28];
                        int i29 = i28 + 1;
                        short s8 = sArr9[i29];
                        short[] sArr10 = (short[]) c14965l6.f29441l;
                        short s9 = sArr10[i28];
                        short s10 = sArr10[i29];
                        int i30 = i27 + 64;
                        AbstractC15929l.loadAd(sArr2, i28, s7, s8, s9, s10, sArr[i30]);
                        int i31 = i28 + 2;
                        short[] sArr11 = (short[]) c14965l5.f29441l;
                        short s11 = sArr11[i31];
                        int i32 = i28 + 3;
                        short s12 = sArr11[i32];
                        short[] sArr12 = (short[]) c14965l6.f29441l;
                        AbstractC15929l.loadAd(sArr2, i31, s11, s12, sArr12[i31], sArr12[i32], (short) (sArr[i30] * (-1)));
                    }
                    for (int i33 = 0; i33 < 256; i33++) {
                        short[] sArr13 = (short[]) c14965l2.f29441l;
                        sArr13[i33] = (short) (sArr13[i33] + sArr2[i33]);
                    }
                    c14965l2.getClass();
                    i25 = i26 + 1;
                }
                c14965l2.smaato();
                short[] sArr14 = (short[]) c14965lArr5[i18].f29441l;
                for (int i34 = 0; i34 < 256; i34++) {
                    sArr14[i34] = AbstractC10409l.billing(sArr14[i34] * 1353);
                }
                i17 = i18 + 1;
            }
            for (int i35 = 0; i35 < c14965lArr5.length; i35++) {
                C14965l c14965l7 = c14965lArr5[i35];
                C14965l c14965l8 = c14965lArr4[i35];
                for (int i36 = 0; i36 < 256; i36++) {
                    short[] sArr15 = (short[]) c14965l7.f29441l;
                    sArr15[i36] = (short) (sArr15[i36] + ((short[]) c14965l8.f29441l)[i36]);
                }
                c14965l7.getClass();
            }
            for (C14965l c14965l9 : c14965lArr5) {
                c14965l9.smaato();
            }
            byte[] bArr4 = new byte[c16825l2.purchase];
            c13161l5.m3581for(bArr4);
            System.arraycopy(bArr2, 0, bArr4, i3, 32);
            byte[] bArr5 = new byte[i3];
            c13161l.m3581for(bArr5);
            byte[][] bArr6 = {bArr4, bArr5};
            int i37 = c16825l.billing;
            byte[] bArr7 = new byte[i37];
            System.arraycopy(bArr6[1], 0, bArr7, 0, i37);
            byte[] bArr8 = new byte[32];
            byte[] bArr9 = bArr6[0];
            int length = bArr9.length;
            C4604l c4604l2 = new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            c4604l2.billing(0, length, bArr9);
            c4604l2.doFinal(bArr8, 0);
            int i38 = c16825l.purchase;
            byte[] bArr10 = new byte[i38];
            System.arraycopy(bArr6[0], 0, bArr10, 0, i38);
            int i39 = i38 - 32;
            i = 2;
            byte[][] bArr11 = {AbstractC14024l.vip(0, i39, bArr10), AbstractC14024l.vip(i39, i38, bArr10), bArr7, bArr8, bArrVip2, AbstractC14024l.mopub(bArrVip, bArrVip2)};
            c16951l = this;
            c16951l.f33063l = bArr11[2];
            c16951l.f33067l = bArr11[3];
            c16951l.f33066l = bArr11[4];
            c16951l.f33069l = bArr11[0];
            c16951l.f33064l = bArr11[1];
            c16951l.f33065l = bArr11[5];
        } else {
            c16951l = this;
            i = 2;
            int i40 = c16825l.billing;
            int i41 = c16825l.purchase;
            c16951l.f33063l = AbstractC14024l.vip(0, i40, bArr);
            int i42 = c16825l.billing;
            c16951l.f33069l = AbstractC14024l.vip(i42, (i42 + i41) - 32, bArr);
            int i43 = (i41 - 32) + i42;
            int i44 = i43 + 32;
            c16951l.f33064l = AbstractC14024l.vip(i43, i44, bArr);
            int i45 = i43 + 64;
            c16951l.f33067l = AbstractC14024l.vip(i44, i45, bArr);
            c16951l.f33066l = AbstractC14024l.vip(i45, i43 + 96, bArr);
            c16951l.f33065l = null;
        }
        C16825l c16825l3 = ((C8719l) c16951l.f16541l).f17938l;
        byte[] encoded = c16951l.getEncoded();
        int i46 = c16825l3.loadAd;
        int i47 = i46 * 384;
        int i48 = i46 * 768;
        if (i48 + 96 != encoded.length) {
            C8339l.metrica("'encoding' has invalid length");
            throw null;
        }
        byte[] bArr12 = new byte[32];
        C4604l c4604l3 = new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c4604l3.billing(i47, i47 + 32, encoded);
        c4604l3.doFinal(bArr12, 0);
        if (!AbstractC14024l.firebase(bArr12, 32, 0, encoded, i48 + 32)) {
            C8339l.metrica("'encoding' fails hash check");
            throw null;
        }
        if (c18547l != null && (!AbstractC14024l.smaato(c16951l.f33069l, c18547l.f36211l) || !AbstractC14024l.smaato(c16951l.f33064l, c18547l.f36212l))) {
            C8339l.metrica("passed in public key does not match private values");
            throw null;
        }
        c16951l.f33068l = c16951l.f33065l == null ? i : 0;
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.isPro(new byte[][]{this.f33063l, this.f33069l, this.f33064l, this.f33067l, this.f33066l});
    }
}
