package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؒٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1206l {
    public static /* synthetic */ int yandex() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}
