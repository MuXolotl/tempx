package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.amazon;
import android.support.v4.media.session.yandex;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.media.session.MediaButtonReceiver;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9937l {
    public static final C0022l license = new C0022l("MediaSessionManager", null);
    public PlaybackStateCompat.CustomAction Signature;
    public boolean adcel;
    public final C3557l admob;
    public PlaybackStateCompat.CustomAction ads;
    public final C17667l amazon;
    public final ComponentName billing;
    public final BinderC2728l crashlytics;
    public final HandlerC4052l firebase;
    public final C13445l isPro;
    public final C12100l loadAd;
    public CastDevice metrica;
    public final ComponentName mopub;
    public final C16657l purchase;
    public final C7801l remoteconfig;
    public final RunnableC10799l smaato;
    public C0554l startapp;
    public final C3557l subs;
    public PlaybackStateCompat.CustomAction subscription;
    public PlaybackStateCompat.CustomAction tapsense;
    public C17186l vip;
    public final Context yandex;

    public C9937l(Context context, C12100l c12100l, BinderC2728l binderC2728l) {
        C17667l c17667l;
        C16657l c16657l;
        this.yandex = context;
        this.loadAd = c12100l;
        this.crashlytics = binderC2728l;
        C0022l c0022l = C15504l.isPro;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C15504l c15504l = C15504l.smaato;
        C13445l c13445l = null;
        if (c15504l != null) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            c17667l = c15504l.loadAd;
        } else {
            c17667l = null;
        }
        this.amazon = c17667l;
        C4465l c4465l = c12100l.f24044l;
        this.purchase = c4465l == null ? null : c4465l.f9094l;
        this.remoteconfig = new C7801l(2, this);
        String str = c4465l == null ? null : c4465l.f9091l;
        this.billing = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = c4465l == null ? null : c4465l.f9092l;
        this.mopub = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        C3557l c3557l = new C3557l(context);
        this.admob = c3557l;
        c3557l.f7481l = new C15714l(this);
        C3557l c3557l2 = new C3557l(context);
        this.subs = c3557l2;
        c3557l2.f7481l = new C17190l(4, this);
        this.firebase = new HandlerC4052l(Looper.getMainLooper(), 6);
        C0022l c0022l2 = C13445l.Signature;
        C4465l c4465l2 = c12100l.f24044l;
        if (c4465l2 != null && (c16657l = c4465l2.f9094l) != null) {
            C0595l c0595l = c16657l.f32650l;
            if (c0595l == null) {
                c13445l = new C13445l(context);
            } else {
                ArrayList arrayListYandex = AbstractC5408l.yandex(c0595l);
                int[] iArrLoadAd = AbstractC5408l.loadAd(c0595l);
                int size = arrayListYandex == null ? 0 : arrayListYandex.size();
                if (arrayListYandex == null || arrayListYandex.isEmpty()) {
                    Log.e(c0022l2.yandex, c0022l2.amazon(AbstractC4927l.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (arrayListYandex.size() > 5) {
                    Log.e(c0022l2.yandex, c0022l2.amazon(AbstractC4927l.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (iArrLoadAd == null || (iArrLoadAd.length) == 0) {
                    Log.e(c0022l2.yandex, c0022l2.amazon(AbstractC4927l.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : iArrLoadAd) {
                        if (i < 0 || i >= size) {
                            Log.e(c0022l2.yandex, c0022l2.amazon(AbstractC4927l.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                        }
                    }
                    c13445l = new C13445l(context);
                }
            }
        }
        this.isPro = c13445l;
        this.smaato = new RunnableC10799l(16, this);
    }

    public final C3585l admob() {
        MediaMetadata metadata;
        C0554l c0554l = this.startapp;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (c0554l != null && (metadata = ((yandex) ((C5138l) c0554l.f1957l).f11181l).yandex.getMetadata()) != null) {
            C11154l c11154l = MediaMetadataCompat.f28l;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.f29l = metadata;
            mediaMetadataCompat = mediaMetadataCompatCreateFromParcel;
        }
        return mediaMetadataCompat == null ? new C3585l(19) : new C3585l(mediaMetadataCompat);
    }

    public final void amazon(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatYandex;
        RemoteCallbackList remoteCallbackList;
        C0554l c0554l;
        C1056l c1056l;
        PendingIntent activity;
        C0554l c0554l2 = this.startapp;
        if (c0554l2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        amazon amazonVar = new amazon();
        C17186l c17186l = this.vip;
        if (c17186l == null || this.isPro == null) {
            playbackStateCompatYandex = amazonVar.yandex();
        } else {
            long jYandex = (c17186l.metrica() == 0 || c17186l.mopub()) ? 0L : c17186l.yandex();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            amazonVar.loadAd = i;
            amazonVar.crashlytics = jYandex;
            amazonVar.billing = jElapsedRealtime;
            amazonVar.amazon = 1.0f;
            if (i == 0) {
                playbackStateCompatYandex = amazonVar.yandex();
            } else {
                C16657l c16657l = this.purchase;
                C0595l c0595l = c16657l != null ? c16657l.f32650l : null;
                C17186l c17186l2 = this.vip;
                long jPurchase = (c17186l2 == null || c17186l2.mopub() || this.vip.isPro()) ? 0L : 256L;
                if (c0595l != null) {
                    ArrayList<C16923l> arrayListYandex = AbstractC5408l.yandex(c0595l);
                    if (arrayListYandex != null) {
                        for (C16923l c16923l : arrayListYandex) {
                            String str = c16923l.f33007l;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jPurchase |= purchase(str, i, bundle);
                            } else {
                                billing(amazonVar, str, c16923l);
                            }
                        }
                    }
                } else if (c16657l != null) {
                    for (String str2 : c16657l.f32637l) {
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            jPurchase |= purchase(str2, i, bundle);
                        } else {
                            billing(amazonVar, str2, null);
                        }
                    }
                }
                amazonVar.purchase = jPurchase;
                playbackStateCompatYandex = amazonVar.yandex();
            }
        }
        C7272l c7272l = (C7272l) c0554l2.f1958l;
        c7272l.billing = playbackStateCompatYandex;
        synchronized (c7272l.amazon) {
            int iBeginBroadcast = c7272l.purchase.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = c7272l.purchase;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((InterfaceC1662l) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).mo843l(playbackStateCompatYandex);
                } catch (RemoteException unused) {
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = c7272l.yandex;
        if (playbackStateCompatYandex.f54l == null) {
            PlaybackState.Builder builderAmazon = AbstractC16776l.amazon();
            AbstractC16776l.ad(builderAmazon, playbackStateCompatYandex.f50l, playbackStateCompatYandex.f49l, playbackStateCompatYandex.f53l, playbackStateCompatYandex.f48l);
            AbstractC16776l.Signature(builderAmazon, playbackStateCompatYandex.f46l);
            AbstractC16776l.subscription(builderAmazon, playbackStateCompatYandex.f52l);
            AbstractC16776l.license(builderAmazon, playbackStateCompatYandex.f47l);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompatYandex.f55l) {
                PlaybackState.CustomAction.Builder builderPurchase = AbstractC16776l.purchase(customAction.f60l, customAction.f59l, customAction.f58l);
                AbstractC16776l.pro(builderPurchase, customAction.f61l);
                AbstractC16776l.yandex(builderAmazon, AbstractC16776l.loadAd(builderPurchase));
            }
            AbstractC16776l.tapsense(builderAmazon, playbackStateCompatYandex.f51l);
            AbstractC6804l.loadAd(builderAmazon, playbackStateCompatYandex.f57l);
            playbackStateCompatYandex.f54l = AbstractC16776l.crashlytics(builderAmazon);
        }
        mediaSession.setPlaybackState(playbackStateCompatYandex.f54l);
        C16657l c16657l2 = this.purchase;
        if (c16657l2 != null && c16657l2.f32625l) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (c16657l2 != null && c16657l2.f32654l) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((C7272l) c0554l2.f1958l).yandex.setExtras(bundle);
        }
        if (i == 0) {
            c0554l2.m630class(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.vip != null) {
            ComponentName componentName = this.billing;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.yandex, 0, intent, 201326592);
            }
            if (activity != null) {
                ((C7272l) c0554l2.f1958l).yandex.setSessionActivity(activity);
            }
        }
        C17186l c17186l3 = this.vip;
        if (c17186l3 == null || (c0554l = this.startapp) == null || mediaInfo == null || (c1056l = mediaInfo.f556l) == null) {
            return;
        }
        long j = c17186l3.mopub() ? 0L : mediaInfo.f555l;
        String strBilling = c1056l.billing("com.google.android.gms.cast.metadata.TITLE");
        String strBilling2 = c1056l.billing("com.google.android.gms.cast.metadata.SUBTITLE");
        C3585l c3585lAdmob = admob();
        C11154l c11154l = MediaMetadataCompat.f28l;
        if (c11154l.containsKey("android.media.metadata.DURATION") && ((Integer) c11154l.get("android.media.metadata.DURATION")).intValue() != 0) {
            C8339l.metrica("The android.media.metadata.DURATION key cannot be used to put a long");
            return;
        }
        ((Bundle) c3585lAdmob.f7511l).putLong("android.media.metadata.DURATION", j);
        if (strBilling != null) {
            c3585lAdmob.appmetrica("android.media.metadata.TITLE", strBilling);
            c3585lAdmob.appmetrica("android.media.metadata.DISPLAY_TITLE", strBilling);
        }
        if (strBilling2 != null) {
            c3585lAdmob.appmetrica("android.media.metadata.DISPLAY_SUBTITLE", strBilling2);
        }
        c0554l.m630class(new MediaMetadataCompat((Bundle) c3585lAdmob.f7511l));
        Uri uriMopub = mopub(c1056l);
        if (uriMopub != null) {
            this.admob.admob(uriMopub);
        } else {
            crashlytics(null, 0);
        }
        Uri uriMopub2 = mopub(c1056l);
        if (uriMopub2 != null) {
            this.subs.admob(uriMopub2);
        } else {
            crashlytics(null, 3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:116:0x0175  */
    /* JADX WARN: Code duplicated, block: B:118:0x0179  */
    /* JADX WARN: Code duplicated, block: B:120:0x017c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void billing(amazon amazonVar, String str, C16923l c16923l) {
        PlaybackStateCompat.CustomAction customAction;
        String str2;
        int i;
        int iHashCode = str.hashCode();
        Context context = this.yandex;
        C16657l c16657l = this.purchase;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.subscription == null && c16657l != null) {
                        long j = c16657l.f32629l;
                        C0022l c0022l = AbstractC5408l.yandex;
                        int i2 = c16657l.f32641l;
                        if (j == 10000) {
                            i2 = c16657l.f32647l;
                        } else if (j == 30000) {
                            i2 = c16657l.f32656l;
                        }
                        int i3 = c16657l.f32655l;
                        if (j == 10000) {
                            i3 = c16657l.f32644l;
                        } else if (j == 30000) {
                            i3 = c16657l.f32634l;
                        }
                        String string = context.getResources().getString(i2);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            C8339l.metrica("You must specify an action to build a CustomAction");
                        } else if (TextUtils.isEmpty(string)) {
                            C8339l.metrica("You must specify a name to build a CustomAction");
                        } else if (i3 == 0) {
                            C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                        } else {
                            this.subscription = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i3);
                        }
                    }
                    customAction = this.subscription;
                } else if (c16923l != null) {
                    str2 = c16923l.f33005l;
                    i = c16923l.f33006l;
                    if (TextUtils.isEmpty(str)) {
                        C8339l.metrica("You must specify an action to build a CustomAction");
                    } else if (TextUtils.isEmpty(str2)) {
                        C8339l.metrica("You must specify a name to build a CustomAction");
                    } else if (i == 0) {
                        C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                    } else {
                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i);
                    }
                } else {
                    customAction = null;
                }
                if (customAction != null) {
                    amazonVar.yandex.add(customAction);
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.tapsense == null && c16657l != null) {
                        String string2 = context.getResources().getString(c16657l.f32640l);
                        int i4 = c16657l.f32639l;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            C8339l.metrica("You must specify an action to build a CustomAction");
                        } else if (TextUtils.isEmpty(string2)) {
                            C8339l.metrica("You must specify a name to build a CustomAction");
                        } else if (i4 == 0) {
                            C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                        } else {
                            this.tapsense = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4);
                        }
                    }
                    customAction = this.tapsense;
                } else if (c16923l != null) {
                    str2 = c16923l.f33005l;
                    i = c16923l.f33006l;
                    if (TextUtils.isEmpty(str)) {
                        C8339l.metrica("You must specify an action to build a CustomAction");
                    } else if (TextUtils.isEmpty(str2)) {
                        C8339l.metrica("You must specify a name to build a CustomAction");
                    } else if (i == 0) {
                        C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                    } else {
                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i);
                    }
                } else {
                    customAction = null;
                }
                if (customAction != null) {
                    amazonVar.yandex.add(customAction);
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.Signature == null && c16657l != null) {
                        String string3 = context.getResources().getString(c16657l.f32640l);
                        int i5 = c16657l.f32639l;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            C8339l.metrica("You must specify an action to build a CustomAction");
                        } else if (TextUtils.isEmpty(string3)) {
                            C8339l.metrica("You must specify a name to build a CustomAction");
                        } else if (i5 == 0) {
                            C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                        } else {
                            this.Signature = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5);
                        }
                    }
                    customAction = this.Signature;
                } else if (c16923l != null) {
                    str2 = c16923l.f33005l;
                    i = c16923l.f33006l;
                    if (TextUtils.isEmpty(str)) {
                        C8339l.metrica("You must specify an action to build a CustomAction");
                    } else if (TextUtils.isEmpty(str2)) {
                        C8339l.metrica("You must specify a name to build a CustomAction");
                    } else if (i == 0) {
                        C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                    } else {
                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i);
                    }
                } else {
                    customAction = null;
                }
                if (customAction != null) {
                    amazonVar.yandex.add(customAction);
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.ads == null && c16657l != null) {
                        long j2 = c16657l.f32629l;
                        C0022l c0022l2 = AbstractC5408l.yandex;
                        int i6 = c16657l.f32642l;
                        if (j2 == 10000) {
                            i6 = c16657l.f32648l;
                        } else if (j2 == 30000) {
                            i6 = c16657l.f32626l;
                        }
                        int i7 = c16657l.f32653l;
                        if (j2 == 10000) {
                            i7 = c16657l.f32649l;
                        } else if (j2 == 30000) {
                            i7 = c16657l.f32628l;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            C8339l.metrica("You must specify an action to build a CustomAction");
                        } else if (TextUtils.isEmpty(string4)) {
                            C8339l.metrica("You must specify a name to build a CustomAction");
                        } else if (i7 == 0) {
                            C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                        } else {
                            this.ads = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7);
                        }
                    }
                    customAction = this.ads;
                } else if (c16923l != null) {
                    str2 = c16923l.f33005l;
                    i = c16923l.f33006l;
                    if (TextUtils.isEmpty(str)) {
                        C8339l.metrica("You must specify an action to build a CustomAction");
                    } else if (TextUtils.isEmpty(str2)) {
                        C8339l.metrica("You must specify a name to build a CustomAction");
                    } else if (i == 0) {
                        C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                    } else {
                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i);
                    }
                } else {
                    customAction = null;
                }
                if (customAction != null) {
                    amazonVar.yandex.add(customAction);
                }
                break;
            default:
                if (c16923l != null) {
                    str2 = c16923l.f33005l;
                    i = c16923l.f33006l;
                    if (TextUtils.isEmpty(str)) {
                        C8339l.metrica("You must specify an action to build a CustomAction");
                    } else if (TextUtils.isEmpty(str2)) {
                        C8339l.metrica("You must specify a name to build a CustomAction");
                    } else if (i == 0) {
                        C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                    } else {
                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i);
                    }
                } else {
                    customAction = null;
                }
                if (customAction != null) {
                    amazonVar.yandex.add(customAction);
                }
                break;
        }
    }

    public final void crashlytics(Bitmap bitmap, int i) {
        C0554l c0554l = this.startapp;
        if (c0554l == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        Bundle bundle = (Bundle) admob().f7511l;
        String str = i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        C11154l c11154l = MediaMetadataCompat.f28l;
        if (c11154l.containsKey(str) && ((Integer) c11154l.get(str)).intValue() != 2) {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            bundle.putParcelable(str, bitmap);
            c0554l.m630class(new MediaMetadataCompat(bundle));
        }
    }

    public final void firebase() {
        if (this.loadAd.f24032l) {
            this.firebase.removeCallbacks(this.smaato);
            Context context = this.yandex;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void isPro(boolean z) {
        if (this.loadAd.f24032l) {
            HandlerC4052l handlerC4052l = this.firebase;
            RunnableC10799l runnableC10799l = this.smaato;
            if (runnableC10799l != null) {
                handlerC4052l.removeCallbacks(runnableC10799l);
            }
            Context context = this.yandex;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    handlerC4052l.postDelayed(runnableC10799l, 1000L);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final void loadAd() {
        MediaInfo mediaInfoLoadAd;
        C1056l c1056l;
        boolean z;
        boolean z2;
        C13328l c13328l;
        MediaInfo mediaInfo;
        C17186l c17186l = this.vip;
        if (c17186l == null) {
            return;
        }
        int iMetrica = c17186l.metrica();
        MediaInfo mediaInfoLoadAd2 = c17186l.loadAd();
        C4259l c4259l = null;
        if (c17186l.admob()) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            C10184l c10184lCrashlytics = c17186l.crashlytics();
            if (c10184lCrashlytics == null) {
                c13328l = null;
            } else {
                Integer num = (Integer) c10184lCrashlytics.f20754l.get(c10184lCrashlytics.f20763l);
                if (num == null) {
                    c13328l = null;
                } else {
                    c13328l = (C13328l) c10184lCrashlytics.f20758l.get(num.intValue());
                }
            }
            if (c13328l != null && (mediaInfo = c13328l.f26162l) != null) {
                mediaInfoLoadAd2 = mediaInfo;
            }
        }
        amazon(iMetrica, mediaInfoLoadAd2);
        if (!c17186l.billing()) {
            subs();
            firebase();
            return;
        }
        if (iMetrica != 0) {
            C13445l c13445l = this.isPro;
            if (c13445l != null) {
                license.loadAd("Update media notification.", new Object[0]);
                CastDevice castDevice = this.metrica;
                C17186l c17186l2 = this.vip;
                C0554l c0554l = this.startapp;
                if (castDevice != null && c17186l2 != null && c0554l != null && (mediaInfoLoadAd = c17186l2.loadAd()) != null && (c1056l = mediaInfoLoadAd.f556l) != null) {
                    List list = c1056l.f2924l;
                    C10184l c10184lCrashlytics2 = c17186l2.crashlytics();
                    if (c10184lCrashlytics2 == null) {
                        z = false;
                        z2 = z;
                    } else {
                        int i = c10184lCrashlytics2.f20753l;
                        if (i == 1 || i == 2 || i == 3) {
                            z = true;
                            z2 = z;
                        } else {
                            Integer num2 = (Integer) c10184lCrashlytics2.f20754l.get(c10184lCrashlytics2.f20748l);
                            if (num2 != null) {
                                boolean z3 = num2.intValue() > 0;
                                z = num2.intValue() < c10184lCrashlytics2.f20758l.size() + (-1);
                                z2 = z3;
                            } else {
                                z = false;
                                z2 = z;
                            }
                        }
                    }
                    boolean z4 = c17186l2.amazon() == 2;
                    int i2 = mediaInfoLoadAd.f550l;
                    String strBilling = c1056l.billing("com.google.android.gms.cast.metadata.TITLE");
                    String str = castDevice.f532l;
                    C17024l c17024l = new C17024l(z4, i2, strBilling, str, ((C7272l) c0554l.f1958l).crashlytics, z, z2);
                    boolean z5 = z4;
                    boolean z6 = z;
                    boolean z7 = z2;
                    C17024l c17024l2 = c13445l.firebase;
                    if (c17024l2 == null || z5 != c17024l2.loadAd || i2 != c17024l2.crashlytics || !AbstractC15091l.crashlytics(strBilling, c17024l2.amazon) || !AbstractC15091l.crashlytics(str, c17024l2.purchase) || z6 != c17024l2.billing || z7 != c17024l2.mopub) {
                        c13445l.firebase = c17024l;
                        c13445l.yandex();
                    }
                    if (list != null && !list.isEmpty()) {
                        c4259l = (C4259l) list.get(0);
                    }
                    C5633l c5633l = new C5633l(c4259l);
                    Uri uri = (Uri) c5633l.f11986l;
                    C5633l c5633l2 = c13445l.smaato;
                    if (c5633l2 == null || !AbstractC15091l.crashlytics(uri, (Uri) c5633l2.f11986l)) {
                        C3557l c3557l = c13445l.subs;
                        c3557l.f7481l = new C7847l(c13445l, c5633l);
                        c3557l.admob(uri);
                    }
                }
            }
            if (c17186l.admob()) {
                return;
            }
            isPro(true);
        }
    }

    public final Uri mopub(C1056l c1056l) {
        C4465l c4465l = this.loadAd.f24044l;
        if (c4465l != null) {
            c4465l.billing();
        }
        List list = c1056l.f2924l;
        C4259l c4259l = (list == null || list.isEmpty()) ? null : (C4259l) c1056l.f2924l.get(0);
        if (c4259l == null) {
            return null;
        }
        return c4259l.f8735l;
    }

    public final long purchase(String str, int i, Bundle bundle) {
        long j;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    int i2 = 3;
                    if (i == 3) {
                        j = 514;
                    } else {
                        i2 = i;
                        j = 512;
                    }
                    if (i2 != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                C17186l c17186l = this.vip;
                if (c17186l != null && c17186l.billing()) {
                    C10184l c10184lCrashlytics = c17186l.crashlytics();
                    AbstractC1051l.subs(c10184lCrashlytics);
                    if ((128 & c10184lCrashlytics.f20752l) != 0 || c10184lCrashlytics.f20753l != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) c10184lCrashlytics.f20754l.get(c10184lCrashlytics.f20748l);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            C17186l c17186l2 = this.vip;
            if (c17186l2 != null && c17186l2.billing()) {
                C10184l c10184lCrashlytics2 = c17186l2.crashlytics();
                AbstractC1051l.subs(c10184lCrashlytics2);
                if ((64 & c10184lCrashlytics2.f20752l) != 0 || c10184lCrashlytics2.f20753l != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) c10184lCrashlytics2.f20754l.get(c10184lCrashlytics2.f20748l);
                if (num2 != null && num2.intValue() < c10184lCrashlytics2.f20758l.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final void subs() {
        C13445l c13445l = this.isPro;
        if (c13445l != null) {
            license.loadAd("Stopping media notification.", new Object[0]);
            C3557l c3557l = c13445l.subs;
            c3557l.subs();
            c3557l.f7481l = null;
            NotificationManager notificationManager = c13445l.loadAd;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void yandex(C17186l c17186l, CastDevice castDevice) {
        ComponentName componentName;
        C12100l c12100l = this.loadAd;
        C4465l c4465l = c12100l == null ? null : c12100l.f24044l;
        if (this.adcel || c12100l == null || c4465l == null || this.purchase == null || c17186l == null || castDevice == null || (componentName = this.mopub) == null) {
            license.loadAd("skip attaching media session", new Object[0]);
            return;
        }
        this.vip = c17186l;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C7801l c7801l = this.remoteconfig;
        if (c7801l != null) {
            c17186l.admob.add(c7801l);
        }
        this.metrica = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.yandex;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (c4465l.f9095l) {
            C0554l c0554l = new C0554l();
            c0554l.f1956l = new ArrayList();
            if (context == null) {
                C8339l.metrica("context must not be null");
                throw null;
            }
            if (TextUtils.isEmpty("CastMediaSession")) {
                C8339l.metrica("tag must not be null or empty");
                throw null;
            }
            if (componentName == null) {
                int i = MediaButtonReceiver.yandex;
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setPackage(context.getPackageName());
                List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
                if (listQueryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (listQueryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && broadcast == null) {
                Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent3.setComponent(componentName);
                broadcast = PendingIntent.getBroadcast(context, 0, intent3, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                c0554l.f1958l = new C0371l(context);
            } else if (i2 >= 28) {
                c0554l.f1958l = new C0700l(context);
            } else {
                c0554l.f1958l = new C7272l(context);
            }
            c0554l.m631continue(new C6406l(1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((C7272l) c0554l.f1958l).yandex.setMediaButtonReceiver(broadcast);
            c0554l.f1957l = new C5138l(context, ((C7272l) c0554l.f1958l).crashlytics);
            if (C0554l.f1955l == 0) {
                C0554l.f1955l = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            this.startapp = c0554l;
            amazon(0, null);
            CastDevice castDevice2 = this.metrica;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f532l)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.metrica.f532l);
                C11154l c11154l = MediaMetadataCompat.f28l;
                if (c11154l.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) c11154l.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    C8339l.metrica("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    c0554l.m630class(new MediaMetadataCompat(bundle));
                }
            }
            c0554l.m631continue(new C2585l(this), null);
            ((C7272l) c0554l.f1958l).yandex.setActive(true);
            Iterator it = ((ArrayList) c0554l.f1956l).iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            this.crashlytics.m1243l(c0554l);
        }
        this.adcel = true;
        loadAd();
    }
}
