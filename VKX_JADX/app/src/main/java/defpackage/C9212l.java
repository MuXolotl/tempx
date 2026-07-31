package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: lٌۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9212l {
    public final InterfaceC12918l admob;
    public final int amazon;
    public final Integer billing;
    public final InterfaceC17121l crashlytics;
    public final ExecutorC10608l loadAd;
    public final C8796l mopub;
    public final Map purchase;
    public final ArrayList yandex;

    public C9212l(ArrayList arrayList, ExecutorC10608l executorC10608l, C15202l c15202l, int i, Map map, Integer num, C8796l c8796l, InterfaceC12918l interfaceC12918l) {
        this.yandex = arrayList;
        this.loadAd = executorC10608l;
        this.crashlytics = c15202l;
        this.amazon = i;
        this.purchase = map;
        this.billing = num;
        this.mopub = c8796l;
        this.admob = interfaceC12918l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9212l) {
            C9212l c9212l = (C9212l) obj;
            if (this.yandex.equals(c9212l.yandex) && this.loadAd == c9212l.loadAd && AbstractC8576l.yandex(this.crashlytics, c9212l.crashlytics) && this.amazon == c9212l.amazon && AbstractC8576l.yandex(this.purchase, c9212l.purchase) && this.billing.equals(c9212l.billing) && this.mopub == c9212l.mopub && AbstractC8576l.yandex(this.admob, c9212l.admob)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.mopub.hashCode() + ((this.billing.hashCode() + ((this.purchase.hashCode() + ((((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + ((this.yandex.hashCode() + 62) * 31)) * 31)) * 31) + this.amazon) * 31)) * 31)) * 31)) * 31;
        InterfaceC12918l interfaceC12918l = this.admob;
        return iHashCode + (interfaceC12918l == null ? 0 : interfaceC12918l.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.yandex + ", executor=" + this.loadAd + ", stateCallback=" + this.crashlytics + ", sessionTemplateId=" + this.amazon + ", sessionParameters=" + this.purchase + ", extensionMode=" + this.billing + ", extensionStateCallback=" + this.mopub + ", postviewOutputConfiguration=" + this.admob + ')';
    }
}
