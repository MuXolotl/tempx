package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: renamed from: lًْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13214l implements Handler.Callback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11727l f25994l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Handler f25995l;

    public C13214l(C11727l c11727l, InterfaceC17529l interfaceC17529l) {
        this.f25994l = c11727l;
        Handler handlerAds = AbstractC15323l.ads(this);
        this.f25995l = handlerAds;
        interfaceC17529l.ads(this, handlerAds);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = AbstractC15323l.yandex;
        yandex(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    public final void yandex(long j) {
        Surface surface;
        C11727l c11727l = this.f25994l;
        C13645l c13645l = c11727l.f23508l;
        if (this != c11727l.f23483l || c11727l.f13920l == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            c11727l.f13959l = true;
            return;
        }
        try {
            c11727l.m2045l(j);
            C15074l c15074l = c11727l.f23500l;
            if (!c15074l.equals(C15074l.amazon) && !c15074l.equals(c11727l.f23471l)) {
                c11727l.f23471l = c15074l;
                c13645l.appmetrica(c15074l);
            }
            c11727l.f13942l.purchase++;
            C7578l c7578l = c11727l.f23498l;
            boolean z = c7578l.purchase != 3;
            c7578l.purchase = 3;
            c7578l.smaato.getClass();
            c7578l.mopub = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
            if (z && (surface = c11727l.f23468l) != null) {
                Handler handler = (Handler) c13645l.f26671l;
                if (handler != null) {
                    handler.post(new RunnableC3950l(2, SystemClock.elapsedRealtime(), c13645l, surface));
                }
                c11727l.f23491l = true;
            }
            c11727l.mo2037finally(j);
        } catch (C17361l e) {
            c11727l.f13955l = e;
        }
    }
}
