package defpackage;

import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_timestamp_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lَُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10340l {
    public static final C8688l yandex = new C8688l(new C3342l(22));
    public static final C8688l loadAd = new C8688l(new C3342l(23));

    public static final long crashlytics() {
        return ((C6918l) yandex.getValue()).yandex;
    }

    public static final C0722l loadAd(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 5) {
            C11983l.isPro(realm_value_tVar, ".type", "Value is not of type Timestamp: ");
            return null;
        }
        long jRealm_value_t_timestamp_get = realmcJNI.realm_value_t_timestamp_get(realm_value_tVar.yandex, realm_value_tVar);
        realm_timestamp_t realm_timestamp_tVar = jRealm_value_t_timestamp_get == 0 ? null : new realm_timestamp_t(jRealm_value_t_timestamp_get, false);
        long jRealm_timestamp_t_seconds_get = realmcJNI.realm_timestamp_t_seconds_get(realm_timestamp_tVar.yandex, realm_timestamp_tVar);
        long jRealm_value_t_timestamp_get2 = realmcJNI.realm_value_t_timestamp_get(realm_value_tVar.yandex, realm_value_tVar);
        realm_timestamp_t realm_timestamp_tVar2 = jRealm_value_t_timestamp_get2 != 0 ? new realm_timestamp_t(jRealm_value_t_timestamp_get2, false) : null;
        return new C0722l(jRealm_timestamp_t_seconds_get, realmcJNI.realm_timestamp_t_nanoseconds_get(realm_timestamp_tVar2.yandex, realm_timestamp_tVar2));
    }

    public static final C3535l yandex(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 10) {
            C11983l.isPro(realm_value_tVar, ".type", "Value is not of type link: ");
            return null;
        }
        long jRealm_value_t_link_get = realmcJNI.realm_value_t_link_get(realm_value_tVar.yandex, realm_value_tVar);
        realm_link_t realm_link_tVar = jRealm_value_t_link_get == 0 ? null : new realm_link_t(jRealm_value_t_link_get, false);
        long jRealm_link_t_target_table_get = realmcJNI.realm_link_t_target_table_get(realm_link_tVar.yandex, realm_link_tVar);
        long jRealm_value_t_link_get2 = realmcJNI.realm_value_t_link_get(realm_value_tVar.yandex, realm_value_tVar);
        realm_link_t realm_link_tVar2 = jRealm_value_t_link_get2 != 0 ? new realm_link_t(jRealm_value_t_link_get2, false) : null;
        long jRealm_link_t_target_get = realmcJNI.realm_link_t_target_get(realm_link_tVar2.yandex, realm_link_tVar2);
        C3535l c3535l = new C3535l();
        c3535l.yandex = jRealm_link_t_target_table_get;
        c3535l.loadAd = jRealm_link_t_target_get;
        return c3535l;
    }
}
