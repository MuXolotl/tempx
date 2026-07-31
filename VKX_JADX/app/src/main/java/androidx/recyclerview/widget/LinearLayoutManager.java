package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.AbstractC0653l;
import defpackage.AbstractC0962l;
import defpackage.AbstractC11994l;
import defpackage.C0267l;
import defpackage.C13036l;
import defpackage.C15685l;
import defpackage.C3798l;
import defpackage.C4839l;
import defpackage.C5453l;
import defpackage.C5932l;
import defpackage.C6933l;
import defpackage.C8339l;
import defpackage.C9292l;
import defpackage.InterfaceC9662l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends isPro implements InterfaceC9662l {
    public boolean Signature;
    public int ad;
    public C0267l adcel;
    public AbstractC0962l ads;
    public int advert;
    public final int applovin;
    public final int[] appmetrica;
    public C3798l isVip;
    public boolean license;
    public final C4839l premium;
    public final boolean pro;
    public final C5453l signatures;
    public int startapp;
    public boolean subscription;
    public final boolean tapsense;

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.startapp = 1;
        this.tapsense = false;
        this.Signature = false;
        this.license = false;
        this.pro = true;
        this.ad = -1;
        this.advert = RecyclerView.UNDEFINED_DURATION;
        this.isVip = null;
        this.signatures = new C5453l();
        this.premium = new C4839l();
        this.applovin = 2;
        this.appmetrica = new int[2];
        C9292l c9292lM127private = isPro.m127private(context, attributeSet, i, i2);
        m62l(c9292lM127private.yandex);
        boolean z = c9292lM127private.crashlytics;
        crashlytics(null);
        if (z != this.tapsense) {
            this.tapsense = z;
            m141l();
        }
        mo50l(c9292lM127private.amazon);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final View adcel(int i) {
        int iLicense = license();
        if (iLicense == 0) {
            return null;
        }
        int iM126native = i - isPro.m126native(Signature(0));
        if (iM126native >= 0 && iM126native < iLicense) {
            View viewSignature = Signature(iM126native);
            if (isPro.m126native(viewSignature) == i) {
                return viewSignature;
            }
        }
        return super.adcel(i);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void admob(int i, int i2, C5932l c5932l, crashlytics crashlyticsVar) {
        if (this.startapp != 0) {
            i = i2;
        }
        if (license() == 0 || i == 0) {
            return;
        }
        m68l();
        m73l(i > 0 ? 1 : -1, Math.abs(i), true, c5932l);
        mo47l(c5932l, this.adcel, crashlyticsVar);
    }

    @Override // androidx.recyclerview.widget.isPro
    public C13036l ads() {
        return new C13036l(-2, -2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public boolean amazon() {
        return this.startapp == 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void mo59break(Parcelable parcelable) {
        if (parcelable instanceof C3798l) {
            C3798l c3798l = (C3798l) parcelable;
            this.isVip = c3798l;
            if (this.ad != -1) {
                c3798l.f7907l = -1;
            }
            m141l();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean mo60catch() {
        return this.tapsense;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void crashlytics(String str) {
        if (this.isVip == null) {
            super.crashlytics(str);
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: default */
    public View mo26default(View view, int i, firebase firebaseVar, C5932l c5932l) {
        int iM65l;
        View viewM69l;
        m85l();
        if (license() != 0 && (iM65l = m65l(i)) != Integer.MIN_VALUE) {
            m68l();
            m73l(iM65l, (int) (this.ads.smaato() * 0.33333334f), false, c5932l);
            C0267l c0267l = this.adcel;
            c0267l.mopub = RecyclerView.UNDEFINED_DURATION;
            c0267l.yandex = false;
            m74l(firebaseVar, c0267l, c5932l, true);
            boolean z = this.Signature;
            if (iM65l == -1) {
                viewM69l = z ? m69l(license() - 1, -1) : m69l(0, license());
            } else {
                viewM69l = z ? m69l(0, license()) : m69l(license() - 1, -1);
            }
            View viewM87l = iM65l == -1 ? m87l() : m70l();
            if (!viewM87l.hasFocusable()) {
                return viewM69l;
            }
            if (viewM69l != null) {
                return viewM87l;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void mo61final(AccessibilityEvent accessibilityEvent) {
        super.mo61final(accessibilityEvent);
        if (license() > 0) {
            View viewM67l = m67l(0, license(), false);
            accessibilityEvent.setFromIndex(viewM67l == null ? -1 : isPro.m126native(viewM67l));
            accessibilityEvent.setToIndex(m75l());
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public int firebase(C5932l c5932l) {
        return m71l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int isPro(C5932l c5932l) {
        return m81l(c5932l);
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void m62l(int i) {
        if (i != 0 && i != 1) {
            C8339l.metrica(AbstractC0653l.vip(i, "invalid orientation:"));
            return;
        }
        crashlytics(null);
        if (i != this.startapp || this.ads == null) {
            AbstractC0962l abstractC0962lYandex = AbstractC0962l.yandex(this, i);
            this.ads = abstractC0962lYandex;
            this.signatures.billing = abstractC0962lYandex;
            this.startapp = i;
            m141l();
        }
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final View m63l(boolean z) {
        return this.Signature ? m67l(0, license(), z) : m67l(license() - 1, -1, z);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lٜؓ۠ */
    public int mo35l(int i, C5932l c5932l, firebase firebaseVar) {
        if (this.startapp == 0) {
            return 0;
        }
        return m77l(i, c5932l, firebaseVar);
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final void m64l(int i, int i2) {
        this.adcel.crashlytics = i2 - this.ads.firebase();
        C0267l c0267l = this.adcel;
        c0267l.amazon = i;
        c0267l.purchase = this.Signature ? 1 : -1;
        c0267l.billing = -1;
        c0267l.loadAd = i2;
        c0267l.mopub = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final int m65l(int i) {
        if (i == 1) {
            return (this.startapp != 1 && m76l()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.startapp != 1 && m76l()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.startapp == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.startapp == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.startapp == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130 && this.startapp == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final void mo66l(int i) {
        this.ad = i;
        this.advert = RecyclerView.UNDEFINED_DURATION;
        C3798l c3798l = this.isVip;
        if (c3798l != null) {
            c3798l.f7907l = -1;
        }
        m141l();
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final View m67l(int i, int i2, boolean z) {
        m68l();
        int i3 = z ? 24579 : 320;
        return this.startapp == 0 ? this.crashlytics.m1183l(i, i2, i3, 320) : this.amazon.m1183l(i, i2, i3, 320);
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void m68l() {
        if (this.adcel == null) {
            C0267l c0267l = new C0267l();
            c0267l.yandex = true;
            c0267l.admob = 0;
            c0267l.subs = 0;
            c0267l.firebase = null;
            this.adcel = c0267l;
        }
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final View m69l(int i, int i2) {
        int i3;
        int i4;
        m68l();
        if (i2 <= i && i2 >= i) {
            return Signature(i);
        }
        if (this.ads.purchase(Signature(i)) < this.ads.firebase()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.startapp == 0 ? this.crashlytics.m1183l(i, i2, i3, i4) : this.amazon.m1183l(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: lٍؘؘ */
    public View mo38l(firebase firebaseVar, C5932l c5932l, boolean z, boolean z2) {
        int i;
        int iLicense;
        int i2;
        m68l();
        int iLicense2 = license();
        if (z2) {
            iLicense = license() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iLicense2;
            iLicense = 0;
            i2 = 1;
        }
        int iLoadAd = c5932l.loadAd();
        int iFirebase = this.ads.firebase();
        int iMopub = this.ads.mopub();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iLicense != i) {
            View viewSignature = Signature(iLicense);
            int iM126native = isPro.m126native(viewSignature);
            int iPurchase = this.ads.purchase(viewSignature);
            int iLoadAd2 = this.ads.loadAd(viewSignature);
            if (iM126native >= 0 && iM126native < iLoadAd) {
                if (!((C13036l) viewSignature.getLayoutParams()).yandex.isPro()) {
                    boolean z3 = iLoadAd2 <= iFirebase && iPurchase < iFirebase;
                    boolean z4 = iPurchase >= iMopub && iLoadAd2 > iMopub;
                    if (!z3 && !z4) {
                        return viewSignature;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewSignature;
                        } else if (view == null) {
                            view = viewSignature;
                        }
                    } else if (z3) {
                        view2 = viewSignature;
                    } else if (view == null) {
                        view = viewSignature;
                    }
                } else if (view3 == null) {
                    view3 = viewSignature;
                }
            }
            iLicense += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؘِٞ */
    public boolean mo39l() {
        return this.isVip == null && this.subscription == this.license;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final View m70l() {
        return Signature(this.Signature ? 0 : license() - 1);
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final int m71l(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        m68l();
        AbstractC0962l abstractC0962l = this.ads;
        boolean z = !this.pro;
        return AbstractC11994l.crashlytics(c5932l, abstractC0962l, m83l(z), m63l(z), this, this.pro, this.Signature);
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final int m72l(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        m68l();
        AbstractC0962l abstractC0962l = this.ads;
        boolean z = !this.pro;
        return AbstractC11994l.amazon(c5932l, abstractC0962l, m83l(z), m63l(z), this, this.pro);
    }

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public final void m73l(int i, int i2, boolean z, C5932l c5932l) {
        int i3;
        int iFirebase;
        this.adcel.smaato = this.ads.subs() == 0 && this.ads.billing() == 0;
        this.adcel.billing = i;
        int[] iArr = this.appmetrica;
        iArr[0] = 0;
        iArr[1] = 0;
        int iSmaato = c5932l.yandex != -1 ? this.ads.smaato() : 0;
        if (this.adcel.billing == -1) {
            i3 = 0;
        } else {
            i3 = iSmaato;
            iSmaato = 0;
        }
        iArr[0] = iSmaato;
        iArr[1] = i3;
        int iMax = Math.max(0, iSmaato);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C0267l c0267l = this.adcel;
        int i4 = z2 ? iMax2 : iMax;
        c0267l.admob = i4;
        if (!z2) {
            iMax = iMax2;
        }
        c0267l.subs = iMax;
        if (z2) {
            c0267l.admob = this.ads.admob() + i4;
            View viewM70l = m70l();
            C0267l c0267l2 = this.adcel;
            c0267l2.purchase = this.Signature ? -1 : 1;
            int iM126native = isPro.m126native(viewM70l);
            C0267l c0267l3 = this.adcel;
            c0267l2.amazon = iM126native + c0267l3.purchase;
            c0267l3.loadAd = this.ads.loadAd(viewM70l);
            iFirebase = this.ads.loadAd(viewM70l) - this.ads.mopub();
        } else {
            View viewM87l = m87l();
            C0267l c0267l4 = this.adcel;
            c0267l4.admob = this.ads.firebase() + c0267l4.admob;
            C0267l c0267l5 = this.adcel;
            c0267l5.purchase = this.Signature ? 1 : -1;
            int iM126native2 = isPro.m126native(viewM87l);
            C0267l c0267l6 = this.adcel;
            c0267l5.amazon = iM126native2 + c0267l6.purchase;
            c0267l6.loadAd = this.ads.purchase(viewM87l);
            iFirebase = (-this.ads.purchase(viewM87l)) + this.ads.firebase();
        }
        C0267l c0267l7 = this.adcel;
        c0267l7.crashlytics = i2;
        if (z) {
            c0267l7.crashlytics = i2 - iFirebase;
        }
        c0267l7.mopub = iFirebase;
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final int m74l(firebase firebaseVar, C0267l c0267l, C5932l c5932l, boolean z) {
        int i;
        int i2 = c0267l.crashlytics;
        int i3 = c0267l.mopub;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0267l.mopub = i3 + i2;
            }
            m89l(firebaseVar, c0267l);
        }
        int i4 = c0267l.crashlytics + c0267l.admob;
        while (true) {
            if ((!c0267l.smaato && i4 <= 0) || (i = c0267l.amazon) < 0 || i >= c5932l.loadAd()) {
                break;
            }
            C4839l c4839l = this.premium;
            c4839l.yandex = 0;
            c4839l.loadAd = false;
            c4839l.crashlytics = false;
            c4839l.amazon = false;
            mo52l(firebaseVar, c5932l, c0267l, c4839l);
            if (!c4839l.loadAd) {
                int i5 = c0267l.loadAd;
                int i6 = c4839l.yandex;
                c0267l.loadAd = (c0267l.billing * i6) + i5;
                if (!c4839l.crashlytics || c0267l.firebase != null || !c5932l.mopub) {
                    c0267l.crashlytics -= i6;
                    i4 -= i6;
                }
                int i7 = c0267l.mopub;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0267l.mopub = i8;
                    int i9 = c0267l.crashlytics;
                    if (i9 < 0) {
                        c0267l.mopub = i8 + i9;
                    }
                    m89l(firebaseVar, c0267l);
                }
                if (z && c4839l.amazon) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0267l.crashlytics;
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final int m75l() {
        View viewM67l = m67l(license() - 1, -1, false);
        if (viewM67l == null) {
            return -1;
        }
        return isPro.m126native(viewM67l);
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final boolean m76l() {
        return this.loadAd.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final int m77l(int i, C5932l c5932l, firebase firebaseVar) {
        if (license() != 0 && i != 0) {
            m68l();
            this.adcel.yandex = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m73l(i2, iAbs, true, c5932l);
            C0267l c0267l = this.adcel;
            int iM74l = m74l(firebaseVar, c0267l, c5932l, false) + c0267l.mopub;
            if (iM74l >= 0) {
                if (iAbs > iM74l) {
                    i = i2 * iM74l;
                }
                this.ads.metrica(-i);
                this.adcel.isPro = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public final void m78l(int i, int i2) {
        this.adcel.crashlytics = this.ads.mopub() - i2;
        C0267l c0267l = this.adcel;
        c0267l.purchase = this.Signature ? -1 : 1;
        c0267l.amazon = i;
        c0267l.billing = 1;
        c0267l.loadAd = i2;
        c0267l.mopub = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void mo79l(RecyclerView recyclerView, int i) {
        purchase purchaseVar = new purchase(recyclerView.getContext());
        purchaseVar.yandex = i;
        m137l(purchaseVar);
    }

    /* JADX INFO: renamed from: lْۥٞ */
    public void mo47l(C5932l c5932l, C0267l c0267l, crashlytics crashlyticsVar) {
        int i = c0267l.amazon;
        if (i < 0 || i >= c5932l.loadAd()) {
            return;
        }
        crashlyticsVar.yandex(i, Math.max(0, c0267l.mopub));
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m80l(int i, int i2) {
        this.ad = i;
        this.advert = i2;
        C3798l c3798l = this.isVip;
        if (c3798l != null) {
            c3798l.f7907l = -1;
        }
        m141l();
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final int m81l(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        m68l();
        AbstractC0962l abstractC0962l = this.ads;
        boolean z = !this.pro;
        return AbstractC11994l.loadAd(c5932l, abstractC0962l, m83l(z), m63l(z), this, this.pro);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final boolean mo82l() {
        if (this.remoteconfig != 1073741824 && this.smaato != 1073741824) {
            int iLicense = license();
            for (int i = 0; i < iLicense; i++) {
                ViewGroup.LayoutParams layoutParams = Signature(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final View m83l(boolean z) {
        return this.Signature ? m67l(license() - 1, -1, z) : m67l(0, license(), z);
    }

    /* JADX INFO: renamed from: lٕۗٞ */
    public void mo50l(boolean z) {
        crashlytics(null);
        if (this.license == z) {
            return;
        }
        this.license = z;
        m141l();
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lَٖؔ */
    public int mo51l(int i, C5932l c5932l, firebase firebaseVar) {
        if (this.startapp == 1) {
            return 0;
        }
        return m77l(i, c5932l, firebaseVar);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m84l(firebase firebaseVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewSignature = Signature(i);
                m142l(i);
                firebaseVar.subs(viewSignature);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewSignature2 = Signature(i3);
            m142l(i3);
            firebaseVar.subs(viewSignature2);
        }
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final void m85l() {
        if (this.startapp == 1 || !m76l()) {
            this.Signature = this.tapsense;
        } else {
            this.Signature = !this.tapsense;
        }
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public final int m86l(int i, firebase firebaseVar, C5932l c5932l, boolean z) {
        int iFirebase;
        int iFirebase2 = i - this.ads.firebase();
        if (iFirebase2 <= 0) {
            return 0;
        }
        int i2 = -m77l(iFirebase2, c5932l, firebaseVar);
        int i3 = i + i2;
        if (!z || (iFirebase = i3 - this.ads.firebase()) <= 0) {
            return i2;
        }
        this.ads.metrica(-iFirebase);
        return i2 - iFirebase;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final View m87l() {
        return Signature(this.Signature ? license() - 1 : 0);
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final int m88l(int i, firebase firebaseVar, C5932l c5932l, boolean z) {
        int iMopub;
        int iMopub2 = this.ads.mopub() - i;
        if (iMopub2 <= 0) {
            return 0;
        }
        int i2 = -m77l(-iMopub2, c5932l, firebaseVar);
        int i3 = i + i2;
        if (!z || (iMopub = this.ads.mopub() - i3) <= 0) {
            return i2;
        }
        this.ads.metrica(iMopub);
        return iMopub + i2;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m89l(firebase firebaseVar, C0267l c0267l) {
        if (!c0267l.yandex || c0267l.smaato) {
            return;
        }
        int i = c0267l.mopub;
        int i2 = c0267l.subs;
        if (c0267l.billing == -1) {
            int iLicense = license();
            if (i < 0) {
                return;
            }
            int iBilling = (this.ads.billing() - i) + i2;
            if (this.Signature) {
                for (int i3 = 0; i3 < iLicense; i3++) {
                    View viewSignature = Signature(i3);
                    if (this.ads.purchase(viewSignature) < iBilling || this.ads.vip(viewSignature) < iBilling) {
                        m84l(firebaseVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iLicense - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewSignature2 = Signature(i5);
                if (this.ads.purchase(viewSignature2) < iBilling || this.ads.vip(viewSignature2) < iBilling) {
                    m84l(firebaseVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iLicense2 = license();
        if (!this.Signature) {
            for (int i7 = 0; i7 < iLicense2; i7++) {
                View viewSignature3 = Signature(i7);
                if (this.ads.loadAd(viewSignature3) > i6 || this.ads.remoteconfig(viewSignature3) > i6) {
                    m84l(firebaseVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iLicense2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewSignature4 = Signature(i9);
            if (this.ads.loadAd(viewSignature4) > i6 || this.ads.remoteconfig(viewSignature4) > i6) {
                m84l(firebaseVar, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ */
    public void mo52l(firebase firebaseVar, C5932l c5932l, C0267l c0267l, C4839l c4839l) {
        int i;
        int iAmazon;
        int i2;
        int iAmazon2;
        View viewLoadAd = c0267l.loadAd(firebaseVar);
        if (viewLoadAd == null) {
            c4839l.loadAd = true;
            return;
        }
        C13036l c13036l = (C13036l) viewLoadAd.getLayoutParams();
        List list = c0267l.firebase;
        boolean z = this.Signature;
        int i3 = c0267l.billing;
        if (list == null) {
            if (z == (i3 == -1)) {
                loadAd(viewLoadAd, -1, false);
            } else {
                loadAd(viewLoadAd, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                loadAd(viewLoadAd, -1, true);
            } else {
                loadAd(viewLoadAd, 0, true);
            }
        }
        C13036l c13036l2 = (C13036l) viewLoadAd.getLayoutParams();
        Rect itemDecorInsetsForChild = this.loadAd.getItemDecorInsetsForChild(viewLoadAd);
        int i4 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
        int i5 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
        int iPro = isPro.pro(amazon(), this.vip, this.smaato, m145strictfp() + m146synchronized() + ((ViewGroup.MarginLayoutParams) c13036l2).leftMargin + ((ViewGroup.MarginLayoutParams) c13036l2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c13036l2).width);
        int iPro2 = isPro.pro(purchase(), this.metrica, this.remoteconfig, m143package() + m148volatile() + ((ViewGroup.MarginLayoutParams) c13036l2).topMargin + ((ViewGroup.MarginLayoutParams) c13036l2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c13036l2).height);
        if (m139l(viewLoadAd, iPro, iPro2, c13036l2)) {
            viewLoadAd.measure(iPro, iPro2);
        }
        c4839l.yandex = this.ads.crashlytics(viewLoadAd);
        if (this.startapp == 1) {
            if (m76l()) {
                iAmazon2 = this.vip - m145strictfp();
                iAmazon = iAmazon2 - this.ads.amazon(viewLoadAd);
            } else {
                int iM146synchronized = m146synchronized();
                iAmazon2 = this.ads.amazon(viewLoadAd) + iM146synchronized;
                iAmazon = iM146synchronized;
            }
            int i6 = c0267l.billing;
            i2 = c0267l.loadAd;
            int i7 = c4839l.yandex;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iM148volatile = m148volatile();
            int iAmazon3 = this.ads.amazon(viewLoadAd) + iM148volatile;
            int i9 = c0267l.billing;
            int i10 = c0267l.loadAd;
            int i11 = c4839l.yandex;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iAmazon2 = i10;
                i2 = iM148volatile;
                i = iAmazon3;
                iAmazon = i12;
            } else {
                int i13 = i10 + i11;
                i = iAmazon3;
                iAmazon = i10;
                i2 = iM148volatile;
                iAmazon2 = i13;
            }
        }
        isPro.m124case(viewLoadAd, iAmazon, i2, iAmazon2, i);
        if (c13036l.yandex.isPro() || c13036l.yandex.remoteconfig()) {
            c4839l.crashlytics = true;
        }
        c4839l.amazon = viewLoadAd.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.isPro
    public int metrica(C5932l c5932l) {
        return m72l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: new */
    public void mo53new(firebase firebaseVar, C5932l c5932l, C15685l c15685l) {
        super.mo53new(firebaseVar, c5932l, c15685l);
        subs subsVar = this.loadAd.mAdapter;
        if (subsVar == null || subsVar.mopub() <= 0) {
            return;
        }
        c15685l.loadAd(C6933l.remoteconfig);
    }

    @Override // androidx.recyclerview.widget.isPro
    public boolean purchase() {
        return this.startapp == 1;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int remoteconfig(C5932l c5932l) {
        return m81l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    public int smaato(C5932l c5932l) {
        return m72l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void subs(int i, crashlytics crashlyticsVar) {
        boolean z;
        int i2;
        C3798l c3798l = this.isVip;
        if (c3798l == null || (i2 = c3798l.f7907l) < 0) {
            m85l();
            z = this.Signature;
            i2 = this.ad;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c3798l.f7905l;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.applovin && i2 >= 0 && i2 < i; i4++) {
            crashlyticsVar.yandex(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:123:0x0202  */
    /* JADX WARN: Code duplicated, block: B:126:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0232  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:138:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x023e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0242  */
    /* JADX WARN: Code duplicated, block: B:143:0x0246  */
    /* JADX WARN: Code duplicated, block: B:145:0x024d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0253  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: this */
    public void mo56this(firebase firebaseVar, C5932l c5932l) {
        View focusedChild;
        int iLoadAd;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo38l;
        boolean z3;
        AbstractC0962l abstractC0962l;
        int iPurchase;
        int iLoadAd2;
        int iFirebase;
        int iMopub;
        boolean z4;
        boolean z5;
        AbstractC0962l abstractC0962l2;
        int iSmaato;
        C13036l c13036l;
        int i;
        int iPurchase2;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iM88l;
        int i7;
        View viewAdcel;
        int iPurchase3;
        int iMopub2;
        int i8;
        int i9 = -1;
        if (!(this.isVip == null && this.ad == -1) && c5932l.loadAd() == 0) {
            m131implements(firebaseVar);
            return;
        }
        C3798l c3798l = this.isVip;
        if (c3798l != null && (i8 = c3798l.f7907l) >= 0) {
            this.ad = i8;
        }
        m68l();
        boolean z6 = false;
        this.adcel.yandex = false;
        m85l();
        RecyclerView recyclerView2 = this.loadAd;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.yandex.crashlytics.contains(focusedChild)) {
            focusedChild = null;
        }
        C5453l c5453l = this.signatures;
        if (!c5453l.purchase || this.ad != -1 || this.isVip != null) {
            c5453l.billing();
            c5453l.amazon = this.Signature ^ this.license;
            if (c5932l.mopub || (i = this.ad) == -1) {
                if (license() != 0) {
                    recyclerView = this.loadAd;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.yandex.crashlytics.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c13036l = (C13036l) focusedChild2.getLayoutParams();
                        if (!c13036l.yandex.isPro() || c13036l.yandex.amazon() < 0 || c13036l.yandex.amazon() >= c5932l.loadAd()) {
                            z = this.subscription;
                            z2 = this.license;
                            if (z == z2 || (viewMo38l = mo38l(firebaseVar, c5932l, c5453l.amazon, z2)) == null) {
                                c5453l.loadAd();
                                if (this.license) {
                                    iLoadAd = c5932l.loadAd() - 1;
                                } else {
                                    iLoadAd = 0;
                                }
                                c5453l.loadAd = iLoadAd;
                            } else {
                                int iM126native = isPro.m126native(viewMo38l);
                                z3 = c5453l.amazon;
                                abstractC0962l = (AbstractC0962l) c5453l.billing;
                                if (z3) {
                                    int iLoadAd3 = abstractC0962l.loadAd(viewMo38l);
                                    abstractC0962l2 = (AbstractC0962l) c5453l.billing;
                                    if (Integer.MIN_VALUE == abstractC0962l2.yandex) {
                                        iSmaato = 0;
                                    } else {
                                        iSmaato = abstractC0962l2.smaato() - abstractC0962l2.yandex;
                                    }
                                    c5453l.crashlytics = iSmaato + iLoadAd3;
                                } else {
                                    c5453l.crashlytics = abstractC0962l.purchase(viewMo38l);
                                }
                                c5453l.loadAd = iM126native;
                                if (!c5932l.mopub && mo39l()) {
                                    iPurchase = this.ads.purchase(viewMo38l);
                                    iLoadAd2 = this.ads.loadAd(viewMo38l);
                                    iFirebase = this.ads.firebase();
                                    iMopub = this.ads.mopub();
                                    if (iLoadAd2 <= iFirebase || iPurchase >= iFirebase) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iPurchase >= iMopub || iLoadAd2 <= iMopub) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (c5453l.amazon) {
                                            iFirebase = iMopub;
                                        }
                                        c5453l.crashlytics = iFirebase;
                                    }
                                }
                            }
                        } else {
                            c5453l.crashlytics(focusedChild2, isPro.m126native(focusedChild2));
                        }
                    } else {
                        z = this.subscription;
                        z2 = this.license;
                        if (z == z2) {
                            c5453l.loadAd();
                            if (this.license) {
                                iLoadAd = c5932l.loadAd() - 1;
                            } else {
                                iLoadAd = 0;
                            }
                            c5453l.loadAd = iLoadAd;
                        } else {
                            int iM126native2 = isPro.m126native(viewMo38l);
                            z3 = c5453l.amazon;
                            abstractC0962l = (AbstractC0962l) c5453l.billing;
                            if (z3) {
                                int iLoadAd4 = abstractC0962l.loadAd(viewMo38l);
                                abstractC0962l2 = (AbstractC0962l) c5453l.billing;
                                if (Integer.MIN_VALUE == abstractC0962l2.yandex) {
                                    iSmaato = 0;
                                } else {
                                    iSmaato = abstractC0962l2.smaato() - abstractC0962l2.yandex;
                                }
                                c5453l.crashlytics = iSmaato + iLoadAd4;
                            } else {
                                c5453l.crashlytics = abstractC0962l.purchase(viewMo38l);
                            }
                            c5453l.loadAd = iM126native2;
                            if (!c5932l.mopub) {
                                iPurchase = this.ads.purchase(viewMo38l);
                                iLoadAd2 = this.ads.loadAd(viewMo38l);
                                iFirebase = this.ads.firebase();
                                iMopub = this.ads.mopub();
                                if (iLoadAd2 <= iFirebase) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iPurchase >= iMopub) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (c5453l.amazon) {
                                        iFirebase = iMopub;
                                    }
                                    c5453l.crashlytics = iFirebase;
                                } else {
                                    if (c5453l.amazon) {
                                        iFirebase = iMopub;
                                    }
                                    c5453l.crashlytics = iFirebase;
                                }
                            }
                        }
                    }
                } else {
                    c5453l.loadAd();
                    if (this.license) {
                        iLoadAd = c5932l.loadAd() - 1;
                    } else {
                        iLoadAd = 0;
                    }
                    c5453l.loadAd = iLoadAd;
                }
            } else if (i < 0 || i >= c5932l.loadAd()) {
                this.ad = -1;
                this.advert = RecyclerView.UNDEFINED_DURATION;
                if (license() != 0) {
                    recyclerView = this.loadAd;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c13036l = (C13036l) focusedChild2.getLayoutParams();
                        if (c13036l.yandex.isPro()) {
                            z = this.subscription;
                            z2 = this.license;
                            if (z == z2) {
                                c5453l.loadAd();
                                if (this.license) {
                                    iLoadAd = c5932l.loadAd() - 1;
                                } else {
                                    iLoadAd = 0;
                                }
                                c5453l.loadAd = iLoadAd;
                            } else {
                                int iM126native3 = isPro.m126native(viewMo38l);
                                z3 = c5453l.amazon;
                                abstractC0962l = (AbstractC0962l) c5453l.billing;
                                if (z3) {
                                    int iLoadAd5 = abstractC0962l.loadAd(viewMo38l);
                                    abstractC0962l2 = (AbstractC0962l) c5453l.billing;
                                    if (Integer.MIN_VALUE == abstractC0962l2.yandex) {
                                        iSmaato = 0;
                                    } else {
                                        iSmaato = abstractC0962l2.smaato() - abstractC0962l2.yandex;
                                    }
                                    c5453l.crashlytics = iSmaato + iLoadAd5;
                                } else {
                                    c5453l.crashlytics = abstractC0962l.purchase(viewMo38l);
                                }
                                c5453l.loadAd = iM126native3;
                                if (!c5932l.mopub) {
                                    iPurchase = this.ads.purchase(viewMo38l);
                                    iLoadAd2 = this.ads.loadAd(viewMo38l);
                                    iFirebase = this.ads.firebase();
                                    iMopub = this.ads.mopub();
                                    if (iLoadAd2 <= iFirebase) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iPurchase >= iMopub) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (c5453l.amazon) {
                                            iFirebase = iMopub;
                                        }
                                        c5453l.crashlytics = iFirebase;
                                    } else {
                                        if (c5453l.amazon) {
                                            iFirebase = iMopub;
                                        }
                                        c5453l.crashlytics = iFirebase;
                                    }
                                }
                            }
                        } else {
                            z = this.subscription;
                            z2 = this.license;
                            if (z == z2) {
                                c5453l.loadAd();
                                if (this.license) {
                                    iLoadAd = c5932l.loadAd() - 1;
                                } else {
                                    iLoadAd = 0;
                                }
                                c5453l.loadAd = iLoadAd;
                            } else {
                                int iM126native4 = isPro.m126native(viewMo38l);
                                z3 = c5453l.amazon;
                                abstractC0962l = (AbstractC0962l) c5453l.billing;
                                if (z3) {
                                    int iLoadAd6 = abstractC0962l.loadAd(viewMo38l);
                                    abstractC0962l2 = (AbstractC0962l) c5453l.billing;
                                    if (Integer.MIN_VALUE == abstractC0962l2.yandex) {
                                        iSmaato = 0;
                                    } else {
                                        iSmaato = abstractC0962l2.smaato() - abstractC0962l2.yandex;
                                    }
                                    c5453l.crashlytics = iSmaato + iLoadAd6;
                                } else {
                                    c5453l.crashlytics = abstractC0962l.purchase(viewMo38l);
                                }
                                c5453l.loadAd = iM126native4;
                                if (!c5932l.mopub) {
                                    iPurchase = this.ads.purchase(viewMo38l);
                                    iLoadAd2 = this.ads.loadAd(viewMo38l);
                                    iFirebase = this.ads.firebase();
                                    iMopub = this.ads.mopub();
                                    if (iLoadAd2 <= iFirebase) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iPurchase >= iMopub) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (c5453l.amazon) {
                                            iFirebase = iMopub;
                                        }
                                        c5453l.crashlytics = iFirebase;
                                    } else {
                                        if (c5453l.amazon) {
                                            iFirebase = iMopub;
                                        }
                                        c5453l.crashlytics = iFirebase;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.subscription;
                        z2 = this.license;
                        if (z == z2) {
                            c5453l.loadAd();
                            if (this.license) {
                                iLoadAd = c5932l.loadAd() - 1;
                            } else {
                                iLoadAd = 0;
                            }
                            c5453l.loadAd = iLoadAd;
                        } else {
                            int iM126native5 = isPro.m126native(viewMo38l);
                            z3 = c5453l.amazon;
                            abstractC0962l = (AbstractC0962l) c5453l.billing;
                            if (z3) {
                                int iLoadAd7 = abstractC0962l.loadAd(viewMo38l);
                                abstractC0962l2 = (AbstractC0962l) c5453l.billing;
                                if (Integer.MIN_VALUE == abstractC0962l2.yandex) {
                                    iSmaato = 0;
                                } else {
                                    iSmaato = abstractC0962l2.smaato() - abstractC0962l2.yandex;
                                }
                                c5453l.crashlytics = iSmaato + iLoadAd7;
                            } else {
                                c5453l.crashlytics = abstractC0962l.purchase(viewMo38l);
                            }
                            c5453l.loadAd = iM126native5;
                            if (!c5932l.mopub) {
                                iPurchase = this.ads.purchase(viewMo38l);
                                iLoadAd2 = this.ads.loadAd(viewMo38l);
                                iFirebase = this.ads.firebase();
                                iMopub = this.ads.mopub();
                                if (iLoadAd2 <= iFirebase) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iPurchase >= iMopub) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (c5453l.amazon) {
                                        iFirebase = iMopub;
                                    }
                                    c5453l.crashlytics = iFirebase;
                                } else {
                                    if (c5453l.amazon) {
                                        iFirebase = iMopub;
                                    }
                                    c5453l.crashlytics = iFirebase;
                                }
                            }
                        }
                    }
                } else {
                    c5453l.loadAd();
                    if (this.license) {
                        iLoadAd = c5932l.loadAd() - 1;
                    } else {
                        iLoadAd = 0;
                    }
                    c5453l.loadAd = iLoadAd;
                }
            } else {
                int i10 = this.ad;
                c5453l.loadAd = i10;
                C3798l c3798l2 = this.isVip;
                if (c3798l2 != null && c3798l2.f7907l >= 0) {
                    boolean z7 = c3798l2.f7905l;
                    c5453l.amazon = z7;
                    AbstractC0962l abstractC0962l3 = this.ads;
                    if (z7) {
                        c5453l.crashlytics = abstractC0962l3.mopub() - this.isVip.f7906l;
                    } else {
                        c5453l.crashlytics = abstractC0962l3.firebase() + this.isVip.f7906l;
                    }
                } else if (this.advert == Integer.MIN_VALUE) {
                    View viewAdcel2 = adcel(i10);
                    if (viewAdcel2 == null) {
                        if (license() > 0) {
                            c5453l.amazon = (this.ad < isPro.m126native(Signature(0))) == this.Signature;
                        }
                        c5453l.loadAd();
                    } else if (this.ads.crashlytics(viewAdcel2) > this.ads.smaato()) {
                        c5453l.loadAd();
                    } else {
                        int iPurchase4 = this.ads.purchase(viewAdcel2) - this.ads.firebase();
                        AbstractC0962l abstractC0962l4 = this.ads;
                        if (iPurchase4 < 0) {
                            c5453l.crashlytics = abstractC0962l4.firebase();
                            c5453l.amazon = false;
                        } else if (abstractC0962l4.mopub() - this.ads.loadAd(viewAdcel2) < 0) {
                            c5453l.crashlytics = this.ads.mopub();
                            c5453l.amazon = true;
                        } else {
                            boolean z8 = c5453l.amazon;
                            AbstractC0962l abstractC0962l5 = this.ads;
                            if (z8) {
                                int iLoadAd8 = abstractC0962l5.loadAd(viewAdcel2);
                                AbstractC0962l abstractC0962l6 = this.ads;
                                iPurchase2 = (Integer.MIN_VALUE == abstractC0962l6.yandex ? 0 : abstractC0962l6.smaato() - abstractC0962l6.yandex) + iLoadAd8;
                            } else {
                                iPurchase2 = abstractC0962l5.purchase(viewAdcel2);
                            }
                            c5453l.crashlytics = iPurchase2;
                        }
                    }
                } else {
                    boolean z9 = this.Signature;
                    c5453l.amazon = z9;
                    AbstractC0962l abstractC0962l7 = this.ads;
                    if (z9) {
                        c5453l.crashlytics = abstractC0962l7.mopub() - this.advert;
                    } else {
                        c5453l.crashlytics = abstractC0962l7.firebase() + this.advert;
                    }
                }
            }
            c5453l.purchase = true;
        } else if (focusedChild != null && (this.ads.purchase(focusedChild) >= this.ads.mopub() || this.ads.loadAd(focusedChild) <= this.ads.firebase())) {
            c5453l.crashlytics(focusedChild, isPro.m126native(focusedChild));
        }
        C0267l c0267l = this.adcel;
        c0267l.billing = c0267l.isPro >= 0 ? 1 : -1;
        int[] iArr = this.appmetrica;
        iArr[0] = 0;
        iArr[1] = 0;
        int iSmaato2 = c5932l.yandex != -1 ? this.ads.smaato() : 0;
        if (this.adcel.billing == -1) {
            i2 = 0;
        } else {
            i2 = iSmaato2;
            iSmaato2 = 0;
        }
        iArr[0] = iSmaato2;
        iArr[1] = i2;
        int iFirebase2 = this.ads.firebase() + Math.max(0, iSmaato2);
        int iAdmob = this.ads.admob() + Math.max(0, iArr[1]);
        if (c5932l.mopub && (i7 = this.ad) != -1 && this.advert != Integer.MIN_VALUE && (viewAdcel = adcel(i7)) != null) {
            boolean z10 = this.Signature;
            AbstractC0962l abstractC0962l8 = this.ads;
            if (z10) {
                iMopub2 = abstractC0962l8.mopub() - this.ads.loadAd(viewAdcel);
                iPurchase3 = this.advert;
            } else {
                iPurchase3 = abstractC0962l8.purchase(viewAdcel) - this.ads.firebase();
                iMopub2 = this.advert;
            }
            int i11 = iMopub2 - iPurchase3;
            if (i11 > 0) {
                iFirebase2 += i11;
            } else {
                iAdmob -= i11;
            }
        }
        boolean z11 = c5453l.amazon;
        boolean z12 = this.Signature;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        mo32l(firebaseVar, c5932l, c5453l, i9);
        startapp(firebaseVar);
        this.adcel.smaato = this.ads.subs() == 0 && this.ads.billing() == 0;
        this.adcel.getClass();
        this.adcel.subs = 0;
        boolean z13 = c5453l.amazon;
        int i12 = c5453l.loadAd;
        if (z13) {
            m64l(i12, c5453l.crashlytics);
            C0267l c0267l2 = this.adcel;
            c0267l2.admob = iFirebase2;
            m74l(firebaseVar, c0267l2, c5932l, false);
            C0267l c0267l3 = this.adcel;
            i4 = c0267l3.loadAd;
            int i13 = c0267l3.amazon;
            int i14 = c0267l3.crashlytics;
            if (i14 > 0) {
                iAdmob += i14;
            }
            m78l(c5453l.loadAd, c5453l.crashlytics);
            C0267l c0267l4 = this.adcel;
            c0267l4.admob = iAdmob;
            c0267l4.amazon += c0267l4.purchase;
            m74l(firebaseVar, c0267l4, c5932l, false);
            C0267l c0267l5 = this.adcel;
            i3 = c0267l5.loadAd;
            int i15 = c0267l5.crashlytics;
            if (i15 > 0) {
                m64l(i13, i4);
                C0267l c0267l6 = this.adcel;
                c0267l6.admob = i15;
                m74l(firebaseVar, c0267l6, c5932l, false);
                i4 = this.adcel.loadAd;
            }
        } else {
            m78l(i12, c5453l.crashlytics);
            C0267l c0267l7 = this.adcel;
            c0267l7.admob = iAdmob;
            m74l(firebaseVar, c0267l7, c5932l, false);
            C0267l c0267l8 = this.adcel;
            i3 = c0267l8.loadAd;
            int i16 = c0267l8.amazon;
            int i17 = c0267l8.crashlytics;
            if (i17 > 0) {
                iFirebase2 += i17;
            }
            m64l(c5453l.loadAd, c5453l.crashlytics);
            C0267l c0267l9 = this.adcel;
            c0267l9.admob = iFirebase2;
            c0267l9.amazon += c0267l9.purchase;
            m74l(firebaseVar, c0267l9, c5932l, false);
            C0267l c0267l10 = this.adcel;
            int i18 = c0267l10.loadAd;
            int i19 = c0267l10.crashlytics;
            if (i19 > 0) {
                m78l(i16, i3);
                C0267l c0267l11 = this.adcel;
                c0267l11.admob = i19;
                m74l(firebaseVar, c0267l11, c5932l, false);
                i3 = this.adcel.loadAd;
            }
            i4 = i18;
        }
        if (license() > 0) {
            if (this.Signature ^ this.license) {
                int iM88l2 = m88l(i3, firebaseVar, c5932l, true);
                i5 = i4 + iM88l2;
                i6 = i3 + iM88l2;
                iM88l = m86l(i5, firebaseVar, c5932l, false);
            } else {
                int iM86l = m86l(i4, firebaseVar, c5932l, true);
                i5 = i4 + iM86l;
                i6 = i3 + iM86l;
                iM88l = m88l(i6, firebaseVar, c5932l, false);
            }
            i4 = i5 + iM88l;
            i3 = i6 + iM88l;
        }
        if (c5932l.firebase && license() != 0 && !c5932l.mopub && mo39l()) {
            List list2 = firebaseVar.amazon;
            int size = list2.size();
            int iM126native6 = isPro.m126native(Signature(0));
            int i20 = 0;
            int iCrashlytics = 0;
            int iCrashlytics2 = 0;
            while (i20 < size) {
                metrica metricaVar = (metrica) list2.get(i20);
                boolean zIsPro = metricaVar.isPro();
                View view = metricaVar.yandex;
                if (!zIsPro) {
                    boolean z14 = metricaVar.amazon() < iM126native6 ? true : z6;
                    boolean z15 = this.Signature;
                    AbstractC0962l abstractC0962l9 = this.ads;
                    if (z14 != z15) {
                        iCrashlytics += abstractC0962l9.crashlytics(view);
                    } else {
                        iCrashlytics2 += abstractC0962l9.crashlytics(view);
                    }
                }
                i20++;
                z6 = false;
            }
            this.adcel.firebase = list2;
            if (iCrashlytics > 0) {
                m64l(isPro.m126native(m87l()), i4);
                C0267l c0267l12 = this.adcel;
                c0267l12.admob = iCrashlytics;
                r4 = 0;
                c0267l12.crashlytics = 0;
                c0267l12.yandex(null);
                m74l(firebaseVar, this.adcel, c5932l, false);
            } else {
                r4 = 0;
            }
            if (iCrashlytics2 > 0) {
                m78l(isPro.m126native(m70l()), i3);
                C0267l c0267l13 = this.adcel;
                c0267l13.admob = iCrashlytics2;
                c0267l13.crashlytics = r4;
                list = null;
                c0267l13.yandex(null);
                m74l(firebaseVar, this.adcel, c5932l, r4);
            } else {
                list = null;
            }
            this.adcel.firebase = list;
        }
        if (c5932l.mopub) {
            c5453l.billing();
        } else {
            AbstractC0962l abstractC0962l10 = this.ads;
            abstractC0962l10.yandex = abstractC0962l10.smaato();
        }
        this.subscription = this.license;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final boolean mo91throw() {
        return true;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final Parcelable mo92transient() {
        C3798l c3798l = this.isVip;
        if (c3798l != null) {
            C3798l c3798l2 = new C3798l();
            c3798l2.f7907l = c3798l.f7907l;
            c3798l2.f7906l = c3798l.f7906l;
            c3798l2.f7905l = c3798l.f7905l;
            return c3798l2;
        }
        C3798l c3798l3 = new C3798l();
        if (license() <= 0) {
            c3798l3.f7907l = -1;
            return c3798l3;
        }
        m68l();
        boolean z = this.subscription ^ this.Signature;
        c3798l3.f7905l = z;
        if (z) {
            View viewM70l = m70l();
            c3798l3.f7906l = this.ads.mopub() - this.ads.loadAd(viewM70l);
            c3798l3.f7907l = isPro.m126native(viewM70l);
            return c3798l3;
        }
        View viewM87l = m87l();
        c3798l3.f7907l = isPro.m126native(viewM87l);
        c3798l3.f7906l = this.ads.purchase(viewM87l) - this.ads.firebase();
        return c3798l3;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: try */
    public void mo57try(C5932l c5932l) {
        this.isVip = null;
        this.ad = -1;
        this.advert = RecyclerView.UNDEFINED_DURATION;
        this.signatures.billing();
    }

    @Override // androidx.recyclerview.widget.isPro
    public int vip(C5932l c5932l) {
        return m71l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: while */
    public boolean mo58while(int i, Bundle bundle) {
        int iMin;
        if (super.mo58while(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.startapp == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.loadAd;
                iMin = Math.min(i2, mo27extends(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.loadAd;
                iMin = Math.min(i3, ad(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (iMin >= 0) {
                m80l(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC9662l
    public final PointF yandex(int i) {
        if (license() == 0) {
            return null;
        }
        int i2 = (i < isPro.m126native(Signature(0))) != this.Signature ? -1 : 1;
        return this.startapp == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void mo90static(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.startapp = 1;
        this.tapsense = false;
        this.Signature = false;
        this.license = false;
        this.pro = true;
        this.ad = -1;
        this.advert = RecyclerView.UNDEFINED_DURATION;
        this.isVip = null;
        this.signatures = new C5453l();
        this.premium = new C4839l();
        this.applovin = 2;
        this.appmetrica = new int[2];
        m62l(i);
        crashlytics(null);
        if (this.tapsense) {
            this.tapsense = false;
            m141l();
        }
    }

    /* JADX INFO: renamed from: lًؑٝ */
    public void mo32l(firebase firebaseVar, C5932l c5932l, C5453l c5453l, int i) {
    }
}
