package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: l٘ۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18218l {
    public final Rect[][] amazon;
    public final Rect[][] crashlytics;
    public C15496l[] loadAd;
    public final C1473l yandex;

    public AbstractC18218l(C1473l c1473l) {
        this.crashlytics = new Rect[10][];
        this.amazon = new Rect[10][];
        this.yandex = c1473l;
        crashlytics(c1473l);
    }

    public abstract void admob(C15496l c15496l);

    public void amazon(int i, C15496l c15496l) {
        if (this.loadAd == null) {
            this.loadAd = new C15496l[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.loadAd[AbstractC2920l.purchase(i2)] = c15496l;
            }
        }
    }

    public abstract void billing(C15496l c15496l);

    public void crashlytics(C1473l c1473l) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listBilling = c1473l.yandex.billing(i);
            int iPurchase = AbstractC2920l.purchase(i);
            this.crashlytics[iPurchase] = (Rect[]) listBilling.toArray(new Rect[listBilling.size()]);
            if (i != 8) {
                List<Rect> listMopub = c1473l.yandex.mopub(i);
                this.amazon[iPurchase] = (Rect[]) listMopub.toArray(new Rect[listMopub.size()]);
            }
        }
    }

    public abstract C1473l loadAd();

    public final void yandex() {
        C15496l[] c15496lArr = this.loadAd;
        if (c15496lArr != null) {
            C15496l c15496lSubs = c15496lArr[0];
            C15496l c15496lSubs2 = c15496lArr[1];
            C1473l c1473l = this.yandex;
            if (c15496lSubs2 == null) {
                c15496lSubs2 = c1473l.yandex.subs(2);
            }
            if (c15496lSubs == null) {
                c15496lSubs = c1473l.yandex.subs(1);
            }
            admob(C15496l.yandex(c15496lSubs, c15496lSubs2));
            C15496l c15496l = this.loadAd[AbstractC2920l.purchase(16)];
            if (c15496l != null) {
                mopub(c15496l);
            }
            C15496l c15496l2 = this.loadAd[AbstractC2920l.purchase(32)];
            if (c15496l2 != null) {
                purchase(c15496l2);
            }
            C15496l c15496l3 = this.loadAd[AbstractC2920l.purchase(64)];
            if (c15496l3 != null) {
                subs(c15496l3);
            }
        }
    }

    public AbstractC18218l() {
        this(new C1473l((C1473l) null));
    }

    public void mopub(C15496l c15496l) {
    }

    public void purchase(C15496l c15496l) {
    }

    public void subs(C15496l c15496l) {
    }
}
