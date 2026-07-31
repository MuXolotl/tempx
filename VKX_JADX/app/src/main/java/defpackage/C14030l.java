package defpackage;

import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lٌٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14030l extends AbstractC8233l {
    @Override // defpackage.AbstractC8233l
    public final void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    @Override // defpackage.AbstractC8233l
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new RuntimeException("MP3FileReaderwriteTag should not be called");
    }

    @Override // defpackage.AbstractC8233l
    public final synchronized void yandex(C2925l c2925l) {
        C13975l c13975l = C8014l.mopub;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        ((C8014l) c2925l).billing = null;
        ((C8014l) c2925l).purchase = null;
        c2925l.loadAd();
    }
}
