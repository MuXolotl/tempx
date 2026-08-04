package defpackage;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: renamed from: lؘؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2444l extends EncodedKeySpec {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final String[] f5221l = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f5222l;

    public C2444l(byte[] bArr) {
        super(bArr);
        int i = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i >= bArr.length) {
            C8339l.metrica("invalid public key blob: type field longer than blob");
            throw null;
        }
        String strYandex = AbstractC9008l.yandex(AbstractC14024l.vip(4, i, bArr));
        this.f5222l = strYandex;
        if (strYandex.startsWith("ecdsa")) {
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (f5221l[i2].equals(this.f5222l)) {
                return;
            }
        }
        C18262l.startapp(this.f5222l, "unrecognised public key type ");
        throw null;
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        return "OpenSSH";
    }
}
