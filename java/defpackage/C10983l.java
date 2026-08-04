package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lُِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llُِٔ;", "Llَّؓ;", "Llٍٙۧ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C10983l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f22128l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC7283l f22129l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17955l f22130l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2403l f22131l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f22132l;

    public C10983l(InterfaceC17955l interfaceC17955l, EnumC7283l enumC7283l, boolean z, boolean z2, C2403l c2403l) {
        this.f22130l = interfaceC17955l;
        this.f22129l = enumC7283l;
        this.f22128l = z;
        this.f22132l = z2;
        this.f22131l = c2403l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C9649l) abstractC14971l).m2704l(null, null, null, this.f22131l, this.f22129l, this.f22130l, this.f22128l, this.f22132l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10983l)) {
            return false;
        }
        C10983l c10983l = (C10983l) obj;
        return AbstractC8576l.yandex(this.f22130l, c10983l.f22130l) && this.f22129l == c10983l.f22129l && this.f22128l == c10983l.f22128l && this.f22132l == c10983l.f22132l && AbstractC8576l.yandex(this.f22131l, c10983l.f22131l);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f22129l.hashCode() + (this.f22130l.hashCode() * 31)) * 961) + (this.f22128l ? 1231 : 1237)) * 31) + (this.f22132l ? 1231 : 1237)) * 961;
        C2403l c2403l = this.f22131l;
        return (iHashCode + (c2403l != null ? c2403l.hashCode() : 0)) * 31;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C9649l(null, null, null, this.f22131l, this.f22129l, this.f22130l, this.f22128l, this.f22132l);
    }
}
