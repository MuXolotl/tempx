package defpackage;

import android.animation.ValueAnimator;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٕؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4936l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4936l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f10054l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.f10054l;
        int i3 = 2;
        boolean z = true;
        int i4 = 0;
        Object obj = this.f26698l;
        switch (i2) {
            case 0:
                C18306l c18306l = (C18306l) obj;
                c18306l.m4513l(false);
                InterfaceC3687l interfaceC3687lM4515l = c18306l.m4515l();
                C12708l c12708l = interfaceC3687lM4515l instanceof C12708l ? (C12708l) interfaceC3687lM4515l : null;
                if (c12708l != null) {
                    c18306l.m4125private(new C17398l(c12708l.yandex));
                }
                return Unit.INSTANCE;
            case 1:
                C18306l c18306l2 = (C18306l) obj;
                c18306l2.m4513l(false);
                c18306l2.f35798l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                ((C9270l) obj).mo1143default();
                return Unit.INSTANCE;
            case 3:
                ((C5803l) obj).amazon.invoke();
                return Unit.INSTANCE;
            case 4:
                ((C5803l) obj).billing.subscription(Boolean.FALSE);
                C7206l c7206l = C7206l.yandex;
                C7206l.amazon(EnumC10788l.f21811l);
                return Unit.INSTANCE;
            case 5:
                ((C5803l) obj).crashlytics.invoke();
                return Unit.INSTANCE;
            case 6:
                ((C0324l) obj).amazon.invoke();
                return Unit.INSTANCE;
            case 7:
                ((C13242l) obj).billing.invoke();
                return Unit.INSTANCE;
            case 8:
                C10610l c10610l = (C10610l) ((InterfaceC16088l) obj);
                c10610l.loadAd.invoke(c10610l.amazon);
                return Unit.INSTANCE;
            case 9:
                C10610l c10610l2 = (C10610l) obj;
                if (((C10853l) c10610l2.admob.admob()).crashlytics.pro() == 1) {
                    z = false;
                } else {
                    c10610l2.purchase.yandex(C12844l.f25264l, new C16419l(1));
                }
                return Boolean.valueOf(z);
            case 10:
                ((C10056l) obj).mo1143default();
                return Unit.INSTANCE;
            case 11:
                ((C9365l) obj).mo1143default();
                return Unit.INSTANCE;
            case 12:
                C9365l c9365l = (C9365l) obj;
                c9365l.getClass();
                c9365l.m4125private(new C13157l());
                return Unit.INSTANCE;
            case 13:
                C9365l c9365l2 = (C9365l) obj;
                AbstractC9033l.crashlytics((AppActivity) c9365l2.isVip(), new C10884l(c9365l2, null));
                return Unit.INSTANCE;
            case 14:
                PlaybackService playbackService = (PlaybackService) obj;
                AbstractC10999l.mopub(playbackService.f36830l, null, 0, new C16959l(playbackService, 0 == true ? 1 : 0, true ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 15:
                C0307l c0307l = (C0307l) obj;
                ValueAnimator valueAnimator = c0307l.admob;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
                c0307l.subs = false;
                c0307l.isPro = false;
                C9928l c9928l = c0307l.purchase ? c0307l.loadAd : c0307l.crashlytics;
                c9928l.adcel();
                c9928l.stop();
                c0307l.yandex().mo2755else(1.0f);
                return Unit.INSTANCE;
            case 16:
                ((C6038l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C0471l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0471l c0471l = (C0471l) obj;
                AppActivity appActivity = (AppActivity) c0471l.isVip();
                AudioTrack audioTrack = c0471l.m566public().yandex.firebase;
                if (audioTrack != null) {
                    AbstractC9092l.crashlytics(appActivity, new C1416l(audioTrack), C13305l.mopub);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C5245l) obj).getClass();
                return null;
            case 20:
                ((C4261l) obj).mo1143default();
                return Unit.INSTANCE;
            case 21:
                ((C15748l) obj).purchase();
                return Unit.INSTANCE;
            case 22:
                C9455l c9455l = (C9455l) obj;
                c9455l.m2663abstract(false);
                C15589l c15589l = C5013l.yandex;
                if (C5013l.billing() != 0) {
                    AbstractC9033l.crashlytics((AppActivity) c9455l.isVip(), new C13444l(c9455l, 0 == true ? 1 : 0, i4));
                }
                return Unit.INSTANCE;
            case 23:
                C9455l c9455l2 = (C9455l) obj;
                c9455l2.m2663abstract(false);
                AbstractC9033l.crashlytics((AppActivity) c9455l2.isVip(), new C13444l(c9455l2, 0 == true ? 1 : 0, true ? 1 : 0));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C9455l) obj).m2663abstract(false);
                C15589l c15589l2 = C5013l.yandex;
                try {
                    C14025l c14025l = C5013l.crashlytics;
                    if (c14025l != null) {
                        C12382l c12382l = AbstractC5921l.f12465l;
                        c12382l.ads(c14025l);
                        c12382l.mopub(c14025l);
                    }
                    break;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C9455l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C1253l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C1253l c1253l = (C1253l) obj;
                c1253l.f3278l.setValue(Boolean.TRUE);
                AbstractC10999l.mopub(c1253l, null, 0, new C11800l(c1253l, 0 == true ? 1 : 0, i3), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC18672l interfaceC18672l = (InterfaceC18672l) obj;
                List<AbstractC9707l> parameters = interfaceC18672l.getParameters();
                int size = (interfaceC18672l.firebase() ? 1 : 0) + parameters.size();
                if (parameters.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (AbstractC9707l abstractC9707l : parameters) {
                        if (abstractC9707l.premium() == 4 || abstractC9707l.premium() == 2) {
                            i++;
                            if (i < 0) {
                                AbstractC14055l.ads();
                                throw null;
                            }
                        }
                    }
                }
                int i5 = (i + 31) / 32;
                Object[] objArr = new Object[size + i5 + 1];
                for (AbstractC9707l abstractC9707l2 : parameters) {
                    if (abstractC9707l2.mo1108private() && !AbstractC5592l.mopub(abstractC9707l2.mo1109synchronized())) {
                        objArr[abstractC9707l2.pro()] = AbstractC5592l.amazon(AbstractC8020l.subs(abstractC9707l2.mo1109synchronized()));
                    } else if (abstractC9707l2.mo1106extends()) {
                        objArr[abstractC9707l2.pro()] = AbstractC7572l.loadAd(abstractC9707l2.mo1109synchronized());
                    }
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    objArr[size + i6] = 0;
                }
                return objArr;
            default:
                ((C0939l) obj).mo1143default();
                return Unit.INSTANCE;
        }
    }
}
