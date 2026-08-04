package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0791l implements InterfaceC1963l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C15577l f2384l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f2385l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public MenuC4984l f2386l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public RunnableC9929l f2388l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C14858l f2389l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC16405l f2390l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f2391l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Context f2392l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f2393l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C14858l f2394l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f2395l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Drawable f2396l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f2397l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1076l f2398l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LayoutInflater f2399l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f2400l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C11353l f2401l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f2403l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f2404l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f2402l = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f2387l = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final SparseBooleanArray f2405l = new SparseBooleanArray();

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C1770l f2406l = new C1770l(3, this);

    public C0791l(Context context) {
        this.f2393l = context;
        this.f2399l = LayoutInflater.from(context);
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean admob(C17858l c17858l) {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean amazon() {
        int size;
        ArrayList arrayListSmaato;
        int i;
        boolean z;
        C0791l c0791l = this;
        MenuC4984l menuC4984l = c0791l.f2386l;
        if (menuC4984l != null) {
            arrayListSmaato = menuC4984l.smaato();
            size = arrayListSmaato.size();
        } else {
            size = 0;
            arrayListSmaato = null;
        }
        int i2 = c0791l.f2391l;
        int i3 = c0791l.f2397l;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0791l.f2390l;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C17858l c17858l = (C17858l) arrayListSmaato.get(i4);
            int i7 = c17858l.f34808l;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0791l.f2395l && c17858l.f34813l) {
                i2 = 0;
            }
            i4++;
        }
        if (c0791l.f2400l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0791l.f2405l;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C17858l c17858l2 = (C17858l) arrayListSmaato.get(i9);
            int i11 = c17858l2.f34808l;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c17858l2.f34803l;
            if (z3) {
                View viewLoadAd = c0791l.loadAd(c17858l2, null, viewGroup);
                viewLoadAd.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewLoadAd.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c17858l2.amazon(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewLoadAd2 = c0791l.loadAd(c17858l2, null, viewGroup);
                        viewLoadAd2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewLoadAd2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            C17858l c17858l3 = (C17858l) arrayListSmaato.get(i13);
                            if (c17858l3.f34803l == i12) {
                                if ((c17858l3.f34802l & 32) == 32) {
                                    i8++;
                                }
                                c17858l3.amazon(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    c17858l2.amazon(z5);
                } else {
                    c17858l2.amazon(false);
                }
                i9++;
                i = 2;
                c0791l = this;
                z = true;
            }
            i9++;
            i = 2;
            c0791l = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.InterfaceC1963l
    public final void billing(InterfaceC1076l interfaceC1076l) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1963l
    public final boolean crashlytics(SubMenuC3166l subMenuC3166l) {
        boolean z;
        if (subMenuC3166l.hasVisibleItems()) {
            SubMenuC3166l subMenuC3166l2 = subMenuC3166l;
            while (true) {
                MenuC4984l menuC4984l = subMenuC3166l2.f6801l;
                if (menuC4984l == this.f2386l) {
                    break;
                }
                subMenuC3166l2 = (SubMenuC3166l) menuC4984l;
            }
            C17858l c17858l = subMenuC3166l2.f6800l;
            ViewGroup viewGroup = (ViewGroup) this.f2390l;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC5612l) && ((InterfaceC5612l) childAt).getItemData() == c17858l) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                subMenuC3166l.f6800l.getClass();
                int size = subMenuC3166l.f10206l.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC3166l.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C14858l c14858l = new C14858l(this, this.f2392l, subMenuC3166l, view);
                this.f2389l = c14858l;
                c14858l.mopub = z;
                AbstractC2080l abstractC2080l = c14858l.subs;
                if (abstractC2080l != null) {
                    abstractC2080l.metrica(z);
                }
                C14858l c14858l2 = this.f2389l;
                if (!c14858l2.loadAd()) {
                    if (c14858l2.purchase == null) {
                        C8339l.smaato("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c14858l2.amazon(0, 0, false, false);
                }
                InterfaceC1076l interfaceC1076l = this.f2398l;
                if (interfaceC1076l != null) {
                    interfaceC1076l.mo248try(subMenuC3166l);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void firebase(Context context, MenuC4984l menuC4984l) {
        this.f2392l = context;
        LayoutInflater.from(context);
        this.f2386l = menuC4984l;
        Resources resources = context.getResources();
        if (!this.f2385l) {
            this.f2400l = true;
        }
        int i = 2;
        this.f2404l = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f2391l = i;
        int measuredWidth = this.f2404l;
        if (this.f2400l) {
            if (this.f2401l == null) {
                C11353l c11353l = new C11353l(this, this.f2393l);
                this.f2401l = c11353l;
                if (this.f2403l) {
                    c11353l.setImageDrawable(this.f2396l);
                    this.f2396l = null;
                    this.f2403l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2401l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2401l.getMeasuredWidth();
        } else {
            this.f2401l = null;
        }
        this.f2397l = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean isPro() {
        C14858l c14858l = this.f2394l;
        return c14858l != null && c14858l.loadAd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View loadAd(C17858l c17858l, View view, ViewGroup viewGroup) {
        View actionView = c17858l.getActionView();
        if (actionView == null || c17858l.crashlytics()) {
            InterfaceC5612l interfaceC5612l = view instanceof InterfaceC5612l ? (InterfaceC5612l) view : (InterfaceC5612l) this.f2399l.inflate(this.f2387l, viewGroup, false);
            interfaceC5612l.yandex(c17858l);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC5612l;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2390l);
            if (this.f2384l == null) {
                this.f2384l = new C15577l(this);
            }
            actionMenuItemView.setPopupCallback(this.f2384l);
            actionView = (View) interfaceC5612l;
        }
        actionView.setVisibility(c17858l.f34813l ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C6186l)) {
            actionView.setLayoutParams(ActionMenuView.isPro(layoutParams));
        }
        return actionView;
    }

    public final boolean mopub() {
        Object obj;
        RunnableC9929l runnableC9929l = this.f2388l;
        if (runnableC9929l != null && (obj = this.f2390l) != null) {
            ((View) obj).removeCallbacks(runnableC9929l);
            this.f2388l = null;
            return true;
        }
        C14858l c14858l = this.f2394l;
        if (c14858l == null) {
            return false;
        }
        if (c14858l.loadAd()) {
            c14858l.subs.dismiss();
        }
        return true;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean purchase(C17858l c17858l) {
        return false;
    }

    public final boolean smaato() {
        MenuC4984l menuC4984l;
        boolean z = false;
        if (this.f2400l && !isPro() && (menuC4984l = this.f2386l) != null && this.f2390l != null && this.f2388l == null) {
            menuC4984l.subs();
            if (!menuC4984l.f10200l.isEmpty()) {
                RunnableC9929l runnableC9929l = new RunnableC9929l(this, new C14858l(this, this.f2392l, this.f2386l, this.f2401l), z, 1);
                this.f2388l = runnableC9929l;
                ((View) this.f2390l).post(runnableC9929l);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1963l
    public final void subs() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f2390l;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC4984l menuC4984l = this.f2386l;
            if (menuC4984l != null) {
                menuC4984l.subs();
                ArrayList arrayListSmaato = this.f2386l.smaato();
                int size = arrayListSmaato.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C17858l c17858l = (C17858l) arrayListSmaato.get(i2);
                    if ((c17858l.f34802l & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C17858l itemData = childAt instanceof InterfaceC5612l ? ((InterfaceC5612l) childAt).getItemData() : null;
                        View viewLoadAd = loadAd(c17858l, childAt, viewGroup);
                        if (c17858l != itemData) {
                            viewLoadAd.setPressed(false);
                            viewLoadAd.jumpDrawablesToCurrentState();
                        }
                        if (viewLoadAd != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewLoadAd.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewLoadAd);
                            }
                            ((ViewGroup) this.f2390l).addView(viewLoadAd, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2401l) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f2390l).requestLayout();
        MenuC4984l menuC4984l2 = this.f2386l;
        if (menuC4984l2 != null) {
            menuC4984l2.subs();
            ArrayList arrayList2 = menuC4984l2.f10205l;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC7627l actionProviderVisibilityListenerC7627l = ((C17858l) arrayList2.get(i3)).f34793l;
            }
        }
        MenuC4984l menuC4984l3 = this.f2386l;
        if (menuC4984l3 != null) {
            menuC4984l3.subs();
            arrayList = menuC4984l3.f10200l;
        }
        if (this.f2400l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C17858l) arrayList.get(0)).f34813l;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C11353l c11353l = this.f2401l;
        if (z) {
            if (c11353l == null) {
                this.f2401l = new C11353l(this, this.f2393l);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2401l.getParent();
            if (viewGroup3 != this.f2390l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2401l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2390l;
                C11353l c11353l2 = this.f2401l;
                actionMenuView.getClass();
                C6186l c6186lSubs = ActionMenuView.subs();
                c6186lSubs.yandex = true;
                actionMenuView.addView(c11353l2, c6186lSubs);
            }
        } else if (c11353l != null) {
            Object parent = c11353l.getParent();
            Object obj = this.f2390l;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f2401l);
            }
        }
        ((ActionMenuView) this.f2390l).setOverflowReserved(this.f2400l);
    }

    @Override // defpackage.InterfaceC1963l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
        mopub();
        C14858l c14858l = this.f2389l;
        if (c14858l != null && c14858l.loadAd()) {
            c14858l.subs.dismiss();
        }
        InterfaceC1076l interfaceC1076l = this.f2398l;
        if (interfaceC1076l != null) {
            interfaceC1076l.yandex(menuC4984l, z);
        }
    }
}
