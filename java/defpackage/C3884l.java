package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؖؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3884l extends Cclass {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8024l;

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(m1447private(), z);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(48, z);
        C13925l c13925lMo2238private = c7972l.mo2238private();
        int length = this.f504l.length;
        int i = 0;
        if (this.f8024l >= 0 || length > 16) {
            c7972l.m2220abstract(m1447private());
            while (i < length) {
                c13925lMo2238private.mo2239protected(this.f504l[i].billing());
                i++;
            }
            return;
        }
        Ccase[] ccaseArr = new Ccase[length];
        int iSignature = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Ccase ccaseSignatures = this.f504l[i2].billing().signatures();
            ccaseArr[i2] = ccaseSignatures;
            iSignature += ccaseSignatures.Signature(true);
        }
        this.f8024l = iSignature;
        c7972l.m2220abstract(iSignature);
        while (i < length) {
            c13925lMo2238private.mo2239protected(ccaseArr[i]);
            i++;
        }
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: native */
    public final Cinterface mo169native() {
        return new C12609l(this.f504l);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m1447private() {
        if (this.f8024l < 0) {
            int length = this.f504l.length;
            int iSignature = 0;
            for (int i = 0; i < length; i++) {
                iSignature += this.f504l[i].billing().signatures().Signature(true);
            }
            this.f8024l = iSignature;
        }
        return this.f8024l;
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: strictfp */
    public final C4848l mo171strictfp() {
        return new C4848l(this, 1);
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: synchronized */
    public final advert mo172synchronized() {
        return new C3980l(C3241l.m1302package(premium()));
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: volatile */
    public final Cthrow mo174volatile() {
        return new C11327l(C6864l.applovin(applovin()));
    }

    @Override // defpackage.Cclass, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
