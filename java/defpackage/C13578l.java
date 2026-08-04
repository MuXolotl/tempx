package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lْۖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13578l extends AbstractC8233l {
    public C9269l crashlytics;

    @Override // defpackage.AbstractC8233l
    public final void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C13768l, C9511l, IOException {
        C9269l c9269l = this.crashlytics;
        c9269l.getClass();
        try {
            c9269l.loadAd.crashlytics(randomAccessFile);
            C4391l c4391lTapsense = C4391l.tapsense();
            randomAccessFile.seek(0L);
            c9269l.purchase(c4391lTapsense, randomAccessFile, randomAccessFile2);
        } catch (C13768l unused) {
            c9269l.purchase(C4391l.tapsense(), randomAccessFile, randomAccessFile2);
        }
    }

    @Override // defpackage.AbstractC8233l
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C13768l, C9511l, IOException {
        this.crashlytics.purchase(interfaceC13280l, randomAccessFile, randomAccessFile2);
    }
}
