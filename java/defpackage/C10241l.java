package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: lَِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10241l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static C4391l yandex(boolean z, byte[] bArr) {
        C4391l c4391l = new C4391l();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        C13975l c13975l = AbstractC14375l.yandex;
        int iAmazon = (int) AbstractC14375l.amazon(ByteBuffer.wrap(bArr2), 0, 3);
        byte[] bArr3 = new byte[iAmazon];
        System.arraycopy(bArr, 4, bArr3, 0, iAmazon);
        int i = iAmazon + 4;
        String str = new String(bArr3, InterfaceC9665l.loadAd);
        EnumC14884l enumC14884l = EnumC14884l.VENDOR;
        c4391l.remoteconfig(new C2143l(enumC14884l.f29270l, 1, str));
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        List listAdcel = c4391l.adcel(enumC14884l.f29270l);
        if (listAdcel.size() != 0) {
            ((InterfaceC4656l) listAdcel.get(0)).toString();
        }
        C13975l c13975l2 = yandex;
        c13975l2.getClass();
        int i2 = C17500l.yandex;
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, i, bArr4, 0, 4);
        int i3 = iAmazon + 8;
        int iAmazon2 = (int) AbstractC14375l.amazon(ByteBuffer.wrap(bArr4), 0, 3);
        c13975l2.getClass();
        for (int i4 = 0; i4 < iAmazon2; i4++) {
            byte[] bArr5 = new byte[4];
            System.arraycopy(bArr, i3, bArr5, 0, 4);
            i3 += 4;
            int iAmazon3 = (int) AbstractC14375l.amazon(ByteBuffer.wrap(bArr5), 0, 3);
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l2.getClass();
            int i5 = C17500l.yandex;
            if (iAmazon3 > 10000000) {
                c13975l2.getClass();
                break;
            }
            if (iAmazon3 > bArr.length) {
                c13975l2.getClass();
                break;
            }
            byte[] bArr6 = new byte[iAmazon3];
            System.arraycopy(bArr, i3, bArr6, 0, iAmazon3);
            i3 += iAmazon3;
            C2143l c2143l = new C2143l();
            String str2 = new String(bArr6, "UTF-8");
            int iIndexOf = str2.indexOf("=");
            if (iIndexOf == -1) {
                c2143l.f4783l = "ERRONEOUS";
                c2143l.f4780l = str2;
            } else {
                c2143l.f4783l = str2.substring(0, iIndexOf).toUpperCase();
                if (str2.length() > iIndexOf) {
                    c2143l.f4780l = str2.substring(iIndexOf + 1);
                } else {
                    c2143l.f4780l = "";
                }
            }
            c2143l.yandex();
            c13975l2.getClass();
            c4391l.billing(c2143l);
        }
        if (!z || (bArr[i3] & 1) == 1) {
            return c4391l;
        }
        throw new C13768l("The OGG Stream is not valid, Vorbis tag valid framing bit is wrong %s ", Integer.valueOf(bArr[i3] & 1));
    }
}
