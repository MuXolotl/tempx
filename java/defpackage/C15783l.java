package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* JADX INFO: renamed from: lٕٚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15783l {
    public static final C15783l billing = new C15783l((Boolean) null, 100, (Boolean) null, (String) null);
    public final String amazon;
    public final Boolean crashlytics;
    public final String loadAd;
    public final EnumMap purchase;
    public final int yandex;

    public C15783l(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        this.purchase = enumMap;
        enumMap.put(EnumC3170l.AD_USER_DATA, bool == null ? EnumC17672l.UNINITIALIZED : bool.booleanValue() ? EnumC17672l.GRANTED : EnumC17672l.DENIED);
        this.yandex = i;
        this.loadAd = amazon();
        this.crashlytics = bool2;
        this.amazon = str;
    }

    public static C15783l crashlytics(int i, Bundle bundle) {
        if (bundle == null) {
            return new C15783l((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        for (EnumC3170l enumC3170l : EnumC2242l.DMA.f4923l) {
            enumMap.put(enumC3170l, C10559l.amazon(bundle.getString(enumC3170l.f6814l)));
        }
        return new C15783l(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C15783l loadAd(String str) {
        if (str == null || str.length() <= 0) {
            return billing;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC3170l.class);
        EnumC3170l[] enumC3170lArr = EnumC2242l.DMA.f4923l;
        int length = enumC3170lArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(enumC3170lArr[i3], C10559l.purchase(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C15783l(enumMap, i, (Boolean) null, (String) null);
    }

    public final String amazon() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        for (EnumC3170l enumC3170l : EnumC2242l.DMA.f4923l) {
            sb.append(":");
            sb.append(C10559l.admob((EnumC17672l) this.purchase.get(enumC3170l)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15783l)) {
            return false;
        }
        C15783l c15783l = (C15783l) obj;
        if (this.loadAd.equalsIgnoreCase(c15783l.loadAd) && Objects.equals(this.crashlytics, c15783l.crashlytics)) {
            return Objects.equals(this.amazon, c15783l.amazon);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.crashlytics;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.amazon;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.loadAd.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C10559l.yandex(this.yandex));
        for (EnumC3170l enumC3170l : EnumC2242l.DMA.f4923l) {
            sb.append(",");
            sb.append(enumC3170l.f6814l);
            sb.append("=");
            EnumC17672l enumC17672l = (EnumC17672l) this.purchase.get(enumC3170l);
            if (enumC17672l == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = enumC17672l.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.crashlytics;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.amazon;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final EnumC17672l yandex() {
        EnumC17672l enumC17672l = (EnumC17672l) this.purchase.get(EnumC3170l.AD_USER_DATA);
        return enumC17672l == null ? EnumC17672l.UNINITIALIZED : enumC17672l;
    }

    public C15783l(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC3170l.class);
        this.purchase = enumMap2;
        enumMap2.putAll(enumMap);
        this.yandex = i;
        this.loadAd = amazon();
        this.crashlytics = bool;
        this.amazon = str;
    }
}
