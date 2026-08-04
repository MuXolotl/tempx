package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘُۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5962l {
    public final InterfaceC5986l amazon;
    public final InterfaceC11285l crashlytics;
    public final int loadAd;
    public final CarText purchase;
    public final ArrayList yandex;

    public C5962l(ItemList itemList) {
        this.loadAd = itemList.getSelectedIndex();
        this.crashlytics = itemList.getOnSelectedDelegate();
        this.amazon = itemList.getOnItemVisibilityChangedDelegate();
        this.purchase = itemList.getNoItemsMessage();
        this.yandex = new ArrayList(itemList.getItems());
    }
}
