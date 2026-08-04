package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: lٗؓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16865l implements InterfaceC15189l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16865l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                C4652l c4652l = (C4652l) obj;
                return c4652l.billing.remoteconfig(new C11644l(c4652l, (C15615l) obj2));
            case 1:
                return new C4595l((Context) obj2, (String) obj);
            default:
                C14184l c14184l = (C14184l) obj2;
                Context contextAdmob = (Context) obj;
                String strAmazon = c14184l.amazon();
                C1261l c1261l = new C1261l();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    contextAdmob = i2 >= 24 ? AbstractC11965l.admob(contextAdmob) : null;
                }
                SharedPreferences sharedPreferences = contextAdmob.getSharedPreferences("com.google.firebase.common.prefs:".concat(strAmazon), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextAdmob.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextAdmob.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c1261l.yandex = z;
                return c1261l;
        }
    }
}
