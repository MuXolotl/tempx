package defpackage;

/* JADX INFO: renamed from: lٖٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16457l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C1074l f32177l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cclass f32178l;

    public static C16457l metrica(Object obj) {
        if (obj instanceof C16457l) {
            return (C16457l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C16457l c16457l = new C16457l();
            if (cclassInmobi.size() >= 2 && cclassInmobi.size() <= 3) {
                c16457l.f32178l = cclassInmobi;
                return c16457l;
            }
            C8339l.metrica(AbstractC4338l.ad(cclassInmobi, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    public final Cstrictfp ads() {
        return Cstrictfp.premium(this.f32178l.mo173throws(0));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f32178l;
    }

    public final boolean tapsense() {
        return this.f32178l.size() == 3;
    }

    public final C1074l vip() {
        Cclass cclass = this.f32178l;
        if (this.f32177l == null && cclass.size() == 3) {
            this.f32177l = C1074l.ads(cclass.mo173throws(2));
        }
        return this.f32177l;
    }
}
