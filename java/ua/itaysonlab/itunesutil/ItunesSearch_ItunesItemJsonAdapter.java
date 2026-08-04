package ua.itaysonlab.itunesutil;

import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ItunesSearch_ItunesItemJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("kind", "artistName", "trackName", "collectionName", "artworkUrl100", "trackId", "releaseDate", "discCount", "discNumber", "trackCount", "trackNumber", "primaryGenreName");

    public ItunesSearch_ItunesItemJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "kind");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "collectionName");
        this.amazon = c12952l.loadAd(Integer.class, c5746l, "trackId");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        ItunesSearch$ItunesItem itunesSearch$ItunesItem = (ItunesSearch$ItunesItem) obj;
        c3631l.mopub();
        c3631l.isVip("kind");
        String str = itunesSearch$ItunesItem.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("artistName");
        abstractC7188l.billing(c3631l, itunesSearch$ItunesItem.loadAd);
        c3631l.isVip("trackName");
        abstractC7188l.billing(c3631l, itunesSearch$ItunesItem.crashlytics);
        c3631l.isVip("collectionName");
        this.crashlytics.billing(c3631l, itunesSearch$ItunesItem.amazon);
        c3631l.isVip("artworkUrl100");
        abstractC7188l.billing(c3631l, itunesSearch$ItunesItem.purchase);
        c3631l.isVip("trackId");
        Integer num = itunesSearch$ItunesItem.billing;
        AbstractC7188l abstractC7188l2 = this.amazon;
        abstractC7188l2.billing(c3631l, num);
        c3631l.isVip("releaseDate");
        abstractC7188l.billing(c3631l, itunesSearch$ItunesItem.mopub);
        c3631l.isVip("discCount");
        abstractC7188l2.billing(c3631l, itunesSearch$ItunesItem.admob);
        c3631l.isVip("discNumber");
        abstractC7188l2.billing(c3631l, itunesSearch$ItunesItem.subs);
        c3631l.isVip("trackCount");
        abstractC7188l2.billing(c3631l, itunesSearch$ItunesItem.isPro);
        c3631l.isVip("trackNumber");
        abstractC7188l2.billing(c3631l, itunesSearch$ItunesItem.firebase);
        c3631l.isVip("primaryGenreName");
        abstractC7188l.billing(c3631l, itunesSearch$ItunesItem.smaato);
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
        Object obj = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object objLoadAd7 = null;
        Object objLoadAd8 = null;
        Object objLoadAd9 = null;
        Object objLoadAd10 = null;
        Object objLoadAd11 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.amazon;
            Object obj2 = objLoadAd;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -2;
                    continue;
                case 1:
                    objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    i &= -3;
                    break;
                case 2:
                    objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd12 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd12 == null) {
                        setIsVip = AbstractC2812l.isVip("collectionName", "collectionName", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd12;
                    }
                    i &= -9;
                    break;
                case 4:
                    objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    i &= -33;
                    break;
                case 6:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i &= -65;
                    break;
                case 7:
                    objLoadAd7 = abstractC7188l.loadAd(c0396l);
                    i &= -129;
                    break;
                case 8:
                    objLoadAd8 = abstractC7188l.loadAd(c0396l);
                    i &= -257;
                    break;
                case 9:
                    objLoadAd9 = abstractC7188l.loadAd(c0396l);
                    i &= -513;
                    break;
                case 10:
                    objLoadAd10 = abstractC7188l.loadAd(c0396l);
                    i &= -1025;
                    break;
                case 11:
                    objLoadAd11 = abstractC7188l2.loadAd(c0396l);
                    i &= -2049;
                    break;
            }
            objLoadAd = obj2;
        }
        Object obj3 = objLoadAd;
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -4096) {
            return new ItunesSearch$ItunesItem((String) obj3, (String) objLoadAd2, (String) objLoadAd3, (String) obj, (String) objLoadAd4, (Integer) objLoadAd5, (String) objLoadAd6, (Integer) objLoadAd7, (Integer) objLoadAd8, (Integer) objLoadAd9, (Integer) objLoadAd10, (String) objLoadAd11);
        }
        return new ItunesSearch$ItunesItem((String) obj3, (String) objLoadAd2, (String) objLoadAd3, (String) obj, (String) objLoadAd4, (Integer) objLoadAd5, (String) objLoadAd6, (Integer) objLoadAd7, (Integer) objLoadAd8, (Integer) objLoadAd9, (Integer) objLoadAd10, (String) objLoadAd11, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ItunesSearch.ItunesItem)";
    }
}
