package defpackage;

import android.media.AudioManager;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: const, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Cconst extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f810l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cconst(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f810l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:194:0x03cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0554l c0554l;
        AudioAlbum audioAlbum;
        ContentCaptureSession contentCaptureSessionSubscription;
        int i = this.f810l;
        int i2 = 2;
        int i3 = 8;
        int i4 = 0;
        int i5 = 3;
        int i6 = 1;
        boolean z = true;
        boolean z2 = true;
        C16076l c16076l = 0;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                ((C7659l) obj).mo1143default();
                return Unit.INSTANCE;
            case 1:
                ((C9879l) obj).getClass();
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                c16076l2.getClass();
                int iOrdinal = ((EnumC12501l) c16076l2.admob(new C18606l(c16076l2, 6))).ordinal();
                int i7 = 7;
                if (iOrdinal == 0) {
                    C16076l c16076l3 = VKXApplication.f36632l;
                    if (c16076l3 == null) {
                        c16076l3 = null;
                    }
                    c16076l3.getClass();
                    c16076l3.subs(new C7864l(EnumC12501l.f24640l, c16076l, i7));
                } else if (iOrdinal == 1) {
                    C16076l c16076l4 = VKXApplication.f36632l;
                    if (c16076l4 == null) {
                        c16076l4 = null;
                    }
                    c16076l4.getClass();
                    c16076l4.subs(new C7864l(EnumC12501l.f24639l, c16076l, i7));
                } else {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    C16076l c16076l5 = VKXApplication.f36632l;
                    if (c16076l5 == null) {
                        c16076l5 = null;
                    }
                    c16076l5.getClass();
                    c16076l5.subs(new C7864l(EnumC12501l.f24641l, c16076l, i7));
                }
                return Unit.INSTANCE;
            case 2:
                ((C9879l) obj).getClass();
                C16076l c16076l6 = VKXApplication.f36632l;
                c16076l = c16076l6 != null ? c16076l6 : 0;
                c16076l.getClass();
                return Unit.INSTANCE;
            case 3:
                ((C9879l) obj).getClass();
                C16076l c16076l7 = VKXApplication.f36632l;
                C16076l c16076l8 = c16076l7 != null ? c16076l7 : null;
                c16076l8.getClass();
                return Unit.INSTANCE;
            case 4:
                ((C9879l) obj).mopub();
                return Unit.INSTANCE;
            case 5:
                ((C9879l) obj).getClass();
                C16076l c16076l9 = VKXApplication.f36632l;
                C16076l c16076l10 = c16076l9 != null ? c16076l9 : null;
                c16076l10.getClass();
                return Unit.INSTANCE;
            case 6:
                ((C9879l) obj).getClass();
                C16076l c16076l11 = VKXApplication.f36632l;
                if (c16076l11 == null) {
                    c16076l11 = null;
                }
                c16076l11.getClass();
                c16076l11.subs(new C8122l(new C7864l(c16076l11, c16076l, i3), null));
                return Unit.INSTANCE;
            case 7:
                C9879l c9879l = (C9879l) obj;
                c9879l.getClass();
                C16076l c16076l12 = VKXApplication.f36632l;
                if (c16076l12 == null) {
                    c16076l12 = null;
                }
                InterfaceC17817l interfaceC17817l = c16076l12.f31521l.amazon;
                if (!(interfaceC17817l instanceof C16022l) && !(interfaceC17817l instanceof InterfaceC2841l)) {
                    c9879l.metrica(C14267l.yandex(c9879l.firebase(), null, 0, null, null, null, false, false, false, false, false, null, false, true, 0, 0, 28671));
                    C16076l c16076l13 = VKXApplication.f36632l;
                    if (c16076l13 == null) {
                        c16076l13 = null;
                    }
                    if (((Boolean) ((C1008l) c16076l13.f31511l.f9862l).getValue()).booleanValue()) {
                        C0554l c0554l2 = C16076l.f31498l;
                        if (c0554l2 == null) {
                            c0554l2 = null;
                        }
                        C16076l c16076l14 = (C16076l) ((C3342l) c0554l2.f1958l).invoke();
                        C0554l c0554l3 = C16076l.f31498l;
                        c16076l14.remoteconfig(!((C16076l) ((C3342l) (c0554l3 != null ? c0554l3 : null).f1958l).invoke()).amazon());
                    } else {
                        C16076l c16076l15 = VKXApplication.f36632l;
                        if (c16076l15 == null) {
                            c16076l15 = null;
                        }
                        if (c16076l15.amazon()) {
                            c0554l = C16076l.f31498l;
                            if (c0554l == null) {
                                c0554l = null;
                            }
                            C16076l c16076l16 = (C16076l) ((C3342l) c0554l.f1958l).invoke();
                            C0554l c0554l4 = C16076l.f31498l;
                            c16076l16.remoteconfig(!((C16076l) ((C3342l) (c0554l4 != null ? c0554l4 : null).f1958l).invoke()).amazon());
                        } else {
                            C16076l c16076l17 = VKXApplication.f36632l;
                            if (c16076l17 == null) {
                                c16076l17 = null;
                            }
                            if (c16076l17.f31521l.amazon instanceof InterfaceC2244l) {
                                c0554l = C16076l.f31498l;
                                if (c0554l == null) {
                                    c0554l = null;
                                }
                                C16076l c16076l18 = (C16076l) ((C3342l) c0554l.f1958l).invoke();
                                C0554l c0554l5 = C16076l.f31498l;
                                c16076l18.remoteconfig(!((C16076l) ((C3342l) (c0554l5 != null ? c0554l5 : null).f1958l).invoke()).amazon());
                            } else {
                                new C18381l(new C11200l(13), new C1224l(c9879l, i5)).Signature(c9879l.yandex);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                C9879l c9879l2 = (C9879l) obj;
                AppActivity appActivity = c9879l2.yandex;
                if (!(c9879l2.isPro().loadAd instanceof UmaTrack) || ((UmaTrack) c9879l2.isPro().loadAd).tapsense == null) {
                    AbstractC18643l abstractC18643l = c9879l2.isPro().loadAd;
                    AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
                    if (audioTrack != null && (audioAlbum = audioTrack.vip) != null) {
                        appActivity.applovin();
                        appActivity.license(new C17398l(audioAlbum.yandex.intValue(), 8, audioAlbum.loadAd.longValue(), audioAlbum.crashlytics));
                    }
                } else {
                    AbstractC9033l.crashlytics(appActivity, new C1391l(c9879l2, c16076l, i2));
                }
                return Unit.INSTANCE;
            case 9:
                C9879l c9879l3 = (C9879l) obj;
                AppActivity appActivity2 = c9879l3.yandex;
                if (!(c9879l3.isPro().loadAd instanceof UmaTrack) || ((UmaTrack) c9879l3.isPro().loadAd).tapsense == null) {
                    AbstractC18643l abstractC18643l2 = c9879l3.isPro().loadAd;
                    AudioTrack audioTrack2 = abstractC18643l2 instanceof AudioTrack ? (AudioTrack) abstractC18643l2 : null;
                    List listLoadAd = audioTrack2 != null ? AbstractC16676l.loadAd(audioTrack2) : null;
                    if (listLoadAd == null) {
                        listLoadAd = C2580l.f5619l;
                    }
                    List list = listLoadAd.isEmpty() ? null : listLoadAd;
                    if (list != null) {
                        AbstractC2044l.yandex(appActivity2, list);
                    }
                } else {
                    AbstractC9033l.crashlytics(appActivity2, new C1391l(c9879l3, c16076l, z ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 10:
                C9879l c9879l4 = (C9879l) obj;
                AbstractC18643l abstractC18643l3 = c9879l4.isPro().loadAd;
                AudioTrack audioTrack3 = abstractC18643l3 instanceof AudioTrack ? (AudioTrack) abstractC18643l3 : null;
                if (audioTrack3 != null) {
                    new C2157l(new C0399l(audioTrack3)).Signature(c9879l4.yandex);
                }
                return Unit.INSTANCE;
            case 11:
                C9879l c9879l5 = (C9879l) obj;
                AbstractC9033l.crashlytics(c9879l5.yandex, new C7641l(c9879l5, c16076l, 24));
                return Unit.INSTANCE;
            case 12:
                ((C9879l) obj).getClass();
                C16076l c16076l19 = VKXApplication.f36632l;
                AudioManager audioManager = (AudioManager) (c16076l19 != null ? c16076l19 : null).f31522l.getValue();
                if (audioManager != null) {
                    audioManager.adjustStreamVolume(3, -1, 0);
                }
                return Unit.INSTANCE;
            case 13:
                ((C9879l) obj).getClass();
                C16076l c16076l20 = VKXApplication.f36632l;
                AudioManager audioManager2 = (AudioManager) (c16076l20 != null ? c16076l20 : null).f31522l.getValue();
                if (audioManager2 != null) {
                    audioManager2.adjustStreamVolume(3, 1, 0);
                }
                return Unit.INSTANCE;
            case 14:
                ((C9879l) obj).getClass();
                C16076l c16076l21 = VKXApplication.f36632l;
                AudioManager audioManager3 = (AudioManager) (c16076l21 != null ? c16076l21 : null).f31522l.getValue();
                if (audioManager3 != null) {
                    audioManager3.adjustStreamVolume(3, -1, 0);
                }
                return Unit.INSTANCE;
            case 15:
                ((C9879l) obj).getClass();
                C16076l c16076l22 = VKXApplication.f36632l;
                AudioManager audioManager4 = (AudioManager) (c16076l22 != null ? c16076l22 : null).f31522l.getValue();
                if (audioManager4 != null) {
                    audioManager4.adjustStreamVolume(3, 1, 0);
                }
                return Unit.INSTANCE;
            case 16:
                C9879l c9879l6 = (C9879l) obj;
                AbstractC18643l abstractC18643l4 = c9879l6.isPro().loadAd;
                InterfaceC9764l interfaceC9764l = abstractC18643l4 instanceof InterfaceC9764l ? (InterfaceC9764l) abstractC18643l4 : null;
                if (interfaceC9764l != null) {
                    if (interfaceC9764l.getBilling()) {
                        new C1026l(c9879l6.isPro().loadAd, new C3005l(interfaceC9764l, c9879l6, i6), new C11200l(12)).Signature(c9879l6.yandex);
                    } else {
                        C16076l c16076l23 = VKXApplication.f36632l;
                        if (c16076l23 == null) {
                            c16076l23 = null;
                        }
                        c16076l23.getClass();
                        c16076l23.subs(new C9239l(c16076l23, z2 ? 1 : 0, (InterfaceC14029l) c16076l, i4));
                        c9879l6.metrica(C14267l.yandex(c9879l6.firebase(), C14974l.yandex(c9879l6.firebase().yandex, Boolean.TRUE, null, 95), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9879l c9879l7 = (C9879l) obj;
                AbstractC18643l abstractC18643l5 = c9879l7.isPro().loadAd;
                AudioTrack audioTrack4 = abstractC18643l5 instanceof AudioTrack ? (AudioTrack) abstractC18643l5 : null;
                if (audioTrack4 != null) {
                    new C9231l(audioTrack4).Signature(c9879l7.yandex);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9879l c9879l8 = (C9879l) obj;
                AbstractC18643l abstractC18643l6 = c9879l8.isPro().loadAd;
                InterfaceC10594l interfaceC10594l = abstractC18643l6 instanceof InterfaceC10594l ? (InterfaceC10594l) abstractC18643l6 : null;
                if (interfaceC10594l != null) {
                    if (interfaceC10594l.getAd()) {
                        interfaceC10594l.subs(false);
                        c9879l8.metrica(C14267l.yandex(c9879l8.firebase(), C14974l.yandex(c9879l8.firebase().yandex, null, Boolean.FALSE, 63), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    } else {
                        interfaceC10594l.subs(true);
                        C10111l c10111l = c9879l8.adcel;
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        c10111l.startapp(VKXApplication.Companion.loadAd(R.string.now_playing_notification_disliked_title), VKXApplication.Companion.loadAd(R.string.now_playing_notification_disliked_text));
                        C16076l c16076l24 = VKXApplication.f36632l;
                        if (c16076l24 == null) {
                            c16076l24 = null;
                        }
                        c16076l24.getClass();
                        c16076l24.subs(new C8122l(new C7864l(c16076l24, c16076l, i3), null));
                        c9879l8.metrica(C14267l.yandex(c9879l8.firebase(), C14974l.yandex(c9879l8.firebase().yandex, null, Boolean.TRUE, 63), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C0324l) obj).amazon.invoke();
                return Unit.INSTANCE;
            case 20:
                ((C9231l) obj).purchase();
                return Unit.INSTANCE;
            case 21:
                ((C8529l) obj).mo1143default();
                return Unit.INSTANCE;
            case 22:
                View view = (View) obj;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 30) {
                    AbstractC5121l.ads(view);
                }
                if (i8 < 29 || (contentCaptureSessionSubscription = AbstractC11880l.subscription(view)) == null) {
                    return null;
                }
                return new C6498l(contentCaptureSessionSubscription, view);
            case 23:
                ((C18159l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C8039l) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C13379l) obj).mo782this();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C13157l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((AbstractC8284l) obj).mo2292implements();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C9174l) obj).purchase();
                return Unit.INSTANCE;
            default:
                ((C7721l) obj).mo1143default();
                return Unit.INSTANCE;
        }
    }
}
