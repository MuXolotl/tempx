package ua.itaysonlab.vkapi2.methods.execute;

import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5693l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class SearchInProfile_SearchPlaylistResponseJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("items", "profiles", "groups");

    public SearchInProfile_SearchPlaylistResponseJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, AudioPlaylist.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "items");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKProfile.class), c5746l, "profiles");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse = (SearchInProfile$SearchPlaylistResponse) obj;
        c3631l.mopub();
        c3631l.isVip("items");
        this.loadAd.billing(c3631l, searchInProfile$SearchPlaylistResponse.yandex);
        c3631l.isVip("profiles");
        List list = searchInProfile$SearchPlaylistResponse.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, list);
        c3631l.isVip("groups");
        abstractC7188l.billing(c3631l, searchInProfile$SearchPlaylistResponse.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l != 0) {
                AbstractC7188l abstractC7188l = this.crashlytics;
                if (iM503l == 1) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("profiles", "profiles", c0396l, setLicense);
                        z2 = true;
                    } else {
                        list2 = (List) objLoadAd;
                    }
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("groups", "groups", c0396l, setLicense);
                        z3 = true;
                    } else {
                        list3 = (List) objLoadAd2;
                    }
                }
            } else {
                Object objLoadAd3 = this.loadAd.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setLicense = AbstractC2812l.isVip("items", "items", c0396l, setLicense);
                    z = true;
                } else {
                    list = (List) objLoadAd3;
                }
            }
        }
        c0396l.ads();
        if ((!z) & (list == null)) {
            setLicense = AbstractC2812l.license("items", "items", c0396l, setLicense);
        }
        if ((!z2) & (list2 == null)) {
            setLicense = AbstractC2812l.license("profiles", "profiles", c0396l, setLicense);
        }
        if ((!z3) & (list3 == null)) {
            setLicense = AbstractC2812l.license("groups", "groups", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new SearchInProfile$SearchPlaylistResponse(list, list2, list3);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SearchInProfile.SearchPlaylistResponse)";
    }
}
