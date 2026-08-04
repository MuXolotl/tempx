package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؔؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؔؗۘ;", "Llَّؓ;", "Llؙؓۨ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C2424l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13315l f5193l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13315l f5194l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13315l f5195l;

    public C2424l(C13315l c13315l, C13315l c13315l2, C13315l c13315l3) {
        this.f5195l = c13315l;
        this.f5194l = c13315l2;
        this.f5193l = c13315l3;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C6223l c6223l = (C6223l) abstractC14971l;
        c6223l.f13154l = this.f5195l;
        c6223l.f13152l = this.f5194l;
        c6223l.f13153l = this.f5193l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2424l)) {
            return false;
        }
        C2424l c2424l = (C2424l) obj;
        return this.f5195l.equals(c2424l.f5195l) && this.f5194l.equals(c2424l.f5194l) && this.f5193l.equals(c2424l.f5193l);
    }

    public final int hashCode() {
        return this.f5193l.hashCode() + ((this.f5194l.hashCode() + (this.f5195l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C6223l c6223l = new C6223l();
        c6223l.f13154l = this.f5195l;
        c6223l.f13152l = this.f5194l;
        c6223l.f13153l = this.f5193l;
        return c6223l;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f5195l + ", placementSpec=" + this.f5194l + ", fadeOutSpec=" + this.f5193l + ")";
    }
}
