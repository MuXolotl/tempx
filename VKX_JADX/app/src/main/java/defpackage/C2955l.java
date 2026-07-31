package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: lؔ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2955l {
    public static final C13975l loadAd;
    public C2359l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static int loadAd(C11644l c11644l) {
        Iterator it = ((ArrayList) c11644l.f23357l).iterator();
        int iYandex = 0;
        while (it.hasNext()) {
            iYandex += ((C11709l) it.next()).yandex();
        }
        Iterator it2 = ((ArrayList) c11644l.f23360l).iterator();
        while (it2.hasNext()) {
            iYandex += ((C11709l) it2.next()).yandex();
        }
        Iterator it3 = ((ArrayList) c11644l.f23362l).iterator();
        while (it3.hasNext()) {
            iYandex += ((C11709l) it3.next()).yandex();
        }
        return iYandex;
    }

    public static void purchase(FileChannel fileChannel, C11644l c11644l) throws IOException {
        fileChannel.write(ByteBuffer.wrap(((C11709l) c11644l.f23358l).yandex.crashlytics()));
        fileChannel.write(((C11709l) c11644l.f23358l).loadAd.loadAd());
        for (C11709l c11709l : (ArrayList) c11644l.f23357l) {
            fileChannel.write(ByteBuffer.wrap(c11709l.yandex.crashlytics()));
            fileChannel.write(c11709l.loadAd.loadAd());
        }
        for (C11709l c11709l2 : (ArrayList) c11644l.f23360l) {
            fileChannel.write(ByteBuffer.wrap(c11709l2.yandex.crashlytics()));
            fileChannel.write(c11709l2.loadAd.loadAd());
        }
        for (C11709l c11709l3 : (ArrayList) c11644l.f23362l) {
            fileChannel.write(ByteBuffer.wrap(c11709l3.yandex.crashlytics()));
            fileChannel.write(c11709l3.loadAd.loadAd());
        }
    }

    public static int yandex(C11644l c11644l) {
        Iterator it = ((ArrayList) c11644l.f23357l).iterator();
        int iYandex = 0;
        while (it.hasNext()) {
            iYandex += ((C11709l) it.next()).yandex();
        }
        Iterator it2 = ((ArrayList) c11644l.f23360l).iterator();
        while (it2.hasNext()) {
            iYandex += ((C11709l) it2.next()).yandex();
        }
        Iterator it3 = ((ArrayList) c11644l.f23362l).iterator();
        while (it3.hasNext()) {
            iYandex += ((C11709l) it3.next()).yandex();
        }
        Iterator it4 = ((ArrayList) c11644l.f23361l).iterator();
        while (it4.hasNext()) {
            iYandex += ((C11709l) it4.next()).yandex();
        }
        return iYandex;
    }

    public final void amazon(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str) throws C9511l {
        String str2;
        IOException iOException;
        C2359l c2359l = this.yandex;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i = C17500l.yandex;
        try {
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            C11644l c11644l = new C11644l(15, false);
            c11644l.f23361l = new ArrayList(1);
            c11644l.f23357l = new ArrayList(1);
            c11644l.f23360l = new ArrayList(1);
            c11644l.f23362l = new ArrayList(1);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            str2 = " ";
            sb.append(" ");
            C11956l c11956l = new C11956l(fileChannel, sb.toString());
            try {
                try {
                    c11956l.yandex();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                C8662l c8662lAmazon = C8662l.amazon(fileChannel);
                                int i2 = c8662lAmazon.loadAd;
                                EnumC2692l enumC2692l = (EnumC2692l) c8662lAmazon.purchase;
                                if (enumC2692l != null) {
                                    switch (enumC2692l) {
                                        case STREAMINFO:
                                            c11644l.f23358l = new C11709l(c8662lAmazon, new C9889l(c8662lAmazon, fileChannel));
                                            break;
                                        case PADDING:
                                        case VORBIS_COMMENT:
                                        case PICTURE:
                                            fileChannel.position(fileChannel.position() + ((long) i2));
                                            C14513l c14513l = new C14513l(b == true ? 1 : 0, 9);
                                            c14513l.f28392l = i2;
                                            ((ArrayList) c11644l.f23361l).add(new C11709l(c8662lAmazon, c14513l));
                                            break;
                                        case APPLICATION:
                                            C7972l c7972l = new C7972l(19, (boolean) (b2 == true ? 1 : 0));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
                                            c7972l.f16631l = byteBufferAllocate;
                                            fileChannel.read(byteBufferAllocate);
                                            byteBufferAllocate.flip();
                                            ((ArrayList) c11644l.f23357l).add(new C11709l(c8662lAmazon, c7972l));
                                            break;
                                        case SEEKTABLE:
                                            C3585l c3585l = new C3585l(20, (boolean) (b3 == true ? 1 : 0));
                                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                                            c3585l.f7511l = byteBufferAllocate2;
                                            fileChannel.read(byteBufferAllocate2);
                                            byteBufferAllocate2.flip();
                                            ((ArrayList) c11644l.f23360l).add(new C11709l(c8662lAmazon, c3585l));
                                            break;
                                        case CUESHEET:
                                            C10975l c10975l = new C10975l(18, (boolean) (b4 == true ? 1 : 0));
                                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(i2);
                                            c10975l.f22121l = byteBufferAllocate3;
                                            fileChannel.read(byteBufferAllocate3);
                                            byteBufferAllocate3.flip();
                                            ((ArrayList) c11644l.f23362l).add(new C11709l(c8662lAmazon, c10975l));
                                            break;
                                        default:
                                            fileChannel.position(fileChannel.position() + ((long) i2));
                                            break;
                                    }
                                }
                                z = c8662lAmazon.crashlytics;
                            } catch (C13768l e) {
                                throw new C9511l(e.getMessage());
                            }
                        } catch (IOException e2) {
                            iOException = e2;
                            str2 = str;
                        }
                    }
                    int iYandex = yandex(c11644l);
                    int iLimit = c2359l.billing(interfaceC13280l, 0).limit() + loadAd(c11644l);
                    fileChannel.position(c11956l.crashlytics);
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i3 = C17500l.yandex;
                    if (iYandex != iLimit && iYandex <= iLimit + 4) {
                        c13975l.getClass();
                        crashlytics(str, interfaceC13280l, fileChannel, c11644l, c11956l, iLimit + 4000, iYandex);
                        return;
                    } else {
                        c13975l.getClass();
                        fileChannel.position(c11956l.crashlytics + 4);
                        purchase(fileChannel, c11644l);
                        fileChannel.write(c2359l.billing(interfaceC13280l, iYandex - iLimit));
                        return;
                    }
                } catch (C13768l e3) {
                    throw new C9511l(e3.getMessage());
                }
            } catch (IOException e4) {
                e = e4;
                iOException = e;
            }
        } catch (IOException e5) {
            e = e5;
            str2 = str;
        }
        iOException = e;
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        iOException.getMessage();
        c13975l.getClass();
        int i4 = C17500l.yandex;
        throw new C9511l(AbstractC5020l.adcel(iOException, AbstractC5020l.advert(str2, ":")));
    }

    public final void crashlytics(String str, InterfaceC13280l interfaceC13280l, FileChannel fileChannel, C11644l c11644l, C11956l c11956l, int i, int i2) throws IOException {
        long size = fileChannel.size();
        long j = c11956l.crashlytics + 42 + i2;
        int i3 = i - i2;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        loadAd.getClass();
        int i4 = C17500l.yandex;
        int i5 = (int) C6356l.amazon().adcel;
        if (i5 >= i3) {
            i3 = i5;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        fileChannel.position(j);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3);
        fileChannel.read(byteBufferAllocateDirect);
        byteBufferAllocateDirect.flip();
        linkedBlockingQueue.add(byteBufferAllocateDirect);
        long jPosition = fileChannel.position();
        fileChannel.position(c11956l.crashlytics + 4);
        purchase(fileChannel, c11644l);
        fileChannel.write(this.yandex.billing(interfaceC13280l, 4000));
        long jPosition2 = fileChannel.position();
        fileChannel.position(jPosition);
        while (fileChannel.position() < size) {
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i3);
            fileChannel.read(byteBufferAllocateDirect2);
            long jPosition3 = fileChannel.position();
            byteBufferAllocateDirect2.flip();
            linkedBlockingQueue.add(byteBufferAllocateDirect2);
            fileChannel.position(jPosition2);
            fileChannel.write((ByteBuffer) linkedBlockingQueue.remove());
            jPosition2 = fileChannel.position();
            fileChannel.position(jPosition3);
        }
        fileChannel.position(jPosition2);
        fileChannel.write((ByteBuffer) linkedBlockingQueue.remove());
    }
}
