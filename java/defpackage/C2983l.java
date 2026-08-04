package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2983l extends AbstractC9456l {
    public C0514l amazon;
    public C11996l crashlytics;

    @Override // defpackage.AbstractC9456l
    public final C16492l amazon(FileChannel fileChannel, String str) throws C13768l, IOException {
        this.crashlytics.getClass();
        C13975l c13975l = C11996l.yandex;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        new C11956l(fileChannel, AbstractC12900l.firebase(str, " ")).yandex();
        C9889l c9889l = null;
        boolean z = false;
        while (!z) {
            C8662l c8662lAmazon = C8662l.amazon(fileChannel);
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            int i2 = C17500l.yandex;
            if (((EnumC2692l) c8662lAmazon.purchase) == EnumC2692l.STREAMINFO) {
                c9889l = new C9889l(c8662lAmazon, fileChannel);
            } else {
                fileChannel.position(fileChannel.position() + ((long) c8662lAmazon.loadAd));
            }
            z = c8662lAmazon.crashlytics;
        }
        long jPosition = fileChannel.position();
        if (c9889l == null) {
            throw new C13768l(AbstractC12900l.firebase(str, ":Unable to find Flac StreamInfo"));
        }
        int i3 = c9889l.f20118l;
        float f = c9889l.f20122l;
        C16846l c16846l = new C16846l();
        c16846l.smaato = c9889l.f20126l;
        c16846l.firebase = f;
        c16846l.purchase = c9889l.f20119l;
        c16846l.billing = c9889l.f20123l;
        c16846l.mopub = i3;
        c16846l.admob = AbstractC15560l.tapsense("FLAC ", i3, " bits");
        c16846l.isPro = true;
        c16846l.vip = c9889l.f20128l;
        c16846l.yandex = fileChannel.size() - jPosition;
        c16846l.loadAd = jPosition;
        c16846l.crashlytics = fileChannel.size();
        long j = c16846l.yandex;
        C13975l c13975l2 = AbstractC14375l.yandex;
        c16846l.amazon = (int) (((j / 1000) * 8) / f);
        return c16846l;
    }

    @Override // defpackage.AbstractC9456l
    public final InterfaceC13280l purchase(FileChannel fileChannel, String str, boolean z) throws C13768l, IOException {
        C0514l c0514l = this.amazon;
        c0514l.getClass();
        C13975l c13975l = C0514l.loadAd;
        new C11956l(fileChannel, AbstractC12900l.firebase(str, " ")).yandex();
        ArrayList arrayList = new ArrayList();
        C4391l c4391lTapsense = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (!z3) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            fileChannel.position();
            c13975l.getClass();
            int i = C17500l.yandex;
            C8662l c8662lAmazon = C8662l.amazon(fileChannel);
            int i2 = c8662lAmazon.loadAd;
            EnumC2692l enumC2692l = (EnumC2692l) c8662lAmazon.purchase;
            fileChannel.position();
            if (enumC2692l != null) {
                int iOrdinal = enumC2692l.ordinal();
                if (iOrdinal == 4) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
                    fileChannel.read(byteBufferAllocate);
                    C10241l c10241l = c0514l.yandex;
                    byte[] bArrArray = byteBufferAllocate.array();
                    c10241l.getClass();
                    c4391lTapsense = C10241l.yandex(false, bArrArray);
                } else if (iOrdinal != 6) {
                    fileChannel.position(fileChannel.position() + ((long) i2));
                } else {
                    if (z) {
                        fileChannel.position(fileChannel.position() + ((long) i2));
                    } else {
                        try {
                            arrayList.add(new C1562l(c8662lAmazon, fileChannel));
                        } catch (IOException | C11399l e) {
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            e.getMessage();
                            int i3 = C17500l.yandex;
                        }
                    }
                    z4 = true;
                }
            }
            z3 = c8662lAmazon.crashlytics;
        }
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        AbstractC6419l.admob(fileChannel.position());
        c13975l.getClass();
        int i4 = C17500l.yandex;
        if (c4391lTapsense == null) {
            c4391lTapsense = C4391l.tapsense();
        }
        if (z4 && z) {
            z2 = true;
        }
        return new C13188l(c4391lTapsense, arrayList, z2);
    }
}
