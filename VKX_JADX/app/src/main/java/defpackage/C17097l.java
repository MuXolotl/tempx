package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17097l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f33266l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f33267l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33268l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17097l(int i, AppActivity appActivity, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f33268l = 2;
        this.f33269l = i;
        this.f33267l = appActivity;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f33268l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        AppActivity appActivity = this.f33267l;
        switch (i) {
            case 0:
                C8949l c8949l = (C8949l) this.f33266l;
                int i2 = this.f33269l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC13209l.purchase.amazon) {
                        InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
                        this.f33266l = c8949l;
                        this.f33269l = 1;
                        obj = AbstractC0622l.firebase(interfaceC6942lYandex, this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                if (((C18554l) obj).f36227l != EnumC10468l.THEME) {
                    if (c8949l.yandex) {
                        int i3 = AppActivity.f36635l;
                        C6124l c6124lAppmetrica = appActivity.appmetrica();
                        c6124lAppmetrica.loadAd(true);
                        c6124lAppmetrica.yandex(true);
                    } else {
                        int i4 = AppActivity.f36635l;
                        C6124l c6124lAppmetrica2 = appActivity.appmetrica();
                        c6124lAppmetrica2.loadAd(false);
                        c6124lAppmetrica2.yandex(false);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C12741l c12741l = (C12741l) this.f33266l;
                int i5 = this.f33269l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex2 = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
                    this.f33266l = c12741l;
                    this.f33269l = 1;
                    obj = AbstractC0622l.firebase(interfaceC6942lYandex2, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                if (((C18554l) obj).f36215l) {
                    if (c12741l.yandex) {
                        int i6 = AppActivity.f36635l;
                        appActivity.appmetrica().yandex.crashlytics();
                    } else {
                        int i7 = AppActivity.f36635l;
                        appActivity.appmetrica().yandex.billing();
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                int i8 = this.f33269l;
                int iBilling = AbstractC8576l.billing(i8, new C8934l(200, 700, 1));
                int i9 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i8 != 0 && iBilling != ((C6453l) appActivity.getResources()).yandex.getDisplayMetrics().densityDpi) {
                    Configuration configuration = ((C6453l) appActivity.getResources()).yandex.getConfiguration();
                    configuration.densityDpi = iBilling;
                    appActivity.getResources().updateConfiguration(configuration, ((C6453l) appActivity.getResources()).yandex.getDisplayMetrics());
                    appActivity.recreate();
                } else if (i8 == 0 && ((C6453l) appActivity.getResources()).yandex.getDisplayMetrics().densityDpi != i9) {
                    Configuration configuration2 = ((C6453l) appActivity.getResources()).yandex.getConfiguration();
                    configuration2.densityDpi = Resources.getSystem().getDisplayMetrics().densityDpi;
                    appActivity.getResources().updateConfiguration(configuration2, ((C6453l) appActivity.getResources()).yandex.getDisplayMetrics());
                    appActivity.recreate();
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f33268l;
        AppActivity appActivity = this.f33267l;
        switch (i) {
            case 0:
                C17097l c17097l = new C17097l(appActivity, interfaceC14029l, 0);
                c17097l.f33266l = obj;
                return c17097l;
            case 1:
                C17097l c17097l2 = new C17097l(appActivity, interfaceC14029l, 1);
                c17097l2.f33266l = obj;
                return c17097l2;
            default:
                C17097l c17097l3 = new C17097l(this.f33269l, appActivity, interfaceC14029l);
                c17097l3.f33266l = obj;
                return c17097l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33268l) {
            case 0:
                return ((C17097l) ads((InterfaceC14029l) obj2, (C8949l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C17097l) ads((InterfaceC14029l) obj2, (C12741l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C17097l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17097l(AppActivity appActivity, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33268l = i;
        this.f33267l = appActivity;
    }
}
