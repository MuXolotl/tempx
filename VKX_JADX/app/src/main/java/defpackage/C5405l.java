package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5405l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f11592l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11362l f11593l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11594l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5405l(C2403l c2403l, C11362l c11362l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11594l = i;
        this.f11592l = c2403l;
        this.f11593l = c11362l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f11594l;
        C11362l c11362l = this.f11593l;
        C2403l c2403l = this.f11592l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f11595l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C8490l c8490l = c2403l.yandex;
                C4721l c4721l = new C4721l(c11362l, 0);
                this.f11595l = 1;
                c8490l.yandex(c4721l, this);
                return enumC9342l;
            case 1:
                int i3 = this.f11595l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C8490l c8490l2 = c2403l.yandex;
                C4721l c4721l2 = new C4721l(c11362l, 1);
                this.f11595l = 1;
                c8490l2.yandex(c4721l2, this);
                return enumC9342l;
            case 2:
                int i4 = this.f11595l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C8490l c8490l3 = c2403l.yandex;
                C4721l c4721l3 = new C4721l(c11362l, 2);
                this.f11595l = 1;
                c8490l3.yandex(c4721l3, this);
                return enumC9342l;
            default:
                int i5 = this.f11595l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C8490l c8490l4 = c2403l.yandex;
                C4721l c4721l4 = new C4721l(c11362l, 3);
                this.f11595l = 1;
                c8490l4.yandex(c4721l4, this);
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f11594l) {
            case 0:
                return new C5405l(this.f11592l, this.f11593l, interfaceC14029l, 0);
            case 1:
                return new C5405l(this.f11592l, this.f11593l, interfaceC14029l, 1);
            case 2:
                return new C5405l(this.f11592l, this.f11593l, interfaceC14029l, 2);
            default:
                return new C5405l(this.f11592l, this.f11593l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f11594l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C5405l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
