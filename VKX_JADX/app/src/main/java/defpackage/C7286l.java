package defpackage;

/* JADX INFO: renamed from: lؚٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7286l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cthrow f15133l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f15134l;

    public C7286l(byte[] bArr, int i) {
        this.f15133l = new C11327l(bArr);
        this.f15134l = Cstrictfp.m4580private(i);
    }

    public static C7286l vip(Object obj) {
        if (obj instanceof C7286l) {
            return (C7286l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C7286l c7286l = new C7286l();
        c7286l.f15133l = (Cthrow) cclassInmobi.mo173throws(0);
        c7286l.f15134l = Cstrictfp.premium(cclassInmobi.mo173throws(1));
        return c7286l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f15133l, this.f15134l);
    }
}
