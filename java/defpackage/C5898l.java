package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5898l extends AbstractC6786l implements InterfaceC13340l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9788l f12436l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC13012l f12437l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f12438l;

    public C5898l(InterfaceC13012l interfaceC13012l, C9788l c9788l, boolean z) {
        super(C4219l.f8647l);
        this.f12437l = interfaceC13012l;
        this.f12436l = c9788l;
        this.f12438l = z;
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return this.f12438l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: catch */
    public final AbstractC6786l mo1765catch() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5898l)) {
            return false;
        }
        C5898l c5898l = (C5898l) obj;
        return AbstractC8576l.yandex(this.f12437l, c5898l.f12437l) && AbstractC8576l.yandex(this.f12436l, c5898l.f12436l) && this.f12438l == c5898l.f12438l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: extends */
    public final AbstractC6786l mo1767extends() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: for */
    public final AbstractC6786l mo1768for(boolean z) {
        if (!z) {
            return this;
        }
        C11467l.Signature(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC6786l
    public final int hashCode() {
        InterfaceC13012l interfaceC13012l = this.f12437l;
        return ((this.f12436l.hashCode() + ((interfaceC13012l != null ? interfaceC13012l.hashCode() : 0) * 31)) * 31) + (this.f12438l ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package */
    public final InterfaceC1122l mo1616package() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: private */
    public final boolean mo1769private() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean pro() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC1388l remoteconfig() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC13012l subs() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: synchronized */
    public final boolean mo1770synchronized() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: throw */
    public final AbstractC6786l mo1771throw(boolean z) {
        return z == this.f12438l ? this : new C5898l(this.f12437l, this.f12436l, z);
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws */
    public final List mo1617throws() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC6786l
    public final String toString() {
        return this.f12436l.toString();
    }
}
