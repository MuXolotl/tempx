package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ۥۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll٘ۥۜ;", "Llَّؓ;", "Llِٗۗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C18342l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC7283l f35853l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC14371l f35854l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function0 f35855l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f35856l;

    public C18342l(Function0 function0, InterfaceC14371l interfaceC14371l, EnumC7283l enumC7283l, boolean z) {
        this.f35855l = function0;
        this.f35854l = interfaceC14371l;
        this.f35853l = enumC7283l;
        this.f35856l = z;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C17338l c17338l = (C17338l) abstractC14971l;
        c17338l.f33675l = this.f35855l;
        c17338l.f33672l = this.f35854l;
        EnumC7283l enumC7283l = c17338l.f33674l;
        EnumC7283l enumC7283l2 = this.f35853l;
        if (enumC7283l != enumC7283l2) {
            c17338l.f33674l = enumC7283l2;
            AbstractC18037l.purchase(c17338l);
        }
        boolean z = c17338l.f33676l;
        boolean z2 = this.f35856l;
        if (z == z2) {
            return;
        }
        c17338l.f33676l = z2;
        c17338l.m4320l();
        AbstractC18037l.purchase(c17338l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18342l)) {
            return false;
        }
        C18342l c18342l = (C18342l) obj;
        return this.f35855l == c18342l.f35855l && AbstractC8576l.yandex(this.f35854l, c18342l.f35854l) && this.f35853l == c18342l.f35853l && this.f35856l == c18342l.f35856l;
    }

    public final int hashCode() {
        return ((((this.f35853l.hashCode() + ((this.f35854l.hashCode() + (this.f35855l.hashCode() * 31)) * 31)) * 31) + (this.f35856l ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C17338l(this.f35855l, this.f35854l, this.f35853l, this.f35856l);
    }
}
