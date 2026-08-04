package defpackage;

import java.security.SecureRandomSpi;

/* JADX INFO: renamed from: lًٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17272l extends SecureRandomSpi {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC3326l f33505l;

    public C17272l(AbstractC3326l abstractC3326l) {
        this.f33505l = abstractC3326l;
    }

    @Override // java.security.SecureRandomSpi
    public final byte[] engineGenerateSeed(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.SecureRandomSpi
    public final void engineNextBytes(byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        this.f33505l.crashlytics(bArr);
    }

    @Override // java.security.SecureRandomSpi
    public final void engineSetSeed(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
