package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؕٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3505l extends AbstractC5792l {
    public long adcel;
    public byte[] license;
    public boolean metrica;
    public int startapp;
    public byte[] subscription;
    public int vip;
    public int ads = 0;
    public int tapsense = 0;
    public int Signature = 0;
    public final long smaato = 100000;
    public final float subs = 0.2f;
    public final long remoteconfig = 2000000;
    public final int firebase = 10;
    public final short isPro = 1024;

    public C3505l() {
        byte[] bArr = AbstractC15323l.loadAd;
        this.subscription = bArr;
        this.license = bArr;
    }

    @Override // defpackage.AbstractC5792l
    public final void amazon() {
        this.metrica = false;
        byte[] bArr = AbstractC15323l.loadAd;
        this.subscription = bArr;
        this.license = bArr;
    }

    public final int billing(int i) {
        int length = ((((int) ((this.remoteconfig * ((long) this.loadAd.yandex)) / 1000000)) - this.ads) * this.vip) - (this.subscription.length / 2);
        AbstractC12442l.subscription(length >= 0);
        int iMin = (int) Math.min((i * this.subs) + 0.5f, length);
        int i2 = this.vip;
        return (iMin / i2) * i2;
    }

    @Override // defpackage.AbstractC5792l
    public final void crashlytics() {
        if (this.Signature > 0) {
            metrica(true);
            this.ads = 0;
        }
    }

    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.mopub.hasRemaining()) {
            int i = this.startapp;
            short s = this.isPro;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.subscription.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.vip;
                        iPosition = AbstractC15560l.remoteconfig(iLimit3, i2, i2, i2);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.startapp = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    purchase(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    C18073l.admob();
                    return;
                }
                AbstractC12442l.subscription(this.tapsense < this.subscription.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.vip;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.tapsense;
                int i4 = this.Signature;
                int length2 = length + i4;
                byte[] bArr = this.subscription;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.subscription, length2, iMin);
                int i6 = this.Signature + iMin;
                this.Signature = i6;
                AbstractC12442l.subscription(i6 <= this.subscription.length);
                boolean z2 = z && iPosition3 < i5;
                metrica(z2);
                if (z2) {
                    this.startapp = 0;
                    this.ads = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // defpackage.AbstractC5792l
    public final void loadAd() {
        if (mopub()) {
            C6696l c6696l = this.loadAd;
            int i = c6696l.loadAd * 2;
            this.vip = i;
            int i2 = ((((int) ((this.smaato * ((long) c6696l.yandex)) / 1000000)) / 2) / i) * i * 2;
            if (this.subscription.length != i2) {
                this.subscription = new byte[i2];
                this.license = new byte[i2];
            }
        }
        this.startapp = 0;
        this.adcel = 0L;
        this.ads = 0;
        this.tapsense = 0;
        this.Signature = 0;
    }

    public final void metrica(boolean z) {
        int length;
        int iBilling;
        int i = this.Signature;
        byte[] bArr = this.subscription;
        if (i == bArr.length || z) {
            if (this.ads == 0) {
                if (z) {
                    startapp(i, 3);
                    length = i;
                } else {
                    AbstractC12442l.subscription(i >= bArr.length / 2);
                    length = this.subscription.length / 2;
                    startapp(length, 0);
                }
                iBilling = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iBilling2 = billing(length2) + (this.subscription.length / 2);
                startapp(iBilling2, 2);
                iBilling = iBilling2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iBilling = billing(length);
                startapp(iBilling, 1);
            }
            if (!(length % this.vip == 0)) {
                C8339l.smaato(AbstractC11028l.smaato("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            AbstractC12442l.subscription(i >= iBilling);
            this.Signature -= length;
            int i2 = this.tapsense + length;
            this.tapsense = i2;
            this.tapsense = i2 % this.subscription.length;
            int i3 = this.ads;
            int i4 = this.vip;
            this.ads = (iBilling / i4) + i3;
            this.adcel += (long) ((length - iBilling) / i4);
        }
    }

    @Override // defpackage.AbstractC5792l, defpackage.InterfaceC15103l
    public final boolean mopub() {
        return super.mopub() && this.metrica;
    }

    public final void startapp(int i, int i2) {
        if (i == 0) {
            return;
        }
        AbstractC12442l.admob(this.Signature >= i);
        int i3 = this.tapsense;
        if (i2 == 2) {
            int i4 = this.Signature;
            int i5 = i3 + i4;
            byte[] bArr = this.subscription;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.license, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.license;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.subscription, 0, this.license, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.subscription;
            int length2 = bArr3.length;
            byte[] bArr4 = this.license;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.subscription, 0, this.license, length3, i - length3);
            }
        }
        AbstractC12442l.mopub("sizeToOutput is not aligned to frame size: %s", i % this.vip == 0, i);
        AbstractC12442l.subscription(this.tapsense < this.subscription.length);
        byte[] bArr5 = this.license;
        AbstractC12442l.mopub("byteOutput size is not aligned to frame size %s", i % this.vip == 0, i);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.firebase;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = -128;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        purchase(i).put(bArr5, 0, i).flip();
    }

    @Override // defpackage.AbstractC5792l
    public final C6696l yandex(C6696l c6696l) throws C16758l {
        if (c6696l.crashlytics == 2) {
            return c6696l.yandex == -1 ? C6696l.purchase : c6696l;
        }
        throw new C16758l(c6696l);
    }
}
