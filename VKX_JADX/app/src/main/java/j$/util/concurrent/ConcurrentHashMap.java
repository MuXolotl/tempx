package j$.util.concurrent;

import androidx.car.app.model.Alert;
import j$.util.Map;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, Map {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    public volatile transient l[] a;
    public volatile transient l[] b;
    private volatile transient long baseCount;
    public volatile transient c[] c;
    private volatile transient int cellsBusy;
    public transient i d;
    public transient s e;
    public transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        k = aVar.h(ConcurrentHashMap.class, "baseCount");
        l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.h(c.class, "value");
        n = aVar.a(l[].class);
        int iB = aVar.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public static final boolean b(l[] lVarArr, int i2, l lVar) {
        j$.sun.misc.a aVar = h;
        return j$.com.android.tools.r8.a.U(aVar.a, lVarArr, (((long) i2) << o) + ((long) n), lVar);
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final void h(l[] lVarArr, int i2, l lVar) {
        h.j(lVarArr, (((long) i2) << o) + ((long) n), lVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static final l k(l[] lVarArr, int i2) {
        return (l) h.f(lVarArr, (((long) i2) << o) + ((long) n));
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (l lVar3 = rVar; lVar3 != null; lVar3 = lVar3.d) {
            l lVar4 = new l(lVar3.a, lVar3.b, lVar3.c);
            if (lVar2 == null) {
                lVar = lVar4;
            } else {
                lVar2.d = lVar4;
            }
            lVar2 = lVar4;
        }
        return lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        long j3;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j5++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) (((double) (j5 / 0.75f)) + 1.0d);
        int iL = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        l[] lVarArr = new l[iL];
        int i2 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.d;
            int i3 = lVar.a;
            int i4 = i3 & i2;
            l lVarK = k(lVarArr, i4);
            boolean z = true;
            if (lVarK == null) {
                j3 = j2;
            } else {
                Object obj2 = lVar.b;
                if (lVarK.a < 0) {
                    if (((q) lVarK).e(i3, obj2, lVar.c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.d) {
                        if (lVar3.a == i3 && ((obj = lVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        lVar.d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.a, lVar4.b, lVar4.c, null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.d = rVar3;
                            }
                            lVar4 = lVar4.d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i4, new q(rVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                lVar.d = lVarK;
                h(lVarArr, i4, lVar);
            }
            lVar = lVar2;
            j2 = j3;
        }
        this.a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        n[] nVarArr = new n[16];
        for (int i6 = 0; i6 < 16; i6++) {
            nVarArr[i6] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.b);
                objectOutputStream.writeObject(lVarA.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x019d  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #2 {all -> 0x014d, blocks: (B:96:0x013e, B:98:0x0142), top: B:132:0x013e }] */
    public final void a(long j2, int i2) {
        boolean zD;
        u uVar;
        int i3;
        c[] cVarArr;
        j$.sun.misc.a aVar;
        long j3;
        long j4;
        boolean z;
        int length;
        boolean z2;
        int length2;
        int length3;
        c cVar;
        long j5;
        l[] lVarArr;
        int length4;
        l[] lVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        c[] cVarArr2 = concurrentHashMap.c;
        if (cVarArr2 == null) {
            j$.sun.misc.a aVar2 = h;
            long j6 = k;
            long j7 = concurrentHashMap.baseCount;
            j5 = j7 + j2;
            if (!aVar2.d(concurrentHashMap, j6, j7, j5)) {
                if (cVarArr2 != null || (length3 = cVarArr2.length - 1) < 0 || (cVar = cVarArr2[length3 & ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b]) == null) {
                    zD = true;
                } else {
                    j$.sun.misc.a aVar3 = h;
                    long j8 = m;
                    long j9 = cVar.value;
                    zD = aVar3.d(cVar, j8, j9, j9 + j2);
                    if (zD) {
                        if (i2 <= 1) {
                            return;
                        } else {
                            j5 = concurrentHashMap.j();
                        }
                    }
                }
                uVar = ThreadLocalRandom.f;
                i3 = ((ThreadLocalRandom) uVar.get()).b;
                if (i3 == 0) {
                    ThreadLocalRandom.d();
                    i3 = ((ThreadLocalRandom) uVar.get()).b;
                    zD = true;
                }
                boolean z3 = zD;
                int i4 = i3;
                while (true) {
                    boolean z4 = false;
                    while (true) {
                        cVarArr = concurrentHashMap.c;
                        if (cVarArr != null || (length = cVarArr.length) <= 0) {
                            if (concurrentHashMap.cellsBusy != 0 && concurrentHashMap.c == cVarArr && h.c(concurrentHashMap, l, 0, 1)) {
                                try {
                                    if (concurrentHashMap.c == cVarArr) {
                                        c[] cVarArr3 = new c[2];
                                        cVarArr3[i4 & 1] = new c(j2);
                                        concurrentHashMap.c = cVarArr3;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    concurrentHashMap.cellsBusy = 0;
                                    if (z) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    concurrentHashMap.cellsBusy = 0;
                                    throw th;
                                }
                            } else {
                                aVar = h;
                                j3 = k;
                                j4 = concurrentHashMap.baseCount;
                                if (aVar.d(concurrentHashMap, j3, j4, j4 + j2)) {
                                    return;
                                }
                            }
                            concurrentHashMap = this;
                        } else {
                            c cVar2 = cVarArr[(length - 1) & i4];
                            if (cVar2 != null) {
                                if (z3) {
                                    j$.sun.misc.a aVar4 = h;
                                    long j10 = m;
                                    long j11 = cVar2.value;
                                    if (!aVar4.d(cVar2, j10, j11, j11 + j2)) {
                                        if (concurrentHashMap.c == cVarArr && length < g) {
                                            if (!z4) {
                                                z4 = true;
                                            } else if (concurrentHashMap.cellsBusy == 0 && aVar4.c(concurrentHashMap, l, 0, 1)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z3 = true;
                                }
                                int i5 = (i4 << 13) ^ i4;
                                int i6 = i5 ^ (i5 >>> 17);
                                int i7 = i6 ^ (i6 << 5);
                                ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i7;
                                i4 = i7;
                                concurrentHashMap = this;
                            } else if (concurrentHashMap.cellsBusy == 0) {
                                c cVar3 = new c(j2);
                                if (concurrentHashMap.cellsBusy == 0 && h.c(concurrentHashMap, l, 0, 1)) {
                                    try {
                                        c[] cVarArr4 = concurrentHashMap.c;
                                        if (cVarArr4 == null || (length2 = cVarArr4.length) <= 0) {
                                            z2 = false;
                                        } else {
                                            int i8 = (length2 - 1) & i4;
                                            if (cVarArr4[i8] == null) {
                                                cVarArr4[i8] = cVar3;
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                        concurrentHashMap.cellsBusy = 0;
                                        if (z2) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        concurrentHashMap.cellsBusy = 0;
                                        throw th2;
                                    }
                                }
                            }
                            z4 = false;
                            int i9 = (i4 << 13) ^ i4;
                            int i10 = i9 ^ (i9 >>> 17);
                            int i11 = i10 ^ (i10 << 5);
                            ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i11;
                            i4 = i11;
                            concurrentHashMap = this;
                        }
                    }
                    try {
                        if (concurrentHashMap.c == cVarArr) {
                            concurrentHashMap.c = (c[]) Arrays.copyOf(cVarArr, length << 1);
                        }
                        concurrentHashMap.cellsBusy = 0;
                    } catch (Throwable th3) {
                        concurrentHashMap.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        } else {
            if (cVarArr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            uVar = ThreadLocalRandom.f;
            i3 = ((ThreadLocalRandom) uVar.get()).b;
            if (i3 == 0) {
                ThreadLocalRandom.d();
                i3 = ((ThreadLocalRandom) uVar.get()).b;
                zD = true;
            }
            boolean z5 = zD;
            int i12 = i3;
            while (true) {
                boolean z6 = false;
                while (true) {
                    cVarArr = concurrentHashMap.c;
                    if (cVarArr != null) {
                    }
                    if (concurrentHashMap.cellsBusy != 0) {
                        aVar = h;
                        j3 = k;
                        j4 = concurrentHashMap.baseCount;
                        if (aVar.d(concurrentHashMap, j3, j4, j4 + j2)) {
                            return;
                        }
                    } else {
                        aVar = h;
                        j3 = k;
                        j4 = concurrentHashMap.baseCount;
                        if (aVar.d(concurrentHashMap, j3, j4, j4 + j2)) {
                            return;
                        }
                    }
                    concurrentHashMap = this;
                }
                if (concurrentHashMap.c == cVarArr) {
                    concurrentHashMap.c = (c[]) Arrays.copyOf(cVarArr, length << 1);
                }
                concurrentHashMap.cellsBusy = 0;
            }
        }
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i13 = concurrentHashMap.sizeCtl;
            if (j5 < i13 || (lVarArr = concurrentHashMap.a) == null || (length4 = lVarArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i13 < 0) {
                if ((i13 >>> 16) != iNumberOfLeadingZeros || i13 == iNumberOfLeadingZeros + 1 || i13 == iNumberOfLeadingZeros + 65535 || (lVarArr2 = concurrentHashMap.b) == null || concurrentHashMap.transferIndex <= 0) {
                    return;
                }
                if (h.c(concurrentHashMap, i, i13, i13 + 1)) {
                    concurrentHashMap.m(lVarArr, lVarArr2);
                }
            } else if (h.c(concurrentHashMap, i, i13, (iNumberOfLeadingZeros << 16) + 2)) {
                concurrentHashMap.m(lVarArr, null);
            }
            j5 = concurrentHashMap.j();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l lVarK;
        l lVar;
        l[] lVarArrD = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                if (lVarArrD == null || i2 >= lVarArrD.length) {
                    break loop0;
                }
                lVarK = k(lVarArrD, i2);
                if (lVarK == null) {
                    i2++;
                } else {
                    int i3 = lVarK.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i2) == lVarK) {
                                if (i3 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof q ? ((q) lVarK).f : null;
                                }
                                while (lVar != null) {
                                    j2--;
                                    lVar = lVar.d;
                                }
                                h(lVarArrD, i2, null);
                                i2++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0044 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        r rVarB;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        l[] lVarArrE = this.a;
        int i3 = 0;
        Object objApply = null;
        int i4 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    l lVarK = k(lVarArrE, i5);
                    if (lVarK == null) {
                        break;
                    }
                    int i6 = lVarK.a;
                    if (i6 == -1) {
                        lVarArrE = d(lVarArrE, lVarK);
                    } else {
                        synchronized (lVarK) {
                            try {
                                if (k(lVarArrE, i5) == lVarK) {
                                    if (i6 >= 0) {
                                        i4 = 1;
                                        l lVar = null;
                                        l lVar2 = lVarK;
                                        while (true) {
                                            if (lVar2.a == i2 && ((obj2 = lVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, lVar2.c);
                                                if (objApply == null) {
                                                    l lVar3 = lVar2.d;
                                                    if (lVar != null) {
                                                        lVar.d = lVar3;
                                                    } else {
                                                        h(lVarArrE, i5, lVar3);
                                                    }
                                                    i3 = -1;
                                                    break;
                                                }
                                                lVar2.c = objApply;
                                                break;
                                            }
                                            l lVar4 = lVar2.d;
                                            if (lVar4 == null) {
                                                break;
                                            }
                                            i4++;
                                            lVar = lVar2;
                                            lVar2 = lVar4;
                                        }
                                    } else if (lVarK instanceof q) {
                                        q qVar = (q) lVarK;
                                        r rVar = qVar.e;
                                        if (rVar != null && (rVarB = rVar.b(i2, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, rVarB.c);
                                            if (objApply != null) {
                                                rVarB.c = objApply;
                                            } else {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i5, p(qVar.f));
                                                }
                                                i3 = -1;
                                            }
                                        }
                                        i4 = 2;
                                    } else if (lVarK instanceof m) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final l[] d(l[] lVarArr, l lVar) {
        int i2;
        if (!(lVar instanceof g)) {
            return this.a;
        }
        l[] lVarArr2 = ((g) lVar).e;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (lVarArr2 == this.b && this.a == lVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (h.c(concurrentHashMap, i, i2, i2 + 1)) {
                concurrentHashMap.m(lVarArr, lVarArr2);
                return lVarArr2;
            }
            this = concurrentHashMap;
        }
        return lVarArr2;
    }

    public final l[] e() {
        while (true) {
            l[] lVarArr = this.a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (h.c(concurrentHashMap, i, i2, -1)) {
                    try {
                        l[] lVarArr2 = concurrentHashMap.a;
                        if (lVarArr2 == null || lVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            l[] lVarArr3 = new l[i3];
                            concurrentHashMap.a = lVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            lVarArr2 = lVarArr3;
                        }
                        return lVarArr2;
                    } finally {
                        concurrentHashMap.sizeCtl = i2;
                    }
                }
                this = concurrentHashMap;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<java.util.Map.Entry<K, V>> entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = lVarA.c;
            Object obj3 = map.get(lVarA.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    public final Object f(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        l[] lVarArrE = this.a;
        int i3 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    l lVarK = k(lVarArrE, i4);
                    if (lVarK != null) {
                        int i5 = lVarK.a;
                        if (i5 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            if (z && i5 == i2 && (((obj5 = lVarK.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = lVarK.c) != null)) {
                                return obj6;
                            }
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i4) != lVarK) {
                                        obj3 = null;
                                    } else if (i5 >= 0) {
                                        i3 = 1;
                                        l lVar = lVarK;
                                        while (true) {
                                            if (lVar.a != i2 || ((obj4 = lVar.b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                l lVar2 = lVar.d;
                                                if (lVar2 == null) {
                                                    lVar.d = new l(i2, obj, obj2);
                                                    obj3 = null;
                                                } else {
                                                    i3++;
                                                    lVar = lVar2;
                                                }
                                            } else {
                                                obj3 = lVar.c;
                                                if (!z) {
                                                    lVar.c = obj2;
                                                }
                                            }
                                        }
                                    } else if (lVarK instanceof q) {
                                        r rVarE = ((q) lVarK).e(i2, obj, obj2);
                                        if (rVarE != null) {
                                            Object obj7 = rVarE.c;
                                            if (!z) {
                                                rVarE.c = obj2;
                                            }
                                            obj3 = obj7;
                                        } else {
                                            obj3 = null;
                                        }
                                        i3 = 2;
                                    } else {
                                        if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                        obj3 = null;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(lVarArrE, i4);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    } else if (b(lVarArrE, i4, new l(i2, obj, obj2))) {
                        break;
                    }
                }
            }
            lVarArrE = e();
        }
        a(1L, i3);
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.b, lVarA.c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae A[PHI: r7
  0x00ae: PHI (r7v3 boolean) = 
  (r7v1 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
 binds: [B:68:0x00ad, B:49:0x0075, B:51:0x007b, B:55:0x0083, B:57:0x0089, B:44:0x0067, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        l lVarK;
        boolean z;
        Object obj4;
        r rVarB;
        Object obj5;
        int i3 = i(obj.hashCode());
        l[] lVarArrD = this.a;
        while (lVarArrD != null && (length = lVarArrD.length) != 0 && (lVarK = k(lVarArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = lVarK.a;
            if (i4 == -1) {
                lVarArrD = d(lVarArrD, lVarK);
            } else {
                synchronized (lVarK) {
                    try {
                        if (k(lVarArrD, i2) == lVarK) {
                            z = true;
                            if (i4 >= 0) {
                                l lVar = null;
                                l lVar2 = lVarK;
                                while (true) {
                                    if (lVar2.a != i3 || ((obj5 = lVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        l lVar3 = lVar2.d;
                                        if (lVar3 != null) {
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                    } else {
                                        obj4 = lVar2.c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                lVar2.c = obj2;
                                            } else {
                                                l lVar4 = lVar2.d;
                                                if (lVar != null) {
                                                    lVar.d = lVar4;
                                                } else {
                                                    h(lVarArrD, i2, lVar4);
                                                }
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (lVarK instanceof q) {
                                q qVar = (q) lVarK;
                                r rVar = qVar.e;
                                if (rVar == null || (rVarB = rVar.b(i3, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = rVarB.c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        rVarB.c = obj2;
                                    } else if (qVar.f(rVarB)) {
                                        h(lVarArrD, i2, p(qVar.f));
                                    }
                                }
                            } else {
                                if (lVarK instanceof m) {
                                    throw new IllegalStateException("Recursive update");
                                }
                                z = false;
                                obj4 = null;
                            }
                        } else {
                            z = false;
                            obj4 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l lVarK;
        Object obj2;
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (lVarK = k(lVarArr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = lVarK.a;
        if (i3 == i2) {
            Object obj3 = lVarK.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) lVarK.c;
            }
        } else if (i3 < 0) {
            l lVarA = lVarK.a(i2, obj);
            if (lVarA != null) {
                return (V) lVarA.c;
            }
            return null;
        }
        while (true) {
            lVarK = lVarK.d;
            if (lVarK == null) {
                return null;
            }
            if (lVarK.a == i2 && ((obj2 = lVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return (V) lVarK.c;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        l[] lVarArr = this.a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.c.hashCode() ^ lVarA.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
        c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.d = iVar2;
        return iVar2;
    }

    public final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i2;
        int i3;
        int i4;
        boolean z;
        char c;
        int i5;
        int i6;
        l qVar;
        l qVar2;
        l lVar;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i7 = g;
        boolean z2 = true;
        int i8 = i7 > 1 ? (length >>> 3) / i7 : length;
        char c2 = 16;
        int i9 = i8 < 16 ? 16 : i8;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.b = lVarArr4;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Alert.DURATION_SHOW_INDEFINITELY;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar = new g(lVarArr3);
        boolean zB = true;
        int i10 = 0;
        int i11 = 0;
        boolean z3 = false;
        while (true) {
            if (zB) {
                int i12 = i10 - 1;
                if (i12 >= i11 || z3) {
                    i11 = i11;
                    i10 = i12;
                    zB = false;
                } else {
                    int i13 = concurrentHashMap.transferIndex;
                    if (i13 <= 0) {
                        i10 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        int i14 = i11;
                        long j2 = j;
                        if (i13 > i9) {
                            i3 = i13 - i9;
                            i2 = i12;
                        } else {
                            i2 = i12;
                            i3 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j2, i13, i3);
                        i11 = i3;
                        if (zC) {
                            i10 = i13 - 1;
                        } else {
                            i11 = i14;
                            i10 = i2;
                        }
                    }
                    zB = false;
                }
            } else {
                int i15 = i11;
                r rVar = null;
                l lVar2 = null;
                if (i10 < 0 || i10 >= length || (i6 = i10 + length) >= length2) {
                    i4 = length;
                    z = z2;
                    c = c2;
                    i5 = i9;
                    if (z3) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i4 << 1) - (i4 >>> 1);
                        return;
                    }
                    int i16 = i10;
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i17 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j3, i17, i17 - 1)) {
                        i10 = i16;
                    } else {
                        if (i17 - 2 != ((Integer.numberOfLeadingZeros(i4) | 32768) << 16)) {
                            return;
                        }
                        zB = z;
                        z3 = zB;
                        i10 = i4;
                    }
                } else {
                    l lVarK = k(lVarArr, i10);
                    if (lVarK == null) {
                        zB = b(lVarArr, i10, gVar);
                        i4 = length;
                        z = z2;
                        c = c2;
                        i5 = i9;
                    } else {
                        z = z2;
                        int i18 = lVarK.a;
                        if (i18 == -1) {
                            i4 = length;
                            c = c2;
                            i5 = i9;
                            zB = z;
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArr, i10) == lVarK) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            l lVar3 = lVarK.d;
                                            l lVar4 = lVarK;
                                            while (lVar3 != null) {
                                                char c3 = c2;
                                                int i20 = lVar3.a & length;
                                                if (i20 != i19) {
                                                    lVar4 = lVar3;
                                                    i19 = i20;
                                                }
                                                lVar3 = lVar3.d;
                                                c2 = c3;
                                            }
                                            c = c2;
                                            if (i19 == 0) {
                                                lVar = null;
                                                lVar2 = lVar4;
                                            } else {
                                                lVar = lVar4;
                                            }
                                            l lVar5 = lVarK;
                                            while (lVar5 != lVar4) {
                                                int i21 = lVar5.a;
                                                Object obj = lVar5.b;
                                                int i22 = length;
                                                Object obj2 = lVar5.c;
                                                if ((i21 & i22) == 0) {
                                                    lVar2 = new l(i21, obj, obj2, lVar2);
                                                } else {
                                                    lVar = new l(i21, obj, obj2, lVar);
                                                }
                                                lVar5 = lVar5.d;
                                                length = i22;
                                                i9 = i9;
                                            }
                                            i4 = length;
                                            i5 = i9;
                                            h(lVarArr3, i10, lVar2);
                                            h(lVarArr3, i6, lVar);
                                            h(lVarArr, i10, gVar);
                                        } else {
                                            i4 = length;
                                            c = c2;
                                            i5 = i9;
                                            if (lVarK instanceof q) {
                                                q qVar3 = (q) lVarK;
                                                r rVar2 = null;
                                                r rVar3 = null;
                                                l lVar6 = qVar3.f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                r rVar4 = null;
                                                while (lVar6 != null) {
                                                    q qVar4 = qVar3;
                                                    int i25 = lVar6.a;
                                                    r rVar5 = new r(i25, lVar6.b, lVar6.c, null, null);
                                                    if ((i25 & i4) == 0) {
                                                        rVar5.h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.d = rVar5;
                                                        }
                                                        i23++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.d = rVar5;
                                                        }
                                                        i24++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVar6 = lVar6.d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i23 <= 6) {
                                                    qVar = p(rVar);
                                                } else {
                                                    qVar = i24 != 0 ? new q(rVar) : qVar5;
                                                }
                                                if (i24 <= 6) {
                                                    qVar2 = p(rVar4);
                                                } else {
                                                    qVar2 = i23 != 0 ? new q(rVar4) : qVar5;
                                                }
                                                h(lVarArr3, i10, qVar);
                                                h(lVarArr3, i6, qVar2);
                                                h(lVarArr, i10, gVar);
                                            }
                                        }
                                        zB = z;
                                    } else {
                                        i4 = length;
                                        c = c2;
                                        i5 = i9;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i11 = i15;
                z2 = z;
                c2 = c;
                length = i4;
                i9 = i5;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        l[] lVarArrE = this.a;
        int i4 = 0;
        Object obj5 = null;
        int i5 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    l lVarK = k(lVarArrE, i6);
                    i2 = 1;
                    if (lVarK != null) {
                        int i7 = lVarK.a;
                        if (i7 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i6) == lVarK) {
                                        if (i7 >= 0) {
                                            l lVar = null;
                                            l lVar2 = lVarK;
                                            i4 = 1;
                                            while (true) {
                                                if (lVar2.a == i3 && ((obj3 = lVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    Object objApply = biFunction.apply(lVar2.c, obj4);
                                                    if (objApply == null) {
                                                        l lVar3 = lVar2.d;
                                                        if (lVar != null) {
                                                            lVar.d = lVar3;
                                                        } else {
                                                            h(lVarArrE, i6, lVar3);
                                                        }
                                                        obj5 = objApply;
                                                        i5 = -1;
                                                        break;
                                                    }
                                                    lVar2.c = objApply;
                                                    obj5 = objApply;
                                                    break;
                                                }
                                                l lVar4 = lVar2.d;
                                                if (lVar4 == null) {
                                                    lVar2.d = new l(i3, obj, obj4);
                                                    obj5 = obj4;
                                                    i5 = 1;
                                                    break;
                                                }
                                                i4++;
                                                lVar = lVar2;
                                                lVar2 = lVar4;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.e;
                                            r rVarB = rVar == null ? null : rVar.b(i3, obj, null);
                                            Object objApply2 = rVarB == null ? obj4 : biFunction.apply(rVarB.c, obj4);
                                            if (objApply2 != null) {
                                                if (rVarB != null) {
                                                    rVarB.c = objApply2;
                                                } else {
                                                    qVar.e(i3, obj, objApply2);
                                                    i5 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i6, p(qVar.f));
                                                }
                                                i5 = -1;
                                            }
                                            i4 = 2;
                                            obj5 = objApply2;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(lVarArrE, i6);
                                }
                                i2 = i5;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (b(lVarArrE, i6, new l(i3, obj, obj4))) {
                        break;
                    }
                }
            }
            lVarArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj4;
    }

    public final void n(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i2);
        if (lVarK == null || lVarK.a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i2) == lVarK) {
                    r rVar = null;
                    l lVar = lVarK;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.a, lVar.b, lVar.c, null, null);
                        rVar3.h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.d = rVar3;
                        }
                        lVar = lVar.d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i2, new q(rVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i2) {
        ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            l[] lVarArr = this.a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > iL ? i3 : iL;
                if (h.c(concurrentHashMap, i, i3, -1)) {
                    try {
                        if (concurrentHashMap.a == lVarArr) {
                            concurrentHashMap.a = new l[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        concurrentHashMap.sizeCtl = i3;
                    } catch (Throwable th) {
                        concurrentHashMap.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.a) {
                    concurrentHashMap = this;
                    if (h.c(concurrentHashMap, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        concurrentHashMap.m(lVarArr, null);
                    }
                } else {
                    concurrentHashMap = this;
                }
            }
            this = concurrentHashMap;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        o(map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k2, V v, V v2) {
        if (k2 == null || v == null || v2 == null) {
            throw null;
        }
        return g(k2, v2, v) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.c;
            Object obj2 = lVarA.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.b;
                Object obj2 = lVarA.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap() {
    }
}
