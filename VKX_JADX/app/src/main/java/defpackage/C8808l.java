package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8808l extends AbstractC5792l {
    public int[] isPro;
    public int[] subs;

    @Override // defpackage.AbstractC5792l
    public final void amazon() {
        this.isPro = null;
        this.subs = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.isPro;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferPurchase = purchase(((iLimit - iPosition) / this.loadAd.amazon) * this.crashlytics.amazon);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iLicense = (AbstractC15323l.license(this.loadAd.crashlytics) * i5) + iPosition;
                int i6 = this.loadAd.crashlytics;
                if (i6 == 2) {
                    byteBufferPurchase.putShort(byteBuffer.getShort(iLicense));
                } else if (i6 == 3) {
                    byteBufferPurchase.put(byteBuffer.get(iLicense));
                } else if (i6 == 4) {
                    byteBufferPurchase.putFloat(byteBuffer.getFloat(iLicense));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iLicense;
                    } else {
                        i = iLicense + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iLicense + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iLicense += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iLicense) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AbstractC12442l.isPro(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    AbstractC12442l.admob(byteBufferPurchase.remaining() >= 3);
                    if (byteBufferPurchase.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferPurchase.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferPurchase.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferPurchase.putInt(byteBuffer.getInt(iLicense));
                } else if (i6 == 268435456) {
                    byteBufferPurchase.putShort(byteBuffer.getShort(iLicense));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iLicense;
                    } else {
                        i = iLicense + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iLicense + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iLicense += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iLicense) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    AbstractC12442l.isPro(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    AbstractC12442l.admob(byteBufferPurchase.remaining() >= 3);
                    if (byteBufferPurchase.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferPurchase.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferPurchase.put(b7).put(b8).put((byte) i4);
                } else if (i6 == 1610612736) {
                    byteBufferPurchase.putInt(byteBuffer.getInt(iLicense));
                } else {
                    if (i6 != 1879048192) {
                        C8936l.admob(this.loadAd.crashlytics, "Unexpected encoding: ");
                        return;
                    }
                    byteBufferPurchase.putDouble(byteBuffer.getDouble(iLicense));
                }
            }
            iPosition += this.loadAd.amazon;
        }
        byteBuffer.position(iLimit);
        byteBufferPurchase.flip();
    }

    @Override // defpackage.AbstractC5792l
    public final void loadAd() {
        this.isPro = this.subs;
    }

    @Override // defpackage.AbstractC5792l
    public final C6696l yandex(C6696l c6696l) throws C16758l {
        int i = c6696l.crashlytics;
        int[] iArr = this.subs;
        if (iArr == null) {
            return C6696l.purchase;
        }
        int i2 = c6696l.loadAd;
        if (!AbstractC15323l.m3968for(i)) {
            throw new C16758l(c6696l);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C16758l("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c6696l);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new C6696l(c6696l.yandex, iArr.length, i) : C6696l.purchase;
    }
}
