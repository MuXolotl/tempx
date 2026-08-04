package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: lؖؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3860l extends AbstractC2240l {
    public C7433l crashlytics;
    public C7929l loadAd;

    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) {
        return this.crashlytics.crashlytics(randomAccessFile);
    }

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        double d;
        this.loadAd.getClass();
        long filePointer = randomAccessFile.getFilePointer();
        C16492l c16492l = new C16492l();
        C13975l c13975l = C7929l.yandex;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        byte[] bArr = C14141l.remoteconfig;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile.seek(0L);
            if (!AbstractC3348l.m1321volatile(randomAccessFile)) {
                throw new C13768l("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
            }
            randomAccessFile.read(bArr2);
            if (Arrays.equals(bArr2, bArr)) {
                filePointer = randomAccessFile.getFilePointer();
            }
        }
        randomAccessFile.seek(filePointer);
        long j = 2;
        randomAccessFile.seek(randomAccessFile.length() - 2);
        while (true) {
            if (randomAccessFile.getFilePointer() < 4) {
                d = -1.0d;
                break;
            }
            int i2 = randomAccessFile.read();
            byte[] bArr3 = C14141l.remoteconfig;
            long j2 = j;
            if (i2 == bArr3[3]) {
                randomAccessFile.seek(randomAccessFile.getFilePointer() - 4);
                byte[] bArr4 = new byte[3];
                randomAccessFile.readFully(bArr4);
                if (bArr4[0] == bArr3[0] && bArr4[1] == bArr3[1] && bArr4[2] == bArr3[2]) {
                    randomAccessFile.seek(randomAccessFile.getFilePointer() - 3);
                    long filePointer2 = randomAccessFile.getFilePointer();
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + 26);
                    int i3 = randomAccessFile.readByte() & 255;
                    randomAccessFile.seek(filePointer2);
                    byte[] bArr5 = new byte[i3 + 27];
                    randomAccessFile.readFully(bArr5);
                    C14141l c14141l = new C14141l(bArr5);
                    randomAccessFile.seek(0L);
                    C13975l c13975l2 = C14141l.smaato;
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    c13975l2.getClass();
                    int i4 = C17500l.yandex;
                    d = c14141l.loadAd;
                    break;
                }
            }
            randomAccessFile.seek(randomAccessFile.getFilePointer() - j2);
            j = j2;
        }
        if (d == -1.0d) {
            throw new C13768l("Could not find the Ogg Setup block");
        }
        int iYandex = C14141l.loadAd(randomAccessFile).yandex();
        byte[] bArr6 = new byte[iYandex];
        if (iYandex < 27) {
            throw new C13768l("Invalid Identification header for this Ogg File");
        }
        randomAccessFile.read(bArr6);
        C2505l c2505l = new C2505l();
        byte b = bArr6[0];
        C13975l c13975l3 = C2505l.subs;
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        c13975l3.getClass();
        int i5 = C17500l.yandex;
        String str = new String(bArr6, 1, 6, AbstractC12379l.loadAd);
        if (b == 1 && str.equals("vorbis")) {
            c2505l.amazon = bArr6[7] + (bArr6[8] << 8) + (bArr6[9] << 16) + (bArr6[10] << 24);
            c2505l.crashlytics = bArr6[11] & 255;
            c2505l.purchase = (bArr6[12] & 255) + ((bArr6[13] & 255) << 8) + ((bArr6[14] & 255) << 16) + ((bArr6[15] & 255) << 24);
            c2505l.billing = (bArr6[16] & 255) + ((bArr6[17] & 255) << 8) + ((bArr6[18] & 255) << 16) + ((bArr6[19] & 255) << 24);
            c2505l.mopub = (bArr6[20] & 255) + ((bArr6[21] & 255) << 8) + ((bArr6[22] & 255) << 16) + ((bArr6[23] & 255) << 24);
            c2505l.admob = (bArr6[24] & 255) + ((bArr6[25] & 255) << 8) + ((bArr6[26] & 255) << 16) + ((bArr6[27] & 255) << 24);
            byte b2 = bArr6[29];
        }
        int i6 = c2505l.purchase;
        c16492l.firebase = (float) (d / ((double) i6));
        c16492l.purchase = c2505l.crashlytics;
        c16492l.billing = i6;
        EnumC12777l.values()[c2505l.amazon].getClass();
        c16492l.admob = "Ogg Vorbis v1";
        c16492l.mopub = 16;
        int i7 = c2505l.mopub;
        if (i7 != 0 && c2505l.admob == i7 && c2505l.billing == i7) {
            c16492l.amazon = i7 / 1000;
            c16492l.subs = false;
            return c16492l;
        }
        if (i7 != 0 && c2505l.admob == 0 && c2505l.billing == 0) {
            c16492l.amazon = i7 / 1000;
            c16492l.subs = true;
            return c16492l;
        }
        long jAmazon = AbstractC13251l.amazon(Math.round(c16492l.firebase * 1.0E9d));
        long length = randomAccessFile.length();
        if (jAmazon == 0) {
            jAmazon = 1;
        }
        C13975l c13975l4 = AbstractC14375l.yandex;
        c16492l.amazon = (int) (((length / 1000) * 8) / jAmazon);
        c16492l.subs = true;
        return c16492l;
    }
}
