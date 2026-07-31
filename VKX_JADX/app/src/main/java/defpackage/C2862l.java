package defpackage;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: lؔۘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2862l implements SecretKey {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC16675l f6228l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char[] f6229l;

    public C2862l(char[] cArr, EnumC16675l enumC16675l) {
        this.f6229l = cArr == null ? null : (char[]) cArr.clone();
        this.f6228l = enumC16675l;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f6228l.yandex(this.f6229l);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f6228l.loadAd();
    }
}
