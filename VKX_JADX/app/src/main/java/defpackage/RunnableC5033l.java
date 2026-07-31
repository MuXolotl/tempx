package defpackage;

import android.util.Log;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.HashSet;

/* JADX INFO: renamed from: lؗٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5033l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8181l f10292l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10293l;

    public /* synthetic */ RunnableC5033l(C8181l c8181l, int i) {
        this.f10293l = i;
        this.f10292l = c8181l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10293l;
        C8181l c8181l = this.f10292l;
        switch (i) {
            case 0:
                c8181l.getClass();
                C10866l c10866l = new C10866l(c8181l);
                C17667l c17667l = c8181l.billing;
                AbstractC1051l.subs(c17667l);
                c17667l.yandex(c10866l);
                break;
            default:
                C0022l c0022l = C8181l.mopub;
                Log.i(c0022l.yandex, c0022l.amazon("transfer with type = %d has timed out", 0));
                c0022l.loadAd("notify failed transfer with type = %d, reason = %d", 0, Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER));
                for (C16880l c16880l : new HashSet(c8181l.loadAd)) {
                    switch (c16880l.yandex) {
                        case 0:
                            C0022l c0022l2 = C9670l.subs;
                            C9670l.subs.loadAd("onTransferFailed with type = %d and reason = %d", 0, Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER));
                            C9670l c9670l = (C9670l) c16880l.loadAd;
                            c9670l.purchase();
                            C8292l c8292l = c9670l.crashlytics;
                            C14514l c14514l = c9670l.mopub;
                            C4039l c4039l = c9670l.yandex;
                            C15010l c15010lLoadAd = c8292l.loadAd(c14514l);
                            C18277l c18277lRemoteconfig = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
                            c18277lRemoteconfig.yandex();
                            ((C0216l) c18277lRemoteconfig.f3757l).license();
                            c18277lRemoteconfig.yandex();
                            ((C0216l) c18277lRemoteconfig.f3757l).pro();
                            c15010lLoadAd.amazon((C0216l) c18277lRemoteconfig.loadAd());
                            c4039l.yandex((C18278l) c15010lLoadAd.loadAd(), 232);
                            break;
                        default:
                            C13698l c13698l = new C13698l(11, 29);
                            c13698l.f26743l = Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                            C3557l c3557l = (C3557l) c16880l.loadAd;
                            c13698l.f26746l = Boolean.valueOf(((BinderC11031l) c3557l.f7479l).mopub == 2);
                            c3557l.mopub(new C6276l(c13698l));
                            break;
                    }
                }
                c8181l.yandex();
                break;
        }
    }
}
