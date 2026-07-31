package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٟٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18400l extends AbstractC6716l {
    public final C17951l firebase;

    public C18400l(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5);
        this.firebase = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] amazon(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        byte[] bArr3 = (byte[]) c5138l.f11181l;
        c17951l.billing(0, bArr3.length, bArr3);
        c17951l.billing(0, bArr2.length, bArr2);
        int i = this.yandex;
        byte[] bArr4 = new byte[i];
        c17951l.crashlytics(0, i, bArr4);
        return bArr4;
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] billing(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        int i = this.yandex;
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        byte[] bArr4 = (byte[]) c5138l.f11181l;
        c17951l.billing(0, bArr4.length, bArr4);
        c17951l.billing(0, bArr2.length, bArr2);
        c17951l.crashlytics(0, i, bArr3);
        return bArr3;
    }

    @Override // defpackage.AbstractC6716l
    public final C9489l crashlytics(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = ((this.mopub * this.admob) + 7) / 8;
        int i2 = this.billing;
        int i3 = this.subs;
        int i4 = i3 / i2;
        int i5 = i3 - i4;
        int i6 = (i4 + 7) / 8;
        int i7 = (i5 + 7) / 8;
        int i8 = i + i6 + i7;
        byte[] bArr6 = new byte[i8];
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        c17951l.billing(0, bArr2.length, bArr2);
        c17951l.billing(0, bArr3.length, bArr3);
        if (bArr4 != null) {
            c17951l.billing(0, bArr4.length, bArr4);
        }
        c17951l.billing(0, bArr5.length, bArr5);
        c17951l.crashlytics(0, i8, bArr6);
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr6, i, bArr7, 8 - i7, i7);
        long jLoadAd = AbstractC10000l.loadAd(0, bArr7) & ((-1) >>> (64 - i5));
        byte[] bArr8 = new byte[4];
        System.arraycopy(bArr6, i7 + i, bArr8, 4 - i6, i6);
        return new C9489l(jLoadAd, AbstractC14024l.vip(0, i, bArr6), AbstractC10000l.yandex(0, bArr8) & ((-1) >>> (32 - i4)));
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] loadAd(byte[] bArr, C5138l c5138l, byte[] bArr2, byte[] bArr3) {
        int i = this.yandex;
        byte[] bArr4 = new byte[i];
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        byte[] bArr5 = (byte[]) c5138l.f11181l;
        c17951l.billing(0, bArr5.length, bArr5);
        c17951l.billing(0, bArr2.length, bArr2);
        c17951l.billing(0, bArr3.length, bArr3);
        c17951l.crashlytics(0, i, bArr4);
        return bArr4;
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] purchase(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        c17951l.billing(0, bArr2.length, bArr2);
        if (bArr3 != null) {
            c17951l.billing(0, bArr3.length, bArr3);
        }
        c17951l.billing(0, bArr4.length, bArr4);
        int i = this.yandex;
        byte[] bArr5 = new byte[i];
        c17951l.crashlytics(0, i, bArr5);
        return bArr5;
    }

    @Override // defpackage.AbstractC6716l
    public final byte[] yandex(C5138l c5138l, byte[] bArr, byte[] bArr2) {
        int i = this.yandex;
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        C17951l c17951l = this.firebase;
        c17951l.billing(0, length, bArr);
        byte[] bArr4 = (byte[]) c5138l.f11181l;
        c17951l.billing(0, bArr4.length, bArr4);
        c17951l.billing(0, bArr2.length, bArr2);
        c17951l.crashlytics(0, i, bArr3);
        return bArr3;
    }

    @Override // defpackage.AbstractC6716l
    public final void mopub(byte[] bArr) {
    }
}
