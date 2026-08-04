package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٌٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14964l {
    public static final C13975l loadAd;
    public ByteBuffer yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static C14964l yandex(ByteBuffer byteBuffer) {
        C13975l c13975l = AbstractC14375l.yandex;
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        String str = new String(bArr, AbstractC12379l.loadAd);
        EnumC15153l[] enumC15153lArr = EnumC15153l.f29739l;
        if ("ID3".equals(str)) {
            C14964l c14964l = new C14964l();
            c14964l.yandex = byteBuffer;
            return c14964l;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        loadAd.getClass();
        int i = C17500l.yandex;
        return null;
    }
}
