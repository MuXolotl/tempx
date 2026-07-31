package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lِّٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11879l {
    public static final AtomicIntegerFieldUpdater loadAd = AtomicIntegerFieldUpdater.newUpdater(C11879l.class, "yandex");
    public volatile int yandex;

    public final String toString() {
        return String.valueOf(this.yandex);
    }

    public final int yandex() {
        return loadAd.decrementAndGet(this);
    }
}
