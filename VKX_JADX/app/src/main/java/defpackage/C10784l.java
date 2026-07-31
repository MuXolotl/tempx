package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: lُؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10784l extends BroadcastReceiver {
    public boolean crashlytics;
    public boolean loadAd;
    public final C6901l yandex;

    public C10784l(C6901l c6901l) {
        AbstractC1051l.subs(c6901l);
        this.yandex = c6901l;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C6901l c6901l = this.yandex;
        c6901l.m2112transient();
        String action = intent.getAction();
        c6901l.mo200else().f16911l.loadAd(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c6901l.mo200else().f16910l.loadAd(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C11079l c11079l = c6901l.f14459l;
        C6901l.m2082case(c11079l);
        boolean zM3038l = c11079l.m3038l();
        if (this.crashlytics != zM3038l) {
            this.crashlytics = zM3038l;
            c6901l.mo224l().m4449l(new RunnableC10799l(this, zM3038l));
        }
    }

    public final void yandex() {
        C6901l c6901l = this.yandex;
        c6901l.m2112transient();
        c6901l.mo224l().mo211l();
        c6901l.mo224l().mo211l();
        if (this.loadAd) {
            c6901l.mo200else().f16911l.yandex("Unregistering connectivity change receiver");
            this.loadAd = false;
            this.crashlytics = false;
            try {
                c6901l.f14473l.f33936l.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c6901l.mo200else().f16908l.loadAd(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }
}
