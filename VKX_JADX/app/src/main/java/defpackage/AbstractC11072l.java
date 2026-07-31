package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: renamed from: lُٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11072l implements InterfaceC8657l {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11072l) && AbstractC8576l.yandex(yandex(), ((AbstractC11072l) obj).yandex());
    }

    public final int hashCode() {
        return yandex().hashCode();
    }

    @Override // defpackage.InterfaceC7760l
    public C8673l loadAd(C2312l c2312l) {
        Object next;
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC8576l.yandex(AbstractC1845l.yandex(((InterfaceC13937l) AbstractC16131l.billing(((C8673l) next).yandex)).mo1730private()).yandex(), c2312l)) {
                return (C8673l) next;
            }
        }
        next = null;
        return (C8673l) next;
    }

    public final String toString() {
        return getClass().getName() + ": " + yandex();
    }

    public abstract Type yandex();
}
