package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lً٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llً٘ؓ;", "Llَّؓ;", "Llّۥۢ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C8057l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f16786l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Function0 f16787l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC2186l f16788l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f16789l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f16790l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f16791l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C6402l f16792l;

    public C8057l(C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z, boolean z2, String str, C6402l c6402l, Function0 function0) {
        this.f16789l = c2403l;
        this.f16788l = interfaceC2186l;
        this.f16786l = z;
        this.f16791l = z2;
        this.f16790l = str;
        this.f16792l = c6402l;
        this.f16787l = function0;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C12981l) abstractC14971l).m3865l(this.f16789l, this.f16788l, this.f16786l, this.f16791l, this.f16790l, this.f16792l, this.f16787l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8057l.class != obj.getClass()) {
            return false;
        }
        C8057l c8057l = (C8057l) obj;
        return AbstractC8576l.yandex(this.f16789l, c8057l.f16789l) && AbstractC8576l.yandex(this.f16788l, c8057l.f16788l) && this.f16786l == c8057l.f16786l && this.f16791l == c8057l.f16791l && AbstractC8576l.yandex(this.f16790l, c8057l.f16790l) && AbstractC8576l.yandex(this.f16792l, c8057l.f16792l) && this.f16787l == c8057l.f16787l;
    }

    public final int hashCode() {
        C2403l c2403l = this.f16789l;
        int iHashCode = (c2403l != null ? c2403l.hashCode() : 0) * 31;
        InterfaceC2186l interfaceC2186l = this.f16788l;
        int iHashCode2 = (((((iHashCode + (interfaceC2186l != null ? interfaceC2186l.hashCode() : 0)) * 31) + (this.f16786l ? 1231 : 1237)) * 31) + (this.f16791l ? 1231 : 1237)) * 31;
        String str = this.f16790l;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C6402l c6402l = this.f16792l;
        return this.f16787l.hashCode() + ((iHashCode3 + (c6402l != null ? c6402l.yandex : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C12981l(this.f16789l, this.f16788l, this.f16786l, this.f16791l, this.f16790l, this.f16792l, this.f16787l);
    }
}
