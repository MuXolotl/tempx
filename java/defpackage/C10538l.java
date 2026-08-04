package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَِۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10538l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10538l(int i) {
        this.yandex = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iSignature = 0;
        int iSignature2 = 0;
        int iSignature3 = 0;
        int iSignature4 = 0;
        boolean zAdcel = false;
        int iSignature5 = 0;
        int iSignature6 = 0;
        int iSignature7 = 0;
        boolean zAdcel2 = false;
        InterfaceC0041l interfaceC0041l = null;
        Intent intent = null;
        Account account = null;
        C10602l c10602l = null;
        C10742l c10742l = null;
        ArrayList arrayListSmaato = null;
        Uri uri = null;
        ArrayList arrayListVip = null;
        Intent intent2 = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListVip2 = null;
        switch (this.yandex) {
            case 0:
                return new C10703l(parcel.readLong());
            case 1:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f43l = parcel.readInt();
                parcelableVolumeInfo.f41l = parcel.readInt();
                parcelableVolumeInfo.f45l = parcel.readInt();
                parcelableVolumeInfo.f44l = parcel.readInt();
                parcelableVolumeInfo.f42l = parcel.readInt();
                return parcelableVolumeInfo;
            case 2:
                return new C16830l(parcel);
            case 3:
                return new PlaybackStateCompat(parcel);
            case 4:
                return new C5388l(parcel);
            case 5:
                return new C10388l(parcel.readInt(), parcel.readFloat());
            case 6:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 7:
                C1102l c1102l = new C1102l();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = BinderC6847l.billing;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0041l.amazon);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0041l)) {
                        C0073l c0073l = new C0073l();
                        c0073l.purchase = strongBinder;
                        interfaceC0041l = c0073l;
                    } else {
                        interfaceC0041l = (InterfaceC0041l) iInterfaceQueryLocalInterface;
                    }
                }
                c1102l.f3039l = interfaceC0041l;
                return c1102l;
            case 8:
                C14902l c14902l = new C14902l();
                c14902l.f29313l = parcel.readInt();
                c14902l.f29312l = parcel.readInt();
                c14902l.f29314l = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    c14902l.f29311l = iArr;
                    parcel.readIntArray(iArr);
                }
                return c14902l;
            case 9:
                C5278l c5278l = new C5278l();
                c5278l.f11383l = parcel.readInt();
                c5278l.f11382l = parcel.readInt();
                int i3 = parcel.readInt();
                c5278l.f11379l = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    c5278l.f11386l = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                c5278l.f11385l = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    c5278l.f11388l = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c5278l.f11381l = parcel.readInt() == 1;
                c5278l.f11387l = parcel.readInt() == 1;
                c5278l.f11384l = parcel.readInt() == 1;
                c5278l.f11380l = parcel.readArrayList(C14902l.class.getClassLoader());
                return c5278l;
            case 10:
                return new C17945l(parcel);
            case 11:
                return new C9244l(parcel);
            case 12:
                int iIsVip = AbstractC10114l.isVip(parcel);
                int iSignature8 = 0;
                while (parcel.dataPosition() < iIsVip) {
                    int i5 = parcel.readInt();
                    char c = (char) i5;
                    if (c == 1) {
                        zAdcel2 = AbstractC10114l.adcel(parcel, i5);
                    } else if (c != 2) {
                        AbstractC10114l.advert(parcel, i5);
                    } else {
                        iSignature8 = AbstractC10114l.Signature(parcel, i5);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C5156l(zAdcel2, iSignature8);
            case 13:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                int iSignature9 = 0;
                boolean zAdcel3 = false;
                boolean zAdcel4 = false;
                IBinder iBinderTapsense = null;
                C10602l c10602l2 = null;
                while (parcel.dataPosition() < iIsVip2) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        iSignature9 = AbstractC10114l.Signature(parcel, i6);
                    } else if (c2 == 2) {
                        iBinderTapsense = AbstractC10114l.tapsense(parcel, i6);
                    } else if (c2 == 3) {
                        c10602l2 = (C10602l) AbstractC10114l.subs(parcel, i6, C10602l.CREATOR);
                    } else if (c2 == 4) {
                        zAdcel3 = AbstractC10114l.adcel(parcel, i6);
                    } else if (c2 != 5) {
                        AbstractC10114l.advert(parcel, i6);
                    } else {
                        zAdcel4 = AbstractC10114l.adcel(parcel, i6);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                return new C16785l(iSignature9, iBinderTapsense, c10602l2, zAdcel3, zAdcel4);
            case 14:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip3) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iSignature7 = AbstractC10114l.Signature(parcel, i7);
                    } else if (c3 != 2) {
                        AbstractC10114l.advert(parcel, i7);
                    } else {
                        arrayListVip2 = AbstractC10114l.vip(parcel, i7, C0152l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                return new C12798l(iSignature7, arrayListVip2);
            case 15:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip4) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC10114l.subs(parcel, i8, PendingIntent.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                return new C2571l(pendingIntent);
            case 16:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                int iSignature10 = 0;
                while (parcel.dataPosition() < iIsVip5) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        iSignature6 = AbstractC10114l.Signature(parcel, i9);
                    } else if (c4 == 2) {
                        iSignature10 = AbstractC10114l.Signature(parcel, i9);
                    } else if (c4 != 3) {
                        AbstractC10114l.advert(parcel, i9);
                    } else {
                        intent2 = (Intent) AbstractC10114l.subs(parcel, i9, Intent.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new C18631l(iSignature6, iSignature10, intent2);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                long jPro = 0;
                String strIsPro = null;
                String strIsPro2 = null;
                String strIsPro3 = null;
                String strIsPro4 = null;
                Uri uri2 = null;
                String strIsPro5 = null;
                String strIsPro6 = null;
                ArrayList arrayListVip3 = null;
                String strIsPro7 = null;
                String strIsPro8 = null;
                while (parcel.dataPosition() < iIsVip6) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strIsPro = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 3:
                            strIsPro2 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 4:
                            strIsPro3 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 5:
                            strIsPro4 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 6:
                            uri2 = (Uri) AbstractC10114l.subs(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strIsPro5 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case '\b':
                            jPro = AbstractC10114l.pro(parcel, i10);
                            break;
                        case '\t':
                            strIsPro6 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case '\n':
                            arrayListVip3 = AbstractC10114l.vip(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strIsPro7 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case '\f':
                            strIsPro8 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i10);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                return new GoogleSignInAccount(strIsPro, strIsPro2, strIsPro3, strIsPro4, uri2, strIsPro5, jPro, strIsPro6, arrayListVip3, strIsPro7, strIsPro8);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                long jPro2 = 0;
                int iSignature11 = 0;
                int iSignature12 = 0;
                boolean zAdcel5 = false;
                String strIsPro9 = null;
                while (parcel.dataPosition() < iIsVip7) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iSignature11 = AbstractC10114l.Signature(parcel, i11);
                    } else if (c5 == 2) {
                        strIsPro9 = AbstractC10114l.isPro(parcel, i11);
                    } else if (c5 == 3) {
                        jPro2 = AbstractC10114l.pro(parcel, i11);
                    } else if (c5 == 4) {
                        iSignature12 = AbstractC10114l.Signature(parcel, i11);
                    } else if (c5 != 5) {
                        AbstractC10114l.advert(parcel, i11);
                    } else {
                        zAdcel5 = AbstractC10114l.adcel(parcel, i11);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                return new C18466l(iSignature11, iSignature12, jPro2, strIsPro9, zAdcel5);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                boolean zAdcel6 = false;
                while (parcel.dataPosition() < iIsVip8) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iSignature5 = AbstractC10114l.Signature(parcel, i12);
                    } else if (c6 != 2) {
                        AbstractC10114l.advert(parcel, i12);
                    } else {
                        zAdcel6 = AbstractC10114l.adcel(parcel, i12);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                return new C0925l(iSignature5, zAdcel6);
            case 20:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                String strIsPro10 = null;
                String strIsPro11 = null;
                while (parcel.dataPosition() < iIsVip9) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        arrayListVip = AbstractC10114l.vip(parcel, i13, C9138l.CREATOR);
                    } else if (c7 == 2) {
                        zAdcel = AbstractC10114l.adcel(parcel, i13);
                    } else if (c7 == 3) {
                        strIsPro10 = AbstractC10114l.isPro(parcel, i13);
                    } else if (c7 != 4) {
                        AbstractC10114l.advert(parcel, i13);
                    } else {
                        strIsPro11 = AbstractC10114l.isPro(parcel, i13);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                return new C7794l(arrayListVip, zAdcel, strIsPro10, strIsPro11);
            case 21:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                int iSignature13 = 0;
                int iSignature14 = 0;
                while (parcel.dataPosition() < iIsVip10) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iSignature4 = AbstractC10114l.Signature(parcel, i14);
                    } else if (c8 == 2) {
                        uri = (Uri) AbstractC10114l.subs(parcel, i14, Uri.CREATOR);
                    } else if (c8 == 3) {
                        iSignature13 = AbstractC10114l.Signature(parcel, i14);
                    } else if (c8 != 4) {
                        AbstractC10114l.advert(parcel, i14);
                    } else {
                        iSignature14 = AbstractC10114l.Signature(parcel, i14);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                return new C4259l(iSignature4, uri, iSignature13, iSignature14);
            case 22:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                String strIsPro12 = null;
                while (parcel.dataPosition() < iIsVip11) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        arrayListSmaato = AbstractC10114l.smaato(parcel, i15);
                    } else if (c9 != 2) {
                        AbstractC10114l.advert(parcel, i15);
                    } else {
                        strIsPro12 = AbstractC10114l.isPro(parcel, i15);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                return new C4403l(strIsPro12, arrayListSmaato);
            case 23:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip12) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        iSignature3 = AbstractC10114l.Signature(parcel, i16);
                    } else if (c10 != 2) {
                        AbstractC10114l.advert(parcel, i16);
                    } else {
                        c10742l = (C10742l) AbstractC10114l.subs(parcel, i16, C10742l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                return new C4078l(iSignature3, c10742l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                C16785l c16785l = null;
                while (parcel.dataPosition() < iIsVip13) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iSignature2 = AbstractC10114l.Signature(parcel, i17);
                    } else if (c11 == 2) {
                        c10602l = (C10602l) AbstractC10114l.subs(parcel, i17, C10602l.CREATOR);
                    } else if (c11 != 3) {
                        AbstractC10114l.advert(parcel, i17);
                    } else {
                        c16785l = (C16785l) AbstractC10114l.subs(parcel, i17, C16785l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                return new C8074l(iSignature2, c10602l, c16785l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                int iSignature15 = -1;
                long jPro3 = 0;
                long jPro4 = 0;
                int iSignature16 = 0;
                int iSignature17 = 0;
                int iSignature18 = 0;
                int iSignature19 = 0;
                String strIsPro13 = null;
                String strIsPro14 = null;
                while (parcel.dataPosition() < iIsVip14) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iSignature16 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case 2:
                            iSignature17 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case 3:
                            iSignature18 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case 4:
                            jPro3 = AbstractC10114l.pro(parcel, i18);
                            break;
                        case 5:
                            jPro4 = AbstractC10114l.pro(parcel, i18);
                            break;
                        case 6:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case 7:
                            strIsPro14 = AbstractC10114l.isPro(parcel, i18);
                            break;
                        case '\b':
                            iSignature19 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        case '\t':
                            iSignature15 = AbstractC10114l.Signature(parcel, i18);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i18);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                return new C0152l(iSignature16, iSignature17, iSignature18, jPro3, jPro4, strIsPro13, strIsPro14, iSignature19, iSignature15);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                int iSignature20 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iIsVip15) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iSignature = AbstractC10114l.Signature(parcel, i19);
                    } else if (c12 == 2) {
                        account = (Account) AbstractC10114l.subs(parcel, i19, Account.CREATOR);
                    } else if (c12 == 3) {
                        iSignature20 = AbstractC10114l.Signature(parcel, i19);
                    } else if (c12 != 4) {
                        AbstractC10114l.advert(parcel, i19);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC10114l.subs(parcel, i19, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                return new C10742l(iSignature, account, iSignature20, googleSignInAccount);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                long jPro5 = 0;
                long jPro6 = 0;
                String strIsPro15 = null;
                String strIsPro16 = null;
                String strIsPro17 = null;
                String strIsPro18 = null;
                String strIsPro19 = null;
                String strIsPro20 = null;
                String strIsPro21 = null;
                String strIsPro22 = null;
                String strIsPro23 = null;
                C16640l c16640l = null;
                while (parcel.dataPosition() < iIsVip16) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strIsPro15 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 3:
                            strIsPro16 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 4:
                            jPro5 = AbstractC10114l.pro(parcel, i20);
                            break;
                        case 5:
                            strIsPro17 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 6:
                            strIsPro18 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 7:
                            strIsPro19 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\b':
                            strIsPro20 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\t':
                            strIsPro21 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\n':
                            strIsPro22 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case 11:
                            jPro6 = AbstractC10114l.pro(parcel, i20);
                            break;
                        case '\f':
                            strIsPro23 = AbstractC10114l.isPro(parcel, i20);
                            break;
                        case '\r':
                            c16640l = (C16640l) AbstractC10114l.subs(parcel, i20, C16640l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i20);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                return new C6872l(strIsPro15, strIsPro16, jPro5, strIsPro17, strIsPro18, strIsPro19, strIsPro20, strIsPro21, strIsPro22, jPro6, strIsPro23, c16640l);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                boolean zAdcel7 = false;
                boolean zAdcel8 = false;
                String strIsPro24 = null;
                String strIsPro25 = null;
                IBinder iBinderTapsense2 = null;
                C16657l c16657l = null;
                while (parcel.dataPosition() < iIsVip17) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            strIsPro24 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 3:
                            strIsPro25 = AbstractC10114l.isPro(parcel, i21);
                            break;
                        case 4:
                            iBinderTapsense2 = AbstractC10114l.tapsense(parcel, i21);
                            break;
                        case 5:
                            c16657l = (C16657l) AbstractC10114l.subs(parcel, i21, C16657l.CREATOR);
                            break;
                        case 6:
                            zAdcel7 = AbstractC10114l.adcel(parcel, i21);
                            break;
                        case 7:
                            zAdcel8 = AbstractC10114l.adcel(parcel, i21);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i21);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip17);
                return new C4465l(strIsPro24, strIsPro25, iBinderTapsense2, c16657l, zAdcel7, zAdcel8);
            default:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip18) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        AbstractC10114l.advert(parcel, i22);
                    } else {
                        intent = (Intent) AbstractC10114l.subs(parcel, i22, Intent.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C2220l(intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C10703l[i];
            case 1:
                return new ParcelableVolumeInfo[i];
            case 2:
                return new C16830l[i];
            case 3:
                return new PlaybackStateCompat[i];
            case 4:
                return new C5388l[i];
            case 5:
                return new C10388l[i];
            case 6:
                return new RatingCompat[i];
            case 7:
                return new C1102l[i];
            case 8:
                return new C14902l[i];
            case 9:
                return new C5278l[i];
            case 10:
                return new C17945l[i];
            case 11:
                return new C9244l[i];
            case 12:
                return new C5156l[i];
            case 13:
                return new C16785l[i];
            case 14:
                return new C12798l[i];
            case 15:
                return new C2571l[i];
            case 16:
                return new C18631l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new GoogleSignInAccount[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18466l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C0925l[i];
            case 20:
                return new C7794l[i];
            case 21:
                return new C4259l[i];
            case 22:
                return new C4403l[i];
            case 23:
                return new C4078l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C8074l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0152l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C10742l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C6872l[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C4465l[i];
            default:
                return new C2220l[i];
        }
    }
}
