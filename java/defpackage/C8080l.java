package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8080l {
    public C7661l crashlytics;
    public int firebase;
    public boolean isPro;
    public Object loadAd;
    public final Function1 yandex;
    public int amazon = -1;
    public final C13660l purchase = AbstractC9831l.amazon();
    public final C13660l billing = new C13660l();
    public final C6295l mopub = new C6295l();
    public final C17893l admob = new C17893l(0, new C8610l[16]);
    public final C8957l subs = new C8957l(1, this);
    public final C13660l smaato = AbstractC9831l.amazon();
    public final HashMap remoteconfig = new HashMap();

    public C8080l(Function1 function1) {
        this.yandex = function1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:2: B:16:0x0061->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[EDGE_INSN: B:48:0x00ab->B:30:0x00ab BREAK  A[LOOP:2: B:16:0x0061->B:28:0x009c], SYNTHETIC] */
    public final void amazon() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        C13660l c13660l = this.billing;
        long[] jArr3 = c13660l.yandex;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = c13660l.loadAd[i6];
                        j2 = j4;
                        C7661l c7661l = (C7661l) c13660l.crashlytics[i6];
                        boolean zAd = ((InterfaceC0827l) obj).ad();
                        if (zAd) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zAd;
                        } else {
                            Object[] objArr = c7661l.loadAd;
                            int[] iArr = c7661l.crashlytics;
                            long[] jArr4 = c7661l.yandex;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zAd;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zAd = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                crashlytics(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zAd = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zAd;
                            }
                        }
                        if (!z) {
                            c13660l.remoteconfig(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    public final void crashlytics(Object obj, Object obj2) {
        C13660l c13660l = this.purchase;
        AbstractC9831l.subs(c13660l, obj2, obj);
        if (!(obj2 instanceof C8610l) || c13660l.crashlytics(obj2)) {
            return;
        }
        AbstractC9831l.isPro(this.smaato, obj2);
        this.remoteconfig.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void loadAd(Object obj, int i, Object obj2, C7661l c7661l) {
        int i2;
        if (this.firebase > 0) {
            return;
        }
        int iCrashlytics = c7661l.crashlytics(obj);
        if (iCrashlytics < 0) {
            iCrashlytics = ~iCrashlytics;
            i2 = -1;
        } else {
            i2 = c7661l.crashlytics[iCrashlytics];
        }
        c7661l.loadAd[iCrashlytics] = obj;
        c7661l.crashlytics[iCrashlytics] = i;
        if ((obj instanceof C8610l) && i2 != i) {
            C7602l c7602lSubs = ((C8610l) obj).subs();
            this.remoteconfig.put(obj, c7602lSubs.billing);
            C7661l c7661l2 = c7602lSubs.purchase;
            C13660l c13660l = this.smaato;
            AbstractC9831l.isPro(c13660l, obj);
            Object[] objArr = c7661l2.loadAd;
            long[] jArr = c7661l2.yandex;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                InterfaceC2763l interfaceC2763l = (InterfaceC2763l) objArr[(i3 << 3) + i5];
                                if (interfaceC2763l instanceof AbstractC6998l) {
                                    ((AbstractC6998l) interfaceC2763l).purchase(2);
                                }
                                AbstractC9831l.loadAd(c13660l, interfaceC2763l, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof AbstractC6998l) {
                ((AbstractC6998l) obj).purchase(2);
            }
            AbstractC9831l.loadAd(this.purchase, obj, obj2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean yandex(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8080l.yandex(java.util.Set):boolean");
    }
}
