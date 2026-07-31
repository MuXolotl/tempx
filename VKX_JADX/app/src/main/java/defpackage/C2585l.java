package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import j$.util.Objects;

/* JADX INFO: renamed from: lْؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2585l extends AbstractC0294l {
    public final /* synthetic */ C9937l mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2585l(C9937l c9937l) {
        super(1);
        Objects.requireNonNull(c9937l);
        this.mopub = c9937l;
    }

    @Override // defpackage.AbstractC0294l
    public final boolean isPro(Intent intent) {
        C17186l c17186l;
        C9937l.license.loadAd("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (c17186l = this.mopub.vip) == null) {
            return true;
        }
        c17186l.smaato();
        return true;
    }

    @Override // defpackage.AbstractC0294l
    public final void metrica() {
        C9937l.license.loadAd("onPlay", new Object[0]);
        C17186l c17186l = this.mopub.vip;
        if (c17186l != null) {
            c17186l.smaato();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.AbstractC0294l
    public final void mopub(String str) {
        C9937l.license.loadAd("onCustomAction with action = %s", str);
        int iHashCode = str.hashCode();
        C9937l c9937l = this.mopub;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -c9937l.purchase.f32629l;
                    C17186l c17186l = c9937l.vip;
                    if (c17186l == null) {
                        return;
                    }
                    long jMin = Math.min(c17186l.purchase(), Math.max(0L, c17186l.yandex() + j));
                    C17186l c17186l2 = c9937l.vip;
                    if (c17186l2 == null) {
                        return;
                    }
                    C13641l c13641l = new C13641l(jMin);
                    AbstractC1051l.purchase("Must be called from the main thread.");
                    if (c17186l2.adcel()) {
                        C17186l.ads(new C9162l(c17186l2, c13641l));
                        return;
                    } else {
                        C17186l.startapp();
                        return;
                    }
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    C17667l c17667l = c9937l.amazon;
                    if (c17667l != null) {
                        c17667l.loadAd(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    C17667l c17667l2 = c9937l.amazon;
                    if (c17667l2 != null) {
                        c17667l2.loadAd(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = c9937l.purchase.f32629l;
                    C17186l c17186l3 = c9937l.vip;
                    if (c17186l3 == null) {
                        return;
                    }
                    long jMin2 = Math.min(c17186l3.purchase(), Math.max(0L, c17186l3.yandex() + j2));
                    C17186l c17186l4 = c9937l.vip;
                    if (c17186l4 == null) {
                        return;
                    }
                    C13641l c13641l2 = new C13641l(jMin2);
                    AbstractC1051l.purchase("Must be called from the main thread.");
                    if (c17186l4.adcel()) {
                        C17186l.ads(new C9162l(c17186l4, c13641l2));
                        return;
                    } else {
                        C17186l.startapp();
                        return;
                    }
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(c9937l.mopub);
        int i = Build.VERSION.SDK_INT;
        Context context = c9937l.yandex;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: private */
    public final void mo413private() {
        C9937l.license.loadAd("onSkipToPrevious", new Object[0]);
        C17186l c17186l = this.mopub.vip;
        if (c17186l != null) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            if (c17186l.adcel()) {
                C17186l.ads(new C6528l(c17186l, 0, false));
            } else {
                C17186l.startapp();
            }
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void signatures(long j) {
        C0022l c0022l = C9937l.license;
        C9937l.license.loadAd("onSeekTo %d", Long.valueOf(j));
        C17186l c17186l = this.mopub.vip;
        if (c17186l == null) {
            return;
        }
        C13641l c13641l = new C13641l(j);
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (c17186l.adcel()) {
            C17186l.ads(new C9162l(c17186l, c13641l));
        } else {
            C17186l.startapp();
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void smaato() {
        C9937l.license.loadAd("onPause", new Object[0]);
        C17186l c17186l = this.mopub.vip;
        if (c17186l != null) {
            c17186l.smaato();
        }
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: strictfp */
    public final void mo414strictfp() {
        C9937l.license.loadAd("onSkipToNext", new Object[0]);
        C17186l c17186l = this.mopub.vip;
        if (c17186l != null) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            if (c17186l.adcel()) {
                C17186l.ads(new C6528l(c17186l, 1, false));
            } else {
                C17186l.startapp();
            }
        }
    }
}
