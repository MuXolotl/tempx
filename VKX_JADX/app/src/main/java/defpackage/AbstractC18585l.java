package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18585l {
    public static final AbstractC8481l yandex = AbstractC8481l.Signature("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    public static boolean Signature(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Unrecognized ShuffleMode: "));
        return false;
    }

    public static String ad(Context context, int i) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    public static AbstractC7778l adcel(C10388l c10388l) {
        if (c10388l == null) {
            return null;
        }
        float f = c10388l.f21204l;
        int i = c10388l.f21205l;
        switch (i) {
            case 1:
                if (c10388l.amazon()) {
                    return new C1673l(i == 1 && f == 1.0f);
                }
                return new C1673l();
            case 2:
                if (c10388l.amazon()) {
                    return new C7724l(i == 2 && f == 1.0f);
                }
                return new C7724l();
            case 3:
                return c10388l.amazon() ? new C7886l(3, c10388l.crashlytics()) : new C7886l(3);
            case 4:
                return c10388l.amazon() ? new C7886l(4, c10388l.crashlytics()) : new C7886l(4);
            case 5:
                return c10388l.amazon() ? new C7886l(5, c10388l.crashlytics()) : new C7886l(5);
            case 6:
                if (!c10388l.amazon()) {
                    return new C18670l();
                }
                if (i != 6 || !c10388l.amazon()) {
                    f = -1.0f;
                }
                return new C18670l(f);
            default:
                return null;
        }
    }

    public static C17425l admob(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new C17425l(bundle, bundle.getBoolean("android.service.media.extra.RECENT"), bundle.getBoolean("android.service.media.extra.OFFLINE"), bundle.getBoolean("android.service.media.extra.SUGGESTED"));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new C17425l(bundle, false, false, false);
        }
    }

    public static C10388l ads(AbstractC7778l abstractC7778l) {
        if (abstractC7778l != null) {
            int iPro = pro(abstractC7778l);
            if (!abstractC7778l.loadAd()) {
                switch (iPro) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new C10388l(iPro, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iPro) {
                case 1:
                    return new C10388l(1, ((C1673l) abstractC7778l).crashlytics ? 1.0f : 0.0f);
                case 2:
                    return new C10388l(2, ((C7724l) abstractC7778l).crashlytics ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return C10388l.billing(iPro, ((C7886l) abstractC7778l).crashlytics);
                case 6:
                    return C10388l.purchase(((C18670l) abstractC7778l).loadAd);
            }
        }
        return null;
    }

    public static boolean advert(long j, long j2) {
        return (j & j2) != 0;
    }

    public static long amazon(C8937l c8937l) {
        if (c8937l == null || !c8937l.f18410l.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jYandex = c8937l.yandex("android.media.metadata.DURATION");
        if (jYandex <= 0) {
            return -9223372036854775807L;
        }
        return jYandex;
    }

    public static int billing(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static long crashlytics(C16830l c16830l, C8937l c8937l, long j) {
        if (c16830l == null) {
            return 0L;
        }
        long jMax = c16830l.f32852l;
        if (c16830l.f32853l == 3) {
            Long lValueOf = j == -9223372036854775807L ? null : Long.valueOf(j);
            jMax = Math.max(0L, jMax + ((long) (c16830l.f32856l * (lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime() - c16830l.f32851l))));
        }
        long j2 = jMax;
        long jAmazon = amazon(c8937l);
        return jAmazon == -9223372036854775807L ? Math.max(0L, j2) : AbstractC15323l.firebase(j2, 0L, jAmazon);
    }

    public static C2427l firebase(String str, C8937l c8937l, int i) {
        C11470l c11470l;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l2 = C11470l.amazon;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = c8937l.f18410l.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            C0554l c0554l = new C0554l();
            c0554l.f1958l = Uri.parse(string);
            c11470l = new C11470l(c0554l);
        } else {
            c11470l = c11470l2;
        }
        C3852l c3852lRemoteconfig = remoteconfig(c8937l, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C9202l c9202l = new C9202l(c0935l);
        C7828l c7828l = new C7828l(c2410l);
        if (c3852lRemoteconfig == null) {
            c3852lRemoteconfig = C3852l.f7980private;
        }
        return new C2427l(str2, c9202l, null, c7828l, c3852lRemoteconfig, c11470l);
    }

    public static C2427l isPro(C0579l c0579l) {
        c0579l.getClass();
        String str = c0579l.f1992l;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C0554l c0554l = new C0554l();
        c0554l.f1958l = c0579l.f1996l;
        C11470l c11470l2 = new C11470l(c0554l);
        C3852l c3852lSmaato = smaato(c0579l, 0);
        C9202l c9202l = new C9202l(c0935l);
        C7828l c7828l = new C7828l(c2410l);
        if (c3852lSmaato == null) {
            c3852lSmaato = C3852l.f7980private;
        }
        return new C2427l(str2, c9202l, null, c7828l, c3852lSmaato, c11470l2);
    }

    public static void license(ListenableFuture listenableFuture) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    listenableFuture.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static long loadAd(C16830l c16830l, C8937l c8937l, long j) {
        long j2 = c16830l == null ? 0L : c16830l.f32849l;
        long jCrashlytics = crashlytics(c16830l, c8937l, j);
        long jAmazon = amazon(c8937l);
        return jAmazon == -9223372036854775807L ? Math.max(jCrashlytics, j2) : AbstractC15323l.firebase(j2, jCrashlytics, jAmazon);
    }

    public static C14723l metrica(C16830l c16830l, Context context) {
        if (c16830l != null) {
            int i = c16830l.f32859l;
            if (c16830l.f32853l == 7) {
                CharSequence charSequenceAd = c16830l.f32850l;
                if (charSequenceAd == null) {
                    charSequenceAd = ad(context, tapsense(i));
                }
                Bundle bundle = c16830l.f32860l;
                String string = charSequenceAd != null ? charSequenceAd.toString() : null;
                int iTapsense = tapsense(i);
                if (iTapsense == -5) {
                    iTapsense = 2000;
                } else if (iTapsense == -1) {
                    iTapsense = 1000;
                }
                int i2 = iTapsense;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new C14723l(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int mopub(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static int pro(AbstractC7778l abstractC7778l) {
        if (abstractC7778l instanceof C1673l) {
            return 1;
        }
        if (abstractC7778l instanceof C7724l) {
            return 2;
        }
        if (!(abstractC7778l instanceof C7886l)) {
            return abstractC7778l instanceof C18670l ? 6 : 0;
        }
        int i = ((C7886l) abstractC7778l).loadAd;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static long purchase(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                C8339l.metrica(AbstractC0653l.vip(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static C3852l remoteconfig(C8937l c8937l, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C10388l c10388lYandex;
        C10388l c10388lYandex2;
        C10388l c10388l;
        String[] strArr;
        int i2;
        String string;
        if (c8937l == null) {
            return C3852l.f7980private;
        }
        Bundle bundle = c8937l.f18410l;
        C3117l c3117l = new C3117l();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr2 = C8937l.f18406l;
                if (i4 >= strArr2.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr2[i4]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i3] = charSequence4;
                    i3++;
                }
                i4 = i5;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        c3117l.yandex = charSequence7;
        c3117l.purchase = charSequence3;
        c3117l.billing = charSequence2;
        c3117l.mopub = charSequence;
        c3117l.loadAd = bundle.getCharSequence("android.media.metadata.ARTIST");
        c3117l.crashlytics = bundle.getCharSequence("android.media.metadata.ALBUM");
        c3117l.amazon = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        byte[] bArr = null;
        try {
            try {
                c10388lYandex = C10388l.yandex(bundle.getParcelable("android.media.metadata.RATING"));
                while (true) {
                    if (i2 < 3) {
                        String str = strArr[i2];
                        if (bundle.containsKey(str)) {
                            CharSequence charSequence8 = bundle.getCharSequence(str);
                            if (charSequence8 != null) {
                                string = charSequence8.toString();
                            }
                        } else {
                            i2++;
                        }
                    }
                    string = null;
                }
            } catch (Exception e) {
                AbstractC6427l.metrica("MediaMetadata", "Failed to retrieve a key as Rating.", e);
                c10388lYandex = null;
            }
            c10388lYandex2 = C10388l.yandex(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e2) {
            AbstractC6427l.metrica("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            c10388lYandex2 = null;
        }
        c3117l.isPro = adcel(c10388lYandex);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jYandex = c8937l.yandex("android.media.metadata.DURATION");
            if (jYandex >= 0) {
                c3117l.crashlytics(Long.valueOf(jYandex));
            }
        }
        AbstractC7778l abstractC7778lAdcel = adcel(c10388lYandex2);
        if (abstractC7778lAdcel != null) {
            c3117l.subs = abstractC7778lAdcel;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    c10388l = new C10388l(i, -1.0f);
                    break;
                default:
                    c10388l = null;
                    break;
            }
            c3117l.subs = adcel(c10388l);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            c3117l.tapsense = Integer.valueOf((int) c8937l.yandex("android.media.metadata.YEAR"));
        }
        strArr = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        i2 = 0;
        Uri uri = string != null ? Uri.parse(string) : null;
        if (uri != null) {
            c3117l.vip = uri;
        }
        Bitmap bitmapLoadAd = c8937l.loadAd();
        if (bitmapLoadAd != null) {
            if (c8937l.f18408l == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmapLoadAd.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        c8937l.f18408l = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    AbstractC6427l.metrica("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e3);
                }
            }
            bArr = c8937l.f18408l;
        }
        if (bArr != null) {
            c3117l.loadAd(bArr, 3);
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        c3117l.ads = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            c3117l.adcel = Integer.valueOf(billing(c8937l.yandex("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            c3117l.f6662synchronized = Integer.valueOf((int) c8937l.yandex("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        c3117l.subscription = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        AbstractC10199l it = yandex.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            c3117l.f6661strictfp = bundle2;
        }
        return new C3852l(c3117l);
    }

    public static C3852l smaato(C0579l c0579l, int i) {
        C10388l c10388l;
        byte[] bArr;
        if (c0579l == null) {
            return C3852l.f7980private;
        }
        CharSequence charSequence = c0579l.f1991l;
        C3117l c3117l = new C3117l();
        c3117l.billing = c0579l.f1988l;
        c3117l.mopub = c0579l.f1995l;
        c3117l.vip = c0579l.f1989l;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                c10388l = new C10388l(i, -1.0f);
                break;
            default:
                c10388l = null;
                break;
        }
        c3117l.subs = adcel(c10388l);
        Bitmap bitmap = c0579l.f1994l;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (c0579l.f1997l == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        c0579l.f1997l = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    AbstractC6427l.metrica("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = c0579l.f1997l;
        }
        if (bArr != null) {
            c3117l.loadAd(bArr, 3);
        }
        Bundle bundle = c0579l.f1990l;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            c3117l.adcel = Integer.valueOf(billing(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        c3117l.ads = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            c3117l.f6662synchronized = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            c3117l.f6664volatile = AbstractC1186l.Signature(AbstractC1186l.Signature(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            c3117l.yandex = charSequence;
        } else {
            c3117l.yandex = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            c3117l.purchase = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            c3117l.f6661strictfp = bundle2;
        }
        c3117l.subscription = Boolean.TRUE;
        return new C3852l(c3117l);
    }

    public static int startapp(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                AbstractC6427l.vip("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C0579l subs(C2427l c2427l, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        String str = c2427l.yandex.equals("") ? null : c2427l.yandex;
        C3852l c3852l = c2427l.amazon;
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        Bundle bundle = c3852l.f7997volatile;
        CharSequence charSequence2 = c3852l.yandex;
        CharSequence charSequence3 = c3852l.mopub;
        CharSequence charSequence4 = c3852l.billing;
        AbstractC1186l abstractC1186l = c3852l.f7992native;
        Integer num = c3852l.f7994strictfp;
        Integer num2 = c3852l.adcel;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", purchase(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!abstractC1186l.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(abstractC1186l));
        }
        CharSequence charSequence5 = c3852l.purchase;
        if (charSequence5 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence2);
        } else {
            int i2 = 3;
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = i;
            int i4 = i3;
            while (true) {
                int i5 = 2;
                if (i3 < i2) {
                    String[] strArr = C8937l.f18406l;
                    if (i4 < strArr.length) {
                        int i6 = i4 + 1;
                        String str2 = strArr[i4];
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1853648227:
                                if (!str2.equals("android.media.metadata.ARTIST")) {
                                    i5 = -1;
                                } else {
                                    i5 = i;
                                }
                                break;
                            case -1850878751:
                                if (!str2.equals("android.media.metadata.AUTHOR")) {
                                    i5 = -1;
                                } else {
                                    i5 = 1;
                                }
                                break;
                            case -1224124471:
                                if (!str2.equals("android.media.metadata.WRITER")) {
                                    i5 = -1;
                                }
                                break;
                            case 194702059:
                                if (!str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                    i5 = -1;
                                } else {
                                    i5 = 3;
                                }
                                break;
                            case 1058837545:
                                if (!str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                    i5 = -1;
                                } else {
                                    i5 = 4;
                                }
                                break;
                            case 1684534006:
                                if (!str2.equals("android.media.metadata.COMPOSER")) {
                                    i5 = -1;
                                } else {
                                    i5 = 5;
                                }
                                break;
                            case 1879671865:
                                if (!str2.equals("android.media.metadata.ALBUM")) {
                                    i5 = -1;
                                } else {
                                    i5 = 6;
                                }
                                break;
                            case 1897146402:
                                if (!str2.equals("android.media.metadata.TITLE")) {
                                    i5 = -1;
                                } else {
                                    i5 = 7;
                                }
                                break;
                            case 1965214221:
                                if (!str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                    i5 = -1;
                                } else {
                                    i5 = 8;
                                }
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                        switch (i5) {
                            case 0:
                                charSequence = c3852l.loadAd;
                                break;
                            case 1:
                            default:
                                charSequence = null;
                                break;
                            case 2:
                                charSequence = c3852l.signatures;
                                break;
                            case 3:
                                charSequence = charSequence4;
                                break;
                            case 4:
                                charSequence = charSequence3;
                                break;
                            case 5:
                                charSequence = c3852l.premium;
                                break;
                            case 6:
                                charSequence = c3852l.crashlytics;
                                break;
                            case 7:
                                charSequence = charSequence2;
                                break;
                            case 8:
                                charSequence = c3852l.amazon;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            charSequenceArr[i3] = charSequence;
                            i3++;
                        }
                        i4 = i6;
                        i2 = 3;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        return new C0579l(str, charSequence5, charSequence4, charSequence3, bitmap2, c3852l.vip, bundle, c2427l.billing.yandex);
    }

    public static int subscription(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                AbstractC6427l.vip("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int tapsense(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static C8937l vip(C3852l c3852l, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        C10975l c10975l = new C10975l(17);
        c10975l.m3013catch("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = c3852l.yandex;
        Bundle bundle = c3852l.f7997volatile;
        Integer num = c3852l.adcel;
        Uri uri2 = c3852l.vip;
        if (charSequence != null) {
            c10975l.m3016else(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = c3852l.purchase;
        if (charSequence2 != null) {
            c10975l.m3016else(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = c3852l.billing;
        if (charSequence3 != null) {
            c10975l.m3016else(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = c3852l.mopub;
        if (charSequence4 != null) {
            c10975l.m3016else(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = c3852l.loadAd;
        if (charSequence5 != null) {
            c10975l.m3016else(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = c3852l.crashlytics;
        if (charSequence6 != null) {
            c10975l.m3016else(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = c3852l.amazon;
        if (charSequence7 != null) {
            c10975l.m3016else(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = c3852l.Signature;
        if (num2 != null) {
            c10975l.m3018for(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = c3852l.signatures;
        if (charSequence8 != null) {
            c10975l.m3016else(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = c3852l.premium;
        if (charSequence9 != null) {
            c10975l.m3016else(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            c10975l.m3013catch("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            c10975l.m3013catch("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            c10975l.m3013catch("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            c10975l.m3013catch("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            c10975l.m3017extends("android.media.metadata.DISPLAY_ICON", bitmap);
            c10975l.m3017extends("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            c10975l.m3018for(purchase(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = c3852l.admob) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        c10975l.m3018for(j, "android.media.metadata.DURATION");
        C10388l c10388lAds = ads(c3852l.subs);
        if (c10388lAds != null) {
            c10975l.m3024throw("android.media.metadata.USER_RATING", c10388lAds);
        }
        C10388l c10388lAds2 = ads(c3852l.isPro);
        if (c10388lAds2 != null) {
            c10975l.m3024throw("android.media.metadata.RATING", c10388lAds2);
        }
        Integer num3 = c3852l.f7994strictfp;
        if (num3 != null) {
            c10975l.m3018for(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    c10975l.m3016else((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    c10975l.m3018for(((Number) obj).longValue(), str2);
                }
            }
        }
        return new C8937l((Bundle) c10975l.f22121l);
    }

    public static C11119l yandex(C2427l c2427l, Bitmap bitmap) {
        C0579l c0579lSubs = subs(c2427l, bitmap);
        C3852l c3852l = c2427l.amazon;
        Boolean bool = c3852l.ads;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = c3852l.subscription;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new C11119l(c0579lSubs, i);
    }
}
