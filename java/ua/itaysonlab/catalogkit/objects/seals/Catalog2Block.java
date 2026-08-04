package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C14054l;
import defpackage.C2580l;
import defpackage.C9554l;
import defpackage.InterfaceC15749l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789\u001e:¨\u0006;"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "", "NoDataBlock", "ArtistBannerBlock", "ConcertsBlock", "MusicAudiosBlock", "MusicPlaylistsBlock", "LinksBlock", "SearchSuggestionsBlock", "VideosBlock", "ArtistVideosBlock", "CatalogBannersBlock", "CuratorBannerBlock", "CuratorGroupBlock", "TextsBlock", "PodcastEpisodesBlock", "PodcastSliderItemsBlock", "LongreadsBlock", "ActionsBlock", "PlaceholdersBlock", "RecommendedPlaylistsBlock", "MusicOwnersBlock", "AudioFollowingsUpdateInfoBlock", "PodcastsBlock", "RadioStationsBlock", "AudioBooksBlock", "AudioBooksPersonsBlock", "AudioStreamMixesBlock", "AudioContentCardsBlock", "EmptyBlock", "lٌُۚ", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ActionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistVideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksPersonsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioContentCardsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioFollowingsUpdateInfoBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioStreamMixesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CatalogBannersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ConcertsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorGroupBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$EmptyBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LinksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LongreadsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicAudiosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicOwnersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$NoDataBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PlaceholdersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastEpisodesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastSliderItemsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RadioStationsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RecommendedPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$SearchSuggestionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$TextsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$VideosBlock;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public abstract class Catalog2Block {

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class ArtistBannerBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List mopub;
        public final List purchase;
        public final String yandex;

        public ArtistBannerBlock(String str, String str2, List list, List list2, List list3, List list4, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
            this.mopub = list4;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.mopub;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtistBannerBlock)) {
                return false;
            }
            ArtistBannerBlock artistBannerBlock = (ArtistBannerBlock) obj;
            return AbstractC8576l.yandex(this.yandex, artistBannerBlock.yandex) && AbstractC8576l.yandex(this.loadAd, artistBannerBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, artistBannerBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, artistBannerBlock.amazon) && AbstractC8576l.yandex(this.purchase, artistBannerBlock.purchase) && AbstractC8576l.yandex(this.billing, artistBannerBlock.billing) && AbstractC8576l.yandex(this.mopub, artistBannerBlock.mopub);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.mopub;
            return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistBannerBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", artists_ids=");
            sb.append(this.billing);
            sb.append(", artist_info=");
            return AbstractC0653l.subscription(sb, this.mopub, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistVideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class ArtistVideosBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public ArtistVideosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.amazon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtistVideosBlock)) {
                return false;
            }
            ArtistVideosBlock artistVideosBlock = (ArtistVideosBlock) obj;
            return AbstractC8576l.yandex(this.yandex, artistVideosBlock.yandex) && AbstractC8576l.yandex(this.loadAd, artistVideosBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, artistVideosBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, artistVideosBlock.amazon) && AbstractC8576l.yandex(this.purchase, artistVideosBlock.purchase) && AbstractC8576l.yandex(this.billing, artistVideosBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistVideosBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", artist_videos_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioBooksBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public AudioBooksBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.Signature;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioBooksBlock)) {
                return false;
            }
            AudioBooksBlock audioBooksBlock = (AudioBooksBlock) obj;
            return AbstractC8576l.yandex(this.yandex, audioBooksBlock.yandex) && AbstractC8576l.yandex(this.loadAd, audioBooksBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioBooksBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, audioBooksBlock.amazon) && AbstractC8576l.yandex(this.purchase, audioBooksBlock.purchase) && AbstractC8576l.yandex(this.billing, audioBooksBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            if (list == null) {
                return C2580l.f5619l;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBooksBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", audio_book_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksPersonsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioBooksPersonsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public AudioBooksPersonsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.pro;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioBooksPersonsBlock)) {
                return false;
            }
            AudioBooksPersonsBlock audioBooksPersonsBlock = (AudioBooksPersonsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, audioBooksPersonsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, audioBooksPersonsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioBooksPersonsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, audioBooksPersonsBlock.amazon) && AbstractC8576l.yandex(this.purchase, audioBooksPersonsBlock.purchase) && AbstractC8576l.yandex(this.billing, audioBooksPersonsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            if (list == null) {
                return C2580l.f5619l;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBooksPersonsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", audio_books_person_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioContentCardsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioContentCardsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public AudioContentCardsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.ad;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioContentCardsBlock)) {
                return false;
            }
            AudioContentCardsBlock audioContentCardsBlock = (AudioContentCardsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, audioContentCardsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, audioContentCardsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioContentCardsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, audioContentCardsBlock.amazon) && AbstractC8576l.yandex(this.purchase, audioContentCardsBlock.purchase) && AbstractC8576l.yandex(this.billing, audioContentCardsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioContentCardsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", audio_content_card_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioFollowingsUpdateInfoBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioFollowingsUpdateInfoBlock extends Catalog2Block {
        public final List amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final String purchase;
        public final String yandex;

        public AudioFollowingsUpdateInfoBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = list2;
            this.purchase = str2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.subscription;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFollowingsUpdateInfoBlock)) {
                return false;
            }
            AudioFollowingsUpdateInfoBlock audioFollowingsUpdateInfoBlock = (AudioFollowingsUpdateInfoBlock) obj;
            return AbstractC8576l.yandex(this.yandex, audioFollowingsUpdateInfoBlock.yandex) && AbstractC8576l.yandex(this.loadAd, audioFollowingsUpdateInfoBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioFollowingsUpdateInfoBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, audioFollowingsUpdateInfoBlock.amazon) && AbstractC8576l.yandex(this.purchase, audioFollowingsUpdateInfoBlock.purchase) && AbstractC8576l.yandex(this.billing, audioFollowingsUpdateInfoBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.amazon;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.purchase;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFollowingsUpdateInfoBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", listen_events=");
            sb.append(this.amazon);
            sb.append(", next_from=");
            sb.append(this.purchase);
            sb.append(", audio_followings_update_info_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioStreamMixesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioStreamMixesBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public AudioStreamMixesBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.license;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioStreamMixesBlock)) {
                return false;
            }
            AudioStreamMixesBlock audioStreamMixesBlock = (AudioStreamMixesBlock) obj;
            return AbstractC8576l.yandex(this.yandex, audioStreamMixesBlock.yandex) && AbstractC8576l.yandex(this.loadAd, audioStreamMixesBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioStreamMixesBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, audioStreamMixesBlock.amazon) && AbstractC8576l.yandex(this.purchase, audioStreamMixesBlock.purchase) && AbstractC8576l.yandex(this.billing, audioStreamMixesBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioStreamMixesBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", audio_stream_mixes_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CatalogBannersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class CatalogBannersBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public CatalogBannersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.subs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CatalogBannersBlock)) {
                return false;
            }
            CatalogBannersBlock catalogBannersBlock = (CatalogBannersBlock) obj;
            return AbstractC8576l.yandex(this.yandex, catalogBannersBlock.yandex) && AbstractC8576l.yandex(this.loadAd, catalogBannersBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalogBannersBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, catalogBannersBlock.amazon) && AbstractC8576l.yandex(this.purchase, catalogBannersBlock.purchase) && AbstractC8576l.yandex(this.billing, catalogBannersBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogBannersBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", catalog_banner_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ConcertsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class ConcertsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public ConcertsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.advert;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConcertsBlock)) {
                return false;
            }
            ConcertsBlock concertsBlock = (ConcertsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, concertsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, concertsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, concertsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, concertsBlock.amazon) && AbstractC8576l.yandex(this.purchase, concertsBlock.purchase) && AbstractC8576l.yandex(this.billing, concertsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConcertsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", concerts_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class CuratorBannerBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public CuratorBannerBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.isPro;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CuratorBannerBlock)) {
                return false;
            }
            CuratorBannerBlock curatorBannerBlock = (CuratorBannerBlock) obj;
            return AbstractC8576l.yandex(this.yandex, curatorBannerBlock.yandex) && AbstractC8576l.yandex(this.loadAd, curatorBannerBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, curatorBannerBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, curatorBannerBlock.amazon) && AbstractC8576l.yandex(this.purchase, curatorBannerBlock.purchase) && AbstractC8576l.yandex(this.billing, curatorBannerBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CuratorBannerBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", curators_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorGroupBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class CuratorGroupBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public CuratorGroupBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.admob;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CuratorGroupBlock)) {
                return false;
            }
            CuratorGroupBlock curatorGroupBlock = (CuratorGroupBlock) obj;
            return AbstractC8576l.yandex(this.yandex, curatorGroupBlock.yandex) && AbstractC8576l.yandex(this.loadAd, curatorGroupBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, curatorGroupBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, curatorGroupBlock.amazon) && AbstractC8576l.yandex(this.purchase, curatorGroupBlock.purchase) && AbstractC8576l.yandex(this.billing, curatorGroupBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            if (list == null) {
                return C2580l.f5619l;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add("-" + ((String) it.next()));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CuratorGroupBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", group_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$EmptyBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class EmptyBlock extends Catalog2Block {
        public final String amazon;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public EmptyBlock(String str, String str2, List list, List list2, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            throw new IllegalStateException("EmptyBlock can't have data");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyBlock)) {
                return false;
            }
            EmptyBlock emptyBlock = (EmptyBlock) obj;
            return AbstractC8576l.yandex(this.yandex, emptyBlock.yandex) && AbstractC8576l.yandex(this.loadAd, emptyBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, emptyBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, emptyBlock.amazon) && AbstractC8576l.yandex(this.purchase, emptyBlock.purchase);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            return C2580l.f5619l;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmptyBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            return AbstractC0653l.subscription(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LinksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class LinksBlock extends Catalog2Block {
        public final String amazon;
        public List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public LinksBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.purchase;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinksBlock)) {
                return false;
            }
            LinksBlock linksBlock = (LinksBlock) obj;
            return AbstractC8576l.yandex(this.yandex, linksBlock.yandex) && AbstractC8576l.yandex(this.loadAd, linksBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, linksBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, linksBlock.amazon) && AbstractC8576l.yandex(this.purchase, linksBlock.purchase) && AbstractC8576l.yandex(this.billing, linksBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinksBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", links_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LongreadsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class LongreadsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public LongreadsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.metrica;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongreadsBlock)) {
                return false;
            }
            LongreadsBlock longreadsBlock = (LongreadsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, longreadsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, longreadsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, longreadsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, longreadsBlock.amazon) && AbstractC8576l.yandex(this.purchase, longreadsBlock.purchase) && AbstractC8576l.yandex(this.billing, longreadsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongreadsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", longreads_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicOwnersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class MusicOwnersBlock extends Catalog2Block {
        public final List amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final String purchase;
        public final String yandex;

        public MusicOwnersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = list2;
            this.purchase = str2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.ads;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicOwnersBlock)) {
                return false;
            }
            MusicOwnersBlock musicOwnersBlock = (MusicOwnersBlock) obj;
            return AbstractC8576l.yandex(this.yandex, musicOwnersBlock.yandex) && AbstractC8576l.yandex(this.loadAd, musicOwnersBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, musicOwnersBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, musicOwnersBlock.amazon) && AbstractC8576l.yandex(this.purchase, musicOwnersBlock.purchase) && AbstractC8576l.yandex(this.billing, musicOwnersBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.amazon;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.purchase;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicOwnersBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", listen_events=");
            sb.append(this.amazon);
            sb.append(", next_from=");
            sb.append(this.purchase);
            sb.append(", music_owners_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastEpisodesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PodcastEpisodesBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public PodcastEpisodesBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.smaato;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastEpisodesBlock)) {
                return false;
            }
            PodcastEpisodesBlock podcastEpisodesBlock = (PodcastEpisodesBlock) obj;
            return AbstractC8576l.yandex(this.yandex, podcastEpisodesBlock.yandex) && AbstractC8576l.yandex(this.loadAd, podcastEpisodesBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, podcastEpisodesBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, podcastEpisodesBlock.amazon) && AbstractC8576l.yandex(this.purchase, podcastEpisodesBlock.purchase) && AbstractC8576l.yandex(this.billing, podcastEpisodesBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastEpisodesBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", podcast_episodes_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastSliderItemsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PodcastSliderItemsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public PodcastSliderItemsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.remoteconfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastSliderItemsBlock)) {
                return false;
            }
            PodcastSliderItemsBlock podcastSliderItemsBlock = (PodcastSliderItemsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, podcastSliderItemsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, podcastSliderItemsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, podcastSliderItemsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, podcastSliderItemsBlock.amazon) && AbstractC8576l.yandex(this.purchase, podcastSliderItemsBlock.purchase) && AbstractC8576l.yandex(this.billing, podcastSliderItemsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastSliderItemsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", podcast_slider_items_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PodcastsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public PodcastsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.vip;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastsBlock)) {
                return false;
            }
            PodcastsBlock podcastsBlock = (PodcastsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, podcastsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, podcastsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, podcastsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, podcastsBlock.amazon) && AbstractC8576l.yandex(this.purchase, podcastsBlock.purchase) && AbstractC8576l.yandex(this.billing, podcastsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", podcast_items_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RadioStationsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class RadioStationsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public RadioStationsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.tapsense;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadioStationsBlock)) {
                return false;
            }
            RadioStationsBlock radioStationsBlock = (RadioStationsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, radioStationsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, radioStationsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, radioStationsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, radioStationsBlock.amazon) && AbstractC8576l.yandex(this.purchase, radioStationsBlock.purchase) && AbstractC8576l.yandex(this.billing, radioStationsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            if (list == null) {
                return C2580l.f5619l;
            }
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RadioStationsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", radio_stations_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RecommendedPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class RecommendedPlaylistsBlock extends Catalog2Block {
        public final List amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List mopub;
        public final String purchase;
        public final String yandex;

        public RecommendedPlaylistsBlock(String str, String str2, List list, List list2, List list3, List list4, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = list2;
            this.purchase = str2;
            this.billing = list3;
            this.mopub = list4;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.adcel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendedPlaylistsBlock)) {
                return false;
            }
            RecommendedPlaylistsBlock recommendedPlaylistsBlock = (RecommendedPlaylistsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, recommendedPlaylistsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, recommendedPlaylistsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, recommendedPlaylistsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, recommendedPlaylistsBlock.amazon) && AbstractC8576l.yandex(this.purchase, recommendedPlaylistsBlock.purchase) && AbstractC8576l.yandex(this.billing, recommendedPlaylistsBlock.billing) && AbstractC8576l.yandex(this.mopub, recommendedPlaylistsBlock.mopub);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.amazon;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.purchase;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.billing;
            int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.mopub;
            return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.mopub;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendedPlaylistsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", listen_events=");
            sb.append(this.amazon);
            sb.append(", next_from=");
            sb.append(this.purchase);
            sb.append(", audios_ids=");
            sb.append(this.billing);
            sb.append(", playlists_ids=");
            return AbstractC0653l.subscription(sb, this.mopub, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$VideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class VideosBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public VideosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.crashlytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideosBlock)) {
                return false;
            }
            VideosBlock videosBlock = (VideosBlock) obj;
            return AbstractC8576l.yandex(this.yandex, videosBlock.yandex) && AbstractC8576l.yandex(this.loadAd, videosBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, videosBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, videosBlock.amazon) && AbstractC8576l.yandex(this.purchase, videosBlock.purchase) && AbstractC8576l.yandex(this.billing, videosBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideosBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", videos_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }
    }

    /* JADX INFO: renamed from: amazon */
    public abstract Catalog2Layout getLoadAd();

    public abstract Map crashlytics(C9554l c9554l);

    /* JADX INFO: renamed from: loadAd */
    public abstract String getYandex();

    public abstract List purchase();

    /* JADX INFO: renamed from: yandex */
    public abstract List getCrashlytics();

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ActionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class ActionsBlock extends Catalog2Block {
        public final List amazon;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final String purchase;
        public final String yandex;

        public /* synthetic */ ActionsBlock(String str, Catalog2Layout catalog2Layout, List list, List list2, String str2, int i) {
            this(str, (i & 16) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return C14054l.f27396l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionsBlock)) {
                return false;
            }
            ActionsBlock actionsBlock = (ActionsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, actionsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, actionsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, actionsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, actionsBlock.amazon) && AbstractC8576l.yandex(this.purchase, actionsBlock.purchase);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.amazon;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.purchase;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            ArrayList arrayList;
            List list = this.crashlytics;
            if (list != null) {
                arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Catalog2Button) it.next()).getItemId());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C2580l.f5619l : arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", listen_events=");
            sb.append(this.amazon);
            sb.append(", next_from=");
            return AbstractC2812l.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public ActionsBlock(String str, String str2, List list, List list2, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = list2;
            this.purchase = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$NoDataBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class NoDataBlock extends Catalog2Block {
        public final String amazon;
        public final Catalog2Badge billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public /* synthetic */ NoDataBlock(String str, Catalog2Layout catalog2Layout, List list, String str2, List list2, Catalog2Badge catalog2Badge, int i) {
            this(str, catalog2Layout, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : catalog2Badge);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            throw new IllegalStateException("NoDataBlock can't have data");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoDataBlock)) {
                return false;
            }
            NoDataBlock noDataBlock = (NoDataBlock) obj;
            return AbstractC8576l.yandex(this.yandex, noDataBlock.yandex) && AbstractC8576l.yandex(this.loadAd, noDataBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, noDataBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, noDataBlock.amazon) && AbstractC8576l.yandex(this.purchase, noDataBlock.purchase) && AbstractC8576l.yandex(this.billing, noDataBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Catalog2Badge catalog2Badge = this.billing;
            return iHashCode3 + (catalog2Badge != null ? catalog2Badge.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            return C2580l.f5619l;
        }

        public final String toString() {
            return "NoDataBlock(id=" + this.yandex + ", layout=" + this.loadAd + ", actions=" + this.crashlytics + ", next_from=" + this.amazon + ", listen_events=" + this.purchase + ", badge=" + this.billing + ')';
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public NoDataBlock(String str, Catalog2Layout catalog2Layout, List list, String str2, List list2, Catalog2Badge catalog2Badge) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = catalog2Badge;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicAudiosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class MusicAudiosBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public /* synthetic */ MusicAudiosBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.yandex;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicAudiosBlock)) {
                return false;
            }
            MusicAudiosBlock musicAudiosBlock = (MusicAudiosBlock) obj;
            return AbstractC8576l.yandex(this.yandex, musicAudiosBlock.yandex) && AbstractC8576l.yandex(this.loadAd, musicAudiosBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, musicAudiosBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, musicAudiosBlock.amazon) && AbstractC8576l.yandex(this.purchase, musicAudiosBlock.purchase) && AbstractC8576l.yandex(this.billing, musicAudiosBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicAudiosBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", audios_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public MusicAudiosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PlaceholdersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PlaceholdersBlock extends Catalog2Block {
        public final List amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final String purchase;
        public final String yandex;

        public /* synthetic */ PlaceholdersBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 16) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.startapp;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceholdersBlock)) {
                return false;
            }
            PlaceholdersBlock placeholdersBlock = (PlaceholdersBlock) obj;
            return AbstractC8576l.yandex(this.yandex, placeholdersBlock.yandex) && AbstractC8576l.yandex(this.loadAd, placeholdersBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, placeholdersBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, placeholdersBlock.amazon) && AbstractC8576l.yandex(this.purchase, placeholdersBlock.purchase) && AbstractC8576l.yandex(this.billing, placeholdersBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.amazon;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.purchase;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceholdersBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", listen_events=");
            sb.append(this.amazon);
            sb.append(", next_from=");
            sb.append(this.purchase);
            sb.append(", placeholder_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public PlaceholdersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = list2;
            this.purchase = str2;
            this.billing = list3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$SearchSuggestionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class SearchSuggestionsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public /* synthetic */ SearchSuggestionsBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.billing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSuggestionsBlock)) {
                return false;
            }
            SearchSuggestionsBlock searchSuggestionsBlock = (SearchSuggestionsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, searchSuggestionsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, searchSuggestionsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, searchSuggestionsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, searchSuggestionsBlock.amazon) && AbstractC8576l.yandex(this.purchase, searchSuggestionsBlock.purchase) && AbstractC8576l.yandex(this.billing, searchSuggestionsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchSuggestionsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", suggestions_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public SearchSuggestionsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$TextsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class TextsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List purchase;
        public final String yandex;

        public /* synthetic */ TextsBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.firebase;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextsBlock)) {
                return false;
            }
            TextsBlock textsBlock = (TextsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, textsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, textsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, textsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, textsBlock.amazon) && AbstractC8576l.yandex(this.purchase, textsBlock.purchase) && AbstractC8576l.yandex(this.billing, textsBlock.billing);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", text_ids=");
            return AbstractC0653l.subscription(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public TextsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class MusicPlaylistsBlock extends Catalog2Block {
        public final String amazon;
        public final List billing;
        public final List crashlytics;
        public final Catalog2Layout loadAd;
        public final List mopub;
        public final List purchase;
        public final String yandex;

        public /* synthetic */ MusicPlaylistsBlock(String str, Catalog2Layout catalog2Layout, List list, String str2, List list2, List list3, List list4, int i) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, catalog2Layout);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: amazon, reason: from getter */
        public final Catalog2Layout getLoadAd() {
            return this.loadAd;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map crashlytics(C9554l c9554l) {
            return c9554l.loadAd;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicPlaylistsBlock)) {
                return false;
            }
            MusicPlaylistsBlock musicPlaylistsBlock = (MusicPlaylistsBlock) obj;
            return AbstractC8576l.yandex(this.yandex, musicPlaylistsBlock.yandex) && AbstractC8576l.yandex(this.loadAd, musicPlaylistsBlock.loadAd) && AbstractC8576l.yandex(this.crashlytics, musicPlaylistsBlock.crashlytics) && AbstractC8576l.yandex(this.amazon, musicPlaylistsBlock.amazon) && AbstractC8576l.yandex(this.purchase, musicPlaylistsBlock.purchase) && AbstractC8576l.yandex(this.billing, musicPlaylistsBlock.billing) && AbstractC8576l.yandex(this.mopub, musicPlaylistsBlock.mopub);
        }

        public final int hashCode() {
            int iSubs = AbstractC14814l.subs(this.loadAd, this.yandex.hashCode() * 31, 31);
            List list = this.crashlytics;
            int iHashCode = (iSubs + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.amazon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.purchase;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.billing;
            int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.mopub;
            return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: loadAd, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List purchase() {
            List list = this.billing;
            return list == null ? C2580l.f5619l : list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicPlaylistsBlock(id=");
            sb.append(this.yandex);
            sb.append(", layout=");
            sb.append(this.loadAd);
            sb.append(", actions=");
            sb.append(this.crashlytics);
            sb.append(", next_from=");
            sb.append(this.amazon);
            sb.append(", listen_events=");
            sb.append(this.purchase);
            sb.append(", playlists_ids=");
            sb.append(this.billing);
            sb.append(", catalog_recom_playlist_relations=");
            return AbstractC0653l.subscription(sb, this.mopub, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final List getCrashlytics() {
            return this.crashlytics;
        }

        public MusicPlaylistsBlock(String str, String str2, List list, List list2, List list3, List list4, Catalog2Layout catalog2Layout) {
            this.yandex = str;
            this.loadAd = catalog2Layout;
            this.crashlytics = list;
            this.amazon = str2;
            this.purchase = list2;
            this.billing = list3;
            this.mopub = list4;
        }
    }
}
