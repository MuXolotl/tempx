package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙٙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6548l extends AbstractC7532l {
    public final AbstractC7532l Signature;
    public final AbstractC7532l license;

    public C6548l(AbstractC7532l abstractC7532l, AbstractC7532l abstractC7532l2) {
        super(3, AbstractC18202l.yandex.loadAd(Map.Entry.class), abstractC7532l2.purchase, null, 48);
        this.Signature = abstractC7532l;
        this.license = abstractC7532l2;
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        this.license.subs(c1080l, 2, entry.getValue());
        this.Signature.subs(c1080l, 1, entry.getKey());
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.license.firebase(2, entry.getValue()) + this.Signature.firebase(1, entry.getKey());
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        this.Signature.admob(c13161l, 1, entry.getKey());
        this.license.admob(c13161l, 2, entry.getValue());
    }
}
