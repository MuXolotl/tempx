package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lؘٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5434l implements InterfaceC6429l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC14507l f11646l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f11647l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC7832l f11648l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5501l f11649l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f11650l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LongPointerWrapper f11651l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f11652l;

    public C5434l(C5501l c5501l, InterfaceC7832l interfaceC7832l, AbstractC14507l abstractC14507l, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        this.f11649l = c5501l;
        this.f11648l = interfaceC7832l;
        this.f11646l = abstractC14507l;
        this.f11651l = longPointerWrapper;
        this.f11650l = z;
        this.f11652l = z2;
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l adcel(Object obj) {
        return AbstractC1757l.crashlytics(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final int admob() {
        return this.f11647l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object ads(NativePointer nativePointer, int i) {
        return AbstractC1757l.amazon(this, nativePointer, i);
    }

    public final C14076l amazon(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = this.f11646l.crashlytics(c3585l, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f11651l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        C14076l c14076lPurchase = purchase(realm_value_tVar, realm_value_tVarCrashlytics);
        c3585l.tapsense();
        return c14076lPurchase;
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l appmetrica(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC1757l.billing(this, obj, (InterfaceC3327l) obj2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC6429l
    public final void clear() {
        AbstractC1757l.yandex(this);
    }

    @Override // defpackage.InterfaceC6429l
    public final boolean containsKey(Object obj) {
        return AbstractC1757l.loadAd(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final boolean containsValue(Object obj) {
        realm_value_t realm_value_tVarInmobi;
        InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
        this.f11648l.mo1844l();
        C11140l c11140l = C11140l.f22375l;
        if ((interfaceC3327l != null ? ((C14076l) interfaceC3327l).yandex : 0) == 11) {
            if (!AbstractC15011l.subs(((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC2851l.class)))) {
                return false;
            }
        }
        C3585l c3585l = new C3585l(16);
        if (interfaceC3327l != null) {
            C14076l c14076l = (C14076l) interfaceC3327l;
            int i = c14076l.yandex;
            switch (AbstractC5020l.inmobi(i)) {
                case 10:
                    InterfaceC9671l interfaceC9671lSubs = c14076l.subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                    C1332l c1332l = null;
                    if (interfaceC9671lSubs != null) {
                        C1332l f36799l = ((InterfaceC2851l) interfaceC9671lSubs).getF36705l();
                        c1332l = f36799l != null ? f36799l : null;
                        if (c1332l == null) {
                            C8339l.metrica("Cannot lookup unmanaged objects in realm");
                            return false;
                        }
                    }
                    realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                    break;
                case 11:
                case 12:
                    C8339l.metrica("Cannot pass unmanaged collections as input argument");
                    return false;
                default:
                    switch (AbstractC5020l.inmobi(i)) {
                        case 0:
                            realm_value_tVarInmobi = c3585l.isVip(Long.valueOf(c14076l.billing()));
                            break;
                        case 1:
                            realm_value_tVarInmobi = c3585l.isPro(Boolean.valueOf(c14076l.yandex()));
                            break;
                        case 2:
                            realm_value_tVarInmobi = c3585l.m1360volatile(c14076l.firebase());
                            break;
                        case 3:
                            realm_value_tVarInmobi = c3585l.firebase(c14076l.loadAd());
                            break;
                        case 4:
                            realm_value_tVarInmobi = c3585l.m1356native((C15729l) c14076l.admob());
                            break;
                        case 5:
                            realm_value_tVarInmobi = c3585l.subscription(Float.valueOf(c14076l.purchase()));
                            break;
                        case 6:
                            realm_value_tVarInmobi = c3585l.startapp(Double.valueOf(c14076l.amazon()));
                            break;
                        case 7:
                            realm_value_tVarInmobi = c3585l.remoteconfig(c14076l.crashlytics());
                            break;
                        case 8:
                            realm_value_tVarInmobi = c11140l.metrica(c14076l.mopub().mopub());
                            break;
                        case 9:
                            realm_value_tVarInmobi = c11140l.ads(((C4695l) c14076l.isPro()).yandex);
                            break;
                        default:
                            C10754l.ads("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                            return false;
                    }
                    break;
            }
        } else {
            realm_value_tVarInmobi = c3585l.signatures();
        }
        realm_value_t realm_value_tVar = realm_value_tVarInmobi;
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f11651l.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, jArr);
        boolean z = jArr[0] != -1;
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC6429l
    public final void crashlytics(int i) {
        this.f11647l = i;
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: extends */
    public final AbstractC14507l mo792extends() {
        return this.f11646l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object get(Object obj) {
        this.f11648l.mo1844l();
        return amazon(obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final Object inmobi(NativePointer nativePointer, int i) {
        int i2;
        InterfaceC1388l interfaceC1388l;
        InterfaceC1388l interfaceC1388lLoadAd;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_results_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        int i4 = 0;
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (!z) {
            if (z) {
                C18725l.billing();
                return null;
            }
            int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
            int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
            int length = iArrM1673throws.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i2 = 0;
                    break;
                }
                i2 = iArrM1673throws[i5];
                if (AbstractC5020l.inmobi(i2) == iRealm_value_t_type_get) {
                    break;
                }
                i5++;
            }
            if (i2 == 0) {
                C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
                return null;
            }
            int iInmobi = AbstractC5020l.inmobi(i2);
            C5501l c5501l = this.f11649l;
            InterfaceC7832l interfaceC7832l = this.f11648l;
            boolean z2 = this.f11650l;
            boolean z3 = this.f11652l;
            switch (iInmobi) {
                case 0:
                    break;
                case 1:
                    return new C14076l(1, AbstractC18202l.yandex.loadAd(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 2:
                    return new C14076l(2, AbstractC18202l.yandex.loadAd(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 3:
                    return new C14076l(3, AbstractC18202l.yandex.loadAd(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar));
                case 4:
                    realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                    return new C14076l(4, AbstractC18202l.yandex.loadAd(byte[].class), realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex));
                case 5:
                    return new C14076l(5, AbstractC18202l.yandex.loadAd(InterfaceC11616l.class), new C15729l(AbstractC10340l.loadAd(realm_value_tVar)));
                case 6:
                    return new C14076l(6, AbstractC18202l.yandex.loadAd(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 7:
                    return new C14076l(7, AbstractC18202l.yandex.loadAd(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 8:
                    realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                    long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                    long[] jArrCopyOf = Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length);
                    C18316l c18316l = C15062l.Companion;
                    long j2 = jArrCopyOf[1];
                    long j3 = jArrCopyOf[0];
                    c18316l.getClass();
                    return new C14076l(8, AbstractC18202l.yandex.loadAd(C15062l.class), C18316l.yandex(j2, j3));
                case 9:
                    BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
                    byte[] bArr = new byte[12];
                    realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                    short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                    ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                    int length2 = sArrRealm_object_id_t_bytes_get.length;
                    int i6 = 0;
                    while (i4 < length2) {
                        bArr[i6] = (byte) sArrRealm_object_id_t_bytes_get[i4];
                        arrayList.add(Unit.INSTANCE);
                        i4++;
                        i6++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C14076l(9, AbstractC18202l.yandex.loadAd(C17918l.class), BsonObjectId$Companion.yandex(bArr));
                case 10:
                    if (!z2) {
                        C2330l c2330lLoadAd = interfaceC7832l.mo1847l().loadAd(AbstractC10340l.yandex(realm_value_tVar).yandex);
                        if (c2330lLoadAd != null && (interfaceC1388l = c2330lLoadAd.subs) != null) {
                            return new C14076l(11, interfaceC1388l, (InterfaceC7457l) ((InterfaceC8589l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l) : null)));
                        }
                        C8339l.metrica("The object class is not present in the current schema - are you using an outdated schema version?");
                        return null;
                    }
                    if (z3) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class);
                    } else {
                        if (z3) {
                            C18725l.billing();
                            return null;
                        }
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC11343l.class);
                    }
                    return new C14076l(11, AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), (InterfaceC11343l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388lLoadAd, c5501l, interfaceC7832l) : null));
                case 11:
                    byte[] bArr2 = new byte[16];
                    realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                    short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                    ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                    int length3 = sArrRealm_uuid_t_bytes_get.length;
                    int i7 = 0;
                    while (i4 < length3) {
                        bArr2[i7] = (byte) sArrRealm_uuid_t_bytes_get[i4];
                        arrayList2.add(Unit.INSTANCE);
                        i4++;
                        i7++;
                    }
                    return new C14076l(10, AbstractC18202l.yandex.loadAd(InterfaceC15393l.class), new C4695l(bArr2));
                case 12:
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i8 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_results_get_list(ptr$cinterop_release2, j), false, 2, null);
                    return new C14076l(12, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C3364l(null, longPointerWrapper2, new C4619l(c5501l, interfaceC7832l, longPointerWrapper2, z2, z3)));
                case 13:
                    long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                    int i9 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_results_get_dictionary(ptr$cinterop_release3, j), false, 2, null);
                    return new C14076l(13, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C18234l(null, longPointerWrapper3, AbstractC7477l.purchase(c5501l, interfaceC7832l, longPointerWrapper3, z2, z3)));
                default:
                    C8339l.metrica("Unsupported type: ".concat(AbstractC12589l.m3421native(i2)));
                    return null;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l isPro(final Object obj, Object obj2, final int i, final Map map) {
        InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj2;
        C3585l c3585l = new C3585l(16);
        final realm_value_t realm_value_tVarCrashlytics = this.f11646l.crashlytics(c3585l, obj);
        C3768l c3768l = new C3768l(c3585l, this, realm_value_tVarCrashlytics);
        C12834l c12834l = new C12834l(this, i, map, c3585l, realm_value_tVarCrashlytics);
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: lٕٔۘ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C5434l f29355l;

            {
                this.f29355l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i3 = i2;
                Map map2 = map;
                int i4 = i;
                realm_value_t realm_value_tVar = realm_value_tVarCrashlytics;
                Object obj4 = obj;
                C5434l c5434l = this.f29355l;
                InterfaceC3327l interfaceC3327l2 = (InterfaceC3327l) obj3;
                switch (i3) {
                    case 0:
                        C14076l c14076lAmazon = c5434l.amazon(obj4);
                        long ptr$cinterop_release = c5434l.f11651l.getPtr$cinterop_release();
                        int i5 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_list(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC1757l.mopub(new C4619l(c5434l.f11649l, c5434l.f11648l, longPointerWrapper, c5434l.f11650l, c5434l.f11652l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l2).smaato(12), i4, map2);
                        return new C8195l(c14076lAmazon, Boolean.TRUE);
                    default:
                        C14076l c14076lAmazon2 = c5434l.amazon(obj4);
                        long ptr$cinterop_release2 = c5434l.f11651l.getPtr$cinterop_release();
                        int i6 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_dictionary(ptr$cinterop_release2, realm_value_tVar.yandex, realm_value_tVar), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase(c5434l.f11649l, c5434l.f11648l, longPointerWrapper2, c5434l.f11650l, c5434l.f11652l), (InterfaceC2599l) ((C14076l) interfaceC3327l2).smaato(13), i4, map2);
                        return new C8195l(c14076lAmazon2, Boolean.TRUE);
                }
            }
        };
        final int i3 = 1;
        return (C8195l) AbstractC16417l.loadAd(c3585l, interfaceC3327l, c3768l, c12834l, function1, new Function1(this) { // from class: lٕٔۘ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C5434l f29355l;

            {
                this.f29355l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i4 = i3;
                Map map2 = map;
                int i5 = i;
                realm_value_t realm_value_tVar = realm_value_tVarCrashlytics;
                Object obj4 = obj;
                C5434l c5434l = this.f29355l;
                InterfaceC3327l interfaceC3327l2 = (InterfaceC3327l) obj3;
                switch (i4) {
                    case 0:
                        C14076l c14076lAmazon = c5434l.amazon(obj4);
                        long ptr$cinterop_release = c5434l.f11651l.getPtr$cinterop_release();
                        int i6 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_list(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC1757l.mopub(new C4619l(c5434l.f11649l, c5434l.f11648l, longPointerWrapper, c5434l.f11650l, c5434l.f11652l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l2).smaato(12), i5, map2);
                        return new C8195l(c14076lAmazon, Boolean.TRUE);
                    default:
                        C14076l c14076lAmazon2 = c5434l.amazon(obj4);
                        long ptr$cinterop_release2 = c5434l.f11651l.getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_insert_dictionary(ptr$cinterop_release2, realm_value_tVar.yandex, realm_value_tVar), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase(c5434l.f11649l, c5434l.f11648l, longPointerWrapper2, c5434l.f11650l, c5434l.f11652l), (InterfaceC2599l) ((C14076l) interfaceC3327l2).smaato(13), i5, map2);
                        return new C8195l(c14076lAmazon2, Boolean.TRUE);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC6429l
    public final InterfaceC6429l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C5434l(this.f11649l, interfaceC7832l, this.f11646l, longPointerWrapper, this.f11650l, this.f11652l);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l metrica(int i) {
        this.f11648l.mo1844l();
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = this.f11651l.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar, realm_value_tVar2.yandex, realm_value_tVar2);
        Object objAmazon = this.f11646l.amazon(realm_value_tVar);
        return new C8195l(objAmazon, amazon(objAmazon));
    }

    @Override // defpackage.InterfaceC6429l
    public final int mopub() {
        return AbstractC1757l.purchase(this);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: native */
    public final void mo796native(InterfaceC2599l interfaceC2599l, int i, Map map) {
        AbstractC1757l.pro(this, interfaceC2599l, i, map);
    }

    public final C14076l purchase(realm_value_t realm_value_tVar, realm_value_t realm_value_tVar2) {
        int i;
        InterfaceC1388l interfaceC1388l;
        InterfaceC1388l interfaceC1388lLoadAd;
        int i2 = 0;
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (!z) {
            if (z) {
                C18725l.billing();
                return null;
            }
            int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
            int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
            int length = iArrM1673throws.length;
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
            int iInmobi = AbstractC5020l.inmobi(i);
            LongPointerWrapper longPointerWrapper = this.f11651l;
            C5501l c5501l = this.f11649l;
            InterfaceC7832l interfaceC7832l = this.f11648l;
            boolean z2 = this.f11650l;
            boolean z3 = this.f11652l;
            switch (iInmobi) {
                case 0:
                    break;
                case 1:
                    return new C14076l(1, AbstractC18202l.yandex.loadAd(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 2:
                    return new C14076l(2, AbstractC18202l.yandex.loadAd(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 3:
                    return new C14076l(3, AbstractC18202l.yandex.loadAd(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar));
                case 4:
                    realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                    return new C14076l(4, AbstractC18202l.yandex.loadAd(byte[].class), realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex));
                case 5:
                    return new C14076l(5, AbstractC18202l.yandex.loadAd(InterfaceC11616l.class), new C15729l(AbstractC10340l.loadAd(realm_value_tVar)));
                case 6:
                    return new C14076l(6, AbstractC18202l.yandex.loadAd(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 7:
                    return new C14076l(7, AbstractC18202l.yandex.loadAd(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                case 8:
                    realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                    long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                    long[] jArrCopyOf = Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length);
                    C18316l c18316l = C15062l.Companion;
                    long j = jArrCopyOf[1];
                    long j2 = jArrCopyOf[0];
                    c18316l.getClass();
                    return new C14076l(8, AbstractC18202l.yandex.loadAd(C15062l.class), C18316l.yandex(j, j2));
                case 9:
                    BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
                    byte[] bArr = new byte[12];
                    realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                    short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                    ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                    int length2 = sArrRealm_object_id_t_bytes_get.length;
                    int i4 = 0;
                    while (i2 < length2) {
                        bArr[i4] = (byte) sArrRealm_object_id_t_bytes_get[i2];
                        arrayList.add(Unit.INSTANCE);
                        i2++;
                        i4++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C14076l(9, AbstractC18202l.yandex.loadAd(C17918l.class), BsonObjectId$Companion.yandex(bArr));
                case 10:
                    if (!z2) {
                        C2330l c2330lLoadAd = interfaceC7832l.mo1847l().loadAd(AbstractC10340l.yandex(realm_value_tVar).yandex);
                        if (c2330lLoadAd != null && (interfaceC1388l = c2330lLoadAd.subs) != null) {
                            return new C14076l(11, interfaceC1388l, (InterfaceC7457l) ((InterfaceC8589l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l) : null)));
                        }
                        C8339l.metrica("The object class is not present in the current schema - are you using an outdated schema version?");
                        return null;
                    }
                    if (z3) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class);
                    } else {
                        if (z3) {
                            C18725l.billing();
                            return null;
                        }
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC11343l.class);
                    }
                    return new C14076l(11, AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), (InterfaceC11343l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388lLoadAd, c5501l, interfaceC7832l) : null));
                case 11:
                    byte[] bArr2 = new byte[16];
                    realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                    short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                    ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                    int length3 = sArrRealm_uuid_t_bytes_get.length;
                    int i5 = 0;
                    while (i2 < length3) {
                        bArr2[i5] = (byte) sArrRealm_uuid_t_bytes_get[i2];
                        arrayList2.add(Unit.INSTANCE);
                        i2++;
                        i5++;
                    }
                    return new C14076l(10, AbstractC18202l.yandex.loadAd(InterfaceC15393l.class), new C4695l(bArr2));
                case 12:
                    long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                    int i6 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_dictionary_get_list(ptr$cinterop_release, realm_value_tVar2.yandex, realm_value_tVar2), false, 2, null);
                    return new C14076l(12, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C3364l(null, longPointerWrapper2, new C4619l(c5501l, interfaceC7832l, longPointerWrapper2, z2, z3)));
                case 13:
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i7 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_dictionary_get_dictionary(ptr$cinterop_release2, realm_value_tVar2.yandex, realm_value_tVar2), false, 2, null);
                    return new C14076l(13, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C18234l(null, longPointerWrapper3, AbstractC7477l.purchase(c5501l, interfaceC7832l, longPointerWrapper3, z2, z3)));
                default:
                    C8339l.metrica("Unsupported type: ".concat(AbstractC12589l.m3421native(i)));
                    return null;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC10984l
    public final InterfaceC7832l remoteconfig() {
        return this.f11648l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object remove(Object obj) {
        return (InterfaceC3327l) AbstractC1757l.ad(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l smaato(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = this.f11646l.crashlytics(c3585l, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = this.f11651l;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, zArr);
        C8195l c8195l = new C8195l(purchase(realm_value_tVar, realm_value_tVarCrashlytics), Boolean.valueOf(zArr[0]));
        c3585l.tapsense();
        return c8195l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object vip(Object obj, Object obj2, int i, Map map) {
        return (InterfaceC3327l) AbstractC1757l.license(this, obj, (InterfaceC3327l) obj2, i, map);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo803volatile(Object obj, Object obj2) {
        return AbstractC8576l.yandex((InterfaceC3327l) obj, (InterfaceC3327l) obj2);
    }

    @Override // defpackage.InterfaceC6429l
    public final NativePointer yandex() {
        return this.f11651l;
    }
}
