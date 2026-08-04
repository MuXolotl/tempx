package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10114l {
    public static final C6879l[] yandex = {new C6879l(120000000000L), new C6879l(300000000000L)};

    public static int Signature(Parcel parcel, int i) {
        signatures(parcel, i, 4);
        return parcel.readInt();
    }

    public static int ad(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static boolean adcel(Parcel parcel, int i) {
        signatures(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static long[] admob(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iAd);
        return jArrCreateLongArray;
    }

    public static Boolean ads(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        if (iAd == 0) {
            return null;
        }
        premium(parcel, iAd, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static void advert(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + ad(parcel, i));
    }

    public static byte[] amazon(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iAd);
        return bArrCreateByteArray;
    }

    public static int[] billing(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iAd);
        return iArrCreateIntArray;
    }

    public static Bundle crashlytics(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iAd);
        return bundle;
    }

    public static String[] firebase(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iAd);
        return strArrCreateStringArray;
    }

    public static String isPro(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iAd);
        return string;
    }

    public static int isVip(Parcel parcel) {
        int i = parcel.readInt();
        int iAd = ad(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new C8325l("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iAd + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new C8325l(sb.toString(), parcel);
    }

    public static Integer license(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        if (iAd == 0) {
            return null;
        }
        premium(parcel, iAd, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, long j, float f, float f2, C6956l c6956l, final int i) {
        final InterfaceC17242l interfaceC17242l2;
        final long j2;
        final float f3;
        final float f4;
        long j3;
        int i2;
        float f5;
        float f6;
        InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(-998441586);
        int i3 = i | (c6956l.amazon(R.drawable.player_shuffle) ? 4 : 2) | 221360;
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            c6956l.m2141switch();
            int i4 = i & 1;
            C4346l c4346l = C4346l.f8873l;
            if (i4 == 0 || c6956l.ad()) {
                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                i2 = i3 & (-897);
                f5 = 24.0f;
                f6 = 8.0f;
                interfaceC17242l3 = c4346l;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-897);
                interfaceC17242l3 = interfaceC17242l;
                j3 = j;
                f5 = f;
                f6 = f2;
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242l3, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), C9735l.loadAd(0.25f, j3), AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j4 = c6956l.f14595continue;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.player_shuffle, i2 & 14, c6956l);
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC3605l.smaato(c4346l, f6), f5);
            long j5 = j3;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, interfaceC17242lIsPro, j5, c6956l, 56, 0);
            c6956l.startapp(true);
            j2 = j5;
            interfaceC17242l2 = interfaceC17242l3;
            f3 = f5;
            f4 = f6;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            j2 = j;
            f3 = f;
            f4 = f2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(j2, f3, f4, i) { // from class: lٍؓۙ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ float f4151l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ long f4152l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ float f4154l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(3073);
                    AbstractC10114l.loadAd(this.f4153l, this.f4152l, this.f4151l, this.f4154l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void metrica(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C8325l(AbstractC9361l.Signature(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static ArrayList mopub(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iAd);
        return arrayList;
    }

    public static void premium(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new C8325l(AbstractC9361l.ad(sb, " (0x", hexString, ")"), parcel);
    }

    public static long pro(Parcel parcel, int i) {
        signatures(parcel, i, 8);
        return parcel.readLong();
    }

    public static byte[][] purchase(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iAd);
        return bArr;
    }

    public static Object[] remoteconfig(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iAd);
        return objArrCreateTypedArray;
    }

    public static void signatures(Parcel parcel, int i, int i2) {
        int iAd = ad(parcel, i);
        if (iAd == i2) {
            return;
        }
        String hexString = Integer.toHexString(iAd);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iAd).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iAd);
        throw new C8325l(AbstractC9361l.ad(sb, " (0x", hexString, ")"), parcel);
    }

    public static ArrayList smaato(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iAd);
        return arrayListCreateStringArrayList;
    }

    public static final InterfaceC1388l startapp(InterfaceC18035l interfaceC18035l) {
        if (interfaceC18035l instanceof C17225l) {
            return ((C17225l) interfaceC18035l).loadAd;
        }
        if (interfaceC18035l instanceof C14118l) {
            return startapp(((C14118l) interfaceC18035l).yandex);
        }
        return null;
    }

    public static Parcelable subs(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iAd);
        return parcelable;
    }

    public static double subscription(Parcel parcel, int i) {
        signatures(parcel, i, 8);
        return parcel.readDouble();
    }

    public static IBinder tapsense(Parcel parcel, int i) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iAd);
        return strongBinder;
    }

    public static ArrayList vip(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAd = ad(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAd == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iAd);
        return arrayListCreateTypedArrayList;
    }

    public static final void yandex(final C16820l c16820l, EnumC11447l enumC11447l, String str, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(821200907);
        int i2 = (c6956l.billing(c16820l) ? 4 : 2) | i | (c6956l.amazon(enumC11447l.ordinal()) ? 32 : 16) | (c6956l.billing(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function0) ? 2048 : 1024);
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC0133l.amazon(AbstractC14566l.amazon(-706443587, new C15272l(enumC11447l, str, c16820l, 8), c6956l), AbstractC14566l.amazon(1765336446, new Function3() { // from class: lٗٞ۟
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    C16820l c16820l2 = c16820l;
                    int i6 = 1;
                    InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                    switch (i5) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            int i7 = 2;
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= c6956l2.billing(interfaceC15451l) ? 4 : 2;
                            }
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                                AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-363729346, new C16384l(c16820l2, i6), c6956l2), AbstractC14566l.amazon(-481366115, new C16384l(c16820l2, i7), c6956l2), c6956l2, (iIntValue & 14) | 432);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                AbstractC5889l.crashlytics(c16820l2.crashlytics, true, 0L, c6956l3, 48, 4);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC3605l.remoteconfig(AbstractC9151l.loadAd(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), false, null, function0, 15), 16.0f, 8.0f), AbstractC14566l.amazon(-1881038080, new Function3() { // from class: lٗٞ۟
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    C16820l c16820l2 = c16820l;
                    int i6 = 1;
                    InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                    switch (i5) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            int i7 = 2;
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= c6956l2.billing(interfaceC15451l) ? 4 : 2;
                            }
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                                AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-363729346, new C16384l(c16820l2, i6), c6956l2), AbstractC14566l.amazon(-481366115, new C16384l(c16820l2, i7), c6956l2), c6956l2, (iIntValue & 14) | 432);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                AbstractC5889l.crashlytics(c16820l2.crashlytics, true, 0L, c6956l3, 48, 4);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 3126, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18198l(c16820l, enumC11447l, str, function0, i);
        }
    }
}
