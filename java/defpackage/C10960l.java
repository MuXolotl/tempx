package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: lَُۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10960l {
    public boolean amazon;
    public final ViewGroup crashlytics;
    public ViewParent loadAd;
    public int[] purchase;
    public ViewParent yandex;

    public C10960l(ViewGroup viewGroup) {
        this.crashlytics = viewGroup;
    }

    public final void admob(int i) {
        ViewParent viewParentPurchase = purchase(i);
        if (viewParentPurchase != null) {
            boolean z = viewParentPurchase instanceof InterfaceC14324l;
            ViewGroup viewGroup = this.crashlytics;
            if (z) {
                ((InterfaceC14324l) viewParentPurchase).mopub(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentPurchase.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentPurchase + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.yandex = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.loadAd = null;
            }
        }
    }

    public final boolean amazon(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentPurchase;
        int i6;
        int i7;
        int[] iArr3;
        if (this.amazon && (viewParentPurchase = purchase(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.crashlytics;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.purchase == null) {
                        this.purchase = new int[2];
                    }
                    int[] iArr4 = this.purchase;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentPurchase instanceof InterfaceC3112l) {
                    ((InterfaceC3112l) viewParentPurchase).crashlytics(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentPurchase instanceof InterfaceC14324l) {
                        ((InterfaceC14324l) viewParentPurchase).amazon(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentPurchase.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentPurchase + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean billing(int i) {
        return purchase(i) != null;
    }

    public final boolean crashlytics(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentPurchase;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.amazon || (viewParentPurchase = purchase(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.crashlytics;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.purchase == null) {
                this.purchase = new int[2];
            }
            iArr3 = this.purchase;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentPurchase instanceof InterfaceC14324l) {
            ((InterfaceC14324l) viewParentPurchase).admob(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentPurchase.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentPurchase + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup = viewGroup;
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        viewGroup = viewGroup;
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean loadAd(float f, float f2) {
        ViewParent viewParentPurchase;
        if (this.amazon && (viewParentPurchase = purchase(0)) != null) {
            try {
                return viewParentPurchase.onNestedPreFling(this.crashlytics, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentPurchase + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean mopub(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!billing(i2)) {
            if (this.amazon) {
                View view = this.crashlytics;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC14324l;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC14324l) parent).purchase(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.yandex = parent;
                        } else if (i2 == 1) {
                            this.loadAd = parent;
                        }
                        if (z) {
                            ((InterfaceC14324l) parent).billing(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ViewParent purchase(int i) {
        if (i == 0) {
            return this.yandex;
        }
        if (i != 1) {
            return null;
        }
        return this.loadAd;
    }

    public final boolean yandex(float f, float f2, boolean z) {
        ViewParent viewParentPurchase;
        if (this.amazon && (viewParentPurchase = purchase(0)) != null) {
            try {
                return viewParentPurchase.onNestedFling(this.crashlytics, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentPurchase + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }
}
