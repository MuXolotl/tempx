package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15599l extends AbstractC17054l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15599l(C8117l c8117l, C1503l c1503l, C3397l c3397l, boolean z) throws EOFException {
        C8117l c8117l2;
        int i;
        C8117l c8117l3;
        super(0);
        C0869l c0869l = c1503l.f3755l;
        int i2 = 0;
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        AbstractC12442l.admob("meta".equals(c8117l.yandex));
        this.f33215l = c8117l;
        int iYandex = c8117l.yandex();
        c1503l.skip(4L);
        int i3 = iYandex - 4;
        C10416l c10416l = null;
        while (true) {
            int i4 = 8;
            if (i3 < 8 || c10416l != null) {
                break;
            }
            C8117l c8117l4 = new C8117l(c1503l);
            if (c8117l4.amazon().ordinal() != 48) {
                c1503l.skip(c8117l4.yandex());
                c8117l2 = c8117l4;
            } else {
                C13975l c13975l = C10416l.yandex;
                c10416l = new C10416l();
                EnumC8101l enumC8101l2 = EnumC8101l.UNKNOWN;
                AbstractC12442l.admob("ilst".equals(c8117l4.yandex));
                int iYandex2 = c8117l4.yandex();
                while (iYandex2 >= i4) {
                    C8117l c8117l5 = new C8117l(c1503l);
                    int iYandex3 = c8117l5.yandex();
                    if (iYandex3 <= 0) {
                        i = i4;
                        c8117l3 = c8117l4;
                    } else if ("----".equals(c8117l5.yandex)) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(c1503l.billing(iYandex3));
                        try {
                            C12509l c12509l = new C12509l();
                            c12509l.f11833l = c8117l5;
                            c12509l.yandex(byteBufferWrap);
                            c3397l.billing(c12509l);
                        } catch (Exception unused) {
                            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i5 = C17500l.yandex;
                            c3397l.billing(new C4198l(c8117l5, byteBufferWrap));
                        }
                        i = i4;
                        c8117l3 = c8117l4;
                    } else {
                        Charset charset = AbstractC12379l.loadAd;
                        c1503l.subscription(8L);
                        byte[] bArr = new byte[4];
                        int i6 = i2;
                        while (i6 < 4) {
                            bArr[i6] = c0869l.ads(4 + i6);
                            i6++;
                            c8117l4 = c8117l4;
                            i4 = i4;
                        }
                        i = i4;
                        c8117l3 = c8117l4;
                        boolean zEquals = "data".equals(new String(bArr, charset));
                        c1503l.subscription(12L);
                        EnumC11981l enumC11981l = (EnumC11981l) EnumC11981l.f23886l.get(Integer.valueOf(((c0869l.ads(9L) & 255) << 16) | ((c0869l.ads(10L) & 255) << 8) | (c0869l.ads(11L) & 255)));
                        if (!EnumC16541l.ARTWORK.f32477l.equals(c8117l5.yandex) && !EnumC11981l.f23883l.contains(enumC11981l)) {
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(c1503l.billing(iYandex3));
                            String str = c8117l5.yandex;
                            if (zEquals) {
                                if (!EnumC16541l.TRACK.f32477l.equals(str)) {
                                    if (!EnumC16541l.DISCNUMBER.f32477l.equals(str)) {
                                        if (!EnumC16541l.GENRE.f32477l.equals(str)) {
                                            if (enumC11981l != EnumC11981l.TEXT) {
                                                if (enumC11981l != EnumC11981l.IMPLICIT) {
                                                    if (enumC11981l != EnumC11981l.INTEGER) {
                                                        EnumC16541l[] enumC16541lArrValues = EnumC16541l.values();
                                                        int length = enumC16541lArrValues.length;
                                                        int i7 = 0;
                                                        while (true) {
                                                            if (i7 >= length) {
                                                                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                                                                c13975l.getClass();
                                                                int i8 = C17500l.yandex;
                                                                c3397l.billing(new C11049l(str, byteBufferWrap2));
                                                                break;
                                                            }
                                                            if (enumC16541lArrValues[i7].f32477l.equals(str)) {
                                                                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                                                                c13975l.getClass();
                                                                int i9 = C17500l.yandex;
                                                                break;
                                                            }
                                                            i7++;
                                                        }
                                                    } else {
                                                        c3397l.billing(new C0964l(str, byteBufferWrap2));
                                                    }
                                                } else {
                                                    c3397l.billing(new C6212l(str, byteBufferWrap2));
                                                }
                                            } else {
                                                c3397l.billing(new C2453l(str, byteBufferWrap2));
                                            }
                                        } else {
                                            c3397l.billing(new C10124l(str, byteBufferWrap2));
                                        }
                                    } else {
                                        c3397l.billing(new C9934l(str, byteBufferWrap2));
                                    }
                                } else {
                                    c3397l.billing(new C16530l(str, byteBufferWrap2));
                                }
                            } else if ("AApr".equals(str)) {
                                c3397l.billing(new C4198l(c8117l5, byteBufferWrap2));
                            } else {
                                c3397l.billing(new C4198l(c8117l5, byteBufferWrap2));
                            }
                        } else if (z) {
                            c3397l.f23580l = true;
                            c1503l.skip(iYandex3);
                        } else {
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(c1503l.billing(iYandex3));
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < c8117l5.yandex()) {
                                if (i11 > 0) {
                                    enumC11981l = (EnumC11981l) EnumC11981l.f23886l.get(Integer.valueOf(AbstractC14375l.crashlytics(byteBufferWrap3, i10 + 9, i10 + 11)));
                                }
                                C10801l c10801l = new C10801l(EnumC16541l.ARTWORK.f32477l, byteBufferWrap3);
                                c10801l.f21832l = enumC11981l;
                                if (!EnumC11981l.f23883l.contains(enumC11981l)) {
                                    C13975l c13975l2 = C10801l.f21830l;
                                    EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                                    c13975l2.getClass();
                                    int i12 = C17500l.yandex;
                                }
                                c3397l.billing(c10801l);
                                i10 += c10801l.f21831l;
                                i11++;
                            }
                        }
                    }
                    iYandex2 -= c8117l5.loadAd;
                    c8117l4 = c8117l3;
                    i4 = i;
                    i2 = 0;
                }
                C8117l c8117l6 = c8117l4;
                if (iYandex2 > 0) {
                    EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i13 = C17500l.yandex;
                    c1503l.skip(iYandex2);
                }
                c8117l2 = c8117l6;
            }
            i3 -= c8117l2.loadAd;
            i2 = 0;
        }
        c1503l.skip(i3);
    }

    public C15599l(C8117l c8117l, C1503l c1503l, C11566l c11566l, boolean z) throws EOFException {
        super(0);
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        AbstractC12442l.admob("alac".equals(c8117l.yandex));
        int iYandex = c8117l.yandex();
        c1503l.skip(4L);
        c1503l.readInt();
        c1503l.readByte();
        C13975l c13975l = AbstractC14375l.yandex;
        int i = c1503l.readByte() & 255;
        c1503l.readByte();
        c1503l.readByte();
        c1503l.readByte();
        int i2 = c1503l.readByte() & 255;
        c1503l.readShort();
        c1503l.readInt();
        int i3 = c1503l.readInt();
        c1503l.readInt();
        int i4 = iYandex - 28;
        if (z) {
            c11566l.admob = "Apple Lossless";
            c11566l.purchase = i2;
            c11566l.amazon = i3 / 1000;
            c11566l.mopub = i;
            c1503l.skip(i4);
            return;
        }
        C15599l c15599l = null;
        while (i4 >= 8 && c15599l == null) {
            C8117l c8117l2 = new C8117l(c1503l);
            if (c8117l2.amazon().ordinal() != 0) {
                c1503l.skip(c8117l2.yandex());
            } else {
                c15599l = new C15599l(c8117l2, c1503l, c11566l, true);
            }
            i4 -= c8117l2.loadAd;
        }
        if (i4 > 0) {
            c1503l.skip(i4);
        }
    }

    public C15599l(int i) {
        super(0);
        try {
            this.f33215l = new C8117l();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC14375l.purchase(i + 8));
            EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
            byteArrayOutputStream.write("free".getBytes(AbstractC12379l.loadAd));
            ((C8117l) this.f33215l).billing(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < i; i2++) {
                byteArrayOutputStream2.write(0);
            }
            this.f33214l = ByteBuffer.wrap(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            C11467l.metrica(e);
            throw null;
        }
    }
}
