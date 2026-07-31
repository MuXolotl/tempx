package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lِؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4189l {
    public static final InterfaceC12165l yandex;

    static {
        yandex = Build.VERSION.SDK_INT >= 24 ? new C15542l() : new C13772l(24);
    }
}
