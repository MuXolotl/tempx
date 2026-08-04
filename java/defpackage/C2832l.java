package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lؔۖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2832l implements InterfaceC4138l {
    public final C10086l amazon = AbstractC8020l.smaato(yandex());
    public final Activity crashlytics;
    public final Context loadAd;
    public AbstractC15422l purchase;
    public final String yandex;

    public C2832l(String str, Context context, Activity activity) {
        this.yandex = str;
        this.loadAd = context;
        this.crashlytics = activity;
    }

    @Override // defpackage.InterfaceC4138l
    public final InterfaceC12152l amazon() {
        return (InterfaceC12152l) this.amazon.getValue();
    }

    @Override // defpackage.InterfaceC4138l
    public final void purchase() {
        AbstractC15422l abstractC15422l = this.purchase;
        if (abstractC15422l != null) {
            abstractC15422l.amazon(this.yandex);
        } else {
            C8339l.smaato("ActivityResultLauncher cannot be null");
        }
    }

    public final InterfaceC12152l yandex() {
        boolean zShouldShowRequestPermissionRationale;
        Context context = this.loadAd;
        String str = this.yandex;
        if (AbstractC7720l.loadAd(context, str) == 0) {
            return C17306l.yandex;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zShouldShowRequestPermissionRationale2 = false;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            Activity activity = this.crashlytics;
            if (i < 32 && i == 31) {
                try {
                    zShouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    zShouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                }
                zShouldShowRequestPermissionRationale2 = zShouldShowRequestPermissionRationale;
            } else {
                zShouldShowRequestPermissionRationale2 = activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return new C8762l(zShouldShowRequestPermissionRationale2);
    }
}
