package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7052l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0675l f14783l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f14784l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7052l(C0675l c0675l, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f14784l = 6;
        this.f14783l = c0675l;
        this.f14785l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f14784l;
        int i2 = 21;
        int i3 = 0;
        int i4 = 2;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C0675l c0675l = this.f14783l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i5 = this.f14785l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8688l c8688l = AbstractC0085l.yandex;
                    AbstractC0085l abstractC0085lLoadAd = AbstractC8182l.loadAd();
                    c0675l.f2150l.setValue(new C16275l(abstractC0085lLoadAd.amazon(), abstractC0085lLoadAd instanceof C2659l ? AbstractC5941l.premium(c0675l.isVip(), ((C2659l) abstractC0085lLoadAd).loadAd().getAbsolutePath()) : AbstractC5941l.inmobi(c0675l.isVip())));
                    this.f14785l = 1;
                    if (C0675l.m664instanceof(c0675l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i6 = this.f14785l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (((C8147l) c0675l.f2152l.getValue()) == null) {
                        C16552l c16552l = AbstractC11463l.yandex;
                        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                        C7052l c7052l = new C7052l(c0675l, interfaceC14029l, i3);
                        this.f14785l = 1;
                        if (AbstractC10999l.firebase(executorC6708l, c7052l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i7 = this.f14785l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i7 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l2 = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l2 = ExecutorC6708l.f14063l;
                C0071l c0071l = new C0071l(i4, interfaceC14029l, 10);
                this.f14785l = 1;
                if (AbstractC10999l.firebase(executorC6708l2, c0071l, this) == enumC9342l) {
                    return enumC9342l;
                }
                this.f14785l = 2;
                if (C0675l.m664instanceof(c0675l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 3:
                int i8 = this.f14785l;
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
                C16552l c16552l3 = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l3 = ExecutorC6708l.f14063l;
                C18160l c18160l = new C18160l(i4, interfaceC14029l, 18);
                this.f14785l = 1;
                if (AbstractC10999l.firebase(executorC6708l3, c18160l, this) == enumC9342l) {
                    return enumC9342l;
                }
                this.f14785l = 2;
                if (C0675l.m664instanceof(c0675l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 4:
                int i9 = this.f14785l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i9 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l4 = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l4 = ExecutorC6708l.f14063l;
                C18160l c18160l2 = new C18160l(i4, interfaceC14029l, 19);
                this.f14785l = 1;
                if (AbstractC10999l.firebase(executorC6708l4, c18160l2, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l5 = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex;
                C14019l c14019l = new C14019l(c0675l, interfaceC14029l, i2);
                this.f14785l = 2;
                if (AbstractC10999l.firebase(c2975l, c14019l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 5:
                int i10 = this.f14785l;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i10 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f14785l = 1;
                C6336l c6336l = C6336l.yandex;
                obj = C6336l.billing(new C8578l(6), this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l6 = AbstractC11463l.yandex;
                C2975l c2975l2 = AbstractC17278l.yandex;
                C7864l c7864l = new C7864l(c0675l, (List) obj, interfaceC14029l, 22);
                this.f14785l = 2;
                if (AbstractC10999l.firebase(c2975l2, c7864l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                if (c0675l.isVip() != null) {
                    AbstractC11708l.yandex(new C15245l(0, (AppActivity) c0675l.isVip(), c0675l.isVip().getResources().getString(R.string.storage_cleanup_toast, new Integer(this.f14785l))));
                }
                return Unit.INSTANCE;
            default:
                int i11 = this.f14785l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(obj);
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
                this.f14785l = 1;
                C8578l c8578l = new C8578l(i2);
                C16552l c16552l7 = AbstractC11463l.yandex;
                obj = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0932l(c8578l, interfaceC14029l, 14), this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                int iIntValue = ((Number) obj).intValue();
                C16552l c16552l8 = AbstractC11463l.yandex;
                C2975l c2975l3 = AbstractC17278l.yandex.f6462l;
                C7052l c7052l2 = new C7052l(c0675l, iIntValue, (InterfaceC14029l) null);
                this.f14785l = 2;
                if (AbstractC10999l.firebase(c2975l3, c7052l2, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f14784l;
        C0675l c0675l = this.f14783l;
        switch (i) {
            case 0:
                return new C7052l(c0675l, interfaceC14029l, 0);
            case 1:
                return new C7052l(c0675l, interfaceC14029l, 1);
            case 2:
                return new C7052l(c0675l, interfaceC14029l, 2);
            case 3:
                return new C7052l(c0675l, interfaceC14029l, 3);
            case 4:
                return new C7052l(c0675l, interfaceC14029l, 4);
            case 5:
                return new C7052l(c0675l, interfaceC14029l, 5);
            case 6:
                return new C7052l(c0675l, this.f14785l, interfaceC14029l);
            default:
                return new C7052l(c0675l, interfaceC14029l, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f14784l) {
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
            case 6:
                break;
        }
        return ((C7052l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7052l(C0675l c0675l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f14784l = i;
        this.f14783l = c0675l;
    }
}
