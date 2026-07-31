package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0298l {
    public C4568l admob;
    public boolean crashlytics;
    public C8080l subs;
    public final Function1 yandex;
    public final AtomicReference loadAd = new AtomicReference(null);
    public final C1645l amazon = new C1645l(12, this);
    public final C16931l purchase = new C16931l(28, this);
    public final C17893l billing = new C17893l(0, new C8080l[16]);
    public final Object mopub = new Object();
    public long isPro = -1;

    public C0298l(Function1 function1) {
        this.yandex = function1;
    }

    public final void amazon() {
        C1645l c1645l = this.amazon;
        AbstractC9620l.purchase(AbstractC9620l.yandex);
        synchronized (AbstractC9620l.crashlytics) {
            AbstractC9620l.admob = AbstractC16901l.m4218final(c1645l, AbstractC9620l.admob);
            Unit unit = Unit.INSTANCE;
        }
        this.admob = new C4568l(4, c1645l);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: all -> 0x00f9, TryCatch #9 {all -> 0x00f9, blocks: (B:41:0x00c7, B:43:0x00d4, B:45:0x00ef, B:49:0x00fe, B:50:0x0107, B:52:0x010a, B:55:0x010f, B:63:0x0135, B:56:0x0115, B:58:0x011b, B:59:0x011e, B:44:0x00de), top: B:148:0x00c7, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: all -> 0x00f9, TryCatch #9 {all -> 0x00f9, blocks: (B:41:0x00c7, B:43:0x00d4, B:45:0x00ef, B:49:0x00fe, B:50:0x0107, B:52:0x010a, B:55:0x010f, B:63:0x0135, B:56:0x0115, B:58:0x011b, B:59:0x011e, B:44:0x00de), top: B:148:0x00c7, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void crashlytics(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        C8080l c8080l;
        C8080l c8080l2;
        long j;
        C0298l c0298l;
        AbstractC18620l c15720l;
        AbstractC18620l abstractC18620lIsPro;
        C8080l c8080l3;
        int i;
        long j2;
        int i2;
        C8080l c8080l4;
        long jLoadAd = AbstractC4071l.loadAd();
        synchronized (this.mopub) {
            C17893l c17893l = this.billing;
            Object[] objArr = c17893l.f34848l;
            int i3 = c17893l.f34846l;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i4];
                if (((C8080l) obj2).yandex == function1) {
                    break;
                } else {
                    i4++;
                }
            }
            c8080l = (C8080l) obj2;
            if (c8080l == null) {
                AbstractC9464l.purchase(1, function1);
                c8080l = new C8080l(function1);
                c17893l.crashlytics(c8080l);
            }
            c8080l2 = this.subs;
            j = this.isPro;
            Unit unit = Unit.INSTANCE;
        }
        if (j != -1 && j != jLoadAd) {
            String name = Thread.currentThread().getName();
            StringBuilder sbSignature = AbstractC0653l.Signature(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbSignature.append(jLoadAd);
            sbSignature.append(", name=");
            sbSignature.append(name);
            sbSignature.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            AbstractC5363l.yandex(sbSignature.toString());
        }
        try {
            synchronized (this.mopub) {
                try {
                    this.subs = c8080l;
                    this.isPro = jLoadAd;
                } catch (Throwable th) {
                    th = th;
                    c0298l = jLoadAd;
                }
            }
            C16931l c16931l = this.purchase;
            Object obj3 = c8080l.loadAd;
            C7661l c7661l = c8080l.crashlytics;
            int i5 = c8080l.amazon;
            c8080l.loadAd = obj;
            c8080l.crashlytics = (C7661l) c8080l.billing.mopub(obj);
            if (c8080l.amazon == -1) {
                long jMopub = AbstractC9620l.isPro().mopub();
                c8080l.amazon = (int) (jMopub ^ (jMopub >>> 32));
            }
            C8957l c8957l = c8080l.subs;
            C17893l c17893lPurchase = AbstractC8020l.purchase();
            try {
                c17893lPurchase.crashlytics(c8957l);
                if (c16931l == null) {
                    function0.invoke();
                } else {
                    AbstractC18620l abstractC18620l = (AbstractC18620l) AbstractC9620l.loadAd.get();
                    if (abstractC18620l instanceof C15720l) {
                        try {
                            if (((C15720l) abstractC18620l).tapsense == AbstractC4071l.loadAd()) {
                                Function1 function2 = ((C15720l) abstractC18620l).ads;
                                Function1 function3 = ((C15720l) abstractC18620l).subscription;
                                try {
                                    ((C15720l) abstractC18620l).ads = AbstractC9620l.firebase(c16931l, function2, true);
                                    ((C15720l) abstractC18620l).subscription = function3;
                                    function0.invoke();
                                    ((C15720l) abstractC18620l).ads = function2;
                                    ((C15720l) abstractC18620l).subscription = function3;
                                } catch (Throwable th2) {
                                    ((C15720l) abstractC18620l).ads = function2;
                                    ((C15720l) abstractC18620l).subscription = function3;
                                    throw th2;
                                }
                            } else {
                                if (abstractC18620l != null || (abstractC18620l instanceof C1852l)) {
                                    c15720l = new C15720l(abstractC18620l instanceof C1852l ? (C1852l) abstractC18620l : null, c16931l, null, true, false);
                                } else {
                                    c15720l = abstractC18620l.Signature(c16931l);
                                }
                                try {
                                    abstractC18620lIsPro = c15720l.isPro();
                                    try {
                                        function0.invoke();
                                        AbstractC18620l.adcel(abstractC18620lIsPro);
                                        c15720l.crashlytics();
                                    } catch (Throwable th3) {
                                        try {
                                            AbstractC18620l.adcel(abstractC18620lIsPro);
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                c15720l.crashlytics();
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                c17893lPurchase.vip(c17893lPurchase.f34846l - 1);
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            c17893lPurchase.vip(c17893lPurchase.f34846l - 1);
                            throw th;
                        }
                    } else {
                        if (abstractC18620l != null) {
                            c15720l = new C15720l(abstractC18620l instanceof C1852l ? (C1852l) abstractC18620l : null, c16931l, null, true, false);
                        } else {
                            c15720l = new C15720l(abstractC18620l instanceof C1852l ? (C1852l) abstractC18620l : null, c16931l, null, true, false);
                        }
                        abstractC18620lIsPro = c15720l.isPro();
                        function0.invoke();
                        AbstractC18620l.adcel(abstractC18620lIsPro);
                        c15720l.crashlytics();
                    }
                }
                try {
                    c17893lPurchase.vip(c17893lPurchase.f34846l - 1);
                    Object obj4 = c8080l.loadAd;
                    int i6 = c8080l.amazon;
                    C7661l c7661l2 = c8080l.crashlytics;
                    if (c7661l2 != null) {
                        long[] jArr = c7661l2.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            boolean z = true;
                            int i7 = 0;
                            while (true) {
                                long j3 = jArr[i7];
                                boolean z2 = z;
                                C8080l c8080l5 = c8080l;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j3 & 255) < 128) {
                                            j2 = j3;
                                            int i10 = (i7 << 3) + i9;
                                            Object obj5 = c7661l2.loadAd[i10];
                                            i2 = i9;
                                            boolean z3 = c7661l2.crashlytics[i10] != i6 ? z2 : false;
                                            if (z3) {
                                                c8080l4 = c8080l5;
                                                c8080l4.crashlytics(obj4, obj5);
                                            } else {
                                                c8080l4 = c8080l5;
                                            }
                                            if (z3) {
                                                c7661l2.billing(i10);
                                            }
                                        } else {
                                            i6 = i6;
                                            j2 = j3;
                                            i2 = i9;
                                            c8080l4 = c8080l5;
                                        }
                                        j3 = j2 >> 8;
                                        i9 = i2 + 1;
                                        c8080l5 = c8080l4;
                                        i6 = i6;
                                    }
                                    i = i6;
                                    c8080l3 = c8080l5;
                                    if (i8 != 8) {
                                        break;
                                    }
                                } else {
                                    i = i6;
                                    c8080l3 = c8080l5;
                                }
                                if (i7 == length) {
                                    break;
                                }
                                i7++;
                                z = z2;
                                c8080l = c8080l3;
                                i6 = i;
                            }
                        } else {
                            c8080l3 = c8080l;
                        }
                    } else {
                        c8080l3 = c8080l;
                    }
                    c8080l3.loadAd = obj3;
                    c8080l3.crashlytics = c7661l;
                    c8080l3.amazon = i5;
                    synchronized (this.mopub) {
                        this.subs = c8080l2;
                        this.isPro = j;
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c0298l = this;
                    synchronized (c0298l.mopub) {
                        c0298l.subs = c8080l2;
                        c0298l.isPro = j;
                        Unit unit3 = Unit.INSTANCE;
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            c0298l = this;
        }
    }

    public final boolean loadAd() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.mopub) {
            z = this.crashlytics;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.loadAd;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC2032l.loadAd("Unexpected notification");
                        C17132l.firebase();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.mopub) {
                try {
                    C17893l c17893l = this.billing;
                    Object[] objArr = c17893l.f34848l;
                    int i = c17893l.f34846l;
                    for (int i2 = 0; i2 < i; i2++) {
                        z2 = ((C8080l) objArr[i2]).yandex(set) || z2;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void yandex() {
        synchronized (this.mopub) {
            try {
                C17893l c17893l = this.billing;
                Object[] objArr = c17893l.f34848l;
                int i = c17893l.f34846l;
                for (int i2 = 0; i2 < i; i2++) {
                    C8080l c8080l = (C8080l) objArr[i2];
                    c8080l.purchase.yandex();
                    c8080l.billing.yandex();
                    c8080l.smaato.yandex();
                    c8080l.remoteconfig.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
