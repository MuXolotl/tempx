package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٌُۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌُۙ;", "Llَّؓ;", "Llؚۣؔ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C9016l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f18576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC9544l f18577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f18578l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC6347l f18579l;

    public C9016l(long j, AbstractC9544l abstractC9544l, InterfaceC6347l interfaceC6347l, int i) {
        j = (i & 1) != 0 ? C9735l.firebase : j;
        abstractC9544l = (i & 2) != 0 ? null : abstractC9544l;
        this.f18578l = j;
        this.f18577l = abstractC9544l;
        this.f18576l = 1.0f;
        this.f18579l = interfaceC6347l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C7600l c7600l = (C7600l) abstractC14971l;
        c7600l.f15644l = this.f18578l;
        c7600l.f15641l = this.f18577l;
        c7600l.f15643l = this.f18576l;
        InterfaceC6347l interfaceC6347l = c7600l.f15645l;
        InterfaceC6347l interfaceC6347l2 = this.f18579l;
        if (!AbstractC8576l.yandex(interfaceC6347l, interfaceC6347l2)) {
            c7600l.f15645l = interfaceC6347l2;
            AbstractC18037l.purchase(c7600l);
        }
        AbstractC2697l.firebase(c7600l);
    }

    public final boolean equals(Object obj) {
        C9016l c9016l = obj instanceof C9016l ? (C9016l) obj : null;
        return c9016l != null && C9735l.crashlytics(this.f18578l, c9016l.f18578l) && AbstractC8576l.yandex(this.f18577l, c9016l.f18577l) && this.f18576l == c9016l.f18576l && AbstractC8576l.yandex(this.f18579l, c9016l.f18579l);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        int iYandex = C10882l.yandex(this.f18578l) * 31;
        AbstractC9544l abstractC9544l = this.f18577l;
        return this.f18579l.hashCode() + AbstractC9029l.mopub((iYandex + (abstractC9544l != null ? abstractC9544l.hashCode() : 0)) * 31, this.f18576l, 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C7600l c7600l = new C7600l();
        c7600l.f15644l = this.f18578l;
        c7600l.f15641l = this.f18577l;
        c7600l.f15643l = this.f18576l;
        c7600l.f15645l = this.f18579l;
        c7600l.f15642l = 9205357640488583168L;
        return c7600l;
    }
}
