package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؙّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6513l implements InterfaceC18384l {
    public final ArrayList crashlytics;
    public final C0659l loadAd;
    public final String yandex;

    public C6513l(String str, C0659l c0659l) {
        this.yandex = str;
        this.loadAd = c0659l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AbstractC15342l.loadAd(c10227lAdmob, c0659l);
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10227lPurchase, 10));
        ListIterator listIterator = c10227lPurchase.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                break;
            } else {
                arrayList.add(((InterfaceC5068l) c13376l.next()).crashlytics());
            }
        }
        List<AbstractC2523l> listM4245throws = AbstractC16901l.m4245throws(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM4245throws, 10));
        for (AbstractC2523l abstractC2523l : listM4245throws) {
            Object objLoadAd = abstractC2523l.loadAd();
            if (objLoadAd == null) {
                C10754l.license(abstractC2523l.crashlytics(), "' does not define a default value", "The field '");
                throw null;
            }
            arrayList2.add(new C1167l(abstractC2523l.yandex(), objLoadAd));
        }
        this.crashlytics = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6513l)) {
            return false;
        }
        C6513l c6513l = (C6513l) obj;
        return this.yandex.equals(c6513l.yandex) && this.loadAd.equals(c6513l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.yandex.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC16243l
    public final C14329l loadAd() {
        C14329l c14329lLoadAd = this.loadAd.loadAd();
        C14329l c14329lLoadAd2 = new C12782l(this.yandex).loadAd();
        boolean zIsEmpty = this.crashlytics.isEmpty();
        C2580l c2580l = C2580l.f5619l;
        return new C14329l(c2580l, AbstractC14055l.remoteconfig(c14329lLoadAd, AbstractC1889l.loadAd(AbstractC14055l.remoteconfig(c14329lLoadAd2, new C14329l(zIsEmpty ? c2580l : Collections.singletonList(new C2531l(new C8250l(13, this))), c2580l)))));
    }

    public final String toString() {
        return "Optional(" + this.yandex + ", " + this.loadAd + ')';
    }

    @Override // defpackage.InterfaceC16243l
    public final C1094l yandex() {
        C1094l c1094lYandex = this.loadAd.yandex();
        ArrayList<C1167l> arrayList = this.crashlytics;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        for (C1167l c1167l : arrayList) {
            arrayList2.add(new C2345l(c1167l.loadAd, new C15406l(1, c1167l.yandex, C1243l.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 0, 10)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        C14709l c14709l = C14709l.yandex;
        Object c12592l = zIsEmpty ? c14709l : arrayList2.size() == 1 ? (InterfaceC3804l) AbstractC16901l.m4208abstract(arrayList2) : new C12592l(arrayList2);
        if (c12592l instanceof C14709l) {
            return new C1094l();
        }
        AbstractC14055l.remoteconfig(new C8195l(new C15406l(1, c12592l, InterfaceC3804l.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 11), new C1094l()), new C8195l(new C15406l(1, c14709l, C14709l.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 12), c1094lYandex));
        return new C1094l();
    }
}
