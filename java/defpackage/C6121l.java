package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؘٖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6121l extends ProxySelector {
    public final String[] loadAd = {"vk.com", "vk.me", "vk.ru", "userapi.com", "vk-cdn.net", "vkuservideo.net", "vkuservideo.com", "vkuserlive.com", "vkuserlive.net", "vkuseraudio.com", "vkuseraudio.net", "vk-portal.net", "vk-apps.com", "vkforms.ru", "mycdn.me", "vkuser.net", "lovina.app", "mradx.net", "mail.ru", "moosic.io"};
    public final C8410l yandex;

    public C6121l(C8410l c8410l) {
        this.yandex = c8410l;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        if (this.yandex.loadAd != null) {
            return;
        }
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        Object c18435l;
        Proxy proxy;
        try {
            c18435l = (!yandex(uri) || (proxy = this.yandex.loadAd) == null) ? ProxySelector.getDefault().select(uri) : Collections.singletonList(proxy);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        List list = (List) c18435l;
        return list == null ? Collections.singletonList(Proxy.NO_PROXY) : list;
    }

    public final boolean yandex(URI uri) {
        if (!AbstractC16648l.license(uri.getScheme(), "http", true) && !AbstractC16648l.license(uri.getScheme(), "https", true)) {
            return false;
        }
        List listM4209break = AbstractC16901l.m4209break(2, AbstractC12024l.m3338public(uri.getHost(), new String[]{"."}, 6));
        if (listM4209break.size() >= 2) {
            return AbstractC8669l.subscription(AbstractC16901l.m4210case(listM4209break, ".", null, null, null, 62), this.loadAd);
        }
        return false;
    }
}
