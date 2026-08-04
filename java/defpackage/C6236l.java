package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6236l implements InterfaceC1963l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f13166l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C17858l f13167l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public MenuC4984l f13168l;

    public C6236l(Toolbar toolbar) {
        this.f13166l = toolbar;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean admob(C17858l c17858l) {
        Toolbar toolbar = this.f13166l;
        toolbar.crashlytics();
        ViewParent parent = toolbar.f235l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f235l);
            }
            toolbar.addView(toolbar.f235l);
        }
        View actionView = c17858l.getActionView();
        toolbar.f238l = actionView;
        this.f13167l = c17858l;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f238l);
            }
            C10692l c10692lAdmob = Toolbar.admob();
            c10692lAdmob.yandex = (toolbar.f232l & 112) | 8388611;
            c10692lAdmob.loadAd = 2;
            toolbar.f238l.setLayoutParams(c10692lAdmob);
            toolbar.addView(toolbar.f238l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C10692l) childAt.getLayoutParams()).loadAd != 2 && childAt != toolbar.f247l) {
                toolbar.removeViewAt(childCount);
                toolbar.f268l.add(childAt);
            }
        }
        toolbar.requestLayout();
        c17858l.f34813l = true;
        c17858l.f34819l.startapp(false);
        KeyEvent.Callback callback = toolbar.f238l;
        if (callback instanceof InterfaceC4683l) {
            ((C10095l) ((InterfaceC4683l) callback)).f20568l.onActionViewExpanded();
        }
        toolbar.license();
        return true;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean crashlytics(SubMenuC3166l subMenuC3166l) {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void firebase(Context context, MenuC4984l menuC4984l) {
        C17858l c17858l;
        MenuC4984l menuC4984l2 = this.f13168l;
        if (menuC4984l2 != null && (c17858l = this.f13167l) != null) {
            menuC4984l2.amazon(c17858l);
        }
        this.f13168l = menuC4984l;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean purchase(C17858l c17858l) {
        Toolbar toolbar = this.f13166l;
        KeyEvent.Callback callback = toolbar.f238l;
        if (callback instanceof InterfaceC4683l) {
            ((C10095l) ((InterfaceC4683l) callback)).f20568l.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f238l);
        toolbar.removeView(toolbar.f235l);
        toolbar.f238l = null;
        ArrayList arrayList = toolbar.f268l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13167l = null;
        toolbar.requestLayout();
        c17858l.f34813l = false;
        c17858l.f34819l.startapp(false);
        toolbar.license();
        return true;
    }

    @Override // defpackage.InterfaceC1963l
    public final void subs() {
        if (this.f13167l != null) {
            MenuC4984l menuC4984l = this.f13168l;
            if (menuC4984l != null) {
                int size = menuC4984l.f10206l.size();
                for (int i = 0; i < size; i++) {
                    if (this.f13168l.getItem(i) == this.f13167l) {
                        return;
                    }
                }
            }
            purchase(this.f13167l);
        }
    }

    @Override // defpackage.InterfaceC1963l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
    }
}
