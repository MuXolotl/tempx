package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5991l implements InterfaceC14606l, InterfaceC3770l, InterfaceC15071l, InterfaceC14314l, InterfaceC18327l, InterfaceC17443l, InterfaceC2743l, InterfaceC11545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f12715l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f12716l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12717l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f12718l;

    public C5991l(byte b, int i) {
        this.f12717l = i;
        switch (i) {
            case 16:
                this.f12716l = new HashMap();
                this.f12715l = new HashMap();
                this.f12718l = new HashMap();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                this.f12716l = new WeakHashMap();
                this.f12715l = new WeakHashMap();
                this.f12718l = new WeakHashMap();
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f12716l = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f12715l = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f12718l = new ConcurrentHashMap();
                break;
        }
    }

    @Override // defpackage.InterfaceC3770l
    public void Signature(int i, Object obj) {
        C16761l c16761l = (C16761l) this.f12716l;
        c16761l.yandex(6);
        c16761l.yandex(i);
        ((C12463l) this.f12715l).yandex(obj);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C2350l c2350l = (C2350l) obj2;
        switch (this.f12717l) {
            case 14:
                C16014l c16014l = (C16014l) this.f12716l;
                C17186l c17186l = (C17186l) this.f12715l;
                String str = (String) this.f12718l;
                C4184l c4184l = (C4184l) obj;
                AbstractC1051l.firebase("Not active connection", c16014l.f31393throws != 1);
                if (c17186l != null) {
                    C10567l c10567l = (C10567l) c4184l.metrica();
                    C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                    Parcel parcelM743l = c10567l.m743l();
                    parcelM743l.writeString(str);
                    AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                    c10567l.m747l(parcelM743l, 12);
                }
                c2350l.loadAd(null);
                return;
            case 15:
                C16014l c16014l2 = (C16014l) this.f12716l;
                String str2 = (String) this.f12715l;
                C1901l c1901l = (C1901l) this.f12718l;
                C4184l c4184l2 = (C4184l) obj;
                AbstractC1051l.firebase("Not connected to device", c16014l2.f31393throws == 3);
                C10567l c10567l2 = (C10567l) c4184l2.metrica();
                C3448l c3448lRemoteconfig2 = AbstractC11990l.remoteconfig();
                Parcel parcelM743l2 = c10567l2.m743l();
                parcelM743l2.writeString(str2);
                AbstractC14627l.loadAd(parcelM743l2, c1901l);
                AbstractC14627l.loadAd(parcelM743l2, c3448lRemoteconfig2);
                c10567l2.m747l(parcelM743l2, 13);
                synchronized (c16014l2.ads) {
                    try {
                        if (c16014l2.metrica != null) {
                            c16014l2.isPro(2477);
                        }
                        c16014l2.metrica = c2350l;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
                BinderC15695l binderC15695l = new BinderC15695l((C1539l) this.f12716l, (C18096l) this.f12718l);
                String str3 = (String) this.f12715l;
                Parcel parcelM743l3 = c18414l.m743l();
                parcelM743l3.writeString(str3);
                AbstractC15425l.crashlytics(parcelM743l3, binderC15695l);
                c18414l.m741l(parcelM743l3, 28);
                return;
        }
    }

    @Override // defpackage.InterfaceC15071l
    public C8403l ad() {
        return (C8403l) this.f12715l;
    }

    @Override // defpackage.InterfaceC3770l
    public void adcel() {
        ((C16761l) this.f12716l).yandex(0);
    }

    @Override // defpackage.InterfaceC3770l
    public void admob(Object obj) {
        ((C16761l) this.f12716l).yandex(1);
        ((C12463l) this.f12715l).yandex(obj);
    }

    @Override // defpackage.InterfaceC3770l
    public void ads(Object obj, Function2 function2) {
        ((C16761l) this.f12716l).yandex(7);
        C12463l c12463l = (C12463l) this.f12715l;
        c12463l.yandex(function2);
        c12463l.yandex(obj);
    }

    public Object advert(Object obj) {
        return ((SharedPreferences) this.f12716l).getString((String) this.f12715l, (String) this.f12718l);
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        ((C10970l) this.f12718l).purchase = null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x006f A[EDGE_INSN: B:67:0x006f->B:65:0x006f BREAK  A[LOOP:1: B:35:0x0091->B:70:?], SYNTHETIC] */
    public void applovin(AbstractC15619l abstractC15619l, Set set, String str) {
        C0239l[] c0239lArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f12716l).getAndSet(true)) {
            if (C8663l.loadAd == null) {
                synchronized (C8663l.class) {
                    try {
                        if (C8663l.loadAd == null) {
                            C8663l.loadAd = new C8663l(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C8663l.loadAd.yandex.add(0, new C13975l(25));
        }
        final byte[] bArrAds = abstractC15619l.ads();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12715l;
        if (Build.VERSION.SDK_INT >= 24) {
            ConcurrentMap$EL.compute(concurrentHashMap, str, new BiFunction() { // from class: lَ۠ۙ
                public /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final /* synthetic */ Object apply(Object obj, Object obj2) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = bArrAds;
                    return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
                }
            });
        } else {
            byte[] bArr = (byte[]) concurrentHashMap.putIfAbsent(str, bArrAds);
            if (bArr != null) {
                while (!Arrays.equals(bArr, bArrAds) && !concurrentHashMap.replace(str, bArr, bArrAds)) {
                    bArr = (byte[]) concurrentHashMap.get(str);
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f12718l).putIfAbsent((String) it.next(), new AtomicReference(new C0239l(str, bArrAds)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof C0239l) {
                        C0239l c0239l = (C0239l) obj;
                        if (str.equals(c0239l.f1227l)) {
                            c0239l.yandex(bArrAds);
                            break;
                        }
                        C0239l c0239l2 = new C0239l(str, bArrAds);
                        c0239lArr = str.compareTo(c0239l.f1227l) < 0 ? new C0239l[]{c0239l2, c0239l} : new C0239l[]{c0239l, c0239l2};
                        do {
                            if (atomicReference.compareAndSet(obj, c0239lArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        C0239l[] c0239lArr2 = (C0239l[]) obj;
                        int iBinarySearch = Arrays.binarySearch(c0239lArr2, str);
                        if (iBinarySearch >= 0) {
                            c0239lArr2[iBinarySearch].yandex(bArrAds);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = c0239lArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            c0239lArr = (C0239l[]) Arrays.copyOf(c0239lArr2, i2);
                        } else {
                            C0239l[] c0239lArr3 = new C0239l[i2];
                            System.arraycopy(c0239lArr2, 0, c0239lArr3, 0, i);
                            System.arraycopy(c0239lArr2, i, c0239lArr3, i + 1, i3);
                            c0239lArr = c0239lArr3;
                        }
                        c0239lArr[i] = new C0239l(str, bArrAds);
                        do {
                            if (atomicReference.compareAndSet(obj, c0239lArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3770l
    public void billing(int i, Object obj) {
        C16761l c16761l = (C16761l) this.f12716l;
        c16761l.yandex(5);
        c16761l.yandex(i);
        ((C12463l) this.f12715l).yandex(obj);
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC18636l crashlytics() {
        return (C4543l) this.f12716l;
    }

    @Override // defpackage.InterfaceC2743l
    public long firebase(int i) {
        long[] jArr = (long[]) this.f12718l;
        AbstractC12442l.admob(i >= 0);
        AbstractC12442l.admob(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C4225l(new C6162l(14), new C12899l(13), (C5379l) ((C11644l) this.f12716l).get(), (C7644l) ((C12714l) this.f12715l).get(), (C1381l) ((C7502l) this.f12718l).get());
    }

    @Override // defpackage.InterfaceC14314l
    public String getAlgorithm() {
        return "HMAC-DRBG-".concat(AbstractC16336l.crashlytics(((C0361l) this.f12716l).f1427l));
    }

    @Override // defpackage.InterfaceC3770l
    public void isPro() {
        ((C16761l) this.f12716l).yandex(8);
    }

    public void isVip(AbstractC3031l abstractC3031l, C15389l c15389l) {
        Exception exc;
        Exception exc2;
        int i;
        C16761l c16761l = (C16761l) this.f12716l;
        int i2 = c16761l.loadAd;
        C12463l c12463l = (C12463l) this.f12715l;
        C12463l c12463l2 = new C12463l();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (c16761l.crashlytics(i3)) {
                        case 0:
                            abstractC3031l.adcel();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            abstractC3031l.admob(c12463l.admob(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            abstractC3031l.remoteconfig(c16761l.crashlytics(i5), c16761l.crashlytics(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    abstractC3031l.smaato(c16761l.crashlytics(i5), c16761l.crashlytics(i8), c16761l.crashlytics(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                    throw new C9190l(c12463l, c12463l2, c16761l, i3 - 1, exc);
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            abstractC3031l.yandex();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            abstractC3031l.billing(c16761l.crashlytics(i5), c12463l.admob(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                abstractC3031l.Signature(c16761l.crashlytics(i5), c12463l.admob(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new C9190l(c12463l, c12463l2, c16761l, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objAdmob = c12463l.admob(i4);
                            AbstractC9464l.purchase(2, objAdmob);
                            i4 += 2;
                            abstractC3031l.ads(c12463l.admob(i10), (Function2) objAdmob);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = abstractC3031l.f6544l;
                            if (obj instanceof InterfaceC0492l) {
                                InterfaceC0492l interfaceC0492l = (InterfaceC0492l) obj;
                                if (((C17893l) c15389l.billing).remoteconfig(interfaceC0492l)) {
                                    interfaceC0492l.loadAd();
                                }
                            }
                            c12463l2.yandex(obj);
                            abstractC3031l.isPro();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Throwable th) {
                    abstractC3031l.license();
                    throw th;
                }
            } catch (Exception e4) {
                exc2 = e4;
                i3 = i5;
                exc = exc2;
                throw new C9190l(c12463l, c12463l2, c16761l, i3 - 1, exc);
            }
        }
        if (i4 != c12463l.loadAd) {
            AbstractC2032l.yandex("Applier operation size mismatch");
        }
        c12463l.billing();
        c16761l.loadAd = 0;
        abstractC3031l.license();
    }

    @Override // defpackage.InterfaceC14280l
    public C12369l loadAd() {
        return ((InterfaceC15071l) this.f12718l).loadAd();
    }

    @Override // defpackage.InterfaceC2743l
    public List metrica(long j) {
        List list = (List) this.f12716l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f12715l;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C10619l c10619l = (C10619l) list.get(i);
                C17456l c17456l = c10619l.yandex;
                if (c17456l.purchase == -3.4028235E38f) {
                    arrayList2.add(c10619l);
                } else {
                    arrayList.add(c17456l);
                }
            }
        }
        Collections.sort(arrayList2, new C2351l(27));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C17456l c17456l2 = ((C10619l) arrayList2.get(i3)).yandex;
            arrayList.add(new C17456l(c17456l2.yandex, c17456l2.loadAd, c17456l2.crashlytics, c17456l2.amazon, (-1) - i3, 1, c17456l2.mopub, c17456l2.admob, c17456l2.subs, c17456l2.vip, c17456l2.metrica, c17456l2.isPro, c17456l2.firebase, c17456l2.smaato, c17456l2.remoteconfig, c17456l2.startapp, c17456l2.adcel, c17456l2.ads));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        ((C10970l) this.f12718l).purchase = null;
        ArrayList arrayList = (ArrayList) this.f12716l;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC15879l) this.f12715l).mo3790native((AbstractC4829l) it.next());
        }
        arrayList.clear();
    }

    public void premium(String str, int i, String str2) {
        ((HashMap) this.f12716l).put(str, str2);
        ((HashMap) this.f12715l).put(str2, str);
        ((HashMap) this.f12718l).put(str, Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC14665l pro() {
        return ((InterfaceC15071l) this.f12718l).pro();
    }

    @Override // defpackage.InterfaceC2743l
    public int purchase(long j) {
        long[] jArr = (long[]) this.f12718l;
        int iLoadAd = AbstractC15323l.loadAd(jArr, j, false);
        if (iLoadAd < jArr.length) {
            return iLoadAd;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC3770l
    public void remoteconfig(int i, int i2) {
        C16761l c16761l = (C16761l) this.f12716l;
        c16761l.yandex(2);
        c16761l.yandex(i);
        c16761l.yandex(i2);
    }

    public void signatures() {
        C13660l c13660l = (C13660l) this.f12716l;
        String str = (String) this.f12715l;
        List list = (List) c13660l.smaato(str);
        if (list != null) {
            list.remove((Function0) this.f12718l);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c13660l.vip(str, list);
    }

    @Override // defpackage.InterfaceC3770l
    public void smaato(int i, int i2, int i3) {
        C16761l c16761l = (C16761l) this.f12716l;
        c16761l.yandex(3);
        c16761l.yandex(i);
        c16761l.yandex(i2);
        c16761l.yandex(i3);
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC9354l startapp() {
        return ((InterfaceC15071l) this.f12718l).startapp();
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC16746l subs() {
        return ((InterfaceC15071l) this.f12718l).subs();
    }

    @Override // defpackage.InterfaceC2743l
    public int subscription() {
        return ((long[]) this.f12718l).length;
    }

    @Override // defpackage.InterfaceC14314l
    public InterfaceC4190l tapsense(InterfaceC13380l interfaceC13380l) {
        C0361l c0361l = (C0361l) this.f12716l;
        byte[] bArr = (byte[]) this.f12718l;
        byte[] bArr2 = (byte[]) this.f12715l;
        C7546l c7546l = new C7546l();
        Hashtable hashtable = AbstractC18559l.yandex;
        String algorithmName = c0361l.getAlgorithmName();
        if (256 > ((Integer) AbstractC18559l.yandex.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue()) {
            C8339l.metrica("Requested security strength is not supported by the derivation function");
            return null;
        }
        if (interfaceC13380l.entropySize() < 256) {
            C8339l.metrica("Not enough entropy for security strength required");
            return null;
        }
        c7546l.f15546l = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c7546l.f15548l = interfaceC13380l;
        c7546l.f15550l = c0361l;
        byte[] entropy = interfaceC13380l.getEntropy();
        if (entropy.length < (PSKKeyManager.MAX_KEY_LENGTH_BYTES + 7) / 8) {
            C8339l.smaato("Insufficient entropy provided by entropy source");
            return null;
        }
        byte[] bArrAdmob = AbstractC14024l.admob(entropy, bArr2, bArr);
        int i = c0361l.f1426l;
        c7546l.f15545l = new byte[i];
        byte[] bArr3 = new byte[i];
        c7546l.f15549l = bArr3;
        Arrays.fill(bArr3, (byte) 1);
        c7546l.license((byte) 0, bArrAdmob);
        if (bArrAdmob != null) {
            c7546l.license((byte) 1, bArrAdmob);
        }
        c7546l.f15547l = 1L;
        return c7546l;
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC14665l vip() {
        return ((InterfaceC15071l) this.f12718l).vip();
    }

    @Override // defpackage.InterfaceC14280l
    public InterfaceC4539l yandex() {
        return ((InterfaceC15071l) this.f12718l).yandex();
    }

    @Override // defpackage.InterfaceC3770l
    public /* synthetic */ void license() {
    }

    public C5991l(InterfaceC17771l interfaceC17771l) {
        this.f12717l = 6;
        C8426l c8426l = C8426l.loadAd;
        this.f12716l = interfaceC17771l;
        this.f12715l = AbstractC1805l.loadAd(1);
        this.f12718l = AbstractC1805l.crashlytics(c8426l);
    }

    public C5991l(ArrayList arrayList) {
        this.f12717l = 12;
        this.f12716l = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f12715l = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C10619l c10619l = (C10619l) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f12715l;
            jArr[i2] = c10619l.loadAd;
            jArr[i2 + 1] = c10619l.crashlytics;
        }
        long[] jArr2 = (long[]) this.f12715l;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f12718l = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public /* synthetic */ C5991l(Object obj, Object obj2, Object obj3, int i) {
        this.f12717l = i;
        this.f12716l = obj;
        this.f12715l = obj2;
        this.f12718l = obj3;
    }

    public C5991l(C10970l c10970l, ArrayList arrayList, InterfaceC15879l interfaceC15879l) {
        this.f12717l = 0;
        this.f12718l = c10970l;
        this.f12716l = arrayList;
        this.f12715l = interfaceC15879l;
    }

    public C5991l(C14750l c14750l, Function3 function3) {
        this.f12717l = 5;
        this.f12716l = c14750l;
        this.f12715l = function3;
        this.f12718l = C3499l.f7387l;
    }

    public C5991l(Object obj) {
        this.f12717l = 1;
        this.f12716l = new C16761l();
        this.f12715l = new C12463l();
        this.f12718l = obj;
    }

    public C5991l(int i) {
        this.f12717l = 8;
        this.f12716l = i != 1 ? new C1579l(i) : null;
    }
}
