package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lّٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12609l extends Cinterface {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24835l;

    public C12609l(applovin[] applovinVarArr) {
        super(false, applovinVarArr);
        this.f24835l = -1;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(m3429throws(), z);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(49, z);
        C13925l c13925lMo2238private = c7972l.mo2238private();
        applovin[] applovinVarArr = this.f842l;
        int length = applovinVarArr.length;
        int i = 0;
        if (this.f24835l >= 0 || length > 16) {
            c7972l.m2220abstract(m3429throws());
            while (i < length) {
                c13925lMo2238private.mo2239protected(applovinVarArr[i].billing());
                i++;
            }
            return;
        }
        Ccase[] ccaseArr = new Ccase[length];
        int iSignature = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Ccase ccaseSignatures = applovinVarArr[i2].billing().signatures();
            ccaseArr[i2] = ccaseSignatures;
            iSignature += ccaseSignatures.Signature(true);
        }
        this.f24835l = iSignature;
        c7972l.m2220abstract(iSignature);
        while (i < length) {
            c13925lMo2238private.mo2239protected(ccaseArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m3429throws() {
        if (this.f24835l < 0) {
            int iSignature = 0;
            for (applovin applovinVar : this.f842l) {
                iSignature += applovinVar.billing().signatures().Signature(true);
            }
            this.f24835l = iSignature;
        }
        return this.f24835l;
    }

    @Override // defpackage.Cinterface, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
