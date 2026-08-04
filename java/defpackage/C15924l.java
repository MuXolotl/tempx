package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lَٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَٕۚ;", "Llَّؓ;", "Llٌ٘ۗ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C15924l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f31254l;

    public C15924l(float f) {
        this.f31254l = f;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C18133l) abstractC14971l).f35445l = this.f31254l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15924l) && Float.compare(this.f31254l, ((C15924l) obj).f31254l) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f31254l);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C18133l c18133l = new C18133l();
        c18133l.f35445l = this.f31254l;
        return c18133l;
    }

    public final String toString() {
        return AbstractC4582l.loadAd("ZIndexElement(zIndex=", this.f31254l, ")");
    }
}
