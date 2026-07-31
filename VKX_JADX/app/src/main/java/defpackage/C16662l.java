package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖ۟ؒ;", "Llَّؓ;", "Llُِۥ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C16662l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f32665l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f32666l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f32667l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f32668l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f32669l;

    public /* synthetic */ C16662l(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C10990l c10990l = (C10990l) abstractC14971l;
        c10990l.f22140l = this.f32667l;
        c10990l.f22137l = this.f32666l;
        c10990l.f22139l = this.f32665l;
        c10990l.f22141l = this.f32669l;
        c10990l.f22138l = this.f32668l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16662l)) {
            return false;
        }
        C16662l c16662l = (C16662l) obj;
        return C14467l.loadAd(this.f32667l, c16662l.f32667l) && C14467l.loadAd(this.f32666l, c16662l.f32666l) && C14467l.loadAd(this.f32665l, c16662l.f32665l) && C14467l.loadAd(this.f32669l, c16662l.f32669l) && this.f32668l == c16662l.f32668l;
    }

    public final int hashCode() {
        return AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.f32667l) * 31, this.f32666l, 31), this.f32665l, 31), this.f32669l, 31) + (this.f32668l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C10990l c10990l = new C10990l();
        c10990l.f22140l = this.f32667l;
        c10990l.f22137l = this.f32666l;
        c10990l.f22139l = this.f32665l;
        c10990l.f22141l = this.f32669l;
        c10990l.f22138l = this.f32668l;
        return c10990l;
    }

    public C16662l(float f, float f2, float f3, float f4, boolean z) {
        this.f32667l = f;
        this.f32666l = f2;
        this.f32665l = f3;
        this.f32669l = f4;
        this.f32668l = z;
    }
}
