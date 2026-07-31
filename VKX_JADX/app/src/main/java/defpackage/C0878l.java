package defpackage;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0878l extends C3497l {
    public C0878l(AbstractC2484l abstractC2484l, int i) {
        super(abstractC2484l, true, (i & 8) == 0, 96);
    }

    @Override // defpackage.C3497l, defpackage.AbstractC14412l
    public final void billing() {
        super.billing();
        C5447l c5447l = this.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        Menu menu = c5447l.getMenu();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                icon.setTint(AbstractC13209l.yandex(R.attr.reborn_title_color));
            }
        }
    }

    @Override // defpackage.C3497l, defpackage.InterfaceC9857l
    public final void yandex(float f) {
        super.yandex(f);
        C5447l c5447l = this.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        ActionMenuView cachedMenuView = c5447l.getCachedMenuView();
        if (cachedMenuView != null) {
            cachedMenuView.setAlpha(f);
        }
    }
}
