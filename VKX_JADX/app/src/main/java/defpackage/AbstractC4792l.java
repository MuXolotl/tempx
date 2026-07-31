package defpackage;

/* JADX INFO: renamed from: lَؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4792l {
    public static final C3624l loadAd;
    public static final C2312l yandex;

    static {
        C2312l c2312l = new C2312l("kotlin.jvm.JvmField");
        yandex = c2312l;
        C8565l.ad(c2312l);
        C8565l.ad(new C2312l("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        loadAd = C8565l.adcel("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final boolean loadAd(String str) {
        if (AbstractC16648l.isVip(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (AbstractC8576l.subs(97, cCharAt) > 0 || AbstractC8576l.subs(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final String yandex(String str) {
        return loadAd(str) ? str : "get".concat(AbstractC15901l.yandex(str));
    }
}
