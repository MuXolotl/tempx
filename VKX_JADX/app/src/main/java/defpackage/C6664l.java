package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: renamed from: lؙؙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6664l {
    public static final C4652l loadAd;
    public final Context yandex;

    static {
        C1652l c1652lLoadAd = C4652l.loadAd(C6664l.class);
        c1652lLoadAd.yandex(C12186l.loadAd(C7854l.class));
        c1652lLoadAd.yandex(C12186l.loadAd(Context.class));
        c1652lLoadAd.mopub = new C6162l(25);
        loadAd = c1652lLoadAd.loadAd();
    }

    public C6664l(Context context) {
        this.yandex = context;
    }

    public final synchronized String yandex() {
        String string = this.yandex.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.yandex.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
