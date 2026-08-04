package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: lُ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17849l {
    public final C17240l loadAd;
    public final String yandex;
    public static final C17849l crashlytics = new C17849l("");
    public static final C17849l amazon = new C17849l("preload");

    public C17849l(String str) {
        this.yandex = str;
        this.loadAd = Build.VERSION.SDK_INT >= 31 ? new C17240l(2) : null;
    }

    public final synchronized LogSessionId yandex() {
        C17240l c17240l;
        c17240l = this.loadAd;
        c17240l.getClass();
        return (LogSessionId) c17240l.loadAd;
    }
}
