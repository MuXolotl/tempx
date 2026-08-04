package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13699l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f26747l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26748l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15781l f26749l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC18674l f26750l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26751l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26752l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13699l(InterfaceC14029l interfaceC14029l, AbstractC15781l abstractC15781l, Function1 function1, boolean z, boolean z2) {
        super(2, interfaceC14029l);
        this.f26748l = z;
        this.f26751l = z2;
        this.f26749l = abstractC15781l;
        this.f26753l = function1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e A[DONT_INVERT, PHI: r0 r12
  0x009e: PHI (r0v11 lّؓۦ) = (r0v8 lّؓۦ), (r0v16 lّؓۦ) binds: [B:37:0x009b, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r12v17 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:37:0x009b, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6 A[RETURN] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        EnumC18674l enumC18674l;
        InterfaceC12352l interfaceC12352l;
        EnumC18674l enumC18674l2;
        InterfaceC12352l interfaceC12352l2;
        InterfaceC12352l interfaceC12352l3;
        Object objAmazon;
        Object obj2;
        int i = this.f26752l;
        Function1 function1 = this.f26753l;
        AbstractC15781l abstractC15781l = this.f26749l;
        boolean z = this.f26751l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC12352l interfaceC12352l4 = (InterfaceC12352l) this.f26747l;
            if (!this.f26748l) {
                return function1.invoke(((InterfaceC17053l) interfaceC12352l4).crashlytics());
            }
            enumC18674l = z ? EnumC18674l.f36443l : EnumC18674l.f36442l;
            if (z) {
                EnumC18674l enumC18674l3 = enumC18674l;
                interfaceC12352l = interfaceC12352l4;
                enumC18674l2 = enumC18674l3;
                C13344l c13344l = new C13344l(0, null, function1);
                this.f26747l = interfaceC12352l;
                this.f26750l = null;
                this.f26752l = 3;
                obj = interfaceC12352l.yandex(enumC18674l2, c13344l, this);
                if (obj != enumC9342l) {
                    if (z) {
                        return obj;
                    }
                    this.f26747l = obj;
                    this.f26752l = 4;
                    objAmazon = interfaceC12352l.amazon(this);
                    if (objAmazon != enumC9342l) {
                        Object obj3 = obj;
                        obj = objAmazon;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            C15813l c15813l = abstractC15781l.purchase;
                            if (c15813l != null) {
                            }
                            c15813l.crashlytics.mopub(c15813l.billing, c15813l.mopub);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f26747l = interfaceC12352l4;
                this.f26750l = enumC18674l;
                this.f26752l = 1;
                Object objAmazon2 = interfaceC12352l4.amazon(this);
                if (objAmazon2 != enumC9342l) {
                    interfaceC12352l2 = interfaceC12352l4;
                    obj = objAmazon2;
                }
            }
            return enumC9342l;
        }
        if (i == 1) {
            enumC18674l = this.f26750l;
            interfaceC12352l2 = (InterfaceC12352l) this.f26747l;
            AbstractC2829l.crashlytics(obj);
        } else {
            if (i == 2) {
                enumC18674l = this.f26750l;
                interfaceC12352l3 = (InterfaceC12352l) this.f26747l;
                AbstractC2829l.crashlytics(obj);
                enumC18674l2 = enumC18674l;
                interfaceC12352l = interfaceC12352l3;
                C13344l c13344l2 = new C13344l(0, null, function1);
                this.f26747l = interfaceC12352l;
                this.f26750l = null;
                this.f26752l = 3;
                obj = interfaceC12352l.yandex(enumC18674l2, c13344l2, this);
                if (obj != enumC9342l) {
                    if (z) {
                        return obj;
                    }
                    this.f26747l = obj;
                    this.f26752l = 4;
                    objAmazon = interfaceC12352l.amazon(this);
                    if (objAmazon != enumC9342l) {
                        Object obj4 = obj;
                        obj = objAmazon;
                        obj2 = obj4;
                    }
                }
                return enumC9342l;
            }
            if (i == 3) {
                interfaceC12352l = (InterfaceC12352l) this.f26747l;
                AbstractC2829l.crashlytics(obj);
                if (z) {
                    return obj;
                }
                this.f26747l = obj;
                this.f26752l = 4;
                objAmazon = interfaceC12352l.amazon(this);
                if (objAmazon != enumC9342l) {
                    Object obj5 = obj;
                    obj = objAmazon;
                    obj2 = obj5;
                }
                return enumC9342l;
            }
            if (i != 4) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f26747l;
            AbstractC2829l.crashlytics(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C15813l c15813l2 = abstractC15781l.purchase;
            C15813l c15813l3 = c15813l2 != null ? c15813l2 : null;
            c15813l3.crashlytics.mopub(c15813l3.billing, c15813l3.mopub);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            enumC18674l2 = enumC18674l;
            interfaceC12352l = interfaceC12352l2;
            C13344l c13344l3 = new C13344l(0, null, function1);
            this.f26747l = interfaceC12352l;
            this.f26750l = null;
            this.f26752l = 3;
            obj = interfaceC12352l.yandex(enumC18674l2, c13344l3, this);
            if (obj != enumC9342l) {
                if (z) {
                    return obj;
                }
                this.f26747l = obj;
                this.f26752l = 4;
                objAmazon = interfaceC12352l.amazon(this);
                if (objAmazon != enumC9342l) {
                    Object obj6 = obj;
                    obj = objAmazon;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        C15813l c15813l4 = abstractC15781l.purchase;
                        if (c15813l4 != null) {
                        }
                        c15813l3.crashlytics.mopub(c15813l3.billing, c15813l3.mopub);
                    }
                    return obj2;
                }
            }
        } else {
            C15813l c15813l5 = abstractC15781l.purchase;
            if (c15813l5 == null) {
                c15813l5 = null;
            }
            this.f26747l = interfaceC12352l2;
            this.f26750l = enumC18674l;
            this.f26752l = 2;
            if (c15813l5.yandex(this) != enumC9342l) {
                interfaceC12352l3 = interfaceC12352l2;
                enumC18674l2 = enumC18674l;
                interfaceC12352l = interfaceC12352l3;
                C13344l c13344l4 = new C13344l(0, null, function1);
                this.f26747l = interfaceC12352l;
                this.f26750l = null;
                this.f26752l = 3;
                obj = interfaceC12352l.yandex(enumC18674l2, c13344l4, this);
                if (obj != enumC9342l) {
                    if (z) {
                        return obj;
                    }
                    this.f26747l = obj;
                    this.f26752l = 4;
                    objAmazon = interfaceC12352l.amazon(this);
                    if (objAmazon != enumC9342l) {
                        Object obj7 = obj;
                        obj = objAmazon;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            C15813l c15813l6 = abstractC15781l.purchase;
                            if (c15813l6 != null) {
                            }
                            c15813l3.crashlytics.mopub(c15813l3.billing, c15813l3.mopub);
                        }
                        return obj2;
                    }
                }
            }
        }
        return enumC9342l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C13699l c13699l = new C13699l(interfaceC14029l, this.f26749l, this.f26753l, this.f26748l, this.f26751l);
        c13699l.f26747l = obj;
        return c13699l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13699l) ads((InterfaceC14029l) obj2, (InterfaceC12352l) obj)).Signature(Unit.INSTANCE);
    }
}
