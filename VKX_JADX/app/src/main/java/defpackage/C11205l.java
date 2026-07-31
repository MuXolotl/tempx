package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lُِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llُِٞ;", "Llَّؓ;", "Llًٔ٘;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C11205l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f22560l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f22561l;

    public C11205l(int i, float f) {
        this.f22561l = i;
        this.f22560l = f;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C8004l c8004l = (C8004l) abstractC14971l;
        c8004l.f16684l = this.f22561l;
        c8004l.f16683l = this.f22560l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11205l)) {
            return false;
        }
        C11205l c11205l = (C11205l) obj;
        return this.f22561l == c11205l.f22561l && this.f22560l == c11205l.f22560l;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22560l) + (AbstractC5020l.inmobi(this.f22561l) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C8004l c8004l = new C8004l();
        c8004l.f16684l = this.f22561l;
        c8004l.f16683l = this.f22560l;
        return c8004l;
    }
}
