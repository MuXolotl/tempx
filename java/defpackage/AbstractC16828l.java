package defpackage;

import java.lang.management.ManagementFactory;

/* JADX INFO: renamed from: lؘٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16828l {
    public static final C8688l yandex = new C8688l(new C8241l(24));

    public static final boolean loadAd() {
        try {
            return AbstractC12024l.appmetrica(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean yandex() {
        return ((Boolean) yandex.getValue()).booleanValue();
    }
}
