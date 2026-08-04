package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9269l {
    public static final C13975l crashlytics;
    public C7433l loadAd;
    public C3316l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        crashlytics = new C13975l(4);
    }

    public static ByteBuffer amazon(C9489l c9489l, int i, int i2, C14141l c14141l, ByteBuffer byteBuffer) {
        byte[] byteArray;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = crashlytics;
        c13975l.getClass();
        int i3 = C17500l.yandex;
        int i4 = c9489l.yandex;
        List list = (List) c9489l.crashlytics;
        c13975l.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i4 == 0) {
            byteArray = loadAd(i, false);
        } else {
            byte[] bArrLoadAd = loadAd(i, true);
            byte[] bArrLoadAd2 = list.size() > 0 ? loadAd(i4, true) : loadAd(i4, false);
            try {
                byteArrayOutputStream.write(bArrLoadAd);
                byteArrayOutputStream.write(bArrLoadAd2);
                if (list.size() > 0) {
                    list.size();
                    c13975l.getClass();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(loadAd(((C0611l) it.next()).loadAd.intValue(), false));
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                C18073l.license(AbstractC5020l.adcel(e, new StringBuilder("Unable to create segment table:")));
                return null;
            }
        }
        int length = byteArray.length + 27;
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i5 = C17500l.yandex;
        c13975l.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2 + length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(c14141l.yandex, 0, 26);
        byteBufferAllocate.put((byte) byteArray.length);
        for (byte b : byteArray) {
            byteBufferAllocate.put(b);
        }
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    public static void billing(int i, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C13768l, C9511l, IOException {
        long jRemaining;
        long filePointer = randomAccessFile.getFilePointer();
        long filePointer2 = randomAccessFile2.getFilePointer();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        randomAccessFile.getChannel().read(byteBufferAllocate);
        byteBufferAllocate.rewind();
        while (byteBufferAllocate.hasRemaining()) {
            try {
                C14141l c14141lCrashlytics = C14141l.crashlytics(byteBufferAllocate);
                byte[] bArr = c14141lCrashlytics.yandex;
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(c14141lCrashlytics.yandex() + bArr.length);
                byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate3.put(bArr);
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.limit(c14141lCrashlytics.yandex());
                byteBufferAllocate3.put(byteBufferSlice);
                i++;
                byteBufferAllocate3.putInt(18, i);
                yandex(byteBufferAllocate3);
                byteBufferAllocate.position(c14141lCrashlytics.yandex() + byteBufferAllocate.position());
                byteBufferAllocate3.rewind();
                byteBufferAllocate2.put(byteBufferAllocate3);
            } catch (C13768l e) {
                byteBufferAllocate.position(byteBufferAllocate.position() - C14141l.remoteconfig.length);
                C13975l c13975l = AbstractC14375l.yandex;
                byte[] bArr2 = new byte[3];
                byteBufferAllocate.get(bArr2);
                if (!new String(bArr2, AbstractC12379l.loadAd).equals("TAG")) {
                    throw e;
                }
                jRemaining = byteBufferAllocate.remaining() + 3;
            }
        }
        jRemaining = 0;
        byteBufferAllocate2.flip();
        randomAccessFile2.getChannel().write(byteBufferAllocate2);
        if (randomAccessFile.length() - filePointer == (randomAccessFile2.length() + jRemaining) - filePointer2) {
            return;
        }
        throw new C9511l("File written counts don't match, file not written:origAudioLength:" + (randomAccessFile.length() - filePointer) + ":newAudioLength:" + ((randomAccessFile2.length() + jRemaining) - filePointer2) + ":bytesDiscarded:" + jRemaining);
    }

    public static boolean crashlytics(int i, int i2, List list) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            int i5 = i / 255;
            i3 = i5 + 1;
            if (i % 255 == 0) {
                i3 = i5 + 2;
            }
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = crashlytics;
        c13975l.getClass();
        int i6 = C17500l.yandex;
        if (i2 == 0) {
            i4 = i3 + 1;
        } else {
            i4 = i3 + (i2 / 255) + 1;
            if (i2 % 255 == 0) {
                i4++;
            }
        }
        c13975l.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = ((C0611l) it.next()).loadAd;
            if (num.intValue() == 0) {
                i4++;
            } else {
                int iIntValue = (num.intValue() / 255) + 1 + i4;
                if (num.intValue() % 255 == 0) {
                    iIntValue++;
                }
                i4 = iIntValue;
            }
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i7 = C17500l.yandex;
        return i4 <= 255;
    }

    public static byte[] loadAd(int i, boolean z) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        crashlytics.getClass();
        int i2 = C17500l.yandex;
        int i3 = 0;
        if (i == 0) {
            return new byte[]{0};
        }
        int i4 = (i / 255) + ((i % 255 != 0 || z) ? 1 : 0);
        byte[] bArr = new byte[i4];
        while (true) {
            int i5 = i4 - 1;
            if (i3 >= i5) {
                bArr[i5] = (byte) (i - (i3 * 255));
                return bArr;
            }
            bArr[i3] = -1;
            i3++;
        }
    }

    public static void yandex(ByteBuffer byteBuffer) {
        byteBuffer.putInt(22, 0);
        byte[] bArrArray = byteBuffer.array();
        boolean z = AbstractC14566l.loadAd;
        long[] jArr = AbstractC14566l.yandex;
        long j = 0;
        if (!z) {
            for (int i = 0; i < 256; i++) {
                long j2 = i << 24;
                for (int i2 = 0; i2 < 8; i2++) {
                    j2 = (2147483648L & j2) != 0 ? (j2 << 1) ^ 79764919 : j2 << 1;
                }
                jArr[i] = j2;
            }
            AbstractC14566l.loadAd = true;
        }
        for (byte b : bArrArray) {
            j = (j << 8) ^ jArr[(int) ((255 & (j >>> 24)) ^ ((long) (b & 255)))];
        }
        byte[] bArr = {(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255)};
        for (int i3 = 0; i3 < 4; i3++) {
            byteBuffer.put(i3 + 22, bArr[i3]);
        }
        byteBuffer.rewind();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x0263 A[PHI: r12 r14 r25
  0x0263: PHI (r12v9 long) = (r12v8 long), (r12v21 long), (r12v21 long) binds: [B:53:0x0262, B:32:0x01a9, B:29:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x0263: PHI (r14v10 int) = (r14v4 int), (r14v19 int), (r14v21 int) binds: [B:53:0x0262, B:32:0x01a9, B:29:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x0263: PHI (r25v1 int) = (r25v0 int), (r25v3 int), (r25v3 int) binds: [B:53:0x0262, B:32:0x01a9, B:29:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C13768l, C9511l, IOException {
        boolean z;
        ArrayList arrayList;
        int i;
        long filePointer;
        List listSubList;
        int iIntValue;
        int i2;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = crashlytics;
        c13975l.getClass();
        int i3 = C17500l.yandex;
        c13975l.getClass();
        C14141l c14141lLoadAd = C14141l.loadAd(randomAccessFile);
        randomAccessFile.seek(c14141lLoadAd.firebase);
        FileChannel channel = randomAccessFile2.getChannel();
        FileChannel channel2 = randomAccessFile.getChannel();
        int iYandex = c14141lLoadAd.yandex() + 27;
        byte[] bArr = c14141lLoadAd.admob;
        channel.transferFrom(channel2, 0L, iYandex + bArr.length);
        randomAccessFile2.skipBytes(c14141lLoadAd.yandex() + 27 + bArr.length);
        c13975l.getClass();
        C14141l c14141lLoadAd2 = C14141l.loadAd(randomAccessFile);
        int i4 = c14141lLoadAd2.billing;
        boolean z2 = c14141lLoadAd2.isPro;
        ArrayList arrayList2 = c14141lLoadAd2.subs;
        long filePointer2 = randomAccessFile.getFilePointer();
        c13975l.getClass();
        randomAccessFile.seek(0L);
        this.loadAd.getClass();
        C7433l.loadAd.getClass();
        long filePointer3 = randomAccessFile.getFilePointer();
        ArrayList arrayList3 = new ArrayList();
        randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) C14141l.loadAd(randomAccessFile).yandex()));
        C14141l c14141lLoadAd3 = C14141l.loadAd(randomAccessFile);
        randomAccessFile.getFilePointer();
        int length = c14141lLoadAd3.admob.length;
        byte[] bArr2 = new byte[7];
        randomAccessFile.read(bArr2);
        String str = new String(bArr2, 1, 6, AbstractC12379l.loadAd);
        int i5 = 0;
        if (bArr2[0] != 3 || !str.equals("vorbis")) {
            throw new C13768l("Cannot find comment block (no vorbiscomment header)");
        }
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
        randomAccessFile.getFilePointer();
        int iIntValue2 = 0;
        while (true) {
            z = c14141lLoadAd3.isPro;
            arrayList = c14141lLoadAd3.subs;
            iIntValue2 += ((C0611l) arrayList.get(i5)).loadAd.intValue();
            randomAccessFile.skipBytes(((C0611l) arrayList.get(i5)).loadAd.intValue());
            if (arrayList.size() > 1 || !z) {
                break;
            }
            c14141lLoadAd3 = C14141l.loadAd(randomAccessFile);
            i5 = 0;
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        randomAccessFile.getFilePointer();
        int i6 = C17500l.yandex;
        if (arrayList.size() == 1) {
            C14141l c14141lLoadAd4 = C14141l.loadAd(randomAccessFile);
            ArrayList arrayList4 = c14141lLoadAd4.subs;
            C0611l c0611l = (C0611l) arrayList4.get(0);
            byte[] bArr3 = new byte[7];
            randomAccessFile.read(bArr3);
            if (!C7433l.loadAd(bArr3)) {
                throw new C13768l("Cannot find vorbis setup parentHeader");
            }
            i = iIntValue2;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
            randomAccessFile.getFilePointer();
            filePointer = randomAccessFile.getFilePointer() - ((long) (c14141lLoadAd4.admob.length + 27));
            Integer num = c0611l.loadAd;
            iIntValue = num.intValue();
            randomAccessFile.skipBytes(num.intValue());
            int i7 = 1;
            if (arrayList4.size() > 1) {
                randomAccessFile.getFilePointer();
                if (arrayList4.size() > i7) {
                    listSubList = arrayList4.subList(i7, arrayList4.size());
                } else {
                    listSubList = arrayList3;
                }
            } else if (c14141lLoadAd4.isPro) {
                C14141l c14141lLoadAd5 = C14141l.loadAd(randomAccessFile);
                ArrayList arrayList5 = c14141lLoadAd5.subs;
                while (true) {
                    iIntValue += ((C0611l) arrayList5.get(0)).loadAd.intValue();
                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                    ((C0611l) arrayList5.get(0)).loadAd.intValue();
                    int i8 = C17500l.yandex;
                    randomAccessFile.skipBytes(((C0611l) arrayList5.get(0)).loadAd.intValue());
                    if (arrayList5.size() > 1 || !c14141lLoadAd5.isPro) {
                        break;
                    } else {
                        c14141lLoadAd5 = C14141l.loadAd(randomAccessFile);
                    }
                }
                randomAccessFile.getFilePointer();
                if (arrayList5.size() > 1) {
                    listSubList = arrayList5.subList(1, arrayList5.size());
                } else {
                    listSubList = arrayList3;
                }
            } else {
                i7 = 1;
                randomAccessFile.getFilePointer();
                if (arrayList4.size() > i7) {
                    listSubList = arrayList4.subList(i7, arrayList4.size());
                } else {
                    listSubList = arrayList3;
                }
            }
        } else {
            i = iIntValue2;
            C0611l c0611l2 = (C0611l) arrayList.get(1);
            byte[] bArr4 = new byte[7];
            randomAccessFile.read(bArr4);
            if (!C7433l.loadAd(bArr4)) {
                new String(bArr4);
                randomAccessFile.getFilePointer();
                throw new C13768l("Cannot find vorbis setup parentHeader");
            }
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
            randomAccessFile.getFilePointer();
            filePointer = (randomAccessFile.getFilePointer() - ((long) (c14141lLoadAd3.admob.length + 27))) - ((long) ((C0611l) arrayList.get(0)).loadAd.intValue());
            Integer num2 = c0611l2.loadAd;
            int iIntValue3 = num2.intValue();
            randomAccessFile.skipBytes(num2.intValue());
            if (arrayList.size() > 2 || !z) {
                randomAccessFile.getFilePointer();
                if (arrayList.size() > 2) {
                    listSubList = arrayList.subList(2, arrayList.size());
                    iIntValue = iIntValue3;
                }
                iIntValue = iIntValue3;
                listSubList = arrayList3;
            } else {
                C14141l c14141lLoadAd6 = C14141l.loadAd(randomAccessFile);
                ArrayList arrayList6 = c14141lLoadAd6.subs;
                while (true) {
                    iIntValue3 += ((C0611l) arrayList6.get(0)).loadAd.intValue();
                    EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                    ((C0611l) arrayList6.get(0)).loadAd.intValue();
                    int i9 = C17500l.yandex;
                    randomAccessFile.skipBytes(((C0611l) arrayList6.get(0)).loadAd.intValue());
                    if (arrayList6.size() > 1 || !c14141lLoadAd6.isPro) {
                        break;
                    } else {
                        c14141lLoadAd6 = C14141l.loadAd(randomAccessFile);
                    }
                }
                randomAccessFile.getFilePointer();
                if (arrayList6.size() > 1) {
                    listSubList = arrayList6.subList(1, arrayList6.size());
                    iIntValue = iIntValue3;
                }
                iIntValue = iIntValue3;
                listSubList = arrayList3;
            }
        }
        randomAccessFile.seek(filePointer3);
        C9489l c9489l = new C9489l();
        c9489l.crashlytics = listSubList;
        c9489l.loadAd = filePointer;
        c9489l.yandex = iIntValue;
        ByteBuffer byteBufferBilling = ((C17925l) this.yandex.f7072l).billing(interfaceC13280l, 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferBilling.capacity() + 8);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(InterfaceC9665l.yandex);
        byteBufferAllocate.put(byteBufferBilling);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.rewind();
        int iCapacity = byteBufferAllocate.capacity();
        int iLoadAd = c9489l.loadAd() + iIntValue + iCapacity;
        arrayList2.size();
        c13975l.getClass();
        c14141lLoadAd2.yandex();
        c13975l.getClass();
        c13975l.getClass();
        c13975l.getClass();
        listSubList.size();
        c13975l.getClass();
        c9489l.loadAd();
        c13975l.getClass();
        c13975l.getClass();
        c13975l.getClass();
        c13975l.getClass();
        int i10 = 65025;
        if (crashlytics(iCapacity, iIntValue, listSubList)) {
            if (c14141lLoadAd2.yandex() < 65025 && ((arrayList2.size() == 2 && !z2) || arrayList2.size() > 2)) {
                c13975l.getClass();
                c13975l.getClass();
                ByteBuffer byteBufferAmazon = amazon(c9489l, iCapacity, iLoadAd, c14141lLoadAd2, byteBufferAllocate);
                randomAccessFile.seek(filePointer2);
                randomAccessFile.skipBytes(i);
                randomAccessFile.getChannel().read(byteBufferAmazon);
                yandex(byteBufferAmazon);
                randomAccessFile2.getChannel().write(byteBufferAmazon);
                randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), randomAccessFile2.getFilePointer(), randomAccessFile.length() - randomAccessFile.getFilePointer());
                return;
            }
            c13975l.getClass();
            c13975l.getClass();
            ByteBuffer byteBufferAmazon2 = amazon(c9489l, iCapacity, iLoadAd, c14141lLoadAd2, byteBufferAllocate);
            byte[] bArrYandex = C7433l.yandex(filePointer, randomAccessFile);
            int length2 = bArrYandex.length;
            byteBufferAmazon2.position();
            byteBufferAmazon2.capacity();
            byteBufferAmazon2.put(bArrYandex);
            yandex(byteBufferAmazon2);
            randomAccessFile2.getChannel().write(byteBufferAmazon2);
            billing(i4, randomAccessFile, randomAccessFile2);
            return;
        }
        c13975l.getClass();
        byte[] bArr5 = c14141lLoadAd2.yandex;
        int i11 = iCapacity / 65025;
        c13975l.getClass();
        int i12 = 26;
        if (i11 > 0) {
            int i13 = 0;
            i2 = 0;
            while (i13 < i11) {
                byte[] bArrLoadAd = loadAd(i10, false);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrLoadAd.length + 65052);
                byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate2.put(bArr5, 0, i12);
                byteBufferAllocate2.put((byte) bArrLoadAd.length);
                for (byte b : bArrLoadAd) {
                    byteBufferAllocate2.put(b);
                }
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.limit(65025);
                byteBufferAllocate2.put(byteBufferSlice);
                byteBufferAllocate2.putInt(18, i4);
                i4++;
                if (i13 != 0) {
                    byteBufferAllocate2.put(5, (byte) 1);
                }
                yandex(byteBufferAllocate2);
                randomAccessFile2.getChannel().write(byteBufferAllocate2);
                i2 += 65025;
                byteBufferAllocate.position(i2);
                i13++;
                i10 = 65025;
                i12 = 26;
            }
        } else {
            i2 = 0;
        }
        int i14 = iCapacity % i10;
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        int i15 = C17500l.yandex;
        int i16 = c9489l.yandex;
        List list = (List) c9489l.crashlytics;
        long j = c9489l.loadAd;
        if (crashlytics(i14, i16, list)) {
            int iLoadAd2 = c9489l.loadAd();
            byteBufferAllocate.position(i2);
            ByteBuffer byteBufferAmazon3 = amazon(c9489l, i14, iLoadAd2 + i16 + i14, c14141lLoadAd2, byteBufferAllocate.slice());
            randomAccessFile.seek(j);
            byteBufferAmazon3.put(C7433l.yandex(j, randomAccessFile));
            byteBufferAmazon3.putInt(18, i4);
            byteBufferAmazon3.put(5, (byte) 1);
            yandex(byteBufferAmazon3);
            randomAccessFile2.getChannel().write(byteBufferAmazon3);
        } else {
            byte[] bArrLoadAd2 = loadAd(i14, true);
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(bArrLoadAd2.length + 27 + i14);
            byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate3.put(bArr5, 0, 26);
            byteBufferAllocate3.put((byte) bArrLoadAd2.length);
            for (byte b2 : bArrLoadAd2) {
                byteBufferAllocate3.put(b2);
            }
            byteBufferAllocate.position(i2);
            byteBufferAllocate3.put(byteBufferAllocate.slice());
            byteBufferAllocate3.putInt(18, i4);
            if (i11 > 0) {
                byteBufferAllocate3.put(5, (byte) 1);
            }
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            int i17 = C17500l.yandex;
            i4++;
            yandex(byteBufferAllocate3);
            randomAccessFile2.getChannel().write(byteBufferAllocate3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(loadAd(i16, true));
                if (list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(loadAd(((C0611l) it.next()).loadAd.intValue(), false));
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length3 = byteArray.length + 27;
                byte[] bArrYandex2 = C7433l.yandex(j, randomAccessFile);
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bArrYandex2.length + length3);
                byteBufferAllocate4.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate4.put(bArr5, 0, 26);
                byteBufferAllocate4.put((byte) byteArray.length);
                for (byte b3 : byteArray) {
                    byteBufferAllocate4.put(b3);
                }
                byteBufferAllocate4.put(bArrYandex2);
                byteBufferAllocate4.putInt(18, i4);
                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                int i18 = C17500l.yandex;
                yandex(byteBufferAllocate4);
                randomAccessFile2.getChannel().write(byteBufferAllocate4);
            } catch (IOException e) {
                C18073l.license(AbstractC5020l.adcel(e, new StringBuilder("Unable to create segment table:")));
                return;
            }
        }
        billing(i4, randomAccessFile, randomAccessFile2);
    }
}
