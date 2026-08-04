package defpackage;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: renamed from: lَؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6972l extends EncodedKeySpec {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14643l;

    public C6972l(byte[] bArr) {
        String str;
        super(bArr);
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                C8339l.metrica("unknown byte encoding");
                throw null;
            }
            str = "OpenSSH";
        }
        this.f14643l = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        return this.f14643l;
    }
}
