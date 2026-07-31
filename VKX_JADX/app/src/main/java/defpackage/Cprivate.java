package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: private, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cprivate extends Ccase {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f36537l = new ad(12, Cprivate.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3569l f36538l;

    public Cprivate(C3569l c3569l) {
        this.f36538l = c3569l;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return this.f36538l.Signature(z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return ~AbstractC14024l.ads(this.f36538l.f7498l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(7, z);
        c7972l.m2240public(25, false, this.f36538l.f7498l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof Cprivate) {
            return this.f36538l.vip(((Cprivate) ccase).f36538l);
        }
        return false;
    }

    @Override // defpackage.Ccase
    public final Ccase isVip() {
        return this;
    }

    @Override // defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
