package defpackage;

/* JADX INFO: renamed from: lٗ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17203l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f33384l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f33385l;

    public C17203l(C10198l c10198l, byte[] bArr) {
        this.f33385l = AbstractC14024l.crashlytics(bArr);
        this.f33384l = c10198l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C11138l c11138l = new C11138l(this.f33384l, new C11327l(this.f33385l));
        c11138l.f22357l = -1;
        return c11138l;
    }
}
