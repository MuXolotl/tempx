package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؕٝۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3524l extends AbstractC9278l {
    public final boolean loadAd;

    public C3524l(List list, boolean z) {
        super(list);
        this.loadAd = z;
    }

    public final String toString() {
        return "Corner: cubics=" + AbstractC16901l.m4210case(this.yandex, ", ", null, null, new C4741l(24), 30) + " convex=" + this.loadAd;
    }

    @Override // defpackage.AbstractC9278l
    public final AbstractC9278l yandex(InterfaceC6951l interfaceC6951l) {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        List list = this.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c10227lAdmob.add(((C17841l) list.get(i)).purchase(interfaceC6951l));
        }
        return new C3524l(AbstractC14055l.purchase(c10227lAdmob), this.loadAd);
    }
}
