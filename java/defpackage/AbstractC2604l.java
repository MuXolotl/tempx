package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lؔٓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2604l extends AbstractC3594l {
    public boolean crashlytics;
    public int loadAd;
    public Object[] yandex;

    public AbstractC2604l(int i) {
        AbstractC12832l.loadAd(i, "initialCapacity");
        this.yandex = new Object[i];
        this.loadAd = 0;
    }

    public final void amazon(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            purchase(collection.size());
            if (collection instanceof AbstractC5511l) {
                this.loadAd = ((AbstractC5511l) collection).billing(this.loadAd, this.yandex);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yandex(it.next());
        }
    }

    public final void crashlytics(Object obj) {
        obj.getClass();
        purchase(1);
        Object[] objArr = this.yandex;
        int i = this.loadAd;
        this.loadAd = i + 1;
        objArr[i] = obj;
    }

    public final void purchase(int i) {
        Object[] objArr = this.yandex;
        int iLoadAd = AbstractC3594l.loadAd(objArr.length, this.loadAd + i);
        if (iLoadAd > objArr.length || this.crashlytics) {
            this.yandex = Arrays.copyOf(this.yandex, iLoadAd);
            this.crashlytics = false;
        }
    }
}
