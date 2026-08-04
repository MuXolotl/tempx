package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9837l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6843l f20033l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2077l f20034l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20035l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20036l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9837l(InterfaceC6843l interfaceC6843l, InterfaceC2077l interfaceC2077l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20035l = i;
        this.f20033l = interfaceC6843l;
        this.f20034l = interfaceC2077l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f20035l;
        InterfaceC6843l interfaceC6843l = this.f20033l;
        final InterfaceC2077l interfaceC2077l = this.f20034l;
        Object obj2 = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f20036l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20036l = 1;
                    if (C9552l.loadAd(interfaceC6843l, interfaceC2077l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f20036l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20036l = 1;
                    Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new amazon(interfaceC2077l, interfaceC14029l, 2), this);
                    if (objCrashlytics != obj2) {
                        objCrashlytics = Unit.INSTANCE;
                    }
                    if (objCrashlytics == obj2) {
                        return obj2;
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
                int i5 = this.f20036l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20036l = 1;
                    final int i6 = 0;
                    Object objPurchase = AbstractC7289l.purchase(this.f20033l, new C15408l(interfaceC2077l, 0), new Function0() { // from class: lًٛۥ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            InterfaceC2077l interfaceC2077l2 = interfaceC2077l;
                            switch (i7) {
                                case 0:
                                    interfaceC2077l2.loadAd();
                                    break;
                                default:
                                    interfaceC2077l2.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new Function0() { // from class: lًٛۥ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i2;
                            InterfaceC2077l interfaceC2077l2 = interfaceC2077l;
                            switch (i7) {
                                case 0:
                                    interfaceC2077l2.loadAd();
                                    break;
                                default:
                                    interfaceC2077l2.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new C4951l(4, interfaceC2077l), this);
                    if (objPurchase != obj2) {
                        objPurchase = Unit.INSTANCE;
                    }
                    if (objPurchase == obj2) {
                        return obj2;
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
        switch (this.f20035l) {
            case 0:
                return new C9837l(this.f20033l, this.f20034l, interfaceC14029l, 0);
            case 1:
                return new C9837l(this.f20033l, this.f20034l, interfaceC14029l, 1);
            default:
                return new C9837l(this.f20033l, this.f20034l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20035l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C9837l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
