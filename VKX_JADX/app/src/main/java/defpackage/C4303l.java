package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٟؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4303l extends AbstractC0231l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C13975l f8834l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f8834l = new C13975l(4);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079 A[PHI: r1
  0x0079: PHI (r1v12 java.lang.String) = (r1v11 java.lang.String), (r1v19 java.lang.String) binds: [B:17:0x0058, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public C4303l(C0869l c0869l, String str, boolean z) throws C11399l, EOFException {
        this.f1217l = str;
        C13975l c13975l = f8834l;
        try {
            String strAppmetrica = appmetrica(c0869l);
            if (!m1524throws(strAppmetrica)) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
                throw new C6226l(str + ":" + strAppmetrica + ":is not a valid ID3v2.30 frame");
            }
            byte[] bArr = new byte[3];
            c0869l.subscription(3L);
            for (int i2 = 0; i2 < 3; i2++) {
                bArr[i2] = c0869l.readByte();
            }
            int iIntValue = new BigInteger(bArr).intValue();
            if (iIntValue < 0) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                Integer.toBinaryString(iIntValue);
                c13975l.getClass();
                int i3 = C17500l.yandex;
            }
            this.f1218l = iIntValue;
            if (iIntValue < 0) {
                throw new C11399l(strAppmetrica + " has invalid size of:" + this.f1218l);
            }
            if (iIntValue == 0) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
                throw new C15266l(strAppmetrica.concat(" is empty frame"));
            }
            if (iIntValue > c0869l.f2526l) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i5 = C17500l.yandex;
                throw new C11399l(strAppmetrica.concat(" is invalid frame"));
            }
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i6 = C17500l.yandex;
            String strLoadAd = AbstractC1163l.loadAd(strAppmetrica);
            if (strLoadAd != null) {
                strAppmetrica = strLoadAd;
            } else {
                strLoadAd = strAppmetrica.length() < 3 ? null : AbstractC6443l.yandex(strAppmetrica.substring(0, 3));
                if (strLoadAd != null) {
                    strAppmetrica = strLoadAd;
                } else if (!AbstractC1163l.purchase(strAppmetrica)) {
                    strAppmetrica = "Unsupported";
                }
            }
            c13975l.getClass();
            if (z && AbstractC0231l.ad(strAppmetrica)) {
                c0869l.skip(this.f1218l);
                this.f5140l = null;
            } else {
                C0869l c0869l2 = new C0869l();
                c0869l.m732synchronized(c0869l2, this.f1218l);
                this.f5140l = isVip(strAppmetrica, c0869l2, this.f1218l);
            }
        } catch (RuntimeException e) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i7 = C17500l.yandex;
            StringBuilder sb = new StringBuilder("Buffer:");
            sb.append(c0869l.f2526l);
            sb.append(" ");
            String str2 = this.f1216l;
            throw new C11399l(AbstractC9361l.ad(sb, str2 == null ? "" : str2, " not valid ID3v2.30 frame ", str), e);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static boolean m1524throws(String str) {
        char cCharAt;
        return str.length() >= 3 && (cCharAt = str.charAt(0)) >= 'A' && cCharAt <= 'Z' && AbstractC3206l.isPro(str.charAt(1)) && AbstractC3206l.isPro(str.charAt(2));
    }

    @Override // defpackage.AbstractC0231l
    public final boolean advert(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0;
    }

    @Override // defpackage.AbstractC0231l, defpackage.AbstractC2377l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4303l)) {
            return false;
        }
        C4303l c4303l = (C4303l) obj;
        return AbstractC7000l.loadAd(this.f1215l, c4303l.f1215l) && AbstractC7000l.loadAd(this.f1219l, c4303l.f1219l) && super.equals(c4303l);
    }

    @Override // defpackage.AbstractC18219l
    public final int getSize() {
        return this.f5140l.getSize() + 6;
    }

    @Override // defpackage.AbstractC0231l
    public final int license() {
        return 6;
    }

    @Override // defpackage.AbstractC0231l
    public final int pro() {
        return 3;
    }

    @Override // defpackage.AbstractC18219l
    public final void read(ByteBuffer byteBuffer) throws C11399l {
        String strInmobi = inmobi(byteBuffer);
        byte[] bArr = new byte[3];
        boolean zM1524throws = m1524throws(strInmobi);
        C13975l c13975l = f8834l;
        if (!zM1524throws) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            byteBuffer.position(byteBuffer.position() - 2);
            throw new C6226l(AbstractC9361l.advert(new StringBuilder(), this.f1217l, ":", strInmobi, ":is not a valid ID3v2.20 frame"));
        }
        byteBuffer.get(bArr, 0, 3);
        int iIntValue = new BigInteger(bArr).intValue();
        if (iIntValue < 0) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            Integer.toBinaryString(iIntValue);
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
        this.f1218l = iIntValue;
        if (iIntValue < 0) {
            StringBuilder sbAdvert = AbstractC5020l.advert(strInmobi, " has invalid size of:");
            sbAdvert.append(this.f1218l);
            throw new C11399l(sbAdvert.toString());
        }
        if (iIntValue == 0) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            throw new C15266l(strInmobi.concat(" is empty frame"));
        }
        if (iIntValue > byteBuffer.remaining()) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            throw new C11399l(strInmobi.concat(" is invalid frame"));
        }
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i5 = C17500l.yandex;
        String strLoadAd = AbstractC1163l.loadAd(strInmobi);
        if (strLoadAd == null) {
            String strYandex = strInmobi.length() < 3 ? null : AbstractC6443l.yandex(strInmobi.substring(0, 3));
            if (strYandex != null) {
                strInmobi = strYandex;
            } else if (!AbstractC1163l.purchase(strInmobi)) {
                strInmobi = "Unsupported";
            }
        } else {
            strInmobi = strLoadAd;
        }
        c13975l.getClass();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f1218l);
        try {
            this.f5140l = signatures(strInmobi, byteBufferSlice, this.f1218l);
        } finally {
            byteBuffer.position(byteBuffer.position() + this.f1218l);
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return C6647l.admob().yandex(this.f1216l);
    }

    @Override // defpackage.AbstractC0231l
    public final void write(ByteArrayOutputStream byteArrayOutputStream) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f8834l;
        c13975l.getClass();
        int i = C17500l.yandex;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f5140l).write(byteArrayOutputStream2);
        byteBufferAllocate.put(this.f1216l.getBytes(AbstractC12379l.loadAd), 0, 3);
        int size = this.f5140l.getSize();
        byteBufferAllocate.put((byte) ((16711680 & size) >> 16));
        byteBufferAllocate.put((byte) ((65280 & size) >> 8));
        byteBufferAllocate.put((byte) (size & 255));
        c13975l.getClass();
        try {
            byteArrayOutputStream.write(byteBufferAllocate.array());
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            C11467l.metrica(e);
        }
    }

    public C4303l(String str, ByteBuffer byteBuffer) throws C11399l {
        this.f1217l = str;
        read(byteBuffer);
    }
}
