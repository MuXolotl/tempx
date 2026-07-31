package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lًِۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11707l extends AbstractC9966l {
    public final /* synthetic */ AbstractC8012l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11707l(AbstractC8012l abstractC8012l, int i) {
        this.yandex = i;
        this.loadAd = abstractC8012l;
    }

    @Override // defpackage.AbstractC9966l
    public final int amazon(View view, int i) {
        switch (this.yandex) {
            case 0:
                return AbstractC12704l.crashlytics(i, ((BottomSheetBehavior) this.loadAd).advert(), isPro());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.AbstractC9966l
    public final int crashlytics(View view, int i) {
        switch (this.yandex) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.loadAd;
                return AbstractC12704l.crashlytics(i, sideSheetBehavior.yandex.mopub(), sideSheetBehavior.yandex.billing());
        }
    }

    @Override // defpackage.AbstractC9966l
    public int isPro() {
        switch (this.yandex) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.loadAd;
                return bottomSheetBehavior.f647strictfp ? bottomSheetBehavior.f633continue : bottomSheetBehavior.f644package;
            default:
                return super.isPro();
        }
    }

    @Override // defpackage.AbstractC9966l
    public final void metrica(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.yandex;
        AbstractC8012l abstractC8012l = this.loadAd;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) abstractC8012l).license(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC8012l;
                WeakReference weakReference = sideSheetBehavior.adcel;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.yandex.ads(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.Signature;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.yandex.crashlytics(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    @Override // defpackage.AbstractC9966l
    public final boolean premium(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i2 = this.yandex;
        AbstractC8012l abstractC8012l = this.loadAd;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC8012l;
                int i3 = bottomSheetBehavior.f645private;
                if (i3 != 1 && !bottomSheetBehavior.f639goto) {
                    if (i3 == 3 && bottomSheetBehavior.f637final == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.f641interface;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f632class;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f632class;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC8012l;
                return (sideSheetBehavior.admob == 1 || (weakReference2 = sideSheetBehavior.startapp) == null || weakReference2.get() != view) ? false : true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    @Override // defpackage.AbstractC9966l
    public final void startapp(View view, float f, float f2) {
        int i = this.yandex;
        int i2 = 3;
        AbstractC8012l abstractC8012l = this.loadAd;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC8012l;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.loadAd) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top > bottomSheetBehavior.inmobi) {
                            i2 = 6;
                        }
                    }
                } else if (bottomSheetBehavior.f647strictfp && bottomSheetBehavior.m180throws(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.amazon) {
                        if (view.getTop() > (bottomSheetBehavior.advert() + bottomSheetBehavior.f633continue) / 2) {
                            i2 = 5;
                        } else if (!bottomSheetBehavior.loadAd && Math.abs(view.getTop() - bottomSheetBehavior.advert()) >= Math.abs(view.getTop() - bottomSheetBehavior.inmobi)) {
                            i2 = 6;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.loadAd) {
                        int i3 = bottomSheetBehavior.inmobi;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f644package)) {
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.f644package)) {
                            i2 = 4;
                        }
                        i2 = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior.appmetrica) >= Math.abs(top2 - bottomSheetBehavior.f644package)) {
                        i2 = 4;
                    }
                } else {
                    if (!bottomSheetBehavior.loadAd) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.inmobi) < Math.abs(top3 - bottomSheetBehavior.f644package)) {
                            i2 = 6;
                        }
                    }
                    i2 = 4;
                }
                bottomSheetBehavior.m177package(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC8012l;
                if (!sideSheetBehavior.yandex.smaato(f)) {
                    if (sideSheetBehavior.yandex.adcel(view, f)) {
                        if (sideSheetBehavior.yandex.metrica(f, f2) || sideSheetBehavior.yandex.remoteconfig(view)) {
                            i2 = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.yandex.amazon()) >= Math.abs(left - sideSheetBehavior.yandex.purchase())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior.Signature(view, i2, true);
                break;
        }
    }

    @Override // defpackage.AbstractC9966l
    public int subs(View view) {
        switch (this.yandex) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.loadAd;
                return sideSheetBehavior.smaato + sideSheetBehavior.metrica;
            default:
                return super.subs(view);
        }
    }

    @Override // defpackage.AbstractC9966l
    public final void vip(int i) {
        int i2 = this.yandex;
        AbstractC8012l abstractC8012l = this.loadAd;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC8012l;
                    if (bottomSheetBehavior.f642native) {
                        bottomSheetBehavior.inmobi(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC8012l;
                    if (sideSheetBehavior.mopub) {
                        sideSheetBehavior.subscription(1);
                    }
                }
                break;
        }
    }
}
