package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: lّؓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1816l extends BaseAdapter {
    public final boolean amazon;
    public final int billing;
    public boolean crashlytics;
    public int loadAd = -1;
    public final LayoutInflater purchase;
    public final MenuC4984l yandex;

    public C1816l(MenuC4984l menuC4984l, LayoutInflater layoutInflater, boolean z, int i) {
        this.amazon = z;
        this.purchase = layoutInflater;
        this.yandex = menuC4984l;
        this.billing = i;
        yandex();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListSmaato;
        boolean z = this.amazon;
        MenuC4984l menuC4984l = this.yandex;
        if (z) {
            menuC4984l.subs();
            arrayListSmaato = menuC4984l.f10200l;
        } else {
            arrayListSmaato = menuC4984l.smaato();
        }
        return this.loadAd < 0 ? arrayListSmaato.size() : arrayListSmaato.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.purchase.inflate(this.billing, viewGroup, false);
        }
        int i2 = getItem(i).f34803l;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f34803l : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.yandex.remoteconfig() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC5612l interfaceC5612l = (InterfaceC5612l) view;
        if (this.crashlytics) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC5612l.yandex(getItem(i));
        return view;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C17858l getItem(int i) {
        ArrayList arrayListSmaato;
        boolean z = this.amazon;
        MenuC4984l menuC4984l = this.yandex;
        if (z) {
            menuC4984l.subs();
            arrayListSmaato = menuC4984l.f10200l;
        } else {
            arrayListSmaato = menuC4984l.smaato();
        }
        int i2 = this.loadAd;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C17858l) arrayListSmaato.get(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        yandex();
        super.notifyDataSetChanged();
    }

    public final void yandex() {
        MenuC4984l menuC4984l = this.yandex;
        C17858l c17858l = menuC4984l.f10187l;
        if (c17858l != null) {
            menuC4984l.subs();
            ArrayList arrayList = menuC4984l.f10200l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C17858l) arrayList.get(i)) == c17858l) {
                    this.loadAd = i;
                    return;
                }
            }
        }
        this.loadAd = -1;
    }
}
