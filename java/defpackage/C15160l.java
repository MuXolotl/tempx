package defpackage;

import android.app.PendingIntent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lْٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15160l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15160l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00d0. Please report as an issue. */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zAdcel;
        double dSubscription = 0.0d;
        boolean zAdcel2 = true;
        int iSignature = 0;
        int iSignature2 = 0;
        int iSignature3 = 0;
        int iSignature4 = 0;
        boolean zAdcel3 = false;
        int iSignature5 = 0;
        int iSignature6 = 0;
        int iSignature7 = 0;
        String strIsPro = null;
        String strIsPro2 = null;
        C5586l c5586l = null;
        Bundle bundleCrashlytics = null;
        String strIsPro3 = null;
        String[] strArrFirebase = null;
        String strIsPro4 = null;
        String strIsPro5 = null;
        byte[] bArrAmazon = null;
        String strIsPro6 = null;
        C5040l c5040l = null;
        String strIsPro7 = null;
        byte[] bArrAmazon2 = null;
        String strIsPro8 = null;
        switch (this.yandex) {
            case 0:
                int iIsVip = AbstractC10114l.isVip(parcel);
                int iSignature8 = 0;
                int iSignature9 = 0;
                PendingIntent pendingIntent = null;
                String strIsPro9 = null;
                Integer numLicense = null;
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iSignature8 = AbstractC10114l.Signature(parcel, i);
                    } else if (c == 2) {
                        iSignature9 = AbstractC10114l.Signature(parcel, i);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) AbstractC10114l.subs(parcel, i, PendingIntent.CREATOR);
                    } else if (c == 4) {
                        strIsPro9 = AbstractC10114l.isPro(parcel, i);
                    } else if (c != 5) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        numLicense = AbstractC10114l.license(parcel, i);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C10602l(iSignature8, iSignature9, pendingIntent, strIsPro9, numLicense);
            case 1:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                String strIsPro10 = null;
                String strIsPro11 = null;
                while (parcel.dataPosition() < iIsVip2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        iSignature = AbstractC10114l.Signature(parcel, i2);
                    } else if (c2 == 3) {
                        strIsPro = AbstractC10114l.isPro(parcel, i2);
                    } else if (c2 == 4) {
                        strIsPro10 = AbstractC10114l.isPro(parcel, i2);
                    } else if (c2 != 5) {
                        AbstractC10114l.advert(parcel, i2);
                    } else {
                        strIsPro11 = AbstractC10114l.isPro(parcel, i2);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                C17118l c17118l = new C17118l();
                c17118l.f33296l = iSignature;
                c17118l.f33295l = strIsPro;
                c17118l.f33294l = strIsPro10;
                c17118l.f33297l = strIsPro11;
                return c17118l;
            case 2:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                double dSubscription2 = 0.0d;
                while (parcel.dataPosition() < iIsVip3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        dSubscription = AbstractC10114l.subscription(parcel, i3);
                    } else if (c3 != 3) {
                        AbstractC10114l.advert(parcel, i3);
                    } else {
                        dSubscription2 = AbstractC10114l.subscription(parcel, i3);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                C2560l c2560l = new C2560l();
                c2560l.f5568l = dSubscription;
                c2560l.f5567l = dSubscription2;
                return c2560l;
            case 3:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                int iSignature10 = 0;
                int iSignature11 = 0;
                boolean zAdcel4 = false;
                while (parcel.dataPosition() < iIsVip4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iSignature7 = AbstractC10114l.Signature(parcel, i4);
                    } else if (c4 == 2) {
                        iSignature10 = AbstractC10114l.Signature(parcel, i4);
                    } else if (c4 == 3) {
                        iSignature11 = AbstractC10114l.Signature(parcel, i4);
                    } else if (c4 != 4) {
                        AbstractC10114l.advert(parcel, i4);
                    } else {
                        zAdcel4 = AbstractC10114l.adcel(parcel, i4);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                C2243l c2243l = new C2243l();
                c2243l.f4926l = iSignature7;
                c2243l.f4925l = iSignature10;
                c2243l.f4924l = iSignature11;
                c2243l.f4927l = zAdcel4;
                return c2243l;
            case 4:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                int iSignature12 = 0;
                boolean zAdcel5 = false;
                boolean zAdcel6 = false;
                boolean zAdcel7 = false;
                boolean zAdcel8 = false;
                String strIsPro12 = null;
                String strIsPro13 = null;
                String strIsPro14 = null;
                String strIsPro15 = null;
                String strIsPro16 = null;
                while (parcel.dataPosition() < iIsVip5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            iSignature12 = AbstractC10114l.Signature(parcel, i5);
                            break;
                        case 3:
                            zAdcel5 = AbstractC10114l.adcel(parcel, i5);
                            break;
                        case 4:
                            zAdcel6 = AbstractC10114l.adcel(parcel, i5);
                            break;
                        case 5:
                            strIsPro12 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 6:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 7:
                            strIsPro14 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case '\b':
                            strIsPro15 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case '\t':
                            strIsPro16 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case '\n':
                            zAdcel7 = AbstractC10114l.adcel(parcel, i5);
                            break;
                        case 11:
                            zAdcel8 = AbstractC10114l.adcel(parcel, i5);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i5);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new C7851l(iSignature12, zAdcel5, zAdcel6, strIsPro12, strIsPro13, strIsPro14, strIsPro15, strIsPro16, zAdcel7, zAdcel8);
            case 5:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                String strIsPro17 = null;
                String strIsPro18 = null;
                String strIsPro19 = null;
                String strIsPro20 = null;
                String strIsPro21 = null;
                String strIsPro22 = null;
                while (parcel.dataPosition() < iIsVip6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strIsPro8 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 3:
                            strIsPro17 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 4:
                            strIsPro18 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 5:
                            strIsPro19 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 6:
                            strIsPro20 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 7:
                            strIsPro21 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case '\b':
                            strIsPro22 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i6);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                C3382l c3382l = new C3382l();
                c3382l.f7210l = strIsPro8;
                c3382l.f7209l = strIsPro17;
                c3382l.f7207l = strIsPro18;
                c3382l.f7212l = strIsPro19;
                c3382l.f7211l = strIsPro20;
                c3382l.f7213l = strIsPro21;
                c3382l.f7208l = strIsPro22;
                return c3382l;
            case 6:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                int iSignature13 = 0;
                while (parcel.dataPosition() < iIsVip7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        bArrAmazon2 = AbstractC10114l.amazon(parcel, i7);
                    } else if (c5 == 2) {
                        iSignature6 = AbstractC10114l.Signature(parcel, i7);
                    } else if (c5 != 3) {
                        AbstractC10114l.advert(parcel, i7);
                    } else {
                        iSignature13 = AbstractC10114l.Signature(parcel, i7);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                C7700l c7700l = new C7700l();
                c7700l.f16172l = bArrAmazon2;
                c7700l.f16171l = iSignature6;
                c7700l.f16170l = iSignature13;
                return c7700l;
            case 7:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        iSignature5 = AbstractC10114l.Signature(parcel, i8);
                    } else if (c6 != 3) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        strIsPro7 = AbstractC10114l.isPro(parcel, i8);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                C8992l c8992l = new C8992l();
                c8992l.f18538l = iSignature5;
                c8992l.f18537l = strIsPro7;
                return c8992l;
            case 8:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                double dSubscription3 = 0.0d;
                int iSignature14 = 0;
                int iSignature15 = 0;
                C10121l c10121l = null;
                while (parcel.dataPosition() < iIsVip9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            dSubscription = AbstractC10114l.subscription(parcel, i9);
                            break;
                        case 3:
                            zAdcel3 = AbstractC10114l.adcel(parcel, i9);
                            break;
                        case 4:
                            iSignature14 = AbstractC10114l.Signature(parcel, i9);
                            break;
                        case 5:
                            c5040l = (C5040l) AbstractC10114l.subs(parcel, i9, C5040l.CREATOR);
                            break;
                        case 6:
                            iSignature15 = AbstractC10114l.Signature(parcel, i9);
                            break;
                        case 7:
                            c10121l = (C10121l) AbstractC10114l.subs(parcel, i9, C10121l.CREATOR);
                            break;
                        case '\b':
                            dSubscription3 = AbstractC10114l.subscription(parcel, i9);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i9);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                C3882l c3882l = new C3882l();
                c3882l.f8017l = dSubscription;
                c3882l.f8016l = zAdcel3;
                c3882l.f8014l = iSignature14;
                c3882l.f8019l = c5040l;
                c3882l.f8018l = iSignature15;
                c3882l.f8020l = c10121l;
                c3882l.f8015l = dSubscription3;
                return c3882l;
            case 9:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                String strIsPro23 = null;
                while (parcel.dataPosition() < iIsVip10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 2) {
                        strIsPro6 = AbstractC10114l.isPro(parcel, i10);
                    } else if (c7 != 3) {
                        AbstractC10114l.advert(parcel, i10);
                    } else {
                        strIsPro23 = AbstractC10114l.isPro(parcel, i10);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                C0050l c0050l = new C0050l();
                c0050l.f932l = strIsPro6;
                c0050l.f931l = strIsPro23;
                return c0050l;
            case 10:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                byte[] bArrAmazon3 = null;
                byte[] bArrAmazon4 = null;
                byte[] bArrAmazon5 = null;
                while (parcel.dataPosition() < iIsVip11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        bArrAmazon = AbstractC10114l.amazon(parcel, i11);
                    } else if (c8 == 2) {
                        bArrAmazon3 = AbstractC10114l.amazon(parcel, i11);
                    } else if (c8 == 3) {
                        bArrAmazon4 = AbstractC10114l.amazon(parcel, i11);
                    } else if (c8 != 4) {
                        AbstractC10114l.advert(parcel, i11);
                    } else {
                        bArrAmazon5 = AbstractC10114l.amazon(parcel, i11);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                return new C8142l(bArrAmazon, bArrAmazon3, bArrAmazon4, bArrAmazon5);
            case 11:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                String strIsPro24 = null;
                while (parcel.dataPosition() < iIsVip12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        strIsPro5 = AbstractC10114l.isPro(parcel, i12);
                    } else if (c9 != 3) {
                        AbstractC10114l.advert(parcel, i12);
                    } else {
                        strIsPro24 = AbstractC10114l.isPro(parcel, i12);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                C7245l c7245l = new C7245l();
                c7245l.f15071l = strIsPro5;
                c7245l.f15070l = strIsPro24;
                return c7245l;
            case 12:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                int iSignature16 = 0;
                boolean zAdcel9 = false;
                boolean zAdcel10 = false;
                int iSignature17 = 0;
                int iSignature18 = 0;
                while (parcel.dataPosition() < iIsVip13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iSignature16 = AbstractC10114l.Signature(parcel, i13);
                    } else if (c10 == 2) {
                        zAdcel9 = AbstractC10114l.adcel(parcel, i13);
                    } else if (c10 == 3) {
                        zAdcel10 = AbstractC10114l.adcel(parcel, i13);
                    } else if (c10 == 4) {
                        iSignature17 = AbstractC10114l.Signature(parcel, i13);
                    } else if (c10 != 5) {
                        AbstractC10114l.advert(parcel, i13);
                    } else {
                        iSignature18 = AbstractC10114l.Signature(parcel, i13);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                return new C11361l(iSignature16, zAdcel9, zAdcel10, iSignature17, iSignature18);
            case 13:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                String strIsPro25 = null;
                while (parcel.dataPosition() < iIsVip14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 2) {
                        strIsPro4 = AbstractC10114l.isPro(parcel, i14);
                    } else if (c11 == 3) {
                        strIsPro25 = AbstractC10114l.isPro(parcel, i14);
                    } else if (c11 != 4) {
                        AbstractC10114l.advert(parcel, i14);
                    } else {
                        iSignature4 = AbstractC10114l.Signature(parcel, i14);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                C3172l c3172l = new C3172l();
                c3172l.f6817l = strIsPro4;
                c3172l.f6816l = strIsPro25;
                c3172l.f6815l = iSignature4;
                return c3172l;
            case 14:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                long jPro = 0;
                long jPro2 = 0;
                int iSignature19 = 0;
                while (parcel.dataPosition() < iIsVip15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        jPro = AbstractC10114l.pro(parcel, i15);
                    } else if (c12 == 2) {
                        iSignature19 = AbstractC10114l.Signature(parcel, i15);
                    } else if (c12 != 3) {
                        AbstractC10114l.advert(parcel, i15);
                    } else {
                        jPro2 = AbstractC10114l.pro(parcel, i15);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                return new C17261l(iSignature19, jPro, jPro2);
            case 15:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                boolean zAdcel11 = false;
                while (parcel.dataPosition() < iIsVip16) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        iSignature3 = AbstractC10114l.Signature(parcel, i16);
                    } else if (c13 != 3) {
                        AbstractC10114l.advert(parcel, i16);
                    } else {
                        zAdcel11 = AbstractC10114l.adcel(parcel, i16);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                C15360l c15360l = new C15360l();
                c15360l.f30037l = iSignature3;
                c15360l.f30036l = zAdcel11;
                return c15360l;
            case 16:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                long jPro3 = 0;
                long jPro4 = 0;
                long jPro5 = 0;
                boolean zAdcel12 = false;
                String strIsPro26 = null;
                String strIsPro27 = null;
                C6899l c6899l = null;
                String strIsPro28 = null;
                C13236l c13236l = null;
                C13236l c13236l2 = null;
                C13236l c13236l3 = null;
                while (parcel.dataPosition() < iIsVip17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strIsPro26 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case 3:
                            strIsPro27 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case 4:
                            c6899l = (C6899l) AbstractC10114l.subs(parcel, i17, C6899l.CREATOR);
                            break;
                        case 5:
                            jPro3 = AbstractC10114l.pro(parcel, i17);
                            break;
                        case 6:
                            zAdcel12 = AbstractC10114l.adcel(parcel, i17);
                            break;
                        case 7:
                            strIsPro28 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case '\b':
                            c13236l = (C13236l) AbstractC10114l.subs(parcel, i17, C13236l.CREATOR);
                            break;
                        case '\t':
                            jPro4 = AbstractC10114l.pro(parcel, i17);
                            break;
                        case '\n':
                            c13236l2 = (C13236l) AbstractC10114l.subs(parcel, i17, C13236l.CREATOR);
                            break;
                        case 11:
                            jPro5 = AbstractC10114l.pro(parcel, i17);
                            break;
                        case '\f':
                            c13236l3 = (C13236l) AbstractC10114l.subs(parcel, i17, C13236l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i17);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip17);
                return new C17509l(strIsPro26, strIsPro27, c6899l, jPro3, zAdcel12, strIsPro28, c13236l, jPro4, c13236l2, jPro5, c13236l3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip18) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iSignature2 = AbstractC10114l.Signature(parcel, i18);
                    } else if (c14 != 2) {
                        AbstractC10114l.advert(parcel, i18);
                    } else {
                        strArrFirebase = AbstractC10114l.firebase(parcel, i18);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C18504l(iSignature2, strArrFirebase);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip19 = AbstractC10114l.isVip(parcel);
                String strIsPro29 = null;
                while (parcel.dataPosition() < iIsVip19) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        strIsPro3 = AbstractC10114l.isPro(parcel, i19);
                    } else if (c15 != 2) {
                        AbstractC10114l.advert(parcel, i19);
                    } else {
                        strIsPro29 = AbstractC10114l.isPro(parcel, i19);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip19);
                return new C6729l(strIsPro3, strIsPro29);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip20 = AbstractC10114l.isVip(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < iIsVip20) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 2) {
                        AbstractC10114l.signatures(parcel, i20, 4);
                        f = parcel.readFloat();
                    } else if (c16 == 3) {
                        AbstractC10114l.signatures(parcel, i20, 4);
                        f2 = parcel.readFloat();
                    } else if (c16 != 4) {
                        AbstractC10114l.advert(parcel, i20);
                    } else {
                        AbstractC10114l.signatures(parcel, i20, 4);
                        f3 = parcel.readFloat();
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip20);
                return new C5586l(f, f2, f3);
            case 20:
                int iIsVip21 = AbstractC10114l.isVip(parcel);
                long jPro6 = 0;
                int iSignature20 = 0;
                int iSignature21 = 0;
                int iSignature22 = 0;
                int iSignature23 = 0;
                while (parcel.dataPosition() < iIsVip21) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 2) {
                        iSignature20 = AbstractC10114l.Signature(parcel, i21);
                    } else if (c17 == 3) {
                        iSignature21 = AbstractC10114l.Signature(parcel, i21);
                    } else if (c17 == 4) {
                        iSignature22 = AbstractC10114l.Signature(parcel, i21);
                    } else if (c17 == 5) {
                        jPro6 = AbstractC10114l.pro(parcel, i21);
                    } else if (c17 != 6) {
                        AbstractC10114l.advert(parcel, i21);
                    } else {
                        iSignature23 = AbstractC10114l.Signature(parcel, i21);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip21);
                return new C14235l(iSignature20, iSignature21, iSignature22, iSignature23, jPro6);
            case 21:
                int iIsVip22 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip22) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        AbstractC10114l.advert(parcel, i22);
                    } else {
                        bundleCrashlytics = AbstractC10114l.crashlytics(parcel, i22);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip22);
                return new C15927l(bundleCrashlytics);
            case 22:
                int iIsVip23 = AbstractC10114l.isVip(parcel);
                C5586l c5586l2 = null;
                while (parcel.dataPosition() < iIsVip23) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 2) {
                        c5586l = (C5586l) AbstractC10114l.subs(parcel, i23, C5586l.CREATOR);
                    } else if (c18 != 3) {
                        AbstractC10114l.advert(parcel, i23);
                    } else {
                        c5586l2 = (C5586l) AbstractC10114l.subs(parcel, i23, C5586l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip23);
                return new C10121l(c5586l, c5586l2);
            case 23:
                int iIsVip24 = AbstractC10114l.isVip(parcel);
                int iSignature24 = 0;
                IBinder iBinderTapsense = null;
                IBinder iBinderTapsense2 = null;
                String strIsPro30 = null;
                byte[] bArrAmazon6 = null;
                IBinder iBinderTapsense3 = null;
                C9369l c9369l = null;
                C8495l c8495l = null;
                while (parcel.dataPosition() < iIsVip24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iBinderTapsense = AbstractC10114l.tapsense(parcel, i24);
                            break;
                        case 2:
                            iBinderTapsense2 = AbstractC10114l.tapsense(parcel, i24);
                            break;
                        case 3:
                            strIsPro30 = AbstractC10114l.isPro(parcel, i24);
                            break;
                        case 4:
                            bArrAmazon6 = AbstractC10114l.amazon(parcel, i24);
                            break;
                        case 5:
                            iBinderTapsense3 = AbstractC10114l.tapsense(parcel, i24);
                            break;
                        case 6:
                            iSignature24 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 7:
                            c9369l = (C9369l) AbstractC10114l.subs(parcel, i24, C9369l.CREATOR);
                            break;
                        case '\b':
                            c8495l = (C8495l) AbstractC10114l.subs(parcel, i24, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i24);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip24);
                return new C8745l(iBinderTapsense, iBinderTapsense2, strIsPro30, bArrAmazon6, iBinderTapsense3, iSignature24, c9369l, c8495l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip25 = AbstractC10114l.isVip(parcel);
                int iSignature25 = 0;
                int iSignature26 = 0;
                String strIsPro31 = null;
                String strIsPro32 = null;
                byte[] bArrAmazon7 = null;
                Point[] pointArr = null;
                C13115l c13115l = null;
                C9652l c9652l = null;
                C11703l c11703l = null;
                C0008l c0008l = null;
                C12330l c12330l = null;
                C17247l c17247l = null;
                C16051l c16051l = null;
                C15996l c15996l = null;
                C8894l c8894l = null;
                while (parcel.dataPosition() < iIsVip25) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iSignature25 = AbstractC10114l.Signature(parcel, i25);
                            break;
                        case 2:
                            strIsPro31 = AbstractC10114l.isPro(parcel, i25);
                            break;
                        case 3:
                            strIsPro32 = AbstractC10114l.isPro(parcel, i25);
                            break;
                        case 4:
                            bArrAmazon7 = AbstractC10114l.amazon(parcel, i25);
                            break;
                        case 5:
                            pointArr = (Point[]) AbstractC10114l.remoteconfig(parcel, i25, Point.CREATOR);
                            break;
                        case 6:
                            iSignature26 = AbstractC10114l.Signature(parcel, i25);
                            break;
                        case 7:
                            c13115l = (C13115l) AbstractC10114l.subs(parcel, i25, C13115l.CREATOR);
                            break;
                        case '\b':
                            c9652l = (C9652l) AbstractC10114l.subs(parcel, i25, C9652l.CREATOR);
                            break;
                        case '\t':
                            c11703l = (C11703l) AbstractC10114l.subs(parcel, i25, C11703l.CREATOR);
                            break;
                        case '\n':
                            c0008l = (C0008l) AbstractC10114l.subs(parcel, i25, C0008l.CREATOR);
                            break;
                        case 11:
                            c12330l = (C12330l) AbstractC10114l.subs(parcel, i25, C12330l.CREATOR);
                            break;
                        case '\f':
                            c17247l = (C17247l) AbstractC10114l.subs(parcel, i25, C17247l.CREATOR);
                            break;
                        case '\r':
                            c16051l = (C16051l) AbstractC10114l.subs(parcel, i25, C16051l.CREATOR);
                            break;
                        case 14:
                            c15996l = (C15996l) AbstractC10114l.subs(parcel, i25, C15996l.CREATOR);
                            break;
                        case 15:
                            c8894l = (C8894l) AbstractC10114l.subs(parcel, i25, C8894l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i25);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip25);
                return new C5949l(iSignature25, strIsPro31, strIsPro32, bArrAmazon7, pointArr, iSignature26, c13115l, c9652l, c11703l, c0008l, c12330l, c17247l, c16051l, c15996l, c8894l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip26 = AbstractC10114l.isVip(parcel);
                long jPro7 = 0;
                long jPro8 = 0;
                boolean zAdcel13 = false;
                boolean zAdcel14 = false;
                boolean zAdcel15 = false;
                String strIsPro33 = null;
                String[] strArrFirebase2 = null;
                while (parcel.dataPosition() < iIsVip26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            jPro7 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case 3:
                            strIsPro33 = AbstractC10114l.isPro(parcel, i26);
                            break;
                        case 4:
                            jPro8 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case 5:
                            zAdcel13 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 6:
                            strArrFirebase2 = AbstractC10114l.firebase(parcel, i26);
                            break;
                        case 7:
                            zAdcel14 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\b':
                            zAdcel15 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i26);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip26);
                return new C15455l(jPro7, strIsPro33, jPro8, zAdcel13, strArrFirebase2, zAdcel14, zAdcel15);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip27 = AbstractC10114l.isVip(parcel);
                long jPro9 = 0;
                boolean z = true;
                boolean zAdcel16 = true;
                boolean zAdcel17 = true;
                boolean zAdcel18 = true;
                boolean zAdcel19 = true;
                boolean zAdcel20 = true;
                boolean zAdcel21 = true;
                boolean zAdcel22 = true;
                boolean zAdcel23 = true;
                boolean zAdcel24 = true;
                boolean zAdcel25 = true;
                boolean zAdcel26 = true;
                boolean zAdcel27 = false;
                boolean zAdcel28 = false;
                boolean zAdcel29 = false;
                boolean zAdcel30 = false;
                int iSignature27 = 0;
                int iSignature28 = 0;
                boolean zAdcel31 = false;
                boolean zAdcel32 = false;
                int iSignature29 = 0;
                int iSignature30 = 0;
                boolean zAdcel33 = false;
                byte[] bArrAmazon8 = null;
                C9701l c9701l = null;
                ParcelUuid parcelUuid = null;
                byte[] bArrAmazon9 = null;
                C7700l[] c7700lArr = null;
                int[] iArrBilling = null;
                int[] iArrBilling2 = null;
                byte[] bArrAmazon10 = null;
                boolean zAdcel34 = true;
                while (parcel.dataPosition() < iIsVip27) {
                    int i27 = parcel.readInt();
                    boolean z2 = zAdcel27;
                    switch ((char) i27) {
                        case 1:
                            c9701l = (C9701l) AbstractC10114l.subs(parcel, i27, C9701l.CREATOR);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 2:
                            zAdcel2 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 3:
                            zAdcel16 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 4:
                            zAdcel17 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 5:
                            zAdcel18 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 6:
                            bArrAmazon8 = AbstractC10114l.amazon(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 7:
                            zAdcel29 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case '\b':
                            parcelUuid = (ParcelUuid) AbstractC10114l.subs(parcel, i27, ParcelUuid.CREATOR);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case '\t':
                            zAdcel19 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case '\n':
                            zAdcel20 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case 11:
                            zAdcel34 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                        case '\f':
                            zAdcel28 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case '\r':
                            zAdcel27 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel = z;
                            break;
                        case 14:
                            zAdcel33 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 15:
                            iSignature30 = AbstractC10114l.Signature(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 16:
                            iSignature29 = AbstractC10114l.Signature(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            bArrAmazon9 = AbstractC10114l.amazon(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            jPro9 = AbstractC10114l.pro(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            c7700lArr = (C7700l[]) AbstractC10114l.remoteconfig(parcel, i27, C7700l.CREATOR);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 20:
                            zAdcel32 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 21:
                            zAdcel26 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 22:
                            zAdcel30 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 23:
                            zAdcel = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            iArrBilling = AbstractC10114l.billing(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            iArrBilling2 = AbstractC10114l.billing(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            zAdcel23 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            iSignature27 = AbstractC10114l.Signature(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            bArrAmazon10 = AbstractC10114l.amazon(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            zAdcel22 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 30:
                            iSignature28 = AbstractC10114l.Signature(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case 31:
                            zAdcel31 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case ' ':
                            zAdcel21 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            zAdcel24 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            zAdcel25 = AbstractC10114l.adcel(parcel, i27);
                            zAdcel27 = z2;
                            zAdcel = z;
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i27);
                            zAdcel = z;
                            zAdcel27 = z2;
                            break;
                    }
                    z = zAdcel;
                }
                AbstractC10114l.metrica(parcel, iIsVip27);
                C13469l c13469l = new C13469l();
                c13469l.f26420l = c9701l;
                c13469l.f26419l = zAdcel2;
                c13469l.f26412l = zAdcel16;
                c13469l.f26429l = zAdcel17;
                c13469l.f26428l = zAdcel18;
                c13469l.f26435l = bArrAmazon8;
                c13469l.f26413l = zAdcel29;
                c13469l.f26416l = parcelUuid;
                c13469l.f26434l = zAdcel19;
                c13469l.f26426l = zAdcel20;
                c13469l.f26436l = zAdcel34;
                c13469l.f26432l = zAdcel28;
                c13469l.f26411l = zAdcel27;
                c13469l.f26438l = zAdcel33;
                c13469l.f26427l = iSignature30;
                c13469l.f26417l = iSignature29;
                c13469l.f26422l = bArrAmazon9;
                c13469l.f26440l = jPro9;
                c13469l.f26421l = c7700lArr;
                c13469l.f26415l = zAdcel32;
                c13469l.f26414l = zAdcel26;
                c13469l.f26410l = zAdcel30;
                c13469l.f26441l = z;
                c13469l.f26418l = iArrBilling;
                c13469l.f26425l = iArrBilling2;
                c13469l.f26431l = zAdcel23;
                c13469l.f26409l = iSignature27;
                c13469l.f26424l = bArrAmazon10;
                c13469l.f26430l = zAdcel22;
                c13469l.f26439l = iSignature28;
                c13469l.f26423l = zAdcel31;
                c13469l.f26433l = zAdcel21;
                c13469l.f26408l = zAdcel24;
                c13469l.f26437l = zAdcel25;
                return c13469l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip28 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip28) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        AbstractC10114l.advert(parcel, i28);
                    } else {
                        strIsPro2 = AbstractC10114l.isPro(parcel, i28);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip28);
                return new C13853l(strIsPro2);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C1882l(parcel.readStrongBinder());
            default:
                int iIsVip29 = AbstractC10114l.isVip(parcel);
                long jPro10 = -1;
                int iSignature31 = 0;
                boolean zAdcel35 = false;
                String strIsPro34 = null;
                while (parcel.dataPosition() < iIsVip29) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        strIsPro34 = AbstractC10114l.isPro(parcel, i29);
                    } else if (c19 == 2) {
                        iSignature31 = AbstractC10114l.Signature(parcel, i29);
                    } else if (c19 == 3) {
                        jPro10 = AbstractC10114l.pro(parcel, i29);
                    } else if (c19 != 4) {
                        AbstractC10114l.advert(parcel, i29);
                    } else {
                        zAdcel35 = AbstractC10114l.adcel(parcel, i29);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip29);
                return new C9138l(iSignature31, jPro10, strIsPro34, zAdcel35);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C10602l[i];
            case 1:
                return new C17118l[i];
            case 2:
                return new C2560l[i];
            case 3:
                return new C2243l[i];
            case 4:
                return new C7851l[i];
            case 5:
                return new C3382l[i];
            case 6:
                return new C7700l[i];
            case 7:
                return new C8992l[i];
            case 8:
                return new C3882l[i];
            case 9:
                return new C0050l[i];
            case 10:
                return new C8142l[i];
            case 11:
                return new C7245l[i];
            case 12:
                return new C11361l[i];
            case 13:
                return new C3172l[i];
            case 14:
                return new C17261l[i];
            case 15:
                return new C15360l[i];
            case 16:
                return new C17509l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C18504l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C6729l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C5586l[i];
            case 20:
                return new C14235l[i];
            case 21:
                return new C15927l[i];
            case 22:
                return new C10121l[i];
            case 23:
                return new C8745l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C5949l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C15455l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13469l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13853l[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C1882l[i];
            default:
                return new C9138l[i];
        }
    }
}
