package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10717l {
    public final Executor yandex;

    public C10717l(ExecutorC7870l executorC7870l, int i) {
        this.yandex = (i & 8) != 0 ? null : executorC7870l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10717l) && AbstractC8576l.yandex(this.yandex, ((C10717l) obj).yandex);
    }

    public final int hashCode() {
        Executor executor = this.yandex;
        return (executor == null ? 0 : executor.hashCode()) * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.yandex + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
    }
}
