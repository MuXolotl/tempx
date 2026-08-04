package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17310l {
    public final C10086l crashlytics;
    public final Function1 loadAd;
    public final SharedPreferences yandex;

    public C17310l(SharedPreferences sharedPreferences, Function1 function1) {
        this.yandex = sharedPreferences;
        this.loadAd = function1;
        String string = sharedPreferences.getString("autocache", "0");
        this.crashlytics = AbstractC8020l.smaato(string != null ? string : "0");
    }
}
