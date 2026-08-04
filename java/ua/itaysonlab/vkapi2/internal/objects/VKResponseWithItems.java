package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKResponseWithItems;", "T", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class VKResponseWithItems<T> {
    public final List amazon;
    public final List crashlytics;
    public final Integer loadAd;
    public final String purchase;
    public final Object yandex;

    public /* synthetic */ VKResponseWithItems(Object obj, Integer num, List list, List list2, String str, int i) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKResponseWithItems)) {
            return false;
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        return AbstractC8576l.yandex(this.yandex, vKResponseWithItems.yandex) && AbstractC8576l.yandex(this.loadAd, vKResponseWithItems.loadAd) && AbstractC8576l.yandex(this.crashlytics, vKResponseWithItems.crashlytics) && AbstractC8576l.yandex(this.amazon, vKResponseWithItems.amazon) && AbstractC8576l.yandex(this.purchase, vKResponseWithItems.purchase);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.loadAd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.amazon;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.purchase;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKResponseWithItems(items=");
        sb.append(this.yandex);
        sb.append(", count=");
        sb.append(this.loadAd);
        sb.append(", profiles=");
        sb.append(this.crashlytics);
        sb.append(", groups=");
        sb.append(this.amazon);
        sb.append(", next_from=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }

    public VKResponseWithItems(Object obj, Integer num, List list, List list2, String str) {
        this.yandex = obj;
        this.loadAd = num;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = str;
    }
}
