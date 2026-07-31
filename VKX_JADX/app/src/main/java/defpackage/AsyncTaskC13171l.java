package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: lؘْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC13171l extends AsyncTask {
    public static final C0022l crashlytics = new C0022l("FetchBitmapTask", null);
    public final C3557l loadAd;
    public final InterfaceC12267l yandex;

    public AsyncTaskC13171l(Context context, int i, int i2, C3557l c3557l) {
        InterfaceC12267l interfaceC12267lM3505l;
        this.loadAd = c3557l;
        Context applicationContext = context.getApplicationContext();
        BinderC3285l binderC3285l = new BinderC3285l(this);
        C0022l c0022l = AbstractC10649l.yandex;
        try {
            C12808l c12808lLoadAd = AbstractC10649l.loadAd(applicationContext.getApplicationContext());
            BinderC14844l binderC14844l = new BinderC14844l(applicationContext.getApplicationContext());
            Parcel parcelM746l = c12808lLoadAd.m746l(c12808lLoadAd.m743l(), 8);
            int i3 = parcelM746l.readInt();
            parcelM746l.recycle();
            interfaceC12267lM3505l = i3 >= 233700000 ? c12808lLoadAd.m3505l(binderC14844l, new BinderC14844l(this), binderC3285l, i, i2) : c12808lLoadAd.m3504l(new BinderC14844l(this), binderC3285l, i, i2);
        } catch (RemoteException e) {
            e = e;
            AbstractC10649l.yandex.yandex(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C12808l.class.getSimpleName());
            interfaceC12267lM3505l = null;
        } catch (C1237l e2) {
            e = e2;
            AbstractC10649l.yandex.yandex(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C12808l.class.getSimpleName());
            interfaceC12267lM3505l = null;
        }
        this.yandex = interfaceC12267lM3505l;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        InterfaceC12267l interfaceC12267l;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (interfaceC12267l = this.yandex) != null) {
            try {
                C10214l c10214l = (C10214l) interfaceC12267l;
                Parcel parcelM743l = c10214l.m743l();
                AbstractC14627l.loadAd(parcelM743l, uri);
                Parcel parcelM746l = c10214l.m746l(parcelM743l, 1);
                Bitmap bitmap = (Bitmap) AbstractC14627l.yandex(parcelM746l, Bitmap.CREATOR);
                parcelM746l.recycle();
                return bitmap;
            } catch (RemoteException e) {
                crashlytics.yandex(e, "Unable to call %s on %s.", "doFetch", InterfaceC12267l.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C3557l c3557l = this.loadAd;
        if (c3557l != null) {
            InterfaceC16013l interfaceC16013l = (InterfaceC16013l) c3557l.f7481l;
            if (interfaceC16013l != null) {
                interfaceC16013l.yandex(bitmap);
            }
            c3557l.f7482l = null;
        }
    }
}
