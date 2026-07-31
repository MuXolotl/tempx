package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3569l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f7497l = new ad(7, C3569l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f7498l;

    public C3569l(byte[] bArr) {
        if (bArr != null) {
            this.f7498l = bArr;
        } else {
            C6541l.subs("'contents' cannot be null");
            throw null;
        }
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f7498l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f7498l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(25, z, this.f7498l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return AbstractC9008l.yandex(this.f7498l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C3569l) {
            return Arrays.equals(this.f7498l, ((C3569l) ccase).f7498l);
        }
        return false;
    }
}
