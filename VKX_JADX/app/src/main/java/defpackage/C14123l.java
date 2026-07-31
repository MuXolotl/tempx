package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lْٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14123l {
    public static boolean crashlytics() {
        C8688l c8688l = C2490l.subs;
        return !AbstractC12832l.crashlytics().loadAd.ads();
    }

    public static void loadAd(AppActivity appActivity) {
        if (!crashlytics()) {
            AbstractC10999l.mopub(AbstractC11990l.firebase(appActivity), null, 0, new C7631l(2, null), 3);
            return;
        }
        AbstractC5833l.purchase((LinearLayout) appActivity.f36640l.f15739l);
        AbstractC5833l.purchase((CoordinatorLayout) appActivity.f36640l.f15741l);
        appActivity.f36637l.purchase(EnumC12111l.f24081l, true);
        AbstractC10999l.mopub(AbstractC11990l.firebase(appActivity), null, 0, new C9726l(appActivity, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public static final void yandex(AppActivity appActivity) {
        EnumC18423l enumC18423l;
        EnumC12111l enumC12111l;
        AbstractC5833l.subs((LinearLayout) appActivity.f36640l.f15739l);
        AbstractC5833l.subs((CoordinatorLayout) appActivity.f36640l.f15741l);
        appActivity.f36637l.loadAd(true);
        if (AbstractC8576l.yandex(appActivity.getPackageName(), "ua.itaysonlab.vkx")) {
            C16287l.yandex.getClass();
            if (!C16287l.yandex() || C2491l.yandex.loadAd()) {
                enumC18423l = EnumC18423l.OrbitPlayer;
            } else {
                enumC18423l = EnumC18423l.VKX;
            }
        } else {
            enumC18423l = EnumC18423l.OrbitPlayer;
        }
        int iOrdinal = enumC18423l.ordinal();
        if (iOrdinal == 0) {
            NextDockView nextDockView = (NextDockView) appActivity.f36640l.f15742l;
            nextDockView.post(new RunnableC10311l(nextDockView, String.valueOf(5), 1));
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
            NextDockView nextDockView2 = (NextDockView) appActivity.f36640l.f15742l;
            VKXApplication.Companion companion = VKXApplication.f36628l;
            if (VKXApplication.Companion.crashlytics()) {
                EnumC12111l[] enumC12111lArr = (EnumC12111l[]) C11538l.f23209l.f833l;
                enumC12111l = enumC12111lArr[AbstractC8576l.billing(C2491l.yandex.yandex(), new C8934l(0, enumC12111lArr.length - 1, 1))];
            } else {
                enumC12111l = EnumC12111l.f24083l;
            }
            nextDockView2.post(new RunnableC10311l(nextDockView2, String.valueOf(enumC12111l.ordinal()), 1));
        }
    }
}
