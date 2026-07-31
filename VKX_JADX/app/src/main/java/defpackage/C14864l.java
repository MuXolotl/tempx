package defpackage;

import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14864l {
    public final realm_value_t yandex;

    public final boolean equals(Object obj) {
        if (obj instanceof C14864l) {
            return this.yandex == ((C14864l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    public final String toString() {
        int i;
        Object objValueOf;
        realm_value_t realm_value_tVar = this.yandex;
        int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
        int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
        int length = iArrM1673throws.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i = 0;
                break;
            }
            i = iArrM1673throws[i3];
            if (AbstractC5020l.inmobi(i) == iRealm_value_t_type_get) {
                break;
            }
            i3++;
        }
        if (i == 0) {
            C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
            return null;
        }
        String str = "null";
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                objValueOf = "null";
                break;
            case 1:
                objValueOf = Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar));
                break;
            case 2:
                objValueOf = Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar));
                break;
            case 3:
                objValueOf = realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
                break;
            case 4:
                realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                objValueOf = realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex).toString();
                break;
            case 5:
                objValueOf = AbstractC10340l.loadAd(realm_value_tVar).toString();
                break;
            case 6:
                objValueOf = Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar));
                break;
            case 7:
                objValueOf = Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar));
                break;
            case 8:
                realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                objValueOf = C12339l.amazon(Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length));
                break;
            case 9:
                byte[] bArr = new byte[12];
                realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                int length2 = sArrRealm_object_id_t_bytes_get.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    bArr[i5] = (byte) sArrRealm_object_id_t_bytes_get[i4];
                    arrayList.add(Unit.INSTANCE);
                    i4++;
                    i5++;
                }
                objValueOf = bArr.toString();
                break;
            case 10:
                objValueOf = AbstractC10340l.yandex(realm_value_tVar).toString();
                break;
            case 11:
                byte[] bArr2 = new byte[16];
                realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                int length3 = sArrRealm_uuid_t_bytes_get.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length3) {
                    bArr2[i7] = (byte) sArrRealm_uuid_t_bytes_get[i6];
                    arrayList2.add(Unit.INSTANCE);
                    i6++;
                    i7++;
                }
                objValueOf = bArr2.toString();
                break;
            default:
                objValueOf = "RealmValueTransport{type: UNKNOWN, value: UNKNOWN}";
                break;
        }
        int iRealm_value_t_type_get2 = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
        for (int i8 : AbstractC5020l.m1673throws(14)) {
            if (AbstractC5020l.inmobi(i8) == iRealm_value_t_type_get2) {
                i2 = i8;
                if (i2 != 0) {
                    C11983l.billing(iRealm_value_t_type_get2, "Unknown value type: ");
                    return null;
                }
                StringBuilder sb = new StringBuilder("RealmValueTransport{type: ");
                switch (i2) {
                    case 1:
                        str = "RLM_TYPE_NULL";
                        break;
                    case 2:
                        str = "RLM_TYPE_INT";
                        break;
                    case 3:
                        str = "RLM_TYPE_BOOL";
                        break;
                    case 4:
                        str = "RLM_TYPE_STRING";
                        break;
                    case 5:
                        str = "RLM_TYPE_BINARY";
                        break;
                    case 6:
                        str = "RLM_TYPE_TIMESTAMP";
                        break;
                    case 7:
                        str = "RLM_TYPE_FLOAT";
                        break;
                    case 8:
                        str = "RLM_TYPE_DOUBLE";
                        break;
                    case 9:
                        str = "RLM_TYPE_DECIMAL128";
                        break;
                    case 10:
                        str = "RLM_TYPE_OBJECT_ID";
                        break;
                    case 11:
                        str = "RLM_TYPE_LINK";
                        break;
                    case 12:
                        str = "RLM_TYPE_UUID";
                        break;
                    case 13:
                        str = "RLM_TYPE_LIST";
                        break;
                    case 14:
                        str = "RLM_TYPE_DICTIONARY";
                        break;
                }
                sb.append(str);
                sb.append(", value: ");
                sb.append(objValueOf);
                sb.append("}");
                return sb.toString();
            }
        }
        if (i2 != 0) {
            C11983l.billing(iRealm_value_t_type_get2, "Unknown value type: ");
            return null;
        }
        StringBuilder sb2 = new StringBuilder("RealmValueTransport{type: ");
        switch (i2) {
            case 1:
                str = "RLM_TYPE_NULL";
                break;
            case 2:
                str = "RLM_TYPE_INT";
                break;
            case 3:
                str = "RLM_TYPE_BOOL";
                break;
            case 4:
                str = "RLM_TYPE_STRING";
                break;
            case 5:
                str = "RLM_TYPE_BINARY";
                break;
            case 6:
                str = "RLM_TYPE_TIMESTAMP";
                break;
            case 7:
                str = "RLM_TYPE_FLOAT";
                break;
            case 8:
                str = "RLM_TYPE_DOUBLE";
                break;
            case 9:
                str = "RLM_TYPE_DECIMAL128";
                break;
            case 10:
                str = "RLM_TYPE_OBJECT_ID";
                break;
            case 11:
                str = "RLM_TYPE_LINK";
                break;
            case 12:
                str = "RLM_TYPE_UUID";
                break;
            case 13:
                str = "RLM_TYPE_LIST";
                break;
            case 14:
                str = "RLM_TYPE_DICTIONARY";
                break;
        }
        sb2.append(str);
        sb2.append(", value: ");
        sb2.append(objValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
