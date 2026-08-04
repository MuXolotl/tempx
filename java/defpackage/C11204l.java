package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyDeprecated;
import ealvatag.tag.id3.framebody.ID3v24FrameBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lَُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11204l extends AbstractC0231l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C13975l f22557l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f22558l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f22559l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f22557l = new C13975l(4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00de A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0079, B:29:0x007f, B:32:0x008b, B:37:0x009a, B:39:0x00b4, B:43:0x00c2, B:45:0x00d0, B:51:0x00f3, B:53:0x00f9, B:46:0x00d7, B:47:0x00de, B:49:0x00e6, B:50:0x00ed), top: B:71:0x0079, outer: #0 }] */
    public C11204l(C0869l c0869l, String str, boolean z) throws C11399l {
        int i;
        int iLoadAd;
        long j;
        boolean z2;
        C0869l c0869lYandex;
        int i2;
        AbstractC13107l abstractC13107l;
        C0869l c0869lSignature;
        this.f1217l = str;
        C13975l c13975l = f22557l;
        long j2 = c0869l.f2526l;
        try {
            String strAppmetrica = appmetrica(c0869l);
            if (!m3050package(strAppmetrica)) {
                throw new C6226l(str + ":" + strAppmetrica + ":is not a valid ID3v2.30 frame");
            }
            m3051throws(c0869l);
            this.f1215l = new C4415l(this, c0869l.readByte());
            C10686l c10686l = new C10686l(this, c0869l.readByte());
            this.f1219l = c10686l;
            if ((c10686l.yandex & 64) > 0) {
                this.f22559l = c0869l.readByte();
                i = 1;
            } else {
                i = 0;
            }
            if (((C10686l) this.f1219l).loadAd()) {
                i++;
                this.f22558l = c0869l.readByte();
            }
            if ((((C10686l) this.f1219l).yandex & 1) > 0) {
                iLoadAd = AbstractC17265l.loadAd(c0869l);
                i += 4;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i3 = C17500l.yandex;
            } else {
                iLoadAd = -1;
            }
            int i4 = this.f1218l - i;
            if (z) {
                try {
                    if (AbstractC0231l.ad(strAppmetrica)) {
                        c0869l.skip(i4);
                        this.f5140l = null;
                    } else {
                        if ((((C10686l) this.f1219l).yandex & 2) > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            C0869l c0869l2 = new C0869l();
                            c0869l.ad(c0869l2, i4);
                            c0869lYandex = C0268l.yandex(c0869l2);
                            i2 = (int) c0869lYandex.f2526l;
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i5 = C17500l.yandex;
                        } else {
                            c0869lYandex = c0869l;
                            i2 = i4;
                        }
                        abstractC13107l = this.f1219l;
                        if ((((C10686l) abstractC13107l).yandex & 8) > 0) {
                            c0869lSignature = AbstractC0231l.Signature(c0869lYandex, i2, iLoadAd);
                            if (((C10686l) this.f1219l).loadAd()) {
                                this.f5140l = premium(strAppmetrica, c0869lSignature, iLoadAd);
                            } else {
                                this.f5140l = isVip(strAppmetrica, c0869lSignature, iLoadAd);
                            }
                        } else if (((C10686l) abstractC13107l).loadAd()) {
                            this.f5140l = premium(strAppmetrica, c0869lYandex, i2);
                        } else {
                            this.f5140l = isVip(strAppmetrica, c0869lYandex, i2);
                        }
                        if (!(this.f5140l instanceof ID3v24FrameBody)) {
                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i6 = C17500l.yandex;
                            this.f5140l = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f5140l);
                        }
                    }
                } finally {
                    j = j2 - ((long) i4);
                    long j3 = c0869l.f2526l;
                    if (j3 > j) {
                        c0869l.skip(j3 - j);
                    }
                }
            } else {
                if ((((C10686l) this.f1219l).yandex & 2) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C0869l c0869l3 = new C0869l();
                    c0869l.ad(c0869l3, i4);
                    c0869lYandex = C0268l.yandex(c0869l3);
                    i2 = (int) c0869lYandex.f2526l;
                    EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i7 = C17500l.yandex;
                } else {
                    c0869lYandex = c0869l;
                    i2 = i4;
                }
                abstractC13107l = this.f1219l;
                if ((((C10686l) abstractC13107l).yandex & 8) > 0) {
                    c0869lSignature = AbstractC0231l.Signature(c0869lYandex, i2, iLoadAd);
                    if (((C10686l) this.f1219l).loadAd()) {
                        this.f5140l = premium(strAppmetrica, c0869lSignature, iLoadAd);
                    } else {
                        this.f5140l = isVip(strAppmetrica, c0869lSignature, iLoadAd);
                    }
                } else if (((C10686l) abstractC13107l).loadAd()) {
                    this.f5140l = premium(strAppmetrica, c0869lYandex, i2);
                } else {
                    this.f5140l = isVip(strAppmetrica, c0869lYandex, i2);
                }
                if (!(this.f5140l instanceof ID3v24FrameBody)) {
                    EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i8 = C17500l.yandex;
                    this.f5140l = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f5140l);
                }
            }
            j = j2 - ((long) i4);
        } catch (RuntimeException e) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i9 = C17500l.yandex;
            StringBuilder sb = new StringBuilder("Buffer:");
            sb.append(c0869l.f2526l);
            sb.append(" ");
            String str2 = this.f1216l;
            throw new C11399l(AbstractC9361l.ad(sb, str2 == null ? "" : str2, " not valid ID3v2.30 frame ", str), e);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static boolean m3050package(String str) {
        char cCharAt;
        return str.length() >= 4 && (cCharAt = str.charAt(0)) >= 'A' && cCharAt <= 'Z' && AbstractC3206l.isPro(str.charAt(1)) && AbstractC3206l.isPro(str.charAt(2)) && AbstractC3206l.isPro(str.charAt(3));
    }

    @Override // defpackage.AbstractC0231l, defpackage.AbstractC2377l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11204l)) {
            return false;
        }
        C11204l c11204l = (C11204l) obj;
        return AbstractC5998l.billing(this.f1215l, c11204l.f1215l) && AbstractC5998l.billing(this.f1219l, c11204l.f1219l) && super.equals(c11204l);
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
        int iCrashlytics;
        int iLimit;
        boolean z;
        String strInmobi = inmobi(byteBuffer);
        boolean zM3050package = m3050package(strInmobi);
        C13975l c13975l = f22557l;
        if (!zM3050package) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            byteBuffer.position(byteBuffer.position() - 3);
            throw new C6226l(AbstractC9361l.advert(new StringBuilder(), this.f1217l, ":", strInmobi, ":is not a valid ID3v2.30 frame"));
        }
        int iCrashlytics2 = AbstractC17265l.crashlytics(byteBuffer);
        this.f1218l = iCrashlytics2;
        if (iCrashlytics2 < 0) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
        }
        if (iCrashlytics2 == 0) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            byteBuffer.get();
            byteBuffer.get();
            throw new C15266l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is empty frame"));
        }
        if (iCrashlytics2 > byteBuffer.remaining() - 2) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
            throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
        }
        if (this.f1218l > 127) {
            int iPosition = byteBuffer.position();
            int i6 = iPosition - 4;
            byteBuffer.position(i6);
            int i7 = byteBuffer.getInt();
            byteBuffer.position(i6);
            int iPosition2 = byteBuffer.position();
            int i8 = 0;
            while (true) {
                if (i8 >= 4) {
                    z = false;
                    break;
                } else {
                    if ((byteBuffer.get(iPosition2 + i8) & 128) > 0) {
                        z = true;
                        break;
                    }
                    i8++;
                }
            }
            byteBuffer.position(iPosition);
            if (z) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i9 = C17500l.yandex;
                if (i7 > byteBuffer.remaining() + 2) {
                    throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
                }
                this.f1218l = i7;
            } else {
                byte[] bArr = new byte[4];
                byteBuffer.position(this.f1218l + iPosition + 2);
                if (byteBuffer.remaining() < 4) {
                    byteBuffer.position(iPosition);
                } else {
                    byteBuffer.get(bArr, 0, 4);
                    byteBuffer.position(iPosition);
                    if (!m3050package(new String(bArr)) && !AbstractC17265l.billing(bArr)) {
                        if (i7 > byteBuffer.remaining() - 2) {
                            byteBuffer.position(iPosition);
                        } else {
                            byte[] bArr2 = new byte[4];
                            byteBuffer.position(iPosition + i7 + 2);
                            if (byteBuffer.remaining() >= 4) {
                                byteBuffer.get(bArr2, 0, 4);
                                String str = new String(bArr2);
                                byteBuffer.position(iPosition);
                                if (m3050package(str) || AbstractC17265l.billing(bArr2)) {
                                    this.f1218l = i7;
                                    EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i10 = C17500l.yandex;
                                }
                            } else {
                                byteBuffer.position(iPosition);
                                if (byteBuffer.remaining() == 0) {
                                    this.f1218l = i7;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f1215l = new C4415l(this, byteBuffer.get());
        C10686l c10686l = new C10686l(this, byteBuffer.get());
        this.f1219l = c10686l;
        if ((c10686l.yandex & 64) > 0) {
            this.f22559l = byteBuffer.get();
            i = 1;
        } else {
            i = 0;
        }
        if (((C10686l) this.f1219l).loadAd()) {
            i++;
            this.f22558l = byteBuffer.get();
        }
        if ((((C10686l) this.f1219l).yandex & 1) > 0) {
            iCrashlytics = AbstractC17265l.crashlytics(byteBuffer);
            i += 4;
            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i11 = C17500l.yandex;
        } else {
            iCrashlytics = -1;
        }
        int i12 = this.f1218l - i;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(i12);
        if ((((C10686l) this.f1219l).yandex & 2) > 0) {
            byteBufferSlice = AbstractC11531l.yandex(byteBufferSlice);
            iLimit = byteBufferSlice.limit();
            EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i13 = C17500l.yandex;
        } else {
            iLimit = i12;
        }
        try {
            AbstractC13107l abstractC13107l = this.f1219l;
            if ((((C10686l) abstractC13107l).yandex & 8) > 0) {
                ByteBuffer byteBufferYandex = AbstractC15201l.yandex(strInmobi, this.f1217l, byteBuffer, iCrashlytics, i12);
                if (((C10686l) this.f1219l).loadAd()) {
                    this.f5140l = applovin(strInmobi, byteBufferYandex, iCrashlytics);
                } else {
                    this.f5140l = signatures(strInmobi, byteBufferYandex, iCrashlytics);
                }
            } else if (((C10686l) abstractC13107l).loadAd()) {
                byteBuffer.slice().limit(i12);
                this.f5140l = applovin(strInmobi, byteBuffer, this.f1218l);
            } else {
                this.f5140l = signatures(strInmobi, byteBufferSlice, iLimit);
            }
            if (!(this.f5140l instanceof ID3v24FrameBody)) {
                EnumC8711l[] enumC8711lArr9 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i14 = C17500l.yandex;
                this.f5140l = new FrameBodyDeprecated((AbstractID3v2FrameBody) this.f5140l);
            }
        } finally {
            byteBuffer.position(byteBuffer.position() + i12);
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return C6647l.subs().yandex(this.f1216l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m3051throws(C0869l c0869l) throws C11399l {
        long j;
        int iAds = ((c0869l.ads(0L) & 255) << 21) + ((c0869l.ads(1L) & 255) << 14) + ((c0869l.ads(2L) & 255) << 7) + (c0869l.ads(3L) & 255);
        this.f1218l = iAds;
        C13975l c13975l = f22557l;
        if (iAds < 0) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
        }
        if (iAds == 0) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            for (int i3 = 0; i3 < 6; i3++) {
                c0869l.readByte();
            }
            throw new C15266l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is empty frame"));
        }
        long j2 = iAds;
        long j3 = c0869l.f2526l;
        if (j2 > j3 - 2) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
        }
        if (iAds <= 127) {
            j = 4;
            break;
        }
        int iAds2 = ((c0869l.ads(0L) & 255) << 24) | ((c0869l.ads(1L) & 255) << 16) | ((c0869l.ads(2L) & 255) << 8) | (c0869l.ads(3L) & 255);
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                byte[] bArr = new byte[4];
                int i6 = 6 + this.f1218l;
                j = 4;
                if (c0869l.f2526l - ((long) i6) < 4) {
                    break;
                }
                for (int i7 = 0; i7 < 4; i7++) {
                    bArr[i7] = c0869l.ads(i6 + i7);
                }
                if (!m3050package(new String(bArr)) && !AbstractC17265l.billing(bArr)) {
                    long j4 = iAds2;
                    long j5 = c0869l.f2526l;
                    long j6 = j5 + 4;
                    if (j4 > j6) {
                        break;
                    }
                    byte[] bArr2 = new byte[4];
                    int i8 = 6 + iAds2;
                    if (j5 - ((long) i8) < 4) {
                        if (j6 != 0) {
                            break;
                        }
                        this.f1218l = iAds2;
                        break;
                    }
                    for (int i9 = 0; i9 < 4; i9++) {
                        bArr2[i9] = c0869l.ads(i8 + i9);
                    }
                    if (!m3050package(new String(bArr2)) && !AbstractC17265l.billing(bArr2)) {
                        break;
                    }
                    this.f1218l = iAds2;
                    EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i10 = C17500l.yandex;
                    break;
                }
                break;
                break;
            }
            if ((c0869l.ads(i5) & 128) > 0) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i11 = C17500l.yandex;
                if (iAds2 > c0869l.f2526l + 4) {
                    throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1216l, " is invalid frame"));
                }
                this.f1218l = iAds2;
                j = 4;
                break;
            }
            i5++;
        }
        if (c0869l.f2526l == j3) {
            c0869l.skip(j);
        } else {
            C18073l.license("LIBRARY MISCONFIGURATION checkIfFrameSizeThatIsNotSyncSafe moved the buffer pointer");
        }
    }

    @Override // defpackage.AbstractC0231l
    public final void write(ByteArrayOutputStream byteArrayOutputStream) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f22557l;
        c13975l.getClass();
        int i = C17500l.yandex;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((AbstractID3v2FrameBody) this.f5140l).write(byteArrayOutputStream2);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        C6356l.amazon();
        if (this.f1216l.length() == 3) {
            this.f1216l = AbstractC2812l.tapsense(new StringBuilder(), this.f1216l, ' ');
        }
        byteBufferAllocate.put(this.f1216l.getBytes(AbstractC12379l.loadAd), 0, 4);
        int length = byteArray.length;
        c13975l.getClass();
        byteBufferAllocate.put(AbstractC17265l.admob(length));
        byteBufferAllocate.put(this.f1215l.loadAd);
        C10686l c10686l = (C10686l) this.f1219l;
        byte b = c10686l.yandex;
        if ((b & 128) > 0 || (b & 32) > 0 || (b & 16) > 0) {
            AbstractC6419l.billing(b);
            c13975l.getClass();
            c10686l.yandex = (byte) (((byte) (((byte) (c10686l.yandex & 127)) & (-33))) & (-17));
        }
        AbstractC13107l abstractC13107l = this.f1219l;
        C10686l c10686l2 = (C10686l) abstractC13107l;
        c10686l2.yandex = (byte) (((byte) (((byte) (c10686l2.yandex & (-3))) & (-9))) & (-2));
        byteBufferAllocate.put(abstractC13107l.yandex());
        try {
            byteArrayOutputStream.write(byteBufferAllocate.array());
            if (((C10686l) this.f1219l).loadAd()) {
                byteArrayOutputStream.write(this.f22558l);
            }
            if ((((C10686l) this.f1219l).yandex & 64) > 0) {
                byteArrayOutputStream.write(this.f22559l);
            }
            byteArrayOutputStream.write(byteArray);
        } catch (IOException e) {
            C11467l.metrica(e);
        }
    }

    public C11204l(String str, ByteBuffer byteBuffer) throws C11399l {
        this.f1217l = str;
        read(byteBuffer);
    }
}
