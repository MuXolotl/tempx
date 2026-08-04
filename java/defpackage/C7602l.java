package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؚۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7602l extends AbstractC7498l {
    public static final Object admob = new Object();
    public int amazon;
    public Object billing;
    public long crashlytics;
    public int mopub;
    public C7661l purchase;

    public C7602l(long j) {
        super(j);
        this.purchase = AbstractC4785l.yandex;
        this.billing = admob;
    }

    public final boolean amazon(C8610l c8610l, AbstractC18620l abstractC18620l) {
        boolean z;
        boolean z2;
        Object obj = AbstractC9620l.crashlytics;
        synchronized (obj) {
            z = true;
            z2 = (this.crashlytics == abstractC18620l.mopub() && this.amazon == abstractC18620l.admob()) ? false : true;
        }
        if (this.billing == admob || (z2 && this.mopub != purchase(c8610l, abstractC18620l))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.crashlytics = abstractC18620l.mopub();
            this.amazon = abstractC18620l.admob();
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l crashlytics(long j) {
        return new C7602l(j);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return new C7602l(AbstractC9620l.isPro().mopub());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #1 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:50:0x0118, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8, B:56:0x0137, B:60:0x0147), top: B:76:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0150 A[DONT_GENERATE, LOOP:5: B:62:0x014e->B:63:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [lؚۣؖ] */
    /* JADX WARN: Type inference failed for: r13v5, types: [lؚۚؗ] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, lؚۚؗ] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final int purchase(C8610l c8610l, AbstractC18620l abstractC18620l) {
        C7661l c7661l;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        ?? r25;
        Object[] objArr2;
        long j;
        long j2;
        int i3;
        ?? r26;
        ?? Subs;
        synchronized (AbstractC9620l.crashlytics) {
            c7661l = this.purchase;
        }
        int i4 = 7;
        if (c7661l.purchase == 0) {
            return 7;
        }
        C17893l c17893lPurchase = AbstractC8020l.purchase();
        Object[] objArr3 = c17893lPurchase.f34848l;
        int i5 = c17893lPurchase.f34846l;
        boolean z = false;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C8957l) objArr3[i6]).loadAd();
        }
        try {
            Object[] objArr4 = c7661l.loadAd;
            int[] iArr = c7661l.crashlytics;
            long[] jArr3 = c7661l.yandex;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i7 = 0;
                while (true) {
                    long j3 = jArr3[i7];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i4) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        i2 = i4;
                        ?? r3 = z;
                        while (r3 < i9) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i7 << 3) + r3;
                                j2 = j4;
                                InterfaceC2763l interfaceC2763l = (InterfaceC2763l) objArr4[r18];
                                int i10 = i8;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (interfaceC2763l instanceof C8610l) {
                                        C8610l c8610l2 = (C8610l) interfaceC2763l;
                                        Subs = c8610l2.admob((C7602l) AbstractC9620l.subs(c8610l2.f17761l, abstractC18620l), abstractC18620l, z, c8610l2.f17760l);
                                        C7661l c7661l2 = Subs.purchase;
                                        Object[] objArr5 = c7661l2.loadAd;
                                        long[] jArr4 = c7661l2.yandex;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i11 = 0;
                                            while (true) {
                                                long j5 = jArr4[i11];
                                                j = j3;
                                                int iIdentityHashCode = i;
                                                if ((((~j5) << i2) & j5 & j2) == j2) {
                                                    i = iIdentityHashCode;
                                                    if (i11 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i11++;
                                                    j3 = j;
                                                    i10 = 8;
                                                } else {
                                                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode = (iIdentityHashCode * 31) + System.identityHashCode((InterfaceC2763l) objArr5[(i11 << 3) + i13]);
                                                        }
                                                        j5 >>= i10;
                                                    }
                                                    if (i12 != i10) {
                                                        i = iIdentityHashCode;
                                                        break;
                                                    }
                                                    i = iIdentityHashCode;
                                                    if (i11 != length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    j3 = j;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr2 = objArr4;
                                        j = j3;
                                        Subs = AbstractC9620l.subs(interfaceC2763l.amazon(), abstractC18620l);
                                    }
                                    int iIdentityHashCode2 = ((i * 31) + System.identityHashCode(Subs)) * 31;
                                    long j6 = Subs.yandex;
                                    i = iIdentityHashCode2 + ((int) (j6 ^ (j6 >>> 32)));
                                    r25 = r26;
                                }
                                i3 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i3 = i8;
                            }
                            j3 = j >> i3;
                            i8 = i3;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i9 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i4;
                        objArr = objArr4;
                    }
                    if (i7 != length) {
                        i7++;
                        i4 = i2;
                        jArr3 = jArr;
                        objArr4 = objArr;
                        z = false;
                    } else {
                        i4 = i;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return i;
            }
            i = i4;
            Unit unit2 = Unit.INSTANCE;
            return i;
        } finally {
            Object[] objArr6 = c17893lPurchase.f34848l;
            int i14 = c17893lPurchase.f34846l;
            for (int i15 = 0; i15 < i14; i15++) {
                ((C8957l) objArr6[i15]).yandex();
            }
        }
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        C7602l c7602l = (C7602l) abstractC7498l;
        this.purchase = c7602l.purchase;
        this.billing = c7602l.billing;
        this.mopub = c7602l.mopub;
    }
}
