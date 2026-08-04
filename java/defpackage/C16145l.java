package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: renamed from: lؘٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16145l extends OutputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f31614l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31615l;

    public C16145l(C7167l c7167l) {
        this.f31615l = 3;
        this.f31614l = c7167l;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        switch (this.f31615l) {
            case 3:
                ((C7167l) this.f31614l).close();
                break;
            case 4:
            default:
                super.close();
                break;
            case 5:
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f31615l) {
            case 3:
                C7167l c7167l = (C7167l) this.f31614l;
                if (!c7167l.f14997l) {
                    c7167l.flush();
                }
                break;
            case 4:
            default:
                super.flush();
                break;
            case 5:
                ((FileOutputStream) this.f31614l).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f31615l) {
            case 3:
                return ((C7167l) this.f31614l) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f31615l) {
            case 0:
                ((C0655l) this.f31614l).update((byte) i);
                return;
            case 1:
                ((C0361l) this.f31614l).update((byte) i);
                return;
            case 2:
                ((RandomAccessFile) this.f31614l).write(i);
                return;
            case 3:
                C7167l c7167l = (C7167l) this.f31614l;
                if (c7167l.f14997l) {
                    C18262l.metrica("closed");
                    return;
                } else {
                    c7167l.f14998l.m709instanceof((byte) i);
                    c7167l.yandex();
                    return;
                }
            case 4:
                try {
                    ((Signature) this.f31614l).update((byte) i);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC17742l.crashlytics(e.getMessage(), e);
                }
            default:
                ((FileOutputStream) this.f31614l).write(i);
                return;
        }
    }

    public /* synthetic */ C16145l(int i, Object obj) {
        this.f31615l = i;
        this.f31614l = obj;
    }

    public /* synthetic */ C16145l(int i) {
        this.f31615l = i;
    }

    private final void yandex() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f31615l) {
            case 4:
                try {
                    ((Signature) this.f31614l).update(bArr);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC17742l.crashlytics(e.getMessage(), e);
                }
            case 5:
                ((FileOutputStream) this.f31614l).write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.f31615l) {
            case 0:
                ((C0655l) this.f31614l).update(bArr, i, i2);
                return;
            case 1:
                ((C0361l) this.f31614l).update(bArr, i, i2);
                return;
            case 2:
                ((RandomAccessFile) this.f31614l).write(bArr, i, i2);
                return;
            case 3:
                C7167l c7167l = (C7167l) this.f31614l;
                if (!c7167l.f14997l) {
                    c7167l.f14998l.write(bArr, i, i2);
                    c7167l.yandex();
                    return;
                } else {
                    C18262l.metrica("closed");
                    return;
                }
            case 4:
                try {
                    ((Signature) this.f31614l).update(bArr, i, i2);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC17742l.crashlytics(e.getMessage(), e);
                }
            default:
                ((FileOutputStream) this.f31614l).write(bArr, i, i2);
                return;
        }
    }
}
