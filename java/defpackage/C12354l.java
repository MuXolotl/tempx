package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12354l extends AbstractC14412l {
    public int admob;
    public final C3787l amazon;
    public AbstractC14412l billing;
    public final C3787l crashlytics;
    public C5633l mopub;
    public AbstractC14412l purchase;

    public C12354l(C3787l c3787l, C3787l c3787l2) {
        this.crashlytics = c3787l;
        this.amazon = c3787l2;
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        AbstractC14412l abstractC14412l = this.purchase;
        if (abstractC14412l != null) {
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            abstractC14412l.admob(i);
        }
        AbstractC14412l abstractC14412l2 = this.billing;
        if (abstractC14412l2 != null) {
            (abstractC14412l2 != null ? abstractC14412l2 : null).admob(i);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.vkxui_toolbar_fl, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) viewInflate;
        FrameLayout frameLayout = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.content);
        if (frameLayout == null) {
            C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.content)));
            return null;
        }
        this.mopub = new C5633l(appBarLayout, frameLayout, 1);
        this.purchase = (AbstractC14412l) this.crashlytics.invoke();
        this.billing = (AbstractC14412l) this.amazon.invoke();
        C5633l c5633l = this.mopub;
        if (c5633l == null) {
            c5633l = null;
        }
        FrameLayout frameLayout2 = (FrameLayout) c5633l.f11985l;
        AbstractC14412l abstractC14412l = this.purchase;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        frameLayout2.addView(abstractC14412l.amazon(context, viewGroup));
        AbstractC14412l abstractC14412l2 = this.billing;
        if (abstractC14412l2 == null) {
            abstractC14412l2 = null;
        }
        View viewAmazon = abstractC14412l2.amazon(context, viewGroup);
        if (viewAmazon != null) {
            viewAmazon.setVisibility(8);
        }
        frameLayout2.addView(viewAmazon);
        C5633l c5633l2 = this.mopub;
        if (c5633l2 == null) {
            c5633l2 = null;
        }
        AppBarLayout appBarLayout2 = (AppBarLayout) c5633l2.f11986l;
        C12448l c12448l = new C12448l();
        c12448l.yandex = 0;
        appBarLayout2.setLayoutParams(c12448l);
        C5633l c5633l3 = this.mopub;
        return (AppBarLayout) (c5633l3 != null ? c5633l3 : null).f11986l;
    }

    @Override // defpackage.AbstractC14412l
    public final void billing() {
        AbstractC14412l abstractC14412l = this.purchase;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        abstractC14412l.billing();
        AbstractC14412l abstractC14412l2 = this.billing;
        (abstractC14412l2 != null ? abstractC14412l2 : null).billing();
    }

    public final void firebase(int i) {
        if (this.admob == i) {
            return;
        }
        this.admob = i;
        if (i == 0) {
            AbstractC14412l abstractC14412l = this.purchase;
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            View viewPurchase = abstractC14412l.purchase();
            if (viewPurchase != null) {
                AbstractC5833l.amazon(viewPurchase);
            }
            AbstractC14412l abstractC14412l2 = this.billing;
            View viewPurchase2 = (abstractC14412l2 != null ? abstractC14412l2 : null).purchase();
            if (viewPurchase2 != null) {
                AbstractC5833l.crashlytics(viewPurchase2);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        AbstractC14412l abstractC14412l3 = this.purchase;
        if (abstractC14412l3 == null) {
            abstractC14412l3 = null;
        }
        View viewPurchase3 = abstractC14412l3.purchase();
        if (viewPurchase3 != null) {
            AbstractC5833l.crashlytics(viewPurchase3);
        }
        AbstractC14412l abstractC14412l4 = this.billing;
        View viewPurchase4 = (abstractC14412l4 != null ? abstractC14412l4 : null).purchase();
        if (viewPurchase4 != null) {
            AbstractC5833l.amazon(viewPurchase4);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        C5633l c5633l = this.mopub;
        if (c5633l == null) {
            c5633l = null;
        }
        return (AppBarLayout) c5633l.f11986l;
    }

    @Override // defpackage.AbstractC14412l
    public final void mopub(String str) {
    }
}
