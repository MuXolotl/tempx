package defpackage;

/* JADX INFO: renamed from: lؕۢٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3719l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2795l f7781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2795l f7782l;

    public C3719l(Cclass cclass) {
        int size = cclass.size();
        if (size != 2) {
            C8339l.metrica(AbstractC0653l.vip(size, "Bad sequence size: "));
            throw null;
        }
        this.f7782l = C2795l.metrica(cclass.mo173throws(0));
        this.f7781l = C2795l.metrica(cclass.mo173throws(1));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f7782l, this.f7781l);
    }
}
