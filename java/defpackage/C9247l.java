package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٍؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍؑؓ;", "Llَّؓ;", "Llِؓؗ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C9247l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f19015l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f19016l;

    public C9247l(float f, boolean z) {
        this.f19016l = f;
        this.f19015l = z;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C11575l c11575l = (C11575l) abstractC14971l;
        c11575l.f23259l = this.f19016l;
        c11575l.f23258l = this.f19015l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9247l c9247l = obj instanceof C9247l ? (C9247l) obj : null;
        return c9247l != null && this.f19016l == c9247l.f19016l && this.f19015l == c9247l.f19015l;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f19016l) * 31) + (this.f19015l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C11575l c11575l = new C11575l();
        c11575l.f23259l = this.f19016l;
        c11575l.f23258l = this.f19015l;
        return c11575l;
    }
}
