package defpackage;

/* JADX INFO: renamed from: lًٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14022l extends Cnative implements InterfaceC15427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Ccase f27328l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f27329l = InterfaceC15427l.f30176l;

    public C14022l(int i, int i2, int i3, int i4) {
        applovin applovinVarM4580private;
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(Cstrictfp.m4580private(i));
        if (i3 == 0) {
            if (i4 != 0) {
                C8339l.metrica("inconsistent k values");
                throw null;
            }
            appmetricaVar.purchase(InterfaceC15427l.f30153l);
            applovinVarM4580private = Cstrictfp.m4580private(i2);
        } else {
            if (i3 <= i2 || i4 <= i3) {
                C8339l.metrica("inconsistent k values");
                throw null;
            }
            appmetricaVar.purchase(InterfaceC15427l.f30175l);
            appmetrica appmetricaVar2 = new appmetrica(3, 0);
            appmetricaVar2.purchase(Cstrictfp.m4580private(i2));
            appmetricaVar2.purchase(Cstrictfp.m4580private(i3));
            appmetricaVar2.purchase(Cstrictfp.m4580private(i4));
            C11138l c11138l = new C11138l(appmetricaVar2);
            c11138l.f22357l = -1;
            applovinVarM4580private = c11138l;
        }
        appmetricaVar.purchase(applovinVarM4580private);
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        this.f27328l = c11138l2;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f27329l, this.f27328l);
    }
}
