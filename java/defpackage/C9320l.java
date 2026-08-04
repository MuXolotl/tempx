package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٍٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9320l extends Cfinal {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        Ccase ccaseIsVip = this.f824l.billing().isVip();
        boolean zM187throws = m187throws();
        int iSignature = ccaseIsVip.Signature(zM187throws);
        if (zM187throws) {
            iSignature += C7972l.m2214extends(iSignature);
        }
        return iSignature + (z ? C7972l.m2219throw(this.f821l) : 0);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return m187throws() || this.f824l.billing().isVip().ads();
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        Ccase ccaseIsVip = this.f824l.billing().isVip();
        boolean zM187throws = m187throws();
        if (z) {
            int i = this.f822l;
            if (zM187throws || ccaseIsVip.ads()) {
                i |= 32;
            }
            c7972l.m2245this(i, this.f821l);
        }
        if (zM187throws) {
            c7972l.m2220abstract(ccaseIsVip.Signature(true));
        }
        ccaseIsVip.metrica(c7972l.mo2235native(), zM187throws);
    }

    @Override // defpackage.Cfinal
    /* JADX INFO: renamed from: package */
    public final Cclass mo186package(Ccase ccase) {
        C11138l c11138l = new C11138l(ccase);
        c11138l.f22357l = -1;
        return c11138l;
    }

    @Override // defpackage.Cfinal, defpackage.Ccase
    public final Ccase isVip() {
        return this;
    }

    @Override // defpackage.Cfinal, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
