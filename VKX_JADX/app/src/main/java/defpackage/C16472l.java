package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٖٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16472l extends Cclass {
    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        int iSignature = z ? 4 : 3;
        int length = this.f504l.length;
        for (int i = 0; i < length; i++) {
            iSignature += this.f504l[i].billing().Signature(true);
        }
        return iSignature;
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2229finally(z, 48, this.f504l);
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: native */
    public final Cinterface mo169native() {
        return new C1894l(false, this.f504l);
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: strictfp */
    public final C4848l mo171strictfp() {
        return ((Cclass) signatures()).mo171strictfp();
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: synchronized */
    public final advert mo172synchronized() {
        return new C3241l(premium());
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: volatile */
    public final Cthrow mo174volatile() {
        Cthrow[] cthrowArrApplovin = applovin();
        return new C6864l(C6864l.applovin(cthrowArrApplovin), cthrowArrApplovin);
    }
}
