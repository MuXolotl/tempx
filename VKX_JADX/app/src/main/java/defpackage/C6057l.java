package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘۣٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6057l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f12827l = new ad(19, C6057l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f12828l;

    public C6057l(byte[] bArr) {
        this.f12828l = bArr;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f12828l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f12828l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(20, z, this.f12828l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return AbstractC9008l.yandex(this.f12828l);
    }

    public final String toString() {
        return AbstractC9008l.yandex(this.f12828l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C6057l) {
            return Arrays.equals(this.f12828l, ((C6057l) ccase).f12828l);
        }
        return false;
    }
}
