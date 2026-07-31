package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٗ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٗ٘ٔ;", "Llَّؓ;", "Llؚْؔ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C17197l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f33373l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C4875l f33374l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f33375l;

    public C17197l(int i, C4875l c4875l, float f) {
        this.f33375l = i;
        this.f33374l = c4875l;
        this.f33373l = f;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C2586l c2586l = (C2586l) abstractC14971l;
        c2586l.f5631l.setValue(this.f33374l);
        c2586l.f5641l.setValue(new C18649l());
        int i = c2586l.f5639l;
        int i2 = this.f33375l;
        float f = this.f33373l;
        if (i == i2 && C14467l.loadAd(c2586l.f5634l, f)) {
            return;
        }
        c2586l.f5639l = i2;
        c2586l.f5634l = f;
        c2586l.m1230l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17197l)) {
            return false;
        }
        C17197l c17197l = (C17197l) obj;
        return this.f33375l == c17197l.f33375l && this.f33374l.equals(c17197l.f33374l) && C14467l.loadAd(this.f33373l, c17197l.f33373l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f33373l) + ((this.f33374l.hashCode() + (((-2147476239) + this.f33375l) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C2586l(this.f33375l, this.f33374l, this.f33373l);
    }

    public final String toString() {
        String strCrashlytics = C14467l.crashlytics(this.f33373l);
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=2147483647, animationMode=Immediately, delayMillis=1200, initialDelayMillis=");
        sb.append(this.f33375l);
        sb.append(", spacing=");
        sb.append(this.f33374l);
        sb.append(", velocity=");
        return AbstractC0653l.ads(sb, strCrashlytics, ")");
    }
}
