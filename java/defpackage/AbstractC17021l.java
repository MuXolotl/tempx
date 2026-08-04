package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٍٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17021l {
    public static final Field amazon;
    public static final Field billing;
    public static final Field crashlytics;
    public static final Method loadAd;
    public static final Field purchase;
    public static final boolean yandex;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        loadAd = method;
                        crashlytics = field;
                        amazon = field2;
                        purchase = field3;
                        billing = field4;
                        yandex = true;
                        return;
                    }
                    loadAd = null;
                    crashlytics = null;
                    amazon = null;
                    purchase = null;
                    billing = null;
                    yandex = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        loadAd = method;
                        crashlytics = field;
                        amazon = field2;
                        purchase = field3;
                        billing = field4;
                        yandex = true;
                        return;
                    }
                    loadAd = null;
                    crashlytics = null;
                    amazon = null;
                    purchase = null;
                    billing = null;
                    yandex = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        loadAd = method;
                        crashlytics = field;
                        amazon = field2;
                        purchase = field3;
                        billing = field4;
                        yandex = true;
                        return;
                    }
                    loadAd = null;
                    crashlytics = null;
                    amazon = null;
                    purchase = null;
                    billing = null;
                    yandex = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    loadAd = method;
                    crashlytics = field;
                    amazon = field2;
                    purchase = field3;
                    billing = field4;
                    yandex = true;
                    return;
                }
                loadAd = null;
                crashlytics = null;
                amazon = null;
                purchase = null;
                billing = null;
                yandex = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    loadAd = method;
                    crashlytics = field;
                    amazon = field2;
                    purchase = field3;
                    billing = field4;
                    yandex = true;
                    return;
                }
                loadAd = null;
                crashlytics = null;
                amazon = null;
                purchase = null;
                billing = null;
                yandex = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    loadAd = method;
                    crashlytics = field;
                    amazon = field2;
                    purchase = field3;
                    billing = field4;
                    yandex = true;
                    return;
                }
                loadAd = null;
                crashlytics = null;
                amazon = null;
                purchase = null;
                billing = null;
                yandex = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z) {
            loadAd = method;
            crashlytics = field;
            amazon = field2;
            purchase = field3;
            billing = field4;
            yandex = true;
            return;
        }
        loadAd = null;
        crashlytics = null;
        amazon = null;
        purchase = null;
        billing = null;
        yandex = false;
    }
}
