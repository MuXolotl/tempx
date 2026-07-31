package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: lٗۥٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17537l {
    public static void loadAd(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC12812l.yandex.Companion.getClass();
            C9930l.yandex(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC12812l(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void yandex(Activity activity, EnumC14812l enumC14812l) {
        if (activity instanceof InterfaceC3177l) {
            AbstractC6475l abstractC6475lLoadAd = ((InterfaceC3177l) activity).loadAd();
            if (abstractC6475lLoadAd instanceof C5268l) {
                ((C5268l) abstractC6475lLoadAd).purchase(enumC14812l);
            }
        }
    }
}
