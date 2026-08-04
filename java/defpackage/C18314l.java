package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: lِ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18314l implements InterfaceC2332l {
    public static final boolean loadAd;
    public static final C18450l yandex = new C18450l(27);

    static {
        Conscrypt.Version version;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC6993l.class.getClassLoader());
            if (Conscrypt.isAvailable() && (version = Conscrypt.version()) != null) {
                if (version.major() != 2) {
                    if (version.major() > 2) {
                        z = true;
                    }
                } else if (version.minor() != 1) {
                    if (version.minor() > 1) {
                        z = true;
                    }
                } else if (version.patch() >= 0) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        loadAd = z;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean amazon(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.InterfaceC2332l
    public final void crashlytics(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C6760l.subs(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.InterfaceC2332l
    public final String loadAd(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2332l
    public final boolean yandex() {
        return loadAd;
    }
}
