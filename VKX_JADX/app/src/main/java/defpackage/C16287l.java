package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Stack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16287l {
    public static final C5991l amazon;
    public static final C8634l crashlytics;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C16287l yandex;

    static {
        C0114l c0114l = new C0114l(C16287l.class, "otaAllowBetas", "getOtaAllowBetas()Z", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        loadAd = new InterfaceC13922l[]{c2336l.billing(c0114l), c2336l.billing(new C0114l(C16287l.class, "deviceID", "getDeviceID()Ljava/lang/String;", 0))};
        yandex = new C16287l();
        SharedPreferences sharedPreferences = AbstractC3957l.purchase;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        C8688l c8688l = C2490l.subs;
        crashlytics = new C8634l(sharedPreferences, "ota_allow_beta", true ^ AbstractC12832l.crashlytics().loadAd.ads(), 3);
        SharedPreferences sharedPreferences2 = AbstractC3957l.purchase;
        amazon = new C5991l(sharedPreferences2 != null ? sharedPreferences2 : null, "device_id_v2", "", 7);
    }

    public static String amazon() {
        C7644l c7644l = VKXApplication.f36633l;
        if (c7644l == null) {
            c7644l = null;
        }
        return ((C4645l) c7644l.f15735l).mopub;
    }

    public static long crashlytics() {
        C7644l c7644l = VKXApplication.f36633l;
        if (c7644l == null) {
            c7644l = null;
        }
        return ((C4645l) c7644l.f15735l).yandex;
    }

    public static void purchase(Activity activity) {
        AbstractC16584l.yandex().yandex();
        C3544l c3544l = C3544l.yandex;
        C3544l.loadAd.loadAd();
        C7644l c7644l = VKXApplication.f36633l;
        if (c7644l == null) {
            c7644l = null;
        }
        c7644l.getClass();
        c7644l.f15734l = new C4324l();
        C4645l.Companion.getClass();
        c7644l.f15735l = C4645l.smaato;
        C7026l c7026l = (C7026l) c7644l.f15742l;
        C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
        if (c6232lAdcel != null) {
            AbstractC7470l.ads(c7026l, new C6232l(0L, c6232lAdcel.loadAd));
        }
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        c16076l.ads();
        if (!(activity instanceof AppActivity)) {
            activity.finish();
            return;
        }
        AppActivity appActivity = (AppActivity) activity;
        C2814l c2814l = appActivity.f36637l;
        C13530l c13530l = appActivity.f36642l;
        c13530l.crashlytics.admob();
        c13530l.crashlytics();
        ((FrameLayout) c2814l.yandex.f36640l.f15740l).removeAllViews();
        FrameLayout[] frameLayoutArr = c2814l.purchase;
        int length = frameLayoutArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FrameLayout frameLayout = frameLayoutArr[i];
            int i3 = i2 + 1;
            if (frameLayout != null) {
                ((C9967l) frameLayout.getChildAt(0)).vip(new Stack(), true);
                frameLayoutArr[i2] = null;
            }
            i++;
            i2 = i3;
        }
        c2814l.loadAd(false);
        AppActivity appActivity2 = c2814l.yandex;
        AbstractC5833l.purchase((LinearLayout) appActivity2.f36640l.f15739l);
        AbstractC5833l.purchase((CoordinatorLayout) appActivity2.f36640l.f15741l);
        c2814l.purchase(EnumC12111l.f24084l, false);
    }

    public static boolean yandex() {
        C7644l c7644l = VKXApplication.f36633l;
        if (c7644l == null) {
            c7644l = null;
        }
        return ((C4645l) c7644l.f15735l).yandex != 0;
    }

    public final boolean loadAd() {
        InterfaceC13922l interfaceC13922l = loadAd[0];
        return ((Boolean) crashlytics.pro(this)).booleanValue();
    }
}
