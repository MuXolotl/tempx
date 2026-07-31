package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6183l implements RemoteViewsService.RemoteViewsFactory {
    public static final C8662l purchase = new C8662l(new long[0], new RemoteViews[0]);
    public C8662l amazon = purchase;
    public final int crashlytics;
    public final int loadAd;
    public final RemoteViewsCompatService yandex;

    public C6183l(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.yandex = remoteViewsCompatService;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.amazon.amazon).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.amazon.amazon)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.amazon.purchase)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.yandex.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.amazon.loadAd;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.amazon.crashlytics;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        yandex();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        yandex();
    }

    public final void yandex() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.yandex;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        StringBuilder sb = new StringBuilder();
        int i = this.loadAd;
        sb.append(i);
        sb.append(':');
        sb.append(this.crashlytics);
        C8662l c8662l = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                byte[] bArr = new byte[parcelObtain.readInt()];
                parcelObtain.readByteArray(bArr);
                String string2 = parcelObtain.readString();
                long j = parcelObtain.readLong();
                parcelObtain.recycle();
                if (AbstractC8576l.yandex(Build.VERSION.INCREMENTAL, string2)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? AbstractC13950l.subscription(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (lValueOf.longValue() != j) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                parcelObtain2.setDataPosition(0);
                                C8662l c8662l2 = new C8662l(parcelObtain2);
                                parcelObtain2.recycle();
                                c8662l = c8662l2;
                            } catch (Throwable th) {
                                parcelObtain2.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th2);
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            } catch (Throwable th3) {
                parcelObtain.recycle();
                throw th3;
            }
        }
        if (c8662l == null) {
            c8662l = purchase;
        }
        this.amazon = c8662l;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
