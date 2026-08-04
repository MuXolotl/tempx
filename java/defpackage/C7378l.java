package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lؚٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7378l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cthrow f15306l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10198l f15307l;

    public C7378l(C10198l c10198l, byte[] bArr) {
        this.f15307l = c10198l;
        this.f15306l = new C11327l(AbstractC14024l.crashlytics(bArr));
    }

    public static C7378l vip(Object obj) {
        if (obj instanceof C7378l) {
            return (C7378l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C7378l c7378l = new C7378l();
        Enumeration enumerationMo170package = cclassInmobi.mo170package();
        c7378l.f15307l = C10198l.vip(enumerationMo170package.nextElement());
        c7378l.f15306l = Cthrow.premium(enumerationMo170package.nextElement());
        return c7378l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f15307l, this.f15306l);
    }
}
