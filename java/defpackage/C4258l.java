package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٜؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4258l {
    public C4258l amazon;
    public C4057l billing;
    public final ArrayList crashlytics = new ArrayList(0);
    public AbstractC13573l loadAd;
    public final ArrayList mopub;
    public C4258l purchase;
    public int yandex;

    public C4258l(int i) {
        this.yandex = i;
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C10005l());
        }
        this.mopub = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4258l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C4258l c4258l = (C4258l) obj;
        if (this.yandex != c4258l.yandex) {
            return false;
        }
        AbstractC13573l abstractC13573l = this.loadAd;
        if (abstractC13573l == null) {
            abstractC13573l = null;
        }
        AbstractC13573l abstractC13573l2 = c4258l.loadAd;
        return AbstractC8576l.yandex(abstractC13573l, abstractC13573l2 != null ? abstractC13573l2 : null) && AbstractC8576l.yandex(this.crashlytics, c4258l.crashlytics) && AbstractC8576l.yandex(this.purchase, c4258l.purchase) && AbstractC8576l.yandex(this.amazon, c4258l.amazon) && AbstractC8576l.yandex(this.billing, c4258l.billing) && AbstractC8576l.yandex(this.mopub, c4258l.mopub);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        AbstractC13573l abstractC13573l = this.loadAd;
        if (abstractC13573l == null) {
            abstractC13573l = null;
        }
        return this.crashlytics.hashCode() + ((abstractC13573l.hashCode() + i) * 31);
    }
}
