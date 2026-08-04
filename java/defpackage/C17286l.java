package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗٞؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17286l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f33543l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C1311l f33544l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33545l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33546l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17286l(C2403l c2403l, C1311l c1311l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33545l = i;
        this.f33543l = c2403l;
        this.f33544l = c1311l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f33545l;
        C1311l c1311l = this.f33544l;
        C2403l c2403l = this.f33543l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f33546l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (c2403l != null) {
                        C15366l c15366l = new C15366l(c1311l);
                        this.f33546l = 1;
                        if (c2403l.yandex(c15366l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f33546l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (c2403l != null) {
                        this.f33546l = 1;
                        if (c2403l.yandex(c1311l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f33546l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (c2403l != null) {
                        C15758l c15758l = new C15758l(c1311l);
                        this.f33546l = 1;
                        if (c2403l.yandex(c15758l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f33546l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (c2403l != null) {
                        C15366l c15366l2 = new C15366l(c1311l);
                        this.f33546l = 1;
                        if (c2403l.yandex(c15366l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
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
        int i = this.f33545l;
        C1311l c1311l = this.f33544l;
        C2403l c2403l = this.f33543l;
        switch (i) {
            case 0:
                return new C17286l(c2403l, c1311l, interfaceC14029l, 0);
            case 1:
                return new C17286l(c2403l, c1311l, interfaceC14029l, 1);
            case 2:
                return new C17286l(c2403l, c1311l, interfaceC14029l, 2);
            default:
                return new C17286l(c2403l, c1311l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f33545l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C17286l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
