package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؗٛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5003l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f10240l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f10241l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f10242l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5003l(Context context, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f10241l = i;
        this.f10240l = context;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f10241l;
        int i2 = 2;
        Context context = this.f10240l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f10242l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f10242l = 1;
                    try {
                        context.startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + context.getPackageName())));
                    } catch (Exception unused) {
                        context.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                    }
                    if (Unit.INSTANCE == enumC9342l) {
                        return enumC9342l;
                    }
                    break;
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f10242l;
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
                    AbstractC11708l.yandex(new C15245l(0, context, context.getString(R.string.qf_damaged_cache_done, new Integer(((Number) obj).intValue()))));
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f10242l = 1;
                C6336l c6336l = C6336l.yandex;
                obj = C6336l.billing(new C8578l(6), this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C9820l c9820l = new C9820l((List) obj, null);
                this.f10242l = 2;
                obj = AbstractC10999l.firebase(executorC6708l, c9820l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC11708l.yandex(new C15245l(0, context, context.getString(R.string.qf_damaged_cache_done, new Integer(((Number) obj).intValue()))));
                return Unit.INSTANCE;
            case 2:
                int i5 = this.f10242l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i5 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C18404l c18404l = C18404l.yandex;
                this.f10242l = 1;
                if (c18404l.yandex(context, this) == enumC9342l) {
                    return enumC9342l;
                }
                C11610l c11610l = AbstractC3629l.yandex;
                this.f10242l = 2;
                Object objYandex = AbstractC3629l.crashlytics.yandex.yandex(this);
                if (objYandex != enumC9342l) {
                    objYandex = Unit.INSTANCE;
                }
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 3:
                int i6 = this.f10242l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12183l c12183l = new C12183l(context);
                    this.f10242l = 1;
                    if (c12183l.yandex(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i7 = this.f10242l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = AbstractC15925l.yandex(context).yandex();
                    this.f10242l = 1;
                    if (interfaceC6942lYandex.yandex(C0763l.f2284l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i8 = this.f10242l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8565l c8565l = C8565l.f17673l;
                    C11610l c11610l2 = AbstractC3629l.yandex;
                    if (c11610l2 == null) {
                        c11610l2 = null;
                    }
                    this.f10242l = 1;
                    obj = c8565l.firebase(c11610l2, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            return Unit.INSTANCE;
                        }
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                int iOrdinal = ((EnumC9109l) obj).ordinal();
                if (iOrdinal == 0) {
                    Unit unit = Unit.INSTANCE;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    InterfaceC15829l interfaceC15829lYandex = AbstractC15925l.yandex(context);
                    C2051l c2051l = new C2051l(i2, interfaceC14029l, 8);
                    this.f10242l = 2;
                    if (interfaceC15829lYandex.loadAd(c2051l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f10241l;
        Context context = this.f10240l;
        switch (i) {
            case 0:
                return new C5003l(context, interfaceC14029l, 0);
            case 1:
                return new C5003l(context, interfaceC14029l, 1);
            case 2:
                return new C5003l(context, interfaceC14029l, 2);
            case 3:
                return new C5003l(context, interfaceC14029l, 3);
            case 4:
                return new C5003l(context, interfaceC14029l, 4);
            default:
                return new C5003l(context, interfaceC14029l, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f10241l) {
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
        return ((C5003l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
