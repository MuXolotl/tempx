package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٜۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9968l {
    public static final C1504l yandex = new C1504l(new C2109l());

    public static void Signature(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void adcel(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        Signature(parcel, iTapsense);
    }

    public static void admob(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeStrongBinder(iBinder);
        Signature(parcel, iTapsense);
    }

    public static void ads(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        Signature(parcel, iTapsense);
    }

    public static void amazon(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        subscription(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void billing(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeByteArray(bArr);
        Signature(parcel, iTapsense);
    }

    public static InterfaceC1220l crashlytics(int i, Function0 function0) {
        C7472l c7472l = C7472l.f15448l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return new C8688l(function0);
        }
        if (iInmobi == 1) {
            C12497l c12497l = new C12497l();
            c12497l.f24636l = function0;
            c12497l.f24635l = c7472l;
            return c12497l;
        }
        if (iInmobi != 2) {
            C18725l.billing();
            return null;
        }
        C13709l c13709l = new C13709l();
        c13709l.f26767l = function0;
        c13709l.f26766l = c7472l;
        return c13709l;
    }

    public static void firebase(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        subscription(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void isPro(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        Signature(parcel, iTapsense);
    }

    public static final /* synthetic */ Activity loadAd(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void metrica(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeStringArray(strArr);
        Signature(parcel, iTapsense);
    }

    public static void mopub(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        Signature(parcel, iTapsense);
    }

    public static void purchase(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeBundle(bundle);
        Signature(parcel, iTapsense);
    }

    public static void remoteconfig(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        Signature(parcel, iTapsense);
    }

    public static void smaato(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeLongArray(jArr);
        Signature(parcel, iTapsense);
    }

    public static void startapp(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeStringList(list);
        Signature(parcel, iTapsense);
    }

    public static void subs(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeIntArray(iArr);
        Signature(parcel, iTapsense);
    }

    public static void subscription(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int tapsense(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void vip(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iTapsense = tapsense(parcel, i);
        parcel.writeString(str);
        Signature(parcel, iTapsense);
    }

    public static final AbstractC7188l yandex(C12952l c12952l, InterfaceC13012l interfaceC13012l) {
        boolean z;
        AbstractC7188l abstractC7188lYandex = c12952l.yandex(AbstractC8020l.subs(interfaceC13012l));
        if ((abstractC7188lYandex instanceof C6064l) || ((z = abstractC7188lYandex instanceof C11014l))) {
            return abstractC7188lYandex;
        }
        if (interfaceC13012l.Signature()) {
            return abstractC7188lYandex.amazon();
        }
        return z ? abstractC7188lYandex : new C11014l(abstractC7188lYandex);
    }
}
