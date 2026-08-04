package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lٌؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9115l extends InputStream implements DataInput {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public ByteOrder f18719l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f18720l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final DataInputStream f18721l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f18722l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f18723l;

    public C9115l(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f18721l = dataInputStream;
        dataInputStream.mark(0);
        this.f18720l = 0;
        this.f18719l = byteOrder;
        this.f18722l = inputStream instanceof C9115l ? ((C9115l) inputStream).f18722l : -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f18721l.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f18720l++;
        return this.f18721l.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f18720l++;
        return this.f18721l.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f18720l++;
        int i = this.f18721l.read();
        if (i >= 0) {
            return (byte) i;
        }
        C8339l.vip();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f18720l += 2;
        return this.f18721l.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f18720l += bArr.length;
        this.f18721l.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f18720l += 4;
        DataInputStream dataInputStream = this.f18721l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            C8339l.vip();
            return 0;
        }
        ByteOrder byteOrder = this.f18719l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        C11467l.smaato(this.f18719l, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f18720l += 8;
        DataInputStream dataInputStream = this.f18721l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            C8339l.vip();
            return 0L;
        }
        ByteOrder byteOrder = this.f18719l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        C11467l.smaato(this.f18719l, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f18720l += 2;
        DataInputStream dataInputStream = this.f18721l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            C8339l.vip();
            return (short) 0;
        }
        ByteOrder byteOrder = this.f18719l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        C11467l.smaato(this.f18719l, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f18720l += 2;
        return this.f18721l.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f18720l++;
        return this.f18721l.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f18720l += 2;
        DataInputStream dataInputStream = this.f18721l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            C8339l.vip();
            return 0;
        }
        ByteOrder byteOrder = this.f18719l;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        C11467l.smaato(this.f18719l, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final void yandex(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f18721l;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f18723l == null) {
                    this.f18723l = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f18723l, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC15560l.tapsense("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f18720l += i2;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f18720l += i2;
        this.f18721l.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18721l.read(bArr, i, i2);
        this.f18720l += i3;
        return i3;
    }

    public C9115l(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C9115l(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f18722l = bArr.length;
    }
}
