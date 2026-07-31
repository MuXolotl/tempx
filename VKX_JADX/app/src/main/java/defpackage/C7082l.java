package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؘُؚ;", "Llَّؓ;", "Llؙٕؕ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C7082l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f14842l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f14843l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f14844l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Function1 f14845l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f14846l;

    public C7082l(float f, float f2, float f3, float f4, Function1 function1) {
        this.f14844l = f;
        this.f14843l = f2;
        this.f14842l = f3;
        this.f14846l = f4;
        this.f14845l = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC10440l.yandex("Padding must be non-negative");
        }
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15516l c15516l = (C15516l) abstractC14971l;
        c15516l.f30327l = this.f14844l;
        c15516l.f30324l = this.f14843l;
        c15516l.f30326l = this.f14842l;
        c15516l.f30328l = this.f14846l;
        c15516l.f30325l = true;
    }

    public final boolean equals(Object obj) {
        C7082l c7082l = obj instanceof C7082l ? (C7082l) obj : null;
        return c7082l != null && C14467l.loadAd(this.f14844l, c7082l.f14844l) && C14467l.loadAd(this.f14843l, c7082l.f14843l) && C14467l.loadAd(this.f14842l, c7082l.f14842l) && C14467l.loadAd(this.f14846l, c7082l.f14846l);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f14846l) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.f14844l) * 31, this.f14843l, 31), this.f14842l, 31)) * 31) + 1231;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C15516l c15516l = new C15516l();
        c15516l.f30327l = this.f14844l;
        c15516l.f30324l = this.f14843l;
        c15516l.f30326l = this.f14842l;
        c15516l.f30328l = this.f14846l;
        c15516l.f30325l = true;
        return c15516l;
    }
}
