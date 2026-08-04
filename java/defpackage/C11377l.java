package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11377l extends BaseAdapter {
    public final /* synthetic */ C14422l loadAd;
    public int yandex = -1;

    public C11377l(C14422l c14422l) {
        this.loadAd = c14422l;
        yandex();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C14422l c14422l = this.loadAd;
        MenuC4984l menuC4984l = c14422l.f28232l;
        menuC4984l.subs();
        int size = menuC4984l.f10200l.size();
        c14422l.getClass();
        return this.yandex < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.loadAd.f28233l.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC5612l) view).yandex(getItem(i));
        return view;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C17858l getItem(int i) {
        C14422l c14422l = this.loadAd;
        MenuC4984l menuC4984l = c14422l.f28232l;
        menuC4984l.subs();
        ArrayList arrayList = menuC4984l.f10200l;
        c14422l.getClass();
        int i2 = this.yandex;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C17858l) arrayList.get(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        yandex();
        super.notifyDataSetChanged();
    }

    public final void yandex() {
        MenuC4984l menuC4984l = this.loadAd.f28232l;
        C17858l c17858l = menuC4984l.f10187l;
        if (c17858l != null) {
            menuC4984l.subs();
            ArrayList arrayList = menuC4984l.f10200l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C17858l) arrayList.get(i)) == c17858l) {
                    this.yandex = i;
                    return;
                }
            }
        }
        this.yandex = -1;
    }
}
