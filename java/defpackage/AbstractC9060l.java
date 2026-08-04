package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٌۜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9060l extends AbstractC4674l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final byte[] f18647l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final Pattern f18648l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C13975l f18649l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f18649l = new C13975l(4);
        f18648l = Pattern.compile("\\x00");
        f18647l = new byte[]{84, 65, 71};
    }

    public final void license(RandomAccessFile randomAccessFile) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f18649l;
        c13975l.getClass();
        int i = C17500l.yandex;
        FileChannel channel = randomAccessFile.getChannel();
        if (randomAccessFile.length() < 128) {
            C18262l.metrica("File not not appear large enough to contain a tag");
            return;
        }
        channel.position(randomAccessFile.length() - 128);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        channel.read(byteBufferAllocate);
        byteBufferAllocate.rewind();
        byte[] bArr = new byte[3];
        byteBufferAllocate.get(bArr, 0, 3);
        if (!Arrays.equals(bArr, f18647l)) {
            c13975l.getClass();
            return;
        }
        try {
            c13975l.getClass();
            randomAccessFile.setLength(randomAccessFile.length() - 128);
        } catch (IOException unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
    }
}
