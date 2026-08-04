package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ListIterator;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًٟۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8183l {
    public static final C10227l amazon;
    public static final C10227l crashlytics;
    public static AppActivity loadAd;
    public static final C8183l yandex = new C8183l();

    static {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        C15285l c15285l = C15285l.yandex;
        purchase(c10227lAdmob, new C11155l("/audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(3, c15285l, C15285l.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 0, 3));
        int i = 0;
        int i2 = 3;
        int i3 = 0;
        purchase(c10227lAdmob, new C11155l("/audio([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(i2, c15285l, C15285l.class, "openTrack", "openTrack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 4));
        purchase(c10227lAdmob, new C11155l("/music\\?z=audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(i2, c15285l, C15285l.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 5));
        c10227lAdmob.add(new C14981l(new C11155l("/music/album/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C4236l(i2, c15285l, C15285l.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 6)));
        c10227lAdmob.add(new C14981l(new C11155l("/music/playlist/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C4236l(i2, c15285l, C15285l.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 7)));
        c10227lAdmob.add(new C5220l(new C11155l("/podcast([-0-9]+)_([0-9]+)"), new C14959l(2, c15285l, C15285l.class, "openPodcastEpisode", "openPodcastEpisode(Ljava/lang/String;Ljava/lang/String;)V", i3, i, 8)));
        int i4 = 1;
        amazon(c10227lAdmob, new C11155l("/music/curator/([-_a-zA-Z0-9]+)"), new C15406l(i4, c15285l, C15285l.class, "openCurator", "openCurator(Ljava/lang/String;)V", i3, i, 2));
        amazon(c10227lAdmob, new C11155l("/curator/([-_a-zA-Z0-9]+)"), new C15406l(i4, c15285l, C15285l.class, "openCurator", "openCurator(Ljava/lang/String;)V", i3, i, 3));
        amazon(c10227lAdmob, new C11155l("/music/artist/([-_a-zA-Z0-9]+)"), new C15406l(i4, c15285l, C15285l.class, "openArtist", "openArtist(Ljava/lang/String;)V", i3, i, 4));
        amazon(c10227lAdmob, new C11155l("/artist/([-_a-zA-Z0-9]+)"), new C17847l(i4, c15285l, C15285l.class, "openArtist", "openArtist(Ljava/lang/String;)V", i3, i, 21));
        amazon(c10227lAdmob, new C11155l("/audios([-0-9]+)"), new C17847l(i4, c15285l, C15285l.class, "openUserAudios", "openUserAudios(Ljava/lang/String;)V", i3, i, 22));
        amazon(c10227lAdmob, new C11155l("/podcasts([-0-9]+)"), new C17847l(i4, c15285l, C15285l.class, "openPodcastShow", "openPodcastShow(Ljava/lang/String;)V", i3, i, 23));
        amazon(c10227lAdmob, new C11155l("/audiobook([-0-9]+)"), new C17847l(i4, c15285l, C15285l.class, "openAudioBook", "openAudioBook(Ljava/lang/String;)V", i3, i, 24));
        int i5 = 25;
        amazon(c10227lAdmob, new C11155l("/app54108054#artist_id=([0-9]+)"), new C17847l(i4, c15285l, C15285l.class, "openY25ResultsOfArtist", "openY25ResultsOfArtist(Ljava/lang/String;)V", i3, i, i5));
        int i6 = 0;
        c10227lAdmob.add(new C4602l(new C11155l("/audioplayer"), new C13246l(i6, c15285l, C15285l.class, "openAudioPlayer", "openAudioPlayer()V", i3, i, i5)));
        int i7 = 26;
        c10227lAdmob.add(new C4602l(new C11155l("/audio_offline"), new C13246l(i6, c15285l, C15285l.class, "openOffline", "openOffline()V", i3, i, i7)));
        int i8 = 1;
        yandex(c10227lAdmob, new C11155l("/app52384530"), new C17847l(i8, c15285l, C15285l.class, "openY25Results", "openY25Results(Landroid/net/Uri;)V", i3, i, i7));
        yandex(c10227lAdmob, new C11155l("/audio"), new C17847l(i8, c15285l, C15285l.class, "openAudios", "openAudios(Landroid/net/Uri;)V", i3, i, 27));
        yandex(c10227lAdmob, new C11155l("/podcasts"), new C17847l(i8, c15285l, C15285l.class, "openPodcasts", "openPodcasts(Landroid/net/Uri;)V", i3, i, 28));
        yandex(c10227lAdmob, new C11155l("/audiobooks"), new C17847l(i8, c15285l, C15285l.class, "openAudiobooks", "openAudiobooks(Landroid/net/Uri;)V", i3, i, 29));
        yandex(c10227lAdmob, new C11155l("/person_audiobooks"), new C15406l(i8, c15285l, C15285l.class, "openAudiobooksPerson", "openAudiobooksPerson(Landroid/net/Uri;)V", i3, i, 0));
        yandex(c10227lAdmob, new C11155l("/popup"), new C15406l(i8, c15285l, C15285l.class, "openPopup", "openPopup(Landroid/net/Uri;)V", i3, i, 1));
        crashlytics = AbstractC14055l.purchase(c10227lAdmob);
        C10227l c10227lAdmob2 = AbstractC14055l.admob();
        int i9 = 3;
        purchase(c10227lAdmob2, new C11155l("/audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(i9, c15285l, C15285l.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 8));
        purchase(c10227lAdmob2, new C11155l("/audio([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(i9, c15285l, C15285l.class, "openTrackAP", "openTrackAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 9));
        purchase(c10227lAdmob2, new C11155l("/music\\?z=audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C4236l(i9, c15285l, C15285l.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 10));
        c10227lAdmob2.add(new C14981l(new C11155l("/music/album/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C4236l(i9, c15285l, C15285l.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 11)));
        c10227lAdmob2.add(new C14981l(new C11155l("/music/playlist/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C4236l(i9, c15285l, C15285l.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 12)));
        amazon = AbstractC14055l.purchase(c10227lAdmob2);
    }

    public static void amazon(C10227l c10227l, C11155l c11155l, Function1 function1) {
        c10227l.add(new C5749l(c11155l, function1));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    public static void crashlytics(C8183l c8183l, Uri uri, boolean z, int i) {
        AbstractC4958l abstractC4958l;
        C0711l c0711l;
        if ((i & 2) != 0) {
            z = false;
        }
        String strM3334new = AbstractC12024l.m3334new(uri.toString(), uri.getScheme() + "://");
        String host = uri.getHost();
        if (host == null) {
            return;
        }
        String str = (String) AbstractC12024l.m3338public(AbstractC12024l.m3334new(strM3334new, host), new String[]{"?"}, 6).get(0);
        ListIterator listIterator = (z ? amazon : crashlytics).listIterator(0);
        do {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                AppActivity appActivity = loadAd;
                if (appActivity == null) {
                    return;
                }
                appActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri.toString())));
                return;
            }
            abstractC4958l = (AbstractC4958l) c13376l.next();
            if (abstractC4958l.yandex().amazon(str)) {
                Matcher matcher = abstractC4958l.yandex().f22430l.matcher(str);
                if (matcher.find(0)) {
                    c0711l = new C0711l(matcher, str);
                } else {
                    c0711l = null;
                }
            } else {
                c0711l = null;
            }
        } while (c0711l == null);
        if (abstractC4958l instanceof C3680l) {
            ((C3680l) abstractC4958l).loadAd.invoke(uri);
            return;
        }
        if (abstractC4958l instanceof C4602l) {
            ((C4602l) abstractC4958l).loadAd.invoke();
            return;
        }
        if (abstractC4958l instanceof C5749l) {
            ((C5749l) abstractC4958l).loadAd.invoke(((C8892l) c0711l.yandex()).get(1));
            return;
        }
        if (abstractC4958l instanceof C2105l) {
            Function3 function3 = ((C2105l) abstractC4958l).loadAd;
            Object obj = ((C8892l) c0711l.yandex()).get(1);
            Object obj2 = ((C8892l) c0711l.yandex()).get(2);
            CharSequence charSequence = (CharSequence) ((C8892l) c0711l.yandex()).get(3);
            function3.invoke(obj, obj2, charSequence.length() != 0 ? charSequence : null);
            return;
        }
        if (abstractC4958l instanceof C14981l) {
            ((C14981l) abstractC4958l).loadAd.invoke(((C8892l) c0711l.yandex()).get(1), ((C8892l) c0711l.yandex()).get(2), ((C8892l) c0711l.yandex()).get(3));
        } else if (abstractC4958l instanceof C5220l) {
            ((C5220l) abstractC4958l).loadAd.invoke(((C8892l) c0711l.yandex()).get(1), ((C8892l) c0711l.yandex()).get(2));
        } else {
            C18725l.billing();
        }
    }

    public static void purchase(C10227l c10227l, C11155l c11155l, Function3 function3) {
        c10227l.add(new C2105l(c11155l, function3));
    }

    public static void yandex(C10227l c10227l, C11155l c11155l, Function1 function1) {
        c10227l.add(new C3680l(c11155l, function1));
    }

    public final void loadAd(String str) {
        crashlytics(this, Uri.parse(str), false, 6);
    }
}
