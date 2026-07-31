package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: renamed from: lُُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC11256l extends Handler {
    public final /* synthetic */ C3726l crashlytics;
    public boolean loadAd;
    public boolean yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC11256l(C3726l c3726l, Looper looper) {
        super(looper);
        this.crashlytics = c3726l;
        this.yandex = true;
        this.loadAd = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6499l c6499l;
        int iBilling;
        C3726l c3726l = this.crashlytics;
        BinderC4841l binderC4841l = c3726l.mopub;
        if (message.what != 1) {
            C8936l.admob(message.what, "Invalid message what=");
            return;
        }
        C1908l c1908lVip = c3726l.subscription.vip(c3726l.tapsense.m4569l(), c3726l.tapsense.m4570l(), c3726l.subscription.firebase);
        c3726l.subscription = c1908lVip;
        boolean z = this.yandex;
        boolean z2 = this.loadAd;
        C1908l c1908lM1624l = binderC4841l.m1624l(c1908lVip);
        C12014l c12014l = binderC4841l.billing;
        AbstractC1186l abstractC1186lSignature = c12014l.Signature();
        for (int i = 0; i < abstractC1186lSignature.size(); i++) {
            C6499l c6499l2 = (C6499l) abstractC1186lSignature.get(i);
            try {
                C13904l c13904lPremium = c12014l.premium(c6499l2);
                if (c13904lPremium != null) {
                    iBilling = c13904lPremium.billing();
                } else if (!c3726l.remoteconfig(c6499l2)) {
                    break;
                } else {
                    iBilling = 0;
                }
                C1908l c1908lIsVip = c12014l.isVip(c6499l2);
                if (c1908lIsVip == null) {
                    c12014l.advert(c6499l2);
                    C16616l c16616lAmazon = AbstractC8672l.amazon(c12014l.ads(c6499l2), c3726l.tapsense.vip());
                    c6499l = c6499l2;
                    try {
                        InterfaceC3270l interfaceC3270l = c6499l.amazon;
                        interfaceC3270l.getClass();
                        try {
                            interfaceC3270l.startapp(iBilling, c1908lIsVip == null ? c1908lM1624l : c1908lIsVip, c16616lAmazon, z, z2);
                        } catch (DeadObjectException unused) {
                            binderC4841l.billing.m3308switch(c6499l);
                        } catch (RemoteException e) {
                            e = e;
                            AbstractC6427l.metrica("MediaSessionImpl", "Exception in " + c6499l, e);
                        }
                    } catch (DeadObjectException unused2) {
                        c6499l = c6499l;
                    } catch (RemoteException e2) {
                        e = e2;
                        c6499l = c6499l;
                    }
                }
            } catch (DeadObjectException unused3) {
                c6499l = c6499l2;
            } catch (RemoteException e3) {
                e = e3;
                c6499l = c6499l2;
            }
        }
        this.yandex = true;
        this.loadAd = true;
    }

    public final void yandex(boolean z, boolean z2) {
        boolean z3 = false;
        this.yandex = this.yandex && z;
        if (this.loadAd && z2) {
            z3 = true;
        }
        this.loadAd = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }
}
