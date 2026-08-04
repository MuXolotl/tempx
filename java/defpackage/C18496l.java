package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lٟۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18496l {
    public static final /* synthetic */ C18496l yandex = new C18496l();
    public static final String loadAd = InterfaceC3990l.class.getSimpleName();

    public static InterfaceC3990l yandex() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C4209l.f8640l;
        }
        if (i >= 29) {
            return C15617l.f30506l;
        }
        if (i >= 28) {
            return C11140l.f22360l;
        }
        return i >= 24 ? C13772l.f26867l : C13863l.f27102l;
    }
}
