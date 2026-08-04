package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍۧٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9966l {
    public static final C18396l Signature(C18092l c18092l, C7403l c7403l) {
        C18396l c18396l = new C18396l(2);
        int i = c18092l.f35378l;
        C18128l c18128lMopub = null;
        if ((c18092l.f35381l & 4) == 4) {
            EnumC16055l enumC16055l = c18092l.f35384l;
            if (enumC16055l == null) {
                C8339l.metrica("Required value was null.");
                return null;
            }
            int iOrdinal = enumC16055l.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                C18725l.billing();
                return null;
            }
        }
        C14965l c14965l = (C14965l) c7403l.f15341l;
        int i2 = c18092l.f35381l;
        if ((i2 & 8) == 8) {
            c18128lMopub = c18092l.f35387l;
        } else if ((i2 & 16) == 16) {
            c18128lMopub = c14965l.mopub(c18092l.f35379l);
        }
        if (c18128lMopub != null) {
            advert(c18128lMopub, c7403l);
        }
        List list = c18092l.f35380l;
        ArrayList arrayList = (ArrayList) c18396l.f35934l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Signature((C18092l) it.next(), c7403l));
        }
        List list2 = c18092l.f35386l;
        ArrayList arrayList2 = (ArrayList) c18396l.f35933l;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Signature((C18092l) it2.next(), c7403l));
        }
        return c18396l;
    }

    public static final C6084l ad(C13146l c13146l, C7403l c7403l) {
        ArrayList arrayList;
        C6084l c6084l = new C6084l(c13146l.f25731l, (c13146l.f25716l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? c13146l.f25725l : admob(c13146l.f25731l), (c13146l.f25716l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512 ? c13146l.f25740l : admob(c13146l.f25731l), ((InterfaceC3588l) c7403l.f15342l).getString(c13146l.f25736l));
        C7403l c7403lBilling = c7403l.billing(c13146l.f25735l);
        C14965l c14965l = (C14965l) c7403lBilling.f15341l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403lBilling.f15342l;
        Iterator it = c13146l.f25735l.iterator();
        while (it.hasNext()) {
            c6084l.purchase.add(isVip((C17586l) it.next(), c7403lBilling));
        }
        C18128l c18128lAdmob = AbstractC7310l.admob(c13146l, c14965l);
        c6084l.billing = c18128lAdmob != null ? advert(c18128lAdmob, c7403lBilling) : null;
        Iterator it2 = c13146l.f25729l.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = c6084l.admob;
            if (!zHasNext) {
                break;
            }
            arrayList.add(signatures((C18426l) it2.next(), c7403lBilling));
        }
        if (c13146l.f25729l.isEmpty() && !c13146l.f25734l.isEmpty()) {
            Iterator it3 = AbstractC7310l.crashlytics(c13146l, c14965l).iterator();
            while (it3.hasNext()) {
                C4258l c4258lAdvert = advert((C18128l) it3.next(), c7403lBilling);
                C13565l c13565l = new C13565l(0, "_");
                c13565l.crashlytics = c4258lAdvert;
                arrayList.add(c13565l);
            }
        }
        if ((c13146l.f25716l & 128) == 128) {
            c6084l.subs = signatures(c13146l.f25721l, c7403lBilling);
        }
        c6084l.isPro = advert(AbstractC7310l.isPro(c13146l, c14965l), c7403lBilling);
        Iterator it4 = c13146l.f25724l.iterator();
        while (it4.hasNext()) {
            c6084l.firebase.add(adcel(((Integer) it4.next()).intValue(), c7403lBilling));
        }
        for (C4987l c4987l : c13146l.f25719l) {
            c6084l.smaato.put(interfaceC3588l.getString(c4987l.f10219l), c4987l.f10223l.Signature());
        }
        Iterator it5 = ((List) c7403lBilling.f15338l).iterator();
        while (it5.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it5.next())).getClass();
            C4954l c4954lAdmob = AbstractC10565l.admob(c6084l);
            Iterator it6 = c13146l.f25718l.iterator();
            while (it6.hasNext()) {
                c6084l.remoteconfig.add(AbstractC17082l.mopub((C7899l) it6.next(), interfaceC3588l));
            }
            List list = c13146l.f25714l;
            ArrayList arrayList2 = c6084l.crashlytics.loadAd;
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList2.add(AbstractC17082l.mopub((C7899l) it7.next(), interfaceC3588l));
            }
            C8230l c8230l = c6084l.amazon;
            if (c8230l != null) {
                List list2 = c13146l.f25741l;
                ArrayList arrayList3 = c8230l.loadAd;
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(AbstractC17082l.mopub((C7899l) it8.next(), interfaceC3588l));
                }
            }
            Iterator it9 = c13146l.f25722l.iterator();
            while (it9.hasNext()) {
                c6084l.mopub.add(AbstractC17082l.mopub((C7899l) it9.next(), interfaceC3588l));
            }
            Iterator it10 = c13146l.f25727l.iterator();
            while (it10.hasNext()) {
                c6084l.vip.add(AbstractC17082l.mopub((C7899l) it10.next(), interfaceC3588l));
            }
            Iterator it11 = c13146l.f25733l.iterator();
            while (it11.hasNext()) {
                c6084l.metrica.add(AbstractC17082l.mopub((C7899l) it11.next(), interfaceC3588l));
            }
            C3429l c3429l = C11682l.yandex;
            C10728l c10728lLoadAd = C11682l.loadAd(c13146l, interfaceC3588l, c14965l, true);
            C10459l c10459l = (C10459l) AbstractC0714l.loadAd(c13146l, AbstractC8450l.amazon);
            C6431l c6431l = (c10459l == null || !c10459l.subs()) ? null : c10459l.f21281l;
            C6431l c6431l2 = (c10459l == null || (c10459l.f21279l & 8) != 8) ? null : c10459l.f21284l;
            c4954lAdmob.yandex = ((Number) c13146l.firebase(AbstractC8450l.purchase)).intValue();
            c4954lAdmob.loadAd = c10728lLoadAd != null ? new C3827l(c10728lLoadAd.loadAd, c10728lLoadAd.crashlytics) : null;
            c4954lAdmob.crashlytics = c6431l != null ? new C1559l(interfaceC3588l.getString(c6431l.f13452l), interfaceC3588l.getString(c6431l.f13456l)) : null;
            c4954lAdmob.amazon = c6431l2 != null ? new C1559l(interfaceC3588l.getString(c6431l2.f13452l), interfaceC3588l.getString(c6431l2.f13456l)) : null;
            C6431l c6431l3 = (c10459l == null || (c10459l.f21279l & 2) != 2) ? null : c10459l.f21282l;
            if (c6431l3 != null) {
                interfaceC3588l.getString(c6431l3.f13452l);
                interfaceC3588l.getString(c6431l3.f13456l);
            }
            C6431l c6431l4 = (c10459l == null || (c10459l.f21279l & 16) != 16) ? null : c10459l.f21277l;
            c4954lAdmob.purchase = c6431l4 != null ? new C1559l(interfaceC3588l.getString(c6431l4.f13452l), interfaceC3588l.getString(c6431l4.f13456l)) : null;
        }
        return c6084l;
    }

    public static final C1577l adcel(int i, C7403l c7403l) {
        C10008l c10008l;
        int i2;
        C9598l c9598l;
        int i3;
        int i4 = 1;
        C1577l c1577l = new C1577l(i4);
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403l.f15342l;
        C3617l c3617l = (C3617l) AbstractC16901l.m4220for(i, ((C5557l) c7403l.f15343l).yandex);
        C10008l c10008l2 = C10008l.amazon;
        if (c3617l == null) {
            c9598l = null;
        } else {
            Integer numValueOf = (c3617l.f7544l & 1) == 1 ? Integer.valueOf(c3617l.f7541l) : null;
            Integer numValueOf2 = (c3617l.f7544l & 2) == 2 ? Integer.valueOf(c3617l.f7548l) : null;
            if (numValueOf2 != null) {
                c10008l = new C10008l(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                c10008l = numValueOf != null ? new C10008l(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : c10008l2;
            }
            int iOrdinal = c3617l.f7547l.ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else if (iOrdinal == 1) {
                i2 = 2;
            } else {
                if (iOrdinal != 2) {
                    C18725l.billing();
                    return null;
                }
                i2 = 3;
            }
            c9598l = new C9598l(c10008l, c3617l.f7543l, i2, (c3617l.f7544l & 8) == 8 ? Integer.valueOf(c3617l.f7550l) : null, (c3617l.f7544l & 16) == 16 ? interfaceC3588l.getString(c3617l.f7542l) : null);
        }
        if (c9598l == null && !c7403l.f15339l) {
            throw new C14612l("No VersionRequirement with the given id in the table", null);
        }
        EnumC7053l enumC7053l = c9598l != null ? (EnumC7053l) c9598l.f19553l : null;
        int i5 = enumC7053l == null ? -1 : AbstractC14999l.yandex[enumC7053l.ordinal()];
        if (i5 == -1) {
            i3 = 4;
        } else if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else {
            if (i5 != 3) {
                C18725l.billing();
                return null;
            }
            i3 = 3;
        }
        int i6 = c9598l != null ? c9598l.f19550l : 0;
        int i7 = i6 == 0 ? -1 : AbstractC14999l.loadAd[AbstractC5020l.inmobi(i6)];
        if (i7 == -1) {
            i4 = 3;
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    C18725l.billing();
                    return null;
                }
                i4 = 3;
            } else {
                i4 = 2;
            }
        }
        c1577l.f3898l = i3;
        c1577l.f3897l = i4;
        c1577l.f3901l = c9598l != null ? (Integer) c9598l.f19552l : null;
        c1577l.f3900l = c9598l != null ? (String) c9598l.f19554l : null;
        if (c9598l != null) {
            c10008l2 = (C10008l) c9598l.f19549l;
        }
        c1577l.f3902l = new C14418l(c10008l2.yandex, c10008l2.loadAd, c10008l2.crashlytics);
        return c1577l;
    }

    public static final int admob(int i) {
        return AbstractC1305l.loadAd(AbstractC1305l.crashlytics.purchase(i).booleanValue(), (EnumC3338l) AbstractC1305l.amazon.purchase(i), (EnumC4183l) AbstractC1305l.purchase.purchase(i));
    }

    public static int ads(long j) {
        if (j > 2147483647L) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }

    public static final C4258l advert(C18128l c18128l, C7403l c7403l) {
        AbstractC13573l c13960l;
        int i;
        C14965l c14965l = (C14965l) c7403l.f15341l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403l.f15342l;
        C4258l c4258l = new C4258l((c18128l.f35433l ? 1 : 0) + (c18128l.f35430l << 1));
        C4057l c4057l = null;
        if (c18128l.startapp()) {
            c13960l = new C0658l(AbstractC17082l.purchase(interfaceC3588l, c18128l.f35436l));
        } else {
            int i2 = c18128l.f35423l;
            if ((i2 & 128) == 128) {
                c13960l = new C16288l(AbstractC17082l.purchase(interfaceC3588l, c18128l.f35435l));
            } else if ((i2 & 32) == 32) {
                c13960l = new C13960l(c18128l.f35431l);
            } else {
                if ((i2 & 64) != 64) {
                    throw new C14612l("No classifier (class, type alias or type parameter) recorded for Type", null);
                }
                Integer numCrashlytics = c7403l.crashlytics(c18128l.f35438l);
                if (numCrashlytics == null) {
                    throw new C14612l("No type parameter id for " + interfaceC3588l.getString(c18128l.f35438l), null);
                }
                c13960l = new C13960l(numCrashlytics.intValue());
            }
        }
        c4258l.loadAd = c13960l;
        for (C16093l c16093l : c18128l.f35434l) {
            EnumC14176l enumC14176l = c16093l.f31533l;
            if (enumC14176l == null) {
                C8339l.metrica("Required value was null.");
                return null;
            }
            int iOrdinal = enumC14176l.ordinal();
            if (iOrdinal != 0) {
                i = 3;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 1;
                    } else {
                        if (iOrdinal != 3) {
                            C18725l.billing();
                            return null;
                        }
                        i = 0;
                    }
                }
            } else {
                i = 2;
            }
            ArrayList arrayList = c4258l.crashlytics;
            if (i != 0) {
                int i3 = c16093l.f31535l;
                C18128l c18128lMopub = (i3 & 2) == 2 ? c16093l.f31538l : (i3 & 4) == 4 ? c14965l.mopub(c16093l.f31537l) : null;
                if (c18128lMopub == null) {
                    throw new C14612l("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new C2440l(i, advert(c18128lMopub, c7403l)));
            } else {
                arrayList.add(C2440l.crashlytics);
            }
        }
        int i4 = c18128l.f35423l;
        C18128l c18128lMopub2 = (i4 & 1024) == 1024 ? c18128l.f35432l : (i4 & 2048) == 2048 ? c14965l.mopub(c18128l.f35427l) : null;
        c4258l.amazon = c18128lMopub2 != null ? advert(c18128lMopub2, c7403l) : null;
        C18128l c18128lBilling = AbstractC7310l.billing(c18128l, c14965l);
        c4258l.purchase = c18128lBilling != null ? advert(c18128lBilling, c7403l) : null;
        int i5 = c18128l.f35423l;
        C18128l c18128lMopub3 = (i5 & 4) == 4 ? c18128l.f35424l : (i5 & 8) == 8 ? c14965l.mopub(c18128l.f35426l) : null;
        if (c18128lMopub3 != null) {
            C4258l c4258lAdvert = advert(c18128lMopub3, c7403l);
            String string = (c18128l.f35423l & 2) == 2 ? interfaceC3588l.getString(c18128l.f35437l) : null;
            C4057l c4057l2 = new C4057l();
            c4057l2.yandex = c4258lAdvert;
            c4057l2.loadAd = string;
            c4057l = c4057l2;
        }
        c4258l.billing = c4057l;
        Iterator it = ((List) c7403l.f15338l).iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            C10005l c10005l = (C10005l) AbstractC11048l.amazon(c4258l.mopub, C10005l.crashlytics);
            c10005l.yandex = ((Boolean) c18128l.firebase(AbstractC8450l.billing)).booleanValue();
            Iterator it2 = c18128l.f35440l.iterator();
            while (it2.hasNext()) {
                c10005l.loadAd.add(AbstractC17082l.mopub((C7899l) it2.next(), interfaceC3588l));
            }
        }
        return c4258l;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer applovin(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = AbstractC7746l.yandex[cCharAt];
                } else {
                    byte[] bArr = AbstractC7746l.yandex;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = AbstractC7746l.yandex[cCharAt2];
                        } else {
                            byte[] bArr2 = AbstractC7746l.yandex;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static final void appmetrica(InterfaceC7103l interfaceC7103l, List list, List list2, List list3, C7403l c7403l) {
        C18128l c18128lMopub;
        C18128l c18128lMopub2;
        ArrayList arrayListLoadAd = interfaceC7103l.loadAd();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListLoadAd.add(license((C14036l) it.next(), c7403l));
        }
        ArrayList arrayListYandex = interfaceC7103l.yandex();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListYandex.add(ad((C13146l) it2.next(), c7403l));
        }
        ArrayList arrayListCrashlytics = interfaceC7103l.crashlytics();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C1512l c1512l = (C1512l) it3.next();
            int i = c1512l.f3776l;
            ((InterfaceC3588l) c7403l.f15342l).getString(c1512l.f3775l);
            C2001l c2001l = new C2001l(i);
            C7403l c7403lBilling = c7403l.billing(c1512l.f3779l);
            InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403lBilling.f15342l;
            C14965l c14965l = (C14965l) c7403lBilling.f15341l;
            Iterator it4 = c1512l.f3779l.iterator();
            while (it4.hasNext()) {
                c2001l.loadAd.add(isVip((C17586l) it4.next(), c7403lBilling));
            }
            int i2 = c1512l.f3769l;
            if ((i2 & 4) == 4) {
                c18128lMopub = c1512l.f3770l;
            } else {
                if ((i2 & 8) != 8) {
                    C8339l.smaato("No underlyingType in ProtoBuf.TypeAlias");
                    return;
                }
                c18128lMopub = c14965l.mopub(c1512l.f3771l);
            }
            advert(c18128lMopub, c7403lBilling);
            int i3 = c1512l.f3769l;
            if ((i3 & 16) == 16) {
                c18128lMopub2 = c1512l.f3778l;
            } else {
                if ((i3 & 32) != 32) {
                    C8339l.smaato("No expandedType in ProtoBuf.TypeAlias");
                    return;
                }
                c18128lMopub2 = c14965l.mopub(c1512l.f3773l);
            }
            advert(c18128lMopub2, c7403lBilling);
            Iterator it5 = c1512l.f3780l.iterator();
            while (it5.hasNext()) {
                c2001l.crashlytics.add(AbstractC17082l.mopub((C7899l) it5.next(), interfaceC3588l));
            }
            Iterator it6 = c1512l.f3777l.iterator();
            while (it6.hasNext()) {
                c2001l.amazon.add(adcel(((Integer) it6.next()).intValue(), c7403lBilling));
            }
            for (C4987l c4987l : c1512l.f3768l) {
                c2001l.purchase.put(interfaceC3588l.getString(c4987l.f10219l), c4987l.f10223l.Signature());
            }
            Iterator it7 = ((List) c7403lBilling.f15338l).iterator();
            while (it7.hasNext()) {
                ((InterfaceC12157l) it7.next()).getClass();
            }
            arrayListCrashlytics.add(c2001l);
        }
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, C6523l c6523l) {
        return interfaceC17242l.premium(new C5264l(c6523l));
    }

    public static int firebase(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final C0581l isVip(C17586l c17586l, C7403l c7403l) {
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403l.f15342l;
        EnumC1630l enumC1630l = c17586l.f34238l;
        if (enumC1630l == null) {
            C8339l.metrica("Required value was null.");
            return null;
        }
        int iOrdinal = enumC1630l.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 3;
            } else {
                if (iOrdinal != 2) {
                    C18725l.billing();
                    return null;
                }
                i = 1;
            }
        }
        boolean z = c17586l.f34246l;
        C0581l c0581l = new C0581l(z ? 1 : 0, c17586l.f34243l, i, interfaceC3588l.getString(c17586l.f34242l));
        Iterator it = AbstractC7310l.remoteconfig(c17586l, (C14965l) c7403l.f15341l).iterator();
        while (it.hasNext()) {
            c0581l.purchase.add(advert((C18128l) it.next(), c7403l));
        }
        Iterator it2 = ((List) c7403l.f15338l).iterator();
        while (it2.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it2.next())).getClass();
            C8003l c8003l = (C8003l) AbstractC11048l.amazon(c0581l.billing, C8003l.loadAd);
            Iterator it3 = c17586l.f34247l.iterator();
            while (it3.hasNext()) {
                c8003l.yandex.add(AbstractC17082l.mopub((C7899l) it3.next(), interfaceC3588l));
            }
        }
        return c0581l;
    }

    public static final C4454l license(C14036l c14036l, C7403l c7403l) {
        ArrayList arrayList;
        C4454l c4454l = new C4454l(c14036l.f27371l, ((InterfaceC3588l) c7403l.f15342l).getString(c14036l.f27374l));
        C7403l c7403lBilling = c7403l.billing(c14036l.f27373l);
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403lBilling.f15342l;
        C14965l c14965l = (C14965l) c7403lBilling.f15341l;
        Iterator it = c14036l.f27373l.iterator();
        while (it.hasNext()) {
            c4454l.crashlytics.add(isVip((C17586l) it.next(), c7403lBilling));
        }
        C18128l c18128lMopub = AbstractC7310l.mopub(c14036l, c14965l);
        c4454l.amazon = c18128lMopub != null ? advert(c18128lMopub, c7403lBilling) : null;
        Iterator it2 = c14036l.f27369l.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = c4454l.mopub;
            if (!zHasNext) {
                break;
            }
            arrayList.add(signatures((C18426l) it2.next(), c7403lBilling));
        }
        if (c14036l.f27369l.isEmpty() && !c14036l.f27372l.isEmpty()) {
            Iterator it3 = AbstractC7310l.loadAd(c14036l, c14965l).iterator();
            while (it3.hasNext()) {
                C4258l c4258lAdvert = advert((C18128l) it3.next(), c7403lBilling);
                C13565l c13565l = new C13565l(0, "_");
                c13565l.crashlytics = c4258lAdvert;
                arrayList.add(c13565l);
            }
        }
        Iterator it4 = c14036l.f27363l.iterator();
        while (it4.hasNext()) {
            c4454l.billing.add(signatures((C18426l) it4.next(), c7403lBilling));
        }
        c4454l.admob = advert(AbstractC7310l.subs(c14036l, c14965l), c7403lBilling);
        if ((c14036l.f27358l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C15743l c15743l = c14036l.f27366l;
            ArrayList arrayList2 = new ArrayList(1);
            for (C9781l c9781l : c15743l.f30922l) {
                if ((c9781l.f19943l & 1) == 1) {
                    EnumC6955l enumC6955l = c9781l.f19940l;
                    if (enumC6955l == null) {
                        C8339l.metrica("Required value was null.");
                        return null;
                    }
                    int iOrdinal = enumC6955l.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    if ((c9781l.f19943l & 4) == 4) {
                        EnumC8359l enumC8359l = c9781l.f19948l;
                        if (enumC8359l == null) {
                            C8339l.metrica("Required value was null.");
                            return null;
                        }
                        int iOrdinal2 = enumC8359l.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            C18725l.billing();
                            return null;
                        }
                    }
                    C3927l c3927l = new C3927l(1);
                    List list = c9781l.f19946l;
                    ArrayList arrayList3 = c3927l.loadAd;
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(Signature((C18092l) it5.next(), c7403lBilling));
                    }
                    if ((c9781l.f19943l & 2) == 2) {
                        Signature(c9781l.f19945l, c7403lBilling);
                    }
                    arrayList2.add(c3927l);
                }
            }
        }
        Iterator it6 = c14036l.f27377l.iterator();
        while (it6.hasNext()) {
            c4454l.subs.add(adcel(((Integer) it6.next()).intValue(), c7403lBilling));
        }
        for (C4987l c4987l : c14036l.f27361l) {
            c4454l.isPro.put(interfaceC3588l.getString(c4987l.f10219l), c4987l.f10223l.Signature());
        }
        Iterator it7 = ((List) c7403lBilling.f15338l).iterator();
        while (it7.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it7.next())).getClass();
            C8726l c8726lMopub = AbstractC10565l.mopub(c4454l);
            Iterator it8 = c14036l.f27360l.iterator();
            while (it8.hasNext()) {
                c4454l.firebase.add(AbstractC17082l.mopub((C7899l) it8.next(), interfaceC3588l));
            }
            Iterator it9 = c14036l.f27356l.iterator();
            while (it9.hasNext()) {
                c4454l.purchase.add(AbstractC17082l.mopub((C7899l) it9.next(), interfaceC3588l));
            }
            C3429l c3429l = C11682l.yandex;
            C0166l c0166lCrashlytics = C11682l.crashlytics(c14036l, interfaceC3588l, c14965l);
            c8726lMopub.yandex = c0166lCrashlytics != null ? new C1559l(c0166lCrashlytics.loadAd, c0166lCrashlytics.crashlytics) : null;
            Integer num = (Integer) AbstractC0714l.loadAd(c14036l, AbstractC8450l.crashlytics);
            if (num != null) {
                interfaceC3588l.getString(num.intValue());
            }
        }
        return c4454l;
    }

    public static int loadAd(long j) {
        int i = (int) j;
        AbstractC12442l.billing(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static int mopub(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static C1571l pro(C5665l c5665l, InterfaceC3588l interfaceC3588l, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        C1571l c1571l = new C1571l();
        C14965l c14965l = new C14965l(c5665l.f12047l);
        C5557l c5557l = C5557l.loadAd;
        C7403l c7403l = new C7403l(interfaceC3588l, c14965l, AbstractC5712l.loadAd(c5665l.f12048l), z2, C2580l.f5619l, 16);
        appmetrica(c1571l, c5665l.f12052l, c5665l.f12051l, c5665l.f12054l, c7403l);
        Iterator it = ((List) c7403l.f15338l).iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            C12677l c12677l = (C12677l) AbstractC11048l.amazon(c1571l.amazon, C12677l.loadAd);
            Iterator it2 = ((List) c5665l.firebase(AbstractC8450l.smaato)).iterator();
            while (it2.hasNext()) {
                c12677l.yandex.add(ad((C13146l) it2.next(), c7403l));
            }
            Integer num = (Integer) AbstractC0714l.loadAd(c5665l, AbstractC8450l.firebase);
            if (num != null) {
                ((InterfaceC3588l) c7403l.f15342l).getString(num.intValue());
            }
        }
        return c1571l;
    }

    public static int purchase(int i, int i2) {
        AbstractC12442l.amazon(i2, 1073741823, "min (%s) must be less than or equal to max (%s)", i2 <= 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static final C13565l signatures(C18426l c18426l, C7403l c7403l) {
        C18128l c18128lMopub;
        int i = c18426l.f35990l;
        int i2 = c18426l.f35989l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7403l.f15342l;
        C13565l c13565l = new C13565l(i, interfaceC3588l.getString(i2));
        C14965l c14965l = (C14965l) c7403l.f15341l;
        c13565l.crashlytics = advert(AbstractC7310l.smaato(c18426l, c14965l), c7403l);
        int i3 = c18426l.f35984l;
        if ((i3 & 16) == 16) {
            c18128lMopub = c18426l.f35986l;
        } else {
            c18128lMopub = (i3 & 32) == 32 ? c14965l.mopub(c18426l.f35992l) : null;
        }
        c13565l.amazon = c18128lMopub != null ? advert(c18128lMopub, c7403l) : null;
        if ((c18426l.f35984l & 64) == 64) {
            AbstractC17082l.admob(c18426l.f35994l, interfaceC3588l);
        }
        Iterator it = ((List) c7403l.f15338l).iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            Iterator it2 = c18426l.f35988l.iterator();
            while (it2.hasNext()) {
                c13565l.purchase.add(AbstractC17082l.mopub((C7899l) it2.next(), interfaceC3588l));
            }
        }
        return c13565l;
    }

    public static String smaato(InterfaceC4121l interfaceC4121l, C12113l c12113l) {
        if (interfaceC4121l.loadAd(c12113l)) {
            return null;
        }
        return interfaceC4121l.yandex();
    }

    public static int[] subscription(Collection collection) {
        if (collection instanceof C6627l) {
            C6627l c6627l = (C6627l) collection;
            return Arrays.copyOfRange(c6627l.f13867l, c6627l.f13866l, c6627l.f13865l);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x027b  */
    public static C9095l tapsense(C6582l c6582l, InterfaceC3588l interfaceC3588l, boolean z, int i) {
        String string;
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        C9095l c9095l = new C9095l();
        C14965l c14965l = new C14965l(c6582l.f13770l);
        C5557l c5557l = C5557l.loadAd;
        C7403l c7403lBilling = new C7403l(interfaceC3588l, c14965l, AbstractC5712l.loadAd(c6582l.f13790l), z3, C2580l.f5619l, 16).billing(c6582l.f13774l);
        List list = (List) c7403lBilling.f15338l;
        C14965l c14965l2 = (C14965l) c7403lBilling.f15341l;
        c9095l.yandex = c6582l.f13789l;
        int i2 = c6582l.f13788l;
        InterfaceC3588l interfaceC3588l2 = (InterfaceC3588l) c7403lBilling.f15342l;
        c9095l.loadAd = AbstractC17082l.purchase(interfaceC3588l2, i2);
        Iterator it = c6582l.f13774l.iterator();
        while (it.hasNext()) {
            c9095l.crashlytics.add(isVip((C17586l) it.next(), c7403lBilling));
        }
        Iterator it2 = AbstractC7310l.firebase(c6582l, c14965l2).iterator();
        while (it2.hasNext()) {
            c9095l.amazon.add(advert((C18128l) it2.next(), c7403lBilling));
        }
        Iterator it3 = c6582l.f13778l.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C13347l c13347l = (C13347l) it3.next();
            C4675l c4675l = new C4675l(c13347l.f26207l);
            Iterator it4 = c13347l.f26206l.iterator();
            while (it4.hasNext()) {
                c4675l.loadAd.add(signatures((C18426l) it4.next(), c7403lBilling));
            }
            Iterator it5 = c13347l.f26209l.iterator();
            while (it5.hasNext()) {
                c4675l.crashlytics.add(adcel(((Integer) it5.next()).intValue(), c7403lBilling));
            }
            for (C4987l c4987l : c13347l.f26202l) {
                c4675l.amazon.put(interfaceC3588l2.getString(c4987l.f10219l), c4987l.f10223l.Signature());
            }
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                ((C9703l) ((InterfaceC12157l) it6.next())).getClass();
                C5243l c5243lBilling = AbstractC10565l.billing(c4675l);
                Iterator it7 = c13347l.f26203l.iterator();
                while (it7.hasNext()) {
                    c4675l.purchase.add(AbstractC17082l.mopub((C7899l) it7.next(), interfaceC3588l2));
                }
                C3429l c3429l = C11682l.yandex;
                C0166l c0166lYandex = C11682l.yandex(c13347l, interfaceC3588l2, c14965l2);
                c5243lBilling.yandex = c0166lYandex != null ? new C1559l(c0166lYandex.loadAd, c0166lYandex.crashlytics) : null;
            }
            c9095l.admob.add(c4675l);
        }
        appmetrica(c9095l, c6582l.f13782l, c6582l.f13799l, c6582l.f13781l, c7403lBilling);
        if ((c6582l.f13773l & 4) == 4) {
            interfaceC3588l2.getString(c6582l.f13795l);
        }
        Iterator it8 = c6582l.f13796l.iterator();
        while (it8.hasNext()) {
            c9095l.subs.add(interfaceC3588l2.getString(((Integer) it8.next()).intValue()));
        }
        for (C16400l c16400l : c6582l.f13776l) {
            if ((c16400l.f32093l & 1) != 1) {
                throw new C14612l("No name for EnumEntry", null);
            }
            c9095l.isPro.add(interfaceC3588l2.getString(c16400l.f32097l));
            C13568l c13568l = new C13568l(interfaceC3588l2.getString(c16400l.f32097l));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                ((C9703l) ((InterfaceC12157l) it9.next())).getClass();
                Iterator it10 = c16400l.f32096l.iterator();
                while (it10.hasNext()) {
                    ((ArrayList) c13568l.f26580l).add(AbstractC17082l.mopub((C7899l) it10.next(), interfaceC3588l2));
                }
            }
            c9095l.firebase.add(c13568l);
        }
        Iterator it11 = c6582l.f13775l.iterator();
        while (it11.hasNext()) {
            c9095l.smaato.add(AbstractC17082l.purchase(interfaceC3588l2, ((Integer) it11.next()).intValue()));
        }
        if ((c6582l.f13773l & 8) == 8) {
            c9095l.remoteconfig = interfaceC3588l2.getString(c6582l.f13800l);
        }
        int i3 = c6582l.f13773l;
        C18128l c18128lMopub = (i3 & 16) == 16 ? c6582l.f13779l : (i3 & 32) == 32 ? c14965l2.mopub(c6582l.f13785l) : null;
        if (c18128lMopub == null) {
            if ((c6582l.f13773l & 8) == 8) {
                Iterator it12 = c6582l.f13799l.iterator();
                Object obj = null;
                while (true) {
                    if (!it12.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Object next = it12.next();
                    C13146l c13146l = (C13146l) next;
                    if (AbstractC7310l.admob(c13146l, c14965l2) == null && AbstractC8576l.yandex(interfaceC3588l2.getString(c13146l.f25736l), interfaceC3588l2.getString(c6582l.f13800l))) {
                        if (!z2) {
                            z2 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                C13146l c13146l2 = (C13146l) obj;
                if (c13146l2 != null) {
                    c18128lMopub = AbstractC7310l.isPro(c13146l2, c14965l2);
                } else {
                    c18128lMopub = null;
                }
            } else {
                c18128lMopub = null;
            }
        }
        c9095l.vip = c18128lMopub != null ? advert(c18128lMopub, c7403lBilling) : null;
        Iterator it13 = AbstractC7310l.yandex(c6582l, c14965l2).iterator();
        while (it13.hasNext()) {
            c9095l.startapp.add(advert((C18128l) it13.next(), c7403lBilling));
        }
        Iterator it14 = c6582l.f13784l.iterator();
        while (it14.hasNext()) {
            c9095l.adcel.add(adcel(((Integer) it14.next()).intValue(), c7403lBilling));
        }
        for (C4987l c4987l2 : c6582l.f13798l) {
            c9095l.ads.put(interfaceC3588l2.getString(c4987l2.f10219l), c4987l2.f10223l.Signature());
        }
        Iterator it15 = list.iterator();
        while (it15.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it15.next())).getClass();
            C2937l c2937lPurchase = AbstractC10565l.purchase(c9095l);
            Iterator it16 = c6582l.f13791l.iterator();
            while (it16.hasNext()) {
                c9095l.metrica.add(AbstractC17082l.mopub((C7899l) it16.next(), interfaceC3588l2));
            }
            Integer num = (Integer) AbstractC0714l.loadAd(c6582l, AbstractC8450l.subs);
            if (num != null) {
                interfaceC3588l2.getString(num.intValue());
            }
            Iterator it17 = ((List) c6582l.firebase(AbstractC8450l.admob)).iterator();
            while (it17.hasNext()) {
                c2937lPurchase.yandex.add(ad((C13146l) it17.next(), c7403lBilling));
            }
            Integer num2 = (Integer) AbstractC0714l.loadAd(c6582l, AbstractC8450l.mopub);
            if (num2 == null || (string = interfaceC3588l2.getString(num2.intValue())) == null) {
                string = "main";
            }
            c2937lPurchase.loadAd = string;
        }
        return c9095l;
    }

    public static List yandex(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C6627l(0, iArr.length, iArr);
    }

    public abstract int amazon(View view, int i);

    public abstract int crashlytics(View view, int i);

    public int isPro() {
        return 0;
    }

    public abstract void metrica(View view, int i, int i2);

    public abstract boolean premium(View view, int i);

    public abstract void startapp(View view, float f, float f2);

    public int subs(View view) {
        return 0;
    }

    public abstract void vip(int i);

    public void remoteconfig(View view, int i) {
    }
}
