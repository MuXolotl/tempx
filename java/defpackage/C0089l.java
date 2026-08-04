package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaCover;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؑؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0089l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5124l f1000l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f1001l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1002l;

    public /* synthetic */ C0089l(List list, C5124l c5124l, int i) {
        this.f1002l = i;
        this.f1001l = list;
        this.f1000l = c5124l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strM4210case;
        String str;
        int i2;
        int i3 = this.f1002l;
        List list = this.f1001l;
        C13863l c13863l = C1867l.yandex;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    UmaArtist umaArtist = (UmaArtist) list.get(iIntValue);
                    c6956l.m2123default(-83600595);
                    UmaCover umaCover = umaArtist.amazon;
                    List list2 = umaArtist.admob;
                    boolean zBilling = c6956l.billing(umaCover);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = umaCover.amazon;
                        c6956l.m2147try(objM2132native);
                    }
                    String str2 = (String) objM2132native;
                    String str3 = umaArtist.loadAd;
                    boolean zBilling2 = c6956l.billing(list2);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        strM4210case = list2 != null ? AbstractC16901l.m4210case(list2, null, null, null, null, 63) : null;
                        str = strM4210case != null ? strM4210case : "";
                        c6956l.m2147try(str);
                        objM2132native2 = str;
                    }
                    String str4 = (String) objM2132native2;
                    boolean zBilling3 = c6956l.billing(umaArtist);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C15873l(umaArtist.crashlytics);
                        c6956l.m2147try(objM2132native3);
                    }
                    C15873l c15873l = (C15873l) objM2132native3;
                    String str5 = umaCover.loadAd;
                    if (str5 == null) {
                        str5 = umaCover.yandex;
                    }
                    this.f1000l.m1702try(str5, str2, str3, str4, c15873l, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    UmaTag umaTag = (UmaTag) list.get(iIntValue3);
                    c6956l2.m2123default(-1732012495);
                    UmaCover umaCover2 = umaTag.crashlytics;
                    List list3 = umaTag.amazon;
                    boolean zBilling4 = c6956l2.billing(umaCover2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zBilling4 || objM2132native4 == c13863l) {
                        objM2132native4 = umaCover2.amazon;
                        c6956l2.m2147try(objM2132native4);
                    }
                    String str6 = (String) objM2132native4;
                    String str7 = umaTag.yandex;
                    boolean zBilling5 = c6956l2.billing(list3);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zBilling5 || objM2132native5 == c13863l) {
                        strM4210case = list3 != null ? AbstractC16901l.m4210case(list3, null, null, null, null, 63) : null;
                        str = strM4210case != null ? strM4210case : "";
                        c6956l2.m2147try(str);
                        objM2132native5 = str;
                    }
                    String str8 = (String) objM2132native5;
                    String str9 = umaCover2.loadAd;
                    if (str9 == null) {
                        str9 = umaCover2.yandex;
                    }
                    String str10 = str9;
                    boolean zBilling6 = c6956l2.billing(umaTag);
                    Object objM2132native6 = c6956l2.m2132native();
                    if (zBilling6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C6650l(umaTag.loadAd);
                        c6956l2.m2147try(objM2132native6);
                    }
                    this.f1000l.m1702try(str10, str6, str7, str8, (C6650l) objM2132native6, c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
