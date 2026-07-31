package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;

/* JADX INFO: renamed from: lٗ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17451l extends Drawable.ConstantState {
    public boolean Signature;
    public int ad;
    public int adcel;
    public int admob;
    public boolean ads;
    public int advert;
    public int amazon;
    public boolean applovin;
    public ColorStateList appmetrica;
    public SparseArray billing;
    public int crashlytics;
    public Rect firebase;
    public PorterDuff.Mode inmobi;
    public boolean isPro;
    public int isVip;
    public boolean license;
    public Resources loadAd;
    public int metrica;
    public Drawable[] mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f33997package;
    public ColorFilter premium;
    public boolean pro;
    public int purchase;
    public boolean remoteconfig;
    public boolean signatures;
    public boolean smaato;
    public int startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public C3994l f33998strictfp;
    public boolean subs;
    public int subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public int[][] f33999synchronized;
    public boolean tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f34000throws;
    public int vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C18152l f34001volatile;
    public final C16069l yandex;

    public C17451l(C17451l c17451l, C16069l c16069l, Resources resources) {
        this.subs = false;
        this.smaato = false;
        this.pro = true;
        this.advert = 0;
        this.isVip = 0;
        this.yandex = c16069l;
        Object obj = null;
        this.loadAd = resources != null ? resources : c17451l != null ? c17451l.loadAd : null;
        int i = c17451l != null ? c17451l.crashlytics : 0;
        int i2 = C16069l.f31473l;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.crashlytics = i;
        if (c17451l != null) {
            this.amazon = c17451l.amazon;
            this.purchase = c17451l.purchase;
            this.Signature = true;
            this.license = true;
            this.subs = c17451l.subs;
            this.smaato = c17451l.smaato;
            this.pro = c17451l.pro;
            this.ad = c17451l.ad;
            this.advert = c17451l.advert;
            this.isVip = c17451l.isVip;
            this.signatures = c17451l.signatures;
            this.premium = c17451l.premium;
            this.applovin = c17451l.applovin;
            this.appmetrica = c17451l.appmetrica;
            this.inmobi = c17451l.inmobi;
            this.f34000throws = c17451l.f34000throws;
            this.f33997package = c17451l.f33997package;
            if (c17451l.crashlytics == i) {
                if (c17451l.isPro) {
                    this.firebase = c17451l.firebase != null ? new Rect(c17451l.firebase) : null;
                    this.isPro = true;
                }
                if (c17451l.remoteconfig) {
                    this.vip = c17451l.vip;
                    this.metrica = c17451l.metrica;
                    this.startapp = c17451l.startapp;
                    this.adcel = c17451l.adcel;
                    this.remoteconfig = true;
                }
            }
            if (c17451l.ads) {
                this.subscription = c17451l.subscription;
                this.ads = true;
            }
            if (c17451l.tapsense) {
                this.tapsense = true;
            }
            Drawable[] drawableArr = c17451l.mopub;
            this.mopub = new Drawable[drawableArr.length];
            this.admob = c17451l.admob;
            SparseArray sparseArray = c17451l.billing;
            if (sparseArray != null) {
                this.billing = sparseArray.clone();
            } else {
                this.billing = new SparseArray(this.admob);
            }
            int i3 = this.admob;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.billing.put(i4, constantState);
                    } else {
                        this.mopub[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.mopub = new Drawable[10];
            this.admob = 0;
        }
        if (c17451l != null) {
            this.f33999synchronized = c17451l.f33999synchronized;
        } else {
            this.f33999synchronized = new int[this.mopub.length][];
        }
        if (c17451l != null) {
            this.f33998strictfp = c17451l.f33998strictfp;
            this.f34001volatile = c17451l.f34001volatile;
        } else {
            this.f33998strictfp = new C3994l(obj);
            this.f34001volatile = new C18152l(0);
        }
    }

    public final Drawable amazon(int i) {
        int iIndexOfKey;
        Drawable drawable = this.mopub[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.billing;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.billing.valueAt(iIndexOfKey)).newDrawable(this.loadAd);
        drawableNewDrawable.setLayoutDirection(this.ad);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.yandex);
        this.mopub[i] = drawableMutate;
        this.billing.removeAt(iIndexOfKey);
        if (this.billing.size() == 0) {
            this.billing = null;
        }
        return drawableMutate;
    }

    public final int billing(int[] iArr) {
        int[][] iArr2 = this.f33999synchronized;
        int i = this.admob;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.admob;
        Drawable[] drawableArr = this.mopub;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.billing.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final void crashlytics() {
        SparseArray sparseArray = this.billing;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.billing.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.billing.valueAt(i);
                Drawable[] drawableArr = this.mopub;
                Drawable drawableNewDrawable = constantState.newDrawable(this.loadAd);
                drawableNewDrawable.setLayoutDirection(this.ad);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.yandex);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.billing = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.purchase | this.amazon;
    }

    public final void loadAd() {
        this.remoteconfig = true;
        crashlytics();
        int i = this.admob;
        Drawable[] drawableArr = this.mopub;
        this.metrica = -1;
        this.vip = -1;
        this.adcel = 0;
        this.startapp = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.vip) {
                this.vip = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.metrica) {
                this.metrica = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.startapp) {
                this.startapp = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.adcel) {
                this.adcel = minimumHeight;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C16069l(this, null);
    }

    public final int purchase(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        C18152l c18152l = this.f34001volatile;
        Object obj2 = 0;
        int iLoadAd = AbstractC4918l.loadAd(c18152l.f35537l, i, c18152l.f35539l);
        if (iLoadAd >= 0 && (obj = c18152l.f35538l[iLoadAd]) != AbstractC13831l.yandex) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int yandex(Drawable drawable) {
        int i = this.admob;
        if (i >= this.mopub.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.mopub;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.mopub = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f33999synchronized, 0, iArr, 0, i);
            this.f33999synchronized = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.yandex);
        this.mopub[i] = drawable;
        this.admob++;
        this.purchase = drawable.getChangingConfigurations() | this.purchase;
        this.ads = false;
        this.tapsense = false;
        this.firebase = null;
        this.isPro = false;
        this.remoteconfig = false;
        this.Signature = false;
        return i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C16069l(this, resources);
    }
}
