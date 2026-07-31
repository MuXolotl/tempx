package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lًُٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7931l {
    public final int admob;
    public final ArrayList amazon;
    public final int billing;
    public final List crashlytics;
    public final List firebase;
    public final Map isPro;
    public final List loadAd;
    public final C10379l metrica;
    public final Map mopub;
    public final C4069l purchase;
    public final Map remoteconfig;
    public final List smaato;
    public final int subs;
    public final C16295l vip;
    public final String yandex;

    public C7931l(String str, List list, List list2, ArrayList arrayList, C4069l c4069l, int i, LinkedHashMap linkedHashMap, int i2, C17963l c17963l, List list3, List list4, C10379l c10379l) {
        C16295l c16295l = new C16295l();
        this.yandex = str;
        this.loadAd = list;
        this.crashlytics = list2;
        this.amazon = arrayList;
        this.purchase = c4069l;
        this.billing = i;
        this.mopub = linkedHashMap;
        this.admob = i2;
        this.subs = 1;
        this.isPro = c17963l;
        this.firebase = list3;
        this.smaato = list4;
        this.remoteconfig = C14054l.f27396l;
        this.vip = c16295l;
        this.metrica = c10379l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7931l)) {
            return false;
        }
        C7931l c7931l = (C7931l) obj;
        return AbstractC8576l.yandex(this.yandex, c7931l.yandex) && AbstractC8576l.yandex(this.loadAd, c7931l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c7931l.crashlytics) && AbstractC8576l.yandex(this.amazon, c7931l.amazon) && AbstractC8576l.yandex(this.purchase, c7931l.purchase) && this.billing == c7931l.billing && AbstractC8576l.yandex(this.mopub, c7931l.mopub) && this.admob == c7931l.admob && this.subs == c7931l.subs && AbstractC8576l.yandex(this.isPro, c7931l.isPro) && AbstractC8576l.yandex(this.firebase, c7931l.firebase) && AbstractC8576l.yandex(this.smaato, c7931l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c7931l.remoteconfig) && AbstractC8576l.yandex(this.vip, c7931l.vip) && AbstractC8576l.yandex(this.metrica, c7931l.metrica);
    }

    public final int hashCode() {
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
        ArrayList arrayList = this.amazon;
        int iHashCode = (iAdmob + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        C4069l c4069l = this.purchase;
        return (this.metrica.hashCode() + ((this.vip.yandex.hashCode() + ((this.remoteconfig.hashCode() + AbstractC14814l.admob(AbstractC14814l.admob((this.isPro.hashCode() + ((((((this.mopub.hashCode() + ((((iHashCode + (c4069l != null ? c4069l.hashCode() : 0)) * 31) + this.billing) * 31)) * 31) + this.admob) * 31) + this.subs) * 31)) * 31, 31, this.firebase), 31, this.smaato)) * 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) C10160l.loadAd(this.yandex)) + ", streams=" + this.loadAd + ", exclusiveStreamGroups=" + this.crashlytics + ", input=" + this.amazon + ", postviewStream=" + this.purchase + ", sessionTemplate=" + ((Object) C18221l.loadAd(this.billing)) + ", sessionParameters=" + this.mopub + ", sessionMode=" + ((Object) C10053l.admob(this.admob)) + ", defaultTemplate=" + ((Object) C18221l.loadAd(this.subs)) + ", defaultParameters=" + this.isPro + ", defaultListeners=" + this.firebase + ", graphStateListeners=" + this.smaato + ", requiredParameters=" + this.remoteconfig + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.vip + ", flags=" + this.metrica + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
