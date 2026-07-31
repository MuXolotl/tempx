package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lًٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8042l {
    public final /* synthetic */ int yandex;
    public static final C8042l loadAd = new C8042l(0);
    public static final C8042l crashlytics = new C8042l(1);
    public static final C8042l amazon = new C8042l(2);
    public static final C8042l purchase = new C8042l(3);
    public static final C8042l billing = new C8042l(4);
    public static final C8042l mopub = new C8042l(5);
    public static final C8042l admob = new C8042l(6);
    public static final C8042l subs = new C8042l(7);
    public static final C8042l isPro = new C8042l(8);
    public static final C8042l firebase = new C8042l(9);
    public static final C8042l smaato = new C8042l(10);
    public static final C8042l remoteconfig = new C8042l(11);
    public static final C8042l vip = new C8042l(12);
    public static final C8042l metrica = new C8042l(13);
    public static final C8042l startapp = new C8042l(14);
    public static final C8042l adcel = new C8042l(15);
    public static final C8042l ads = new C8042l(16);
    public static final C8042l subscription = new C8042l(17);
    public static final C8042l tapsense = new C8042l(18);
    public static final C8042l Signature = new C8042l(19);
    public static final C8042l license = new C8042l(20);
    public static final C8042l pro = new C8042l(21);
    public static final C8042l ad = new C8042l(22);
    public static final C8042l advert = new C8042l(23);
    public static final C8042l isVip = new C8042l(24);
    public static final C8042l signatures = new C8042l(25);
    public static final C8042l premium = new C8042l(26);
    public static final C8042l applovin = new C8042l(27);

    public /* synthetic */ C8042l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Code duplicated, block: B:758:0x0b9d  */
    private final boolean loadAd(int i) {
        EnumC5063l enumC5063l;
        EnumC5063l enumC5063l2 = EnumC5063l.PROVIDER_ANY;
        if (i != 0 && i != 0) {
            switch (i) {
                case 0:
                    enumC5063l = EnumC5063l.PROVIDER_ANY;
                    break;
                case 4416:
                    enumC5063l = EnumC5063l.PROVIDER_CENTRAL_EUROPEAN_DATA_AGENCY;
                    break;
                case 4417:
                    enumC5063l = EnumC5063l.PROVIDER_ANASAT;
                    break;
                case 4418:
                    enumC5063l = EnumC5063l.PROVIDER_MINED_POSTCODES;
                    break;
                case 4419:
                    enumC5063l = EnumC5063l.PROVIDER_DMAPAS;
                    break;
                case 4420:
                    enumC5063l = EnumC5063l.PROVIDER_COMMON_LOCALE_DATA_REPOSITORY;
                    break;
                case 4421:
                    enumC5063l = EnumC5063l.PROVIDER_CH_SBB;
                    break;
                case 4422:
                    enumC5063l = EnumC5063l.PROVIDER_SKENERGY;
                    break;
                case 4423:
                    enumC5063l = EnumC5063l.PROVIDER_GBRMPA;
                    break;
                case 4424:
                    enumC5063l = EnumC5063l.PROVIDER_KOREA_POST;
                    break;
                case 4425:
                    enumC5063l = EnumC5063l.PROVIDER_CN_AUTONAVI;
                    break;
                case 4426:
                    enumC5063l = EnumC5063l.PROVIDER_MINED_POI;
                    break;
                case 4427:
                    enumC5063l = EnumC5063l.PROVIDER_ML_INFOMAP;
                    break;
                case 4428:
                    enumC5063l = EnumC5063l.PROVIDER_SNOOPER;
                    break;
                case 4429:
                    enumC5063l = EnumC5063l.PROVIDER_GEOSISTEMAS;
                    break;
                case 4430:
                    enumC5063l = EnumC5063l.PROVIDER_AFRIGIS;
                    break;
                case 4431:
                    enumC5063l = EnumC5063l.PROVIDER_TRANSNAVICOM;
                    break;
                case 4432:
                    enumC5063l = EnumC5063l.PROVIDER_EASYCONNECT;
                    break;
                case 4433:
                    enumC5063l = EnumC5063l.PROVIDER_LANTMATERIET;
                    break;
                case 4434:
                    enumC5063l = EnumC5063l.PROVIDER_LOGICA;
                    break;
                case 4435:
                    enumC5063l = EnumC5063l.PROVIDER_MAPKING;
                    break;
                case 4436:
                    enumC5063l = EnumC5063l.PROVIDER_DIANPING;
                    break;
                case 4437:
                    enumC5063l = EnumC5063l.PROVIDER_GEONAV;
                    break;
                case 4438:
                    enumC5063l = EnumC5063l.PROVIDER_HEIBONSHA;
                    break;
                case 4439:
                    enumC5063l = EnumC5063l.PROVIDER_DEUTSCHE_TELEKOM;
                    break;
                case 4440:
                    enumC5063l = EnumC5063l.PROVIDER_LINGUISTIC_DATA_CONSORTIUM;
                    break;
                case 4441:
                    enumC5063l = EnumC5063l.PROVIDER_ACXIOM;
                    break;
                case 4442:
                    enumC5063l = EnumC5063l.PROVIDER_DUN_AND_BRADSTREET;
                    break;
                case 4443:
                    enumC5063l = EnumC5063l.PROVIDER_FEDERAL_AVIATION_ADMINISTRATION;
                    break;
                case 4444:
                    enumC5063l = EnumC5063l.PROVIDER_INFOUSA;
                    break;
                case 4445:
                    enumC5063l = EnumC5063l.PROVIDER_THOMSON_LOCAL;
                    break;
                case 4446:
                    enumC5063l = EnumC5063l.PROVIDER_TELEFONICA_PUBLICIDAD_E_INFORMACION;
                    break;
                case 4447:
                    enumC5063l = EnumC5063l.PROVIDER_WIKIPEDIA;
                    break;
                case 4448:
                    enumC5063l = EnumC5063l.PROVIDER_INFOBEL;
                    break;
                case 4449:
                    enumC5063l = EnumC5063l.PROVIDER_MX_GOVERNMENT;
                    break;
                case 4450:
                    enumC5063l = EnumC5063l.PROVIDER_TELEGATE;
                    break;
                case 4451:
                    enumC5063l = EnumC5063l.PROVIDER_TELELISTAS;
                    break;
                case 4452:
                    enumC5063l = EnumC5063l.PROVIDER_MAPCITY;
                    break;
                case 4453:
                    enumC5063l = EnumC5063l.PROVIDER_EXPLAINER_DC;
                    break;
                case 4454:
                    enumC5063l = EnumC5063l.PROVIDER_DAIKEI;
                    break;
                case 4455:
                    enumC5063l = EnumC5063l.PROVIDER_NL_CHAMBER_OF_COMMERCE;
                    break;
                case 4456:
                    enumC5063l = EnumC5063l.PROVIDER_KOREA_INFO_SERVICE;
                    break;
                case 4457:
                    enumC5063l = EnumC5063l.PROVIDER_WIKITRAVEL;
                    break;
                case 4458:
                    enumC5063l = EnumC5063l.PROVIDER_FLICKR;
                    break;
                case 4459:
                    enumC5063l = EnumC5063l.PROVIDER_DIANCO;
                    break;
                case 4460:
                    enumC5063l = EnumC5063l.PROVIDER_VOLT_DELTA;
                    break;
                case 4461:
                    enumC5063l = EnumC5063l.PROVIDER_SG_GOVERNMENT;
                    break;
                case 4462:
                    enumC5063l = EnumC5063l.PROVIDER_MAPBAR;
                    break;
                case 4463:
                    enumC5063l = EnumC5063l.PROVIDER_LONGTU;
                    break;
                case 4464:
                    enumC5063l = EnumC5063l.PROVIDER_SA_GOVERNMENT;
                    break;
                case 4465:
                    enumC5063l = EnumC5063l.PROVIDER_PEAKLIST;
                    break;
                case 4466:
                    enumC5063l = EnumC5063l.PROVIDER_LOCAL_BUSINESS_CENTER;
                    break;
                case 4467:
                    enumC5063l = EnumC5063l.PROVIDER_LOCAL_FEED_XML;
                    break;
                case 4468:
                    enumC5063l = EnumC5063l.PROVIDER_WEB;
                    break;
                case 4469:
                    enumC5063l = EnumC5063l.PROVIDER_RAILS_TO_TRAILS;
                    break;
                case 4470:
                    enumC5063l = EnumC5063l.PROVIDER_INDIACOM;
                    break;
                case 4471:
                    enumC5063l = EnumC5063l.PROVIDER_INFOMEDIA;
                    break;
                case 4472:
                    enumC5063l = EnumC5063l.PROVIDER_PICASA;
                    break;
                case 4473:
                    enumC5063l = EnumC5063l.PROVIDER_AT_GOVERNMENT;
                    break;
                case 4474:
                    enumC5063l = EnumC5063l.PROVIDER_NO_GOVERNMENT;
                    break;
                case 4475:
                    enumC5063l = EnumC5063l.PROVIDER_CH_GOVERNMENT;
                    break;
                case 4476:
                    enumC5063l = EnumC5063l.PROVIDER_NAVIT;
                    break;
                case 4477:
                    enumC5063l = EnumC5063l.PROVIDER_GEOSEARCH;
                    break;
                case 4478:
                    enumC5063l = EnumC5063l.PROVIDER_DE_GOVERNMENT;
                    break;
                case 4479:
                    enumC5063l = EnumC5063l.PROVIDER_SCHOBER_GROUP;
                    break;
                case 4480:
                    enumC5063l = EnumC5063l.PROVIDER_MIREO;
                    break;
                case 4481:
                    enumC5063l = EnumC5063l.PROVIDER_PUBLIC_MUNICIPALITY;
                    break;
                case 4482:
                    enumC5063l = EnumC5063l.PROVIDER_MAPCUBE;
                    break;
                case 4483:
                    enumC5063l = EnumC5063l.PROVIDER_3D_REALITYMAPS;
                    break;
                case 4484:
                    enumC5063l = EnumC5063l.PROVIDER_DEUTSCHES_ZENTRUM_FUR_LUFT_UND_RAUMFAHRT;
                    break;
                case 4485:
                    enumC5063l = EnumC5063l.PROVIDER_3D_CITIES_SOCIEDADE_ANONIMA;
                    break;
                case 4486:
                    enumC5063l = EnumC5063l.PROVIDER_DISNEY;
                    break;
                case 4487:
                    enumC5063l = EnumC5063l.PROVIDER_CYBERCITY;
                    break;
                case 4488:
                    enumC5063l = EnumC5063l.PROVIDER_PRECISION_LIGHTWORKS_MODELWORKS;
                    break;
                case 4489:
                    enumC5063l = EnumC5063l.PROVIDER_VIRTUAL_HUNGARY_LIMITED;
                    break;
                case 4490:
                    enumC5063l = EnumC5063l.PROVIDER_VIRTUEL_CITY;
                    break;
                case 4491:
                    enumC5063l = EnumC5063l.PROVIDER_SCREAMPOINT_INTERNATIONAL;
                    break;
                case 4492:
                    enumC5063l = EnumC5063l.PROVIDER_AGENTSCHAP_VOOR_GEOGRAFISCHE_INFORMATIE_VLAANDEREN;
                    break;
                case 4493:
                    enumC5063l = EnumC5063l.PROVIDER_FR_GOVERNMENT;
                    break;
                case 4494:
                    enumC5063l = EnumC5063l.PROVIDER_DIADIEM;
                    break;
                case 4495:
                    enumC5063l = EnumC5063l.PROVIDER_THE_WEATHER_CHANNEL;
                    break;
                case 4496:
                    enumC5063l = EnumC5063l.PROVIDER_COWI;
                    break;
                case 4497:
                    enumC5063l = EnumC5063l.PROVIDER_FALKPLAN_ANDES;
                    break;
                case 4498:
                    enumC5063l = EnumC5063l.PROVIDER_NL_GOVERNMENT;
                    break;
                case 4499:
                    enumC5063l = EnumC5063l.PROVIDER_DIGITAL_MAP_PRODUCTS;
                    break;
                case 4500:
                    enumC5063l = EnumC5063l.PROVIDER_SILICE_DIGITAL;
                    break;
                case 4501:
                    enumC5063l = EnumC5063l.PROVIDER_TYDAC;
                    break;
                case 4502:
                    enumC5063l = EnumC5063l.PROVIDER_ALBRECHT_GOLF;
                    break;
                case 4503:
                    enumC5063l = EnumC5063l.PROVIDER_HEALTH_CH;
                    break;
                case 4504:
                    enumC5063l = EnumC5063l.PROVIDER_VISITDENMARK;
                    break;
                case 4505:
                    enumC5063l = EnumC5063l.PROVIDER_FLYHERE;
                    break;
                case 4506:
                    enumC5063l = EnumC5063l.PROVIDER_DIGITAL_DATA_SERVICES;
                    break;
                case 4507:
                    enumC5063l = EnumC5063l.PROVIDER_MECOMO;
                    break;
                case 4508:
                    enumC5063l = EnumC5063l.PROVIDER_ZA_GOVERNMENT;
                    break;
                case 4509:
                    enumC5063l = EnumC5063l.PROVIDER_SENSIS;
                    break;
                case 4510:
                    enumC5063l = EnumC5063l.PROVIDER_JJCONNECT;
                    break;
                case 4511:
                    enumC5063l = EnumC5063l.PROVIDER_OPPLYSNINGEN;
                    break;
                case 4512:
                    enumC5063l = EnumC5063l.PROVIDER_TELLUS;
                    break;
                case 4513:
                    enumC5063l = EnumC5063l.PROVIDER_IQONIA;
                    break;
                case 4514:
                    enumC5063l = EnumC5063l.PROVIDER_BE_GOVERNMENT;
                    break;
                case 4515:
                    enumC5063l = EnumC5063l.PROVIDER_YELLOWMAP_AG;
                    break;
                case 4516:
                    enumC5063l = EnumC5063l.PROVIDER_STIFTUNG_GESUNDHEIT;
                    break;
                case 4517:
                    enumC5063l = EnumC5063l.PROVIDER_GIATA;
                    break;
                case 4518:
                    enumC5063l = EnumC5063l.PROVIDER_SANPARKS;
                    break;
                case 4519:
                    enumC5063l = EnumC5063l.PROVIDER_CENTRE_DINFORMATIQUE_POUR_LA_REGION_BRUXELLOISE;
                    break;
                case 4520:
                    enumC5063l = EnumC5063l.PROVIDER_INFOPORTUGAL;
                    break;
                case 4521:
                    enumC5063l = EnumC5063l.PROVIDER_NEGOCIOS_DE_TELECOMUNICACOES_E_SISTEMAS_DE_INFORMACAO;
                    break;
                case 4522:
                    enumC5063l = EnumC5063l.PROVIDER_COLLINS_BARTHOLOMEW;
                    break;
                case 4523:
                    enumC5063l = EnumC5063l.PROVIDER_PROTECT_PLANET_OCEAN;
                    break;
                case 4524:
                    enumC5063l = EnumC5063l.PROVIDER_KARTTAKESKUS;
                    break;
                case 4525:
                    enumC5063l = EnumC5063l.PROVIDER_FI_GOVERNMENT;
                    break;
                case 4526:
                    enumC5063l = EnumC5063l.PROVIDER_GB_GOVERNMENT;
                    break;
                case 4527:
                    enumC5063l = EnumC5063l.PROVIDER_EPSILON;
                    break;
                case 4528:
                    enumC5063l = EnumC5063l.PROVIDER_PARTNER_FRONT_END;
                    break;
                case 4529:
                    enumC5063l = EnumC5063l.PROVIDER_CARTESIA;
                    break;
                case 4530:
                    enumC5063l = EnumC5063l.PROVIDER_SE_GOVERNMENT;
                    break;
                case 4531:
                    enumC5063l = EnumC5063l.PROVIDER_IE_GOVERNMENT;
                    break;
                case 4532:
                    enumC5063l = EnumC5063l.PROVIDER_LU_GOVERNMENT;
                    break;
                case 4533:
                    enumC5063l = EnumC5063l.PROVIDER_MAPFLOW;
                    break;
                case 4534:
                    enumC5063l = EnumC5063l.PROVIDER_TKARTOR;
                    break;
                case 4535:
                    enumC5063l = EnumC5063l.PROVIDER_JUMPSTART;
                    break;
                case 4536:
                    enumC5063l = EnumC5063l.PROVIDER_EPTISA;
                    break;
                case 4537:
                    enumC5063l = EnumC5063l.PROVIDER_MC_GOVERNMENT;
                    break;
                case 4538:
                    enumC5063l = EnumC5063l.PROVIDER_MONOLIT;
                    break;
                case 4539:
                    enumC5063l = EnumC5063l.PROVIDER_ENVIRONMENTAL_SYSTEMS_RESEARCH_INSTITUTE;
                    break;
                case 4540:
                    enumC5063l = EnumC5063l.PROVIDER_MODIS;
                    break;
                case 4541:
                    enumC5063l = EnumC5063l.PROVIDER_GEOX;
                    break;
                case 4542:
                    enumC5063l = EnumC5063l.PROVIDER_GEODIRECTORY;
                    break;
                case 4543:
                    enumC5063l = EnumC5063l.PROVIDER_GEOPLAN;
                    break;
                case 4544:
                    enumC5063l = EnumC5063l.PROVIDER_INFODIREKT;
                    break;
                case 4545:
                    enumC5063l = EnumC5063l.PROVIDER_GEOGLOBAL;
                    break;
                case 4546:
                    enumC5063l = EnumC5063l.PROVIDER_DEUTSCHE_POST;
                    break;
                case 4547:
                    enumC5063l = EnumC5063l.PROVIDER_TRACASA;
                    break;
                case 4548:
                    enumC5063l = EnumC5063l.PROVIDER_CORREOS;
                    break;
                case 4549:
                    enumC5063l = EnumC5063l.PROVIDER_ES_GOVERNMENT;
                    break;
                case 4550:
                    enumC5063l = EnumC5063l.PROVIDER_EDIMAP;
                    break;
                case 4551:
                    enumC5063l = EnumC5063l.PROVIDER_VERIZON;
                    break;
                case 4552:
                    enumC5063l = EnumC5063l.PROVIDER_NATIONAL_GEOGRAPHIC_MAPS;
                    break;
                case 4553:
                    enumC5063l = EnumC5063l.PROVIDER_PROMAPS;
                    break;
                case 4554:
                    enumC5063l = EnumC5063l.PROVIDER_CONSODATA;
                    break;
                case 4555:
                    enumC5063l = EnumC5063l.PROVIDER_DE_AGOSTINI;
                    break;
                case 4556:
                    enumC5063l = EnumC5063l.PROVIDER_FEDERPARCHI;
                    break;
                case 4557:
                    enumC5063l = EnumC5063l.PROVIDER_NAVIGO;
                    break;
                case 4558:
                    enumC5063l = EnumC5063l.PROVIDER_ITALIAMAPPE;
                    break;
                case 4559:
                    enumC5063l = EnumC5063l.PROVIDER_CZECOT;
                    break;
                case 4560:
                    enumC5063l = EnumC5063l.PROVIDER_NATURAL_EARTH;
                    break;
                case 4561:
                    enumC5063l = EnumC5063l.PROVIDER_REGIO;
                    break;
                case 4562:
                    enumC5063l = EnumC5063l.PROVIDER_SHIPWRECK_CENTRAL;
                    break;
                case 4563:
                    enumC5063l = EnumC5063l.PROVIDER_RUTGERS_STATE_UNIVERSITY;
                    break;
                case 4564:
                    enumC5063l = EnumC5063l.PROVIDER_TWINICE;
                    break;
                case 4565:
                    enumC5063l = EnumC5063l.PROVIDER_NORTHERN_IRELAND_TOURIST_BOARD;
                    break;
                case 4566:
                    enumC5063l = EnumC5063l.PROVIDER_INFOGROUP;
                    break;
                case 4567:
                    enumC5063l = EnumC5063l.PROVIDER_TNET;
                    break;
                case 4568:
                    enumC5063l = EnumC5063l.PROVIDER_CTT_CORREIOS_DE_PORTUGAL;
                    break;
                case 4569:
                    enumC5063l = EnumC5063l.PROVIDER_EUROPARC;
                    break;
                case 4570:
                    enumC5063l = EnumC5063l.PROVIDER_IUPPITER;
                    break;
                case 4571:
                    enumC5063l = EnumC5063l.PROVIDER_MICHAEL_BAUER_INTERNATIONAL;
                    break;
                case 4572:
                    enumC5063l = EnumC5063l.PROVIDER_LEPTON;
                    break;
                case 4573:
                    enumC5063l = EnumC5063l.PROVIDER_MAPPOINT;
                    break;
                case 4574:
                    enumC5063l = EnumC5063l.PROVIDER_GEODATA;
                    break;
                case 4575:
                    enumC5063l = EnumC5063l.PROVIDER_RU_GOVERNMENT;
                    break;
                case 4576:
                    enumC5063l = EnumC5063l.PROVIDER_BR_GOVERNMENT;
                    break;
                case 4577:
                    enumC5063l = EnumC5063l.PROVIDER_AZAVEA;
                    break;
                case 4578:
                    enumC5063l = EnumC5063l.PROVIDER_NORTHSTAR;
                    break;
                case 4579:
                    enumC5063l = EnumC5063l.PROVIDER_COMMEDI;
                    break;
                case 4580:
                    enumC5063l = EnumC5063l.PROVIDER_NEXUS_GEOGRAFICS;
                    break;
                case 4581:
                    enumC5063l = EnumC5063l.PROVIDER_INFOERA;
                    break;
                case 4582:
                    enumC5063l = EnumC5063l.PROVIDER_AD_GOVERNMENT;
                    break;
                case 4583:
                    enumC5063l = EnumC5063l.PROVIDER_MAXXIMA;
                    break;
                case 4584:
                    enumC5063l = EnumC5063l.PROVIDER_SI_GOVERNMENT;
                    break;
                case 4585:
                    enumC5063l = EnumC5063l.PROVIDER_TRANSPORT_HI_TECH_CONSULTANTS;
                    break;
                case 4586:
                    enumC5063l = EnumC5063l.PROVIDER_L1_TECHNOLOGIES;
                    break;
                case 4587:
                    enumC5063l = EnumC5063l.PROVIDER_TELEMEDIA;
                    break;
                case 4588:
                    enumC5063l = EnumC5063l.PROVIDER_CDCOM_PROGOROD;
                    break;
                case 4589:
                    enumC5063l = EnumC5063l.PROVIDER_MIT_CITYGUIDE;
                    break;
                case 4590:
                    enumC5063l = EnumC5063l.PROVIDER_SUNCART;
                    break;
                case 4591:
                    enumC5063l = EnumC5063l.PROVIDER_MICROMAPPER;
                    break;
                case 4592:
                    enumC5063l = EnumC5063l.PROVIDER_RICHI;
                    break;
                case 4593:
                    enumC5063l = EnumC5063l.PROVIDER_FORUM44;
                    break;
                case 4594:
                    enumC5063l = EnumC5063l.PROVIDER_SEAT;
                    break;
                case 4595:
                    enumC5063l = EnumC5063l.PROVIDER_VALASSIS;
                    break;
                case 4596:
                    enumC5063l = EnumC5063l.PROVIDER_NAVICOM;
                    break;
                case 4597:
                    enumC5063l = EnumC5063l.PROVIDER_COLTRACK;
                    break;
                case 4598:
                    enumC5063l = EnumC5063l.PROVIDER_PSMA_AUSTRALIA;
                    break;
                case 4599:
                    enumC5063l = EnumC5063l.PROVIDER_PT_DUTA_ASTAKONA_GIRINDA;
                    break;
                case 4600:
                    enumC5063l = EnumC5063l.PROVIDER_CA_GOVERNMENT;
                    break;
                case 4601:
                    enumC5063l = EnumC5063l.PROVIDER_TOCTOC;
                    break;
                case 4602:
                    enumC5063l = EnumC5063l.PROVIDER_RMSI;
                    break;
                case 4603:
                    enumC5063l = EnumC5063l.PROVIDER_TRUE_TECHNOLOGY;
                    break;
                case 4604:
                    enumC5063l = EnumC5063l.PROVIDER_INCREMENT_P_CORPORATION;
                    break;
                case 4605:
                    enumC5063l = EnumC5063l.PROVIDER_GOJAVAS;
                    break;
                case 4606:
                    enumC5063l = EnumC5063l.PROVIDER_GEOINFORMATION_GROUP;
                    break;
                case 4607:
                    enumC5063l = EnumC5063l.PROVIDER_CYBERSOFT;
                    break;
                case 4608:
                    enumC5063l = EnumC5063l.PROVIDER_TSENTR_EFFEKTIVNYKH_TEKHNOLOGIY;
                    break;
                case 4609:
                    enumC5063l = EnumC5063l.PROVIDER_EE_GOVERNMENT;
                    break;
                case 4610:
                    enumC5063l = EnumC5063l.PROVIDER_GASBUDDY;
                    break;
                case 4611:
                    enumC5063l = EnumC5063l.PROVIDER_DK_GOVERNMENT;
                    break;
                case 71105:
                    enumC5063l = EnumC5063l.PROVIDER_INFOUSA_NIXIE;
                    break;
                case 71377:
                    enumC5063l = EnumC5063l.PROVIDER_SG_LAND_TRANSPORT_AUTHORITY;
                    break;
                case 71425:
                    enumC5063l = EnumC5063l.PROVIDER_SA_SAUDI_POST;
                    break;
                case 72129:
                    enumC5063l = EnumC5063l.PROVIDER_ZA_RURAL_DEVELOPMENT_LAND_REFORM;
                    break;
                case 72481:
                    enumC5063l = EnumC5063l.PROVIDER_SE_TRAFIKVERKET;
                    break;
                case 72482:
                    enumC5063l = EnumC5063l.PROVIDER_SE_NATURVARDSVERKET;
                    break;
                case 72497:
                    enumC5063l = EnumC5063l.PROVIDER_IE_ORDNANCE_SURVEY_IRELAND;
                    break;
                case 72513:
                    enumC5063l = EnumC5063l.PROVIDER_LU_P_AND_T_LUXEMBOURG;
                    break;
                case 72514:
                    enumC5063l = EnumC5063l.PROVIDER_LU_ADMINISTRATION_DU_CADASTRE_ET_DE_LA_TOPOGRAPHIE;
                    break;
                case 72515:
                    enumC5063l = EnumC5063l.PROVIDER_LU_NATIONAL_TOURIST_OFFICE;
                    break;
                case 72593:
                    enumC5063l = EnumC5063l.PROVIDER_MC_PRINCIPAUTE_DE_MONACO;
                    break;
                case 72785:
                    enumC5063l = EnumC5063l.PROVIDER_ES_CENTRO_NACIONAL_DE_INFORMACION_GEOGRAFICA;
                    break;
                case 73201:
                    enumC5063l = EnumC5063l.PROVIDER_RU_FNS_KLADR;
                    break;
                case 73217:
                    enumC5063l = EnumC5063l.PROVIDER_BR_INSTITUTO_BRASILEIRO_DO_MEIO_AMBIENTE_E_DOS_RECURSOS_NATURAIS_RENOVAVEIS;
                    break;
                case 73218:
                    enumC5063l = EnumC5063l.PROVIDER_BR_MINISTERIO_DO_MEIO_AMBIENTE;
                    break;
                case 73219:
                    enumC5063l = EnumC5063l.PROVIDER_BR_AGENCIA_NACIONAL_DE_AGUAS;
                    break;
                case 73220:
                    enumC5063l = EnumC5063l.PROVIDER_BR_INSTITUTO_BRASILEIRO_DE_GEOGRAFIA_E_ESTATISTICA;
                    break;
                case 73221:
                    enumC5063l = EnumC5063l.PROVIDER_BR_FUNDACAO_NACIONAL_DO_INDIO;
                    break;
                case 73222:
                    enumC5063l = EnumC5063l.PROVIDER_BR_DEPARTAMENTO_NACIONAL_DE_INFRAESTRUTURA_DE_TRANSPORTES;
                    break;
                case 73313:
                    enumC5063l = EnumC5063l.PROVIDER_AD_AREA_DE_CARTOGRAFIA;
                    break;
                case 73345:
                    enumC5063l = EnumC5063l.PROVIDER_SI_AGENCY_FOR_ENVIRONMENT;
                    break;
                case 73601:
                    enumC5063l = EnumC5063l.PROVIDER_STATISTICS_CANADA;
                    break;
                case 73745:
                    enumC5063l = EnumC5063l.PROVIDER_EE_MAA_AMET;
                    break;
                case 73777:
                    enumC5063l = EnumC5063l.PROVIDER_DK_GEODATASTYRELSEN;
                    break;
                case 73905:
                    enumC5063l = EnumC5063l.PROVIDER_TW_MINISTRY_OF_THE_INTERIOR_SURVEYING_AND_MAPPING_CENTER;
                    break;
                case 74049:
                    enumC5063l = EnumC5063l.PROVIDER_ISTITUTO_GEOGRAFICO_MILITARE;
                    break;
                case 74353:
                    enumC5063l = EnumC5063l.PROVIDER_KR_MOLIT;
                    break;
                case 74354:
                    enumC5063l = EnumC5063l.PROVIDER_KR_MINISTRY_OF_THE_INTERIOR_AND_SAFETY;
                    break;
                case 74545:
                    enumC5063l = EnumC5063l.PROVIDER_JP_MINISTRY_OF_THE_ENVIRONMENT;
                    break;
                case 74897:
                    enumC5063l = EnumC5063l.PROVIDER_NZ_LINZ;
                    break;
                case 74898:
                    enumC5063l = EnumC5063l.PROVIDER_NZ_DOC;
                    break;
                case 75297:
                    enumC5063l = EnumC5063l.PROVIDER_SURVEY_OF_INDIA;
                    break;
                case 75530:
                    enumC5063l = EnumC5063l.PROVIDER_ZEST;
                    break;
                case 75531:
                    enumC5063l = EnumC5063l.PROVIDER_EZVOLT;
                    break;
                case 75532:
                    enumC5063l = EnumC5063l.PROVIDER_JOLT;
                    break;
                case 75533:
                    enumC5063l = EnumC5063l.PROVIDER_CHARGESMITH;
                    break;
                case 75534:
                    enumC5063l = EnumC5063l.PROVIDER_PLUGO;
                    break;
                case 1120225:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_BASEMAP_UPLOAD;
                    break;
                case 1120241:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ADSDB;
                    break;
                case 1120242:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MACHINE_TRANSLITERATION;
                    break;
                case 1120243:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_TRAVELSEARCH;
                    break;
                case 1120244:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PANORAMIO;
                    break;
                case 1120245:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_YOUTUBE;
                    break;
                case 1120246:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_OLD;
                    break;
                case 1120247:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_STREETVIEW;
                    break;
                case 1120248:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ZIPIT;
                    break;
                case 1120249:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_OYSTER_CONNECT_ROUTES;
                    break;
                case 1120250:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GOLDEN;
                    break;
                case 1120251:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_INNERSPACE;
                    break;
                case 1120252:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPSEARCH;
                    break;
                case 1120253:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CATEGORIES_TEAM;
                    break;
                case 1120254:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDSENSUS;
                    break;
                case 1123121:
                    enumC5063l = EnumC5063l.PROVIDER_US_GNIS;
                    break;
                case 1123122:
                    enumC5063l = EnumC5063l.PROVIDER_US_LANDSAT;
                    break;
                case 1123137:
                    enumC5063l = EnumC5063l.PROVIDER_US_NGA_GNS;
                    break;
                case 1147153:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_WEBSTER_TEXAS;
                    break;
                case 1147154:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_AMHERST_MASSACHUSETTS;
                    break;
                case 1147155:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_BLOOMINGTON_INDIANA;
                    break;
                case 1147156:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_PASADENA_CALIFORNIA;
                    break;
                case 1147157:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_CHULA_VISTA_CALIFORNIA;
                    break;
                case 1147158:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_TEMPE_ARIZONA;
                    break;
                case 1147159:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_COLUMBUS_OHIO;
                    break;
                case 1147160:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_PORTAGE_MICHIGAN;
                    break;
                case 1147161:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_GEORGETOWN_KENTUCKY;
                    break;
                case 1147162:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_GREENVILLE_SOUTH_CAROLINA;
                    break;
                case 1147163:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_NASHVILLE_TENNESSEE;
                    break;
                case 1147164:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_WASHINGTON_DISTRICT_OF_COLUMBIA;
                    break;
                case 1147165:
                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY_BOULDER_COLORADO;
                    break;
                case 1147169:
                    enumC5063l = EnumC5063l.PROVIDER_NZ_PUBLIC_MUNICIPALITY_ENVIRONMENT_BAY;
                    break;
                case 1147185:
                    enumC5063l = EnumC5063l.PROVIDER_PL_PUBLIC_MUNICIPALITY_BIELSKO_BIALA;
                    break;
                case 1147201:
                    enumC5063l = EnumC5063l.PROVIDER_DE_PUBLIC_MUNICIPALITY_FRANKFURT;
                    break;
                case 1147202:
                    enumC5063l = EnumC5063l.PROVIDER_DE_PUBLIC_MUNICIPALITY_HAMBURG;
                    break;
                case 1147203:
                    enumC5063l = EnumC5063l.PROVIDER_DE_PUBLIC_MUNICIPALITY_KARLSRUHE;
                    break;
                case 1147217:
                    enumC5063l = EnumC5063l.PROVIDER_PT_PUBLIC_MUNICIPALITY_SANTA_CRUZ;
                    break;
                case 1147233:
                    enumC5063l = EnumC5063l.PROVIDER_AT_PUBLIC_MUNICIPALITY_KLAGENFURT;
                    break;
                case 1147234:
                    enumC5063l = EnumC5063l.PROVIDER_AT_PUBLIC_MUNICIPALITY_LINZ;
                    break;
                case 1147249:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_AZKOITIA;
                    break;
                case 1147250:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_BEASAIN;
                    break;
                case 1147251:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_GIRONA;
                    break;
                case 1147252:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_SAN_SEBASTIAN;
                    break;
                case 1147253:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_CATALUNYA;
                    break;
                case 1147254:
                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY_HONDARRIBIA;
                    break;
                case 1147265:
                    enumC5063l = EnumC5063l.PROVIDER_AU_PUBLIC_MUNICIPALITY_LAUNCESTON_TASMANIA;
                    break;
                case 1147281:
                    enumC5063l = EnumC5063l.PROVIDER_IS_PUBLIC_MUNICIPALITY_REYKJAVIK;
                    break;
                case 1147297:
                    enumC5063l = EnumC5063l.PROVIDER_NL_PUBLIC_MUNICIPALITY_AMELSTEVEEN;
                    break;
                case 1147313:
                    enumC5063l = EnumC5063l.PROVIDER_BE_PUBLIC_MUNICIPALITY_ANTWERPEN;
                    break;
                case 1147329:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_FREDERICTON_NEW_BRUNSWICK;
                    break;
                case 1147330:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_KAMLOOPS_BRITISH_COLUMBIA;
                    break;
                case 1147331:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_NANAIMO_BRITISH_COLUMBIA;
                    break;
                case 1147332:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_BANFF_ALBERTA;
                    break;
                case 1147333:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_CALGARY_ALBERTA;
                    break;
                case 1147334:
                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY_TORONTO_ONTARIO;
                    break;
                case 1147345:
                    enumC5063l = EnumC5063l.PROVIDER_SE_PUBLIC_MUNICIPALITY_UMEA;
                    break;
                case 1147361:
                    enumC5063l = EnumC5063l.PROVIDER_UA_PUBLIC_MUNICIPALITY_KHARKIV;
                    break;
                case 1147377:
                    enumC5063l = EnumC5063l.PROVIDER_OTHER_PUBLIC_MUNICIPALITY;
                    break;
                case 1147378:
                    enumC5063l = EnumC5063l.PROVIDER_FR_PUBLIC_MUNICIPALITY;
                    break;
                case 1147379:
                    enumC5063l = EnumC5063l.PROVIDER_SG_PUBLIC_MUNICIPALITY;
                    break;
                case 1147380:
                    enumC5063l = EnumC5063l.PROVIDER_BR_PUBLIC_MUNICIPALITY;
                    break;
                case 17923953:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_STREETVIEW_BIZVIEW;
                    break;
                case 17924081:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_ALGORITHMIC_IDENTITY;
                    break;
                case 17924082:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FREEBASE;
                    break;
                case 17924083:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HOTELADS;
                    break;
                case 17924084:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_AUTHORITY_PAGES;
                    break;
                case 17924085:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PLACES_API;
                    break;
                case 17924086:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_NAMEHEATMAP;
                    break;
                case 17924087:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPMAKER;
                    break;
                case 17924088:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_CLUSTERING_OPERATOR_OVERRIDE;
                    break;
                case 17924089:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SERVED_ON_MAPMAKER;
                    break;
                case 17924090:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_LOCAL;
                    break;
                case 17924091:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOGS_RANKING_SIGNALS;
                    break;
                case 17924092:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ENTITY_NAVBOOST;
                    break;
                case 17924093:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RELATED_PLACES;
                    break;
                case 17924094:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_KNOWN_FOR_TERMS;
                    break;
                case 18358033:
                    enumC5063l = EnumC5063l.PROVIDER_OTHER_PUBLIC_MUNICIPALITY_AQUA_CALIENTE_CAHUILLA_INDIANS;
                    break;
                case 18358049:
                    enumC5063l = EnumC5063l.PROVIDER_FR_PUBLIC_MUNICIPALITY_PONT_AUDEMER;
                    break;
                case 18358050:
                    enumC5063l = EnumC5063l.PROVIDER_FR_PUBLIC_MUNICIPALITY_BORDEAUX;
                    break;
                case 18358081:
                    enumC5063l = EnumC5063l.PROVIDER_BR_PUBLIC_MUNICIPALITY_RIO_DE_JANEIRO;
                    break;
                case 286732289:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_FUSION;
                    break;
                case 286732290:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ZAGAT_CMS;
                    break;
                case 286732291:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PLACE_NAVBOOST;
                    break;
                case 286732292:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FOOTPRINT;
                    break;
                case 286732293:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PRODUCT_TERMS;
                    break;
                case 286732294:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_POINTCARDS;
                    break;
                case 286732295:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BUSINESS_CHAINS;
                    break;
                case 286732296:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_SUMMARIZATION;
                    break;
                case 286732297:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PRONUNCIATIONS;
                    break;
                case 286732298:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DUMPLING;
                    break;
                case 286732299:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DISTILLERY;
                    break;
                case 286732300:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_ATTRIBUTE_SUMMARIZATION;
                    break;
                case 286732301:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RELATION_MINER;
                    break;
                case 286732302:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPSPAM;
                    break;
                case 286732303:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ROSE;
                    break;
                case 286732304:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_PLACE_RATINGS;
                    break;
                case 286732305:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_WIPEOUT;
                    break;
                case 286732306:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_KNOWLEDGE_GRAPH;
                    break;
                case 286732307:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BEEGEES;
                    break;
                case 286732308:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_REVIEW_SUMMARIZATION;
                    break;
                case 286732309:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_OFFLINE_NON_CORE_ATTRIBUTE_SUMMARIZATION;
                    break;
                case 286732310:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_WORLDMAPS;
                    break;
                case 286732311:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_MODERATION;
                    break;
                case 286732312:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_OYSTER_AUTO_EDITS;
                    break;
                case 286732313:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_ALCHEMY;
                    break;
                case 286732314:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_KEROUAC;
                    break;
                case 286732315:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MOBRANK;
                    break;
                case 286732316:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RAPTURE;
                    break;
                case 286732317:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CULTURAL_INSTITUTE;
                    break;
                case 286732318:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEOCODES_FROM_LOCAL_FEEDS;
                    break;
                case 286732319:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ATTRIBUTES_FROM_CRAWLED_CHAINS;
                    break;
                case 286732320:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_TACTILE_MAPS;
                    break;
                case 286732321:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPS_FOR_MOBILE;
                    break;
                case 286732322:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_REALTIME;
                    break;
                case 286732323:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PROMINENT_PLACES;
                    break;
                case 286732324:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PLACE_ACTIONS;
                    break;
                case 286732325:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_AUTO_EDITS;
                    break;
                case 286732326:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_WAZE;
                    break;
                case 286732327:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ONTHEGO;
                    break;
                case 286732328:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_IMPORT;
                    break;
                case 286732329:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_STRUCTURED_DATA;
                    break;
                case 286732330:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HELICOPTER;
                    break;
                case 286732331:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ROLLBACK;
                    break;
                case 286732332:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RIGHTS_REPAIR;
                    break;
                case 286732333:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PERFUME;
                    break;
                case 286732334:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPS_TRANSLATION;
                    break;
                case 286732335:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CALL_ME_MAYBE;
                    break;
                case 286732336:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_UNIVERSAL;
                    break;
                case 286732337:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROUPIER;
                    break;
                case 286732338:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SKYSMART;
                    break;
                case 286732339:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RIDDLER;
                    break;
                case 286732340:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ROADCLOSURES;
                    break;
                case 286732341:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SPORE;
                    break;
                case 286732342:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCALIZATION;
                    break;
                case 286732343:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CATTERMS;
                    break;
                case 286732344:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_FIELD_OPS;
                    break;
                case 286732345:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MATCHMAKER;
                    break;
                case 286732346:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ARBITRATION;
                    break;
                case 286732347:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BIZBUILDER_OPS;
                    break;
                case 286732348:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_INVENTORY_ADS;
                    break;
                case 286732349:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_DRAFTY;
                    break;
                case 286732350:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HOTELADS_OPS;
                    break;
                case 286732351:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MARKERS;
                    break;
                case 286732352:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_STATE_MACHINE;
                    break;
                case 286732353:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ATTRIBUTES_INFERENCE;
                    break;
                case 286732354:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BIKESHARE;
                    break;
                case 286732355:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GHOSTWRITER;
                    break;
                case 286732356:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_EDIT_PLATFORM;
                    break;
                case 286732357:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BLUE_GINGER;
                    break;
                case 286732358:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_TIGER;
                    break;
                case 286732359:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HYADES;
                    break;
                case 286732360:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_WEBQUARRY;
                    break;
                case 286732361:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_MADDEN;
                    break;
                case 286732362:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ANDROID_PAY;
                    break;
                case 286732363:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_OPENING_HOURS_TEAM;
                    break;
                case 286732364:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_DISCOVERY;
                    break;
                case 286732365:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_HEALTH;
                    break;
                case 286732366:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_UGC_MAPS;
                    break;
                case 286732367:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FIBER;
                    break;
                case 286732368:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_REVGEO;
                    break;
                case 286732369:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HOTELADS_PARTNER_FRONT_END;
                    break;
                case 286732370:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_UGC_TASKS;
                    break;
                case 286732371:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEOCODING;
                    break;
                case 286732372:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SPYGLASS;
                    break;
                case 286732373:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PLUS_CODES_AS_ADDRESSES;
                    break;
                case 286732374:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_CHANGES;
                    break;
                case 286732375:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HUME;
                    break;
                case 286732376:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MEGAMIND;
                    break;
                case 286732377:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_ROADSYNTH;
                    break;
                case 286732378:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FIREBOLT;
                    break;
                case 286732384:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_PLACE_OFFERINGS;
                    break;
                case 286732385:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_UGC_SERVICES;
                    break;
                case 286732386:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEOALIGN;
                    break;
                case 286732387:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_COMPOUNDS;
                    break;
                case 286732388:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FOOD_ORDERING;
                    break;
                case 286732389:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HOTEL_KNOWLEDGE_OPS;
                    break;
                case 286732391:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_URAW;
                    break;
                case 286732392:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FLYEYE;
                    break;
                case 286732393:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_YOUKE;
                    break;
                case 286732394:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_ZEPHYR;
                    break;
                case 286732395:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_USER_SAFETY;
                    break;
                case 286732396:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ADDRESS_MAKER;
                    break;
                case 286732397:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_UGC_PHOTOS;
                    break;
                case 286732398:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_WINDCHIME;
                    break;
                case 286732399:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SNAG_FIXER;
                    break;
                case 286732400:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_DEALS;
                    break;
                case 286732401:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_PLACE_TOPICS;
                    break;
                case 286732402:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PROPERTY_INSIGHTS;
                    break;
                case 286732403:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_CONSUMER_MERCHANT_EXPERIMENTS;
                    break;
                case 286732404:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_PORTKEY;
                    break;
                case 286732405:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ROAD_MAPPER;
                    break;
                case 286732406:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCATION_PLATFORM;
                    break;
                case 286732407:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_POSTTRIP;
                    break;
                case 286732408:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_TRAVEL_DESTINATION;
                    break;
                case 286732409:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_DATA_UPLOAD;
                    break;
                case 286732410:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BIZBUILDER_CLEANUP;
                    break;
                case 286732411:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_USER;
                    break;
                case 286732412:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_STATION;
                    break;
                case 286732413:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_FOOD;
                    break;
                case 286732414:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_AR;
                    break;
                case 286732415:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_TEMPORAL;
                    break;
                case 286732416:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SERVICES_MARKETPLACE;
                    break;
                case 286732417:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_IMT_CLEANUP;
                    break;
                case 286732418:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_FOOD_MENU;
                    break;
                case 286732419:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CARENAV;
                    break;
                case 286732420:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DRIVING_FEEDS;
                    break;
                case 286732421:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DRIVING_UGC;
                    break;
                case 286732422:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_POLAR;
                    break;
                case 286732423:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_TRIWILD;
                    break;
                case 286732424:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWD_COMPUTE_OPS;
                    break;
                case 286732425:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_WEB;
                    break;
                case 286732426:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_POI_ALIGNMENT;
                    break;
                case 286732427:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_HULK;
                    break;
                case 286732428:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SERVICES_INTERACTIONS;
                    break;
                case 286732429:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ROADS_UGC_EDITOR;
                    break;
                case 286732430:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_NG_INFERENCE;
                    break;
                case 286732431:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_DRIVING_VIZ;
                    break;
                case 286732432:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_TASKING;
                    break;
                case 286732433:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDTASK_DATACOMPUTE;
                    break;
                case 286732434:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDTASK_TASKADS;
                    break;
                case 286732435:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDTASK_TASKMATE;
                    break;
                case 286732436:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDTASK_FURBALL;
                    break;
                case 286732437:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROWDTASK_ADAP;
                    break;
                case 286732438:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GPAY;
                    break;
                case 286732439:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_UGC_TRUSTED_USERS;
                    break;
                case 286732440:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_THIRD_PARTY_DATA_PRODUCTION;
                    break;
                case 286732441:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEOTRACKER;
                    break;
                case 286732442:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_LANDMARK_INFERENCE;
                    break;
                case 286732443:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_CLOSED_LOOP;
                    break;
                case 286732444:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_MERCHANT_POSTS;
                    break;
                case 286732445:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CORE_DATA_RIGHTS;
                    break;
                case 286732446:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_USER_REVIEWS;
                    break;
                case 286732447:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_CONTENT_FIXER;
                    break;
                case 286732448:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_POLYGON_REFINEMENT;
                    break;
                case 286732449:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HANASU;
                    break;
                case 286732450:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FULLRIGHTS_GEO_DATA_UPLOAD;
                    break;
                case 286732451:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FULLRIGHTS_3P_OUTREACH_UPLOAD;
                    break;
                case 286732452:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ATTRIBUTION_3P_OUTREACH_UPLOAD;
                    break;
                case 286732453:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_FROM_FOOD_MENUS;
                    break;
                case 286732454:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_CONSISTENCY_EDITS;
                    break;
                case 286732455:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SA_QUALITY;
                    break;
                case 286732456:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GDCE_CLEANUP;
                    break;
                case 286732457:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_UGC_QUALITY_CHAINS;
                    break;
                case 286732458:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_ATTRIBUTES_DISCOVERY;
                    break;
                case 286732459:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_LDE;
                    break;
                case 286732460:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_SIGNAL_TRACKING;
                    break;
                case 286732461:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_UGC_AGGREGATION;
                    break;
                case 286732462:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_3D_BASEMAP;
                    break;
                case 286732463:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPFACTS_PRIVACY;
                    break;
                case 286732464:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_ALF;
                    break;
                case 286732465:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_OPERATOR_PROVENANCE;
                    break;
                case 286732466:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_SERVICES_ADS;
                    break;
                case 286732467:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_LANE_AUTOMATION;
                    break;
                case 286732468:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_NG_LOCAL;
                    break;
                case 286732469:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPFACTS_CLEANUP;
                    break;
                case 286732470:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_THIRD_PARTY_UGC;
                    break;
                case 286732471:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEO_ISSUE_ADMIN;
                    break;
                case 286732472:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_VACATION_RENTAL_PARTNERS;
                    break;
                case 286732473:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_FEED_PROCESSOR_ROAD_INCIDENTS;
                    break;
                case 286732480:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DYNAMIC_BASEMAP;
                    break;
                case 286732481:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_SERVICES_ADS_EMEA;
                    break;
                case 286732482:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_RWJ_INDIA_FOOD;
                    break;
                case 286732483:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GTDS;
                    break;
                case 286732484:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SCALABLE_JOURNEYS;
                    break;
                case 286785393:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPMAKER_MOBILE;
                    break;
                case 286785394:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPMAKER_PANCAKE;
                    break;
                case 286785395:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MAPMAKER_V2;
                    break;
                case 286785441:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT_LOCAL_WITH_RIGHTS;
                    break;
                case 286785521:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SYNTHETIC_AREAS;
                    break;
                case 286785522:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_AUTHORITY_PAGE_PHOTOS;
                    break;
                case 286785523:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CROSS_STREETS;
                    break;
                case 286785524:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CORRIDORS;
                    break;
                case 286785525:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BICYCLE_RENTAL;
                    break;
                case 286785526:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CONCRETE_URLS;
                    break;
                case 286785527:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LEANBACK;
                    break;
                case 286785528:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCKED_LISTINGS;
                    break;
                case 286785529:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_MONITORING;
                    break;
                case 286785530:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SPROUT;
                    break;
                case 286785531:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCAL_SEARCH_QUALITY;
                    break;
                case 286785532:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GOBY;
                    break;
                case 286785533:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_PROBLEM_REPORT;
                    break;
                case 286785534:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CANDID;
                    break;
                case 286785535:
                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BIZBUILDER;
                    break;
                default:
                    switch (i) {
                        case 71585:
                            enumC5063l = EnumC5063l.PROVIDER_NO_NORSK_EIENDOMSINFORMASJON;
                            break;
                        case 71586:
                            enumC5063l = EnumC5063l.PROVIDER_NO_POSTEN_NORGE_AS;
                            break;
                        default:
                            switch (i) {
                                case 71601:
                                    enumC5063l = EnumC5063l.PROVIDER_CH_SWISS_POST;
                                    break;
                                case 71602:
                                    enumC5063l = EnumC5063l.PROVIDER_CH_SWISSTOPO;
                                    break;
                                case 71603:
                                    enumC5063l = EnumC5063l.PROVIDER_CH_SWISS_NATIONAL_PARK;
                                    break;
                                default:
                                    switch (i) {
                                        case 71649:
                                            enumC5063l = EnumC5063l.PROVIDER_BUNDESAMT_KARTOGRAPHIE_UND_GEODASIE;
                                            break;
                                        case 71650:
                                            enumC5063l = EnumC5063l.PROVIDER_BUNDESNETZAGENTUR;
                                            break;
                                        default:
                                            switch (i) {
                                                case 71697:
                                                    enumC5063l = EnumC5063l.PROVIDER_US_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71698:
                                                    enumC5063l = EnumC5063l.PROVIDER_NZ_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71699:
                                                    enumC5063l = EnumC5063l.PROVIDER_PL_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71700:
                                                    enumC5063l = EnumC5063l.PROVIDER_DE_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71701:
                                                    enumC5063l = EnumC5063l.PROVIDER_PT_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71702:
                                                    enumC5063l = EnumC5063l.PROVIDER_AT_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71703:
                                                    enumC5063l = EnumC5063l.PROVIDER_ES_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71704:
                                                    enumC5063l = EnumC5063l.PROVIDER_AU_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71705:
                                                    enumC5063l = EnumC5063l.PROVIDER_IS_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71706:
                                                    enumC5063l = EnumC5063l.PROVIDER_NL_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71707:
                                                    enumC5063l = EnumC5063l.PROVIDER_BE_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71708:
                                                    enumC5063l = EnumC5063l.PROVIDER_CA_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71709:
                                                    enumC5063l = EnumC5063l.PROVIDER_SE_PUBLIC_MUNICIPALITY;
                                                    break;
                                                case 71710:
                                                    enumC5063l = EnumC5063l.PROVIDER_UA_PUBLIC_MUNICIPALITY;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 71889:
                                                            enumC5063l = EnumC5063l.PROVIDER_FR_INSTITUT_GEOGRAPHIQUE_NATIONAL;
                                                            break;
                                                        case 71890:
                                                            enumC5063l = EnumC5063l.PROVIDER_FR_CADASTRE;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 71969:
                                                                    enumC5063l = EnumC5063l.PROVIDER_NL_KADASTER;
                                                                    break;
                                                                case 71970:
                                                                    enumC5063l = EnumC5063l.PROVIDER_NL_BOARD_OF_TOURISM_AND_CONVENTIONS;
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 72225:
                                                                            enumC5063l = EnumC5063l.PROVIDER_BE_NATIONAAL_GEOGRAFISCH_INSTITUUT;
                                                                            break;
                                                                        case 72226:
                                                                            enumC5063l = EnumC5063l.PROVIDER_BE_BRUSSELS_MOBILITY;
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 72401:
                                                                                    enumC5063l = EnumC5063l.PROVIDER_FI_NATIONAL_ROAD_ADMINISTRATION;
                                                                                    break;
                                                                                case 72402:
                                                                                    enumC5063l = EnumC5063l.PROVIDER_FI_NATIONAL_LAND_SURVEY;
                                                                                    break;
                                                                                case 72403:
                                                                                    enumC5063l = EnumC5063l.PROVIDER_FI_STATISTICS_FINLAND;
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 72417:
                                                                                            enumC5063l = EnumC5063l.PROVIDER_GB_ORDNANCE_SURVEY;
                                                                                            break;
                                                                                        case 72418:
                                                                                            enumC5063l = EnumC5063l.PROVIDER_NATURAL_ENGLAND;
                                                                                            break;
                                                                                        case 72419:
                                                                                            enumC5063l = EnumC5063l.PROVIDER_WELSH_GOVERNMENT;
                                                                                            break;
                                                                                        case 72420:
                                                                                            enumC5063l = EnumC5063l.PROVIDER_GB_OFFICE_FOR_NATIONAL_STATISTICS;
                                                                                            break;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 4369:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_UNKNOWN;
                                                                                                    break;
                                                                                                case 4370:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_NAVTEQ;
                                                                                                    break;
                                                                                                case 4371:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS;
                                                                                                    break;
                                                                                                case 4372:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELCONTAR;
                                                                                                    break;
                                                                                                case 4373:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_EUROPA;
                                                                                                    break;
                                                                                                case 4374:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_ROYAL_MAIL;
                                                                                                    break;
                                                                                                case 4375:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_GOOGLE;
                                                                                                    break;
                                                                                                case 4376:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_AUTOMOTIVE_NAVIGATION_DATA;
                                                                                                    break;
                                                                                                case 4377:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_MAPDATA_SCIENCES;
                                                                                                    break;
                                                                                                case 4378:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_MAPONICS;
                                                                                                    break;
                                                                                                case 4379:
                                                                                                    enumC5063l = EnumC5063l.PROVIDER_SKI_RESORTS;
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 4384:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ZENRIN;
                                                                                                            break;
                                                                                                        case 4385:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SANBORN;
                                                                                                            break;
                                                                                                        case 4386:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_URBAN_MAPPING;
                                                                                                            break;
                                                                                                        case 4387:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_US_GOVERNMENT;
                                                                                                            break;
                                                                                                        case 4388:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DMTI_SPATIAL;
                                                                                                            break;
                                                                                                        case 4389:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INTERNATIONAL_HYDROGRAPHIC_ORGANIZATION;
                                                                                                            break;
                                                                                                        case 4390:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MAPLINK;
                                                                                                            break;
                                                                                                        case 4391:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_KINGWAY;
                                                                                                            break;
                                                                                                        case 4392:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GEOCENTRE;
                                                                                                            break;
                                                                                                        case 4393:
                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CN_NATIONAL_FOUNDAMENTAL_GIS;
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (i) {
                                                                                                                case 4400:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_CN_MAPABC;
                                                                                                                    break;
                                                                                                                case 4401:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_SMITHSONIAN_INSTITUTE;
                                                                                                                    break;
                                                                                                                case 4402:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TRACKS_FOR_AFRICA;
                                                                                                                    break;
                                                                                                                case 4403:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_PPWK;
                                                                                                                    break;
                                                                                                                case 4404:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_LEADDOG;
                                                                                                                    break;
                                                                                                                case 4405:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_CENTRE_DONNEES_ASTRONOMIQUES_STRASBOURG;
                                                                                                                    break;
                                                                                                                case 4406:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_GISRAEL;
                                                                                                                    break;
                                                                                                                case 4407:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_BASARSOFT;
                                                                                                                    break;
                                                                                                                case 4408:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_MAPINFO;
                                                                                                                    break;
                                                                                                                case 4409:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_MAPIT;
                                                                                                                    break;
                                                                                                                case 4410:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_GEOBASE;
                                                                                                                    break;
                                                                                                                case 4411:
                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_ORION;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (i) {
                                                                                                                        case 4613:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MURCIA_REGION_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4614:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CORREIOS;
                                                                                                                            break;
                                                                                                                        case 4615:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_WEST_WORLD_MEDIA;
                                                                                                                            break;
                                                                                                                        case 4616:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INTERNATIONAL_MAPPING_ASSOCIATION;
                                                                                                                            break;
                                                                                                                        case 4617:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MEDICARE;
                                                                                                                            break;
                                                                                                                        case 4618:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_POLARIS;
                                                                                                                            break;
                                                                                                                        case 4619:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_TW_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4620:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_NORDECA;
                                                                                                                            break;
                                                                                                                        case 4621:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_AFRIMAPPING;
                                                                                                                            break;
                                                                                                                        case 4622:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_OVERDRIVE;
                                                                                                                            break;
                                                                                                                        case 4623:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PROVIDER_NETWORK_DIRECTORIES;
                                                                                                                            break;
                                                                                                                        case 4624:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BR_MINISTERIO_DA_SAUDE;
                                                                                                                            break;
                                                                                                                        case 4625:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DIGITAL_EGYPT;
                                                                                                                            break;
                                                                                                                        case 4626:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INRIX;
                                                                                                                            break;
                                                                                                                        case 4627:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ARPINDO;
                                                                                                                            break;
                                                                                                                        case 4628:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_IT_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4629:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EAST_END_GROUP;
                                                                                                                            break;
                                                                                                                        case 4630:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INGEOLAN;
                                                                                                                            break;
                                                                                                                        case 4631:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SEMACONNECT;
                                                                                                                            break;
                                                                                                                        case 4632:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BLINK;
                                                                                                                            break;
                                                                                                                        case 4633:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EVGO;
                                                                                                                            break;
                                                                                                                        case 4634:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CHARGEPOINT;
                                                                                                                            break;
                                                                                                                        case 4635:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_TPL_TRAKKER;
                                                                                                                            break;
                                                                                                                        case 4636:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_OI;
                                                                                                                            break;
                                                                                                                        case 4637:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MAPARADAR;
                                                                                                                            break;
                                                                                                                        case 4638:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SINGAPORE_POST;
                                                                                                                            break;
                                                                                                                        case 4639:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CHARGEMASTER;
                                                                                                                            break;
                                                                                                                        case 4640:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_TESLA;
                                                                                                                            break;
                                                                                                                        case 4641:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VISICOM;
                                                                                                                            break;
                                                                                                                        case 4642:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GEOLYSIS;
                                                                                                                            break;
                                                                                                                        case 4643:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ZEPHEIRA;
                                                                                                                            break;
                                                                                                                        case 4644:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_HUBJECT;
                                                                                                                            break;
                                                                                                                        case 4645:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PODPOINT;
                                                                                                                            break;
                                                                                                                        case 4646:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CHARGEFOX;
                                                                                                                            break;
                                                                                                                        case 4647:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_KR_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4648:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CRITCHLOW;
                                                                                                                            break;
                                                                                                                        case 4649:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EIFRIG;
                                                                                                                            break;
                                                                                                                        case 4650:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GIREVE;
                                                                                                                            break;
                                                                                                                        case 4651:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CN_NAVINFO;
                                                                                                                            break;
                                                                                                                        case 4652:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_JAPAN_CHARGE_NETWORK;
                                                                                                                            break;
                                                                                                                        case 4653:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_NOBIL;
                                                                                                                            break;
                                                                                                                        case 4654:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INDIA_BANKS;
                                                                                                                            break;
                                                                                                                        case 4655:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INDONESIA_ELECTION_KPU;
                                                                                                                            break;
                                                                                                                        case 4656:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CAREERS360;
                                                                                                                            break;
                                                                                                                        case 4657:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SOURCE_LONDON;
                                                                                                                            break;
                                                                                                                        case 4658:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EVBOX;
                                                                                                                            break;
                                                                                                                        case 4659:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_JP_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4660:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_YUMYUM;
                                                                                                                            break;
                                                                                                                        case 4661:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_HWW_AUSTRALIA;
                                                                                                                            break;
                                                                                                                        case 4662:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CINERGY;
                                                                                                                            break;
                                                                                                                        case 4663:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MTIME;
                                                                                                                            break;
                                                                                                                        case 4664:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_KULTUNAUT;
                                                                                                                            break;
                                                                                                                        case 4665:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BLITZ;
                                                                                                                            break;
                                                                                                                        case 4666:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PIA;
                                                                                                                            break;
                                                                                                                        case 4667:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_INTERPARK;
                                                                                                                            break;
                                                                                                                        case 4668:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CINEMA_ONLINE;
                                                                                                                            break;
                                                                                                                        case 4669:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BELBIOS;
                                                                                                                            break;
                                                                                                                        case 4670:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MOVIESEER;
                                                                                                                            break;
                                                                                                                        case 4671:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SODAMEDYA;
                                                                                                                            break;
                                                                                                                        case 4672:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ATMOVIES;
                                                                                                                            break;
                                                                                                                        case 4673:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_HOTELBEDS;
                                                                                                                            break;
                                                                                                                        case 4674:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VERICRED;
                                                                                                                            break;
                                                                                                                        case 4675:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CIRRANTIC;
                                                                                                                            break;
                                                                                                                        case 4676:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOGO_LABS;
                                                                                                                            break;
                                                                                                                        case 4677:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ELECTRIFY_AMERICA;
                                                                                                                            break;
                                                                                                                        case 4678:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CMS_MPPUF;
                                                                                                                            break;
                                                                                                                        case 4679:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DIGIROAD;
                                                                                                                            break;
                                                                                                                        case 4680:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_KONTEX_GEOMATICS;
                                                                                                                            break;
                                                                                                                        case 4681:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_NZ_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4682:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_FASTNED;
                                                                                                                            break;
                                                                                                                        case 4683:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DESTINY_CS;
                                                                                                                            break;
                                                                                                                        case 4684:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_IONITY;
                                                                                                                            break;
                                                                                                                        case 4685:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EV_CONNECT;
                                                                                                                            break;
                                                                                                                        case 4686:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PANPAGES;
                                                                                                                            break;
                                                                                                                        case 4687:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ETECNIC;
                                                                                                                            break;
                                                                                                                        case 4688:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VOLTA;
                                                                                                                            break;
                                                                                                                        case 4689:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_NISSAN_MEXICO;
                                                                                                                            break;
                                                                                                                        case 4690:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BMW_GROUP_LATIN_AMERICA;
                                                                                                                            break;
                                                                                                                        case 4691:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_FEDERAL_ELECTRICITY_COMMISSION_MEXICO;
                                                                                                                            break;
                                                                                                                        case 4692:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VOLVO_CARS_BRASIL;
                                                                                                                            break;
                                                                                                                        case 4693:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CHARGE_AND_PARKING;
                                                                                                                            break;
                                                                                                                        case 4694:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DEDUCE_TECHNOLOGIES;
                                                                                                                            break;
                                                                                                                        case 4695:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_SK_TELECOM;
                                                                                                                            break;
                                                                                                                        case 4696:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ECO_MOVEMENT;
                                                                                                                            break;
                                                                                                                        case 4697:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GMS;
                                                                                                                            break;
                                                                                                                        case 4698:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EASYWAY;
                                                                                                                            break;
                                                                                                                        case 4699:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PHYSICIAN_COMPARE;
                                                                                                                            break;
                                                                                                                        case 4700:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_HOSPITAL_COMPARE;
                                                                                                                            break;
                                                                                                                        case 4701:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ENDOLLA_BARCELONA;
                                                                                                                            break;
                                                                                                                        case 4702:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_BE_CHARGE;
                                                                                                                            break;
                                                                                                                        case 4703:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ONE_NETWORK;
                                                                                                                            break;
                                                                                                                        case 4704:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CARENAV_DUPLEX;
                                                                                                                            break;
                                                                                                                        case 4705:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_CARENAV_POI;
                                                                                                                            break;
                                                                                                                        case 4706:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_IN_GOVERNMENT;
                                                                                                                            break;
                                                                                                                        case 4707:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_E_ON;
                                                                                                                            break;
                                                                                                                        case 4708:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ELECTRIFY_CANADA;
                                                                                                                            break;
                                                                                                                        case 4709:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GRIDCARS;
                                                                                                                            break;
                                                                                                                        case 4710:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DRIVECO;
                                                                                                                            break;
                                                                                                                        case 4711:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GREEN_ACTION_STUDIOS;
                                                                                                                            break;
                                                                                                                        case 4712:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GREEN_ACTION_STUDIO;
                                                                                                                            break;
                                                                                                                        case 4713:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_EVINY;
                                                                                                                            break;
                                                                                                                        case 4714:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MASTERCARD;
                                                                                                                            break;
                                                                                                                        case 4715:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VATTENFALL;
                                                                                                                            break;
                                                                                                                        case 4716:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_VIETGIS;
                                                                                                                            break;
                                                                                                                        case 4717:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_UNITE;
                                                                                                                            break;
                                                                                                                        case 4718:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_NEOGY;
                                                                                                                            break;
                                                                                                                        case 4719:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_AMPUP;
                                                                                                                            break;
                                                                                                                        case 4720:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_LOOP;
                                                                                                                            break;
                                                                                                                        case 4721:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ELECTRIC_ERA;
                                                                                                                            break;
                                                                                                                        case 4722:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_FLO;
                                                                                                                            break;
                                                                                                                        case 4723:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_DIGITAL_CHARGING_SOLUTIONS;
                                                                                                                            break;
                                                                                                                        case 4724:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ELECTRIC_PE;
                                                                                                                            break;
                                                                                                                        case 4725:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_PLUGSURFING;
                                                                                                                            break;
                                                                                                                        case 4726:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_ATHER;
                                                                                                                            break;
                                                                                                                        case 4727:
                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_KAZAM;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (i) {
                                                                                                                                case 69937:
                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS_MULTINET;
                                                                                                                                    break;
                                                                                                                                case 69938:
                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS_CODEPOINT;
                                                                                                                                    break;
                                                                                                                                case 69939:
                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS_GEOPOST;
                                                                                                                                    break;
                                                                                                                                case 69940:
                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS_DATAGEO;
                                                                                                                                    break;
                                                                                                                                case 69941:
                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_TELE_ATLAS_ADDRESS_POINTS;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (i) {
                                                                                                                                        case 70001:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_HAND_EDIT;
                                                                                                                                            break;
                                                                                                                                        case 70002:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_BORDERS;
                                                                                                                                            break;
                                                                                                                                        case 70003:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SUBRANGE;
                                                                                                                                            break;
                                                                                                                                        case 70004:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_LOCALSEARCH;
                                                                                                                                            break;
                                                                                                                                        case 70005:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_TRANSIT;
                                                                                                                                            break;
                                                                                                                                        case 70006:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GEOWIKI;
                                                                                                                                            break;
                                                                                                                                        case 70007:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_CHINA_LOCAL_TEAM;
                                                                                                                                            break;
                                                                                                                                        case 70008:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SYNTHESIZED;
                                                                                                                                            break;
                                                                                                                                        case 70009:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_INTERNAL_TEST;
                                                                                                                                            break;
                                                                                                                                        case 70010:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_DISPUTED_AREAS;
                                                                                                                                            break;
                                                                                                                                        case 70011:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_3DWAREHOUSE;
                                                                                                                                            break;
                                                                                                                                        case 70012:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GROUNDS_BUILDER;
                                                                                                                                            break;
                                                                                                                                        case 70013:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_SESAME;
                                                                                                                                            break;
                                                                                                                                        case 70014:
                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_GOOGLE_GT;
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (i) {
                                                                                                                                                case 70193:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_CENSUS;
                                                                                                                                                    break;
                                                                                                                                                case 70194:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_POSTAL_SERVICE;
                                                                                                                                                    break;
                                                                                                                                                case 70195:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_GEOLOGICAL_SURVEY;
                                                                                                                                                    break;
                                                                                                                                                case 70196:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_NATIONAL_GEOSPATIAL_INTELLIGENCE_AGENCY;
                                                                                                                                                    break;
                                                                                                                                                case 70197:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_SSIBL;
                                                                                                                                                    break;
                                                                                                                                                case 70198:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_BUREAU_OF_TRANSPORTATION_STATISTICS;
                                                                                                                                                    break;
                                                                                                                                                case 70199:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_NATIONAL_OCEANIC_AND_ATMOSPHERIC_ADMINISTRATION;
                                                                                                                                                    break;
                                                                                                                                                case 70200:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_POLAR_GEOSPATIAL_CENTER;
                                                                                                                                                    break;
                                                                                                                                                case 70201:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_DEPARTMENT_OF_AGRICULTURE;
                                                                                                                                                    break;
                                                                                                                                                case 70202:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_NPI_REGISTRY;
                                                                                                                                                    break;
                                                                                                                                                case 70203:
                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_US_BUREAU_OF_INDIAN_AFFAIRS;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    switch (i) {
                                                                                                                                                        case 71185:
                                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MX_NATIONAL_INSTITUTE_STATISTICS_GEOGRAPHY;
                                                                                                                                                            break;
                                                                                                                                                        case 71186:
                                                                                                                                                            enumC5063l = EnumC5063l.PROVIDER_MX_SERVICIO_POSTAL_MEXICANO;
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            switch (i) {
                                                                                                                                                                case 71569:
                                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_AT_BUNDESAMT_FUR_EICH_UND_VERMESSUNGSWESEN;
                                                                                                                                                                    break;
                                                                                                                                                                case 71570:
                                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_AT_NATIONAL_TOURIST_OFFICE;
                                                                                                                                                                    break;
                                                                                                                                                                case 71571:
                                                                                                                                                                    enumC5063l = EnumC5063l.PROVIDER_AT_AUSTRIA_POST;
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    enumC5063l = null;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            enumC5063l = EnumC5063l.PROVIDER_ANY;
        }
        return enumC5063l != null;
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0182 A[FALL_THROUGH, ORIG_RETURN, RETURN] */
    public final boolean yandex(int i) {
        switch (this.yandex) {
            case 0:
                if (i != 129 && i != 161 && i != 209 && i != 2705 && i != 20753 && i != 20769 && i != 215 && i != 216 && i != 1297 && i != 1298) {
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        default:
                                            switch (i) {
                                                default:
                                                    switch (i) {
                                                        case 211:
                                                        case 212:
                                                        case 213:
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                case 163:
                                                case 164:
                                                case 165:
                                                case 166:
                                                case 167:
                                                case 168:
                                                case 169:
                                                    return true;
                                            }
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                            return true;
                                    }
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    return true;
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return true;
                    }
                }
                return true;
            case 1:
                return i == 0 || i == 1 || i == 2;
            case 2:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 3:
                return i == 0 || i == 1 || i == 2;
            case 4:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 5:
                return AbstractC14425l.vip(i) != 0;
            case 6:
                return AbstractC7798l.purchase(i) != 0;
            case 7:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 8:
                return i == 0 || i == 1;
            case 9:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 10:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 11:
                switch (i) {
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    case 21:
                    case 22:
                    case 23:
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        return true;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    case 20:
                    default:
                        return false;
                }
            case 12:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 13:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 14:
                return i == 0 || i == 1 || i == 2;
            case 15:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 16:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return i == 0 || i == 1 || i == 2;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return i == 0 || i == 1;
            case 20:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 21:
                return i == 0 || i == 1 || i == 2;
            case 22:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 23:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 8 || i == 16 || i == 32 || i == 64 || i == 128;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return loadAd(i);
            default:
                return i == 0 || i == 1 || i == 2;
        }
    }
}
