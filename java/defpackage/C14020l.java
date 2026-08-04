package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lًٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llًٓۚ;", "Llَّؓ;", "Llًؘؖ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C14020l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15089l f27327l;

    public C14020l(C15089l c15089l) {
        this.f27327l = c15089l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C5531l) abstractC14971l).f11802l = this.f27327l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C14020l c14020l = obj instanceof C14020l ? (C14020l) obj : null;
        if (c14020l == null) {
            return false;
        }
        return this.f27327l.equals(c14020l.f27327l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f27327l.yandex);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C5531l c5531l = new C5531l();
        c5531l.f11802l = this.f27327l;
        return c5531l;
    }
}
