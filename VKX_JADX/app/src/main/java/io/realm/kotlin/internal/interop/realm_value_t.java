package io.realm.kotlin.internal.interop;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class realm_value_t {
    public transient boolean loadAd;
    public transient long yandex;

    public realm_value_t() {
        this(realmcJNI.new_realm_value_t(), true);
    }

    public static long loadAd(realm_value_t realm_value_tVar) {
        if (realm_value_tVar == null) {
            return 0L;
        }
        return realm_value_tVar.yandex;
    }

    public final realm_object_id_t amazon() {
        long jRealm_value_t_object_id_get = realmcJNI.realm_value_t_object_id_get(this.yandex, this);
        if (jRealm_value_t_object_id_get == 0) {
            return null;
        }
        return new realm_object_id_t(jRealm_value_t_object_id_get, false);
    }

    public final void billing(realm_link_t realm_link_tVar) {
        realmcJNI.realm_value_t_link_set(this.yandex, this, realm_link_tVar.yandex, realm_link_tVar);
    }

    public final realm_decimal128_t crashlytics() {
        long jRealm_value_t_decimal128_get = realmcJNI.realm_value_t_decimal128_get(this.yandex, this);
        if (jRealm_value_t_decimal128_get == 0) {
            return null;
        }
        return new realm_decimal128_t(jRealm_value_t_decimal128_get, false);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.yandex;
                if (j != 0) {
                    if (this.loadAd) {
                        this.loadAd = false;
                        realmcJNI.delete_realm_value_t(j);
                    }
                    this.yandex = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mopub(int i) {
        realmcJNI.realm_value_t_type_set(this.yandex, this, i);
    }

    public final realm_uuid_t purchase() {
        long jRealm_value_t_uuid_get = realmcJNI.realm_value_t_uuid_get(this.yandex, this);
        if (jRealm_value_t_uuid_get == 0) {
            return null;
        }
        return new realm_uuid_t(jRealm_value_t_uuid_get, false);
    }

    public final realm_binary_t yandex() {
        long jRealm_value_t_binary_get = realmcJNI.realm_value_t_binary_get(this.yandex, this);
        if (jRealm_value_t_binary_get == 0) {
            return null;
        }
        return new realm_binary_t(jRealm_value_t_binary_get, false);
    }

    public realm_value_t(long j, boolean z) {
        this.loadAd = z;
        this.yandex = j;
    }
}
