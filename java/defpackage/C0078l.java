package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lؑؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0078l extends AbstractC17054l implements InterfaceC9014l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1565l f985l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f986l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f987l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C11879l f988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078l(C1565l c1565l, int i, int i2, C11879l c11879l) {
        super(10);
        this.f985l = c1565l;
        this.f987l = i;
        this.f986l = i2;
        this.f988l = c11879l;
    }

    @Override // defpackage.InterfaceC9014l
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void mo272l(Object obj) throws Exception {
        int i;
        Object obj2;
        EnumC18034l enumC18034l;
        AutoCloseable autoCloseableYandex;
        InterfaceC17771l interfaceC17771l = (InterfaceC17771l) (C14845l.yandex(obj) ? obj : null);
        if (interfaceC17771l != null) {
            if (interfaceC17771l instanceof C9253l) {
                autoCloseableYandex = ((C9253l) interfaceC17771l).yandex();
            } else {
                C9253l c9253l = (C9253l) interfaceC17771l.mo842while(AbstractC18202l.yandex.loadAd(C9253l.class));
                autoCloseableYandex = c9253l != null ? c9253l.yandex() : new C9253l(interfaceC17771l, new C5991l(interfaceC17771l));
            }
            if (!((C9426l) this.f33214l).m3885new(new C14845l(autoCloseableYandex))) {
                if (autoCloseableYandex instanceof AutoCloseable) {
                    autoCloseableYandex.close();
                } else {
                    if (!(autoCloseableYandex instanceof ExecutorService)) {
                        C11983l.crashlytics();
                        return;
                    }
                    AbstractC14238l.subscription((ExecutorService) autoCloseableYandex);
                }
            }
        } else {
            C9426l c9426l = (C9426l) this.f33214l;
            if (C14845l.yandex(obj)) {
                i = 1;
            } else {
                i = obj == null ? 2 : ((C3722l) obj).yandex;
            }
            c9426l.m3885new(new C14845l(new C3722l(i)));
        }
        C11879l c11879l = this.f988l;
        c11879l.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C11879l.loadAd;
        if (atomicIntegerFieldUpdater.decrementAndGet(c11879l) == 0) {
            Iterator it = this.f985l.admob.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            C1565l c1565l = this.f985l;
            EnumC18034l enumC18034l2 = EnumC18034l.f35322l;
            C11879l c11879l2 = c1565l.mopub;
            c11879l2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(c11879l2) != 0) {
                return;
            }
            C11561l c11561l = c1565l.billing;
            do {
                obj2 = c11561l.yandex;
                EnumC18034l enumC18034l3 = (EnumC18034l) obj2;
                int iOrdinal = enumC18034l3.ordinal();
                if (iOrdinal == 0) {
                    enumC18034l = EnumC18034l.f35318l;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + c1565l + "! State is " + enumC18034l3 + ' ');
                    }
                    enumC18034l = enumC18034l2;
                }
            } while (!c11561l.yandex(obj2, enumC18034l));
            Iterator it2 = c1565l.admob.iterator();
            if (it2.hasNext()) {
                throw AbstractC15560l.adcel(it2);
            }
            if (enumC18034l == enumC18034l2) {
                Iterator it3 = c1565l.admob.iterator();
                if (it3.hasNext()) {
                    throw AbstractC15560l.adcel(it3);
                }
            }
        }
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC9814l
    public final void release() throws Exception {
        C9426l c9426l = (C9426l) this.f33214l;
        Object obj = null;
        if (c9426l.mo2155l() && !c9426l.isCancelled()) {
            Object obj2 = ((C14845l) c9426l.m3884native()).yandex;
            if (C14845l.yandex(obj2)) {
                obj = obj2;
            }
        }
        InterfaceC11741l interfaceC11741l = (C9253l) obj;
        if (interfaceC11741l != null) {
            if (interfaceC11741l instanceof AutoCloseable) {
                interfaceC11741l.close();
            } else if (interfaceC11741l instanceof ExecutorService) {
                AbstractC14238l.subscription((ExecutorService) interfaceC11741l);
            } else {
                C11983l.crashlytics();
            }
        }
    }
}
