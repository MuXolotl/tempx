package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lّۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12867l extends AbstractC11465l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Function3 f25316l;

    public C12867l(Function3 function3, InterfaceC6942l interfaceC6942l, InterfaceC12932l interfaceC12932l, int i, int i2) {
        super(i, i2, interfaceC12932l, interfaceC6942l);
        this.f25316l = function3;
    }

    @Override // defpackage.AbstractC11465l
    public final Object isPro(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        Object objAdmob = AbstractC11990l.admob(new C17784l(this, interfaceC9427l, null), interfaceC14029l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC18135l
    public final AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return new C12867l(this.f25316l, this.f23052l, interfaceC12932l, i, i2);
    }
}
