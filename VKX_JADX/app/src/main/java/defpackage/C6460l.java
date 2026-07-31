package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6460l {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16561l f13496l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f13497l;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13491l = AtomicReferenceFieldUpdater.newUpdater(C6460l.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f13494l = AtomicLongFieldUpdater.newUpdater(C6460l.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13493l = AtomicReferenceFieldUpdater.newUpdater(C6460l.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f13495l = AtomicLongFieldUpdater.newUpdater(C6460l.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13492l = AtomicIntegerFieldUpdater.newUpdater(C6460l.class, "_availablePermits$volatile");

    public C6460l(int i, int i2) {
        this.f13497l = i;
        if (i <= 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            C10754l.metrica(AbstractC0653l.vip(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        C0715l c0715l = new C0715l(0L, null, 2);
        this.head$volatile = c0715l;
        this.tail$volatile = c0715l;
        this._availablePermits$volatile = i - i2;
        this.f13496l = new C16561l(16, this);
    }

    public final void amazon() {
        int i;
        Object objYandex;
        boolean zSubs;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13492l;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f13497l;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                C11983l.billing(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13491l;
            C0715l c0715l = (C0715l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f13494l.getAndIncrement(this);
            long j = andIncrement2 / ((long) AbstractC5936l.billing);
            C13992l c13992l = C13992l.f27299l;
            while (true) {
                objYandex = AbstractC18590l.yandex(c0715l, j, c13992l);
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
            C0715l c0715l2 = (C0715l) AbstractC14425l.admob(objYandex);
            c0715l2.loadAd();
            AtomicReferenceArray atomicReferenceArray = c0715l2.f2202l;
            zSubs = false;
            if (c0715l2.f32620l <= j) {
                int i3 = (int) (andIncrement2 % ((long) AbstractC5936l.billing));
                Object andSet = atomicReferenceArray.getAndSet(i3, AbstractC5936l.loadAd);
                if (andSet == null) {
                    int i4 = AbstractC5936l.yandex;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            C9676l c9676l = AbstractC5936l.loadAd;
                            C9676l c9676l2 = AbstractC5936l.amazon;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, c9676l, c9676l2)) {
                                    zSubs = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == c9676l);
                            zSubs = !zSubs;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == AbstractC5936l.crashlytics) {
                            zSubs = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != AbstractC5936l.purchase) {
                    if (andSet instanceof InterfaceC4305l) {
                        InterfaceC4305l interfaceC4305l = (InterfaceC4305l) andSet;
                        C9676l c9676lSmaato = interfaceC4305l.smaato(Unit.INSTANCE, this.f13496l);
                        if (c9676lSmaato != null) {
                            interfaceC4305l.startapp(c9676lSmaato);
                            zSubs = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof C2671l)) {
                            C17132l.metrica(andSet, "unexpected: ");
                            return;
                        }
                        zSubs = ((C2671l) andSet).subs(this, Unit.INSTANCE);
                    }
                }
            }
        } while (!zSubs);
    }

    public final boolean crashlytics(InterfaceC15894l interfaceC15894l) {
        Object objYandex;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13493l;
        C0715l c0715l = (C0715l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f13495l.getAndIncrement(this);
        C2380l c2380l = C2380l.f5146l;
        long j = andIncrement / ((long) AbstractC5936l.billing);
        loop0: while (true) {
            objYandex = AbstractC18590l.yandex(c0715l, j, c2380l);
            if (!AbstractC14425l.subs(objYandex)) {
                AbstractC16653l abstractC16653lAdmob = AbstractC14425l.admob(objYandex);
                while (true) {
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
        C0715l c0715l2 = (C0715l) AbstractC14425l.admob(objYandex);
        AtomicReferenceArray atomicReferenceArray = c0715l2.f2202l;
        int i = (int) (andIncrement % ((long) AbstractC5936l.billing));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC15894l)) {
            if (atomicReferenceArray.get(i) != null) {
                C9676l c9676l = AbstractC5936l.loadAd;
                C9676l c9676l2 = AbstractC5936l.crashlytics;
                while (!atomicReferenceArray.compareAndSet(i, c9676l, c9676l2)) {
                    if (atomicReferenceArray.get(i) != c9676l) {
                        return false;
                    }
                }
                ((InterfaceC4305l) interfaceC15894l).remoteconfig(Unit.INSTANCE, this.f13496l);
                return true;
            }
        }
        interfaceC15894l.loadAd(c0715l2, i);
        return true;
    }

    public final Object loadAd(AbstractC0283l abstractC0283l) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f13492l;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f13497l;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(abstractC0283l));
        try {
            if (!crashlytics(c2397lYandex)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            c2397lYandex.remoteconfig(Unit.INSTANCE, this.f13496l);
                            break;
                        }
                        if (crashlytics(c2397lYandex)) {
                            break;
                        }
                    }
                }
            }
            Object objSignature = c2397lYandex.Signature();
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature != enumC9342l) {
                objSignature = Unit.INSTANCE;
            }
            return objSignature == enumC9342l ? objSignature : Unit.INSTANCE;
        } catch (Throwable th) {
            c2397lYandex.m1133throws();
            throw th;
        }
    }
}
