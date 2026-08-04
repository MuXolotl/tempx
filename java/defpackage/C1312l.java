package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lؒۙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1312l extends AbstractC7581l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3399l = AtomicIntegerFieldUpdater.newUpdater(C1312l.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Thread f3400l = Thread.currentThread();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC11791l f3401l;

    public static void smaato(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final void firebase() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3399l;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        smaato(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC11791l interfaceC11791l = this.f3401l;
                if (interfaceC11791l != null) {
                    interfaceC11791l.yandex();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f3399l;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                smaato(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f3400l.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        return true;
    }
}
