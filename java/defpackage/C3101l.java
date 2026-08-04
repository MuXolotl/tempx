package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_collection_move_t;
import io.realm.kotlin.internal.interop.realm_index_range_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lٟؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3101l {
    public final Object[] amazon;
    public final Object[] crashlytics;
    public final Object[] loadAd;
    public final Object[] yandex;

    public C3101l(NativePointer nativePointer) {
        realm_collection_move_t realm_collection_move_tVar;
        realm_collection_move_t realm_collection_move_tVar2;
        long[] jArr = new long[1];
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        long[] jArr4 = new long[1];
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_collection_changes_get_num_changes(ptr$cinterop_release, jArr2, jArr, jArr3, jArr4, new boolean[1], new boolean[1]);
        long[] jArr5 = new long[(int) jArr[0]];
        int i2 = (int) jArr3[0];
        long[] jArr6 = new long[i2];
        long[] jArr7 = new long[i2];
        long[] jArr8 = new long[(int) jArr2[0]];
        long jNew_collectionMoveArray = realmcJNI.new_collectionMoveArray((int) jArr4[0]);
        if (jNew_collectionMoveArray == 0) {
            realm_collection_move_tVar = null;
        } else {
            realm_collection_move_tVar = new realm_collection_move_t();
            realm_collection_move_tVar.yandex = jNew_collectionMoveArray;
        }
        long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
        long j = jArr2[0];
        long j2 = jArr[0];
        long j3 = jArr3[0];
        realm_collection_move_t realm_collection_move_tVar3 = realm_collection_move_tVar;
        realmcJNI.realm_collection_changes_get_changes(ptr$cinterop_release2, jArr8, j, jArr5, j2, jArr6, j3, jArr7, j3, realm_collection_move_tVar.yandex, realm_collection_move_tVar3, jArr4[0]);
        int length = jArr5.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = (int) jArr5[i3];
        }
        int length2 = jArr8.length;
        int[] iArr2 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr2[i4] = (int) jArr8[i4];
        }
        int length3 = jArr6.length;
        int[] iArr3 = new int[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            iArr3[i5] = (int) jArr6[i5];
        }
        int length4 = jArr7.length;
        int[] iArr4 = new int[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            iArr4[i6] = (int) jArr7[i6];
        }
        realmcJNI.delete_collectionMoveArray(realm_collection_move_tVar3.yandex, realm_collection_move_tVar3);
        long[] jArr9 = new long[1];
        long[] jArr10 = new long[1];
        long[] jArr11 = new long[1];
        long[] jArr12 = new long[1];
        realmcJNI.realm_collection_changes_get_num_ranges(longPointerWrapper.getPtr$cinterop_release(), jArr10, jArr9, jArr11, jArr12);
        realm_index_range_t realm_index_range_tVarLoadAd = AbstractC9795l.loadAd((int) jArr9[0]);
        realm_index_range_t realm_index_range_tVarLoadAd2 = AbstractC9795l.loadAd((int) jArr11[0]);
        realm_index_range_t realm_index_range_tVarLoadAd3 = AbstractC9795l.loadAd((int) jArr11[0]);
        realm_index_range_t realm_index_range_tVarLoadAd4 = AbstractC9795l.loadAd((int) jArr10[0]);
        long jNew_collectionMoveArray2 = realmcJNI.new_collectionMoveArray((int) jArr12[0]);
        if (jNew_collectionMoveArray2 == 0) {
            realm_collection_move_tVar2 = null;
        } else {
            realm_collection_move_tVar2 = new realm_collection_move_t();
            realm_collection_move_tVar2.yandex = jNew_collectionMoveArray2;
        }
        long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
        long j4 = jArr10[0];
        long j5 = jArr9[0];
        long j6 = jArr11[0];
        realmcJNI.realm_collection_changes_get_ranges(ptr$cinterop_release3, realm_index_range_tVarLoadAd4.yandex, realm_index_range_tVarLoadAd4, j4, realm_index_range_tVarLoadAd.yandex, realm_index_range_tVarLoadAd, j5, realm_index_range_tVarLoadAd2.yandex, realm_index_range_tVarLoadAd2, j6, realm_index_range_tVarLoadAd3.yandex, realm_index_range_tVarLoadAd3, j6, realm_collection_move_tVar2.yandex, realm_collection_move_tVar2, jArr12[0]);
        int i7 = (int) jArr10[0];
        C0316l[] c0316lArr = new C0316l[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            realm_index_range_t realm_index_range_tVarYandex = AbstractC9795l.yandex(realm_index_range_tVarLoadAd4, i8);
            int iRealm_index_range_t_from_get = (int) realmcJNI.realm_index_range_t_from_get(realm_index_range_tVarYandex.yandex, realm_index_range_tVarYandex);
            realm_index_range_t realm_index_range_tVarYandex2 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd4, i8);
            c0316lArr[i8] = new C0316l(iRealm_index_range_t_from_get, ((int) realmcJNI.realm_index_range_t_to_get(realm_index_range_tVarYandex2.yandex, realm_index_range_tVarYandex2)) - iRealm_index_range_t_from_get);
        }
        this.yandex = c0316lArr;
        int i9 = (int) jArr9[0];
        C0316l[] c0316lArr2 = new C0316l[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            realm_index_range_t realm_index_range_tVarYandex3 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd, i10);
            int iRealm_index_range_t_from_get2 = (int) realmcJNI.realm_index_range_t_from_get(realm_index_range_tVarYandex3.yandex, realm_index_range_tVarYandex3);
            realm_index_range_t realm_index_range_tVarYandex4 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd, i10);
            c0316lArr2[i10] = new C0316l(iRealm_index_range_t_from_get2, ((int) realmcJNI.realm_index_range_t_to_get(realm_index_range_tVarYandex4.yandex, realm_index_range_tVarYandex4)) - iRealm_index_range_t_from_get2);
        }
        this.loadAd = c0316lArr2;
        int i11 = (int) jArr11[0];
        C0316l[] c0316lArr3 = new C0316l[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            realm_index_range_t realm_index_range_tVarYandex5 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd2, i12);
            int iRealm_index_range_t_from_get3 = (int) realmcJNI.realm_index_range_t_from_get(realm_index_range_tVarYandex5.yandex, realm_index_range_tVarYandex5);
            realm_index_range_t realm_index_range_tVarYandex6 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd2, i12);
            c0316lArr3[i12] = new C0316l(iRealm_index_range_t_from_get3, ((int) realmcJNI.realm_index_range_t_to_get(realm_index_range_tVarYandex6.yandex, realm_index_range_tVarYandex6)) - iRealm_index_range_t_from_get3);
        }
        this.crashlytics = c0316lArr3;
        int i13 = (int) jArr11[0];
        C0316l[] c0316lArr4 = new C0316l[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            realm_index_range_t realm_index_range_tVarYandex7 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd3, i14);
            int iRealm_index_range_t_from_get4 = (int) realmcJNI.realm_index_range_t_from_get(realm_index_range_tVarYandex7.yandex, realm_index_range_tVarYandex7);
            realm_index_range_t realm_index_range_tVarYandex8 = AbstractC9795l.yandex(realm_index_range_tVarLoadAd3, i14);
            c0316lArr4[i14] = new C0316l(iRealm_index_range_t_from_get4, ((int) realmcJNI.realm_index_range_t_to_get(realm_index_range_tVarYandex8.yandex, realm_index_range_tVarYandex8)) - iRealm_index_range_t_from_get4);
        }
        this.amazon = c0316lArr4;
        realmcJNI.delete_indexRangeArray(realm_index_range_tVarLoadAd.yandex, realm_index_range_tVarLoadAd);
        realmcJNI.delete_indexRangeArray(realm_index_range_tVarLoadAd2.yandex, realm_index_range_tVarLoadAd2);
        realmcJNI.delete_indexRangeArray(realm_index_range_tVarLoadAd3.yandex, realm_index_range_tVarLoadAd3);
        realmcJNI.delete_indexRangeArray(realm_index_range_tVarLoadAd4.yandex, realm_index_range_tVarLoadAd4);
        realmcJNI.delete_collectionMoveArray(realm_collection_move_tVar2.yandex, realm_collection_move_tVar2);
    }
}
