package defpackage;

/* JADX INFO: renamed from: lؘِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16217l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC8859l f31739l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC11918l f31740l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11327l f31741l;

    public C16217l(AbstractC8859l abstractC8859l, boolean z) {
        this.f31739l = abstractC8859l.startapp();
        this.f31741l = new C11327l(abstractC8859l.admob(z));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f31741l;
    }

    public final synchronized AbstractC8859l vip() {
        try {
            if (this.f31739l == null) {
                this.f31739l = this.f31740l.mopub(this.f31741l.f36593l).startapp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31739l;
    }

    public C16217l(AbstractC11918l abstractC11918l, byte[] bArr) {
        this.f31740l = abstractC11918l;
        this.f31741l = new C11327l(AbstractC14024l.crashlytics(bArr));
    }
}
