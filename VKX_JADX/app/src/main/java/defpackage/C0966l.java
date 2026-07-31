package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* JADX INFO: renamed from: lَؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0966l extends AbstractC11779l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final AbstractC8481l f2667l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C15333l f2668l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f2669l;

    static {
        int i = AbstractC8481l.f17529l;
        C4146l c4146l = new C4146l(4);
        EnumC14116l enumC14116l = EnumC14116l.f27543l;
        c4146l.yandex(enumC14116l);
        EnumC14116l enumC14116l2 = EnumC14116l.f27550l;
        c4146l.yandex(enumC14116l2);
        EnumC14116l enumC14116l3 = EnumC14116l.f27593l;
        c4146l.yandex(enumC14116l3);
        EnumC14116l enumC14116l4 = EnumC14116l.f27493l;
        c4146l.yandex(enumC14116l4);
        EnumC14116l enumC14116l5 = EnumC14116l.f27549l;
        c4146l.yandex(enumC14116l5);
        EnumC14116l enumC14116l6 = EnumC14116l.f27474l;
        c4146l.yandex(enumC14116l6);
        EnumC14116l enumC14116l7 = EnumC14116l.f27515l;
        c4146l.yandex(enumC14116l7);
        f2667l = c4146l.mopub();
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ACOUSTIC, EnumC14116l.f27574l);
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_FINGERPRINT, EnumC14116l.f27486l);
        c13698lYandex.mo3668catch(EnumC17969l.ACOUSTID_ID, EnumC14116l.f27581l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM, enumC14116l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST, EnumC14116l.f27596l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTIST_SORT, EnumC14116l.f27577l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS, EnumC14116l.f27473l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_ARTISTS_SORT, EnumC14116l.f27603l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM_SORT, EnumC14116l.f27548l);
        c13698lYandex.mo3668catch(EnumC17969l.AMAZON_ID, EnumC14116l.f27498l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER, EnumC14116l.f27512l);
        c13698lYandex.mo3668catch(EnumC17969l.ARRANGER_SORT, EnumC14116l.f27610l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST, enumC14116l2);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS, EnumC14116l.f27510l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTISTS_SORT, EnumC14116l.f27485l);
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST_SORT, EnumC14116l.f27482l);
        c13698lYandex.mo3668catch(EnumC17969l.BARCODE, EnumC14116l.f27472l);
        c13698lYandex.mo3668catch(EnumC17969l.BPM, EnumC14116l.f27611l);
        c13698lYandex.mo3668catch(EnumC17969l.CATALOG_NO, EnumC14116l.f27501l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR, EnumC14116l.f27536l);
        c13698lYandex.mo3668catch(EnumC17969l.CHOIR_SORT, EnumC14116l.f27570l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_CATALOG, EnumC14116l.f27470l);
        c13698lYandex.mo3668catch(EnumC17969l.CLASSICAL_NICKNAME, EnumC14116l.f27521l);
        c13698lYandex.mo3668catch(EnumC17969l.COMMENT, enumC14116l3);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER, EnumC14116l.f27569l);
        c13698lYandex.mo3668catch(EnumC17969l.COMPOSER_SORT, EnumC14116l.f27608l);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR, EnumC14116l.f27513l);
        c13698lYandex.mo3668catch(EnumC17969l.CONDUCTOR_SORT, EnumC14116l.f27580l);
        c13698lYandex.mo3668catch(EnumC17969l.COUNTRY, EnumC14116l.f27462l);
        c13698lYandex.mo3668catch(EnumC17969l.COVER_ART, EnumC14116l.f27597l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM1, EnumC14116l.f27500l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM2, EnumC14116l.f27544l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM3, EnumC14116l.f27572l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM4, EnumC14116l.f27497l);
        c13698lYandex.mo3668catch(EnumC17969l.CUSTOM5, EnumC14116l.f27471l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_NO, EnumC14116l.f27494l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_SUBTITLE, EnumC14116l.f27499l);
        c13698lYandex.mo3668catch(EnumC17969l.DISC_TOTAL, EnumC14116l.f27477l);
        c13698lYandex.mo3668catch(EnumC17969l.DJMIXER, EnumC14116l.f27503l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_ELECTRONIC, EnumC14116l.f27495l);
        c13698lYandex.mo3668catch(EnumC17969l.ENCODER, EnumC14116l.f27563l);
        c13698lYandex.mo3668catch(EnumC17969l.ENGINEER, EnumC14116l.f27520l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE, EnumC14116l.f27481l);
        c13698lYandex.mo3668catch(EnumC17969l.ENSEMBLE_SORT, EnumC14116l.f27600l);
        c13698lYandex.mo3668catch(EnumC17969l.FBPM, EnumC14116l.f27609l);
        c13698lYandex.mo3668catch(EnumC17969l.GENRE, enumC14116l4);
        c13698lYandex.mo3668catch(EnumC17969l.GROUPING, EnumC14116l.f27487l);
        c13698lYandex.mo3668catch(EnumC17969l.INVOLVED_PERSON, EnumC14116l.f27564l);
        c13698lYandex.mo3668catch(EnumC17969l.ISRC, EnumC14116l.f27509l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_CLASSICAL, EnumC14116l.f27567l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_COMPILATION, EnumC14116l.f27607l);
        c13698lYandex.mo3668catch(EnumC17969l.IS_SOUNDTRACK, EnumC14116l.f27464l);
        c13698lYandex.mo3668catch(EnumC17969l.KEY, EnumC14116l.f27531l);
        c13698lYandex.mo3668catch(EnumC17969l.LANGUAGE, EnumC14116l.f27551l);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICIST, EnumC14116l.f27595l);
        c13698lYandex.mo3668catch(EnumC17969l.LYRICS, EnumC14116l.f27571l);
        c13698lYandex.mo3668catch(EnumC17969l.MEDIA, EnumC14116l.f27490l);
        c13698lYandex.mo3668catch(EnumC17969l.MIXER, EnumC14116l.f27484l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD, EnumC14116l.f27467l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AGGRESSIVE, EnumC14116l.f27546l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_AROUSAL, EnumC14116l.f27559l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_DANCEABILITY, EnumC14116l.f27591l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_HAPPY, EnumC14116l.f27524l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_INSTRUMENTAL, EnumC14116l.f27479l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_PARTY, EnumC14116l.f27605l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_RELAXED, EnumC14116l.f27612l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_SAD, EnumC14116l.f27575l);
        c13698lYandex.mo3668catch(EnumC17969l.MOOD_VALENCE, EnumC14116l.f27532l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT, EnumC14116l.f27507l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_NO, EnumC14116l.f27530l);
        c13698lYandex.mo3668catch(EnumC17969l.MOVEMENT_TOTAL, EnumC14116l.f27599l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ARTISTID, EnumC14116l.f27587l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_DISC_ID, EnumC14116l.f27552l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC14116l.f27508l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEARTISTID, EnumC14116l.f27604l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASEID, EnumC14116l.f27601l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_COUNTRY, EnumC14116l.f27496l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC14116l.f27557l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_STATUS, EnumC14116l.f27519l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC14116l.f27529l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_RELEASE_TYPE, EnumC14116l.f27502l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_TRACK_ID, EnumC14116l.f27483l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK, EnumC14116l.f27527l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_ID, EnumC14116l.f27568l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION, EnumC14116l.f27492l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC14116l.f27594l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC14116l.f27589l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC14116l.f27558l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC14116l.f27465l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC14116l.f27562l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC14116l.f27517l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC14116l.f27514l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC14116l.f27516l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC14116l.f27533l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC14116l.f27613l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC14116l.f27535l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC14116l.f27576l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC14116l.f27476l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC14116l.f27585l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC14116l.f27583l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC14116l.f27561l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC14116l.f27463l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC14116l.f27528l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC14116l.f27588l);
        c13698lYandex.mo3668catch(EnumC17969l.MUSICIP_ID, EnumC14116l.f27489l);
        c13698lYandex.mo3668catch(EnumC17969l.OCCASION, EnumC14116l.f27538l);
        c13698lYandex.mo3668catch(EnumC17969l.OPUS, EnumC14116l.f27478l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA, EnumC14116l.f27579l);
        c13698lYandex.mo3668catch(EnumC17969l.ORCHESTRA_SORT, EnumC14116l.f27545l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ALBUM, EnumC14116l.f27523l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_ARTIST, EnumC14116l.f27468l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_LYRICIST, EnumC14116l.f27590l);
        c13698lYandex.mo3668catch(EnumC17969l.ORIGINAL_YEAR, EnumC14116l.f27540l);
        c13698lYandex.mo3668catch(EnumC17969l.PART, EnumC14116l.f27582l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_NUMBER, EnumC14116l.f27504l);
        c13698lYandex.mo3668catch(EnumC17969l.PART_TYPE, EnumC14116l.f27525l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER, EnumC14116l.f27606l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME, EnumC14116l.f27491l);
        c13698lYandex.mo3668catch(EnumC17969l.PERFORMER_NAME_SORT, EnumC14116l.f27573l);
        c13698lYandex.mo3668catch(EnumC17969l.PERIOD, EnumC14116l.f27475l);
        c13698lYandex.mo3668catch(EnumC17969l.PRODUCER, EnumC14116l.f27522l);
        c13698lYandex.mo3668catch(EnumC17969l.QUALITY, EnumC14116l.f27547l);
        c13698lYandex.mo3668catch(EnumC17969l.RANKING, EnumC14116l.f27505l);
        c13698lYandex.mo3668catch(EnumC17969l.RATING, EnumC14116l.f27469l);
        c13698lYandex.mo3668catch(EnumC17969l.RECORD_LABEL, EnumC14116l.f27518l);
        c13698lYandex.mo3668catch(EnumC17969l.REMIXER, EnumC14116l.f27578l);
        c13698lYandex.mo3668catch(EnumC17969l.SCRIPT, EnumC14116l.f27506l);
        c13698lYandex.mo3668catch(EnumC17969l.SINGLE_DISC_TRACK_NO, EnumC14116l.f27542l);
        c13698lYandex.mo3668catch(EnumC17969l.SUBTITLE, EnumC14116l.f27537l);
        c13698lYandex.mo3668catch(EnumC17969l.TAGS, EnumC14116l.f27566l);
        c13698lYandex.mo3668catch(EnumC17969l.TEMPO, EnumC14116l.f27488l);
        c13698lYandex.mo3668catch(EnumC17969l.TIMBRE, EnumC14116l.f27553l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE, enumC14116l5);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_MOVEMENT, EnumC14116l.f27526l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE_SORT, EnumC14116l.f27539l);
        c13698lYandex.mo3668catch(EnumC17969l.TONALITY, EnumC14116l.f27598l);
        c13698lYandex.mo3668catch(EnumC17969l.TRACK, enumC14116l6);
        c13698lYandex.mo3668catch(EnumC17969l.TRACK_TOTAL, EnumC14116l.f27584l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_ARTIST_SITE, EnumC14116l.f27466l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_DISCOGS_RELEASE_SITE, EnumC14116l.f27560l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_LYRICS_SITE, EnumC14116l.f27554l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_ARTIST_SITE, EnumC14116l.f27541l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_OFFICIAL_RELEASE_SITE, EnumC14116l.f27586l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_ARTIST_SITE, EnumC14116l.f27592l);
        c13698lYandex.mo3668catch(EnumC17969l.URL_WIKIPEDIA_RELEASE_SITE, EnumC14116l.f27556l);
        c13698lYandex.mo3668catch(EnumC17969l.WORK, EnumC14116l.f27534l);
        c13698lYandex.mo3668catch(EnumC17969l.WORK_TYPE, EnumC14116l.f27511l);
        c13698lYandex.mo3668catch(EnumC17969l.YEAR, enumC14116l7);
        f2668l = c13698lYandex.metrica(true);
    }

    public C0966l(InterfaceC13280l interfaceC13280l) {
        this(true);
        Iterator itIsPro = interfaceC13280l.isPro();
        while (itIsPro.hasNext()) {
            InterfaceC4656l interfaceC4656lTapsense = tapsense((InterfaceC4656l) itIsPro.next());
            if (interfaceC4656lTapsense != null) {
                super.billing(interfaceC4656lTapsense);
            }
        }
    }

    public static EnumC14116l Signature(EnumC17969l enumC17969l) {
        EnumC14116l enumC14116l = (EnumC14116l) f2668l.get(enumC17969l);
        if (enumC14116l != null) {
            return enumC14116l;
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }

    @Override // defpackage.AbstractC11779l
    public final void billing(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l == null || !(interfaceC4656l instanceof C4357l) || interfaceC4656l.isEmpty()) {
            return;
        }
        EnumC14116l enumC14116lYandex = EnumC14116l.yandex(interfaceC4656l.getId());
        if (enumC14116lYandex == null || !enumC14116lYandex.f27615l) {
            super.remoteconfig(tapsense(interfaceC4656l));
        } else {
            super.billing(tapsense(interfaceC4656l));
        }
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        return ads(Signature(EnumC17969l.COVER_ART).f27616l);
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return ads(Signature(enumC17969l).f27616l).size() != 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        return subscription(Signature(enumC17969l).f27616l);
    }

    @Override // defpackage.AbstractC11779l, defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) {
        if (interfaceC4656l == null || !(interfaceC4656l instanceof C4357l) || interfaceC4656l.isEmpty()) {
            return;
        }
        super.remoteconfig(tapsense(interfaceC4656l));
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        byte[] bArr = abstractC5859l.yandex;
        int i = abstractC5859l.crashlytics;
        String strAmazon = abstractC5859l.loadAd;
        C5076l c5076l = new C5076l(new C12645l(EnumC14116l.f27597l.f27616l, 1));
        C12645l c12645l = c5076l.f8893l;
        c5076l.f11090l = "";
        int length = bArr.length;
        c5076l.f11089l = strAmazon;
        if (strAmazon == null && (strAmazon = AbstractC5484l.amazon(bArr)) == null) {
            C13975l c13975l = C5076l.f11088l;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            strAmazon = "image/png";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(AbstractC14375l.billing(bArr.length), 0, 4);
        try {
            byte[] bytes = strAmazon.getBytes(C4616l.mopub.name());
            byteArrayOutputStream.write(bytes, 0, bytes.length);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            IllegalArgumentException illegalArgumentExceptionYandex = c12645l.f24876l.yandex(c12645l.f24877l, byteArray, c12645l.f24874l);
            if (illegalArgumentExceptionYandex != null) {
                throw illegalArgumentExceptionYandex;
            }
            c12645l.f24875l = (byte[]) byteArray.clone();
            c12645l.f24874l = 1;
            return c5076l;
        } catch (UnsupportedEncodingException unused) {
            C8339l.isPro(C4616l.mopub.name(), "Unable to find encoding:");
            return null;
        }
    }

    public final InterfaceC4656l tapsense(InterfaceC4656l interfaceC4656l) {
        if (!this.f2669l) {
            return interfaceC4656l;
        }
        if (interfaceC4656l instanceof C4357l) {
            try {
                return (InterfaceC4656l) ((C4357l) interfaceC4656l).clone();
            } catch (CloneNotSupportedException unused) {
                return new C4357l(((C4357l) interfaceC4656l).f8893l);
            }
        }
        if (interfaceC4656l instanceof InterfaceC7988l) {
            return new C7874l(interfaceC4656l.getId(), ((InterfaceC7988l) interfaceC4656l).admob());
        }
        C8339l.isPro(interfaceC4656l.getClass(), "Unknown Asf Tag Field class:");
        return null;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return f2668l.keySet();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String[] strArr) {
        AbstractC6745l.loadAd(enumC17969l, "fieldKey");
        EnumC14116l enumC14116lSignature = Signature(enumC17969l);
        String str = (String) AbstractC6745l.amazon(strArr, "value");
        int iOrdinal = enumC14116lSignature.ordinal();
        if (iOrdinal == 5) {
            throw new C6451l("Banner Image cannot be created using this method", 18, (byte) 0);
        }
        if (iOrdinal != 37) {
            return new C7874l(enumC14116lSignature.f27616l, str);
        }
        throw new C6451l("Cover Art cannot be created using this method", 18, (byte) 0);
    }

    public C0966l(boolean z) {
        this.f2669l = z;
    }
}
