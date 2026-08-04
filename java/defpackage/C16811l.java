package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import java.util.List;

/* JADX INFO: renamed from: lٖۨۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16811l implements InterfaceC9814l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC11345l f32834l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f32835l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C6845l f32836l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f32837l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4322l f32838l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Handler f32839l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14026l f32840l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f32841l;

    public C16811l(Context context, C12962l c12962l, Bundle bundle, InterfaceC14026l interfaceC14026l, Looper looper, C6845l c6845l, C3797l c3797l) {
        C16811l c16811l;
        InterfaceC11345l c13208l;
        AbstractC12442l.metrica(context, "context must not be null");
        AbstractC12442l.metrica(c12962l, "token must not be null");
        AbstractC6427l.firebase("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "]");
        this.f32838l = new C4322l();
        this.f32841l = -9223372036854775807L;
        this.f32840l = interfaceC14026l;
        this.f32839l = new Handler(looper);
        this.f32836l = c6845l;
        if (c12962l.yandex.purchase()) {
            c3797l.getClass();
            c13208l = new C0188l(context, this, c12962l, bundle, looper, c3797l);
            c16811l = this;
        } else {
            c16811l = this;
            c13208l = new C13208l(context, c16811l, c12962l, bundle, looper);
        }
        c16811l.f32834l = c13208l;
        c13208l.mo318l();
    }

    @Override // defpackage.InterfaceC9814l
    public final void Signature(InterfaceC13521l interfaceC13521l) {
        AbstractC12442l.metrica(interfaceC13521l, "listener must not be null");
        this.f32834l.Signature(interfaceC13521l);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4197abstract(Runnable runnable) {
        AbstractC15323l.m3966final(this.f32839l, runnable);
    }

    @Override // defpackage.InterfaceC9814l
    public final int ad() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.ad();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    public final void adcel() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.adcel();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final int admob() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.admob();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC9814l
    public final void ads(boolean z) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.ads(z);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final C15074l advert() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.advert() : C15074l.amazon;
    }

    @Override // defpackage.InterfaceC9814l
    public final boolean amazon() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.amazon();
    }

    @Override // defpackage.InterfaceC9814l
    public final C13736l applovin() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return !interfaceC11345l.mo319l() ? C13736l.subs : interfaceC11345l.applovin();
    }

    @Override // defpackage.InterfaceC9814l
    public final void appmetrica(int i, boolean z) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.appmetrica(i, z);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final C1372l billing() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.billing() : C1372l.amazon;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: break */
    public final void mo2748break(C13736l c13736l, boolean z) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo291break(c13736l, z);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: case */
    public final void mo2749case() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo292case();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: catch */
    public final void mo2750catch(SurfaceHolder surfaceHolder) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo293catch(surfaceHolder);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: class */
    public final void mo2751class(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo294class(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: const */
    public final void mo2752const(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo295const(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: continue */
    public final void mo2753continue(boolean z) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo296continue(z);
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final void crashlytics(float f) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.crashlytics(f);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: default */
    public final void mo2754default(int i, List list) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo297default(i, list);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: else */
    public final void mo2755else(float f) {
        m4198l();
        AbstractC12442l.subs(f >= 0.0f && f <= 1.0f, "volume must be between 0 and 1");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo298else(f);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: extends */
    public final void mo2756extends(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo299extends(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: final */
    public final void mo2757final() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo300final();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring unmute().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: finally */
    public final boolean mo2758finally() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.mo301finally();
    }

    @Override // defpackage.InterfaceC9814l
    public final long firebase() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.firebase();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: for */
    public final void mo2759for(long j) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo302for(j);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final long getDuration() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: goto */
    public final void mo2760goto() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo303goto();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: implements */
    public final int mo2761implements() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo304implements();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: import */
    public final C1047l mo2762import() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.mo305import() : C1047l.loadAd;
    }

    @Override // defpackage.InterfaceC9814l
    public final C2848l inmobi() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return !interfaceC11345l.mo319l() ? C2848l.purchase : interfaceC11345l.inmobi();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: instanceof */
    public final boolean mo2763instanceof() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.mo306instanceof();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: interface */
    public final long mo2764interface() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo307interface();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    public final long isPro() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.isPro();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC9814l
    public final void isVip() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.isVip();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final int license() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.license();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    public final void loadAd(C1372l c1372l) {
        m4198l();
        AbstractC12442l.metrica(c1372l, "playbackParameters must not be null");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.loadAd(c1372l);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final void mo2765l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo309l();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring mute().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final C4970l mo2766l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return !interfaceC11345l.mo319l() ? C4970l.f10152volatile : interfaceC11345l.mo310l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final void mo2767l(C2427l c2427l) {
        m4198l();
        AbstractC12442l.metrica(c2427l, "mediaItems must not be null");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo311l(c2427l);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final void m4198l() {
        AbstractC12442l.ads("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f32839l.getLooper());
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final void mo2768l(List list) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo313l(list);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙؔؑ */
    public final void mo2769l(List list) {
        m4198l();
        AbstractC12442l.metrica(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            AbstractC12442l.mopub("items must not contain null, index=%s", list.get(i) != null, i);
        }
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo314l(list);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo2770l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo315l();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lّؗؑ */
    public final long mo2771l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo317l();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘِٞ */
    public final void mo2772l(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo320l(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final void mo2773l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo321l();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public final C3852l mo2774l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.mo322l() : C3852l.f7980private;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final long mo2775l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo323l();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo2776l(C2427l c2427l) {
        m4198l();
        AbstractC12442l.metrica(c2427l, "mediaItems must not be null");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo324l(c2427l);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًَٙ */
    public final boolean mo2777l() {
        m4198l();
        AbstractC10759l abstractC10759lMo2791l = mo2791l();
        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f32838l, 0L).yandex();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًٚٔ */
    public final C2427l mo2778l() {
        AbstractC10759l abstractC10759lMo2791l = mo2791l();
        if (abstractC10759lMo2791l.startapp()) {
            return null;
        }
        return abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f32838l, 0L).crashlytics;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍۤٙ */
    public final boolean mo2779l(int i) {
        return vip().yandex(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lُٔۨ */
    public final Looper mo2780l() {
        return this.f32839l.getLooper();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘْؒ */
    public final void mo2781l(int i, long j, List list) {
        m4198l();
        AbstractC12442l.metrica(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractC12442l.mopub("items must not contain null, index=%s", list.get(i2) != null, i2);
        }
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo327l(i, j, list);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚْٟ */
    public final long mo2782l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo328l();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٓؒ */
    public final boolean mo2783l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo329l();
        }
        return false;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final void mo2784l(int i, C2427l c2427l) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo330l(i, c2427l);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْۥٞ */
    public final void mo2785l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo331l();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final void mo2786l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo332l();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo2787l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo333l();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final boolean mo2788l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.mo334l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕۗٞ */
    public final boolean mo2789l() {
        m4198l();
        AbstractC10759l abstractC10759lMo2791l = mo2791l();
        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f32838l, 0L).subs;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؔ */
    public final void mo2790l(int i, int i2, int i3) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo336l(i, i2, i3);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؕ */
    public final AbstractC10759l mo2791l() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.mo338l() : AbstractC10759l.yandex;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final int mo2792l() {
        return mo2791l().metrica();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final boolean mo2793l() {
        m4198l();
        AbstractC10759l abstractC10759lMo2791l = mo2791l();
        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f32838l, 0L).admob;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo2794l() {
        return false;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final void mo2795l(int i, int i2) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo342l(i, i2);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final void mo2796l(InterfaceC13521l interfaceC13521l) {
        m4198l();
        AbstractC12442l.metrica(interfaceC13521l, "listener must not be null");
        this.f32834l.mo344l(interfaceC13521l);
    }

    @Override // defpackage.InterfaceC9814l
    public final void metrica(C2427l c2427l, long j) {
        m4198l();
        AbstractC12442l.metrica(c2427l, "mediaItems must not be null");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.metrica(c2427l, j);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final int mopub() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mopub();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: native */
    public final void mo2797native(int i, int i2, List list) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo346native(i, i2, list);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: new */
    public final long mo2798new() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo347new();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: package */
    public final void mo2799package(int i, int i2) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo348package(i, i2);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final void premium() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.premium();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: private */
    public final void mo2800private(C4970l c4970l) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (!interfaceC11345l.mo319l()) {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        interfaceC11345l.mo349private(c4970l);
    }

    @Override // defpackage.InterfaceC9814l
    public final long pro() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.pro();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: protected */
    public final void mo2801protected() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo350protected();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: public */
    public final C3852l mo2802public() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.mo351public() : C3852l.f7980private;
    }

    @Override // defpackage.InterfaceC9814l
    public final int purchase() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.purchase();
        }
        return 1;
    }

    @Override // defpackage.InterfaceC9814l
    public final void release() {
        m4198l();
        if (this.f32837l) {
            return;
        }
        AbstractC6427l.firebase("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "] [" + AbstractC17959l.loadAd() + "]");
        this.f32837l = true;
        Handler handler = this.f32839l;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f32834l.release();
        } catch (Exception e) {
            AbstractC6427l.mopub("MediaController", "Exception while releasing impl", e);
        }
        if (this.f32835l) {
            AbstractC12442l.subscription(Looper.myLooper() == handler.getLooper());
            this.f32840l.yandex();
        } else {
            this.f32835l = true;
            C6845l c6845l = this.f32836l;
            c6845l.getClass();
            c6845l.remoteconfig(new SecurityException("Session rejected the connection request."));
        }
    }

    public final void remoteconfig() {
        AbstractC12442l.subscription(Looper.myLooper() == this.f32839l.getLooper());
        AbstractC12442l.subscription(!this.f32835l);
        this.f32835l = true;
        C6845l c6845l = this.f32836l;
        c6845l.f14307l = true;
        C16811l c16811l = c6845l.f14308l;
        if (c16811l != null) {
            c6845l.smaato(c16811l);
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: return */
    public final void mo2803return(boolean z) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo352return(z);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final float signatures() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.signatures();
        }
        return 1.0f;
    }

    @Override // defpackage.InterfaceC9814l
    public final void smaato(int i, long j) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.smaato(i, j);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final boolean startapp() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.startapp();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: static */
    public final long mo2804static() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo353static();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    public final void stop() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.stop();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: strictfp */
    public final int mo2805strictfp() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo354strictfp();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    public final boolean subs() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() && interfaceC11345l.subs();
    }

    @Override // defpackage.InterfaceC9814l
    public final int subscription() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.subscription();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: super */
    public final void mo2806super(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo355super(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: switch */
    public final C14723l mo2807switch() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo356switch();
        }
        return null;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: synchronized */
    public final void mo2808synchronized(int i) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo357synchronized(i);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    public final long tapsense() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.tapsense();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: this */
    public final C16684l mo2809this() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return interfaceC11345l.mo319l() ? interfaceC11345l.mo358this() : C16684l.amazon;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throw */
    public final void mo2810throw(int i, int i2) {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo359throw(i, i2);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throws */
    public final void mo2811throws() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo360throws();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: transient */
    public final void mo2812transient(C3852l c3852l) {
        m4198l();
        AbstractC12442l.metrica(c3852l, "playlistMetadata must not be null");
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo361transient(c3852l);
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: try */
    public final int mo2813try() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo362try();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    public final C16616l vip() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        return !interfaceC11345l.mo319l() ? C16616l.loadAd : interfaceC11345l.vip();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: volatile */
    public final void mo2814volatile() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.mo363volatile();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: while */
    public final int mo2815while() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            return interfaceC11345l.mo364while();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9814l
    public final void yandex() {
        m4198l();
        InterfaceC11345l interfaceC11345l = this.f32834l;
        if (interfaceC11345l.mo319l()) {
            interfaceC11345l.yandex();
        } else {
            AbstractC6427l.vip("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }
}
