package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11138l extends Cclass {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22357l;

    public C11138l(applovin applovinVar, applovin applovinVar2) {
        super(applovinVar, applovinVar2);
        this.f22357l = -1;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(m3041private(), z);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) throws IOException {
        c7972l.m2248try(48, z);
        C8095l c8095lMo2235native = c7972l.mo2235native();
        int length = this.f504l.length;
        int i = 0;
        if (this.f22357l >= 0 || length > 16) {
            c7972l.m2220abstract(m3041private());
            while (i < length) {
                this.f504l[i].billing().isVip().metrica(c8095lMo2235native, true);
                i++;
            }
            return;
        }
        Ccase[] ccaseArr = new Ccase[length];
        int iSignature = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Ccase ccaseIsVip = this.f504l[i2].billing().isVip();
            ccaseArr[i2] = ccaseIsVip;
            iSignature += ccaseIsVip.Signature(true);
        }
        this.f22357l = iSignature;
        c7972l.m2220abstract(iSignature);
        while (i < length) {
            ccaseArr[i].metrica(c8095lMo2235native, true);
            i++;
        }
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: native */
    public final Cinterface mo169native() {
        return new C12609l(this.f504l);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m3041private() {
        if (this.f22357l < 0) {
            int length = this.f504l.length;
            int iSignature = 0;
            for (int i = 0; i < length; i++) {
                iSignature += this.f504l[i].billing().isVip().Signature(true);
            }
            this.f22357l = iSignature;
        }
        return this.f22357l;
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: strictfp */
    public final C4848l mo171strictfp() {
        return new C4848l(this, 0);
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: synchronized */
    public final advert mo172synchronized() {
        return new C13353l(C3241l.m1302package(premium()));
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: volatile */
    public final Cthrow mo174volatile() {
        return new C11327l(C6864l.applovin(applovin()));
    }

    public C11138l(applovin[] applovinVarArr) {
        super(applovinVarArr);
        this.f22357l = -1;
    }

    @Override // defpackage.Cclass, defpackage.Ccase
    public final Ccase isVip() {
        return this;
    }

    @Override // defpackage.Cclass, defpackage.Ccase
    public final Ccase signatures() {
        return this;
    }
}
