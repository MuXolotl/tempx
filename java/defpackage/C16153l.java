package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖؓۜ;", "Llَّؓ;", "Llٓ٘۟;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C16153l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17812l f31639l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14966l f31640l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C6523l f31641l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0639l f31642l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4991l f31643l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC4005l f31644l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f31645l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C16173l f31646l;

    public C16153l(C4991l c4991l, C0639l c0639l, C17812l c17812l, boolean z, InterfaceC4005l interfaceC4005l, C16173l c16173l, C14966l c14966l, C6523l c6523l) {
        this.f31643l = c4991l;
        this.f31642l = c0639l;
        this.f31639l = c17812l;
        this.f31645l = z;
        this.f31644l = interfaceC4005l;
        this.f31646l = c16173l;
        this.f31640l = c14966l;
        this.f31641l = c6523l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C14216l c14216l = (C14216l) abstractC14971l;
        boolean z = c14216l.f27811l;
        C14966l c14966l = c14216l.f27816l;
        C16173l c16173l = c14216l.f27809l;
        c14216l.f27814l = this.f31643l;
        C0639l c0639l = this.f31642l;
        c14216l.f27815l = c0639l;
        c14216l.f27813l = this.f31639l;
        boolean z2 = this.f31645l;
        c14216l.f27811l = z2;
        c14216l.f27810l = this.f31644l;
        C16173l c16173l2 = this.f31646l;
        c14216l.f27809l = c16173l2;
        C14966l c14966l2 = this.f31640l;
        c14216l.f27816l = c14966l2;
        c14216l.f27812l = this.f31641l;
        if (z2 != z || z2 != z || !AbstractC8576l.yandex(c14966l2, c14966l) || !C12814l.amazon(c0639l.loadAd)) {
            AbstractC18037l.purchase(c14216l);
        }
        if (c16173l2 != c16173l) {
            c16173l2.billing = new C4331l(c14216l, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16153l) {
            C16153l c16153l = (C16153l) obj;
            if (this.f31643l.equals(c16153l.f31643l) && AbstractC8576l.yandex(this.f31642l, c16153l.f31642l) && this.f31639l == c16153l.f31639l && this.f31645l == c16153l.f31645l && AbstractC8576l.yandex(this.f31644l, c16153l.f31644l) && this.f31646l == c16153l.f31646l && AbstractC8576l.yandex(this.f31640l, c16153l.f31640l) && AbstractC8576l.yandex(this.f31641l, c16153l.f31641l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31641l.hashCode() + ((this.f31640l.hashCode() + ((this.f31646l.hashCode() + ((this.f31644l.hashCode() + ((((((((this.f31639l.hashCode() + ((this.f31642l.hashCode() + (this.f31643l.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.f31645l ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C14216l c14216l = new C14216l();
        c14216l.f27814l = this.f31643l;
        c14216l.f27815l = this.f31642l;
        c14216l.f27813l = this.f31639l;
        c14216l.f27811l = this.f31645l;
        c14216l.f27810l = this.f31644l;
        C16173l c16173l = this.f31646l;
        c14216l.f27809l = c16173l;
        c14216l.f27816l = this.f31640l;
        c14216l.f27812l = this.f31641l;
        c16173l.billing = new C4331l(c14216l, 4);
        return c14216l;
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f31643l + ", value=" + this.f31642l + ", state=" + this.f31639l + ", readOnly=false, enabled=" + this.f31645l + ", isPassword=false, offsetMapping=" + this.f31644l + ", manager=" + this.f31646l + ", imeOptions=" + this.f31640l + ", focusRequester=" + this.f31641l + ")";
    }
}
