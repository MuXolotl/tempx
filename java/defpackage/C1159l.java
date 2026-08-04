package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: lؒٚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1159l extends FilterOutputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f3138l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cipher f3139l;

    public C1159l(DataOutputStream dataOutputStream, Cipher cipher) {
        super(dataOutputStream);
        this.f3138l = new byte[1];
        this.f3139l = cipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException iOException;
        IOException iOException2;
        try {
            byte[] bArrDoFinal = this.f3139l.doFinal();
            if (bArrDoFinal != null) {
                ((FilterOutputStream) this).out.write(bArrDoFinal);
            }
            iOException2 = null;
        } catch (GeneralSecurityException e) {
            iOException = new Cthrows("Error during cipher finalisation", e, 2);
            iOException2 = iOException;
        } catch (Exception e2) {
            iOException = new IOException("Error closing stream: " + e2);
            iOException2 = iOException;
        }
        try {
            flush();
            ((FilterOutputStream) this).out.close();
        } catch (IOException e3) {
            if (iOException2 == null) {
                iOException2 = e3;
            }
        }
        if (iOException2 != null) {
            throw iOException2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrUpdate = this.f3139l.update(bArr, i, i2);
        if (bArrUpdate != null) {
            ((FilterOutputStream) this).out.write(bArrUpdate);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f3138l;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
