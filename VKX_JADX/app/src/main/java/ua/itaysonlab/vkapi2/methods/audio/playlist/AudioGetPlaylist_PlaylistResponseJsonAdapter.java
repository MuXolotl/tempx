package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C2580l;
import defpackage.C3631l;
import defpackage.C5693l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioGetPlaylist_PlaylistResponseJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("profiles", "groups", "artists", "playlist", "album_parts_first_audios", "audio_ids");

    public AudioGetPlaylist_PlaylistResponseJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, VKProfile.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "profiles");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, CatalogArtist.class), c5746l, "artists");
        this.amazon = c12952l.loadAd(AudioPlaylist.class, c5746l, "playlist");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioGetPlaylist$PlaylistResponse.AlbumPart.class), c5746l, "album_parts_first_audios");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioGetPlaylist$PlaylistResponse.AudioIds.class), c5746l, "audio_ids");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioGetPlaylist$PlaylistResponse audioGetPlaylist$PlaylistResponse = (AudioGetPlaylist$PlaylistResponse) obj;
        c3631l.mopub();
        c3631l.isVip("profiles");
        List list = audioGetPlaylist$PlaylistResponse.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, list);
        c3631l.isVip("groups");
        abstractC7188l.billing(c3631l, audioGetPlaylist$PlaylistResponse.loadAd);
        c3631l.isVip("artists");
        this.crashlytics.billing(c3631l, audioGetPlaylist$PlaylistResponse.crashlytics);
        c3631l.isVip("playlist");
        this.amazon.billing(c3631l, audioGetPlaylist$PlaylistResponse.amazon);
        c3631l.isVip("album_parts_first_audios");
        this.purchase.billing(c3631l, audioGetPlaylist$PlaylistResponse.purchase);
        c3631l.isVip("audio_ids");
        this.billing.billing(c3631l, audioGetPlaylist$PlaylistResponse.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int i = -1;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object obj = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    i &= -2;
                    break;
                case 1:
                    objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    i &= -3;
                    break;
                case 2:
                    objLoadAd3 = this.crashlytics.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    objLoadAd4 = this.amazon.loadAd(c0396l);
                    i &= -9;
                    break;
                case 4:
                    objLoadAd5 = this.purchase.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd6 = this.billing.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setIsVip = AbstractC2812l.isVip("audio_ids", "audio_ids", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd6;
                    }
                    i &= -33;
                    break;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -64) {
            return new AudioGetPlaylist$PlaylistResponse((List) objLoadAd, (List) objLoadAd2, (List) objLoadAd3, (AudioPlaylist) objLoadAd4, (List) objLoadAd5, (List) obj);
        }
        List list = (List) objLoadAd2;
        List list2 = (List) objLoadAd3;
        AudioPlaylist audioPlaylist = (AudioPlaylist) objLoadAd4;
        List list3 = (List) objLoadAd5;
        List list4 = (List) obj;
        List list5 = (i & 1) != 0 ? null : (List) objLoadAd;
        if ((i & 2) != 0) {
            list = null;
        }
        List list6 = (i & 4) != 0 ? null : list2;
        if ((i & 8) != 0) {
            audioPlaylist = null;
        }
        List list7 = (i & 16) != 0 ? null : list3;
        if ((i & 32) != 0) {
            list4 = C2580l.f5619l;
        }
        return new AudioGetPlaylist$PlaylistResponse(list5, list, list6, audioPlaylist, list7, list4);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioGetPlaylist.PlaylistResponse)";
    }
}
