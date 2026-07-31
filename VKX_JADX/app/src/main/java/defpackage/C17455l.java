package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* JADX INFO: renamed from: lٗ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17455l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f34004l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f34005l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34006l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34007l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17455l(AbstractC9694l abstractC9694l, String str, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34006l = i;
        this.f34004l = abstractC9694l;
        this.f34005l = str;
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C2975l c2975l;
        C8568l c8568l;
        C2975l c2975l2;
        C10481l c10481l;
        C2975l c2975l3;
        C10481l c10481l2;
        int i = this.f34006l;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        AbstractC9694l abstractC9694l = this.f34004l;
        String str = this.f34005l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i5 = this.f34007l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C12772l c12772l = new C12772l(new String[]{str});
                c12772l.loadAd = abstractC9694l.m2722l();
                this.f34007l = 1;
                Object objAdmob = AbstractC8189l.admob(c12772l, this);
                return objAdmob == enumC9342l ? enumC9342l : objAdmob;
            case 1:
                int i6 = this.f34007l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    abstractC9694l.mo781return().getClass();
                    if (AbstractC16648l.isVip(str, "#", false)) {
                        this.f34007l = 1;
                        if (AbstractC9694l.m2718protected(abstractC9694l, str, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        return Unit.INSTANCE;
                    }
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C17455l c17455l = new C17455l(str, abstractC9694l, interfaceC14029l, i2);
                    this.f34007l = 2;
                    obj = AbstractC10999l.firebase(executorC6708l, c17455l, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    c2975l = AbstractC17278l.yandex.f6462l;
                    c8568l = new C8568l(abstractC9694l, (Catalog2Response) obj, interfaceC14029l, 4);
                    this.f34007l = 3;
                    if (AbstractC10999l.firebase(c2975l, c8568l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    if (i6 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C16552l c16552l3 = AbstractC11463l.yandex;
                        c2975l = AbstractC17278l.yandex.f6462l;
                        c8568l = new C8568l(abstractC9694l, (Catalog2Response) obj, interfaceC14029l, 4);
                        this.f34007l = 3;
                        if (AbstractC10999l.firebase(c2975l, c8568l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i6 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                int i7 = this.f34007l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C12772l c12772l2 = new C12772l(str, 2);
                c12772l2.loadAd = abstractC9694l.m2722l();
                this.f34007l = 1;
                Object objAdmob2 = AbstractC8189l.admob(c12772l2, this);
                return objAdmob2 == enumC9342l ? enumC9342l : objAdmob2;
            case 3:
                int i8 = this.f34007l;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i8 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.f23171l = true;
                C16552l c16552l4 = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l2 = ExecutorC6708l.f14063l;
                C17455l c17455l2 = new C17455l(str, abstractC9694l, interfaceC14029l, i4);
                this.f34007l = 1;
                obj = AbstractC10999l.firebase(executorC6708l2, c17455l2, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l5 = AbstractC11463l.yandex;
                C2975l c2975l4 = AbstractC17278l.yandex.f6462l;
                C8111l c8111l = new C8111l(abstractC9694l, (Catalog2Response) obj, null, 0);
                this.f34007l = 2;
                if (AbstractC10999l.firebase(c2975l4, c8111l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 4:
                int i9 = this.f34007l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else if (i9 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C16552l c16552l6 = AbstractC11463l.yandex;
                        c2975l2 = AbstractC17278l.yandex;
                        c10481l = new C10481l(abstractC9694l, interfaceC14029l, i2);
                        this.f34007l = 3;
                        if (AbstractC10999l.firebase(c2975l2, c10481l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i9 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l = new C16534l(str, 5);
                this.f34007l = 1;
                if (c16534l.ads(this) == enumC9342l) {
                    return enumC9342l;
                }
                C6760l c6760l = C9658l.f19699l;
                long jTapsense = AbstractC15918l.tapsense(2, enumC16636l);
                this.f34007l = 2;
                if (AbstractC8532l.billing(jTapsense, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l7 = AbstractC11463l.yandex;
                c2975l2 = AbstractC17278l.yandex;
                c10481l = new C10481l(abstractC9694l, interfaceC14029l, i2);
                this.f34007l = 3;
                if (AbstractC10999l.firebase(c2975l2, c10481l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 5:
                int i10 = this.f34007l;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C12772l c12772l3 = new C12772l(str, 13);
                c12772l3.loadAd = abstractC9694l.m2722l();
                this.f34007l = 1;
                Object objAdmob3 = AbstractC8189l.admob(c12772l3, this);
                return objAdmob3 == enumC9342l ? enumC9342l : objAdmob3;
            default:
                int i11 = this.f34007l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else if (i11 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C16552l c16552l8 = AbstractC11463l.yandex;
                        c2975l3 = AbstractC17278l.yandex;
                        c10481l2 = new C10481l(abstractC9694l, interfaceC14029l, i3);
                        this.f34007l = 3;
                        if (AbstractC10999l.firebase(c2975l3, c10481l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i11 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l2 = new C16534l(str, 28);
                this.f34007l = 1;
                if (c16534l2.ads(this) == enumC9342l) {
                    return enumC9342l;
                }
                C6760l c6760l2 = C9658l.f19699l;
                long jTapsense2 = AbstractC15918l.tapsense(2, enumC16636l);
                this.f34007l = 2;
                if (AbstractC8532l.billing(jTapsense2, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l9 = AbstractC11463l.yandex;
                c2975l3 = AbstractC17278l.yandex;
                c10481l2 = new C10481l(abstractC9694l, interfaceC14029l, i3);
                this.f34007l = 3;
                if (AbstractC10999l.firebase(c2975l3, c10481l2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34006l;
        AbstractC9694l abstractC9694l = this.f34004l;
        String str = this.f34005l;
        switch (i) {
            case 0:
                return new C17455l(str, abstractC9694l, interfaceC14029l, 0);
            case 1:
                return new C17455l(abstractC9694l, str, interfaceC14029l, 1);
            case 2:
                return new C17455l(str, abstractC9694l, interfaceC14029l, 2);
            case 3:
                return new C17455l(abstractC9694l, str, interfaceC14029l, 3);
            case 4:
                return new C17455l(str, abstractC9694l, interfaceC14029l, 4);
            case 5:
                return new C17455l(str, abstractC9694l, interfaceC14029l, 5);
            default:
                return new C17455l(str, abstractC9694l, interfaceC14029l, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34006l) {
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
            case 5:
                break;
        }
        return ((C17455l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17455l(String str, AbstractC9694l abstractC9694l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34006l = i;
        this.f34005l = str;
        this.f34004l = abstractC9694l;
    }
}
