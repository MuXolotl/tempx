package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٗٞۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17305l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static void admob(FileChannel fileChannel, ByteBuffer byteBuffer) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        EnumC17542l enumC17542l = EnumC17542l.TAG;
        long jLimit = byteBuffer.limit();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(byteOrder);
        byteBufferAllocate.put("ID3 ".getBytes(AbstractC12379l.yandex));
        byteBufferAllocate.putInt((int) jLimit);
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
        fileChannel.write(byteBuffer);
        if (AbstractC14375l.admob(byteBuffer.limit())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
    }

    public static C7288l amazon(FileChannel fileChannel, String str) {
        try {
            return C0118l.isPro(fileChannel, str);
        } catch (C13768l unused) {
            throw new C9511l(AbstractC12900l.firebase(str, " Failed to read file"));
        }
    }

    public static void billing(FileChannel fileChannel) {
        int i = AbstractC11306l.loadAd;
        fileChannel.position(i);
        int i2 = AbstractC11306l.crashlytics;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocateDirect.putInt((((int) fileChannel.size()) - i) - i2);
        byteBufferAllocateDirect.flip();
        fileChannel.write(byteBufferAllocateDirect);
    }

    public static void crashlytics(FileChannel fileChannel, C7288l c7288l, C16528l c16528l, String str) {
        int i = (int) c16528l.f32303l;
        int i2 = i + 8;
        long j = i2;
        if (AbstractC14375l.admob(j) && c7288l.billing() + j < fileChannel.size()) {
            i2 = i + 9;
        }
        long j2 = i2;
        long size = fileChannel.size() - j2;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c7288l.billing();
        C13975l c13975l = yandex;
        c13975l.getClass();
        int i3 = C17500l.yandex;
        fileChannel.position(c7288l.billing() + j2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) C6356l.amazon().adcel);
        while (true) {
            if (fileChannel.read(byteBufferAllocateDirect) < 0 && byteBufferAllocateDirect.position() == 0) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
                fileChannel.truncate(size);
                return;
            }
            byteBufferAllocateDirect.flip();
            long jPosition = fileChannel.position();
            fileChannel.position((jPosition - j2) - ((long) byteBufferAllocateDirect.limit()));
            fileChannel.write(byteBufferAllocateDirect);
            fileChannel.position(jPosition);
            byteBufferAllocateDirect.compact();
        }
    }

    public static void loadAd(FileChannel fileChannel, C7288l c7288l, String str) {
        C2047l c2047l;
        int i = 0;
        while (true) {
            ArrayList arrayList = c7288l.f15139l;
            if (i >= arrayList.size()) {
                c2047l = null;
                break;
            } else {
                if (((C2047l) arrayList.get(i)).loadAd == c7288l.billing()) {
                    c2047l = (C2047l) arrayList.get(i - 1);
                    break;
                }
                i++;
            }
        }
        C13975l c13975l = yandex;
        if (c2047l == null) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        } else {
            if (AbstractC14375l.admob(c2047l.loadAd + c2047l.crashlytics + 8)) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c7288l.billing();
                c13975l.getClass();
                int i3 = C17500l.yandex;
                fileChannel.truncate(c7288l.billing());
                return;
            }
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c7288l.billing();
            c13975l.getClass();
            int i4 = C17500l.yandex;
            fileChannel.truncate(c7288l.billing() - 1);
        }
    }

    public static C16528l mopub(FileChannel fileChannel, C7288l c7288l, String str) {
        fileChannel.position(c7288l.billing());
        C16528l c16528l = new C16528l(ByteOrder.BIG_ENDIAN);
        c16528l.billing(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        EnumC17542l enumC17542l = EnumC17542l.TAG;
        if ("ID3 ".equals((String) c16528l.f32302l)) {
            return c16528l;
        }
        StringBuilder sbAdvert = AbstractC5020l.advert(str, " Unable to find ID3 chunk at expected location:");
        sbAdvert.append(c7288l.billing());
        throw new C9511l(sbAdvert.toString());
    }

    public static boolean purchase(C7288l c7288l, FileChannel fileChannel) {
        if (c7288l.f15140l.f7144l.longValue() != fileChannel.size()) {
            return AbstractC14375l.admob(c7288l.f15140l.f7144l.longValue()) && c7288l.f15140l.f7144l.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static ByteBuffer yandex(C7288l c7288l, C7288l c7288l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long jLongValue = !c7288l2.f15137l ? 0L : c7288l2.f15140l.f7144l.longValue() - c7288l2.f15140l.f7147l.longValue();
            if (jLongValue > 0 && (jLongValue & 1) != 0) {
                jLongValue++;
            }
            c7288l.f15140l.m1322case((int) jLongValue, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                byteArrayOutputStream = new ByteArrayOutputStream();
                c7288l.f15140l.m1322case(length, byteArrayOutputStream);
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            byteBufferWrap.rewind();
            return byteBufferWrap;
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }
}
