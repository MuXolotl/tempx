package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15126l extends AbstractC7532l {
    public final AbstractC7532l Signature;

    public C15126l(AbstractC7532l abstractC7532l) {
        super(abstractC7532l.amazon, AbstractC18202l.yandex.loadAd(List.class), abstractC7532l.purchase, C2580l.f5619l, 32);
        this.Signature = abstractC7532l;
    }

    @Override // defpackage.AbstractC7532l
    public final void admob(C13161l c13161l, int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.Signature.admob(c13161l, i, list.get(i2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        return Collections.singletonList(this.Signature.crashlytics(c7084l));
    }

    @Override // defpackage.AbstractC7532l
    public final int firebase(int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int iFirebase = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iFirebase += this.Signature.firebase(i, list.get(i2));
        }
        return iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) {
        return Collections.singletonList(this.Signature.loadAd(c2881l));
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC7532l
    public final void subs(C1080l c1080l, int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.Signature.subs(c1080l, i, list.get(size));
            }
        }
    }
}
