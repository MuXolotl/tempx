package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lُؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llُؖؖ;", "Llَّؓ;", "Llٍۣؒ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C3907l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f8041l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f8042l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10306l f8043l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC7283l f8044l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17955l f8045l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2403l f8046l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14745l f8047l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC14447l f8048l;

    public C3907l(C10306l c10306l, InterfaceC14447l interfaceC14447l, InterfaceC14745l interfaceC14745l, C2403l c2403l, EnumC7283l enumC7283l, InterfaceC17955l interfaceC17955l, boolean z, boolean z2) {
        this.f8045l = interfaceC17955l;
        this.f8044l = enumC7283l;
        this.f8041l = z;
        this.f8047l = interfaceC14745l;
        this.f8046l = c2403l;
        this.f8048l = interfaceC14447l;
        this.f8042l = z2;
        this.f8043l = c10306l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C2403l c2403l = this.f8046l;
        ((C9901l) abstractC14971l).m2817l(this.f8043l, this.f8048l, this.f8047l, c2403l, this.f8044l, this.f8045l, this.f8042l, this.f8041l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3907l.class != obj.getClass()) {
            return false;
        }
        C3907l c3907l = (C3907l) obj;
        return AbstractC8576l.yandex(this.f8045l, c3907l.f8045l) && this.f8044l == c3907l.f8044l && this.f8041l == c3907l.f8041l && AbstractC8576l.yandex(this.f8047l, c3907l.f8047l) && AbstractC8576l.yandex(this.f8046l, c3907l.f8046l) && AbstractC8576l.yandex(this.f8048l, c3907l.f8048l) && this.f8042l == c3907l.f8042l && AbstractC8576l.yandex(this.f8043l, c3907l.f8043l);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f8044l.hashCode() + (this.f8045l.hashCode() * 31)) * 31) + (this.f8041l ? 1231 : 1237)) * 31) + 1237) * 31;
        InterfaceC14745l interfaceC14745l = this.f8047l;
        int iHashCode2 = (iHashCode + (interfaceC14745l != null ? interfaceC14745l.hashCode() : 0)) * 31;
        C2403l c2403l = this.f8046l;
        int iHashCode3 = (iHashCode2 + (c2403l != null ? c2403l.hashCode() : 0)) * 31;
        InterfaceC14447l interfaceC14447l = this.f8048l;
        int iHashCode4 = (((iHashCode3 + (interfaceC14447l != null ? interfaceC14447l.hashCode() : 0)) * 31) + (this.f8042l ? 1231 : 1237)) * 31;
        C10306l c10306l = this.f8043l;
        return iHashCode4 + (c10306l != null ? c10306l.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C9901l c9901l = new C9901l();
        c9901l.f20139l = this.f8045l;
        c9901l.f20144l = this.f8044l;
        c9901l.f20138l = this.f8041l;
        c9901l.f20136l = this.f8047l;
        c9901l.f20135l = this.f8046l;
        c9901l.f20134l = this.f8048l;
        c9901l.f20145l = this.f8042l;
        c9901l.f20137l = this.f8043l;
        return c9901l;
    }
}
