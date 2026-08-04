package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗٚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٗٚۧ;", "Llَّؓ;", "Llؙؓؖ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C17236l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f33447l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Function0 f33448l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC2186l f33449l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f33450l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Function0 f33451l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f33452l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f33453l;

    public C17236l(InterfaceC2186l interfaceC2186l, C2403l c2403l, String str, Function0 function0, Function0 function1, boolean z, boolean z2) {
        this.f33450l = c2403l;
        this.f33449l = interfaceC2186l;
        this.f33447l = z;
        this.f33452l = z2;
        this.f33451l = function0;
        this.f33453l = str;
        this.f33448l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        boolean z;
        C6206l c6206l = (C6206l) abstractC14971l;
        c6206l.f13100l = true;
        String str = c6206l.f13115l;
        String str2 = this.f33453l;
        if (!AbstractC8576l.yandex(str, str2)) {
            c6206l.f13115l = str2;
            AbstractC18037l.purchase(c6206l);
        }
        boolean z2 = c6206l.f13106l == null;
        Function0 function0 = this.f33448l;
        if (z2 != (function0 == null)) {
            c6206l.m3871l();
            AbstractC18037l.purchase(c6206l);
            z = true;
        } else {
            z = false;
        }
        c6206l.f13106l = function0;
        boolean z3 = c6206l.f28514l;
        boolean z4 = this.f33452l;
        boolean z5 = z3 != z4 ? true : z;
        c6206l.m3865l(this.f33450l, this.f33449l, this.f33447l, z4, null, null, this.f33451l);
        if (z5) {
            c6206l.m1980l(false);
            c6206l.m1980l(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17236l.class != obj.getClass()) {
            return false;
        }
        C17236l c17236l = (C17236l) obj;
        return AbstractC8576l.yandex(this.f33450l, c17236l.f33450l) && AbstractC8576l.yandex(this.f33449l, c17236l.f33449l) && this.f33447l == c17236l.f33447l && this.f33452l == c17236l.f33452l && this.f33451l == c17236l.f33451l && AbstractC8576l.yandex(this.f33453l, c17236l.f33453l) && this.f33448l == c17236l.f33448l;
    }

    public final int hashCode() {
        C2403l c2403l = this.f33450l;
        int iHashCode = (c2403l != null ? c2403l.hashCode() : 0) * 31;
        InterfaceC2186l interfaceC2186l = this.f33449l;
        int iHashCode2 = (this.f33451l.hashCode() + ((((((iHashCode + (interfaceC2186l != null ? interfaceC2186l.hashCode() : 0)) * 31) + (this.f33447l ? 1231 : 1237)) * 31) + (this.f33452l ? 1231 : 1237)) * 29791)) * 31;
        String str = this.f33453l;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Function0 function0 = this.f33448l;
        return ((iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 961) + 1231;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C6206l(this.f33449l, this.f33450l, this.f33453l, this.f33451l, this.f33448l, this.f33447l, this.f33452l);
    }
}
