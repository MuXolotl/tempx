package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؗۙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5134l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f11171l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C3422l f11172l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11173l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11174l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5134l(C3422l c3422l, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f11173l = i;
        this.f11172l = c3422l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11173l;
        C3422l c3422l = this.f11172l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f11171l;
                int i2 = this.f11174l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6806l c6806l = (C6806l) abstractC12074l.f24000l;
                    this.f11171l = null;
                    this.f11174l = 1;
                    if (c3422l.yandex(c6806l, this) == enumC9342l) {
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
                AbstractC12074l abstractC12074l2 = this.f11171l;
                int i3 = this.f11174l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6806l c6806l2 = (C6806l) abstractC12074l2.f24000l;
                    this.f11171l = null;
                    this.f11174l = 1;
                    if (c3422l.vip(c6806l2, this) == enumC9342l) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f11173l) {
            case 0:
                C5134l c5134l = new C5134l(this.f11172l, interfaceC14029l, 0);
                c5134l.f11171l = abstractC12074l;
                return c5134l.Signature(Unit.INSTANCE);
            default:
                C5134l c5134l2 = new C5134l(this.f11172l, interfaceC14029l, 1);
                c5134l2.f11171l = abstractC12074l;
                return c5134l2.Signature(Unit.INSTANCE);
        }
    }
}
