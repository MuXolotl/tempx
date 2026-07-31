package defpackage;

/* JADX INFO: renamed from: lٌۙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9018l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12378l[] f18580l;

    public C9018l(Cclass cclass) {
        this.f18580l = new C12378l[cclass.size()];
        for (int i = 0; i != cclass.size(); i++) {
            this.f18580l[i] = C12378l.vip(cclass.mo173throws(i));
        }
    }

    public static C9018l vip(Object obj) {
        if (obj instanceof C9018l) {
            return (C9018l) obj;
        }
        if (obj != null) {
            return new C9018l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f18580l);
    }

    public final C12378l[] metrica() {
        C12378l[] c12378lArr = this.f18580l;
        C12378l[] c12378lArr2 = new C12378l[c12378lArr.length];
        System.arraycopy(c12378lArr, 0, c12378lArr2, 0, c12378lArr.length);
        return c12378lArr2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneralNames:");
        String str = AbstractC9008l.yandex;
        sb.append(str);
        int i = 0;
        while (true) {
            C12378l[] c12378lArr = this.f18580l;
            if (i == c12378lArr.length) {
                return sb.toString();
            }
            sb.append("    ");
            sb.append(c12378lArr[i]);
            sb.append(str);
            i++;
        }
    }

    public C9018l(C12378l c12378l) {
        this.f18580l = new C12378l[]{c12378l};
    }
}
