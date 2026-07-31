package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: lْؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13098l extends AbstractC9382l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f25624l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EnumC2441l f25625l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f25626l;

    public C13098l(C13098l c13098l) {
        this.f25625l = c13098l.f25625l;
        this.f25624l = AbstractC14024l.crashlytics(c13098l.f25624l);
        this.f25626l = c13098l.f25626l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }

    public static void purchase(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        if (this.f25626l != 32) {
            C8339l.smaato("input must be exactly 32 bytes");
            return 0;
        }
        if (bArr.length - i < 32) {
            C8339l.metrica("output too short to receive digest");
            return 0;
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f25624l;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = AbstractC9382l.f19227l;
        bArr2[0] = AbstractC9382l.yandex(bArr6, bArr7[0]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[1]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[2]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[3]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[4]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[5]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[6]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[7]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[8]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[9]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[10]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[11]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[12]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[13]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[14]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[15]);
        purchase(bArr2, bArr3);
        bArr2[0] = AbstractC9382l.yandex(bArr3[0], bArr7[16]);
        bArr2[1] = AbstractC9382l.yandex(bArr3[1], bArr7[17]);
        bArr2[0] = AbstractC9382l.yandex(bArr2[0], bArr7[18]);
        bArr2[1] = AbstractC9382l.yandex(bArr2[1], bArr7[19]);
        purchase(bArr2, bArr3);
        AbstractC15269l.purchase(bArr3[0], bArr5, 0, bArr, i);
        AbstractC15269l.purchase(bArr3[1], bArr5, 16, bArr, i + 16);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f25626l = 0;
        AbstractC14024l.loadAd(this.f25624l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = this.f25626l;
        if (i3 > 32 - i2) {
            C8339l.metrica("total input cannot be more than 32 bytes");
        } else {
            System.arraycopy(bArr, i, this.f25624l, i3, i2);
            this.f25626l += i2;
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f25626l;
        if (i > 31) {
            C8339l.metrica("total input cannot be more than 32 bytes");
        } else {
            this.f25626l = i + 1;
            this.f25624l[i] = b;
        }
    }

    public C13098l() {
        this.f25625l = EnumC2441l.f5219l;
        this.f25624l = new byte[32];
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }
}
