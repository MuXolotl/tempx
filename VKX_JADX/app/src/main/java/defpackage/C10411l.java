package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lَٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10411l extends Cfinal {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        Ccase ccaseBilling = this.f824l.billing();
        boolean zM187throws = m187throws();
        int iSignature = ccaseBilling.Signature(zM187throws);
        if (zM187throws) {
            iSignature += 3;
        }
        return iSignature + (z ? C7972l.m2219throw(this.f821l) : 0);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return m187throws() || this.f824l.billing().ads();
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        Ccase ccaseBilling = this.f824l.billing();
        boolean zM187throws = m187throws();
        if (z) {
            int i = this.f822l;
            if (zM187throws || ccaseBilling.ads()) {
                i |= 32;
            }
            c7972l.m2245this(i, this.f821l);
        }
        if (!zM187throws) {
            ccaseBilling.metrica(c7972l, false);
            return;
        }
        c7972l.m2243super(128);
        ccaseBilling.metrica(c7972l, true);
        c7972l.m2243super(0);
        c7972l.m2243super(0);
    }

    @Override // defpackage.Cfinal
    /* JADX INFO: renamed from: package */
    public final Cclass mo186package(Ccase ccase) {
        return new C16472l(ccase);
    }
}
