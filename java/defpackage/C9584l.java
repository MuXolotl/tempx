package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٍٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍٕۢ;", "Llَّؓ;", "Llٕٞۘ;", "tv-material"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C9584l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f19525l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f19526l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC6347l f19527l;

    public C9584l(InterfaceC6347l interfaceC6347l, float f, long j) {
        this.f19527l = interfaceC6347l;
        this.f19526l = f;
        this.f19525l = j;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15841l c15841l = (C15841l) abstractC14971l;
        c15841l.f31095l = this.f19527l;
        c15841l.f31092l = this.f19526l;
        c15841l.f31094l = this.f19525l;
        if (c15841l.f31096l == null) {
            C4480l c4480lYandex = AbstractC4311l.yandex();
            c15841l.f31096l = c4480lYandex;
            c15841l.f31093l = c4480lYandex.yandex;
        }
        c15841l.m4122l();
    }

    public final boolean equals(Object obj) {
        C9584l c9584l = obj instanceof C9584l ? (C9584l) obj : null;
        return c9584l != null && AbstractC8576l.yandex(this.f19527l, c9584l.f19527l) && this.f19526l == c9584l.f19526l && C9735l.crashlytics(this.f19525l, c9584l.f19525l);
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub(this.f19527l.hashCode() * 31, this.f19526l, 31);
        int i = C9735l.smaato;
        return C10882l.yandex(this.f19525l) + iMopub;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C15841l c15841l = new C15841l();
        c15841l.f31095l = this.f19527l;
        c15841l.f31092l = this.f19526l;
        c15841l.f31094l = this.f19525l;
        return c15841l;
    }
}
