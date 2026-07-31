package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lٓٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14141l {
    public static final byte[] remoteconfig;
    public static final C13975l smaato;
    public final byte[] admob;
    public final boolean amazon;
    public final int billing;
    public final byte crashlytics;
    public final boolean isPro;
    public final double loadAd;
    public final int mopub;
    public final int purchase;
    public final byte[] yandex;
    public final ArrayList subs = new ArrayList();
    public long firebase = 0;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        smaato = new C13975l(4);
        remoteconfig = new byte[]{79, 103, 103, 83};
    }

    public C14141l(byte[] bArr) {
        this.amazon = false;
        this.purchase = 0;
        this.isPro = false;
        this.yandex = bArr;
        byte b = bArr[4];
        this.crashlytics = bArr[5];
        if (b == 0) {
            this.loadAd = 0.0d;
            for (int i = 0; i < 8; i++) {
                this.loadAd = (Math.pow(2.0d, i * 8) * ((double) (bArr[i + 6] & 255))) + this.loadAd;
            }
            C13975l c13975l = AbstractC14375l.yandex;
            this.mopub = (int) AbstractC14375l.amazon(ByteBuffer.wrap(bArr), 14, 17);
            this.billing = (int) AbstractC14375l.amazon(ByteBuffer.wrap(bArr), 18, 21);
            AbstractC14375l.amazon(ByteBuffer.wrap(bArr), 22, 25);
            byte b2 = bArr[26];
            this.admob = new byte[bArr.length - 27];
            Integer num = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.admob;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte b3 = bArr[i2 + 27];
                bArr2[i2] = b3;
                int i4 = b3 & 255;
                Integer numValueOf = Integer.valueOf(i4);
                int i5 = this.purchase + i4;
                this.purchase = i5;
                i3 += i4;
                if (i4 < 255) {
                    this.subs.add(new C0611l(i5 - i3, i3));
                    i3 = 0;
                }
                i2++;
                num = numValueOf;
            }
            if (num != null && num.intValue() == 255) {
                this.subs.add(new C0611l(this.purchase - i3, i3));
                this.isPro = true;
            }
            this.amazon = true;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        smaato.getClass();
        int i6 = C17500l.yandex;
    }

    public static C14141l crashlytics(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        smaato.getClass();
        int i = C17500l.yandex;
        byte[] bArr = remoteconfig;
        byte[] bArr2 = new byte[bArr.length];
        byteBuffer.get(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            throw new C13768l("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
        }
        byteBuffer.position(iPosition + 26);
        int i2 = byteBuffer.get() & 255;
        byteBuffer.position(iPosition);
        byte[] bArr3 = new byte[i2 + 27];
        byteBuffer.get(bArr3);
        return new C14141l(bArr3);
    }

    public static C14141l loadAd(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = smaato;
        c13975l.getClass();
        int i = C17500l.yandex;
        byte[] bArr = remoteconfig;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile.seek(filePointer);
            if (!AbstractC3348l.m1321volatile(randomAccessFile)) {
                throw new C13768l("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
            }
            randomAccessFile.getFilePointer();
            c13975l.getClass();
            randomAccessFile.read(bArr2);
            if (Arrays.equals(bArr2, bArr)) {
                filePointer = randomAccessFile.getFilePointer() - ((long) bArr.length);
            }
        }
        randomAccessFile.seek(26 + filePointer);
        int i2 = randomAccessFile.readByte() & 255;
        randomAccessFile.seek(filePointer);
        byte[] bArr3 = new byte[i2 + 27];
        randomAccessFile.read(bArr3);
        C14141l c14141l = new C14141l(bArr3);
        c14141l.firebase = filePointer;
        return c14141l;
    }

    public final String toString() {
        String strConcat = "Ogg Page Header:isValid:" + this.amazon + ":type:" + ((int) this.crashlytics) + ":oggPageHeaderLength:" + this.yandex.length + ":length:" + this.purchase + ":seqNo:" + this.billing + ":packetIncomplete:" + this.isPro + ":serNum:" + this.mopub;
        Iterator it = this.subs.iterator();
        while (it.hasNext()) {
            strConcat = strConcat.concat(((C0611l) it.next()).toString());
        }
        return strConcat;
    }

    public final int yandex() {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        smaato.getClass();
        int i = C17500l.yandex;
        return this.purchase;
    }
}
