package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13039l extends AbstractC7581l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25541l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2397l f25542l;

    public /* synthetic */ C13039l(C2397l c2397l, int i) {
        this.f25541l = i;
        this.f25542l = c2397l;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        int i = this.f25541l;
        C2397l c2397l = this.f25542l;
        switch (i) {
            case 0:
                C14750l c14750l = this.f15589l;
                if (c14750l == null) {
                    c14750l = null;
                }
                Throwable thTapsense = c2397l.tapsense(c14750l);
                if (c2397l.applovin()) {
                    C16477l c16477l = (C16477l) c2397l.f5167l;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C16477l.f32207l;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c16477l);
                        C9676l c9676l = AbstractC9853l.loadAd;
                        if (AbstractC8576l.yandex(obj, c9676l)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c16477l, c9676l, thTapsense)) {
                                if (atomicReferenceFieldUpdater.get(c16477l) != c9676l) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c16477l, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c16477l) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c2397l.yandex(thTapsense);
                if (!c2397l.applovin()) {
                    c2397l.ads();
                }
                break;
            default:
                c2397l.subs(Unit.INSTANCE);
                break;
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        switch (this.f25541l) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
