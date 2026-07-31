package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؙِٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11854l {
    public static final AtomicBoolean yandex = new AtomicBoolean(false);

    public static void yandex() {
        if (Build.VERSION.SDK_INT < 29 || !yandex.get()) {
            return;
        }
        AbstractC11880l.metrica();
    }
}
