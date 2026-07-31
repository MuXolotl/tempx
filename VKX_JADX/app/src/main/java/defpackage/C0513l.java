package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؑۖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0513l extends AbstractC3326l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final SecureRandom f1833l;

    public C0513l(SecureRandom secureRandom) {
        this.f1833l = secureRandom;
    }

    @Override // defpackage.AbstractC4777l
    public final int amazon() {
        return this.f1833l.nextInt();
    }

    @Override // defpackage.AbstractC4777l
    public final long billing() {
        return this.f1833l.nextLong();
    }

    @Override // defpackage.AbstractC4777l
    public final byte[] crashlytics(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        this.f1833l.nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.AbstractC4777l
    public final int yandex(int i) {
        return (this.f1833l.nextInt() >>> (32 - i)) & ((-i) >> 31);
    }
}
