package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۨۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6931l implements InterfaceC12776l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C6956l f14523l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C13660l f14524l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13660l f14526l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C15389l f14527l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C16543l f14528l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C6295l f14529l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC14382l f14530l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Function2 f14531l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC3031l f14532l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC0306l f14533l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f14534l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C15492l f14535l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C13660l f14536l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f14537l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C11686l f14538l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C9552l f14540l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C6295l f14541l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2859l f14542l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C9552l f14543l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C13660l f14544l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C6931l f14545l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f14546l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AtomicReference f14525l = new AtomicReference(null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f14539l = new Object();

    public C6931l(AbstractC0306l abstractC0306l, AbstractC3031l abstractC3031l) {
        this.f14533l = abstractC0306l;
        this.f14532l = abstractC3031l;
        C6295l c6295l = new C6295l();
        C11686l c11686l = c6295l.purchase;
        if (c11686l == null) {
            c11686l = new C11686l(c6295l);
            c6295l.purchase = c11686l;
        }
        C11686l c11686l2 = c11686l;
        this.f14538l = c11686l2;
        C2859l c2859l = new C2859l();
        if (abstractC0306l.amazon()) {
            c2859l.f6227l = new C16977l();
        }
        if (abstractC0306l.billing()) {
            c2859l.billing();
        }
        this.f14542l = c2859l;
        this.f14526l = AbstractC9831l.amazon();
        this.f14529l = new C6295l();
        this.f14541l = new C6295l();
        this.f14536l = AbstractC9831l.amazon();
        C9552l c9552l = new C9552l();
        this.f14543l = c9552l;
        C9552l c9552l2 = new C9552l();
        this.f14540l = c9552l2;
        this.f14524l = AbstractC9831l.amazon();
        this.f14544l = AbstractC9831l.amazon();
        C16543l c16543l = new C16543l(7, abstractC0306l);
        this.f14528l = c16543l;
        this.f14527l = new C15389l();
        C6956l c6956l = new C6956l(abstractC3031l, abstractC0306l, AbstractC0736l.amazon(c2859l), c11686l2, c9552l, c9552l2, c16543l, this);
        abstractC0306l.startapp(c6956l);
        this.f14523l = c6956l;
    }

    public final void Signature(Object obj) {
        Object objMopub = this.f14526l.mopub(obj);
        if (objMopub == null) {
            return;
        }
        boolean z = objMopub instanceof C6295l;
        C13660l c13660l = this.f14524l;
        if (!z) {
            C4224l c4224l = (C4224l) objMopub;
            if (c4224l.loadAd(obj) == 4) {
                AbstractC9831l.loadAd(c13660l, obj, c4224l);
                return;
            }
            return;
        }
        C6295l c6295l = (C6295l) objMopub;
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
                    if ((255 & j) < 128) {
                        C4224l c4224l2 = (C4224l) objArr[(i << 3) + i3];
                        if (c4224l2.loadAd(obj) == 4) {
                            AbstractC9831l.loadAd(c13660l, obj, c4224l2);
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

    public final boolean ad() {
        synchronized (this.f14539l) {
            C15492l c15492l = this.f14535l;
            boolean z = false;
            if (c15492l != null && (c15492l.admob.get() != EnumC17373l.f33843l || c15492l.subs != AbstractC4071l.loadAd())) {
                AtomicReference atomicReference = c15492l.admob;
                EnumC17373l enumC17373l = EnumC17373l.f33845l;
                EnumC17373l enumC17373l2 = EnumC17373l.f33844l;
                while (!atomicReference.compareAndSet(enumC17373l, enumC17373l2) && atomicReference.get() == enumC17373l) {
                }
                ((C16761l) c15492l.smaato.f12716l).yandex(9);
                return false;
            }
            vip();
            try {
                C13660l c13660l = this.f14544l;
                this.f14544l = AbstractC9831l.amazon();
                try {
                    C6956l c6956l = this.f14523l;
                    InterfaceC14382l interfaceC14382l = this.f14530l;
                    C6323l c6323l = c6956l.purchase.yandex;
                    if (!c6323l.subs()) {
                        AbstractC2032l.yandex("Expected applyChanges() to have been called");
                    }
                    if (c13660l.purchase > 0 || !c6956l.subscription.isEmpty()) {
                        c6956l.f14593catch = interfaceC14382l;
                        try {
                            c6956l.vip(c13660l, null);
                            c6956l.f14593catch = null;
                            z = !c6323l.subs();
                        } catch (Throwable th) {
                            c6956l.f14593catch = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        metrica();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f14544l = c13660l;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f14538l.f23431l.admob()) {
                        C15389l c15389l = this.f14527l;
                        try {
                            c15389l.firebase(this.f14538l, this.f14523l.advert());
                            c15389l.amazon();
                        } finally {
                            c15389l.crashlytics();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    loadAd();
                    throw th4;
                }
            }
        }
    }

    public final void adcel() {
        String str;
        int i = this.f14546l;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            AbstractC5363l.loadAd(str);
        }
        if (this.f14535l == null) {
            return;
        }
        AbstractC5363l.loadAd("A pausable composition is in progress");
    }

    public final void admob() {
        synchronized (this.f14539l) {
            try {
                this.f14523l.license = null;
                if (!this.f14538l.f23431l.admob()) {
                    C15389l c15389l = this.f14527l;
                    try {
                        c15389l.firebase(this.f14538l, this.f14523l.advert());
                        c15389l.amazon();
                        c15389l.crashlytics();
                    } catch (Throwable th) {
                        c15389l.crashlytics();
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    if (!this.f14538l.f23431l.admob()) {
                        C15389l c15389l2 = this.f14527l;
                        try {
                            c15389l2.firebase(this.f14538l, this.f14523l.advert());
                            c15389l2.amazon();
                        } finally {
                            c15389l2.crashlytics();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    loadAd();
                    throw th3;
                }
            }
        }
    }

    public final void ads(ArrayList arrayList) {
        C11686l c11686l = this.f14538l;
        C6956l c6956l = this.f14523l;
        if (arrayList.size() > 0) {
            ((AbstractC11411l) ((C8195l) arrayList.get(0)).f17098l).getClass();
            throw null;
        }
        try {
            c6956l.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c6956l.signatures(arrayList);
                    c6956l.subs();
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                c6956l.yandex();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!c11686l.f23431l.admob()) {
                    C15389l c15389l = this.f14527l;
                    try {
                        c15389l.firebase(c11686l, c6956l.advert());
                        c15389l.amazon();
                    } finally {
                        c15389l.crashlytics();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                loadAd();
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void advert(C16927l c16927l) {
        Object obj;
        while (true) {
            Object obj2 = this.f14525l.get();
            if (obj2 == null || obj2.equals(AbstractC15185l.yandex)) {
                obj = c16927l;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c16927l};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C11983l.advert(this.f14525l, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c16927l;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f14525l;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f14539l) {
                            metrica();
                            Unit unit = Unit.INSTANCE;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x023c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x023e A[LOOP:6: B:96:0x01ea->B:113:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x024b A[EDGE_INSN: B:206:0x024b->B:115:0x024b BREAK  A[LOOP:6: B:96:0x01ea->B:113:0x023e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0196 A[EDGE_INSN: B:221:0x0196->B:77:0x0196 BREAK  A[LOOP:13: B:64:0x015a->B:75:0x018e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[LOOP:13: B:64:0x015a->B:75:0x018e, LOOP_END] */
    public final void amazon(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zCrashlytics;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean zAdmob;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        boolean z2 = set instanceof C16927l;
        C13660l c13660l = this.f14536l;
        Object obj = null;
        int i5 = 8;
        if (z2) {
            C6295l c6295l = ((C16927l) set).f33011l;
            Object[] objArr = c6295l.loadAd;
            long[] jArr8 = c6295l.yandex;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof C4224l) {
                                    ((C4224l) obj2).loadAd(obj);
                                    jArr7 = jArr8;
                                    j8 = j9;
                                    i3 = length;
                                } else {
                                    crashlytics(obj2, z);
                                    Object objMopub = c13660l.mopub(obj2);
                                    if (objMopub == null) {
                                        jArr7 = jArr8;
                                        j8 = j9;
                                        i3 = length;
                                    } else if (objMopub instanceof C6295l) {
                                        C6295l c6295l2 = (C6295l) objMopub;
                                        Object[] objArr2 = c6295l2.loadAd;
                                        long[] jArr9 = c6295l2.yandex;
                                        int length2 = jArr9.length - 2;
                                        if (length2 >= 0) {
                                            int i9 = i5;
                                            i3 = length;
                                            int i10 = 0;
                                            while (true) {
                                                long j10 = jArr9[i10];
                                                j8 = j9;
                                                long[] jArr10 = jArr9;
                                                if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                    int i12 = 0;
                                                    while (i12 < i11) {
                                                        if ((j10 & 255) < 128) {
                                                            crashlytics((C8610l) objArr2[(i10 << 3) + i12], z);
                                                        }
                                                        j10 >>= i9;
                                                        i12++;
                                                        jArr8 = jArr8;
                                                    }
                                                    jArr7 = jArr8;
                                                    if (i11 != i9) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                if (i10 == length2) {
                                                    break;
                                                }
                                                i10++;
                                                jArr9 = jArr10;
                                                j9 = j8;
                                                jArr8 = jArr7;
                                                i9 = 8;
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j8 = j9;
                                            i3 = length;
                                        }
                                    } else {
                                        jArr7 = jArr8;
                                        j8 = j9;
                                        i3 = length;
                                        crashlytics((C8610l) objMopub, z);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                                i4 = 8;
                            } else {
                                jArr7 = jArr8;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr8;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr8 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C4224l) {
                    ((C4224l) obj3).loadAd(null);
                } else {
                    crashlytics(obj3, z);
                    Object objMopub2 = c13660l.mopub(obj3);
                    if (objMopub2 != null) {
                        if (objMopub2 instanceof C6295l) {
                            C6295l c6295l3 = (C6295l) objMopub2;
                            Object[] objArr3 = c6295l3.loadAd;
                            long[] jArr11 = c6295l3.yandex;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr11[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length3) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                crashlytics((C8610l) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        } else if (i14 != length3) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        } else {
                            crashlytics((C8610l) objMopub2, z);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        C13660l c13660l2 = this.f14526l;
        C6295l c6295l4 = this.f14529l;
        if (z) {
            C6295l c6295l5 = this.f14541l;
            if (c6295l5.subs()) {
                long[] jArr12 = c13660l2.yandex;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = c13660l2.loadAd[i20];
                                    Object obj5 = c13660l2.crashlytics[i20];
                                    if (obj5 instanceof C6295l) {
                                        C6295l c6295l6 = (C6295l) obj5;
                                        Object[] objArr4 = c6295l6.loadAd;
                                        long[] jArr13 = c6295l6.yandex;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr5 = jArr12;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            C4224l c4224l = (C4224l) objArr4[i24];
                                                            if (c6295l5.crashlytics(c4224l) || c6295l4.crashlytics(c4224l)) {
                                                                c6295l6.vip(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 != length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                } else if (i21 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        zAdmob = c6295l6.admob();
                                    } else {
                                        jArr5 = jArr12;
                                        i = length4;
                                        j6 = j12;
                                        C4224l c4224l2 = (C4224l) obj5;
                                        zAdmob = c6295l5.crashlytics(c4224l2) || c6295l4.crashlytics(c4224l2);
                                    }
                                    if (zAdmob) {
                                        c13660l2.remoteconfig(i20);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr4;
                    }
                }
                c6295l5.loadAd();
                subs();
                return;
            }
        }
        if (c6295l4.subs()) {
            long[] jArr14 = c13660l2.yandex;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = c13660l2.loadAd[i29];
                                Object obj7 = c13660l2.crashlytics[i29];
                                if (obj7 instanceof C6295l) {
                                    C6295l c6295l7 = (C6295l) obj7;
                                    Object[] objArr5 = c6295l7.loadAd;
                                    long[] jArr15 = c6295l7.yandex;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr14;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (c6295l4.crashlytics((C4224l) objArr6[i33])) {
                                                            c6295l7.vip(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr14 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j4 = j14;
                                    }
                                    zCrashlytics = c6295l7.admob();
                                } else {
                                    jArr2 = jArr14;
                                    j4 = j14;
                                    zCrashlytics = c6295l4.crashlytics((C4224l) obj7);
                                }
                                if (zCrashlytics) {
                                    c13660l2.remoteconfig(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                }
            }
            subs();
            c6295l4.loadAd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x013c A[EDGE_INSN: B:164:0x013c->B:82:0x013c BREAK  A[LOOP:2: B:144:0x00ef->B:80:0x0132], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0132 A[Catch: all -> 0x0122, LOOP:2: B:144:0x00ef->B:80:0x0132, LOOP_END, TryCatch #3 {all -> 0x0122, blocks: (B:64:0x00ef, B:66:0x00fe, B:68:0x0108, B:70:0x010e, B:72:0x011e, B:76:0x0127, B:82:0x013c, B:90:0x015b, B:93:0x016e, B:80:0x0132, B:85:0x0146, B:99:0x018c, B:101:0x0198), top: B:144:0x00ef }] */
    public final void billing(C9552l c9552l) throws Throwable {
        InterfaceC3770l interfaceC3770l;
        C15389l c15389l;
        C15389l c15389l2;
        long[] jArr;
        int i;
        long[] jArr2;
        C15389l c15389l3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zAdmob;
        long j3;
        C9552l c9552l2 = this.f14540l;
        C6956l c6956l = this.f14523l;
        C13154l c13154lAdvert = c6956l.advert();
        C15389l c15389l4 = this.f14527l;
        c15389l4.firebase(this.f14538l, c13154lAdvert);
        try {
            if (c9552l.yandex.subs()) {
                try {
                    if (c9552l2.yandex.subs() && this.f14535l == null) {
                        c15389l4.amazon();
                    }
                    return;
                } finally {
                    c15389l4.crashlytics();
                }
            }
            C15492l c15492l = this.f14535l;
            if (c15492l == null || (interfaceC3770l = c15492l.smaato) == null) {
                interfaceC3770l = this.f14532l;
            }
            try {
                Trace.beginSection(interfaceC3770l.equals(c15492l != null ? c15492l.smaato : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C15492l c15492l2 = this.f14535l;
                    if (c15492l2 == null || (c15389l = c15492l2.firebase) == null) {
                        c15389l = c15389l4;
                    }
                    C2859l c2859l = this.f14542l;
                    C13154l c13154lAdvert2 = c6956l.advert();
                    C13006l c13006lAdmob = AbstractC0736l.amazon(c2859l).admob();
                    int i3 = 0;
                    try {
                        c9552l.crashlytics(interfaceC3770l, c13006lAdmob, c15389l, c13154lAdvert2);
                        Unit unit = Unit.INSTANCE;
                        c13006lAdmob.purchase(true);
                        interfaceC3770l.license();
                        Trace.endSection();
                        c15389l4.purchase();
                        c15389l4.billing();
                        if (this.f14537l) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f14537l = false;
                                C13660l c13660l = this.f14526l;
                                long[] jArr3 = c13660l.yandex;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = c13660l.loadAd[i8];
                                                    Object obj2 = c13660l.crashlytics[i8];
                                                    if (obj2 instanceof C6295l) {
                                                        C6295l c6295l = (C6295l) obj2;
                                                        Object[] objArr = c6295l.loadAd;
                                                        long[] jArr4 = c6295l.yandex;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c15389l3 = c15389l4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((C4224l) objArr[i13]).yandex()) {
                                                                                    c6295l.vip(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zAdmob = c6295l.admob();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c15389l3 = c15389l4;
                                                        j = j4;
                                                        zAdmob = !((C4224l) obj2).yandex();
                                                    }
                                                    if (zAdmob) {
                                                        c13660l.remoteconfig(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    c15389l3 = c15389l4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                c15389l4 = c15389l3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c15389l2 = c15389l4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c15389l2 = c15389l4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        c15389l4 = c15389l2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    c15389l2 = c15389l4;
                                }
                                subs();
                                Unit unit2 = Unit.INSTANCE;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c15389l2 = c15389l4;
                        }
                        try {
                            if (c9552l2.yandex.subs() && this.f14535l == null) {
                                c15389l2.amazon();
                            }
                            return;
                        } finally {
                            c15389l2.crashlytics();
                        }
                    } catch (Throwable th3) {
                        try {
                            c13006lAdmob.purchase(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c9552l2.yandex.subs() && this.f14535l == null) {
                c15389l4.amazon();
            }
            throw th;
        } finally {
            c15389l4.crashlytics();
        }
    }

    public final void crashlytics(Object obj, boolean z) {
        Object objMopub = this.f14526l.mopub(obj);
        if (objMopub == null) {
            return;
        }
        boolean z2 = objMopub instanceof C6295l;
        C6295l c6295l = this.f14529l;
        C6295l c6295l2 = this.f14541l;
        C13660l c13660l = this.f14524l;
        if (!z2) {
            C4224l c4224l = (C4224l) objMopub;
            if (AbstractC9831l.subs(c13660l, obj, c4224l) || c4224l.loadAd(obj) == 1) {
                return;
            }
            if (c4224l.mopub == null || z) {
                c6295l.yandex(c4224l);
                return;
            } else {
                c6295l2.yandex(c4224l);
                return;
            }
        }
        C6295l c6295l3 = (C6295l) objMopub;
        Object[] objArr = c6295l3.loadAd;
        long[] jArr = c6295l3.yandex;
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
                        C4224l c4224l2 = (C4224l) objArr[(i << 3) + i3];
                        if (!AbstractC9831l.subs(c13660l, obj, c4224l2) && c4224l2.loadAd(obj) != 1) {
                            if (c4224l2.mopub == null || z) {
                                c6295l.yandex(c4224l2);
                            } else {
                                c6295l2.yandex(c4224l2);
                            }
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

    public final void firebase(Function2 function2) {
        try {
            synchronized (this.f14539l) {
                vip();
                C13660l c13660l = this.f14544l;
                this.f14544l = AbstractC9831l.amazon();
                try {
                    C6956l c6956l = this.f14523l;
                    InterfaceC14382l interfaceC14382l = this.f14530l;
                    if (!c6956l.purchase.yandex.subs()) {
                        AbstractC2032l.yandex("Expected applyChanges() to have been called");
                    }
                    c6956l.f14593catch = interfaceC14382l;
                    try {
                        c6956l.vip(c13660l, function2);
                        c6956l.f14593catch = null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        c6956l.f14593catch = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f14544l = c13660l;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f14538l.f23431l.admob()) {
                    C15389l c15389l = this.f14527l;
                    try {
                        c15389l.firebase(this.f14538l, this.f14523l.advert());
                        c15389l.amazon();
                    } finally {
                        c15389l.crashlytics();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                loadAd();
                throw th4;
            }
        }
    }

    public final boolean isPro() {
        boolean z;
        synchronized (this.f14539l) {
            z = true;
            if (this.f14546l != 1) {
                z = false;
            }
            if (z) {
                this.f14546l = 0;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void isVip(Object obj) {
        C4224l c4224lPro;
        int i;
        boolean z;
        C6956l c6956l = this.f14523l;
        if (c6956l.signatures <= 0 && (c4224lPro = c6956l.pro()) != null) {
            int i2 = c4224lPro.loadAd | 1;
            c4224lPro.loadAd = i2;
            if ((i2 & 32) == 0) {
                C7661l c7661l = c4224lPro.billing;
                if (c7661l == null) {
                    c7661l = new C7661l();
                    c4224lPro.billing = c7661l;
                }
                int i3 = c4224lPro.purchase;
                int iCrashlytics = c7661l.crashlytics(obj);
                if (iCrashlytics < 0) {
                    iCrashlytics = ~iCrashlytics;
                    i = -1;
                } else {
                    i = c7661l.crashlytics[iCrashlytics];
                }
                c7661l.loadAd[iCrashlytics] = obj;
                c7661l.crashlytics[iCrashlytics] = i3;
                if (i == c4224lPro.purchase) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f14528l.metrica();
            if (z) {
                return;
            }
            if (obj instanceof AbstractC6998l) {
                ((AbstractC6998l) obj).purchase(1);
            }
            AbstractC9831l.loadAd(this.f14526l, obj, c4224lPro);
            if (obj instanceof C8610l) {
                C8610l c8610l = (C8610l) obj;
                C7602l c7602lSubs = c8610l.subs();
                C13660l c13660l = this.f14536l;
                AbstractC9831l.isPro(c13660l, obj);
                C7661l c7661l2 = c7602lSubs.purchase;
                Object[] objArr = c7661l2.loadAd;
                long[] jArr = c7661l2.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    InterfaceC2763l interfaceC2763l = (InterfaceC2763l) objArr[(i4 << 3) + i7];
                                    if (interfaceC2763l instanceof AbstractC6998l) {
                                        ((AbstractC6998l) interfaceC2763l).purchase(1);
                                    }
                                    AbstractC9831l.loadAd(c13660l, interfaceC2763l, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = c7602lSubs.billing;
                C13660l c13660l2 = c4224lPro.mopub;
                if (c13660l2 == null) {
                    c13660l2 = new C13660l();
                    c4224lPro.mopub = c13660l2;
                }
                c13660l2.vip(c8610l, obj2);
            }
        }
    }

    public final boolean license() {
        return this.f14546l == 3;
    }

    public final void loadAd() {
        this.f14525l.set(null);
        this.f14543l.yandex.mopub();
        this.f14540l.yandex.mopub();
        C11686l c11686l = this.f14538l;
        if (c11686l.f23431l.admob()) {
            return;
        }
        C15389l c15389l = this.f14527l;
        try {
            c15389l.firebase(c11686l, this.f14523l.advert());
            c15389l.amazon();
        } finally {
            c15389l.crashlytics();
        }
    }

    public final void metrica() {
        AtomicReference atomicReference = this.f14525l;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC8576l.yandex(andSet, AbstractC15185l.yandex)) {
            return;
        }
        if (andSet instanceof Set) {
            amazon((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                amazon(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f14535l == null) {
                AbstractC2032l.yandex("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC2032l.loadAd("corrupt pendingModifications drain: " + atomicReference);
            C17132l.firebase();
        }
    }

    public final void mopub() {
        synchronized (this.f14539l) {
            try {
                C9552l c9552l = this.f14540l;
                c9552l.getClass();
                if (!c9552l.yandex.subs()) {
                    billing(this.f14540l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f14538l.f23431l.admob()) {
                        C15389l c15389l = this.f14527l;
                        try {
                            c15389l.firebase(this.f14538l, this.f14523l.advert());
                            c15389l.amazon();
                        } finally {
                            c15389l.crashlytics();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    loadAd();
                    throw th2;
                }
            }
        }
    }

    public final void premium(Function2 function2) {
        boolean zIsPro = isPro();
        adcel();
        AbstractC0306l abstractC0306l = this.f14533l;
        if (!zIsPro) {
            this.f14531l = function2;
            abstractC0306l.yandex(this, function2);
            return;
        }
        C6956l c6956l = this.f14523l;
        c6956l.isVip = 0;
        c6956l.advert = true;
        this.f14531l = function2;
        abstractC0306l.yandex(this, function2);
        if (c6956l.f14606throws || c6956l.isVip != 0) {
            AbstractC5363l.yandex("Cannot disable reuse from root if it was caused by other groups");
        }
        c6956l.isVip = -1;
        c6956l.advert = false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean pro(Set set) {
        boolean z = set instanceof C16927l;
        C13660l c13660l = this.f14536l;
        C13660l c13660l2 = this.f14526l;
        if (z) {
            C6295l c6295l = ((C16927l) set).f33011l;
            Object[] objArr = c6295l.loadAd;
            long[] jArr = c6295l.yandex;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (c13660l2.crashlytics(obj) || c13660l.crashlytics(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (c13660l2.crashlytics(obj2) || c13660l.crashlytics(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void purchase() {
        synchronized (this.f14539l) {
            try {
                billing(this.f14543l);
                metrica();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f14538l.f23431l.admob()) {
                        C15389l c15389l = this.f14527l;
                        try {
                            c15389l.firebase(this.f14538l, this.f14523l.advert());
                            c15389l.amazon();
                        } finally {
                            c15389l.crashlytics();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    loadAd();
                    throw th2;
                }
            }
        }
    }

    public final void remoteconfig() {
        synchronized (this.f14539l) {
            try {
                if (this.f14535l != null) {
                    AbstractC5363l.loadAd("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f14542l.f6220l == 0;
                if (!z || !this.f14538l.f23431l.admob()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C15389l c15389l = this.f14527l;
                        try {
                            c15389l.firebase(this.f14538l, this.f14523l.advert());
                            if (!z) {
                                C2859l c2859l = this.f14542l;
                                C15389l c15389l2 = this.f14527l;
                                C13006l c13006lAdmob = c2859l.admob();
                                try {
                                    c13006lAdmob.vip(c13006lAdmob.tapsense, new C14601l(c15389l2, c13006lAdmob, 7));
                                    Unit unit = Unit.INSTANCE;
                                    c13006lAdmob.purchase(true);
                                    this.f14532l.license();
                                    c15389l.purchase();
                                } catch (Throwable th) {
                                    c13006lAdmob.purchase(false);
                                    throw th;
                                }
                            }
                            c15389l.amazon();
                            c15389l.crashlytics();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            c15389l.crashlytics();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f14526l.yandex();
                this.f14536l.yandex();
                this.f14544l.yandex();
                this.f14543l.yandex.mopub();
                this.f14540l.yandex.mopub();
                C6956l c6956l = this.f14523l;
                c6956l.inmobi.clear();
                c6956l.subscription.clear();
                c6956l.purchase.yandex.mopub();
                c6956l.license = null;
                this.f14546l = 1;
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void signatures(Object obj) {
        synchronized (this.f14539l) {
            try {
                Signature(obj);
                Object objMopub = this.f14536l.mopub(obj);
                if (objMopub != null) {
                    if (objMopub instanceof C6295l) {
                        C6295l c6295l = (C6295l) objMopub;
                        Object[] objArr = c6295l.loadAd;
                        long[] jArr = c6295l.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Signature((C8610l) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        Signature((C8610l) objMopub);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C15492l smaato(boolean z, Function2 function2) {
        if (this.f14535l != null) {
            AbstractC5363l.loadAd("A pausable composition is in progress");
        }
        C15492l c15492l = new C15492l(this, this.f14533l, this.f14523l, this.f14538l, function2, z, this.f14532l, this.f14539l);
        this.f14535l = c15492l;
        return c15492l;
    }

    public final void startapp() {
        C5746l c5746l = C5746l.f12138l;
        AtomicReference atomicReference = this.f14525l;
        Object andSet = atomicReference.getAndSet(c5746l);
        if (AbstractC8576l.yandex(andSet, AbstractC15185l.yandex) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            amazon((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC2032l.loadAd("corrupt pendingModifications drain: " + atomicReference);
            C17132l.firebase();
            return;
        }
        for (Set set : (Set[]) andSet) {
            amazon(set, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void subs() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zAdmob;
        int i3;
        long j7;
        C13660l c13660l = this.f14536l;
        long[] jArr3 = c13660l.yandex;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = c13660l.loadAd[i8];
                            Object obj2 = c13660l.crashlytics[i8];
                            boolean z = obj2 instanceof C6295l;
                            C13660l c13660l2 = this.f14526l;
                            if (z) {
                                C6295l c6295l = (C6295l) obj2;
                                Object[] objArr = c6295l.loadAd;
                                long[] jArr4 = c6295l.yandex;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) == j5) {
                                            if (i10 != length2) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        } else {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!c13660l2.crashlytics((C8610l) objArr[i13])) {
                                                        c6295l.vip(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 != length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zAdmob = c6295l.admob();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                zAdmob = !c13660l2.crashlytics((C8610l) obj2);
                            }
                            if (zAdmob) {
                                c13660l.remoteconfig(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        C6295l c6295l2 = this.f14541l;
        if (!c6295l2.subs()) {
            return;
        }
        Object[] objArr2 = c6295l2.loadAd;
        long[] jArr5 = c6295l2.yandex;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((C4224l) objArr2[i18]).mopub != null)) {
                            c6295l2.vip(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final int subscription(C4224l c4224l, Object obj) {
        C6931l c6931l;
        int i = c4224l.loadAd;
        if ((i & 2) != 0) {
            c4224l.loadAd = i | 4;
        }
        C12317l c12317l = c4224l.crashlytics;
        if (c12317l == null || !c12317l.yandex()) {
            return 1;
        }
        C2859l c2859l = this.f14542l;
        c2859l.getClass();
        C12317l c12317l2 = c4224l.crashlytics;
        if (c12317l2 != null && c2859l.firebase(AbstractC0133l.mopub(c12317l2))) {
            if (c4224l.amazon == null) {
                return 1;
            }
            int iTapsense = tapsense(c4224l, c12317l, obj);
            if (iTapsense != 1) {
                this.f14528l.metrica();
            }
            return iTapsense;
        }
        synchronized (this.f14539l) {
            c6931l = this.f14545l;
        }
        if (c6931l != null) {
            C6956l c6956l = c6931l.f14523l;
            if (c6956l.f14606throws && c6956l.m2117abstract(c4224l, obj)) {
                return 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    public final int tapsense(C4224l c4224l, C12317l c12317l, Object obj) {
        int i;
        int i2;
        synchronized (this.f14539l) {
            try {
                C6931l c6931l = this.f14545l;
                int i3 = 3;
                C6931l c6931l2 = null;
                if (c6931l != null) {
                    C2859l c2859l = this.f14542l;
                    int i4 = this.f14534l;
                    if (c2859l.f6218l) {
                        AbstractC2032l.yandex("Writer is active");
                    }
                    if (i4 < 0 || i4 >= c2859l.f6220l) {
                        AbstractC2032l.yandex("Invalid group index");
                    }
                    C12317l c12317lMopub = AbstractC0133l.mopub(c12317l);
                    if (c2859l.firebase(c12317lMopub)) {
                        int i5 = c2859l.f6221l[(i4 * 5) + 3] + i4;
                        int i6 = c12317lMopub.yandex;
                        if (i4 > i6 || i6 >= i5) {
                            c6931l = null;
                        }
                    } else {
                        c6931l = null;
                    }
                    c6931l2 = c6931l;
                }
                int i7 = 2;
                if (c6931l2 == null) {
                    C6956l c6956l = this.f14523l;
                    if (c6956l.f14606throws && c6956l.m2117abstract(c4224l, obj)) {
                        return 4;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof C8610l;
                        C13660l c13660l = this.f14544l;
                        if (z) {
                            Object objMopub = c13660l.mopub(c4224l);
                            if (objMopub != null) {
                                if (!(objMopub instanceof C6295l)) {
                                    i = 2;
                                    i2 = 3;
                                    if (objMopub != C18450l.f36031l) {
                                        AbstractC9831l.loadAd(this.f14544l, c4224l, obj);
                                        break;
                                    }
                                } else {
                                    C6295l c6295l = (C6295l) objMopub;
                                    Object[] objArr = c6295l.loadAd;
                                    long[] jArr = c6295l.yandex;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i8];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                i = i7;
                                                int i10 = 0;
                                                while (i10 < i9) {
                                                    if ((j & 255) < 128) {
                                                        i2 = i3;
                                                        if (objArr[(i8 << 3) + i10] == C18450l.f36031l) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                    j >>= 8;
                                                    i10++;
                                                    i3 = i2;
                                                }
                                                i2 = i3;
                                                if (i9 == 8) {
                                                }
                                            } else {
                                                i = i7;
                                                i2 = i3;
                                            }
                                            if (i8 != length) {
                                                i8++;
                                                i7 = i;
                                                i3 = i2;
                                            }
                                        }
                                    } else {
                                        i = 2;
                                        i2 = 3;
                                    }
                                    AbstractC9831l.loadAd(this.f14544l, c4224l, obj);
                                    break;
                                }
                            } else {
                                i = 2;
                                i2 = 3;
                                AbstractC9831l.loadAd(this.f14544l, c4224l, obj);
                                break;
                            }
                        } else {
                            c13660l.vip(c4224l, C18450l.f36031l);
                        }
                    } else {
                        this.f14544l.vip(c4224l, C18450l.f36031l);
                    }
                    i = 2;
                    i2 = 3;
                } else {
                    i = 2;
                    i2 = 3;
                }
                if (c6931l2 != null) {
                    return c6931l2.tapsense(c4224l, c12317l, obj);
                }
                this.f14533l.smaato(this);
                return this.f14523l.f14606throws ? i2 : i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip() {
        AtomicReference atomicReference = this.f14525l;
        Object obj = AbstractC15185l.yandex;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC2032l.loadAd("pending composition has not been applied");
                C17132l.firebase();
                return;
            }
            if (andSet instanceof Set) {
                amazon((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC2032l.loadAd("corrupt pendingModifications drain: " + atomicReference);
                C17132l.firebase();
                return;
            }
            for (Set set : (Set[]) andSet) {
                amazon(set, true);
            }
        }
    }

    @Override // defpackage.InterfaceC12776l
    public final void yandex() {
        synchronized (this.f14539l) {
            try {
                if (this.f14523l.f14606throws) {
                    AbstractC5363l.loadAd("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f14546l != 3) {
                    this.f14546l = 3;
                    this.f14531l = AbstractC1295l.loadAd;
                    C9552l c9552l = this.f14523l.f14601private;
                    if (c9552l != null) {
                        billing(c9552l);
                    }
                    boolean z = this.f14542l.f6220l == 0;
                    if (!z || !this.f14538l.f23431l.admob()) {
                        C15389l c15389l = this.f14527l;
                        try {
                            c15389l.firebase(this.f14538l, this.f14523l.advert());
                            if (!z) {
                                C2859l c2859l = this.f14542l;
                                C15389l c15389l2 = this.f14527l;
                                C13006l c13006lAdmob = c2859l.admob();
                                try {
                                    c13006lAdmob.vip(c13006lAdmob.tapsense, new C15707l(15, c15389l2));
                                    c13006lAdmob.m3527synchronized();
                                    Unit unit = Unit.INSTANCE;
                                    c13006lAdmob.purchase(true);
                                    this.f14532l.yandex();
                                    this.f14532l.license();
                                    c15389l.purchase();
                                } catch (Throwable th) {
                                    c13006lAdmob.purchase(false);
                                    throw th;
                                }
                            }
                            c15389l.amazon();
                            c15389l.crashlytics();
                        } catch (Throwable th2) {
                            c15389l.crashlytics();
                            throw th2;
                        }
                    }
                    C6956l c6956l = this.f14523l;
                    c6956l.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c6956l.loadAd.Signature(c6956l);
                        c6956l.inmobi.clear();
                        c6956l.subscription.clear();
                        c6956l.purchase.yandex.mopub();
                        c6956l.license = null;
                        c6956l.yandex.yandex();
                        Unit unit2 = Unit.INSTANCE;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f14533l.license(this);
    }
}
