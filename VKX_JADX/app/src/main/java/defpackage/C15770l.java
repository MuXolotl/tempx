package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٕٚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15770l implements Closeable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Logger f30959l = Logger.getLogger(C15770l.class.getName());

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f30960l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f30961l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final RandomAccessFile f30962l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9754l f30963l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C9754l f30964l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f30965l;

    public C15770l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f30965l = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m4110switch(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    C18262l.metrica("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f30962l = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iIsVip = isVip(0, bArr);
        this.f30961l = iIsVip;
        if (iIsVip <= randomAccessFile2.length()) {
            this.f30960l = isVip(4, bArr);
            int iIsVip2 = isVip(8, bArr);
            int iIsVip3 = isVip(12, bArr);
            this.f30964l = ads(iIsVip2);
            this.f30963l = ads(iIsVip3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f30961l + ", Actual length: " + randomAccessFile2.length());
    }

    public static int isVip(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static void m4110switch(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized boolean adcel() {
        return this.f30960l == 0;
    }

    public final C9754l ads(int i) throws IOException {
        if (i == 0) {
            return C9754l.f19891l;
        }
        RandomAccessFile randomAccessFile = this.f30962l;
        randomAccessFile.seek(i);
        return new C9754l(i, randomAccessFile.readInt(), 0);
    }

    public final synchronized void billing() {
        m4114throw(4096, 0, 0, 0);
        this.f30960l = 0;
        C9754l c9754l = C9754l.f19891l;
        this.f30964l = c9754l;
        this.f30963l = c9754l;
        if (this.f30961l > 4096) {
            RandomAccessFile randomAccessFile = this.f30962l;
            randomAccessFile.setLength(4096L);
            randomAccessFile.getChannel().force(true);
        }
        this.f30961l = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f30962l.close();
    }

    public final void inmobi(byte[] bArr, int i, int i2, int i3) throws IOException {
        int iM4112private = m4112private(i);
        int i4 = iM4112private + i3;
        int i5 = this.f30961l;
        RandomAccessFile randomAccessFile = this.f30962l;
        if (i4 <= i5) {
            randomAccessFile.seek(iM4112private);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM4112private;
        randomAccessFile.seek(iM4112private);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void mopub(int i) throws IOException {
        int i2 = i + 4;
        int iM4113synchronized = this.f30961l - m4113synchronized();
        if (iM4113synchronized >= i2) {
            return;
        }
        int i3 = this.f30961l;
        do {
            iM4113synchronized += i3;
            i3 <<= 1;
        } while (iM4113synchronized < i2);
        RandomAccessFile randomAccessFile = this.f30962l;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C9754l c9754l = this.f30963l;
        int iM4112private = m4112private(c9754l.f19893l + 4 + c9754l.f19892l);
        if (iM4112private < this.f30964l.f19893l) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f30961l);
            long j = iM4112private - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                C8339l.subs("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.f30963l.f19893l;
        int i5 = this.f30964l.f19893l;
        if (i4 < i5) {
            int i6 = (this.f30961l + i4) - 16;
            m4114throw(i3, this.f30960l, i5, i6);
            this.f30963l = new C9754l(i6, this.f30963l.f19892l, 0);
        } else {
            m4114throw(i3, this.f30960l, i5, i4);
        }
        this.f30961l = i3;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m4111package(int i, int i2, byte[] bArr) throws IOException {
        int iM4112private = m4112private(i);
        int i3 = iM4112private + i2;
        int i4 = this.f30961l;
        RandomAccessFile randomAccessFile = this.f30962l;
        if (i3 <= i4) {
            randomAccessFile.seek(iM4112private);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM4112private;
        randomAccessFile.seek(iM4112private);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m4112private(int i) {
        int i2 = this.f30961l;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final synchronized void signatures() {
        try {
            if (adcel()) {
                throw new NoSuchElementException();
            }
            if (this.f30960l == 1) {
                billing();
            } else {
                C9754l c9754l = this.f30964l;
                int iM4112private = m4112private(c9754l.f19893l + 4 + c9754l.f19892l);
                inmobi(this.f30965l, iM4112private, 0, 4);
                int iIsVip = isVip(0, this.f30965l);
                m4114throw(this.f30961l, this.f30960l - 1, iM4112private, this.f30963l.f19893l);
                this.f30960l--;
                this.f30964l = new C9754l(iM4112private, iIsVip, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int m4113synchronized() {
        if (this.f30960l == 0) {
            return 16;
        }
        C9754l c9754l = this.f30963l;
        int i = c9754l.f19893l;
        int i2 = this.f30964l.f19893l;
        return i >= i2 ? (i - i2) + 4 + c9754l.f19892l + 16 : (((i + 4) + c9754l.f19892l) + this.f30961l) - i2;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m4114throw(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f30965l;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f30962l;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m4110switch(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C15770l.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f30961l);
        sb.append(", size=");
        sb.append(this.f30960l);
        sb.append(", first=");
        sb.append(this.f30964l);
        sb.append(", last=");
        sb.append(this.f30963l);
        sb.append(", element lengths=[");
        try {
            vip(new C6921l((Object) sb, 8, false));
        } catch (IOException e) {
            f30959l.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized void vip(InterfaceC15102l interfaceC15102l) {
        int iM4112private = this.f30964l.f19893l;
        for (int i = 0; i < this.f30960l; i++) {
            C9754l c9754lAds = ads(iM4112private);
            interfaceC15102l.yandex(new C14362l(this, c9754lAds), c9754lAds.f19892l);
            iM4112private = m4112private(c9754lAds.f19893l + 4 + c9754lAds.f19892l);
        }
    }

    public final void yandex(byte[] bArr) {
        int iM4112private;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    mopub(length);
                    boolean zAdcel = adcel();
                    if (zAdcel) {
                        iM4112private = 16;
                    } else {
                        C9754l c9754l = this.f30963l;
                        iM4112private = m4112private(c9754l.f19893l + 4 + c9754l.f19892l);
                    }
                    C9754l c9754l2 = new C9754l(iM4112private, length, 0);
                    m4110switch(0, length, this.f30965l);
                    m4111package(iM4112private, 4, this.f30965l);
                    m4111package(iM4112private + 4, length, bArr);
                    m4114throw(this.f30961l, this.f30960l + 1, zAdcel ? iM4112private : this.f30964l.f19893l, iM4112private);
                    this.f30963l = c9754l2;
                    this.f30960l++;
                    if (zAdcel) {
                        this.f30964l = c9754l2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
