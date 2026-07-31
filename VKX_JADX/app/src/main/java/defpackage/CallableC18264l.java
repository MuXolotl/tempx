package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l٘ۡؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC18264l implements Callable {
    public final /* synthetic */ C2762l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC18264l(C2762l c2762l, int i) {
        this.yandex = i;
        this.loadAd = c2762l;
    }

    private final Object yandex() {
        String string;
        C2762l c2762l = this.loadAd;
        synchronized (c2762l) {
            try {
                C4595l c4595l = (C4595l) c2762l.yandex.get();
                ArrayList arrayListCrashlytics = c4595l.crashlytics();
                c4595l.loadAd();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListCrashlytics.size(); i++) {
                    C2986l c2986l = (C2986l) arrayListCrashlytics.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c2986l.yandex);
                    jSONObject.put("dates", new JSONArray((Collection) c2986l.loadAd));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.yandex) {
            case 0:
                return yandex();
            default:
                C2762l c2762l = this.loadAd;
                synchronized (c2762l) {
                    ((C4595l) c2762l.yandex.get()).firebase(System.currentTimeMillis(), ((C8404l) c2762l.crashlytics.get()).yandex());
                    break;
                }
                return null;
        }
    }
}
