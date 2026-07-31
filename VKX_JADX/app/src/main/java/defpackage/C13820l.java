package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lْٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْٟۧ;", "Llَّؓ;", "Llؗٔۙ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C13820l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0086l f26950l;

    public C13820l(C0086l c0086l) {
        this.f26950l = c0086l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C4885l) abstractC14971l).f9957l = this.f26950l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C13820l c13820l = obj instanceof C13820l ? (C13820l) obj : null;
        if (c13820l == null) {
            return false;
        }
        return this.f26950l.equals(c13820l.f26950l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f26950l.yandex);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C4885l c4885l = new C4885l();
        c4885l.f9957l = this.f26950l;
        return c4885l;
    }
}
