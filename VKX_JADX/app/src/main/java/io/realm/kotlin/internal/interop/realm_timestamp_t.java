package io.realm.kotlin.internal.interop;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class realm_timestamp_t {
    public transient boolean loadAd;
    public transient long yandex;

    public realm_timestamp_t(long j, boolean z) {
        this.loadAd = z;
        this.yandex = j;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.yandex;
                if (j != 0) {
                    if (this.loadAd) {
                        this.loadAd = false;
                        realmcJNI.delete_realm_timestamp_t(j);
                    }
                    this.yandex = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
