package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؚۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7590l extends AbstractC1030l {
    public final AtomicReference yandex = new AtomicReference(null);

    @Override // defpackage.AbstractC1030l
    public final InterfaceC14029l[] loadAd(AbstractC4443l abstractC4443l) {
        this.yandex.set(null);
        return AbstractC9905l.yandex;
    }

    @Override // defpackage.AbstractC1030l
    public final boolean yandex(AbstractC4443l abstractC4443l) {
        AtomicReference atomicReference = this.yandex;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC11190l.yandex);
        return true;
    }
}
