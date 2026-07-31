package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC0653l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15872l;
import defpackage.C0267l;
import defpackage.C10023l;
import defpackage.C10754l;
import defpackage.C10975l;
import defpackage.C13036l;
import defpackage.C15685l;
import defpackage.C16807l;
import defpackage.C4839l;
import defpackage.C5453l;
import defpackage.C5932l;
import defpackage.C6933l;
import defpackage.C8339l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final Set f433catch = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public int f434extends;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public int f435for;
    public boolean inmobi;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C10023l f436native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public int[] f437package;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Rect f438private;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final SparseIntArray f439strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public View[] f440synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public int f441throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f442throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final SparseIntArray f443volatile;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.inmobi = false;
        this.f442throws = -1;
        this.f439strictfp = new SparseIntArray();
        this.f443volatile = new SparseIntArray();
        this.f436native = new C10023l(28);
        this.f438private = new Rect();
        this.f434extends = -1;
        this.f435for = -1;
        this.f441throw = -1;
        m45l(isPro.m127private(context, attributeSet, i, i2).loadAd);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void mo25abstract() {
        C10023l c10023l = this.f436native;
        c10023l.applovin();
        ((SparseIntArray) c10023l.f20418l).clear();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int ad(firebase firebaseVar, C5932l c5932l) {
        if (this.startapp == 1) {
            return Math.min(this.f442throws, m147throws());
        }
        if (c5932l.loadAd() < 1) {
            return 0;
        }
        return m31l(c5932l.loadAd() - 1, c5932l, firebaseVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    public final C13036l ads() {
        return this.startapp == 0 ? new C16807l(-2, -1) : new C16807l(-1, -2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean billing(C13036l c13036l) {
        return c13036l instanceof C16807l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo26default(android.view.View r23, int r24, androidx.recyclerview.widget.firebase r25, defpackage.C5932l r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo26default(android.view.View, int, androidx.recyclerview.widget.firebase, lؘۙؖ):android.view.View");
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final int mo27extends(firebase firebaseVar, C5932l c5932l) {
        if (this.startapp == 0) {
            return Math.min(this.f442throws, m147throws());
        }
        if (c5932l.loadAd() < 1) {
            return 0;
        }
        return m31l(c5932l.loadAd() - 1, c5932l, firebaseVar) + 1;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void mo28finally(int i, int i2) {
        C10023l c10023l = this.f436native;
        c10023l.applovin();
        ((SparseIntArray) c10023l.f20418l).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    public final int firebase(C5932l c5932l) {
        return m71l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void mo29import(int i, int i2) {
        C10023l c10023l = this.f436native;
        c10023l.applovin();
        ((SparseIntArray) c10023l.f20418l).clear();
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void mo30instanceof(int i, int i2) {
        C10023l c10023l = this.f436native;
        c10023l.applovin();
        ((SparseIntArray) c10023l.f20418l).clear();
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final int m31l(int i, C5932l c5932l, firebase firebaseVar) {
        boolean z = c5932l.mopub;
        C10023l c10023l = this.f436native;
        if (!z) {
            int i2 = this.f442throws;
            c10023l.getClass();
            return C10023l.signatures(i, i2);
        }
        int iLoadAd = firebaseVar.loadAd(i);
        if (iLoadAd != -1) {
            int i3 = this.f442throws;
            c10023l.getClass();
            return C10023l.signatures(iLoadAd, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void mo32l(firebase firebaseVar, C5932l c5932l, C5453l c5453l, int i) {
        m33l();
        if (c5932l.loadAd() > 0 && !c5932l.mopub) {
            boolean z = i == 1;
            int iM43l = m43l(c5453l.loadAd, c5932l, firebaseVar);
            if (z) {
                while (iM43l > 0) {
                    int i2 = c5453l.loadAd;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c5453l.loadAd = i3;
                    iM43l = m43l(i3, c5932l, firebaseVar);
                }
            } else {
                int iLoadAd = c5932l.loadAd() - 1;
                int i4 = c5453l.loadAd;
                while (i4 < iLoadAd) {
                    int i5 = i4 + 1;
                    int iM43l2 = m43l(i5, c5932l, firebaseVar);
                    if (iM43l2 <= iM43l) {
                        break;
                    }
                    i4 = i5;
                    iM43l = iM43l2;
                }
                c5453l.loadAd = i4;
            }
        }
        m42l();
    }

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public final void m33l() {
        int iM143package;
        int iM148volatile;
        if (this.startapp == 1) {
            iM143package = this.vip - m145strictfp();
            iM148volatile = m146synchronized();
        } else {
            iM143package = this.metrica - m143package();
            iM148volatile = m148volatile();
        }
        m41l(iM143package - iM148volatile);
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final void m34l(View view, int i, boolean z) {
        int iPro;
        int iPro2;
        C16807l c16807l = (C16807l) view.getLayoutParams();
        Rect rect = c16807l.loadAd;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c16807l).topMargin + ((ViewGroup.MarginLayoutParams) c16807l).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c16807l).leftMargin + ((ViewGroup.MarginLayoutParams) c16807l).rightMargin;
        int iM48l = m48l(c16807l.purchase, c16807l.billing);
        if (this.startapp == 1) {
            iPro2 = isPro.pro(false, iM48l, i, i3, ((ViewGroup.MarginLayoutParams) c16807l).width);
            iPro = isPro.pro(true, this.ads.smaato(), this.remoteconfig, i2, ((ViewGroup.MarginLayoutParams) c16807l).height);
        } else {
            int iPro3 = isPro.pro(false, iM48l, i, i2, ((ViewGroup.MarginLayoutParams) c16807l).height);
            int iPro4 = isPro.pro(true, this.ads.smaato(), this.smaato, i3, ((ViewGroup.MarginLayoutParams) c16807l).width);
            iPro = iPro3;
            iPro2 = iPro4;
        }
        C13036l c13036l = (C13036l) view.getLayoutParams();
        if (z ? m134l(view, iPro2, iPro, c13036l) : m139l(view, iPro2, iPro, c13036l)) {
            view.measure(iPro2, iPro);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final int mo35l(int i, C5932l c5932l, firebase firebaseVar) {
        m33l();
        m42l();
        return super.mo35l(i, c5932l, firebaseVar);
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final HashSet m36l(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.loadAd;
        int iM49l = m49l(i2, recyclerView.mState, recyclerView.mRecycler);
        for (int i3 = i; i3 < i + iM49l; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final int m37l(int i) {
        int i2 = this.startapp;
        RecyclerView recyclerView = this.loadAd;
        if (i2 == 0) {
            return m31l(i, recyclerView.mState, recyclerView.mRecycler);
        }
        return m43l(i, recyclerView.mState, recyclerView.mRecycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final View mo38l(firebase firebaseVar, C5932l c5932l, boolean z, boolean z2) {
        int i;
        int iLicense;
        int iLicense2 = license();
        int i2 = 1;
        if (z2) {
            iLicense = license() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iLicense2;
            iLicense = 0;
        }
        int iLoadAd = c5932l.loadAd();
        m68l();
        int iFirebase = this.ads.firebase();
        int iMopub = this.ads.mopub();
        View view = null;
        View view2 = null;
        while (iLicense != i) {
            View viewSignature = Signature(iLicense);
            int iM126native = isPro.m126native(viewSignature);
            if (iM126native >= 0 && iM126native < iLoadAd && m43l(iM126native, c5932l, firebaseVar) == 0) {
                if (((C13036l) viewSignature.getLayoutParams()).yandex.isPro()) {
                    if (view2 == null) {
                        view2 = viewSignature;
                    }
                } else {
                    if (this.ads.purchase(viewSignature) < iMopub && this.ads.loadAd(viewSignature) >= iFirebase) {
                        return viewSignature;
                    }
                    if (view == null) {
                        view = viewSignature;
                    }
                }
            }
            iLicense += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final boolean mo39l() {
        return this.isVip == null && !this.inmobi;
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public final int m40l(int i) {
        int i2 = this.startapp;
        RecyclerView recyclerView = this.loadAd;
        if (i2 == 1) {
            return m31l(i, recyclerView.mState, recyclerView.mRecycler);
        }
        return m43l(i, recyclerView.mState, recyclerView.mRecycler);
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final void m41l(int i) {
        int i2;
        int[] iArr = this.f437package;
        int i3 = this.f442throws;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f437package = iArr;
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void m42l() {
        View[] viewArr = this.f440synchronized;
        if (viewArr == null || viewArr.length != this.f442throws) {
            this.f440synchronized = new View[this.f442throws];
        }
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final int m43l(int i, C5932l c5932l, firebase firebaseVar) {
        boolean z = c5932l.mopub;
        C10023l c10023l = this.f436native;
        if (!z) {
            int i2 = this.f442throws;
            c10023l.getClass();
            return i % i2;
        }
        int i3 = this.f443volatile.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iLoadAd = firebaseVar.loadAd(i);
        if (iLoadAd != -1) {
            int i4 = this.f442throws;
            c10023l.getClass();
            return iLoadAd % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final HashSet m44l(int i) {
        return m36l(m40l(i), i);
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final void m45l(int i) {
        if (i == this.f442throws) {
            return;
        }
        this.inmobi = true;
        if (i < 1) {
            C8339l.metrica(AbstractC0653l.vip(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f442throws = i;
        this.f436native.applovin();
        m141l();
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final void mo46l(Rect rect, int i, int i2) {
        int iMopub;
        int iMopub2;
        if (this.f437package == null) {
            super.mo46l(rect, i, i2);
        }
        int iM145strictfp = m145strictfp() + m146synchronized();
        int iM143package = m143package() + m148volatile();
        if (this.startapp == 1) {
            int iHeight = rect.height() + iM143package;
            RecyclerView recyclerView = this.loadAd;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            iMopub2 = isPro.mopub(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f437package;
            iMopub = isPro.mopub(i, iArr[iArr.length - 1] + iM145strictfp, this.loadAd.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM145strictfp;
            RecyclerView recyclerView2 = this.loadAd;
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            iMopub = isPro.mopub(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f437package;
            iMopub2 = isPro.mopub(i2, iArr2[iArr2.length - 1] + iM143package, this.loadAd.getMinimumHeight());
        }
        this.loadAd.setMeasuredDimension(iMopub, iMopub2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final void mo47l(C5932l c5932l, C0267l c0267l, crashlytics crashlyticsVar) {
        int i;
        int i2 = this.f442throws;
        for (int i3 = 0; i3 < this.f442throws && (i = c0267l.amazon) >= 0 && i < c5932l.loadAd() && i2 > 0; i3++) {
            crashlyticsVar.yandex(c0267l.amazon, Math.max(0, c0267l.mopub));
            this.f436native.getClass();
            i2--;
            c0267l.amazon += c0267l.purchase;
        }
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public final int m48l(int i, int i2) {
        if (this.startapp != 1 || !m76l()) {
            int[] iArr = this.f437package;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f437package;
        int i3 = this.f442throws;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final int m49l(int i, C5932l c5932l, firebase firebaseVar) {
        boolean z = c5932l.mopub;
        C10023l c10023l = this.f436native;
        if (!z) {
            c10023l.getClass();
            return 1;
        }
        int i2 = this.f439strictfp.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (firebaseVar.loadAd(i) != -1) {
            c10023l.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public final void mo50l(boolean z) {
        if (z) {
            C10754l.ads("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.mo50l(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final int mo51l(int i, C5932l c5932l, firebase firebaseVar) {
        m33l();
        m42l();
        return super.mo51l(i, c5932l, firebaseVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void mo52l(firebase firebaseVar, C5932l c5932l, C0267l c0267l, C4839l c4839l) {
        int i;
        int i2;
        int i3;
        int iAmazon;
        int iM146synchronized;
        int iPro;
        int iPro2;
        ?? r12;
        int i4;
        View viewLoadAd;
        int iIsPro = this.ads.isPro();
        boolean z = iIsPro != 1073741824;
        int i5 = license() > 0 ? this.f437package[this.f442throws] : 0;
        if (z) {
            m33l();
        }
        boolean z2 = c0267l.purchase == 1;
        int iM43l = this.f442throws;
        if (!z2) {
            iM43l = m43l(c0267l.amazon, c5932l, firebaseVar) + m49l(c0267l.amazon, c5932l, firebaseVar);
        }
        int i6 = 0;
        while (i6 < this.f442throws && (i4 = c0267l.amazon) >= 0 && i4 < c5932l.loadAd() && iM43l > 0) {
            int i7 = c0267l.amazon;
            int iM49l = m49l(i7, c5932l, firebaseVar);
            if (iM49l > this.f442throws) {
                C8339l.metrica(AbstractC14814l.remoteconfig(this.f442throws, " spans.", AbstractC14814l.subscription(i7, iM49l, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            iM43l -= iM49l;
            if (iM43l < 0 || (viewLoadAd = c0267l.loadAd(firebaseVar)) == null) {
                break;
            }
            this.f440synchronized[i6] = viewLoadAd;
            i6++;
        }
        if (i6 == 0) {
            c4839l.loadAd = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f440synchronized[i];
            C16807l c16807l = (C16807l) view.getLayoutParams();
            int iM49l2 = m49l(isPro.m126native(view), c5932l, firebaseVar);
            c16807l.billing = iM49l2;
            c16807l.purchase = i8;
            i8 += iM49l2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f440synchronized[i10];
            if (c0267l.firebase != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    loadAd(view2, -1, true);
                } else {
                    loadAd(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                loadAd(view2, -1, false);
            } else {
                r12 = 0;
                loadAd(view2, 0, false);
            }
            RecyclerView recyclerView = this.loadAd;
            Rect rect = this.f438private;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            m34l(view2, iIsPro, r12);
            int iCrashlytics = this.ads.crashlytics(view2);
            if (iCrashlytics > i9) {
                i9 = iCrashlytics;
            }
            float fAmazon = (this.ads.amazon(view2) * 1.0f) / ((C16807l) view2.getLayoutParams()).billing;
            if (fAmazon > f) {
                f = fAmazon;
            }
        }
        if (z) {
            m41l(Math.max(Math.round(f * this.f442throws), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f440synchronized[i11];
                m34l(view3, 1073741824, true);
                int iCrashlytics2 = this.ads.crashlytics(view3);
                if (iCrashlytics2 > i9) {
                    i9 = iCrashlytics2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f440synchronized[i12];
            if (this.ads.crashlytics(view4) != i9) {
                C16807l c16807l2 = (C16807l) view4.getLayoutParams();
                Rect rect2 = c16807l2.loadAd;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c16807l2).topMargin + ((ViewGroup.MarginLayoutParams) c16807l2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c16807l2).leftMargin + ((ViewGroup.MarginLayoutParams) c16807l2).rightMargin;
                int iM48l = m48l(c16807l2.purchase, c16807l2.billing);
                if (this.startapp == 1) {
                    iPro2 = isPro.pro(false, iM48l, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c16807l2).width);
                    iPro = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iPro = isPro.pro(false, iM48l, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c16807l2).height);
                    iPro2 = iMakeMeasureSpec;
                }
                if (m134l(view4, iPro2, iPro, (C13036l) view4.getLayoutParams())) {
                    view4.measure(iPro2, iPro);
                }
            }
        }
        int iM148volatile = 0;
        c4839l.yandex = i9;
        int i15 = this.startapp;
        int i16 = c0267l.billing;
        int iAmazon2 = c0267l.loadAd;
        if (i15 != 1) {
            if (i16 == -1) {
                iM146synchronized = iAmazon2 - i9;
                iAmazon = iAmazon2;
            } else {
                iAmazon = iAmazon2 + i9;
                iM146synchronized = iAmazon2;
            }
            iAmazon2 = iM148volatile;
        } else if (i16 == -1) {
            iM148volatile = iAmazon2 - i9;
            iM146synchronized = 0;
            iAmazon = 0;
        } else {
            iAmazon = 0;
            iM148volatile = iAmazon2;
            iAmazon2 += i9;
            iM146synchronized = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f440synchronized;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            C16807l c16807l3 = (C16807l) view5.getLayoutParams();
            if (this.startapp != 1) {
                iM148volatile = m148volatile() + this.f437package[c16807l3.purchase];
                iAmazon2 = this.ads.amazon(view5) + iM148volatile;
            } else if (m76l()) {
                int iM146synchronized2 = m146synchronized() + this.f437package[this.f442throws - c16807l3.purchase];
                iAmazon = iM146synchronized2;
                iM146synchronized = iM146synchronized2 - this.ads.amazon(view5);
            } else {
                iM146synchronized = m146synchronized() + this.f437package[c16807l3.purchase];
                iAmazon = this.ads.amazon(view5) + iM146synchronized;
            }
            isPro.m124case(view5, iM146synchronized, iM148volatile, iAmazon, iAmazon2);
            if (c16807l3.yandex.isPro() || c16807l3.yandex.remoteconfig()) {
                c4839l.crashlytics = true;
            }
            c4839l.amazon = view5.hasFocusable() | c4839l.amazon;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    public final int metrica(C5932l c5932l) {
        return m72l(c5932l);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void mo53new(firebase firebaseVar, C5932l c5932l, C15685l c15685l) {
        super.mo53new(firebaseVar, c5932l, c15685l);
        c15685l.isPro("android.widget.GridView");
        subs subsVar = this.loadAd.mAdapter;
        if (subsVar == null || subsVar.mopub() <= 1) {
            return;
        }
        c15685l.loadAd(C6933l.ads);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void mo54public(int i, int i2) {
        C10023l c10023l = this.f436native;
        c10023l.applovin();
        ((SparseIntArray) c10023l.f20418l).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    public final int smaato(C5932l c5932l) {
        return m72l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l subscription(Context context, AttributeSet attributeSet) {
        C16807l c16807l = new C16807l(context, attributeSet);
        c16807l.purchase = -1;
        c16807l.billing = 0;
        return c16807l;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void mo55super(firebase firebaseVar, C5932l c5932l, View view, C15685l c15685l) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C16807l)) {
            m130goto(view, c15685l);
            return;
        }
        C16807l c16807l = (C16807l) layoutParams;
        int iM31l = m31l(c16807l.yandex.amazon(), c5932l, firebaseVar);
        int i = this.startapp;
        int i2 = c16807l.purchase;
        int i3 = c16807l.billing;
        if (i == 0) {
            c15685l.firebase(C10975l.m3010package(false, i2, i3, iM31l, 1));
        } else {
            c15685l.firebase(C10975l.m3010package(false, iM31l, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l tapsense(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C16807l c16807l = new C16807l((ViewGroup.MarginLayoutParams) layoutParams);
            c16807l.purchase = -1;
            c16807l.billing = 0;
            return c16807l;
        }
        C16807l c16807l2 = new C16807l(layoutParams);
        c16807l2.purchase = -1;
        c16807l2.billing = 0;
        return c16807l2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void mo56this(firebase firebaseVar, C5932l c5932l) {
        boolean z = c5932l.mopub;
        SparseIntArray sparseIntArray = this.f443volatile;
        SparseIntArray sparseIntArray2 = this.f439strictfp;
        if (z) {
            int iLicense = license();
            for (int i = 0; i < iLicense; i++) {
                C16807l c16807l = (C16807l) Signature(i).getLayoutParams();
                int iAmazon = c16807l.yandex.amazon();
                sparseIntArray2.put(iAmazon, c16807l.billing);
                sparseIntArray.put(iAmazon, c16807l.purchase);
            }
        }
        super.mo56this(firebaseVar, c5932l);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void mo57try(C5932l c5932l) {
        View viewAdcel;
        super.mo57try(c5932l);
        this.inmobi = false;
        int i = this.f434extends;
        if (i == -1 || (viewAdcel = adcel(i)) == null) {
            return;
        }
        viewAdcel.sendAccessibilityEvent(67108864);
        this.f434extends = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    public final int vip(C5932l c5932l) {
        return m71l(c5932l);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final boolean mo58while(int i, Bundle bundle) {
        View viewSignature;
        metrica childViewHolder;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == C6933l.ads.yandex() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= license()) {
                    viewSignature = null;
                    break;
                }
                View viewSignature2 = Signature(i5);
                Objects.requireNonNull(viewSignature2);
                if (viewSignature2.isAccessibilityFocused()) {
                    viewSignature = Signature(i5);
                    break;
                }
                i5++;
            }
            if (viewSignature != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f433catch.contains(Integer.valueOf(i6)) && (childViewHolder = this.loadAd.getChildViewHolder(viewSignature)) != null) {
                    int iLoadAd = childViewHolder.loadAd();
                    int iM40l = m40l(iLoadAd);
                    int iM37l = m37l(iLoadAd);
                    if (iM40l >= 0 && iM37l >= 0) {
                        if (!m44l(iLoadAd).contains(Integer.valueOf(this.f435for)) || !m36l(m37l(iLoadAd), iLoadAd).contains(Integer.valueOf(this.f441throw))) {
                            this.f435for = iM40l;
                            this.f441throw = iM37l;
                        }
                        int i7 = this.f435for;
                        if (i7 == -1) {
                            i7 = iM40l;
                        }
                        int i8 = this.f441throw;
                        if (i8 != -1) {
                            iM37l = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iLoadAd - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM40l2 = m40l(iIntValue);
                                    int iM37l2 = m37l(iIntValue);
                                    if (iM40l2 >= 0 && iM37l2 >= 0) {
                                        if (this.startapp != 1) {
                                            if (m44l(iIntValue).contains(Integer.valueOf(i7)) && iM37l2 < iM37l) {
                                                this.f441throw = iM37l2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iM40l2 == i7 && iM37l2 < iM37l) || iM40l2 < i7) {
                                                this.f435for = iM40l2;
                                                this.f441throw = iM37l2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM40l < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m147throws()) {
                                                    it2 = m44l(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM40l) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f435for = iIntValue2;
                                                                this.f441throw = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM40l < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m147throws()) {
                                                it4 = m44l(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM40l) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f435for = iIntValue3;
                                                            this.f441throw = m37l(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo66l(iIntValue);
                                this.f434extends = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iLoadAd - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM40l3 = m40l(iIntValue);
                                    int iM37l3 = m37l(iIntValue);
                                    if (iM40l3 >= 0 && iM37l3 >= 0) {
                                        if (this.startapp != 1) {
                                            if (iM40l3 < i7 && iM37l3 == iM37l) {
                                                this.f435for = ((Integer) Collections.max(m44l(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iM40l3 < i7 && m36l(m37l(iIntValue), iIntValue).contains(Integer.valueOf(iM37l))) {
                                                this.f435for = iM40l3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM40l < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m147throws()) {
                                                    it2 = m44l(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM40l) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f435for = iIntValue2;
                                                                this.f441throw = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM40l < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m147throws()) {
                                                it4 = m44l(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM40l) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f435for = iIntValue3;
                                                            this.f441throw = m37l(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo66l(iIntValue);
                                this.f434extends = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iLoadAd + 1;
                            while (true) {
                                if (iIntValue < m147throws()) {
                                    int iM40l4 = m40l(iIntValue);
                                    int iM37l4 = m37l(iIntValue);
                                    if (iM40l4 >= 0 && iM37l4 >= 0) {
                                        if (this.startapp != 1) {
                                            if (iM37l4 > iM37l && m44l(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.f441throw = iM37l4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iM40l4 == i7 && iM37l4 > iM37l) || iM40l4 > i7) {
                                                this.f435for = iM40l4;
                                                this.f441throw = iM37l4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM40l < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m147throws()) {
                                                    it2 = m44l(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM40l) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f435for = iIntValue2;
                                                                this.f441throw = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM40l < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m147throws()) {
                                                it4 = m44l(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM40l) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f435for = iIntValue3;
                                                            this.f441throw = m37l(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo66l(iIntValue);
                                this.f434extends = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iLoadAd + 1;
                            while (true) {
                                if (iIntValue < m147throws()) {
                                    int iM40l5 = m40l(iIntValue);
                                    int iM37l5 = m37l(iIntValue);
                                    if (iM40l5 >= 0 && iM37l5 >= 0) {
                                        if (this.startapp != 1) {
                                            if (iM40l5 > i7 && iM37l5 == iM37l) {
                                                this.f435for = m40l(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iM40l5 > i7 && (iM37l5 == iM37l || m36l(m37l(iIntValue), iIntValue).contains(Integer.valueOf(iM37l)))) {
                                                this.f435for = iM40l5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.startapp) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM40l < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < m147throws()) {
                                                it2 = m44l(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iM40l) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f435for = iIntValue2;
                                                            this.f441throw = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iM40l < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < m147throws()) {
                                            it4 = m44l(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iM40l) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f435for = iIntValue3;
                                                        this.f441throw = m37l(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo66l(iIntValue);
                                this.f434extends = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo58while(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMopub = this.loadAd.mAdapter.mopub();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMopub) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.loadAd;
                    int iM43l = m43l(i11, recyclerView.mState, recyclerView.mRecycler);
                    RecyclerView recyclerView2 = this.loadAd;
                    int iM31l = m31l(i11, recyclerView2.mState, recyclerView2.mRecycler);
                    if (this.startapp != 1) {
                        if (iM43l == i9 && iM31l == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM43l == i10 && iM31l == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    m80l(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.inmobi = false;
        this.f442throws = -1;
        this.f439strictfp = new SparseIntArray();
        this.f443volatile = new SparseIntArray();
        this.f436native = new C10023l(28);
        this.f438private = new Rect();
        this.f434extends = -1;
        this.f435for = -1;
        this.f441throw = -1;
        m45l(i);
    }
}
