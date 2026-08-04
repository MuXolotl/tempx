package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: lؚ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7564l extends C9945l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f15558l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C17858l f15559l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC1173l f15560l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f15561l;

    public C7564l(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f15558l = 21;
            this.f15561l = 22;
        } else {
            this.f15558l = 22;
            this.f15561l = 21;
        }
    }

    @Override // defpackage.C9945l, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1816l c1816l;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f15560l != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1816l = (C1816l) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1816l = (C1816l) adapter;
                headersCount = 0;
            }
            C17858l c17858lLoadAd = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1816l.getCount()) ? null : c1816l.getItem(i);
            C17858l c17858l = this.f15559l;
            if (c17858l != c17858lLoadAd) {
                MenuC4984l menuC4984l = c1816l.yandex;
                if (c17858l != null) {
                    this.f15560l.billing(menuC4984l, c17858l);
                }
                this.f15559l = c17858lLoadAd;
                if (c17858lLoadAd != null) {
                    this.f15560l.vip(menuC4984l, c17858lLoadAd);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f15558l) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f15561l) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1816l) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1816l) adapter).yandex.crashlytics(false);
        return true;
    }

    public void setHoverListener(InterfaceC1173l interfaceC1173l) {
        this.f15560l = interfaceC1173l;
    }

    @Override // defpackage.C9945l, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
