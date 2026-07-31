package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9726l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f19841l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f19842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9726l(AppActivity appActivity, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f19842l = appActivity;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19841l;
        AppActivity appActivity = this.f19842l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C5374l c5374l = VKXApplication.f36626l;
            if (c5374l == null) {
                c5374l = null;
            }
            if (((Boolean) ((C7549l) c5374l.billing.admob).f15551l.getValue()).booleanValue()) {
                C14123l.yandex(appActivity);
            }
            C5374l c5374l2 = VKXApplication.f36626l;
            if (c5374l2 == null) {
                c5374l2 = null;
            }
            this.f19841l = 1;
            Object objLoadAd = c5374l2.loadAd(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C5374l c5374l3 = VKXApplication.f36626l;
        if (((Boolean) ((C7549l) (c5374l3 != null ? c5374l3 : null).billing.admob).f15551l.getValue()).booleanValue()) {
            C14123l.yandex(appActivity);
        } else {
            AbstractC5833l.purchase((LinearLayout) appActivity.f36640l.f15739l);
            AbstractC5833l.purchase((CoordinatorLayout) appActivity.f36640l.f15741l);
            appActivity.f36637l.purchase(EnumC12111l.f24081l, true);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C9726l(this.f19842l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9726l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
