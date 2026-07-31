package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lؕ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3454l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C3823l f7334l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Future f7335l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final URL f7336l;

    public C3454l(URL url) {
        this.f7336l = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7335l.cancel(true);
    }

    public final Bitmap yandex() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f7336l;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            C18262l.metrica("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrAdmob = AbstractC9092l.admob(new C16045l(inputStream, 0));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrAdmob.length + " bytes from " + url);
            }
            if (bArrAdmob.length > 1048576) {
                C18262l.metrica("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrAdmob, 0, bArrAdmob.length);
            if (bitmapDecodeByteArray == null) {
                C10754l.pro(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
