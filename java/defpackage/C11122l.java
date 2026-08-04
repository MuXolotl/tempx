package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘُٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11122l extends C2956l implements InterfaceC17192l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f22332l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C4379l f22333l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final Rect f22334l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final /* synthetic */ C4313l f22335l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public CharSequence f22336l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11122l(C4313l c4313l, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f22335l = c4313l;
        this.f22334l = new Rect();
        this.f6432l = c4313l;
        this.f6430l = true;
        this.f6435l.setFocusable(true);
        this.f6424l = new C1785l(0, this);
    }

    @Override // defpackage.C2956l, defpackage.InterfaceC17192l
    public final void adcel(ListAdapter listAdapter) {
        super.adcel(listAdapter);
        this.f22333l = (C4379l) listAdapter;
    }

    @Override // defpackage.InterfaceC17192l
    public final void metrica(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C15863l c15863l = this.f6435l;
        boolean zIsShowing = c15863l.isShowing();
        subscription();
        c15863l.setInputMethodMode(2);
        mopub();
        C9945l c9945l = this.f6419l;
        c9945l.setChoiceMode(1);
        c9945l.setTextDirection(i);
        c9945l.setTextAlignment(i2);
        C4313l c4313l = this.f22335l;
        int selectedItemPosition = c4313l.getSelectedItemPosition();
        C9945l c9945l2 = this.f6419l;
        if (c15863l.isShowing() && c9945l2 != null) {
            c9945l2.setListSelectionHidden(false);
            c9945l2.setSelection(selectedItemPosition);
            if (c9945l2.getChoiceMode() != 0) {
                c9945l2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c4313l.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1294l viewTreeObserverOnGlobalLayoutListenerC1294l = new ViewTreeObserverOnGlobalLayoutListenerC1294l(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1294l);
        c15863l.setOnDismissListener(new C9910l(this, viewTreeObserverOnGlobalLayoutListenerC1294l));
    }

    @Override // defpackage.InterfaceC17192l
    public final CharSequence purchase() {
        return this.f22336l;
    }

    @Override // defpackage.InterfaceC17192l
    public final void remoteconfig(int i) {
        this.f22332l = i;
    }

    @Override // defpackage.InterfaceC17192l
    public final void subs(CharSequence charSequence) {
        this.f22336l = charSequence;
    }

    public final void subscription() {
        int i;
        C15863l c15863l = this.f6435l;
        Drawable background = c15863l.getBackground();
        C4313l c4313l = this.f22335l;
        Rect rect = c4313l.f8848l;
        if (background != null) {
            background.getPadding(rect);
            boolean z = AbstractC15958l.yandex;
            i = c4313l.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c4313l.getPaddingLeft();
        int paddingRight = c4313l.getPaddingRight();
        int width = c4313l.getWidth();
        int i2 = c4313l.f8847l;
        if (i2 == -2) {
            int iYandex = c4313l.yandex(this.f22333l, c15863l.getBackground());
            int i3 = (c4313l.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iYandex > i3) {
                iYandex = i3;
            }
            ads(Math.max(iYandex, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            ads((width - paddingLeft) - paddingRight);
        } else {
            ads(i2);
        }
        boolean z2 = AbstractC15958l.yandex;
        this.f6438l = c4313l.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f6433l) - this.f22332l) + i : paddingLeft + this.f22332l + i;
    }
}
