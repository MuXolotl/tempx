package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lِْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13546l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13546l(int i) {
        this.yandex = i;
    }

    public static void yandex(C13236l c13236l, Parcel parcel, int i) {
        String str = c13236l.f26010l;
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, str);
        AbstractC9968l.remoteconfig(parcel, 3, c13236l.f26009l, i);
        AbstractC9968l.vip(parcel, 4, c13236l.f26008l);
        long j = c13236l.f26012l;
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = c13236l.f26011l;
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(j2);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        double dSubscription = 0.0d;
        long jPro = 0;
        int iSignature = 0;
        int iSignature2 = 0;
        int iSignature3 = 0;
        int iSignature4 = 0;
        int iSignature5 = 0;
        int iSignature6 = 0;
        int iSignature7 = 0;
        boolean zAdcel = false;
        int iSignature8 = 0;
        boolean zAdcel2 = false;
        C3434l c3434l = null;
        String strIsPro = null;
        String strIsPro2 = null;
        String strIsPro3 = null;
        String strIsPro4 = null;
        String strIsPro5 = null;
        ArrayList arrayListVip = null;
        String strIsPro6 = null;
        String strIsPro7 = null;
        Bundle bundleCrashlytics = null;
        C15905l c15905l = null;
        switch (this.yandex) {
            case 0:
                int iIsVip = AbstractC10114l.isVip(parcel);
                boolean zAdcel3 = false;
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iSignature = AbstractC10114l.Signature(parcel, i);
                    } else if (c != 2) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        zAdcel3 = AbstractC10114l.adcel(parcel, i);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C15194l(iSignature, zAdcel3);
            case 1:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                C18243l c18243l = null;
                while (parcel.dataPosition() < iIsVip2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        c3434l = (C3434l) AbstractC10114l.subs(parcel, i2, C3434l.CREATOR);
                    } else if (c2 == 2) {
                        c18243l = (C18243l) AbstractC10114l.subs(parcel, i2, C18243l.CREATOR);
                    } else if (c2 == 3) {
                        AbstractC10114l.adcel(parcel, i2);
                    } else if (c2 != 4) {
                        AbstractC10114l.advert(parcel, i2);
                    } else {
                        zAdcel2 = AbstractC10114l.adcel(parcel, i2);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                return new C17840l(c3434l, c18243l, zAdcel2);
            case 2:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        AbstractC10114l.advert(parcel, i3);
                    } else {
                        c15905l = (C15905l) AbstractC10114l.subs(parcel, i3, C15905l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                return new C15349l(c15905l);
            case 3:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                int iSignature9 = 0;
                int iSignature10 = 0;
                int iSignature11 = 0;
                int iSignature12 = 0;
                int iSignature13 = 0;
                int iSignature14 = 0;
                boolean zAdcel4 = false;
                String strIsPro8 = null;
                while (parcel.dataPosition() < iIsVip4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iSignature9 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 2:
                            iSignature10 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 3:
                            iSignature11 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 4:
                            iSignature12 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 5:
                            iSignature13 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 6:
                            iSignature14 = AbstractC10114l.Signature(parcel, i4);
                            break;
                        case 7:
                            zAdcel4 = AbstractC10114l.adcel(parcel, i4);
                            break;
                        case '\b':
                            strIsPro8 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i4);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                return new C16674l(iSignature9, iSignature10, iSignature11, iSignature12, iSignature13, iSignature14, zAdcel4, strIsPro8);
            case 4:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        AbstractC10114l.advert(parcel, i5);
                    } else {
                        bundleCrashlytics = AbstractC10114l.crashlytics(parcel, i5);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new C16021l(bundleCrashlytics);
            case 5:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                String strIsPro9 = null;
                String strIsPro10 = null;
                String strIsPro11 = null;
                String strIsPro12 = null;
                String strIsPro13 = null;
                C16674l c16674l = null;
                C16674l c16674l2 = null;
                while (parcel.dataPosition() < iIsVip6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            strIsPro9 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 2:
                            strIsPro10 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 3:
                            strIsPro11 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 4:
                            strIsPro12 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 5:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i6);
                            break;
                        case 6:
                            c16674l = (C16674l) AbstractC10114l.subs(parcel, i6, C16674l.CREATOR);
                            break;
                        case 7:
                            c16674l2 = (C16674l) AbstractC10114l.subs(parcel, i6, C16674l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i6);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                return new C16051l(strIsPro9, strIsPro10, strIsPro11, strIsPro12, strIsPro13, c16674l, c16674l2);
            case 6:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                C16566l c16566l = null;
                String strIsPro14 = null;
                String strIsPro15 = null;
                C9652l[] c9652lArr = null;
                C13115l[] c13115lArr = null;
                String[] strArrFirebase = null;
                C18504l[] c18504lArr = null;
                while (parcel.dataPosition() < iIsVip7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            c16566l = (C16566l) AbstractC10114l.subs(parcel, i7, C16566l.CREATOR);
                            break;
                        case 2:
                            strIsPro14 = AbstractC10114l.isPro(parcel, i7);
                            break;
                        case 3:
                            strIsPro15 = AbstractC10114l.isPro(parcel, i7);
                            break;
                        case 4:
                            c9652lArr = (C9652l[]) AbstractC10114l.remoteconfig(parcel, i7, C9652l.CREATOR);
                            break;
                        case 5:
                            c13115lArr = (C13115l[]) AbstractC10114l.remoteconfig(parcel, i7, C13115l.CREATOR);
                            break;
                        case 6:
                            strArrFirebase = AbstractC10114l.firebase(parcel, i7);
                            break;
                        case 7:
                            c18504lArr = (C18504l[]) AbstractC10114l.remoteconfig(parcel, i7, C18504l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i7);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                return new C15996l(c16566l, strIsPro14, strIsPro15, c9652lArr, c13115lArr, strArrFirebase, c18504lArr);
            case 7:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                long jPro2 = 0;
                long jPro3 = 0;
                String strIsPro16 = null;
                C16021l c16021l = null;
                String strIsPro17 = null;
                while (parcel.dataPosition() < iIsVip8) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 2) {
                        strIsPro16 = AbstractC10114l.isPro(parcel, i8);
                    } else if (c3 == 3) {
                        c16021l = (C16021l) AbstractC10114l.subs(parcel, i8, C16021l.CREATOR);
                    } else if (c3 == 4) {
                        strIsPro17 = AbstractC10114l.isPro(parcel, i8);
                    } else if (c3 == 5) {
                        jPro2 = AbstractC10114l.pro(parcel, i8);
                    } else if (c3 != 6) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        jPro3 = AbstractC10114l.pro(parcel, i8);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                return new C13236l(strIsPro16, c16021l, strIsPro17, jPro2, jPro3);
            case 8:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                String strIsPro18 = null;
                String strIsPro19 = null;
                String strIsPro20 = null;
                String strIsPro21 = null;
                String strIsPro22 = null;
                String strIsPro23 = null;
                String strIsPro24 = null;
                String strIsPro25 = null;
                String strIsPro26 = null;
                String strIsPro27 = null;
                String strIsPro28 = null;
                String strIsPro29 = null;
                String strIsPro30 = null;
                String strIsPro31 = null;
                while (parcel.dataPosition() < iIsVip9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strIsPro18 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 2:
                            strIsPro19 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 3:
                            strIsPro20 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 4:
                            strIsPro21 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 5:
                            strIsPro22 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 6:
                            strIsPro23 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 7:
                            strIsPro24 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case '\b':
                            strIsPro25 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case '\t':
                            strIsPro26 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case '\n':
                            strIsPro27 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 11:
                            strIsPro28 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case '\f':
                            strIsPro29 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case '\r':
                            strIsPro30 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        case 14:
                            strIsPro31 = AbstractC10114l.isPro(parcel, i9);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i9);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                return new C8894l(strIsPro18, strIsPro19, strIsPro20, strIsPro21, strIsPro22, strIsPro23, strIsPro24, strIsPro25, strIsPro26, strIsPro27, strIsPro28, strIsPro29, strIsPro30, strIsPro31);
            case 9:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                String strIsPro32 = null;
                String strIsPro33 = null;
                while (parcel.dataPosition() < iIsVip10) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iSignature8 = AbstractC10114l.Signature(parcel, i10);
                    } else if (c4 == 2) {
                        strIsPro7 = AbstractC10114l.isPro(parcel, i10);
                    } else if (c4 == 3) {
                        strIsPro32 = AbstractC10114l.isPro(parcel, i10);
                    } else if (c4 != 4) {
                        AbstractC10114l.advert(parcel, i10);
                    } else {
                        strIsPro33 = AbstractC10114l.isPro(parcel, i10);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                return new C13115l(iSignature8, strIsPro7, strIsPro32, strIsPro33);
            case 10:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                double dSubscription2 = 0.0d;
                while (parcel.dataPosition() < iIsVip11) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        dSubscription = AbstractC10114l.subscription(parcel, i11);
                    } else if (c5 != 2) {
                        AbstractC10114l.advert(parcel, i11);
                    } else {
                        dSubscription2 = AbstractC10114l.subscription(parcel, i11);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                return new C17247l(dSubscription, dSubscription2);
            case 11:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                boolean zAdcel5 = false;
                C6729l c6729l = null;
                while (parcel.dataPosition() < iIsVip12) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 2) {
                        zAdcel = AbstractC10114l.adcel(parcel, i12);
                    } else if (c6 == 3) {
                        strIsPro6 = AbstractC10114l.isPro(parcel, i12);
                    } else if (c6 == 4) {
                        zAdcel5 = AbstractC10114l.adcel(parcel, i12);
                    } else if (c6 != 5) {
                        AbstractC10114l.advert(parcel, i12);
                    } else {
                        c6729l = (C6729l) AbstractC10114l.subs(parcel, i12, C6729l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                return new C1901l(zAdcel, strIsPro6, zAdcel5, c6729l);
            case 12:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                long jPro4 = 0;
                String strIsPro34 = null;
                String strIsPro35 = null;
                Integer numLicense = null;
                String strIsPro36 = null;
                while (parcel.dataPosition() < iIsVip13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 2) {
                        strIsPro35 = AbstractC10114l.isPro(parcel, i13);
                    } else if (c7 == 3) {
                        jPro4 = AbstractC10114l.pro(parcel, i13);
                    } else if (c7 == 4) {
                        numLicense = AbstractC10114l.license(parcel, i13);
                    } else if (c7 == 5) {
                        strIsPro36 = AbstractC10114l.isPro(parcel, i13);
                    } else if (c7 != 6) {
                        AbstractC10114l.advert(parcel, i13);
                    } else {
                        strIsPro34 = AbstractC10114l.isPro(parcel, i13);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                Pattern pattern = AbstractC15091l.yandex;
                if (strIsPro34 == null) {
                    jSONObject = null;
                } else {
                    try {
                        jSONObject = new JSONObject(strIsPro34);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                }
                return new MediaError(strIsPro35, jPro4, numLicense, strIsPro36, jSONObject);
            case 13:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                long jPro5 = 0;
                long jPro6 = 0;
                int iSignature15 = 0;
                String strIsPro37 = null;
                String strIsPro38 = null;
                C1056l c1056l = null;
                ArrayList arrayListVip2 = null;
                C13727l c13727l = null;
                String strIsPro39 = null;
                ArrayList arrayListVip3 = null;
                ArrayList arrayListVip4 = null;
                String strIsPro40 = null;
                C16640l c16640l = null;
                String strIsPro41 = null;
                String strIsPro42 = null;
                String strIsPro43 = null;
                String strIsPro44 = null;
                while (parcel.dataPosition() < iIsVip14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strIsPro37 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case 3:
                            iSignature15 = AbstractC10114l.Signature(parcel, i14);
                            break;
                        case 4:
                            strIsPro38 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case 5:
                            c1056l = (C1056l) AbstractC10114l.subs(parcel, i14, C1056l.CREATOR);
                            break;
                        case 6:
                            jPro5 = AbstractC10114l.pro(parcel, i14);
                            break;
                        case 7:
                            arrayListVip2 = AbstractC10114l.vip(parcel, i14, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            c13727l = (C13727l) AbstractC10114l.subs(parcel, i14, C13727l.CREATOR);
                            break;
                        case '\t':
                            strIsPro39 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case '\n':
                            arrayListVip3 = AbstractC10114l.vip(parcel, i14, C15455l.CREATOR);
                            break;
                        case 11:
                            arrayListVip4 = AbstractC10114l.vip(parcel, i14, C6872l.CREATOR);
                            break;
                        case '\f':
                            strIsPro40 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case '\r':
                            c16640l = (C16640l) AbstractC10114l.subs(parcel, i14, C16640l.CREATOR);
                            break;
                        case 14:
                            jPro6 = AbstractC10114l.pro(parcel, i14);
                            break;
                        case 15:
                            strIsPro41 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case 16:
                            strIsPro42 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            strIsPro43 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            strIsPro44 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i14);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                return new MediaInfo(strIsPro37, iSignature15, strIsPro38, c1056l, jPro5, arrayListVip2, c13727l, strIsPro39, arrayListVip3, arrayListVip4, strIsPro40, c16640l, jPro6, strIsPro41, strIsPro42, strIsPro43, strIsPro44);
            case 14:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                float f = 0.0f;
                boolean zAdcel6 = false;
                boolean zAdcel7 = false;
                boolean zAdcel8 = false;
                byte[] bArrAmazon = null;
                while (parcel.dataPosition() < iIsVip15) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        zAdcel6 = AbstractC10114l.adcel(parcel, i15);
                    } else if (c8 == 2) {
                        bArrAmazon = AbstractC10114l.amazon(parcel, i15);
                    } else if (c8 == 3) {
                        zAdcel7 = AbstractC10114l.adcel(parcel, i15);
                    } else if (c8 == 4) {
                        AbstractC10114l.signatures(parcel, i15, 4);
                        f = parcel.readFloat();
                    } else if (c8 != 5) {
                        AbstractC10114l.advert(parcel, i15);
                    } else {
                        zAdcel8 = AbstractC10114l.adcel(parcel, i15);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                return new C15905l(zAdcel6, bArrAmazon, zAdcel7, f, zAdcel8);
            case 15:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                long jPro7 = 0;
                long jPro8 = 0;
                boolean zAdcel9 = false;
                boolean zAdcel10 = false;
                while (parcel.dataPosition() < iIsVip16) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 2) {
                        jPro7 = AbstractC10114l.pro(parcel, i16);
                    } else if (c9 == 3) {
                        jPro8 = AbstractC10114l.pro(parcel, i16);
                    } else if (c9 == 4) {
                        zAdcel9 = AbstractC10114l.adcel(parcel, i16);
                    } else if (c9 != 5) {
                        AbstractC10114l.advert(parcel, i16);
                    } else {
                        zAdcel10 = AbstractC10114l.adcel(parcel, i16);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                return new C8593l(jPro7, jPro8, zAdcel9, zAdcel10);
            case 16:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                boolean zAdcel11 = false;
                while (true) {
                    float[] fArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iIsVip17) {
                            AbstractC10114l.metrica(parcel, iIsVip17);
                            return new C3434l(fArr, iSignature7, zAdcel11);
                        }
                        int i17 = parcel.readInt();
                        char c10 = (char) i17;
                        if (c10 == 1) {
                            int iAd = AbstractC10114l.ad(parcel, i17);
                            int iDataPosition = parcel.dataPosition();
                            if (iAd == 0) {
                            }
                            float[] fArrCreateFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition + iAd);
                            fArr = fArrCreateFloatArray;
                            break;
                        } else if (c10 == 2) {
                            iSignature7 = AbstractC10114l.Signature(parcel, i17);
                        } else if (c10 != 3) {
                            AbstractC10114l.advert(parcel, i17);
                        } else {
                            zAdcel11 = AbstractC10114l.adcel(parcel, i17);
                        }
                    }
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                Bundle bundleCrashlytics2 = null;
                while (parcel.dataPosition() < iIsVip18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        arrayListVip = AbstractC10114l.vip(parcel, i18, C4259l.CREATOR);
                    } else if (c11 == 3) {
                        bundleCrashlytics2 = AbstractC10114l.crashlytics(parcel, i18);
                    } else if (c11 != 4) {
                        AbstractC10114l.advert(parcel, i18);
                    } else {
                        iSignature6 = AbstractC10114l.Signature(parcel, i18);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C1056l(arrayListVip, bundleCrashlytics2, iSignature6);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip19 = AbstractC10114l.isVip(parcel);
                while (true) {
                    float[] fArr2 = null;
                    while (true) {
                        if (parcel.dataPosition() >= iIsVip19) {
                            AbstractC10114l.metrica(parcel, iIsVip19);
                            return new C18243l(fArr2);
                        }
                        int i19 = parcel.readInt();
                        if (((char) i19) != 1) {
                            AbstractC10114l.advert(parcel, i19);
                        } else {
                            int iAd2 = AbstractC10114l.ad(parcel, i19);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iAd2 == 0) {
                            }
                            float[] fArrCreateFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition2 + iAd2);
                            fArr2 = fArrCreateFloatArray2;
                        }
                        break;
                    }
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip20 = AbstractC10114l.isVip(parcel);
                ArrayList arrayListVip5 = null;
                ArrayList arrayListVip6 = null;
                while (parcel.dataPosition() < iIsVip20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 2) {
                        iSignature5 = AbstractC10114l.Signature(parcel, i20);
                    } else if (c12 == 3) {
                        strIsPro5 = AbstractC10114l.isPro(parcel, i20);
                    } else if (c12 == 4) {
                        arrayListVip5 = AbstractC10114l.vip(parcel, i20, C1056l.CREATOR);
                    } else if (c12 == 5) {
                        arrayListVip6 = AbstractC10114l.vip(parcel, i20, C4259l.CREATOR);
                    } else if (c12 != 6) {
                        AbstractC10114l.advert(parcel, i20);
                    } else {
                        dSubscription = AbstractC10114l.subscription(parcel, i20);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip20);
                C14125l c14125l = new C14125l();
                c14125l.f27622l = iSignature5;
                c14125l.f27621l = strIsPro5;
                c14125l.f27620l = arrayListVip5;
                c14125l.f27624l = arrayListVip6;
                c14125l.f27623l = dSubscription;
                return c14125l;
            case 20:
                int iIsVip21 = AbstractC10114l.isVip(parcel);
                String strIsPro45 = null;
                String strIsPro46 = null;
                String strIsPro47 = null;
                String strIsPro48 = null;
                String strIsPro49 = null;
                String strIsPro50 = null;
                String strIsPro51 = null;
                while (parcel.dataPosition() < iIsVip21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strIsPro45 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 2:
                            strIsPro46 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 3:
                            strIsPro47 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 4:
                            strIsPro48 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 5:
                            strIsPro49 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 6:
                            strIsPro50 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 7:
                            strIsPro51 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i21);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip21);
                return new C16566l(strIsPro45, strIsPro46, strIsPro47, strIsPro48, strIsPro49, strIsPro50, strIsPro51);
            case 21:
                int iIsVip22 = AbstractC10114l.isVip(parcel);
                int iSignature16 = 0;
                int iSignature17 = 0;
                boolean zAdcel12 = false;
                String strIsPro52 = null;
                String strIsPro53 = null;
                C14125l c14125l2 = null;
                ArrayList arrayListVip7 = null;
                while (parcel.dataPosition() < iIsVip22) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strIsPro4 = AbstractC10114l.isPro(parcel, i22);
                            break;
                        case 3:
                            strIsPro52 = AbstractC10114l.isPro(parcel, i22);
                            break;
                        case 4:
                            iSignature4 = AbstractC10114l.Signature(parcel, i22);
                            break;
                        case 5:
                            strIsPro53 = AbstractC10114l.isPro(parcel, i22);
                            break;
                        case 6:
                            c14125l2 = (C14125l) AbstractC10114l.subs(parcel, i22, C14125l.CREATOR);
                            break;
                        case 7:
                            iSignature16 = AbstractC10114l.Signature(parcel, i22);
                            break;
                        case '\b':
                            arrayListVip7 = AbstractC10114l.vip(parcel, i22, C13328l.CREATOR);
                            break;
                        case '\t':
                            iSignature17 = AbstractC10114l.Signature(parcel, i22);
                            break;
                        case '\n':
                            jPro = AbstractC10114l.pro(parcel, i22);
                            break;
                        case 11:
                            zAdcel12 = AbstractC10114l.adcel(parcel, i22);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i22);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip22);
                C8395l c8395l = new C8395l();
                c8395l.f17355l = strIsPro4;
                c8395l.f17354l = strIsPro52;
                c8395l.f17351l = iSignature4;
                c8395l.f17358l = strIsPro53;
                c8395l.f17357l = c14125l2;
                c8395l.f17360l = iSignature16;
                c8395l.f17352l = arrayListVip7;
                c8395l.f17353l = iSignature17;
                c8395l.f17359l = jPro;
                c8395l.f17356l = zAdcel12;
                return c8395l;
            case 22:
                int iIsVip23 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip23) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        iSignature3 = AbstractC10114l.Signature(parcel, i23);
                    } else if (c13 != 2) {
                        AbstractC10114l.advert(parcel, i23);
                    } else {
                        strIsPro3 = AbstractC10114l.isPro(parcel, i23);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip23);
                return new C9652l(iSignature3, strIsPro3);
            case 23:
                int iIsVip24 = AbstractC10114l.isVip(parcel);
                double dSubscription3 = 0.0d;
                double dSubscription4 = 0.0d;
                double dSubscription5 = 0.0d;
                int iSignature18 = 0;
                boolean zAdcel13 = false;
                MediaInfo mediaInfo = null;
                long[] jArrAdmob = null;
                String strIsPro54 = null;
                while (parcel.dataPosition() < iIsVip24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            mediaInfo = (MediaInfo) AbstractC10114l.subs(parcel, i24, MediaInfo.CREATOR);
                            break;
                        case 3:
                            iSignature18 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 4:
                            zAdcel13 = AbstractC10114l.adcel(parcel, i24);
                            break;
                        case 5:
                            dSubscription3 = AbstractC10114l.subscription(parcel, i24);
                            break;
                        case 6:
                            dSubscription4 = AbstractC10114l.subscription(parcel, i24);
                            break;
                        case 7:
                            dSubscription5 = AbstractC10114l.subscription(parcel, i24);
                            break;
                        case '\b':
                            jArrAdmob = AbstractC10114l.admob(parcel, i24);
                            break;
                        case '\t':
                            strIsPro54 = AbstractC10114l.isPro(parcel, i24);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i24);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip24);
                return new C13328l(mediaInfo, iSignature18, zAdcel13, dSubscription3, dSubscription4, dSubscription5, jArrAdmob, strIsPro54);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip25 = AbstractC10114l.isVip(parcel);
                String strIsPro55 = null;
                while (parcel.dataPosition() < iIsVip25) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        strIsPro2 = AbstractC10114l.isPro(parcel, i25);
                    } else if (c14 != 2) {
                        AbstractC10114l.advert(parcel, i25);
                    } else {
                        strIsPro55 = AbstractC10114l.isPro(parcel, i25);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip25);
                return new C11703l(strIsPro2, strIsPro55);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip26 = AbstractC10114l.isVip(parcel);
                double dSubscription6 = 0.0d;
                double dSubscription7 = 0.0d;
                long jPro9 = 0;
                long jPro10 = 0;
                long jPro11 = 0;
                int iSignature19 = 0;
                int iSignature20 = 0;
                int iSignature21 = 0;
                boolean zAdcel14 = false;
                int iSignature22 = 0;
                int iSignature23 = 0;
                int iSignature24 = 0;
                boolean zAdcel15 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArrAdmob2 = null;
                String strIsPro56 = null;
                ArrayList arrayListVip8 = null;
                C5209l c5209l = null;
                C3133l c3133l = null;
                C8593l c8593l = null;
                C8395l c8395l2 = null;
                while (parcel.dataPosition() < iIsVip26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            mediaInfo2 = (MediaInfo) AbstractC10114l.subs(parcel, i26, MediaInfo.CREATOR);
                            break;
                        case 3:
                            jPro9 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case 4:
                            iSignature19 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 5:
                            dSubscription6 = AbstractC10114l.subscription(parcel, i26);
                            break;
                        case 6:
                            iSignature20 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 7:
                            iSignature21 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case '\b':
                            jPro10 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case '\t':
                            jPro11 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case '\n':
                            dSubscription7 = AbstractC10114l.subscription(parcel, i26);
                            break;
                        case 11:
                            zAdcel14 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\f':
                            jArrAdmob2 = AbstractC10114l.admob(parcel, i26);
                            break;
                        case '\r':
                            iSignature22 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 14:
                            iSignature23 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 15:
                            strIsPro56 = AbstractC10114l.isPro(parcel, i26);
                            break;
                        case 16:
                            iSignature24 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            arrayListVip8 = AbstractC10114l.vip(parcel, i26, C13328l.CREATOR);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            zAdcel15 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            c5209l = (C5209l) AbstractC10114l.subs(parcel, i26, C5209l.CREATOR);
                            break;
                        case 20:
                            c3133l = (C3133l) AbstractC10114l.subs(parcel, i26, C3133l.CREATOR);
                            break;
                        case 21:
                            c8593l = (C8593l) AbstractC10114l.subs(parcel, i26, C8593l.CREATOR);
                            break;
                        case 22:
                            c8395l2 = (C8395l) AbstractC10114l.subs(parcel, i26, C8395l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i26);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip26);
                return new C10184l(mediaInfo2, jPro9, iSignature19, dSubscription6, iSignature20, iSignature21, jPro10, jPro11, dSubscription7, zAdcel14, jArrAdmob2, iSignature22, iSignature23, strIsPro56, iSignature24, arrayListVip8, zAdcel15, c5209l, c3133l, c8593l, c8395l2);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip27 = AbstractC10114l.isVip(parcel);
                boolean zAdcel16 = true;
                int iSignature25 = 0;
                int iSignature26 = 0;
                while (parcel.dataPosition() < iIsVip27) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 1) {
                        iSignature2 = AbstractC10114l.Signature(parcel, i27);
                    } else if (c15 == 2) {
                        iSignature25 = AbstractC10114l.Signature(parcel, i27);
                    } else if (c15 == 3) {
                        iSignature26 = AbstractC10114l.Signature(parcel, i27);
                    } else if (c15 != 4) {
                        AbstractC10114l.advert(parcel, i27);
                    } else {
                        zAdcel16 = AbstractC10114l.adcel(parcel, i27);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip27);
                return new C17913l(iSignature2, iSignature25, iSignature26, zAdcel16);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip28 = AbstractC10114l.isVip(parcel);
                long jPro12 = 0;
                long jPro13 = 0;
                long jPro14 = 0;
                String strIsPro57 = null;
                String strIsPro58 = null;
                while (parcel.dataPosition() < iIsVip28) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 2) {
                        jPro12 = AbstractC10114l.pro(parcel, i28);
                    } else if (c16 == 3) {
                        jPro13 = AbstractC10114l.pro(parcel, i28);
                    } else if (c16 == 4) {
                        strIsPro57 = AbstractC10114l.isPro(parcel, i28);
                    } else if (c16 == 5) {
                        strIsPro58 = AbstractC10114l.isPro(parcel, i28);
                    } else if (c16 != 6) {
                        AbstractC10114l.advert(parcel, i28);
                    } else {
                        jPro14 = AbstractC10114l.pro(parcel, i28);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip28);
                return new C5209l(jPro12, jPro13, strIsPro57, strIsPro58, jPro14);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int iIsVip29 = AbstractC10114l.isVip(parcel);
                String strIsPro59 = null;
                while (parcel.dataPosition() < iIsVip29) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        strIsPro = AbstractC10114l.isPro(parcel, i29);
                    } else if (c17 != 2) {
                        AbstractC10114l.advert(parcel, i29);
                    } else {
                        strIsPro59 = AbstractC10114l.isPro(parcel, i29);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip29);
                return new C12330l(strIsPro, strIsPro59);
            default:
                int iIsVip30 = AbstractC10114l.isVip(parcel);
                long jPro15 = 0;
                int iSignature27 = 0;
                int iSignature28 = 0;
                String strIsPro60 = null;
                String strIsPro61 = null;
                String strIsPro62 = null;
                String strIsPro63 = null;
                String strIsPro64 = null;
                ArrayList arrayListSmaato = null;
                while (parcel.dataPosition() < iIsVip30) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            jPro15 = AbstractC10114l.pro(parcel, i30);
                            break;
                        case 3:
                            iSignature27 = AbstractC10114l.Signature(parcel, i30);
                            break;
                        case 4:
                            strIsPro61 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        case 5:
                            strIsPro62 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        case 6:
                            strIsPro63 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        case 7:
                            strIsPro64 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        case '\b':
                            iSignature28 = AbstractC10114l.Signature(parcel, i30);
                            break;
                        case '\t':
                            arrayListSmaato = AbstractC10114l.smaato(parcel, i30);
                            break;
                        case '\n':
                            strIsPro60 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i30);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip30);
                Pattern pattern2 = AbstractC15091l.yandex;
                if (strIsPro60 == null) {
                    jSONObject2 = null;
                } else {
                    try {
                        jSONObject2 = new JSONObject(strIsPro60);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                }
                return new MediaTrack(jPro15, iSignature27, strIsPro61, strIsPro62, strIsPro63, strIsPro64, iSignature28, arrayListSmaato, jSONObject2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C15194l[i];
            case 1:
                return new C17840l[i];
            case 2:
                return new C15349l[i];
            case 3:
                return new C16674l[i];
            case 4:
                return new C16021l[i];
            case 5:
                return new C16051l[i];
            case 6:
                return new C15996l[i];
            case 7:
                return new C13236l[i];
            case 8:
                return new C8894l[i];
            case 9:
                return new C13115l[i];
            case 10:
                return new C17247l[i];
            case 11:
                return new C1901l[i];
            case 12:
                return new MediaError[i];
            case 13:
                return new MediaInfo[i];
            case 14:
                return new C15905l[i];
            case 15:
                return new C8593l[i];
            case 16:
                return new C3434l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C1056l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18243l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14125l[i];
            case 20:
                return new C16566l[i];
            case 21:
                return new C8395l[i];
            case 22:
                return new C9652l[i];
            case 23:
                return new C13328l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C11703l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C10184l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C17913l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C5209l[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C12330l[i];
            default:
                return new MediaTrack[i];
        }
    }
}
