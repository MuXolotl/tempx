package defpackage;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: lْٙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C13463l implements SecretKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC16675l f26401l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char[] f26402l;

    public C13463l(char[] cArr, EnumC16675l enumC16675l) {
        char[] cArr2 = new char[cArr.length];
        this.f26402l = cArr2;
        this.f26401l = enumC16675l;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f26401l.yandex(this.f26402l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f26401l.loadAd();
    }
}
