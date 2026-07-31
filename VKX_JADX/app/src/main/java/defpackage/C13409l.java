package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْٖٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13409l {
    public static final C13409l[] firebase = {new C13409l(C18493l.f36119l.f36122l), new C13409l(C18493l.f36121l.f36122l), new C13409l(C18493l.f36120l.f36122l)};
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int isPro;
    public final int loadAd;
    public final int mopub;
    public final int purchase;
    public final int subs;
    public final C7972l yandex;

    public C13409l(int i) {
        this.loadAd = i;
        if (i != 2) {
            if (i == 3) {
                this.billing = 2;
            } else {
                if (i != 4) {
                    C8339l.metrica(AbstractC15560l.tapsense("K: ", i, " is not supported for ML-KEM"));
                    throw null;
                }
                this.billing = 2;
                this.amazon = 160;
                this.purchase = i * 352;
            }
            int i2 = i * 384;
            this.crashlytics = i2;
            int i3 = i2 + 32;
            this.mopub = i3;
            this.admob = i2;
            this.isPro = this.purchase + this.amazon;
            this.subs = i2 + i3 + 64;
            this.yandex = new C7972l(17, this);
        }
        this.billing = 3;
        this.amazon = 128;
        this.purchase = i * 320;
        int i4 = i * 384;
        this.crashlytics = i4;
        int i5 = i4 + 32;
        this.mopub = i5;
        this.admob = i4;
        this.isPro = this.purchase + this.amazon;
        this.subs = i4 + i5 + 64;
        this.yandex = new C7972l(17, this);
    }

    public static C13409l crashlytics(C18493l c18493l) {
        return firebase[c18493l.f36122l - 2];
    }

    public final byte[][] loadAd(byte[] bArr, byte[] bArr2) {
        C7972l c7972l = this.yandex;
        C13409l c13409l = (C13409l) c7972l.f16631l;
        int i = c13409l.loadAd;
        int i2 = c13409l.crashlytics;
        C5138l c5138l = new C5138l(i);
        C10685l[] c10685lArr = (C10685l[]) c5138l.f11181l;
        C5138l c5138l2 = new C5138l(i);
        C10685l[] c10685lArr2 = (C10685l[]) c5138l2.f11181l;
        byte[] bArr3 = new byte[64];
        byte[] bArrYandex = AbstractC14024l.yandex((byte) i, bArr);
        C4604l c4604l = new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        c4604l.billing(0, bArrYandex.length, bArrYandex);
        c4604l.doFinal(bArr3, 0);
        C5138l[] c5138lArr = new C5138l[i];
        for (int i3 = 0; i3 < i; i3++) {
            c5138lArr[i3] = new C5138l(i);
        }
        c7972l.m2242strictfp(c5138lArr, bArr3, false);
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (c13409l.billing == 2) {
            int i4 = 0;
            byte b = 0;
            while (i4 < i) {
                c10685lArr[i4].m2956interface(b, c17951l, bArr3);
                i4++;
                b = (byte) (b + 1);
            }
            int i5 = 0;
            while (i5 < i) {
                c10685lArr2[i5].m2956interface(b, c17951l, bArr3);
                i5++;
                b = (byte) (b + 1);
            }
        } else {
            int i6 = 0;
            byte b2 = 0;
            while (i6 < i) {
                c10685lArr[i6].m2960static(b2, c17951l, bArr3);
                i6++;
                b2 = (byte) (b2 + 1);
            }
            int i7 = 0;
            while (i7 < i) {
                c10685lArr2[i7].m2960static(b2, c17951l, bArr3);
                i7++;
                b2 = (byte) (b2 + 1);
            }
        }
        c5138l.m1719protected();
        c5138l2.m1719protected();
        C5138l c5138l3 = new C5138l(i);
        C10685l[] c10685lArr3 = (C10685l[]) c5138l3.f11181l;
        for (int i8 = 0; i8 < i; i8++) {
            C5138l.m1705transient(c10685lArr3[i8], c5138lArr[i8], c5138l, c13409l);
            short[] sArr = (short[]) c10685lArr3[i8].f21690l;
            for (int i9 = 0; i9 < 256; i9++) {
                sArr[i9] = AbstractC10802l.amazon(sArr[i9] * 1353);
            }
        }
        for (int i10 = 0; i10 < c10685lArr3.length; i10++) {
            c10685lArr3[i10].m2958private(c10685lArr2[i10]);
        }
        for (C10685l c10685l : c10685lArr3) {
            c10685l.m2961super();
        }
        byte[] bArr4 = new byte[c13409l.mopub];
        c5138l3.m1713l(bArr4);
        System.arraycopy(bArr3, 0, bArr4, i2, 32);
        byte[] bArr5 = new byte[i2];
        c5138l.m1713l(bArr5);
        byte[][] bArr6 = {bArr4, bArr5};
        int i11 = this.admob;
        byte[] bArr7 = new byte[i11];
        System.arraycopy(bArr6[1], 0, bArr7, 0, i11);
        byte[] bArr8 = new byte[32];
        byte[] bArr9 = bArr6[0];
        int length = bArr9.length;
        C4604l c4604l2 = new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c4604l2.billing(0, length, bArr9);
        c4604l2.doFinal(bArr8, 0);
        int i12 = this.mopub;
        byte[] bArr10 = new byte[i12];
        System.arraycopy(bArr6[0], 0, bArr10, 0, i12);
        int i13 = i12 - 32;
        return new byte[][]{AbstractC14024l.vip(0, i13, bArr10), AbstractC14024l.vip(i13, i12, bArr10), bArr7, bArr8, bArr2, AbstractC14024l.mopub(bArr, bArr2)};
    }

    public final boolean yandex(byte[] bArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.loadAd; i2++) {
            int i3 = i2 * 384;
            int i4 = -1;
            for (int i5 = 0; i5 < 128; i5++) {
                int i6 = (i5 * 3) + i3;
                int i7 = bArr[i6] & 255;
                int i8 = bArr[i6 + 1] & 255;
                i4 = i4 & (((short) ((i7 | (i8 << 8)) & 4095)) - 3329) & (((short) ((((bArr[i6 + 2] & 255) << 4) | (i8 >> 4)) & 4095)) - 3329);
            }
            i &= i4;
        }
        return i < 0;
    }
}
