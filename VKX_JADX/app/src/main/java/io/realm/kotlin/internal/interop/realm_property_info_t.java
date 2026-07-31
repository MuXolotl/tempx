package io.realm.kotlin.internal.interop;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class realm_property_info_t {
    public transient boolean loadAd;
    public transient long yandex;

    public realm_property_info_t(long j, boolean z) {
        this.loadAd = z;
        this.yandex = j;
    }

    public static long loadAd(realm_property_info_t realm_property_info_tVar) {
        if (realm_property_info_tVar == null) {
            return 0L;
        }
        return realm_property_info_tVar.yandex;
    }

    public final void finalize() {
        yandex();
    }

    public final synchronized void yandex() {
        try {
            long j = this.yandex;
            if (j != 0) {
                if (this.loadAd) {
                    this.loadAd = false;
                    realmcJNI.delete_realm_property_info_t(j);
                }
                this.yandex = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
