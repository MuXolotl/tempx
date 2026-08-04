package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: lًؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4185l extends AbstractC9382l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f8592l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f8593l;

    public C4185l(C4185l c4185l) {
        c4185l.getClass();
        this.f8592l = AbstractC14024l.crashlytics(c4185l.f8592l);
        this.f8593l = c4185l.f8593l;
    }

    public static void purchase(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 12, bArr2[0], 0, 4);
        System.arraycopy(bArr[2], 12, bArr2[0], 4, 4);
        System.arraycopy(bArr[1], 12, bArr2[0], 8, 4);
        System.arraycopy(bArr[3], 12, bArr2[0], 12, 4);
        System.arraycopy(bArr[2], 0, bArr2[1], 0, 4);
        System.arraycopy(bArr[0], 0, bArr2[1], 4, 4);
        System.arraycopy(bArr[3], 0, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 0, bArr2[1], 12, 4);
        System.arraycopy(bArr[2], 4, bArr2[2], 0, 4);
        System.arraycopy(bArr[0], 4, bArr2[2], 4, 4);
        System.arraycopy(bArr[3], 4, bArr2[2], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[2], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[3], 0, 4);
        System.arraycopy(bArr[2], 8, bArr2[3], 4, 4);
        System.arraycopy(bArr[1], 8, bArr2[3], 8, 4);
        System.arraycopy(bArr[3], 8, bArr2[3], 12, 4);
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        if (this.f8593l != 64) {
            C8339l.smaato("input must be exactly 64 bytes");
            return 0;
        }
        if (bArr.length - i < 32) {
            C8339l.metrica("output too short to receive digest");
            return 0;
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f8592l;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        System.arraycopy(bArr5, 32, bArr2[2], 0, 16);
        System.arraycopy(bArr5, 48, bArr2[3], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = AbstractC9382l.f19227l;
        bArr2[0] = AbstractC9382l.yandex(bArr6, bArr7[0]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[1]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[2]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[3]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[4]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[5]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[6]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[7]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[8]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[9]);
        bArr2[2] = AbstractC9382l.yandex(bArr3[2], bArr7[10]);
        bArr2[3] = AbstractC9382l.yandex(bArr3[3], bArr7[11]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[12]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[13]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[14]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[15]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[16]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[17]);
        bArr2[2] = AbstractC9382l.yandex(bArr3[2], bArr7[18]);
        bArr2[3] = AbstractC9382l.yandex(bArr3[3], bArr7[19]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[20]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[21]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[22]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[23]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[24]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[25]);
        bArr2[2] = AbstractC9382l.yandex(bArr3[2], bArr7[26]);
        bArr2[3] = AbstractC9382l.yandex(bArr3[3], bArr7[27]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[28]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[29]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[30]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[31]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[32]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[33]);
        bArr2[2] = AbstractC9382l.yandex(bArr3[2], bArr7[34]);
        bArr2[3] = AbstractC9382l.yandex(bArr3[3], bArr7[35]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[36]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[37]);
        bArr2[2] = AbstractC9382l.yandex(bArr2[2], bArr7[38]);
        bArr2[3] = AbstractC9382l.yandex(bArr2[3], bArr7[39]);
        purchase(bArr2, bArr3);
        AbstractC15269l.purchase(bArr3[0], bArr5, 0, bArr2[0], 0);
        AbstractC15269l.purchase(bArr3[1], bArr5, 16, bArr2[1], 0);
        AbstractC15269l.purchase(bArr3[2], bArr5, 32, bArr2[2], 0);
        AbstractC15269l.purchase(bArr3[3], bArr5, 48, bArr2[3], 0);
        System.arraycopy(bArr2[0], 8, bArr, i, 8);
        System.arraycopy(bArr2[1], 8, bArr, i + 8, 8);
        System.arraycopy(bArr2[2], 0, bArr, i + 16, 8);
        System.arraycopy(bArr2[3], 0, bArr, i + 24, 8);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "Haraka-512";
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f8593l = 0;
        AbstractC14024l.loadAd(this.f8592l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = this.f8593l;
        if (i3 > 64 - i2) {
            C8339l.metrica("total input cannot be more than 64 bytes");
        } else {
            System.arraycopy(bArr, i, this.f8592l, i3, i2);
            this.f8593l += i2;
        }
    }

    public C4185l() {
        this.f8592l = new byte[64];
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f8593l;
        if (i > 63) {
            C8339l.metrica("total input cannot be more than 64 bytes");
        } else {
            this.f8593l = i + 1;
            this.f8592l[i] = b;
        }
    }
}
