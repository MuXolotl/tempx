package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٕؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3534l {
    public static final Logger yandex = Logger.getLogger(AbstractC3534l.class.getName());
    public static final AtomicBoolean loadAd = new AtomicBoolean(false);

    public static boolean yandex() {
        return loadAd.get();
    }
}
