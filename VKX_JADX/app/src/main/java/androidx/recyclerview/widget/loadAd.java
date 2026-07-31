package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC14814l;
import defpackage.C1770l;
import defpackage.C3253l;
import defpackage.C8339l;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class loadAd {
    public View purchase;
    public final C1770l yandex;
    public int amazon = 0;
    public final C3253l loadAd = new C3253l(1);
    public final ArrayList crashlytics = new ArrayList();

    public loadAd(C1770l c1770l) {
        this.yandex = c1770l;
    }

    public final int admob() {
        return ((RecyclerView) this.yandex.f4179l).getChildCount();
    }

    public final View amazon(int i) {
        return ((RecyclerView) this.yandex.f4179l).getChildAt(billing(i));
    }

    public final int billing(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.yandex.f4179l).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C3253l c3253l = this.loadAd;
            int iSubscription = i - (i2 - c3253l.subscription(i2));
            if (iSubscription == 0) {
                while (c3253l.license(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iSubscription;
        }
        return -1;
    }

    public final void crashlytics(int i) {
        int iBilling = billing(i);
        this.loadAd.signatures(iBilling);
        RecyclerView recyclerView = (RecyclerView) this.yandex.f4179l;
        View childAt = recyclerView.getChildAt(iBilling);
        if (childAt != null) {
            metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.smaato() && !childViewHolderInt.adcel()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    C8339l.metrica(AbstractC14814l.vip(recyclerView, sb));
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.yandex(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iBilling);
            C8339l.metrica(AbstractC14814l.vip(recyclerView, sb2));
            return;
        }
        recyclerView.detachViewFromParent(iBilling);
    }

    public final void isPro(View view) {
        metrica childViewHolderInt;
        if (!this.crashlytics.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        ((RecyclerView) this.yandex.f4179l).setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.startapp);
        childViewHolderInt.startapp = 0;
    }

    public final void loadAd(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.yandex.f4179l;
        int childCount = i < 0 ? recyclerView.getChildCount() : billing(i);
        this.loadAd.ad(childCount, z);
        if (z) {
            subs(view);
        }
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.smaato() && !childViewHolderInt.adcel()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                C8339l.metrica(AbstractC14814l.vip(recyclerView, sb));
                return;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.isPro &= -257;
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            C8339l.metrica(AbstractC14814l.vip(recyclerView, sb2));
            return;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final View mopub(int i) {
        return ((RecyclerView) this.yandex.f4179l).getChildAt(i);
    }

    public final int purchase() {
        return ((RecyclerView) this.yandex.f4179l).getChildCount() - this.crashlytics.size();
    }

    public final void subs(View view) {
        this.crashlytics.add(view);
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = (RecyclerView) this.yandex.f4179l;
            int i = childViewHolderInt.adcel;
            if (i != -1) {
                childViewHolderInt.startapp = i;
            } else {
                childViewHolderInt.startapp = childViewHolderInt.yandex.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    public final String toString() {
        return this.loadAd.toString() + ", hidden list:" + this.crashlytics.size();
    }

    public final void yandex(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.yandex.f4179l;
        int childCount = i < 0 ? recyclerView.getChildCount() : billing(i);
        this.loadAd.ad(childCount, z);
        if (z) {
            subs(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }
}
