package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: lًۖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8201l {
    public static final C13975l startapp;
    public C17701l admob;
    public C17701l amazon;
    public C17701l billing;
    public final C17701l crashlytics;
    public final C17701l loadAd;
    public final C8117l metrica;
    public C17701l mopub;
    public C17701l purchase;
    public final ByteBuffer vip;
    public final C17701l yandex;
    public final ArrayList subs = new ArrayList();
    public final ArrayList isPro = new ArrayList();
    public final ArrayList firebase = new ArrayList();
    public final ArrayList smaato = new ArrayList();
    public final ArrayList remoteconfig = new ArrayList();

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        startapp = new C13975l(4);
    }

    public C8201l(RandomAccessFile randomAccessFile) throws C13768l {
        C13975l c13975l = startapp;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(0L);
            this.yandex = new C17701l(null);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            while (channel.position() < channel.size()) {
                C8117l c8117l = new C8117l();
                byteBufferAllocate.clear();
                channel.read(byteBufferAllocate);
                byteBufferAllocate.rewind();
                try {
                    c8117l.billing(byteBufferAllocate);
                    c8117l.crashlytics = channel.position() - 8;
                    C17701l c17701l = new C17701l(c8117l);
                    String str = c8117l.yandex;
                    EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
                    if (str.equals("moov")) {
                        if ((this.loadAd != null) && (this.crashlytics != null)) {
                            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                            channel.position();
                            c13975l.getClass();
                            int i = C17500l.yandex;
                            break;
                        }
                        this.loadAd = c17701l;
                        this.metrica = c8117l;
                        long jPosition = channel.position();
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(c8117l.yandex());
                        this.vip = byteBufferAllocate2;
                        int i2 = channel.read(byteBufferAllocate2);
                        if (i2 < c8117l.yandex()) {
                            Locale.getDefault();
                            throw new C13768l("The atom " + c8117l.yandex + " states its data length to be " + c8117l.yandex() + " but there are only " + i2 + " bytes remaining in the file");
                        }
                        this.vip.rewind();
                        yandex(this.vip, c17701l);
                        channel.position(jPosition);
                    } else if (c8117l.yandex.equals("free")) {
                        this.isPro.add(c17701l);
                    } else if (c8117l.yandex.equals("mdat")) {
                        this.crashlytics = c17701l;
                        this.firebase.add(c17701l);
                    }
                    this.yandex.yandex(c17701l);
                    channel.position(channel.position() + ((long) c8117l.yandex()));
                } catch (C1293l e) {
                    if (!(this.loadAd != null) || !(this.crashlytics != null)) {
                        throw e;
                    }
                    long jPosition2 = channel.position() - 8;
                    long size = channel.size();
                    C0117l c0117l = new C0117l();
                    c0117l.crashlytics = jPosition2;
                    c0117l.loadAd = (int) (size - jPosition2);
                    this.yandex.yandex(new C17701l(c0117l));
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i3 = C17500l.yandex;
                }
            }
            if (this.crashlytics == null) {
                throw new C13768l("Unable to determine start of audio in file");
            }
        } catch (Throwable th) {
            if (this.crashlytics == null) {
                throw new C13768l("Unable to determine start of audio in file");
            }
            throw th;
        }
    }

    public static C8117l loadAd(C17701l c17701l) {
        if (c17701l == null) {
            return null;
        }
        return (C8117l) c17701l.f34486l;
    }

    public final void yandex(ByteBuffer byteBuffer, C17701l c17701l) throws C13768l {
        C8117l c8117l;
        C8117l c8117l2 = (C8117l) c17701l.f34486l;
        int iPosition = byteBuffer.position();
        String str = c8117l2.yandex;
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        int i = 0;
        if (str.equals("meta")) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            if (bArr[0] != 0) {
                throw new C13768l("Expect data in meta box to be null");
            }
            try {
                try {
                    new C8117l().billing(byteBuffer);
                } catch (C1293l unused) {
                    byteBuffer.position(byteBuffer.position() - 4);
                }
                byteBuffer.position(byteBuffer.position() - 8);
            } catch (Throwable th) {
                byteBuffer.position(byteBuffer.position() - 8);
                throw th;
            }
        }
        int iPosition2 = byteBuffer.position();
        while (byteBuffer.position() < (c8117l2.yandex() + iPosition2) - 8) {
            C8117l c8117l3 = new C8117l();
            c8117l3.billing(byteBuffer);
            c8117l3.crashlytics = this.metrica.crashlytics + ((long) byteBuffer.position());
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            startapp.getClass();
            int i2 = C17500l.yandex;
            C17701l c17701l2 = new C17701l(c8117l3);
            c17701l.yandex(c17701l2);
            String str2 = c8117l3.yandex;
            EnumC8101l enumC8101l2 = EnumC8101l.UNKNOWN;
            if (str2.equals("udta")) {
                this.mopub = c17701l2;
            } else if (c8117l3.yandex.equals("meta") && c8117l2.yandex.equals("udta")) {
                this.purchase = c17701l2;
            } else if (c8117l3.yandex.equals("hdlr") && c8117l2.yandex.equals("meta")) {
                this.admob = c17701l2;
            } else if (!c8117l3.yandex.equals("hdlr")) {
                if (c8117l3.yandex.equals("tags")) {
                    this.billing = c17701l2;
                } else if (c8117l3.yandex.equals("stco")) {
                    C18319l c18319l = new C18319l(i);
                    c18319l.f33215l = c8117l3;
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    c18319l.f33214l = byteBufferSlice;
                    byteBufferSlice.order(ByteOrder.BIG_ENDIAN);
                    ByteBuffer byteBuffer2 = (ByteBuffer) c18319l.f33214l;
                    byteBuffer2.position(byteBuffer2.position() + 4);
                    c18319l.f35824l = ((ByteBuffer) c18319l.f33214l).getInt();
                    c18319l.f35823l = ((ByteBuffer) c18319l.f33214l).getInt();
                    this.remoteconfig.add(c18319l);
                    this.subs.add(c17701l2);
                } else if (c8117l3.yandex.equals("ilst")) {
                    C17701l c17701l3 = c17701l.f34488l;
                    if (c17701l3 != null && (c8117l = (C8117l) c17701l3.f34486l) != null && c8117l2.yandex.equals("meta") && c8117l.yandex.equals("udta")) {
                        this.amazon = c17701l2;
                    }
                } else if (c8117l3.yandex.equals("free")) {
                    this.isPro.add(c17701l2);
                } else if (c8117l3.yandex.equals("trak")) {
                    this.smaato.add(c17701l2);
                }
            }
            if (c8117l3.yandex.equals("trak") || c8117l3.yandex.equals("mdia") || c8117l3.yandex.equals("minf") || c8117l3.yandex.equals("stbl") || c8117l3.yandex.equals("udta") || c8117l3.yandex.equals("meta") || c8117l3.yandex.equals("ilst")) {
                yandex(byteBuffer, c17701l2);
            }
            byteBuffer.position(c8117l3.yandex() + byteBuffer.position());
            i = 0;
        }
        byteBuffer.position(iPosition);
    }
}
