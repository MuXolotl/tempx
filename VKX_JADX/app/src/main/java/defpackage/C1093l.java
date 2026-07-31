package defpackage;

import android.view.ViewGroup;

/* JADX INFO: renamed from: lؒٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1093l extends AbstractC0155l {
    public final ViewGroup loadAd;
    public boolean yandex = false;

    public C1093l(ViewGroup viewGroup) {
        this.loadAd = viewGroup;
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public final void billing() {
        AbstractC13702l.billing(this.loadAd, true);
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public final void loadAd() {
        AbstractC13702l.billing(this.loadAd, false);
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public final void mopub(AbstractC1299l abstractC1299l) {
        AbstractC13702l.billing(this.loadAd, false);
        this.yandex = true;
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public final void yandex(AbstractC1299l abstractC1299l) {
        if (!this.yandex) {
            AbstractC13702l.billing(this.loadAd, false);
        }
        abstractC1299l.signatures(this);
    }
}
