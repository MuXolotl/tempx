package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؗۢۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5239l extends AbstractC11465l {
    public C5239l(InterfaceC6942l interfaceC6942l, InterfaceC12932l interfaceC12932l, int i, int i2, int i3) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? C17218l.f33421l : interfaceC12932l, interfaceC6942l);
    }

    @Override // defpackage.AbstractC18135l
    public final InterfaceC6942l admob() {
        return this.f23052l;
    }

    @Override // defpackage.AbstractC11465l
    public final Object isPro(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        Object objYandex = this.f23052l.yandex(interfaceC9427l, interfaceC14029l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC18135l
    public final AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return new C5239l(i, i2, interfaceC12932l, this.f23052l);
    }
}
