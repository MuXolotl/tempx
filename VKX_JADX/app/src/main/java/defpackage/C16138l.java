package defpackage;

/* JADX INFO: renamed from: lٖؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16138l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cinterface f31596l;

    public static C16138l metrica(applovin applovinVar) {
        if (applovinVar instanceof C16138l) {
            return (C16138l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cinterface cinterfaceApplovin = Cinterface.applovin(applovinVar);
        C16138l c16138l = new C16138l();
        c16138l.f31596l = cinterfaceApplovin;
        return c16138l;
    }

    public final C8047l[] ads() {
        Cinterface cinterface = this.f31596l;
        int length = cinterface.f842l.length;
        C8047l[] c8047lArr = new C8047l[length];
        for (int i = 0; i != length; i++) {
            c8047lArr[i] = C8047l.vip(cinterface.f842l[i]);
        }
        return c8047lArr;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f31596l;
    }

    public final C8047l vip() {
        applovin[] applovinVarArr = this.f31596l.f842l;
        if (applovinVarArr.length == 0) {
            return null;
        }
        return C8047l.vip(applovinVarArr[0]);
    }
}
