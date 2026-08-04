package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lْۤٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13773l extends BroadcastReceiver {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C13773l(C17417l c17417l) {
        this.yandex = 9;
        this.loadAd = c17417l;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C8384l c8384l = (C8384l) obj;
                c8384l.crashlytics.execute(new RunnableC7852l(c8384l, 2));
                break;
            case 1:
                ((AbstractC17054l) obj).mo2329l();
                break;
            case 2:
                C17274l c17274l = (C17274l) obj;
                if (!isInitialStickyBroadcast()) {
                    c17274l.billing(C8193l.loadAd(context, intent, (C13736l) c17274l.firebase, (AudioDeviceInfo) c17274l.isPro, c17274l.purchase()));
                }
                break;
            case 3:
                ((AbstractC7928l) obj).billing(intent);
                break;
            case 4:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((C10730l) ((C18396l) ((C13350l) obj).vip.f1690l).f35934l).yandex.dispatchMediaButtonEvent(keyEvent);
                }
                break;
            case 5:
                ((Executor) ((C1196l) obj).f3253l).execute(new RunnableC10311l(this, context, 0));
                break;
            case 6:
                ((C8961l) obj).billing();
                break;
            case 7:
                ((C1080l) ((C1080l) obj).f2974l).m797private(new RunnableC6665l(4, this));
                break;
            case 8:
                ((C7558l) obj).crashlytics();
                break;
            default:
                C17417l c17417l = (C17417l) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                C8118l c8118l = c17417l.f33950l;
                                C17417l.admob(c8118l);
                                c8118l.f16911l.yandex("[sgtm] App Receiver notified batches are available");
                                C17923l c17923l = c17417l.f33929l;
                                C17417l.admob(c17923l);
                                c17923l.m4449l(new RunnableC10799l(20, this));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            C2156l.yandex();
                            if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12668l)) {
                                C8118l c8118l2 = c17417l.f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16911l.yandex("App receiver notified triggers are available");
                                C17923l c17923l2 = c17417l.f33929l;
                                C17417l.admob(c17923l2);
                                c17923l2.m4449l(new RunnableC10799l(21, c17417l));
                                break;
                            }
                        }
                        C8118l c8118l3 = c17417l.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16910l.yandex("App receiver called with unknown action");
                    } else {
                        C8118l c8118l4 = c17417l.f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16910l.yandex("App receiver called with null action");
                    }
                } else {
                    C8118l c8118l5 = c17417l.f33950l;
                    C17417l.admob(c8118l5);
                    c8118l5.f16910l.yandex("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ C13773l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }
}
