package io.realm.kotlin.internal.interop;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class realm_collection_move_t {
    public transient long yandex;

    public final void finalize() {
        synchronized (this) {
            if (this.yandex != 0) {
                this.yandex = 0L;
            }
        }
    }
}
