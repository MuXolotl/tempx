package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lؚۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7306l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f15153l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f15154l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15155l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7306l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f15155l = i;
        this.f15153l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x045b A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #3 {all -> 0x0538, blocks: (B:205:0x03f8, B:238:0x04a9, B:240:0x04c3, B:249:0x0505, B:251:0x051f, B:225:0x0441, B:227:0x045b), top: B:263:0x03e0 }] */
    /* JADX WARN: Code duplicated, block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        InterfaceC9354l interfaceC9354lStartapp;
        Object objAmazon;
        Object objFirebase;
        Object objFirebase2;
        Object objInvoke;
        C2975l c2975l;
        C11025l c11025l;
        AbstractC13306l abstractC13306l;
        int i = this.f15155l;
        int i2 = 7;
        int i3 = 0;
        int i4 = 3;
        int i5 = 2;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        AbstractC13306l abstractC13306l2 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = (AbstractC12074l) this.f15153l;
                Throwable th = this.f15156l;
                int i6 = 4;
                try {
                    try {
                        try {
                            try {
                                try {
                                    switch (th) {
                                        case 0:
                                            AbstractC2829l.crashlytics(obj);
                                            C6208l c6208l = new C6208l(((InterfaceC9955l) abstractC12074l.f24000l).mo1553throw(), (InterfaceC9955l) abstractC12074l.f24000l, b == true ? 1 : 0, i2);
                                            this.f15153l = abstractC12074l;
                                            this.f15154l = null;
                                            this.f15156l = 1;
                                            if (AbstractC13841l.loadAd(c6208l, this) == enumC9342l) {
                                                return enumC9342l;
                                            }
                                            th = AbstractC10433l.isPro((String) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) abstractC12074l.f24000l).billing())).f2974l).loadAd;
                                            if (th == 1) {
                                                interfaceC9354lStartapp = ((InterfaceC9955l) abstractC12074l.f24000l).billing().startapp();
                                                this.f15153l = null;
                                                this.f15154l = null;
                                                this.f15156l = 2;
                                                if (AbstractC10310l.subs(interfaceC9354lStartapp, Long.MAX_VALUE, this) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 1:
                                            AbstractC2829l.crashlytics(obj);
                                            th = AbstractC10433l.isPro((String) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) abstractC12074l.f24000l).billing())).f2974l).loadAd;
                                            if (th == 1) {
                                                interfaceC9354lStartapp = ((InterfaceC9955l) abstractC12074l.f24000l).billing().startapp();
                                                this.f15153l = null;
                                                this.f15154l = null;
                                                this.f15156l = 2;
                                                if (AbstractC10310l.subs(interfaceC9354lStartapp, Long.MAX_VALUE, this) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 2:
                                        case 4:
                                        case 7:
                                            AbstractC2829l.crashlytics(obj);
                                            return Unit.INSTANCE;
                                        case 3:
                                            AbstractC2829l.crashlytics(obj);
                                            if (AbstractC10433l.isPro((String) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) abstractC12074l.f24000l).billing())).f2974l).loadAd == 1) {
                                                InterfaceC9354l interfaceC9354lStartapp2 = ((InterfaceC9955l) abstractC12074l.f24000l).billing().startapp();
                                                this.f15153l = null;
                                                this.f15154l = null;
                                                this.f15156l = 4;
                                                if (AbstractC10310l.subs(interfaceC9354lStartapp2, Long.MAX_VALUE, this) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 5:
                                        case 6:
                                            AbstractC2829l.crashlytics(obj);
                                            if (AbstractC10433l.isPro((String) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) abstractC12074l.f24000l).billing())).f2974l).loadAd == 1) {
                                                InterfaceC9354l interfaceC9354lStartapp3 = ((InterfaceC9955l) abstractC12074l.f24000l).billing().startapp();
                                                this.f15153l = null;
                                                this.f15154l = null;
                                                this.f15156l = 7;
                                                if (AbstractC10310l.subs(interfaceC9354lStartapp3, Long.MAX_VALUE, this) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        case 8:
                                            th = (Throwable) this.f15154l;
                                            AbstractC2829l.crashlytics(obj);
                                            throw th;
                                        default:
                                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                    }
                                } catch (C7166l e) {
                                    AbstractC13693l.purchase(((InterfaceC9955l) abstractC12074l.f24000l).mo1553throw());
                                    this.f15153l = abstractC12074l;
                                    this.f15154l = null;
                                    this.f15156l = 3;
                                    Object objSignature = new C1474l(abstractC12074l, e, this, i6).Signature(Unit.INSTANCE);
                                    if (objSignature != enumC9342l) {
                                        objSignature = Unit.INSTANCE;
                                    }
                                    if (objSignature == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                            } catch (Throwable th2) {
                                C17239l c17239l = (C17239l) ((InterfaceC9955l) abstractC12074l.f24000l).getAttributes().billing(AbstractC5708l.crashlytics);
                                if (c17239l != null) {
                                    this.f15153l = abstractC12074l;
                                    this.f15154l = null;
                                    this.f15156l = 5;
                                    if (AbstractC14760l.purchase(c17239l, th2, this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    InterfaceC9955l interfaceC9955l = (InterfaceC9955l) abstractC12074l.f24000l;
                                    this.f15153l = abstractC12074l;
                                    this.f15154l = null;
                                    this.f15156l = 6;
                                    if (AbstractC14760l.purchase(interfaceC9955l, th2, this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (AbstractC10433l.isPro((String) ((C1080l) AbstractC5715l.yandex(((InterfaceC9955l) abstractC12074l.f24000l).billing())).f2974l).loadAd == 1) {
                            InterfaceC9354l interfaceC9354lStartapp4 = ((InterfaceC9955l) abstractC12074l.f24000l).billing().startapp();
                            this.f15153l = null;
                            this.f15154l = th;
                            this.f15156l = 8;
                            if (AbstractC10310l.subs(interfaceC9354lStartapp4, Long.MAX_VALUE, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                break;
            case 1:
                AbstractC12074l abstractC12074l2 = (AbstractC12074l) this.f15153l;
                C0522l c0522l = (C0522l) this.f15154l;
                int i7 = this.f15156l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11310l c11310l = c0522l.yandex;
                    Object obj2 = c0522l.loadAd;
                    if (!(obj2 instanceof InterfaceC9354l)) {
                        return Unit.INSTANCE;
                    }
                    if (AbstractC8576l.yandex(c11310l.yandex, AbstractC18202l.yandex.loadAd(InputStream.class))) {
                        C0522l c0522l2 = new C0522l(c11310l, new C11270l(i5, new C11270l(i3, (InterfaceC9354l) obj2)));
                        this.f15153l = null;
                        this.f15154l = null;
                        this.f15156l = 1;
                        if (abstractC12074l2.purchase(this, c0522l2) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                C14187l c14187l = (C14187l) this.f15154l;
                int i8 = this.f15156l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Function2 function2 = (Function2) this.f15153l;
                    this.f15154l = null;
                    this.f15156l = 1;
                    if (function2.invoke(c14187l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC12074l abstractC12074l3 = (AbstractC12074l) this.f15153l;
                int i9 = this.f15156l;
                try {
                    if (i9 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f15153l = abstractC12074l3;
                        this.f15156l = 1;
                        objAmazon = abstractC12074l3.amazon(this);
                        if (objAmazon == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i9 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objAmazon = obj;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    C1770l c1770l = ((C16864l) this.f15154l).f32923l;
                    C0847l c0847l = AbstractC12704l.f25028l;
                    AbstractC10022l abstractC10022l = ((C14249l) abstractC12074l3.f24000l).f27845l;
                    c1770l.vip(c0847l, new C16936l(i4));
                    throw th4;
                }
            case 4:
                AbstractC10022l abstractC10022l2 = (AbstractC10022l) this.f15154l;
                int i10 = this.f15156l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3422l c3422l = (C3422l) this.f15153l;
                    this.f15154l = null;
                    this.f15156l = 1;
                    if (c3422l.mopub(abstractC10022l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC7523l interfaceC7523l = (InterfaceC7523l) this.f15154l;
                int i11 = this.f15156l;
                InterfaceC14029l interfaceC14029l = null;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objFirebase = obj;
                    } else {
                        if (i11 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f15154l = null;
                this.f15156l = 1;
                objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C11039l(interfaceC7523l, interfaceC14029l, i4), this);
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
                long jLongValue = ((Number) objFirebase).longValue();
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l2 = AbstractC17278l.yandex.f6462l;
                C9040l c9040l = new C9040l((C17284l) this.f15153l, jLongValue, interfaceC14029l, 0);
                this.f15154l = null;
                this.f15156l = 2;
                if (AbstractC10999l.firebase(c2975l2, c9040l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 6:
                C5771l c5771l = (C5771l) this.f15154l;
                InterfaceC9955l interfaceC9955l2 = (InterfaceC9955l) this.f15153l;
                int i12 = this.f15156l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    ArrayList arrayList = ((C9452l) c5771l.yandex).yandex;
                    C11310l c11310lYandex = AbstractC11626l.yandex(interfaceC9955l2);
                    InterfaceC1388l interfaceC1388l = c11310lYandex.yandex;
                    if (((C9452l) c5771l.yandex).crashlytics.contains(interfaceC1388l)) {
                        AbstractC8566l.yandex.vip("Skipping for request type " + interfaceC1388l + " because the type is ignored.");
                        return Unit.INSTANCE;
                    }
                    C1640l c1640l = new C1640l(interfaceC9955l2, arrayList, c11310lYandex, null);
                    this.f15154l = null;
                    this.f15153l = null;
                    this.f15156l = 1;
                    if (c5771l.yandex(c1640l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                AbstractC12074l abstractC12074l4 = (AbstractC12074l) this.f15153l;
                int i13 = this.f15156l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Function4 function4 = (Function4) this.f15154l;
                    C7524l c7524l = new C7524l();
                    Object obj3 = abstractC12074l4.f24000l;
                    Object objCrashlytics = abstractC12074l4.crashlytics();
                    this.f15153l = null;
                    this.f15156l = 1;
                    if (function4.invoke(c7524l, obj3, objCrashlytics, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 8:
                AbstractC12074l abstractC12074l5 = (AbstractC12074l) this.f15153l;
                int i14 = this.f15156l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C0720l c0720l = (C0720l) this.f15154l;
                    this.f15153l = null;
                    this.f15156l = 1;
                    if (c0720l.tapsense(abstractC12074l5, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 9:
                AbstractC12074l abstractC12074l6 = (AbstractC12074l) this.f15153l;
                int i15 = this.f15156l;
                if (i15 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Function2 function3 = (Function2) this.f15154l;
                    Object obj4 = abstractC12074l6.f24000l;
                    this.f15153l = null;
                    this.f15156l = 1;
                    if (function3.invoke(obj4, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i15 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 10:
                C2376l c2376l = (C2376l) this.f15154l;
                AbstractC12074l abstractC12074l7 = (AbstractC12074l) this.f15153l;
                int i16 = this.f15156l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC8576l.yandex(AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l7.f24000l).billing()), c2376l.yandex)) {
                        InterfaceC9955l interfaceC9955l3 = (InterfaceC9955l) abstractC12074l7.f24000l;
                        this.f15153l = null;
                        this.f15156l = 1;
                        if (c2376l.yandex(interfaceC9955l3, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC7523l interfaceC7523l2 = (InterfaceC7523l) this.f15154l;
                int i17 = this.f15156l;
                InterfaceC14029l interfaceC14029l2 = null;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objFirebase2 = obj;
                    } else {
                        if (i17 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f15154l = null;
                this.f15156l = 1;
                objFirebase2 = AbstractC10999l.firebase(AbstractC11463l.yandex, new C11039l(interfaceC7523l2, interfaceC14029l2, i4), this);
                if (objFirebase2 == enumC9342l) {
                    return enumC9342l;
                }
                long jLongValue2 = ((Number) objFirebase2).longValue();
                C16552l c16552l2 = AbstractC11463l.yandex;
                C2975l c2975l3 = AbstractC17278l.yandex.f6462l;
                C9040l c9040l2 = new C9040l((C6111l) this.f15153l, jLongValue2, interfaceC14029l2, 2);
                this.f15154l = null;
                this.f15156l = 2;
                if (AbstractC10999l.firebase(c2975l3, c9040l2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 12:
                AbstractC12074l abstractC12074l8 = (AbstractC12074l) this.f15153l;
                int i18 = this.f15156l;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objInvoke = obj;
                    } else {
                        if (i18 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                Function5 function5 = (Function5) this.f15154l;
                C5450l c5450l = new C5450l();
                Object obj5 = abstractC12074l8.f24000l;
                Object objCrashlytics2 = abstractC12074l8.crashlytics();
                C11310l c11310l2 = (C11310l) ((C6806l) abstractC12074l8.f24000l).billing.billing(AbstractC1891l.yandex);
                this.f15153l = abstractC12074l8;
                this.f15156l = 1;
                objInvoke = function5.invoke(c5450l, obj5, objCrashlytics2, c11310l2, this);
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC8870l abstractC8870l = (AbstractC8870l) objInvoke;
                if (abstractC8870l != null) {
                    this.f15153l = null;
                    this.f15156l = 2;
                    if (abstractC12074l8.purchase(this, abstractC8870l) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            case 13:
                C1930l c1930l = (C1930l) this.f15153l;
                InterfaceC7523l interfaceC7523l3 = (InterfaceC7523l) this.f15154l;
                int i19 = this.f15156l;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else if (i19 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C16552l c16552l3 = AbstractC11463l.yandex;
                        c2975l = AbstractC17278l.yandex;
                        c11025l = new C11025l(c1930l, b3 == true ? 1 : 0, i3);
                        this.f15154l = null;
                        this.f15156l = 3;
                        if (AbstractC10999l.firebase(c2975l, c11025l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i19 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l4 = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C0932l c0932l = new C0932l(c1930l, interfaceC7523l3, b2 == true ? 1 : 0, i2);
                this.f15154l = null;
                this.f15156l = 1;
                if (AbstractC10999l.firebase(executorC6708l, c0932l, this) == enumC9342l) {
                    return enumC9342l;
                }
                C8490l c8490l = AbstractC6025l.yandex;
                this.f15154l = null;
                this.f15156l = 2;
                if (AbstractC6025l.yandex(C3689l.yandex, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l5 = AbstractC11463l.yandex;
                c2975l = AbstractC17278l.yandex;
                c11025l = new C11025l(c1930l, b3 == true ? 1 : 0, i3);
                this.f15154l = null;
                this.f15156l = 3;
                if (AbstractC10999l.firebase(c2975l, c11025l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                int i20 = this.f15156l;
                if (i20 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f15154l;
                    AbstractC13306l[] abstractC13306lArr = (AbstractC13306l[]) ((Object[]) this.f15153l);
                    int length = abstractC13306lArr.length;
                    while (true) {
                        abstractC13306l = C13487l.yandex;
                        if (i3 < length) {
                            AbstractC13306l abstractC13306l3 = abstractC13306lArr[i3];
                            if (AbstractC8576l.yandex(abstractC13306l3, abstractC13306l)) {
                                i3++;
                            } else {
                                abstractC13306l2 = abstractC13306l3;
                            }
                        }
                    }
                    if (abstractC13306l2 != null) {
                        abstractC13306l = abstractC13306l2;
                    }
                    this.f15156l = 1;
                    if (interfaceC9427l.isPro(abstractC13306l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i20 != 1) {
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
        int i = 3;
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        switch (this.f15155l) {
            case 0:
                C7306l c7306l = new C7306l(i, (InterfaceC14029l) obj3, b == true ? 1 : 0);
                c7306l.f15153l = (AbstractC12074l) obj;
                return c7306l.Signature(Unit.INSTANCE);
            case 1:
                C7306l c7306l2 = new C7306l(i, (InterfaceC14029l) obj3, 1);
                c7306l2.f15153l = (AbstractC12074l) obj;
                c7306l2.f15154l = (C0522l) obj2;
                return c7306l2.Signature(Unit.INSTANCE);
            case 2:
                C7306l c7306l3 = new C7306l((Function2) this.f15153l, (InterfaceC14029l) obj3, 2);
                c7306l3.f15154l = (C14187l) obj;
                return c7306l3.Signature(Unit.INSTANCE);
            case 3:
                C7306l c7306l4 = new C7306l((C16864l) this.f15154l, b2 == true ? 1 : 0, (InterfaceC14029l) obj3, i);
                c7306l4.f15153l = (AbstractC12074l) obj;
                return c7306l4.Signature(Unit.INSTANCE);
            case 4:
                C7306l c7306l5 = new C7306l((C3422l) this.f15153l, (InterfaceC14029l) obj3, 4);
                c7306l5.f15154l = (AbstractC10022l) obj2;
                return c7306l5.Signature(Unit.INSTANCE);
            case 5:
                C7306l c7306l6 = new C7306l((C17284l) this.f15153l, (InterfaceC14029l) obj3, 5);
                c7306l6.f15154l = (InterfaceC7523l) obj2;
                return c7306l6.Signature(Unit.INSTANCE);
            case 6:
                C7306l c7306l7 = new C7306l(i, (InterfaceC14029l) obj3, 6);
                c7306l7.f15154l = (C5771l) obj;
                c7306l7.f15153l = (InterfaceC9955l) obj2;
                return c7306l7.Signature(Unit.INSTANCE);
            case 7:
                C7306l c7306l8 = new C7306l((Function4) this.f15154l, b3 == true ? 1 : 0, (InterfaceC14029l) obj3, 7);
                c7306l8.f15153l = (AbstractC12074l) obj;
                return c7306l8.Signature(Unit.INSTANCE);
            case 8:
                C7306l c7306l9 = new C7306l((C0720l) this.f15154l, b4 == true ? 1 : 0, (InterfaceC14029l) obj3, 8);
                c7306l9.f15153l = (AbstractC12074l) obj;
                return c7306l9.Signature(Unit.INSTANCE);
            case 9:
                C7306l c7306l10 = new C7306l((Function2) this.f15154l, b5 == true ? 1 : 0, (InterfaceC14029l) obj3, 9);
                c7306l10.f15153l = (AbstractC12074l) obj;
                return c7306l10.Signature(Unit.INSTANCE);
            case 10:
                C7306l c7306l11 = new C7306l((C2376l) this.f15154l, b6 == true ? 1 : 0, (InterfaceC14029l) obj3, 10);
                c7306l11.f15153l = (AbstractC12074l) obj;
                return c7306l11.Signature(Unit.INSTANCE);
            case 11:
                C7306l c7306l12 = new C7306l((C6111l) this.f15153l, (InterfaceC14029l) obj3, 11);
                c7306l12.f15154l = (InterfaceC7523l) obj2;
                return c7306l12.Signature(Unit.INSTANCE);
            case 12:
                C7306l c7306l13 = new C7306l((Function5) this.f15154l, z, (InterfaceC14029l) obj3, 12);
                c7306l13.f15153l = (AbstractC12074l) obj;
                return c7306l13.Signature(Unit.INSTANCE);
            case 13:
                C7306l c7306l14 = new C7306l((C1930l) this.f15153l, (InterfaceC14029l) obj3, 13);
                c7306l14.f15154l = (InterfaceC7523l) obj2;
                return c7306l14.Signature(Unit.INSTANCE);
            default:
                C7306l c7306l15 = new C7306l(i, (InterfaceC14029l) obj3, 14);
                c7306l15.f15154l = (InterfaceC9427l) obj;
                c7306l15.f15153l = (Object[]) obj2;
                return c7306l15.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7306l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f15155l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7306l(Object obj, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f15155l = i;
        this.f15154l = obj;
    }
}
