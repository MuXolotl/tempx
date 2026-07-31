package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًَٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7914l implements InterfaceC18384l {
    public final ArrayList loadAd;
    public final C0659l yandex;

    public C7914l(C0659l c0659l, ArrayList arrayList) {
        this.yandex = c0659l;
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7914l)) {
            return false;
        }
        C7914l c7914l = (C7914l) obj;
        return this.yandex.equals(c7914l.yandex) && this.loadAd.equals(c7914l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC16243l
    public final C14329l loadAd() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        c10227lAdmob.add(this.yandex.loadAd());
        Iterator it = this.loadAd.iterator();
        while (it.hasNext()) {
            c10227lAdmob.add(((InterfaceC16243l) it.next()).loadAd());
        }
        return new C14329l(C2580l.f5619l, AbstractC14055l.purchase(c10227lAdmob));
    }

    public final String toString() {
        return "AlternativesParsing(" + this.loadAd + ')';
    }

    @Override // defpackage.InterfaceC16243l
    public final C1094l yandex() {
        return this.yandex.yandex();
    }
}
