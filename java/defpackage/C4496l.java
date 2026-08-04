package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: lؖۤۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4496l {
    public final View amazon;
    public final C12182l crashlytics;
    public final C12182l loadAd;
    public final C17644l yandex;

    public C4496l(C17644l c17644l, C12182l c12182l, C12182l c12182l2, View view) {
        this.yandex = c17644l;
        this.loadAd = c12182l;
        this.crashlytics = c12182l2;
        this.amazon = view;
    }

    public final boolean yandex(Menu menu) {
        int i;
        C2863l c2863l = (C2863l) this.loadAd.invoke();
        int i2 = 0;
        if (AbstractC8576l.yandex(c2863l, null)) {
            return false;
        }
        menu.clear();
        List list = c2863l.yandex;
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC1680l abstractC1680l = (AbstractC1680l) list.get(i5);
            if (abstractC1680l instanceof C5249l) {
                int i6 = i3 + 1;
                Object obj = abstractC1680l.yandex;
                if (AbstractC8576l.yandex(obj, AbstractC0135l.yandex)) {
                    i = R.id.cut;
                } else if (AbstractC8576l.yandex(obj, AbstractC0135l.loadAd)) {
                    i = R.id.copy;
                } else if (AbstractC8576l.yandex(obj, AbstractC0135l.crashlytics)) {
                    i = R.id.paste;
                } else if (AbstractC8576l.yandex(obj, AbstractC0135l.amazon)) {
                    i = R.id.selectAll;
                } else {
                    i = AbstractC8576l.yandex(obj, AbstractC0135l.purchase) ? R.id.autofill : i3;
                }
                C5249l c5249l = (C5249l) abstractC1680l;
                MenuItem menuItemAdd = menu.add(i4, i, i3, c5249l.loadAd);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC3470l(c5249l, this, i2));
                i3 = i6;
            } else if (abstractC1680l instanceof C8765l) {
                if (Build.VERSION.SDK_INT >= 28) {
                    C8765l c8765l = (C8765l) abstractC1680l;
                    AbstractC13950l.amazon(menu, i3, this.amazon.getContext(), c8765l.loadAd, c8765l.crashlytics, c8765l.amazon);
                    i3++;
                }
            } else if (abstractC1680l instanceof C2731l) {
                i4++;
            }
        }
        return true;
    }
}
