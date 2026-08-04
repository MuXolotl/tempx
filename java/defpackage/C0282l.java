package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lّؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0282l extends LinearLayout {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final /* synthetic */ int f1282l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public ImageView f1283l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public TextView f1284l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ImageView f1285l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public TextView f1286l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C3766l f1287l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f1288l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1664l f1289l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public View f1290l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Drawable f1291l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public View f1292l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C1194l f1293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0282l(C1194l c1194l, Context context) {
        super(context);
        this.f1293l = c1194l;
        this.f1288l = 2;
        billing(context);
        int i = c1194l.f3225l;
        int i2 = c1194l.f3221l;
        int i3 = c1194l.f3190l;
        int i4 = c1194l.f3227l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!c1194l.f3222l ? 1 : 0);
        setClickable(true);
        C15053l c15053l = Build.VERSION.SDK_INT >= 24 ? new C15053l(AbstractC11965l.vip(getContext())) : new C15053l((Object) null);
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC11874l.yandex(this, (PointerIcon) c15053l.f29576l);
        }
    }

    private C1664l getBadge() {
        return this.f1289l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentWidth() {
        View[] viewArr = {this.f1286l, this.f1283l, this.f1292l};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    private C1664l getOrCreateBadge() {
        if (this.f1289l == null) {
            this.f1289l = new C1664l(getContext());
        }
        crashlytics();
        C1664l c1664l = this.f1289l;
        if (c1664l != null) {
            return c1664l;
        }
        C8339l.smaato("Unable to create badge");
        return null;
    }

    public final void amazon(View view) {
        C1664l c1664l = this.f1289l;
        if (c1664l == null || view != this.f1290l) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c1664l.setBounds(rect);
        c1664l.mopub(view, null);
    }

    public final void billing(Context context) {
        GradientDrawable gradientDrawable;
        C1194l c1194l = this.f1293l;
        int i = c1194l.f3189l;
        if (i != 0) {
            Drawable drawableLoadAd = AbstractC13273l.loadAd(context, i);
            this.f1291l = drawableLoadAd;
            if (drawableLoadAd != null && drawableLoadAd.isStateful()) {
                this.f1291l.setState(getDrawableState());
            }
        } else {
            this.f1291l = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (c1194l.f3229l != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = c1194l.f3229l;
            int iYandex = AbstractC14521l.yandex(colorStateList, AbstractC14521l.crashlytics);
            int[] iArr = AbstractC14521l.loadAd;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{AbstractC14521l.amazon, iArr, StateSet.NOTHING}, new int[]{iYandex, AbstractC14521l.yandex(colorStateList, iArr), AbstractC14521l.yandex(colorStateList, AbstractC14521l.yandex)});
            boolean z = c1194l.f3226l;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        setBackground(rippleDrawable);
        c1194l.invalidate();
    }

    public final void crashlytics() {
        if (this.f1289l != null) {
            if (this.f1292l != null) {
                loadAd();
                return;
            }
            TextView textView = this.f1286l;
            if (textView == null || this.f1287l == null) {
                loadAd();
                return;
            }
            if (this.f1290l == textView) {
                amazon(textView);
                return;
            }
            loadAd();
            TextView textView2 = this.f1286l;
            if (this.f1289l == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C1664l c1664l = this.f1289l;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c1664l.setBounds(rect);
            c1664l.mopub(textView2, null);
            if (c1664l.loadAd() != null) {
                c1664l.loadAd().setForeground(c1664l);
            } else {
                textView2.getOverlay().add(c1664l);
            }
            this.f1290l = textView2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1291l;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f1291l.setState(drawableState)) {
            invalidate();
            this.f1293l.invalidate();
        }
    }

    public C3766l getTab() {
        return this.f1287l;
    }

    public final void loadAd() {
        if (this.f1289l != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f1290l;
            if (view != null) {
                C1664l c1664l = this.f1289l;
                if (c1664l != null) {
                    if (c1664l.loadAd() != null) {
                        c1664l.loadAd().setForeground(null);
                    } else {
                        view.getOverlay().remove(c1664l);
                    }
                }
                this.f1290l = null;
            }
        }
    }

    public final void mopub(TextView textView, ImageView imageView) {
        C3766l c3766l = this.f1287l;
        CharSequence charSequence = c3766l != null ? c3766l.yandex : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.f1287l.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iLoadAd = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) AbstractC0545l.loadAd(getContext(), 8);
            if (this.f1293l.f3222l) {
                if (iLoadAd != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iLoadAd);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iLoadAd != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iLoadAd;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        AbstractC10000l.advert(this, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1664l c1664l = this.f1289l;
        if (c1664l != null && c1664l.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            C1664l c1664l2 = this.f1289l;
            C12199l c12199l = c1664l2.purchase;
            Object quantityString = null;
            if (c1664l2.isVisible()) {
                C14434l c14434l = c12199l.loadAd;
                if (c14434l.f28260l != null) {
                    quantityString = c14434l.f28261l;
                    if (quantityString == null) {
                        quantityString = c1664l2.purchase.loadAd.f28260l;
                    }
                } else if (!c1664l2.purchase()) {
                    quantityString = c14434l.f28252l;
                } else if (c14434l.f28257l != 0 && (context = (Context) c1664l2.yandex.get()) != null) {
                    if (c1664l2.admob != -2) {
                        int iCrashlytics = c1664l2.crashlytics();
                        int i = c1664l2.admob;
                        if (iCrashlytics <= i) {
                            quantityString = context.getResources().getQuantityString(c14434l.f28257l, c1664l2.crashlytics(), Integer.valueOf(c1664l2.crashlytics()));
                        } else {
                            quantityString = context.getString(c14434l.f28272l, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(c14434l.f28257l, c1664l2.crashlytics(), Integer.valueOf(c1664l2.crashlytics()));
                    }
                }
            }
            sb.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C10975l.m3010package(isSelected(), 0, 1, this.f1287l.loadAd, 1).f22121l);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6933l.purchase.yandex);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        C1194l c1194l = this.f1293l;
        int tabMaxWidth = c1194l.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(c1194l.f3230l, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f1286l != null) {
            float f = c1194l.f3195l;
            int i3 = this.f1288l;
            ImageView imageView = this.f1283l;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f1286l;
                if (textView != null && textView.getLineCount() > 1) {
                    f = c1194l.f3194l;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f1286l.getTextSize();
            int lineCount = this.f1286l.getLineCount();
            int maxLines = this.f1286l.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (c1194l.f3208l == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f1286l.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f1286l.setTextSize(0, f);
                this.f1286l.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f1287l == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C3766l c3766l = this.f1287l;
        C1194l c1194l = c3766l.amazon;
        if (c1194l != null) {
            c1194l.billing(c3766l, true);
            return true;
        }
        C8339l.metrica("Tab not attached to a TabLayout");
        return false;
    }

    public final void purchase() {
        C3766l c3766l = this.f1287l;
        View view = c3766l != null ? c3766l.crashlytics : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f1292l = view;
            TextView textView = this.f1286l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f1283l;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f1283l.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f1284l = textView2;
            if (textView2 != null) {
                this.f1288l = textView2.getMaxLines();
            }
            this.f1285l = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.f1292l;
            if (view2 != null) {
                removeView(view2);
                this.f1292l = null;
            }
            this.f1284l = null;
            this.f1285l = null;
        }
        boolean z = false;
        z = false;
        if (this.f1292l == null) {
            if (this.f1283l == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ua.itaysonlab.vkx.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f1283l = imageView2;
                addView(imageView2, 0);
            }
            if (this.f1286l == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ua.itaysonlab.vkx.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f1286l = textView3;
                addView(textView3);
                this.f1288l = this.f1286l.getMaxLines();
            }
            TextView textView4 = this.f1286l;
            C1194l c1194l = this.f1293l;
            textView4.setTextAppearance(c1194l.f3214l);
            ColorStateList colorStateList = c1194l.f3199l;
            if (colorStateList != null) {
                this.f1286l.setTextColor(colorStateList);
            }
            mopub(this.f1286l, this.f1283l);
            crashlytics();
            ImageView imageView3 = this.f1283l;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0254l(this, imageView3, z ? 1 : 0));
            }
            TextView textView5 = this.f1286l;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0254l(this, textView5, z ? 1 : 0));
            }
        } else {
            TextView textView6 = this.f1284l;
            if (textView6 != null || this.f1285l != null) {
                mopub(textView6, this.f1285l);
            }
        }
        if (c3766l != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
        if (c3766l != null) {
            C1194l c1194l2 = c3766l.amazon;
            if (c1194l2 == null) {
                C8339l.metrica("Tab not attached to a TabLayout");
                return;
            } else if (c1194l2.getSelectedTabPosition() == c3766l.loadAd) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f1286l;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f1283l;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f1292l;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C3766l c3766l) {
        if (c3766l != this.f1287l) {
            this.f1287l = c3766l;
            purchase();
        }
    }
}
