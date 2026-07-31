package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُِۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11274l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f22709l = 0;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22710l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f22711l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22712l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f22713l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f22714l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f22715l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f22716l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11274l(C3321l c3321l, C1350l c1350l, Function2 function2, Function0 function0, C6199l c6199l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22716l = c3321l;
        this.f22710l = c1350l;
        this.f22711l = function2;
        this.f22715l = function0;
        this.f22712l = c6199l;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C17249l c17249l;
        Object objYandex;
        C17249l c17249l2;
        InterfaceC7042l interfaceC7042lMopub;
        Object objLoadAd;
        InterfaceC14029l interfaceC14029l;
        Object objIsPro;
        C15730l c15730l;
        int i = this.f22709l;
        InterfaceC14328l interfaceC14328l = this.f22715l;
        InterfaceC14328l interfaceC14328l2 = this.f22711l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj2 = this.f22712l;
        Object obj3 = this.f22710l;
        switch (i) {
            case 0:
                int i2 = this.f22714l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        c17249l = (C17249l) this.f22713l;
                        AbstractC2829l.crashlytics(obj);
                        objYandex = obj;
                    } else {
                        if (i2 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                c17249l = (C17249l) this.f22713l;
                this.f22713l = c17249l;
                this.f22714l = 1;
                objYandex = AbstractC18112l.yandex(c17249l, false, EnumC9065l.f18654l, this);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                this.f22713l = null;
                this.f22714l = 2;
                if (AbstractC7289l.subs(c17249l, (C15730l) objYandex, (C3321l) this.f22716l, (C1350l) obj3, (Function2) interfaceC14328l2, (Function0) interfaceC14328l, (C6199l) obj2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj3;
                C1304l c1304l = (C1304l) obj2;
                int i3 = this.f22714l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        interfaceC7042lMopub = (C7504l) this.f22716l;
                        c17249l2 = (C17249l) this.f22713l;
                        AbstractC2829l.crashlytics(obj);
                        objLoadAd = obj;
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interfaceC7042lMopub = (InterfaceC7042l) this.f22713l;
                        AbstractC2829l.crashlytics(obj);
                        objIsPro = obj;
                        interfaceC14029l = null;
                    }
                    c15730l = (C15730l) objIsPro;
                    if (c15730l == null) {
                        AbstractC18112l.mopub(interfaceC2262l, interfaceC7042lMopub, new C11799l(c1304l, interfaceC14029l, 0));
                    } else {
                        c15730l.yandex();
                        AbstractC18112l.mopub(interfaceC2262l, interfaceC7042lMopub, new C11799l(c1304l, interfaceC14029l, 1));
                        ((Function1) interfaceC14328l).invoke(new C1187l(c15730l.crashlytics));
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                c17249l2 = (C17249l) this.f22713l;
                interfaceC7042lMopub = AbstractC10999l.mopub(interfaceC2262l, null, 4, new C18683l(c1304l, null, 0), 1);
                this.f22713l = c17249l2;
                this.f22716l = interfaceC7042lMopub;
                this.f22714l = 1;
                objLoadAd = AbstractC18112l.loadAd(c17249l2, this, 3);
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
                C15730l c15730l2 = (C15730l) objLoadAd;
                c15730l2.yandex();
                Function3 function3 = (Function3) interfaceC14328l2;
                if (function3 != AbstractC18112l.yandex) {
                    interfaceC14029l = null;
                    AbstractC18112l.mopub(interfaceC2262l, interfaceC7042lMopub, new C1125l(function3, c1304l, c15730l2, null, 0));
                } else {
                    interfaceC14029l = null;
                }
                this.f22713l = interfaceC7042lMopub;
                this.f22716l = interfaceC14029l;
                this.f22714l = 2;
                objIsPro = AbstractC18112l.isPro(c17249l2, EnumC9065l.f18653l, this);
                if (objIsPro == enumC9342l) {
                    return enumC9342l;
                }
                c15730l = (C15730l) objIsPro;
                if (c15730l == null) {
                    AbstractC18112l.mopub(interfaceC2262l, interfaceC7042lMopub, new C11799l(c1304l, interfaceC14029l, 0));
                } else {
                    c15730l.yandex();
                    AbstractC18112l.mopub(interfaceC2262l, interfaceC7042lMopub, new C11799l(c1304l, interfaceC14029l, 1));
                    ((Function1) interfaceC14328l).invoke(new C1187l(c15730l.crashlytics));
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f22709l;
        Object obj2 = this.f22712l;
        InterfaceC14328l interfaceC14328l = this.f22715l;
        InterfaceC14328l interfaceC14328l2 = this.f22711l;
        Object obj3 = this.f22710l;
        switch (i) {
            case 0:
                C11274l c11274l = new C11274l((C3321l) this.f22716l, (C1350l) obj3, (Function2) interfaceC14328l2, (Function0) interfaceC14328l, (C6199l) obj2, interfaceC14029l);
                c11274l.f22713l = obj;
                return c11274l;
            default:
                C1304l c1304l = (C1304l) obj2;
                C11274l c11274l2 = new C11274l(interfaceC14029l, (InterfaceC2262l) obj3, c1304l, (Function1) interfaceC14328l, (Function3) interfaceC14328l2);
                c11274l2.f22713l = obj;
                return c11274l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C17249l c17249l = (C17249l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f22709l) {
            case 0:
                break;
        }
        return ((C11274l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11274l(InterfaceC14029l interfaceC14029l, InterfaceC2262l interfaceC2262l, C1304l c1304l, Function1 function1, Function3 function3) {
        super(2, interfaceC14029l);
        this.f22710l = interfaceC2262l;
        this.f22711l = function3;
        this.f22715l = function1;
        this.f22712l = c1304l;
    }
}
