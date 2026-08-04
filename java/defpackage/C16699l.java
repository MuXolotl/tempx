package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖۡۜ;", "Llَّؓ;", "Llؚؗٙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C16699l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f32719l;

    public C16699l(C2403l c2403l) {
        this.f32719l = c2403l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4971l c4971l = (C4971l) abstractC14971l;
        C2403l c2403l = c4971l.f10159l;
        C2403l c2403l2 = this.f32719l;
        if (AbstractC8576l.yandex(c2403l, c2403l2)) {
            return;
        }
        c4971l.m1656l();
        c4971l.f10159l = c2403l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16699l) && AbstractC8576l.yandex(((C16699l) obj).f32719l, this.f32719l);
    }

    public final int hashCode() {
        return this.f32719l.hashCode() * 31;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C4971l c4971l = new C4971l();
        c4971l.f10159l = this.f32719l;
        return c4971l;
    }
}
