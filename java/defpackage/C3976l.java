package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lًًؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3976l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cfor f8163l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cthrow f8164l;

    public static C3976l vip(Object obj) {
        if (obj instanceof C3976l) {
            return (C3976l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C3976l c3976l = new C3976l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        c3976l.f8164l = (Cthrow) enumerationMo170package.nextElement();
        c3976l.f8163l = (Cfor) enumerationMo170package.nextElement();
        return c3976l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f8164l, this.f8163l);
    }
}
