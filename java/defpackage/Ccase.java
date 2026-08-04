package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: case, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Ccase extends Cnative {
    public static Ccase advert(byte[] bArr) throws IOException {
        Csynchronized csynchronized = new Csynchronized(bArr);
        try {
            Ccase ccaseAds = csynchronized.ads();
            if (csynchronized.available() == 0) {
                return ccaseAds;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            C18262l.metrica("cannot recognise object in stream");
            return null;
        }
    }

    public abstract int Signature(boolean z);

    public final boolean ad(Ccase ccase) {
        return this == ccase || vip(ccase);
    }

    public abstract boolean ads();

    @Override // defpackage.Cnative
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof applovin) && vip(((applovin) obj).billing());
    }

    @Override // defpackage.Cnative
    public abstract int hashCode();

    public abstract void metrica(C7972l c7972l, boolean z);

    public final boolean pro(applovin applovinVar) {
        if (this != applovinVar) {
            return applovinVar != null && vip(applovinVar.billing());
        }
        return true;
    }

    public final void tapsense(OutputStream outputStream, String str) {
        C7972l c13925l;
        int i = 2;
        if (str.equals("DER")) {
            c13925l = new C8095l(i, outputStream);
        } else {
            c13925l = str.equals("DL") ? new C13925l(i, outputStream) : new C7972l(i, outputStream);
        }
        c13925l.mo2239protected(this);
    }

    public abstract boolean vip(Ccase ccase);

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this;
    }

    public Ccase isVip() {
        return this;
    }

    public Ccase signatures() {
        return this;
    }
}
