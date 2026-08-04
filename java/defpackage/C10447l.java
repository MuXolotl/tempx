package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Unit;

/* JADX INFO: renamed from: lَٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10447l extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int crashlytics = 0;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C10447l(C8854l c8854l) {
        this.yandex = 0;
        this.loadAd = c8854l;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.yandex) {
            case 2:
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.yandex) {
            case 1:
                if (network.equals(((C9733l) this.loadAd).billing.getActiveNetwork())) {
                    C14513l.tapsense().vip(AbstractC14602l.yandex, "Network blocked status changed: " + z);
                    C9733l c9733l = (C9733l) this.loadAd;
                    Object objYandex = c9733l.purchase;
                    if (objYandex == null) {
                        objYandex = c9733l.yandex();
                    }
                    C9415l c9415l = (C9415l) objYandex;
                    C9733l c9733l2 = (C9733l) this.loadAd;
                    synchronized (c9733l2.mopub) {
                        if (c9733l2.admob == z) {
                            return;
                        }
                        c9733l2.admob = z;
                        Unit unit = Unit.INSTANCE;
                        ((C9733l) this.loadAd).loadAd(new C9415l(c9415l.yandex, c9415l.loadAd, c9415l.crashlytics, c9415l.amazon, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.yandex) {
            case 0:
                C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((C8854l) this.loadAd).invoke(C13487l.yandex);
                break;
            case 1:
                C14513l.tapsense().vip(AbstractC14602l.yandex, "Network capabilities changed: " + networkCapabilities);
                C9733l c9733l = (C9733l) this.loadAd;
                c9733l.loadAd(AbstractC14602l.yandex(c9733l.billing, c9733l.admob));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.yandex) {
            case 2:
                ((C7558l) this.loadAd).loadAd(network, linkProperties);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.yandex) {
            case 0:
                C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController onLost callback");
                ((C8854l) this.loadAd).invoke(new C7685l(7));
                return;
            case 1:
                C14513l.tapsense().vip(AbstractC14602l.yandex, "Network connection lost");
                ((C9733l) this.loadAd).loadAd(new C9415l(false, false, false, false, false));
                return;
            default:
                C7558l c7558l = (C7558l) this.loadAd;
                synchronized (c7558l.admob) {
                    try {
                        C7558l.smaato.loadAd("the network is lost", new Object[0]);
                        if (c7558l.purchase.remove(network)) {
                            c7558l.amazon.remove(network);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                c7558l.crashlytics();
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.yandex) {
            case 2:
                C7558l c7558l = (C7558l) this.loadAd;
                synchronized (c7558l.admob) {
                    C7558l.smaato.loadAd("all networks are unavailable.", new Object[0]);
                    c7558l.amazon.clear();
                    c7558l.purchase.clear();
                    break;
                }
                c7558l.crashlytics();
                return;
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ C10447l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    private final void yandex(Network network) {
    }
}
