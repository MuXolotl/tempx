package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: lّؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2080l implements InterfaceC17816l, InterfaceC1963l, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Rect f4656l;

    public static int remoteconfig(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void adcel(int i);

    @Override // defpackage.InterfaceC1963l
    public final boolean admob(C17858l c17858l) {
        return false;
    }

    public abstract void ads(PopupWindow.OnDismissListener onDismissListener);

    public abstract void metrica(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1816l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1816l) listAdapter).yandex.adcel((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC8334l) ? 0 : 4);
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean purchase(C17858l c17858l) {
        return false;
    }

    public abstract void smaato(MenuC4984l menuC4984l);

    public abstract void startapp(int i);

    public abstract void subscription(boolean z);

    public abstract void tapsense(int i);

    public abstract void vip(View view);

    @Override // defpackage.InterfaceC1963l
    public final void firebase(Context context, MenuC4984l menuC4984l) {
    }
}
