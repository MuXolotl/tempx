package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lٍۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9804l implements Closeable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f19982l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19983l;

    public C9804l() {
        this.f19983l = 1;
        this.f19982l = new Inflater(true);
    }

    public static String billing(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f19983l;
        Object obj = this.f19982l;
        switch (i) {
            case 0:
                ((HttpURLConnection) obj).disconnect();
                break;
            default:
                ((Inflater) obj).end();
                break;
        }
    }

    public String yandex() {
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f19982l;
        try {
            z = httpURLConnection.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
        } catch (NullPointerException e) {
            e = e;
            AbstractC17968l.crashlytics("get error failed ", e);
            return e.getMessage();
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + billing(httpURLConnection);
        } catch (IOException | NullPointerException e2) {
            e = e2;
            AbstractC17968l.crashlytics("get error failed ", e);
            return e.getMessage();
        }
    }

    public C9804l(HttpURLConnection httpURLConnection) {
        this.f19983l = 0;
        this.f19982l = httpURLConnection;
    }
}
