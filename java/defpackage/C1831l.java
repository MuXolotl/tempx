package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؓٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1831l {
    public int admob;
    public final C13440l amazon;
    public float billing;
    public final C4622l crashlytics;
    public int firebase;
    public int isPro;
    public final C16977l loadAd;
    public final C0554l metrica;
    public int mopub;
    public final C16977l purchase;
    public int remoteconfig;
    public boolean smaato;
    public int subs;
    public final C14541l vip;
    public final C5138l yandex;

    public C1831l(C5138l c5138l, C14541l c14541l, C4838l c4838l) {
        this.yandex = c5138l;
        C16977l c16977l = AbstractC6903l.yandex;
        this.loadAd = new C16977l();
        this.crashlytics = new C4622l();
        int i = AbstractC10498l.yandex;
        this.amazon = new C13440l();
        this.purchase = new C16977l();
        this.mopub = -1;
        this.admob = Alert.DURATION_SHOW_INDEFINITELY;
        this.subs = RecyclerView.UNDEFINED_DURATION;
        this.vip = c14541l;
        this.metrica = new C0554l(c4838l);
    }

    public final void admob() {
        AbstractC11880l.m3277interface(this.isPro, "prefetchWindowStartExtraSpace");
        AbstractC11880l.m3277interface(this.firebase, "prefetchWindowEndExtraSpace");
        AbstractC11880l.m3277interface(this.admob, "prefetchWindowStartIndex");
        AbstractC11880l.m3277interface(this.subs, "prefetchWindowEndIndex");
    }

    public final void amazon(C0554l c0554l, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.billing);
        if (!z) {
            if (!z2 || this.smaato) {
                this.isPro = i3 - i5;
                this.admob = i;
            } else {
                int iAds = AbstractC5573l.ads(Math.abs(f)) + this.isPro;
                int i8 = i3 - i5;
                if (iAds > i8) {
                    iAds = i8;
                }
                this.isPro = iAds;
            }
            while (this.isPro > 0 && (i6 = this.admob) > 0) {
                int iYandex = yandex(c0554l, this.admob - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iYandex == -1) {
                    return;
                }
                this.admob--;
                this.isPro -= iYandex;
            }
            return;
        }
        if (!z2 || this.smaato) {
            this.firebase = i3 - i4;
            this.subs = i2;
        } else {
            int iAds2 = AbstractC5573l.ads(Math.abs(f)) + this.firebase;
            int i9 = i3 - i4;
            if (iAds2 > i9) {
                iAds2 = i9;
            }
            this.firebase = iAds2;
        }
        while (this.firebase > 0) {
            int i10 = this.subs;
            c0554l.getClass();
            if (i10 == -1 || (i7 = this.subs) >= this.remoteconfig - 1) {
                return;
            }
            int iYandex2 = yandex(c0554l, this.subs + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iYandex2 == -1) {
                return;
            }
            this.subs++;
            this.firebase -= iYandex2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void billing(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        C4622l c4622l = this.crashlytics;
        c4622l.loadAd();
        C16977l c16977l = this.loadAd;
        int[] iArr2 = c16977l.loadAd;
        long[] jArr2 = c16977l.yandex;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            c4622l.yandex(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        C13440l c13440l = this.amazon;
        int[] iArr3 = c13440l.loadAd;
        long[] jArr3 = c13440l.yandex;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                c4622l.yandex(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        C16977l c16977l2 = this.purchase;
        int[] iArr4 = c16977l2.loadAd;
        long[] jArr4 = c16977l2.yandex;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            c4622l.yandex(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = c4622l.loadAd;
        long[] jArr5 = c4622l.yandex;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) c16977l.mopub(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((InterfaceC13921l) list.get(i19)).cancel();
                            }
                        }
                        int iCrashlytics = c13440l.crashlytics(i18);
                        if (iCrashlytics >= 0) {
                            c13440l.purchase--;
                            long[] jArr6 = c13440l.yandex;
                            int i20 = c13440l.amazon;
                            int i21 = iCrashlytics >> 3;
                            int i22 = (iCrashlytics & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iCrashlytics - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        c16977l2.mopub(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void crashlytics(C0554l c0554l, int i, int i2) {
        int i3;
        int i4;
        C16977l c16977l = this.purchase;
        C10461l c10461l = (C10461l) c16977l.loadAd(i);
        C15617l c15617l = C10461l.crashlytics;
        if (c10461l != null) {
            c10461l.loadAd = i2;
            c10461l.yandex = c15617l;
        } else {
            c10461l = new C10461l();
            c10461l.yandex = c15617l;
            c10461l.loadAd = i2;
        }
        c16977l.subs(i, c10461l);
        if (i > this.subs) {
            this.subs = i;
            this.firebase -= i2;
        } else if (i < this.admob) {
            this.admob = i;
            this.isPro -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.billing) <= 0.0f) {
            if (this.firebase > 0) {
                i3 = this.subs + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.billing) <= 0.0f || this.isPro <= 0) {
            i4 = -1;
        } else {
            i3 = this.admob - 1;
            i4 = i3;
        }
        if (i4 > 0) {
            c0554l.getClass();
            if (i4 != -1 && i4 < this.remoteconfig) {
                C14876l c14876l = new C14876l(this, c0554l, i5);
                C4685l c4685l = (C4685l) c0554l.f1957l;
                if (c4685l == null) {
                    c4685l = null;
                }
                long j = c4685l.Signature;
                C14541l c14541l = (C14541l) c0554l.f1956l;
                this.loadAd.subs(i4, Collections.singletonList((c14541l != null ? c14541l : null).yandex(i4, j, true, new C8854l(c14876l, c0554l, 19))));
            }
        }
        admob();
    }

    public final boolean loadAd() {
        return (this.admob == Integer.MAX_VALUE || this.subs == Integer.MIN_VALUE) ? false : true;
    }

    public final void mopub() {
        this.admob = Alert.DURATION_SHOW_INDEFINITELY;
        this.subs = RecyclerView.UNDEFINED_DURATION;
        this.isPro = 0;
        this.firebase = 0;
        this.smaato = false;
        this.amazon.yandex();
        this.purchase.crashlytics();
        C16977l c16977l = this.loadAd;
        long[] jArr = c16977l.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = c16977l.loadAd[i4];
                        List list = (List) c16977l.crashlytics[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((InterfaceC13921l) list.get(i6)).cancel();
                        }
                        c16977l.admob(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void purchase(float f, C4685l c4685l) {
        C1831l c1831l;
        int i;
        int i2;
        C0554l c0554l = this.metrica;
        c0554l.f1957l = c4685l;
        c0554l.f1956l = this.vip;
        float f2 = -f;
        admob();
        if (c0554l.m642synchronized()) {
            C4685l c4685l2 = (C4685l) c0554l.f1957l;
            if (c4685l2 == null) {
                c4685l2 = null;
            }
            AbstractC4447l.loadAd(c4685l2);
            C4685l c4685l3 = (C4685l) c0554l.f1957l;
            if (c4685l3 == null) {
                c4685l3 = null;
            }
            InterfaceC13490l interfaceC13490l = c4685l3.tapsense;
            this.remoteconfig = c0554l.m638private();
            int iM637package = c0554l.m637package();
            int iM640strictfp = c0554l.m640strictfp();
            int iM638private = c0554l.m638private();
            int iM636native = c0554l.m636native();
            int iM644volatile = c0554l.m644volatile();
            C16977l c16977l = this.purchase;
            if (f2 <= 0.0f) {
                this.isPro = 0 - iM636native;
                this.admob = iM637package;
                while (this.isPro > 0 && (i2 = this.admob) > 0 && c16977l.yandex(i2 - 1)) {
                    int i3 = ((C10461l) c16977l.loadAd(this.admob - 1)).loadAd;
                    this.admob--;
                    this.isPro -= i3;
                }
                billing(0, this.admob - 1);
            } else {
                this.firebase = 0 - iM644volatile;
                this.subs = iM640strictfp;
                while (this.firebase > 0 && (i = this.subs) < iM638private - 1 && c16977l.yandex(i + 1)) {
                    int i4 = ((C10461l) c16977l.loadAd(this.subs + 1)).loadAd;
                    this.subs++;
                    this.firebase -= i4;
                }
                billing(this.subs + 1, iM638private - 1);
            }
        }
        if (c0554l.m642synchronized()) {
            C4685l c4685l4 = (C4685l) c0554l.f1957l;
            if (c4685l4 == null) {
                c4685l4 = null;
            }
            AbstractC4447l.loadAd(c4685l4);
            C4685l c4685l5 = (C4685l) c0554l.f1957l;
            c1831l = this;
            c1831l.amazon(c0554l, c0554l.m637package(), c0554l.m640strictfp(), (c4685l5 != null ? c4685l5 : null).tapsense != null ? ((AbstractC13264l) this.yandex.f11181l).metrica : 0, c0554l.m644volatile(), c0554l.m636native(), f2, f2 <= 0.0f);
        } else {
            c1831l = this;
        }
        c1831l.billing = f2;
        c1831l.admob();
    }

    public final int yandex(C0554l c0554l, int i, boolean z) {
        List list;
        List list2;
        C16977l c16977l = this.purchase;
        if (c16977l.yandex(i)) {
            return ((C10461l) c16977l.loadAd(i)).loadAd;
        }
        C16977l c16977l2 = this.loadAd;
        int i2 = 0;
        if (c16977l2.yandex(i)) {
            if (!z || (list2 = (List) c16977l2.loadAd(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((InterfaceC13921l) list2.get(i2)).yandex();
                i2++;
            }
            return -1;
        }
        C14876l c14876l = new C14876l(this, c0554l, i2);
        C4685l c4685l = (C4685l) c0554l.f1957l;
        if (c4685l == null) {
            c4685l = null;
        }
        long j = c4685l.Signature;
        C14541l c14541l = (C14541l) c0554l.f1956l;
        c16977l2.subs(i, Collections.singletonList((c14541l != null ? c14541l : null).yandex(i, j, true, new C8854l(c14876l, c0554l, 19))));
        if (!z || (list = (List) c16977l2.loadAd(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((InterfaceC13921l) list.get(i2)).yandex();
            i2++;
        }
        return -1;
    }
}
