package defpackage;

import android.content.ComponentName;
import android.content.Context;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14147l {
    public static ComponentName loadAd(Context context, EnumC0442l enumC0442l) {
        return new ComponentName(context.getPackageName(), "ua.itaysonlab.vkx.VkxIcon" + enumC0442l.f1621l);
    }

    public static boolean yandex(VKXApplication vKXApplication, EnumC0442l enumC0442l) {
        int componentEnabledSetting = vKXApplication.getPackageManager().getComponentEnabledSetting(loadAd(vKXApplication, enumC0442l));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && enumC0442l == EnumC0442l.Default);
    }
}
