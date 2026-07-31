package defpackage;

import android.view.WindowInsets;

/* JADX INFO: renamed from: lۣ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C18209l extends AbstractC18218l {
    public final WindowInsets.Builder purchase;

    public C18209l(C1473l c1473l) {
        super(c1473l);
        WindowInsets windowInsetsMopub = c1473l.mopub();
        this.purchase = windowInsetsMopub != null ? AbstractC10971l.subs(windowInsetsMopub) : AbstractC10971l.admob();
    }

    @Override // defpackage.AbstractC18218l
    public void admob(C15496l c15496l) {
        this.purchase.setSystemWindowInsets(c15496l.amazon());
    }

    @Override // defpackage.AbstractC18218l
    public void billing(C15496l c15496l) {
        this.purchase.setStableInsets(c15496l.amazon());
    }

    @Override // defpackage.AbstractC18218l
    public C1473l loadAd() {
        yandex();
        C1473l c1473lAdmob = C1473l.admob(this.purchase.build(), null);
        C15496l[] c15496lArr = this.loadAd;
        C17212l c17212l = c1473lAdmob.yandex;
        c17212l.pro(c15496lArr);
        c17212l.license(null);
        c17212l.premium(this.crashlytics);
        c17212l.applovin(this.amazon);
        return c1473lAdmob;
    }

    @Override // defpackage.AbstractC18218l
    public void mopub(C15496l c15496l) {
        this.purchase.setSystemGestureInsets(c15496l.amazon());
    }

    @Override // defpackage.AbstractC18218l
    public void purchase(C15496l c15496l) {
        this.purchase.setMandatorySystemGestureInsets(c15496l.amazon());
    }

    @Override // defpackage.AbstractC18218l
    public void subs(C15496l c15496l) {
        this.purchase.setTappableElementInsets(c15496l.amazon());
    }

    public C18209l() {
        this.purchase = AbstractC10971l.admob();
    }
}
