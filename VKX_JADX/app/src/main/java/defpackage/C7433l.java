package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7433l {
    public static final C13975l loadAd;
    public final C10241l yandex = new C10241l();

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static boolean loadAd(byte[] bArr) {
        return bArr[0] == 5 && new String(bArr, 1, 6, AbstractC12379l.loadAd).equals("vorbis");
    }

    public static byte[] yandex(long j, RandomAccessFile randomAccessFile) throws C13768l, IOException {
        C14141l c14141lLoadAd;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        randomAccessFile.seek(j);
        C14141l c14141lLoadAd2 = C14141l.loadAd(randomAccessFile);
        ArrayList arrayList = c14141lLoadAd2.subs;
        if (arrayList.size() > 1) {
            randomAccessFile.skipBytes(((C0611l) arrayList.get(0)).loadAd.intValue());
        }
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        if (!loadAd(bArr)) {
            throw new C13768l("Unable to find setup header(2), unable to write ogg file");
        }
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
        if (arrayList.size() > 1) {
            byte[] bArr2 = new byte[((C0611l) arrayList.get(1)).loadAd.intValue()];
            randomAccessFile.read(bArr2);
            byteArrayOutputStream.write(bArr2);
        } else {
            byte[] bArr3 = new byte[((C0611l) arrayList.get(0)).loadAd.intValue()];
            randomAccessFile.read(bArr3);
            byteArrayOutputStream.write(bArr3);
        }
        boolean z = c14141lLoadAd2.isPro;
        C13975l c13975l = loadAd;
        if (!z || arrayList.size() > 2) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            if (arrayList.size() > 2) {
                for (int i2 = 2; i2 < arrayList.size(); i2++) {
                    byte[] bArr4 = new byte[((C0611l) arrayList.get(i2)).loadAd.intValue()];
                    randomAccessFile.read(bArr4);
                    byteArrayOutputStream.write(bArr4);
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        do {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            c14141lLoadAd = C14141l.loadAd(randomAccessFile);
            ArrayList arrayList2 = c14141lLoadAd.subs;
            byte[] bArr5 = new byte[((C0611l) arrayList2.get(0)).loadAd.intValue()];
            randomAccessFile.read(bArr5);
            byteArrayOutputStream.write(bArr5);
            if (arrayList2.size() > 1) {
                c13975l.getClass();
                return byteArrayOutputStream.toByteArray();
            }
        } while (c14141lLoadAd.isPro);
        c13975l.getClass();
        return byteArrayOutputStream.toByteArray();
    }

    public final C4391l crashlytics(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        C14141l c14141lLoadAd;
        byte[] byteArray;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i = C17500l.yandex;
        c13975l.getClass();
        randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) C14141l.loadAd(randomAccessFile).yandex()));
        C14141l c14141lLoadAd2 = C14141l.loadAd(randomAccessFile);
        ArrayList arrayList = c14141lLoadAd2.subs;
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        String str = new String(bArr, 1, 6, AbstractC12379l.loadAd);
        if (bArr[0] != 3 || !str.equals("vorbis")) {
            throw new C13768l("Cannot find comment block (no vorbiscomment header)");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[((C0611l) arrayList.get(0)).loadAd.intValue() - 7];
        randomAccessFile.read(bArr2);
        byteArrayOutputStream.write(bArr2);
        if (arrayList.size() <= 1 && c14141lLoadAd2.isPro) {
            do {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                int i2 = C17500l.yandex;
                c14141lLoadAd = C14141l.loadAd(randomAccessFile);
                ArrayList arrayList2 = c14141lLoadAd.subs;
                byte[] bArr3 = new byte[((C0611l) arrayList2.get(0)).loadAd.intValue()];
                randomAccessFile.read(bArr3);
                byteArrayOutputStream.write(bArr3);
                if (arrayList2.size() > 1) {
                    byteArray = byteArrayOutputStream.toByteArray();
                }
            } while (c14141lLoadAd.isPro);
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArray = byteArrayOutputStream.toByteArray();
        }
        this.yandex.getClass();
        C4391l c4391lYandex = C10241l.yandex(true, byteArray);
        c13975l.getClass();
        return c4391lYandex;
    }
}
