package defpackage;

import android.content.Context;
import android.os.Looper;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lؗؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4619l implements InterfaceC14426l, InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f9369l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f9370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9371l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f9372l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f9373l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f9374l;

    public C4619l(Context context, Looper looper, C18527l c18527l, int i) {
        this.f9371l = i;
        switch (i) {
            case 5:
                this.f9373l = new C13568l(context.getApplicationContext());
                this.f9372l = c18527l.yandex(looper, null);
                this.f9374l = c18527l.yandex(Looper.getMainLooper(), null);
                break;
            default:
                this.f9373l = new C13645l(26, context.getApplicationContext());
                this.f9372l = c18527l.yandex(looper, null);
                this.f9374l = c18527l.yandex(Looper.getMainLooper(), null);
                break;
        }
    }

    public static EnumC10151l advert(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lMopub;
        AbstractC15211l abstractC15211lMopub2;
        String str = C4632l.yandex;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        if (abstractC4317lBilling == null || (abstractC15211lMopub = AbstractC13095l.m3532case(abstractC4317lBilling)) == null) {
            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        }
        C14487l c14487l = AbstractC12008l.yandex;
        InterfaceC15234l interfaceC15234lPro = abstractC15211lMopub.mo1339native().pro();
        InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
        if (C4632l.firebase.containsKey(interfaceC17477l != null ? AbstractC11125l.billing(interfaceC17477l) : null)) {
            return EnumC10151l.f20669l;
        }
        AbstractC4317l abstractC4317lBilling2 = AbstractC13095l.billing(interfaceC13789l);
        if (abstractC4317lBilling2 == null || (abstractC15211lMopub2 = AbstractC13095l.m3531abstract(abstractC4317lBilling2)) == null) {
            abstractC15211lMopub2 = AbstractC13095l.mopub(interfaceC13789l);
        }
        InterfaceC15234l interfaceC15234lPro2 = abstractC15211lMopub2.mo1339native().pro();
        InterfaceC17477l interfaceC17477l2 = interfaceC15234lPro2 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro2 : null;
        if (C4632l.isPro.containsKey(interfaceC17477l2 != null ? AbstractC11125l.billing(interfaceC17477l2) : null)) {
            return EnumC10151l.f20668l;
        }
        return null;
    }

    public static IOException amazon(C4619l c4619l, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c4619l.m1563catch(iOException);
        }
        if (z3) {
            AbstractC17567l abstractC17567l = ((C17778l) c4619l.f9373l).f34630l;
            if (iOException != null) {
                abstractC17567l.getClass();
            } else {
                abstractC17567l.getClass();
            }
        }
        if (z2) {
            AbstractC17567l abstractC17567l2 = ((C17778l) c4619l.f9373l).f34630l;
            if (iOException != null) {
                abstractC17567l2.getClass();
            } else {
                abstractC17567l2.getClass();
            }
        }
        return ((C17778l) c4619l.f9373l).isPro(c4619l, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public static void billing(Object obj, ArrayList arrayList, C6238l c6238l) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c6238l.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                billing(it.next(), arrayList, c6238l);
            }
        }
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static void m1561else(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static EnumC10249l isVip(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lMopub;
        AbstractC15211l abstractC15211lMopub2;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        if (abstractC4317lBilling == null || (abstractC15211lMopub = AbstractC13095l.m3532case(abstractC4317lBilling)) == null) {
            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        }
        if (AbstractC13095l.m3551strictfp(abstractC15211lMopub)) {
            return EnumC10249l.f20872l;
        }
        AbstractC4317l abstractC4317lBilling2 = AbstractC13095l.billing(interfaceC13789l);
        if (abstractC4317lBilling2 == null || (abstractC15211lMopub2 = AbstractC13095l.m3531abstract(abstractC4317lBilling2)) == null) {
            abstractC15211lMopub2 = AbstractC13095l.mopub(interfaceC13789l);
        }
        if (AbstractC13095l.m3551strictfp(abstractC15211lMopub2)) {
            return null;
        }
        return EnumC10249l.f20871l;
    }

    public static int purchase(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    @Override // defpackage.InterfaceC14426l
    public void ad(final int i, Object obj, final int i2, final Map map) {
        C3585l c3585l = new C3585l(16);
        C0946l c0946l = new C0946l(this, i, 0);
        C1247l c1247l = new C1247l(i2, i, 0, this, map, c3585l);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: lؗۘۘ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4619l f11114l;

            {
                this.f11114l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = i3;
                Map map2 = map;
                int i5 = i2;
                int i6 = i;
                C4619l c4619l = this.f11114l;
                InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj2;
                switch (i4) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_insert_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        return Boolean.valueOf(AbstractC1757l.mopub(new C4619l((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper, c4619l.f9370l, c4619l.f9369l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l).smaato(12), i5, map2));
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_insert_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper2, c4619l.f9370l, c4619l.f9369l), (InterfaceC2599l) ((C14076l) interfaceC3327l).smaato(13), i5, map2);
                        return Unit.INSTANCE;
                }
            }
        };
        final int i4 = 1;
        AbstractC16417l.loadAd(c3585l, (InterfaceC3327l) obj, c0946l, c1247l, function1, new Function1(this) { // from class: lؗۘۘ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4619l f11114l;

            {
                this.f11114l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i4;
                Map map2 = map;
                int i6 = i2;
                int i7 = i;
                C4619l c4619l = this.f11114l;
                InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj2;
                switch (i5) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_insert_list(ptr$cinterop_release, i7), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        return Boolean.valueOf(AbstractC1757l.mopub(new C4619l((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper, c4619l.f9370l, c4619l.f9369l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l).smaato(12), i6, map2));
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i9 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_insert_dictionary(ptr$cinterop_release2, i7), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper2, c4619l.f9370l, c4619l.f9369l), (InterfaceC2599l) ((C14076l) interfaceC3327l).smaato(13), i6, map2);
                        return Unit.INSTANCE;
                }
            }
        });
        c3585l.tapsense();
    }

    @Override // defpackage.InterfaceC14426l
    public boolean applovin(int i, Collection collection, int i2, Map map) {
        return AbstractC1757l.mopub(this, i, collection, i2, map);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public C0554l m1562case() throws SocketException {
        C17778l c17778l = (C17778l) this.f9373l;
        if (c17778l.f34635l) {
            C8339l.smaato("Check failed.");
            return null;
        }
        c17778l.f34635l = true;
        c17778l.f34634l.subs();
        synchronized (c17778l) {
            if (c17778l.f34626l == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c17778l.f34629l || c17778l.f34623l) {
                throw new IllegalStateException("Check failed.");
            }
            if (c17778l.f34618l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c17778l.f34636l) {
                throw new IllegalStateException("Check failed.");
            }
            c17778l.f34636l = false;
            c17778l.f34629l = true;
            c17778l.f34623l = true;
            Unit unit = Unit.INSTANCE;
        }
        C13247l c13247l = (C13247l) ((InterfaceC1029l) this.f9374l).subs();
        c13247l.purchase.setSoTimeout(0);
        c13247l.purchase();
        C0554l c0554l = new C0554l();
        c0554l.f1956l = this;
        InterfaceC1029l interfaceC1029l = (InterfaceC1029l) this.f9374l;
        c0554l.f1958l = new C6334l(this, interfaceC1029l.mopub().mo489throws(), -1L, true);
        c0554l.f1957l = new C17962l(this, interfaceC1029l.mopub().billing(), -1L, true);
        return c0554l;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m1563catch(IOException iOException) {
        this.f9369l = true;
        ((InterfaceC1029l) this.f9374l).subs().billing((C17778l) this.f9373l, iOException);
    }

    @Override // defpackage.InterfaceC14426l
    public boolean contains(Object obj) {
        return indexOf((InterfaceC3327l) obj) != -1;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m1564for(boolean z) {
        switch (this.f9371l) {
            case 4:
                if (this.f9369l != z) {
                    this.f9369l = z;
                    if (this.f9370l) {
                        premium(true, z);
                    }
                    break;
                }
                break;
            default:
                if (this.f9369l != z) {
                    this.f9369l = z;
                    if (this.f9370l) {
                        m1569throws(true, z);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // defpackage.InterfaceC14426l
    public int indexOf(Object obj) {
        realm_value_t realm_value_tVarInmobi;
        InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
        C11140l c11140l = C11140l.f22375l;
        if ((interfaceC3327l != null ? ((C14076l) interfaceC3327l).yandex : 0) == 11) {
            if (!AbstractC15011l.subs(((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC2851l.class)))) {
                return -1;
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
                        C1332l f500l = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                        c1332l = f500l != null ? f500l : null;
                        if (c1332l == null) {
                            C8339l.metrica("Cannot lookup unmanaged objects in realm");
                            return 0;
                        }
                    }
                    realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                    break;
                case 11:
                case 12:
                    C8339l.metrica("Cannot pass unmanaged collections as input argument");
                    return 0;
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
                            return 0;
                    }
                    break;
            }
        } else {
            realm_value_tVarInmobi = c3585l.signatures();
        }
        realm_value_t realm_value_tVar = realm_value_tVarInmobi;
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f9374l).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_list_find(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, jArr, zArr);
        int i3 = (int) (zArr[0] ? jArr[0] : -1L);
        c3585l.tapsense();
        return i3;
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to TEA init - ", interfaceC9719l));
            return;
        }
        this.f9369l = z;
        this.f9370l = true;
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        int[] iArr = (int[]) this.f9373l;
        if (bArr.length != 16) {
            C8339l.metrica("Key size must be 128 bits.");
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            iArr[i] = purchase(i2, bArr);
            i++;
            i2 += 4;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            ((int[]) this.f9372l)[i4] = iArr[i3 & 3] + i3;
            i3 -= 1640531527;
            ((int[]) this.f9374l)[i4] = iArr[(i3 >>> 11) & 3] + i3;
        }
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 8;
    }

    @Override // defpackage.InterfaceC14426l
    public InterfaceC14426l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C4619l((C5501l) this.f9373l, interfaceC7832l, longPointerWrapper, this.f9370l, this.f9369l);
    }

    public void premium(boolean z, boolean z2) {
        C14500l c14500l = (C14500l) this.f9372l;
        if (z && z2) {
            c14500l.amazon(new RunnableC15327l(0, this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C14500l c14500l2 = (C14500l) this.f9374l;
        c14500l2.yandex.postDelayed(new RunnableC10311l(this, atomicBoolean, 26), 1000L);
        c14500l.amazon(new RunnableC2476l(this, atomicBoolean, z, z2, 0));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m1565private(boolean z) {
        switch (this.f9371l) {
            case 4:
                if (this.f9370l != z) {
                    this.f9370l = z;
                    premium(z, this.f9369l);
                    break;
                }
                break;
            default:
                if (this.f9370l != z) {
                    this.f9370l = z;
                    m1569throws(z, this.f9369l);
                    break;
                }
                break;
        }
    }

    public C13247l pro() {
        InterfaceC17673l interfaceC17673lSubs = ((InterfaceC1029l) this.f9374l).subs();
        C13247l c13247l = interfaceC17673lSubs instanceof C13247l ? (C13247l) interfaceC17673lSubs : null;
        if (c13247l != null) {
            return c13247l;
        }
        C8339l.smaato("no connection for CONNECT tunnels");
        return null;
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f9372l;
    }

    @Override // defpackage.InterfaceC14426l
    public boolean remove(Object obj) {
        return AbstractC1757l.advert(this, (InterfaceC3327l) obj);
    }

    public C5738l signatures(C18389l c18389l) throws IOException {
        C4619l c4619l;
        try {
            String strAmazon = c18389l.f35918l.amazon("Content-Type");
            if (strAmazon == null) {
                strAmazon = null;
            }
            long jAmazon = ((InterfaceC1029l) this.f9374l).amazon(c18389l);
            c4619l = this;
            try {
                return new C5738l(strAmazon, jAmazon, new C1503l(new C17962l(c4619l, ((InterfaceC1029l) this.f9374l).yandex(c18389l), jAmazon, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((C17778l) c4619l.f9373l).f34630l.getClass();
                c4619l.m1563catch(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            c4619l = this;
        }
    }

    public C6639l startapp(InterfaceC13199l interfaceC13199l) {
        List list;
        EnumC10249l enumC10249l;
        if (interfaceC13199l instanceof C16158l) {
            if (!(interfaceC13199l instanceof InterfaceC16902l)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC13199l);
                sb.append(", ");
                C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
                return null;
            }
            List upperBounds = ((InterfaceC16902l) interfaceC13199l).getUpperBounds();
            if (!upperBounds.isEmpty()) {
                Iterator it = upperBounds.iterator();
                while (it.hasNext()) {
                    if (!AbstractC13095l.inmobi((InterfaceC13789l) it.next())) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : upperBounds) {
                            if (isVip((InterfaceC13789l) obj) != null) {
                                arrayList.add(obj);
                            }
                        }
                        InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(3, new C4735l(upperBounds, this));
                        boolean zIsEmpty = arrayList.isEmpty();
                        EnumC10249l enumC10249l2 = EnumC10249l.f20873l;
                        if (!zIsEmpty) {
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    list = upperBounds;
                                }
                            }
                            return new C6639l(enumC10249l2, false);
                        }
                        if (((List) interfaceC1220lCrashlytics.getValue()).isEmpty()) {
                            break;
                        }
                        List list2 = (List) interfaceC1220lCrashlytics.getValue();
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it3 = list2.iterator();
                            if (it3.hasNext()) {
                                list = (List) interfaceC1220lCrashlytics.getValue();
                            }
                        }
                        return new C6639l(enumC10249l2, true);
                        if (list != null && list.isEmpty()) {
                            enumC10249l = EnumC10249l.f20872l;
                            break;
                        }
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                enumC10249l = EnumC10249l.f20872l;
                                break;
                            }
                            if (!AbstractC13095l.m3545native((InterfaceC13789l) it4.next())) {
                                enumC10249l = EnumC10249l.f20871l;
                                break;
                            }
                        }
                        return new C6639l(enumC10249l, list != upperBounds);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC14426l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public Object mo1566strictfp(final int i, Object obj, final int i2, final LinkedHashMap linkedHashMap) {
        InterfaceC3327l interfaceC3327l = get(i);
        C3585l c3585l = new C3585l(16);
        C0946l c0946l = new C0946l(this, i, 1);
        C1247l c1247l = new C1247l(i2, i, 1, this, linkedHashMap, c3585l);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: lَؘ٘

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4619l f34747l;

            {
                this.f34747l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = i3;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                int i5 = i2;
                int i6 = i;
                C4619l c4619l = this.f34747l;
                InterfaceC3327l interfaceC3327l2 = (InterfaceC3327l) obj2;
                switch (i4) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_set_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC1757l.mopub(new C4619l((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper, c4619l.f9370l, c4619l.f9369l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l2).smaato(12), i5, linkedHashMap2);
                        break;
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_set_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper2, c4619l.f9370l, c4619l.f9369l), (InterfaceC2599l) ((C14076l) interfaceC3327l2).smaato(13), i5, linkedHashMap2);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i4 = 1;
        AbstractC16417l.loadAd(c3585l, (InterfaceC3327l) obj, c0946l, c1247l, function1, new Function1(this) { // from class: lَؘ٘

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4619l f34747l;

            {
                this.f34747l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i4;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                int i6 = i2;
                int i7 = i;
                C4619l c4619l = this.f34747l;
                InterfaceC3327l interfaceC3327l2 = (InterfaceC3327l) obj2;
                switch (i5) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_set_list(ptr$cinterop_release, i7), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC1757l.mopub(new C4619l((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper, c4619l.f9370l, c4619l.f9369l), 0, (InterfaceC11334l) ((C14076l) interfaceC3327l2).smaato(12), i6, linkedHashMap2);
                        break;
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c4619l.f9374l).getPtr$cinterop_release();
                        int i9 = AbstractC9795l.yandex;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_set_dictionary(ptr$cinterop_release2, i7), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC1757l.pro(AbstractC7477l.purchase((C5501l) c4619l.f9373l, (InterfaceC7832l) c4619l.f9372l, longPointerWrapper2, c4619l.f9370l, c4619l.f9369l), (InterfaceC2599l) ((C14076l) interfaceC3327l2).smaato(13), i6, linkedHashMap2);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        Unit unit = Unit.INSTANCE;
        c3585l.tapsense();
        return interfaceC3327l;
    }

    @Override // defpackage.InterfaceC14426l
    /* JADX INFO: renamed from: subs, reason: merged with bridge method [inline-methods] */
    public InterfaceC3327l get(int i) {
        int i2;
        InterfaceC1388l interfaceC1388l;
        InterfaceC1388l interfaceC1388lLoadAd;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f9374l;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        C5501l c5501l = (C5501l) this.f9373l;
        InterfaceC7832l interfaceC7832l = (InterfaceC7832l) this.f9372l;
        boolean z = this.f9370l;
        boolean z2 = this.f9369l;
        boolean z3 = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (!z3) {
            if (z3) {
                C18725l.billing();
                return null;
            }
            int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
            int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
            int length = iArrM1673throws.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i2 = 0;
                    break;
                }
                i2 = iArrM1673throws[i4];
                if (AbstractC5020l.inmobi(i2) == iRealm_value_t_type_get) {
                    break;
                }
                i4++;
            }
            if (i2 == 0) {
                C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
                return null;
            }
            switch (AbstractC5020l.inmobi(i2)) {
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
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length2) {
                        bArr[i6] = (byte) sArrRealm_object_id_t_bytes_get[i5];
                        arrayList.add(Unit.INSTANCE);
                        i5++;
                        i6++;
                    }
                    bsonObjectId$Companion.getClass();
                    return new C14076l(9, AbstractC18202l.yandex.loadAd(C17918l.class), BsonObjectId$Companion.yandex(bArr));
                case 10:
                    if (!z) {
                        C2330l c2330lLoadAd = interfaceC7832l.mo1847l().loadAd(AbstractC10340l.yandex(realm_value_tVar).yandex);
                        if (c2330lLoadAd != null && (interfaceC1388l = c2330lLoadAd.subs) != null) {
                            return new C14076l(11, interfaceC1388l, (InterfaceC7457l) ((InterfaceC8589l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l) : null)));
                        }
                        C8339l.metrica("The object class is not present in the current schema - are you using an outdated schema version?");
                        return null;
                    }
                    if (z2) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class);
                    } else {
                        if (z2) {
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
                    int i8 = 0;
                    while (i7 < length3) {
                        bArr2[i8] = (byte) sArrRealm_uuid_t_bytes_get[i7];
                        arrayList2.add(Unit.INSTANCE);
                        i7++;
                        i8++;
                    }
                    return new C14076l(10, AbstractC18202l.yandex.loadAd(InterfaceC15393l.class), new C4695l(bArr2));
                case 12:
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i9 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_get_list(ptr$cinterop_release2, j), false, 2, null);
                    return new C14076l(12, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C3364l(null, longPointerWrapper2, new C4619l(c5501l, interfaceC7832l, longPointerWrapper2, z, z2)));
                case 13:
                    long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                    int i10 = AbstractC9795l.yandex;
                    LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_list_get_dictionary(ptr$cinterop_release3, j), false, 2, null);
                    return new C14076l(13, AbstractC18202l.yandex.loadAd(InterfaceC3327l.class), new C18234l(null, longPointerWrapper3, AbstractC7477l.purchase(c5501l, interfaceC7832l, longPointerWrapper3, z, z2)));
                default:
                    C8339l.metrica("Unsupported type: ".concat(AbstractC12589l.m3421native(i2)));
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C10049l m1567synchronized(boolean z) throws IOException {
        try {
            C10049l c10049lPurchase = ((InterfaceC1029l) this.f9374l).purchase(z);
            if (c10049lPurchase == null) {
                return c10049lPurchase;
            }
            c10049lPurchase.vip = this;
            return c10049lPurchase;
        } catch (IOException e) {
            ((C17778l) this.f9373l).f34630l.getClass();
            m1563catch(e);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f9374l;
        int[] iArr2 = (int[]) this.f9372l;
        if (!this.f9370l) {
            C8339l.smaato("XTEA not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        if (this.f9369l) {
            int iPurchase = purchase(i, bArr);
            int iPurchase2 = purchase(i + 4, bArr);
            for (int i3 = 0; i3 < 32; i3++) {
                iPurchase += (((iPurchase2 << 4) ^ (iPurchase2 >>> 5)) + iPurchase2) ^ iArr2[i3];
                iPurchase2 += (((iPurchase << 4) ^ (iPurchase >>> 5)) + iPurchase) ^ iArr[i3];
            }
            m1561else(iPurchase, i2, bArr2);
            m1561else(iPurchase2, i2 + 4, bArr2);
            return 8;
        }
        int iPurchase3 = purchase(i, bArr);
        int iPurchase4 = purchase(i + 4, bArr);
        for (int i4 = 31; i4 >= 0; i4--) {
            iPurchase4 -= (((iPurchase3 << 4) ^ (iPurchase3 >>> 5)) + iPurchase3) ^ iArr[i4];
            iPurchase3 -= (((iPurchase4 << 4) ^ (iPurchase4 >>> 5)) + iPurchase4) ^ iArr2[i4];
        }
        m1561else(iPurchase3, i2, bArr2);
        m1561else(iPurchase4, i2 + 4, bArr2);
        return 8;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public ArrayList m1568throw(InterfaceC13789l interfaceC13789l) {
        C10038l c10038l = (C10038l) this.f9372l;
        C1850l c1850l = new C1850l(interfaceC13789l, C12178l.loadAd(((C7757l) c10038l.f20463l).adcel, (C8943l) ((InterfaceC1220l) c10038l.f20466l).getValue(), ((AbstractC18041l) interfaceC13789l).getAnnotations()), null);
        C6238l c6238l = new C6238l(3, this);
        ArrayList arrayList = new ArrayList(1);
        billing(c1850l, arrayList, c6238l);
        return arrayList;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m1569throws(boolean z, boolean z2) {
        C14500l c14500l = (C14500l) this.f9372l;
        int i = 1;
        if (z && z2) {
            c14500l.amazon(new RunnableC15327l(i, this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C14500l c14500l2 = (C14500l) this.f9374l;
        c14500l2.yandex.postDelayed(new RunnableC10311l(this, atomicBoolean, 28), 1000L);
        c14500l.amazon(new RunnableC2476l(this, atomicBoolean, z, z2, 1));
    }

    @Override // defpackage.InterfaceC14426l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f9374l;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }

    public C4619l(InterfaceC2853l interfaceC2853l, boolean z, C10038l c10038l, EnumC7061l enumC7061l, boolean z2) {
        this.f9371l = 2;
        this.f9373l = interfaceC2853l;
        this.f9370l = z;
        this.f9372l = c10038l;
        this.f9374l = enumC7061l;
        this.f9369l = z2;
    }

    public C4619l(C17778l c17778l, InterfaceC11772l interfaceC11772l, InterfaceC1029l interfaceC1029l) {
        this.f9371l = 0;
        this.f9373l = c17778l;
        this.f9372l = interfaceC11772l;
        this.f9374l = interfaceC1029l;
    }

    public C4619l(Context context, String str, C14785l c14785l, boolean z, boolean z2) {
        this.f9371l = 3;
        this.f9373l = context;
        this.f9372l = str;
        this.f9374l = c14785l;
        this.f9370l = z;
        this.f9369l = z2;
    }

    public C4619l(C5501l c5501l, InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        this.f9371l = 1;
        new LinkedHashMap();
        this.f9373l = c5501l;
        this.f9372l = interfaceC7832l;
        this.f9374l = longPointerWrapper;
        this.f9370l = z;
        this.f9369l = z2;
    }
}
