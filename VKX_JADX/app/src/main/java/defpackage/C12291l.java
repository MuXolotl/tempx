package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lّّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12291l extends AbstractC3362l {
    public final /* synthetic */ AbstractC2484l amazon;
    public final /* synthetic */ int crashlytics;
    public final C9967l loadAd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12291l(AbstractC15680l abstractC15680l) {
        this(abstractC15680l, abstractC15680l.f34613l);
        this.crashlytics = 0;
        this.amazon = abstractC15680l;
    }

    @Override // defpackage.AbstractC3362l
    public final CharSequence crashlytics(int i) {
        int i2 = this.crashlytics;
        AbstractC2484l abstractC2484l = this.amazon;
        switch (i2) {
            case 0:
                return (CharSequence) ((AbstractC15680l) abstractC2484l).mo2202super().get(i);
            default:
                return (CharSequence) ((AbstractC11801l) abstractC2484l).mo650super().get(i);
        }
    }

    @Override // defpackage.AbstractC3362l
    public final int loadAd() {
        int i = this.crashlytics;
        AbstractC2484l abstractC2484l = this.amazon;
        switch (i) {
            case 0:
                return ((AbstractC15680l) abstractC2484l).mo2201new().size();
            default:
                return ((AbstractC11801l) abstractC2484l).mo649goto().size();
        }
    }

    public final AbstractC17777l purchase(int i) {
        int i2 = this.crashlytics;
        AbstractC2484l abstractC2484l = this.amazon;
        switch (i2) {
            case 0:
                return (AbstractC17777l) AbstractC16901l.m4220for(i, ((AbstractC15680l) abstractC2484l).mo2201new());
            default:
                return (AbstractC17777l) ((AbstractC11801l) abstractC2484l).mo649goto().get(i);
        }
    }

    @Override // defpackage.AbstractC3362l
    public final void yandex(AbstractC2361l abstractC2361l, int i, Object obj) {
        AbstractC17777l abstractC17777lPurchase = purchase(i);
        if (abstractC17777lPurchase != null) {
            boolean z = true;
            switch (this.crashlytics) {
                case 0:
                    z = true ^ (((AbstractC15680l) this.amazon) instanceof C13220l);
                    break;
            }
            if (z) {
                abstractC17777lPurchase.appmetrica();
            } else {
                abstractC17777lPurchase.inmobi();
            }
        }
        abstractC2361l.removeView((View) obj);
    }

    public C12291l(AbstractC2484l abstractC2484l, C9967l c9967l) {
        this.loadAd = c9967l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12291l(AbstractC11801l abstractC11801l) {
        this(abstractC11801l, abstractC11801l.f34613l);
        this.crashlytics = 1;
        this.amazon = abstractC11801l;
    }
}
