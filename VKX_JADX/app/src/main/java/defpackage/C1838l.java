package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: lؓٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1838l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f4244l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f4245l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f4246l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f4247l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f4248l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f4249l;

    public C1838l(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f4246l = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f4246l = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f4245l = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f4245l = null;
        }
        this.f4244l = i;
        this.f4248l = i2;
        this.f4247l = AbstractC14024l.crashlytics(bArr3);
        this.f4249l = z;
    }
}
