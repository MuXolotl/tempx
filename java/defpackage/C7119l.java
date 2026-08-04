package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7119l implements InterfaceC14592l {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1350l f14923l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f14924l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14925l;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14918l = AtomicLongFieldUpdater.newUpdater(C7119l.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14917l = AtomicLongFieldUpdater.newUpdater(C7119l.class, "receivers$volatile");

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14921l = AtomicLongFieldUpdater.newUpdater(C7119l.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14914l = AtomicLongFieldUpdater.newUpdater(C7119l.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14915l = AtomicReferenceFieldUpdater.newUpdater(C7119l.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14920l = AtomicReferenceFieldUpdater.newUpdater(C7119l.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14916l = AtomicReferenceFieldUpdater.newUpdater(C7119l.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14922l = AtomicReferenceFieldUpdater.newUpdater(C7119l.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14919l = AtomicReferenceFieldUpdater.newUpdater(C7119l.class, Object.class, "closeHandler$volatile");

    public C7119l(int i, Function1 function1) {
        long j;
        this.f14925l = i;
        this.f14924l = function1;
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        C12611l c12611l = AbstractC14503l.yandex;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = f14921l.get(this);
        C12611l c12611l2 = new C12611l(0L, null, this, 3);
        this.sendSegment$volatile = c12611l2;
        this.receiveSegment$volatile = c12611l2;
        this.bufferEndSegment$volatile = inmobi() ? AbstractC14503l.yandex : c12611l2;
        this.f14923l = function1 != null ? new C1350l(6, this) : null;
        this._closeCause$volatile = AbstractC14503l.subscription;
    }

    public static final void billing(C7119l c7119l, C2671l c2671l) {
        C12611l c12611l;
        InterfaceC15894l interfaceC15894l;
        c7119l.getClass();
        C12611l c12611l2 = (C12611l) f14920l.get(c7119l);
        while (!c7119l.premium()) {
            long andIncrement = f14917l.getAndIncrement(c7119l);
            long j = AbstractC14503l.loadAd;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c12611l2.f32620l != j2) {
                C12611l c12611lMetrica = c7119l.metrica(j2, c12611l2);
                if (c12611lMetrica == null) {
                    continue;
                } else {
                    c12611l = c12611lMetrica;
                }
            } else {
                c12611l = c12611l2;
            }
            Object objM2171extends = c7119l.m2171extends(c12611l, i, andIncrement, c2671l);
            c12611l2 = c12611l;
            if (objM2171extends == AbstractC14503l.remoteconfig) {
                InterfaceC15894l interfaceC15894l2 = c2671l instanceof InterfaceC15894l ? interfaceC15894l : null;
                if (interfaceC15894l2 == null) {
                    interfaceC15894l = c2671l;
                    return;
                } else {
                    interfaceC15894l = c2671l;
                    interfaceC15894l2.loadAd(c12611l2, i);
                    return;
                }
            }
            if (objM2171extends != AbstractC14503l.metrica) {
                if (objM2171extends == AbstractC14503l.vip) {
                    C8339l.smaato("unexpected");
                    return;
                } else {
                    c12611l2.loadAd();
                    c2671l.f5802l = objM2171extends;
                    return;
                }
            }
            if (andIncrement < c7119l.advert()) {
                c12611l2.loadAd();
            }
            c7119l = c7119l;
            c2671l = c2671l;
        }
        c2671l.f5802l = AbstractC14503l.smaato;
    }

    public static void isVip(C7119l c7119l) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14914l;
        if ((atomicLongFieldUpdater.addAndGet(c7119l, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c7119l) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static final int mopub(C7119l c7119l, C12611l c12611l, int i, Object obj, long j, Object obj2, boolean z) {
        c12611l.vip(i, obj);
        if (z) {
            return c7119l.m2172for(c12611l, i, obj, j, obj2, z);
        }
        Object objSmaato = c12611l.smaato(i);
        if (objSmaato == null) {
            if (c7119l.isPro(j)) {
                if (c12611l.firebase(i, null, AbstractC14503l.amazon)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c12611l.firebase(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objSmaato instanceof InterfaceC15894l) {
            c12611l.vip(i, null);
            if (c7119l.m2173native(objSmaato, obj)) {
                c12611l.metrica(i, AbstractC14503l.subs);
                return 0;
            }
            C9676l c9676l = AbstractC14503l.firebase;
            if (c12611l.f24840l.getAndSet((i * 2) + 1, c9676l) == c9676l) {
                return 5;
            }
            c12611l.remoteconfig(i, true);
            return 5;
        }
        return c7119l.m2172for(c12611l, i, obj, j, obj2, z);
    }

    public static final void purchase(C7119l c7119l, Object obj, C2397l c2397l) {
        Function1 function1 = c7119l.f14924l;
        if (function1 != null) {
            AbstractC16829l.loadAd(function1, obj, c2397l.f5166l);
        }
        c2397l.subs(new C18435l(c7119l.ad()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static Object m2170synchronized(C7119l c7119l, AbstractC0283l abstractC0283l) {
        C12625l c12625l;
        C12611l c12611l;
        if (abstractC0283l instanceof C12625l) {
            c12625l = (C12625l) abstractC0283l;
            int i = c12625l.f24851l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12625l.f24851l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12625l = new C12625l(c7119l, abstractC0283l);
            }
        } else {
            c12625l = new C12625l(c7119l, abstractC0283l);
        }
        C12625l c12625l2 = c12625l;
        Object obj = c12625l2.f24850l;
        int i2 = c12625l2.f24851l;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC2829l.crashlytics(obj);
                return ((C0381l) obj).yandex;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        C12611l c12611l2 = (C12611l) f14920l.get(c7119l);
        while (!c7119l.premium()) {
            long andIncrement = f14917l.getAndIncrement(c7119l);
            long j = AbstractC14503l.loadAd;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (c12611l2.f32620l != j2) {
                C12611l c12611lMetrica = c7119l.metrica(j2, c12611l2);
                if (c12611lMetrica == null) {
                    continue;
                } else {
                    c12611l = c12611lMetrica;
                }
            } else {
                c12611l = c12611l2;
            }
            C7119l c7119l2 = c7119l;
            Object objM2171extends = c7119l2.m2171extends(c12611l, i3, andIncrement, null);
            if (objM2171extends == AbstractC14503l.remoteconfig) {
                C8339l.smaato("unexpected");
                return null;
            }
            if (objM2171extends != AbstractC14503l.metrica) {
                if (objM2171extends != AbstractC14503l.vip) {
                    c12611l.loadAd();
                    return objM2171extends;
                }
                c12625l2.f24851l = 1;
                Object objM2176strictfp = c7119l2.m2176strictfp(c12611l, i3, andIncrement, c12625l2);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                return objM2176strictfp == enumC9342l ? enumC9342l : objM2176strictfp;
            }
            if (andIncrement < c7119l2.advert()) {
                c12611l.loadAd();
            }
            c7119l = c7119l2;
            c12611l2 = c12611l;
        }
        return new C14638l(c7119l.startapp());
    }

    public static final C12611l yandex(C7119l c7119l, long j, C12611l c12611l) {
        Object objYandex;
        C7119l c7119l2;
        C12611l c12611l2 = AbstractC14503l.yandex;
        C8679l c8679l = C8679l.f17887l;
        loop0: while (true) {
            objYandex = AbstractC18590l.yandex(c12611l, j, c8679l);
            if (!AbstractC14425l.subs(objYandex)) {
                AbstractC16653l abstractC16653lAdmob = AbstractC14425l.admob(objYandex);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14915l;
                    AbstractC16653l abstractC16653l = (AbstractC16653l) atomicReferenceFieldUpdater.get(c7119l);
                    if (abstractC16653l.f32620l >= abstractC16653lAdmob.f32620l) {
                        break loop0;
                    }
                    if (!abstractC16653lAdmob.isPro()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c7119l, abstractC16653l, abstractC16653lAdmob)) {
                            if (!abstractC16653l.billing()) {
                                break loop0;
                            }
                            abstractC16653l.purchase();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c7119l) == abstractC16653l);
                    if (abstractC16653lAdmob.billing()) {
                        abstractC16653lAdmob.purchase();
                    }
                }
            } else {
                break;
            }
        }
        boolean zSubs = AbstractC14425l.subs(objYandex);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14917l;
        if (zSubs) {
            c7119l.applovin();
            if (c12611l.f32620l * ((long) AbstractC14503l.loadAd) < atomicLongFieldUpdater.get(c7119l)) {
                c12611l.loadAd();
                return null;
            }
        } else {
            C12611l c12611l3 = (C12611l) AbstractC14425l.admob(objYandex);
            long j2 = c12611l3.f32620l;
            if (j2 <= j) {
                return c12611l3;
            }
            long j3 = ((long) AbstractC14503l.loadAd) * j2;
            while (true) {
                long j4 = f14918l.get(c7119l);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    c7119l2 = c7119l;
                    break;
                }
                c7119l2 = c7119l;
                if (f14918l.compareAndSet(c7119l2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                c7119l = c7119l2;
            }
            if (j2 * ((long) AbstractC14503l.loadAd) < atomicLongFieldUpdater.get(c7119l2)) {
                c12611l3.loadAd();
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC14592l
    public final Object Signature(InterfaceC14029l interfaceC14029l) throws Throwable {
        C12611l c12611l;
        Throwable th;
        C12611l c12611l2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14920l;
        C12611l c12611l3 = (C12611l) atomicReferenceFieldUpdater.get(this);
        while (!this.premium()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14917l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = AbstractC14503l.loadAd;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c12611l3.f32620l != j2) {
                C12611l c12611lMetrica = this.metrica(j2, c12611l3);
                if (c12611lMetrica == null) {
                    continue;
                } else {
                    c12611l = c12611lMetrica;
                }
            } else {
                c12611l = c12611l3;
            }
            C7119l c7119l = this;
            Object objM2171extends = c7119l.m2171extends(c12611l, i, andIncrement, null);
            C9676l c9676l = AbstractC14503l.remoteconfig;
            C4236l c4236lAdmob = null;
            if (objM2171extends == c9676l) {
                C8339l.smaato("unexpected");
                return null;
            }
            C9676l c9676l2 = AbstractC14503l.metrica;
            if (objM2171extends == c9676l2) {
                if (andIncrement < c7119l.advert()) {
                    c12611l.loadAd();
                }
                this = c7119l;
                c12611l3 = c12611l;
            } else {
                if (objM2171extends != AbstractC14503l.vip) {
                    c12611l.loadAd();
                    return objM2171extends;
                }
                C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(interfaceC14029l));
                try {
                    Object objM2171extends2 = c7119l.m2171extends(c12611l, i, andIncrement, c2397lYandex);
                    if (objM2171extends2 == c9676l) {
                        c2397lYandex.loadAd(c12611l, i);
                    } else {
                        Function1 function1 = c7119l.f14924l;
                        if (objM2171extends2 == c9676l2) {
                            if (andIncrement < c7119l.advert()) {
                                c12611l.loadAd();
                            }
                            C12611l c12611l4 = (C12611l) atomicReferenceFieldUpdater.get(c7119l);
                            while (true) {
                                if (c7119l.premium()) {
                                    c2397lYandex.subs(new C18435l(c7119l.pro()));
                                } else {
                                    C2397l c2397l = c2397lYandex;
                                    try {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c7119l);
                                        long j3 = AbstractC14503l.loadAd;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (c12611l4.f32620l != j4) {
                                            try {
                                                C12611l c12611lMetrica2 = c7119l.metrica(j4, c12611l4);
                                                if (c12611lMetrica2 == null) {
                                                    c2397lYandex = c2397l;
                                                } else {
                                                    c12611l2 = c12611lMetrica2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c2397lYandex = c2397l;
                                                c2397lYandex.m1133throws();
                                                throw th;
                                            }
                                        } else {
                                            c12611l2 = c12611l4;
                                        }
                                        C7119l c7119l2 = c7119l;
                                        objM2171extends2 = c7119l2.m2171extends(c12611l2, i2, andIncrement2, c2397l);
                                        c7119l = c7119l2;
                                        C12611l c12611l5 = c12611l2;
                                        c2397lYandex = c2397l;
                                        if (objM2171extends2 == AbstractC14503l.remoteconfig) {
                                            c2397lYandex.loadAd(c12611l5, i2);
                                        } else {
                                            if (objM2171extends2 != AbstractC14503l.metrica) {
                                                if (objM2171extends2 == AbstractC14503l.vip) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                c12611l5.loadAd();
                                                if (function1 == null) {
                                                    break;
                                                }
                                                c4236lAdmob = c7119l.admob();
                                                break;
                                            }
                                            if (andIncrement2 < c7119l.advert()) {
                                                c12611l5.loadAd();
                                            }
                                            c12611l4 = c12611l5;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c2397lYandex = c2397l;
                                        th = th;
                                        c2397lYandex.m1133throws();
                                        throw th;
                                    }
                                }
                            }
                            c2397lYandex.remoteconfig(objM2171extends2, c4236lAdmob);
                        } else {
                            c12611l.loadAd();
                            if (function1 != null) {
                                c4236lAdmob = c7119l.admob();
                                break;
                            }
                            c2397lYandex.remoteconfig(objM2171extends2, c4236lAdmob);
                        }
                    }
                    return c2397lYandex.Signature();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thPro = this.pro();
        int i3 = AbstractC15902l.yandex;
        throw thPro;
    }

    public final Throwable ad() {
        Throwable thStartapp = startapp();
        return thStartapp == null ? new C17072l("Channel was closed", 1) : thStartapp;
    }

    public final C12014l adcel() {
        C8528l c8528l = C8528l.f17619l;
        AbstractC9464l.purchase(3, c8528l);
        C2649l c2649l = C2649l.f5754l;
        AbstractC9464l.purchase(3, c2649l);
        return new C12014l(this, c8528l, c2649l, this.f14923l, 23);
    }

    public final C4236l admob() {
        return new C4236l(3, this, C7119l.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 1);
    }

    @Override // defpackage.InterfaceC14592l
    public final void ads(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        firebase(cancellationException, true);
    }

    public final long advert() {
        return f14918l.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0069, please report this as an issue */
    @Override // defpackage.InterfaceC0389l
    public Object amazon(Object obj) {
        int iMopub;
        InterfaceC15894l interfaceC15894l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14918l;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = signatures(j, false) ? false : !isPro(j & 1152921504606846975L);
        C15230l c15230l = C0381l.loadAd;
        if (z2) {
            return c15230l;
        }
        InterfaceC8396l interfaceC8396l = AbstractC14503l.isPro;
        C12611l c12611l = (C12611l) f14915l.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zSignatures = signatures(andIncrement, z);
            int i = AbstractC14503l.loadAd;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (c12611l.f32620l == j5) {
                iMopub = mopub(this, c12611l, i2, obj, j3, interfaceC8396l, zSignatures);
                if (iMopub != 0) {
                    c12611l.loadAd();
                    return Unit.INSTANCE;
                }
                if (iMopub != 1) {
                    return Unit.INSTANCE;
                }
                if (iMopub != 2) {
                    if (zSignatures) {
                        c12611l.subs();
                        return new C14638l(ad());
                    }
                    interfaceC15894l = interfaceC8396l instanceof InterfaceC15894l ? (InterfaceC15894l) interfaceC8396l : null;
                    if (interfaceC15894l != null) {
                        interfaceC15894l.loadAd(c12611l, i2 + i);
                    }
                    c12611l.subs();
                    return c15230l;
                }
                if (iMopub != 3) {
                    C8339l.smaato("unexpected");
                    return null;
                }
                if (iMopub != 4) {
                    if (j3 < f14917l.get(this)) {
                        c12611l.loadAd();
                    }
                    return new C14638l(ad());
                }
                if (iMopub == 5) {
                    c12611l.loadAd();
                }
                z = false;
            } else {
                C12611l c12611lYandex = yandex(this, j5, c12611l);
                if (c12611lYandex != null) {
                    c12611l = c12611lYandex;
                    iMopub = mopub(this, c12611l, i2, obj, j3, interfaceC8396l, zSignatures);
                    if (iMopub != 0) {
                        c12611l.loadAd();
                        return Unit.INSTANCE;
                    }
                    if (iMopub != 1) {
                        return Unit.INSTANCE;
                    }
                    if (iMopub != 2) {
                        if (zSignatures) {
                            c12611l.subs();
                            return new C14638l(ad());
                        }
                        if (interfaceC8396l instanceof InterfaceC15894l) {
                        }
                        if (interfaceC15894l != null) {
                            interfaceC15894l.loadAd(c12611l, i2 + i);
                        }
                        c12611l.subs();
                        return c15230l;
                    }
                    if (iMopub != 3) {
                        C8339l.smaato("unexpected");
                        return null;
                    }
                    if (iMopub != 4) {
                        if (j3 < f14917l.get(this)) {
                            c12611l.loadAd();
                        }
                        return new C14638l(ad());
                    }
                    if (iMopub == 5) {
                        c12611l.loadAd();
                    }
                    z = false;
                } else {
                    if (zSignatures) {
                        return new C14638l(ad());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    public final boolean applovin() {
        return signatures(f14918l.get(this), false);
    }

    public boolean appmetrica() {
        return false;
    }

    @Override // defpackage.InterfaceC0389l
    public final boolean crashlytics(Throwable th) {
        return firebase(th, false);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final Object m2171extends(C12611l c12611l, int i, long j, Object obj) {
        Object objSmaato = c12611l.smaato(i);
        AtomicReferenceArray atomicReferenceArray = c12611l.f24840l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14918l;
        if (objSmaato == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC14503l.vip;
                }
                if (c12611l.firebase(i, objSmaato, obj)) {
                    vip();
                    return AbstractC14503l.remoteconfig;
                }
            }
        } else if (objSmaato == AbstractC14503l.amazon && c12611l.firebase(i, objSmaato, AbstractC14503l.subs)) {
            vip();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c12611l.vip(i, null);
            return obj2;
        }
        while (true) {
            Object objSmaato2 = c12611l.smaato(i);
            if (objSmaato2 == null || objSmaato2 == AbstractC14503l.purchase) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c12611l.firebase(i, objSmaato2, AbstractC14503l.admob)) {
                        vip();
                        return AbstractC14503l.metrica;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC14503l.vip;
                    }
                    if (c12611l.firebase(i, objSmaato2, obj)) {
                        vip();
                        return AbstractC14503l.remoteconfig;
                    }
                }
            } else if (objSmaato2 != AbstractC14503l.amazon) {
                C9676l c9676l = AbstractC14503l.isPro;
                if (objSmaato2 == c9676l) {
                    return AbstractC14503l.metrica;
                }
                if (objSmaato2 == AbstractC14503l.admob) {
                    return AbstractC14503l.metrica;
                }
                if (objSmaato2 == AbstractC14503l.smaato) {
                    vip();
                    return AbstractC14503l.metrica;
                }
                if (objSmaato2 != AbstractC14503l.mopub && c12611l.firebase(i, objSmaato2, AbstractC14503l.billing)) {
                    boolean z = objSmaato2 instanceof C4399l;
                    if (z) {
                        objSmaato2 = ((C4399l) objSmaato2).yandex;
                    }
                    if (m2175private(objSmaato2, c12611l, i)) {
                        c12611l.metrica(i, AbstractC14503l.subs);
                        vip();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c12611l.vip(i, null);
                        return obj3;
                    }
                    c12611l.metrica(i, c9676l);
                    c12611l.subs();
                    if (z) {
                        vip();
                    }
                    return AbstractC14503l.metrica;
                }
            } else if (c12611l.firebase(i, objSmaato2, AbstractC14503l.subs)) {
                vip();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c12611l.vip(i, null);
                return obj4;
            }
        }
    }

    public final boolean firebase(Throwable th, boolean z) {
        C7119l c7119l;
        boolean z2;
        long j;
        long j2;
        Object obj;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14918l;
        if (!z) {
            c7119l = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                c7119l = this;
                break;
            }
            C12611l c12611l = AbstractC14503l.yandex;
            c7119l = this;
            if (atomicLongFieldUpdater.compareAndSet(c7119l, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = c7119l;
        }
        C9676l c9676l = AbstractC14503l.subscription;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14922l;
            if (atomicReferenceFieldUpdater.compareAndSet(c7119l, c9676l, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(c7119l) != c9676l) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c7119l);
            } while (!atomicLongFieldUpdater.compareAndSet(c7119l, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c7119l);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c7119l, j, j2));
        }
        c7119l.applovin();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14919l;
                obj = atomicReferenceFieldUpdater2.get(c7119l);
                C9676l c9676l2 = obj == null ? AbstractC14503l.adcel : AbstractC14503l.ads;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(c7119l, obj, c9676l2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(c7119l) == obj);
            }
            if (obj != null) {
                AbstractC9464l.purchase(1, obj);
                ((Function1) obj).invoke(c7119l.startapp());
                return z2;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final int m2172for(C12611l c12611l, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objSmaato = c12611l.smaato(i);
            if (objSmaato == null) {
                if (!isPro(j) || z) {
                    if (z) {
                        if (c12611l.firebase(i, null, AbstractC14503l.isPro)) {
                            c12611l.subs();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c12611l.firebase(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c12611l.firebase(i, null, AbstractC14503l.amazon)) {
                    break;
                }
            } else {
                if (objSmaato != AbstractC14503l.purchase) {
                    C9676l c9676l = AbstractC14503l.firebase;
                    if (objSmaato == c9676l) {
                        c12611l.vip(i, null);
                        return 5;
                    }
                    if (objSmaato == AbstractC14503l.admob) {
                        c12611l.vip(i, null);
                        return 5;
                    }
                    if (objSmaato == AbstractC14503l.smaato) {
                        c12611l.vip(i, null);
                        applovin();
                        return 4;
                    }
                    c12611l.vip(i, null);
                    if (objSmaato instanceof C4399l) {
                        objSmaato = ((C4399l) objSmaato).yandex;
                    }
                    if (m2173native(objSmaato, obj)) {
                        c12611l.metrica(i, AbstractC14503l.subs);
                        return 0;
                    }
                    if (c12611l.f24840l.getAndSet((i * 2) + 1, c9676l) != c9676l) {
                        c12611l.remoteconfig(i, true);
                    }
                    return 5;
                }
                if (c12611l.firebase(i, objSmaato, AbstractC14503l.amazon)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final boolean inmobi() {
        long j = f14921l.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final boolean isPro(long j) {
        return j < f14921l.get(this) || j < f14917l.get(this) + ((long) this.f14925l);
    }

    @Override // defpackage.InterfaceC14592l
    public final C17629l iterator() {
        return new C17629l(this);
    }

    @Override // defpackage.InterfaceC14592l
    public final Object license(AbstractC5563l abstractC5563l) {
        return m2170synchronized(this, abstractC5563l);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c A[RETURN] */
    @Override // defpackage.InterfaceC0389l
    public Object loadAd(InterfaceC14029l interfaceC14029l, Object obj) {
        Object objSignature;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14915l;
        C12611l c12611l = (C12611l) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14918l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zSignatures = signatures(andIncrement, false);
            int i = AbstractC14503l.loadAd;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = c12611l.f32620l;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (j4 != j3) {
                C12611l c12611lYandex = yandex(this, j3, c12611l);
                if (c12611lYandex != null) {
                    c12611l = c12611lYandex;
                } else if (zSignatures) {
                    Object objM2174package = m2174package(interfaceC14029l, obj);
                    if (objM2174package != enumC9342l) {
                        break;
                    }
                    return objM2174package;
                }
            }
            int iMopub = mopub(this, c12611l, i2, obj, j, null, zSignatures);
            if (iMopub == 0) {
                c12611l.loadAd();
                break;
            }
            if (iMopub != 1) {
                if (iMopub == 2) {
                    if (!zSignatures) {
                        break;
                    }
                    c12611l.subs();
                    Object objM2174package2 = m2174package(interfaceC14029l, obj);
                    if (objM2174package2 != enumC9342l) {
                        break;
                    }
                    return objM2174package2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14917l;
                if (iMopub == 3) {
                    C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(interfaceC14029l));
                    try {
                        int iMopub2 = mopub(this, c12611l, i2, obj, j, c2397lYandex, false);
                        if (iMopub2 != 0) {
                            if (iMopub2 != 1) {
                                if (iMopub2 != 2) {
                                    if (iMopub2 != 4) {
                                        String str = "unexpected";
                                        if (iMopub2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c12611l.loadAd();
                                        C12611l c12611l2 = (C12611l) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zSignatures2 = signatures(andIncrement2, false);
                                            int i3 = AbstractC14503l.loadAd;
                                            str = str;
                                            long j6 = i3;
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            long j7 = j5 / j6;
                                            int i4 = (int) (j5 % j6);
                                            if (c12611l2.f32620l != j7) {
                                                C12611l c12611lYandex2 = yandex(this, j7, c12611l2);
                                                if (c12611lYandex2 != null) {
                                                    c12611l2 = c12611lYandex2;
                                                } else if (zSignatures2) {
                                                }
                                            }
                                            int iMopub3 = mopub(this, c12611l2, i4, obj, j5, c2397lYandex, zSignatures2);
                                            if (iMopub3 == 0) {
                                                c12611l2.loadAd();
                                            } else if (iMopub3 != 1) {
                                                if (iMopub3 == 2) {
                                                    if (!zSignatures2) {
                                                        c2397lYandex.loadAd(c12611l2, i4 + i3);
                                                        break;
                                                    }
                                                    c12611l2.subs();
                                                } else {
                                                    if (iMopub3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iMopub3 != 4) {
                                                        if (iMopub3 == 5) {
                                                            c12611l2.loadAd();
                                                        }
                                                    } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                        c12611l2.loadAd();
                                                    }
                                                }
                                            }
                                        }
                                    } else if (j < atomicLongFieldUpdater2.get(this)) {
                                        c12611l.loadAd();
                                    }
                                    purchase(this, obj, c2397lYandex);
                                    break;
                                } else {
                                    c2397lYandex.loadAd(c12611l, i2 + i);
                                }
                            }
                            objSignature = c2397lYandex.Signature();
                            if (objSignature != enumC9342l) {
                                objSignature = Unit.INSTANCE;
                            }
                            if (objSignature == enumC9342l) {
                                break;
                            }
                            return objSignature;
                        }
                        c12611l.loadAd();
                        c2397lYandex.subs(Unit.INSTANCE);
                        objSignature = c2397lYandex.Signature();
                        if (objSignature != enumC9342l) {
                            objSignature = Unit.INSTANCE;
                        }
                        if (objSignature == enumC9342l) {
                            break;
                        }
                        return objSignature;
                    } catch (Throwable th) {
                        c2397lYandex.m1133throws();
                        throw th;
                    }
                }
                if (iMopub == 4) {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        c12611l.loadAd();
                    }
                    Object objM2174package3 = m2174package(interfaceC14029l, obj);
                    if (objM2174package3 != enumC9342l) {
                        break;
                    }
                    return objM2174package3;
                }
                if (iMopub == 5) {
                    c12611l.loadAd();
                }
            } else {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    public final C12611l metrica(long j, C12611l c12611l) {
        Object objYandex;
        C7119l c7119l;
        C12611l c12611l2 = AbstractC14503l.yandex;
        C8679l c8679l = C8679l.f17887l;
        loop0: while (true) {
            objYandex = AbstractC18590l.yandex(c12611l, j, c8679l);
            if (!AbstractC14425l.subs(objYandex)) {
                AbstractC16653l abstractC16653lAdmob = AbstractC14425l.admob(objYandex);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14920l;
                    AbstractC16653l abstractC16653l = (AbstractC16653l) atomicReferenceFieldUpdater.get(this);
                    if (abstractC16653l.f32620l >= abstractC16653lAdmob.f32620l) {
                        break loop0;
                    }
                    if (!abstractC16653lAdmob.isPro()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC16653l, abstractC16653lAdmob)) {
                            if (!abstractC16653l.billing()) {
                                break loop0;
                            }
                            abstractC16653l.purchase();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC16653l);
                    if (abstractC16653lAdmob.billing()) {
                        abstractC16653lAdmob.purchase();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC14425l.subs(objYandex)) {
            applovin();
            if (c12611l.f32620l * ((long) AbstractC14503l.loadAd) < advert()) {
                c12611l.loadAd();
                return null;
            }
        } else {
            C12611l c12611l3 = (C12611l) AbstractC14425l.admob(objYandex);
            long j2 = c12611l3.f32620l;
            if (!inmobi() && j <= f14921l.get(this) / ((long) AbstractC14503l.loadAd)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14916l;
                    AbstractC16653l abstractC16653l2 = (AbstractC16653l) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC16653l2.f32620l >= j2 || !c12611l3.isPro()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC16653l2, c12611l3)) {
                            if (!abstractC16653l2.billing()) {
                                break loop3;
                            }
                            abstractC16653l2.purchase();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == abstractC16653l2);
                    if (c12611l3.billing()) {
                        c12611l3.purchase();
                    }
                }
            }
            if (j2 <= j) {
                return c12611l3;
            }
            long j3 = j2 * ((long) AbstractC14503l.loadAd);
            while (true) {
                long j4 = f14917l.get(this);
                if (j4 >= j3) {
                    c7119l = this;
                    break;
                }
                c7119l = this;
                if (f14917l.compareAndSet(c7119l, j4, j3)) {
                    break;
                }
                this = c7119l;
            }
            if (j2 * ((long) AbstractC14503l.loadAd) < c7119l.advert()) {
                c12611l3.loadAd();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean m2173native(Object obj, Object obj2) {
        if (obj instanceof C2671l) {
            return ((C2671l) obj).subs(this, obj2);
        }
        boolean z = obj instanceof C15936l;
        Function1 function1 = this.f14924l;
        if (z) {
            return AbstractC14503l.yandex(((C15936l) obj).f31280l, new C0381l(obj2), function1 != null ? subs() : null);
        }
        if (!(obj instanceof C17629l)) {
            if (obj instanceof InterfaceC4305l) {
                return AbstractC14503l.yandex((InterfaceC4305l) obj, obj2, function1 != null ? admob() : null);
            }
            C17132l.metrica(obj, "Unexpected receiver type: ");
            return false;
        }
        C17629l c17629l = (C17629l) obj;
        C2397l c2397l = c17629l.f34312l;
        c17629l.f34312l = null;
        c17629l.f34313l = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function2 = c17629l.f34311l.f14924l;
        return AbstractC14503l.yandex(c2397l, bool, function2 != null ? new C7442l(function2, obj2, 11) : null);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Object m2174package(InterfaceC14029l interfaceC14029l, Object obj) {
        C6451l c6451lCrashlytics;
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        Function1 function1 = this.f14924l;
        if (function1 == null || (c6451lCrashlytics = AbstractC16829l.crashlytics(function1, obj, null)) == null) {
            c2397l.subs(new C18435l(ad()));
        } else {
            AbstractC11718l.yandex(c6451lCrashlytics, ad());
            c2397l.subs(new C18435l(c6451lCrashlytics));
        }
        Object objSignature = c2397l.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    public final boolean premium() {
        return signatures(f14918l.get(this), true);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean m2175private(Object obj, C12611l c12611l, int i) {
        char c;
        if (obj instanceof InterfaceC4305l) {
            return AbstractC14503l.yandex((InterfaceC4305l) obj, Unit.INSTANCE, null);
        }
        if (!(obj instanceof C2671l)) {
            C17132l.metrica(obj, "Unexpected waiter: ");
            return false;
        }
        int iIsPro = ((C2671l) obj).isPro(this, Unit.INSTANCE);
        if (iIsPro == 0) {
            c = 1;
        } else if (iIsPro != 1) {
            c = 3;
            if (iIsPro != 2) {
                if (iIsPro != 3) {
                    C11983l.billing(iIsPro, "Unexpected internal result: ");
                    return false;
                }
                c = 4;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            c12611l.vip(i, null);
        }
        return c == 1;
    }

    public final Throwable pro() {
        Throwable thStartapp = startapp();
        return thStartapp == null ? new C15207l("Channel was closed") : thStartapp;
    }

    public final void remoteconfig(long j) {
        C6451l c6451lCrashlytics;
        C12611l c12611l = (C12611l) f14920l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14917l;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f14925l) + j2, f14921l.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = AbstractC14503l.loadAd;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c12611l.f32620l != j4) {
                    C12611l c12611lMetrica = this.metrica(j4, c12611l);
                    if (c12611lMetrica != null) {
                        c12611l = c12611lMetrica;
                    }
                }
                C12611l c12611l2 = c12611l;
                Object objM2171extends = this.m2171extends(c12611l2, i, j2, null);
                if (objM2171extends != AbstractC14503l.metrica) {
                    c12611l2.loadAd();
                    Function1 function1 = this.f14924l;
                    if (function1 != null && (c6451lCrashlytics = AbstractC16829l.crashlytics(function1, objM2171extends, null)) != null) {
                        throw c6451lCrashlytics;
                    }
                } else if (j2 < this.advert()) {
                    c12611l2.loadAd();
                }
                c12611l = c12611l2;
            }
        }
    }

    public final boolean signatures(long j, boolean z) {
        boolean z2;
        boolean z3;
        C7119l c7119l = this;
        int i = (int) (j >> 60);
        if (i != 0) {
            boolean z4 = true;
            if (i != 1) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f14917l;
                if (i == 2) {
                    z2 = true;
                    c7119l.smaato(j & 1152921504606846975L);
                    if (z) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14920l;
                            C12611l c12611lMetrica = (C12611l) atomicReferenceFieldUpdater.get(c7119l);
                            long j2 = atomicLongFieldUpdater.get(c7119l);
                            if (c7119l.advert() <= j2) {
                                break;
                            }
                            long j3 = AbstractC14503l.loadAd;
                            long j4 = j2 / j3;
                            if (c12611lMetrica.f32620l != j4 && (c12611lMetrica = c7119l.metrica(j4, c12611lMetrica)) == null) {
                                if (((C12611l) atomicReferenceFieldUpdater.get(c7119l)).f32620l < j4) {
                                    break;
                                }
                            } else {
                                c12611lMetrica.loadAd();
                                int i2 = (int) (j2 % j3);
                                while (true) {
                                    Object objSmaato = c12611lMetrica.smaato(i2);
                                    if (objSmaato != null && objSmaato != AbstractC14503l.purchase) {
                                        if (objSmaato != AbstractC14503l.amazon && (objSmaato == AbstractC14503l.isPro || objSmaato == AbstractC14503l.smaato || objSmaato == AbstractC14503l.subs || objSmaato == AbstractC14503l.admob || (objSmaato != AbstractC14503l.mopub && (objSmaato == AbstractC14503l.billing || j2 != atomicLongFieldUpdater.get(c7119l))))) {
                                            break;
                                            break;
                                            break;
                                            break;
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (c12611lMetrica.firebase(i2, objSmaato, AbstractC14503l.admob)) {
                                            c7119l.vip();
                                            break;
                                        }
                                        c7119l = this;
                                    }
                                }
                                f14917l.compareAndSet(c7119l, j2, 1 + j2);
                                c7119l = this;
                            }
                        }
                    }
                } else {
                    if (i != 3) {
                        C8936l.subs(AbstractC0653l.vip(i, "unexpected close status: "));
                        return false;
                    }
                    C12611l c12611lSmaato = c7119l.smaato(j & 1152921504606846975L);
                    C6451l c6451lCrashlytics = null;
                    Object objAdmob = null;
                    loop0: while (true) {
                        AtomicReferenceArray atomicReferenceArray = c12611lSmaato.f24840l;
                        int i3 = AbstractC14503l.loadAd - (z4 ? 1 : 0);
                        while (true) {
                            if (-1 < i3) {
                                long j5 = (c12611lSmaato.f32620l * ((long) AbstractC14503l.loadAd)) + ((long) i3);
                                while (true) {
                                    Object objSmaato2 = c12611lSmaato.smaato(i3);
                                    if (objSmaato2 != AbstractC14503l.subs) {
                                        C9676l c9676l = AbstractC14503l.amazon;
                                        Function1 function1 = c7119l.f14924l;
                                        if (objSmaato2 == c9676l) {
                                            if (j5 >= atomicLongFieldUpdater.get(c7119l)) {
                                                if (c12611lSmaato.firebase(i3, objSmaato2, AbstractC14503l.smaato)) {
                                                    if (function1 != null) {
                                                        c6451lCrashlytics = AbstractC16829l.crashlytics(function1, atomicReferenceArray.get(i3 * 2), c6451lCrashlytics);
                                                    }
                                                    c12611lSmaato.vip(i3, null);
                                                    c12611lSmaato.subs();
                                                    z3 = z4 ? 1 : 0;
                                                    i3--;
                                                    z4 = z3;
                                                }
                                            }
                                        } else if (objSmaato2 == AbstractC14503l.purchase || objSmaato2 == null) {
                                            z3 = z4 ? 1 : 0;
                                            if (c12611lSmaato.firebase(i3, objSmaato2, AbstractC14503l.smaato)) {
                                                c12611lSmaato.subs();
                                                i3--;
                                                z4 = z3;
                                            }
                                            z4 = z3;
                                        } else if (!(objSmaato2 instanceof InterfaceC15894l) && !(objSmaato2 instanceof C4399l)) {
                                            C9676l c9676l2 = AbstractC14503l.mopub;
                                            if (objSmaato2 != c9676l2 && objSmaato2 != AbstractC14503l.billing) {
                                                if (objSmaato2 != c9676l2) {
                                                    z3 = z4 ? 1 : 0;
                                                    i3--;
                                                    z4 = z3;
                                                }
                                            }
                                        } else if (j5 >= atomicLongFieldUpdater.get(c7119l)) {
                                            InterfaceC15894l interfaceC15894l = objSmaato2 instanceof C4399l ? ((C4399l) objSmaato2).yandex : (InterfaceC15894l) objSmaato2;
                                            z3 = z4 ? 1 : 0;
                                            if (c12611lSmaato.firebase(i3, objSmaato2, AbstractC14503l.smaato)) {
                                                if (function1 != null) {
                                                    c6451lCrashlytics = AbstractC16829l.crashlytics(function1, atomicReferenceArray.get(i3 * 2), c6451lCrashlytics);
                                                }
                                                objAdmob = AbstractC15901l.admob(objAdmob, interfaceC15894l);
                                                c12611lSmaato.vip(i3, null);
                                                c12611lSmaato.subs();
                                                i3--;
                                                z4 = z3;
                                            }
                                            z4 = z3;
                                        }
                                    }
                                    z2 = z4 ? 1 : 0;
                                    break loop0;
                                }
                            }
                            z2 = z4;
                            c12611lSmaato = (C12611l) ((AbstractC6369l) AbstractC6369l.f13341l.get(c12611lSmaato));
                            if (c12611lSmaato == null) {
                                break;
                            }
                            z4 = z2 ? 1 : 0;
                        }
                    }
                    if (objAdmob != null) {
                        if (objAdmob instanceof ArrayList) {
                            ArrayList arrayList = (ArrayList) objAdmob;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                c7119l.m2179volatile((InterfaceC15894l) arrayList.get(size), false);
                            }
                        } else {
                            c7119l.m2179volatile((InterfaceC15894l) objAdmob, false);
                        }
                    }
                    if (c6451lCrashlytics != null) {
                        throw c6451lCrashlytics;
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public final C12611l smaato(long j) {
        Object objAdmob;
        long j2;
        Object obj = f14916l.get(this);
        C12611l c12611l = (C12611l) f14915l.get(this);
        if (c12611l.f32620l > ((C12611l) obj).f32620l) {
            obj = c12611l;
        }
        C12611l c12611l2 = (C12611l) f14920l.get(this);
        if (c12611l2.f32620l > ((C12611l) obj).f32620l) {
            obj = c12611l2;
        }
        AbstractC6369l abstractC6369l = (AbstractC6369l) obj;
        loop0: while (true) {
            abstractC6369l.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC6369l.f13342l;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC6369l);
            objAdmob = null;
            C9676l c9676l = AbstractC18590l.yandex;
            if (obj2 == c9676l) {
                break;
            }
            AbstractC6369l abstractC6369l2 = (AbstractC6369l) obj2;
            if (abstractC6369l2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC6369l, null, c9676l)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC6369l) == null);
            } else {
                abstractC6369l = abstractC6369l2;
            }
        }
        C12611l c12611l3 = (C12611l) abstractC6369l;
        if (appmetrica()) {
            C12611l c12611l4 = c12611l3;
            loop2: while (true) {
                int i = AbstractC14503l.loadAd - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (c12611l4.f32620l * ((long) AbstractC14503l.loadAd)) + ((long) i);
                        if (j2 >= f14917l.get(this)) {
                            while (true) {
                                Object objSmaato = c12611l4.smaato(i);
                                if (objSmaato != null && objSmaato != AbstractC14503l.purchase) {
                                    if (objSmaato != AbstractC14503l.amazon) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c12611l4.firebase(i, objSmaato, AbstractC14503l.smaato)) {
                                    c12611l4.subs();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        c12611l4 = (C12611l) ((AbstractC6369l) AbstractC6369l.f13341l.get(c12611l4));
                        if (c12611l4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                remoteconfig(j2);
            }
        }
        loop5: for (C12611l c12611l5 = c12611l3; c12611l5 != null; c12611l5 = (C12611l) ((AbstractC6369l) AbstractC6369l.f13341l.get(c12611l5))) {
            for (int i2 = AbstractC14503l.loadAd - 1; -1 < i2; i2--) {
                if ((c12611l5.f32620l * ((long) AbstractC14503l.loadAd)) + ((long) i2) < j) {
                    break loop5;
                }
                while (true) {
                    Object objSmaato2 = c12611l5.smaato(i2);
                    if (objSmaato2 != null && objSmaato2 != AbstractC14503l.purchase) {
                        if (!(objSmaato2 instanceof C4399l)) {
                            if (!(objSmaato2 instanceof InterfaceC15894l)) {
                                break;
                            }
                            if (c12611l5.firebase(i2, objSmaato2, AbstractC14503l.smaato)) {
                                objAdmob = AbstractC15901l.admob(objAdmob, objSmaato2);
                                c12611l5.remoteconfig(i2, true);
                                break;
                            }
                        } else {
                            if (c12611l5.firebase(i2, objSmaato2, AbstractC14503l.smaato)) {
                                objAdmob = AbstractC15901l.admob(objAdmob, ((C4399l) objSmaato2).yandex);
                                c12611l5.remoteconfig(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c12611l5.firebase(i2, objSmaato2, AbstractC14503l.smaato)) {
                            c12611l5.subs();
                            break;
                        }
                    }
                }
            }
        }
        if (objAdmob != null) {
            if (!(objAdmob instanceof ArrayList)) {
                m2179volatile((InterfaceC15894l) objAdmob, true);
                return c12611l3;
            }
            ArrayList arrayList = (ArrayList) objAdmob;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m2179volatile((InterfaceC15894l) arrayList.get(size), true);
            }
        }
        return c12611l3;
    }

    public final Throwable startapp() {
        return (Throwable) f14922l.get(this);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[Catch: all -> 0x0050, PHI: r10
  0x00d0: PHI (r10v5 lؑ٘ٚ) = (r10v3 lؑ٘ٚ), (r10v13 lؑ٘ٚ) binds: [B:55:0x00e8, B:49:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0050, blocks: (B:15:0x003a, B:17:0x004b, B:20:0x0054, B:23:0x005a, B:25:0x0062, B:26:0x0065, B:27:0x006d, B:29:0x0073, B:30:0x0086, B:32:0x009a, B:37:0x00a4, B:39:0x00ad, B:40:0x00b1, B:42:0x00b5, B:44:0x00bd, B:46:0x00c2, B:48:0x00c6, B:50:0x00d0, B:51:0x00d4, B:52:0x00d8, B:53:0x00df, B:54:0x00e0), top: B:64:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Object m2176strictfp(C12611l c12611l, int i, long j, AbstractC0283l abstractC0283l) {
        C9730l c9730l;
        C0381l c0381l;
        C12611l c12611l2;
        if (abstractC0283l instanceof C9730l) {
            c9730l = (C9730l) abstractC0283l;
            int i2 = c9730l.f19854l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9730l.f19854l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9730l = new C9730l(this, abstractC0283l);
            }
        } else {
            c9730l = new C9730l(this, abstractC0283l);
        }
        Object objSignature = c9730l.f19853l;
        int i3 = c9730l.f19854l;
        C4236l c4236lSubs = null;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objSignature);
            c9730l.f19854l = 1;
            C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(c9730l));
            try {
                C15936l c15936l = new C15936l(c2397lYandex);
                Object objM2171extends = m2171extends(c12611l, i, j, c15936l);
                if (objM2171extends == AbstractC14503l.remoteconfig) {
                    c15936l.loadAd(c12611l, i);
                } else {
                    Object obj = AbstractC14503l.metrica;
                    Function1 function1 = this.f14924l;
                    if (objM2171extends == obj) {
                        if (j < advert()) {
                            c12611l.loadAd();
                        }
                        C12611l c12611l3 = (C12611l) f14920l.get(this);
                        while (true) {
                            if (premium()) {
                                c2397lYandex.subs(new C0381l(new C14638l(startapp())));
                            } else {
                                long andIncrement = f14917l.getAndIncrement(this);
                                long j2 = AbstractC14503l.loadAd;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (c12611l3.f32620l != j3) {
                                    C12611l c12611lMetrica = metrica(j3, c12611l3);
                                    if (c12611lMetrica != null) {
                                        c12611l2 = c12611lMetrica;
                                    }
                                } else {
                                    c12611l2 = c12611l3;
                                }
                                Object objM2171extends2 = m2171extends(c12611l2, i4, andIncrement, c15936l);
                                C12611l c12611l4 = c12611l2;
                                if (objM2171extends2 == AbstractC14503l.remoteconfig) {
                                    c15936l.loadAd(c12611l4, i4);
                                } else if (objM2171extends2 == AbstractC14503l.metrica) {
                                    if (andIncrement < advert()) {
                                        c12611l4.loadAd();
                                    }
                                    c12611l3 = c12611l4;
                                } else {
                                    if (objM2171extends2 == AbstractC14503l.vip) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c12611l4.loadAd();
                                    c0381l = new C0381l(objM2171extends2);
                                    if (function1 != null) {
                                        c4236lSubs = subs();
                                    }
                                    c2397lYandex.remoteconfig(c0381l, c4236lSubs);
                                }
                            }
                        }
                    } else {
                        c12611l.loadAd();
                        c0381l = new C0381l(objM2171extends);
                        if (function1 != null) {
                            c4236lSubs = subs();
                        }
                        c2397lYandex.remoteconfig(c0381l, c4236lSubs);
                    }
                }
                objSignature = c2397lYandex.Signature();
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objSignature == enumC9342l) {
                    return enumC9342l;
                }
            } catch (Throwable th) {
                c2397lYandex.m1133throws();
                throw th;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objSignature);
        }
        return ((C0381l) objSignature).yandex;
    }

    public final C4236l subs() {
        return new C4236l(3, this, C7119l.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 2);
    }

    @Override // defpackage.InterfaceC14592l
    public final C12014l subscription() {
        C6314l c6314l = C6314l.f13262l;
        AbstractC9464l.purchase(3, c6314l);
        C2924l c2924l = C2924l.f6365l;
        AbstractC9464l.purchase(3, c2924l);
        return new C12014l(this, c6314l, c2924l, this.f14923l, 23);
    }

    @Override // defpackage.InterfaceC14592l
    public final Object tapsense() {
        C12611l c12611l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14917l;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f14918l.get(this);
        if (signatures(j2, true)) {
            return new C14638l(startapp());
        }
        long j3 = j2 & 1152921504606846975L;
        C15230l c15230l = C0381l.loadAd;
        if (j >= j3) {
            return c15230l;
        }
        Object obj = AbstractC14503l.firebase;
        C12611l c12611l2 = (C12611l) f14920l.get(this);
        while (!this.premium()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC14503l.loadAd;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c12611l2.f32620l != j5) {
                C12611l c12611lMetrica = this.metrica(j5, c12611l2);
                if (c12611lMetrica == null) {
                    continue;
                } else {
                    c12611l = c12611lMetrica;
                }
            } else {
                c12611l = c12611l2;
            }
            C7119l c7119l = this;
            Object objM2171extends = c7119l.m2171extends(c12611l, i, andIncrement, obj);
            c12611l2 = c12611l;
            if (objM2171extends == AbstractC14503l.remoteconfig) {
                InterfaceC15894l interfaceC15894l = obj instanceof InterfaceC15894l ? (InterfaceC15894l) obj : null;
                if (interfaceC15894l != null) {
                    interfaceC15894l.loadAd(c12611l2, i);
                }
                c7119l.m2177throw(andIncrement);
                c12611l2.subs();
                return c15230l;
            }
            if (objM2171extends != AbstractC14503l.metrica) {
                if (objM2171extends != AbstractC14503l.vip) {
                    c12611l2.loadAd();
                    return objM2171extends;
                }
                C8339l.smaato("unexpected");
                return null;
            }
            if (andIncrement < c7119l.advert()) {
                c12611l2.loadAd();
            }
            this = c7119l;
        }
        return new C14638l(this.startapp());
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m2177throw(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C7119l c7119l = this;
        if (c7119l.inmobi()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f14921l;
            if (atomicLongFieldUpdater.get(c7119l) > j) {
                break;
            } else {
                c7119l = this;
            }
        }
        int i = AbstractC14503l.crashlytics;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14914l;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c7119l);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c7119l)) && j2 == atomicLongFieldUpdater.get(c7119l)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c7119l);
                    if (atomicLongFieldUpdater2.compareAndSet(c7119l, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c7119l = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c7119l);
                    long j5 = atomicLongFieldUpdater2.get(c7119l);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c7119l)) {
                        break;
                    }
                    if (z) {
                        c7119l = this;
                    } else {
                        c7119l = this;
                        atomicLongFieldUpdater2.compareAndSet(c7119l, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c7119l);
                    if (atomicLongFieldUpdater2.compareAndSet(c7119l, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c7119l = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2178throws(long j, C12611l c12611l) {
        C12611l c12611l2;
        C12611l c12611l3;
        while (c12611l.f32620l < j && (c12611l3 = (C12611l) c12611l.crashlytics()) != null) {
            c12611l = c12611l3;
        }
        while (true) {
            if (!c12611l.amazon() || (c12611l2 = (C12611l) c12611l.crashlytics()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14916l;
                    AbstractC16653l abstractC16653l = (AbstractC16653l) atomicReferenceFieldUpdater.get(this);
                    if (abstractC16653l.f32620l >= c12611l.f32620l) {
                        return;
                    }
                    if (!c12611l.isPro()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC16653l, c12611l)) {
                            if (abstractC16653l.billing()) {
                                abstractC16653l.purchase();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC16653l);
                    if (c12611l.billing()) {
                        c12611l.purchase();
                    }
                }
            } else {
                c12611l = c12611l2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f14918l.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f14925l + ',');
        sb.append("data=[");
        int i2 = 0;
        List listRemoteconfig = AbstractC14055l.remoteconfig(f14920l.get(this), f14915l.get(this), f14916l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRemoteconfig) {
            if (((C12611l) obj) != AbstractC14503l.yandex) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C4875l.firebase();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C12611l) next).f32620l;
            do {
                Object next2 = it.next();
                long j2 = ((C12611l) next2).f32620l;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C12611l c12611l = (C12611l) next;
        long j3 = f14917l.get(this);
        long jAdvert = advert();
        loop2: while (true) {
            int i3 = AbstractC14503l.loadAd;
            for (int i4 = i2; i4 < i3; i4++) {
                long j4 = (c12611l.f32620l * ((long) AbstractC14503l.loadAd)) + ((long) i4);
                if (j4 >= jAdvert && j4 >= j3) {
                    break loop2;
                }
                Object objSmaato = c12611l.smaato(i4);
                Object obj2 = c12611l.f24840l.get(i4 * 2);
                if (objSmaato instanceof InterfaceC4305l) {
                    string = (jAdvert > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jAdvert) ? "cont" : "send" : "receive";
                } else if (objSmaato instanceof C2671l) {
                    string = (jAdvert > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jAdvert) ? "select" : "onSend" : "onReceive";
                } else if (objSmaato instanceof C15936l) {
                    string = "receiveCatching";
                } else if (objSmaato instanceof C4399l) {
                    string = "EB(" + objSmaato + ')';
                } else if (AbstractC8576l.yandex(objSmaato, AbstractC14503l.billing) || AbstractC8576l.yandex(objSmaato, AbstractC14503l.mopub)) {
                    string = "resuming_sender";
                } else {
                    if (objSmaato != null && !objSmaato.equals(AbstractC14503l.purchase) && !objSmaato.equals(AbstractC14503l.subs) && !objSmaato.equals(AbstractC14503l.admob) && !objSmaato.equals(AbstractC14503l.firebase) && !objSmaato.equals(AbstractC14503l.isPro) && !objSmaato.equals(AbstractC14503l.smaato)) {
                        string = objSmaato.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            c12611l = (C12611l) c12611l.crashlytics();
            if (c12611l == null) {
                break;
            }
            i2 = 0;
        }
        if (AbstractC12024l.m3320else(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void vip() {
        Object objYandex;
        if (inmobi()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14916l;
        C12611l c12611l = (C12611l) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f14921l.getAndIncrement(this);
            long j = andIncrement / ((long) AbstractC14503l.loadAd);
            if (advert() <= andIncrement) {
                if (c12611l.f32620l < j && c12611l.crashlytics() != null) {
                    m2178throws(j, c12611l);
                }
                isVip(this);
                return;
            }
            if (c12611l.f32620l != j) {
                C8679l c8679l = C8679l.f17887l;
                while (true) {
                    objYandex = AbstractC18590l.yandex(c12611l, j, c8679l);
                    if (!AbstractC14425l.subs(objYandex)) {
                        AbstractC16653l abstractC16653lAdmob = AbstractC14425l.admob(objYandex);
                        while (true) {
                            AbstractC16653l abstractC16653l = (AbstractC16653l) atomicReferenceFieldUpdater.get(this);
                            if (abstractC16653l.f32620l >= abstractC16653lAdmob.f32620l) {
                                break;
                            }
                            if (!abstractC16653lAdmob.isPro()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC16653l, abstractC16653lAdmob)) {
                                    if (!abstractC16653l.billing()) {
                                        break;
                                    }
                                    abstractC16653l.purchase();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC16653l);
                            if (abstractC16653lAdmob.billing()) {
                                abstractC16653lAdmob.purchase();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C12611l c12611l2 = null;
                if (AbstractC14425l.subs(objYandex)) {
                    applovin();
                    m2178throws(j, c12611l);
                    isVip(this);
                } else {
                    C12611l c12611l3 = (C12611l) AbstractC14425l.admob(objYandex);
                    long j2 = c12611l3.f32620l;
                    if (j2 > j) {
                        long j3 = AbstractC14503l.loadAd;
                        if (f14921l.compareAndSet(this, 1 + andIncrement, j2 * j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f14914l;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j2 * j3) - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            isVip(this);
                        }
                    } else {
                        c12611l2 = c12611l3;
                    }
                }
                if (c12611l2 == null) {
                    continue;
                } else {
                    c12611l = c12611l2;
                }
            }
            int i = (int) (andIncrement % ((long) AbstractC14503l.loadAd));
            Object objSmaato = c12611l.smaato(i);
            boolean z = objSmaato instanceof InterfaceC15894l;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14917l;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c12611l.firebase(i, objSmaato, AbstractC14503l.mopub)) {
                while (true) {
                    Object objSmaato2 = c12611l.smaato(i);
                    if (objSmaato2 instanceof InterfaceC15894l) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c12611l.firebase(i, objSmaato2, new C4399l((InterfaceC15894l) objSmaato2))) {
                                isVip(this);
                                return;
                            }
                        } else if (c12611l.firebase(i, objSmaato2, AbstractC14503l.mopub)) {
                            if (!m2175private(objSmaato2, c12611l, i)) {
                                c12611l.metrica(i, AbstractC14503l.isPro);
                                c12611l.subs();
                                break;
                            } else {
                                c12611l.metrica(i, AbstractC14503l.amazon);
                                isVip(this);
                                return;
                            }
                        }
                    } else {
                        if (objSmaato2 == AbstractC14503l.isPro) {
                            break;
                        }
                        if (objSmaato2 == null) {
                            if (c12611l.firebase(i, objSmaato2, AbstractC14503l.purchase)) {
                                isVip(this);
                                return;
                            }
                        } else if (objSmaato2 == AbstractC14503l.amazon || objSmaato2 == AbstractC14503l.admob || objSmaato2 == AbstractC14503l.subs || objSmaato2 == AbstractC14503l.firebase || objSmaato2 == AbstractC14503l.smaato) {
                            isVip(this);
                            return;
                        } else if (objSmaato2 != AbstractC14503l.billing) {
                            C17132l.metrica(objSmaato2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                isVip(this);
            } else if (m2175private(objSmaato, c12611l, i)) {
                c12611l.metrica(i, AbstractC14503l.amazon);
                isVip(this);
                return;
            } else {
                c12611l.metrica(i, AbstractC14503l.isPro);
                c12611l.subs();
                isVip(this);
            }
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m2179volatile(InterfaceC15894l interfaceC15894l, boolean z) {
        if (interfaceC15894l instanceof InterfaceC4305l) {
            ((InterfaceC14029l) interfaceC15894l).subs(new C18435l(z ? pro() : ad()));
            return;
        }
        if (interfaceC15894l instanceof C15936l) {
            ((C15936l) interfaceC15894l).f31280l.subs(new C0381l(new C14638l(startapp())));
            return;
        }
        if (!(interfaceC15894l instanceof C17629l)) {
            if (interfaceC15894l instanceof C2671l) {
                ((C2671l) interfaceC15894l).subs(this, AbstractC14503l.smaato);
                return;
            } else {
                C17132l.metrica(interfaceC15894l, "Unexpected waiter: ");
                return;
            }
        }
        C17629l c17629l = (C17629l) interfaceC15894l;
        C2397l c2397l = c17629l.f34312l;
        c17629l.f34312l = null;
        c17629l.f34313l = AbstractC14503l.smaato;
        Throwable thStartapp = c17629l.f34311l.startapp();
        if (thStartapp == null) {
            c2397l.subs(Boolean.FALSE);
        } else {
            c2397l.subs(new C18435l(thStartapp));
        }
    }
}
