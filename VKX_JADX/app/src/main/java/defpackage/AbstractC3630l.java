package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lۣؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3630l {
    public static final HashMap loadAd;
    public static final SharedPreferences yandex;

    static {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        yandex = vKXApplication.getSharedPreferences("toggles_v2_quickfix", 0);
        loadAd = new HashMap();
        C11521l c11521l = new C11521l(0, EnumC14530l.f28448l);
        while (c11521l.hasNext()) {
            EnumC14530l enumC14530l = (EnumC14530l) c11521l.next();
            loadAd.put(enumC14530l, Boolean.valueOf(yandex.getBoolean(enumC14530l.name(), enumC14530l.f28450l)));
        }
        HashMap map = loadAd;
        C16287l.yandex.getClass();
        long jCrashlytics = C16287l.crashlytics();
        C8688l c8688l = C2490l.subs;
        Object[] objArr = ((C2490l) AbstractC12832l.crashlytics().billing.f7072l).yandex;
        if (objArr.length - 1 < 7) {
            C8936l.subs("idx 7 size mismatch");
            return;
        }
        Object obj = objArr[7];
        if (obj == null) {
            C8936l.subs("idx 7 is empty");
        } else if (obj instanceof Integer) {
            map.put(EnumC14530l.f28443l, Boolean.valueOf(jCrashlytics == ((long) ((Integer) obj).intValue())));
        } else {
            C8936l.subs("idx 7 type mismatch");
        }
    }

    public static boolean yandex(EnumC14530l enumC14530l) {
        return ((Boolean) loadAd.get(enumC14530l)).booleanValue();
    }
}
