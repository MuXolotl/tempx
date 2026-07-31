package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import defpackage.AbstractC1051l;
import defpackage.AbstractC11229l;
import defpackage.AbstractC14627l;
import defpackage.C0022l;
import defpackage.C0189l;
import defpackage.C10679l;
import defpackage.C13641l;
import defpackage.C15504l;
import defpackage.C17186l;
import defpackage.C17667l;
import defpackage.C6528l;
import defpackage.C9162l;
import defpackage.InterfaceC13996l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final C0022l log = new C0022l(TAG, null);

    private static C17186l getRemoteMediaClient(C0189l c0189l) {
        if (c0189l == null) {
            return null;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        InterfaceC13996l interfaceC13996l = c0189l.yandex;
        boolean z = false;
        if (interfaceC13996l != null) {
            try {
                C10679l c10679l = (C10679l) interfaceC13996l;
                Parcel parcelM746l = c10679l.m746l(c10679l.m743l(), 5);
                int i = AbstractC14627l.yandex;
                boolean z2 = parcelM746l.readInt() != 0;
                parcelM746l.recycle();
                z = z2;
            } catch (RemoteException e) {
                AbstractC11229l.loadAd.yandex(e, "Unable to call %s on %s.", "isConnected", InterfaceC13996l.class.getSimpleName());
            }
        }
        if (!z) {
            return null;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        return c0189l.isPro;
    }

    private void seek(C0189l c0189l, long j) {
        C17186l remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(c0189l)) == null || remoteMediaClient.mopub() || remoteMediaClient.isPro()) {
            return;
        }
        C13641l c13641l = new C13641l(remoteMediaClient.yandex() + j);
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (remoteMediaClient.adcel()) {
            C17186l.ads(new C9162l(remoteMediaClient, c13641l));
        } else {
            C17186l.startapp();
        }
    }

    private void togglePlayback(C0189l c0189l) {
        C17186l remoteMediaClient = getRemoteMediaClient(c0189l);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.smaato();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        log.loadAd("onReceive action: %s", action);
        if (action == null) {
            return;
        }
        C15504l c15504lYandex = C15504l.yandex(context);
        c15504lYandex.getClass();
        AbstractC1051l.purchase("Must be called from the main thread.");
        C17667l c17667l = c15504lYandex.loadAd;
        AbstractC11229l abstractC11229lCrashlytics = c17667l.crashlytics();
        if (abstractC11229lCrashlytics != null) {
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        onReceiveActionRewind(abstractC11229lCrashlytics, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        onReceiveActionSkipNext(abstractC11229lCrashlytics);
                        return;
                    }
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        onReceiveActionSkipPrev(abstractC11229lCrashlytics);
                        return;
                    }
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        c17667l.loadAd(true);
                        return;
                    }
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        c17667l.loadAd(false);
                        return;
                    }
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        onReceiveActionTogglePlayback(abstractC11229lCrashlytics);
                        return;
                    }
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        onReceiveActionForward(abstractC11229lCrashlytics, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        onReceiveActionMediaButton(abstractC11229lCrashlytics, intent);
                        return;
                    }
                    break;
            }
            onReceiveOtherAction(context, action, intent);
        }
    }

    public void onReceiveActionForward(AbstractC11229l abstractC11229l, long j) {
        if (abstractC11229l instanceof C0189l) {
            seek((C0189l) abstractC11229l, j);
        }
    }

    public void onReceiveActionMediaButton(AbstractC11229l abstractC11229l, Intent intent) {
        if ((abstractC11229l instanceof C0189l) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            AbstractC1051l.subs(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((C0189l) abstractC11229l);
            }
        }
    }

    public void onReceiveActionRewind(AbstractC11229l abstractC11229l, long j) {
        if (abstractC11229l instanceof C0189l) {
            seek((C0189l) abstractC11229l, -j);
        }
    }

    public void onReceiveActionSkipNext(AbstractC11229l abstractC11229l) {
        C17186l remoteMediaClient;
        if (!(abstractC11229l instanceof C0189l) || (remoteMediaClient = getRemoteMediaClient((C0189l) abstractC11229l)) == null || remoteMediaClient.isPro()) {
            return;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (remoteMediaClient.adcel()) {
            C17186l.ads(new C6528l(remoteMediaClient, 1, false));
        } else {
            C17186l.startapp();
        }
    }

    public void onReceiveActionSkipPrev(AbstractC11229l abstractC11229l) {
        C17186l remoteMediaClient;
        if (!(abstractC11229l instanceof C0189l) || (remoteMediaClient = getRemoteMediaClient((C0189l) abstractC11229l)) == null || remoteMediaClient.isPro()) {
            return;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (remoteMediaClient.adcel()) {
            C17186l.ads(new C6528l(remoteMediaClient, 0, false));
        } else {
            C17186l.startapp();
        }
    }

    public void onReceiveActionTogglePlayback(AbstractC11229l abstractC11229l) {
        if (abstractC11229l instanceof C0189l) {
            togglePlayback((C0189l) abstractC11229l);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
