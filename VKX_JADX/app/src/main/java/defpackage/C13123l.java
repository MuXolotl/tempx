package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import ealvatag.tag.datatype.DataTypes;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: lْؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13123l extends MediaSession.Callback {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13123l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public static void amazon(C7272l c7272l) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c7272l.yandex;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c7272l.purchase(new C3070l(str, -1, -1));
    }

    private final void crashlytics(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC12713l interfaceC12713l;
        C1139l c1139lLoadAd = loadAd();
        if (c1139lLoadAd == null) {
            return;
        }
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
        purchase(c1139lLoadAd);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    C5057l c5057l = c1139lLoadAd.crashlytics;
                    InterfaceC10867l interfaceC10867lYandex = c5057l.yandex();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC10867lYandex == null ? null : interfaceC10867lYandex.asBinder());
                    synchronized (c5057l.f10329l) {
                        interfaceC12713l = c5057l.f10330l;
                    }
                    AbstractC11621l.mopub(bundle2, interfaceC12713l);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundleStartapp != null) {
                    ((AbstractC0294l) this.loadAd).amazon((C0579l) AbstractC16431l.crashlytics(bundleStartapp.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C0579l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundleStartapp != null) {
                    ((AbstractC0294l) this.loadAd).purchase((C0579l) AbstractC16431l.crashlytics(bundleStartapp.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C0579l.CREATOR), bundleStartapp.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundleStartapp != null) {
                    ((AbstractC0294l) this.loadAd).advert((C0579l) AbstractC16431l.crashlytics(bundleStartapp.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C0579l.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = c1139lLoadAd.admob;
                if (list != null && bundleStartapp != null) {
                    int i = bundleStartapp.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    C10517l c10517l = (i < 0 || i >= list.size()) ? null : (C10517l) list.get(i);
                    if (c10517l != null) {
                        ((AbstractC0294l) this.loadAd).advert(c10517l.f21399l);
                    }
                }
            } else {
                ((AbstractC0294l) this.loadAd).billing(str, bundleStartapp, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            AbstractC6427l.admob("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        c1139lLoadAd.amazon(null);
    }

    public static void purchase(C1139l c1139l) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c1139l.yandex;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                AbstractC6427l.subs("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c1139l.amazon(new C16701l(str, -1, -1));
    }

    public C1139l loadAd() {
        C1139l c1139l;
        synchronized (((AbstractC0294l) this.loadAd).loadAd) {
            c1139l = (C1139l) ((WeakReference) ((AbstractC0294l) this.loadAd).amazon).get();
        }
        if (c1139l == null || ((AbstractC0294l) this.loadAd) != c1139l.loadAd()) {
            return null;
        }
        return c1139l;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC12713l interfaceC12713l;
        switch (this.yandex) {
            case 0:
                crashlytics(str, bundle, resultReceiver);
                return;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex == null) {
                    return;
                }
                C0554l.appmetrica(bundle);
                amazon(c7272lYandex);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        MediaSessionCompat$Token mediaSessionCompat$Token = c7272lYandex.crashlytics;
                        InterfaceC4716l interfaceC4716lYandex = mediaSessionCompat$Token.yandex();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC4716lYandex == null ? null : interfaceC4716lYandex.asBinder());
                        synchronized (mediaSessionCompat$Token.f39l) {
                            interfaceC12713l = mediaSessionCompat$Token.f40l;
                            break;
                        }
                        AbstractC11621l.mopub(bundle2, interfaceC12713l);
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    } else {
                        str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                c7272lYandex.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                AbstractC0294l abstractC0294l = (AbstractC0294l) obj;
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.tapsense((Uri) bundleStartapp.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), AbstractC15323l.startapp(bundleStartapp.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            abstractC0294l.Signature();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.license(bundleStartapp.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), AbstractC15323l.startapp(bundleStartapp.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.pro(bundleStartapp.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), AbstractC15323l.startapp(bundleStartapp.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.ad((Uri) bundleStartapp.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), AbstractC15323l.startapp(bundleStartapp.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (bundleStartapp != null) {
                                bundleStartapp.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.mo412package(bundleStartapp.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (bundleStartapp != null) {
                                abstractC0294l.mo416synchronized(bundleStartapp.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (bundleStartapp != null) {
                                C10388l c10388l = (C10388l) AbstractC16431l.crashlytics(bundleStartapp.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), C10388l.CREATOR);
                                AbstractC15323l.startapp(bundleStartapp.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                abstractC0294l.mo418throws(c10388l);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            abstractC0294l.admob(str, bundleStartapp);
                        } else if (bundleStartapp != null) {
                            abstractC0294l.appmetrica(bundleStartapp.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                    } catch (BadParcelableException unused) {
                        AbstractC6427l.admob("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                AbstractC0294l abstractC0294l2 = (AbstractC0294l) obj;
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            C0554l.appmetrica(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                C0554l.appmetrica(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                C0554l.appmetrica(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                C0554l.appmetrica(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                C0554l.appmetrica(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                abstractC0294l2.mopub(str);
                            }
                        }
                    } catch (BadParcelableException unused2) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).subs();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    boolean zIsPro = ((AbstractC0294l) obj).isPro(intent);
                    c1139lLoadAd.amazon(null);
                    if (zIsPro || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    boolean zIsPro2 = ((AbstractC0294l) obj).isPro(intent);
                    c7272lYandex.purchase(null);
                    if (zIsPro2 || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) obj).smaato();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    ((AbstractC0294l) obj).smaato();
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) obj).metrica();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    ((AbstractC0294l) obj).metrica();
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).ads(str, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).subscription(str, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).tapsense(uri, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).Signature();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).license(str, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).pro(str, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).ad(uri, bundleStartapp);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    C0554l.appmetrica(bundle);
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).isVip();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) obj).signatures(j);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    ((AbstractC0294l) obj).signatures(j);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).appmetrica(f);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        float f;
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).inmobi(C10388l.yandex(rating));
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    if (rating != null) {
                        int iLoadAd = AbstractC7817l.loadAd(rating);
                        if (AbstractC7817l.purchase(rating)) {
                            switch (iLoadAd) {
                                case 1:
                                    ratingCompat = new RatingCompat(1, AbstractC7817l.amazon(rating) ? 1.0f : 0.0f);
                                    ratingCompat.getClass();
                                    break;
                                case 2:
                                    ratingCompat = new RatingCompat(2, AbstractC7817l.billing(rating) ? 1.0f : 0.0f);
                                    ratingCompat.getClass();
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    float fCrashlytics = AbstractC7817l.crashlytics(rating);
                                    if (iLoadAd == 3) {
                                        f = 3.0f;
                                    } else if (iLoadAd == 4) {
                                        f = 4.0f;
                                    } else if (iLoadAd != 5) {
                                        Log.e(DataTypes.OBJ_RATING, "Invalid rating style (" + iLoadAd + ") for a star rating");
                                    } else {
                                        f = 5.0f;
                                    }
                                    if (fCrashlytics < 0.0f || fCrashlytics > f) {
                                        Log.e(DataTypes.OBJ_RATING, "Trying to set out of range star-based rating");
                                    } else {
                                        ratingCompat = new RatingCompat(iLoadAd, fCrashlytics);
                                    }
                                    ratingCompat.getClass();
                                    break;
                                case 6:
                                    float fYandex = AbstractC7817l.yandex(rating);
                                    if (fYandex < 0.0f || fYandex > 100.0f) {
                                        Log.e(DataTypes.OBJ_RATING, "Invalid percentage-based rating value");
                                    } else {
                                        ratingCompat = new RatingCompat(6, fYandex);
                                    }
                                    ratingCompat.getClass();
                                    break;
                            }
                            ratingCompat = null;
                            ratingCompat.getClass();
                        } else {
                            switch (iLoadAd) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    ratingCompat = new RatingCompat(iLoadAd, -1.0f);
                                    break;
                                default:
                                    ratingCompat = null;
                                    break;
                            }
                            ratingCompat.getClass();
                        }
                    }
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) obj).mo414strictfp();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    ((AbstractC0294l) obj).mo414strictfp();
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) obj).mo413private();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    ((AbstractC0294l) obj).mo413private();
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).mo417throw(j);
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        switch (this.yandex) {
            case 0:
                C1139l c1139lLoadAd = loadAd();
                if (c1139lLoadAd != null) {
                    purchase(c1139lLoadAd);
                    ((AbstractC0294l) this.loadAd).mo410catch();
                    c1139lLoadAd.amazon(null);
                    break;
                }
                break;
            default:
                C7272l c7272lYandex = yandex();
                if (c7272lYandex != null) {
                    amazon(c7272lYandex);
                    c7272lYandex.purchase(null);
                    break;
                }
                break;
        }
    }

    public C7272l yandex() {
        C7272l c7272l;
        synchronized (((AbstractC0294l) this.loadAd).loadAd) {
            c7272l = (C7272l) ((WeakReference) ((AbstractC0294l) this.loadAd).amazon).get();
        }
        if (c7272l == null || ((AbstractC0294l) this.loadAd) != c7272l.loadAd()) {
            return null;
        }
        return c7272l;
    }
}
