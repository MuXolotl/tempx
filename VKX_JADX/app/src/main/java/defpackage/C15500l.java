package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘَٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15500l extends AbstractC12112l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f30292l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f30293l;

    public C15500l(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f30293l = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f30293l.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // defpackage.AbstractC12112l, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f30293l.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f30293l.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
    }

    @Override // defpackage.AbstractC12112l, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f30293l.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
    }
}
