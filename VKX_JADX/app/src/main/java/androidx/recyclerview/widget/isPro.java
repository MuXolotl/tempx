package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.AbstractC13735l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC1742l;
import defpackage.AbstractC4582l;
import defpackage.C10975l;
import defpackage.C13036l;
import defpackage.C15685l;
import defpackage.C16772l;
import defpackage.C1770l;
import defpackage.C2494l;
import defpackage.C3253l;
import defpackage.C3316l;
import defpackage.C5128l;
import defpackage.C5501l;
import defpackage.C5932l;
import defpackage.C8339l;
import defpackage.C9292l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class isPro {
    public final boolean admob;
    public final C2494l amazon;
    public boolean billing;
    public final C2494l crashlytics;
    public boolean firebase;
    public int isPro;
    public RecyclerView loadAd;
    public int metrica;
    public boolean mopub;
    public purchase purchase;
    public int remoteconfig;
    public int smaato;
    public final boolean subs;
    public int vip;
    public loadAd yandex;

    public isPro() {
        C3316l c3316l = new C3316l(19, this);
        C5501l c5501l = new C5501l(23, this);
        this.crashlytics = new C2494l(c3316l);
        this.amazon = new C2494l(c5501l);
        this.billing = false;
        this.mopub = false;
        this.admob = true;
        this.subs = true;
    }

    public static int advert(View view) {
        return view.getBottom() + ((C13036l) view.getLayoutParams()).loadAd.bottom;
    }

    public static int applovin(View view) {
        Rect rect = ((C13036l) view.getLayoutParams()).loadAd;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int appmetrica(View view) {
        return view.getRight() + ((C13036l) view.getLayoutParams()).loadAd.right;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static void m124case(View view, int i, int i2, int i3, int i4) {
        C13036l c13036l = (C13036l) view.getLayoutParams();
        Rect rect = c13036l.loadAd;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c13036l).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c13036l).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c13036l).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c13036l).bottomMargin);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static boolean m125else(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int inmobi(View view) {
        return view.getTop() - ((C13036l) view.getLayoutParams()).loadAd.top;
    }

    public static int mopub(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static int m126native(View view) {
        return ((C13036l) view.getLayoutParams()).yandex.amazon();
    }

    public static int premium(View view) {
        Rect rect = ((C13036l) view.getLayoutParams()).loadAd;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static C9292l m127private(Context context, AttributeSet attributeSet, int i, int i2) {
        C9292l c9292l = new C9292l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1742l.yandex, i, i2);
        c9292l.yandex = typedArrayObtainStyledAttributes.getInt(0, 1);
        c9292l.loadAd = typedArrayObtainStyledAttributes.getInt(10, 1);
        c9292l.crashlytics = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c9292l.amazon = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c9292l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int pro(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int signatures(View view) {
        return view.getLeft() - ((C13036l) view.getLayoutParams()).loadAd.left;
    }

    public final View Signature(int i) {
        loadAd loadad = this.yandex;
        if (loadad != null) {
            return loadad.amazon(i);
        }
        return null;
    }

    public int ad(firebase firebaseVar, C5932l c5932l) {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView == null || recyclerView.mAdapter == null || !amazon()) {
            return 1;
        }
        return this.loadAd.mAdapter.mopub();
    }

    public View adcel(int i) {
        int iLicense = license();
        for (int i2 = 0; i2 < iLicense; i2++) {
            View viewSignature = Signature(i2);
            metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(viewSignature);
            if (childViewHolderInt != null && childViewHolderInt.amazon() == i && !childViewHolderInt.adcel() && (this.loadAd.mState.mopub || !childViewHolderInt.isPro())) {
                return viewSignature;
            }
        }
        return null;
    }

    public abstract C13036l ads();

    public abstract boolean amazon();

    public boolean billing(C13036l c13036l) {
        return c13036l != null;
    }

    /* JADX INFO: renamed from: catch */
    public boolean mo60catch() {
        return false;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m128const(firebase firebaseVar) {
        ArrayList arrayList;
        int size = firebaseVar.yandex.size();
        int i = size - 1;
        while (true) {
            arrayList = firebaseVar.yandex;
            if (i < 0) {
                break;
            }
            View view = ((metrica) arrayList.get(i)).yandex;
            metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.adcel()) {
                childViewHolderInt.startapp(false);
                if (childViewHolderInt.smaato()) {
                    this.loadAd.removeDetachedView(view, false);
                }
                AbstractC13735l abstractC13735l = this.loadAd.mItemAnimator;
                if (abstractC13735l != null) {
                    abstractC13735l.amazon(childViewHolderInt);
                }
                childViewHolderInt.startapp(true);
                metrica childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.vip = null;
                childViewHolderInt2.metrica = false;
                childViewHolderInt2.isPro &= -33;
                firebaseVar.isPro(childViewHolderInt2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = firebaseVar.loadAd;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.loadAd.invalidate();
        }
    }

    /* JADX INFO: renamed from: continue */
    public void mo95continue(int i) {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    public void crashlytics(String str) {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: default */
    public abstract View mo26default(View view, int i, firebase firebaseVar, C5932l c5932l);

    /* JADX INFO: renamed from: extends */
    public int mo27extends(firebase firebaseVar, C5932l c5932l) {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView == null || recyclerView.mAdapter == null || !purchase()) {
            return 1;
        }
        return this.loadAd.mAdapter.mopub();
    }

    /* JADX INFO: renamed from: final */
    public void mo61final(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.loadAd;
        firebase firebaseVar = recyclerView.mRecycler;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.loadAd.canScrollVertically(-1) && !this.loadAd.canScrollHorizontally(-1) && !this.loadAd.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        subs subsVar = this.loadAd.mAdapter;
        if (subsVar != null) {
            accessibilityEvent.setItemCount(subsVar.mopub());
        }
    }

    public abstract int firebase(C5932l c5932l);

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m129for(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C13036l) view.getLayoutParams()).loadAd;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.loadAd != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.loadAd.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m130goto(View view, C15685l c15685l) {
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isPro()) {
            return;
        }
        loadAd loadad = this.yandex;
        if (loadad.crashlytics.contains(childViewHolderInt.yandex)) {
            return;
        }
        RecyclerView recyclerView = this.loadAd;
        mo55super(recyclerView.mRecycler, recyclerView.mState, view, c15685l);
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m131implements(firebase firebaseVar) {
        for (int iLicense = license() - 1; iLicense >= 0; iLicense--) {
            if (!RecyclerView.getChildViewHolderInt(Signature(iLicense)).adcel()) {
                View viewSignature = Signature(iLicense);
                m142l(iLicense);
                firebaseVar.subs(viewSignature);
            }
        }
    }

    public abstract int isPro(C5932l c5932l);

    public void isVip(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public final int license() {
        loadAd loadad = this.yandex;
        if (loadad != null) {
            return loadad.purchase();
        }
        return 0;
    }

    public final void loadAd(View view, int i, boolean z) {
        metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.isPro()) {
            C5128l c5128l = this.loadAd.mViewInfoStore.yandex;
            C16772l c16772lYandex = (C16772l) c5128l.get(childViewHolderInt);
            if (c16772lYandex == null) {
                c16772lYandex = C16772l.yandex();
                c5128l.put(childViewHolderInt, c16772lYandex);
            }
            c16772lYandex.yandex |= 1;
        } else {
            this.loadAd.mViewInfoStore.crashlytics(childViewHolderInt);
        }
        C13036l c13036l = (C13036l) view.getLayoutParams();
        if (childViewHolderInt.ads() || childViewHolderInt.firebase()) {
            if (childViewHolderInt.firebase()) {
                childViewHolderInt.vip.remoteconfig(childViewHolderInt);
            } else {
                childViewHolderInt.isPro &= -33;
            }
            this.yandex.loadAd(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.loadAd;
            loadAd loadad = this.yandex;
            if (parent == recyclerView) {
                C3253l c3253l = loadad.loadAd;
                int iIndexOfChild = ((RecyclerView) loadad.yandex.f4179l).indexOfChild(view);
                int iSubscription = (iIndexOfChild == -1 || c3253l.license(iIndexOfChild)) ? -1 : iIndexOfChild - c3253l.subscription(iIndexOfChild);
                if (i == -1) {
                    i = this.yandex.purchase();
                }
                if (iSubscription == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.loadAd.indexOfChild(view));
                    C8339l.smaato(AbstractC14814l.vip(this.loadAd, sb));
                    return;
                }
                if (iSubscription != i) {
                    isPro ispro = this.loadAd.mLayout;
                    View viewSignature = ispro.Signature(iSubscription);
                    if (viewSignature == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iSubscription + ispro.loadAd.toString());
                    }
                    ispro.Signature(iSubscription);
                    ispro.yandex.crashlytics(iSubscription);
                    C13036l c13036l2 = (C13036l) viewSignature.getLayoutParams();
                    metrica childViewHolderInt2 = RecyclerView.getChildViewHolderInt(viewSignature);
                    boolean zIsPro = childViewHolderInt2.isPro();
                    RecyclerView recyclerView2 = ispro.loadAd;
                    if (zIsPro) {
                        C5128l c5128l2 = recyclerView2.mViewInfoStore.yandex;
                        C16772l c16772lYandex2 = (C16772l) c5128l2.get(childViewHolderInt2);
                        if (c16772lYandex2 == null) {
                            c16772lYandex2 = C16772l.yandex();
                            c5128l2.put(childViewHolderInt2, c16772lYandex2);
                        }
                        c16772lYandex2.yandex = 1 | c16772lYandex2.yandex;
                    } else {
                        recyclerView2.mViewInfoStore.crashlytics(childViewHolderInt2);
                    }
                    ispro.yandex.loadAd(viewSignature, i, c13036l2, childViewHolderInt2.isPro());
                }
            } else {
                loadad.yandex(view, i, false);
                c13036l.crashlytics = true;
                purchase purchaseVar = this.purchase;
                if (purchaseVar != null && purchaseVar.purchase && purchaseVar.loadAd.getChildLayoutPosition(view) == purchaseVar.yandex) {
                    purchaseVar.billing = view;
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "smooth scroll target view has been attached");
                    }
                }
            }
        }
        if (c13036l.amazon) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c13036l.yandex);
            }
            childViewHolderInt.yandex.invalidate();
            c13036l.amazon = false;
        }
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final void m133l(int i, int i2) {
        int iLicense = license();
        if (iLicense == 0) {
            this.loadAd.defaultOnMeasure(i, i2);
            return;
        }
        int i3 = RecyclerView.UNDEFINED_DURATION;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iLicense; i7++) {
            View viewSignature = Signature(i7);
            Rect rect = this.loadAd.mTempRect;
            isVip(viewSignature, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.loadAd.mTempRect.set(i6, i4, i3, i5);
        mo46l(this.loadAd.mTempRect, i, i2);
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final boolean m134l(View view, int i, int i2, C13036l c13036l) {
        return (this.admob && m125else(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c13036l).width) && m125else(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c13036l).height)) ? false : true;
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void m135l(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.loadAd = null;
            this.yandex = null;
            this.vip = 0;
            this.metrica = 0;
        } else {
            this.loadAd = recyclerView;
            this.yandex = recyclerView.mChildHelper;
            this.vip = recyclerView.getWidth();
            this.metrica = recyclerView.getHeight();
        }
        this.smaato = 1073741824;
        this.remoteconfig = 1073741824;
    }

    /* JADX INFO: renamed from: lٜؓ۠ */
    public abstract int mo35l(int i, C5932l c5932l, firebase firebaseVar);

    /* JADX INFO: renamed from: lؔٙؕ */
    public abstract void mo66l(int i);

    /* JADX INFO: renamed from: lؘِٞ */
    public boolean mo39l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public boolean mo136l(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM146synchronized = m146synchronized();
        int iM148volatile = m148volatile();
        int iM145strictfp = this.vip - m145strictfp();
        int iM143package = this.metrica - m143package();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM146synchronized;
        int iMin = Math.min(0, i);
        int i2 = top - iM148volatile;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM145strictfp;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM143package);
        if (this.loadAd.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM146synchronized2 = m146synchronized();
                int iM148volatile2 = m148volatile();
                int iM145strictfp2 = this.vip - m145strictfp();
                int iM143package2 = this.metrica - m143package();
                Rect rect2 = this.loadAd.mTempRect;
                isVip(focusedChild, rect2);
                if (rect2.left - i4 < iM145strictfp2 && rect2.right - i4 > iM146synchronized2 && rect2.top - i5 < iM143package2 && rect2.bottom - i5 > iM148volatile2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.smoothScrollBy(i4, i5);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.smoothScrollBy(i4, i5);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public final void m137l(purchase purchaseVar) {
        purchase purchaseVar2 = this.purchase;
        if (purchaseVar2 != null && purchaseVar != purchaseVar2 && purchaseVar2.purchase) {
            purchaseVar2.subs();
        }
        this.purchase = purchaseVar;
        RecyclerView recyclerView = this.loadAd;
        vip vipVar = recyclerView.mViewFlinger;
        vipVar.f467l.removeCallbacks(vipVar);
        vipVar.f466l.abortAnimation();
        if (purchaseVar.admob) {
            Log.w("RecyclerView", "An instance of " + purchaseVar.getClass().getSimpleName() + " was started more than once. Each instance of" + purchaseVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        purchaseVar.loadAd = recyclerView;
        purchaseVar.crashlytics = this;
        int i = purchaseVar.yandex;
        if (i == -1) {
            C8339l.metrica("Invalid target position");
            return;
        }
        recyclerView.mState.yandex = i;
        purchaseVar.purchase = true;
        purchaseVar.amazon = true;
        purchaseVar.billing = recyclerView.mLayout.adcel(i);
        purchaseVar.loadAd.mViewFlinger.loadAd();
        purchaseVar.admob = true;
    }

    /* JADX INFO: renamed from: lؚْٟ */
    public abstract void mo79l(RecyclerView recyclerView, int i);

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final void m138l(int i, int i2) {
        this.vip = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.smaato = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.vip = 0;
        }
        this.metrica = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.remoteconfig = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.metrica = 0;
    }

    /* JADX INFO: renamed from: lْ٘ۚ */
    public void mo46l(Rect rect, int i, int i2) {
        int iM145strictfp = m145strictfp() + m146synchronized() + rect.width();
        int iM143package = m143package() + m148volatile() + rect.height();
        RecyclerView recyclerView = this.loadAd;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.loadAd.setMeasuredDimension(mopub(i, iM145strictfp, recyclerView.getMinimumWidth()), mopub(i2, iM143package, this.loadAd.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final boolean m139l(View view, int i, int i2, C13036l c13036l) {
        return (!view.isLayoutRequested() && this.admob && m125else(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c13036l).width) && m125else(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c13036l).height)) ? false : true;
    }

    /* JADX INFO: renamed from: lٕؓٗ */
    public boolean mo82l() {
        return false;
    }

    /* JADX INFO: renamed from: lَٖؔ */
    public abstract int mo51l(int i, C5932l c5932l, firebase firebaseVar);

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final void m140l(RecyclerView recyclerView) {
        m138l(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void m141l() {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m142l(int i) {
        if (Signature(i) != null) {
            loadAd loadad = this.yandex;
            C1770l c1770l = loadad.yandex;
            int i2 = loadad.amazon;
            if (i2 == 1) {
                C8339l.smaato("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                C8339l.smaato("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iBilling = loadad.billing(i);
                View childAt = ((RecyclerView) c1770l.f4179l).getChildAt(iBilling);
                if (childAt == null) {
                    return;
                }
                loadad.amazon = 1;
                loadad.purchase = childAt;
                if (loadad.loadAd.signatures(iBilling)) {
                    loadad.isPro(childAt);
                }
                c1770l.adcel(iBilling);
            } finally {
                loadad.amazon = 0;
                loadad.purchase = null;
            }
        }
    }

    public abstract int metrica(C5932l c5932l);

    /* JADX INFO: renamed from: new */
    public void mo53new(firebase firebaseVar, C5932l c5932l, C15685l c15685l) {
        if (this.loadAd.canScrollVertically(-1) || this.loadAd.canScrollHorizontally(-1)) {
            c15685l.yandex(8192);
            c15685l.ads(true);
            c15685l.subs(67108864, true);
        }
        if (this.loadAd.canScrollVertically(1) || this.loadAd.canScrollHorizontally(1)) {
            c15685l.yandex(4096);
            c15685l.ads(true);
            c15685l.subs(67108864, true);
        }
        c15685l.yandex.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo27extends(firebaseVar, c5932l), ad(firebaseVar, c5932l), false, 0));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m143package() {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract boolean purchase();

    public abstract int remoteconfig(C5932l c5932l);

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void m144return(View view, firebase firebaseVar) {
        loadAd loadad = this.yandex;
        C1770l c1770l = loadad.yandex;
        int i = loadad.amazon;
        if (i == 1) {
            C8339l.smaato("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            C8339l.smaato("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            loadad.amazon = 1;
            loadad.purchase = view;
            int iIndexOfChild = ((RecyclerView) c1770l.f4179l).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (loadad.loadAd.signatures(iIndexOfChild)) {
                    loadad.isPro(view);
                }
                c1770l.adcel(iIndexOfChild);
            }
            loadad.amazon = 0;
            loadad.purchase = null;
            firebaseVar.subs(view);
        } catch (Throwable th) {
            loadad.amazon = 0;
            loadad.purchase = null;
            throw th;
        }
    }

    public abstract int smaato(C5932l c5932l);

    public final void startapp(firebase firebaseVar) {
        for (int iLicense = license() - 1; iLicense >= 0; iLicense--) {
            View viewSignature = Signature(iLicense);
            metrica childViewHolderInt = RecyclerView.getChildViewHolderInt(viewSignature);
            if (childViewHolderInt.adcel()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                }
            } else if (!childViewHolderInt.admob() || childViewHolderInt.isPro() || this.loadAd.mAdapter.f464l) {
                Signature(iLicense);
                this.yandex.crashlytics(iLicense);
                firebaseVar.firebase(viewSignature);
                this.loadAd.mViewInfoStore.crashlytics(childViewHolderInt);
            } else {
                m142l(iLicense);
                firebaseVar.isPro(childViewHolderInt);
            }
        }
    }

    /* JADX INFO: renamed from: static */
    public abstract void mo90static(RecyclerView recyclerView);

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int m145strictfp() {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public C13036l subscription(Context context, AttributeSet attributeSet) {
        return new C13036l(context, attributeSet);
    }

    /* JADX INFO: renamed from: super */
    public void mo55super(firebase firebaseVar, C5932l c5932l, View view, C15685l c15685l) {
        c15685l.firebase(C10975l.m3010package(false, purchase() ? m126native(view) : 0, 1, amazon() ? m126native(view) : 0, 1));
    }

    /* JADX INFO: renamed from: switch */
    public void mo123switch(int i) {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int m146synchronized() {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public C13036l tapsense(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C13036l) {
            return new C13036l((C13036l) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C13036l((ViewGroup.MarginLayoutParams) layoutParams) : new C13036l(layoutParams);
    }

    /* JADX INFO: renamed from: this */
    public abstract void mo56this(firebase firebaseVar, C5932l c5932l);

    /* JADX INFO: renamed from: throw */
    public abstract boolean mo91throw();

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m147throws() {
        RecyclerView recyclerView = this.loadAd;
        subs adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mopub();
        }
        return 0;
    }

    /* JADX INFO: renamed from: transient */
    public Parcelable mo92transient() {
        return null;
    }

    /* JADX INFO: renamed from: try */
    public abstract void mo57try(C5932l c5932l);

    public abstract int vip(C5932l c5932l);

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final int m148volatile() {
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r0
  0x0060: PHI (r0v8 int) = (r0v5 int), (r0v13 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: while */
    public boolean mo58while(int i, Bundle bundle) {
        int iM148volatile;
        int iM146synchronized;
        float f;
        firebase firebaseVar = this.loadAd.mRecycler;
        int iHeight = this.metrica;
        int iWidth = this.vip;
        Rect rect = new Rect();
        if (this.loadAd.getMatrix().isIdentity() && this.loadAd.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            iM148volatile = this.loadAd.canScrollVertically(1) ? (iHeight - m148volatile()) - m143package() : 0;
            if (this.loadAd.canScrollHorizontally(1)) {
                iM146synchronized = (iWidth - m146synchronized()) - m145strictfp();
            } else {
                iM146synchronized = 0;
            }
        } else if (i != 8192) {
            iM148volatile = 0;
            iM146synchronized = 0;
        } else {
            iM148volatile = this.loadAd.canScrollVertically(-1) ? -((iHeight - m148volatile()) - m143package()) : 0;
            if (this.loadAd.canScrollHorizontally(-1)) {
                iM146synchronized = -((iWidth - m146synchronized()) - m145strictfp());
            } else {
                iM146synchronized = 0;
            }
        }
        if (iM148volatile != 0 || iM146synchronized != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.sDebugAssertionsEnabled) {
                        C8339l.metrica(AbstractC4582l.loadAd("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", f, ")"));
                        return false;
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iM146synchronized = (int) (iM146synchronized * f);
                    iM148volatile = (int) (iM148volatile * f);
                }
                this.loadAd.smoothScrollBy(iM146synchronized, iM148volatile, null, RecyclerView.UNDEFINED_DURATION, true);
                return true;
            }
            RecyclerView recyclerView = this.loadAd;
            subs subsVar = recyclerView.mAdapter;
            if (subsVar != null) {
                if (i == 4096) {
                    recyclerView.smoothScrollToPosition(subsVar.mopub() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.smoothScrollToPosition(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: abstract */
    public void mo25abstract() {
    }

    /* JADX INFO: renamed from: class */
    public void mo94class() {
    }

    /* JADX INFO: renamed from: break */
    public void mo59break(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void mo132interface(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: protected */
    public void mo122protected(int i) {
    }

    /* JADX INFO: renamed from: finally */
    public void mo28finally(int i, int i2) {
    }

    /* JADX INFO: renamed from: import */
    public void mo29import(int i, int i2) {
    }

    /* JADX INFO: renamed from: instanceof */
    public void mo30instanceof(int i, int i2) {
    }

    /* JADX INFO: renamed from: public */
    public void mo54public(int i, int i2) {
    }

    public void subs(int i, crashlytics crashlyticsVar) {
    }

    public void admob(int i, int i2, C5932l c5932l, crashlytics crashlyticsVar) {
    }
}
