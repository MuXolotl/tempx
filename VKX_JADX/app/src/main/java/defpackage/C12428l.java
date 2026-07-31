package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؙؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12428l extends AbstractC13762l implements InterfaceC14592l, InterfaceC2262l, InterfaceC0389l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7119l f24537l;

    public C12428l(InterfaceC12932l interfaceC12932l, C7119l c7119l) {
        super(interfaceC12932l, true);
        this.f24537l = c7119l;
    }

    @Override // defpackage.InterfaceC14592l
    public final Object Signature(InterfaceC14029l interfaceC14029l) {
        return this.f24537l.Signature(interfaceC14029l);
    }

    @Override // defpackage.C14750l
    public final void ad(Throwable th) {
        CancellationException c0390l = th instanceof CancellationException ? (CancellationException) th : null;
        if (c0390l == null) {
            c0390l = new C0390l(premium(), th, this);
        }
        this.f24537l.firebase(c0390l, true);
        pro(c0390l);
    }

    @Override // defpackage.C14750l, defpackage.InterfaceC7042l
    public final void ads(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0390l(premium(), null, this);
        }
        ad(cancellationException);
    }

    @Override // defpackage.InterfaceC0389l
    public final Object amazon(Object obj) {
        return this.f24537l.amazon(obj);
    }

    @Override // defpackage.InterfaceC0389l
    public final boolean crashlytics(Throwable th) {
        return this.f24537l.firebase(th, false);
    }

    @Override // defpackage.InterfaceC14592l
    public final C17629l iterator() {
        C7119l c7119l = this.f24537l;
        c7119l.getClass();
        return new C17629l(c7119l);
    }

    @Override // defpackage.InterfaceC14592l
    public final Object license(AbstractC5563l abstractC5563l) {
        C7119l c7119l = this.f24537l;
        c7119l.getClass();
        return C7119l.m2170synchronized(c7119l, abstractC5563l);
    }

    @Override // defpackage.InterfaceC0389l
    public final Object loadAd(InterfaceC14029l interfaceC14029l, Object obj) {
        return this.f24537l.loadAd(interfaceC14029l, obj);
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final void m3383l(C2558l c2558l) {
        C7119l c7119l = this.f24537l;
        c7119l.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7119l.f14919l;
        while (!atomicReferenceFieldUpdater.compareAndSet(c7119l, null, c2558l)) {
            if (atomicReferenceFieldUpdater.get(c7119l) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c7119l);
                    C9676l c9676l = AbstractC14503l.adcel;
                    if (obj != c9676l) {
                        if (obj == AbstractC14503l.ads) {
                            C8339l.smaato("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            C17132l.metrica(obj, "Another handler is already registered: ");
                            return;
                        }
                    }
                    C9676l c9676l2 = AbstractC14503l.ads;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c7119l, c9676l, c9676l2)) {
                            c2558l.invoke(c7119l.startapp());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(c7119l) == c9676l);
                }
            }
        }
    }

    @Override // defpackage.AbstractC13762l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final void mo2319l(Object obj) {
        this.f24537l.crashlytics(null);
    }

    @Override // defpackage.AbstractC13762l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final void mo2320l(Throwable th, boolean z) {
        if (this.f24537l.firebase(th, false) || z) {
            return;
        }
        AbstractC11738l.loadAd(this.f26857l, th);
    }

    @Override // defpackage.InterfaceC14592l
    public final C12014l subscription() {
        return this.f24537l.subscription();
    }

    @Override // defpackage.InterfaceC14592l
    public final Object tapsense() {
        return this.f24537l.tapsense();
    }
}
