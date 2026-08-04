package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC13913l extends DialogC0230l implements DialogInterface {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14126l f27211l;

    public DialogInterfaceC13913l(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, admob(contextThemeWrapper, i));
        this.f27211l = new C14126l(getContext(), this, getWindow());
    }

    public static int admob(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.DialogC0230l, defpackage.DialogC0427l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C14126l c14126l = this.f27211l;
        c14126l.loadAd.setContentView(c14126l.isVip);
        Context context = c14126l.yandex;
        Window window = c14126l.crashlytics;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        LinearLayout linearLayout = c14126l.mopub;
        if (linearLayout == null) {
            linearLayout = null;
        }
        boolean z = linearLayout != null;
        if (!z || !C14126l.yandex(linearLayout)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
            if (c14126l.admob) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c14126l.billing != null) {
                ((LinearLayout.LayoutParams) ((C8666l) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupLoadAd = C14126l.loadAd(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupLoadAd2 = C14126l.loadAd(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupLoadAd3 = C14126l.loadAd(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c14126l.ads = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c14126l.ads.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupLoadAd2.findViewById(android.R.id.message);
        c14126l.license = textView;
        if (textView != null) {
            String str = c14126l.purchase;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c14126l.ads.removeView(c14126l.license);
                if (c14126l.billing != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c14126l.ads.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c14126l.ads);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c14126l.billing, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupLoadAd2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupLoadAd3.findViewById(android.R.id.button1);
        c14126l.subs = button;
        ViewOnClickListenerC10659l viewOnClickListenerC10659l = c14126l.f27625throws;
        button.setOnClickListener(viewOnClickListenerC10659l);
        boolean zIsEmpty = TextUtils.isEmpty(c14126l.isPro);
        Button button2 = c14126l.subs;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(c14126l.isPro);
            c14126l.subs.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupLoadAd3.findViewById(android.R.id.button2);
        c14126l.smaato = button3;
        button3.setOnClickListener(viewOnClickListenerC10659l);
        boolean zIsEmpty2 = TextUtils.isEmpty(c14126l.remoteconfig);
        Button button4 = c14126l.smaato;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(c14126l.remoteconfig);
            c14126l.smaato.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupLoadAd3.findViewById(android.R.id.button3);
        c14126l.metrica = button5;
        button5.setOnClickListener(viewOnClickListenerC10659l);
        boolean zIsEmpty3 = TextUtils.isEmpty(c14126l.startapp);
        Button button6 = c14126l.metrica;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(c14126l.startapp);
            c14126l.metrica.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c14126l.subs;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c14126l.smaato;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c14126l.metrica;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupLoadAd3.setVisibility(8);
        }
        if (c14126l.pro != null) {
            viewGroupLoadAd.addView(c14126l.pro, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c14126l.tapsense = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c14126l.amazon) || !c14126l.appmetrica) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c14126l.tapsense.setVisibility(8);
                viewGroupLoadAd.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c14126l.Signature = textView2;
                textView2.setText(c14126l.amazon);
                Drawable drawable = c14126l.subscription;
                if (drawable != null) {
                    c14126l.tapsense.setImageDrawable(drawable);
                } else {
                    c14126l.Signature.setPadding(c14126l.tapsense.getPaddingLeft(), c14126l.tapsense.getPaddingTop(), c14126l.tapsense.getPaddingRight(), c14126l.tapsense.getPaddingBottom());
                    c14126l.tapsense.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupLoadAd == null || viewGroupLoadAd.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupLoadAd3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupLoadAd2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c14126l.ads;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c14126l.purchase == null && c14126l.billing == null) ? null : viewGroupLoadAd.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupLoadAd2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c14126l.billing;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f63l, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f62l);
            }
        }
        if (!z2) {
            View view = c14126l.billing;
            if (view == null) {
                view = c14126l.ads;
            }
            if (view != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupLoadAd2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupLoadAd2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c14126l.billing;
        if (alertController$RecycleListView2 == null || (listAdapter = c14126l.ad) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c14126l.advert;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f27211l.ads;
        if (nestedScrollView == null || !nestedScrollView.isPro(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f27211l.ads;
        if (nestedScrollView == null || !nestedScrollView.isPro(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.DialogC0230l, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C14126l c14126l = this.f27211l;
        c14126l.amazon = charSequence;
        TextView textView = c14126l.Signature;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
