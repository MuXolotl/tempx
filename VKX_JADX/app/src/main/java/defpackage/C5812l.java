package defpackage;

/* JADX INFO: renamed from: lؘٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5812l extends AbstractC8637l {
    @Override // defpackage.InterfaceC17739l
    public final InterfaceC0039l crashlytics(InterfaceC18035l interfaceC18035l) {
        long[] jArrBilling;
        boolean z = this.ads.yandex.amazon;
        C6129l c6129l = this.subscription;
        if (z && (jArrBilling = AbstractC1295l.billing(interfaceC18035l)) != null) {
            int i = 0;
            while (true) {
                if (!(i < jArrBilling.length)) {
                    break;
                }
                if (i >= jArrBilling.length) {
                    C1759l.firebase(String.valueOf(i));
                    return null;
                }
                AbstractC18323l.loadAd(c6129l, new C10882l(jArrBilling[i]).f21996l, 192);
                i++;
            }
        }
        if (AbstractC1295l.admob(interfaceC18035l)) {
            c6129l.admob(159);
            return this;
        }
        AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
        if (AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon) || (abstractC2021lBilling instanceof C0196l)) {
            c6129l.admob(159);
            return this;
        }
        if (abstractC2021lBilling instanceof C2861l) {
            c6129l.admob(191);
            return this;
        }
        c6129l.admob(191);
        return this;
    }

    @Override // defpackage.AbstractC8637l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C6129l mo1863throws() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC0039l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        this.subscription.admob(255);
    }

    @Override // defpackage.AbstractC8637l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo1862package() {
    }
}
