package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: renamed from: lَؚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10649l {
    public static final C0022l yandex = new C0022l("CastDynamiteModule", null);

    public static C12808l loadAd(Context context) {
        try {
            IBinder iBinderLoadAd = C7269l.crashlytics(context, C7269l.loadAd, "com.google.android.gms.cast.framework.dynamite").loadAd("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderLoadAd == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderLoadAd.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof C12808l ? (C12808l) iInterfaceQueryLocalInterface : new C12808l(iBinderLoadAd, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (C2315l e) {
            throw new C1237l(e);
        }
    }

    public static InterfaceC5490l yandex(Context context, C12100l c12100l, BinderC2728l binderC2728l, HashMap map) {
        InterfaceC5490l c9844l;
        C12808l c12808lLoadAd = loadAd(context);
        BinderC14844l binderC14844l = new BinderC14844l(context.getApplicationContext());
        Parcel parcelM743l = c12808lLoadAd.m743l();
        AbstractC14627l.crashlytics(parcelM743l, binderC14844l);
        AbstractC14627l.loadAd(parcelM743l, c12100l);
        AbstractC14627l.crashlytics(parcelM743l, binderC2728l);
        parcelM743l.writeMap(map);
        Parcel parcelM746l = c12808lLoadAd.m746l(parcelM743l, 1);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        int i = AbstractBinderC13733l.billing;
        if (strongBinder == null) {
            c9844l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            c9844l = iInterfaceQueryLocalInterface instanceof InterfaceC5490l ? (InterfaceC5490l) iInterfaceQueryLocalInterface : new C9844l(strongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        parcelM746l.recycle();
        return c9844l;
    }
}
