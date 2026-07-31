package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lَٛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10412l extends AbstractC0283l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC12932l f21228l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC14029l f21229l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC12932l f21230l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC9427l f21231l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f21232l;

    public C10412l(InterfaceC9427l interfaceC9427l, InterfaceC12932l interfaceC12932l) {
        super(C9958l.f20314l, C17218l.f33421l);
        this.f21231l = interfaceC9427l;
        this.f21230l = interfaceC12932l;
        this.f21232l = ((Number) interfaceC12932l.mo247l(0, new C8163l(17))).intValue();
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Throwable thYandex = C1171l.yandex(obj);
        if (thYandex != null) {
            this.f21228l = new C1430l(metrica(), thYandex);
        }
        InterfaceC14029l interfaceC14029l = this.f21229l;
        if (interfaceC14029l != null) {
            interfaceC14029l.subs(obj);
        }
        return EnumC9342l.f19165l;
    }

    @Override // defpackage.AbstractC12050l, defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = this.f21229l;
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        try {
            Object objPro = pro(interfaceC14029l, obj);
            return objPro == EnumC9342l.f19165l ? objPro : Unit.INSTANCE;
        } catch (Throwable th) {
            this.f21228l = new C1430l(interfaceC14029l.metrica(), th);
            throw th;
        }
    }

    @Override // defpackage.AbstractC0283l, defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        InterfaceC12932l interfaceC12932l = this.f21228l;
        return interfaceC12932l == null ? C17218l.f33421l : interfaceC12932l;
    }

    public final Object pro(InterfaceC14029l interfaceC14029l, Object obj) {
        InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l.metrica();
        AbstractC11174l.billing(interfaceC12932lMetrica);
        InterfaceC12932l interfaceC12932l = this.f21228l;
        if (interfaceC12932l != interfaceC12932lMetrica) {
            if (interfaceC12932l instanceof C1430l) {
                C18262l.subs(AbstractC1833l.firebase("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C1430l) interfaceC12932l).f3613l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                return null;
            }
            if (((Number) interfaceC12932lMetrica.mo247l(0, new C4951l(29, this))).intValue() != this.f21232l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f21230l + ",\n\t\tbut emission happened in " + interfaceC12932lMetrica + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f21228l = interfaceC12932lMetrica;
        }
        this.f21229l = interfaceC14029l;
        Object objInvoke = AbstractC15247l.yandex.invoke(this.f21231l, obj, this);
        if (!AbstractC8576l.yandex(objInvoke, EnumC9342l.f19165l)) {
            this.f21229l = null;
        }
        return objInvoke;
    }

    @Override // defpackage.AbstractC12050l
    public final StackTraceElement subscription() {
        return null;
    }
}
