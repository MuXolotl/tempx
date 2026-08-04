package defpackage;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lُۣۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11443l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f23029l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23030l;

    public /* synthetic */ RunnableC11443l(AppActivity appActivity, int i) {
        this.f23030l = i;
        this.f23029l = appActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23030l;
        AppActivity appActivity = this.f23029l;
        switch (i) {
            case 0:
                C10975l c10975l = appActivity.f36636l;
                Intent intent = appActivity.getIntent();
                c10975l.getClass();
                C10975l.applovin(intent);
                break;
            case 1:
                C2814l c2814l = appActivity.f36637l;
                AppActivity appActivity2 = c2814l.yandex;
                AbstractC5833l.purchase((LinearLayout) appActivity2.f36640l.f15739l);
                AbstractC5833l.purchase((CoordinatorLayout) appActivity2.f36640l.f15741l);
                c2814l.purchase(EnumC12111l.f24084l, false);
                break;
            default:
                int i2 = AppActivity.f36635l;
                appActivity.f5599l.remoteconfig(new C15191l((String) null, new C1990l(10)));
                break;
        }
    }
}
