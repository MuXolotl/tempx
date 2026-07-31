package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lۣؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3741l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater yandex = AtomicReferenceFieldUpdater.newUpdater(C3741l.class, Object.class, "curRef");
    private volatile /* synthetic */ Object curRef = new C6436l(8);

    public final Object amazon() {
        while (true) {
            C6436l c6436l = (C6436l) this.curRef;
            Object objPurchase = c6436l.purchase();
            if (objPurchase != C6436l.billing) {
                return objPurchase;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            C6436l c6436lAmazon = c6436l.amazon();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c6436l, c6436lAmazon) && atomicReferenceFieldUpdater.get(this) == c6436l) {
            }
        }
    }

    public final boolean crashlytics() {
        return ((C6436l) this.curRef).crashlytics();
    }

    public final void loadAd() {
        while (true) {
            C6436l c6436l = (C6436l) this.curRef;
            if (c6436l.loadAd()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            C6436l c6436lAmazon = c6436l.amazon();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c6436l, c6436lAmazon) && atomicReferenceFieldUpdater.get(this) == c6436l) {
            }
        }
    }

    public final boolean yandex(AbstractC4820l abstractC4820l) {
        while (true) {
            C6436l c6436l = (C6436l) this.curRef;
            int iYandex = c6436l.yandex(abstractC4820l);
            if (iYandex == 0) {
                return true;
            }
            if (iYandex == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
                C6436l c6436lAmazon = c6436l.amazon();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c6436l, c6436lAmazon) && atomicReferenceFieldUpdater.get(this) == c6436l) {
                }
            } else if (iYandex == 2) {
                return false;
            }
        }
    }
}
