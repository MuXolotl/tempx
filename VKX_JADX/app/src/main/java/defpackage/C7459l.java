package defpackage;

import java.util.AbstractList;

/* JADX INFO: renamed from: lؚۗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7459l extends AbstractList {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC18099l f15426l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC8722l f15427l;

    public C7459l(InterfaceC8722l interfaceC8722l, InterfaceC18099l interfaceC18099l) {
        this.f15427l = interfaceC8722l;
        this.f15426l = interfaceC18099l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMopub = ((C12405l) this.f15427l).mopub(i);
        ((C10819l) this.f15426l).getClass();
        EnumC13207l enumC13207lYandex = EnumC13207l.yandex(iMopub);
        return enumC13207lYandex == null ? EnumC13207l.UNKNOWN : enumC13207lYandex;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C12405l) this.f15427l).f24500l;
    }
}
