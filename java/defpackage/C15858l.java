package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٕۖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15858l implements Parcelable {
    public static final Parcelable.Creator<C15858l> CREATOR = new C17440l(0);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Bundle f31119l;

    public C15858l(Object obj) {
        ArrayMap arrayMap = AbstractC3958l.yandex;
        String strSubs = AbstractC3958l.subs(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(strSubs));
        }
        this.f31119l = AbstractC3958l.startapp(obj, strSubs, new C10166l(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f31119l);
    }

    public final Object yandex() {
        ArrayMap arrayMap = AbstractC3958l.yandex;
        boolean zIsLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.f31119l;
        if (zIsLoggable) {
            String str = (String) AbstractC3958l.loadAd.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return AbstractC3958l.billing(bundle, new C10166l(null, "", new ArrayDeque()));
    }

    public C15858l(Bundle bundle) {
        this.f31119l = bundle;
    }
}
