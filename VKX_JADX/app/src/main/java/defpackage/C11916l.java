package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lِ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11916l {
    public static final String billing;
    public static final String mopub;
    public final C5978l[] amazon;
    public final int crashlytics;
    public final String loadAd;
    public int purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        billing = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
    }

    public C11916l(String str, C5978l... c5978lArr) {
        AbstractC12442l.admob(c5978lArr.length > 0);
        this.loadAd = str;
        this.amazon = c5978lArr;
        this.yandex = c5978lArr.length;
        String str2 = c5978lArr[0].metrica;
        this.crashlytics = TextUtils.isEmpty(str2) ? AbstractC3825l.admob(c5978lArr[0].vip) : AbstractC3825l.admob(str2);
        String str3 = c5978lArr[0].amazon;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = c5978lArr[0].billing | 16384;
        for (int i2 = 1; i2 < c5978lArr.length; i2++) {
            String str4 = c5978lArr[i2].amazon;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                crashlytics(i2, "languages", c5978lArr[0].amazon, c5978lArr[i2].amazon);
                return;
            } else {
                if (i != (c5978lArr[i2].billing | 16384)) {
                    crashlytics(i2, "role flags", Integer.toBinaryString(c5978lArr[0].billing), Integer.toBinaryString(c5978lArr[i2].billing));
                    return;
                }
            }
        }
    }

    public static void crashlytics(int i, String str, String str2, String str3) {
        StringBuilder sbLicense = AbstractC14814l.license("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbLicense.append(str3);
        sbLicense.append("' (track ");
        sbLicense.append(i);
        sbLicense.append(")");
        AbstractC6427l.subs("TrackGroup", "", new IllegalStateException(sbLicense.toString()));
    }

    public static C11916l yandex(Bundle bundle) {
        C13708l c13708lPurchase;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(billing);
        if (parcelableArrayList == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            c13708lPurchase = C13708l.f26763l;
        } else {
            c13708lPurchase = AbstractC3483l.purchase(new C2922l(18), parcelableArrayList);
        }
        return new C11916l(bundle.getString(mopub, ""), (C5978l[]) c13708lPurchase.toArray(new C5978l[0]));
    }

    public final Bundle amazon() {
        Bundle bundle = new Bundle();
        C5978l[] c5978lArr = this.amazon;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c5978lArr.length);
        for (C5978l c5978l : c5978lArr) {
            List list = c5978l.ads;
            Bundle bundle2 = new Bundle();
            bundle2.putString(C5978l.f12609switch, c5978l.yandex);
            bundle2.putString(C5978l.f12581continue, c5978l.loadAd);
            String str = C5978l.f12595l;
            AbstractC1186l<C3857l> abstractC1186l = c5978l.crashlytics;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(abstractC1186l.size());
            for (C3857l c3857l : abstractC1186l) {
                c3857l.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = c3857l.yandex;
                if (str2 != null) {
                    bundle3.putString(C3857l.crashlytics, str2);
                }
                bundle3.putString(C3857l.amazon, c3857l.loadAd);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(C5978l.f12579class, c5978l.amazon);
            bundle2.putInt(C5978l.f12589interface, c5978l.purchase);
            bundle2.putInt(C5978l.f12607static, c5978l.billing);
            int i = c5978l.mopub;
            if (i != C5978l.f12578case.mopub) {
                bundle2.putInt(C5978l.f12596l, i);
            }
            bundle2.putInt(C5978l.f12582default, c5978l.admob);
            bundle2.putInt(C5978l.f12583final, c5978l.subs);
            bundle2.putString(C5978l.f12603new, c5978l.firebase);
            String str3 = c5978l.remoteconfig;
            if (str3 != null) {
                bundle2.putString(C5978l.f12598l, str3);
            }
            bundle2.putString(C5978l.f12585goto, c5978l.vip);
            bundle2.putString(C5978l.f12608super, c5978l.metrica);
            bundle2.putInt(C5978l.f12587import, c5978l.startapp);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(C5978l.f12576abstract + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(C5978l.f12588instanceof, c5978l.subscription);
            bundle2.putLong(C5978l.f12605public, c5978l.tapsense);
            bundle2.putInt(C5978l.f12584finally, c5978l.license);
            bundle2.putInt(C5978l.f12610this, c5978l.pro);
            bundle2.putInt(C5978l.f12591l, c5978l.ad);
            bundle2.putInt(C5978l.f12597l, c5978l.advert);
            bundle2.putFloat(C5978l.f12612try, c5978l.isVip);
            bundle2.putInt(C5978l.f12577break, c5978l.signatures);
            bundle2.putFloat(C5978l.f12611transient, c5978l.premium);
            bundle2.putByteArray(C5978l.f12604protected, c5978l.applovin);
            bundle2.putInt(C5978l.f12613while, c5978l.appmetrica);
            C1591l c1591l = c5978l.inmobi;
            if (c1591l != null) {
                String str4 = C5978l.f12586implements;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(C1591l.subs, c1591l.yandex);
                bundle4.putInt(C1591l.isPro, c1591l.loadAd);
                bundle4.putInt(C1591l.firebase, c1591l.crashlytics);
                bundle4.putByteArray(C1591l.smaato, c1591l.amazon);
                bundle4.putInt(C1591l.remoteconfig, c1591l.purchase);
                bundle4.putInt(C1591l.vip, c1591l.billing);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(C5978l.f12590l, c5978l.f12624throws);
            bundle2.putInt(C5978l.f12580const, c5978l.f12619package);
            bundle2.putInt(C5978l.f12606return, c5978l.f12622synchronized);
            bundle2.putInt(C5978l.f12602l, c5978l.f12621strictfp);
            bundle2.putInt(C5978l.f12594l, c5978l.f12625volatile);
            bundle2.putInt(C5978l.f12601l, c5978l.f12618native);
            bundle2.putInt(C5978l.f12599l, c5978l.f12620private);
            bundle2.putInt(C5978l.f12592l, c5978l.f12617for);
            bundle2.putInt(C5978l.f12600l, c5978l.f12623throw);
            bundle2.putInt(C5978l.f12593l, c5978l.f12614catch);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(billing, arrayList);
        bundle.putString(mopub, this.loadAd);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11916l.class == obj.getClass()) {
            C11916l c11916l = (C11916l) obj;
            if (this.loadAd.equals(c11916l.loadAd) && Arrays.equals(this.amazon, c11916l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.purchase == 0) {
            this.purchase = Arrays.hashCode(this.amazon) + AbstractC12589l.advert(527, 31, this.loadAd);
        }
        return this.purchase;
    }

    public final int loadAd(C5978l c5978l) {
        int i = 0;
        while (true) {
            C5978l[] c5978lArr = this.amazon;
            if (i >= c5978lArr.length) {
                return -1;
            }
            if (c5978l == c5978lArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final String toString() {
        return this.loadAd + ": " + Arrays.toString(this.amazon);
    }
}
