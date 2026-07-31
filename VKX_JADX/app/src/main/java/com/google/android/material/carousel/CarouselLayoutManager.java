package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.firebase;
import androidx.recyclerview.widget.isPro;
import defpackage.AbstractC0653l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC7877l;
import defpackage.C13036l;
import defpackage.C13215l;
import defpackage.C18150l;
import defpackage.C4033l;
import defpackage.C4782l;
import defpackage.C5932l;
import defpackage.C8339l;
import defpackage.InterfaceC9662l;
import defpackage.ViewOnLayoutChangeListenerC18363l;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends isPro implements InterfaceC9662l {
    public AbstractC7877l adcel;
    public final View.OnLayoutChangeListener ads;
    public final C4033l startapp;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C4782l();
        this.ads = new ViewOnLayoutChangeListenerC18363l(0, this);
        this.startapp = new C4033l(5);
        m141l();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.mopub);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m141l();
            m183l(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l ads() {
        return new C13036l(-2, -2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean amazon() {
        return m184l();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: default */
    public final View mo26default(View view, int i, firebase firebaseVar, C5932l c5932l) {
        byte b;
        if (license() != 0) {
            int i2 = this.adcel.f16423l;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (i2 == 1) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (i2 != 0) {
                        b = -2147483648;
                    } else if (m185l()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (i2 == 1) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (i2 != 0) {
                b = -2147483648;
            } else if (m185l()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (isPro.m126native(view) != 0) {
                        int iM126native = isPro.m126native(Signature(0)) - 1;
                        if (iM126native < 0 || iM126native >= m147throws()) {
                            return Signature(m185l() ? license() - 1 : 0);
                        }
                        this.adcel.admob();
                        throw null;
                    }
                } else if (isPro.m126native(view) != m147throws() - 1) {
                    int iM126native2 = isPro.m126native(Signature(license() - 1)) + 1;
                    if (iM126native2 < 0 || iM126native2 >= m147throws()) {
                        return Signature(m185l() ? 0 : license() - 1);
                    }
                    this.adcel.admob();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: final */
    public final void mo61final(AccessibilityEvent accessibilityEvent) {
        super.mo61final(accessibilityEvent);
        if (license() > 0) {
            accessibilityEvent.setFromIndex(isPro.m126native(Signature(0)));
            accessibilityEvent.setToIndex(isPro.m126native(Signature(license() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int firebase(C5932l c5932l) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: import */
    public final void mo29import(int i, int i2) {
        m147throws();
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: interface */
    public final void mo132interface(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C4033l c4033l = this.startapp;
        float dimension = c4033l.f8314l;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c4033l.f8314l = dimension;
        float dimension2 = c4033l.f8313l;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c4033l.f8313l = dimension2;
        m141l();
        recyclerView.addOnLayoutChangeListener(this.ads);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int isPro(C5932l c5932l) {
        license();
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void isVip(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        rect.centerY();
        if (m184l()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo35l(int i, C5932l c5932l, firebase firebaseVar) {
        if (!purchase() || license() == 0 || i == 0) {
            return 0;
        }
        View view = firebaseVar.smaato(0, Long.MAX_VALUE).yandex;
        C8339l.smaato("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final void m183l(int i) {
        C18150l c18150l;
        if (i != 0 && i != 1) {
            C8339l.metrica(AbstractC0653l.vip(i, "invalid orientation:"));
            return;
        }
        crashlytics(null);
        AbstractC7877l abstractC7877l = this.adcel;
        if (abstractC7877l == null || i != abstractC7877l.f16423l) {
            if (i == 0) {
                c18150l = new C18150l(this, 1);
            } else {
                if (i != 1) {
                    C8339l.metrica("invalid orientation");
                    return;
                }
                c18150l = new C18150l(this, 0);
            }
            this.adcel = c18150l;
            m141l();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final boolean mo136l(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo79l(RecyclerView recyclerView, int i) {
        C13215l c13215l = new C13215l(recyclerView.getContext());
        c13215l.yandex = i;
        m137l(c13215l);
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final boolean m184l() {
        return this.adcel.f16423l == 0;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final boolean m185l() {
        return m184l() && this.loadAd.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lَٖؔ */
    public final int mo51l(int i, C5932l c5932l, firebase firebaseVar) {
        if (!m184l() || license() == 0 || i == 0) {
            return 0;
        }
        View view = firebaseVar.smaato(0, Long.MAX_VALUE).yandex;
        C8339l.smaato("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int metrica(C5932l c5932l) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: public */
    public final void mo54public(int i, int i2) {
        m147throws();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean purchase() {
        return !m184l();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int remoteconfig(C5932l c5932l) {
        license();
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int smaato(C5932l c5932l) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: static */
    public final void mo90static(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.ads);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: this */
    public final void mo56this(firebase firebaseVar, C5932l c5932l) {
        if (c5932l.loadAd() > 0) {
            if ((m184l() ? this.vip : this.metrica) > 0.0f) {
                m185l();
                View view = firebaseVar.smaato(0, Long.MAX_VALUE).yandex;
                C8339l.smaato("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        m131implements(firebaseVar);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: throw */
    public final boolean mo91throw() {
        return true;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: try */
    public final void mo57try(C5932l c5932l) {
        if (license() == 0) {
            return;
        }
        isPro.m126native(Signature(0));
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int vip(C5932l c5932l) {
        return 0;
    }

    @Override // defpackage.InterfaceC9662l
    public final PointF yandex(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؔٙؕ */
    public final void mo66l(int i) {
    }

    public CarouselLayoutManager() {
        C4033l c4033l = new C4033l(5);
        new C4782l();
        this.ads = new ViewOnLayoutChangeListenerC18363l(0, this);
        this.startapp = c4033l;
        m141l();
        m183l(0);
    }
}
