package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؖٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4123l extends AbstractC5792l {
    public static final int subs = Float.floatToIntBits(Float.NaN);

    public static void billing(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == subs) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferPurchase;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.loadAd.crashlytics;
        if (i2 == 2) {
            byteBufferPurchase = purchase(i * 2);
            while (iPosition < iLimit) {
                billing(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferPurchase);
                iPosition += 2;
            }
        } else if (i2 == 1342177280) {
            byteBufferPurchase = purchase((i / 3) * 4);
            while (iPosition < iLimit) {
                billing(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferPurchase);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferPurchase = purchase(i);
            while (iPosition < iLimit) {
                billing((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferPurchase);
                iPosition += 4;
            }
        } else if (i2 == 1879048192) {
            byteBufferPurchase = purchase(i / 2);
            while (iPosition < iLimit) {
                byteBufferPurchase.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i2 == 21) {
            byteBufferPurchase = purchase((i / 3) * 4);
            while (iPosition < iLimit) {
                billing(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferPurchase);
                iPosition += 3;
            }
        } else {
            if (i2 != 22) {
                C18073l.admob();
                return;
            }
            byteBufferPurchase = purchase(i);
            while (iPosition < iLimit) {
                billing((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferPurchase);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferPurchase.flip();
    }

    @Override // defpackage.AbstractC5792l
    public final C6696l yandex(C6696l c6696l) throws C16758l {
        int i = c6696l.crashlytics;
        if (AbstractC15323l.m3965extends(i) || i == 2) {
            return i != 4 ? new C6696l(c6696l.yandex, c6696l.loadAd, 4) : C6696l.purchase;
        }
        throw new C16758l(c6696l);
    }
}
