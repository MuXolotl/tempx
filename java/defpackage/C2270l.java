package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lُؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2270l extends AbstractC6107l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f4957l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2270l(C12428l c12428l, int i) {
        super(c12428l);
        this.f4957l = i;
    }

    @Override // defpackage.AbstractC6107l
    public final Object amazon() {
        switch (this.f4957l) {
            case 0:
                return new C3331l(0);
            case 1:
                new LinkedHashMap(new LinkedHashMap());
                return new C15718l(28);
            case 2:
                new ArrayList();
                return new C11485l(28);
            case 3:
                new LinkedHashSet();
                return new C6168l(29);
            default:
                throw new RuntimeException("Results should never have been deleted");
        }
    }

    @Override // defpackage.AbstractC6107l
    public final Object startapp(Object obj) {
        int i = 0;
        int i2 = 3;
        switch (this.f4957l) {
            case 0:
                return new C11424l(AbstractC6710l.firebase((C1332l) obj), 0);
            case 1:
                return new C12899l(3);
            case 2:
                return new C14529l(i2);
            case 3:
                return new C2183l(i2);
            default:
                return new C16480l((C15825l) obj, i);
        }
    }

    @Override // defpackage.AbstractC6107l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object mo1126throws(Object obj, NativePointer nativePointer) {
        int i = 13;
        int i2 = 1;
        switch (this.f4957l) {
            case 0:
                C1332l c1332l = (C1332l) obj;
                InterfaceC2851l interfaceC2851lFirebase = AbstractC6710l.firebase(c1332l);
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                long jRealm_object_changes_get_num_modified_properties = realmcJNI.realm_object_changes_get_num_modified_properties(ptr$cinterop_release);
                int i4 = (int) jRealm_object_changes_get_num_modified_properties;
                long[] jArr = new long[i4];
                realmcJNI.realm_object_changes_get_modified_properties(longPointerWrapper.getPtr$cinterop_release(), jArr, jRealm_object_changes_get_num_modified_properties);
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(new C4272l(jArr[i5]));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0717l c0717lYandex = c1332l.f3424l.yandex(((C4272l) it.next()).yandex);
                    arrayList2.add(c0717lYandex != null ? c0717lYandex.loadAd : "");
                }
                return new C11424l(interfaceC2851lFirebase, 1);
            case 1:
                long[] jArr2 = {0};
                long[] jArr3 = {0};
                long[] jArr4 = {0};
                LongPointerWrapper longPointerWrapper2 = (LongPointerWrapper) nativePointer;
                long ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i6 = AbstractC9795l.yandex;
                realmcJNI.realm_dictionary_get_changes(ptr$cinterop_release2, jArr2, jArr3, jArr4, new boolean[1]);
                realm_value_t realm_value_tVarCrashlytics = AbstractC9795l.crashlytics((int) jArr2[0]);
                realm_value_t realm_value_tVarCrashlytics2 = AbstractC9795l.crashlytics((int) jArr3[0]);
                realm_value_t realm_value_tVarCrashlytics3 = AbstractC9795l.crashlytics((int) jArr4[0]);
                realmcJNI.realm_dictionary_get_changed_keys(longPointerWrapper2.getPtr$cinterop_release(), realm_value_t.loadAd(realm_value_tVarCrashlytics), realm_value_tVarCrashlytics, jArr2, realm_value_t.loadAd(realm_value_tVarCrashlytics2), realm_value_tVarCrashlytics2, jArr3, realm_value_t.loadAd(realm_value_tVarCrashlytics3), realm_value_tVarCrashlytics3, jArr4, new boolean[]{false});
                C11602l c11602lAds = AbstractC8576l.ads(jArr2[0]);
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(c11602lAds, 10));
                Iterator it2 = c11602lAds.iterator();
                while (true) {
                    C8708l c8708l = (C8708l) it2;
                    if (c8708l.f17914l) {
                        realm_value_t realm_value_tVar = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.loadAd(realm_value_tVarCrashlytics), realm_value_tVarCrashlytics, (int) c8708l.nextLong()), true);
                        arrayList3.add(realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar));
                    } else {
                        C11602l c11602lAds2 = AbstractC8576l.ads(jArr3[0]);
                        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(c11602lAds2, 10));
                        Iterator it3 = c11602lAds2.iterator();
                        while (true) {
                            C8708l c8708l2 = (C8708l) it3;
                            if (c8708l2.f17914l) {
                                realm_value_t realm_value_tVar2 = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.loadAd(realm_value_tVarCrashlytics2), realm_value_tVarCrashlytics2, (int) c8708l2.nextLong()), true);
                                arrayList4.add(realmcJNI.realm_value_t_string_get(realm_value_tVar2.yandex, realm_value_tVar2));
                            } else {
                                C11602l c11602lAds3 = AbstractC8576l.ads(jArr4[0]);
                                ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(c11602lAds3, 10));
                                Iterator it4 = c11602lAds3.iterator();
                                while (true) {
                                    C8708l c8708l3 = (C8708l) it4;
                                    if (!c8708l3.f17914l) {
                                        realmcJNI.delete_valueArray(realm_value_t.loadAd(realm_value_tVarCrashlytics), realm_value_tVarCrashlytics);
                                        realmcJNI.delete_valueArray(realm_value_t.loadAd(realm_value_tVarCrashlytics2), realm_value_tVarCrashlytics2);
                                        realmcJNI.delete_valueArray(realm_value_t.loadAd(realm_value_tVarCrashlytics3), realm_value_tVarCrashlytics3);
                                        return new C6760l(i);
                                    }
                                    realm_value_t realm_value_tVar3 = new realm_value_t(realmcJNI.valueArray_getitem(realm_value_t.loadAd(realm_value_tVarCrashlytics3), realm_value_tVarCrashlytics3, (int) c8708l3.nextLong()), true);
                                    arrayList5.add(realmcJNI.realm_value_t_string_get(realm_value_tVar3.yandex, realm_value_tVar3));
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                C3101l c3101l = new C3101l(nativePointer);
                Object[] objArr = c3101l.yandex;
                if (objArr == null) {
                    objArr = null;
                }
                Object[] objArr2 = c3101l.loadAd;
                if (objArr2 == null) {
                    objArr2 = null;
                }
                Object[] objArr3 = c3101l.amazon;
                return new C2582l(i);
            case 3:
                new C3101l(nativePointer);
                return new C14529l(i);
            default:
                C15825l c15825l = (C15825l) obj;
                C3101l c3101l2 = new C3101l(nativePointer);
                Object[] objArr4 = c3101l2.yandex;
                if (objArr4 == null) {
                    objArr4 = null;
                }
                Object[] objArr5 = c3101l2.loadAd;
                if (objArr5 == null) {
                    objArr5 = null;
                }
                Object[] objArr6 = c3101l2.amazon;
                return new C16480l(c15825l, i2);
        }
    }
}
