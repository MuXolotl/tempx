package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؗؐۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؗؐۡ;", "Llَّؓ;", "Llؖٛۖ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C4577l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12217l f9278l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC11381l f9279l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f9280l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10312l f9281l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16328l f9282l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f9283l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f9284l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC13142l f9285l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C2403l f9286l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3790l f9287l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC5995l f9288l;

    public C4577l(C16328l c16328l, C10312l c10312l, C12217l c12217l, InterfaceC13142l interfaceC13142l, boolean z, C3790l c3790l, InterfaceC11381l interfaceC11381l, boolean z2, C2403l c2403l, boolean z3, InterfaceC5995l interfaceC5995l) {
        this.f9282l = c16328l;
        this.f9281l = c10312l;
        this.f9278l = c12217l;
        this.f9285l = interfaceC13142l;
        this.f9284l = z;
        this.f9287l = c3790l;
        this.f9279l = interfaceC11381l;
        this.f9280l = z2;
        this.f9286l = c2403l;
        this.f9283l = z3;
        this.f9288l = interfaceC5995l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C12044l c12044l;
        C7504l c7504l;
        C4240l c4240l = (C4240l) abstractC14971l;
        C4566l c4566l = c4240l.f8687l;
        C12044l c12044l2 = c4240l.f8684l;
        boolean z = c4240l.f8676l;
        C16328l c16328l = c4240l.f8682l;
        C3790l c3790l = c4240l.f8675l;
        C12217l c12217l = c4240l.f8681l;
        C2403l c2403l = c4240l.f8685l;
        boolean z2 = c4240l.f8688l;
        InterfaceC5995l interfaceC5995l = c4240l.f8673l;
        C16328l c16328l2 = this.f9282l;
        c4240l.f8682l = c16328l2;
        c4240l.f8693l = this.f9281l;
        C12217l c12217l2 = this.f9278l;
        c4240l.f8681l = c12217l2;
        c4240l.f8677l = this.f9285l;
        boolean z3 = this.f9284l;
        c4240l.f8676l = z3;
        C3790l c3790l2 = this.f9287l;
        c4240l.f8675l = c3790l2;
        c4240l.f8694l = this.f9279l;
        c4240l.f8680l = this.f9280l;
        C2403l c2403l2 = this.f9286l;
        c4240l.f8685l = c2403l2;
        boolean z4 = this.f9283l;
        c4240l.f8688l = z4;
        InterfaceC5995l interfaceC5995l2 = this.f9288l;
        c4240l.f8673l = interfaceC5995l2;
        if (z3 != z || !AbstractC8576l.yandex(c16328l2, c16328l) || !c3790l2.equals(c3790l) || !AbstractC8576l.yandex(interfaceC5995l2, interfaceC5995l)) {
            if (z3 && (c4240l.m1511l() || c4240l.f8689l != null)) {
                c4240l.m1510l(false);
            } else if (!z3) {
                c4240l.m1508l();
            }
        }
        if (z3 != z || z3 != z || c3790l2.loadAd() != c3790l.loadAd() || z4 != z2) {
            AbstractC18037l.purchase(c4240l);
        }
        if (c12217l2 != c12217l) {
            c4566l.m1557l();
            if (c4240l.f29462l) {
                c12217l2.vip = c4240l.f8678l;
                if (c4240l.m1511l() && (c7504l = c4240l.f8672l) != null) {
                    c7504l.ads(null);
                    c4240l.f8672l = AbstractC10999l.mopub(c4240l.m3914l(), null, 0, new C17773l(c12217l2, null, 1), 3);
                }
            }
            c12217l2.remoteconfig = new C9495l(c4240l, 2);
        }
        if (AbstractC8576l.yandex(c2403l2, c2403l)) {
            c12044l = c12044l2;
        } else {
            c4566l.m1557l();
            c12044l = c12044l2;
            if (c12044l.f29462l) {
                c12044l.m3354l(c2403l2);
            }
        }
        if (z3 != z) {
            if (!z3) {
                c4240l.m3073l(c12044l);
            } else {
                c4240l.m3069l(c12044l);
                c12044l.m3354l(c2403l2);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4577l) {
            C4577l c4577l = (C4577l) obj;
            if (AbstractC8576l.yandex(this.f9282l, c4577l.f9282l) && AbstractC8576l.yandex(this.f9281l, c4577l.f9281l) && this.f9278l == c4577l.f9278l && AbstractC8576l.yandex(this.f9285l, c4577l.f9285l) && this.f9284l == c4577l.f9284l && this.f9287l.equals(c4577l.f9287l) && AbstractC8576l.yandex(this.f9279l, c4577l.f9279l) && this.f9280l == c4577l.f9280l && AbstractC8576l.yandex(this.f9286l, c4577l.f9286l) && this.f9283l == c4577l.f9283l && AbstractC8576l.yandex(this.f9288l, c4577l.f9288l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9278l.hashCode() + ((this.f9281l.hashCode() + (this.f9282l.hashCode() * 31)) * 31)) * 31;
        InterfaceC13142l interfaceC13142l = this.f9285l;
        int iHashCode2 = (this.f9287l.hashCode() + ((((((iHashCode + (interfaceC13142l == null ? 0 : interfaceC13142l.hashCode())) * 31) + (this.f9284l ? 1231 : 1237)) * 31) + 1237) * 31)) * 31;
        InterfaceC11381l interfaceC11381l = this.f9279l;
        int iHashCode3 = (((this.f9286l.hashCode() + ((((iHashCode2 + (interfaceC11381l == null ? 0 : interfaceC11381l.hashCode())) * 31) + (this.f9280l ? 1231 : 1237)) * 31)) * 31) + (this.f9283l ? 1231 : 1237)) * 31;
        InterfaceC5995l interfaceC5995l = this.f9288l;
        return iHashCode3 + (interfaceC5995l != null ? interfaceC5995l.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C4240l(this.f9282l, this.f9281l, this.f9278l, this.f9285l, this.f9284l, this.f9287l, this.f9279l, this.f9280l, this.f9286l, this.f9283l, this.f9288l);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f9282l + ", textLayoutState=" + this.f9281l + ", textFieldSelectionState=" + this.f9278l + ", filter=" + this.f9285l + ", enabled=" + this.f9284l + ", readOnly=false, keyboardOptions=" + this.f9287l + ", keyboardActionHandler=" + this.f9279l + ", singleLine=" + this.f9280l + ", interactionSource=" + this.f9286l + ", isPassword=" + this.f9283l + ", stylusHandwritingTrigger=" + this.f9288l + ")";
    }
}
