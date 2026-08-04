package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: renamed from: lؕ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3684l {
    public final Notification loadAd;
    public final String yandex;

    public C3684l(String str, Notification notification) {
        this.yandex = str;
        this.loadAd = notification;
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("NotifyTask[packageName:"), this.yandex, ", id:200, tag:null]");
    }

    public final void yandex(InterfaceC16527l interfaceC16527l) {
        String str = this.yandex;
        Notification notification = this.loadAd;
        C8805l c8805l = (C8805l) interfaceC16527l;
        c8805l.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC16527l.crashlytics);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(200);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            c8805l.purchase.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
