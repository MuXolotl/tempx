package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5422l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C5422l(int i) {
        this.yandex = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strIsPro = null;
        String[] strArrFirebase = null;
        String strIsPro2 = null;
        String strIsPro3 = null;
        String strIsPro4 = null;
        ArrayList arrayListVip = null;
        String strIsPro5 = null;
        String strIsPro6 = null;
        String strIsPro7 = null;
        String strIsPro8 = null;
        String strIsPro9 = null;
        int iSignature = 0;
        int iSignature2 = 0;
        int iSignature3 = 0;
        int iSignature4 = 0;
        int iSignature5 = 0;
        int iSignature6 = 0;
        int iSignature7 = 0;
        boolean zAdcel = false;
        boolean zAdcel2 = false;
        boolean zAdcel3 = false;
        int iSignature8 = 0;
        int iSignature9 = 0;
        int iSignature10 = 0;
        int iSignature11 = 0;
        switch (this.yandex) {
            case 0:
                int iIsVip = AbstractC10114l.isVip(parcel);
                String strIsPro10 = null;
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strIsPro = AbstractC10114l.isPro(parcel, i);
                    } else if (c == 2) {
                        strIsPro10 = AbstractC10114l.isPro(parcel, i);
                    } else if (c != 3) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        iSignature = AbstractC10114l.Signature(parcel, i);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C0008l(strIsPro, iSignature, strIsPro10);
            case 1:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                long jPro = 0;
                int iSignature12 = 0;
                int iSignature13 = 0;
                int iSignature14 = 0;
                int iSignature15 = 0;
                while (parcel.dataPosition() < iIsVip2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iSignature12 = AbstractC10114l.Signature(parcel, i2);
                    } else if (c2 == 2) {
                        iSignature13 = AbstractC10114l.Signature(parcel, i2);
                    } else if (c2 == 3) {
                        iSignature14 = AbstractC10114l.Signature(parcel, i2);
                    } else if (c2 == 4) {
                        iSignature15 = AbstractC10114l.Signature(parcel, i2);
                    } else if (c2 != 5) {
                        AbstractC10114l.advert(parcel, i2);
                    } else {
                        jPro = AbstractC10114l.pro(parcel, i2);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                return new C13173l(iSignature12, iSignature13, iSignature14, iSignature15, jPro);
            case 2:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iSignature11 = AbstractC10114l.Signature(parcel, i3);
                    } else if (c3 != 2) {
                        AbstractC10114l.advert(parcel, i3);
                    } else {
                        strIsPro9 = AbstractC10114l.isPro(parcel, i3);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                return new Scope(iSignature11, strIsPro9);
            case 3:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                String strIsPro11 = null;
                String strIsPro12 = null;
                ArrayList arrayListSmaato = null;
                String strIsPro13 = null;
                Uri uri = null;
                String strIsPro14 = null;
                String strIsPro15 = null;
                Boolean boolAds = null;
                Boolean boolAds2 = null;
                int iSignature16 = 0;
                while (parcel.dataPosition() < iIsVip4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strIsPro11 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case 3:
                            strIsPro12 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case 4:
                            AbstractC10114l.vip(parcel, i4, C4259l.CREATOR);
                            break;
                        case 5:
                            arrayListSmaato = AbstractC10114l.smaato(parcel, i4);
                            break;
                        case 6:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case 7:
                            uri = (Uri) AbstractC10114l.subs(parcel, i4, Uri.CREATOR);
                            break;
                        case '\b':
                            strIsPro14 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case '\t':
                            strIsPro15 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case '\n':
                            boolAds = AbstractC10114l.ads(parcel, i4);
                            break;
                        case 11:
                            boolAds2 = AbstractC10114l.ads(parcel, i4);
                            break;
                        case '\f':
                            iSignature16 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i4);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                return new C5040l(strIsPro11, strIsPro12, arrayListSmaato, strIsPro13, uri, strIsPro14, strIsPro15, boolAds, boolAds2, iSignature16);
            case 4:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                long jPro2 = 0;
                long jPro3 = 0;
                Bundle bundleCrashlytics = null;
                String strIsPro16 = null;
                boolean zAdcel4 = false;
                while (parcel.dataPosition() < iIsVip5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        jPro2 = AbstractC10114l.pro(parcel, i5);
                    } else if (c4 == 2) {
                        jPro3 = AbstractC10114l.pro(parcel, i5);
                    } else if (c4 == 3) {
                        zAdcel4 = AbstractC10114l.adcel(parcel, i5);
                    } else if (c4 == 7) {
                        bundleCrashlytics = AbstractC10114l.crashlytics(parcel, i5);
                    } else if (c4 != '\b') {
                        AbstractC10114l.advert(parcel, i5);
                    } else {
                        strIsPro16 = AbstractC10114l.isPro(parcel, i5);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new C16351l(jPro2, jPro3, zAdcel4, bundleCrashlytics, strIsPro16);
            case 5:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iIsVip6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iSignature10 = AbstractC10114l.Signature(parcel, i6);
                    } else if (c5 == 2) {
                        strIsPro8 = AbstractC10114l.isPro(parcel, i6);
                    } else if (c5 != 3) {
                        AbstractC10114l.advert(parcel, i6);
                    } else {
                        intent = (Intent) AbstractC10114l.subs(parcel, i6, Intent.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                return new C8066l(iSignature10, strIsPro8, intent);
            case 6:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                float f = 0.0f;
                String strIsPro17 = null;
                String strIsPro18 = null;
                int iSignature17 = 0;
                int iSignature18 = 0;
                int iSignature19 = 0;
                int iSignature20 = 0;
                int iSignature21 = 0;
                int iSignature22 = 0;
                int iSignature23 = 0;
                int iSignature24 = 0;
                int iSignature25 = 0;
                while (parcel.dataPosition() < iIsVip7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            AbstractC10114l.signatures(parcel, i7, 4);
                            f = parcel.readFloat();
                            break;
                        case 3:
                            iSignature17 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 4:
                            iSignature18 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 5:
                            iSignature19 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 6:
                            iSignature20 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case 7:
                            iSignature21 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\b':
                            iSignature22 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\t':
                            iSignature23 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\n':
                            strIsPro17 = AbstractC10114l.isPro(parcel, i7);
                            break;
                        case 11:
                            iSignature24 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\f':
                            iSignature25 = AbstractC10114l.Signature(parcel, i7);
                            break;
                        case '\r':
                            strIsPro18 = AbstractC10114l.isPro(parcel, i7);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i7);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                return new C13727l(f, iSignature17, iSignature18, iSignature19, iSignature20, iSignature21, iSignature22, iSignature23, strIsPro17, iSignature24, iSignature25, strIsPro18);
            case 7:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                String strIsPro19 = null;
                while (parcel.dataPosition() < iIsVip8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        strIsPro7 = AbstractC10114l.isPro(parcel, i8);
                    } else if (c6 != 3) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        strIsPro19 = AbstractC10114l.isPro(parcel, i8);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                return new C16640l(strIsPro7, strIsPro19);
            case 8:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                int iSignature26 = 0;
                int iSignature27 = 0;
                while (parcel.dataPosition() < iIsVip9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 2) {
                        iSignature9 = AbstractC10114l.Signature(parcel, i9);
                    } else if (c7 == 3) {
                        iSignature26 = AbstractC10114l.Signature(parcel, i9);
                    } else if (c7 != 4) {
                        AbstractC10114l.advert(parcel, i9);
                    } else {
                        iSignature27 = AbstractC10114l.Signature(parcel, i9);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                return new C3133l(iSignature9, iSignature26, iSignature27);
            case 9:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                PendingIntent pendingIntent = null;
                C10602l c10602l = null;
                while (parcel.dataPosition() < iIsVip10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iSignature8 = AbstractC10114l.Signature(parcel, i10);
                    } else if (c8 == 2) {
                        strIsPro6 = AbstractC10114l.isPro(parcel, i10);
                    } else if (c8 == 3) {
                        pendingIntent = (PendingIntent) AbstractC10114l.subs(parcel, i10, PendingIntent.CREATOR);
                    } else if (c8 != 4) {
                        AbstractC10114l.advert(parcel, i10);
                    } else {
                        c10602l = (C10602l) AbstractC10114l.subs(parcel, i10, C10602l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                return new Status(iSignature8, strIsPro6, pendingIntent, c10602l);
            case 10:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                byte[] bArrAmazon = null;
                ArrayList arrayListMopub = null;
                while (parcel.dataPosition() < iIsVip11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        strIsPro5 = AbstractC10114l.isPro(parcel, i11);
                    } else if (c9 == 2) {
                        bArrAmazon = AbstractC10114l.amazon(parcel, i11);
                    } else if (c9 != 3) {
                        AbstractC10114l.advert(parcel, i11);
                    } else {
                        arrayListMopub = AbstractC10114l.mopub(parcel, i11);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                return new C13532l(strIsPro5, bArrAmazon, arrayListMopub);
            case 11:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                boolean zAdcel5 = false;
                while (parcel.dataPosition() < iIsVip12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        arrayListVip = AbstractC10114l.vip(parcel, i12, C13532l.CREATOR);
                    } else if (c10 == 2) {
                        zAdcel3 = AbstractC10114l.adcel(parcel, i12);
                    } else if (c10 != 3) {
                        AbstractC10114l.advert(parcel, i12);
                    } else {
                        zAdcel5 = AbstractC10114l.adcel(parcel, i12);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                return new C16041l(arrayListVip, zAdcel3, zAdcel5);
            case 12:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                int iSignature28 = 0;
                while (parcel.dataPosition() < iIsVip13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        zAdcel2 = AbstractC10114l.adcel(parcel, i13);
                    } else if (c11 != 3) {
                        AbstractC10114l.advert(parcel, i13);
                    } else {
                        iSignature28 = AbstractC10114l.Signature(parcel, i13);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                return new C15204l(zAdcel2, iSignature28);
            case 13:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                boolean zAdcel6 = false;
                int iSignature29 = 0;
                while (parcel.dataPosition() < iIsVip14) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        zAdcel = AbstractC10114l.adcel(parcel, i14);
                    } else if (c12 == 3) {
                        zAdcel6 = AbstractC10114l.adcel(parcel, i14);
                    } else if (c12 != 4) {
                        AbstractC10114l.advert(parcel, i14);
                    } else {
                        iSignature29 = AbstractC10114l.Signature(parcel, i14);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                return new C8171l(iSignature29, zAdcel, zAdcel6);
            case 14:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                String strIsPro20 = null;
                C9369l c9369l = null;
                C8495l c8495l = null;
                int iSignature30 = 0;
                int iSignature31 = 0;
                int iSignature32 = 0;
                while (parcel.dataPosition() < iIsVip15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strIsPro20 = AbstractC10114l.isPro(parcel, i15);
                            break;
                        case 2:
                            iSignature30 = AbstractC10114l.Signature(parcel, i15);
                            break;
                        case 3:
                            iSignature31 = AbstractC10114l.Signature(parcel, i15);
                            break;
                        case 4:
                            iSignature32 = AbstractC10114l.Signature(parcel, i15);
                            break;
                        case 5:
                            c9369l = (C9369l) AbstractC10114l.subs(parcel, i15, C9369l.CREATOR);
                            break;
                        case 6:
                            c8495l = (C8495l) AbstractC10114l.subs(parcel, i15, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i15);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                return new C15397l(strIsPro20, iSignature30, iSignature31, iSignature32, c9369l, c8495l);
            case 15:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                String strIsPro21 = null;
                String strIsPro22 = null;
                String strIsPro23 = null;
                byte[] bArrAmazon2 = null;
                byte[] bArrAmazon3 = null;
                byte[] bArrAmazon4 = null;
                C9369l c9369l2 = null;
                C8495l c8495l2 = null;
                boolean zAdcel7 = false;
                boolean zAdcel8 = false;
                int iSignature33 = 0;
                int iSignature34 = 0;
                while (parcel.dataPosition() < iIsVip16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strIsPro21 = AbstractC10114l.isPro(parcel, i16);
                            break;
                        case 2:
                            strIsPro22 = AbstractC10114l.isPro(parcel, i16);
                            break;
                        case 3:
                            strIsPro23 = AbstractC10114l.isPro(parcel, i16);
                            break;
                        case 4:
                            zAdcel7 = AbstractC10114l.adcel(parcel, i16);
                            break;
                        case 5:
                            bArrAmazon2 = AbstractC10114l.amazon(parcel, i16);
                            break;
                        case 6:
                            bArrAmazon3 = AbstractC10114l.amazon(parcel, i16);
                            break;
                        case 7:
                            bArrAmazon4 = AbstractC10114l.amazon(parcel, i16);
                            break;
                        case '\b':
                            zAdcel8 = AbstractC10114l.adcel(parcel, i16);
                            break;
                        case '\t':
                            iSignature33 = AbstractC10114l.Signature(parcel, i16);
                            break;
                        case '\n':
                            c9369l2 = (C9369l) AbstractC10114l.subs(parcel, i16, C9369l.CREATOR);
                            break;
                        case 11:
                            c8495l2 = (C8495l) AbstractC10114l.subs(parcel, i16, C8495l.CREATOR);
                            break;
                        case '\f':
                            iSignature34 = AbstractC10114l.Signature(parcel, i16);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i16);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                return new C14151l(strIsPro21, strIsPro22, strIsPro23, zAdcel7, bArrAmazon2, bArrAmazon3, bArrAmazon4, zAdcel8, iSignature33, c9369l2, c8495l2, iSignature34);
            case 16:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                ArrayList arrayListSmaato2 = null;
                String strIsPro24 = null;
                int iSignature35 = 0;
                boolean zAdcel9 = false;
                int iSignature36 = 0;
                boolean zAdcel10 = false;
                while (parcel.dataPosition() < iIsVip17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            iSignature35 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 3:
                            zAdcel9 = AbstractC10114l.adcel(parcel, i17);
                            break;
                        case 4:
                            arrayListSmaato2 = AbstractC10114l.smaato(parcel, i17);
                            break;
                        case 5:
                            iSignature36 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case 6:
                            strIsPro24 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case 7:
                            zAdcel10 = AbstractC10114l.adcel(parcel, i17);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i17);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip17);
                return new C16903l(iSignature35, zAdcel9, arrayListSmaato2, iSignature36, strIsPro24, zAdcel10);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                String strIsPro25 = null;
                byte[] bArrAmazon5 = null;
                C9369l c9369l3 = null;
                C8495l c8495l3 = null;
                int iSignature37 = 0;
                int iSignature38 = 0;
                while (parcel.dataPosition() < iIsVip18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strIsPro25 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 2:
                            iSignature37 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case 3:
                            bArrAmazon5 = AbstractC10114l.amazon(parcel, i18);
                            break;
                        case 4:
                            iSignature38 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case 5:
                            c9369l3 = (C9369l) AbstractC10114l.subs(parcel, i18, C9369l.CREATOR);
                            break;
                        case 6:
                            c8495l3 = (C8495l) AbstractC10114l.subs(parcel, i18, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i18);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C14829l(strIsPro25, iSignature37, bArrAmazon5, iSignature38, c9369l3, c8495l3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip19 = AbstractC10114l.isVip(parcel);
                C9369l c9369l4 = null;
                C8495l c8495l4 = null;
                while (parcel.dataPosition() < iIsVip19) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 1) {
                        strIsPro4 = AbstractC10114l.isPro(parcel, i19);
                    } else if (c13 == 2) {
                        iSignature7 = AbstractC10114l.Signature(parcel, i19);
                    } else if (c13 == 3) {
                        c9369l4 = (C9369l) AbstractC10114l.subs(parcel, i19, C9369l.CREATOR);
                    } else if (c13 != 4) {
                        AbstractC10114l.advert(parcel, i19);
                    } else {
                        c8495l4 = (C8495l) AbstractC10114l.subs(parcel, i19, C8495l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip19);
                return new C15906l(strIsPro4, iSignature7, c9369l4, c8495l4);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip20 = AbstractC10114l.isVip(parcel);
                String strIsPro26 = null;
                C2243l c2243l = null;
                C8495l c8495l5 = null;
                int iSignature39 = 0;
                int iSignature40 = 0;
                while (parcel.dataPosition() < iIsVip20) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 1) {
                        strIsPro26 = AbstractC10114l.isPro(parcel, i20);
                    } else if (c14 == 2) {
                        iSignature39 = AbstractC10114l.Signature(parcel, i20);
                    } else if (c14 == 3) {
                        c2243l = (C2243l) AbstractC10114l.subs(parcel, i20, C2243l.CREATOR);
                    } else if (c14 == 4) {
                        iSignature40 = AbstractC10114l.Signature(parcel, i20);
                    } else if (c14 != 5) {
                        AbstractC10114l.advert(parcel, i20);
                    } else {
                        c8495l5 = (C8495l) AbstractC10114l.subs(parcel, i20, C8495l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip20);
                return new C14975l(strIsPro26, iSignature39, c2243l, iSignature40, c8495l5);
            case 20:
                int iIsVip21 = AbstractC10114l.isVip(parcel);
                String strIsPro27 = null;
                String strIsPro28 = null;
                String strIsPro29 = null;
                BluetoothDevice bluetoothDevice = null;
                byte[] bArrAmazon6 = null;
                C8495l c8495l6 = null;
                int iSignature41 = 0;
                while (parcel.dataPosition() < iIsVip21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strIsPro27 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 2:
                            strIsPro28 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 3:
                            strIsPro29 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 4:
                            bluetoothDevice = (BluetoothDevice) AbstractC10114l.subs(parcel, i21, BluetoothDevice.CREATOR);
                            break;
                        case 5:
                            bArrAmazon6 = AbstractC10114l.amazon(parcel, i21);
                            break;
                        case 6:
                            iSignature41 = AbstractC10114l.Signature(parcel, i21);
                            break;
                        case 7:
                            c8495l6 = (C8495l) AbstractC10114l.subs(parcel, i21, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i21);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip21);
                return new C11060l(strIsPro27, strIsPro28, strIsPro29, bluetoothDevice, bArrAmazon6, iSignature41, c8495l6);
            case 21:
                int iIsVip22 = AbstractC10114l.isVip(parcel);
                C8495l c8495l7 = null;
                while (parcel.dataPosition() < iIsVip22) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        strIsPro3 = AbstractC10114l.isPro(parcel, i22);
                    } else if (c15 == 2) {
                        iSignature6 = AbstractC10114l.Signature(parcel, i22);
                    } else if (c15 != 3) {
                        AbstractC10114l.advert(parcel, i22);
                    } else {
                        c8495l7 = (C8495l) AbstractC10114l.subs(parcel, i22, C8495l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip22);
                return new C4031l(strIsPro3, iSignature6, c8495l7);
            case 22:
                int iIsVip23 = AbstractC10114l.isVip(parcel);
                String strIsPro30 = null;
                C17484l c17484l = null;
                C9369l c9369l5 = null;
                C8495l c8495l8 = null;
                boolean zAdcel11 = false;
                int iSignature42 = 0;
                while (parcel.dataPosition() < iIsVip23) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strIsPro30 = AbstractC10114l.isPro(parcel, i23);
                            break;
                        case 2:
                            c17484l = (C17484l) AbstractC10114l.subs(parcel, i23, C17484l.CREATOR);
                            break;
                        case 3:
                            zAdcel11 = AbstractC10114l.adcel(parcel, i23);
                            break;
                        case 4:
                            iSignature42 = AbstractC10114l.Signature(parcel, i23);
                            break;
                        case 5:
                            c9369l5 = (C9369l) AbstractC10114l.subs(parcel, i23, C9369l.CREATOR);
                            break;
                        case 6:
                            c8495l8 = (C8495l) AbstractC10114l.subs(parcel, i23, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i23);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip23);
                return new C16257l(strIsPro30, c17484l, zAdcel11, iSignature42, c9369l5, c8495l8);
            case 23:
                int iIsVip24 = AbstractC10114l.isVip(parcel);
                String strIsPro31 = null;
                C10373l c10373l = null;
                C9369l c9369l6 = null;
                C8495l c8495l9 = null;
                int iSignature43 = 0;
                while (parcel.dataPosition() < iIsVip24) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        strIsPro31 = AbstractC10114l.isPro(parcel, i24);
                    } else if (c16 == 2) {
                        c10373l = (C10373l) AbstractC10114l.subs(parcel, i24, C10373l.CREATOR);
                    } else if (c16 == 3) {
                        iSignature43 = AbstractC10114l.Signature(parcel, i24);
                    } else if (c16 == 4) {
                        c9369l6 = (C9369l) AbstractC10114l.subs(parcel, i24, C9369l.CREATOR);
                    } else if (c16 != 5) {
                        AbstractC10114l.advert(parcel, i24);
                    } else {
                        c8495l9 = (C8495l) AbstractC10114l.subs(parcel, i24, C8495l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip24);
                return new C11233l(strIsPro31, c10373l, iSignature43, c9369l6, c8495l9);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip25 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip25) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        iSignature5 = AbstractC10114l.Signature(parcel, i25);
                    } else if (c17 != 2) {
                        AbstractC10114l.advert(parcel, i25);
                    } else {
                        strIsPro2 = AbstractC10114l.isPro(parcel, i25);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip25);
                C9417l c9417l = new C9417l();
                c9417l.f19266l = iSignature5;
                c9417l.f19265l = strIsPro2;
                return c9417l;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip26 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip26) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 2) {
                        iSignature4 = AbstractC10114l.Signature(parcel, i26);
                    } else if (c18 != 3) {
                        AbstractC10114l.advert(parcel, i26);
                    } else {
                        strArrFirebase = AbstractC10114l.firebase(parcel, i26);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip26);
                C10128l c10128l = new C10128l();
                c10128l.f20634l = iSignature4;
                c10128l.f20633l = strArrFirebase;
                return c10128l;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip27 = AbstractC10114l.isVip(parcel);
                byte[] bArrAmazon7 = null;
                byte[] bArrAmazon8 = null;
                byte[] bArrAmazon9 = null;
                byte[] bArrAmazon10 = null;
                byte[] bArrAmazon11 = null;
                while (parcel.dataPosition() < iIsVip27) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 1) {
                        bArrAmazon7 = AbstractC10114l.amazon(parcel, i27);
                    } else if (c19 == 2) {
                        bArrAmazon8 = AbstractC10114l.amazon(parcel, i27);
                    } else if (c19 == 3) {
                        bArrAmazon9 = AbstractC10114l.amazon(parcel, i27);
                    } else if (c19 == 4) {
                        bArrAmazon10 = AbstractC10114l.amazon(parcel, i27);
                    } else if (c19 != 5) {
                        AbstractC10114l.advert(parcel, i27);
                    } else {
                        bArrAmazon11 = AbstractC10114l.amazon(parcel, i27);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip27);
                return new C15972l(bArrAmazon7, bArrAmazon8, bArrAmazon9, bArrAmazon10, bArrAmazon11);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip28 = AbstractC10114l.isVip(parcel);
                int iSignature44 = 0;
                int iSignature45 = 0;
                while (parcel.dataPosition() < iIsVip28) {
                    int i28 = parcel.readInt();
                    char c20 = (char) i28;
                    if (c20 == 2) {
                        iSignature3 = AbstractC10114l.Signature(parcel, i28);
                    } else if (c20 == 3) {
                        iSignature44 = AbstractC10114l.Signature(parcel, i28);
                    } else if (c20 != 4) {
                        AbstractC10114l.advert(parcel, i28);
                    } else {
                        iSignature45 = AbstractC10114l.Signature(parcel, i28);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip28);
                return new C4893l(iSignature3, iSignature44, iSignature45);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new BinderWrapper(parcel);
            default:
                int iIsVip29 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip29) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        AbstractC10114l.advert(parcel, i29);
                    } else {
                        iSignature2 = AbstractC10114l.Signature(parcel, i29);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip29);
                C8430l c8430l = new C8430l();
                c8430l.f17439l = iSignature2;
                return c8430l;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C0008l[i];
            case 1:
                return new C13173l[i];
            case 2:
                return new Scope[i];
            case 3:
                return new C5040l[i];
            case 4:
                return new C16351l[i];
            case 5:
                return new C8066l[i];
            case 6:
                return new C13727l[i];
            case 7:
                return new C16640l[i];
            case 8:
                return new C3133l[i];
            case 9:
                return new Status[i];
            case 10:
                return new C13532l[i];
            case 11:
                return new C16041l[i];
            case 12:
                return new C15204l[i];
            case 13:
                return new C8171l[i];
            case 14:
                return new C15397l[i];
            case 15:
                return new C14151l[i];
            case 16:
                return new C16903l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C14829l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C15906l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14975l[i];
            case 20:
                return new C11060l[i];
            case 21:
                return new C4031l[i];
            case 22:
                return new C16257l[i];
            case 23:
                return new C11233l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C9417l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C10128l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C15972l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C4893l[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new BinderWrapper[i];
            default:
                return new C8430l[i];
        }
    }
}
