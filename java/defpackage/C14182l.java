package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٍٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍٖٓ;", "Llَّؓ;", "Llٍ۟ٛ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C14182l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6523l f27774l;

    public C14182l(C6523l c6523l) {
        this.f27774l = c6523l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C9847l) abstractC14971l).f20044l = this.f27774l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14182l) && AbstractC8576l.yandex(this.f27774l, ((C14182l) obj).f27774l);
    }

    public final int hashCode() {
        return this.f27774l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C9847l(this.f27774l);
    }

    public final String toString() {
        return "FocusRestorerElement(fallback=" + this.f27774l + ")";
    }
}
