package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13344l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26196l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26197l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f26198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13344l(int i, InterfaceC14029l interfaceC14029l, Function1 function1) {
        super(2, interfaceC14029l);
        this.f26197l = i;
        this.f26196l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f26197l;
        Function1 function1 = this.f26196l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                return function1.invoke(((C10595l) this.f26198l).crashlytics());
            case 1:
                AbstractC2829l.crashlytics(obj);
                return function1.invoke(((C10595l) this.f26198l).crashlytics());
            default:
                AbstractC2829l.crashlytics(obj);
                function1.invoke((C16221l) this.f26198l);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f26197l;
        Function1 function1 = this.f26196l;
        switch (i) {
            case 0:
                C13344l c13344l = new C13344l(0, interfaceC14029l, function1);
                c13344l.f26198l = obj;
                return c13344l;
            case 1:
                C13344l c13344l2 = new C13344l(1, interfaceC14029l, function1);
                c13344l2.f26198l = obj;
                return c13344l2;
            default:
                C13344l c13344l3 = new C13344l(function1, interfaceC14029l);
                c13344l3.f26198l = obj;
                return c13344l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26197l) {
            case 0:
                return ((C13344l) ads((InterfaceC14029l) obj2, (C10595l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13344l) ads((InterfaceC14029l) obj2, (C10595l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13344l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13344l(Function1 function1, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f26197l = 2;
        this.f26196l = function1;
    }
}
