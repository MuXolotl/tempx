package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٍَٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9456l extends AbstractC2240l {
    public static final C13975l loadAd;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public abstract C16492l amazon(FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC2240l
    public final C2925l crashlytics(File file, String str, boolean z) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        loadAd.getClass();
        int i = C17500l.yandex;
        try {
            FileChannel channel = new RandomAccessFile(file, "r").getChannel();
            try {
                String absolutePath = file.getAbsolutePath();
                C16492l c16492lAmazon = amazon(channel, absolutePath);
                channel.position(0L);
                C2925l c2925l = new C2925l(file, str, c16492lAmazon, purchase(channel, absolutePath, z));
                channel.close();
                return c2925l;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            int i2 = C17500l.yandex;
            throw e;
        }
    }

    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }

    public abstract InterfaceC13280l purchase(FileChannel fileChannel, String str, boolean z);

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }
}
