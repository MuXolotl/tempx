package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؚٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؚٗۘ;", "Llَّؓ;", "Llؑٚٔ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C7305l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC17807l f15150l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f15151l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f15152l;

    public C7305l(C2403l c2403l, boolean z, InterfaceC17807l interfaceC17807l) {
        this.f15152l = c2403l;
        this.f15151l = z;
        this.f15150l = interfaceC17807l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C0412l c0412l = (C0412l) abstractC14971l;
        c0412l.f1532l = this.f15152l;
        boolean z = c0412l.f1529l;
        boolean z2 = this.f15151l;
        if (z != z2) {
            AbstractC4047l.isPro(c0412l);
        }
        c0412l.f1529l = z2;
        c0412l.f1531l = this.f15150l;
        if (c0412l.f1528l == null && !Float.isNaN(c0412l.f1526l)) {
            c0412l.f1528l = AbstractC6791l.yandex(c0412l.f1526l);
        }
        if (c0412l.f1530l != null || Float.isNaN(c0412l.f1527l)) {
            return;
        }
        c0412l.f1530l = AbstractC6791l.yandex(c0412l.f1527l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7305l)) {
            return false;
        }
        C7305l c7305l = (C7305l) obj;
        return AbstractC8576l.yandex(this.f15152l, c7305l.f15152l) && this.f15151l == c7305l.f15151l && AbstractC8576l.yandex(this.f15150l, c7305l.f15150l);
    }

    public final int hashCode() {
        return this.f15150l.hashCode() + (((this.f15152l.hashCode() * 31) + (this.f15151l ? 1231 : 1237)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C0412l c0412l = new C0412l();
        c0412l.f1532l = this.f15152l;
        c0412l.f1529l = this.f15151l;
        c0412l.f1531l = this.f15150l;
        c0412l.f1527l = Float.NaN;
        c0412l.f1526l = Float.NaN;
        return c0412l;
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f15152l + ", checked=" + this.f15151l + ", animationSpec=" + this.f15150l + ")";
    }
}
