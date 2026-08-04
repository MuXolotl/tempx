package defpackage;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: renamed from: lؙْْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13335l {
    public final InterfaceC12932l loadAd;
    public final C6579l yandex;

    public C13335l(C6579l c6579l, InterfaceC12932l interfaceC12932l) {
        this.yandex = c6579l;
        this.loadAd = interfaceC12932l;
    }

    public static final URL yandex(C13335l c13335l) {
        c13335l.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C6579l c6579l = c13335l.yandex;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c6579l.yandex).appendPath("settings");
        C2778l c2778l = c6579l.loadAd;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c2778l.crashlytics).appendQueryParameter("display_version", c2778l.loadAd).build().toString());
    }
}
