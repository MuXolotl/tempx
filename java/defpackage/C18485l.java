package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.api.Scope;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18485l implements Parcelable.Creator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C18485l(int i) {
        this.yandex = i;
    }

    public static void yandex(C7613l c7613l, Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = c7613l.f15673l;
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = c7613l.f15672l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = c7613l.f15669l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i4);
        AbstractC9968l.vip(parcel, 4, c7613l.f15676l);
        AbstractC9968l.admob(parcel, 5, c7613l.f15675l);
        AbstractC9968l.adcel(parcel, 6, c7613l.f15679l, i);
        AbstractC9968l.purchase(parcel, 7, c7613l.f15670l);
        AbstractC9968l.remoteconfig(parcel, 8, c7613l.f15671l, i);
        AbstractC9968l.adcel(parcel, 10, c7613l.f15678l, i);
        AbstractC9968l.adcel(parcel, 11, c7613l.f15674l, i);
        boolean z = c7613l.f15680l;
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c7613l.f15677l;
        AbstractC9968l.subscription(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = c7613l.f15668l;
        AbstractC9968l.subscription(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC9968l.vip(parcel, 15, c7613l.f15681l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC5700l c10911l;
        C10293l c10293l;
        long jPro = 0;
        boolean zAdcel = true;
        int iSignature = 0;
        int iSignature2 = 0;
        int iSignature3 = 0;
        boolean zAdcel2 = false;
        int iSignature4 = 0;
        int iSignature5 = 0;
        boolean zAdcel3 = false;
        boolean zAdcel4 = false;
        int iSignature6 = 0;
        int iSignature7 = 0;
        int iSignature8 = 0;
        int iSignature9 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListMopub = null;
        String strIsPro = null;
        Bundle bundleCrashlytics = null;
        ArrayList arrayListVip = null;
        String strIsPro2 = null;
        byte[] bArrAmazon = null;
        C4153l[] c4153lArr = null;
        String strIsPro3 = null;
        byte[] bArrAmazon2 = null;
        InterfaceC11948l c3807l = null;
        switch (this.yandex) {
            case 0:
                int iIsVip = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) AbstractC10114l.subs(parcel, i, ParcelFileDescriptor.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                C16917l c16917l = new C16917l();
                c16917l.f32994l = new byte[0];
                c16917l.f32993l = parcelFileDescriptor;
                if (parcelFileDescriptor != null) {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                    try {
                        try {
                            byte[] bArr = new byte[dataInputStream.readInt()];
                            dataInputStream.read(bArr);
                            C16917l.billing(dataInputStream);
                            c16917l.f32994l = bArr;
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not read from parcel file descriptor", e);
                        }
                    } catch (Throwable th) {
                        C16917l.billing(dataInputStream);
                        throw th;
                    }
                }
                return c16917l;
            case 1:
                int iIsVip2 = AbstractC10114l.isVip(parcel);
                long jPro2 = -1;
                long jPro3 = 0;
                long jPro4 = 0;
                Uri uri = null;
                byte[] bArrAmazon3 = null;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                String strIsPro4 = null;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                C16917l c16917l2 = null;
                String strIsPro5 = null;
                String strIsPro6 = null;
                boolean zAdcel5 = false;
                while (parcel.dataPosition() < iIsVip2) {
                    int i2 = parcel.readInt();
                    boolean z = zAdcel5;
                    switch ((char) i2) {
                        case 1:
                            jPro = AbstractC10114l.pro(parcel, i2);
                            break;
                        case 2:
                            iSignature = AbstractC10114l.Signature(parcel, i2);
                            break;
                        case 3:
                            bArrAmazon3 = AbstractC10114l.amazon(parcel, i2);
                            break;
                        case 4:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC10114l.subs(parcel, i2, ParcelFileDescriptor.CREATOR);
                            break;
                        case 5:
                            strIsPro4 = AbstractC10114l.isPro(parcel, i2);
                            break;
                        case 6:
                            jPro2 = AbstractC10114l.pro(parcel, i2);
                            break;
                        case 7:
                            parcelFileDescriptor3 = (ParcelFileDescriptor) AbstractC10114l.subs(parcel, i2, ParcelFileDescriptor.CREATOR);
                            break;
                        case '\b':
                            uri = (Uri) AbstractC10114l.subs(parcel, i2, Uri.CREATOR);
                            break;
                        case '\t':
                            jPro3 = AbstractC10114l.pro(parcel, i2);
                            break;
                        case '\n':
                            zAdcel5 = AbstractC10114l.adcel(parcel, i2);
                            continue;
                        case 11:
                            c16917l2 = (C16917l) AbstractC10114l.subs(parcel, i2, C16917l.CREATOR);
                            break;
                        case '\f':
                            jPro4 = AbstractC10114l.pro(parcel, i2);
                            break;
                        case '\r':
                            strIsPro5 = AbstractC10114l.isPro(parcel, i2);
                            break;
                        case 14:
                            strIsPro6 = AbstractC10114l.isPro(parcel, i2);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i2);
                            break;
                    }
                    zAdcel5 = z;
                }
                AbstractC10114l.metrica(parcel, iIsVip2);
                C17484l c17484l = new C17484l();
                c17484l.f34059l = jPro;
                c17484l.f34058l = iSignature;
                c17484l.f34055l = bArrAmazon3;
                c17484l.f34062l = parcelFileDescriptor2;
                c17484l.f34061l = strIsPro4;
                c17484l.f34065l = jPro2;
                c17484l.f34056l = parcelFileDescriptor3;
                c17484l.f34057l = uri;
                c17484l.f34064l = jPro3;
                c17484l.f34060l = zAdcel5;
                c17484l.f34066l = c16917l2;
                c17484l.f34063l = jPro4;
                c17484l.f34054l = strIsPro5;
                c17484l.f34067l = strIsPro6;
                return c17484l;
            case 2:
                int iIsVip3 = AbstractC10114l.isVip(parcel);
                int iSignature10 = 0;
                IBinder iBinderTapsense = null;
                IBinder iBinderTapsense2 = null;
                IBinder iBinderTapsense3 = null;
                String strIsPro7 = null;
                String strIsPro8 = null;
                byte[] bArrAmazon4 = null;
                IBinder iBinderTapsense4 = null;
                byte[] bArrAmazon5 = null;
                C10119l c10119l = null;
                C9369l c9369l = null;
                C8495l c8495l = null;
                byte[] bArrAmazon6 = null;
                String strIsPro9 = null;
                while (parcel.dataPosition() < iIsVip3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iBinderTapsense = AbstractC10114l.tapsense(parcel, i3);
                            break;
                        case 2:
                            iBinderTapsense2 = AbstractC10114l.tapsense(parcel, i3);
                            break;
                        case 3:
                            iBinderTapsense3 = AbstractC10114l.tapsense(parcel, i3);
                            break;
                        case 4:
                            strIsPro7 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case 5:
                            strIsPro8 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case 6:
                            bArrAmazon4 = AbstractC10114l.amazon(parcel, i3);
                            break;
                        case 7:
                            iBinderTapsense4 = AbstractC10114l.tapsense(parcel, i3);
                            break;
                        case '\b':
                            bArrAmazon5 = AbstractC10114l.amazon(parcel, i3);
                            break;
                        case '\t':
                            c10119l = (C10119l) AbstractC10114l.subs(parcel, i3, C10119l.CREATOR);
                            break;
                        case '\n':
                            iSignature10 = AbstractC10114l.Signature(parcel, i3);
                            break;
                        case 11:
                            c9369l = (C9369l) AbstractC10114l.subs(parcel, i3, C9369l.CREATOR);
                            break;
                        case '\f':
                            bArrAmazon6 = AbstractC10114l.amazon(parcel, i3);
                            break;
                        case '\r':
                            strIsPro9 = AbstractC10114l.isPro(parcel, i3);
                            break;
                        case 14:
                            c8495l = (C8495l) AbstractC10114l.subs(parcel, i3, C8495l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i3);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip3);
                return new C7441l(iBinderTapsense, iBinderTapsense2, iBinderTapsense3, strIsPro7, strIsPro8, bArrAmazon4, iBinderTapsense4, bArrAmazon5, c10119l, iSignature10, c9369l, c8495l, bArrAmazon6, strIsPro9);
            case 3:
                int iIsVip4 = AbstractC10114l.isVip(parcel);
                IBinder iBinderTapsense5 = null;
                IBinder iBinderTapsense6 = null;
                String strIsPro10 = null;
                String strIsPro11 = null;
                C13469l c13469l = null;
                IBinder iBinderTapsense7 = null;
                byte[] bArrAmazon7 = null;
                while (parcel.dataPosition() < iIsVip4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iBinderTapsense5 = AbstractC10114l.tapsense(parcel, i4);
                            break;
                        case 2:
                            iBinderTapsense6 = AbstractC10114l.tapsense(parcel, i4);
                            break;
                        case 3:
                            strIsPro10 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case 4:
                            strIsPro11 = AbstractC10114l.isPro(parcel, i4);
                            break;
                        case 5:
                            jPro = AbstractC10114l.pro(parcel, i4);
                            break;
                        case 6:
                            c13469l = (C13469l) AbstractC10114l.subs(parcel, i4, C13469l.CREATOR);
                            break;
                        case 7:
                            iBinderTapsense7 = AbstractC10114l.tapsense(parcel, i4);
                            break;
                        case '\b':
                            bArrAmazon7 = AbstractC10114l.amazon(parcel, i4);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i4);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip4);
                if (iBinderTapsense5 == null) {
                    c10911l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderTapsense5.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
                    c10911l = iInterfaceQueryLocalInterface instanceof InterfaceC5700l ? (InterfaceC5700l) iInterfaceQueryLocalInterface : new C10911l(iBinderTapsense5, "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener", 4);
                }
                if (iBinderTapsense6 == null) {
                    c10293l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderTapsense6.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
                    c10293l = iInterfaceQueryLocalInterface2 instanceof C10293l ? (C10293l) iInterfaceQueryLocalInterface2 : new C10293l(iBinderTapsense6, "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback", 4);
                }
                if (iBinderTapsense7 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderTapsense7.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
                    c3807l = iInterfaceQueryLocalInterface3 instanceof InterfaceC11948l ? (InterfaceC11948l) iInterfaceQueryLocalInterface3 : new C3807l(iBinderTapsense7);
                }
                C7935l c7935l = new C7935l();
                c7935l.f16524l = c10911l;
                c7935l.f16523l = c10293l;
                c7935l.f16520l = strIsPro10;
                c7935l.f16526l = strIsPro11;
                c7935l.f16525l = jPro;
                c7935l.f16527l = c13469l;
                c7935l.f16521l = c3807l;
                c7935l.f16522l = bArrAmazon7;
                return c7935l;
            case 4:
                int iIsVip5 = AbstractC10114l.isVip(parcel);
                byte[] bArrAmazon8 = null;
                byte[] bArrAmazon9 = null;
                while (parcel.dataPosition() < iIsVip5) {
                    int i5 = parcel.readInt();
                    char c = (char) i5;
                    if (c == 1) {
                        bArrAmazon2 = AbstractC10114l.amazon(parcel, i5);
                    } else if (c == 2) {
                        bArrAmazon8 = AbstractC10114l.amazon(parcel, i5);
                    } else if (c != 3) {
                        AbstractC10114l.advert(parcel, i5);
                    } else {
                        bArrAmazon9 = AbstractC10114l.amazon(parcel, i5);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip5);
                return new C6179l(bArrAmazon2, bArrAmazon8, bArrAmazon9);
            case 5:
                int iIsVip6 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        AbstractC10114l.advert(parcel, i6);
                    } else {
                        strIsPro3 = AbstractC10114l.isPro(parcel, i6);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip6);
                return new C8332l(strIsPro3);
            case 6:
                int iIsVip7 = AbstractC10114l.isVip(parcel);
                boolean zAdcel6 = false;
                C0906l c0906l = null;
                C8332l c8332l = null;
                byte[] bArrAmazon10 = null;
                ArrayList arrayListVip2 = null;
                ArrayList arrayListVip3 = null;
                ArrayList arrayListVip4 = null;
                C13084l c13084l = null;
                C17459l c17459l = null;
                while (parcel.dataPosition() < iIsVip7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            c0906l = (C0906l) AbstractC10114l.subs(parcel, i7, C0906l.CREATOR);
                            break;
                        case 2:
                            c8332l = (C8332l) AbstractC10114l.subs(parcel, i7, C8332l.CREATOR);
                            break;
                        case 3:
                            bArrAmazon10 = AbstractC10114l.amazon(parcel, i7);
                            break;
                        case 4:
                            zAdcel6 = AbstractC10114l.adcel(parcel, i7);
                            break;
                        case 5:
                            arrayListVip2 = AbstractC10114l.vip(parcel, i7, C15972l.CREATOR);
                            break;
                        case 6:
                            arrayListVip3 = AbstractC10114l.vip(parcel, i7, C8142l.CREATOR);
                            break;
                        case 7:
                            arrayListVip4 = AbstractC10114l.vip(parcel, i7, C6179l.CREATOR);
                            break;
                        case '\b':
                            c13084l = (C13084l) AbstractC10114l.subs(parcel, i7, C13084l.CREATOR);
                            break;
                        case '\t':
                            c17459l = (C17459l) AbstractC10114l.subs(parcel, i7, C17459l.CREATOR);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i7);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip7);
                return new C12884l(c0906l, c8332l, bArrAmazon10, zAdcel6, arrayListVip2, arrayListVip3, arrayListVip4, c13084l, c17459l);
            case 7:
                int iIsVip8 = AbstractC10114l.isVip(parcel);
                String[] strArrFirebase = null;
                while (parcel.dataPosition() < iIsVip8) {
                    int i8 = parcel.readInt();
                    char c2 = (char) i8;
                    if (c2 == 2) {
                        iSignature9 = AbstractC10114l.Signature(parcel, i8);
                    } else if (c2 == 3) {
                        c4153lArr = (C4153l[]) AbstractC10114l.remoteconfig(parcel, i8, C4153l.CREATOR);
                    } else if (c2 != 4) {
                        AbstractC10114l.advert(parcel, i8);
                    } else {
                        strArrFirebase = AbstractC10114l.firebase(parcel, i8);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip8);
                return new C12386l(iSignature9, c4153lArr, strArrFirebase);
            case 8:
                int iIsVip9 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        AbstractC10114l.advert(parcel, i9);
                    } else {
                        iSignature8 = AbstractC10114l.Signature(parcel, i9);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip9);
                return new C17459l(iSignature8);
            case 9:
                int iIsVip10 = AbstractC10114l.isVip(parcel);
                long jPro5 = 0;
                boolean zAdcel7 = false;
                String strIsPro12 = null;
                String strIsPro13 = null;
                C12386l[] c12386lArr = null;
                byte[] bArrAmazon11 = null;
                while (parcel.dataPosition() < iIsVip10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strIsPro12 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 3:
                            strIsPro13 = AbstractC10114l.isPro(parcel, i10);
                            break;
                        case 4:
                            c12386lArr = (C12386l[]) AbstractC10114l.remoteconfig(parcel, i10, C12386l.CREATOR);
                            break;
                        case 5:
                            zAdcel7 = AbstractC10114l.adcel(parcel, i10);
                            break;
                        case 6:
                            bArrAmazon11 = AbstractC10114l.amazon(parcel, i10);
                            break;
                        case 7:
                            jPro5 = AbstractC10114l.pro(parcel, i10);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i10);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip10);
                return new C16346l(strIsPro12, strIsPro13, c12386lArr, zAdcel7, bArrAmazon11, jPro5);
            case 10:
                int iIsVip11 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        AbstractC10114l.advert(parcel, i11);
                    } else {
                        iSignature7 = AbstractC10114l.Signature(parcel, i11);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip11);
                return new C1362l(iSignature7);
            case 11:
                int iIsVip12 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        AbstractC10114l.advert(parcel, i12);
                    } else {
                        bArrAmazon = AbstractC10114l.amazon(parcel, i12);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip12);
                return new C4080l(bArrAmazon);
            case 12:
                int iIsVip13 = AbstractC10114l.isVip(parcel);
                long jPro6 = 0;
                long jPro7 = 0;
                int iSignature11 = 0;
                int iSignature12 = 0;
                int iSignature13 = 0;
                int iSignature14 = 0;
                String strIsPro14 = null;
                String strIsPro15 = null;
                String strIsPro16 = null;
                byte[] bArrAmazon12 = null;
                byte[] bArrAmazon13 = null;
                ArrayList arrayListVip5 = null;
                byte[] bArrAmazon14 = null;
                C12884l c12884l = null;
                String strIsPro17 = null;
                while (parcel.dataPosition() < iIsVip13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            jPro6 = AbstractC10114l.pro(parcel, i13);
                            break;
                        case 2:
                            strIsPro14 = AbstractC10114l.isPro(parcel, i13);
                            break;
                        case 3:
                            iSignature11 = AbstractC10114l.Signature(parcel, i13);
                            break;
                        case 4:
                            strIsPro15 = AbstractC10114l.isPro(parcel, i13);
                            break;
                        case 5:
                            jPro7 = AbstractC10114l.pro(parcel, i13);
                            break;
                        case 6:
                            strIsPro16 = AbstractC10114l.isPro(parcel, i13);
                            break;
                        case 7:
                            bArrAmazon12 = AbstractC10114l.amazon(parcel, i13);
                            break;
                        case '\b':
                            bArrAmazon13 = AbstractC10114l.amazon(parcel, i13);
                            break;
                        case '\t':
                            arrayListVip5 = AbstractC10114l.vip(parcel, i13, C1362l.CREATOR);
                            break;
                        case '\n':
                            iSignature12 = AbstractC10114l.Signature(parcel, i13);
                            break;
                        case 11:
                            bArrAmazon14 = AbstractC10114l.amazon(parcel, i13);
                            break;
                        case '\f':
                            c12884l = (C12884l) AbstractC10114l.subs(parcel, i13, C12884l.CREATOR);
                            break;
                        case '\r':
                            iSignature13 = AbstractC10114l.Signature(parcel, i13);
                            break;
                        case 14:
                            iSignature14 = AbstractC10114l.Signature(parcel, i13);
                            break;
                        case 15:
                            strIsPro17 = AbstractC10114l.isPro(parcel, i13);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i13);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip13);
                return new C9369l(jPro6, strIsPro14, iSignature11, strIsPro15, jPro7, strIsPro16, bArrAmazon12, bArrAmazon13, arrayListVip5, iSignature12, bArrAmazon14, c12884l, iSignature13, iSignature14, strIsPro17);
            case 13:
                int iIsVip14 = AbstractC10114l.isVip(parcel);
                String strIsPro18 = null;
                byte[] bArrAmazon15 = null;
                byte[][] bArrPurchase = null;
                byte[][] bArrPurchase2 = null;
                byte[][] bArrPurchase3 = null;
                byte[][] bArrPurchase4 = null;
                int[] iArrBilling = null;
                byte[][] bArrPurchase5 = null;
                int[] iArrBilling2 = null;
                byte[][] bArrPurchase6 = null;
                while (parcel.dataPosition() < iIsVip14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strIsPro18 = AbstractC10114l.isPro(parcel, i14);
                            break;
                        case 3:
                            bArrAmazon15 = AbstractC10114l.amazon(parcel, i14);
                            break;
                        case 4:
                            bArrPurchase = AbstractC10114l.purchase(parcel, i14);
                            break;
                        case 5:
                            bArrPurchase2 = AbstractC10114l.purchase(parcel, i14);
                            break;
                        case 6:
                            bArrPurchase3 = AbstractC10114l.purchase(parcel, i14);
                            break;
                        case 7:
                            bArrPurchase4 = AbstractC10114l.purchase(parcel, i14);
                            break;
                        case '\b':
                            iArrBilling = AbstractC10114l.billing(parcel, i14);
                            break;
                        case '\t':
                            bArrPurchase5 = AbstractC10114l.purchase(parcel, i14);
                            break;
                        case '\n':
                            iArrBilling2 = AbstractC10114l.billing(parcel, i14);
                            break;
                        case 11:
                            bArrPurchase6 = AbstractC10114l.purchase(parcel, i14);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i14);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip14);
                return new C5824l(strIsPro18, bArrAmazon15, bArrPurchase, bArrPurchase2, bArrPurchase3, bArrPurchase4, iArrBilling, bArrPurchase5, iArrBilling2, bArrPurchase6);
            case 14:
                int iIsVip15 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC10114l.advert(parcel, i15);
                    } else {
                        iSignature6 = AbstractC10114l.Signature(parcel, i15);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip15);
                return new C0906l(iSignature6);
            case 15:
                int iIsVip16 = AbstractC10114l.isVip(parcel);
                boolean zAdcel8 = false;
                while (parcel.dataPosition() < iIsVip16) {
                    int i16 = parcel.readInt();
                    char c3 = (char) i16;
                    if (c3 == 1) {
                        zAdcel4 = AbstractC10114l.adcel(parcel, i16);
                    } else if (c3 != 2) {
                        AbstractC10114l.advert(parcel, i16);
                    } else {
                        zAdcel8 = AbstractC10114l.adcel(parcel, i16);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip16);
                return new C13084l(zAdcel4, zAdcel8);
            case 16:
                int iIsVip17 = AbstractC10114l.isVip(parcel);
                double dSubscription = 0.0d;
                long jPro8 = 0;
                boolean zAdcel9 = false;
                int iSignature15 = 0;
                int iSignature16 = 0;
                int iSignature17 = 0;
                String strIsPro19 = null;
                String strIsPro20 = null;
                byte[] bArrAmazon16 = null;
                while (parcel.dataPosition() < iIsVip17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strIsPro19 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case 3:
                            jPro8 = AbstractC10114l.pro(parcel, i17);
                            break;
                        case 4:
                            zAdcel9 = AbstractC10114l.adcel(parcel, i17);
                            break;
                        case 5:
                            dSubscription = AbstractC10114l.subscription(parcel, i17);
                            break;
                        case 6:
                            strIsPro20 = AbstractC10114l.isPro(parcel, i17);
                            break;
                        case 7:
                            bArrAmazon16 = AbstractC10114l.amazon(parcel, i17);
                            break;
                        case '\b':
                            iSignature15 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case '\t':
                            iSignature16 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        case '\n':
                            iSignature17 = AbstractC10114l.Signature(parcel, i17);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i17);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip17);
                return new C4153l(strIsPro19, jPro8, zAdcel9, dSubscription, strIsPro20, bArrAmazon16, iSignature15, iSignature16, iSignature17);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iIsVip18 = AbstractC10114l.isVip(parcel);
                String strIsPro21 = null;
                C4153l c4153l = null;
                while (parcel.dataPosition() < iIsVip18) {
                    int i18 = parcel.readInt();
                    char c4 = (char) i18;
                    if (c4 == 2) {
                        strIsPro2 = AbstractC10114l.isPro(parcel, i18);
                    } else if (c4 == 3) {
                        strIsPro21 = AbstractC10114l.isPro(parcel, i18);
                    } else if (c4 == 4) {
                        c4153l = (C4153l) AbstractC10114l.subs(parcel, i18, C4153l.CREATOR);
                    } else if (c4 != 5) {
                        AbstractC10114l.advert(parcel, i18);
                    } else {
                        zAdcel3 = AbstractC10114l.adcel(parcel, i18);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip18);
                return new C18275l(strIsPro2, strIsPro21, c4153l, zAdcel3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iIsVip19 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        AbstractC10114l.advert(parcel, i19);
                    } else {
                        arrayListVip = AbstractC10114l.vip(parcel, i19, C18275l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip19);
                return new C4668l(arrayListVip);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIsVip20 = AbstractC10114l.isVip(parcel);
                int iSignature18 = 0;
                while (parcel.dataPosition() < iIsVip20) {
                    int i20 = parcel.readInt();
                    char c5 = (char) i20;
                    if (c5 == 1) {
                        iSignature5 = AbstractC10114l.Signature(parcel, i20);
                    } else if (c5 != 2) {
                        AbstractC10114l.advert(parcel, i20);
                    } else {
                        iSignature18 = AbstractC10114l.Signature(parcel, i20);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip20);
                return new C7533l(iSignature5, iSignature18);
            case 20:
                int iIsVip21 = AbstractC10114l.isVip(parcel);
                C9138l[] c9138lArr = null;
                C16526l c16526l = null;
                while (parcel.dataPosition() < iIsVip21) {
                    int i21 = parcel.readInt();
                    char c6 = (char) i21;
                    if (c6 == 1) {
                        bundleCrashlytics = AbstractC10114l.crashlytics(parcel, i21);
                    } else if (c6 == 2) {
                        c9138lArr = (C9138l[]) AbstractC10114l.remoteconfig(parcel, i21, C9138l.CREATOR);
                    } else if (c6 == 3) {
                        iSignature4 = AbstractC10114l.Signature(parcel, i21);
                    } else if (c6 != 4) {
                        AbstractC10114l.advert(parcel, i21);
                    } else {
                        c16526l = (C16526l) AbstractC10114l.subs(parcel, i21, C16526l.CREATOR);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip21);
                C3801l c3801l = new C3801l();
                c3801l.f7916l = bundleCrashlytics;
                c3801l.f7915l = c9138lArr;
                c3801l.f7914l = iSignature4;
                c3801l.f7917l = c16526l;
                return c3801l;
            case 21:
                int iIsVip22 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip22) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        AbstractC10114l.advert(parcel, i22);
                    } else {
                        zAdcel2 = AbstractC10114l.adcel(parcel, i22);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip22);
                return new C1876l(zAdcel2);
            case 22:
                int iIsVip23 = AbstractC10114l.isVip(parcel);
                boolean zAdcel10 = false;
                boolean zAdcel11 = false;
                int iSignature19 = 0;
                C11361l c11361l = null;
                int[] iArrBilling3 = null;
                int[] iArrBilling4 = null;
                while (parcel.dataPosition() < iIsVip23) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            c11361l = (C11361l) AbstractC10114l.subs(parcel, i23, C11361l.CREATOR);
                            break;
                        case 2:
                            zAdcel10 = AbstractC10114l.adcel(parcel, i23);
                            break;
                        case 3:
                            zAdcel11 = AbstractC10114l.adcel(parcel, i23);
                            break;
                        case 4:
                            iArrBilling3 = AbstractC10114l.billing(parcel, i23);
                            break;
                        case 5:
                            iSignature19 = AbstractC10114l.Signature(parcel, i23);
                            break;
                        case 6:
                            iArrBilling4 = AbstractC10114l.billing(parcel, i23);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i23);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip23);
                return new C16526l(c11361l, zAdcel10, zAdcel11, iArrBilling3, iSignature19, iArrBilling4);
            case 23:
                int iIsVip24 = AbstractC10114l.isVip(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C7613l.f15667l;
                C9138l[] c9138lArr2 = C7613l.f15666l;
                C9138l[] c9138lArr3 = c9138lArr2;
                int iSignature20 = 0;
                int iSignature21 = 0;
                int iSignature22 = 0;
                boolean zAdcel12 = false;
                int iSignature23 = 0;
                boolean zAdcel13 = false;
                String strIsPro22 = null;
                IBinder iBinderTapsense8 = null;
                Account account = null;
                String strIsPro23 = null;
                while (parcel.dataPosition() < iIsVip24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iSignature20 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 2:
                            iSignature21 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 3:
                            iSignature22 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 4:
                            strIsPro22 = AbstractC10114l.isPro(parcel, i24);
                            break;
                        case 5:
                            iBinderTapsense8 = AbstractC10114l.tapsense(parcel, i24);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC10114l.remoteconfig(parcel, i24, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC10114l.crashlytics(parcel, i24);
                            break;
                        case '\b':
                            account = (Account) AbstractC10114l.subs(parcel, i24, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC10114l.advert(parcel, i24);
                            break;
                        case '\n':
                            c9138lArr2 = (C9138l[]) AbstractC10114l.remoteconfig(parcel, i24, C9138l.CREATOR);
                            break;
                        case 11:
                            c9138lArr3 = (C9138l[]) AbstractC10114l.remoteconfig(parcel, i24, C9138l.CREATOR);
                            break;
                        case '\f':
                            zAdcel12 = AbstractC10114l.adcel(parcel, i24);
                            break;
                        case '\r':
                            iSignature23 = AbstractC10114l.Signature(parcel, i24);
                            break;
                        case 14:
                            zAdcel13 = AbstractC10114l.adcel(parcel, i24);
                            break;
                        case 15:
                            strIsPro23 = AbstractC10114l.isPro(parcel, i24);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip24);
                return new C7613l(iSignature20, iSignature21, iSignature22, strIsPro22, iBinderTapsense8, scopeArr, bundle, account, c9138lArr2, c9138lArr3, zAdcel12, iSignature23, zAdcel13, strIsPro23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int iIsVip25 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip25) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 2) {
                        AbstractC10114l.advert(parcel, i25);
                    } else {
                        iSignature3 = AbstractC10114l.Signature(parcel, i25);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip25);
                return new C13119l(iSignature3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int iIsVip26 = AbstractC10114l.isVip(parcel);
                long jPro9 = 0;
                boolean zAdcel14 = true;
                boolean zAdcel15 = true;
                boolean zAdcel16 = true;
                boolean zAdcel17 = true;
                boolean zAdcel18 = true;
                boolean zAdcel19 = true;
                boolean zAdcel20 = true;
                boolean zAdcel21 = true;
                int iSignature24 = 0;
                boolean zAdcel22 = false;
                boolean zAdcel23 = false;
                int iSignature25 = 0;
                int iSignature26 = 0;
                boolean zAdcel24 = false;
                byte[] bArrAmazon17 = null;
                int[] iArrBilling5 = null;
                int[] iArrBilling6 = null;
                byte[] bArrAmazon18 = null;
                C9701l c9701l = null;
                boolean zAdcel25 = true;
                boolean zAdcel26 = true;
                while (parcel.dataPosition() < iIsVip26) {
                    int i26 = parcel.readInt();
                    int i27 = iSignature24;
                    switch ((char) i26) {
                        case 1:
                            zAdcel23 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 2:
                            zAdcel = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 3:
                            zAdcel14 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 4:
                            zAdcel15 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 5:
                            zAdcel16 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 6:
                            zAdcel17 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 7:
                            zAdcel18 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\b':
                            zAdcel25 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\t':
                            bArrAmazon17 = AbstractC10114l.amazon(parcel, i26);
                            break;
                        case '\n':
                            zAdcel22 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 11:
                            zAdcel26 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\f':
                            zAdcel19 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case '\r':
                            iSignature24 = AbstractC10114l.Signature(parcel, i26);
                            continue;
                        case 14:
                            iSignature26 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 15:
                            iArrBilling5 = AbstractC10114l.billing(parcel, i26);
                            break;
                        case 16:
                            iArrBilling6 = AbstractC10114l.billing(parcel, i26);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            bArrAmazon18 = AbstractC10114l.amazon(parcel, i26);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            c9701l = (C9701l) AbstractC10114l.subs(parcel, i26, C9701l.CREATOR);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            iSignature25 = AbstractC10114l.Signature(parcel, i26);
                            break;
                        case 20:
                            jPro9 = AbstractC10114l.pro(parcel, i26);
                            break;
                        case 21:
                            zAdcel24 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 22:
                            zAdcel21 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        case 23:
                            zAdcel20 = AbstractC10114l.adcel(parcel, i26);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i26);
                            break;
                    }
                    iSignature24 = i27;
                }
                AbstractC10114l.metrica(parcel, iIsVip26);
                C10119l c10119l2 = new C10119l();
                c10119l2.f20616l = zAdcel23;
                c10119l2.f20615l = zAdcel;
                c10119l2.f20609l = zAdcel14;
                c10119l2.f20622l = zAdcel15;
                c10119l2.f20621l = zAdcel16;
                c10119l2.f20625l = zAdcel17;
                c10119l2.f20610l = zAdcel18;
                c10119l2.f20613l = zAdcel25;
                c10119l2.f20624l = bArrAmazon17;
                c10119l2.f20619l = zAdcel22;
                c10119l2.f20626l = zAdcel26;
                c10119l2.f20623l = zAdcel19;
                c10119l2.f20608l = iSignature24;
                c10119l2.f20627l = iSignature26;
                c10119l2.f20620l = iArrBilling5;
                c10119l2.f20614l = iArrBilling6;
                c10119l2.f20618l = bArrAmazon18;
                c10119l2.f20628l = c9701l;
                c10119l2.f20617l = iSignature25;
                c10119l2.f20612l = jPro9;
                c10119l2.f20611l = zAdcel24;
                c10119l2.f20607l = zAdcel21;
                c10119l2.f20629l = zAdcel20;
                return c10119l2;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int iIsVip27 = AbstractC10114l.isVip(parcel);
                double dSubscription2 = 0.0d;
                boolean zAdcel27 = false;
                boolean zAdcel28 = false;
                boolean zAdcel29 = false;
                boolean zAdcel30 = false;
                boolean zAdcel31 = false;
                boolean zAdcel32 = false;
                boolean zAdcel33 = false;
                boolean zAdcel34 = false;
                boolean zAdcel35 = false;
                boolean zAdcel36 = false;
                String strIsPro24 = null;
                ArrayList arrayListSmaato = null;
                C1901l c1901l = null;
                C4465l c4465l = null;
                ArrayList arrayListSmaato2 = null;
                C1876l c1876l = null;
                C13119l c13119l = null;
                while (parcel.dataPosition() < iIsVip27) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            strIsPro24 = AbstractC10114l.isPro(parcel, i28);
                            break;
                        case 3:
                            arrayListSmaato = AbstractC10114l.smaato(parcel, i28);
                            break;
                        case 4:
                            zAdcel27 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case 5:
                            c1901l = (C1901l) AbstractC10114l.subs(parcel, i28, C1901l.CREATOR);
                            break;
                        case 6:
                            zAdcel28 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case 7:
                            c4465l = (C4465l) AbstractC10114l.subs(parcel, i28, C4465l.CREATOR);
                            break;
                        case '\b':
                            zAdcel29 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case '\t':
                            dSubscription2 = AbstractC10114l.subscription(parcel, i28);
                            break;
                        case '\n':
                            zAdcel30 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case 11:
                            zAdcel31 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case '\f':
                            zAdcel32 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case '\r':
                            arrayListSmaato2 = AbstractC10114l.smaato(parcel, i28);
                            break;
                        case 14:
                            zAdcel33 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case 15:
                            AbstractC10114l.Signature(parcel, i28);
                            break;
                        case 16:
                            zAdcel34 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            c1876l = (C1876l) AbstractC10114l.subs(parcel, i28, C1876l.CREATOR);
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            c13119l = (C13119l) AbstractC10114l.subs(parcel, i28, C13119l.CREATOR);
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            zAdcel35 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        case 20:
                            zAdcel36 = AbstractC10114l.adcel(parcel, i28);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i28);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip27);
                return new C12100l(strIsPro24, arrayListSmaato, zAdcel27, c1901l, zAdcel28, c4465l, zAdcel29, dSubscription2, zAdcel30, zAdcel31, zAdcel32, arrayListSmaato2, zAdcel33, zAdcel34, c1876l, c13119l, zAdcel35, zAdcel36);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int iIsVip28 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip28) {
                    int i29 = parcel.readInt();
                    char c7 = (char) i29;
                    if (c7 == 1) {
                        strIsPro = AbstractC10114l.isPro(parcel, i29);
                    } else if (c7 == 2) {
                        jPro = AbstractC10114l.pro(parcel, i29);
                    } else if (c7 != 3) {
                        AbstractC10114l.advert(parcel, i29);
                    } else {
                        iSignature2 = AbstractC10114l.Signature(parcel, i29);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip28);
                return new C11536l(jPro, iSignature2, strIsPro);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int iIsVip29 = AbstractC10114l.isVip(parcel);
                long jPro10 = 0;
                long jPro11 = 0;
                int iSignature27 = 0;
                byte[] bArrAmazon19 = null;
                String strIsPro25 = null;
                Bundle bundleCrashlytics2 = null;
                String strIsPro26 = null;
                while (parcel.dataPosition() < iIsVip29) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            jPro10 = AbstractC10114l.pro(parcel, i30);
                            break;
                        case 2:
                            bArrAmazon19 = AbstractC10114l.amazon(parcel, i30);
                            break;
                        case 3:
                            strIsPro25 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        case 4:
                            bundleCrashlytics2 = AbstractC10114l.crashlytics(parcel, i30);
                            break;
                        case 5:
                            iSignature27 = AbstractC10114l.Signature(parcel, i30);
                            break;
                        case 6:
                            jPro11 = AbstractC10114l.pro(parcel, i30);
                            break;
                        case 7:
                            strIsPro26 = AbstractC10114l.isPro(parcel, i30);
                            break;
                        default:
                            AbstractC10114l.advert(parcel, i30);
                            break;
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip29);
                return new C8736l(jPro10, bArrAmazon19, strIsPro25, bundleCrashlytics2, iSignature27, jPro11, strIsPro26);
            default:
                int iIsVip30 = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip30) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        AbstractC10114l.advert(parcel, i31);
                    } else {
                        arrayListMopub = AbstractC10114l.mopub(parcel, i31);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip30);
                return new C18032l(arrayListMopub);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C16917l[i];
            case 1:
                return new C17484l[i];
            case 2:
                return new C7441l[i];
            case 3:
                return new C7935l[i];
            case 4:
                return new C6179l[i];
            case 5:
                return new C8332l[i];
            case 6:
                return new C12884l[i];
            case 7:
                return new C12386l[i];
            case 8:
                return new C17459l[i];
            case 9:
                return new C16346l[i];
            case 10:
                return new C1362l[i];
            case 11:
                return new C4080l[i];
            case 12:
                return new C9369l[i];
            case 13:
                return new C5824l[i];
            case 14:
                return new C0906l[i];
            case 15:
                return new C13084l[i];
            case 16:
                return new C4153l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C18275l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C4668l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7533l[i];
            case 20:
                return new C3801l[i];
            case 21:
                return new C1876l[i];
            case 22:
                return new C16526l[i];
            case 23:
                return new C7613l[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13119l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C10119l[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C12100l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C11536l[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C8736l[i];
            default:
                return new C18032l[i];
        }
    }
}
