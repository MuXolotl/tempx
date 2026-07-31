package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؙؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7104l {
    public final Executor amazon;
    public final int billing;
    public final ArrayList crashlytics;
    public final List loadAd;
    public final Map mopub;
    public final InterfaceC17121l purchase;
    public final int yandex;

    public C7104l(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, C15202l c15202l, int i2, Map map) {
        this.yandex = i;
        this.loadAd = arrayList;
        this.crashlytics = arrayList2;
        this.amazon = executor;
        this.purchase = c15202l;
        this.billing = i2;
        this.mopub = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7104l)) {
            return false;
        }
        C7104l c7104l = (C7104l) obj;
        return this.yandex == c7104l.yandex && AbstractC8576l.yandex(this.loadAd, c7104l.loadAd) && this.crashlytics.equals(c7104l.crashlytics) && AbstractC8576l.yandex(this.amazon, c7104l.amazon) && AbstractC8576l.yandex(this.purchase, c7104l.purchase) && this.billing == c7104l.billing && AbstractC8576l.yandex(this.mopub, c7104l.mopub);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        List list = this.loadAd;
        return (this.mopub.hashCode() + ((((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31) + this.billing) * 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.yandex + ", inputConfiguration=" + this.loadAd + ", outputConfigurations=" + this.crashlytics + ", executor=" + this.amazon + ", stateCallback=" + this.purchase + ", sessionTemplateId=" + this.billing + ", sessionParameters=" + this.mopub + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
