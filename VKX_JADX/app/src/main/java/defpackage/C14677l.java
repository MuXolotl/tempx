package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Looper;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14677l implements InterfaceC17224l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final RouteDiscoveryPreference f28721l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2061l f28722l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C7291l f28723l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public MediaRouter2 f28724l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1080l f28725l;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        f28721l = new RouteDiscoveryPreference.Builder(C13708l.f26763l, false).build();
    }

    public static boolean crashlytics(MediaRouter2 mediaRouter2) {
        mediaRouter2.getClass();
        int transferReason = mediaRouter2.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
        Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            int suitabilityStatus = C17132l.subs(it.next()).getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if (transferReason == 1 || transferReason == 2) {
                    if (zWasTransferInitiatedBySelf) {
                        return true;
                    }
                }
            } else if (suitabilityStatus == 0) {
                return true;
            }
        }
        return false;
    }

    public static void loadAd(C14677l c14677l, Context context) {
        c14677l.f28725l.getClass();
        c14677l.f28724l = MediaRouter2.getInstance(context);
        c14677l.f28723l = new C7291l();
        C1080l c1080l = c14677l.f28725l;
        Objects.requireNonNull(c1080l);
        ExecutorC12010l executorC12010l = new ExecutorC12010l(0, c1080l);
        c14677l.f28724l.registerRouteCallback(executorC12010l, c14677l.f28723l, f28721l);
        C2061l c2061l = new C2061l(0, c14677l);
        c14677l.f28722l = c2061l;
        c14677l.f28724l.registerControllerCallback(executorC12010l, c2061l);
        c14677l.f28725l.m787catch(Boolean.valueOf(crashlytics(c14677l.f28724l)));
    }

    public static void yandex(C14677l c14677l) {
        MediaRouter2 mediaRouter2 = c14677l.f28724l;
        mediaRouter2.getClass();
        C2061l c2061l = c14677l.f28722l;
        c2061l.getClass();
        mediaRouter2.unregisterControllerCallback(c2061l);
        c14677l.f28722l = null;
        MediaRouter2 mediaRouter3 = c14677l.f28724l;
        C7291l c7291l = c14677l.f28723l;
        c7291l.getClass();
        mediaRouter3.unregisterRouteCallback(c7291l);
    }

    @Override // defpackage.InterfaceC17224l
    public final void admob() {
        C1080l c1080l = this.f28725l;
        c1080l.getClass();
        c1080l.m797private(new RunnableC16112l(26, this));
    }

    @Override // defpackage.InterfaceC17224l
    public final void pro(C6788l c6788l, Context context, Looper looper, Looper looper2, C18527l c18527l) {
        C1080l c1080l = new C1080l(Boolean.TRUE, looper2, looper, c18527l, new C14668l(c6788l, 1));
        this.f28725l = c1080l;
        c1080l.m797private(new RunnableC0336l(this, context, 4));
    }

    @Override // defpackage.InterfaceC17224l
    public final boolean vip() {
        C1080l c1080l = this.f28725l;
        if (c1080l == null) {
            return true;
        }
        return ((Boolean) c1080l.tapsense()).booleanValue();
    }
}
