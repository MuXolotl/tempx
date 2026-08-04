package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10734l {
    public final boolean admob;
    public final C8195l amazon;
    public final Function0 billing;
    public final String crashlytics;
    public final String loadAd;
    public final int mopub;
    public final C12823l purchase;
    public final Integer yandex;

    public /* synthetic */ C10734l(Integer num, String str, String str2, C8195l c8195l, Function0 function0, int i) {
        this((i & 1) != 0 ? null : num, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : c8195l, null, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? R.drawable.ic_close : R.drawable.ic_edit_outline_28, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10734l)) {
            return false;
        }
        C10734l c10734l = (C10734l) obj;
        return AbstractC8576l.yandex(this.yandex, c10734l.yandex) && AbstractC8576l.yandex(this.loadAd, c10734l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c10734l.crashlytics) && AbstractC8576l.yandex(this.amazon, c10734l.amazon) && AbstractC8576l.yandex(this.purchase, c10734l.purchase) && AbstractC8576l.yandex(this.billing, c10734l.billing) && this.mopub == c10734l.mopub && this.admob == c10734l.admob;
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iAdvert = AbstractC12589l.advert((num == null ? 0 : num.hashCode()) * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        C8195l c8195l = this.amazon;
        int iHashCode2 = (iHashCode + (c8195l == null ? 0 : c8195l.hashCode())) * 31;
        C12823l c12823l = this.purchase;
        int iHashCode3 = (iHashCode2 + (c12823l == null ? 0 : c12823l.hashCode())) * 31;
        Function0 function0 = this.billing;
        return ((((iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31) + this.mopub) * 31) + (this.admob ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASContent(icon=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", subtitle=");
        sb.append(this.crashlytics);
        sb.append(", action=");
        sb.append(this.amazon);
        sb.append(", secondaryAction=");
        sb.append(this.purchase);
        sb.append(", actionOnClose=");
        sb.append(this.billing);
        sb.append(", actionIcon=");
        sb.append(this.mopub);
        sb.append(", neverHideAutomatically=");
        return AbstractC0653l.tapsense(sb, this.admob, ')');
    }

    public C10734l(Integer num, String str, String str2, C8195l c8195l, C12823l c12823l, Function0 function0, int i, boolean z) {
        this.yandex = num;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = c8195l;
        this.purchase = c12823l;
        this.billing = function0;
        this.mopub = i;
        this.admob = z;
    }
}
