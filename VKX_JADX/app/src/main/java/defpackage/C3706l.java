package defpackage;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: lؕۡۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C3706l implements InterfaceC2332l {
    public static final C15617l billing = new C15617l(0, 24);
    public final Method amazon;
    public final Method crashlytics;
    public final Method loadAd;
    public final Method purchase;
    public final Class yandex;

    public C3706l(Class cls) {
        this.yandex = cls;
        this.loadAd = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.crashlytics = cls.getMethod("setHostname", String.class);
        this.amazon = cls.getMethod("getAlpnSelectedProtocol", null);
        this.purchase = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean amazon(SSLSocket sSLSocket) {
        return this.yandex.isInstance(sSLSocket);
    }

    @Override // defpackage.InterfaceC2332l
    public final void crashlytics(SSLSocket sSLSocket, String str, List list) {
        if (this.yandex.isInstance(sSLSocket)) {
            try {
                this.loadAd.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.crashlytics.invoke(sSLSocket, str);
                }
                Method method = this.purchase;
                AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                method.invoke(sSLSocket, C6760l.firebase(list));
            } catch (IllegalAccessException e) {
                C8339l.subs(e);
            } catch (InvocationTargetException e2) {
                C8339l.subs(e2);
            }
        }
    }

    @Override // defpackage.InterfaceC2332l
    public final String loadAd(SSLSocket sSLSocket) {
        if (this.yandex.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.amazon.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC9050l.yandex);
                }
            } catch (IllegalAccessException e) {
                C8339l.subs(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC8576l.yandex(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C8339l.subs(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean yandex() {
        boolean z = C7648l.purchase;
        return C7648l.purchase;
    }
}
