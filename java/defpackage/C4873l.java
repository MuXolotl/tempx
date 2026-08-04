package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: lۣؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4873l implements InterfaceC2332l {
    public static final boolean loadAd;
    public static final C17885l yandex = new C17885l();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC13693l.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        loadAd = z;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean amazon(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.InterfaceC2332l
    public final void crashlytics(SSLSocket sSLSocket, String str, List list) {
        if (amazon(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            parameters.setApplicationProtocols((String[]) C6760l.subs(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.InterfaceC2332l
    public final String loadAd(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean yandex() {
        return loadAd;
    }
}
