package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lؘۛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5971l extends C14274l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12574l = AtomicIntegerFieldUpdater.newUpdater(C5971l.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.C14274l, defpackage.C14750l
    public final void isPro(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f12574l;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    AbstractC9853l.yandex(AbstractC17082l.billing(this.f27949l), AbstractC13573l.loadAd(obj));
                    return;
                } else {
                    C8339l.smaato("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // defpackage.C14274l, defpackage.C14750l
    public final void purchase(Object obj) {
        isPro(obj);
    }
}
