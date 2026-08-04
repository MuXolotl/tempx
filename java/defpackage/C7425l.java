package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7425l implements InterfaceC13012l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC13012l f15375l;

    public C7425l(InterfaceC13012l interfaceC13012l) {
        this.f15375l = interfaceC13012l;
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return this.f15375l.Signature();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C7425l c7425l = obj instanceof C7425l ? (C7425l) obj : null;
        InterfaceC13012l interfaceC13012l = c7425l != null ? c7425l.f15375l : null;
        InterfaceC13012l interfaceC13012l2 = this.f15375l;
        if (!AbstractC8576l.yandex(interfaceC13012l2, interfaceC13012l)) {
            return false;
        }
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l2.mo1616package();
        if (!(interfaceC1122lMo1616package instanceof InterfaceC1388l)) {
            return false;
        }
        InterfaceC13012l interfaceC13012l3 = obj instanceof InterfaceC13012l ? (InterfaceC13012l) obj : null;
        InterfaceC1122l interfaceC1122lMo1616package2 = interfaceC13012l3 != null ? interfaceC13012l3.mo1616package() : null;
        if (interfaceC1122lMo1616package2 == null || !(interfaceC1122lMo1616package2 instanceof InterfaceC1388l)) {
            return false;
        }
        return AbstractC8576l.yandex(((InterfaceC13937l) ((InterfaceC1388l) interfaceC1122lMo1616package)).mo1730private(), ((InterfaceC13937l) ((InterfaceC1388l) interfaceC1122lMo1616package2)).mo1730private());
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return this.f15375l.getAnnotations();
    }

    public final int hashCode() {
        return this.f15375l.hashCode();
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package */
    public final InterfaceC1122l mo1616package() {
        return this.f15375l.mo1616package();
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws */
    public final List mo1617throws() {
        return this.f15375l.mo1617throws();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f15375l;
    }
}
