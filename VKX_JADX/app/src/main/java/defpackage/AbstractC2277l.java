package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lؓۧۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2277l {
    public final Object crashlytics;
    public final InterfaceC5688l loadAd;
    public final String yandex;

    public AbstractC2277l(String str, InterfaceC5688l interfaceC5688l, Object obj) {
        this.yandex = str;
        this.loadAd = interfaceC5688l;
        this.crashlytics = obj;
    }

    public final void loadAd(Object obj) {
        SharedPreferences sharedPreferences = AbstractC13273l.billing;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        this.loadAd.subs(sharedPreferences, this.yandex, obj);
    }

    public final Object yandex() {
        SharedPreferences sharedPreferences = AbstractC13273l.billing;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        return this.loadAd.mopub(sharedPreferences, this.yandex, this.crashlytics);
    }
}
