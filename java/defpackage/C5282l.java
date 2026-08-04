package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lؗۦؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5282l extends FilterInputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f11390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5282l(FilterInputStream filterInputStream, Object obj, int i) {
        super(filterInputStream);
        this.f11391l = i;
        this.f11390l = obj;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f11391l) {
            case 0:
                int i = ((FilterInputStream) this).in.read();
                if (i >= 0) {
                    ((C0655l) this.f11390l).update((byte) i);
                }
                return i;
            default:
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 >= 0) {
                    ((C0361l) this.f11390l).update((byte) i2);
                }
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f11391l) {
            case 0:
                int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
                if (i3 > 0) {
                    ((C0655l) this.f11390l).update(bArr, i, i3);
                }
                return i3;
            default:
                int i4 = ((FilterInputStream) this).in.read(bArr, i, i2);
                if (i4 >= 0) {
                    ((C0361l) this.f11390l).update(bArr, i, i4);
                }
                return i4;
        }
    }
}
