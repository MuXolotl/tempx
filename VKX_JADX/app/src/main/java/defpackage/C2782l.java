package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkerParameters;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lؔٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2782l implements InterfaceC15244l, InterfaceC10110l, InterfaceC2938l, InterfaceC7483l, InterfaceC13540l, InterfaceC5404l, InterfaceC13952l, InterfaceC15446l, InterfaceC17030l, InterfaceC12873l, InterfaceC16011l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static C2494l f6052l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6072l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3199l f6058l = new C3199l();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13571l f6051l = new C13571l();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2782l f6064l = new C2782l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2782l f6063l = new C2782l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2782l f6067l = new C2782l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12732l f6055l = new C12732l();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2782l f6066l = new C2782l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C2782l f6061l = new C2782l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C2782l f6068l = new C2782l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2782l f6065l = new C2782l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C2782l f6050l = new C2782l(12);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C2782l f6069l = new C2782l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C2782l f6062l = new C2782l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C2782l f6056l = new C2782l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C2782l f6060l = new C2782l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C2782l f6070l = new C2782l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C2782l f6059l = new C2782l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C2782l f6054l = new C2782l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C2782l f6053l = new C2782l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C2782l f6049l = new C2782l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C2782l f6071l = new C2782l(22);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C2782l f6057l = new C2782l(23);

    public /* synthetic */ C2782l(int i) {
        this.f6072l = i;
    }

    public static String ad(InterfaceC9671l interfaceC9671l) {
        Class<?> cls = interfaceC9671l.getClass();
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(c2336l.loadAd(cls));
        String strYandex = interfaceC13226lYandex != null ? interfaceC13226lYandex.yandex() : null;
        String strBilling = c2336l.loadAd(interfaceC9671l.getClass()).billing();
        C1332l c1332lSignature = ((InterfaceC2851l) interfaceC9671l).getF36799l();
        if (c1332lSignature == null) {
            return strBilling + "{state=UNMANAGED, schemaName=" + strYandex + ", hashCode=" + interfaceC9671l.hashCode() + "}";
        }
        InterfaceC7832l interfaceC7832l = c1332lSignature.f3419l;
        if (AbstractC15011l.isPro(interfaceC9671l)) {
            C8862l c8862lAmazon = AbstractC6710l.amazon(interfaceC9671l);
            long j = c8862lAmazon.loadAd;
            long j2 = c8862lAmazon.crashlytics.f21878l;
            String str = ((C12125l) interfaceC7832l.mo1843l().f33215l).amazon;
            StringBuilder sb = new StringBuilder();
            sb.append(strBilling);
            sb.append("{state=VALID, schemaName=");
            sb.append(strYandex);
            sb.append(", objKey=");
            sb.append(j);
            sb.append(", version=");
            sb.append(j2);
            sb.append(", realm=");
            return AbstractC0653l.ads(sb, str, "}");
        }
        return strBilling + "{state=" + (interfaceC7832l.isClosed() ? "CLOSED" : "INVALID") + ", schemaName=" + strYandex + ", realm=" + ((C12125l) interfaceC7832l.mo1843l().f33215l).amazon + ", hashCode=" + interfaceC9671l.hashCode() + "}";
    }

    public static Object adcel(C1332l c1332l, String str, InterfaceC1388l interfaceC1388l, boolean z, boolean z2) {
        Object obj;
        Object objIsPro;
        int i;
        C14076l c14076l;
        InterfaceC1388l interfaceC1388lLoadAd;
        InterfaceC7832l interfaceC7832l = c1332l.f3419l;
        C5501l c5501l = c1332l.f3423l;
        c1332l.yandex();
        C0717l c0717lVip = vip(c1332l, str, 1, interfaceC1388l, z);
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        long j = c0717lVip.amazon;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(InterfaceC11343l.class)) || interfaceC1388l.equals(c2336l.loadAd(DynamicMutableRealmObject.class))) {
            obj = null;
            objIsPro = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l);
        } else if (interfaceC1388l.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            obj = null;
            boolean z3 = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
            if (z3) {
                objIsPro = null;
            } else {
                if (z3) {
                    C18725l.billing();
                    return null;
                }
                int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
                int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
                int i3 = 0;
                int length = iArrM1673throws.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i = 0;
                        break;
                    }
                    i = iArrM1673throws[i4];
                    int[] iArr = iArrM1673throws;
                    if (AbstractC5020l.inmobi(i) == iRealm_value_t_type_get) {
                        break;
                    }
                    i4++;
                    iArrM1673throws = iArr;
                }
                if (i == 0) {
                    C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
                    return null;
                }
                switch (AbstractC5020l.inmobi(i)) {
                    case 0:
                        objIsPro = null;
                        break;
                    case 1:
                        objIsPro = new C14076l(1, AbstractC18202l.yandex.loadAd(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)));
                        break;
                    case 2:
                        c14076l = new C14076l(2, AbstractC18202l.yandex.loadAd(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)));
                        objIsPro = c14076l;
                        break;
                    case 3:
                        c14076l = new C14076l(3, AbstractC18202l.yandex.loadAd(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar));
                        objIsPro = c14076l;
                        break;
                    case 4:
                        realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                        c14076l = new C14076l(4, AbstractC18202l.yandex.loadAd(byte[].class), realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex));
                        objIsPro = c14076l;
                        break;
                    case 5:
                        c14076l = new C14076l(5, AbstractC18202l.yandex.loadAd(InterfaceC11616l.class), new C15729l(AbstractC10340l.loadAd(realm_value_tVar)));
                        objIsPro = c14076l;
                        break;
                    case 6:
                        c14076l = new C14076l(6, AbstractC18202l.yandex.loadAd(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                        objIsPro = c14076l;
                        break;
                    case 7:
                        objIsPro = new C14076l(7, AbstractC18202l.yandex.loadAd(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                        break;
                    case 8:
                        realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                        long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                        long[] jArrCopyOf = Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length);
                        C18316l c18316l = C15062l.Companion;
                        long j2 = jArrCopyOf[1];
                        long j3 = jArrCopyOf[0];
                        c18316l.getClass();
                        c14076l = new C14076l(8, AbstractC18202l.yandex.loadAd(C15062l.class), C18316l.yandex(j2, j3));
                        objIsPro = c14076l;
                        break;
                    case 9:
                        BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
                        byte[] bArr = new byte[12];
                        realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                        short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                        ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                        int length2 = sArrRealm_object_id_t_bytes_get.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            bArr[i3] = (byte) sArrRealm_object_id_t_bytes_get[i5];
                            arrayList.add(Unit.INSTANCE);
                            i5++;
                            i3++;
                        }
                        bsonObjectId$Companion.getClass();
                        c14076l = new C14076l(9, AbstractC18202l.yandex.loadAd(C17918l.class), BsonObjectId$Companion.yandex(bArr));
                        objIsPro = c14076l;
                        break;
                    case 10:
                        if (z2) {
                            interfaceC1388lLoadAd = c2336l.loadAd(DynamicMutableRealmObject.class);
                        } else {
                            if (z2) {
                                C18725l.billing();
                                return null;
                            }
                            interfaceC1388lLoadAd = c2336l.loadAd(InterfaceC11343l.class);
                        }
                        c14076l = new C14076l(11, AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), (InterfaceC11343l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388lLoadAd, c5501l, interfaceC7832l)));
                        objIsPro = c14076l;
                        break;
                    case 11:
                        byte[] bArr2 = new byte[16];
                        realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                        short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                        ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                        int length3 = sArrRealm_uuid_t_bytes_get.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            bArr2[i3] = (byte) sArrRealm_uuid_t_bytes_get[i6];
                            arrayList2.add(Unit.INSTANCE);
                            i6++;
                            i3++;
                        }
                        objIsPro = new C14076l(10, AbstractC18202l.yandex.loadAd(InterfaceC15393l.class), new C4695l(bArr2));
                        break;
                    case 12:
                        long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_get_list(ptr$cinterop_release2, j), false, 2, null);
                        objIsPro = new C14076l(12, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C3364l(c1332l, longPointerWrapper2, new C4619l(c5501l, interfaceC7832l, longPointerWrapper2, true, z2)));
                        break;
                    case 13:
                        long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_get_dictionary(ptr$cinterop_release3, j), false, 2, null);
                        objIsPro = new C14076l(13, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C18234l(c1332l, longPointerWrapper3, AbstractC7477l.purchase(c5501l, interfaceC7832l, longPointerWrapper3, true, z2)));
                        break;
                    default:
                        C8339l.metrica("Unsupported type: ".concat(AbstractC12589l.m3421native(i)));
                        return null;
                }
            }
        } else {
            obj = null;
            objIsPro = ((AbstractC14507l) AbstractC8676l.smaato(interfaceC1388l, AbstractC16417l.yandex)).amazon(realm_value_tVar);
        }
        if (objIsPro == null) {
            return obj;
        }
        if (interfaceC1388l.mo886strictfp(objIsPro)) {
            return objIsPro;
        }
        throw new ClassCastException(AbstractC14814l.ads("Retrieving value of type '", interfaceC1388l.license(), "' but was of type '", AbstractC18202l.yandex.loadAd(objIsPro.getClass()).license(), "'"));
    }

    public static C3364l ads(C1332l c1332l, String str, InterfaceC1388l interfaceC1388l, boolean z, boolean z2) {
        c1332l.yandex();
        int i = 2;
        C0717l c0717lVip = vip(c1332l, str, 2, interfaceC1388l, z);
        int i2 = c0717lVip.billing;
        if (i2 != 5) {
            if (i2 != 9) {
                i = 1;
            } else {
                i = !c1332l.f3419l.mo1847l().yandex(c0717lVip.subs).admob ? 3 : 4;
            }
        }
        return license(c1332l, c0717lVip, interfaceC1388l, i, true, z2);
    }

    public static void advert(C2782l c2782l) throws GeneralSecurityException {
        if (c2782l != null) {
            return;
        }
        C18262l.ads("SecretKeyAccess is required");
    }

    public static void isPro(InterfaceC2851l interfaceC2851l, InterfaceC9671l interfaceC9671l, int i, Map map) {
        List<C8195l> listAds;
        int i2 = i;
        Map map2 = map;
        if (interfaceC2851l instanceof InterfaceC11343l) {
            DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) interfaceC2851l;
            if (!(interfaceC9671l instanceof InterfaceC11343l)) {
                Map mapCrashlytics = AbstractC5293l.loadAd(AbstractC18202l.yandex.loadAd(interfaceC9671l.getClass())).crashlytics();
                ArrayList arrayList = new ArrayList(mapCrashlytics.size());
                for (Map.Entry entry : mapCrashlytics.entrySet()) {
                    arrayList.add(new C8195l(entry.getKey(), ((InterfaceC2463l) entry.getValue()).get(interfaceC9671l)));
                }
                listAds = arrayList;
            } else {
                if (!(interfaceC9671l instanceof C12555l)) {
                    C18073l.license("Unexpected import of dynamic managed object");
                    return;
                }
                listAds = AbstractC8676l.ads(((C12555l) interfaceC9671l).f24739l);
            }
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listAds, 10));
            for (C8195l c8195l : listAds) {
                subscription(((InterfaceC2851l) dynamicMutableRealmObject).getF36799l(), (String) c8195l.f17098l, c8195l.f17097l, i2, map2);
                arrayList2.add(Unit.INSTANCE);
            }
            return;
        }
        C11140l c11140l = C11140l.f22375l;
        C2330l c2330l = interfaceC2851l.getF36799l().f3424l;
        ArrayList arrayList3 = c2330l.crashlytics;
        ArrayList<C0717l> arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            C0717l c0717l = (C0717l) obj;
            if (!c0717l.firebase && !c0717l.admob) {
                arrayList4.add(obj);
            }
        }
        for (C0717l c0717l2 : arrayList4) {
            InterfaceC1835l interfaceC1835l = c0717l2.yandex;
            if (interfaceC1835l != null) {
                InterfaceC2463l interfaceC2463l = (InterfaceC2463l) interfaceC1835l;
                long j = c0717l2.amazon;
                int i3 = c0717l2.purchase;
                int iInmobi = AbstractC5020l.inmobi(i3);
                int i4 = 1;
                if (iInmobi == 0) {
                    int iInmobi2 = AbstractC5020l.inmobi(c0717l2.billing);
                    if (iInmobi2 == 4) {
                        Object obj2 = interfaceC2463l.get(interfaceC9671l);
                        C1332l c1332lSignature = interfaceC2851l.getF36799l();
                        long j2 = c0717l2.amazon;
                        C3585l c3585l = new C3585l(16);
                        if (obj2 == null) {
                            isVip(c1332lSignature, j2, c3585l.signatures());
                            Unit unit = Unit.INSTANCE;
                        } else if (obj2 instanceof String) {
                            isVip(c1332lSignature, j2, c3585l.m1360volatile((String) obj2));
                            Unit unit2 = Unit.INSTANCE;
                        } else if (obj2 instanceof byte[]) {
                            isVip(c1332lSignature, j2, c3585l.firebase((byte[]) obj2));
                            Unit unit3 = Unit.INSTANCE;
                        } else if (obj2 instanceof Long) {
                            isVip(c1332lSignature, j2, c3585l.isVip((Long) obj2));
                            Unit unit4 = Unit.INSTANCE;
                        } else if (obj2 instanceof Boolean) {
                            isVip(c1332lSignature, j2, c3585l.isPro((Boolean) obj2));
                            Unit unit5 = Unit.INSTANCE;
                        } else if (obj2 instanceof InterfaceC11386l) {
                            isVip(c1332lSignature, j2, c3585l.m1356native((InterfaceC11386l) obj2));
                            Unit unit6 = Unit.INSTANCE;
                        } else if (obj2 instanceof Float) {
                            isVip(c1332lSignature, j2, c3585l.subscription((Float) obj2));
                            Unit unit7 = Unit.INSTANCE;
                        } else if (obj2 instanceof Double) {
                            isVip(c1332lSignature, j2, c3585l.startapp((Double) obj2));
                            Unit unit8 = Unit.INSTANCE;
                        } else if (obj2 instanceof C15062l) {
                            isVip(c1332lSignature, j2, c3585l.remoteconfig((C15062l) obj2));
                            Unit unit9 = Unit.INSTANCE;
                        } else if (obj2 instanceof C17918l) {
                            isVip(c1332lSignature, j2, c11140l.metrica(((C17918l) obj2).mopub()));
                            Unit unit10 = Unit.INSTANCE;
                        } else if (obj2 instanceof InterfaceC15393l) {
                            isVip(c1332lSignature, j2, c11140l.ads(((C4695l) ((InterfaceC15393l) obj2)).yandex));
                            Unit unit11 = Unit.INSTANCE;
                        } else if (obj2 instanceof C1332l) {
                            isVip(c1332lSignature, j2, c3585l.inmobi((C1332l) obj2));
                            Unit unit12 = Unit.INSTANCE;
                        } else {
                            if (!(obj2 instanceof InterfaceC3327l)) {
                                C8339l.metrica(AbstractC15560l.subscription(obj2, "Unsupported value for transport: "));
                                return;
                            }
                            AbstractC16417l.loadAd(c3585l, (InterfaceC3327l) obj2, new C4908l(c1332lSignature, j2, i4), new C7892l(c1332lSignature, j2, i2, map2), new C2228l(c1332lSignature, j2, obj2, i, map, 0), new C2228l(c1332lSignature, j2, obj2, i, map, 1));
                        }
                        c3585l.tapsense();
                    } else if (iInmobi2 != 8) {
                        interfaceC2463l.appmetrica(interfaceC2851l, interfaceC2463l.get(interfaceC9671l));
                    } else if (interfaceC2851l.getF36799l().f3419l.mo1847l().crashlytics(c0717l2.subs).admob) {
                        InterfaceC13166l interfaceC13166l = (InterfaceC13166l) interfaceC2463l.get(interfaceC9671l);
                        C1332l c1332lSignature2 = interfaceC2851l.getF36799l();
                        if (interfaceC13166l != null) {
                            long ptr$cinterop_release = c1332lSignature2.f3422l.getPtr$cinterop_release();
                            int i5 = AbstractC9795l.yandex;
                            isPro(AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC18202l.yandex.loadAd(interfaceC13166l.getClass()), c1332lSignature2.f3423l, c1332lSignature2.f3419l), interfaceC13166l, i2, map2);
                        } else {
                            C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
                            isVip(c1332lSignature2, j, c3585lRemoteconfig.signatures());
                            Unit unit13 = Unit.INSTANCE;
                            c3585lRemoteconfig.tapsense();
                        }
                    } else {
                        InterfaceC9671l interfaceC9671lYandex = (InterfaceC7457l) interfaceC2463l.get(interfaceC9671l);
                        C1332l c1332lSignature3 = interfaceC2851l.getF36799l();
                        c1332lSignature3.yandex();
                        C5501l c5501l = c1332lSignature3.f3423l;
                        InterfaceC7832l interfaceC7832l = c1332lSignature3.f3419l;
                        if (interfaceC9671lYandex != null) {
                            C1332l c1332lSignature4 = ((InterfaceC2851l) interfaceC9671lYandex).getF36799l();
                            if (c1332lSignature4 == null) {
                                interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lYandex, i2, map2);
                            } else if (!AbstractC8576l.yandex(c1332lSignature4.f3419l, interfaceC7832l)) {
                                C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                                return;
                            }
                        } else {
                            interfaceC9671lYandex = null;
                        }
                        C1332l c1332lSignature5 = interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36799l() : null;
                        C3585l c3585l2 = new C3585l(16);
                        isVip(c1332lSignature3, j, c3585l2.inmobi(c1332lSignature5));
                        Unit unit14 = Unit.INSTANCE;
                        c3585l2.tapsense();
                    }
                } else if (iInmobi == 1) {
                    C3364l c3364l = (C3364l) interfaceC2463l.get(interfaceC2851l);
                    c3364l.clear();
                    c3364l.f7162l.applovin(c3364l.pro(), (InterfaceC11334l) interfaceC2463l.get(interfaceC9671l), i2, map2);
                } else if (iInmobi == 2) {
                    C15525l c15525l = (C15525l) interfaceC2463l.get(interfaceC2851l);
                    c15525l.clear();
                    c15525l.f30332l.firebase((C15525l) interfaceC2463l.get(interfaceC9671l), i2, map2);
                } else {
                    if (iInmobi != 3) {
                        throw new C13165l("An operation is not implemented: ".concat("Collection type " + AbstractC11043l.license(i3) + " is not supported"));
                    }
                    C18234l c18234l = (C18234l) interfaceC2463l.get(interfaceC2851l);
                    c18234l.clear();
                    c18234l.f13671l.mo796native((InterfaceC2599l) interfaceC2463l.get(interfaceC9671l), i2, map2);
                }
            } else if (c0717l2.yandex != null) {
                C18073l.license(AbstractC14814l.adcel("Typed object should always have an accessor: ", c2330l.yandex, ".", c0717l2.loadAd));
                return;
            }
            i2 = i;
            map2 = map;
        }
    }

    public static void isVip(C1332l c1332l, long j, realm_value_t realm_value_tVar) {
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar, false);
    }

    public static C3364l license(C1332l c1332l, C0717l c0717l, InterfaceC1388l interfaceC1388l, int i, boolean z, boolean z2) {
        InterfaceC14426l c10038l;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        String str = c0717l.subs;
        long j = c0717l.amazon;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_get_list(ptr$cinterop_release, j), false, 2, null);
        C5501l c5501l = c1332l.f3423l;
        InterfaceC7832l interfaceC7832l = c1332l.f3419l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            c10038l = new C10038l(c5501l, interfaceC7832l, AbstractC16417l.yandex(interfaceC1388l), longPointerWrapper2, 21);
            longPointerWrapper2 = longPointerWrapper2;
        } else if (iInmobi == 1) {
            c10038l = new C4619l(c5501l, interfaceC7832l, longPointerWrapper2, z, z2);
        } else if (iInmobi == 2) {
            c10038l = new C5931l(c5501l, interfaceC7832l, longPointerWrapper2, interfaceC1388l, interfaceC7832l.mo1847l().crashlytics(str).loadAd, 1);
        } else {
            if (iInmobi != 3) {
                C18725l.billing();
                return null;
            }
            c10038l = new C5931l(c5501l, interfaceC7832l, longPointerWrapper2, interfaceC1388l, interfaceC7832l.mo1847l().crashlytics(str).loadAd, 0);
        }
        return new C3364l(c1332l, longPointerWrapper2, c10038l);
    }

    public static int pro(InterfaceC9671l interfaceC9671l) {
        C1332l c1332lSignature = ((InterfaceC2851l) interfaceC9671l).getF36799l();
        if (c1332lSignature == null) {
            String str = AbstractC8942l.yandex;
            return System.identityHashCode(interfaceC9671l);
        }
        boolean zIsPro = AbstractC15011l.isPro(interfaceC9671l);
        C8862l c8862l = c1332lSignature.mo875abstract().isClosed() ? new C8862l(-1L, -1L, new C10821l(0L), "") : AbstractC6710l.amazon(interfaceC9671l);
        String str2 = ((C12125l) c1332lSignature.f3419l.mo1843l().f33215l).crashlytics;
        int i = zIsPro ? 1231 : 1237;
        return str2.hashCode() + ((c8862l.hashCode() + (i * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (defpackage.AbstractC8576l.yandex(defpackage.AbstractC6889l.isPro(defpackage.AbstractC18202l.yandex.loadAd(r34.getClass())), r10) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void subscription(final defpackage.C1332l r32, java.lang.String r33, final java.lang.Object r34, final int r35, final java.util.Map r36) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2782l.subscription(lؒۛۘ, java.lang.String, java.lang.Object, int, java.util.Map):void");
    }

    public static String tapsense(int i, InterfaceC1388l interfaceC1388l, boolean z) {
        String str;
        String str2 = interfaceC1388l + (z ? "?" : "");
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return str2;
        }
        if (iInmobi == 1) {
            str = "RealmList<";
        } else if (iInmobi == 2) {
            str = "RealmSet<";
        } else {
            if (iInmobi != 3) {
                throw new C13165l("An operation is not implemented: ".concat("Unsupported collection type: ".concat(AbstractC11043l.license(i))));
            }
            str = "RealmDictionary<";
        }
        return AbstractC15560l.Signature(str, str2, ">");
    }

    public static C0717l vip(C1332l c1332l, String str, int i, InterfaceC1388l interfaceC1388l, boolean z) {
        EnumC4244l enumC4244l;
        InterfaceC1388l interfaceC1388lIsPro = AbstractC6889l.isPro(interfaceC1388l);
        C0717l c0717lLoadAd = c1332l.f3424l.loadAd(str);
        boolean z2 = c0717lLoadAd.mopub;
        int i2 = c0717lLoadAd.purchase;
        int i3 = c0717lLoadAd.billing;
        switch (AbstractC5020l.inmobi(i3)) {
            case 0:
                enumC4244l = EnumC4244l.f8700l;
                break;
            case 1:
                enumC4244l = EnumC4244l.f8703l;
                break;
            case 2:
                enumC4244l = EnumC4244l.f8706l;
                break;
            case 3:
                enumC4244l = EnumC4244l.f8705l;
                break;
            case 4:
                enumC4244l = EnumC4244l.f8699l;
                break;
            case 5:
                enumC4244l = EnumC4244l.f8704l;
                break;
            case 6:
                enumC4244l = EnumC4244l.f8701l;
                break;
            case 7:
                enumC4244l = EnumC4244l.f8702l;
                break;
            case 8:
                enumC4244l = EnumC4244l.f8709l;
                break;
            case 9:
                enumC4244l = EnumC4244l.f8709l;
                break;
            case 10:
                enumC4244l = EnumC4244l.f8708l;
                break;
            case 11:
                enumC4244l = EnumC4244l.f8710l;
                break;
            case 12:
                enumC4244l = EnumC4244l.f8707l;
                break;
            default:
                C18262l.subs("Unknown storage type: ".concat(AbstractC4338l.m1529extends(i3)));
                return null;
        }
        InterfaceC1388l interfaceC1388l2 = enumC4244l.f8712l;
        if (i == i2 && AbstractC8576l.yandex(interfaceC1388lIsPro, interfaceC1388l2) && z == z2) {
            return c0717lLoadAd;
        }
        C8339l.metrica(AbstractC9361l.advert(AbstractC14814l.license("Trying to access property '", c1332l.f3421l, ".", str, "' as type: '"), tapsense(i, interfaceC1388lIsPro, z), "' but actual schema type is '", tapsense(i2, interfaceC1388l2, z2), "'"));
        return null;
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC13952l
    public float admob() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC5404l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC17030l
    public long billing(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = AbstractC7789l.yandex;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.InterfaceC13952l
    public C4529l crashlytics() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.InterfaceC13952l
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC13952l
    public boolean loadAd(float f) {
        throw new IllegalStateException("not implemented");
    }

    public AbstractC16137l metrica(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                AbstractC16137l abstractC16137l = (AbstractC16137l) Class.forName(str).asSubclass(AbstractC16137l.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                if (!abstractC16137l.amazon) {
                    return abstractC16137l;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                C14513l.tapsense().ads(AbstractC3886l.yandex, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            C14513l.tapsense().ads(AbstractC3886l.yandex, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC13952l
    public boolean mopub(float f) {
        return false;
    }

    @Override // defpackage.InterfaceC12873l
    public InterfaceC6646l purchase(C9887l c9887l, C16272l c16272l) {
        return new C1016l(c9887l, c16272l);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return AbstractC5103l.billing((Executor) c11644l.mo622l(new C12638l(InterfaceC2028l.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC12873l
    public InterfaceC6646l smaato() {
        return new C1016l(C9887l.smaato, null);
    }

    @Override // defpackage.InterfaceC7483l
    public InterfaceC16902l startapp(C16765l c16765l) {
        return null;
    }

    @Override // defpackage.InterfaceC13952l
    public float subs() {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C11093l c11093l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C3003l c3003l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C13788l c13788l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C16271l c16271l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f6072l;
        Class cls = Integer.TYPE;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C11093l) {
                    c11093l = (C11093l) abstractC0283l;
                    int i2 = c11093l.f22294l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11093l.f22294l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11093l = new C11093l(this, abstractC0283l);
                    }
                } else {
                    c11093l = new C11093l(this, abstractC0283l);
                }
                Object objYandex = c11093l.f22295l;
                int i3 = c11093l.f22294l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c11093l.f22294l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c11093l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C3003l) {
                    c3003l = (C3003l) abstractC0283l;
                    int i4 = c3003l.f6507l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3003l.f6507l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3003l = new C3003l(this, abstractC0283l);
                    }
                } else {
                    c3003l = new C3003l(this, abstractC0283l);
                }
                Object objYandex2 = c3003l.f6508l;
                int i5 = c3003l.f6507l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c3003l.f6507l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c3003l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C13788l) {
                    c13788l = (C13788l) abstractC0283l;
                    int i6 = c13788l.f26911l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13788l.f26911l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13788l = new C13788l(this, abstractC0283l);
                    }
                } else {
                    c13788l = new C13788l(this, abstractC0283l);
                }
                Object objYandex3 = c13788l.f26912l;
                int i7 = c13788l.f26911l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C8519l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c13788l.f26911l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c13788l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C16271l) {
                    c16271l = (C16271l) abstractC0283l;
                    int i8 = c16271l.f31841l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16271l.f31841l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16271l = new C16271l(this, abstractC0283l);
                    }
                } else {
                    c16271l = new C16271l(this, abstractC0283l);
                }
                Object objYandex4 = c16271l.f31842l;
                int i9 = c16271l.f31841l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C4964l.class)))));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c16271l.f31841l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c16271l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f6072l) {
            case 7:
                return "NoDeclaredBrand";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC16011l
    public AbstractC18041l yandex() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC2938l
    public int firebase(C17385l c17385l, int i) {
        return i;
    }
}
