package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُۘۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11279l {
    public final Function1 amazon;
    public final Function1 crashlytics;
    public final String loadAd;
    public final C10086l purchase;
    public final SharedPreferences yandex;

    public C11279l(SharedPreferences sharedPreferences, String str, boolean z, Function1 function1, Function1 function2) {
        this.yandex = sharedPreferences;
        this.loadAd = str;
        this.crashlytics = function1;
        this.amazon = function2;
        this.purchase = AbstractC8020l.smaato(Boolean.valueOf(sharedPreferences.getBoolean(str, z)));
    }

    public final void yandex(boolean z) {
        if (((Boolean) this.amazon.invoke(Boolean.valueOf(z))).booleanValue()) {
            this.purchase.setValue(Boolean.valueOf(z));
            this.yandex.edit().putBoolean(this.loadAd, z).apply();
            this.crashlytics.invoke(Boolean.valueOf(z));
        }
    }
}
