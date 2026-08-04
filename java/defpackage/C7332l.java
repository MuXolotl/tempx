package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؚٕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7332l extends Cfinal {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        Ccase ccaseSignatures = this.f824l.billing().signatures();
        boolean zM187throws = m187throws();
        int iSignature = ccaseSignatures.Signature(zM187throws);
        if (zM187throws) {
            iSignature += C7972l.m2214extends(iSignature);
        }
        return iSignature + (z ? C7972l.m2219throw(this.f821l) : 0);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return m187throws() || this.f824l.billing().signatures().ads();
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        Ccase ccaseSignatures = this.f824l.billing().signatures();
        boolean zM187throws = m187throws();
        if (z) {
            int i = this.f822l;
            if (zM187throws || ccaseSignatures.ads()) {
                i |= 32;
            }
            c7972l.m2245this(i, this.f821l);
        }
        if (zM187throws) {
            c7972l.m2220abstract(ccaseSignatures.Signature(true));
        }
        ccaseSignatures.metrica(c7972l.mo2238private(), zM187throws);
    }

    @Override // defpackage.Cfinal
    /* JADX INFO: renamed from: package */
    public final Cclass mo186package(Ccase ccase) {
        C3884l c3884l = new C3884l(ccase);
        c3884l.f8024l = -1;
        return c3884l;
    }

    @Override // defpackage.Cfinal, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
