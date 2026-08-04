package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؘؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2930l extends Cinterface {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f6383l;

    public C2930l() {
        this.f6383l = -1;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(m1269throws(), z);
    }

    @Override // defpackage.Cinterface, defpackage.Ccase
    public final Ccase isVip() {
        return this.f841l != null ? this : super.isVip();
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(49, z);
        C8095l c8095lMo2235native = c7972l.mo2235native();
        applovin[] applovinVarArr = this.f842l;
        int length = applovinVarArr.length;
        int i = 0;
        if (this.f6383l >= 0 || length > 16) {
            c7972l.m2220abstract(m1269throws());
            while (i < length) {
                applovinVarArr[i].billing().isVip().metrica(c8095lMo2235native, true);
                i++;
            }
            return;
        }
        Ccase[] ccaseArr = new Ccase[length];
        int iSignature = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Ccase ccaseIsVip = applovinVarArr[i2].billing().isVip();
            ccaseArr[i2] = ccaseIsVip;
            iSignature += ccaseIsVip.Signature(true);
        }
        this.f6383l = iSignature;
        c7972l.m2220abstract(iSignature);
        while (i < length) {
            ccaseArr[i].metrica(c8095lMo2235native, true);
            i++;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m1269throws() {
        if (this.f6383l < 0) {
            int iSignature = 0;
            for (applovin applovinVar : this.f842l) {
                iSignature += applovinVar.billing().isVip().Signature(true);
            }
            this.f6383l = iSignature;
        }
        return this.f6383l;
    }

    public C2930l(applovin applovinVar) {
        super(applovinVar);
        this.f6383l = -1;
    }

    public C2930l(applovin[] applovinVarArr) {
        super(applovinVarArr);
        this.f6383l = -1;
    }

    @Override // defpackage.Cinterface, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
