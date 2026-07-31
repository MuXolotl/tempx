package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.loadAd;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11513l {
    public final Map crashlytics;
    public final Map loadAd;
    public final NativePointer yandex;

    public C11513l(NativePointer nativePointer, Collection collection) {
        this.yandex = nativePointer;
        ArrayList arrayListCrashlytics = loadAd.crashlytics(nativePointer);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListCrashlytics, 10));
        Iterator it = arrayListCrashlytics.iterator();
        while (it.hasNext()) {
            long j = ((C6918l) it.next()).yandex;
            NativePointer nativePointer2 = this.yandex;
            realm_class_info_t realm_class_info_tVar = new realm_class_info_t();
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer2).getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_get_class(ptr$cinterop_release, j, realm_class_info_tVar.yandex, realm_class_info_tVar);
            String strRealm_class_info_t_name_get = realmcJNI.realm_class_info_t_name_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_primary_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            long jRealm_class_info_t_key_get = realmcJNI.realm_class_info_t_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_flags_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            Iterator it2 = collection.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (!it2.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                } else {
                    Object next = it2.next();
                    if (AbstractC8576l.yandex(((InterfaceC13226l) next).yandex(), strRealm_class_info_t_name_get)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                }
            }
            arrayList.add(new C8195l(strRealm_class_info_t_name_get, new C2330l(this.yandex, strRealm_class_info_t_name_get, jRealm_class_info_t_key_get, (InterfaceC13226l) obj)));
        }
        Map mapSubscription = AbstractC8676l.subscription(arrayList);
        this.loadAd = mapSubscription;
        ArrayList arrayList2 = new ArrayList(mapSubscription.size());
        Iterator it3 = mapSubscription.entrySet().iterator();
        while (it3.hasNext()) {
            C2330l c2330l = (C2330l) ((Map.Entry) it3.next()).getValue();
            arrayList2.add(new C8195l(new C6918l(c2330l.loadAd), c2330l));
        }
        this.crashlytics = AbstractC8676l.subscription(arrayList2);
    }

    public final C2330l crashlytics(String str) {
        C2330l c2330lYandex = yandex(str);
        if (c2330lYandex != null) {
            return c2330lYandex;
        }
        C8339l.metrica(AbstractC15560l.Signature("Schema does not contain a class named '", str, "'"));
        return null;
    }

    public final C2330l loadAd(long j) {
        return (C2330l) this.crashlytics.get(new C6918l(j));
    }

    public final C2330l yandex(String str) {
        return (C2330l) this.loadAd.get(str);
    }
}
