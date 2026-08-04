package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.AbstractList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12375l extends AbstractC14412l {
    public AbstractList amazon;
    public C4816l crashlytics;

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    public static void firebase(C12375l c12375l, String str, AbstractList abstractList) {
        C4816l c4816l;
        C4816l c4816l2;
        Object next;
        String str2;
        c12375l.getClass();
        c12375l.amazon = abstractList;
        if (abstractList != null) {
            int i = 1;
            if (abstractList.size() > 1) {
                C4816l c4816l3 = c12375l.crashlytics;
                if (c4816l3 == null) {
                    c4816l3 = null;
                }
                ((TextView) c4816l3.f9862l).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arrow_down, 0);
                C4816l c4816l4 = c12375l.crashlytics;
                if (c4816l4 == null) {
                    c4816l4 = null;
                }
                ((TextView) c4816l4.f9862l).setOnClickListener(new ViewOnClickListenerC6704l(c12375l, i));
            } else {
                c4816l = c12375l.crashlytics;
                if (c4816l == null) {
                    c4816l = null;
                }
                ((TextView) c4816l.f9862l).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                c4816l2 = c12375l.crashlytics;
                if (c4816l2 == null) {
                    c4816l2 = null;
                }
                ((TextView) c4816l2.f9862l).setOnClickListener(null);
            }
        } else {
            c4816l = c12375l.crashlytics;
            if (c4816l == null) {
                c4816l = null;
            }
            ((TextView) c4816l.f9862l).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            c4816l2 = c12375l.crashlytics;
            if (c4816l2 == null) {
                c4816l2 = null;
            }
            ((TextView) c4816l2.f9862l).setOnClickListener(null);
        }
        C4816l c4816l5 = c12375l.crashlytics;
        if (c4816l5 == null) {
            c4816l5 = null;
        }
        ((TextView) c4816l5.f9862l).setVisibility(0);
        C4816l c4816l6 = c12375l.crashlytics;
        if (c4816l6 == null) {
            c4816l6 = null;
        }
        TextView textView = (TextView) c4816l6.f9862l;
        if (abstractList != null) {
            Iterator it = abstractList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) ((C12823l) next).f25199l).booleanValue());
            C12823l c12823l = (C12823l) next;
            if (c12823l != null && (str2 = (String) c12823l.f25200l) != null) {
                str = str2;
            }
        }
        textView.setText(str);
        C4816l c4816l7 = c12375l.crashlytics;
        ActionMenuView actionMenuView = (ActionMenuView) (c4816l7 != null ? c4816l7 : null).f9859l;
        actionMenuView.getMenu().clear();
        actionMenuView.setOnMenuItemClickListener(new C6536l(7, c12375l));
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        C4816l c4816l = this.crashlytics;
        if (c4816l == null) {
            return;
        }
        AppBarLayout appBarLayout = (AppBarLayout) (c4816l == null ? null : c4816l).f9860l;
        if (c4816l == null) {
            c4816l = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((AppBarLayout) c4816l.f9860l).getLayoutParams();
        marginLayoutParams.topMargin = i;
        appBarLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) {
        int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.vkxui_spinner_2, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) viewInflate;
        int i2 = R.id.actions;
        ActionMenuView actionMenuView = (ActionMenuView) AbstractC8576l.smaato(viewInflate, R.id.actions);
        if (actionMenuView != null) {
            i2 = R.id.back;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.back);
            if (imageView != null) {
                i2 = R.id.spinner;
                TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.spinner);
                if (textView != null) {
                    this.crashlytics = new C4816l(appBarLayout, actionMenuView, imageView, textView);
                    imageView.setOnClickListener(new ViewOnClickListenerC18105l(context, 1));
                    C4816l c4816l = this.crashlytics;
                    if (c4816l == null) {
                        c4816l = null;
                    }
                    TextView textView2 = (TextView) c4816l.f9862l;
                    textView2.setVisibility(4);
                    textView2.setOnClickListener(new ViewOnClickListenerC6704l(this, i));
                    C4816l c4816l2 = this.crashlytics;
                    return (AppBarLayout) (c4816l2 != null ? c4816l2 : null).f9860l;
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.AbstractC14412l
    public final void billing() {
        C4816l c4816l = this.crashlytics;
        if (c4816l == null) {
            c4816l = null;
        }
        Menu menu = ((ActionMenuView) c4816l.f9859l).getMenu();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                icon.setTint(AbstractC13209l.yandex(R.attr.reborn_title_color));
            }
        }
    }

    @Override // defpackage.AbstractC14412l
    public final void mopub(String str) {
        C4816l c4816l = this.crashlytics;
        if (c4816l == null) {
            c4816l = null;
        }
        ((TextView) c4816l.f9862l).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        C4816l c4816l2 = this.crashlytics;
        if (c4816l2 == null) {
            c4816l2 = null;
        }
        ((TextView) c4816l2.f9862l).setOnClickListener(null);
        C4816l c4816l3 = this.crashlytics;
        if (c4816l3 == null) {
            c4816l3 = null;
        }
        ((TextView) c4816l3.f9862l).setText(str);
        C4816l c4816l4 = this.crashlytics;
        ((TextView) (c4816l4 != null ? c4816l4 : null).f9862l).setVisibility(0);
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        C4816l c4816l = this.crashlytics;
        if (c4816l == null) {
            c4816l = null;
        }
        return (AppBarLayout) c4816l.f9860l;
    }
}
