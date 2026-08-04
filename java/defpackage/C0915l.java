package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0915l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6523l f2584l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2585l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2586l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0915l(C6523l c6523l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2585l = i;
        this.f2584l = c6523l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2585l;
        EnumC16636l enumC16636l = EnumC16636l.MILLISECONDS;
        C6523l c6523l = this.f2584l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f2586l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l = C9658l.f19699l;
                    long jTapsense = AbstractC15918l.tapsense(250, enumC16636l);
                    this.f2586l = 1;
                    if (AbstractC8532l.billing(jTapsense, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f2586l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f2586l = 1;
                    if (AbstractC8532l.purchase(250L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f2586l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l2 = C9658l.f19699l;
                    long jTapsense2 = AbstractC15918l.tapsense(250, enumC16636l);
                    this.f2586l = 1;
                    if (AbstractC8532l.billing(jTapsense2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f2586l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l3 = C9658l.f19699l;
                    long jTapsense3 = AbstractC15918l.tapsense(250, enumC16636l);
                    this.f2586l = 1;
                    if (AbstractC8532l.billing(jTapsense3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
            case 4:
                int i6 = this.f2586l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l4 = C9658l.f19699l;
                    long jTapsense4 = AbstractC15918l.tapsense(250, enumC16636l);
                    this.f2586l = 1;
                    if (AbstractC8532l.billing(jTapsense4, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
            default:
                int i7 = this.f2586l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l5 = C9658l.f19699l;
                    long jTapsense5 = AbstractC15918l.tapsense(250, enumC16636l);
                    this.f2586l = 1;
                    if (AbstractC8532l.billing(jTapsense5, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C6523l.loadAd(c6523l);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f2585l) {
            case 0:
                return new C0915l(this.f2584l, interfaceC14029l, 0);
            case 1:
                return new C0915l(this.f2584l, interfaceC14029l, 1);
            case 2:
                return new C0915l(this.f2584l, interfaceC14029l, 2);
            case 3:
                return new C0915l(this.f2584l, interfaceC14029l, 3);
            case 4:
                return new C0915l(this.f2584l, interfaceC14029l, 4);
            default:
                return new C0915l(this.f2584l, interfaceC14029l, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f2585l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C0915l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
