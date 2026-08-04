package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import ua.itaysonlab.itunesutil.ItunesSearch$ITunesResponse;
import ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؕ۠ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3694l {
    public static final AbstractC7188l purchase;
    public static final C3694l yandex = new C3694l();
    public static final C4910l loadAd = AbstractC8618l.yandex();
    public static final C1579l crashlytics = new C1579l(20);
    public static final ConcurrentHashMap amazon = new ConcurrentHashMap(20);

    static {
        C12952l c12952l = VKXApplication.f36629l;
        c12952l.getClass();
        purchase = c12952l.loadAd(ItunesSearch$ITunesResponse.class, AbstractC7694l.yandex, null);
    }

    public static ItunesSearch$ITunesResponse crashlytics(String str, String str2) throws IOException {
        C13170l c13170l = new C13170l();
        c13170l.isPro(null, "https://itunes.apple.com/search");
        C13170l c13170lBilling = c13170l.crashlytics().billing();
        c13170lBilling.loadAd("term", str);
        c13170lBilling.loadAd("entity", str2);
        c13170lBilling.loadAd("limit", String.valueOf(4));
        C6705l c6705lCrashlytics = c13170lBilling.crashlytics();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C11610l c11610l = AbstractC3629l.yandex;
        C11610l c11610l2 = c11610l != null ? c11610l : null;
        C11644l c11644l = new C11644l(28);
        c11644l.f23358l = c6705lCrashlytics;
        AbstractC6897l abstractC6897l = c11610l2.yandex(new C17032l(c11644l)).billing().f35907l;
        if (abstractC6897l != null) {
            try {
                ItunesSearch$ITunesResponse itunesSearch$ITunesResponse = (ItunesSearch$ITunesResponse) purchase.yandex(abstractC6897l.mo1516l());
                abstractC6897l.close();
                if (itunesSearch$ITunesResponse != null) {
                    return itunesSearch$ITunesResponse;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(abstractC6897l, th);
                    throw th2;
                }
            }
        }
        return ItunesSearch$ITunesResponse.crashlytics;
    }

    public static String yandex(ItunesSearch$ItunesItem itunesSearch$ItunesItem, EnumC9368l enumC9368l) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC12024l.m3325goto(itunesSearch$ItunesItem.purchase, "100x100bb.jpg"));
        int i = enumC9368l.f19203l;
        sb.append(i);
        sb.append('x');
        sb.append(i);
        sb.append(".jpg");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(AudioTrack audioTrack, EnumC9368l enumC9368l, AbstractC0283l abstractC0283l) {
        C3673l c3673l;
        if (abstractC0283l instanceof C3673l) {
            c3673l = (C3673l) abstractC0283l;
            int i = c3673l.f7737l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3673l.f7737l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3673l = new C3673l(this, abstractC0283l);
            }
        } else {
            c3673l = new C3673l(this, abstractC0283l);
        }
        Object objAdmob = c3673l.f7740l;
        int i2 = c3673l.f7737l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            c3673l.f7739l = audioTrack;
            c3673l.f7738l = enumC9368l;
            c3673l.f7737l = 1;
            objAdmob = AbstractC11990l.admob(new C0469l(audioTrack, interfaceC14029l, 9), c3673l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            enumC9368l = c3673l.f7738l;
            audioTrack = c3673l.f7739l;
            AbstractC2829l.crashlytics(objAdmob);
        }
        ItunesSearch$ItunesItem itunesSearch$ItunesItem = (ItunesSearch$ItunesItem) objAdmob;
        if (itunesSearch$ItunesItem != null) {
            return yandex(itunesSearch$ItunesItem, enumC9368l);
        }
        if (!AbstractC16676l.amazon(audioTrack)) {
            return "";
        }
        AudioAlbum audioAlbum = audioTrack.vip;
        if (enumC9368l == EnumC9368l.LOW) {
            String str = audioAlbum.purchase.crashlytics;
            return str == null ? "" : str;
        }
        AlbumThumb albumThumb = audioAlbum.purchase;
        String str2 = albumThumb.purchase;
        if (str2 != null) {
            return str2;
        }
        String str3 = albumThumb.amazon;
        return str3 == null ? "" : str3;
    }
}
