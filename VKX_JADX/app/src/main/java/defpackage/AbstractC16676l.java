package defpackage;

import android.R;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16676l {
    public static final String admob(AudioTrack audioTrack) {
        MainArtist mainArtist;
        String str;
        String str2 = audioTrack.yandex;
        List list = audioTrack.startapp;
        return ((list == null || list.isEmpty()) || list == null || (mainArtist = (MainArtist) AbstractC16901l.m4231native(list)) == null || (str = mainArtist.crashlytics) == null) ? str2 : str;
    }

    public static final boolean amazon(AudioTrack audioTrack) {
        AudioAlbum audioAlbum = audioTrack.vip;
        return (audioAlbum != null ? audioAlbum.purchase : null) != null || AbstractC0653l.purchase(audioTrack) || audioTrack.inmobi;
    }

    public static final String billing(AudioTrack audioTrack) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioTrack.crashlytics);
        sb.append('_');
        sb.append(audioTrack.loadAd);
        String str2 = audioTrack.billing;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "_" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[PHI: r4
  0x0045: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:19:0x004b, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    public static final CharSequence crashlytics(AudioTrack audioTrack, boolean z) {
        DecimalFormat decimalFormat = C15638l.yandex;
        List list = audioTrack.adcel;
        String str = audioTrack.amazon;
        String str2 = audioTrack.ads;
        if (str2 == null && (!z || list == null || list.isEmpty())) {
            return str;
        }
        String strTapsense = " ";
        if (z) {
            if (list != null && !list.isEmpty()) {
                strTapsense = AbstractC2812l.tapsense(new StringBuilder(" feat. "), AbstractC16901l.m4210case(audioTrack.adcel, null, null, null, new C5562l(19), 31), ' ');
            }
            if (str2 == null) {
                str2 = "";
            }
        } else if (str2 == null) {
            str2 = "";
        }
        String strFirebase = AbstractC12900l.firebase(str, strTapsense.concat(str2));
        SpannableString spannableString = new SpannableString(strFirebase);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC13209l.yandex(R.attr.textColorSecondary)), str.length(), strFirebase.length(), 33);
        return spannableString;
    }

    public static final List loadAd(AudioTrack audioTrack) {
        List list = audioTrack.startapp;
        List list2 = C2580l.f5619l;
        if (list == null) {
            list = list2;
        }
        List list3 = audioTrack.adcel;
        if (list3 != null) {
            list2 = list3;
        }
        return AbstractC16901l.m4245throws(AbstractC16901l.m4232new(list, list2));
    }

    public static final String mopub(AudioTrack audioTrack) {
        StringBuilder sb = new StringBuilder();
        sb.append(audioTrack.crashlytics);
        sb.append('_');
        sb.append(audioTrack.loadAd);
        return sb.toString();
    }

    public static final boolean purchase(AudioTrack audioTrack) {
        if (audioTrack.pro()) {
            return AbstractC7462l.loadAd(audioTrack) != 3;
        }
        return (!AbstractC12024l.m3315catch(audioTrack.isPro) && audioTrack.remoteconfig == 0 && AbstractC7462l.loadAd(audioTrack) == 3) ? false : true;
    }

    public static final String yandex(AudioTrack audioTrack) {
        AlbumThumb albumThumb;
        if (audioTrack.purchase() == 2) {
            return audioTrack.advert.yandex.yandex("c");
        }
        if (!amazon(audioTrack)) {
            return "";
        }
        Uri uriAdmob = null;
        if (!audioTrack.inmobi) {
            AudioAlbum audioAlbum = audioTrack.vip;
            if (audioAlbum == null || (albumThumb = audioAlbum.purchase) == null) {
                return null;
            }
            return albumThumb.crashlytics;
        }
        C7268l.f15111l.getClass();
        if (audioTrack.pro()) {
            uriAdmob = C7268l.admob(audioTrack);
        } else {
            String strYandex = yandex(audioTrack);
            if (strYandex != null) {
                uriAdmob = Uri.parse(strYandex);
            }
        }
        return String.valueOf(uriAdmob);
    }
}
