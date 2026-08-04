package defpackage;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lُؙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11306l {
    public static final int amazon;
    public static final int crashlytics;
    public static final int loadAd;
    public static final int purchase;
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
        loadAd = 4;
        crashlytics = 4;
        amazon = 4;
        purchase = 12;
    }

    public static void yandex(FileChannel fileChannel, C16528l c16528l) throws IOException {
        if (!AbstractC14375l.admob(c16528l.f32303l) || fileChannel.position() >= fileChannel.size()) {
            return;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        yandex.getClass();
        int i = C17500l.yandex;
        fileChannel.position(fileChannel.position() + 1);
    }
}
