package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؑؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0118l extends AbstractC17834l {
    public static final C13975l loadAd;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static C7288l isPro(FileChannel fileChannel, String str) throws C13768l, IOException {
        C16410l c16410l = new C16410l();
        C7288l c7288l = new C7288l();
        C3328l.yandex(fileChannel, c16410l, str);
        while (fileChannel.position() < fileChannel.size()) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            loadAd.getClass();
            int i = C17500l.yandex;
            C16528l c16528l = new C16528l(ByteOrder.BIG_ENDIAN);
            c16528l.billing(fileChannel);
            long jPosition = fileChannel.position();
            EnumC17542l enumC17542lYandex = EnumC17542l.yandex((String) c16528l.f32302l);
            ArrayList arrayList = c7288l.f15139l;
            if (enumC17542lYandex != null && enumC17542lYandex == EnumC17542l.TAG) {
                ByteBuffer byteBufferPurchase = AbstractC17834l.purchase(fileChannel, c16528l);
                arrayList.add(new C2047l((String) c16528l.f32302l, c16528l.f32306l, c16528l.f32303l));
                if (c7288l.f15140l == null) {
                    C13314l c13314l = new C13314l(byteBufferPurchase, c16528l, 7);
                    c13314l.f26121l = c7288l;
                    c13314l.mo1010l();
                    c7288l.f15137l = true;
                    c7288l.f15140l.f7147l = Long.valueOf(jPosition);
                    c7288l.f15140l.f7144l = Long.valueOf(fileChannel.position());
                }
            } else if (enumC17542lYandex != null && enumC17542lYandex == EnumC17542l.CORRUPT_TAG_LATE) {
                if (c7288l.f15140l == null) {
                    c7288l.f15138l = true;
                }
                fileChannel.position(fileChannel.position() - 9);
            } else if (enumC17542lYandex == null || enumC17542lYandex != EnumC17542l.CORRUPT_TAG_EARLY) {
                arrayList.add(new C2047l((String) c16528l.f32302l, c16528l.f32306l, c16528l.f32303l));
                fileChannel.position(fileChannel.position() + c16528l.f32303l);
            } else {
                if (c7288l.f15140l == null) {
                    c7288l.f15138l = true;
                }
                fileChannel.position(fileChannel.position() - 7);
            }
            AbstractC11306l.yandex(fileChannel, c16528l);
        }
        if (c7288l.f15140l == null) {
            c7288l.f15140l = C6356l.crashlytics();
        }
        return c7288l;
    }
}
