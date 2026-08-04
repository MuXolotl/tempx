package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: lٕؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15396l implements InterfaceC7987l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f30067l = AtomicLongFieldUpdater.newUpdater(AbstractC15396l.class, "top");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AtomicReferenceArray f30068l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f30069l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f30070l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int[] f30071l;
    private volatile /* synthetic */ long top;

    public AbstractC15396l(int i) {
        if (i <= 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            C10754l.metrica(AbstractC0653l.vip(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f30070l = iHighestOneBit;
        this.f30069l = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f30068l = new AtomicReferenceArray(i2);
        this.f30071l = new int[i2];
    }

    public abstract Object billing();

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (mopub() != null) {
        }
    }

    @Override // defpackage.InterfaceC7987l
    /* JADX INFO: renamed from: lؘْؒ */
    public final void mo2251l(Object obj) {
        AbstractC15396l abstractC15396l;
        vip(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f30069l) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.f30068l;
            while (true) {
                if (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                    abstractC15396l = this;
                    if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                        break;
                    } else {
                        this = abstractC15396l;
                    }
                } else {
                    if (iIdentityHashCode <= 0) {
                        C8339l.metrica("index should be positive");
                        return;
                    }
                    while (true) {
                        long j = this.top;
                        long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.f30071l[iIdentityHashCode] = (int) (4294967295L & j);
                        AbstractC15396l abstractC15396l2 = this;
                        if (f30067l.compareAndSet(abstractC15396l2, j, j2)) {
                            return;
                        } else {
                            this = abstractC15396l2;
                        }
                    }
                }
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = abstractC15396l.f30070l;
            }
            i++;
            this = abstractC15396l;
        }
    }

    public final Object mopub() {
        int i;
        AbstractC15396l abstractC15396l;
        while (true) {
            long j = this.top;
            if (j != 0) {
                long j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    abstractC15396l = this;
                    if (f30067l.compareAndSet(abstractC15396l, j, (j2 << 32) | ((long) this.f30071l[i]))) {
                        break;
                    }
                    this = abstractC15396l;
                }
            }
            i = 0;
            abstractC15396l = this;
            break;
        }
        if (i == 0) {
            return null;
        }
        return abstractC15396l.f30068l.getAndSet(i, null);
    }

    @Override // defpackage.InterfaceC7987l
    /* JADX INFO: renamed from: strictfp */
    public final Object mo2252strictfp() {
        Object objMopub = mopub();
        return objMopub != null ? yandex(objMopub) : billing();
    }

    public void vip(Object obj) {
    }

    public Object yandex(Object obj) {
        return obj;
    }
}
