package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: lٟٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16851l extends ByteArrayOutputStream {
    @Override // java.io.ByteArrayOutputStream
    public final void reset() {
        super.reset();
        AbstractC14024l.loadAd(((ByteArrayOutputStream) this).buf);
    }

    public final void yandex(byte[] bArr, int i) {
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, size());
    }
}
