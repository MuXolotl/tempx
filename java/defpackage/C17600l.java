package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lۣ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17600l extends AbstractC16844l implements InterfaceC12058l {
    public static final boolean purchase;
    public final ArrayList amazon;
    public Context crashlytics;

    static {
        purchase = Build.VERSION.SDK_INT >= 29;
    }

    public C17600l() {
        ArrayList arrayListM2420volatile = AbstractC8669l.m2420volatile(new InterfaceC2332l[]{Build.VERSION.SDK_INT >= 29 ? new C4521l() : null, new C2448l(C3706l.billing), new C2448l(C18314l.yandex), new C2448l(C4873l.yandex)});
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
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
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
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C13686l c13686l = x509TrustManagerExtensions != null ? new C13686l(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c13686l != null) {
            return c13686l;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C10656l(new C0967l((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.AbstractC16844l
    public final SSLContext firebase() {
        StrictMode.noteSlowCall("newSSLContext");
        return SSLContext.getInstance("TLS");
    }

    @Override // defpackage.AbstractC16844l
    public final void isPro(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            ((CloseGuard) obj).warnIfOpen();
        } else {
            super.isPro(obj, str);
        }
    }

    @Override // defpackage.InterfaceC12058l
    public final Context loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC16844l
    public final Object mopub() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mopub();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // defpackage.AbstractC16844l
    public final void subs(int i, String str, Throwable th) {
        if (i == 5) {
            boolean z = C7648l.purchase;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = C7648l.purchase;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.InterfaceC12058l
    public final void yandex(Context context) {
        this.crashlytics = context;
    }
}
