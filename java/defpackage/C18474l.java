package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18474l {
    public static final AtomicIntegerFieldUpdater loadAd = AtomicIntegerFieldUpdater.newUpdater(C18474l.class, "yandex");
    public volatile int yandex;

    public final boolean loadAd() {
        return this.yandex != 0;
    }

    public final String toString() {
        return String.valueOf(loadAd());
    }

    public final boolean yandex() {
        return loadAd.compareAndSet(this, 0, 1);
    }
}
