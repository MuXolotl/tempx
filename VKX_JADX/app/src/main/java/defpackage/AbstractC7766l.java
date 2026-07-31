package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;

/* JADX INFO: renamed from: lًؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7766l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        map.put(InterfaceC13726l.yandex, new C7584l(19));
        map.put(InterfaceC13726l.loadAd, new C7584l(10));
        map.put(InterfaceC13726l.crashlytics, new C7584l(22));
        map.put(InterfaceC13726l.amazon, new C7584l(23));
        map.put(InterfaceC18562l.yandex, new C7584l(22));
        map.put(InterfaceC18562l.loadAd, new C7584l(23));
        map.put(InterfaceC0543l.f1892l, new C7584l(6));
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.isPro);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.firebase);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.smaato);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.remoteconfig);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.vip);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.metrica);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.startapp);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.adcel);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.ads);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.subscription);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.tapsense);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.Signature);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.license);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.pro);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.ad);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.advert);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.isVip);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.signatures);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.premium);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5486package);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5495synchronized);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5326extends);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5329for);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5494switch);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5323continue);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5491static);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5334interface);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5332import);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5493super);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5327final);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5324default);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5333instanceof);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5317abstract);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5330goto);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5485new);
        AbstractC4338l.m1535synchronized(map, InterfaceC2522l.f5328finally);
        map.put(InterfaceC2522l.f5489public, new C7584l(20));
        AbstractC4338l.m1535synchronized(map, new Cfor("1.3.9999.6.4.10"));
        int i = 1;
        map.put(InterfaceC2522l.f5380l, new C7584l(i));
        map.put(InterfaceC2522l.f5373l, new C7584l(i));
        map.put(InterfaceC2522l.f5381l, new C7584l(i));
        map.put(InterfaceC2522l.f5471l, new C7584l(i));
        map.put(InterfaceC2522l.f5469l, new C7584l(i));
        map.put(InterfaceC2522l.f5386l, new C7584l(i));
        map.put(InterfaceC2522l.f5470l, new C7584l(i));
        map.put(InterfaceC2522l.f5408l, new C7584l(i));
        map.put(InterfaceC2522l.f5482l, new C7584l(i));
        map.put(InterfaceC2522l.f5338l, new C7584l(i));
        int i2 = 4;
        map.put(InterfaceC2522l.f5463l, new C7584l(i2));
        map.put(InterfaceC2522l.f5468l, new C7584l(i2));
        map.put(InterfaceC2522l.f5417l, new C7584l(i2));
        map.put(InterfaceC2522l.f5447l, new C7584l(i2));
        map.put(InterfaceC2522l.f5342l, new C7584l(i2));
        map.put(InterfaceC2522l.f5459l, new C7584l(i2));
        int i3 = 16;
        map.put(InterfaceC2522l.f5424l, new C7584l(i3));
        map.put(InterfaceC2522l.f5356l, new C7584l(i3));
        map.put(InterfaceC2522l.f5403l, new C7584l(i3));
        map.put(InterfaceC2522l.f5413l, new C7584l(i3));
        map.put(InterfaceC2522l.f5359l, new C7584l(i3));
        map.put(InterfaceC2522l.f5389l, new C7584l(i3));
        map.put(InterfaceC2522l.f5434l, new C7584l(i3));
        map.put(InterfaceC2522l.f5358l, new C7584l(i3));
        map.put(InterfaceC2522l.f5448l, new C7584l(i3));
        map.put(InterfaceC2522l.f5335l, new C7584l(i3));
        map.put(InterfaceC2522l.f5431l, new C7584l(i3));
        map.put(InterfaceC2522l.f5449l, new C7584l(i3));
        map.put(InterfaceC2522l.f5347l, new C7584l(i3));
        map.put(InterfaceC2522l.f5438l, new C7584l(i3));
        map.put(InterfaceC2522l.f5339l, new C7584l(i3));
        map.put(InterfaceC2522l.f5365l, new C7584l(i3));
        map.put(InterfaceC2522l.f5385l, new C7584l(i3));
        map.put(InterfaceC2522l.f5419l, new C7584l(i3));
        int i4 = 14;
        map.put(InterfaceC2522l.f5318break, new C7584l(i4));
        map.put(InterfaceC2522l.f5499transient, new C7584l(i4));
        map.put(InterfaceC2522l.f5488protected, new C7584l(i4));
        map.put(InterfaceC2522l.f5502while, new C7584l(i4));
        map.put(InterfaceC2522l.f5331implements, new C7584l(i4));
        map.put(InterfaceC2522l.f5322const, new C7584l(i4));
        map.put(InterfaceC2522l.f5490return, new C7584l(i4));
        map.put(InterfaceC2522l.f5480l, new C7584l(i4));
        map.put(InterfaceC2522l.f5401l, new C7584l(i4));
        map.put(InterfaceC2522l.f5472l, new C7584l(i4));
        map.put(InterfaceC2522l.f5462l, new C7584l(i4));
        map.put(InterfaceC2522l.f5363l, new C7584l(i4));
        int i5 = 13;
        map.put(InterfaceC2522l.f5388l, new C7584l(i5));
        map.put(InterfaceC2522l.f5456l, new C7584l(i5));
        map.put(InterfaceC2522l.f5451l, new C7584l(i5));
        map.put(InterfaceC2522l.f5374l, new C7584l(i5));
        map.put(InterfaceC2522l.f5422l, new C7584l(i5));
        map.put(InterfaceC2522l.f5372l, new C7584l(i5));
        int i6 = 3;
        map.put(InterfaceC2522l.f5439l, new C7584l(i6));
        map.put(InterfaceC2522l.f5343l, new C7584l(i6));
        map.put(InterfaceC2522l.f5464l, new C7584l(i6));
        map.put(InterfaceC2522l.f5437l, new C7584l(i6));
        int i7 = 8;
        map.put(InterfaceC8134l.f16958l, new C7584l(i7));
        map.put(InterfaceC8134l.f16977l, new C7584l(i7));
        map.put(InterfaceC8134l.f16968l, new C7584l(i7));
        map.put(InterfaceC2522l.f5387l, new C7584l(i7));
        map.put(InterfaceC2522l.f5409l, new C7584l(i7));
        map.put(InterfaceC2522l.f5350l, new C7584l(i7));
        int i8 = 11;
        map.put(InterfaceC2522l.f5394l, new C7584l(i8));
        map.put(InterfaceC2522l.f5412l, new C7584l(i8));
        map.put(InterfaceC2522l.f5400l, new C7584l(i8));
        map.put(InterfaceC2522l.f5425l, new C7584l(i8));
        map.put(InterfaceC2522l.f5426l, new C7584l(i8));
        map.put(InterfaceC2522l.f5375l, new C7584l(i8));
        int i9 = 18;
        map.put(InterfaceC2522l.f5406l, new C7584l(i9));
        map.put(InterfaceC2522l.f5445l, new C7584l(i9));
        map.put(InterfaceC2522l.f5348l, new C7584l(i9));
        map.put(InterfaceC2522l.f5397l, new C7584l(i9));
        map.put(InterfaceC2522l.f5475l, new C7584l(i9));
        map.put(InterfaceC2522l.f5461l, new C7584l(i9));
        int i10 = 7;
        map.put(InterfaceC8134l.f16997transient, new C7584l(i10));
        map.put(InterfaceC8134l.f16986protected, new C7584l(i10));
        map.put(InterfaceC8134l.f17000while, new C7584l(i10));
        map.put(InterfaceC8134l.f16951implements, new C7584l(i10));
        map.put(InterfaceC8134l.f16942const, new C7584l(i10));
        map.put(InterfaceC8134l.f16988return, new C7584l(i10));
        int i11 = 2;
        map.put(InterfaceC2522l.f5453l, new C7584l(i11));
        map.put(InterfaceC2522l.f5455l, new C7584l(i11));
        map.put(InterfaceC2522l.f5346l, new C7584l(i11));
        map.put(InterfaceC2522l.f5435l, new C7584l(i11));
        map.put(InterfaceC2522l.f5432l, new C7584l(i11));
        map.put(InterfaceC2522l.f5384l, new C7584l(i11));
        int i12 = 0;
        map.put(InterfaceC2522l.f5454l, new C7584l(i12));
        map.put(InterfaceC2522l.f5423l, new C7584l(i12));
        map.put(InterfaceC2522l.f5440l, new C7584l(i12));
        int i13 = 5;
        map.put(InterfaceC2522l.f5476l, new C7584l(i13));
        map.put(InterfaceC2522l.f5473l, new C7584l(i13));
        map.put(InterfaceC2522l.f5361l, new C7584l(i13));
        int i14 = 15;
        map.put(InterfaceC2522l.f5450l, new C7584l(i14));
        map.put(InterfaceC2522l.f5391l, new C7584l(i14));
        map.put(InterfaceC2522l.f5392l, new C7584l(i14));
        map.put(InterfaceC2522l.f5360l, new C7584l(i14));
        map.put(InterfaceC2522l.f5376l, new C7584l(i14));
        map.put(InterfaceC2522l.f5398l, new C7584l(i14));
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16981l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16967l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16980l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16978l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16961l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16959l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16979l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16971l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16972l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16955l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16957l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16975l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16976l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16956l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16970l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16969l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16963l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16973l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16974l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16964l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16965l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16960l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16962l);
        AbstractC4338l.appmetrica(map, InterfaceC8134l.f16966l);
        int i15 = 9;
        map.put(InterfaceC2522l.f5477l, new C7584l(i15));
        map.put(InterfaceC2522l.f5420l, new C7584l(i15));
        map.put(InterfaceC2522l.f5446l, new C7584l(i15));
        map.put(InterfaceC2522l.f5336l, new C7584l(i15));
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5478l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5402l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5370l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5340l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5407l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5378l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5427l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5483l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5430l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5362l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5377l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5364l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5433l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5410l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5428l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5337l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5390l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5369l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5341l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5436l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5393l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5465l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5429l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5382l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5352l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5399l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5466l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5414l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5344l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5443l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5345l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5366l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5474l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5367l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5452l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5395l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5379l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5383l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5418l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5354l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5457l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5416l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5368l);
        AbstractC4338l.m1534strictfp(map, InterfaceC2522l.f5357l);
        int i16 = 12;
        map.put(InterfaceC2522l.f5411l, new C7584l(i16));
        map.put(InterfaceC2522l.f5460l, new C7584l(i16));
        map.put(InterfaceC2522l.f5442l, new C7584l(i16));
    }

    public static AbstractC8831l yandex(C17029l c17029l) throws IOException {
        AbstractC8831l c7006l;
        AbstractC8831l abstractC8831lYandex;
        AbstractC8831l c7006l2;
        Cthrow cthrowPremium = null;
        cthrowPremium = null;
        if (c17029l == null) {
            C8339l.metrica("keyInfo argument null");
            return null;
        }
        C10198l c10198l = c17029l.f33175l;
        C7584l c7584l = (C7584l) yandex.get(c10198l.f20787l);
        if (c7584l == null) {
            C11467l.smaato(c10198l.f20787l, "algorithm identifier in public key not recognised: ");
            return null;
        }
        switch (c7584l.yandex) {
            case 0:
                try {
                    c7006l = new C13781l((C13523l) AbstractC3983l.premium.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                    return c7006l;
                } catch (Exception unused) {
                    c7006l2 = new C13781l((C13523l) AbstractC3983l.premium.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case 1:
                try {
                    c7006l = new C13410l((C6801l) AbstractC3983l.vip.get(c17029l.f33175l.f20787l), AbstractC14024l.crashlytics(C3967l.vip(c17029l.metrica()).f8150l));
                    return c7006l;
                } catch (Exception unused2) {
                    c7006l2 = new C13410l((C6801l) AbstractC3983l.vip.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case 2:
                return C7584l.yandex((C18260l) AbstractC3983l.isVip.get(c17029l.f33175l.f20787l), c17029l.f33174l);
            case 3:
                byte[] bArrInmobi = c17029l.f33174l.inmobi();
                c7006l2 = new C9841l((C1738l) AbstractC3983l.tapsense.get(c17029l.f33175l.f20787l), AbstractC14024l.vip(1, bArrInmobi.length, bArrInmobi));
                return c7006l2;
            case 4:
                byte[] bArr = Cthrow.premium(c17029l.metrica()).f36593l;
                C14928l c14928l = new C14928l((C10512l) AbstractC3983l.isPro.get(c17029l.f33175l.f20787l), false);
                c14928l.f29381l = AbstractC14024l.crashlytics(bArr);
                c7006l2 = c14928l;
                return c7006l2;
            case 5:
                try {
                    c7006l = new C7006l((C17145l) AbstractC3983l.appmetrica.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                    return c7006l;
                } catch (Exception unused3) {
                    c7006l2 = new C7006l((C17145l) AbstractC3983l.appmetrica.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case 6:
                byte[] bArrInmobi2 = c17029l.f33174l.inmobi();
                Cthrow cthrow = (Cthrow) AbstractC3983l.crashlytics(bArrInmobi2);
                abstractC8831lYandex = cthrow != null ? C15082l.yandex(cthrow.f36593l) : C15082l.yandex(bArrInmobi2);
                return abstractC8831lYandex;
            case 7:
                return C7584l.loadAd((C11196l) AbstractC3983l.f8186volatile.get(c17029l.f33175l.f20787l), c17029l.f33174l);
            case 8:
                c7006l2 = new C18547l((C8719l) AbstractC3983l.f8183synchronized.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                return c7006l2;
            case 9:
                c7006l2 = new C17099l((C15183l) AbstractC3983l.f8178for.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case 10:
                return new C17794l(c17029l.f33174l.applovin());
            case 11:
                c7006l2 = new C7889l((C9818l) AbstractC3983l.license.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case 12:
                c7006l2 = new C17089l((C0326l) AbstractC3983l.f8174case.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case 13:
                advert advertVar = c17029l.f33174l;
                C10198l c10198l2 = c17029l.f33175l;
                byte[] bArrInmobi3 = advertVar.inmobi();
                if (!AbstractC3983l.loadAd(bArrInmobi3) && bArrInmobi3[0] == 4) {
                    cthrowPremium = Cthrow.premium(bArrInmobi3);
                }
                if (cthrowPremium == null) {
                    return new C18069l((C11258l) AbstractC3983l.ads.get(c10198l2.f20787l), bArrInmobi3);
                }
                c7006l2 = new C18069l((C11258l) AbstractC3983l.ads.get(c10198l2.f20787l), cthrowPremium.f36593l);
                return c7006l2;
            case 14:
                c7006l2 = new C17871l((C17615l) AbstractC3983l.admob.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case 15:
                byte[] bArr2 = Cthrow.premium(c17029l.metrica()).f36593l;
                C9566l c9566l = (C9566l) AbstractC3983l.f8185throws.get(c17029l.f33175l.f20787l);
                C6197l c6197l = new C6197l(false, c9566l);
                int i = c9566l.f19498l;
                int i2 = c9566l.f19500l;
                int i3 = c9566l.f19502l;
                int i4 = c9566l.f19503l;
                int i5 = c9566l.f19499l;
                Class cls = Short.TYPE;
                if (i5 == 1) {
                    c6197l.f13065l = (short[][][]) Array.newInstance((Class<?>) cls, i3, i4, i4);
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        for (int i8 = 0; i8 < i4; i8++) {
                            for (int i9 = 0; i9 < i3; i9++) {
                                short[][][] sArr = c6197l.f13065l;
                                if (i7 > i8) {
                                    sArr[i9][i7][i8] = 0;
                                } else {
                                    sArr[i9][i7][i8] = (short) (bArr2[i6] & 255);
                                    i6++;
                                }
                            }
                        }
                    }
                } else {
                    c6197l.f13069l = AbstractC14024l.vip(0, 32, bArr2);
                    short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) cls, i2, c9566l.f19501l, i);
                    c6197l.f13068l = sArr2;
                    short[][][] sArr3 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i2, i2);
                    c6197l.f13071l = sArr3;
                    short[][][] sArr4 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i2, i);
                    c6197l.f13066l = sArr4;
                    short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i, i);
                    c6197l.f13067l = sArr5;
                    short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i, i, i);
                    c6197l.f13070l = sArr6;
                    int iSmaato = AbstractC3206l.smaato(sArr2, bArr2, 32, false) + 32;
                    int iSmaato2 = AbstractC3206l.smaato(sArr3, bArr2, iSmaato, true) + iSmaato;
                    int iSmaato3 = AbstractC3206l.smaato(sArr4, bArr2, iSmaato2, false) + iSmaato2;
                    int iSmaato4 = AbstractC3206l.smaato(sArr5, bArr2, iSmaato3, true) + iSmaato3;
                    if (AbstractC3206l.smaato(sArr6, bArr2, iSmaato4, true) + iSmaato4 != bArr2.length) {
                        C8339l.metrica("unparsed data in key encoding");
                        return null;
                    }
                }
                return c6197l;
            case 16:
                c7006l2 = new C9355l((C15401l) AbstractC3983l.smaato.get(c17029l.f33175l.f20787l), Cthrow.premium(Cclass.inmobi(c17029l.metrica()).mo173throws(0)).f36593l);
                return c7006l2;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                try {
                    byte[] bArr3 = Cthrow.premium(c17029l.metrica()).f36593l;
                    c7006l = new C8703l((C7951l) AbstractC3983l.f8181private.get(c17029l.f33175l.f20787l), AbstractC14024l.vip(4, bArr3.length, bArr3));
                    return c7006l;
                } catch (Exception unused4) {
                    c7006l2 = new C8703l((C7951l) AbstractC3983l.f8181private.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                c7006l2 = new C8385l((C7684l) AbstractC3983l.ad.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13596l(AbstractC3983l.purchase(C18507l.vip(c17029l.f33175l.f20786l)), c17029l.f33174l.applovin());
            case 20:
                try {
                    byte[] bArr4 = Cthrow.premium(c17029l.metrica()).f36593l;
                    c7006l = new C0856l((C18535l) AbstractC3983l.startapp.get(c17029l.f33175l.f20787l), AbstractC14024l.vip(4, bArr4.length, bArr4));
                    return c7006l;
                } catch (Exception unused5) {
                    c7006l2 = new C0856l((C18535l) AbstractC3983l.startapp.get(c17029l.f33175l.f20787l), c17029l.f33174l.inmobi());
                }
                break;
            case 21:
                c7006l2 = new C6676l((C3125l) AbstractC3983l.f8175catch.get(c17029l.f33175l.f20787l), Cthrow.premium(c17029l.metrica()).f36593l);
                return c7006l2;
            case 22:
                C12115l c12115lVip = C12115l.vip(c17029l.f33175l.f20786l);
                if (c12115lVip == null) {
                    byte[] bArr5 = Cthrow.premium(c17029l.metrica()).f36593l;
                    C7502l c7502l = new C7502l((C15980l) C15980l.admob.get(Integer.valueOf(AbstractC10000l.yandex(0, bArr5))));
                    c7502l.f15512l = AbstractC4047l.crashlytics(bArr5);
                    abstractC8831lYandex = new C1671l(c7502l);
                    return abstractC8831lYandex;
                }
                Cfor cfor = c12115lVip.f24092l.f20787l;
                Ccase ccaseMetrica = c17029l.metrica();
                C15142l c15142l = ccaseMetrica != null ? new C15142l(Cclass.inmobi(ccaseMetrica)) : null;
                C7502l c7502l2 = new C7502l(new C15980l(c12115lVip.f24093l, AbstractC3983l.yandex(cfor)));
                c7502l2.f15509l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15142l.f29695l));
                c7502l2.f15510l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15142l.f29694l));
                return new C1671l(c7502l2);
            default:
                C13700l c13700lVip = C13700l.vip(c17029l.f33175l.f20786l);
                if (c13700lVip == null) {
                    byte[] bArr6 = Cthrow.premium(c17029l.metrica()).f36593l;
                    C1381l c1381l = new C1381l((C15509l) C15509l.purchase.get(Integer.valueOf(AbstractC10000l.yandex(0, bArr6))));
                    c1381l.f3514l = AbstractC4047l.crashlytics(bArr6);
                    abstractC8831lYandex = new C4492l(c1381l);
                    return abstractC8831lYandex;
                }
                Cfor cfor2 = c13700lVip.f26757l.f20787l;
                Ccase ccaseMetrica2 = c17029l.metrica();
                C15142l c15142l2 = ccaseMetrica2 != null ? new C15142l(Cclass.inmobi(ccaseMetrica2)) : null;
                C1381l c1381l2 = new C1381l(new C15509l(c13700lVip.f26755l, c13700lVip.f26754l, AbstractC3983l.yandex(cfor2)));
                c1381l2.f3511l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15142l2.f29695l));
                c1381l2.f3512l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15142l2.f29694l));
                return new C4492l(c1381l2);
        }
    }
}
