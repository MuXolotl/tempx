package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍۘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9775l extends Cnative implements Iterable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final applovin[] f19919l;

    public C9775l(Cclass cclass) {
        this.f19919l = new applovin[cclass.size()];
        int i = 0;
        while (true) {
            applovin[] applovinVarArr = this.f19919l;
            if (i == applovinVarArr.length) {
                return;
            }
            applovin applovinVarMo173throws = cclass.mo173throws(i);
            applovinVarArr[i] = applovinVarMo173throws instanceof C8480l ? (C8480l) applovinVarMo173throws : applovinVarMo173throws != null ? new C8480l(Cclass.inmobi(applovinVarMo173throws)) : null;
            i++;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f19919l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15037l(1, this.f19919l);
    }

    public C9775l(C8480l[] c8480lArr) {
        applovin[] applovinVarArr = new applovin[c8480lArr.length];
        this.f19919l = applovinVarArr;
        System.arraycopy(c8480lArr, 0, applovinVarArr, 0, c8480lArr.length);
    }
}
