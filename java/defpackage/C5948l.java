package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;

/* JADX INFO: renamed from: lؘۚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5948l extends AbstractC18276l {
    public final /* synthetic */ int crashlytics;

    public /* synthetic */ C5948l(int i) {
        this.crashlytics = i;
    }

    @Override // defpackage.AbstractC18276l
    public final C7100l loadAd() {
        switch (this.crashlytics) {
            case 0:
                byte[] bArrCrashlytics = AbstractC8535l.crashlytics("3045AE6FC8422F64ED579528D38120EAE12196D5");
                AbstractC11918l abstractC11918lCrashlytics = crashlytics();
                return new C7100l(abstractC11918lCrashlytics, AbstractC1624l.yandex(abstractC11918lCrashlytics, "04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811"), abstractC11918lCrashlytics.amazon, abstractC11918lCrashlytics.purchase, bArrCrashlytics);
            case 1:
                AbstractC11918l abstractC11918lCrashlytics2 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics2, AbstractC1624l.yandex(abstractC11918lCrashlytics2, "04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5"), abstractC11918lCrashlytics2.amazon, abstractC11918lCrashlytics2.purchase, null);
            case 2:
                byte[] bArrCrashlytics2 = AbstractC8535l.crashlytics("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
                AbstractC11918l abstractC11918lCrashlytics3 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics3, AbstractC1624l.yandex(abstractC11918lCrashlytics3, "04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"), abstractC11918lCrashlytics3.amazon, abstractC11918lCrashlytics3.purchase, bArrCrashlytics2);
            case 3:
                AbstractC11918l abstractC11918lCrashlytics4 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics4, AbstractC11696l.loadAd(abstractC11918lCrashlytics4, InterfaceC11695l.startapp, AbstractC11696l.yandex("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14")), abstractC11918lCrashlytics4.amazon, abstractC11918lCrashlytics4.purchase, null);
            case 4:
                AbstractC11918l abstractC11918lCrashlytics5 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics5, AbstractC11696l.loadAd(abstractC11918lCrashlytics5, InterfaceC11695l.startapp, AbstractC11696l.yandex("3FA8124359F96680B83D1C3EB2C070E5C545C9858D03ECFB744BF8D717717EFC")), abstractC11918lCrashlytics5.amazon, abstractC11918lCrashlytics5.purchase, null);
            case 5:
                AbstractC11918l abstractC11918lCrashlytics6 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics6, AbstractC11696l.loadAd(abstractC11918lCrashlytics6, InterfaceC11695l.metrica, AbstractC11696l.yandex("41ECE55743711A8C3CBF3783CD08C0EE4D4DC440D4641A8F366E550DFDB3BB67")), abstractC11918lCrashlytics6.amazon, abstractC11918lCrashlytics6.purchase, null);
            case 6:
                AbstractC11918l abstractC11918lCrashlytics7 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics7, AbstractC11696l.loadAd(abstractC11918lCrashlytics7, AbstractC11696l.yandex("91E38443A5E82C0D880923425712B2BB658B9196932E02C78B2582FE742DAA28"), AbstractC11696l.yandex("32879423AB1A0375895786C4BB46E9565FDE0B5344766740AF268ADB32322E5C")), abstractC11918lCrashlytics7.amazon, abstractC11918lCrashlytics7.purchase, null);
            case 7:
                AbstractC11918l abstractC11918lCrashlytics8 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics8, AbstractC11696l.loadAd(abstractC11918lCrashlytics8, InterfaceC11695l.ads, AbstractC11696l.yandex("7503CFE87A836AE3A61B8816E25450E6CE5E1C93ACF1ABC1778064FDCBEFA921DF1626BE4FD036E93D75E6A50E3A41E98028FE5FC235F5B889A589CB5215F2A4")), abstractC11918lCrashlytics8.amazon, abstractC11918lCrashlytics8.purchase, null);
            case 8:
                AbstractC11918l abstractC11918lCrashlytics9 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics9, AbstractC11696l.loadAd(abstractC11918lCrashlytics9, InterfaceC11695l.adcel, AbstractC11696l.yandex("1A8F7EDA389B094C2C071E3647A8940F3C123B697578C213BE6DD9E6C8EC7335DCB228FD1EDF4A39152CBCAAF8C0398828041055F94CEEEC7E21340780FE41BD")), abstractC11918lCrashlytics9.amazon, abstractC11918lCrashlytics9.purchase, null);
            case 9:
                AbstractC11918l abstractC11918lCrashlytics10 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics10, AbstractC11696l.loadAd(abstractC11918lCrashlytics10, AbstractC11696l.yandex("E2E31EDFC23DE7BDEBE241CE593EF5DE2295B7A9CBAEF021D385F7074CEA043AA27272A7AE602BF2A7B9033DB9ED3610C6FB85487EAE97AAC5BC7928C1950148"), AbstractC11696l.yandex("F5CE40D95B5EB899ABBCCFF5911CB8577939804D6527378B8C108C3D2090FF9BE18E2D33E3021ED2EF32D85822423B6304F726AA854BAE07D0396E9A9ADDC40F")), abstractC11918lCrashlytics10.amazon, abstractC11918lCrashlytics10.purchase, null);
            case 10:
                AbstractC11918l abstractC11918lCrashlytics11 = crashlytics();
                C16217l c16217l = new C16217l(abstractC11918lCrashlytics11, AbstractC8535l.crashlytics("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"));
                AbstractC6660l.amazon(c16217l.vip());
                return new C7100l(abstractC11918lCrashlytics11, c16217l, abstractC11918lCrashlytics11.amazon, abstractC11918lCrashlytics11.purchase, null);
            case 11:
                AbstractC11918l abstractC11918lCrashlytics12 = crashlytics();
                C16217l c16217l2 = new C16217l(abstractC11918lCrashlytics12, AbstractC8535l.crashlytics("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"));
                AbstractC6660l.amazon(c16217l2.vip());
                return new C7100l(abstractC11918lCrashlytics12, c16217l2, abstractC11918lCrashlytics12.amazon, abstractC11918lCrashlytics12.purchase, null);
            case 12:
                AbstractC11918l abstractC11918lCrashlytics13 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics13, AbstractC6569l.loadAd(abstractC11918lCrashlytics13, "04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5"), abstractC11918lCrashlytics13.amazon, abstractC11918lCrashlytics13.purchase, null);
            case 13:
                byte[] bArrCrashlytics3 = AbstractC8535l.crashlytics("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
                AbstractC11918l abstractC11918lCrashlytics14 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics14, AbstractC6569l.loadAd(abstractC11918lCrashlytics14, "04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34"), abstractC11918lCrashlytics14.amazon, abstractC11918lCrashlytics14.purchase, bArrCrashlytics3);
            case 14:
                AbstractC11918l abstractC11918lCrashlytics15 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics15, AbstractC6569l.loadAd(abstractC11918lCrashlytics15, "0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8"), abstractC11918lCrashlytics15.amazon, abstractC11918lCrashlytics15.purchase, null);
            case 15:
                byte[] bArrCrashlytics4 = AbstractC8535l.crashlytics("C49D360886E704936A6678E1139D26B7819F7E90");
                AbstractC11918l abstractC11918lCrashlytics16 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics16, AbstractC6569l.loadAd(abstractC11918lCrashlytics16, "046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5"), abstractC11918lCrashlytics16.amazon, abstractC11918lCrashlytics16.purchase, bArrCrashlytics4);
            case 16:
                byte[] bArrCrashlytics5 = AbstractC8535l.crashlytics("A335926AA319A27A1D00896A6773A4827ACDAC73");
                AbstractC11918l abstractC11918lCrashlytics17 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics17, AbstractC6569l.loadAd(abstractC11918lCrashlytics17, "04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F"), abstractC11918lCrashlytics17.amazon, abstractC11918lCrashlytics17.purchase, bArrCrashlytics5);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                byte[] bArrCrashlytics6 = AbstractC8535l.crashlytics("D09E8800291CB85396CC6717393284AAA0DA64BA");
                AbstractC11918l abstractC11918lCrashlytics18 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics18, AbstractC6569l.loadAd(abstractC11918lCrashlytics18, "0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650"), abstractC11918lCrashlytics18.amazon, abstractC11918lCrashlytics18.purchase, bArrCrashlytics6);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                byte[] bArrCrashlytics7 = AbstractC8535l.crashlytics("10E723AB14D696E6768756151756FEBF8FCB49A9");
                AbstractC11918l abstractC11918lCrashlytics19 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics19, AbstractC6569l.loadAd(abstractC11918lCrashlytics19, "04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886"), abstractC11918lCrashlytics19.amazon, abstractC11918lCrashlytics19.purchase, bArrCrashlytics7);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                byte[] bArrCrashlytics8 = AbstractC8535l.crashlytics("10C0FB15760860DEF1EEF4D696E676875615175D");
                AbstractC11918l abstractC11918lCrashlytics20 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics20, AbstractC6569l.loadAd(abstractC11918lCrashlytics20, "0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D"), abstractC11918lCrashlytics20.amazon, abstractC11918lCrashlytics20.purchase, bArrCrashlytics8);
            case 20:
                byte[] bArrCrashlytics9 = AbstractC8535l.crashlytics("4D696E676875615175985BD3ADBADA21B43A97E2");
                AbstractC11918l abstractC11918lCrashlytics21 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics21, AbstractC6569l.loadAd(abstractC11918lCrashlytics21, "040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"), abstractC11918lCrashlytics21.amazon, abstractC11918lCrashlytics21.purchase, bArrCrashlytics9);
            case 21:
                byte[] bArrCrashlytics10 = AbstractC8535l.crashlytics("985BD3ADBAD4D696E676875615175A21B43A97E3");
                AbstractC11918l abstractC11918lCrashlytics22 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics22, AbstractC6569l.loadAd(abstractC11918lCrashlytics22, "040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F"), abstractC11918lCrashlytics22.amazon, abstractC11918lCrashlytics22.purchase, bArrCrashlytics10);
            case 22:
                byte[] bArrCrashlytics11 = AbstractC8535l.crashlytics("00F50B028E4D696E676875615175290472783FB1");
                AbstractC11918l abstractC11918lCrashlytics23 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics23, AbstractC6569l.loadAd(abstractC11918lCrashlytics23, "0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500"), abstractC11918lCrashlytics23.amazon, abstractC11918lCrashlytics23.purchase, bArrCrashlytics11);
            case 23:
                AbstractC11918l abstractC11918lCrashlytics24 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics24, AbstractC6569l.loadAd(abstractC11918lCrashlytics24, "0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9"), abstractC11918lCrashlytics24.amazon, abstractC11918lCrashlytics24.purchase, null);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                byte[] bArrCrashlytics12 = AbstractC8535l.crashlytics("24B7B137C8A14D696E6768756151756FD0DA2E5C");
                AbstractC11918l abstractC11918lCrashlytics25 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics25, AbstractC6569l.loadAd(abstractC11918lCrashlytics25, "040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883"), abstractC11918lCrashlytics25.amazon, abstractC11918lCrashlytics25.purchase, bArrCrashlytics12);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                byte[] bArrCrashlytics13 = AbstractC8535l.crashlytics("85E25BFE5C86226CDB12016F7553F9D0E693A268");
                AbstractC11918l abstractC11918lCrashlytics26 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics26, AbstractC6569l.loadAd(abstractC11918lCrashlytics26, "0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1"), abstractC11918lCrashlytics26.amazon, abstractC11918lCrashlytics26.purchase, bArrCrashlytics13);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                byte[] bArrCrashlytics14 = AbstractC8535l.crashlytics("103FAEC74D696E676875615175777FC5B191EF30");
                AbstractC11918l abstractC11918lCrashlytics27 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics27, AbstractC6569l.loadAd(abstractC11918lCrashlytics27, "0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05"), abstractC11918lCrashlytics27.amazon, abstractC11918lCrashlytics27.purchase, bArrCrashlytics14);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                byte[] bArrCrashlytics15 = AbstractC8535l.crashlytics("10B7B4D696E676875615175137C8A16FD0DA2211");
                AbstractC11918l abstractC11918lCrashlytics28 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics28, AbstractC6569l.loadAd(abstractC11918lCrashlytics28, "0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C"), abstractC11918lCrashlytics28.amazon, abstractC11918lCrashlytics28.purchase, bArrCrashlytics15);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC11918l abstractC11918lCrashlytics29 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics29, AbstractC6569l.loadAd(abstractC11918lCrashlytics29, "04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3"), abstractC11918lCrashlytics29.amazon, abstractC11918lCrashlytics29.purchase, null);
            default:
                byte[] bArrCrashlytics16 = AbstractC8535l.crashlytics("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
                AbstractC11918l abstractC11918lCrashlytics30 = crashlytics();
                return new C7100l(abstractC11918lCrashlytics30, AbstractC6569l.loadAd(abstractC11918lCrashlytics30, "0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052"), abstractC11918lCrashlytics30.amazon, abstractC11918lCrashlytics30.purchase, bArrCrashlytics16);
        }
    }

    @Override // defpackage.AbstractC18276l
    public final AbstractC11918l yandex() {
        int i = 25;
        switch (this.crashlytics) {
            case 0:
                return new C13449l();
            case 1:
                BigInteger bigInteger = new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16);
                new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16);
                return AbstractC1624l.loadAd(new C11863l(), new C0458l(bigInteger, new C11906l(new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240), i));
            case 2:
                return new C8407l();
            case 3:
                return new C5277l(AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97"), AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94"), AbstractC11696l.yandex("A6"), AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893"), InterfaceC11695l.startapp, true);
            case 4:
                return new C5277l(AbstractC11696l.yandex("8000000000000000000000000000000000000000000000000000000000000C99"), AbstractC11696l.yandex("8000000000000000000000000000000000000000000000000000000000000C96"), AbstractC11696l.yandex("3E1AF419A269A5F866A7D3C25C3DF80AE979259373FF2B182F49D4CE7E1BBC8B"), AbstractC11696l.yandex("800000000000000000000000000000015F700CFFF1A624E5E497161BCC8A198F"), InterfaceC11695l.startapp, true);
            case 5:
                return new C5277l(AbstractC11696l.yandex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D759B"), AbstractC11696l.yandex("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D7598"), AbstractC11696l.yandex("805A"), AbstractC11696l.yandex("9B9F605F5A858107AB1EC85E6B41C8AA582CA3511EDDFB74F02F3A6598980BB9"), InterfaceC11695l.startapp, true);
            case 6:
                return new C5277l(AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97"), AbstractC11696l.yandex("C2173F1513981673AF4892C23035A27CE25E2013BF95AA33B22C656F277E7335"), AbstractC11696l.yandex("295F9BAE7428ED9CCC20E7C359A9D41A22FCCD9108E17BF7BA9337A6F8AE9513"), AbstractC11696l.yandex("400000000000000000000000000000000FD8CDDFC87B6635C115AF556C360C67"), InterfaceC11695l.subscription, true);
            case 7:
                return new C5277l(AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7"), AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC4"), AbstractC11696l.yandex("E8C2505DEDFC86DDC1BD0B2B6667F1DA34B82574761CB0E879BD081CFD0B6265EE3CB090F30D27614CB4574010DA90DD862EF9D4EBEE4761503190785A71C760"), AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF27E69532F48D89116FF22B8D4E0560609B4B38ABFAD2B85DCACDB1411F10B275"), InterfaceC11695l.startapp, true);
            case 8:
                return new C5277l(AbstractC11696l.yandex("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006F"), AbstractC11696l.yandex("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006C"), AbstractC11696l.yandex("687D1B459DC841457E3E06CF6F5E2517B97C7D614AF138BCBF85DC806C4B289F3E965D2DB1416D217F8B276FAD1AB69C50F78BEE1FA3106EFB8CCBC7C5140116"), AbstractC11696l.yandex("800000000000000000000000000000000000000000000000000000000000000149A1EC142565A545ACFDB77BD9D40CFA8B996712101BEA0EC6346C54374F25BD"), InterfaceC11695l.startapp, true);
            case 9:
                return new C5277l(AbstractC11696l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7"), AbstractC11696l.yandex("DC9203E514A721875485A529D2C722FB187BC8980EB866644DE41C68E143064546E861C0E2C9EDD92ADE71F46FCF50FF2AD97F951FDA9F2A2EB6546F39689BD3"), AbstractC11696l.yandex("B4C4EE28CEBC6C2C8AC12952CF37F16AC7EFB6A9F69F4B57FFDA2E4F0DE5ADE038CBC2FFF719D2C18DE0284B8BFEF3B52B8CC7A5F5BF0A3C8D2319A5312557E1"), AbstractC11696l.yandex("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC98CDBA46506AB004C33A9FF5147502CC8EDA9E7A769A12694623CEF47F023ED"), InterfaceC11695l.subscription, true);
            case 10:
                return new C5277l(AbstractC8660l.yandex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"), AbstractC8660l.yandex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC"), AbstractC8660l.yandex("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93"), AbstractC8660l.yandex("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"), BigInteger.valueOf(1L), true);
            case 11:
                return new C5277l(AbstractC8660l.yandex("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F"), AbstractC8660l.yandex("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985"), AbstractC8660l.yandex("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1"), AbstractC8660l.yandex("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677"), BigInteger.valueOf(1L), true);
            case 12:
                BigInteger bigIntegerYandex = AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
                BigInteger bigInteger2 = InterfaceC11695l.metrica;
                BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
                BigInteger bigIntegerYandex2 = AbstractC6569l.yandex("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
                BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
                BigInteger bigInteger3 = new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16);
                new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16);
                return AbstractC6569l.crashlytics(new C5277l(bigIntegerYandex, bigInteger2, bigIntegerValueOf, bigIntegerYandex2, bigIntegerValueOf2, true), new C0458l(bigInteger3, new C11906l(new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240), i));
            case 13:
                return new C5277l(AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"), AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE"), AbstractC6569l.yandex("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4"), AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"), BigInteger.valueOf(1L), true);
            case 14:
                BigInteger bigIntegerYandex3 = AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F");
                BigInteger bigInteger4 = InterfaceC11695l.metrica;
                BigInteger bigIntegerValueOf3 = BigInteger.valueOf(7L);
                BigInteger bigIntegerYandex4 = AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141");
                BigInteger bigIntegerValueOf4 = BigInteger.valueOf(1L);
                BigInteger bigInteger5 = new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16);
                new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16);
                return AbstractC6569l.crashlytics(new C5277l(bigIntegerYandex3, bigInteger4, bigIntegerValueOf3, bigIntegerYandex4, bigIntegerValueOf4, true), new C0458l(bigInteger5, new C11906l(new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272), i));
            case 15:
                return new C5277l(AbstractC6569l.yandex("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"), AbstractC6569l.yandex("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC"), AbstractC6569l.yandex("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B"), AbstractC6569l.yandex("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"), BigInteger.valueOf(1L), true);
            case 16:
                return new C5277l(AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"), AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC"), AbstractC6569l.yandex("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF"), AbstractC6569l.yandex("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"), BigInteger.valueOf(1L), true);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C5277l(AbstractC6569l.yandex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"), AbstractC6569l.yandex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC"), AbstractC6569l.yandex("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00"), AbstractC6569l.yandex("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"), BigInteger.valueOf(1L), true);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C6304l(113, 9, AbstractC6569l.yandex("003088250CA6E7C7FE649CE85820F7"), AbstractC6569l.yandex("00E8BEE4D3E2260744188BE0E9C723"), AbstractC6569l.yandex("0100000000000000D9CCEC8A39E56F"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C6304l(113, 9, AbstractC6569l.yandex("00689918DBEC7E5A0DD6DFC0AA55C7"), AbstractC6569l.yandex("0095E9A9EC9B297BD4BF36E059184F"), AbstractC6569l.yandex("010000000000000108789B2496AF93"), BigInteger.valueOf(2L));
            case 20:
                return new C6304l(131, 2, 3, 8, AbstractC6569l.yandex("07A11B09A76B562144418FF3FF8C2570B8"), AbstractC6569l.yandex("0217C05610884B63B9C6C7291678F9D341"), AbstractC6569l.yandex("0400000000000000023123953A9464B54D"), BigInteger.valueOf(2L));
            case 21:
                return new C6304l(131, 2, 3, 8, AbstractC6569l.yandex("03E5A88919D7CAFCBF415F07C2176573B2"), AbstractC6569l.yandex("04B8266A46C55657AC734CE38F018F2192"), AbstractC6569l.yandex("0400000000000000016954A233049BA98F"), BigInteger.valueOf(2L));
            case 22:
                return new C5277l(AbstractC6569l.yandex("DB7C2ABF62E35E668076BEAD208B"), AbstractC6569l.yandex("DB7C2ABF62E35E668076BEAD2088"), AbstractC6569l.yandex("659EF8BA043916EEDE8911702B22"), AbstractC6569l.yandex("DB7C2ABF62E35E7628DFAC6561C5"), BigInteger.valueOf(1L), true);
            case 23:
                return new C6304l(163, 3, 6, 7, BigInteger.valueOf(1L), BigInteger.valueOf(1L), AbstractC6569l.yandex("04000000000000000000020108A2E0CC0D99F8A5EF"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C6304l(163, 3, 6, 7, AbstractC6569l.yandex("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2"), AbstractC6569l.yandex("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9"), AbstractC6569l.yandex("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C6304l(163, 3, 6, 7, BigInteger.valueOf(1L), AbstractC6569l.yandex("020A601907B8C953CA1481EB10512F78744A3205FD"), AbstractC6569l.yandex("040000000000000000000292FE77E70C12A4234C33"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C6304l(193, 15, AbstractC6569l.yandex("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01"), AbstractC6569l.yandex("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814"), AbstractC6569l.yandex("01000000000000000000000000C7F34A778F443ACC920EBA49"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C6304l(193, 15, AbstractC6569l.yandex("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B"), AbstractC6569l.yandex("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE"), AbstractC6569l.yandex("010000000000000000000000015AAB561B005413CCD4EE99D5"), BigInteger.valueOf(2L));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C6304l(233, 74, InterfaceC11695l.metrica, BigInteger.valueOf(1L), AbstractC6569l.yandex("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"), BigInteger.valueOf(4L));
            default:
                return new C6304l(233, 74, BigInteger.valueOf(1L), AbstractC6569l.yandex("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD"), AbstractC6569l.yandex("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"), BigInteger.valueOf(2L));
        }
    }
}
