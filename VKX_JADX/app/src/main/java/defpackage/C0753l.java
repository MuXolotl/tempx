package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lْؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْؒؐ;", "Llَّؓ;", "Llٍؔؒ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C0753l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Ctransient f2270l;

    public C0753l(Ctransient ctransient) {
        this.f2270l = ctransient;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C2507l c2507l = (C2507l) abstractC14971l;
        c2507l.f5307l = this.f2270l;
        AbstractC18037l.purchase(c2507l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0753l) {
            return this.f2270l == ((C0753l) obj).f2270l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2270l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C2507l c2507l = new C2507l();
        c2507l.f5307l = this.f2270l;
        return c2507l;
    }
}
