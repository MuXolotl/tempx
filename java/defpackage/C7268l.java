package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lًؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7268l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C7268l f15111l = new C7268l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f15112l = AbstractC11990l.loadAd();

    static {
        C8688l c8688l = AbstractC0085l.yandex;
        if (AbstractC8182l.loadAd().loadAd().exists()) {
            return;
        }
        AbstractC8182l.loadAd().loadAd().mkdir();
    }

    public static Uri admob(AudioTrack audioTrack) {
        C14025l c14025lAdmob;
        if (audioTrack.inmobi) {
            if (audioTrack.f36608synchronized) {
                c14025lAdmob = AbstractC0825l.admob(3, AbstractC16676l.mopub(audioTrack));
            } else if (audioTrack.f36609throws) {
                c14025lAdmob = AbstractC0825l.admob(2, AbstractC16676l.mopub(audioTrack));
            } else {
                AudioAlbum audioAlbum = audioTrack.vip;
                c14025lAdmob = audioAlbum != null ? AbstractC0825l.admob(4, audioAlbum.loadAd()) : null;
            }
            if (c14025lAdmob != null) {
                return Uri.parse(c14025lAdmob.f27331l.tapsense());
            }
        }
        return null;
    }

    public static boolean amazon(AudioPlaylist audioPlaylist) {
        int i = audioPlaylist.crashlytics;
        long j = audioPlaylist.amazon;
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        if (c5198lM3161l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(i);
            CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
            if (cachedPlaylist != null) {
                return cachedPlaylist.m4612strictfp();
            }
        }
        return false;
    }

    public static Object crashlytics(AudioTrack audioTrack, AbstractC5563l abstractC5563l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C14951l(audioTrack, null, 6), abstractC5563l);
    }

    public static void loadAd() {
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        File file = c16076l.f31512l;
        C16076l c16076l2 = VKXApplication.f36632l;
        if (c16076l2 == null) {
            c16076l2 = null;
        }
        C11324l c11324l = c16076l2.f31517l;
        HashSet hashSet = C12220l.isPro;
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
            } else {
                if (c11324l != null) {
                    long jSubs = C12220l.subs(fileArrListFiles);
                    if (jSubs != -1) {
                        try {
                            String hexString = Long.toHexString(jSubs);
                            try {
                                String str = "ExoPlayerCacheFileMetadata" + hexString;
                                SQLiteDatabase writableDatabase = c11324l.getWritableDatabase();
                                writableDatabase.beginTransactionNonExclusive();
                                try {
                                    AbstractC16932l.loadAd(writableDatabase, 2, hexString);
                                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    try {
                                        C10038l.m2835final(c11324l, Long.toHexString(jSubs));
                                    } catch (C12309l unused) {
                                        AbstractC6427l.vip("SimpleCache", "Failed to delete file metadata: " + jSubs);
                                    }
                                } catch (Throwable th) {
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (SQLException e) {
                                throw new C12309l(e);
                            }
                        } catch (C12309l unused2) {
                            AbstractC6427l.vip("SimpleCache", "Failed to delete file metadata: " + jSubs);
                        }
                    }
                }
                AbstractC15323l.m3974new(file);
            }
        }
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC2030l.firebase(new File(vKXApplication.getCacheDir().getAbsolutePath()));
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        AbstractC2030l.firebase((vKXApplication2 != null ? vKXApplication2 : null).getDir("artworkCache", 0));
    }

    public static Object purchase(AbstractC5563l abstractC5563l) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC2030l.firebase(new File(vKXApplication.getCacheDir().getAbsolutePath()));
        C8688l c8688l = AbstractC0085l.yandex;
        AbstractC2030l.firebase(AbstractC8182l.loadAd().loadAd());
        AbstractC8182l.loadAd().loadAd().mkdir();
        Object objPurchase = C6336l.yandex.purchase(abstractC5563l);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }

    public static void yandex(AppActivity appActivity, String str, AudioPlaylist audioPlaylist, List list) {
        C15478l c15478l = C15478l.purchase;
        C17685l c17685l = new C17685l(audioPlaylist, list, str);
        c15478l.getClass();
        C15478l.loadAd(appActivity, c17685l);
    }

    public final void mopub(AudioTrack audioTrack) {
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(this, ExecutorC6708l.f14063l, 0, new C9006l(audioTrack, null, 0), 2);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f15112l.f36440l;
    }
}
