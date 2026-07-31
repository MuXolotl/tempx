package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: native, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cnative implements applovin, InterfaceC8635l {
    @Override // defpackage.applovin
    public abstract Ccase billing();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof applovin) {
            return billing().ad(((applovin) obj).billing());
        }
        return false;
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Ccase ccaseBilling = billing();
        ccaseBilling.getClass();
        ccaseBilling.metrica(new C7972l(2, byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public String getName() {
        return toString();
    }

    public int hashCode() {
        return billing().hashCode();
    }

    public final byte[] remoteconfig(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        billing().tapsense(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
