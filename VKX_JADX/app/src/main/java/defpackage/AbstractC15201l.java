package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lًٔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15201l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static ByteBuffer yandex(String str, String str2, ByteBuffer byteBuffer, int i, int i2) throws C11399l {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = yandex;
        c13975l.getClass();
        int i3 = C17500l.yandex;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i2];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr2, 0, i2);
        byteBuffer.position(iPosition);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr2);
        try {
            inflater.inflate(bArr);
            c13975l.getClass();
            inflater.end();
            return ByteBuffer.wrap(bArr);
        } catch (DataFormatException e) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            byteBuffer.position(byteBuffer.position() + i2);
            Locale.getDefault();
            throw new C11399l(AbstractC14814l.adcel("Unable to decompress frame ", str, " in file ", str2), e);
        }
    }
}
