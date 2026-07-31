package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؘؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؘؗؑ;", "Llَّؓ;", "Llَٕؓ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C5460l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f11687l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC9544l f11688l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f11689l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f11690l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f11691l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final EnumC7283l f11692l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16328l f11693l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10312l f11694l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final InterfaceC13515l f11695l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C11194l f11696l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C12217l f11697l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C10715l f11698l;

    public C5460l(boolean z, boolean z2, boolean z3, C10312l c10312l, C16328l c16328l, C12217l c12217l, AbstractC9544l abstractC9544l, boolean z4, C11194l c11194l, EnumC7283l enumC7283l, C10715l c10715l, InterfaceC13515l interfaceC13515l) {
        this.f11691l = z;
        this.f11690l = z2;
        this.f11687l = z3;
        this.f11694l = c10312l;
        this.f11693l = c16328l;
        this.f11697l = c12217l;
        this.f11688l = abstractC9544l;
        this.f11689l = z4;
        this.f11696l = c11194l;
        this.f11692l = enumC7283l;
        this.f11698l = c10715l;
        this.f11695l = interfaceC13515l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        InterfaceC7042l interfaceC7042l;
        C10304l c10304l = (C10304l) abstractC14971l;
        boolean zM2910l = c10304l.m2910l();
        boolean z = c10304l.f20999l;
        C16328l c16328l = c10304l.f20995l;
        C10312l c10312l = c10304l.f20998l;
        C12217l c12217l = c10304l.f20994l;
        C11194l c11194l = c10304l.f20997l;
        boolean z2 = this.f11691l;
        c10304l.f20999l = z2;
        C12217l c12217l2 = this.f11697l;
        c12217l2.subs = z2;
        boolean z3 = this.f11690l;
        c10304l.f21008l = z3;
        C10312l c10312l2 = this.f11694l;
        c10304l.f20998l = c10312l2;
        C16328l c16328l2 = this.f11693l;
        c10304l.f20995l = c16328l2;
        c10304l.f20994l = c12217l2;
        c10304l.f20993l = this.f11688l;
        c10304l.f21009l = this.f11689l;
        C11194l c11194l2 = this.f11696l;
        c10304l.f20997l = c11194l2;
        c10304l.f21002l = this.f11692l;
        C10715l c10715l = this.f11698l;
        c10304l.f21004l = c10715l;
        c10304l.f20992l = this.f11695l;
        c10304l.f21006l.mo1102l(c16328l2, c12217l2, c10312l2, z2 || z3 || this.f11687l);
        C4451l c4451l = c10304l.f20996l;
        c4451l.f9061l.yandex = null;
        c4451l.f9061l = c10715l;
        c10715l.yandex = c4451l;
        c10715l.loadAd = c4451l.f29462l ? 3 : 2;
        if (!c10304l.m2910l()) {
            C7504l c7504l = c10304l.f21003l;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            c10304l.f21003l = null;
            C13404l c13404l = c10304l.f21001l;
            if (c13404l != null && (interfaceC7042l = (InterfaceC7042l) c13404l.loadAd.getAndSet(null)) != null) {
                interfaceC7042l.ads(null);
            }
        } else if (!z || !AbstractC8576l.yandex(c16328l, c16328l2) || !zM2910l) {
            c10304l.m2908l();
        }
        if (AbstractC8576l.yandex(c16328l, c16328l2) && AbstractC8576l.yandex(c10312l, c10312l2) && AbstractC8576l.yandex(c12217l, c12217l2) && AbstractC8576l.yandex(c11194l, c11194l2)) {
            return;
        }
        AbstractC4047l.isPro(c10304l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5460l) {
            C5460l c5460l = (C5460l) obj;
            if (this.f11691l == c5460l.f11691l && this.f11690l == c5460l.f11690l && this.f11687l == c5460l.f11687l && AbstractC8576l.yandex(this.f11694l, c5460l.f11694l) && AbstractC8576l.yandex(this.f11693l, c5460l.f11693l) && this.f11697l == c5460l.f11697l && AbstractC8576l.yandex(this.f11688l, c5460l.f11688l) && this.f11689l == c5460l.f11689l && AbstractC8576l.yandex(this.f11696l, c5460l.f11696l) && this.f11692l == c5460l.f11692l && AbstractC8576l.yandex(this.f11698l, c5460l.f11698l) && AbstractC8576l.yandex(this.f11695l, c5460l.f11695l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11698l.hashCode() + ((this.f11692l.hashCode() + ((this.f11696l.hashCode() + ((((this.f11688l.hashCode() + ((this.f11697l.hashCode() + ((this.f11693l.hashCode() + ((this.f11694l.hashCode() + ((((((this.f11691l ? 1231 : 1237) * 31) + (this.f11690l ? 1231 : 1237)) * 31) + (this.f11687l ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f11689l ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        InterfaceC13515l interfaceC13515l = this.f11695l;
        return iHashCode + (interfaceC13515l == null ? 0 : interfaceC13515l.hashCode());
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C10304l(this.f11691l, this.f11690l, this.f11687l, this.f11694l, this.f11693l, this.f11697l, this.f11688l, this.f11689l, this.f11696l, this.f11692l, this.f11698l, this.f11695l);
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f11691l + ", isDragHovered=" + this.f11690l + ", isTouchDragInProgress=" + this.f11687l + ", textLayoutState=" + this.f11694l + ", textFieldState=" + this.f11693l + ", textFieldSelectionState=" + this.f11697l + ", cursorBrush=" + this.f11688l + ", writeable=" + this.f11689l + ", scrollState=" + this.f11696l + ", orientation=" + this.f11692l + ", toolbarRequester=" + this.f11698l + ", platformSelectionBehaviors=" + this.f11695l + ")";
    }
}
