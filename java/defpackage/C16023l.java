package defpackage;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: lٕۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C16023l implements SecretKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f31404l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char[] f31405l;

    public C16023l(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.f31405l = cArr2;
        this.f31404l = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        boolean z = this.f31404l;
        char[] cArr = this.f31405l;
        return (z && cArr.length == 0) ? new byte[2] : AbstractC11186l.PKCS12PasswordToBytes(cArr);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS12";
    }
}
