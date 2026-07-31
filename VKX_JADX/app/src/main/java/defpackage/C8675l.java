package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٌٍؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌٍؗ;", "Llَّؓ;", "Llٖٟ٘;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C8675l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f17865l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f17866l;

    public C8675l(float f, float f2) {
        this.f17866l = f;
        this.f17865l = f2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C16547l c16547l = (C16547l) abstractC14971l;
        c16547l.f32494l = this.f17866l;
        c16547l.f32493l = this.f17865l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8675l)) {
            return false;
        }
        C8675l c8675l = (C8675l) obj;
        return C14467l.loadAd(this.f17866l, c8675l.f17866l) && C14467l.loadAd(this.f17865l, c8675l.f17865l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17865l) + (Float.floatToIntBits(this.f17866l) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C16547l c16547l = new C16547l();
        c16547l.f32494l = this.f17866l;
        c16547l.f32493l = this.f17865l;
        return c16547l;
    }
}
