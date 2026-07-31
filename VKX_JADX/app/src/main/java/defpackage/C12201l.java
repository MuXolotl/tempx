package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lِۢۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llِۢۨ;", "Llَّؓ;", "Llؗۥۣ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C12201l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12660l f24245l;

    public C12201l(C12660l c12660l) {
        this.f24245l = c12660l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C5280l c5280l = (C5280l) abstractC14971l;
        C12660l c12660l = c5280l.f11389l;
        C12660l c12660l2 = this.f24245l;
        if (AbstractC8576l.yandex(c12660l, c12660l2) || !c5280l.f29454l.f29462l) {
            return;
        }
        C12660l c12660l3 = c5280l.f11389l;
        c12660l3.purchase();
        c12660l3.loadAd = null;
        c12660l3.crashlytics = -1;
        c12660l2.isPro = c5280l;
        c5280l.f11389l = c12660l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12201l) && AbstractC8576l.yandex(this.f24245l, ((C12201l) obj).f24245l);
    }

    public final int hashCode() {
        return this.f24245l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C5280l c5280l = new C5280l();
        c5280l.f11389l = this.f24245l;
        return c5280l;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f24245l + ")";
    }
}
