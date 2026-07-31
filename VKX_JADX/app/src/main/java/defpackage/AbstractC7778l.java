package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lًؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7778l {
    public static final String yandex;

    static {
        String str = AbstractC15323l.yandex;
        yandex = Integer.toString(0, 36);
    }

    public static AbstractC7778l yandex(Bundle bundle) {
        String str = yandex;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = C1673l.amazon;
            AbstractC12442l.admob(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(C1673l.amazon, false) ? new C1673l(bundle.getBoolean(C1673l.purchase, false)) : new C1673l();
        }
        if (i == 1) {
            String str3 = C18670l.crashlytics;
            AbstractC12442l.admob(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(C18670l.crashlytics, -1.0f);
            return f == -1.0f ? new C18670l() : new C18670l(f);
        }
        if (i == 2) {
            String str4 = C7886l.amazon;
            AbstractC12442l.admob(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(C7886l.amazon, 5);
            float f2 = bundle.getFloat(C7886l.purchase, -1.0f);
            return f2 == -1.0f ? new C7886l(i2) : new C7886l(i2, f2);
        }
        if (i != 3) {
            C8339l.metrica(AbstractC0653l.vip(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = C7724l.amazon;
        AbstractC12442l.admob(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(C7724l.amazon, false) ? new C7724l(bundle.getBoolean(C7724l.purchase, false)) : new C7724l();
    }

    public abstract Bundle crashlytics();

    public abstract boolean loadAd();
}
