package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7521l {
    public static final PorterDuff.Mode admob = PorterDuff.Mode.SRC_IN;
    public static final C0092l isPro = new C0092l(6);
    public static C7521l subs;
    public final WeakHashMap amazon = new WeakHashMap(0);
    public boolean billing;
    public C18152l crashlytics;
    public C5128l loadAd;
    public C1424l mopub;
    public TypedValue purchase;
    public WeakHashMap yandex;

    public static synchronized PorterDuffColorFilter admob(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0092l c0092l = isPro;
        c0092l.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0092l.loadAd(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized C7521l amazon() {
        try {
            if (subs == null) {
                C7521l c7521l = new C7521l();
                subs = c7521l;
                isPro(c7521l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return subs;
    }

    public static void isPro(C7521l c7521l) {
        if (Build.VERSION.SDK_INT < 24) {
            c7521l.yandex("vector", new C12871l(3));
            c7521l.yandex("animated-vector", new C12871l(2));
            c7521l.yandex("animated-selector", new C12871l(1));
            c7521l.yandex("drawable", new C12871l(0));
        }
    }

    public final synchronized Drawable billing(Context context, int i) {
        return mopub(context, i, false);
    }

    public final Drawable crashlytics(Context context, int i) {
        if (this.purchase == null) {
            this.purchase = new TypedValue();
        }
        TypedValue typedValue = this.purchase;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawablePurchase = purchase(context, j);
        if (drawablePurchase != null) {
            return drawablePurchase;
        }
        LayerDrawable layerDrawableM897public = null;
        if (this.mopub != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM897public = new LayerDrawable(new Drawable[]{billing(context, R.drawable.abc_cab_background_internal_bg), billing(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM897public = C1424l.m897public(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM897public = C1424l.m897public(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM897public = C1424l.m897public(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM897public != null) {
            layerDrawableM897public.setChangingConfigurations(typedValue.changingConfigurations);
            loadAd(context, j, layerDrawableM897public);
        }
        return layerDrawableM897public;
    }

    public final Drawable firebase(Context context, int i) {
        int next;
        C5128l c5128l = this.loadAd;
        if (c5128l == null || c5128l.isEmpty()) {
            return null;
        }
        C18152l c18152l = this.crashlytics;
        if (c18152l != null) {
            String str = (String) c18152l.crashlytics(i);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.loadAd.get(str) == null) {
                return null;
            }
        } else {
            this.crashlytics = new C18152l(0);
        }
        if (this.purchase == null) {
            this.purchase = new TypedValue();
        }
        TypedValue typedValue = this.purchase;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawablePurchase = purchase(context, j);
        if (drawablePurchase != null) {
            return drawablePurchase;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.crashlytics.yandex(i, name);
                C12871l c12871l = (C12871l) this.loadAd.get(name);
                if (c12871l != null) {
                    drawablePurchase = c12871l.yandex(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawablePurchase != null) {
                    drawablePurchase.setChangingConfigurations(typedValue.changingConfigurations);
                    loadAd(context, j, drawablePurchase);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawablePurchase == null) {
            this.crashlytics.yandex(i, "appcompat_skip_skip");
        }
        return drawablePurchase;
    }

    public final synchronized void loadAd(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C3994l c3994l = (C3994l) this.amazon.get(context);
                if (c3994l == null) {
                    c3994l = new C3994l((Object) null);
                    this.amazon.put(context, c3994l);
                }
                c3994l.subs(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable mopub(Context context, int i, boolean z) {
        Drawable drawableFirebase;
        try {
            if (!this.billing) {
                this.billing = true;
                Drawable drawableBilling = billing(context, R.drawable.abc_vector_test);
                if (drawableBilling == null || (!(drawableBilling instanceof C5669l) && !"android.graphics.drawable.VectorDrawable".equals(drawableBilling.getClass().getName()))) {
                    this.billing = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableFirebase = firebase(context, i);
            if (drawableFirebase == null) {
                drawableFirebase = crashlytics(context, i);
            }
            if (drawableFirebase == null) {
                drawableFirebase = context.getDrawable(i);
            }
            if (drawableFirebase != null) {
                drawableFirebase = vip(context, i, z, drawableFirebase);
            }
            if (drawableFirebase != null) {
                AbstractC2341l.yandex(drawableFirebase);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableFirebase;
    }

    public final synchronized Drawable purchase(Context context, long j) {
        C3994l c3994l = (C3994l) this.amazon.get(context);
        if (c3994l == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c3994l.amazon(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c3994l.isPro(j);
        }
        return null;
    }

    public final synchronized void remoteconfig(C1424l c1424l) {
        this.mopub = c1424l;
    }

    public final synchronized void smaato(Context context) {
        C3994l c3994l = (C3994l) this.amazon.get(context);
        if (c3994l != null) {
            c3994l.loadAd();
        }
    }

    public final synchronized ColorStateList subs(Context context, int i) {
        ColorStateList colorStateList;
        C18152l c18152l;
        WeakHashMap weakHashMap = this.yandex;
        ColorStateList colorStateListM909finally = null;
        colorStateList = (weakHashMap == null || (c18152l = (C18152l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c18152l.crashlytics(i);
        if (colorStateList == null) {
            C1424l c1424l = this.mopub;
            if (c1424l != null) {
                colorStateListM909finally = c1424l.m909finally(context, i);
            }
            if (colorStateListM909finally != null) {
                if (this.yandex == null) {
                    this.yandex = new WeakHashMap();
                }
                C18152l c18152l2 = (C18152l) this.yandex.get(context);
                if (c18152l2 == null) {
                    c18152l2 = new C18152l(0);
                    this.yandex.put(context, c18152l2);
                }
                c18152l2.yandex(i, colorStateListM909finally);
            }
            colorStateList = colorStateListM909finally;
        }
        return colorStateList;
    }

    public final Drawable vip(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListSubs = subs(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListSubs != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListSubs);
            if (this.mopub != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C1424l c1424l = this.mopub;
        int i2 = R.attr.colorControlNormal;
        if (c1424l != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iCrashlytics = AbstractC1035l.crashlytics(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C7862l.loadAd;
                C1424l.m894l(drawableFindDrawableByLayerId, iCrashlytics, mode2);
                C1424l.m894l(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1035l.crashlytics(context, R.attr.colorControlNormal), mode2);
                C1424l.m894l(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1035l.crashlytics(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iLoadAd = AbstractC1035l.loadAd(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C7862l.loadAd;
                C1424l.m894l(drawableFindDrawableByLayerId2, iLoadAd, mode3);
                C1424l.m894l(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1035l.crashlytics(context, R.attr.colorControlActivated), mode3);
                C1424l.m894l(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1035l.crashlytics(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1424l c1424l2 = this.mopub;
        boolean z3 = false;
        if (c1424l2 != null) {
            PorterDuff.Mode mode4 = C7862l.loadAd;
            if (C1424l.pro((int[]) c1424l2.f3603l, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (C1424l.pro((int[]) c1424l2.f3601l, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zPro = C1424l.pro((int[]) c1424l2.f3605l, i);
                    i2 = android.R.attr.colorBackground;
                    if (zPro) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(C7862l.crashlytics(AbstractC1035l.crashlytics(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }

    public final void yandex(String str, C12871l c12871l) {
        if (this.loadAd == null) {
            this.loadAd = new C5128l(0);
        }
        this.loadAd.put(str, c12871l);
    }
}
