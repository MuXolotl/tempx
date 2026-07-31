package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1852l extends AbstractC18620l {
    public static final int[] vip = new int[0];
    public C6295l admob;
    public final Function1 billing;
    public int[] firebase;
    public C8739l isPro;
    public int mopub;
    public final Function1 purchase;
    public boolean remoteconfig;
    public int smaato;
    public ArrayList subs;

    public C1852l(long j, C8739l c8739l, Function1 function1, Function1 function2) {
        super(j, c8739l);
        this.purchase = function1;
        this.billing = function2;
        this.isPro = C8739l.f17990l;
        this.firebase = vip;
        this.smaato = 1;
    }

    @Override // defpackage.AbstractC18620l
    public AbstractC18620l Signature(Function1 function1) {
        C11088l c11088l;
        if (this.crashlytics) {
            AbstractC5363l.yandex("Cannot use a disposed snapshot");
        }
        if (this.remoteconfig && this.amazon < 0) {
            AbstractC5363l.loadAd("Unsupported operation on a disposed or applied snapshot");
        }
        long jMopub = mopub();
        signatures(mopub());
        Object obj = AbstractC9620l.crashlytics;
        synchronized (obj) {
            long j = AbstractC9620l.purchase;
            AbstractC9620l.purchase = j + 1;
            AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(j);
            c11088l = new C11088l(j, AbstractC9620l.amazon(amazon(), jMopub + 1, j), AbstractC9620l.firebase(function1, purchase(), true), this);
        }
        if (this.remoteconfig || this.crashlytics) {
            return c11088l;
        }
        long jMopub2 = mopub();
        synchronized (obj) {
            long j2 = AbstractC9620l.purchase;
            AbstractC9620l.purchase = j2 + 1;
            subscription(j2);
            AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(mopub());
            Unit unit = Unit.INSTANCE;
        }
        ads(AbstractC9620l.amazon(amazon(), jMopub2 + 1, mopub()));
        return c11088l;
    }

    public C6295l ad() {
        return this.admob;
    }

    @Override // defpackage.AbstractC18620l
    public int admob() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC18620l
    /* JADX INFO: renamed from: advert, reason: merged with bridge method [inline-methods] */
    public Function1 purchase() {
        return this.purchase;
    }

    public void applovin(C6295l c6295l) {
        this.admob = c6295l;
    }

    public C1852l appmetrica(Function1 function1, Function1 function2) {
        C1260l c1260l;
        if (this.crashlytics) {
            AbstractC5363l.yandex("Cannot use a disposed snapshot");
        }
        if (this.remoteconfig && this.amazon < 0) {
            AbstractC5363l.loadAd("Unsupported operation on a disposed or applied snapshot");
        }
        signatures(mopub());
        Object obj = AbstractC9620l.crashlytics;
        synchronized (obj) {
            long j = AbstractC9620l.purchase;
            AbstractC9620l.purchase = j + 1;
            AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(j);
            C8739l c8739lAmazon = amazon();
            ads(c8739lAmazon.firebase(j));
            c1260l = new C1260l(j, AbstractC9620l.amazon(c8739lAmazon, mopub() + 1, j), AbstractC9620l.firebase(function1, purchase(), true), AbstractC9620l.smaato(function2, subs()), this);
        }
        if (this.remoteconfig || this.crashlytics) {
            return c1260l;
        }
        long jMopub = mopub();
        synchronized (obj) {
            long j2 = AbstractC9620l.purchase;
            AbstractC9620l.purchase = j2 + 1;
            subscription(j2);
            AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(mopub());
            Unit unit = Unit.INSTANCE;
        }
        ads(AbstractC9620l.amazon(amazon(), jMopub + 1, mopub()));
        return c1260l;
    }

    @Override // defpackage.AbstractC18620l
    public boolean billing() {
        return false;
    }

    @Override // defpackage.AbstractC18620l
    public void crashlytics() {
        if (this.crashlytics) {
            return;
        }
        super.crashlytics();
        smaato();
    }

    @Override // defpackage.AbstractC18620l
    public void firebase() {
        this.smaato++;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final AbstractC6873l isVip(long j, C6295l c6295l, HashMap map, C8739l c8739l) {
        ArrayList arrayList;
        ArrayList arrayListM4232new;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        InterfaceC2763l interfaceC2763l;
        AbstractC7498l abstractC7498l;
        C8739l c8739l2;
        Object[] objArr;
        long[] jArr;
        C8739l c8739l3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        AbstractC7498l abstractC7498lBilling;
        C8739l c8739lAdmob = amazon().firebase(mopub()).admob(this.isPro);
        Object[] objArr3 = c6295l.loadAd;
        long[] jArr3 = c6295l.yandex;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListM4232new = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC2763l interfaceC2763l2 = (InterfaceC2763l) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            AbstractC7498l abstractC7498lAmazon = interfaceC2763l2.amazon();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            AbstractC7498l abstractC7498lTapsense = AbstractC9620l.tapsense(abstractC7498lAmazon, j, c8739l);
                            if (abstractC7498lTapsense == null) {
                                arrayList4 = arrayListM4232new;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListM4232new;
                                j2 = j3;
                                AbstractC7498l abstractC7498lTapsense2 = AbstractC9620l.tapsense(abstractC7498lAmazon, mopub(), c8739lAdmob);
                                if (abstractC7498lTapsense2 != null && abstractC7498lTapsense2.yandex != 1 && !abstractC7498lTapsense.equals(abstractC7498lTapsense2)) {
                                    c8739l3 = c8739lAdmob;
                                    AbstractC7498l abstractC7498lTapsense3 = AbstractC9620l.tapsense(abstractC7498lAmazon, mopub(), amazon());
                                    if (abstractC7498lTapsense3 == null) {
                                        AbstractC9620l.subscription();
                                        throw null;
                                    }
                                    if (map == null || (abstractC7498lBilling = (AbstractC7498l) map.get(abstractC7498lTapsense)) == null) {
                                        abstractC7498lBilling = interfaceC2763l2.billing(abstractC7498lTapsense2, abstractC7498lTapsense, abstractC7498lTapsense3);
                                    }
                                    if (abstractC7498lBilling == null) {
                                        return new C4728l(this);
                                    }
                                    if (!abstractC7498lBilling.equals(abstractC7498lTapsense3)) {
                                        if (abstractC7498lBilling.equals(abstractC7498lTapsense)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new C8195l(interfaceC2763l2, abstractC7498lTapsense.crashlytics(mopub())));
                                            arrayListM4232new = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListM4232new.add(interfaceC2763l2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!abstractC7498lBilling.equals(abstractC7498lTapsense2) ? new C8195l(interfaceC2763l2, abstractC7498lBilling) : new C8195l(interfaceC2763l2, abstractC7498lTapsense2.crashlytics(mopub())));
                                        }
                                    }
                                    arrayListM4232new = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListM4232new = arrayList4;
                            }
                            c8739l3 = c8739lAdmob;
                            arrayList2 = arrayList5;
                            arrayListM4232new = arrayList4;
                        } else {
                            c8739l3 = c8739lAdmob;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c8739lAdmob = c8739l3;
                    }
                    c8739l2 = c8739lAdmob;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c8739l2 = c8739lAdmob;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    c8739lAdmob = c8739l2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                license();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    C8195l c8195l = (C8195l) arrayList2.get(i2);
                    interfaceC2763l = (InterfaceC2763l) c8195l.f17098l;
                    abstractC7498l = (AbstractC7498l) c8195l.f17097l;
                    abstractC7498l.yandex = j;
                    synchronized (AbstractC9620l.crashlytics) {
                        abstractC7498l.loadAd = interfaceC2763l.amazon();
                        interfaceC2763l.mopub(abstractC7498l);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (arrayListM4232new != null) {
                size = arrayListM4232new.size();
                for (i = 0; i < size; i++) {
                    c6295l.remoteconfig((InterfaceC2763l) arrayListM4232new.get(i));
                }
                arrayList3 = this.subs;
                if (arrayList3 != null) {
                    arrayListM4232new = AbstractC16901l.m4232new(arrayList3, arrayListM4232new);
                }
                this.subs = arrayListM4232new;
            }
            return C16423l.billing;
        }
        arrayList = null;
        arrayListM4232new = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            license();
            size2 = arrayList2.size();
            while (i2 < size2) {
                C8195l c8195l2 = (C8195l) arrayList2.get(i2);
                interfaceC2763l = (InterfaceC2763l) c8195l2.f17098l;
                abstractC7498l = (AbstractC7498l) c8195l2.f17097l;
                abstractC7498l.yandex = j;
                synchronized (AbstractC9620l.crashlytics) {
                    abstractC7498l.loadAd = interfaceC2763l.amazon();
                    interfaceC2763l.mopub(abstractC7498l);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        if (arrayListM4232new != null) {
            size = arrayListM4232new.size();
            while (i < size) {
                c6295l.remoteconfig((InterfaceC2763l) arrayListM4232new.get(i));
            }
            arrayList3 = this.subs;
            if (arrayList3 != null) {
                arrayListM4232new = AbstractC16901l.m4232new(arrayList3, arrayListM4232new);
            }
            this.subs = arrayListM4232new;
        }
        return C16423l.billing;
    }

    public final void license() {
        signatures(mopub());
        Unit unit = Unit.INSTANCE;
        if (this.remoteconfig || this.crashlytics) {
            return;
        }
        long jMopub = mopub();
        synchronized (AbstractC9620l.crashlytics) {
            long j = AbstractC9620l.purchase;
            AbstractC9620l.purchase = j + 1;
            subscription(j);
            AbstractC9620l.amazon = AbstractC9620l.amazon.firebase(mopub());
        }
        ads(AbstractC9620l.amazon(amazon(), jMopub + 1, mopub()));
    }

    @Override // defpackage.AbstractC18620l
    public final void loadAd() {
        AbstractC9620l.amazon = AbstractC9620l.amazon.billing(mopub()).amazon(this.isPro);
    }

    public final void premium(C8739l c8739l) {
        synchronized (AbstractC9620l.crashlytics) {
            this.isPro = this.isPro.admob(c8739l);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014d A[EDGE_INSN: B:102:0x014d->B:77:0x014d BREAK  A[LOOP:4: B:66:0x011e->B:76:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: all -> 0x0100, LOOP:2: B:48:0x00d8->B:60:0x010b, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[Catch: all -> 0x0100, LOOP:4: B:66:0x011e->B:76:0x014a, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112 A[EDGE_INSN: B:97:0x0112->B:62:0x0112 BREAK  A[LOOP:2: B:48:0x00d8->B:60:0x010b], SYNTHETIC] */
    public AbstractC6873l pro() {
        HashMap mapLoadAd;
        List list;
        C6295l c6295l;
        long j;
        long j2;
        C6295l c6295lAd = ad();
        if (c6295lAd != null) {
            long j3 = AbstractC9620l.isPro.loadAd;
            mapLoadAd = AbstractC9620l.loadAd(j3, this, AbstractC9620l.amazon.billing(j3));
        } else {
            mapLoadAd = null;
        }
        C2580l c2580l = C2580l.f5619l;
        synchronized (AbstractC9620l.crashlytics) {
            try {
                AbstractC9620l.crashlytics(this);
                if (c6295lAd == null || c6295lAd.amazon == 0) {
                    loadAd();
                    C18661l c18661l = AbstractC9620l.isPro;
                    C6295l c6295l2 = c18661l.admob;
                    AbstractC9620l.pro(c18661l, AbstractC9620l.yandex);
                    if (c6295l2 == null || !c6295l2.subs()) {
                        list = c2580l;
                        c6295l = null;
                    } else {
                        list = AbstractC9620l.admob;
                        c6295l = c6295l2;
                    }
                } else {
                    C18661l c18661l2 = AbstractC9620l.isPro;
                    AbstractC6873l abstractC6873lIsVip = isVip(AbstractC9620l.purchase, c6295lAd, mapLoadAd, AbstractC9620l.amazon.billing(c18661l2.loadAd));
                    if (!abstractC6873lIsVip.equals(C16423l.billing)) {
                        return abstractC6873lIsVip;
                    }
                    loadAd();
                    c6295l = c18661l2.admob;
                    AbstractC9620l.pro(c18661l2, AbstractC9620l.yandex);
                    applovin(null);
                    c18661l2.admob = null;
                    list = AbstractC9620l.admob;
                }
                Unit unit = Unit.INSTANCE;
                this.remoteconfig = true;
                if (c6295l != null) {
                    C16927l c16927l = new C16927l(c6295l);
                    if (!c6295l.admob()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(c16927l, this);
                        }
                    }
                }
                if (c6295lAd != null && c6295lAd.subs()) {
                    C16927l c16927l2 = new C16927l(c6295lAd);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Function2) list.get(i2)).invoke(c16927l2, this);
                    }
                }
                synchronized (AbstractC9620l.crashlytics) {
                    try {
                        startapp();
                        AbstractC9620l.billing();
                        if (c6295l != null) {
                            Object[] objArr = c6295l.loadAd;
                            long[] jArr = c6295l.yandex;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                AbstractC9620l.ads((InterfaceC2763l) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (c6295lAd != null) {
                            Object[] objArr2 = c6295lAd.loadAd;
                            long[] jArr2 = c6295lAd.yandex;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                AbstractC9620l.ads((InterfaceC2763l) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.subs;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                AbstractC9620l.ads((InterfaceC2763l) arrayList.get(i9));
                            }
                        }
                        this.subs = null;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C16423l.billing;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC18620l
    public void remoteconfig() {
        if (this.remoteconfig || this.crashlytics) {
            return;
        }
        license();
    }

    public final void signatures(long j) {
        synchronized (AbstractC9620l.crashlytics) {
            this.isPro = this.isPro.firebase(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.AbstractC18620l
    public void smaato() {
        if (this.smaato <= 0) {
            AbstractC5363l.yandex("no pending nested snapshots");
        }
        int i = this.smaato - 1;
        this.smaato = i;
        if (i != 0 || this.remoteconfig) {
            return;
        }
        C6295l c6295lAd = ad();
        if (c6295lAd != null) {
            if (this.remoteconfig) {
                AbstractC5363l.loadAd("Unsupported operation on a snapshot that has been applied");
            }
            applovin(null);
            long jMopub = mopub();
            Object[] objArr = c6295lAd.loadAd;
            long[] jArr = c6295lAd.yandex;
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
                                for (AbstractC7498l abstractC7498lAmazon = ((InterfaceC2763l) objArr[(i2 << 3) + i4]).amazon(); abstractC7498lAmazon != null; abstractC7498lAmazon = abstractC7498lAmazon.loadAd) {
                                    long j2 = abstractC7498lAmazon.yandex;
                                    if (j2 == jMopub || AbstractC16901l.inmobi(this.isPro, Long.valueOf(j2))) {
                                        C1698l c1698l = AbstractC9620l.yandex;
                                        abstractC7498lAmazon.yandex = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        yandex();
    }

    @Override // defpackage.AbstractC18620l
    public final void startapp() {
        int length = this.firebase.length;
        for (int i = 0; i < length; i++) {
            AbstractC9620l.license(this.firebase[i]);
        }
        metrica();
    }

    @Override // defpackage.AbstractC18620l
    public Function1 subs() {
        return this.billing;
    }

    @Override // defpackage.AbstractC18620l
    public void tapsense(int i) {
        this.mopub = i;
    }

    @Override // defpackage.AbstractC18620l
    public void vip(InterfaceC2763l interfaceC2763l) {
        C6295l c6295lAd = ad();
        if (c6295lAd == null) {
            C6295l c6295l = AbstractC13087l.yandex;
            c6295lAd = new C6295l();
            applovin(c6295lAd);
        }
        c6295lAd.yandex(interfaceC2763l);
    }
}
