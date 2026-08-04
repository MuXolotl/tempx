package defpackage;

/* JADX INFO: renamed from: lًُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7939l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cthrow f16539l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10198l f16540l;

    public C7939l(Cclass cclass) {
        this.f16540l = C10198l.vip(cclass.mo173throws(0));
        this.f16539l = Cthrow.premium(cclass.mo173throws(1));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f16540l, this.f16539l);
    }

    public C7939l(C10198l c10198l, byte[] bArr) {
        this.f16540l = c10198l;
        this.f16539l = new C11327l(AbstractC14024l.crashlytics(bArr));
    }
}
