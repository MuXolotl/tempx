package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lُۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11270l extends InputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f22704l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22705l;

    public C11270l(C9804l c9804l, AbstractC9284l abstractC9284l) {
        this.f22705l = 6;
        this.f22704l = abstractC9284l;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i = this.f22705l;
        Object obj = this.f22704l;
        switch (i) {
            case 1:
                return (int) Math.min(((C0869l) obj).f2526l, 2147483647L);
            case 2:
                return ((C11270l) obj).available();
            case 3:
            default:
                return super.available();
            case 4:
                C1503l c1503l = (C1503l) obj;
                if (!c1503l.f3754l) {
                    return (int) Math.min(c1503l.f3755l.f2526l, 2147483647L);
                }
                C18262l.metrica("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.f22705l;
        Object obj = this.f22704l;
        switch (i) {
            case 0:
                AbstractC5170l.loadAd((InterfaceC9354l) obj);
                break;
            case 1:
                break;
            case 2:
                super.close();
                ((C11270l) obj).close();
                break;
            case 3:
            default:
                super.close();
                break;
            case 4:
                ((C1503l) obj).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3 = this.f22705l;
        Object obj = this.f22704l;
        switch (i3) {
            case 0:
                InterfaceC9354l interfaceC9354l = (InterfaceC9354l) obj;
                if (!interfaceC9354l.admob()) {
                    if (interfaceC9354l.mopub().subs()) {
                        AbstractC10999l.subs(C17218l.f33421l, new C11039l(interfaceC9354l, null, 8));
                    }
                    C18476l c18476lMopub = interfaceC9354l.mopub();
                    c18476lMopub.getClass();
                    int iMo1455l = interfaceC9354l.mopub().mo1455l(i, Math.min((int) c18476lMopub.f36079l, i2) + i, bArr);
                    if (iMo1455l >= 0) {
                        return iMo1455l;
                    }
                    if (!interfaceC9354l.admob()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                return ((C0869l) obj).read(bArr, i, i2);
            case 2:
                return ((C11270l) obj).read(bArr, i, i2);
            case 3:
                return ((RandomAccessFile) obj).read(bArr, i, i2);
            case 4:
                C1503l c1503l = (C1503l) obj;
                C0869l c0869l = c1503l.f3755l;
                if (c1503l.f3754l) {
                    C18262l.metrica("closed");
                    return 0;
                }
                AbstractC9334l.crashlytics(bArr.length, i, i2);
                if (c0869l.f2526l == 0 && c1503l.f3756l.ad(c0869l, 8192L) == -1) {
                    return -1;
                }
                return c0869l.read(bArr, i, i2);
            case 5:
                C9804l c9804l = (C9804l) obj;
                try {
                    int iInflate = ((Inflater) c9804l.f19982l).inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (((Inflater) c9804l.f19982l).getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ((Inflater) c9804l.f19982l).getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((AbstractC9284l) obj).inmobi(i, i2, bArr);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int i = this.f22705l;
        Object obj = this.f22704l;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        switch (i) {
            case 3:
                if (j < 0) {
                    C8339l.metrica("invalid negative value");
                    return 0L;
                }
                while (true) {
                    RandomAccessFile randomAccessFile = (RandomAccessFile) obj;
                    if (j <= 2147483647L) {
                        return randomAccessFile.skipBytes((int) j);
                    }
                    randomAccessFile.skipBytes(Alert.DURATION_SHOW_INDEFINITELY);
                    j -= 2147483647L;
                }
                break;
            case 6:
                if (j <= 0) {
                    return 0L;
                }
                if (j <= 2147483647L) {
                    i2 = (int) j;
                }
                ((AbstractC9284l) obj).mo1093throws(i2);
                return i2;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.f22705l;
        Object obj = this.f22704l;
        switch (i) {
            case 1:
                return ((C0869l) obj) + ".inputStream()";
            case 4:
                return ((C1503l) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f22705l) {
            case 4:
                C1503l c1503l = (C1503l) this.f22704l;
                C0869l c0869l = c1503l.f3755l;
                if (c1503l.f3754l) {
                    C18262l.metrica("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c0869l.f2526l == 0 && c1503l.f3756l.ad(c0869l, 8192L) == -1) {
                        return j;
                    }
                    long j2 = c0869l.f2526l;
                    j += j2;
                    AbstractC9334l.crashlytics(j2, 0L, j2);
                    C18346l c18346l = c0869l.f2527l;
                    while (j2 > 0) {
                        int iMin = (int) Math.min(j2, c18346l.crashlytics - c18346l.loadAd);
                        outputStream.write(c18346l.yandex, c18346l.loadAd, iMin);
                        int i = c18346l.loadAd + iMin;
                        c18346l.loadAd = i;
                        long j3 = iMin;
                        c0869l.f2526l -= j3;
                        j2 -= j3;
                        if (i == c18346l.crashlytics) {
                            C18346l c18346lYandex = c18346l.yandex();
                            c0869l.f2527l = c18346lYandex;
                            AbstractC18391l.yandex(c18346l);
                            c18346l = c18346lYandex;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ C11270l(int i, Object obj) {
        this.f22705l = i;
        this.f22704l = obj;
    }

    public C11270l(RandomAccessFile randomAccessFile) {
        this.f22705l = 3;
        this.f22704l = randomAccessFile;
    }

    private final void yandex() {
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        int i = this.f22705l;
        Object obj = this.f22704l;
        switch (i) {
            case 0:
                InterfaceC9354l interfaceC9354l = (InterfaceC9354l) obj;
                if (interfaceC9354l.admob()) {
                    return -1;
                }
                if (interfaceC9354l.mopub().subs()) {
                    AbstractC10999l.subs(C17218l.f33421l, new C11039l(interfaceC9354l, null, 8));
                }
                if (interfaceC9354l.admob()) {
                    return -1;
                }
                return interfaceC9354l.mopub().readByte() & 255;
            case 1:
                C0869l c0869l = (C0869l) obj;
                if (c0869l.f2526l > 0) {
                    return c0869l.readByte() & 255;
                }
                return -1;
            case 2:
                return ((C11270l) obj).read();
            case 3:
                return ((RandomAccessFile) obj).read();
            case 4:
                C1503l c1503l = (C1503l) obj;
                C0869l c0869l2 = c1503l.f3755l;
                if (c1503l.f3754l) {
                    C18262l.metrica("closed");
                    return 0;
                }
                if (c0869l2.f2526l == 0 && c1503l.f3756l.ad(c0869l2, 8192L) == -1) {
                    return -1;
                }
                return c0869l2.readByte() & 255;
            case 5:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((AbstractC9284l) obj).inmobi(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
