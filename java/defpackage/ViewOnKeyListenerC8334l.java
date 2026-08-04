package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC8334l extends AbstractC2080l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f17237l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f17239l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f17242l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f17244l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public ViewTreeObserver f17245l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Context f17246l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f17247l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f17248l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f17249l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public View f17251l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f17252l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f17253l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public boolean f17254l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Handler f17257l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public View f17259l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f17260l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public InterfaceC1076l f17261l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ArrayList f17240l = new ArrayList();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ArrayList f17243l = new ArrayList();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1294l f17256l = new ViewTreeObserverOnGlobalLayoutListenerC1294l(2, this);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC11783l f17250l = new ViewOnAttachStateChangeListenerC11783l(1, this);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C5008l f17258l = new C5008l(3, this);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f17255l = 0;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f17238l = 0;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f17241l = false;

    public ViewOnKeyListenerC8334l(Context context, View view, int i, boolean z) {
        this.f17246l = context;
        this.f17259l = view;
        this.f17253l = i;
        this.f17252l = z;
        this.f17244l = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f17239l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f17257l = new Handler();
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Signature(MenuC4984l menuC4984l) {
        boolean z;
        char c;
        View childAt;
        C11095l c11095l;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        C1816l c1816l;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f17246l;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1816l c1816l2 = new C1816l(menuC4984l, layoutInflaterFrom, this.f17252l, R.layout.abc_cascading_menu_item_layout);
        if (!loadAd() && this.f17241l) {
            c1816l2.crashlytics = true;
        } else if (loadAd()) {
            int size = menuC4984l.f10206l.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC4984l.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c1816l2.crashlytics = z;
        }
        int iRemoteconfig = AbstractC2080l.remoteconfig(c1816l2, context, this.f17239l);
        C1632l c1632l = new C1632l(context, null, this.f17253l, 0);
        c1632l.f3964l = this.f17258l;
        c1632l.f6424l = this;
        C15863l c15863l = c1632l.f6435l;
        c15863l.setOnDismissListener(this);
        c1632l.f6432l = this.f17259l;
        c1632l.f6436l = this.f17238l;
        c1632l.f6430l = true;
        c15863l.setFocusable(true);
        c15863l.setInputMethodMode(2);
        c1632l.adcel(c1816l2);
        c1632l.ads(iRemoteconfig);
        c1632l.f6436l = this.f17238l;
        ArrayList arrayList = this.f17243l;
        if (arrayList.size() > 0) {
            c11095l = (C11095l) AbstractC14814l.firebase(1, arrayList);
            MenuC4984l menuC4984l2 = c11095l.loadAd;
            int size2 = menuC4984l2.f10206l.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = menuC4984l2.getItem(i5);
                if (item.hasSubMenu() && menuC4984l == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                C9945l c9945l = c11095l.yandex.f6419l;
                ListAdapter adapter = c9945l.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1816l = (C1816l) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1816l = (C1816l) adapter;
                    headersCount = 0;
                }
                int count = c1816l.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c1816l.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c9945l.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c9945l.getChildCount()) ? c9945l.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            c11095l = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C1632l.f3963l;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(c15863l, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC14777l.yandex(c15863l, c);
            }
            AbstractC15693l.yandex(c15863l, null);
            C9945l c9945l2 = ((C11095l) arrayList.get(arrayList.size() - 1)).yandex.f6419l;
            int[] iArr = new int[2];
            c9945l2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f17251l.getWindowVisibleDisplayFrame(rect);
            if (this.f17244l == 1) {
                if (c9945l2.getWidth() + iArr[0] + iRemoteconfig > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iRemoteconfig < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.f17244l = i;
            if (Build.VERSION.SDK_INT >= 26) {
                c1632l.f6432l = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f17259l.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f17238l & 7) == 5) {
                    iArr2[0] = this.f17259l.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.f17238l & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iRemoteconfig;
            } else if (z2) {
                width = i3 + iRemoteconfig;
            } else {
                iRemoteconfig = childAt.getWidth();
            }
            c1632l.f6438l = width;
            c1632l.f6439l = true;
            c1632l.f6431l = true;
            c1632l.smaato(i2);
        } else {
            if (this.f17248l) {
                c1632l.f6438l = this.f17247l;
            }
            if (this.f17260l) {
                c1632l.smaato(this.f17242l);
            }
            Rect rect2 = this.f4656l;
            c1632l.f6425l = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C11095l(c1632l, menuC4984l, this.f17244l));
        c1632l.mopub();
        C9945l c9945l3 = c1632l.f6419l;
        c9945l3.setOnKeyListener(this);
        if (c11095l == null && this.f17237l && menuC4984l.f10188l != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c9945l3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC4984l.f10188l);
            c9945l3.addHeaderView(frameLayout, null, false);
            c1632l.mopub();
        }
    }

    @Override // defpackage.AbstractC2080l
    public final void adcel(int i) {
        this.f17248l = true;
        this.f17247l = i;
    }

    @Override // defpackage.AbstractC2080l
    public final void ads(PopupWindow.OnDismissListener onDismissListener) {
        this.f17249l = onDismissListener;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void billing(InterfaceC1076l interfaceC1076l) {
        this.f17261l = interfaceC1076l;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean crashlytics(SubMenuC3166l subMenuC3166l) {
        for (C11095l c11095l : this.f17243l) {
            if (subMenuC3166l == c11095l.loadAd) {
                c11095l.yandex.f6419l.requestFocus();
                return true;
            }
        }
        if (!subMenuC3166l.hasVisibleItems()) {
            return false;
        }
        smaato(subMenuC3166l);
        InterfaceC1076l interfaceC1076l = this.f17261l;
        if (interfaceC1076l != null) {
            interfaceC1076l.mo248try(subMenuC3166l);
        }
        return true;
    }

    @Override // defpackage.InterfaceC17816l
    public final void dismiss() {
        ArrayList arrayList = this.f17243l;
        int size = arrayList.size();
        if (size > 0) {
            C11095l[] c11095lArr = (C11095l[]) arrayList.toArray(new C11095l[size]);
            for (int i = size - 1; i >= 0; i--) {
                C11095l c11095l = c11095lArr[i];
                if (c11095l.yandex.f6435l.isShowing()) {
                    c11095l.yandex.dismiss();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17816l
    public final C9945l isPro() {
        ArrayList arrayList = this.f17243l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C11095l) AbstractC14814l.firebase(1, arrayList)).yandex.f6419l;
    }

    @Override // defpackage.InterfaceC17816l
    public final boolean loadAd() {
        ArrayList arrayList = this.f17243l;
        return arrayList.size() > 0 && ((C11095l) arrayList.get(0)).yandex.f6435l.isShowing();
    }

    @Override // defpackage.AbstractC2080l
    public final void metrica(boolean z) {
        this.f17241l = z;
    }

    @Override // defpackage.InterfaceC17816l
    public final void mopub() {
        if (loadAd()) {
            return;
        }
        ArrayList arrayList = this.f17240l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Signature((MenuC4984l) it.next());
        }
        arrayList.clear();
        View view = this.f17259l;
        this.f17251l = view;
        if (view != null) {
            boolean z = this.f17245l == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f17245l = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17256l);
            }
            this.f17251l.addOnAttachStateChangeListener(this.f17250l);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C11095l c11095l;
        ArrayList arrayList = this.f17243l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c11095l = null;
                break;
            }
            c11095l = (C11095l) arrayList.get(i);
            if (!c11095l.yandex.f6435l.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c11095l != null) {
            c11095l.loadAd.crashlytics(false);
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
    public final void smaato(MenuC4984l menuC4984l) {
        menuC4984l.loadAd(this, this.f17246l);
        if (loadAd()) {
            Signature(menuC4984l);
        } else {
            this.f17240l.add(menuC4984l);
        }
    }

    @Override // defpackage.AbstractC2080l
    public final void startapp(int i) {
        if (this.f17255l != i) {
            this.f17255l = i;
            this.f17238l = Gravity.getAbsoluteGravity(i, this.f17259l.getLayoutDirection());
        }
    }

    @Override // defpackage.InterfaceC1963l
    public final void subs() {
        Iterator it = this.f17243l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C11095l) it.next()).yandex.f6419l.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1816l) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.AbstractC2080l
    public final void subscription(boolean z) {
        this.f17237l = z;
    }

    @Override // defpackage.AbstractC2080l
    public final void tapsense(int i) {
        this.f17260l = true;
        this.f17242l = i;
    }

    @Override // defpackage.AbstractC2080l
    public final void vip(View view) {
        if (this.f17259l != view) {
            this.f17259l = view;
            this.f17238l = Gravity.getAbsoluteGravity(this.f17255l, view.getLayoutDirection());
        }
    }

    @Override // defpackage.InterfaceC1963l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
        ArrayList arrayList = this.f17243l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC4984l == ((C11095l) arrayList.get(i)).loadAd) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C11095l) arrayList.get(i2)).loadAd.crashlytics(false);
        }
        C11095l c11095l = (C11095l) arrayList.remove(i);
        MenuC4984l menuC4984l2 = c11095l.loadAd;
        C1632l c1632l = c11095l.yandex;
        C15863l c15863l = c1632l.f6435l;
        menuC4984l2.ads(this);
        if (this.f17254l) {
            AbstractC15693l.loadAd(c15863l, null);
            c15863l.setAnimationStyle(0);
        }
        c1632l.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f17244l = ((C11095l) arrayList.get(size2 - 1)).crashlytics;
        } else {
            this.f17244l = this.f17259l.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C11095l) arrayList.get(0)).loadAd.crashlytics(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1076l interfaceC1076l = this.f17261l;
        if (interfaceC1076l != null) {
            interfaceC1076l.yandex(menuC4984l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f17245l;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f17245l.removeGlobalOnLayoutListener(this.f17256l);
            }
            this.f17245l = null;
        }
        this.f17251l.removeOnAttachStateChangeListener(this.f17250l);
        this.f17249l.onDismiss();
    }
}
