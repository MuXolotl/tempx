package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٔۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15322l extends AbstractC7532l {
    public final AbstractC7532l Signature;

    public C15322l(AbstractC7532l abstractC7532l) {
        super(3, AbstractC18202l.yandex.loadAd(List.class), abstractC7532l.purchase, C2580l.f5619l, 32);
        this.Signature = abstractC7532l;
    }

    @Override // defpackage.AbstractC7532l
    public final void admob(C13161l c13161l, int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        super.admob(c13161l, i, list);
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        List list = (List) obj;
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.Signature.billing(c1080l, list.get(size));
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        return Collections.singletonList(this.Signature.crashlytics(c7084l));
    }

    @Override // defpackage.AbstractC7532l
    public final int firebase(int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.firebase(i, list);
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        List list = (List) obj;
        int size = list.size();
        int iIsPro = 0;
        for (int i = 0; i < size; i++) {
            iIsPro += this.Signature.isPro(list.get(i));
        }
        return iIsPro;
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) {
        return Collections.singletonList(this.Signature.loadAd(c2881l));
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        List list = (List) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.Signature.purchase(c13161l, list.get(i));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void subs(C1080l c1080l, int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        super.subs(c1080l, i, list);
    }
}
