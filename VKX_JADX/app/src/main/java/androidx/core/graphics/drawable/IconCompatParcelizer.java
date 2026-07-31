package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC5223l;
import defpackage.C8339l;
import defpackage.C9890l;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC5223l abstractC5223l) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.yandex = -1;
        iconCompat.crashlytics = null;
        iconCompat.amazon = null;
        iconCompat.purchase = 0;
        iconCompat.billing = 0;
        iconCompat.mopub = null;
        iconCompat.admob = IconCompat.firebase;
        iconCompat.subs = null;
        iconCompat.yandex = abstractC5223l.billing(-1, 1);
        byte[] bArr = iconCompat.crashlytics;
        if (abstractC5223l.purchase(2)) {
            Parcel parcel = ((C9890l) abstractC5223l).purchase;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.crashlytics = bArr;
        iconCompat.amazon = abstractC5223l.mopub(iconCompat.amazon, 3);
        iconCompat.purchase = abstractC5223l.billing(iconCompat.purchase, 4);
        iconCompat.billing = abstractC5223l.billing(iconCompat.billing, 5);
        iconCompat.mopub = (ColorStateList) abstractC5223l.mopub(iconCompat.mopub, 6);
        String string = iconCompat.subs;
        if (abstractC5223l.purchase(7)) {
            string = ((C9890l) abstractC5223l).purchase.readString();
        }
        iconCompat.subs = string;
        String string2 = iconCompat.isPro;
        if (abstractC5223l.purchase(8)) {
            string2 = ((C9890l) abstractC5223l).purchase.readString();
        }
        iconCompat.isPro = string2;
        iconCompat.admob = PorterDuff.Mode.valueOf(iconCompat.subs);
        switch (iconCompat.yandex) {
            case -1:
                Parcelable parcelable = iconCompat.amazon;
                if (parcelable != null) {
                    iconCompat.loadAd = parcelable;
                    return iconCompat;
                }
                C8339l.metrica("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.amazon;
                if (parcelable2 != null) {
                    iconCompat.loadAd = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.crashlytics;
                iconCompat.loadAd = bArr3;
                iconCompat.yandex = 3;
                iconCompat.purchase = 0;
                iconCompat.billing = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.crashlytics, Charset.forName("UTF-16"));
                iconCompat.loadAd = str;
                if (iconCompat.yandex == 2 && iconCompat.isPro == null) {
                    iconCompat.isPro = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.loadAd = iconCompat.crashlytics;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        iconCompat.subs = iconCompat.admob.name();
        switch (iconCompat.yandex) {
            case -1:
                iconCompat.amazon = (Parcelable) iconCompat.loadAd;
                break;
            case 1:
            case 5:
                iconCompat.amazon = (Parcelable) iconCompat.loadAd;
                break;
            case 2:
                iconCompat.crashlytics = ((String) iconCompat.loadAd).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.crashlytics = (byte[]) iconCompat.loadAd;
                break;
            case 4:
            case 6:
                iconCompat.crashlytics = iconCompat.loadAd.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.yandex;
        if (-1 != i) {
            abstractC5223l.isPro(i, 1);
        }
        byte[] bArr = iconCompat.crashlytics;
        if (bArr != null) {
            abstractC5223l.subs(2);
            Parcel parcel = ((C9890l) abstractC5223l).purchase;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.amazon;
        if (parcelable != null) {
            abstractC5223l.firebase(parcelable, 3);
        }
        int i2 = iconCompat.purchase;
        if (i2 != 0) {
            abstractC5223l.isPro(i2, 4);
        }
        int i3 = iconCompat.billing;
        if (i3 != 0) {
            abstractC5223l.isPro(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.mopub;
        if (colorStateList != null) {
            abstractC5223l.firebase(colorStateList, 6);
        }
        String str = iconCompat.subs;
        if (str != null) {
            abstractC5223l.subs(7);
            ((C9890l) abstractC5223l).purchase.writeString(str);
        }
        String str2 = iconCompat.isPro;
        if (str2 != null) {
            abstractC5223l.subs(8);
            ((C9890l) abstractC5223l).purchase.writeString(str2);
        }
    }
}
