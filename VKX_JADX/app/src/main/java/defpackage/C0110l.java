package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖؑؖ;", "Llَّؓ;", "Llۣؖۙ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0110l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17110l f1014l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12499l f1015l;

    public C0110l(InterfaceC12499l interfaceC12499l, C17110l c17110l) {
        this.f1015l = interfaceC12499l;
        this.f1014l = c17110l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4369l c4369l = (C4369l) abstractC14971l;
        c4369l.f8900l = this.f1015l;
        C17110l c17110l = c4369l.f8898l;
        if (c17110l.yandex == c4369l) {
            c17110l.yandex = null;
        }
        C17110l c17110l2 = this.f1014l;
        if (c17110l2 == null) {
            c4369l.f8898l = new C17110l();
        } else if (c17110l2 != c17110l) {
            c4369l.f8898l = c17110l2;
        }
        if (c4369l.f29462l) {
            C17110l c17110l3 = c4369l.f8898l;
            c17110l3.yandex = c4369l;
            c17110l3.loadAd = null;
            c4369l.f8899l = null;
            c17110l3.crashlytics = new C11029l(13, c4369l);
            c17110l3.amazon = c4369l.m3914l();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0110l)) {
            return false;
        }
        C0110l c0110l = (C0110l) obj;
        return AbstractC8576l.yandex(c0110l.f1015l, this.f1015l) && AbstractC8576l.yandex(c0110l.f1014l, this.f1014l);
    }

    public final int hashCode() {
        int iHashCode = this.f1015l.hashCode() * 31;
        C17110l c17110l = this.f1014l;
        return iHashCode + (c17110l != null ? c17110l.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C4369l(this.f1015l, this.f1014l);
    }
}
