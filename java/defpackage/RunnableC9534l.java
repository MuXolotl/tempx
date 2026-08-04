package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: lٍْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9534l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f19438l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19439l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19440l;

    public /* synthetic */ RunnableC9534l(int i, Runnable runnable) {
        this.f19440l = 0;
        this.f19439l = i;
        this.f19438l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        C7025l c7025l;
        int i = this.f19440l;
        int i2 = 1;
        byte b = 0;
        byte b2 = 0;
        int i3 = this.f19439l;
        Object obj = this.f19438l;
        switch (i) {
            case 0:
                Process.setThreadPriority(i3);
                ((Runnable) obj).run();
                break;
            case 1:
                ((C9722l) obj).loadAd.onAudioFocusChange(i3);
                break;
            case 2:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) ((C18595l) obj).f36316l;
                String str = AbstractC15323l.yandex;
                C1080l c1080l = surfaceHolderCallbackC18330l.yandex.f34703l;
                C1153l c1153l = new C1153l(i3, b == true ? 1 : 0);
                c1080l.getClass();
                AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l.f2975l).yandex.getLooper());
                c1080l.f2972l++;
                c1080l.m797private(new RunnableC7762l(c1080l, c1153l, 11));
                c1080l.m789continue(Integer.valueOf(i3));
                break;
            case 3:
                ((AbstractC4829l) obj).yandex(i3);
                break;
            case 4:
                ((C18089l) obj).loadAd = i3;
                AbstractC5088l.tapsense("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(2) + ", restoring back previous values " + Integer.toBinaryString(i3));
                break;
            case 5:
                C18676l c18676l = (C18676l) obj;
                boolean z = c18676l.isPro;
                C7025l c7025l2 = c18676l.smaato;
                if (z) {
                    AbstractC5088l.tapsense(c7025l2.yandex, "Receives input frame after codec is reset.");
                    break;
                } else {
                    switch (AbstractC5020l.inmobi(c7025l2.f14718throws)) {
                        case 0:
                        case 7:
                        case 8:
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            c7025l2.firebase.offer(Integer.valueOf(i3));
                            c7025l2.loadAd();
                            break;
                        default:
                            C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l2.f14718throws)));
                            break;
                    }
                }
                break;
            case 6:
                C17505l c17505l = ((C0477l) obj).f1791l;
                C5597l c5597lM4400static = c17505l.m4400static();
                c17505l.m4401super(c5597lM4400static, 1034, new C14389l(c5597lM4400static, i3, i2));
                break;
            case 7:
                C13208l c13208l = (C13208l) obj;
                C10834l c10834l = c13208l.firebase;
                c10834l.remove(Integer.valueOf(i3));
                c13208l.smaato.delete(i3);
                C12962l c12962l = c13208l.vip;
                if (c12962l != null && c12962l.yandex.billing() < 5 && c10834l.isEmpty()) {
                    c13208l.remoteconfig.postDelayed(new RunnableC7853l(c13208l, b2 == true ? 1 : 0), 500L);
                    break;
                }
                break;
            case 8:
                C3551l c3551l = (C3551l) obj;
                int i4 = c3551l.premium;
                c3551l.premium = i3;
                if (i4 != i3) {
                    AbstractC5088l.yandex("Recorder", "Video source has transitioned to state: ".concat(AbstractC12589l.m3420for(i3)));
                    if (i3 == 3) {
                        if (c3551l.adcel == null) {
                            C17651l c17651l = c3551l.advert;
                            if (c17651l != null) {
                                if (!c17651l.f34334l) {
                                    c17651l.f34334l = true;
                                    ScheduledFuture scheduledFuture2 = (ScheduledFuture) c17651l.f34340l;
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(false);
                                        c17651l.f34340l = null;
                                    }
                                }
                                c3551l.advert = null;
                            }
                            c3551l.startapp();
                        }
                        break;
                    } else if (i3 == 2 && (scheduledFuture = c3551l.license) != null && scheduledFuture.cancel(false) && (c7025l = c3551l.subscription) != null) {
                        C3551l.vip(c7025l);
                        break;
                    }
                } else {
                    AbstractC5088l.yandex("Recorder", "Video source transitions to the same state: ".concat(AbstractC12589l.m3420for(i3)));
                    break;
                }
                break;
            case 9:
                ((AbstractC16763l) obj).remoteconfig(i3);
                break;
            case 10:
                C12892l c12892l = (C12892l) obj;
                if (c12892l.crashlytics.get()) {
                    C18089l c18089l = c12892l.yandex.f29423l;
                    c18089l.subscription = i3;
                    C9585l c9585l = c18089l.mopub;
                    if (c9585l.applovin(i3)) {
                        c9585l.m2690extends();
                    }
                    c18089l.amazon.m2727private(i3);
                    C10418l c10418l = c18089l.admob;
                    if (c10418l.applovin(i3)) {
                        c10418l.m2923switch();
                    }
                }
                break;
            case 11:
                C5212l c5212l = (C5212l) obj;
                if (c5212l.crashlytics.get()) {
                    ((AbstractC6896l) c5212l.yandex.f9268l).license(i3);
                }
                break;
            case 12:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.startapp.get();
                if (view != null) {
                    sideSheetBehavior.Signature(view, i3, false);
                }
                break;
            default:
                C1080l c1080l2 = (C1080l) obj;
                Context context = (Context) c1080l2.f2970l;
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                c1080l2.f2976l = audioManager;
                C13773l c13773l = new C13773l(7, c1080l2);
                try {
                    context.registerReceiver(c13773l, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
                    c1080l2.f2971l = c13773l;
                } catch (RuntimeException e) {
                    AbstractC6427l.metrica("StreamVolumeManager", "Error registering stream volume receiver", e);
                }
                ((C1080l) c1080l2.f2974l).m787catch(c1080l2.startapp(i3));
                break;
        }
    }

    public /* synthetic */ RunnableC9534l(Object obj, int i, int i2) {
        this.f19440l = i2;
        this.f19438l = obj;
        this.f19439l = i;
    }
}
