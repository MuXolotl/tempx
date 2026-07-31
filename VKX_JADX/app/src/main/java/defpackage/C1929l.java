package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٟؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1929l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f4392l = new ad(23, C1929l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f4393l;

    public C1929l(byte[] bArr) {
        this.f4393l = bArr;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f4393l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f4393l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(21, z, this.f4393l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return AbstractC9008l.yandex(this.f4393l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C1929l) {
            return Arrays.equals(this.f4393l, ((C1929l) ccase).f4393l);
        }
        return false;
    }
}
