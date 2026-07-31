package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7793l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f16315l = new ad(11, C7793l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f16316l;

    public C7793l(byte[] bArr) {
        this.f16316l = bArr;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f16316l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f16316l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(18, z, this.f16316l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return AbstractC9008l.yandex(this.f16316l);
    }

    public final String toString() {
        return AbstractC9008l.yandex(this.f16316l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C7793l) {
            return Arrays.equals(this.f16316l, ((C7793l) ccase).f16316l);
        }
        return false;
    }
}
