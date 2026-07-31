package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؗؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؗؔۤ;", "Llَّؓ;", "Llؔؒۙ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C4638l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f9433l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f9434l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC12914l f9435l;

    public C4638l(AbstractC12914l abstractC12914l, float f, float f2) {
        this.f9435l = abstractC12914l;
        this.f9434l = f;
        this.f9433l = f2;
        boolean z = true;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC10440l.yandex("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C2340l c2340l = (C2340l) abstractC14971l;
        c2340l.f5093l = this.f9435l;
        c2340l.f5091l = this.f9434l;
        c2340l.f5092l = this.f9433l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4638l c4638l = obj instanceof C4638l ? (C4638l) obj : null;
        return c4638l != null && AbstractC8576l.yandex(this.f9435l, c4638l.f9435l) && C14467l.loadAd(this.f9434l, c4638l.f9434l) && C14467l.loadAd(this.f9433l, c4638l.f9433l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9433l) + AbstractC9029l.mopub(this.f9435l.hashCode() * 31, this.f9434l, 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C2340l c2340l = new C2340l();
        c2340l.f5093l = this.f9435l;
        c2340l.f5091l = this.f9434l;
        c2340l.f5092l = this.f9433l;
        return c2340l;
    }
}
