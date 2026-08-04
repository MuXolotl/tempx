package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: l٘ۙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Ll٘ۙٗ;", "T", "Llَّؓ;", "Llُِٟ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C18168l<T> extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f35571l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC7283l f35572l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15389l f35573l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14745l f35574l;

    public C18168l(C15389l c15389l, EnumC7283l enumC7283l, boolean z, InterfaceC14745l interfaceC14745l) {
        this.f35573l = c15389l;
        this.f35572l = enumC7283l;
        this.f35571l = z;
        this.f35574l = interfaceC14745l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        boolean z;
        boolean z2;
        C10987l c10987l = (C10987l) abstractC14971l;
        InterfaceC14745l interfaceC14745l = this.f35574l;
        c10987l.f22136l = interfaceC14745l;
        C15389l c15389l = c10987l.f22135l;
        C15389l c15389l2 = this.f35573l;
        if (AbstractC8576l.yandex(c15389l, c15389l2)) {
            z = false;
        } else {
            c10987l.f22135l = c15389l2;
            c10987l.m3027l(interfaceC14745l);
            z = true;
        }
        EnumC7283l enumC7283l = c10987l.f24782l;
        EnumC7283l enumC7283l2 = this.f35572l;
        if (enumC7283l != enumC7283l2) {
            c10987l.f24782l = enumC7283l2;
            z2 = true;
        } else {
            z2 = z;
        }
        c10987l.m3410l(c10987l.f24791l, this.f35571l, null, enumC7283l2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18168l)) {
            return false;
        }
        C18168l c18168l = (C18168l) obj;
        return AbstractC8576l.yandex(this.f35573l, c18168l.f35573l) && this.f35572l == c18168l.f35572l && this.f35571l == c18168l.f35571l && AbstractC8576l.yandex(this.f35574l, c18168l.f35574l);
    }

    public final int hashCode() {
        int iHashCode = (((this.f35572l.hashCode() + (this.f35573l.hashCode() * 31)) * 31) + (this.f35571l ? 1231 : 1237)) * 28629151;
        InterfaceC14745l interfaceC14745l = this.f35574l;
        return iHashCode + (interfaceC14745l != null ? interfaceC14745l.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C10987l c10987l = new C10987l(AbstractC12019l.yandex, this.f35571l, null, this.f35572l);
        c10987l.f22135l = this.f35573l;
        c10987l.f22136l = this.f35574l;
        return c10987l;
    }
}
