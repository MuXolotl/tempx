package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14946l {
    public final C11338l amazon;
    public C14946l billing;
    public boolean crashlytics;
    public int loadAd;
    public final int purchase;
    public C4657l subs;
    public HashSet yandex = null;
    public int mopub = 0;
    public int admob = RecyclerView.UNDEFINED_DURATION;

    public C14946l(C11338l c11338l, int i) {
        this.amazon = c11338l;
        this.purchase = i;
    }

    public final void admob() {
        C4657l c4657l = this.subs;
        if (c4657l == null) {
            this.subs = new C4657l(1);
        } else {
            c4657l.crashlytics();
        }
    }

    public final int amazon() {
        C14946l c14946l;
        if (this.amazon.f22862public == 8) {
            return 0;
        }
        int i = this.admob;
        return (i == Integer.MIN_VALUE || (c14946l = this.billing) == null || c14946l.amazon.f22862public != 8) ? this.mopub : i;
    }

    public final boolean billing() {
        return this.billing != null;
    }

    public final int crashlytics() {
        if (this.crashlytics) {
            return this.loadAd;
        }
        return 0;
    }

    public final void loadAd(int i, C9998l c9998l, ArrayList arrayList) {
        HashSet hashSet = this.yandex;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1889l.billing(((C14946l) it.next()).amazon, i, arrayList, c9998l);
            }
        }
    }

    public final void mopub() {
        HashSet hashSet;
        C14946l c14946l = this.billing;
        if (c14946l != null && (hashSet = c14946l.yandex) != null) {
            hashSet.remove(this);
            if (this.billing.yandex.size() == 0) {
                this.billing.yandex = null;
            }
        }
        this.yandex = null;
        this.billing = null;
        this.mopub = 0;
        this.admob = RecyclerView.UNDEFINED_DURATION;
        this.crashlytics = false;
        this.loadAd = 0;
    }

    public final boolean purchase() {
        C14946l c14946l;
        HashSet<C14946l> hashSet = this.yandex;
        if (hashSet != null) {
            for (C14946l c14946l2 : hashSet) {
                C11338l c11338l = c14946l2.amazon;
                int i = c14946l2.purchase;
                switch (AbstractC5020l.inmobi(i)) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        c14946l = null;
                        break;
                    case 1:
                        c14946l = c11338l.f22873volatile;
                        break;
                    case 2:
                        c14946l = c11338l.f22857native;
                        break;
                    case 3:
                        c14946l = c11338l.f22867synchronized;
                        break;
                    case 4:
                        c14946l = c11338l.f22864strictfp;
                        break;
                    default:
                        C8339l.subs(AbstractC11043l.tapsense(i));
                        return false;
                }
                if (c14946l.billing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void subs(int i) {
        this.loadAd = i;
        this.crashlytics = true;
    }

    public final String toString() {
        return this.amazon.f22850finally + ":" + AbstractC11043l.tapsense(this.purchase);
    }

    public final void yandex(C14946l c14946l, int i, int i2) {
        if (c14946l == null) {
            mopub();
            return;
        }
        this.billing = c14946l;
        if (c14946l.yandex == null) {
            c14946l.yandex = new HashSet();
        }
        HashSet hashSet = this.billing.yandex;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.mopub = i;
        this.admob = i2;
    }
}
