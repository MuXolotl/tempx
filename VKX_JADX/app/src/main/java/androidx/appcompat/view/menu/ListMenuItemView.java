package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.AbstractC14657l;
import defpackage.C12418l;
import defpackage.C17858l;
import defpackage.InterfaceC5612l;
import defpackage.MenuC4984l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC5612l, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f78l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public RadioButton f79l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ImageView f80l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ImageView f81l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public LayoutInflater f82l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ImageView f83l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17858l f84l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f85l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Drawable f86l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f87l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public CheckBox f88l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public TextView f89l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final Context f90l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public LinearLayout f91l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public TextView f92l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f93l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Drawable f94l;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C12418l c12418lPro = C12418l.pro(getContext(), attributeSet, AbstractC14657l.ads, i);
        this.f86l = c12418lPro.ads(5);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        this.f93l = typedArray.getResourceId(1, -1);
        this.f78l = typedArray.getBoolean(7, false);
        this.f90l = context;
        this.f94l = c12418lPro.ads(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, ua.itaysonlab.vkx.R.attr.dropDownListViewStyle, 0);
        this.f87l = typedArrayObtainStyledAttributes.hasValue(0);
        c12418lPro.advert();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f82l == null) {
            this.f82l = LayoutInflater.from(getContext());
        }
        return this.f82l;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f80l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f81l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f81l.getLayoutParams();
        rect.top = this.f81l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.InterfaceC5612l
    public C17858l getItemData() {
        return this.f84l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f86l);
        TextView textView = (TextView) findViewById(ua.itaysonlab.vkx.R.id.title);
        this.f89l = textView;
        int i = this.f93l;
        if (i != -1) {
            textView.setTextAppearance(this.f90l, i);
        }
        this.f92l = (TextView) findViewById(ua.itaysonlab.vkx.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(ua.itaysonlab.vkx.R.id.submenuarrow);
        this.f80l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f94l);
        }
        this.f81l = (ImageView) findViewById(ua.itaysonlab.vkx.R.id.group_divider);
        this.f91l = (LinearLayout) findViewById(ua.itaysonlab.vkx.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f83l != null && this.f78l) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f83l.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f79l == null && this.f88l == null) {
            return;
        }
        if ((this.f84l.f34802l & 4) != 0) {
            if (this.f79l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ua.itaysonlab.vkx.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f79l = radioButton;
                LinearLayout linearLayout = this.f91l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f79l;
            view = this.f88l;
        } else {
            if (this.f88l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ua.itaysonlab.vkx.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f88l = checkBox;
                LinearLayout linearLayout2 = this.f91l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f88l;
            view = this.f79l;
        }
        if (z) {
            compoundButton.setChecked(this.f84l.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f88l;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f79l;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f84l.f34802l & 4) != 0) {
            if (this.f79l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ua.itaysonlab.vkx.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f79l = radioButton;
                LinearLayout linearLayout = this.f91l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f79l;
        } else {
            if (this.f88l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ua.itaysonlab.vkx.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f88l = checkBox;
                LinearLayout linearLayout2 = this.f91l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f88l;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f85l = z;
        this.f78l = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f81l;
        if (imageView != null) {
            imageView.setVisibility((this.f87l || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC4984l menuC4984l = this.f84l.f34819l;
        boolean z = this.f85l;
        if (z || this.f78l) {
            ImageView imageView = this.f83l;
            if (imageView == null && drawable == null && !this.f78l) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(ua.itaysonlab.vkx.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f83l = imageView2;
                LinearLayout linearLayout = this.f91l;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f78l) {
                this.f83l.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f83l;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f83l.getVisibility() != 0) {
                this.f83l.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f89l;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f89l.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f89l.getVisibility() != 0) {
                this.f89l.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // defpackage.InterfaceC5612l
    public final void yandex(C17858l c17858l) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f84l = c17858l;
        boolean zIsVisible = c17858l.isVisible();
        MenuC4984l menuC4984l = c17858l.f34819l;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c17858l.f34811l);
        setCheckable(c17858l.isCheckable());
        if (menuC4984l.metrica()) {
            if ((menuC4984l.vip() ? c17858l.f34809l : c17858l.f34800l) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        menuC4984l.vip();
        if (z) {
            C17858l c17858l2 = this.f84l;
            MenuC4984l menuC4984l2 = c17858l2.f34819l;
            if (menuC4984l2.metrica()) {
                if ((menuC4984l2.vip() ? c17858l2.f34809l : c17858l2.f34800l) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f92l;
            C17858l c17858l3 = this.f84l;
            MenuC4984l menuC4984l3 = c17858l3.f34819l;
            Context context = menuC4984l3.f10197l;
            char c = menuC4984l3.vip() ? c17858l3.f34809l : c17858l3.f34800l;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(ua.itaysonlab.vkx.R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC4984l3.vip() ? c17858l3.f34818l : c17858l3.f34816l;
                C17858l.yandex(i2, 65536, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_meta_shortcut_label), sb);
                C17858l.yandex(i2, 4096, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_ctrl_shortcut_label), sb);
                C17858l.yandex(i2, 2, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_alt_shortcut_label), sb);
                C17858l.yandex(i2, 1, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_shift_shortcut_label), sb);
                C17858l.yandex(i2, 4, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_sym_shortcut_label), sb);
                C17858l.yandex(i2, 8, resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(ua.itaysonlab.vkx.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f92l.getVisibility() != i) {
            this.f92l.setVisibility(i);
        }
        setIcon(c17858l.getIcon());
        setEnabled(c17858l.isEnabled());
        setSubMenuArrowVisible(c17858l.hasSubMenu());
        setContentDescription(c17858l.f34806l);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.listMenuViewStyle);
    }
}
