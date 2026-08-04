package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: lٍٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9592l {
    public static final C15578l yandex = new C15578l(1584251493, false, new C11891l(12));

    public static void amazon(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final C18389l crashlytics(C18389l c18389l) {
        C10049l c10049lYandex = c18389l.yandex();
        AbstractC6897l abstractC6897l = c18389l.f35907l;
        c10049lYandex.mopub = new C4243l(abstractC6897l.mopub(), abstractC6897l.billing());
        return c10049lYandex.yandex();
    }

    public static final String loadAd(AbstractC8237l abstractC8237l, InterfaceC18035l interfaceC18035l) {
        for (Annotation annotation : interfaceC18035l.getAnnotations()) {
            if (annotation instanceof InterfaceC2363l) {
                return ((InterfaceC2363l) annotation).discriminator();
            }
        }
        return abstractC8237l.yandex.admob;
    }

    public static Object yandex(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
