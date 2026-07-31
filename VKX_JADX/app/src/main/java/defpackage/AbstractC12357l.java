package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: lؘّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12357l {
    public static final String yandex = C14513l.applovin("PackageManagerHelper");

    public static void yandex(Context context, Class cls, boolean z) {
        String str = yandex;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                C14513l.tapsense().vip(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C14513l c14513lTapsense = C14513l.tapsense();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            c14513lTapsense.vip(str, sb.toString());
        } catch (Exception e) {
            C14513l c14513lTapsense2 = C14513l.tapsense();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            c14513lTapsense2.metrica(str, sb2.toString(), e);
        }
    }
}
