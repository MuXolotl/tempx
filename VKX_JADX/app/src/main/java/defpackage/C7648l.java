package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lؚۦؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7648l extends AbstractC16844l implements InterfaceC12058l {
    public static final boolean purchase;
    public final ArrayList amazon;
    public Context crashlytics;

    static {
        purchase = Build.VERSION.SDK_INT < 29;
    }

    public C7648l() {
        C5046l c5046l;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c5046l = new C5046l(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC18376l.yandex;
            AbstractC18376l.yandex(C11610l.class.getName(), 5, "unable to load android socket classes", e);
            c5046l = null;
        }
        ArrayList arrayListM2420volatile = AbstractC8669l.m2420volatile(new InterfaceC2332l[]{c5046l, new C2448l(C3706l.billing), new C2448l(C18314l.yandex), new C2448l(C4873l.yandex)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM2420volatile) {
            if (((InterfaceC2332l) obj).yandex()) {
                arrayList.add(obj);
            }
        }
        this.amazon = arrayList;
    }

    @Override // defpackage.AbstractC16844l
    public final boolean admob(String str) {
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // defpackage.AbstractC16844l
    public final void amazon(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.amazon.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC2332l) next).amazon(sSLSocket));
        InterfaceC2332l interfaceC2332l = (InterfaceC2332l) next;
        if (interfaceC2332l != null) {
            interfaceC2332l.crashlytics(sSLSocket, str, list);
        }
    }

    @Override // defpackage.AbstractC16844l
    public final String billing(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.amazon.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC2332l) next).amazon(sSLSocket));
        InterfaceC2332l interfaceC2332l = (InterfaceC2332l) next;
        if (interfaceC2332l != null) {
            return interfaceC2332l.loadAd(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.AbstractC16844l
    public final AbstractC5711l crashlytics(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        InterfaceC11820l c0967l;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C13686l c13686l = x509TrustManagerExtensions != null ? new C13686l(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c13686l != null) {
            return c13686l;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            c0967l = new C0403l(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            c0967l = new C0967l((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new C10656l(c0967l);
    }

    @Override // defpackage.AbstractC16844l
    public final SSLContext firebase() {
        StrictMode.noteSlowCall("newSSLContext");
        return SSLContext.getInstance("TLS");
    }

    @Override // defpackage.InterfaceC12058l
    public final Context loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC16844l
    public final void purchase(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.AbstractC16844l
    public final void subs(int i, String str, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.InterfaceC12058l
    public final void yandex(Context context) {
        this.crashlytics = context;
    }
}
