package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؓٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1894l extends Cinterface {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        int iSignature = z ? 4 : 3;
        for (applovin applovinVar : this.f842l) {
            iSignature += applovinVar.billing().Signature(true);
        }
        return iSignature;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2229finally(z, 49, this.f842l);
    }
}
