package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lِؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5184l implements InterfaceC8778l {
    public static final AccelerateInterpolator advert = new AccelerateInterpolator();
    public static final DecelerateInterpolator isVip = new DecelerateInterpolator();
    public boolean Signature;
    public final C2290l ad;
    public boolean adcel;
    public boolean admob;
    public boolean ads;
    public ActionBarContainer amazon;
    public ActionBarContextView billing;
    public ActionBarOverlayLayout crashlytics;
    public C10023l firebase;
    public C0053l isPro;
    public final C3619l license;
    public Context loadAd;
    public boolean metrica;
    public final View mopub;
    public final C3619l pro;
    public InterfaceC9913l purchase;
    public final ArrayList remoteconfig;
    public boolean smaato;
    public boolean startapp;
    public C0053l subs;
    public C14307l subscription;
    public boolean tapsense;
    public int vip;
    public Context yandex;

    public C5184l(Activity activity, boolean z) {
        new ArrayList();
        this.remoteconfig = new ArrayList();
        this.vip = 0;
        this.metrica = true;
        this.ads = true;
        this.license = new C3619l(this, 0);
        this.pro = new C3619l(this, 1);
        this.ad = new C2290l(this);
        View decorView = activity.getWindow().getDecorView();
        crashlytics(decorView);
        if (z) {
            return;
        }
        this.mopub = decorView.findViewById(R.id.content);
    }

    public final void amazon(boolean z) {
        if (this.admob) {
            return;
        }
        int i = z ? 4 : 0;
        C18434l c18434l = (C18434l) this.purchase;
        int i2 = c18434l.loadAd;
        this.admob = true;
        c18434l.yandex((i & 4) | (i2 & (-5)));
    }

    public final void billing(boolean z) {
        boolean z2 = this.adcel || !this.startapp;
        boolean z3 = this.ads;
        C2290l c2290l = this.ad;
        View view = this.mopub;
        if (!z2) {
            if (z3) {
                this.ads = false;
                C14307l c14307l = this.subscription;
                if (c14307l != null) {
                    c14307l.yandex();
                }
                int i = this.vip;
                C3619l c3619l = this.license;
                if (i != 0 || (!this.tapsense && !z)) {
                    c3619l.crashlytics();
                    return;
                }
                this.amazon.setAlpha(1.0f);
                this.amazon.setTransitioning(true);
                C14307l c14307l2 = new C14307l();
                float f = -this.amazon.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.amazon.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C2932l c2932lYandex = AbstractC15872l.yandex(this.amazon);
                c2932lYandex.purchase(f);
                View view2 = (View) c2932lYandex.yandex.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c2290l != null ? new C14131l(c2290l, view2) : null);
                }
                boolean z4 = c14307l2.purchase;
                ArrayList arrayList = c14307l2.yandex;
                if (!z4) {
                    arrayList.add(c2932lYandex);
                }
                if (this.metrica && view != null) {
                    C2932l c2932lYandex2 = AbstractC15872l.yandex(view);
                    c2932lYandex2.purchase(f);
                    if (!c14307l2.purchase) {
                        arrayList.add(c2932lYandex2);
                    }
                }
                boolean z5 = c14307l2.purchase;
                if (!z5) {
                    c14307l2.crashlytics = advert;
                }
                if (!z5) {
                    c14307l2.loadAd = 250L;
                }
                if (!z5) {
                    c14307l2.amazon = c3619l;
                }
                this.subscription = c14307l2;
                c14307l2.loadAd();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.ads = true;
        C14307l c14307l3 = this.subscription;
        if (c14307l3 != null) {
            c14307l3.yandex();
        }
        this.amazon.setVisibility(0);
        int i2 = this.vip;
        C3619l c3619l2 = this.pro;
        if (i2 == 0 && (this.tapsense || z)) {
            this.amazon.setTranslationY(0.0f);
            float f2 = -this.amazon.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.amazon.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.amazon.setTranslationY(f2);
            C14307l c14307l4 = new C14307l();
            C2932l c2932lYandex3 = AbstractC15872l.yandex(this.amazon);
            c2932lYandex3.purchase(0.0f);
            View view3 = (View) c2932lYandex3.yandex.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c2290l != null ? new C14131l(c2290l, view3) : null);
            }
            boolean z6 = c14307l4.purchase;
            ArrayList arrayList2 = c14307l4.yandex;
            if (!z6) {
                arrayList2.add(c2932lYandex3);
            }
            if (this.metrica && view != null) {
                view.setTranslationY(f2);
                C2932l c2932lYandex4 = AbstractC15872l.yandex(view);
                c2932lYandex4.purchase(0.0f);
                if (!c14307l4.purchase) {
                    arrayList2.add(c2932lYandex4);
                }
            }
            boolean z7 = c14307l4.purchase;
            if (!z7) {
                c14307l4.crashlytics = isVip;
            }
            if (!z7) {
                c14307l4.loadAd = 250L;
            }
            if (!z7) {
                c14307l4.amazon = c3619l2;
            }
            this.subscription = c14307l4;
            c14307l4.loadAd();
        } else {
            this.amazon.setAlpha(1.0f);
            this.amazon.setTranslationY(0.0f);
            if (this.metrica && view != null) {
                view.setTranslationY(0.0f);
            }
            c3619l2.crashlytics();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.crashlytics;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void crashlytics(View view) {
        InterfaceC9913l wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ua.itaysonlab.vkx.R.id.decor_content_parent);
        this.crashlytics = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ua.itaysonlab.vkx.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC9913l) {
            wrapper = (InterfaceC9913l) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.purchase = wrapper;
        this.billing = (ActionBarContextView) view.findViewById(ua.itaysonlab.vkx.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ua.itaysonlab.vkx.R.id.action_bar_container);
        this.amazon = actionBarContainer;
        InterfaceC9913l interfaceC9913l = this.purchase;
        if (interfaceC9913l == null || this.billing == null || actionBarContainer == null) {
            C8339l.smaato(C5184l.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C18434l) interfaceC9913l).yandex.getContext();
        this.yandex = context;
        if ((((C18434l) this.purchase).loadAd & 4) != 0) {
            this.admob = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.purchase.getClass();
        purchase(context.getResources().getBoolean(ua.itaysonlab.vkx.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.yandex.obtainStyledAttributes(null, AbstractC14657l.yandex, ua.itaysonlab.vkx.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.crashlytics;
            if (!actionBarOverlayLayout2.f131l) {
                C8339l.smaato("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.Signature = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.amazon;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Context loadAd() {
        if (this.loadAd == null) {
            TypedValue typedValue = new TypedValue();
            this.yandex.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.loadAd = new ContextThemeWrapper(this.yandex, i);
            } else {
                this.loadAd = this.yandex;
            }
        }
        return this.loadAd;
    }

    public final void purchase(boolean z) {
        if (z) {
            this.amazon.setTabContainer(null);
            ((C18434l) this.purchase).getClass();
        } else {
            ((C18434l) this.purchase).getClass();
            this.amazon.setTabContainer(null);
        }
        ((C18434l) this.purchase).getClass();
        ((C18434l) this.purchase).yandex.setCollapsible(false);
        this.crashlytics.setHasNonEmbeddedTabs(false);
    }

    public final void yandex(boolean z) {
        C2932l c2932lSubs;
        C2932l c2932lSubs2;
        boolean z2 = this.adcel;
        if (z) {
            if (!z2) {
                this.adcel = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.crashlytics;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                billing(false);
            }
        } else if (z2) {
            this.adcel = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.crashlytics;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            billing(false);
        }
        boolean zIsLaidOut = this.amazon.isLaidOut();
        InterfaceC9913l interfaceC9913l = this.purchase;
        if (!zIsLaidOut) {
            if (z) {
                ((C18434l) interfaceC9913l).yandex.setVisibility(4);
                this.billing.setVisibility(0);
                return;
            } else {
                ((C18434l) interfaceC9913l).yandex.setVisibility(0);
                this.billing.setVisibility(8);
                return;
            }
        }
        if (z) {
            C18434l c18434l = (C18434l) interfaceC9913l;
            c2932lSubs = AbstractC15872l.yandex(c18434l.yandex);
            c2932lSubs.yandex(0.0f);
            c2932lSubs.crashlytics(100L);
            c2932lSubs.amazon(new C16575l(c18434l, 4));
            c2932lSubs2 = this.billing.subs(0, 200L);
        } else {
            C18434l c18434l2 = (C18434l) interfaceC9913l;
            C2932l c2932lYandex = AbstractC15872l.yandex(c18434l2.yandex);
            c2932lYandex.yandex(1.0f);
            c2932lYandex.crashlytics(200L);
            c2932lYandex.amazon(new C16575l(c18434l2, 0));
            c2932lSubs = this.billing.subs(8, 100L);
            c2932lSubs2 = c2932lYandex;
        }
        C14307l c14307l = new C14307l();
        ArrayList arrayList = c14307l.yandex;
        arrayList.add(c2932lSubs);
        View view = (View) c2932lSubs.yandex.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c2932lSubs2.yandex.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c2932lSubs2);
        c14307l.loadAd();
    }

    public C5184l(Dialog dialog) {
        new ArrayList();
        this.remoteconfig = new ArrayList();
        this.vip = 0;
        this.metrica = true;
        this.ads = true;
        this.license = new C3619l(this, 0);
        this.pro = new C3619l(this, 1);
        this.ad = new C2290l(this);
        crashlytics(dialog.getWindow().getDecorView());
    }
}
