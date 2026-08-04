package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5725l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7968l f12108l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f12109l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f12110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5725l(C7968l c7968l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f12109l = i;
        this.f12108l = c7968l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f12109l;
        C7968l c7968l = this.f12108l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f12110l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    this.f12110l = 1;
                    Object objLoadAd = interfaceC15829l.loadAd(new C0712l(c7968l, null, 0), this);
                    if (objLoadAd != enumC9342l) {
                        objLoadAd = Unit.INSTANCE;
                    }
                    if (objLoadAd == enumC9342l) {
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
            case 1:
                int i3 = this.f12110l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    this.f12110l = 1;
                    Object objLoadAd2 = interfaceC15829l2.loadAd(new C0712l(c7968l, null, 2), this);
                    if (objLoadAd2 != enumC9342l) {
                        objLoadAd2 = Unit.INSTANCE;
                    }
                    if (objLoadAd2 == enumC9342l) {
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
            default:
                int i4 = this.f12110l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l3 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    this.f12110l = 1;
                    Object objLoadAd3 = interfaceC15829l3.loadAd(new C0712l(c7968l, null, 1), this);
                    if (objLoadAd3 != enumC9342l) {
                        objLoadAd3 = Unit.INSTANCE;
                    }
                    if (objLoadAd3 == enumC9342l) {
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
        switch (this.f12109l) {
            case 0:
                return new C5725l(this.f12108l, interfaceC14029l, 0);
            case 1:
                return new C5725l(this.f12108l, interfaceC14029l, 1);
            default:
                return new C5725l(this.f12108l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f12109l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C5725l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
