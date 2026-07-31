package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُِۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC12191l extends AbstractC2080l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public View f24215l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final MenuC4984l f24216l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f24217l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f24218l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C1632l f24219l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f24220l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Context f24221l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f24222l = 0;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f24223l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC11783l f24224l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public ViewTreeObserver f24225l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f24226l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1816l f24227l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public View f24228l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1294l f24229l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f24230l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f24231l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public InterfaceC1076l f24232l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f24233l;

    public ViewOnKeyListenerC12191l(Context context, MenuC4984l menuC4984l, View view, int i, boolean z) {
        int i2 = 3;
        this.f24229l = new ViewTreeObserverOnGlobalLayoutListenerC1294l(i2, this);
        this.f24224l = new ViewOnAttachStateChangeListenerC11783l(i2, this);
        this.f24221l = context;
        this.f24216l = menuC4984l;
        this.f24226l = z;
        this.f24227l = new C1816l(menuC4984l, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f24217l = i;
        Resources resources = context.getResources();
        this.f24230l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f24228l = view;
        this.f24219l = new C1632l(context, null, i, 0);
        menuC4984l.loadAd(this, context);
    }

    @Override // defpackage.AbstractC2080l
    public final void adcel(int i) {
        this.f24219l.f6438l = i;
    }

    @Override // defpackage.AbstractC2080l
    public final void ads(PopupWindow.OnDismissListener onDismissListener) {
        this.f24231l = onDismissListener;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void billing(InterfaceC1076l interfaceC1076l) {
        this.f24232l = interfaceC1076l;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean crashlytics(SubMenuC3166l subMenuC3166l) {
        boolean z;
        if (subMenuC3166l.hasVisibleItems()) {
            C17223l c17223l = new C17223l(this.f24221l, subMenuC3166l, this.f24215l, this.f24226l, this.f24217l, 0);
            InterfaceC1076l interfaceC1076l = this.f24232l;
            c17223l.admob = interfaceC1076l;
            AbstractC2080l abstractC2080l = c17223l.subs;
            if (abstractC2080l != null) {
                abstractC2080l.billing(interfaceC1076l);
            }
            int size = subMenuC3166l.f10206l.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC3166l.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c17223l.mopub = z;
            AbstractC2080l abstractC2080l2 = c17223l.subs;
            if (abstractC2080l2 != null) {
                abstractC2080l2.metrica(z);
            }
            c17223l.isPro = this.f24231l;
            this.f24231l = null;
            this.f24216l.crashlytics(false);
            C1632l c1632l = this.f24219l;
            int width = c1632l.f6438l;
            int iStartapp = c1632l.startapp();
            if ((Gravity.getAbsoluteGravity(this.f24222l, this.f24228l.getLayoutDirection()) & 7) == 5) {
                width += this.f24228l.getWidth();
            }
            if (!c17223l.loadAd()) {
                if (c17223l.purchase != null) {
                    c17223l.amazon(width, iStartapp, true, true);
                }
            }
            InterfaceC1076l interfaceC1076l2 = this.f24232l;
            if (interfaceC1076l2 != null) {
                interfaceC1076l2.mo248try(subMenuC3166l);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC17816l
    public final void dismiss() {
        if (loadAd()) {
            this.f24219l.dismiss();
        }
    }

    @Override // defpackage.InterfaceC17816l
    public final C9945l isPro() {
        return this.f24219l.f6419l;
    }

    @Override // defpackage.InterfaceC17816l
    public final boolean loadAd() {
        return !this.f24220l && this.f24219l.f6435l.isShowing();
    }

    @Override // defpackage.AbstractC2080l
    public final void metrica(boolean z) {
        this.f24227l.crashlytics = z;
    }

    @Override // defpackage.InterfaceC17816l
    public final void mopub() {
        View view;
        if (loadAd()) {
            return;
        }
        if (this.f24220l || (view = this.f24228l) == null) {
            C8339l.smaato("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f24215l = view;
        C1632l c1632l = this.f24219l;
        C15863l c15863l = c1632l.f6435l;
        C15863l c15863l2 = c1632l.f6435l;
        c15863l.setOnDismissListener(this);
        c1632l.f6424l = this;
        c1632l.f6430l = true;
        c15863l2.setFocusable(true);
        View view2 = this.f24215l;
        boolean z = this.f24225l == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f24225l = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f24229l);
        }
        view2.addOnAttachStateChangeListener(this.f24224l);
        c1632l.f6432l = view2;
        c1632l.f6436l = this.f24222l;
        boolean z2 = this.f24223l;
        Context context = this.f24221l;
        C1816l c1816l = this.f24227l;
        if (!z2) {
            this.f24233l = AbstractC2080l.remoteconfig(c1816l, context, this.f24230l);
            this.f24223l = true;
        }
        c1632l.ads(this.f24233l);
        c15863l2.setInputMethodMode(2);
        Rect rect = this.f4656l;
        c1632l.f6425l = rect != null ? new Rect(rect) : null;
        c1632l.mopub();
        C9945l c9945l = c1632l.f6419l;
        c9945l.setOnKeyListener(this);
        if (this.f24218l) {
            MenuC4984l menuC4984l = this.f24216l;
            if (menuC4984l.f10188l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c9945l, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC4984l.f10188l);
                }
                frameLayout.setEnabled(false);
                c9945l.addHeaderView(frameLayout, null, false);
            }
        }
        c1632l.adcel(c1816l);
        c1632l.mopub();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f24220l = true;
        this.f24216l.crashlytics(true);
        ViewTreeObserver viewTreeObserver = this.f24225l;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f24225l = this.f24215l.getViewTreeObserver();
            }
            this.f24225l.removeGlobalOnLayoutListener(this.f24229l);
            this.f24225l = null;
        }
        this.f24215l.removeOnAttachStateChangeListener(this.f24224l);
        PopupWindow.OnDismissListener onDismissListener = this.f24231l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC2080l
    public final void startapp(int i) {
        this.f24222l = i;
    }

    @Override // defpackage.InterfaceC1963l
    public final void subs() {
        this.f24223l = false;
        C1816l c1816l = this.f24227l;
        if (c1816l != null) {
            c1816l.notifyDataSetChanged();
        }
    }

    @Override // defpackage.AbstractC2080l
    public final void subscription(boolean z) {
        this.f24218l = z;
    }

    @Override // defpackage.AbstractC2080l
    public final void tapsense(int i) {
        this.f24219l.smaato(i);
    }

    @Override // defpackage.AbstractC2080l
    public final void vip(View view) {
        this.f24228l = view;
    }

    @Override // defpackage.InterfaceC1963l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
        if (menuC4984l != this.f24216l) {
            return;
        }
        dismiss();
        InterfaceC1076l interfaceC1076l = this.f24232l;
        if (interfaceC1076l != null) {
            interfaceC1076l.yandex(menuC4984l, z);
        }
    }

    @Override // defpackage.AbstractC2080l
    public final void smaato(MenuC4984l menuC4984l) {
    }
}
