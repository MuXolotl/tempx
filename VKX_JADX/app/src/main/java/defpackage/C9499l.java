package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٍّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9499l implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int yandex;

    public static C3549l loadAd(Parcel parcel, ClassLoader classLoader) {
        C3549l c3549l = new C3549l();
        if (classLoader == null) {
            classLoader = C3549l.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            c3549l.add(parcel.readValue(classLoader));
        }
        return c3549l;
    }

    public static C11362l yandex(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C9499l.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new C11362l();
        }
        C0266l c0266lSignatures = C3451l.f7330l.signatures();
        for (int i2 = 0; i2 < i; i2++) {
            c0266lSignatures.add(parcel.readValue(classLoader));
        }
        return new C11362l(c0266lSignatures.advert());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.yandex) {
            case 0:
                return yandex(parcel, classLoader);
            case 1:
                return new C12629l(parcel, classLoader);
            case 2:
                return new C4518l(parcel, classLoader);
            case 3:
                return new C6625l(parcel, classLoader);
            case 4:
                return loadAd(parcel, classLoader);
            default:
                return new C14162l(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C11362l[i];
            case 1:
                return new C12629l[i];
            case 2:
                return new C4518l[i];
            case 3:
                return new C6625l[i];
            case 4:
                return new C3549l[i];
            default:
                return new C14162l[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.yandex) {
            case 0:
                return yandex(parcel, null);
            case 1:
                return new C12629l(parcel, null);
            case 2:
                return new C4518l(parcel, null);
            case 3:
                return new C6625l(parcel, null);
            case 4:
                return loadAd(parcel, null);
            default:
                return new C14162l(parcel, null);
        }
    }
}
