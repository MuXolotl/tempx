package defpackage;

/* JADX INFO: renamed from: lًّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12459l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f24592l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C14148l[] f24593l;

    public static C12459l vip(Object obj) {
        if (obj instanceof C12459l) {
            return (C12459l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C12459l c12459l = new C12459l();
        c12459l.f24592l = true;
        c12459l.f24593l = new C14148l[cclassInmobi.size()];
        int i = 0;
        while (true) {
            C14148l[] c14148lArr = c12459l.f24593l;
            if (i == c14148lArr.length) {
                c12459l.f24592l = cclassInmobi instanceof C16472l;
                return c12459l;
            }
            c14148lArr[i] = C14148l.vip(cclassInmobi.mo173throws(i));
            i++;
        }
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        boolean z = this.f24592l;
        C14148l[] c14148lArr = this.f24593l;
        if (z) {
            return new C16472l(c14148lArr);
        }
        C3884l c3884l = new C3884l(c14148lArr);
        c3884l.f8024l = -1;
        return c3884l;
    }
}
