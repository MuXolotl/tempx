package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14822l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f28987l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28988l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f28989l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28990l = 1;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f28991l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28992l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f28993l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14822l(C0360l c0360l, C9987l c9987l, Object obj, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f28991l = c0360l;
        this.f28989l = c9987l;
        this.f28993l = obj;
        this.f28988l = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        EnumC18674l enumC18674l;
        InterfaceC12352l interfaceC12352l;
        InterfaceC12352l interfaceC12352l2;
        Object objAmazon;
        Object obj2;
        int i = this.f28990l;
        Object obj3 = this.f28989l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) this.f28993l;
                AbstractC15781l abstractC15781l = (AbstractC15781l) obj3;
                int i3 = this.f28992l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    return function1.invoke(((InterfaceC17053l) ((InterfaceC12352l) this.f28987l)).crashlytics());
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        enumC18674l = (EnumC18674l) this.f28991l;
                        interfaceC12352l = (InterfaceC12352l) this.f28987l;
                        AbstractC2829l.crashlytics(obj);
                    } else if (i3 == 3) {
                        interfaceC12352l2 = (InterfaceC12352l) this.f28987l;
                        AbstractC2829l.crashlytics(obj);
                        if (!this.f28988l) {
                            return obj;
                        }
                        this.f28987l = obj;
                        this.f28992l = 4;
                        objAmazon = interfaceC12352l2.amazon(this);
                        if (objAmazon == enumC9342l) {
                            return enumC9342l;
                        }
                        obj2 = obj;
                        obj = objAmazon;
                    } else {
                        if (i3 != 4) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj4 = this.f28987l;
                        AbstractC2829l.crashlytics(obj);
                        obj2 = obj4;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    C15813l c15813l = abstractC15781l.purchase;
                    C15813l c15813l2 = c15813l != null ? c15813l : null;
                    c15813l2.crashlytics.mopub(c15813l2.billing, c15813l2.mopub);
                    return obj2;
                }
                enumC18674l = (EnumC18674l) this.f28991l;
                interfaceC12352l = (InterfaceC12352l) this.f28987l;
                AbstractC2829l.crashlytics(obj);
                if (!((Boolean) obj).booleanValue()) {
                    C15813l c15813l3 = abstractC15781l.purchase;
                    if (c15813l3 == null) {
                        c15813l3 = null;
                    }
                    this.f28987l = interfaceC12352l;
                    this.f28991l = enumC18674l;
                    this.f28992l = 2;
                    if (c15813l3.yandex(this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                C13344l c13344l = new C13344l(i2, b == true ? 1 : 0, function1);
                this.f28987l = interfaceC12352l;
                this.f28991l = null;
                this.f28992l = 3;
                obj = interfaceC12352l.yandex(enumC18674l, c13344l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC12352l2 = interfaceC12352l;
                if (!this.f28988l) {
                    return obj;
                }
                this.f28987l = obj;
                this.f28992l = 4;
                objAmazon = interfaceC12352l2.amazon(this);
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
                obj2 = obj;
                obj = objAmazon;
                if (!((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                C15813l c15813l4 = abstractC15781l.purchase;
                if (c15813l4 != null) {
                }
                c15813l2.crashlytics.mopub(c15813l2.billing, c15813l2.mopub);
                return obj2;
            default:
                InterfaceC12316l interfaceC12316l = (InterfaceC12316l) this.f28987l;
                int i4 = this.f28992l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    ((C0360l) this.f28991l).getClass();
                    C12674l c12674l = new C12674l((C9987l) obj3, (C0360l) this.f28991l, interfaceC12316l, this.f28993l, this.f28988l, null);
                    this.f28987l = null;
                    this.f28992l = 1;
                    if (AbstractC5088l.ads(c12674l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28990l;
        Object obj2 = this.f28989l;
        switch (i) {
            case 0:
                C14822l c14822l = new C14822l(interfaceC14029l, (AbstractC15781l) obj2, (Function1) this.f28993l, this.f28988l);
                c14822l.f28987l = obj;
                return c14822l;
            default:
                C14822l c14822l2 = new C14822l((C0360l) this.f28991l, (C9987l) obj2, this.f28993l, this.f28988l, interfaceC14029l);
                c14822l2.f28987l = obj;
                return c14822l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28990l) {
            case 0:
                return ((C14822l) ads((InterfaceC14029l) obj2, (InterfaceC12352l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14822l) ads((InterfaceC14029l) obj2, (InterfaceC12316l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14822l(InterfaceC14029l interfaceC14029l, AbstractC15781l abstractC15781l, Function1 function1, boolean z) {
        super(2, interfaceC14029l);
        this.f28988l = z;
        this.f28989l = abstractC15781l;
        this.f28993l = function1;
    }
}
