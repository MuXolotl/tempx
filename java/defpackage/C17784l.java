package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17784l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f34640l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12867l f34641l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34642l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f34643l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17784l(C12867l c12867l, InterfaceC9427l interfaceC9427l, Object obj, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f34641l = c12867l;
        this.f34643l = interfaceC9427l;
        this.f34640l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f34642l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f34644l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Function3 function3 = this.f34641l.f25316l;
                    Object obj2 = this.f34640l;
                    this.f34644l = 1;
                    if (function3.invoke(this.f34643l, obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f34640l;
                int i3 = this.f34644l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C10700l c10700l = new C10700l();
                    C12867l c12867l = this.f34641l;
                    InterfaceC6942l interfaceC6942l = c12867l.f23052l;
                    C5591l c5591l = new C5591l(c10700l, interfaceC2262l, c12867l, this.f34643l, 0);
                    this.f34640l = null;
                    this.f34644l = 1;
                    if (interfaceC6942l.yandex(c5591l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
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
        int i = this.f34642l;
        InterfaceC9427l interfaceC9427l = this.f34643l;
        C12867l c12867l = this.f34641l;
        switch (i) {
            case 0:
                return new C17784l(c12867l, interfaceC9427l, this.f34640l, interfaceC14029l);
            default:
                C17784l c17784l = new C17784l(c12867l, interfaceC9427l, interfaceC14029l);
                c17784l.f34640l = obj;
                return c17784l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34642l) {
            case 0:
                break;
        }
        return ((C17784l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17784l(C12867l c12867l, InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f34641l = c12867l;
        this.f34643l = interfaceC9427l;
    }
}
