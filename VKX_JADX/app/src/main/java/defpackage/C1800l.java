package defpackage;

import android.graphics.Point;
import android.net.Network;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِؓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1800l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C1800l(int i) {
        this.yandex = i;
    }

    public static void yandex(C6899l c6899l, Parcel parcel) {
        int i = c6899l.f14442l;
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(i);
        AbstractC9968l.vip(parcel, 2, c6899l.f14441l);
        long j = c6899l.f14439l;
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = c6899l.f14444l;
        if (l != null) {
            AbstractC9968l.subscription(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        AbstractC9968l.vip(parcel, 6, c6899l.f14443l);
        AbstractC9968l.vip(parcel, 7, c6899l.f14445l);
        Double d = c6899l.f14440l;
        if (d != null) {
            AbstractC9968l.subscription(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double dSubscription = 0.0d;
        long jPro = 0;
        boolean zAdcel = true;
        int iSignature = 0;
        ArrayList arrayListVip = null;
        String strIsPro = null;
        String strIsPro2 = null;
        String strIsPro3 = null;
        String strIsPro4 = null;
        String strIsPro5 = null;
        String strIsPro6 = null;
        C3382l c3382l = null;
        String[] strArrFirebase = null;
        String strIsPro7 = null;
        String strIsPro8 = null;
        String strIsPro9 = null;
        String strIsPro10 = null;
        switch (this.yandex) {
            case 0:
                int iIsVip = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        arrayListVip = AbstractC10114l.vip(parcel, i, C8736l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C18090l(arrayListVip);
            case 1:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                int iSignature2 = 0;
                String strIsPro11 = null;
                byte[] bArrAmazon = null;
                byte[] bArrAmazon2 = null;
                byte[] bArrAmazon3 = null;
                while (parcel.dataPosition() < iIsVip2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        strIsPro11 = AbstractC10114l.isPro(parcel, i2);
                    } else if (c == 2) {
                        bArrAmazon = AbstractC10114l.amazon(parcel, i2);
                    } else if (c == 3) {
                        bArrAmazon2 = AbstractC10114l.amazon(parcel, i2);
                    } else if (c == 4) {
                        bArrAmazon3 = AbstractC10114l.amazon(parcel, i2);
                    } else if (c != 5) {
                        AbstractC10114l.advert(parcel, i2);
                    } else {
                        iSignature2 = AbstractC10114l.Signature(parcel, i2);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                return new C8495l(iSignature2, strIsPro11, bArrAmazon, bArrAmazon2, bArrAmazon3);
            case 2:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                long jPro2 = 0;
                int iSignature3 = 0;
                String strIsPro12 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strIsPro13 = null;
                String strIsPro14 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iIsVip3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iSignature3 = AbstractC10114l.Signature(parcel, i3);
                            break;
                        case 2:
                            strIsPro12 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case 3:
                            jPro2 = AbstractC10114l.pro(parcel, i3);
                            break;
                        case 4:
                            int iAd = AbstractC10114l.ad(parcel, i3);
                            if (iAd != 0) {
                                AbstractC10114l.premium(parcel, iAd, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 5:
                            int iAd2 = AbstractC10114l.ad(parcel, i3);
                            if (iAd2 != 0) {
                                AbstractC10114l.premium(parcel, iAd2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case 7:
                            strIsPro14 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case '\b':
                            int iAd3 = AbstractC10114l.ad(parcel, i3);
                            if (iAd3 != 0) {
                                AbstractC10114l.premium(parcel, iAd3, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i3);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                return new C6899l(iSignature3, strIsPro12, jPro2, lValueOf, fValueOf, strIsPro13, strIsPro14, dValueOf);
            case 3:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                String strIsPro15 = null;
                while (parcel.dataPosition() < iIsVip4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        strIsPro10 = AbstractC10114l.isPro(parcel, i4);
                    } else if (c2 == 3) {
                        iSignature = AbstractC10114l.Signature(parcel, i4);
                    } else if (c2 != 4) {
                        AbstractC10114l.advert(parcel, i4);
                    } else {
                        strIsPro15 = AbstractC10114l.isPro(parcel, i4);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                return new C16923l(strIsPro10, iSignature, strIsPro15);
            case 4:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                int iSignature4 = -1;
                int iSignature5 = 0;
                int iSignature6 = 0;
                int iSignature7 = 0;
                boolean zAdcel2 = false;
                String strIsPro16 = null;
                String strIsPro17 = null;
                String strIsPro18 = null;
                String strIsPro19 = null;
                String strIsPro20 = null;
                ArrayList arrayListVip2 = null;
                String strIsPro21 = null;
                String strIsPro22 = null;
                String strIsPro23 = null;
                byte[] bArrAmazon4 = null;
                String strIsPro24 = null;
                C7851l c7851l = null;
                Integer numLicense = null;
                Boolean boolAds = null;
                Network network = null;
                while (parcel.dataPosition() < iIsVip5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strIsPro16 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 3:
                            strIsPro17 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 4:
                            strIsPro18 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 5:
                            strIsPro19 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 6:
                            strIsPro20 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 7:
                            iSignature5 = AbstractC10114l.Signature(parcel, i5);
                            break;
                        case '\b':
                            arrayListVip2 = AbstractC10114l.vip(parcel, i5, C4259l.CREATOR);
                            break;
                        case '\t':
                            iSignature6 = AbstractC10114l.Signature(parcel, i5);
                            break;
                        case '\n':
                            iSignature4 = AbstractC10114l.Signature(parcel, i5);
                            break;
                        case 11:
                            strIsPro21 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case '\f':
                            strIsPro22 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case '\r':
                            iSignature7 = AbstractC10114l.Signature(parcel, i5);
                            break;
                        case 14:
                            strIsPro23 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case 15:
                            bArrAmazon4 = AbstractC10114l.amazon(parcel, i5);
                            break;
                        case 16:
                            strIsPro24 = AbstractC10114l.isPro(parcel, i5);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            zAdcel2 = AbstractC10114l.adcel(parcel, i5);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            c7851l = (C7851l) AbstractC10114l.subs(parcel, i5, C7851l.CREATOR);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            numLicense = AbstractC10114l.license(parcel, i5);
                            break;
                        case 20:
                            boolAds = AbstractC10114l.ads(parcel, i5);
                            break;
                        case 21:
                            network = (Network) AbstractC10114l.subs(parcel, i5, Network.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i5);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new CastDevice(strIsPro16, strIsPro17, strIsPro18, strIsPro19, strIsPro20, iSignature5, arrayListVip2, iSignature6, iSignature4, strIsPro21, strIsPro22, iSignature7, strIsPro23, bArrAmazon4, strIsPro24, zAdcel2, c7851l, numLicense, boolAds, network);
            case 5:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                String strIsPro25 = "";
                String strIsPro26 = strIsPro25;
                String strIsPro27 = strIsPro26;
                String strIsPro28 = strIsPro27;
                int iSignature8 = 100;
                long jPro3 = 0;
                long jPro4 = 0;
                long jPro5 = 0;
                long jPro6 = 0;
                long jPro7 = 0;
                long jPro8 = 0;
                long jPro9 = 0;
                long jPro10 = 0;
                long jPro11 = -2147483648L;
                boolean zAdcel3 = true;
                boolean zAdcel4 = true;
                boolean zAdcel5 = false;
                int iSignature9 = 0;
                boolean zAdcel6 = false;
                boolean zAdcel7 = false;
                int iSignature10 = 0;
                int iSignature11 = 0;
                String strIsPro29 = null;
                String strIsPro30 = null;
                String strIsPro31 = null;
                String strIsPro32 = null;
                String strIsPro33 = null;
                String strIsPro34 = null;
                Boolean boolAds2 = null;
                ArrayList arrayListSmaato = null;
                String strIsPro35 = null;
                String strIsPro36 = null;
                while (parcel.dataPosition() < iIsVip6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strIsPro29 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 3:
                            strIsPro30 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 4:
                            strIsPro31 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 5:
                            strIsPro32 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 6:
                            jPro3 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case 7:
                            jPro4 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case '\b':
                            strIsPro33 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case '\t':
                            zAdcel3 = AbstractC10114l.adcel(parcel, i6);
                            break;
                        case '\n':
                            zAdcel5 = AbstractC10114l.adcel(parcel, i6);
                            break;
                        case 11:
                            jPro11 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case '\f':
                            strIsPro34 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case '\r':
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        default:
                            AbstractC10114l.advert(parcel, i6);
                            break;
                        case 14:
                            jPro5 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case 15:
                            iSignature9 = AbstractC10114l.Signature(parcel, i6);
                            break;
                        case 16:
                            zAdcel4 = AbstractC10114l.adcel(parcel, i6);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            zAdcel6 = AbstractC10114l.adcel(parcel, i6);
                            break;
                        case 21:
                            boolAds2 = AbstractC10114l.ads(parcel, i6);
                            break;
                        case 22:
                            jPro6 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case 23:
                            arrayListSmaato = AbstractC10114l.smaato(parcel, i6);
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            strIsPro25 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            strIsPro26 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            strIsPro35 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            zAdcel7 = AbstractC10114l.adcel(parcel, i6);
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            jPro7 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case 30:
                            iSignature8 = AbstractC10114l.Signature(parcel, i6);
                            break;
                        case 31:
                            strIsPro27 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case ' ':
                            iSignature10 = AbstractC10114l.Signature(parcel, i6);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            jPro8 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            strIsPro36 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                            strIsPro28 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            jPro9 = AbstractC10114l.pro(parcel, i6);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            iSignature11 = AbstractC10114l.Signature(parcel, i6);
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            jPro10 = AbstractC10114l.pro(parcel, i6);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                return new C10462l(strIsPro29, strIsPro30, strIsPro31, strIsPro32, jPro3, jPro4, strIsPro33, zAdcel3, zAdcel5, jPro11, strIsPro34, jPro5, iSignature9, zAdcel4, zAdcel6, boolAds2, jPro6, arrayListSmaato, strIsPro25, strIsPro26, strIsPro35, zAdcel7, jPro7, iSignature8, strIsPro27, iSignature10, jPro8, strIsPro36, strIsPro28, jPro9, iSignature11, jPro10);
            case 6:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                long jPro12 = 0;
                int iSignature12 = 0;
                int iSignature13 = 0;
                int iSignature14 = 0;
                int iSignature15 = 0;
                int iSignature16 = 0;
                int iSignature17 = 0;
                int iSignature18 = 0;
                int iSignature19 = 0;
                int iSignature20 = 0;
                int iSignature21 = 0;
                int iSignature22 = 0;
                int iSignature23 = 0;
                int iSignature24 = 0;
                int iSignature25 = 0;
                int iSignature26 = 0;
                int iSignature27 = 0;
                int iSignature28 = 0;
                int iSignature29 = 0;
                int iSignature30 = 0;
                int iSignature31 = 0;
                int iSignature32 = 0;
                int iSignature33 = 0;
                int iSignature34 = 0;
                int iSignature35 = 0;
                int iSignature36 = 0;
                int iSignature37 = 0;
                int iSignature38 = 0;
                boolean zAdcel8 = false;
                boolean zAdcel9 = false;
                ArrayList arrayListSmaato2 = null;
                int[] iArrBilling = null;
                String strIsPro37 = null;
                IBinder iBinderTapsense = null;
                while (parcel.dataPosition() < iIsVip7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            arrayListSmaato2 = AbstractC10114l.smaato(parcel, i7);
                            break;
                        case 3:
                            iArrBilling = AbstractC10114l.billing(parcel, i7);
                            break;
                        case 4:
                            jPro12 = AbstractC10114l.pro(parcel, i7);
                            break;
                        case 5:
                            strIsPro37 = AbstractC10114l.isPro(parcel, i7);
                            break;
                        case 6:
                            iSignature12 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 7:
                            iSignature13 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\b':
                            iSignature14 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\t':
                            iSignature15 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\n':
                            iSignature16 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 11:
                            iSignature17 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\f':
                            iSignature18 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\r':
                            iSignature19 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 14:
                            iSignature20 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 15:
                            iSignature21 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 16:
                            iSignature22 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            iSignature23 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            iSignature24 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            iSignature25 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 20:
                            iSignature26 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 21:
                            iSignature27 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 22:
                            iSignature28 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 23:
                            iSignature29 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            iSignature30 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            iSignature31 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            iSignature32 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            iSignature33 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            iSignature34 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            iSignature35 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 30:
                            iSignature36 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 31:
                            iSignature37 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case ' ':
                            iSignature38 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            iBinderTapsense = AbstractC10114l.tapsense(parcel, i7);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            zAdcel8 = AbstractC10114l.adcel(parcel, i7);
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            zAdcel9 = AbstractC10114l.adcel(parcel, i7);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i7);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                return new C16657l(arrayListSmaato2, iArrBilling, jPro12, strIsPro37, iSignature12, iSignature13, iSignature14, iSignature15, iSignature16, iSignature17, iSignature18, iSignature19, iSignature20, iSignature21, iSignature22, iSignature23, iSignature24, iSignature25, iSignature26, iSignature27, iSignature28, iSignature29, iSignature30, iSignature31, iSignature32, iSignature33, iSignature34, iSignature35, iSignature36, iSignature37, iSignature38, iBinderTapsense, zAdcel8, zAdcel9);
            case 7:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                long jPro13 = -1;
                int iSignature39 = 0;
                int iSignature40 = 0;
                boolean zAdcel10 = false;
                String strIsPro38 = null;
                while (parcel.dataPosition() < iIsVip8) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        zAdcel10 = AbstractC10114l.adcel(parcel, i8);
                    } else if (c3 == 2) {
                        strIsPro38 = AbstractC10114l.isPro(parcel, i8);
                    } else if (c3 == 3) {
                        iSignature39 = AbstractC10114l.Signature(parcel, i8);
                    } else if (c3 == 4) {
                        iSignature40 = AbstractC10114l.Signature(parcel, i8);
                    } else if (c3 != 5) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        jPro13 = AbstractC10114l.pro(parcel, i8);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                return new C13438l(iSignature39, iSignature40, jPro13, strIsPro38, zAdcel10);
            case 8:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                int iSignature41 = 0;
                boolean zAdcel11 = false;
                String strIsPro39 = null;
                Point[] pointArr = null;
                C17118l c17118l = null;
                C8992l c8992l = null;
                C0050l c0050l = null;
                C3172l c3172l = null;
                byte[] bArrAmazon5 = null;
                C2560l c2560l = null;
                C7245l c7245l = null;
                C6174l c6174l = null;
                C13063l c13063l = null;
                C6580l c6580l = null;
                while (parcel.dataPosition() < iIsVip9) {
                    int i9 = parcel.readInt();
                    C3172l c3172l2 = c3172l;
                    switch ((char) i9) {
                        case 2:
                            iSignature = AbstractC10114l.Signature(parcel, i9);
                            break;
                        case 3:
                            strIsPro9 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 4:
                            strIsPro39 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 5:
                            iSignature41 = AbstractC10114l.Signature(parcel, i9);
                            break;
                        case 6:
                            pointArr = (Point[]) AbstractC10114l.remoteconfig(parcel, i9, Point.CREATOR);
                            break;
                        case 7:
                            c17118l = (C17118l) AbstractC10114l.subs(parcel, i9, C17118l.CREATOR);
                            break;
                        case '\b':
                            c8992l = (C8992l) AbstractC10114l.subs(parcel, i9, C8992l.CREATOR);
                            break;
                        case '\t':
                            c0050l = (C0050l) AbstractC10114l.subs(parcel, i9, C0050l.CREATOR);
                            break;
                        case '\n':
                            c3172l = (C3172l) AbstractC10114l.subs(parcel, i9, C3172l.CREATOR);
                            continue;
                        case 11:
                            c7245l = (C7245l) AbstractC10114l.subs(parcel, i9, C7245l.CREATOR);
                            break;
                        case '\f':
                            c2560l = (C2560l) AbstractC10114l.subs(parcel, i9, C2560l.CREATOR);
                            break;
                        case '\r':
                            c6174l = (C6174l) AbstractC10114l.subs(parcel, i9, C6174l.CREATOR);
                            break;
                        case 14:
                            c13063l = (C13063l) AbstractC10114l.subs(parcel, i9, C13063l.CREATOR);
                            break;
                        case 15:
                            c6580l = (C6580l) AbstractC10114l.subs(parcel, i9, C6580l.CREATOR);
                            break;
                        case 16:
                            bArrAmazon5 = AbstractC10114l.amazon(parcel, i9);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            zAdcel11 = AbstractC10114l.adcel(parcel, i9);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            dSubscription = AbstractC10114l.subscription(parcel, i9);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i9);
                            break;
                    }
                    c3172l = c3172l2;
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                C17468l c17468l = new C17468l();
                c17468l.f34027l = iSignature;
                c17468l.f34026l = strIsPro9;
                c17468l.f34030l = bArrAmazon5;
                c17468l.f34022l = strIsPro39;
                c17468l.f34032l = iSignature41;
                c17468l.f34031l = pointArr;
                c17468l.f34025l = zAdcel11;
                c17468l.f34028l = dSubscription;
                c17468l.f34035l = c17118l;
                c17468l.f34023l = c8992l;
                c17468l.f34024l = c0050l;
                c17468l.f34034l = c3172l;
                c17468l.f34029l = c7245l;
                c17468l.f34036l = c2560l;
                c17468l.f34033l = c6174l;
                c17468l.f34021l = c13063l;
                c17468l.f34037l = c6580l;
                return c17468l;
            case 9:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                long jPro14 = 0;
                boolean zAdcel12 = true;
                boolean zAdcel13 = true;
                boolean zAdcel14 = true;
                boolean zAdcel15 = true;
                boolean zAdcel16 = true;
                boolean zAdcel17 = true;
                boolean zAdcel18 = true;
                boolean zAdcel19 = false;
                boolean zAdcel20 = false;
                int iSignature42 = 0;
                boolean zAdcel21 = false;
                byte[] bArrAmazon6 = null;
                ParcelUuid parcelUuid = null;
                C9701l c9701l = null;
                int[] iArrBilling2 = null;
                boolean zAdcel22 = false;
                while (parcel.dataPosition() < iIsVip10) {
                    int i10 = parcel.readInt();
                    byte[] bArr = bArrAmazon6;
                    switch ((char) i10) {
                        case 1:
                            c9701l = (C9701l) AbstractC10114l.subs(parcel, i10, C9701l.CREATOR);
                            break;
                        case 2:
                            zAdcel22 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 3:
                            zAdcel = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 4:
                            zAdcel12 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 5:
                            zAdcel19 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 6:
                            parcelUuid = (ParcelUuid) AbstractC10114l.subs(parcel, i10, ParcelUuid.CREATOR);
                            break;
                        case 7:
                        default:
                            AbstractC10114l.advert(parcel, i10);
                            break;
                        case '\b':
                            zAdcel13 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case '\t':
                            zAdcel14 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case '\n':
                            zAdcel15 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 11:
                            zAdcel20 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case '\f':
                            iSignature42 = AbstractC10114l.Signature(parcel, i10);
                            break;
                        case '\r':
                            iSignature = AbstractC10114l.Signature(parcel, i10);
                            break;
                        case 14:
                            bArrAmazon6 = AbstractC10114l.amazon(parcel, i10);
                            continue;
                        case 15:
                            jPro14 = AbstractC10114l.pro(parcel, i10);
                            break;
                        case 16:
                            iArrBilling2 = AbstractC10114l.billing(parcel, i10);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            zAdcel18 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            zAdcel21 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            zAdcel17 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 20:
                            zAdcel16 = AbstractC10114l.adcel(parcel, i10);
                            break;
                    }
                    bArrAmazon6 = bArr;
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                C1041l c1041l = new C1041l();
                c1041l.f2892l = c9701l;
                c1041l.f2891l = zAdcel22;
                c1041l.f2887l = zAdcel;
                c1041l.f2898l = zAdcel12;
                c1041l.f2897l = zAdcel19;
                c1041l.f2901l = parcelUuid;
                c1041l.f2888l = zAdcel13;
                c1041l.f2889l = zAdcel14;
                c1041l.f2900l = zAdcel15;
                c1041l.f2895l = zAdcel20;
                c1041l.f2902l = iSignature42;
                c1041l.f2899l = iSignature;
                c1041l.f2886l = bArrAmazon6;
                c1041l.f2903l = jPro14;
                c1041l.f2896l = iArrBilling2;
                c1041l.f2890l = zAdcel18;
                c1041l.f2894l = zAdcel21;
                c1041l.f2904l = zAdcel17;
                c1041l.f2893l = zAdcel16;
                return c1041l;
            case 10:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                int iSignature43 = 0;
                int iSignature44 = 0;
                int iSignature45 = 0;
                int iSignature46 = 0;
                int iSignature47 = 0;
                boolean zAdcel23 = false;
                while (parcel.dataPosition() < iIsVip11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            iSignature = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case 3:
                            iSignature43 = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case 4:
                            iSignature44 = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case 5:
                            iSignature45 = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case 6:
                            iSignature46 = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case 7:
                            iSignature47 = AbstractC10114l.Signature(parcel, i11);
                            break;
                        case '\b':
                            zAdcel23 = AbstractC10114l.adcel(parcel, i11);
                            break;
                        case '\t':
                            strIsPro8 = AbstractC10114l.isPro(parcel, i11);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i11);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                C8175l c8175l = new C8175l();
                c8175l.f17072l = iSignature;
                c8175l.f17071l = iSignature43;
                c8175l.f17068l = iSignature44;
                c8175l.f17074l = iSignature45;
                c8175l.f17073l = iSignature46;
                c8175l.f17075l = iSignature47;
                c8175l.f17069l = zAdcel23;
                c8175l.f17070l = strIsPro8;
                return c8175l;
            case 11:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                String strIsPro40 = null;
                String strIsPro41 = null;
                String strIsPro42 = null;
                String strIsPro43 = null;
                C8175l c8175l2 = null;
                C8175l c8175l3 = null;
                while (parcel.dataPosition() < iIsVip12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strIsPro7 = AbstractC10114l.isPro(parcel, i12);
                            break;
                        case 3:
                            strIsPro40 = AbstractC10114l.isPro(parcel, i12);
                            break;
                        case 4:
                            strIsPro41 = AbstractC10114l.isPro(parcel, i12);
                            break;
                        case 5:
                            strIsPro42 = AbstractC10114l.isPro(parcel, i12);
                            break;
                        case 6:
                            strIsPro43 = AbstractC10114l.isPro(parcel, i12);
                            break;
                        case 7:
                            c8175l2 = (C8175l) AbstractC10114l.subs(parcel, i12, C8175l.CREATOR);
                            break;
                        case '\b':
                            c8175l3 = (C8175l) AbstractC10114l.subs(parcel, i12, C8175l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i12);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                C6174l c6174l2 = new C6174l();
                c6174l2.f13018l = strIsPro7;
                c6174l2.f13017l = strIsPro40;
                c6174l2.f13015l = strIsPro41;
                c6174l2.f13020l = strIsPro42;
                c6174l2.f13019l = strIsPro43;
                c6174l2.f13021l = c8175l2;
                c6174l2.f13016l = c8175l3;
                return c6174l2;
            case 12:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip13) {
                    int i13 = parcel.readInt();
                    char c4 = (char) i13;
                    if (c4 == 1) {
                        iSignature = AbstractC10114l.Signature(parcel, i13);
                    } else if (c4 != 2) {
                        AbstractC10114l.advert(parcel, i13);
                    } else {
                        strArrFirebase = AbstractC10114l.firebase(parcel, i13);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                return new C5683l(iSignature, strArrFirebase);
            case 13:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                long jPro15 = 0;
                int iSignature48 = 0;
                long jPro16 = 0;
                while (parcel.dataPosition() < iIsVip14) {
                    int i14 = parcel.readInt();
                    char c5 = (char) i14;
                    if (c5 == 1) {
                        jPro = AbstractC10114l.pro(parcel, i14);
                    } else if (c5 == 2) {
                        iSignature48 = AbstractC10114l.Signature(parcel, i14);
                    } else if (c5 == 3) {
                        jPro15 = AbstractC10114l.pro(parcel, i14);
                    } else if (c5 != 4) {
                        AbstractC10114l.advert(parcel, i14);
                    } else {
                        jPro16 = AbstractC10114l.pro(parcel, i14);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                C10373l c10373l = new C10373l();
                c10373l.f21171l = jPro;
                c10373l.f21170l = iSignature48;
                c10373l.f21169l = jPro15;
                c10373l.f21172l = jPro16;
                return c10373l;
            case 14:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                String strIsPro44 = null;
                String strIsPro45 = null;
                C8992l[] c8992lArr = null;
                C17118l[] c17118lArr = null;
                String[] strArrFirebase2 = null;
                C10128l[] c10128lArr = null;
                while (parcel.dataPosition() < iIsVip15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            c3382l = (C3382l) AbstractC10114l.subs(parcel, i15, C3382l.CREATOR);
                            break;
                        case 3:
                            strIsPro44 = AbstractC10114l.isPro(parcel, i15);
                            break;
                        case 4:
                            strIsPro45 = AbstractC10114l.isPro(parcel, i15);
                            break;
                        case 5:
                            c8992lArr = (C8992l[]) AbstractC10114l.remoteconfig(parcel, i15, C8992l.CREATOR);
                            break;
                        case 6:
                            c17118lArr = (C17118l[]) AbstractC10114l.remoteconfig(parcel, i15, C17118l.CREATOR);
                            break;
                        case 7:
                            strArrFirebase2 = AbstractC10114l.firebase(parcel, i15);
                            break;
                        case '\b':
                            c10128lArr = (C10128l[]) AbstractC10114l.remoteconfig(parcel, i15, C10128l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i15);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                C13063l c13063l2 = new C13063l();
                c13063l2.f25578l = c3382l;
                c13063l2.f25577l = strIsPro44;
                c13063l2.f25575l = strIsPro45;
                c13063l2.f25580l = c8992lArr;
                c13063l2.f25579l = c17118lArr;
                c13063l2.f25581l = strArrFirebase2;
                c13063l2.f25576l = c10128lArr;
                return c13063l2;
            case 15:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                int iSignature49 = 0;
                int iSignature50 = 0;
                String strIsPro46 = null;
                String strIsPro47 = null;
                byte[] bArrAmazon7 = null;
                Point[] pointArr2 = null;
                C13426l c13426l = null;
                C3261l c3261l = null;
                C6350l c6350l = null;
                C16516l c16516l = null;
                C10003l c10003l = null;
                C17164l c17164l = null;
                C1959l c1959l = null;
                C18038l c18038l = null;
                C14763l c14763l = null;
                while (parcel.dataPosition() < iIsVip16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iSignature49 = AbstractC10114l.Signature(parcel, i16);
                            break;
                        case 2:
                            strIsPro46 = AbstractC10114l.isPro(parcel, i16);
                            break;
                        case 3:
                            strIsPro47 = AbstractC10114l.isPro(parcel, i16);
                            break;
                        case 4:
                            bArrAmazon7 = AbstractC10114l.amazon(parcel, i16);
                            break;
                        case 5:
                            pointArr2 = (Point[]) AbstractC10114l.remoteconfig(parcel, i16, Point.CREATOR);
                            break;
                        case 6:
                            iSignature50 = AbstractC10114l.Signature(parcel, i16);
                            break;
                        case 7:
                            c13426l = (C13426l) AbstractC10114l.subs(parcel, i16, C13426l.CREATOR);
                            break;
                        case '\b':
                            c3261l = (C3261l) AbstractC10114l.subs(parcel, i16, C3261l.CREATOR);
                            break;
                        case '\t':
                            c6350l = (C6350l) AbstractC10114l.subs(parcel, i16, C6350l.CREATOR);
                            break;
                        case '\n':
                            c16516l = (C16516l) AbstractC10114l.subs(parcel, i16, C16516l.CREATOR);
                            break;
                        case 11:
                            c10003l = (C10003l) AbstractC10114l.subs(parcel, i16, C10003l.CREATOR);
                            break;
                        case '\f':
                            c17164l = (C17164l) AbstractC10114l.subs(parcel, i16, C17164l.CREATOR);
                            break;
                        case '\r':
                            c1959l = (C1959l) AbstractC10114l.subs(parcel, i16, C1959l.CREATOR);
                            break;
                        case 14:
                            c18038l = (C18038l) AbstractC10114l.subs(parcel, i16, C18038l.CREATOR);
                            break;
                        case 15:
                            c14763l = (C14763l) AbstractC10114l.subs(parcel, i16, C14763l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i16);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                return new C3212l(iSignature49, strIsPro46, strIsPro47, bArrAmazon7, pointArr2, iSignature50, c13426l, c3261l, c6350l, c16516l, c10003l, c17164l, c1959l, c18038l, c14763l);
            case 16:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                int iSignature51 = 0;
                int iSignature52 = 0;
                int iSignature53 = 0;
                int iSignature54 = 0;
                int iSignature55 = 0;
                int iSignature56 = 0;
                boolean zAdcel24 = false;
                String strIsPro48 = null;
                while (parcel.dataPosition() < iIsVip17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iSignature51 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 2:
                            iSignature52 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 3:
                            iSignature53 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 4:
                            iSignature54 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 5:
                            iSignature55 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 6:
                            iSignature56 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 7:
                            zAdcel24 = AbstractC10114l.adcel(parcel, i17);
                            break;
                        case '\b':
                            strIsPro48 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i17);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip17);
                return new C0291l(iSignature51, iSignature52, iSignature53, iSignature54, iSignature55, iSignature56, zAdcel24, strIsPro48);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                String strIsPro49 = null;
                String strIsPro50 = null;
                String strIsPro51 = null;
                String strIsPro52 = null;
                String strIsPro53 = null;
                C0291l c0291l = null;
                C0291l c0291l2 = null;
                while (parcel.dataPosition() < iIsVip18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strIsPro49 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 2:
                            strIsPro50 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 3:
                            strIsPro51 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 4:
                            strIsPro52 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 5:
                            strIsPro53 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 6:
                            c0291l = (C0291l) AbstractC10114l.subs(parcel, i18, C0291l.CREATOR);
                            break;
                        case 7:
                            c0291l2 = (C0291l) AbstractC10114l.subs(parcel, i18, C0291l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i18);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C1959l(strIsPro49, strIsPro50, strIsPro51, strIsPro52, strIsPro53, c0291l, c0291l2);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip19 = AbstractC10114l.isVip(parcel);
                C14456l c14456l = null;
                String strIsPro54 = null;
                String strIsPro55 = null;
                C3261l[] c3261lArr = null;
                C13426l[] c13426lArr = null;
                String[] strArrFirebase3 = null;
                C5683l[] c5683lArr = null;
                while (parcel.dataPosition() < iIsVip19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            c14456l = (C14456l) AbstractC10114l.subs(parcel, i19, C14456l.CREATOR);
                            break;
                        case 2:
                            strIsPro54 = AbstractC10114l.isPro(parcel, i19);
                            break;
                        case 3:
                            strIsPro55 = AbstractC10114l.isPro(parcel, i19);
                            break;
                        case 4:
                            c3261lArr = (C3261l[]) AbstractC10114l.remoteconfig(parcel, i19, C3261l.CREATOR);
                            break;
                        case 5:
                            c13426lArr = (C13426l[]) AbstractC10114l.remoteconfig(parcel, i19, C13426l.CREATOR);
                            break;
                        case 6:
                            strArrFirebase3 = AbstractC10114l.firebase(parcel, i19);
                            break;
                        case 7:
                            c5683lArr = (C5683l[]) AbstractC10114l.remoteconfig(parcel, i19, C5683l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i19);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip19);
                return new C18038l(c14456l, strIsPro54, strIsPro55, c3261lArr, c13426lArr, strArrFirebase3, c5683lArr);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip20 = AbstractC10114l.isVip(parcel);
                String strIsPro56 = null;
                String strIsPro57 = null;
                String strIsPro58 = null;
                String strIsPro59 = null;
                String strIsPro60 = null;
                String strIsPro61 = null;
                String strIsPro62 = null;
                String strIsPro63 = null;
                String strIsPro64 = null;
                String strIsPro65 = null;
                String strIsPro66 = null;
                String strIsPro67 = null;
                String strIsPro68 = null;
                String strIsPro69 = null;
                while (parcel.dataPosition() < iIsVip20) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strIsPro56 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 2:
                            strIsPro57 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 3:
                            strIsPro58 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 4:
                            strIsPro59 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 5:
                            strIsPro60 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 6:
                            strIsPro61 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 7:
                            strIsPro62 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\b':
                            strIsPro63 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\t':
                            strIsPro64 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\n':
                            strIsPro65 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 11:
                            strIsPro66 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\f':
                            strIsPro67 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\r':
                            strIsPro68 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 14:
                            strIsPro69 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i20);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip20);
                return new C14763l(strIsPro56, strIsPro57, strIsPro58, strIsPro59, strIsPro60, strIsPro61, strIsPro62, strIsPro63, strIsPro64, strIsPro65, strIsPro66, strIsPro67, strIsPro68, strIsPro69);
            case 20:
                int iIsVip21 = AbstractC10114l.isVip(parcel);
                String strIsPro70 = null;
                String strIsPro71 = null;
                while (parcel.dataPosition() < iIsVip21) {
                    int i21 = parcel.readInt();
                    char c6 = (char) i21;
                    if (c6 == 1) {
                        iSignature = AbstractC10114l.Signature(parcel, i21);
                    } else if (c6 == 2) {
                        strIsPro6 = AbstractC10114l.isPro(parcel, i21);
                    } else if (c6 == 3) {
                        strIsPro70 = AbstractC10114l.isPro(parcel, i21);
                    } else if (c6 != 4) {
                        AbstractC10114l.advert(parcel, i21);
                    } else {
                        strIsPro71 = AbstractC10114l.isPro(parcel, i21);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip21);
                return new C13426l(iSignature, strIsPro6, strIsPro70, strIsPro71);
            case 21:
                int iIsVip22 = AbstractC10114l.isVip(parcel);
                double dSubscription2 = 0.0d;
                while (parcel.dataPosition() < iIsVip22) {
                    int i22 = parcel.readInt();
                    char c7 = (char) i22;
                    if (c7 == 1) {
                        dSubscription = AbstractC10114l.subscription(parcel, i22);
                    } else if (c7 != 2) {
                        AbstractC10114l.advert(parcel, i22);
                    } else {
                        dSubscription2 = AbstractC10114l.subscription(parcel, i22);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip22);
                return new C17164l(dSubscription, dSubscription2);
            case 22:
                int iIsVip23 = AbstractC10114l.isVip(parcel);
                String strIsPro72 = null;
                String strIsPro73 = null;
                String strIsPro74 = null;
                String strIsPro75 = null;
                String strIsPro76 = null;
                String strIsPro77 = null;
                String strIsPro78 = null;
                while (parcel.dataPosition() < iIsVip23) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strIsPro72 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 2:
                            strIsPro73 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 3:
                            strIsPro74 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 4:
                            strIsPro75 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 5:
                            strIsPro76 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 6:
                            strIsPro77 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 7:
                            strIsPro78 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i23);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip23);
                return new C14456l(strIsPro72, strIsPro73, strIsPro74, strIsPro75, strIsPro76, strIsPro77, strIsPro78);
            case 23:
                int iIsVip24 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip24) {
                    int i24 = parcel.readInt();
                    char c8 = (char) i24;
                    if (c8 == 1) {
                        iSignature = AbstractC10114l.Signature(parcel, i24);
                    } else if (c8 != 2) {
                        AbstractC10114l.advert(parcel, i24);
                    } else {
                        strIsPro5 = AbstractC10114l.isPro(parcel, i24);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip24);
                return new C3261l(iSignature, strIsPro5);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip25 = AbstractC10114l.isVip(parcel);
                String strIsPro79 = null;
                while (parcel.dataPosition() < iIsVip25) {
                    int i25 = parcel.readInt();
                    char c9 = (char) i25;
                    if (c9 == 1) {
                        strIsPro4 = AbstractC10114l.isPro(parcel, i25);
                    } else if (c9 != 2) {
                        AbstractC10114l.advert(parcel, i25);
                    } else {
                        strIsPro79 = AbstractC10114l.isPro(parcel, i25);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip25);
                return new C6350l(strIsPro4, strIsPro79);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip26 = AbstractC10114l.isVip(parcel);
                String strIsPro80 = null;
                while (parcel.dataPosition() < iIsVip26) {
                    int i26 = parcel.readInt();
                    char c10 = (char) i26;
                    if (c10 == 1) {
                        strIsPro3 = AbstractC10114l.isPro(parcel, i26);
                    } else if (c10 != 2) {
                        AbstractC10114l.advert(parcel, i26);
                    } else {
                        strIsPro80 = AbstractC10114l.isPro(parcel, i26);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip26);
                return new C10003l(strIsPro3, strIsPro80);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip27 = AbstractC10114l.isVip(parcel);
                String strIsPro81 = null;
                while (parcel.dataPosition() < iIsVip27) {
                    int i27 = parcel.readInt();
                    char c11 = (char) i27;
                    if (c11 == 1) {
                        strIsPro2 = AbstractC10114l.isPro(parcel, i27);
                    } else if (c11 == 2) {
                        strIsPro81 = AbstractC10114l.isPro(parcel, i27);
                    } else if (c11 != 3) {
                        AbstractC10114l.advert(parcel, i27);
                    } else {
                        iSignature = AbstractC10114l.Signature(parcel, i27);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip27);
                return new C16516l(strIsPro2, iSignature, strIsPro81);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip28 = AbstractC10114l.isVip(parcel);
                String strIsPro82 = null;
                String strIsPro83 = null;
                String strIsPro84 = null;
                String strIsPro85 = null;
                String strIsPro86 = null;
                String strIsPro87 = null;
                String strIsPro88 = null;
                String strIsPro89 = null;
                String strIsPro90 = null;
                String strIsPro91 = null;
                String strIsPro92 = null;
                String strIsPro93 = null;
                String strIsPro94 = null;
                while (parcel.dataPosition() < iIsVip28) {
                    int i28 = parcel.readInt();
                    String str = strIsPro94;
                    switch ((char) i28) {
                        case 2:
                            strIsPro = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 3:
                            strIsPro83 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 4:
                            strIsPro84 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 5:
                            strIsPro85 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 6:
                            strIsPro86 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 7:
                            strIsPro87 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case '\b':
                            strIsPro88 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case '\t':
                            strIsPro89 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case '\n':
                            strIsPro90 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 11:
                            strIsPro91 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case '\f':
                            strIsPro92 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case '\r':
                            strIsPro93 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 14:
                            strIsPro94 = AbstractC10114l.isPro(parcel, i28);
                            continue;
                        case 15:
                            strIsPro82 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i28);
                            break;
                    }
                    strIsPro94 = str;
                }
                AbstractC10114l.metrica(parcel, iIsVip28);
                C6580l c6580l2 = new C6580l();
                c6580l2.f13759l = strIsPro;
                c6580l2.f13758l = strIsPro83;
                c6580l2.f13755l = strIsPro84;
                c6580l2.f13762l = strIsPro85;
                c6580l2.f13761l = strIsPro86;
                c6580l2.f13765l = strIsPro87;
                c6580l2.f13756l = strIsPro88;
                c6580l2.f13757l = strIsPro89;
                c6580l2.f13764l = strIsPro90;
                c6580l2.f13760l = strIsPro91;
                c6580l2.f13766l = strIsPro92;
                c6580l2.f13763l = strIsPro93;
                c6580l2.f13754l = strIsPro94;
                c6580l2.f13767l = strIsPro82;
                return c6580l2;
            default:
                int iIsVip29 = AbstractC10114l.isVip(parcel);
                int iSignature57 = 0;
                while (parcel.dataPosition() < iIsVip29) {
                    int i29 = parcel.readInt();
                    char c12 = (char) i29;
                    if (c12 == 3) {
                        iSignature = AbstractC10114l.Signature(parcel, i29);
                    } else if (c12 != 4) {
                        AbstractC10114l.advert(parcel, i29);
                    } else {
                        iSignature57 = AbstractC10114l.Signature(parcel, i29);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip29);
                return new C9701l(iSignature, iSignature57);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C18090l[i];
            case 1:
                return new C8495l[i];
            case 2:
                return new C6899l[i];
            case 3:
                return new C16923l[i];
            case 4:
                return new CastDevice[i];
            case 5:
                return new C10462l[i];
            case 6:
                return new C16657l[i];
            case 7:
                return new C13438l[i];
            case 8:
                return new C17468l[i];
            case 9:
                return new C1041l[i];
            case 10:
                return new C8175l[i];
            case 11:
                return new C6174l[i];
            case 12:
                return new C5683l[i];
            case 13:
                return new C10373l[i];
            case 14:
                return new C13063l[i];
            case 15:
                return new C3212l[i];
            case 16:
                return new C0291l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C1959l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18038l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14763l[i];
            case 20:
                return new C13426l[i];
            case 21:
                return new C17164l[i];
            case 22:
                return new C14456l[i];
            case 23:
                return new C3261l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C6350l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C10003l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C16516l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C6580l[i];
            default:
                return new C9701l[i];
        }
    }
}
