package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lَۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10743l extends AbstractC14384l {
    public boolean adcel;
    public final InterfaceC0587l admob;
    public boolean ads;
    public final C14513l firebase;
    public final InterfaceC0729l isPro;
    public final C5978l remoteconfig;
    public final int smaato;
    public boolean startapp;
    public final C6536l subs;
    public C7713l subscription;
    public C2427l tapsense;
    public boolean vip = true;
    public long metrica = -9223372036854775807L;

    public C10743l(C2427l c2427l, InterfaceC0587l interfaceC0587l, C6536l c6536l, InterfaceC0729l interfaceC0729l, C14513l c14513l, int i, C5978l c5978l) {
        this.tapsense = c2427l;
        this.admob = interfaceC0587l;
        this.subs = c6536l;
        this.isPro = interfaceC0729l;
        this.firebase = c14513l;
        this.smaato = i;
        this.remoteconfig = c5978l;
    }

    public final void Signature(long j, InterfaceC12703l interfaceC12703l, boolean z) {
        if (this.ads && interfaceC12703l.amazon()) {
            return;
        }
        this.ads = !interfaceC12703l.amazon();
        if (j == -9223372036854775807L) {
            j = this.metrica;
        }
        boolean zLoadAd = interfaceC12703l.loadAd();
        if (!this.vip && this.metrica == j && this.startapp == zLoadAd && this.adcel == z) {
            return;
        }
        this.metrica = j;
        this.startapp = zLoadAd;
        this.adcel = z;
        this.vip = false;
        tapsense();
    }

    @Override // defpackage.AbstractC14384l
    public final synchronized C2427l admob() {
        return this.tapsense;
    }

    @Override // defpackage.AbstractC14384l
    public final InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        InterfaceC14090l interfaceC14090lPro = this.admob.pro();
        C7713l c7713l = this.subscription;
        if (c7713l != null) {
            interfaceC14090lPro.metrica(c7713l);
        }
        C17805l c17805l = admob().loadAd;
        c17805l.getClass();
        Uri uri = c17805l.yandex;
        this.mopub.getClass();
        return new C9159l(uri, interfaceC14090lPro, new C18449l(8, (InterfaceC6384l) this.subs.f13620l), this.isPro, new C13281l(this.amazon.crashlytics, 0, c5019l), this.firebase, new C13698l((CopyOnWriteArrayList) this.crashlytics.f26746l, 0, c5019l), this, interfaceC3783l, c17805l.billing, this.smaato, this.remoteconfig, AbstractC15323l.m3962continue(c17805l.subs), null);
    }

    @Override // defpackage.AbstractC14384l
    public final void smaato(C7713l c7713l) {
        this.subscription = c7713l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C17849l c17849l = this.mopub;
        c17849l.getClass();
        InterfaceC0729l interfaceC0729l = this.isPro;
        interfaceC0729l.firebase(looperMyLooper, c17849l);
        interfaceC0729l.yandex();
        tapsense();
    }

    @Override // defpackage.AbstractC14384l
    public final void startapp() {
        this.isPro.release();
    }

    @Override // defpackage.AbstractC14384l
    public final synchronized void subscription(C2427l c2427l) {
        this.tapsense = c2427l;
    }

    public final void tapsense() {
        long j = this.metrica;
        boolean z = this.startapp;
        boolean z2 = this.adcel;
        C2427l c2427lAdmob = admob();
        AbstractC10759l c8564l = new C8564l(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c2427lAdmob, z2 ? c2427lAdmob.crashlytics : null);
        if (this.vip) {
            c8564l = new C16782l(c8564l);
        }
        remoteconfig(c8564l);
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        C9159l c9159l = (C9159l) interfaceC8782l;
        if (c9159l.f18838l) {
            for (C15637l c15637l : c9159l.f18817l) {
                c15637l.firebase();
                InterfaceC9655l interfaceC9655l = c15637l.admob;
                if (interfaceC9655l != null) {
                    interfaceC9655l.amazon(c15637l.purchase);
                    c15637l.admob = null;
                    c15637l.mopub = null;
                }
            }
        }
        c9159l.f18818l.m4549new(c9159l);
        c9159l.f18856l.removeCallbacksAndMessages(null);
        c9159l.f18834l = null;
        c9159l.f18844l = true;
    }

    @Override // defpackage.AbstractC14384l
    public final boolean yandex(C2427l c2427l) {
        C17805l c17805l = admob().loadAd;
        c17805l.getClass();
        C17805l c17805l2 = c2427l.loadAd;
        return c17805l2 != null && c17805l2.yandex.equals(c17805l.yandex) && c17805l2.subs == c17805l.subs && Objects.equals(c17805l2.billing, c17805l.billing);
    }

    @Override // defpackage.AbstractC14384l
    public final void isPro() {
    }
}
