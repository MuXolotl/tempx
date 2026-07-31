package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَِۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11754l extends AbstractC10113l implements InterfaceC16113l, InterfaceC0827l, InterfaceC7448l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C13660l f23543l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Function1 f23544l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Function2 f23545l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C17971l f23546l = new C17971l(0, this);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C1080l f23547l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C17446l f23548l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f23549l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f23550l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Function1 f23551l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11303l f23552l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C13660l f23553l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f23554l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C13660l f23555l;

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public static void m3243l(AbstractC18026l abstractC18026l) {
        C7074l c7074l;
        AbstractC18026l abstractC18026l2 = abstractC18026l.f35271l;
        C3654l c3654l = abstractC18026l.f35281l;
        if (!AbstractC8576l.yandex(abstractC18026l2 != null ? abstractC18026l2.f35281l : null, c3654l)) {
            c3654l.f7667l.startapp.f29327l.billing();
            return;
        }
        InterfaceC2800l interfaceC2800lBilling = c3654l.f7667l.startapp.billing();
        if (interfaceC2800lBilling == null || (c7074l = ((C14903l) interfaceC2800lBilling).f29327l) == null) {
            return;
        }
        c7074l.billing();
    }

    @Override // defpackage.InterfaceC0827l
    public boolean ad() {
        return mo1002return().m1386native();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, f / loadAd());
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC0081l.crashlytics("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C8538l(i, i2, map, function1, function2, this, 1);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m3244goto(C3654l c3654l, C3384l c3384l) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        C13660l c13660l = this.f23555l;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (c13660l != null) {
            Object[] objArr = c13660l.crashlytics;
            long[] jArr3 = c13660l.yandex;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                C6295l c6295l = (C6295l) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = c6295l.loadAd;
                                long[] jArr4 = c6295l.yandex;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    C3654l c3654l2 = (C3654l) ((C4059l) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (c3654l2 != null) {
                                                        boolean zM1386native = c3654l2.m1386native();
                                                        i4 = i8;
                                                        if (zM1386native) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    c6295l.vip(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        C13660l c13660l2 = this.f23555l;
        if (c13660l2 != null) {
            long[] jArr5 = c13660l2.yandex;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((C6295l) c13660l2.crashlytics[i18]).admob()) {
                                    c13660l2.remoteconfig(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        C13660l c13660l3 = this.f23555l;
        if (c13660l3 == null) {
            c13660l3 = new C13660l();
            this.f23555l = c13660l3;
        }
        Object objMopub = c13660l3.mopub(c3384l);
        if (objMopub == null) {
            objMopub = new C6295l();
            c13660l3.vip(c3384l, objMopub);
        }
        ((C6295l) objMopub).smaato(new C4059l(c3654l));
    }

    /* JADX INFO: renamed from: implements */
    public abstract boolean mo991implements();

    /* JADX INFO: renamed from: import */
    public boolean mo992import() {
        return false;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return mo1114const(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final void m3245l(C6295l c6295l) {
        C3654l c3654l;
        Object[] objArr = c6295l.loadAd;
        long[] jArr = c6295l.yandex;
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
                    if ((255 & j) < 128 && (c3654l = (C3654l) ((C4059l) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo992import()) {
                            c3654l.m1378default(false);
                        } else {
                            c3654l.m1387new(false);
                        }
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

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    /* JADX INFO: renamed from: lؚۦ۠ */
    public abstract AbstractC11754l mo996l();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public final void m3246l() {
        C1080l c1080l = this.f23547l;
        if (c1080l != null) {
            int i = c1080l.f2972l;
            for (int i2 = 0; i2 < i; i2++) {
                ((C3384l[]) c1080l.f2970l)[i2] = null;
                ((float[]) c1080l.f2975l)[i2] = Float.NaN;
                ((byte[]) c1080l.f2976l)[i2] = 0;
            }
            c1080l.f2972l = 0;
        }
        C13660l c13660l = this.f23555l;
        if (c13660l == null) {
            return;
        }
        Object[] objArr = c13660l.crashlytics;
        long[] jArr = c13660l.yandex;
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
                        if ((255 & j) < 128) {
                            m3245l((C6295l) objArr[(i3 << 3) + i5]);
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
        c13660l.yandex();
    }

    /* JADX INFO: renamed from: lؚْٟ */
    public abstract void mo997l();

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final C11303l m3247l() {
        C11303l c11303l = this.f23552l;
        if (c11303l != null) {
            return c11303l;
        }
        C11303l c11303l2 = new C11303l(this);
        this.f23552l = c11303l2;
        return c11303l2;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    /* JADX INFO: renamed from: lَٖؕ */
    public abstract long mo999l();

    /* JADX INFO: renamed from: l٘ٚۥ */
    public abstract InterfaceC17792l mo1000l();

    @Override // defpackage.InterfaceC16113l
    public final void premium(boolean z) {
        AbstractC11754l abstractC11754lMo996l = mo996l();
        C3654l c3654lMo1002return = abstractC11754lMo996l != null ? abstractC11754lMo996l.mo1002return() : null;
        if (AbstractC8576l.yandex(c3654lMo1002return, mo1002return())) {
            this.f23550l = z;
            return;
        }
        if ((c3654lMo1002return != null ? c3654lMo1002return.f7667l.amazon : 0) != 3) {
            if ((c3654lMo1002return != null ? c3654lMo1002return.f7667l.amazon : 0) != 4) {
                return;
            }
        }
        this.f23550l = z;
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private */
    public final InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC0081l.crashlytics("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C10597l(i, i2, map, c3006l, c3956l, c16441l, this);
    }

    /* JADX INFO: renamed from: protected */
    public abstract AbstractC11754l mo1001protected();

    /* JADX INFO: renamed from: public */
    public abstract int mo2648public(AbstractC12914l abstractC12914l);

    /* JADX INFO: renamed from: return */
    public abstract C3654l mo1002return();

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m3248this(C17446l c17446l, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C3654l c3654l;
        boolean z2;
        int i;
        char c2;
        long j6;
        C6295l c6295l;
        C5227l snapshotObserver;
        C13660l c13660l = this.f23555l;
        C1080l c1080l = this.f23547l;
        if (c1080l == null) {
            c1080l = new C1080l(6);
            this.f23547l = c1080l;
        }
        C1080l c1080l2 = c1080l;
        InterfaceC11218l interfaceC11218l = mo1002return().f7680l;
        if (interfaceC11218l != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).getSnapshotObserver()) != null) {
            snapshotObserver.yandex.crashlytics(c17446l, C16274l.f31862l, new C16436l(this, j, j2, c17446l));
        }
        boolean zMo992import = mo992import();
        C6295l c6295l2 = (C6295l) c1080l2.f2974l;
        C6295l c6295l3 = (C6295l) c1080l2.f2971l;
        int i2 = c1080l2.f2972l;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c1080l2.f2976l)[i3];
            if (b == 3) {
                c6295l3.smaato(((C3384l[]) c1080l2.f2970l)[i3]);
            } else if (b != 0 && c13660l != null && (c6295l = (C6295l) c13660l.smaato(((C3384l[]) c1080l2.f2970l)[i3])) != null) {
                c6295l2.firebase(c6295l);
            }
        }
        int i4 = c1080l2.f2972l;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c1080l2.f2976l;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                C3384l[] c3384lArr = (C3384l[]) c1080l2.f2970l;
                c3384lArr[i6 - i5] = c3384lArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c1080l2.f2972l;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((C3384l[]) c1080l2.f2970l)[i8] = null;
        }
        c1080l2.f2972l -= i5;
        AbstractC11754l abstractC11754lMo996l = mo996l();
        Object[] objArr = c6295l3.loadAd;
        long[] jArr = c6295l3.yandex;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            C3384l c3384l = (C3384l) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC11754l abstractC11754l = abstractC11754lMo996l == null ? this : abstractC11754lMo996l;
                            i = i9;
                            AbstractC11754l abstractC11754l2 = abstractC11754l;
                            while (true) {
                                C1080l c1080l3 = abstractC11754l2.f23547l;
                                if (c1080l3 != null) {
                                    z2 = zMo992import;
                                    if (AbstractC8669l.subscription(c3384l, (C3384l[]) c1080l3.f2970l)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zMo992import;
                                AbstractC11754l abstractC11754lMo996l2 = abstractC11754l2.mo996l();
                                if (abstractC11754lMo996l2 == null) {
                                    break;
                                }
                                abstractC11754l2 = abstractC11754lMo996l2;
                                zMo992import = z2;
                            }
                            C13660l c13660l2 = abstractC11754l2.f23555l;
                            C6295l c6295l4 = c13660l2 != null ? (C6295l) c13660l2.smaato(c3384l) : null;
                            if (c6295l4 != null) {
                                abstractC11754l.m3245l(c6295l4);
                            }
                        } else {
                            z2 = zMo992import;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo992import = z2;
                    }
                    z = zMo992import;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo992import;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo992import = z;
                i9 = 8;
            }
        } else {
            z = zMo992import;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c6295l3.loadAd();
        Object[] objArr2 = c6295l2.loadAd;
        long[] jArr2 = c6295l2.yandex;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c3654l = (C3654l) ((C4059l) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c3654l.m1378default(false);
                            } else {
                                c3654l.m1387new(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c6295l2.loadAd();
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: throw */
    public final int mo884throw(AbstractC12914l abstractC12914l) {
        int iMo2648public;
        if (!mo991implements() || (iMo2648public = mo2648public(abstractC12914l)) == Integer.MIN_VALUE) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        boolean z = abstractC12914l instanceof C3580l;
        long j = this.f20593l;
        return iMo2648public + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m3249try(InterfaceC17792l interfaceC17792l) {
        long j;
        char c;
        long j2;
        long j3;
        C11303l c11303l;
        C13660l c13660l;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        C1080l c1080l;
        C13660l c13660l2;
        C6295l c6295l;
        C11303l c11303l2;
        long j4;
        if (this.f23549l) {
            return;
        }
        Function1 function1Mopub = interfaceC17792l.mopub();
        Function2 function2Billing = interfaceC17792l.billing();
        Function1 function1Amazon = interfaceC17792l.amazon();
        long jSmaato = 0;
        if (function2Billing == null) {
            long jIsPro = 9223372034707292159L;
            if (function1Mopub == null) {
                m3246l();
                this.f23544l = null;
                this.f23545l = null;
                this.f23551l = null;
                C11303l c11303l3 = this.f23552l;
                if (c11303l3 != null) {
                    c11303l3.f22796l = false;
                }
                if (c11303l3 != null) {
                    c11303l3.f22795l = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.f23545l = null;
            this.f23551l = null;
            boolean z2 = this.f23544l != function1Mopub;
            if (!z2 && m3247l().f22796l) {
                InterfaceC18212l interfaceC18212lMo1003while = mo1003while();
                jIsPro = AbstractC3383l.isPro(interfaceC18212lMo1003while.startapp(0L));
                jSmaato = interfaceC18212lMo1003while.smaato();
                z2 = (C5177l.loadAd(jIsPro, m3247l().f22795l) && C4999l.loadAd(jSmaato, m3247l().f22794l)) ? false : true;
            }
            if (z2) {
                C17446l c17446l = this.f23548l;
                if (c17446l != null) {
                    c17446l.f33994l = interfaceC17792l;
                } else {
                    c17446l = new C17446l(interfaceC17792l, this, null);
                    this.f23548l = c17446l;
                }
                m3248this(c17446l, jIsPro, jSmaato);
                this.f23544l = interfaceC17792l.mopub();
                return;
            }
            return;
        }
        if (function2Billing != this.f23545l || function1Amazon != this.f23551l) {
            this.f23545l = function2Billing;
            this.f23551l = function1Amazon;
            m3246l();
            return;
        }
        C13660l c13660l3 = this.f23543l;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (c13660l3 != null) {
            Object[] objArr3 = c13660l3.crashlytics;
            long[] jArr3 = c13660l3.yandex;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                c11303l2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                C11303l c11303l4 = (C11303l) objArr3[(i4 << 3) + i6];
                                if (c11303l4.f22796l) {
                                    c11303l2 = c11303l4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                c11303l2 = null;
            }
            c11303l = c11303l2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            c11303l = null;
        }
        if (c11303l == null) {
            return;
        }
        InterfaceC18212l interfaceC18212lMo1003while2 = mo1003while();
        long jIsPro2 = AbstractC3383l.isPro(interfaceC18212lMo1003while2.startapp(0L));
        long jSmaato2 = interfaceC18212lMo1003while2.smaato();
        if ((C5177l.loadAd(jIsPro2, c11303l.f22795l) && C4999l.loadAd(jSmaato2, c11303l.f22794l)) || (c13660l = this.f23543l) == null) {
            return;
        }
        Object[] objArr4 = c13660l.loadAd;
        Object[] objArr5 = c13660l.crashlytics;
        long[] jArr4 = c13660l.yandex;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        C11303l c11303l5 = (C11303l) objArr5[i11];
                        i2 = i3;
                        C3384l c3384l = (C3384l) obj;
                        jArr2 = jArr4;
                        if (c11303l5.f22796l) {
                            objArr2 = objArr4;
                            z = (C4999l.loadAd(c11303l5.f22794l, jSmaato2) && C5177l.loadAd(c11303l5.f22795l, jIsPro2)) ? false : true;
                            c11303l5.f22794l = jSmaato2;
                            c11303l5.f22795l = jIsPro2;
                            c11303l5.f22796l = false;
                            if (!z) {
                                c1080l = this.f23547l;
                                if (c1080l != null) {
                                    c1080l.m802throws(c3384l);
                                }
                                c13660l2 = this.f23555l;
                                if (c13660l2 != null) {
                                    c6295l = (C6295l) c13660l2.mopub(c3384l);
                                } else {
                                    c6295l = null;
                                }
                                if (c6295l != null) {
                                    m3245l(c6295l);
                                    c6295l.loadAd();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        c11303l5.f22794l = jSmaato2;
                        c11303l5.f22795l = jIsPro2;
                        c11303l5.f22796l = false;
                        if (!z) {
                            c1080l = this.f23547l;
                            if (c1080l != null) {
                                c1080l.m802throws(c3384l);
                            }
                            c13660l2 = this.f23555l;
                            if (c13660l2 != null) {
                                c6295l = (C6295l) c13660l2.mopub(c3384l);
                            } else {
                                c6295l = null;
                            }
                            if (c6295l != null) {
                                m3245l(c6295l);
                                c6295l.loadAd();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    /* JADX INFO: renamed from: while */
    public abstract InterfaceC18212l mo1003while();
}
