package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9620l {
    public static List admob;
    public static C8739l amazon;
    public static final C1577l billing;
    public static final C12633l firebase;
    public static final C18661l isPro;
    public static final C13698l mopub;
    public static long purchase;
    public static List subs;
    public static final C1698l yandex = new C1698l(14);
    public static final C4816l loadAd = new C4816l(6);
    public static final Object crashlytics = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    static {
        C8739l c8739l = C8739l.f17990l;
        amazon = c8739l;
        purchase = 2L;
        C1577l c1577l = new C1577l(4);
        c1577l.f3901l = new long[16];
        c1577l.f3900l = new int[16];
        int[] iArr = new int[16];
        char c = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c1577l.f3902l = iArr;
        billing = c1577l;
        C13698l c13698l = new C13698l(c, 23);
        c13698l.f26743l = new int[16];
        c13698l.f26746l = new C16960l[16];
        mopub = c13698l;
        C2580l c2580l = C2580l.f5619l;
        admob = c2580l;
        subs = c2580l;
        long j = purchase;
        purchase = 1 + j;
        C18661l c18661l = new C18661l(j, c8739l, null, new C17049l(10));
        amazon = amazon.firebase(c18661l.loadAd);
        isPro = c18661l;
        firebase = new C12633l(0);
    }

    public static final AbstractC7498l Signature(AbstractC7498l abstractC7498l, InterfaceC2763l interfaceC2763l) {
        AbstractC7498l abstractC7498lTapsense;
        AbstractC18620l abstractC18620lIsPro = isPro();
        Function1 function1Purchase = abstractC18620lIsPro.purchase();
        if (function1Purchase != null) {
            function1Purchase.invoke(interfaceC2763l);
        }
        AbstractC7498l abstractC7498lTapsense2 = tapsense(abstractC7498l, abstractC18620lIsPro.mopub(), abstractC18620lIsPro.amazon());
        if (abstractC7498lTapsense2 != null) {
            return abstractC7498lTapsense2;
        }
        synchronized (crashlytics) {
            AbstractC18620l abstractC18620lIsPro2 = isPro();
            abstractC7498lTapsense = tapsense(interfaceC2763l.amazon(), abstractC18620lIsPro2.mopub(), abstractC18620lIsPro2.amazon());
            if (abstractC7498lTapsense == null) {
                subscription();
                throw null;
            }
        }
        return abstractC7498lTapsense;
    }

    public static final AbstractC7498l ad(AbstractC7498l abstractC7498l, InterfaceC2763l interfaceC2763l, AbstractC18620l abstractC18620l) {
        AbstractC7498l abstractC7498lTapsense;
        AbstractC7498l abstractC7498lTapsense2;
        if (abstractC18620l.billing()) {
            abstractC18620l.vip(interfaceC2763l);
        }
        long jMopub = abstractC18620l.mopub();
        AbstractC7498l abstractC7498lTapsense3 = tapsense(abstractC7498l, jMopub, abstractC18620l.amazon());
        if (abstractC7498lTapsense3 == null) {
            synchronized (crashlytics) {
                AbstractC18620l abstractC18620lIsPro = isPro();
                abstractC7498lTapsense2 = tapsense(interfaceC2763l.amazon(), abstractC18620lIsPro.mopub(), abstractC18620lIsPro.amazon());
                if (abstractC7498lTapsense2 == null) {
                    subscription();
                    throw null;
                }
            }
            abstractC7498lTapsense3 = abstractC7498lTapsense2;
        }
        if (abstractC7498lTapsense3.yandex == abstractC18620l.mopub()) {
            return abstractC7498lTapsense3;
        }
        synchronized (crashlytics) {
            abstractC7498lTapsense = tapsense(interfaceC2763l.amazon(), jMopub, abstractC18620l.amazon());
            if (abstractC7498lTapsense == null) {
                subscription();
                throw null;
            }
            if (abstractC7498lTapsense.yandex != jMopub) {
                AbstractC7498l abstractC7498lRemoteconfig = remoteconfig(abstractC7498lTapsense, interfaceC2763l);
                abstractC7498lRemoteconfig.yandex(abstractC7498lTapsense);
                abstractC7498lRemoteconfig.yandex = abstractC18620l.mopub();
                abstractC7498lTapsense = abstractC7498lRemoteconfig;
            }
        }
        if (abstractC7498lTapsense3.yandex != 1) {
            abstractC18620l.vip(interfaceC2763l);
        }
        return abstractC7498lTapsense;
    }

    public static final boolean adcel(InterfaceC2763l interfaceC2763l) {
        AbstractC7498l abstractC7498l;
        long j = purchase;
        C1577l c1577l = billing;
        if (c1577l.f3898l > 0) {
            j = ((long[]) c1577l.f3901l)[0];
        }
        AbstractC7498l abstractC7498l2 = null;
        AbstractC7498l abstractC7498lAmazon = null;
        int i = 0;
        for (AbstractC7498l abstractC7498lAmazon2 = interfaceC2763l.amazon(); abstractC7498lAmazon2 != null; abstractC7498lAmazon2 = abstractC7498lAmazon2.loadAd) {
            long j2 = abstractC7498lAmazon2.yandex;
            if (j2 != 0) {
                if (AbstractC8576l.isPro(j2, j) >= 0) {
                    i++;
                } else if (abstractC7498l2 == null) {
                    i++;
                    abstractC7498l2 = abstractC7498lAmazon2;
                } else {
                    if (AbstractC8576l.isPro(abstractC7498lAmazon2.yandex, abstractC7498l2.yandex) < 0) {
                        abstractC7498l = abstractC7498l2;
                        abstractC7498l2 = abstractC7498lAmazon2;
                    } else {
                        abstractC7498l = abstractC7498lAmazon2;
                    }
                    if (abstractC7498lAmazon == null) {
                        abstractC7498lAmazon = interfaceC2763l.amazon();
                        AbstractC7498l abstractC7498l3 = abstractC7498lAmazon;
                        while (true) {
                            if (abstractC7498lAmazon == null) {
                                abstractC7498lAmazon = abstractC7498l3;
                                break;
                            }
                            if (AbstractC8576l.isPro(abstractC7498lAmazon.yandex, j) >= 0) {
                                break;
                            }
                            if (AbstractC8576l.isPro(abstractC7498l3.yandex, abstractC7498lAmazon.yandex) < 0) {
                                abstractC7498l3 = abstractC7498lAmazon;
                            }
                            abstractC7498lAmazon = abstractC7498lAmazon.loadAd;
                        }
                    }
                    abstractC7498l2.yandex = 0L;
                    abstractC7498l2.yandex(abstractC7498lAmazon);
                    abstractC7498l2 = abstractC7498l;
                }
            }
        }
        return i > 1;
    }

    public static final AbstractC7498l admob(AbstractC7498l abstractC7498l) {
        AbstractC7498l abstractC7498lTapsense;
        AbstractC18620l abstractC18620lIsPro = isPro();
        AbstractC7498l abstractC7498lTapsense2 = tapsense(abstractC7498l, abstractC18620lIsPro.mopub(), abstractC18620lIsPro.amazon());
        if (abstractC7498lTapsense2 != null) {
            return abstractC7498lTapsense2;
        }
        synchronized (crashlytics) {
            AbstractC18620l abstractC18620lIsPro2 = isPro();
            abstractC7498lTapsense = tapsense(abstractC7498l, abstractC18620lIsPro2.mopub(), abstractC18620lIsPro2.amazon());
        }
        if (abstractC7498lTapsense != null) {
            return abstractC7498lTapsense;
        }
        subscription();
        throw null;
    }

    public static final void ads(InterfaceC2763l interfaceC2763l) {
        if (adcel(interfaceC2763l)) {
            C13698l c13698l = mopub;
            int i = c13698l.f26744l;
            int iIdentityHashCode = System.identityHashCode(interfaceC2763l);
            int i2 = -1;
            if (i > 0) {
                int i3 = c13698l.f26744l - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c13698l.f26743l)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        C16960l c16960l = ((C16960l[]) c13698l.f26746l)[i5];
                        if (interfaceC2763l == (c16960l != null ? c16960l.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) c13698l.f26743l)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = c13698l.f26744l;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(c13698l.f26744l + 1);
                                        break;
                                    }
                                    if (((int[]) c13698l.f26743l)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    C16960l c16960l2 = ((C16960l[]) c13698l.f26746l)[i5];
                                    if ((c16960l2 != null ? c16960l2.get() : null) == interfaceC2763l) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                C16960l c16960l3 = ((C16960l[]) c13698l.f26746l)[i7];
                                if ((c16960l3 != null ? c16960l3.get() : null) == interfaceC2763l) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            C16960l[] c16960lArr = (C16960l[]) c13698l.f26746l;
            int length = c16960lArr.length;
            if (i == length) {
                int i10 = length * 2;
                C16960l[] c16960lArr2 = new C16960l[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(c16960lArr, i9, c16960lArr2, i11, i - i9);
                System.arraycopy((C16960l[]) c13698l.f26746l, 0, c16960lArr2, 0, i9);
                AbstractC8669l.ad(i11, i9, (int[]) c13698l.f26743l, iArr, i);
                AbstractC8669l.premium(0, i9, (int[]) c13698l.f26743l, iArr, 6);
                c13698l.f26746l = c16960lArr2;
                c13698l.f26743l = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c16960lArr, i9, c16960lArr, i12, i - i9);
                int[] iArr2 = (int[]) c13698l.f26743l;
                AbstractC8669l.ad(i12, i9, iArr2, iArr2, i);
            }
            ((C16960l[]) c13698l.f26746l)[i9] = new C16960l(interfaceC2763l);
            ((int[]) c13698l.f26743l)[i9] = iIdentityHashCode;
            c13698l.f26744l++;
        }
    }

    public static final C8739l amazon(C8739l c8739l, long j, long j2) {
        while (AbstractC8576l.isPro(j, j2) < 0) {
            c8739l = c8739l.firebase(j);
            j++;
        }
        return c8739l;
    }

    public static final void billing() {
        C13698l c13698l = mopub;
        int i = c13698l.f26744l;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C16960l c16960l = ((C16960l[]) c13698l.f26746l)[i2];
            Object obj = c16960l != null ? c16960l.get() : null;
            if (obj != null && adcel((InterfaceC2763l) obj)) {
                if (i3 != i2) {
                    ((C16960l[]) c13698l.f26746l)[i3] = c16960l;
                    int[] iArr = (int[]) c13698l.f26743l;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((C16960l[]) c13698l.f26746l)[i4] = null;
            ((int[]) c13698l.f26743l)[i4] = 0;
        }
        if (i3 != i) {
            c13698l.f26744l = i3;
        }
    }

    public static final void crashlytics(AbstractC18620l abstractC18620l) {
        Long lValueOf;
        if (amazon.mopub(abstractC18620l.mopub())) {
            return;
        }
        long jMopub = abstractC18620l.mopub();
        boolean z = abstractC18620l.crashlytics;
        C1852l c1852l = abstractC18620l instanceof C1852l ? (C1852l) abstractC18620l : null;
        Object objValueOf = c1852l != null ? Boolean.valueOf(c1852l.remoteconfig) : "read-only";
        synchronized (crashlytics) {
            C1577l c1577l = billing;
            lValueOf = Long.valueOf(c1577l.f3898l > 0 ? ((long[]) c1577l.f3901l)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jMopub + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final Function1 firebase(Function1 function1, Function1 function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C12342l(function1, function2, 2);
    }

    public static final AbstractC18620l isPro() {
        AbstractC18620l abstractC18620l = (AbstractC18620l) loadAd.get();
        return abstractC18620l == null ? isPro : abstractC18620l;
    }

    public static final void license(int i) {
        C1577l c1577l = billing;
        int i2 = ((int[]) c1577l.f3902l)[i];
        c1577l.metrica(i2, c1577l.f3898l - 1);
        c1577l.f3898l--;
        long[] jArr = (long[]) c1577l.f3901l;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC8576l.isPro(jArr[i4], j) <= 0) {
                break;
            }
            c1577l.metrica(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c1577l.f3901l;
        int i5 = c1577l.f3898l >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c1577l.f3898l && AbstractC8576l.isPro(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC8576l.isPro(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c1577l.metrica(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC8576l.isPro(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c1577l.metrica(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c1577l.f3902l)[i] = c1577l.f3897l;
        c1577l.f3897l = i;
    }

    public static final HashMap loadAd(long j, C1852l c1852l, C8739l c8739l) {
        long[] jArr;
        C8739l c8739l2;
        long[] jArr2;
        int i;
        int i2;
        AbstractC7498l abstractC7498lTapsense;
        C6295l c6295lAd = c1852l.ad();
        if (c6295lAd != null) {
            long jMopub = c1852l.mopub();
            C8739l c8739lAdmob = c1852l.amazon().firebase(jMopub).admob(c1852l.isPro);
            Object[] objArr = c6295lAd.loadAd;
            long[] jArr3 = c6295lAd.yandex;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                InterfaceC2763l interfaceC2763l = (InterfaceC2763l) objArr[(i3 << 3) + i6];
                                AbstractC7498l abstractC7498lAmazon = interfaceC2763l.amazon();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC7498l abstractC7498lTapsense2 = tapsense(abstractC7498lAmazon, j, c8739l);
                                if (abstractC7498lTapsense2 != null && (abstractC7498lTapsense = tapsense(abstractC7498lAmazon, jMopub, c8739lAdmob)) != null && !abstractC7498lTapsense2.equals(abstractC7498lTapsense)) {
                                    AbstractC7498l abstractC7498lTapsense3 = tapsense(abstractC7498lAmazon, jMopub, c1852l.amazon());
                                    if (abstractC7498lTapsense3 == null) {
                                        subscription();
                                        throw null;
                                    }
                                    AbstractC7498l abstractC7498lBilling = interfaceC2763l.billing(abstractC7498lTapsense, abstractC7498lTapsense2, abstractC7498lTapsense3);
                                    if (abstractC7498lBilling == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC7498lTapsense2, abstractC7498lBilling);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c8739lAdmob = c8739lAdmob;
                        }
                        jArr = jArr3;
                        c8739l2 = c8739lAdmob;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c8739l2 = c8739lAdmob;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c8739lAdmob = c8739l2;
                }
            }
        }
        return null;
    }

    public static final void metrica(AbstractC18620l abstractC18620l, InterfaceC2763l interfaceC2763l) {
        abstractC18620l.tapsense(abstractC18620l.admob() + 1);
        Function1 function1Subs = abstractC18620l.subs();
        if (function1Subs != null) {
            function1Subs.invoke(interfaceC2763l);
        }
    }

    public static final AbstractC18620l mopub(AbstractC18620l abstractC18620l, Function1 function1, boolean z) {
        boolean z2 = abstractC18620l instanceof C1852l;
        if (z2 || abstractC18620l == null) {
            return new C15720l(z2 ? (C1852l) abstractC18620l : null, function1, null, false, z);
        }
        return new C5429l(abstractC18620l, function1, false, z);
    }

    public static final Object pro(C18661l c18661l, Function1 function1) {
        long j = c18661l.loadAd;
        Object objInvoke = function1.invoke(amazon.billing(j));
        long j2 = purchase;
        purchase = 1 + j2;
        C8739l c8739lBilling = amazon.billing(j);
        amazon = c8739lBilling;
        c18661l.loadAd = j2;
        c18661l.yandex = c8739lBilling;
        c18661l.mopub = 0;
        c18661l.admob = null;
        c18661l.metrica();
        amazon = amazon.firebase(j2);
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0086, LOOP:1: B:30:0x0056->B:42:0x0090, LOOP_END, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x0047, B:27:0x004c, B:30:0x0056, B:32:0x0066, B:34:0x0072, B:36:0x007b, B:39:0x0088, B:42:0x0090, B:43:0x0093), top: B:52:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:43:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:42:0x0090], SYNTHETIC] */
    public static final Object purchase(Function1 function1) {
        C6295l c6295l;
        Object objPro;
        C18661l c18661l = isPro;
        synchronized (crashlytics) {
            try {
                c6295l = c18661l.admob;
                if (c6295l != null) {
                    firebase.addAndGet(1);
                }
                objPro = pro(c18661l, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6295l != null) {
            try {
                List list = admob;
                C16927l c16927l = new C16927l(c6295l);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) list.get(i)).invoke(c16927l, c18661l);
                }
                firebase.addAndGet(-1);
            } catch (Throwable th2) {
                firebase.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (crashlytics) {
            try {
                billing();
                if (c6295l != null) {
                    Object[] objArr = c6295l.loadAd;
                    long[] jArr = c6295l.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i2 != length) {
                                    break;
                                    break;
                                }
                                i2++;
                            } else {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ads((InterfaceC2763l) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                                if (i2 != length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objPro;
    }

    public static final AbstractC7498l remoteconfig(AbstractC7498l abstractC7498l, InterfaceC2763l interfaceC2763l) {
        long j = purchase;
        C1577l c1577l = billing;
        if (c1577l.f3898l > 0) {
            j = ((long[]) c1577l.f3901l)[0];
        }
        long j2 = j - 1;
        AbstractC7498l abstractC7498l2 = null;
        AbstractC7498l abstractC7498l3 = null;
        for (AbstractC7498l abstractC7498lAmazon = interfaceC2763l.amazon(); abstractC7498lAmazon != null; abstractC7498lAmazon = abstractC7498lAmazon.loadAd) {
            long j3 = abstractC7498lAmazon.yandex;
            if (j3 != 0) {
                if (j3 != 0 && AbstractC8576l.isPro(j3, j2) <= 0 && !C8739l.f17990l.mopub(j3)) {
                    if (abstractC7498l3 != null) {
                        if (AbstractC8576l.isPro(abstractC7498lAmazon.yandex, abstractC7498l3.yandex) >= 0) {
                            abstractC7498l2 = abstractC7498l3;
                            break;
                        }
                        break;
                    }
                    abstractC7498l3 = abstractC7498lAmazon;
                }
            }
            abstractC7498l2 = abstractC7498lAmazon;
            break;
        }
        if (abstractC7498l2 != null) {
            abstractC7498l2.yandex = Long.MAX_VALUE;
            return abstractC7498l2;
        }
        AbstractC7498l abstractC7498lCrashlytics = abstractC7498l.crashlytics(Long.MAX_VALUE);
        abstractC7498lCrashlytics.loadAd = interfaceC2763l.amazon();
        interfaceC2763l.mopub(abstractC7498lCrashlytics);
        return abstractC7498lCrashlytics;
    }

    public static final Function1 smaato(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C12342l(function1, function2, 3);
    }

    public static final AbstractC7498l startapp(AbstractC7498l abstractC7498l, AbstractC6998l abstractC6998l, AbstractC18620l abstractC18620l, AbstractC7498l abstractC7498l2) {
        AbstractC7498l abstractC7498lRemoteconfig;
        if (abstractC18620l.billing()) {
            abstractC18620l.vip(abstractC6998l);
        }
        long jMopub = abstractC18620l.mopub();
        if (abstractC7498l2.yandex == jMopub) {
            return abstractC7498l2;
        }
        synchronized (crashlytics) {
            abstractC7498lRemoteconfig = remoteconfig(abstractC7498l, abstractC6998l);
        }
        abstractC7498lRemoteconfig.yandex = jMopub;
        if (abstractC7498l2.yandex != 1) {
            abstractC18620l.vip(abstractC6998l);
        }
        return abstractC7498lRemoteconfig;
    }

    public static final AbstractC7498l subs(AbstractC7498l abstractC7498l, AbstractC18620l abstractC18620l) {
        AbstractC7498l abstractC7498lTapsense;
        AbstractC7498l abstractC7498lTapsense2 = tapsense(abstractC7498l, abstractC18620l.mopub(), abstractC18620l.amazon());
        if (abstractC7498lTapsense2 != null) {
            return abstractC7498lTapsense2;
        }
        synchronized (crashlytics) {
            abstractC7498lTapsense = tapsense(abstractC7498l, abstractC18620l.mopub(), abstractC18620l.amazon());
        }
        if (abstractC7498lTapsense != null) {
            return abstractC7498lTapsense;
        }
        subscription();
        throw null;
    }

    public static final void subscription() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC7498l tapsense(AbstractC7498l abstractC7498l, long j, C8739l c8739l) {
        AbstractC7498l abstractC7498l2 = null;
        while (abstractC7498l != null) {
            long j2 = abstractC7498l.yandex;
            if (j2 != 0 && AbstractC8576l.isPro(j2, j) <= 0 && !c8739l.mopub(j2) && (abstractC7498l2 == null || AbstractC8576l.isPro(abstractC7498l2.yandex, abstractC7498l.yandex) < 0)) {
                abstractC7498l2 = abstractC7498l;
            }
            abstractC7498l = abstractC7498l.loadAd;
        }
        if (abstractC7498l2 != null) {
            return abstractC7498l2;
        }
        return null;
    }

    public static final AbstractC7498l vip(AbstractC7498l abstractC7498l, C8610l c8610l, AbstractC18620l abstractC18620l) {
        AbstractC7498l abstractC7498lRemoteconfig;
        synchronized (crashlytics) {
            abstractC7498lRemoteconfig = remoteconfig(abstractC7498l, c8610l);
            abstractC7498lRemoteconfig.yandex(abstractC7498l);
            abstractC7498lRemoteconfig.yandex = abstractC18620l.mopub();
        }
        return abstractC7498lRemoteconfig;
    }

    public static final void yandex() {
        purchase(yandex);
    }
}
