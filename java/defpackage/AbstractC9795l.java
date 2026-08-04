package defpackage;

import io.realm.kotlin.internal.interop.realm_index_range_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lًٍۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9795l {
    public static final /* synthetic */ int yandex = 0;

    static {
        if (System.getProperty("java.specification.vendor").contains("Android")) {
            return;
        }
        try {
            Class<?> cls = Class.forName("io.realm.kotlin.jvm.SoLoader");
            cls.getDeclaredMethod("load", null).invoke(cls.newInstance(), null);
        } catch (Exception e) {
            C18073l.Signature("Couldn't load Realm native libraries", e);
        }
    }

    public static realm_value_t crashlytics(int i) {
        long jNew_valueArray = realmcJNI.new_valueArray(i);
        if (jNew_valueArray == 0) {
            return null;
        }
        return new realm_value_t(jNew_valueArray, false);
    }

    public static realm_index_range_t loadAd(int i) {
        long jNew_indexRangeArray = realmcJNI.new_indexRangeArray(i);
        if (jNew_indexRangeArray == 0) {
            return null;
        }
        return new realm_index_range_t(jNew_indexRangeArray, false);
    }

    public static realm_index_range_t yandex(realm_index_range_t realm_index_range_tVar, int i) {
        return new realm_index_range_t(realmcJNI.indexRangeArray_getitem(realm_index_range_tVar.yandex, realm_index_range_tVar, i), true);
    }
}
