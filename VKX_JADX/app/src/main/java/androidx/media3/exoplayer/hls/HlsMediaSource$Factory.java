package androidx.media3.exoplayer.hls;

import defpackage.AbstractC12442l;
import defpackage.AbstractC14384l;
import defpackage.C12149l;
import defpackage.C14513l;
import defpackage.C14823l;
import defpackage.C1770l;
import defpackage.C18262l;
import defpackage.C18449l;
import defpackage.C18595l;
import defpackage.C2427l;
import defpackage.C2782l;
import defpackage.C6827l;
import defpackage.C8565l;
import defpackage.InterfaceC0587l;
import defpackage.InterfaceC0729l;
import defpackage.InterfaceC11445l;
import defpackage.InterfaceC12873l;
import defpackage.appmetrica;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC11445l {
    public C8565l crashlytics;
    public appmetrica loadAd;
    public final C1770l yandex;
    public final C18449l subs = new C18449l(13);
    public final C2782l billing = new C2782l(28);
    public final C18262l mopub = C6827l.f14254l;
    public C14513l isPro = new C14513l(-1, 6, (byte) 0);
    public final C14823l admob = new C14823l(28);
    public final int smaato = 1;
    public final long remoteconfig = -9223372036854775807L;
    public final boolean firebase = true;
    public int purchase = 3;
    public boolean amazon = true;

    public HlsMediaSource$Factory(InterfaceC0587l interfaceC0587l) {
        this.yandex = new C1770l(10, interfaceC0587l);
    }

    @Override // defpackage.InterfaceC11445l
    public final AbstractC14384l amazon(C2427l c2427l) {
        c2427l.loadAd.getClass();
        if (this.loadAd == null) {
            appmetrica appmetricaVar = new appmetrica((char) 0, 1);
            appmetricaVar.f492l = new C8565l(28);
            appmetricaVar.f489l = 3;
            this.loadAd = appmetricaVar;
        }
        C8565l c8565l = this.crashlytics;
        if (c8565l != null) {
            this.loadAd.f492l = c8565l;
        }
        appmetrica appmetricaVar2 = this.loadAd;
        appmetricaVar2.f490l = this.amazon;
        appmetricaVar2.f489l = this.purchase;
        List list = c2427l.loadAd.purchase;
        boolean zIsEmpty = list.isEmpty();
        InterfaceC12873l c18595l = this.billing;
        if (!zIsEmpty) {
            c18595l = new C18595l(c18595l, list, 23);
        }
        InterfaceC0729l interfaceC0729lM4550package = this.subs.m4550package(c2427l);
        C14513l c14513l = this.isPro;
        this.mopub.getClass();
        C1770l c1770l = this.yandex;
        return new C12149l(c2427l, c1770l, appmetricaVar2, this.admob, interfaceC0729lM4550package, c14513l, new C6827l(c1770l, c14513l, c18595l), this.remoteconfig, this.firebase, this.smaato);
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l crashlytics(boolean z) {
        this.amazon = z;
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l loadAd(int i) {
        this.purchase = i;
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l purchase(C14513l c14513l) {
        AbstractC12442l.metrica(c14513l, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.isPro = c14513l;
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l yandex(C8565l c8565l) {
        this.crashlytics = c8565l;
        return this;
    }
}
