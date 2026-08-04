package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15416l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f30122l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f30123l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30124l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30125l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15416l(C2403l c2403l, InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30124l = i;
        this.f30122l = c2403l;
        this.f30123l = interfaceC8714l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f30124l;
        InterfaceC8714l interfaceC8714l = this.f30123l;
        C2403l c2403l = this.f30122l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f30125l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList = new ArrayList();
                C8490l c8490l = c2403l.yandex;
                C3437l c3437l = new C3437l(arrayList, interfaceC8714l, 0);
                this.f30125l = 1;
                c8490l.yandex(c3437l, this);
                return enumC9342l;
            case 1:
                int i3 = this.f30125l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList2 = new ArrayList();
                C8490l c8490l2 = c2403l.yandex;
                C3437l c3437l2 = new C3437l(arrayList2, interfaceC8714l, 1);
                this.f30125l = 1;
                c8490l2.yandex(c3437l2, this);
                return enumC9342l;
            case 2:
                int i4 = this.f30125l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList3 = new ArrayList();
                C8490l c8490l3 = c2403l.yandex;
                C3437l c3437l3 = new C3437l(arrayList3, interfaceC8714l, 2);
                this.f30125l = 1;
                c8490l3.yandex(c3437l3, this);
                return enumC9342l;
            default:
                int i5 = this.f30125l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList4 = new ArrayList();
                C8490l c8490l4 = c2403l.yandex;
                C3437l c3437l4 = new C3437l(arrayList4, interfaceC8714l, 3);
                this.f30125l = 1;
                c8490l4.yandex(c3437l4, this);
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f30124l) {
            case 0:
                return new C15416l(this.f30122l, this.f30123l, interfaceC14029l, 0);
            case 1:
                return new C15416l(this.f30122l, this.f30123l, interfaceC14029l, 1);
            case 2:
                return new C15416l(this.f30122l, this.f30123l, interfaceC14029l, 2);
            default:
                return new C15416l(this.f30122l, this.f30123l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f30124l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C15416l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
