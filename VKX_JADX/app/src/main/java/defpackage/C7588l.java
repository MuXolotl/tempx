package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7588l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7276l f15591l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15592l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15593l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7588l(C7276l c7276l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15592l = i;
        this.f15591l = c7276l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C17266l c17266l;
        C15202l c15202l;
        Object objYandex;
        int i = 1;
        switch (this.f15592l) {
            case 0:
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                int i2 = this.f15593l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7276l c7276l = this.f15591l;
                    C7549l c7549l = c7276l.billing.f23533l;
                    C17763l c17763l = new C17763l(c7276l, 0);
                    this.f15593l = 1;
                    if (c7549l.f15551l.yandex(c17763l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C17132l.firebase();
                return null;
            case 1:
                EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
                int i3 = this.f15593l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7276l c7276l2 = this.f15591l;
                    C8084l c8084l = c7276l2.billing.f23540l;
                    C17763l c17763l2 = new C17763l(c7276l2, i);
                    this.f15593l = 1;
                    if (c8084l.f16850l.yandex(c17763l2, this) == enumC9342l2) {
                        return enumC9342l2;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C17132l.firebase();
                return null;
            default:
                EnumC9342l enumC9342l3 = EnumC9342l.f19165l;
                int i4 = this.f15593l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7276l c7276l3 = this.f15591l;
                    this.f15593l = 1;
                    C10700l c10700l = new C10700l();
                    synchronized (c7276l3.startapp) {
                        c17266l = c7276l3.ad;
                        c15202l = c7276l3.advert;
                        c10700l.f21708l = c15202l;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (c17266l == null || c15202l == null || (objYandex = c17266l.subs.yandex(new C15215l(c10700l, c7276l3, 2), this)) != enumC9342l3) {
                        objYandex = Unit.INSTANCE;
                    }
                    if (objYandex == enumC9342l3) {
                        return enumC9342l3;
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
        int i = this.f15592l;
        C7276l c7276l = this.f15591l;
        switch (i) {
            case 0:
                return new C7588l(c7276l, interfaceC14029l, 0);
            case 1:
                return new C7588l(c7276l, interfaceC14029l, 1);
            default:
                return new C7588l(c7276l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15592l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (i) {
            case 0:
                ((C7588l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 1:
                ((C7588l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                return enumC9342l;
            default:
                return ((C7588l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
        }
    }
}
