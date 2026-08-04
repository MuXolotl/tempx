package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: renamed from: lٌۥۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9182l implements InterfaceC18384l {
    public final Set loadAd;
    public final C9695l yandex;

    public C9182l(C9695l c9695l) {
        this.yandex = c9695l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AbstractC15342l.loadAd(c10227lAdmob, c9695l);
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c10227lPurchase.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                break;
            }
            C4195l c4195lAmazon = ((InterfaceC5068l) c13376l.next()).crashlytics().amazon();
            if (c4195lAmazon != null) {
                arrayList.add(c4195lAmazon);
            }
        }
        Set setM4229l = AbstractC16901l.m4229l(arrayList);
        this.loadAd = setM4229l;
        if (setM4229l.isEmpty()) {
            C8339l.metrica("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9182l) {
            return this.yandex.equals(((C9182l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + 1231;
    }

    @Override // defpackage.InterfaceC16243l
    public final C14329l loadAd() {
        return AbstractC1889l.loadAd(AbstractC14055l.remoteconfig(new C14329l(Collections.singletonList(new C13861l(new C1645l(9, this), "sign for " + this.loadAd)), C2580l.f5619l), this.yandex.yandex.loadAd()));
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC16243l
    public final C1094l yandex() {
        this.yandex.yandex();
        return new C1094l();
    }
}
