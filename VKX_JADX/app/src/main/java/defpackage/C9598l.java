package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍٖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9598l implements InterfaceC7483l, InterfaceC2435l, InterfaceC13919l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f19549l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f19550l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19551l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f19552l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f19553l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f19554l;

    public C9598l(C10038l c10038l, InterfaceC10233l interfaceC10233l, InterfaceC18335l interfaceC18335l, int i) {
        this.f19551l = 3;
        this.f19549l = c10038l;
        this.f19553l = interfaceC10233l;
        this.f19550l = i;
        ArrayList typeParameters = interfaceC18335l.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f19552l = linkedHashMap;
        this.f19554l = ((C7757l) ((C10038l) this.f19549l).f20463l).yandex.crashlytics(new C6238l(24, this));
    }

    @Override // defpackage.InterfaceC2435l
    public boolean Signature(Object obj, int i, Map map) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f19552l).crashlytics(c3585l, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f19554l).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_set_insert(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, new long[1], zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public int admob() {
        return this.f19550l;
    }

    public void advert(long[] jArr) {
        int i = this.f19550l;
        while (true) {
            byte[] bArr = (byte[]) this.f19553l;
            if (i >= bArr.length) {
                long[] jArr2 = (long[]) ((C6921l) this.f19549l).f14493l;
                jArr2[1] = jArr2[1] | Long.MIN_VALUE;
                m2699synchronized(jArr);
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    public void amazon() {
        List<C16053l> listM4213const;
        synchronized (((ArrayList) this.f19552l)) {
            listM4213const = AbstractC16901l.m4213const((ArrayList) this.f19552l);
            ((ArrayList) this.f19552l).clear();
        }
        for (C16053l c16053l : listM4213const) {
            Trace.beginSection("InvokeInternalListeners");
            int size = c16053l.amazon.size();
            for (int i = 0; i < size; i++) {
                InterfaceC10687l interfaceC10687l = (InterfaceC10687l) c16053l.amazon.get(i);
                int size2 = c16053l.purchase.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC9492l) c16053l.purchase.get(i2)).mo1760switch(interfaceC10687l.billing());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = c16053l.amazon.size();
            for (int i3 = 0; i3 < size3; i3++) {
                InterfaceC10687l interfaceC10687l2 = (InterfaceC10687l) c16053l.amazon.get(i3);
                int size4 = interfaceC10687l2.billing().amazon.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((InterfaceC9492l) interfaceC10687l2.billing().amazon.get(i4)).mo1760switch(interfaceC10687l2.billing());
                }
            }
            Trace.endSection();
        }
        ((C8509l) this.f19549l).yandex();
    }

    public void billing(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tapsense((AbstractC4829l) it.next());
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m2696catch(byte[] bArr, int i, int i2, long[] jArr) {
        C6921l c6921l = (C6921l) this.f19549l;
        int i3 = 0;
        while (i2 > i3) {
            if (this.f19550l == ((byte[]) this.f19553l).length) {
                m2699synchronized(jArr);
                long[] jArr2 = (long[]) c6921l.f14493l;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
                this.f19550l = 0;
            }
            int iMin = Math.min(i2 - i3, ((byte[]) this.f19553l).length - this.f19550l);
            System.arraycopy(bArr, i + i3, (byte[]) this.f19553l, this.f19550l, iMin);
            i3 += iMin;
            this.f19550l += iMin;
            boolean z = c6921l.f14494l;
            long[] jArr3 = (long[]) c6921l.f14493l;
            if (z) {
                long[] jArr4 = new long[3];
                jArr4[0] = jArr3[0] & 4294967295L;
                jArr4[1] = (jArr3[0] >>> 32) & 4294967295L;
                jArr4[2] = jArr3[1] & 4294967295L;
                long j = iMin;
                for (int i4 = 0; i4 < 3; i4++) {
                    long j2 = j + jArr4[i4];
                    jArr4[i4] = j2;
                    j = j2 >>> 32;
                }
                long[] jArr5 = (long[]) c6921l.f14493l;
                jArr5[0] = ((jArr4[1] & 4294967295L) << 32) | (jArr4[0] & 4294967295L);
                jArr5[1] = (jArr4[2] & 4294967295L) | (jArr5[1] & (-4294967296L));
            } else {
                long j3 = jArr3[0] + ((long) iMin);
                jArr3[0] = j3;
                if (j3 > 9223372034707292160L) {
                    c6921l.f14494l = true;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2435l
    public void clear() {
        AbstractC0653l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC2435l
    public boolean contains(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f19552l).crashlytics(c3585l, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f19554l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, new long[1], zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public void crashlytics(int i) {
        this.f19550l = i;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean firebase(C15525l c15525l, int i, Map map) {
        return AbstractC0653l.yandex(this, c15525l, i, map);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m2697for() {
        C8509l c8509l = (C8509l) this.f19549l;
        synchronized (c8509l.isPro) {
            Log.d("CXCP", c8509l + "#stopRepeating");
            c8509l.yandex.mo2279l();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC2435l
    public Object get(int i) {
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f19552l;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f19554l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_set_get(ptr$cinterop_release, i, realm_value_tVar.yandex, realm_value_tVar);
        return abstractC14507l.amazon(realm_value_tVar);
    }

    public Range isVip() {
        return (Range) ((C5104l) this.f19553l).smaato(C0665l.billing, C5464l.admob);
    }

    public void license(InterfaceC17944l interfaceC17944l) {
        for (C6916l c6916l : interfaceC17944l.startapp()) {
            ((C5104l) this.f19553l).smaato(c6916l, null);
            ((C5104l) this.f19553l).purchase(c6916l, interfaceC17944l.mo860class(c6916l), interfaceC17944l.adcel(c6916l));
        }
    }

    @Override // defpackage.InterfaceC2435l
    public InterfaceC2435l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C9598l((C5501l) this.f19549l, interfaceC7832l, (AbstractC14507l) this.f19552l, longPointerWrapper);
    }

    @Override // defpackage.InterfaceC2435l
    /* JADX INFO: renamed from: package */
    public boolean mo1139package(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean zSignature = Signature(obj, i, linkedHashMap);
        crashlytics(admob() + 1);
        return zSignature;
    }

    public boolean premium(int i) {
        return ((C17614l[]) this.f19549l)[i] != null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public Unit m2698private() {
        Log.d("CXCP", "Closing " + this);
        if (!((C18474l) this.f19553l).yandex()) {
            return Unit.INSTANCE;
        }
        ((C8509l) this.f19549l).amazon();
        return Unit.INSTANCE;
    }

    public C0665l pro() {
        ArrayList arrayList = new ArrayList((HashSet) this.f19549l);
        C7420l c7420lYandex = C7420l.yandex((C5104l) this.f19553l);
        int i = this.f19550l;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f19552l);
        C12815l c12815l = (C12815l) this.f19554l;
        C12920l c12920l = C12920l.loadAd;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c12815l.yandex.keySet()) {
            arrayMap.put(str, c12815l.yandex.get(str));
        }
        return new C0665l(arrayList, c7420lYandex, i, arrayList2, new C12920l(arrayMap));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // defpackage.InterfaceC13919l
    public void purchase(C13143l c13143l) {
        C16391l c16391l;
        C16391l c16391l2;
        SparseArray sparseArray;
        int i;
        C5257l c5257l;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.f19553l;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f19552l;
        C5257l c5257l2 = (C5257l) this.f19549l;
        C7251l c7251l = (C7251l) this.f19554l;
        SparseArray sparseArray3 = c7251l.admob;
        SparseBooleanArray sparseBooleanArray = c7251l.subs;
        C17368l c17368l = c7251l.billing;
        List list = c7251l.crashlytics;
        int i2 = c7251l.yandex;
        if (c13143l.signatures() != 2) {
            return;
        }
        if (i2 == 1 || i2 == 2 || c7251l.vip == 1) {
            c16391l = (C16391l) list.get(0);
        } else {
            c16391l = new C16391l(((C16391l) list.get(0)).amazon());
            list.add(c16391l);
        }
        if ((c13143l.signatures() & 128) == 0) {
            return;
        }
        c13143l.m3568throw(1);
        int iM3567synchronized = c13143l.m3567synchronized();
        c13143l.m3568throw(3);
        c13143l.firebase(0, 2, c5257l2.loadAd);
        c5257l2.remoteconfig(0);
        c5257l2.metrica(3);
        c7251l.tapsense = c5257l2.mopub(13);
        c13143l.firebase(0, 2, c5257l2.loadAd);
        c5257l2.remoteconfig(0);
        c5257l2.metrica(4);
        c13143l.m3568throw(c5257l2.mopub(12));
        if (i2 == 2 && c7251l.ads == null) {
            InterfaceC8865l interfaceC8865lYandex = c17368l.yandex(21, new C17219l(21, (String) null, 0, (ArrayList) null, AbstractC15323l.loadAd));
            c7251l.ads = interfaceC8865lYandex;
            if (interfaceC8865lYandex != null) {
                interfaceC8865lYandex.subs(c16391l, c7251l.remoteconfig, new Cstatic(iM3567synchronized, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iYandex = c13143l.yandex();
        while (iYandex > 0) {
            c13143l.firebase(0, 5, c5257l2.loadAd);
            c5257l2.remoteconfig(0);
            int iMopub = c5257l2.mopub(8);
            c5257l2.metrica(3);
            int iMopub2 = c5257l2.mopub(13);
            c5257l2.metrica(4);
            int iMopub3 = c5257l2.mopub(12);
            int i3 = c13143l.loadAd;
            int i4 = i3 + iMopub3;
            int i5 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iSignatures = 0;
            int i6 = iYandex;
            while (true) {
                if (c13143l.loadAd >= i4) {
                    c5257l = c5257l2;
                    break;
                }
                int iSignatures2 = c13143l.signatures();
                c5257l = c5257l2;
                int iSignatures3 = c13143l.loadAd + c13143l.signatures();
                if (iSignatures3 > i4) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iSignatures2 == 5) {
                    long jApplovin = c13143l.applovin();
                    if (jApplovin == 1094921523) {
                        i5 = 129;
                    } else if (jApplovin == 1161904947) {
                        i5 = 135;
                    } else if (jApplovin == 1094921524) {
                        i5 = 172;
                    } else if (jApplovin == 1212503619) {
                        i5 = 36;
                    }
                } else if (iSignatures2 == 106) {
                    iSignatures3 = iSignatures3;
                    i5 = 129;
                } else if (iSignatures2 == 122) {
                    i5 = 135;
                    iSignatures3 = iSignatures3;
                } else if (iSignatures2 == 127) {
                    int iSignatures4 = c13143l.signatures();
                    if (iSignatures4 == 21) {
                        i5 = 172;
                    } else if (iSignatures4 == 14) {
                        i5 = 136;
                    } else if (iSignatures4 == 33) {
                        i5 = 139;
                    }
                } else if (iSignatures2 == 123) {
                    i5 = 138;
                } else if (iSignatures2 == 10) {
                    strTrim = c13143l.advert(3, StandardCharsets.UTF_8).trim();
                    iSignatures = c13143l.signatures();
                } else if (iSignatures2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (c13143l.loadAd < iSignatures3) {
                        String strTrim2 = c13143l.advert(3, StandardCharsets.UTF_8).trim();
                        c13143l.signatures();
                        C16391l c16391l3 = c16391l;
                        byte[] bArr = new byte[4];
                        c13143l.firebase(0, 4, bArr);
                        arrayList2.add(new C6493l(strTrim2, bArr));
                        c16391l = c16391l3;
                        iSignatures3 = iSignatures3;
                        iM3567synchronized = iM3567synchronized;
                    }
                    iSignatures3 = iSignatures3;
                    iM3567synchronized = iM3567synchronized;
                    c16391l = c16391l;
                    arrayList = arrayList2;
                    i5 = 89;
                } else {
                    iSignatures3 = iSignatures3;
                    iM3567synchronized = iM3567synchronized;
                    c16391l = c16391l;
                    if (iSignatures2 == 111) {
                        i5 = 257;
                    }
                }
                c13143l.m3568throw(iSignatures3 - c13143l.loadAd);
                c16391l = c16391l;
                c5257l2 = c5257l;
                sparseArray3 = sparseArray4;
                iM3567synchronized = iM3567synchronized;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i7 = iM3567synchronized;
            C16391l c16391l4 = c16391l;
            c13143l.m3562for(i4);
            C17219l c17219l = new C17219l(i5, strTrim, iSignatures, arrayList, Arrays.copyOfRange(c13143l.yandex, i3, i4));
            if (iMopub == 6 || iMopub == 5) {
                iMopub = i5;
            }
            int i8 = i6 - (iMopub3 + 5);
            int i9 = i2 == 2 ? iMopub : iMopub2;
            if (sparseBooleanArray.get(i9)) {
                c = 21;
            } else {
                c = 21;
                InterfaceC8865l interfaceC8865lYandex2 = (i2 == 2 && iMopub == 21) ? c7251l.ads : c17368l.yandex(iMopub, c17219l);
                if (i2 != 2 || iMopub2 < sparseIntArray.get(i9, 8192)) {
                    sparseIntArray.put(i9, iMopub2);
                    sparseArray2.put(i9, interfaceC8865lYandex2);
                }
            }
            iYandex = i8;
            c16391l = c16391l4;
            c5257l2 = c5257l;
            sparseArray3 = sparseArray5;
            iM3567synchronized = i7;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i10 = iM3567synchronized;
        C16391l c16391l5 = c16391l;
        int size = sparseIntArray.size();
        int i11 = 0;
        while (i11 < size) {
            int iKeyAt = sparseIntArray.keyAt(i11);
            int iValueAt = sparseIntArray.valueAt(i11);
            sparseBooleanArray.put(iKeyAt, true);
            c7251l.isPro.put(iValueAt, true);
            InterfaceC8865l interfaceC8865l = (InterfaceC8865l) sparseArray2.valueAt(i11);
            if (interfaceC8865l != null) {
                if (interfaceC8865l != c7251l.ads) {
                    i = i10;
                    c16391l2 = c16391l5;
                    interfaceC8865l.subs(c16391l2, c7251l.remoteconfig, new Cstatic(i, iKeyAt, 8192));
                } else {
                    c16391l2 = c16391l5;
                    i = i10;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, interfaceC8865l);
            } else {
                c16391l2 = c16391l5;
                sparseArray = sparseArray6;
                i = i10;
            }
            i11++;
            sparseArray6 = sparseArray;
            i10 = i;
            c16391l5 = c16391l2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (i2 == 2) {
            if (c7251l.metrica) {
                return;
            }
            c7251l.remoteconfig.firebase();
            c7251l.vip = 0;
            c7251l.metrica = true;
            return;
        }
        sparseArray7.remove(this.f19550l);
        int i12 = i2 == 1 ? 0 : c7251l.vip - 1;
        c7251l.vip = i12;
        if (i12 == 0) {
            c7251l.remoteconfig.firebase();
            c7251l.metrica = true;
        }
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f19553l;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean remove(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f19552l).crashlytics(c3585l, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f19554l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_erase(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        crashlytics(admob() + 1);
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean removeAll(Collection collection) {
        return AbstractC0653l.mopub(this, collection);
    }

    public boolean signatures(C9598l c9598l, int i) {
        return c9598l != null && Objects.equals(((C17614l[]) this.f19549l)[i], ((C17614l[]) c9598l.f19549l)[i]) && Objects.equals(((InterfaceC10376l[]) this.f19553l)[i], ((InterfaceC10376l[]) c9598l.f19553l)[i]);
    }

    @Override // defpackage.InterfaceC7483l
    public InterfaceC16902l startapp(C16765l c16765l) {
        C16158l c16158l = (C16158l) ((C18028l) this.f19554l).invoke(c16765l);
        return c16158l != null ? c16158l : ((InterfaceC7483l) ((C10038l) this.f19549l).f20462l).startapp(c16765l);
    }

    @Override // defpackage.InterfaceC2435l
    public boolean subscription(Collection collection, int i, Map map) {
        return AbstractC0653l.loadAd(this, collection, i, map);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m2699synchronized(long[] jArr) {
        C3268l c3268l = (C3268l) this.f19554l;
        C1660l c1660l = c3268l.f6996l;
        c1660l.yandex(true, c3268l.f6992l, (long[]) ((C6921l) this.f19549l).f14493l);
        AbstractC10000l.tapsense(0, (byte[]) this.f19553l, (long[]) this.f19552l);
        c1660l.loadAd((long[]) this.f19552l, jArr);
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = jArr[i] ^ ((long[]) this.f19552l)[i];
        }
    }

    public void tapsense(AbstractC4829l abstractC4829l) {
        ArrayList arrayList = (ArrayList) this.f19552l;
        if (arrayList.contains(abstractC4829l)) {
            return;
        }
        arrayList.add(abstractC4829l);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public boolean m2700throw(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Throwable {
        Throwable th;
        boolean z2;
        boolean z3;
        if (((C18474l) this.f19553l).loadAd()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            C16053l c16053lCrashlytics = ((C8509l) this.f19549l).crashlytics(z, list, map, map2, map3, (C13161l) this.f19554l, list2);
            Trace.endSection();
            if (c16053lCrashlytics == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C15390l) it.next()).getClass();
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((C18474l) this.f19553l).loadAd()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!c16053lCrashlytics.loadAd) {
                synchronized (((ArrayList) this.f19552l)) {
                    ((ArrayList) this.f19552l).add(c16053lCrashlytics);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + c16053lCrashlytics);
                Trace.beginSection("InvokeInternalListeners");
                int size = c16053lCrashlytics.amazon.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC10687l interfaceC10687l = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i);
                    int size2 = c16053lCrashlytics.purchase.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i2)).vip(interfaceC10687l);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = c16053lCrashlytics.amazon.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC10687l interfaceC10687l2 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i3);
                    int size4 = interfaceC10687l2.billing().amazon.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((InterfaceC9492l) interfaceC10687l2.billing().amazon.get(i4)).vip(interfaceC10687l2);
                    }
                }
                Trace.endSection();
                synchronized (c16053lCrashlytics) {
                    if (!((C18474l) this.f19553l).loadAd()) {
                        try {
                            Trace.beginSection("CXCP#submit(CaptureSequence)");
                            Integer numPurchase = ((C8509l) this.f19549l).purchase(c16053lCrashlytics);
                            int iIntValue = numPurchase != null ? numPurchase.intValue() : -1;
                            c16053lCrashlytics.remoteconfig = Integer.valueOf(iIntValue);
                            Trace.endSection();
                            if (iIntValue != -1) {
                                Trace.beginSection("InvokeInternalListeners");
                                int size5 = c16053lCrashlytics.amazon.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    InterfaceC10687l interfaceC10687l3 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i5);
                                    int size6 = c16053lCrashlytics.purchase.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i6)).mo1758package(interfaceC10687l3);
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size7 = c16053lCrashlytics.amazon.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    InterfaceC10687l interfaceC10687l4 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i7);
                                    int size8 = interfaceC10687l4.billing().amazon.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        ((InterfaceC9492l) interfaceC10687l4.billing().amazon.get(i8)).mo1758package(interfaceC10687l4);
                                    }
                                }
                                Trace.endSection();
                                z3 = true;
                                try {
                                    Log.d("CXCP", this + " submitted " + c16053lCrashlytics);
                                } catch (CameraAccessException unused) {
                                } catch (Throwable th2) {
                                    z2 = true;
                                    th = th2;
                                    if (z2 || c16053lCrashlytics.loadAd) {
                                        throw th;
                                    }
                                    synchronized (((ArrayList) this.f19552l)) {
                                        ((ArrayList) this.f19552l).remove(c16053lCrashlytics);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size9 = c16053lCrashlytics.amazon.size();
                                    for (int i9 = 0; i9 < size9; i9++) {
                                        InterfaceC10687l interfaceC10687l5 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i9);
                                        int size10 = c16053lCrashlytics.purchase.size();
                                        for (int i10 = 0; i10 < size10; i10++) {
                                            ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i10)).mo1760switch(interfaceC10687l5.billing());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size11 = c16053lCrashlytics.amazon.size();
                                    for (int i11 = 0; i11 < size11; i11++) {
                                        InterfaceC10687l interfaceC10687l6 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i11);
                                        int size12 = interfaceC10687l6.billing().amazon.size();
                                        for (int i12 = 0; i12 < size12; i12++) {
                                            ((InterfaceC9492l) interfaceC10687l6.billing().amazon.get(i12)).mo1760switch(interfaceC10687l6.billing());
                                        }
                                    }
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                Log.w("CXCP", "Failed to submit " + c16053lCrashlytics + ": " + this + " received -1 from submit.");
                                z3 = false;
                            }
                            if (z3 || c16053lCrashlytics.loadAd) {
                                return z3;
                            }
                            synchronized (((ArrayList) this.f19552l)) {
                                ((ArrayList) this.f19552l).remove(c16053lCrashlytics);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = c16053lCrashlytics.amazon.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                InterfaceC10687l interfaceC10687l7 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i13);
                                int size14 = c16053lCrashlytics.purchase.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i14)).mo1760switch(interfaceC10687l7.billing());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = c16053lCrashlytics.amazon.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                InterfaceC10687l interfaceC10687l8 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i15);
                                int size16 = interfaceC10687l8.billing().amazon.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((InterfaceC9492l) interfaceC10687l8.billing().amazon.get(i16)).mo1760switch(interfaceC10687l8.billing());
                                }
                            }
                            Trace.endSection();
                            return z3;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    Log.w("CXCP", "Failed to submit " + c16053lCrashlytics + ": " + this + " is closed.");
                    if (!c16053lCrashlytics.loadAd) {
                        synchronized (((ArrayList) this.f19552l)) {
                            ((ArrayList) this.f19552l).remove(c16053lCrashlytics);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = c16053lCrashlytics.amazon.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            InterfaceC10687l interfaceC10687l9 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i17);
                            int size18 = c16053lCrashlytics.purchase.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i18)).mo1760switch(interfaceC10687l9.billing());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = c16053lCrashlytics.amazon.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            InterfaceC10687l interfaceC10687l10 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i19);
                            int size20 = interfaceC10687l10.billing().amazon.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((InterfaceC9492l) interfaceC10687l10.billing().amazon.get(i20)).mo1760switch(interfaceC10687l10.billing());
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                    return false;
                }
            } catch (CameraAccessException unused2) {
                if (!c16053lCrashlytics.loadAd) {
                    synchronized (((ArrayList) this.f19552l)) {
                        ((ArrayList) this.f19552l).remove(c16053lCrashlytics);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = c16053lCrashlytics.amazon.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            InterfaceC10687l interfaceC10687l11 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i21);
                            int size22 = c16053lCrashlytics.purchase.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((InterfaceC9492l) c16053lCrashlytics.purchase.get(i22)).mo1760switch(interfaceC10687l11.billing());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = c16053lCrashlytics.amazon.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            InterfaceC10687l interfaceC10687l12 = (InterfaceC10687l) c16053lCrashlytics.amazon.get(i23);
                            int size24 = interfaceC10687l12.billing().amazon.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((InterfaceC9492l) interfaceC10687l12.billing().amazon.get(i24)).mo1760switch(interfaceC10687l12.billing());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = false;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m2701throws(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = (byte[]) this.f19552l;
        byte[] bArr4 = (byte[]) this.f19553l;
        int i2 = this.f19550l;
        if (i + i2 > bArr.length) {
            C10754l.ad("input buffer too short");
            return;
        }
        if (i2 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return;
        }
        ((InterfaceC10952l) this.f19554l).tapsense(0, 0, bArr4, bArr3);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        System.arraycopy(bArr4, i2, bArr4, 0, bArr4.length - i2);
        System.arraycopy(bArr2, 0, bArr4, bArr4.length - i2, i2);
    }

    public String toString() {
        String str;
        String str2;
        switch (this.f19551l) {
            case 2:
                return "GraphRequestProcessor-" + this.f19550l;
            case 8:
                String str3 = (String) this.f19554l;
                StringBuilder sb = new StringBuilder("since ");
                sb.append((C10008l) this.f19549l);
                sb.append(' ');
                int i = this.f19550l;
                if (i == 1) {
                    str = "WARNING";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "HIDDEN";
                } else {
                    str = "ERROR";
                }
                sb.append(str);
                Integer num = (Integer) this.f19552l;
                if (num != null) {
                    str2 = " error " + num.intValue();
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(str3 != null ? ": ".concat(str3) : "");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2435l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f19554l;
    }

    public C9598l(C10008l c10008l, EnumC7053l enumC7053l, int i, Integer num, String str) {
        this.f19551l = 8;
        this.f19549l = c10008l;
        this.f19553l = enumC7053l;
        this.f19550l = i;
        this.f19552l = num;
        this.f19554l = str;
    }

    public C9598l(C3268l c3268l, int i) {
        this.f19551l = 6;
        this.f19554l = c3268l;
        C6921l c6921l = new C6921l(10, false);
        long[] jArr = {0, 0};
        c6921l.f14493l = jArr;
        c6921l.f14494l = false;
        jArr[1] = 4611686018427387904L;
        this.f19549l = c6921l;
        this.f19553l = new byte[i];
        this.f19552l = new long[i / 8];
    }

    public C9598l(C8509l c8509l) {
        this.f19551l = 2;
        this.f19549l = c8509l;
        C11879l c11879l = AbstractC6044l.yandex;
        c11879l.getClass();
        this.f19550l = C11879l.loadAd.incrementAndGet(c11879l);
        this.f19553l = AbstractC1805l.yandex(false);
        this.f19552l = new ArrayList();
        this.f19554l = new C13161l(this);
    }

    @Override // defpackage.InterfaceC13919l
    public void subs(C16391l c16391l, InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
    }

    public C9598l(C17614l[] c17614lArr, InterfaceC10376l[] interfaceC10376lArr, C1047l c1047l, Object obj) {
        this.f19551l = 0;
        AbstractC12442l.admob(c17614lArr.length == interfaceC10376lArr.length);
        this.f19549l = c17614lArr;
        this.f19553l = (InterfaceC10376l[]) interfaceC10376lArr.clone();
        this.f19552l = c1047l;
        this.f19554l = obj;
        this.f19550l = c17614lArr.length;
    }

    public C9598l(C9892l c9892l, C11440l c11440l, byte[] bArr, C14706l[] c14706lArr, int i) {
        this.f19551l = 9;
        this.f19549l = c9892l;
        this.f19553l = c11440l;
        this.f19552l = bArr;
        this.f19554l = c14706lArr;
        this.f19550l = i;
    }

    public C9598l(int i) {
        this.f19551l = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f19549l = new HashSet();
                this.f19553l = C5104l.crashlytics();
                this.f19550l = -1;
                this.f19552l = new ArrayList();
                this.f19554l = C12815l.yandex();
                break;
        }
    }

    public C9598l(C5501l c5501l, InterfaceC7832l interfaceC7832l, AbstractC14507l abstractC14507l, LongPointerWrapper longPointerWrapper) {
        this.f19551l = 5;
        this.f19549l = c5501l;
        this.f19553l = interfaceC7832l;
        this.f19552l = abstractC14507l;
        this.f19554l = longPointerWrapper;
    }

    public C9598l(C7251l c7251l, int i) {
        this.f19551l = 7;
        this.f19554l = c7251l;
        this.f19549l = new C5257l(new byte[5], 5);
        this.f19553l = new SparseArray();
        this.f19552l = new SparseIntArray();
        this.f19550l = i;
    }
}
