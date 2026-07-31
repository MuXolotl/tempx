package defpackage;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16705l extends AbstractC9456l {
    public C0118l amazon;
    public C13117l crashlytics;

    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    @Override // defpackage.AbstractC9456l
    public final C16492l amazon(FileChannel fileChannel, String str) throws C13768l, IOException {
        long j;
        this.crashlytics.getClass();
        C13975l c13975l = C13117l.loadAd;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        fileChannel.size();
        c13975l.getClass();
        int i = C17500l.yandex;
        C16410l c16410l = new C16410l();
        C3328l.yandex(fileChannel, c16410l, str);
        while (fileChannel.position() < fileChannel.size()) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            int i2 = C17500l.yandex;
            C16528l c16528l = new C16528l(ByteOrder.BIG_ENDIAN);
            c16528l.billing(fileChannel);
            EnumC17542l enumC17542lYandex = EnumC17542l.yandex((String) c16528l.f32302l);
            AbstractC17054l c12118l = null;
            c12118l = null;
            c12118l = null;
            if (enumC17542lYandex != null) {
                switch (enumC17542lYandex) {
                    case FORMAT_VERSION:
                        C1719l c1719l = new C1719l(AbstractC17834l.purchase(fileChannel, c16528l), c16528l, 3);
                        c1719l.f4106l = c16410l;
                        c12118l = c1719l;
                        break;
                    case APPLICATION:
                        C1719l c1719l2 = new C1719l(AbstractC17834l.purchase(fileChannel, c16528l), c16528l, 0);
                        c1719l2.f4106l = c16410l;
                        c12118l = c1719l2;
                        break;
                    case SOUND:
                        c16410l.yandex = c16528l.f32303l;
                        c16410l.loadAd = fileChannel.position();
                        c16410l.crashlytics = fileChannel.position() + c16528l.f32303l;
                        break;
                    case COMMON:
                        C1719l c1719l3 = new C1719l(AbstractC17834l.purchase(fileChannel, c16528l), c16528l, 2);
                        c1719l3.f4106l = c16410l;
                        c12118l = c1719l3;
                        break;
                    case COMMENTS:
                        C1719l c1719l4 = new C1719l(AbstractC17834l.purchase(fileChannel, c16528l), c16528l, 1);
                        c1719l4.f4106l = c16410l;
                        c12118l = c1719l4;
                        break;
                    case NAME:
                        c12118l = new C12118l(c16528l, AbstractC17834l.purchase(fileChannel, c16528l), c16410l, 3);
                        break;
                    case AUTHOR:
                        c12118l = new C12118l(c16528l, AbstractC17834l.purchase(fileChannel, c16528l), c16410l, 1);
                        break;
                    case COPYRIGHT:
                        c12118l = new C12118l(c16528l, AbstractC17834l.purchase(fileChannel, c16528l), c16410l, 2);
                        break;
                    case ANNOTATION:
                        c12118l = new C12118l(c16528l, AbstractC17834l.purchase(fileChannel, c16528l), c16410l, 0);
                        break;
                }
            }
            if (c12118l != null) {
                if (!c12118l.mo1010l()) {
                    j = c16410l.yandex;
                    if (j != -1) {
                        C13975l c13975l2 = AbstractC14375l.yandex;
                        c16410l.amazon = (int) Math.round((j * 8) / (c16410l.firebase * 1000.0d));
                    }
                    return c16410l;
                }
            } else {
                if (c16528l.f32303l < 0) {
                    StringBuilder sbAdvert = AbstractC5020l.advert(str, " Not a valid header, unable to read a sensible size:Header");
                    sbAdvert.append((String) c16528l.f32302l);
                    sbAdvert.append("Size:");
                    sbAdvert.append(c16528l.f32303l);
                    throw new C13768l(sbAdvert.toString());
                }
                fileChannel.position(fileChannel.position() + c16528l.f32303l);
            }
            AbstractC11306l.yandex(fileChannel, c16528l);
        }
        j = c16410l.yandex;
        if (j != -1) {
            C13975l c13975l3 = AbstractC14375l.yandex;
            c16410l.amazon = (int) Math.round((j * 8) / (c16410l.firebase * 1000.0d));
        }
        return c16410l;
    }

    @Override // defpackage.AbstractC9456l
    public final InterfaceC13280l purchase(FileChannel fileChannel, String str, boolean z) {
        this.amazon.getClass();
        return C0118l.isPro(fileChannel, str);
    }
}
