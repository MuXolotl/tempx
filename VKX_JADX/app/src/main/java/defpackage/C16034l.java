package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.MigrationCallback;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realm_property_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۤٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16034l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f31421l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31422l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C12125l f31423l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ MigrationCallback f31424l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f31425l;

    public /* synthetic */ C16034l(C12125l c12125l, int i, long j, AbstractC13082l abstractC13082l, long j2, C5131l c5131l) {
        this.f31423l = c12125l;
        this.f31422l = i;
        this.f31421l = j;
        this.f31425l = j2;
        this.f31424l = c5131l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        C12961l c12961l;
        long j;
        int i;
        NativePointer nativePointer = (NativePointer) obj;
        C12125l c12125l = this.f31423l;
        String str = c12125l.crashlytics;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_config_set_path(ptr$cinterop_release, str);
        realmcJNI.realm_config_set_schema_mode(longPointerWrapper.getPtr$cinterop_release(), AbstractC5020l.inmobi(this.f31422l));
        realmcJNI.realm_config_set_schema_version(longPointerWrapper.getPtr$cinterop_release(), this.f31421l);
        Collection collectionValues = c12125l.purchase.values();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            C3971l c3971lPurchase = ((InterfaceC13226l) it.next()).purchase();
            arrayList.add(new C8195l(c3971lPurchase.yandex, AbstractC16901l.m4243this(c3971lPurchase.loadAd, new C13617l(14))));
        }
        int size = arrayList.size();
        int i3 = AbstractC9795l.yandex;
        long jNew_classArray = realmcJNI.new_classArray(size);
        long j2 = 0;
        int i4 = 0;
        Throwable th = null;
        realm_class_info_t realm_class_info_tVar = jNew_classArray == 0 ? null : new realm_class_info_t(jNew_classArray, false);
        long jNew_propertyArrayArray = realmcJNI.new_propertyArrayArray(size);
        if (jNew_propertyArrayArray == 0) {
            c12961l = null;
        } else {
            c12961l = new C12961l();
            c12961l.yandex = jNew_propertyArrayArray;
        }
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            int i6 = i5 + 1;
            C8195l c8195l = (C8195l) it2.next();
            C7507l c7507l = (C7507l) c8195l.f17098l;
            List list = (List) c8195l.f17097l;
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                int i7 = i4;
                while (it3.hasNext()) {
                    long j3 = j2;
                    if (((C11085l) it3.next()).remoteconfig && (i7 = i7 + 1) < 0) {
                        AbstractC14055l.ads();
                        throw th;
                    }
                    j2 = j3;
                }
                j = j2;
                i = i7;
            } else {
                j = j2;
                i = i4;
            }
            realm_class_info_t realm_class_info_tVar2 = new realm_class_info_t();
            int i8 = i;
            realmcJNI.realm_class_info_t_name_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, c7507l.yandex);
            realmcJNI.realm_class_info_t_primary_key_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, c7507l.loadAd);
            Iterator it4 = it2;
            LongPointerWrapper longPointerWrapper2 = longPointerWrapper;
            realmcJNI.realm_class_info_t_num_properties_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, list.size() - i8);
            realmcJNI.realm_class_info_t_num_computed_properties_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, i8);
            realmcJNI.realm_class_info_t_key_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, AbstractC10340l.crashlytics());
            realmcJNI.realm_class_info_t_flags_set(realm_class_info_tVar2.yandex, realm_class_info_tVar2, c7507l.billing);
            long jNew_propertyArray = realmcJNI.new_propertyArray(list.size());
            realm_property_info_t realm_property_info_tVar = jNew_propertyArray == j ? null : new realm_property_info_t(jNew_propertyArray, false);
            Iterator it5 = list.iterator();
            int i9 = 0;
            while (it5.hasNext()) {
                C11085l c11085l = (C11085l) it5.next();
                realm_property_info_t realm_property_info_tVar2 = new realm_property_info_t(realmcJNI.new_realm_property_info_t(), true);
                realmcJNI.realm_property_info_t_name_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, c11085l.yandex);
                realmcJNI.realm_property_info_t_public_name_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, c11085l.loadAd);
                realmcJNI.realm_property_info_t_type_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, AbstractC4338l.subscription(c11085l.crashlytics));
                realmcJNI.realm_property_info_t_collection_type_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, AbstractC11043l.crashlytics(c11085l.amazon));
                realmcJNI.realm_property_info_t_link_target_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, c11085l.purchase);
                realmcJNI.realm_property_info_t_link_origin_property_name_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, c11085l.billing);
                realmcJNI.realm_property_info_t_key_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, ((C4272l) AbstractC10340l.loadAd.getValue()).yandex);
                realmcJNI.realm_property_info_t_flags_set(realm_property_info_tVar2.yandex, realm_property_info_tVar2, c11085l.admob);
                realmcJNI.propertyArray_setitem(realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar, i9, realm_property_info_tVar2.yandex, realm_property_info_tVar2);
                it5 = it5;
                i9++;
            }
            realmcJNI.classArray_setitem(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar, i5, realm_class_info_tVar2.yandex, realm_class_info_tVar2);
            realmcJNI.propertyArrayArray_setitem(c12961l == null ? j : c12961l.yandex, i5, realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar);
            i5 = i6;
            longPointerWrapper = longPointerWrapper2;
            j2 = j;
            it2 = it4;
            i4 = 0;
            th = null;
        }
        LongPointerWrapper longPointerWrapper3 = longPointerWrapper;
        long j4 = j2;
        try {
            LongPointerWrapper longPointerWrapper4 = new LongPointerWrapper(realmcJNI.realm_schema_new(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar, size, c12961l == null ? j4 : c12961l.yandex), false, 2, null);
            for (int i10 = 0; i10 < size; i10++) {
                realm_class_info_t realm_class_info_tVar3 = new realm_class_info_t(realmcJNI.classArray_getitem(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar, i10), true);
                long jPropertyArrayArray_getitem = realmcJNI.propertyArrayArray_getitem(c12961l == null ? j4 : c12961l.yandex, i10);
                realm_property_info_t realm_property_info_tVar3 = jPropertyArrayArray_getitem == j4 ? null : new realm_property_info_t(jPropertyArrayArray_getitem, false);
                long j5 = j4;
                for (long jRealm_class_info_t_num_computed_properties_get = realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar3.yandex, realm_class_info_tVar3) + realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar3.yandex, realm_class_info_tVar3); j5 < jRealm_class_info_t_num_computed_properties_get; jRealm_class_info_t_num_computed_properties_get = jRealm_class_info_t_num_computed_properties_get) {
                    realm_property_info_t realm_property_info_tVar4 = new realm_property_info_t(realmcJNI.propertyArray_getitem(realm_property_info_t.loadAd(realm_property_info_tVar3), realm_property_info_tVar3, (int) j5), true);
                    realmcJNI.realm_property_info_t_cleanup(realm_property_info_tVar4.yandex, realm_property_info_tVar4);
                    realm_property_info_tVar4.yandex();
                    j5++;
                }
                realmcJNI.delete_propertyArray(realm_property_info_t.loadAd(realm_property_info_tVar3), realm_property_info_tVar3);
                realmcJNI.realm_class_info_t_cleanup(realm_class_info_tVar3.yandex, realm_class_info_tVar3);
                realm_class_info_tVar3.yandex();
            }
            realmcJNI.delete_propertyArrayArray(c12961l == null ? j4 : c12961l.yandex);
            realmcJNI.delete_classArray(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar);
            realmcJNI.realm_config_set_schema(longPointerWrapper3.getPtr$cinterop_release(), longPointerWrapper4.getPtr$cinterop_release());
            realmcJNI.realm_config_set_max_number_of_active_versions(longPointerWrapper3.getPtr$cinterop_release(), this.f31425l);
            MigrationCallback migrationCallback = this.f31424l;
            if (migrationCallback != null) {
                realmcJNI.realm_config_set_migration_function(longPointerWrapper3.getPtr$cinterop_release(), migrationCallback);
            }
            realmcJNI.realm_config_set_automatic_backlink_handling(longPointerWrapper3.getPtr$cinterop_release(), false);
            realmcJNI.realm_config_set_in_memory(longPointerWrapper3.getPtr$cinterop_release(), false);
            return nativePointer;
        } catch (Throwable th2) {
            th = th2;
            int i11 = 0;
            while (i11 < size) {
                realm_class_info_t realm_class_info_tVar4 = new realm_class_info_t(realmcJNI.classArray_getitem(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar, i11), true);
                long jPropertyArrayArray_getitem2 = realmcJNI.propertyArrayArray_getitem(c12961l == null ? j4 : c12961l.yandex, i11);
                realm_property_info_t realm_property_info_tVar5 = jPropertyArrayArray_getitem2 == j4 ? null : new realm_property_info_t(jPropertyArrayArray_getitem2, false);
                long jRealm_class_info_t_num_computed_properties_get2 = realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar4.yandex, realm_class_info_tVar4) + realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar4.yandex, realm_class_info_tVar4);
                long j6 = j4;
                while (j6 < jRealm_class_info_t_num_computed_properties_get2) {
                    realm_property_info_t realm_property_info_tVar6 = new realm_property_info_t(realmcJNI.propertyArray_getitem(realm_property_info_t.loadAd(realm_property_info_tVar5), realm_property_info_tVar5, (int) j6), true);
                    realmcJNI.realm_property_info_t_cleanup(realm_property_info_tVar6.yandex, realm_property_info_tVar6);
                    realm_property_info_tVar6.yandex();
                    j6++;
                    th = th;
                    i11 = i11;
                }
                realmcJNI.delete_propertyArray(realm_property_info_t.loadAd(realm_property_info_tVar5), realm_property_info_tVar5);
                realmcJNI.realm_class_info_t_cleanup(realm_class_info_tVar4.yandex, realm_class_info_tVar4);
                realm_class_info_tVar4.yandex();
                i11++;
                th = th;
            }
            Throwable th3 = th;
            realmcJNI.delete_propertyArrayArray(c12961l == null ? j4 : c12961l.yandex);
            realmcJNI.delete_classArray(realm_class_info_t.loadAd(realm_class_info_tVar), realm_class_info_tVar);
            throw th3;
        }
    }
}
