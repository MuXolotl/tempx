package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11722l {
    public final Header admob;
    public final CarText amazon;
    public final ActionStrip billing;
    public final ArrayList crashlytics;
    public final ItemList loadAd;
    public final ArrayList mopub;
    public final Action purchase;
    public final boolean yandex;

    public C11722l(ListTemplate listTemplate) {
        this.yandex = listTemplate.isLoading();
        this.purchase = listTemplate.getHeaderAction();
        this.amazon = listTemplate.getTitle();
        this.loadAd = listTemplate.getSingleList();
        this.crashlytics = new ArrayList(listTemplate.getSectionedLists());
        this.billing = listTemplate.getActionStrip();
        this.mopub = new ArrayList(listTemplate.getActions());
        this.admob = listTemplate.getHeader();
    }
}
