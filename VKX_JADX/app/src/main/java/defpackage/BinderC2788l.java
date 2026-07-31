package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٌؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2788l extends AbstractBinderC15260l {
    public final HandlerC4052l admob;
    public final AtomicReference mopub;

    public BinderC2788l(C16533l c16533l) {
        super(1);
        this.mopub = new AtomicReference(c16533l);
        this.admob = new HandlerC4052l(c16533l.amazon, 6);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final void mo1248l(int i) {
        C16533l c16533l = null;
        C16533l c16533l2 = (C16533l) this.mopub.getAndSet(null);
        if (c16533l2 != null) {
            c16533l2.f32322throw = -1;
            c16533l2.f32311catch = -1;
            c16533l2.applovin = null;
            c16533l2.f32319strictfp = null;
            c16533l2.f32314extends = 0.0d;
            c16533l2.appmetrica();
            c16533l2.f32324volatile = false;
            c16533l2.f32315for = null;
            c16533l = c16533l2;
        }
        if (c16533l == null) {
            return;
        }
        C16533l.f32307class.loadAd("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            int i2 = c16533l.advert.get();
            HandlerC0911l handlerC0911l = c16533l.mopub;
            handlerC0911l.sendMessage(handlerC0911l.obtainMessage(6, i2, 2));
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public final void mo1249l(int i) {
        if (((C16533l) this.mopub.get()) == null) {
            return;
        }
        synchronized (C16533l.f32309static) {
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final void mo1250l(C5040l c5040l, String str, String str2, boolean z) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        c16533l.applovin = c5040l;
        c16533l.f32313else = c5040l.f10309l;
        c16533l.f32310case = str2;
        c16533l.f32319strictfp = str;
        synchronized (C16533l.f32308interface) {
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public final void mo1251l(int i) {
        if (((C16533l) this.mopub.get()) == null) {
            return;
        }
        synchronized (C16533l.f32309static) {
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void mo1252l(long j) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        c16533l.inmobi(0, j);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public final void mo1253l(int i) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        c16533l.f32313else = null;
        c16533l.f32310case = null;
        synchronized (C16533l.f32309static) {
        }
        if (c16533l.inmobi != null) {
            this.admob.post(new RunnableC16326l(this, c16533l, i));
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    public final void mo1254l(C13853l c13853l) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        C16533l.f32307class.loadAd("onApplicationStatusChanged", new Object[0]);
        this.admob.post(new RunnableC16301l(this, c16533l, c13853l, 26));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    public final void mo1255l(C3882l c3882l) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        C16533l.f32307class.loadAd("onDeviceStatusChanged", new Object[0]);
        this.admob.post(new RunnableC16301l(this, c16533l, c3882l, 25));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public final void mo1256l() {
        C16533l.f32307class.loadAd("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void mo1257l(int i, long j) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        c16533l.inmobi(i, j);
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public final void mo1259l(int i) {
        if (((C16533l) this.mopub.get()) == null) {
            return;
        }
        synchronized (C16533l.f32308interface) {
        }
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void mo1261l(String str, byte[] bArr) {
        if (((C16533l) this.mopub.get()) == null) {
            return;
        }
        C0022l c0022l = C16533l.f32307class;
        C16533l.f32307class.loadAd("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final void mo1262l(String str, String str2) {
        C16533l c16533l = (C16533l) this.mopub.get();
        if (c16533l == null) {
            return;
        }
        C16533l.f32307class.loadAd("Receive (type=text, ns=%s) %s", str, str2);
        this.admob.post(new RunnableC7706l(this, c16533l, str, str2));
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final void mo1258l(int i) {
    }

    @Override // defpackage.AbstractBinderC15260l
    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final void mo1260l(int i) {
    }
}
