package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC12617l implements ServiceConnection {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12624l f24844l;

    public ServiceConnectionC12617l(AbstractC12624l abstractC12624l) {
        this.f24844l = abstractC12624l;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC12624l abstractC12624l = this.f24844l;
        abstractC12624l.crashlytics = true;
        InterfaceC7702l interfaceC7702l = abstractC12624l.loadAd;
        if (interfaceC7702l != null) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            AbstractC12832l.mopub(interfaceC7702l, vKXApplication);
        }
        abstractC12624l.loadAd = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f24844l.crashlytics = false;
    }
}
