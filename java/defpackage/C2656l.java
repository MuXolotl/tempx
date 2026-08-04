package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖؔۖ;", "Llَّؓ;", "Llۣٖؒ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C2656l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f5758l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f5759l;

    public C2656l(float f, float f2, C1306l c1306l) {
        this.f5759l = f;
        this.f5758l = f2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C1432l c1432l = (C1432l) abstractC14971l;
        float f = c1432l.f3617l;
        float f2 = this.f5759l;
        boolean zLoadAd = C14467l.loadAd(f, f2);
        float f3 = this.f5758l;
        if (!zLoadAd || !C14467l.loadAd(c1432l.f3615l, f3) || !c1432l.f3616l) {
            AbstractC5573l.metrica(c1432l).m1387new(false);
        }
        c1432l.f3617l = f2;
        c1432l.f3615l = f3;
        c1432l.f3616l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2656l c2656l = obj instanceof C2656l ? (C2656l) obj : null;
        return c2656l != null && C14467l.loadAd(this.f5759l, c2656l.f5759l) && C14467l.loadAd(this.f5758l, c2656l.f5758l);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f5758l) + (Float.floatToIntBits(this.f5759l) * 31)) * 31) + 1231;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C1432l c1432l = new C1432l();
        c1432l.f3617l = this.f5759l;
        c1432l.f3615l = this.f5758l;
        c1432l.f3616l = true;
        return c1432l;
    }

    public final String toString() {
        return AbstractC14814l.ads("OffsetModifierElement(x=", C14467l.crashlytics(this.f5759l), ", y=", C14467l.crashlytics(this.f5758l), ", rtlAware=true)");
    }
}
