package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lؓۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2240l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public C2925l crashlytics(File file, String str, boolean z) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        yandex.getClass();
        int i = C17500l.yandex;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.seek(0L);
            C16492l c16492lYandex = yandex(randomAccessFile);
            randomAccessFile.seek(0L);
            C2925l c2925l = new C2925l(file, str, c16492lYandex, loadAd(randomAccessFile));
            randomAccessFile.close();
            return c2925l;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public abstract InterfaceC13280l loadAd(RandomAccessFile randomAccessFile);

    public abstract C16492l yandex(RandomAccessFile randomAccessFile);
}
