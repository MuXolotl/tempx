package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٍٍّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9438l extends AbstractC2240l {
    @Override // defpackage.AbstractC2240l
    public final C2925l crashlytics(File file, String str, boolean z) throws IOException {
        C8014l c8014l = new C8014l();
        AbstractC6745l.yandex(file);
        if (str == null || AbstractC1315l.purchase(str)) {
            C11983l.crashlytics();
            return null;
        }
        c8014l.yandex = file;
        c8014l.amazon = str;
        c8014l.purchase = null;
        c8014l.billing = null;
        FileChannel channel = new RandomAccessFile(file, "r").getChannel();
        try {
            long j = 0;
            if (channel.size() == 0) {
                throw new FileNotFoundException("Not found or 0 size " + file.getPath());
            }
            try {
                C10111l c10111l = new C10111l(channel);
                AbstractC17238l abstractC17238lPurchase = C8014l.purchase(c10111l);
                if (abstractC17238lPurchase.crashlytics()) {
                    long j2 = ((C9037l) abstractC17238lPurchase.loadAd()).crashlytics + 10;
                    C0153l c0153l = new C0153l(c10111l, j2, file.getPath());
                    if (j2 != c0153l.purchase) {
                        C13975l c13975l = C8014l.mopub;
                        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i = C17500l.yandex;
                        c0153l = c8014l.amazon(c10111l, j2, c0153l, file.getPath());
                        j2 = c0153l.purchase;
                    }
                    c8014l.loadAd = c0153l;
                    j = j2;
                } else {
                    c8014l.loadAd = new C0153l(c10111l, 0L, file.getPath());
                }
                if (abstractC17238lPurchase.crashlytics()) {
                    C9037l c9037l = (C9037l) abstractC17238lPurchase.loadAd();
                    C0869l c0869l = new C0869l();
                    c10111l.applovin(10L, j - 10, c0869l);
                    byte b = c9037l.yandex;
                    if (b == 2) {
                        c8014l.purchase = new C15649l(c0869l, c9037l, file.getPath(), z);
                    } else if (b == 3) {
                        c8014l.purchase = new C9553l(c0869l, c9037l, file.getPath(), z);
                    } else if (b == 4) {
                        c8014l.purchase = new C11246l(c0869l, c9037l, file.getPath(), z);
                    }
                }
                c8014l.billing(c10111l, file.getPath());
                AbstractC3348l abstractC3348l = c8014l.purchase;
                if (abstractC3348l != null) {
                    c8014l.crashlytics = abstractC3348l;
                } else {
                    C11975l c11975l = c8014l.billing;
                    if (c11975l != null) {
                        c8014l.crashlytics = c11975l;
                    }
                }
                boolean z2 = true;
                AbstractC12442l.subscription(!AbstractC1315l.purchase(str));
                if (c8014l.loadAd == null) {
                    z2 = false;
                }
                AbstractC12442l.subscription(z2);
                channel.close();
                return c8014l;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        channel.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (IOException e) {
            throw new FileNotFoundException(file.getPath() + " " + e.getMessage());
        }
    }

    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }
}
