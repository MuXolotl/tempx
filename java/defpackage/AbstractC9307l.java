package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9307l {
    public static final C15578l yandex = new C15578l(2042924763, false, new C10721l(18));
    public static final C15578l loadAd = new C15578l(923990276, false, new C10721l(19));
    public static final C15578l crashlytics = new C15578l(-1078321053, false, new C10721l(20));
    public static final C15578l amazon = new C15578l(1214334914, false, new C10721l(21));

    public static void admob(C5507l c5507l, C7167l c7167l) {
        c7167l.billing(c5507l.yandex);
        c7167l.writeByte(10);
        c7167l.billing(c5507l.loadAd);
        c7167l.writeByte(10);
        c7167l.billing(c5507l.crashlytics);
        c7167l.writeByte(10);
        Set<Map.Entry> setEntrySet = c5507l.amazon.yandex.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        c7167l.billing(size);
        c7167l.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                c7167l.mo706finally((String) entry.getKey());
                c7167l.mo706finally(":");
                c7167l.mo706finally(str);
                c7167l.writeByte(10);
            }
        }
    }

    public static final C9302l amazon(View view) {
        C9302l c9302l = (C9302l) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c9302l != null) {
            return c9302l;
        }
        C9302l c9302l2 = new C9302l();
        view.setTag(R.id.pooling_container_listener_holder_tag, c9302l2);
        return c9302l2;
    }

    public static final int billing(long j, long j2) {
        return AbstractC8576l.isPro(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final void crashlytics(View view) {
        C11129l c11129lPurchase = AbstractC6900l.purchase(new C2057l(view, null, 4));
        while (c11129lPurchase.hasNext()) {
            ArrayList arrayList = amazon((View) c11129lPurchase.next()).yandex;
            for (int iSmaato = AbstractC14055l.smaato(arrayList); -1 < iSmaato; iSmaato--) {
                ((C9340l) arrayList.get(iSmaato)).yandex.purchase();
            }
        }
    }

    public static void loadAd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final double mopub(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static C5507l purchase(C1503l c1503l) throws EOFException {
        int i = Integer.parseInt(c1503l.mo724new(Long.MAX_VALUE));
        long j = Long.parseLong(c1503l.mo724new(Long.MAX_VALUE));
        long j2 = Long.parseLong(c1503l.mo724new(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(c1503l.mo724new(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strMo724new = c1503l.mo724new(Long.MAX_VALUE);
            int iM3321extends = AbstractC12024l.m3321extends(strMo724new, ':', 0, 6);
            if (iM3321extends == -1) {
                C10754l.metrica("Unexpected header: ".concat(strMo724new));
                return null;
            }
            String string = AbstractC12024l.m3330l(strMo724new.substring(0, iM3321extends)).toString();
            String strSubstring = strMo724new.substring(iM3321extends + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new C5507l(i, j, j2, new C6952l(AbstractC8676l.tapsense(linkedHashMap)), null, null);
    }

    public static Object yandex(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
