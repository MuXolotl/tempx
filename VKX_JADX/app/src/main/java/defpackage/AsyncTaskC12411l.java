package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* JADX INFO: renamed from: lؘّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC12411l extends AsyncTask {
    public final /* synthetic */ C16367l loadAd;
    public final /* synthetic */ Context yandex;

    public AsyncTaskC12411l(Context context, C16367l c16367l) {
        this.yandex = context;
        this.loadAd = c16367l;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            AbstractC10055l.yandex(this.yandex);
            return 0;
        } catch (C1226l e) {
            return Integer.valueOf(e.f3265l);
        } catch (C3412l e2) {
            return Integer.valueOf(e2.f7273l);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C16367l c16367l = this.loadAd;
        if (iIntValue == 0) {
            AbstractC2991l.billing(AbstractC17265l.yandex(c16367l), 5, "GMS Provider installed", null);
            return;
        }
        C13268l c13268l = AbstractC10055l.yandex;
        AbstractC10055l.yandex.loadAd(num.intValue(), this.yandex, "pi");
        int iIntValue2 = num.intValue();
        AbstractC2991l.billing(AbstractC17265l.yandex(c16367l), 5, "GMS Provider installed", null);
        AbstractC2991l.billing(AbstractC17265l.yandex(c16367l), 5, "GMS Provider failed: " + iIntValue2, null);
    }
}
