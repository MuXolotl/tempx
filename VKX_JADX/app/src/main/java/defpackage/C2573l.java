package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lّؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2573l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17984l f5602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5603l;

    public /* synthetic */ C2573l(C17984l c17984l, int i) {
        this.f5603l = i;
        this.f5602l = c17984l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f5603l;
        C17984l c17984l = this.f5602l;
        switch (i) {
            case 0:
                new C13330l(R.string.auth2_skip_auth_title, R.string.auth2_skip_auth_text, R.string.auth2_skip_auth_action, null, null, new C2573l(c17984l, 2), null, 360).Signature(c17984l.isVip());
                break;
            case 1:
                c17984l.m4125private(new C11562l());
                break;
            default:
                AppActivity appActivity = (AppActivity) c17984l.isVip();
                appActivity.getClass();
                C2491l.yandex.getClass();
                C2491l.billing.advert(C2491l.loadAd[1], Boolean.TRUE);
                C13530l c13530l = appActivity.f36642l;
                c13530l.crashlytics();
                c13530l.crashlytics.admob();
                AbstractC5833l.subs((LinearLayout) appActivity.f36640l.f15739l);
                AbstractC5833l.subs((CoordinatorLayout) appActivity.f36640l.f15741l);
                appActivity.f36637l.amazon(C1722l.f4118l);
                ((NextDockView) appActivity.f36640l.f15742l).loadAd(String.valueOf(5), (6 & 2) != 0, true);
                break;
        }
        return Unit.INSTANCE;
    }
}
