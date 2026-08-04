package defpackage;

import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: renamed from: lّؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12366l {
    public static final C17150l loadAd = new C17150l(1022);
    public static C5599l yandex;

    public static void amazon(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static synchronized C17781l crashlytics(C17413l c17413l) {
        try {
            if (yandex == null) {
                yandex = new C5599l(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C17781l) yandex.m216l(c17413l);
    }

    public static void loadAd(int i, InterfaceC16922l interfaceC16922l) {
        interfaceC16922l.update((byte) (i >>> 24));
        interfaceC16922l.update((byte) (i >>> 16));
        interfaceC16922l.update((byte) (i >>> 8));
        interfaceC16922l.update((byte) i);
    }

    public static Object purchase(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        C8339l.smaato(AbstractC0653l.ads(AbstractC14814l.license("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static void yandex(InterfaceC14090l interfaceC14090l) {
        if (interfaceC14090l != null) {
            try {
                interfaceC14090l.close();
            } catch (IOException unused) {
            }
        }
    }
}
