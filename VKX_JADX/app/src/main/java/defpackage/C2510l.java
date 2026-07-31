package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٍِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍِؔ;", "Llَّؓ;", "Llؑٛٛ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C2510l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC5428l f5308l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6257l f5309l;

    public C2510l(C6257l c6257l, InterfaceC5428l interfaceC5428l) {
        this.f5309l = c6257l;
        this.f5308l = interfaceC5428l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C0432l c0432l = (C0432l) abstractC14971l;
        c0432l.f1584l = this.f5308l;
        c0432l.m537l(false);
        C6257l c6257l = this.f5309l;
        if (c6257l == null) {
            c6257l = new C6257l(null);
        }
        if (AbstractC8576l.yandex(c0432l.f1577l, c6257l)) {
            return;
        }
        c0432l.f1577l = c6257l;
        c0432l.m537l(false);
        C14526l c14526l = c0432l.f1574l;
        if (c14526l != null) {
            AbstractC4047l.subs(c14526l);
        } else {
            C8339l.smaato("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2510l)) {
            return false;
        }
        C2510l c2510l = (C2510l) obj;
        return AbstractC8576l.yandex(c2510l.f5308l, this.f5308l) && AbstractC8576l.yandex(c2510l.f5309l, this.f5309l);
    }

    public final int hashCode() {
        return this.f5308l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C0432l(this.f5309l, this.f5308l);
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.f5309l + ", style=" + this.f5308l + ")";
    }
}
