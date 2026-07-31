package io.realm.kotlin.internal.interop;

import defpackage.AbstractC0653l;
import defpackage.AbstractC11043l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC1872l;
import defpackage.AbstractC4338l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC9795l;
import defpackage.C11085l;
import defpackage.C11602l;
import defpackage.C2580l;
import defpackage.C6536l;
import defpackage.C6918l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8708l;
import defpackage.C9122l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class loadAd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static List amazon(NativePointer nativePointer, long j, long j2) {
        ?? arrayList;
        int i;
        int i2;
        int i3 = AbstractC9795l.yandex;
        long jNew_propertyArray = realmcJNI.new_propertyArray((int) j2);
        realm_property_info_t realm_property_info_tVar = jNew_propertyArray == 0 ? null : new realm_property_info_t(jNew_propertyArray, false);
        long[] jArr = {0};
        realmcJNI.realm_get_class_properties(((LongPointerWrapper) nativePointer).getPtr$cinterop_release(), j, realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar, j2, jArr);
        try {
            long j3 = jArr[0];
            if (j3 > 0) {
                C11602l c11602lAds = AbstractC8576l.ads(j3);
                arrayList = new ArrayList(AbstractC14055l.billing(c11602lAds, 10));
                Iterator it = c11602lAds.iterator();
                while (((C8708l) it).f17914l) {
                    realm_property_info_t realm_property_info_tVar2 = new realm_property_info_t(realmcJNI.propertyArray_getitem(realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar, (int) ((C8708l) it).nextLong()), true);
                    String strRealm_property_info_t_name_get = realmcJNI.realm_property_info_t_name_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2);
                    String strRealm_property_info_t_public_name_get = realmcJNI.realm_property_info_t_public_name_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2);
                    int iRealm_property_info_t_type_get = realmcJNI.realm_property_info_t_type_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2);
                    int[] iArrM1673throws = AbstractC5020l.m1673throws(13);
                    int length = iArrM1673throws.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i = 0;
                            break;
                        }
                        int i5 = iArrM1673throws[i4];
                        if (AbstractC4338l.subscription(i5) == iRealm_property_info_t_type_get) {
                            i = i5;
                            break;
                        }
                        i4++;
                    }
                    if (i == 0) {
                        throw new IllegalStateException(("Unknown property type: " + iRealm_property_info_t_type_get).toString());
                    }
                    int iRealm_property_info_t_collection_type_get = realmcJNI.realm_property_info_t_collection_type_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2);
                    int[] iArrM1673throws2 = AbstractC5020l.m1673throws(4);
                    int length2 = iArrM1673throws2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            i2 = 0;
                            break;
                        }
                        int i7 = iArrM1673throws2[i6];
                        if (AbstractC11043l.crashlytics(i7) == iRealm_property_info_t_collection_type_get) {
                            i2 = i7;
                            break;
                        }
                        i6++;
                    }
                    if (i2 == 0) {
                        throw new IllegalStateException(("Unknown collection type: " + iRealm_property_info_t_collection_type_get).toString());
                    }
                    arrayList.add(new C11085l(strRealm_property_info_t_name_get, strRealm_property_info_t_public_name_get, i, i2, realmcJNI.realm_property_info_t_link_target_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2), realmcJNI.realm_property_info_t_link_origin_property_name_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2), realmcJNI.realm_property_info_t_key_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2), realmcJNI.realm_property_info_t_flags_get(realm_property_info_tVar2.yandex, realm_property_info_tVar2)));
                }
            } else {
                arrayList = C2580l.f5619l;
            }
            realmcJNI.delete_propertyArray(realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar);
            return arrayList;
        } catch (Throwable th) {
            realmcJNI.delete_propertyArray(realm_property_info_t.loadAd(realm_property_info_tVar), realm_property_info_tVar);
            throw th;
        }
    }

    public static ArrayList crashlytics(NativePointer nativePointer) {
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        long jRealm_get_num_classes = realmcJNI.realm_get_num_classes(ptr$cinterop_release);
        int i2 = (int) jRealm_get_num_classes;
        long[] jArr = new long[i2];
        long[] jArr2 = {0};
        realmcJNI.realm_get_class_keys(longPointerWrapper.getPtr$cinterop_release(), jArr, jRealm_get_num_classes, jArr2);
        long j = jArr2[0];
        if (jRealm_get_num_classes != j) {
            StringBuilder sbSignature = AbstractC0653l.Signature(j, "Invalid schema: Insufficient keys; got ", ", expected ");
            sbSignature.append(jRealm_get_num_classes);
            throw new IllegalStateException(sbSignature.toString().toString());
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new C6918l(jArr[i3]));
        }
        return arrayList;
    }

    public static C7507l loadAd(NativePointer nativePointer, long j) {
        realm_class_info_t realm_class_info_tVar = new realm_class_info_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_class(ptr$cinterop_release, j, realm_class_info_tVar.yandex, realm_class_info_tVar);
        return new C7507l(realmcJNI.realm_class_info_t_name_get(realm_class_info_tVar.yandex, realm_class_info_tVar), realmcJNI.realm_class_info_t_primary_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar), realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar), realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar), realmcJNI.realm_class_info_t_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar), realmcJNI.realm_class_info_t_flags_get(realm_class_info_tVar.yandex, realm_class_info_tVar));
    }

    public static C8195l purchase(NativePointer nativePointer, NativePointer nativePointer2) {
        C9122l c9122l = new C9122l();
        C6536l c6536l = new C6536l(28, c9122l);
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_config_set_data_initialization_function(ptr$cinterop_release, c6536l);
        realmcJNI.realm_config_set_scheduler(longPointerWrapper.getPtr$cinterop_release(), ((LongPointerWrapper) nativePointer2).getPtr$cinterop_release());
        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_open(longPointerWrapper.getPtr$cinterop_release()), false, 2, null);
        realmcJNI.realm_begin_read(longPointerWrapper2.getPtr$cinterop_release());
        return new C8195l(longPointerWrapper2, Boolean.valueOf(c9122l.f18750l));
    }

    public static LongPointerWrapper yandex(AbstractC1872l abstractC1872l) {
        JVMScheduler jVMScheduler = new JVMScheduler(abstractC1872l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.realm_create_scheduler(jVMScheduler), false, 2, null);
    }
}
