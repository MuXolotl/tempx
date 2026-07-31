package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.service.AutostartReceiver;

/* JADX INFO: renamed from: lِۥؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12230l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f24282l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24283l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24284l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12230l(AppActivity appActivity, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f24283l = i;
        this.f24282l = appActivity;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f24283l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        AppActivity appActivity = this.f24282l;
        switch (i) {
            case 0:
                int i2 = this.f24284l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f24284l = 1;
                    if (C15224l.yandex.yandex(appActivity, (4 & 2) == 0, (4 & 4) == 0, this) == enumC9342l) {
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
                int i3 = this.f24284l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16968l c16968l = AutostartReceiver.yandex;
                    Context applicationContext = appActivity.getApplicationContext();
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    Boolean bool = Boolean.FALSE;
                    this.f24284l = 1;
                    if (c16968l.amazon(applicationContext, interfaceC15829l, C17565l.yandex, bool, this) == enumC9342l) {
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
                int i4 = this.f24284l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16968l c16968l2 = AutostartReceiver.yandex;
                    Context applicationContext2 = appActivity.getApplicationContext();
                    InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    Boolean bool2 = Boolean.TRUE;
                    this.f24284l = 1;
                    if (c16968l2.amazon(applicationContext2, interfaceC15829l2, C17565l.yandex, bool2, this) == enumC9342l) {
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
            default:
                int i5 = this.f24284l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC15829l interfaceC15829l3 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                this.f24284l = 1;
                obj = AbstractC16655l.admob(interfaceC15829l3, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                C7968l c7968l = (C7968l) obj;
                if (c7968l == null) {
                    return Unit.INSTANCE;
                }
                boolean z = c7968l.f16616l == null && c7968l.f16620l == null;
                if (z && !c7968l.f16618l) {
                    return Unit.INSTANCE;
                }
                if (c7968l.f16619l) {
                    C16968l c16968l3 = AutostartReceiver.yandex;
                    Context applicationContext3 = appActivity.getApplicationContext();
                    InterfaceC15829l interfaceC15829l4 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3606l;
                    this.f24284l = 2;
                    if (c16968l3.amazon(applicationContext3, interfaceC15829l4, C17565l.yandex, null, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    C16552l c16552l = AbstractC11463l.yandex;
                    C2975l c2975l = AbstractC17278l.yandex.f6462l;
                    C7087l c7087l = new C7087l(c7968l, appActivity, z, null);
                    this.f24284l = 3;
                    if (AbstractC10999l.firebase(c2975l, c7087l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f24283l;
        AppActivity appActivity = this.f24282l;
        switch (i) {
            case 0:
                return new C12230l(appActivity, interfaceC14029l, 0);
            case 1:
                return new C12230l(appActivity, interfaceC14029l, 1);
            case 2:
                return new C12230l(appActivity, interfaceC14029l, 2);
            default:
                return new C12230l(appActivity, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f24283l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C12230l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
