package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؗؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؗؖۜ;", "Llَّؓ;", "Llؚٜؒ;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class C4671l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9503l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f9504l;

    public C4671l(int i, int i2) {
        this.f9504l = i;
        this.f9503l = i2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C1181l c1181l = (C1181l) abstractC14971l;
        c1181l.f3175l = this.f9504l;
        c1181l.f3174l = this.f9503l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4671l)) {
            return false;
        }
        C4671l c4671l = (C4671l) obj;
        return this.f9504l == c4671l.f9504l && this.f9503l == c4671l.f9503l;
    }

    public final int hashCode() {
        return (this.f9504l * 31) + this.f9503l;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C1181l c1181l = new C1181l();
        c1181l.f3175l = this.f9504l;
        c1181l.f3174l = this.f9503l;
        return c1181l;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.f9504l, this.f9503l, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
