package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٍؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌٍؚ;", "Llَّؓ;", "Llٕٛٛ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C9418l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f19267l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f19268l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f19269l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f19270l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7806l f19271l;

    public C9418l(boolean z, Function0 function0, boolean z2, C7806l c7806l, float f) {
        this.f19269l = z;
        this.f19268l = function0;
        this.f19267l = z2;
        this.f19271l = c7806l;
        this.f19270l = f;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15790l c15790l = (C15790l) abstractC14971l;
        c15790l.f31008l = this.f19268l;
        c15790l.f31006l = this.f19267l;
        c15790l.f31004l = this.f19271l;
        c15790l.f31003l = this.f19270l;
        boolean z = c15790l.f31007l;
        boolean z2 = this.f19269l;
        if (z != z2) {
            c15790l.f31007l = z2;
            AbstractC10999l.mopub(c15790l.m3914l(), null, 0, new C14618l(c15790l, null, 2), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9418l)) {
            return false;
        }
        C9418l c9418l = (C9418l) obj;
        return this.f19269l == c9418l.f19269l && this.f19267l == c9418l.f19267l && this.f19268l == c9418l.f19268l && AbstractC8576l.yandex(this.f19271l, c9418l.f19271l) && C14467l.loadAd(this.f19270l, c9418l.f19270l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19270l) + ((this.f19271l.hashCode() + ((this.f19268l.hashCode() + ((((this.f19269l ? 1231 : 1237) * 31) + (this.f19267l ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C15790l(this.f19269l, this.f19268l, this.f19267l, this.f19271l, this.f19270l);
    }
}
