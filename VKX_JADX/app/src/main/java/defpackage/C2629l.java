package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2629l extends InputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14189l f5727l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f5728l;

    public C2629l(Function0 function0, InterfaceC14189l interfaceC14189l) {
        this.f5728l = function0;
        this.f5727l = interfaceC14189l;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!((Boolean) this.f5728l.invoke()).booleanValue()) {
            return (int) Math.min(this.f5727l.crashlytics().f36079l, 2147483647L);
        }
        C18262l.metrica("Underlying source is closed.");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f5727l.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (((Boolean) this.f5728l.invoke()).booleanValue()) {
            C18262l.metrica("Underlying source is closed.");
            return 0;
        }
        InterfaceC14189l interfaceC14189l = this.f5727l;
        if (interfaceC14189l.subs()) {
            return -1;
        }
        return interfaceC14189l.readByte() & 255;
    }

    public final String toString() {
        return this.f5727l + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!((Boolean) this.f5728l.invoke()).booleanValue()) {
            AbstractC17463l.amazon(bArr.length, i, i2);
            return this.f5727l.mo1455l(i, i2 + i, bArr);
        }
        C18262l.metrica("Underlying source is closed.");
        return 0;
    }
}
