package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lًۗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8214l {
    public static final AtomicReference startapp = new AtomicReference(null);
    public InterfaceC9474l admob;
    public final C15035l amazon;
    public final Bundle billing;
    public final String crashlytics;
    public final C13708l firebase;
    public final C13708l isPro;
    public final InterfaceC9814l loadAd;
    public boolean metrica;
    public final Bundle mopub;
    public PendingIntent purchase;
    public final boolean remoteconfig;
    public final C13708l smaato;
    public final boolean subs;
    public final int vip;
    public final Context yandex;

    public C8214l(PlaybackService playbackService, C11644l c11644l, C15035l c15035l) {
        Context applicationContext = playbackService.getApplicationContext();
        applicationContext.getClass();
        this.yandex = applicationContext;
        c11644l.getClass();
        this.loadAd = c11644l;
        AbstractC12442l.admob(c11644l.mo2794l());
        this.crashlytics = "";
        this.amazon = c15035l;
        this.billing = new Bundle();
        this.mopub = new Bundle();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        this.isPro = c13708l;
        this.firebase = c13708l;
        this.subs = true;
        this.remoteconfig = true;
        this.smaato = c13708l;
        this.vip = 2;
    }
}
