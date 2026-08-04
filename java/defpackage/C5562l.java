package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lٌؘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5562l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11843l;

    public /* synthetic */ C5562l(int i) {
        this.f11843l = i;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x02ec  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        C11244l c11244lLoadAd;
        C14264l c14264l;
        int i = 15;
        switch (this.f11843l) {
            case 0:
                ((Float) obj).floatValue();
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).intValue();
                return AbstractC3618l.yandex;
            case 2:
                return Unit.INSTANCE;
            case 3:
                C14078l c14078l = (C14078l) obj;
                String str = c14078l.mopub.f7563l;
                long j = c14078l.billing;
                int i2 = C12814l.crashlytics;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    C12304l c12304lAmazon = AbstractC9679l.amazon();
                    if (c12304lAmazon != null) {
                        int iLoadAd = c12304lAmazon.loadAd(str, i3 - 1);
                        if (iLoadAd >= 0) {
                            iOffsetByCodePoints = iLoadAd;
                        } else if (i3 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                        }
                    } else if (i3 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C12066l(((int) (c14078l.billing & 4294967295L)) - iOffsetByCodePoints, 0);
            case 4:
                C14078l c14078l2 = (C14078l) obj;
                String str2 = c14078l2.mopub.f7563l;
                long j2 = c14078l2.billing;
                int i4 = C12814l.crashlytics;
                int iYandex = AbstractC9679l.yandex((int) (j2 & 4294967295L), str2);
                if (iYandex != -1) {
                    return new C12066l(0, iYandex - ((int) (c14078l2.billing & 4294967295L)));
                }
                return null;
            case 5:
                C14078l c14078l3 = (C14078l) obj;
                Integer numPurchase = c14078l3.purchase();
                if (numPurchase == null) {
                    return null;
                }
                int iIntValue = numPurchase.intValue();
                long j3 = c14078l3.billing;
                int i5 = C12814l.crashlytics;
                return new C12066l(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 6:
                C14078l c14078l4 = (C14078l) obj;
                Integer numAmazon = c14078l4.amazon();
                if (numAmazon == null) {
                    return null;
                }
                int iIntValue2 = numAmazon.intValue();
                long j4 = c14078l4.billing;
                int i6 = C12814l.crashlytics;
                return new C12066l(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 7:
                C14078l c14078l5 = (C14078l) obj;
                Integer numCrashlytics = c14078l5.crashlytics();
                if (numCrashlytics == null) {
                    return null;
                }
                int iIntValue3 = numCrashlytics.intValue();
                long j5 = c14078l5.billing;
                int i7 = C12814l.crashlytics;
                return new C12066l(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 8:
                C14078l c14078l6 = (C14078l) obj;
                Integer numLoadAd = c14078l6.loadAd();
                if (numLoadAd == null) {
                    return null;
                }
                int iIntValue4 = numLoadAd.intValue();
                long j6 = c14078l6.billing;
                int i8 = C12814l.crashlytics;
                return new C12066l(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 9:
                List list = (List) obj;
                return new C15271l(((Boolean) list.get(1)).booleanValue() ? EnumC7283l.f15126l : EnumC7283l.f15125l, ((Float) list.get(0)).floatValue());
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Boolean.valueOf(((C8896l) obj) == null);
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                ((C6148l) obj).mopub(1);
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                ((C6148l) obj).mopub(1);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15012l c15012l = (C15012l) obj;
                Object obj2 = c15012l.yandex;
                if (!(obj2 instanceof AbstractC12494l) || (c11244lLoadAd = ((AbstractC12494l) obj2).loadAd()) == null || (c11244lLoadAd.yandex == null && c11244lLoadAd.loadAd == null && c11244lLoadAd.crashlytics == null && c11244lLoadAd.amazon == null)) {
                    return AbstractC14055l.crashlytics(c15012l);
                }
                C11244l c11244lLoadAd2 = ((AbstractC12494l) c15012l.yandex).loadAd();
                if (c11244lLoadAd2 == null || (c14264l = c11244lLoadAd2.yandex) == null) {
                    c14264l = new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return AbstractC14055l.crashlytics(c15012l, new C15012l(c14264l, c15012l.loadAd, c15012l.crashlytics));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C4707l c4707l = AbstractC0424l.premium;
                Unit unit = Unit.INSTANCE;
                ((InterfaceC17593l) obj).amazon(c4707l, unit);
                return unit;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((MainArtist) obj).crashlytics;
            case 20:
                ((C1336l) obj).firebase(EnumC14530l.f28448l.pro(), null, new C2911l(i), new C15578l(802480018, true, new C5251l()));
                return Unit.INSTANCE;
            case 21:
                List list2 = (List) obj;
                return new C6935l(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Boolean.valueOf(((InterfaceC14742l) obj).mo827l());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC14742l interfaceC14742l = (InterfaceC14742l) obj;
                C4344l c4344l = new C4344l();
                while (interfaceC14742l.mo827l()) {
                    c4344l.add(Integer.valueOf((int) interfaceC14742l.getLong(0)));
                }
                return AbstractC9905l.yandex(c4344l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6099l c6099l = (C6099l) obj;
                AbstractC4338l.m1533private(c6099l, new C5562l(26));
                C18396l c18396l = c6099l.yandex;
                C8298l c8298l = InterfaceC6407l.yandex;
                long j7 = C9735l.loadAd;
                c18396l.f35933l = C0820l.yandex((C0820l) c18396l.f35933l, AbstractC5711l.subs(j7), null, 14);
                c18396l.f35933l = C0820l.yandex((C0820l) c18396l.f35933l, null, AbstractC5711l.subs(j7), 7);
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C18677l c18677l = (C18677l) obj;
                C10560l c10560l = InterfaceC3538l.f7432l;
                c18677l.yandex(new C10975l(22));
                C4887l c4887l = InterfaceC1519l.f3792l;
                c18677l.loadAd(new C16543l((byte) 0, 23));
                c18677l.crashlytics(new C7112l(1.0f, true, true, true, true));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C1336l) obj).firebase(15, null, C1490l.f3707l, AbstractC8182l.loadAd);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6099l c6099l2 = (C6099l) obj;
                AbstractC4338l.m1533private(c6099l2, new C5562l(29));
                C18396l c18396l2 = c6099l2.yandex;
                C8298l c8298l2 = InterfaceC6407l.yandex;
                long j8 = C9735l.loadAd;
                c18396l2.f35933l = C0820l.yandex((C0820l) c18396l2.f35933l, AbstractC5711l.subs(j8), null, 14);
                c18396l2.f35933l = C0820l.yandex((C0820l) c18396l2.f35933l, null, AbstractC5711l.subs(j8), 7);
                Unit unit3 = Unit.INSTANCE;
                return Unit.INSTANCE;
            default:
                C18677l c18677l2 = (C18677l) obj;
                C10560l c10560l2 = InterfaceC3538l.f7432l;
                c18677l2.yandex(new C10975l(22));
                C4887l c4887l2 = InterfaceC1519l.f3792l;
                c18677l2.loadAd(new C16543l((byte) 0, 23));
                c18677l2.crashlytics(new C7112l(1.0f, true, true, true, true));
                return Unit.INSTANCE;
        }
    }
}
