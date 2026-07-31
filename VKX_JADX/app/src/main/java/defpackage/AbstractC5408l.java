package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5408l {
    public static final C0022l yandex = new C0022l("MediaSessionUtils", null);

    public static int[] loadAd(C0595l c0595l) {
        try {
            Parcel parcelM746l = c0595l.m746l(c0595l.m743l(), 4);
            int[] iArrCreateIntArray = parcelM746l.createIntArray();
            parcelM746l.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", C0595l.class.getSimpleName()};
            C0022l c0022l = yandex;
            Log.e(c0022l.yandex, c0022l.amazon("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static ArrayList yandex(C0595l c0595l) {
        try {
            Parcel parcelM746l = c0595l.m746l(c0595l.m743l(), 3);
            ArrayList arrayListCreateTypedArrayList = parcelM746l.createTypedArrayList(C16923l.CREATOR);
            parcelM746l.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", C0595l.class.getSimpleName()};
            C0022l c0022l = yandex;
            Log.e(c0022l.yandex, c0022l.amazon("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
