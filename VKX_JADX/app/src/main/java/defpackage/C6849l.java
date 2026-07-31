package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙۣۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6849l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6849l f14310l = new C6849l(1, AbstractC6660l.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && AbstractC7720l.loadAd(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return Build.VERSION.SDK_INT > 23 ? new C11624l(connectivityManager, 1) : new C11624l(connectivityManager, 0);
            } catch (Exception unused) {
            }
        }
        return InterfaceC9974l.yandex;
    }
}
