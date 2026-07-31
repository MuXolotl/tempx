package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lۣؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2213l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18584l f4890l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cnative f4891l;

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C2213l(Cclass cclass) {
        Cnative cnativeVip;
        applovin applovinVarMo173throws;
        C18584l c18584l = null;
        if (cclass.size() != 2) {
            C8339l.metrica("malformed sequence");
            throw null;
        }
        applovin applovinVarMo173throws2 = cclass.mo173throws(0);
        if (!(applovinVarMo173throws2 instanceof C7939l) && !(applovinVarMo173throws2 instanceof C8901l)) {
            Cclass cclassInmobi = Cclass.inmobi(applovinVarMo173throws2);
            if (cclassInmobi.size() == 2) {
                this.f4891l = new C7939l(Cclass.inmobi(cclassInmobi));
            } else {
                cnativeVip = C8901l.vip(cclassInmobi);
            }
            applovinVarMo173throws = cclass.mo173throws(1);
            if (applovinVarMo173throws instanceof C18584l) {
                c18584l = (C18584l) applovinVarMo173throws;
            } else if (applovinVarMo173throws instanceof byte[]) {
                try {
                    c18584l = new C18584l(Ccase.advert((byte[]) applovinVarMo173throws));
                } catch (IOException unused) {
                    C8339l.metrica("Unable to parse integrity check details.");
                    throw null;
                }
            } else if (applovinVarMo173throws != 0) {
                c18584l = new C18584l(applovinVarMo173throws);
            }
            this.f4890l = c18584l;
        }
        cnativeVip = (Cnative) applovinVarMo173throws2;
        this.f4891l = cnativeVip;
        applovinVarMo173throws = cclass.mo173throws(1);
        if (applovinVarMo173throws instanceof C18584l) {
            c18584l = (C18584l) applovinVarMo173throws;
        } else if (applovinVarMo173throws instanceof byte[]) {
            c18584l = new C18584l(Ccase.advert((byte[]) applovinVarMo173throws));
        } else if (applovinVarMo173throws != 0) {
            c18584l = new C18584l(applovinVarMo173throws);
        }
        this.f4890l = c18584l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f4891l, this.f4890l);
    }
}
