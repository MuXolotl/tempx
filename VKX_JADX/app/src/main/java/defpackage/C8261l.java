package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lًَۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8261l extends AbstractC5792l {
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.loadAd.crashlytics;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                C18073l.admob();
                                return;
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferPurchase = purchase(i);
        int i3 = this.loadAd.crashlytics;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put((byte) 0);
                byteBufferPurchase.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sSubs = (short) (AbstractC15323l.subs(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferPurchase.put((byte) (sSubs & 255));
                byteBufferPurchase.put((byte) ((sSubs >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put(byteBuffer.get(iPosition + 1));
                byteBufferPurchase.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put(byteBuffer.get(iPosition + 2));
                byteBufferPurchase.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put(byteBuffer.get(iPosition + 1));
                byteBufferPurchase.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put(byteBuffer.get(iPosition + 1));
                byteBufferPurchase.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferPurchase.put(byteBuffer.get(iPosition + 1));
                byteBufferPurchase.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i3 != 1879048192) {
                C18073l.admob();
                return;
            }
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                byteBufferPurchase.put((byte) (sMax & 255));
                byteBufferPurchase.put((byte) ((sMax >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferPurchase.flip();
    }

    @Override // defpackage.AbstractC5792l
    public final C6696l yandex(C6696l c6696l) throws C16758l {
        int i = c6696l.crashlytics;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new C6696l(c6696l.yandex, c6696l.loadAd, 2) : C6696l.purchase;
        }
        throw new C16758l(c6696l);
    }
}
