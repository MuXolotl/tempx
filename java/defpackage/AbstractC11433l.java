package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُُۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11433l {
    public static final C4707l yandex = new C4707l("MagnifierPositionInRoot");

    public static InterfaceC17242l loadAd(Function1 function1, Function1 function2, InterfaceC16182l interfaceC16182l) {
        return yandex() ? new C9126l(function1, function2, interfaceC16182l) : C4346l.f8873l;
    }

    public static boolean yandex() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
