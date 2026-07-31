package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lؙٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6588l extends AbstractC8233l {
    public C8398l crashlytics;

    @Override // defpackage.AbstractC8233l
    public final void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        C8398l c8398l = this.crashlytics;
        c8398l.getClass();
        try {
            c8398l.amazon(new C3397l(), randomAccessFile, randomAccessFile2);
        } catch (C9511l e) {
            C18262l.metrica(e.getMessage());
        }
    }

    @Override // defpackage.AbstractC8233l
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        this.crashlytics.amazon(interfaceC13280l, randomAccessFile, randomAccessFile2);
    }
}
