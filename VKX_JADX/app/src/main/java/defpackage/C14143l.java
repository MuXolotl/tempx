package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٓٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14143l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f27661l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27662l = 1;

    public C14143l(BigInteger bigInteger) {
        if (AbstractC16784l.yandex.compareTo(bigInteger) <= 0) {
            this.f27661l = bigInteger;
        } else {
            C8339l.metrica("Invalid CRL number : not in (0..MAX)");
            throw null;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        switch (this.f27662l) {
            case 0:
                return new Cstrictfp((BigInteger) this.f27661l);
            default:
                appmetrica appmetricaVar = new appmetrica(2, 0);
                appmetricaVar.purchase((C4567l) this.f27661l);
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                return c11138l;
        }
    }

    public String toString() {
        switch (this.f27662l) {
            case 0:
                return "CRLNumber: " + ((BigInteger) this.f27661l);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C14143l() {
    }
}
