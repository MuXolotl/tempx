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
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lؚۡٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7577l extends AbstractC14507l {
    public final /* synthetic */ int yandex;
    public static final C7577l loadAd = new C7577l(0);
    public static final C7577l crashlytics = new C7577l(1);
    public static final C7577l amazon = new C7577l(2);
    public static final C7577l purchase = new C7577l(3);
    public static final C7577l billing = new C7577l(4);
    public static final C7577l mopub = new C7577l(5);
    public static final C7577l admob = new C7577l(6);
    public static final C7577l subs = new C7577l(7);
    public static final C7577l isPro = new C7577l(8);
    public static final C7577l firebase = new C7577l(9);

    public /* synthetic */ C7577l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC14507l
    public final realm_value_t billing(C3585l c3585l, Object obj) {
        switch (this.yandex) {
            case 0:
                return c3585l.isPro((Boolean) obj);
            case 1:
                return c3585l.firebase((byte[]) obj);
            case 2:
                return c3585l.remoteconfig((C15062l) obj);
            case 3:
                return c3585l.startapp((Double) obj);
            case 4:
                return c3585l.subscription((Float) obj);
            case 5:
                return c3585l.isVip((Long) obj);
            case 6:
                C17918l c17918l = (C17918l) obj;
                return C11140l.f22375l.metrica(c17918l != null ? c17918l.mopub() : null);
            case 7:
                InterfaceC11616l interfaceC11616l = (InterfaceC11616l) obj;
                return c3585l.m1356native(interfaceC11616l != null ? (InterfaceC11386l) interfaceC11616l : null);
            case 8:
                InterfaceC15393l interfaceC15393l = (InterfaceC15393l) obj;
                return C11140l.f22375l.ads(interfaceC15393l != null ? ((C4695l) interfaceC15393l).yandex : null);
            default:
                return c3585l.m1360volatile((String) obj);
        }
    }

    @Override // defpackage.AbstractC14507l
    public final Object loadAd(realm_value_t realm_value_tVar) {
        int i = 0;
        switch (this.yandex) {
            case 0:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar));
            case 1:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                return realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex);
            case 2:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                long[] jArrCopyOf = Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length);
                C18316l c18316l = C15062l.Companion;
                long j = jArrCopyOf[1];
                long j2 = jArrCopyOf[0];
                c18316l.getClass();
                return C18316l.yandex(j, j2);
            case 3:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar));
            case 4:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar));
            case 5:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar));
            case 6:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
                byte[] bArr = new byte[12];
                realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                int length = sArrRealm_object_id_t_bytes_get.length;
                int i2 = 0;
                while (i < length) {
                    bArr[i2] = (byte) sArrRealm_object_id_t_bytes_get[i];
                    arrayList.add(Unit.INSTANCE);
                    i++;
                    i2++;
                }
                bsonObjectId$Companion.getClass();
                return BsonObjectId$Companion.yandex(bArr);
            case 7:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return new C15729l(AbstractC10340l.loadAd(realm_value_tVar));
            case 8:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[16];
                realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                int length2 = sArrRealm_uuid_t_bytes_get.length;
                int i3 = 0;
                while (i < length2) {
                    bArr2[i3] = (byte) sArrRealm_uuid_t_bytes_get[i];
                    arrayList2.add(Unit.INSTANCE);
                    i++;
                    i3++;
                }
                return new C4695l(bArr2);
            default:
                if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
                    return null;
                }
                return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
    }

    @Override // defpackage.AbstractC14507l
    public final Object purchase(Object obj) {
        return obj;
    }

    @Override // defpackage.AbstractC14507l
    public final Object yandex(Object obj) {
        return obj;
    }
}
