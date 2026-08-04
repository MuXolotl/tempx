package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۨؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13017l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ int f25490l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f25491l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25492l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25493l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13017l(C17785l c17785l, int i, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25492l = 4;
        this.f25491l = c17785l;
        this.f25493l = i;
        this.f25490l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C13404l c13404l;
        int i = this.f25492l;
        Object obj2 = EnumC9342l.f19165l;
        Object obj3 = this.f25491l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                AbstractC5392l abstractC5392l = (AbstractC5392l) obj3;
                int i2 = this.f25493l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float fAdmob = abstractC5392l.f11555l.admob();
                    C5616l c5616lYandex = AbstractC6791l.yandex(fAdmob);
                    float f = 1.0f + fAdmob;
                    Float f2 = new Float(fAdmob);
                    Float f3 = new Float(f);
                    Function1 function1 = AbstractC3483l.purchase.yandex;
                    AbstractC2249l abstractC2249l = (AbstractC2249l) function1.invoke(f2);
                    if (abstractC2249l == null) {
                        abstractC2249l = c5616lYandex.admob;
                    }
                    AbstractC2249l abstractC2249l2 = (AbstractC2249l) function1.invoke(f3);
                    if (abstractC2249l2 == null) {
                        abstractC2249l2 = c5616lYandex.subs;
                    }
                    int iLoadAd = abstractC2249l.loadAd();
                    for (int i3 = 0; i3 < iLoadAd; i3++) {
                        if (abstractC2249l.yandex(i3) > abstractC2249l2.yandex(i3)) {
                            AbstractC4745l.loadAd("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC2249l + " is greater than upper bound " + abstractC2249l2 + " on index " + i3);
                        }
                    }
                    c5616lYandex.isPro = abstractC2249l;
                    c5616lYandex.firebase = abstractC2249l2;
                    if (!c5616lYandex.purchase()) {
                        Object objCrashlytics = c5616lYandex.crashlytics(c5616lYandex.amazon());
                        if (!AbstractC8576l.yandex(objCrashlytics, c5616lYandex.amazon())) {
                            c5616lYandex.crashlytics.f13720l.setValue(objCrashlytics);
                        }
                    }
                    Float f4 = new Float(f);
                    C4165l c4165lPurchase = AbstractC0532l.purchase(AbstractC0532l.subs(this.f25490l, 2, AbstractC5341l.amazon), 1, 0L, 4);
                    C1412l c1412l = new C1412l(9, abstractC5392l);
                    this.f25493l = 1;
                    if (C5616l.loadAd(c5616lYandex, f4, c4165lPurchase, null, c1412l, this, 4) == obj2) {
                        return obj2;
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
                int i4 = this.f25493l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC1142l interfaceC1142lBilling = C14358l.smaato((C14358l) obj3).billing(this.f25490l);
                this.f25493l = 1;
                Object objFirebase = ((C9426l) interfaceC1142lBilling).firebase(this);
                return objFirebase == obj2 ? obj2 : objFirebase;
            case 2:
                int i5 = this.f25493l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC14371l interfaceC14371l = ((C17338l) obj3).f33672l;
                    int i6 = this.f25490l;
                    this.f25493l = 1;
                    if (interfaceC14371l.crashlytics(i6, this) == obj2) {
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
            case 3:
                int i7 = this.f25493l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8490l c8490l = AbstractC6025l.yandex;
                    C6946l c6946l = new C6946l(this.f25490l, ((C10995l) obj3).f22147l);
                    this.f25493l = 1;
                    if (AbstractC6025l.yandex(c6946l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                C12823l c12823l = ((C17785l) obj3).yandex;
                ((C4520l) c12823l.f25198l).setIndeterminate(false);
                ((C4520l) c12823l.f25198l).setMax(this.f25493l);
                ((C4520l) c12823l.f25198l).yandex(this.f25490l, true);
                return Unit.INSTANCE;
            case 5:
                int i8 = this.f25493l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11194l c11194l = ((C8527l) obj3).yandex;
                    int i9 = this.f25490l;
                    C4776l c4776l = AbstractC6282l.yandex;
                    this.f25493l = 1;
                    Object objMopub = AbstractC16817l.mopub(c11194l, i9 - c11194l.yandex.admob(), c4776l, this);
                    if (objMopub != obj2) {
                        objMopub = Unit.INSTANCE;
                    }
                    if (objMopub == obj2) {
                        return obj2;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i10 = this.f25493l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11194l c11194l2 = ((C17607l) obj3).yandex;
                    int i11 = this.f25490l;
                    C4776l c4776l2 = AbstractC3951l.yandex;
                    this.f25493l = 1;
                    Object objMopub2 = AbstractC16817l.mopub(c11194l2, i11 - c11194l2.yandex.admob(), c4776l2, this);
                    if (objMopub2 != obj2) {
                        objMopub2 = Unit.INSTANCE;
                    }
                    if (objMopub2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i12 = this.f25493l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int i13 = this.f25490l;
                    this.f25493l = 1;
                    if (C14089l.m3832public((C14089l) obj3, i13, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i14 = this.f25493l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (Math.abs(this.f25490l) == 1 && (c13404l = ((C10304l) obj3).f21001l) != null) {
                        this.f25493l = 1;
                        Object objAdmob = AbstractC11990l.admob(new C13624l(c13404l, interfaceC14029l, 14), this);
                        if (objAdmob != obj2) {
                            objAdmob = Unit.INSTANCE;
                        }
                        if (objAdmob == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i14 != 1) {
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
        int i = this.f25492l;
        Object obj2 = this.f25491l;
        switch (i) {
            case 0:
                return new C13017l((AbstractC5392l) obj2, this.f25490l, interfaceC14029l, 0);
            case 1:
                return new C13017l((C14358l) obj2, interfaceC14029l, this.f25490l);
            case 2:
                return new C13017l((C17338l) obj2, this.f25490l, interfaceC14029l, 2);
            case 3:
                return new C13017l(this.f25490l, (C10995l) obj2, interfaceC14029l);
            case 4:
                return new C13017l((C17785l) obj2, this.f25493l, this.f25490l, interfaceC14029l);
            case 5:
                return new C13017l((C8527l) obj2, this.f25490l, interfaceC14029l, 5);
            case 6:
                return new C13017l((C17607l) obj2, this.f25490l, interfaceC14029l, 6);
            case 7:
                return new C13017l((C14089l) obj2, this.f25490l, interfaceC14029l, 7);
            default:
                C13017l c13017l = new C13017l((C10304l) obj2, interfaceC14029l);
                c13017l.f25490l = ((Number) obj).intValue();
                return c13017l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25492l) {
            case 0:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C13017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13017l) ads((InterfaceC14029l) obj2, Integer.valueOf(((Number) obj).intValue()))).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13017l(C14358l c14358l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f25492l = 1;
        this.f25491l = c14358l;
        this.f25490l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13017l(int i, C10995l c10995l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25492l = 3;
        this.f25490l = i;
        this.f25491l = c10995l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13017l(C10304l c10304l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25492l = 8;
        this.f25491l = c10304l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13017l(Object obj, int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f25492l = i2;
        this.f25491l = obj;
        this.f25490l = i;
    }
}
