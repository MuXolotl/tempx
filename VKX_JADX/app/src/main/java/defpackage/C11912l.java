package defpackage;

/* JADX INFO: renamed from: lِٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11912l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10818l[] f23753l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7378l f23754l;

    public C11912l(Cclass cclass) {
        int i = 0;
        this.f23754l = C7378l.vip(cclass.mo173throws(0));
        Cclass cclassInmobi = Cclass.inmobi(cclass.mo173throws(1));
        this.f23753l = new C10818l[cclassInmobi.size()];
        while (true) {
            C10818l[] c10818lArr = this.f23753l;
            if (i == c10818lArr.length) {
                return;
            }
            c10818lArr[i] = C10818l.vip(cclassInmobi.mo173throws(i));
            i++;
        }
    }

    public static C11912l vip(Object obj) {
        if (obj instanceof C11912l) {
            return (C11912l) obj;
        }
        if (obj != null) {
            return new C11912l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C11138l c11138l = new C11138l(this.f23754l, new C11138l(this.f23753l));
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C11912l(C7378l c7378l, C10818l[] c10818lArr) {
        this.f23754l = c7378l;
        C10818l[] c10818lArr2 = new C10818l[c10818lArr.length];
        this.f23753l = c10818lArr2;
        System.arraycopy(c10818lArr, 0, c10818lArr2, 0, c10818lArr.length);
    }
}
