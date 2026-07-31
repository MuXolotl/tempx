package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2592l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f5654l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5655l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2592l(C0360l c0360l, InterfaceC8282l interfaceC8282l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f5655l = 3;
        this.f5654l = c0360l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f5655l;
        C0360l c0360l = this.f5654l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f5656l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC4335l interfaceC4335lMopub = c0360l.mopub();
                this.f5656l = 1;
                Object objYandex = interfaceC4335lMopub.yandex(this);
                return objYandex == enumC9342l ? enumC9342l : objYandex;
            case 1:
                int i3 = this.f5656l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f5656l = 1;
                    if (C0360l.amazon(c0360l, this) == enumC9342l) {
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
            case 2:
                int i4 = this.f5656l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C11644l c11644l = c0360l.subs;
                this.f5656l = 1;
                Object objFirebase = ((C9426l) c11644l.f23357l).firebase(this);
                if (objFirebase != enumC9342l) {
                    objFirebase = Unit.INSTANCE;
                }
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
                InterfaceC6942l interfaceC6942lLoadAd = AbstractC0622l.loadAd(c0360l.mopub().purchase(), -1);
                C2354l c2354l = new C2354l(8, c0360l);
                this.f5656l = 2;
                if (interfaceC6942lLoadAd.yandex(c2354l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f5656l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C10781l c10781l = new C10781l(0, interfaceC14029l, c0360l);
                this.f5656l = 1;
                Object objAds = AbstractC5088l.ads(c10781l, this);
                return objAds == enumC9342l ? enumC9342l : objAds;
            default:
                int i6 = this.f5656l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC4335l interfaceC4335lMopub2 = c0360l.mopub();
                this.f5656l = 1;
                Object objYandex2 = interfaceC4335lMopub2.yandex(this);
                return objYandex2 == enumC9342l ? enumC9342l : objYandex2;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f5655l;
        C0360l c0360l = this.f5654l;
        switch (i) {
            case 0:
                return new C2592l(0, interfaceC14029l, c0360l);
            case 1:
                return new C2592l(1, interfaceC14029l, c0360l);
            case 2:
                return new C2592l(2, interfaceC14029l, c0360l);
            case 3:
                return new C2592l(c0360l, (InterfaceC8282l) null, interfaceC14029l);
            default:
                return new C2592l(4, interfaceC14029l, c0360l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5655l) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C2592l) ads((InterfaceC14029l) obj2, bool)).Signature(Unit.INSTANCE);
            case 1:
                return ((C2592l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C2592l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C2592l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((C2592l) ads((InterfaceC14029l) obj2, bool2)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2592l(int i, InterfaceC14029l interfaceC14029l, C0360l c0360l) {
        super(2, interfaceC14029l);
        this.f5655l = i;
        this.f5654l = c0360l;
    }
}
