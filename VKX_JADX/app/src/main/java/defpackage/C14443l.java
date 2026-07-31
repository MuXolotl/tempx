package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lًٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14443l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C13975l f28299l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f28299l = new C13975l(4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14443l(C8117l c8117l, C1503l c1503l, C11566l c11566l, int i) throws EOFException {
        int i2;
        String str;
        super(0);
        int i3 = 0;
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        AbstractC12442l.admob("esds".equals(c8117l.yandex));
        this.f33215l = c8117l;
        int iYandex = c8117l.yandex();
        c1503l.skip(4L);
        int i4 = iYandex - 4;
        if (c1503l.readByte() == 3) {
            int iM3855l = (iYandex - 5) - m3855l(c1503l);
            c1503l.skip(3L);
            i4 = iM3855l - 3;
        }
        EnumC8667l enumC8667l = EnumC8667l.UNKNOWN;
        if (c1503l.readByte() == 4) {
            int iM3855l2 = (i4 - 1) - m3855l(c1503l);
            byte b = c1503l.readByte();
            int i5 = 0;
            while (true) {
                EnumC8667l[] enumC8667lArr = EnumC8667l.f17850l;
                if (i5 >= enumC8667lArr.length) {
                    enumC8667l = EnumC8667l.UNKNOWN;
                    break;
                }
                EnumC8667l enumC8667l2 = enumC8667lArr[i5];
                if (enumC8667l2.f17853l == b) {
                    enumC8667l = enumC8667l2;
                    break;
                }
                i5++;
            }
            c1503l.skip(4L);
            c1503l.readInt();
            i2 = c1503l.readInt();
            i4 = iM3855l2 - 13;
        } else {
            i2 = 0;
        }
        EnumC3098l enumC3098l = EnumC3098l.f6639l;
        if (c1503l.readByte() == 5) {
            int iM3855l3 = (i4 - 1) - m3855l(c1503l);
            int i6 = c1503l.readByte() >> 3;
            while (true) {
                EnumC3098l[] enumC3098lArr = EnumC3098l.f6641l;
                if (i3 >= enumC3098lArr.length) {
                    enumC3098l = EnumC3098l.f6639l;
                    break;
                }
                EnumC3098l enumC3098l2 = enumC3098lArr[i3];
                if (enumC3098l2.f6643l == i6) {
                    enumC3098l = enumC3098l2;
                    break;
                }
                i3++;
            }
            i4 = iM3855l3 - 2;
            i3 = (c1503l.readByte() << 1) >> 4;
        }
        c11566l.amazon = i2 / 1000;
        c11566l.purchase = i3;
        c11566l.metrica = enumC8667l;
        c11566l.startapp = enumC3098l;
        if (i == 1) {
            str = "AAC";
        } else if (i == 2) {
            str = "DRM AAC";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "Apple Lossless";
        }
        c11566l.admob = str;
        if (i4 != 0) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            f28299l.getClass();
            int i7 = C17500l.yandex;
            c1503l.skip(i4);
        }
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public static int m3855l(C1503l c1503l) {
        int i = c1503l.readByte() & 255;
        if (i != 128 && i != 129 && i != 254) {
            C13975l c13975l = AbstractC14375l.yandex;
            return 1;
        }
        c1503l.readByte();
        c1503l.readByte();
        c1503l.readByte();
        C13975l c13975l2 = AbstractC14375l.yandex;
        return 4;
    }
}
