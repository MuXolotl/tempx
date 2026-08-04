package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* JADX INFO: renamed from: lّٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15637l implements InterfaceC8979l {
    public int adcel;
    public InterfaceC9655l admob;
    public int ads;
    public boolean advert;
    public final InterfaceC0729l amazon;
    public C5978l applovin;
    public C5978l appmetrica;
    public InterfaceC15208l billing;
    public long inmobi;
    public C5978l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f30579package;
    public boolean premium;
    public final C13281l purchase;
    public int startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean f30580strictfp;
    public int subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public long f30581synchronized;
    public final C16488l yandex;
    public final C9489l loadAd = new C9489l();
    public int subs = 1000;
    public long[] isPro = new long[1000];
    public long[] firebase = new long[1000];
    public long[] vip = new long[1000];
    public int[] remoteconfig = new int[1000];
    public int[] smaato = new int[1000];
    public C0472l[] metrica = new C0472l[1000];
    public final C13698l crashlytics = new C13698l(new C11983l());
    public long tapsense = Long.MIN_VALUE;
    public long license = Long.MIN_VALUE;
    public long pro = Long.MIN_VALUE;
    public boolean signatures = true;
    public boolean isVip = true;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f30582throws = true;
    public long Signature = Long.MIN_VALUE;
    public int ad = -1;

    public C15637l(InterfaceC3783l interfaceC3783l, InterfaceC0729l interfaceC0729l, C13281l c13281l) {
        this.amazon = interfaceC0729l;
        this.purchase = c13281l;
        this.yandex = new C16488l(interfaceC3783l);
    }

    public final synchronized int Signature(long j, boolean z) throws Throwable {
        try {
            try {
                int iTapsense = tapsense(this.subscription);
                int i = this.subscription;
                int i2 = this.startapp;
                if (!(i != i2) || j < this.vip[iTapsense]) {
                    return 0;
                }
                if (j > this.pro && z) {
                    return i2 - i;
                }
                int iVip = vip(iTapsense, i2 - i, j, true);
                if (iVip == -1) {
                    return 0;
                }
                return iVip;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final boolean ad(int i) {
        InterfaceC9655l interfaceC9655l = this.admob;
        if (interfaceC9655l == null || interfaceC9655l.yandex() == 4) {
            return true;
        }
        return (this.remoteconfig[i] & 1073741824) == 0 && this.admob.crashlytics();
    }

    public final synchronized long adcel() {
        return Math.max(this.license, ads(this.subscription));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:18:0x003f, B:22:0x0047, B:23:0x004e, B:28:0x007f, B:51:0x00fa, B:53:0x0103, B:30:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00c0, B:40:0x00c9, B:41:0x00ce, B:43:0x00d4, B:47:0x00e2, B:49:0x00e7, B:50:0x00f7, B:33:0x00aa), top: B:58:0x0001 }] */
    public final synchronized void admob(long j, int i, long j2, int i2, C0472l c0472l) {
        C5978l c5978l;
        InterfaceC0729l interfaceC0729l;
        InterfaceC12888l interfaceC12888lAmazon;
        C13698l c13698l;
        int i3;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        try {
            int i4 = this.startapp;
            if (i4 > 0) {
                int iTapsense = tapsense(i4 - 1);
                AbstractC12442l.admob(this.firebase[iTapsense] + ((long) this.smaato[iTapsense]) <= j2);
            }
            this.advert = (536870912 & i) != 0;
            this.pro = Math.max(this.pro, j);
            long j3 = this.Signature;
            if (j3 != Long.MIN_VALUE && this.ad == -1 && j >= j3) {
                this.ad = this.adcel + this.startapp;
            }
            int iTapsense2 = tapsense(this.startapp);
            this.vip[iTapsense2] = j;
            this.firebase[iTapsense2] = j2;
            this.smaato[iTapsense2] = i2;
            this.remoteconfig[iTapsense2] = i;
            this.metrica[iTapsense2] = c0472l;
            this.isPro[iTapsense2] = this.inmobi;
            if (((SparseArray) this.crashlytics.f26743l).size() == 0) {
                c5978l = this.appmetrica;
                c5978l.getClass();
                interfaceC0729l = this.amazon;
                if (interfaceC0729l != null) {
                    interfaceC12888lAmazon = interfaceC0729l.amazon(this.purchase, c5978l);
                } else {
                    interfaceC12888lAmazon = InterfaceC12888l.remoteconfig;
                }
                c13698l = this.crashlytics;
                i3 = this.adcel + this.startapp;
                C2906l c2906l = new C2906l(c5978l, interfaceC12888lAmazon);
                sparseArray = (SparseArray) c13698l.f26743l;
                if (c13698l.f26744l == -1) {
                    if (sparseArray.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AbstractC12442l.subscription(z2);
                    c13698l.f26744l = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i3 >= iKeyAt) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AbstractC12442l.admob(z);
                    if (iKeyAt == i3) {
                        ((C11983l) c13698l.f26746l).accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i3, c2906l);
            } else {
                SparseArray sparseArray2 = (SparseArray) this.crashlytics.f26743l;
                if (!((C2906l) sparseArray2.valueAt(sparseArray2.size() - 1)).yandex.equals(this.appmetrica)) {
                    c5978l = this.appmetrica;
                    c5978l.getClass();
                    interfaceC0729l = this.amazon;
                    if (interfaceC0729l != null) {
                        interfaceC12888lAmazon = interfaceC0729l.amazon(this.purchase, c5978l);
                    } else {
                        interfaceC12888lAmazon = InterfaceC12888l.remoteconfig;
                    }
                    c13698l = this.crashlytics;
                    i3 = this.adcel + this.startapp;
                    C2906l c2906l2 = new C2906l(c5978l, interfaceC12888lAmazon);
                    sparseArray = (SparseArray) c13698l.f26743l;
                    if (c13698l.f26744l == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC12442l.subscription(z2);
                        c13698l.f26744l = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i3 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AbstractC12442l.admob(z);
                        if (iKeyAt == i3) {
                            ((C11983l) c13698l.f26746l).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i3, c2906l2);
                }
            }
            int i5 = this.startapp + 1;
            this.startapp = i5;
            int i6 = this.subs;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                C0472l[] c0472lArr = new C0472l[i7];
                int i8 = this.ads;
                int i9 = i6 - i8;
                System.arraycopy(this.firebase, i8, jArr2, 0, i9);
                System.arraycopy(this.vip, this.ads, jArr3, 0, i9);
                System.arraycopy(this.remoteconfig, this.ads, iArr, 0, i9);
                System.arraycopy(this.smaato, this.ads, iArr2, 0, i9);
                System.arraycopy(this.metrica, this.ads, c0472lArr, 0, i9);
                System.arraycopy(this.isPro, this.ads, jArr, 0, i9);
                int i10 = this.ads;
                System.arraycopy(this.firebase, 0, jArr2, i9, i10);
                System.arraycopy(this.vip, 0, jArr3, i9, i10);
                System.arraycopy(this.remoteconfig, 0, iArr, i9, i10);
                System.arraycopy(this.smaato, 0, iArr2, i9, i10);
                System.arraycopy(this.metrica, 0, c0472lArr, i9, i10);
                System.arraycopy(this.isPro, 0, jArr, i9, i10);
                this.firebase = jArr2;
                this.vip = jArr3;
                this.remoteconfig = iArr;
                this.smaato = iArr2;
                this.metrica = c0472lArr;
                this.isPro = jArr;
                this.ads = 0;
                this.subs = i7;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long ads(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iTapsense = tapsense(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.vip[iTapsense]);
            if ((this.remoteconfig[iTapsense] & 1) != 0) {
                return jMax;
            }
            iTapsense--;
            if (iTapsense == -1) {
                iTapsense = this.subs - 1;
            }
        }
        return jMax;
    }

    public final void advert(C5978l c5978l, C10023l c10023l) {
        C5978l c5978l2;
        C5978l c5978l3 = this.mopub;
        boolean z = c5978l3 == null;
        C17564l c17564l = c5978l3 == null ? null : c5978l3.subscription;
        this.mopub = c5978l;
        C17564l c17564l2 = c5978l.subscription;
        InterfaceC0729l interfaceC0729l = this.amazon;
        if (interfaceC0729l != null) {
            int iSmaato = interfaceC0729l.smaato(c5978l);
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.f25446throw = iSmaato;
            c5978l2 = new C5978l(c12984lYandex);
        } else {
            c5978l2 = c5978l;
        }
        c10023l.f20418l = c5978l2;
        c10023l.f20419l = this.admob;
        if (interfaceC0729l == null) {
            return;
        }
        if (z || !Objects.equals(c17564l, c17564l2)) {
            InterfaceC9655l interfaceC9655l = this.admob;
            C13281l c13281l = this.purchase;
            InterfaceC9655l interfaceC9655lCrashlytics = interfaceC0729l.crashlytics(c13281l, c5978l);
            this.admob = interfaceC9655lCrashlytics;
            c10023l.f20419l = interfaceC9655lCrashlytics;
            if (interfaceC9655l != null) {
                interfaceC9655l.amazon(c13281l);
            }
        }
    }

    public final synchronized void applovin() {
        this.subscription = 0;
        C16488l c16488l = this.yandex;
        c16488l.purchase = c16488l.amazon;
    }

    public final synchronized boolean appmetrica(int i) {
        applovin();
        int i2 = this.adcel;
        if (i >= i2 && i <= this.startapp + i2) {
            int i3 = this.ad;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.tapsense = Long.MIN_VALUE;
            this.subscription = i - i2;
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC8979l
    public final int billing(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return crashlytics(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final int crashlytics(InterfaceC5802l interfaceC5802l, int i, boolean z) throws EOFException {
        C16488l c16488l = this.yandex;
        int iLoadAd = c16488l.loadAd(i);
        C16528l c16528l = c16488l.billing;
        C8099l c8099l = (C8099l) c16528l.f32302l;
        int i2 = interfaceC5802l.read(c8099l.yandex, ((int) (c16488l.mopub - c16528l.f32303l)) + c8099l.loadAd, iLoadAd);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            C8339l.vip();
            return 0;
        }
        long j = c16488l.mopub + ((long) i2);
        c16488l.mopub = j;
        C16528l c16528l2 = c16488l.billing;
        if (j == c16528l2.f32306l) {
            c16488l.billing = (C16528l) c16528l2.f32305l;
        }
        return i2;
    }

    public final void firebase() {
        long jSubs;
        C16488l c16488l = this.yandex;
        synchronized (this) {
            int i = this.startapp;
            jSubs = i == 0 ? -1L : subs(i);
        }
        c16488l.yandex(jSubs);
    }

    public final synchronized boolean inmobi(long j, boolean z) throws Throwable {
        C15637l c15637l;
        Throwable th;
        long j2;
        C15637l c15637l2;
        int iVip;
        try {
            try {
                applovin();
                int iTapsense = tapsense(this.subscription);
                long j3 = this.Signature;
                long jMin = this.pro;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(jMin, j3);
                    } catch (Throwable th2) {
                        th = th2;
                        c15637l = this;
                    }
                }
                try {
                    int i = this.subscription;
                    int i2 = this.startapp;
                    if ((i != i2) && j >= this.vip[iTapsense] && (j <= jMin || z)) {
                        if (this.f30582throws) {
                            int i3 = i2 - i;
                            c15637l = this;
                            j2 = j;
                            try {
                                iVip = c15637l.remoteconfig(iTapsense, i3, j2, z);
                                c15637l2 = c15637l;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } else {
                            j2 = j;
                            int i4 = i2 - i;
                            c15637l2 = this;
                            iVip = c15637l2.vip(iTapsense, i4, j2, true);
                        }
                        if (iVip == -1) {
                            return false;
                        }
                        c15637l2.tapsense = j2;
                        c15637l2.subscription += iVip;
                        return true;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c15637l = this;
                }
            } catch (Throwable th5) {
                th = th5;
                c15637l = this;
                th = th;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
        }
        throw th;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void isPro(long j, boolean z) throws Throwable {
        Throwable th;
        C16488l c16488l = this.yandex;
        synchronized (this) {
            try {
                try {
                    int i = this.startapp;
                    long jSubs = -1;
                    if (i != 0) {
                        long[] jArr = this.vip;
                        int i2 = this.ads;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.subscription;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iVip = vip(i2, i, j, false);
                            if (iVip != -1) {
                                jSubs = subs(iVip);
                            }
                        }
                    }
                    c16488l.yandex(jSubs);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final synchronized long isVip() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.subscription != this.startapp ? this.isPro[tapsense(this.subscription)] : this.inmobi;
    }

    public final synchronized C5978l license() {
        return this.signatures ? null : this.appmetrica;
    }

    @Override // defpackage.InterfaceC8979l
    public final void loadAd(C13143l c13143l, int i, int i2) {
        while (true) {
            C16488l c16488l = this.yandex;
            if (i <= 0) {
                c16488l.getClass();
                return;
            }
            int iLoadAd = c16488l.loadAd(i);
            C16528l c16528l = c16488l.billing;
            C8099l c8099l = (C8099l) c16528l.f32302l;
            c13143l.firebase(((int) (c16488l.mopub - c16528l.f32303l)) + c8099l.loadAd, iLoadAd, c8099l.yandex);
            i -= iLoadAd;
            long j = c16488l.mopub + ((long) iLoadAd);
            c16488l.mopub = j;
            C16528l c16528l2 = c16488l.billing;
            if (j == c16528l2.f32306l) {
                c16488l.billing = (C16528l) c16528l2.f32305l;
            }
        }
    }

    public C5978l metrica(C5978l c5978l) {
        if (this.f30581synchronized == 0 || c5978l.tapsense == Long.MAX_VALUE) {
            return c5978l;
        }
        C12984l c12984lYandex = c5978l.yandex();
        c12984lYandex.subscription = c5978l.tapsense + this.f30581synchronized;
        return new C5978l(c12984lYandex);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:21:0x0069, B:25:0x0072, B:18:0x0059), top: B:35:0x000a }] */
    @Override // defpackage.InterfaceC8979l
    public final void mopub(C5978l c5978l) {
        C5978l c5978lMetrica = metrica(c5978l);
        boolean z = false;
        this.premium = false;
        this.applovin = c5978l;
        synchronized (this) {
            try {
                this.signatures = false;
                if (!Objects.equals(c5978lMetrica, this.appmetrica)) {
                    if (((SparseArray) this.crashlytics.f26743l).size() == 0) {
                        this.appmetrica = c5978lMetrica;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.crashlytics.f26743l;
                        if (((C2906l) sparseArray.valueAt(sparseArray.size() - 1)).yandex.equals(c5978lMetrica)) {
                            SparseArray sparseArray2 = (SparseArray) this.crashlytics.f26743l;
                            this.appmetrica = ((C2906l) sparseArray2.valueAt(sparseArray2.size() - 1)).yandex;
                        } else {
                            this.appmetrica = c5978lMetrica;
                        }
                    }
                    boolean z2 = this.f30582throws;
                    C5978l c5978l2 = this.appmetrica;
                    String str = c5978l2.metrica;
                    this.f30582throws = z2 & (AbstractC3825l.admob(str) == 1 && AbstractC3825l.yandex(str, c5978l2.firebase));
                    this.f30579package = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC15208l interfaceC15208l = this.billing;
        if (interfaceC15208l == null || !z) {
            return;
        }
        interfaceC15208l.subscription();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final synchronized void m4096package(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.subscription + i <= this.startapp) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        AbstractC12442l.admob(z);
        this.subscription += i;
    }

    public final void premium(boolean z) {
        C16488l c16488l = this.yandex;
        C16528l c16528l = c16488l.amazon;
        InterfaceC3783l interfaceC3783l = c16488l.yandex;
        if (((C8099l) c16528l.f32302l) != null) {
            interfaceC3783l.loadAd(c16528l);
            c16528l.f32302l = null;
            c16528l.f32305l = null;
        }
        C16528l c16528l2 = c16488l.amazon;
        int i = c16488l.loadAd;
        AbstractC12442l.subscription(((C8099l) c16528l2.f32302l) == null);
        c16528l2.f32303l = 0L;
        c16528l2.f32306l = i;
        C16528l c16528l3 = c16488l.amazon;
        c16488l.purchase = c16528l3;
        c16488l.billing = c16528l3;
        c16488l.mopub = 0L;
        interfaceC3783l.remoteconfig();
        this.startapp = 0;
        this.adcel = 0;
        this.ads = 0;
        this.subscription = 0;
        this.ad = -1;
        this.isVip = true;
        this.tapsense = Long.MIN_VALUE;
        this.license = Long.MIN_VALUE;
        this.pro = Long.MIN_VALUE;
        this.advert = false;
        C13698l c13698l = this.crashlytics;
        SparseArray sparseArray = (SparseArray) c13698l.f26743l;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((C11983l) c13698l.f26746l).accept(sparseArray.valueAt(i2));
        }
        c13698l.f26744l = -1;
        sparseArray.clear();
        if (z) {
            this.applovin = null;
            this.appmetrica = null;
            this.signatures = true;
            this.f30582throws = true;
        }
    }

    public final synchronized boolean pro(boolean z) {
        C5978l c5978l;
        int iSubscription = subscription();
        int i = this.ad;
        boolean z2 = true;
        if (i != -1 && iSubscription >= i) {
            return true;
        }
        if (this.subscription != this.startapp) {
            if (((C2906l) this.crashlytics.isVip(iSubscription)).yandex != this.mopub) {
                return true;
            }
            return ad(tapsense(this.subscription));
        }
        if (!z && !this.advert && ((c5978l = this.appmetrica) == null || c5978l == this.mopub)) {
            z2 = false;
        }
        return z2;
    }

    @Override // defpackage.InterfaceC8979l
    public final void purchase(int i, C13143l c13143l) {
        loadAd(c13143l, i, 0);
    }

    public final int remoteconfig(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.vip[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.subs) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int signatures(C10023l c10023l, C4136l c4136l, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C9489l c9489l = this.loadAd;
        synchronized (this) {
            c4136l.f8501l = false;
            int iSubscription = subscription();
            int i3 = this.ad;
            boolean z3 = i3 != -1 && iSubscription >= i3;
            i2 = -5;
            if ((this.subscription != this.startapp) && !z3) {
                C5978l c5978l = ((C2906l) this.crashlytics.isVip(iSubscription)).yandex;
                if (z2 || c5978l != this.mopub) {
                    advert(c5978l, c10023l);
                } else {
                    int iTapsense = tapsense(this.subscription);
                    if (ad(iTapsense)) {
                        c4136l.f16423l = this.remoteconfig[iTapsense];
                        if (this.subscription == this.startapp - 1 && (z || this.advert)) {
                            c4136l.yandex(536870912);
                        }
                        c4136l.f8496l = this.vip[iTapsense];
                        c9489l.yandex = this.smaato[iTapsense];
                        c9489l.loadAd = this.firebase[iTapsense];
                        c9489l.crashlytics = this.metrica[iTapsense];
                        i2 = -4;
                    } else {
                        c4136l.f8501l = true;
                        i2 = -3;
                    }
                }
            } else if (z || this.advert || z3) {
                c4136l.f16423l = 4;
                c4136l.f8496l = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C5978l c5978l2 = this.appmetrica;
                if (c5978l2 == null || (!z2 && c5978l2 == this.mopub)) {
                    i2 = -3;
                } else {
                    advert(c5978l2, c10023l);
                }
            }
        }
        if (i2 == -4 && !c4136l.crashlytics(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                C16488l c16488l = this.yandex;
                C9489l c9489l2 = this.loadAd;
                if (z4) {
                    C16488l.purchase(c16488l.purchase, c4136l, c9489l2, c16488l.crashlytics);
                } else {
                    c16488l.purchase = C16488l.purchase(c16488l.purchase, c4136l, c9489l2, c16488l.crashlytics);
                }
            }
            if (!z4) {
                this.subscription++;
            }
        }
        return i2;
    }

    public final long smaato(int i) {
        int i2 = this.adcel;
        int i3 = this.startapp;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        AbstractC12442l.admob(i4 >= 0 && i4 <= i3 - this.subscription);
        int i5 = this.startapp - i4;
        this.startapp = i5;
        this.pro = Math.max(this.license, ads(i5));
        if (i4 == 0 && this.advert) {
            z = true;
        }
        this.advert = z;
        int i6 = this.ad;
        if (i6 != -1 && i < i6) {
            this.ad = -1;
        }
        C13698l c13698l = this.crashlytics;
        SparseArray sparseArray = (SparseArray) c13698l.f26743l;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((C11983l) c13698l.f26746l).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c13698l.f26744l = sparseArray.size() > 0 ? Math.min(c13698l.f26744l, sparseArray.size() - 1) : -1;
        int i7 = this.startapp;
        if (i7 == 0) {
            return 0L;
        }
        int iTapsense = tapsense(i7 - 1);
        return this.firebase[iTapsense] + ((long) this.smaato[iTapsense]);
    }

    public final synchronized long startapp() {
        return this.pro;
    }

    public final long subs(int i) {
        this.license = Math.max(this.license, ads(i));
        this.startapp -= i;
        int i2 = this.adcel + i;
        this.adcel = i2;
        int i3 = this.ads + i;
        this.ads = i3;
        int i4 = this.subs;
        if (i3 >= i4) {
            this.ads = i3 - i4;
        }
        int i5 = this.subscription - i;
        this.subscription = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.subscription = 0;
        }
        C13698l c13698l = this.crashlytics;
        SparseArray sparseArray = (SparseArray) c13698l.f26743l;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((C11983l) c13698l.f26746l).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = c13698l.f26744l;
            if (i8 > 0) {
                c13698l.f26744l = i8 - 1;
            }
            i6 = i7;
        }
        if (this.startapp != 0) {
            return this.firebase[this.ads];
        }
        int i9 = this.ads;
        if (i9 == 0) {
            i9 = this.subs;
        }
        int i10 = i9 - 1;
        return this.firebase[i10] + ((long) this.smaato[i10]);
    }

    public final int subscription() {
        return this.adcel + this.subscription;
    }

    public final int tapsense(int i) {
        int i2 = this.ads + i;
        int i3 = this.subs;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final synchronized void m4097throws(long j) throws Throwable {
        Throwable th;
        C15637l c15637l;
        long j2;
        int iRemoteconfig;
        try {
            try {
                if (j == this.Signature) {
                    return;
                }
                int i = -1;
                if (j != Long.MIN_VALUE) {
                    if (j <= this.pro) {
                        c15637l = this;
                        j2 = j;
                        iRemoteconfig = c15637l.remoteconfig(this.ads, this.startapp, j2, false);
                    } else {
                        c15637l = this;
                        j2 = j;
                        iRemoteconfig = -1;
                    }
                    if (iRemoteconfig != -1) {
                        i = c15637l.adcel + iRemoteconfig;
                    }
                    c15637l.ad = i;
                    c15637l.Signature = j2;
                    return;
                }
                try {
                    this.ad = -1;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final int vip(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.vip[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.remoteconfig[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.subs) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    @Override // defpackage.InterfaceC8979l
    public void yandex(long j, int i, int i2, int i3, C0472l c0472l) {
        int i4;
        if (this.premium) {
            C5978l c5978l = this.applovin;
            c5978l.getClass();
            mopub(c5978l);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.isVip) {
            if (!z2) {
                return;
            } else {
                this.isVip = false;
            }
        }
        long j2 = this.f30581synchronized + j;
        if (!this.f30582throws) {
            i4 = i;
        } else {
            if (j2 < this.tapsense) {
                return;
            }
            if (i5 == 0) {
                if (!this.f30579package) {
                    AbstractC6427l.vip("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.appmetrica);
                    this.f30579package = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f30580strictfp) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.startapp == 0) {
                    z = j2 > this.license;
                } else if (adcel() >= j2) {
                    z = false;
                } else {
                    int i6 = this.startapp;
                    int iTapsense = tapsense(i6 - 1);
                    while (i6 > this.subscription && this.vip[iTapsense] >= j2) {
                        i6--;
                        iTapsense--;
                        if (iTapsense == -1) {
                            iTapsense = this.subs - 1;
                        }
                    }
                    smaato(this.adcel + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.f30580strictfp = false;
            }
        }
        admob(j2, i4, (this.yandex.mopub - ((long) i2)) - ((long) i3), i2, c0472l);
    }

    @Override // defpackage.InterfaceC8979l
    public final /* synthetic */ void amazon(long j) {
    }
}
