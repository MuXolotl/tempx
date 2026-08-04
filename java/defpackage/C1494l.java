package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llِؒۧ;", "Llَّؓ;", "Llؖٗۚ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1494l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC2186l f3737l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2403l f3738l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f3739l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C6402l f3740l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f3741l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function0 f3742l;

    public C1494l(boolean z, C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z2, C6402l c6402l, Function0 function0) {
        this.f3739l = z;
        this.f3738l = c2403l;
        this.f3737l = interfaceC2186l;
        this.f3741l = z2;
        this.f3740l = c6402l;
        this.f3742l = function0;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4177l c4177l = (C4177l) abstractC14971l;
        boolean z = c4177l.f8571l;
        boolean z2 = this.f3739l;
        if (z != z2) {
            c4177l.f8571l = z2;
            AbstractC18037l.purchase(c4177l);
        }
        c4177l.m3865l(this.f3738l, this.f3737l, false, this.f3741l, null, this.f3740l, this.f3742l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1494l.class != obj.getClass()) {
            return false;
        }
        C1494l c1494l = (C1494l) obj;
        return this.f3739l == c1494l.f3739l && AbstractC8576l.yandex(this.f3738l, c1494l.f3738l) && AbstractC8576l.yandex(this.f3737l, c1494l.f3737l) && this.f3741l == c1494l.f3741l && AbstractC8576l.yandex(this.f3740l, c1494l.f3740l) && this.f3742l == c1494l.f3742l;
    }

    public final int hashCode() {
        int i = (this.f3739l ? 1231 : 1237) * 31;
        C2403l c2403l = this.f3738l;
        int iHashCode = (i + (c2403l != null ? c2403l.hashCode() : 0)) * 31;
        InterfaceC2186l interfaceC2186l = this.f3737l;
        int iHashCode2 = (((((iHashCode + (interfaceC2186l != null ? interfaceC2186l.hashCode() : 0)) * 31) + 1237) * 31) + (this.f3741l ? 1231 : 1237)) * 31;
        C6402l c6402l = this.f3740l;
        return this.f3742l.hashCode() + ((iHashCode2 + (c6402l != null ? c6402l.yandex : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C4177l c4177l = new C4177l(this.f3738l, this.f3737l, false, this.f3741l, null, this.f3740l, this.f3742l);
        c4177l.f8571l = this.f3739l;
        return c4177l;
    }
}
