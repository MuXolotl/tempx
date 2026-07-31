package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؕٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3497l extends AbstractC14412l implements InterfaceC9857l {
    public C5447l admob;
    public final boolean amazon;
    public final boolean billing;
    public final AbstractC2484l crashlytics;
    public float firebase;
    public int isPro;
    public LinearLayout mopub;
    public final boolean purchase;
    public AppCompatImageView subs;

    public C3497l(AbstractC2484l abstractC2484l, boolean z, boolean z2, int i) {
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 8) != 0 ? false : z2;
        boolean z3 = (i & 16) == 0;
        this.crashlytics = abstractC2484l;
        this.amazon = z;
        this.purchase = z2;
        this.billing = z3;
        this.isPro = AbstractC13209l.yandex(R.attr.windowBackground);
        this.firebase = 1.0f;
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        LinearLayout linearLayout = this.mopub;
        if (linearLayout != null) {
            linearLayout.setPadding(0, i, 0, 0);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) {
        int dimensionPixelSize;
        LinearLayout linearLayout = new LinearLayout(context);
        this.mopub = linearLayout;
        int i = 1;
        if (this.purchase) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            Resources resources = vKXApplication.getResources();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue, true);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(typedValue.resourceId);
            int i2 = AbstractC5852l.yandex;
            VKXApplication.Companion companion = VKXApplication.f36628l;
            dimensionPixelSize = VKXApplication.Companion.yandex(128.0f) + i2 + dimensionPixelSize2;
        } else {
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            Resources resources2 = vKXApplication2.getResources();
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue2, true);
            dimensionPixelSize = resources2.getDimensionPixelSize(typedValue2.resourceId);
        }
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
        AbstractC2484l abstractC2484l = this.crashlytics;
        boolean zMo1142class = abstractC2484l.mo1142class();
        LinearLayout linearLayout2 = this.mopub;
        if (zMo1142class) {
            linearLayout2.setBackgroundResource(ua.itaysonlab.vkx.R.drawable.scrim_top);
        } else {
            linearLayout2.setBackgroundColor(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.bg_page));
        }
        C5447l c5447l = new C5447l(AbstractC12953l.adcel(context, null, ua.itaysonlab.vkx.R.attr.toolbarStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Toolbar), null, ua.itaysonlab.vkx.R.attr.toolbarStyle);
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            c5447l.f11673l = declaredField;
            Field declaredField2 = Toolbar.class.getDeclaredField("lؗۤؑ");
            c5447l.f11675l = declaredField2;
            Field declaredField3 = Toolbar.class.getDeclaredField("lٌؘؒ");
            c5447l.f11676l = declaredField3;
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        String strMo648continue = abstractC2484l.mo648continue();
        if (strMo648continue == null) {
            strMo648continue = "";
        }
        c5447l.setTitle(strMo648continue);
        c5447l.tapsense(context, ua.itaysonlab.vkx.R.style.TextAppearance_Material3_TitleLarge);
        c5447l.setContentInsetStartWithNavigation(0);
        c5447l.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView titleView = c5447l.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new ViewOnClickListenerC18331l(this, i));
        }
        this.admob = c5447l;
        this.mopub.addView(c5447l);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        VKXApplication.Companion companion2 = VKXApplication.f36628l;
        appCompatImageView.setPadding(VKXApplication.Companion.yandex(12.0f), 0, VKXApplication.Companion.yandex(12.0f), 0);
        Context context2 = appCompatImageView.getContext();
        TypedValue typedValue3 = new TypedValue();
        context2.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.selectableItemBackground, typedValue3, true);
        appCompatImageView.setBackgroundResource(typedValue3.resourceId);
        appCompatImageView.setImageResource(ua.itaysonlab.vkx.R.drawable.ic_more);
        VKXApplication vKXApplication3 = VKXApplication.f36631l;
        if (vKXApplication3 == null) {
            vKXApplication3 = null;
        }
        Resources resources3 = vKXApplication3.getResources();
        Context context3 = appCompatImageView.getContext();
        TypedValue typedValue4 = new TypedValue();
        context3.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue4, true);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, resources3.getDimensionPixelSize(typedValue4.resourceId)));
        this.subs = appCompatImageView;
        if (!this.billing) {
            AbstractC5833l.purchase(appCompatImageView);
        }
        LinearLayout linearLayout3 = this.mopub;
        AppCompatImageView appCompatImageView2 = this.subs;
        linearLayout3.addView(appCompatImageView2 != null ? appCompatImageView2 : null);
        billing();
        return this.mopub;
    }

    @Override // defpackage.AbstractC14412l
    public void billing() {
        this.isPro = AbstractC13209l.yandex(R.attr.windowBackground);
        if (!this.crashlytics.mo1142class()) {
            this.mopub.setBackgroundColor(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.bg_page));
        } else if (!this.purchase) {
            this.mopub.setBackgroundTintList(ColorStateList.valueOf(this.isPro));
        }
        yandex(this.firebase);
        C5447l c5447l = this.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        c5447l.setTitleTextColor(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.reborn_title_color));
        if (this.amazon) {
            firebase();
        }
        AppCompatImageView appCompatImageView = this.subs;
        if (appCompatImageView != null) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.reborn_title_color)));
        }
    }

    public final void firebase() {
        C5447l c5447l = this.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        Drawable drawable = c5447l.getContext().getDrawable(ua.itaysonlab.vkx.R.drawable.ic_arrow_back_24);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        drawable.setTint(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.reborn_title_color));
        C5447l c5447l2 = this.admob;
        if (c5447l2 == null) {
            c5447l2 = null;
        }
        c5447l2.setNavigationIcon(drawable);
        C5447l c5447l3 = this.admob;
        (c5447l3 != null ? c5447l3 : null).setNavigationOnClickListener(new ViewOnClickListenerC18331l(this, 0));
    }

    @Override // defpackage.AbstractC14412l
    public final void mopub(String str) {
        C5447l c5447l = this.admob;
        if (c5447l != null) {
            if (c5447l == null) {
                c5447l = null;
            }
            c5447l.setTitle(str);
        }
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        return this.mopub;
    }

    public final void smaato(Function1 function1) {
        AppCompatImageView appCompatImageView = this.subs;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        AbstractC5833l.subs(appCompatImageView);
        AppCompatImageView appCompatImageView2 = this.subs;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setOnClickListener(new ViewOnClickListenerC9657l(8, function1));
    }

    public void yandex(float f) {
        this.firebase = f;
        if (!this.purchase) {
            this.mopub.setAlpha(f);
            return;
        }
        C5447l c5447l = this.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        TextView titleView = c5447l.getTitleView();
        if (titleView != null) {
            titleView.setAlpha(f);
        }
        this.mopub.setBackgroundTintList(ColorStateList.valueOf(AbstractC14093l.subs(this.isPro, (int) (AbstractC8576l.amazon(f, 0.0f, 1.0f) * 255.0f))));
    }
}
