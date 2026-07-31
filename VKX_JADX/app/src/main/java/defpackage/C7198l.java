package defpackage;

/* JADX INFO: renamed from: lؘؚِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7198l implements InterfaceC13142l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC13142l f15036l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC13142l f15037l;

    public C7198l(InterfaceC13142l interfaceC13142l, InterfaceC13142l interfaceC13142l2) {
        this.f15037l = interfaceC13142l;
        this.f15036l = interfaceC13142l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7198l.class != obj.getClass()) {
            return false;
        }
        C7198l c7198l = (C7198l) obj;
        return AbstractC8576l.yandex(this.f15037l, c7198l.f15037l) && AbstractC8576l.yandex(this.f15036l, c7198l.f15036l) && AbstractC8576l.yandex(metrica(), c7198l.metrica());
    }

    @Override // defpackage.InterfaceC13142l
    public final void firebase(C2566l c2566l) {
        this.f15037l.firebase(c2566l);
        this.f15036l.firebase(c2566l);
    }

    public final int hashCode() {
        int iHashCode = (this.f15036l.hashCode() + (this.f15037l.hashCode() * 31)) * 32;
        C3790l c3790lMetrica = metrica();
        return iHashCode + (c3790lMetrica != null ? c3790lMetrica.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC13142l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        this.f15037l.isPro(interfaceC17593l);
        this.f15036l.isPro(interfaceC17593l);
    }

    @Override // defpackage.InterfaceC13142l
    public final C3790l metrica() {
        C3790l c3790lMetrica = this.f15036l.metrica();
        InterfaceC13142l interfaceC13142l = this.f15037l;
        return c3790lMetrica != null ? c3790lMetrica.yandex(interfaceC13142l.metrica()) : interfaceC13142l.metrica();
    }

    public final String toString() {
        return this.f15037l + ".then(" + this.f15036l + ")";
    }
}
