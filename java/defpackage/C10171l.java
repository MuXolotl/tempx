package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًَۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llًَۜ;", "Llَّؓ;", "Llؖٞ٘;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C10171l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC2186l f20700l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2403l f20701l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC13846l f20702l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C6402l f20703l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f20704l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function0 f20705l;

    public C10171l(EnumC13846l enumC13846l, C2403l c2403l, C8372l c8372l, boolean z, C6402l c6402l, Function0 function0) {
        this.f20702l = enumC13846l;
        this.f20701l = c2403l;
        this.f20700l = c8372l;
        this.f20704l = z;
        this.f20703l = c6402l;
        this.f20705l = function0;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4278l c4278l = (C4278l) abstractC14971l;
        EnumC13846l enumC13846l = c4278l.f8774l;
        EnumC13846l enumC13846l2 = this.f20702l;
        if (enumC13846l != enumC13846l2) {
            c4278l.f8774l = enumC13846l2;
            AbstractC18037l.purchase(c4278l);
        }
        c4278l.m3865l(this.f20701l, this.f20700l, false, this.f20704l, null, this.f20703l, this.f20705l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10171l.class != obj.getClass()) {
            return false;
        }
        C10171l c10171l = (C10171l) obj;
        return this.f20702l == c10171l.f20702l && AbstractC8576l.yandex(this.f20701l, c10171l.f20701l) && AbstractC8576l.yandex(this.f20700l, c10171l.f20700l) && this.f20704l == c10171l.f20704l && this.f20703l.equals(c10171l.f20703l) && this.f20705l == c10171l.f20705l;
    }

    public final int hashCode() {
        int iHashCode = this.f20702l.hashCode() * 31;
        C2403l c2403l = this.f20701l;
        int iHashCode2 = (iHashCode + (c2403l != null ? c2403l.hashCode() : 0)) * 31;
        InterfaceC2186l interfaceC2186l = this.f20700l;
        return this.f20705l.hashCode() + ((((((((iHashCode2 + (interfaceC2186l != null ? interfaceC2186l.hashCode() : 0)) * 31) + 1237) * 31) + (this.f20704l ? 1231 : 1237)) * 31) + this.f20703l.yandex) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C4278l c4278l = new C4278l(this.f20701l, this.f20700l, false, this.f20704l, null, this.f20703l, this.f20705l);
        c4278l.f8774l = this.f20702l;
        return c4278l;
    }
}
