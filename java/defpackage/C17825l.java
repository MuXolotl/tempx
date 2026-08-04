package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَ٘ٗ;", "Llَّؓ;", "Llْٕٙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C17825l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC2186l f34754l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2403l f34755l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f34756l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C6402l f34757l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f34758l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function1 f34759l;

    public C17825l(boolean z, C2403l c2403l, C8372l c8372l, boolean z2, C6402l c6402l, Function1 function1) {
        this.f34756l = z;
        this.f34755l = c2403l;
        this.f34754l = c8372l;
        this.f34758l = z2;
        this.f34757l = c6402l;
        this.f34759l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15652l c15652l = (C15652l) abstractC14971l;
        boolean z = c15652l.f30596l;
        boolean z2 = this.f34756l;
        if (z != z2) {
            c15652l.f30596l = z2;
            AbstractC18037l.purchase(c15652l);
        }
        c15652l.f30597l = this.f34759l;
        c15652l.m3865l(this.f34755l, this.f34754l, false, this.f34758l, null, this.f34757l, c15652l.f30598l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17825l.class != obj.getClass()) {
            return false;
        }
        C17825l c17825l = (C17825l) obj;
        return this.f34756l == c17825l.f34756l && AbstractC8576l.yandex(this.f34755l, c17825l.f34755l) && AbstractC8576l.yandex(this.f34754l, c17825l.f34754l) && this.f34758l == c17825l.f34758l && AbstractC8576l.yandex(this.f34757l, c17825l.f34757l) && this.f34759l == c17825l.f34759l;
    }

    public final int hashCode() {
        int i = (this.f34756l ? 1231 : 1237) * 31;
        C2403l c2403l = this.f34755l;
        int iHashCode = (i + (c2403l != null ? c2403l.hashCode() : 0)) * 31;
        InterfaceC2186l interfaceC2186l = this.f34754l;
        int iHashCode2 = (((((iHashCode + (interfaceC2186l != null ? interfaceC2186l.hashCode() : 0)) * 31) + 1237) * 31) + (this.f34758l ? 1231 : 1237)) * 31;
        C6402l c6402l = this.f34757l;
        return this.f34759l.hashCode() + ((iHashCode2 + (c6402l != null ? c6402l.yandex : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C15652l(this.f34756l, this.f34755l, this.f34754l, this.f34758l, this.f34757l, this.f34759l);
    }
}
