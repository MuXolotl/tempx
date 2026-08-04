package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6496l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17817l f13552l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13553l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13554l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6496l(InterfaceC17817l interfaceC17817l, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f13553l = i;
        this.f13552l = interfaceC17817l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f13553l;
        InterfaceC17817l interfaceC17817l = this.f13552l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f13554l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f13554l = 1;
                    Object objPurchase = ((InterfaceC2841l) interfaceC17817l).purchase(this);
                    return objPurchase == enumC9342l ? enumC9342l : objPurchase;
                }
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f13554l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f13554l = 1;
                    Object objYandex = ((InterfaceC2373l) interfaceC17817l).yandex(this);
                    return objYandex == enumC9342l ? enumC9342l : objYandex;
                }
                if (i3 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        switch (this.f13553l) {
            case 0:
                return new C6496l(this.f13552l, interfaceC14029l, 0);
            default:
                return new C6496l(this.f13552l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f13553l) {
            case 0:
                break;
        }
        return ((C6496l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
