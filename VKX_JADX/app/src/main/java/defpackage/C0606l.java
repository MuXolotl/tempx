package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑۜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0606l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f2047l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2048l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11485l f2049l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f2050l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f2051l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2052l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f2053l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f2054l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f2055l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f2056l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f2057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606l(boolean z, C11485l c11485l, Function2 function2, Function1 function1, InterfaceC8714l interfaceC8714l, InterfaceC2262l interfaceC2262l, C2403l c2403l, InterfaceC8714l interfaceC8714l2, Function0 function0, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f2048l = z;
        this.f2049l = c11485l;
        this.f2054l = function2;
        this.f2050l = function1;
        this.f2056l = interfaceC8714l;
        this.f2053l = interfaceC2262l;
        this.f2047l = c2403l;
        this.f2057l = interfaceC8714l2;
        this.f2051l = function0;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2052l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC6843l interfaceC6843l = (InterfaceC6843l) this.f2055l;
            if (!this.f2048l) {
                return Unit.INSTANCE;
            }
            Function1 function1 = this.f2050l;
            InterfaceC8714l interfaceC8714l = this.f2056l;
            InterfaceC2262l interfaceC2262l = this.f2053l;
            C2403l c2403l = this.f2047l;
            InterfaceC8714l interfaceC8714l2 = this.f2057l;
            C4879l c4879l = new C4879l(function1, interfaceC8714l, interfaceC2262l, c2403l, interfaceC8714l2, 2);
            Function0 function0 = this.f2051l;
            C11574l c11574l = new C11574l(function0, interfaceC8714l2, interfaceC2262l, c2403l, interfaceC8714l, 0);
            C11574l c11574l2 = new C11574l(function0, interfaceC8714l2, interfaceC2262l, c2403l, interfaceC8714l, 1);
            this.f2052l = 1;
            Object objPurchase = AbstractC7289l.purchase(interfaceC6843l, c4879l, c11574l, c11574l2, this.f2054l, this);
            Object obj2 = EnumC9342l.f19165l;
            if (objPurchase != obj2) {
                objPurchase = Unit.INSTANCE;
            }
            if (objPurchase == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C0606l c0606l = new C0606l(this.f2048l, this.f2049l, this.f2054l, this.f2050l, this.f2056l, this.f2053l, this.f2047l, this.f2057l, this.f2051l, interfaceC14029l);
        c0606l.f2055l = obj;
        return c0606l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0606l) ads((InterfaceC14029l) obj2, (InterfaceC6843l) obj)).Signature(Unit.INSTANCE);
    }
}
