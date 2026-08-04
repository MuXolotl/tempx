package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lّٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llّٔ۠;", "Llَّؓ;", "Llؗۢۧ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C15217l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8864l f29813l;

    public C15217l(C8864l c8864l) {
        this.f29813l = c8864l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C5238l c5238l = (C5238l) abstractC14971l;
        c5238l.f11311l = this.f29813l;
        AbstractC18037l.purchase(c5238l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15217l) {
            return this.f29813l == ((C15217l) obj).f29813l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29813l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C5238l c5238l = new C5238l();
        c5238l.f11311l = this.f29813l;
        return c5238l;
    }
}
