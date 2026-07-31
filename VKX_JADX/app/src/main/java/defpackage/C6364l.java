package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyDeprecated;
import ealvatag.tag.id3.framebody.ID3v23FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lَؙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6364l extends AbstractC0231l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C13975l f13328l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f13329l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f13330l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f13328l = new C13975l(4);
    }

    public C6364l(C0869l c0869l, String str, boolean z) throws C11399l, EOFException {
        int i;
        this.f1217l = str;
        C13975l c13975l = f13328l;
        try {
            String strAppmetrica = appmetrica(c0869l);
            if (!m1998throws(strAppmetrica)) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i2 = C17500l.yandex;
                throw new C6226l(str + ":" + strAppmetrica + ":is not a valid ID3v2.30 frame");
            }
            int i3 = c0869l.readInt();
            this.f1218l = i3;
            if (i3 < 0) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
                throw new C11399l(strAppmetrica + " is invalid frame:" + this.f1218l);
            }
            if (i3 == 0) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i5 = C17500l.yandex;
                c0869l.readByte();
                c0869l.readByte();
                throw new C15266l(strAppmetrica.concat(" is empty frame"));
            }
            if (i3 > c0869l.f2526l) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i6 = C17500l.yandex;
                throw new C11399l(strAppmetrica + " is invalid frame:" + this.f1218l + " larger than size of" + c0869l.f2526l + " before mp3 audio:" + strAppmetrica);
            }
            this.f1215l = new C4415l(this, c0869l.readByte());
            this.f1219l = new C13296l(this, c0869l.readByte());
            String strCrashlytics = AbstractC1163l.crashlytics(strAppmetrica);
            int i7 = 4;
            if (strCrashlytics == null) {
                strCrashlytics = strAppmetrica.length() >= 4 && C5566l.admob().mopub(strAppmetrica.substring(0, 4)) ? strAppmetrica : "Unsupported";
            }
            if (((C13296l) this.f1219l).loadAd()) {
                i = c0869l.readInt();
            } else {
                i = -1;
                i7 = 0;
            }
            if (((C13296l) this.f1219l).crashlytics()) {
                i7++;
                this.f13329l = c0869l.readByte();
            }
            if ((((C13296l) this.f1219l).yandex & 32) > 0) {
                i7++;
                this.f13330l = c0869l.readByte();
            }
            if (((C13296l) this.f1219l).amazon()) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                AbstractC6419l.billing(this.f1219l.yandex());
                c13975l.getClass();
                int i8 = C17500l.yandex;
            }
            if (((C13296l) this.f1219l).loadAd() && i > this.f1218l * 100) {
                throw new C11399l(strAppmetrica + " is invalid frame, frame size " + this.f1218l + " cannot be:" + i + " when uncompressed");
            }
            int i9 = this.f1218l - i7;
            if (i9 <= 0) {
                throw new C11399l(strAppmetrica + " is invalid frame, realframeSize is:" + i9);
            }
            if (z && AbstractC0231l.ad(strCrashlytics)) {
                c0869l.skip(i9);
                this.f5140l = null;
                return;
            }
            if (((C13296l) this.f1219l).loadAd()) {
                C0869l c0869lSignature = AbstractC0231l.Signature(c0869l, i9, i);
                if (((C13296l) this.f1219l).crashlytics()) {
                    this.f5140l = premium(strCrashlytics, c0869lSignature, i);
                } else {
                    this.f5140l = isVip(strCrashlytics, c0869lSignature, i);
                }
            } else if (((C13296l) this.f1219l).crashlytics()) {
                this.f5140l = premium(strAppmetrica, c0869l, this.f1218l);
            } else {
                this.f5140l = isVip(strCrashlytics, c0869l, i9);
            }
            if (this.f5140l instanceof ID3v23FrameBody) {
                return;
            }
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i10 = C17500l.yandex;
            this.f5140l = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f5140l);
        } catch (RuntimeException e) {
            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i11 = C17500l.yandex;
            StringBuilder sb = new StringBuilder("Buffer:");
            sb.append(c0869l.f2526l);
            sb.append(" ");
            String str2 = this.f1216l;
            throw new C11399l(AbstractC9361l.ad(sb, str2 == null ? "" : str2, " not valid ID3v2.30 frame ", str), e);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static boolean m1998throws(String str) {
        char cCharAt;
        return str.length() >= 4 && (cCharAt = str.charAt(0)) >= 'A' && cCharAt <= 'Z' && AbstractC3206l.isPro(str.charAt(1)) && AbstractC3206l.isPro(str.charAt(2)) && AbstractC3206l.isPro(str.charAt(3));
    }

    @Override // defpackage.AbstractC0231l, defpackage.AbstractC2377l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6364l)) {
            return false;
        }
        C6364l c6364l = (C6364l) obj;
        return AbstractC5998l.billing(this.f1215l, c6364l.f1215l) && AbstractC5998l.billing(this.f1219l, c6364l.f1219l) && super.equals(c6364l);
    }

    @Override // defpackage.AbstractC18219l
    public final int getSize() {
        return this.f5140l.getSize() + 10;
    }

    @Override // defpackage.AbstractC0231l
    public final int license() {
        return 10;
    }

    @Override // defpackage.AbstractC0231l
    public final int pro() {
        return 4;
    }

    @Override // defpackage.AbstractC18219l
    public final void read(ByteBuffer byteBuffer) throws C11399l {
        int i;
        String strInmobi = inmobi(byteBuffer);
        boolean zM1998throws = m1998throws(strInmobi);
        C13975l c13975l = f13328l;
        if (!zM1998throws) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            byteBuffer.position(byteBuffer.position() - 3);
            throw new C6226l(AbstractC9361l.advert(new StringBuilder(), this.f1217l, ":", strInmobi, ":is not a valid ID3v2.30 frame"));
        }
        int i3 = byteBuffer.getInt();
        this.f1218l = i3;
        if (i3 < 0) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            StringBuilder sbAdvert = AbstractC5020l.advert(strInmobi, " is invalid frame:");
            sbAdvert.append(this.f1218l);
            throw new C11399l(sbAdvert.toString());
        }
        if (i3 == 0) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
            byteBuffer.get();
            byteBuffer.get();
            throw new C15266l(strInmobi.concat(" is empty frame"));
        }
        if (i3 > byteBuffer.remaining()) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            byteBuffer.remaining();
            c13975l.getClass();
            int i6 = C17500l.yandex;
            StringBuilder sbAdvert2 = AbstractC5020l.advert(strInmobi, " is invalid frame:");
            sbAdvert2.append(this.f1218l);
            sbAdvert2.append(" larger than size of");
            sbAdvert2.append(byteBuffer.remaining());
            sbAdvert2.append(" before mp3 audio:");
            sbAdvert2.append(strInmobi);
            throw new C11399l(sbAdvert2.toString());
        }
        this.f1215l = new C4415l(this, byteBuffer.get());
        this.f1219l = new C13296l(this, byteBuffer.get());
        String strCrashlytics = AbstractC1163l.crashlytics(strInmobi);
        int i7 = 4;
        if (strCrashlytics == null) {
            strCrashlytics = (strInmobi.length() < 4 || !C5566l.admob().mopub(strInmobi.substring(0, 4))) ? "Unsupported" : strInmobi;
        }
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i8 = C17500l.yandex;
        if (((C13296l) this.f1219l).loadAd()) {
            i = byteBuffer.getInt();
            c13975l.getClass();
        } else {
            i = -1;
            i7 = 0;
        }
        if (((C13296l) this.f1219l).crashlytics()) {
            i7++;
            this.f13329l = byteBuffer.get();
        }
        if ((((C13296l) this.f1219l).yandex & 32) > 0) {
            i7++;
            this.f13330l = byteBuffer.get();
        }
        if (((C13296l) this.f1219l).amazon()) {
            AbstractC6419l.billing(this.f1219l.yandex());
            c13975l.getClass();
        }
        if (((C13296l) this.f1219l).loadAd() && i > this.f1218l * 100) {
            StringBuilder sbAdvert3 = AbstractC5020l.advert(strInmobi, " is invalid frame, frame size ");
            sbAdvert3.append(this.f1218l);
            sbAdvert3.append(" cannot be:");
            sbAdvert3.append(i);
            sbAdvert3.append(" when uncompressed");
            throw new C11399l(sbAdvert3.toString());
        }
        int i9 = this.f1218l - i7;
        if (i9 <= 0) {
            throw new C11399l(strInmobi + " is invalid frame, realframeSize is:" + i9);
        }
        try {
            if (((C13296l) this.f1219l).loadAd()) {
                ByteBuffer byteBufferYandex = AbstractC15201l.yandex(strInmobi, this.f1217l, byteBuffer, i, i9);
                if (((C13296l) this.f1219l).crashlytics()) {
                    this.f5140l = applovin(strCrashlytics, byteBufferYandex, i);
                } else {
                    this.f5140l = signatures(strCrashlytics, byteBufferYandex, i);
                }
            } else if (((C13296l) this.f1219l).crashlytics()) {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit(this.f1218l);
                this.f5140l = applovin(strInmobi, byteBufferSlice, this.f1218l);
            } else {
                ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                byteBufferSlice2.limit(i9);
                this.f5140l = signatures(strCrashlytics, byteBufferSlice2, i9);
            }
            if (!(this.f5140l instanceof ID3v23FrameBody)) {
                c13975l.getClass();
                this.f5140l = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f5140l);
            }
        } finally {
            byteBuffer.position(byteBuffer.position() + i9);
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return C5566l.admob().yandex(this.f1216l);
    }

    @Override // defpackage.AbstractC0231l
    public final void write(ByteArrayOutputStream byteArrayOutputStream) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f13328l;
        c13975l.getClass();
        int i = C17500l.yandex;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f5140l).write(byteArrayOutputStream2);
        if (this.f1216l.length() == 3) {
            this.f1216l = AbstractC2812l.tapsense(new StringBuilder(), this.f1216l, ' ');
        }
        byteBufferAllocate.put(this.f1216l.getBytes(AbstractC12379l.loadAd), 0, 4);
        this.f5140l.getSize();
        c13975l.getClass();
        byteBufferAllocate.putInt(this.f5140l.getSize());
        byteBufferAllocate.put(this.f1215l.loadAd);
        C13296l c13296l = (C13296l) this.f1219l;
        if (c13296l.amazon()) {
            AbstractC6419l.billing(c13296l.yandex);
            c13975l.getClass();
            c13296l.yandex = (byte) (((byte) (((byte) (((byte) (((byte) (c13296l.yandex & (-17))) & (-9))) & (-5))) & (-3))) & (-2));
        }
        AbstractC13107l abstractC13107l = this.f1219l;
        C13296l c13296l2 = (C13296l) abstractC13107l;
        c13296l2.yandex = (byte) (c13296l2.yandex & 127);
        byteBufferAllocate.put(abstractC13107l.yandex());
        try {
            byteArrayOutputStream.write(byteBufferAllocate.array());
            if (((C13296l) this.f1219l).crashlytics()) {
                byteArrayOutputStream.write(this.f13329l);
            }
            if ((((C13296l) this.f1219l).yandex & 32) > 0) {
                byteArrayOutputStream.write(this.f13330l);
            }
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            C11467l.metrica(e);
        }
    }

    public C6364l(String str, ByteBuffer byteBuffer) throws C11399l {
        this.f1217l = str;
        read(byteBuffer);
    }
}
