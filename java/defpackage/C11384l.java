package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lُ۠ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11384l implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11384l(int i) {
        this.yandex = i;
    }

    public static C10086l yandex(Parcel parcel, ClassLoader classLoader) {
        InterfaceC6642l interfaceC6642l;
        if (classLoader == null) {
            classLoader = C11384l.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            interfaceC6642l = C18450l.f36015l;
        } else if (i == 1) {
            interfaceC6642l = C7472l.f15463l;
        } else {
            if (i != 2) {
                C8339l.smaato(AbstractC15560l.tapsense("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            interfaceC6642l = C1461l.f3659l;
        }
        return new C10086l(value, interfaceC6642l);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.yandex) {
            case 0:
                return yandex(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2704l.f5854l;
                }
                C8339l.smaato("superState must be null");
                return null;
            case 2:
                return new C10325l(parcel, classLoader);
            case 3:
                return new C15094l(parcel, classLoader);
            case 4:
                return new C3084l(parcel, classLoader);
            case 5:
                return new C8105l(parcel, classLoader);
            default:
                return new C8822l(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C10086l[i];
            case 1:
                return new AbstractC2704l[i];
            case 2:
                return new C10325l[i];
            case 3:
                return new C15094l[i];
            case 4:
                return new C3084l[i];
            case 5:
                return new C8105l[i];
            default:
                return new C8822l[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.yandex) {
            case 0:
                return yandex(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2704l.f5854l;
                }
                C8339l.smaato("superState must be null");
                return null;
            case 2:
                return new C10325l(parcel, null);
            case 3:
                return new C15094l(parcel, null);
            case 4:
                return new C3084l(parcel, null);
            case 5:
                return new C8105l(parcel, null);
            default:
                return new C8822l(parcel, null);
        }
    }
}
