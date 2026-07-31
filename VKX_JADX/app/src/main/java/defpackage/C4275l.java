package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؖٞؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؖٞؔ;", "Llَّؓ;", "Llؘٚٛ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C4275l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C8841l f8771l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f8772l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11611l f8773l;

    public C4275l(C11611l c11611l, long j, C8841l c8841l) {
        this.f8773l = c11611l;
        this.f8772l = j;
        this.f8771l = c8841l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C5787l c5787l = (C5787l) abstractC14971l;
        C11611l c11611l = c5787l.f12200l;
        C11611l c11611l2 = this.f8773l;
        boolean zEquals = c11611l2.equals(c11611l);
        c5787l.f12200l = c11611l2;
        c5787l.f12201l = this.f8772l;
        c5787l.f12199l = this.f8771l;
        if (!zEquals) {
            c5787l.f12197l = new C4911l(new C6205l(c5787l, 2), new C6205l(c5787l, 3), c11611l2);
            c5787l.f12196l = new C0093l(new C6205l(c5787l, 0), new C6205l(c5787l, 1), c11611l2);
        }
        c5787l.f12198l.m1557l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4275l)) {
            return false;
        }
        C4275l c4275l = (C4275l) obj;
        return this.f8773l.equals(c4275l.f8773l) && this.f8772l == c4275l.f8772l && this.f8771l == c4275l.f8771l;
    }

    public final int hashCode() {
        long j = this.f8772l;
        return this.f8771l.hashCode() + ((this.f8773l.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C5787l c5787l = new C5787l();
        c5787l.f12200l = this.f8773l;
        c5787l.f12201l = this.f8772l;
        c5787l.f12199l = this.f8771l;
        C7795l c7795l = new C7795l(5, c5787l);
        C9185l c9185l = AbstractC1782l.yandex;
        C4566l c4566l = new C4566l(null, null, null, c7795l);
        c5787l.m3069l(c4566l);
        c5787l.f12198l = c4566l;
        C11611l c11611l = c5787l.f12200l;
        c5787l.f12197l = new C4911l(new C6205l(c5787l, 2), new C6205l(c5787l, 3), c11611l);
        c5787l.f12196l = new C0093l(new C6205l(c5787l, 0), new C6205l(c5787l, 1), c11611l);
        return c5787l;
    }
}
