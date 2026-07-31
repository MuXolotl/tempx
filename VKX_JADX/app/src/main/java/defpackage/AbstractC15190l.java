package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;

/* JADX INFO: renamed from: lٔۜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15190l {
    public static final /* synthetic */ int yandex = 0;

    static {
        AbstractC1937l.loadAd("io.ktor.client.plugins.HttpTimeout");
        int i = C18107l.f35405l;
        C2336l c2336l = AbstractC18202l.yandex;
        c2336l.loadAd(C10349l.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            AbstractC11726l abstractC11726lVip = c2336l.vip(c2336l.loadAd(C18449l.class));
            c2336l.smaato(abstractC11726lVip, Collections.singletonList(AbstractC18202l.yandex(Object.class)));
            AbstractC18202l.loadAd(C10349l.class, AbstractC12953l.smaato(c2336l.remoteconfig(abstractC11726lVip, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (AbstractC12024l.m3315catch("HttpTimeout")) {
            C8339l.metrica("Name can't be blank");
        }
    }

    public static final SocketTimeoutException yandex(C6472l c6472l, IOException iOException) {
        Object obj;
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append((C2540l) c6472l.f13512l);
        sb.append(", socket_timeout=");
        C14152l c14152l = (C14152l) c6472l.loadAd();
        if (c14152l == null || (obj = c14152l.crashlytics) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(sb.toString());
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
