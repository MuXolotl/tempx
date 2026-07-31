package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0496l {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    public static final void crashlytics(String str, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2;
        int i2;
        c6956l.m2133new(447778783);
        int i3 = (c6956l.billing(str) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            switch (str) {
                case "shuffle_outline_20":
                    i2 = R.drawable.ic_shuffle_outline_20;
                    break;
                case "share_outline_20":
                    i2 = R.drawable.ic_share_outline_20;
                    break;
                case "story_outline_20":
                    i2 = R.drawable.ic_story_outline_20;
                    break;
                case "music_note_wave_outline_20":
                    i2 = R.drawable.ic_music_note_wave_outline_20;
                    break;
                case "users_outline_20":
                    i2 = R.drawable.ic_users_outline_20;
                    break;
                default:
                    i2 = R.drawable.ic_link;
                    break;
            }
            interfaceC17242l2 = interfaceC17242l;
            c6956l2 = c6956l;
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l), null, interfaceC17242l2, ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex, c6956l2, 440, 0);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(str, interfaceC17242l2, i, 9);
        }
    }

    public static final void loadAd(Function0 function0, C15578l c15578l, C6956l c6956l) {
        C11607l c11607lAppmetrica = AbstractC12442l.appmetrica(c6956l);
        C10707l c10707l = AbstractC16964l.yandex;
        AbstractC7470l.loadAd(1572864, c15578l, c6956l, AbstractC12442l.Signature(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, c6956l), c11607lAppmetrica, null, function0, false);
    }

    public static final void yandex(Function0 function0, List list, List list2, CatalogArtist catalogArtist, C6956l c6956l, int i) {
        int i2;
        C16395l c16395l;
        C13863l c13863l;
        int i3;
        C6956l c6956l2 = c6956l;
        C0086l c0086l = C18450l.f36040l;
        c6956l2.m2133new(2048149403);
        if ((i & 6) == 0) {
            i2 = (c6956l2.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.admob(list2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c6956l2.billing(catalogArtist) : c6956l2.admob(catalogArtist) ? 2048 : 1024;
        }
        if (c6956l2.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) c6956l2.isPro(AbstractC1242l.loadAd);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 300.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l2 = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strYandex = catalogArtist.yandex();
            String str = catalogArtist.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC7741l.purchase(strYandex, str, AbstractC0080l.crashlytics(c4346l, 1.0f), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.premium), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.premium), C4176l.yandex, c6956l2, 37248, 6, 31712);
            AbstractC9383l.yandex(AbstractC4927l.crashlytics(AbstractC0080l.crashlytics(c4346l, 1.0f), C1083l.license(AbstractC14055l.remoteconfig(new C9735l(C9735l.isPro), new C9735l(((C14370l) c6956l2.isPro(c10707l)).yandex.vip)), 0.0f, 0.0f, 14)), c6956l2, 0);
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(AbstractC0080l.amazon(c4346l, 1.0f), C18450l.f36021l), 0.0f, 4.0f, 1);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c16395l = c16395l2;
                c6956l2.firebase(c16395l);
            } else {
                c16395l = c16395l2;
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            int i6 = i2;
            C7537l c7537l2 = new C7537l(4.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(c7537l2, c0086l, c6956l2, 54);
            long j3 = c6956l2.f14595continue;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip2);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            AbstractC13010l.loadAd(catalogArtist.yandex, new C9247l(1.0f, true), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.amazon, c6956l, 0, 24960, 110584);
            c6956l.m2123default(-1373607174);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c13863l = C1867l.yandex;
                if (!zHasNext) {
                    break;
                }
                Catalog2Button catalog2Button = (Catalog2Button) it.next();
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button.yandex;
                if (AbstractC8576l.yandex(catalog2ButtonAction, C9588l.yandex)) {
                    c6956l.m2123default(368489075);
                    i3 = i6;
                    boolean zAdmob = c6956l.admob(catalog2Button) | ((i6 & 14) == 4) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && c6956l.admob(catalogArtist)));
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new Cfinally(function0, catalog2Button, catalogArtist, 1);
                        c6956l.m2147try(objM2132native);
                    }
                    loadAd((Function0) objM2132native, AbstractC17780l.yandex, c6956l);
                    c6956l.startapp(false);
                } else {
                    i3 = i6;
                    if (AbstractC8576l.yandex(catalog2ButtonAction, C4435l.yandex)) {
                        c6956l.m2123default(369009100);
                        boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && c6956l.admob(catalogArtist)));
                        Object objM2132native2 = c6956l.m2132native();
                        if (z || objM2132native2 == c13863l) {
                            objM2132native2 = new Ctry(catalogArtist, function0, 10);
                            c6956l.m2147try(objM2132native2);
                        }
                        loadAd((Function0) objM2132native2, AbstractC14566l.amazon(-1322761781, new C15707l(6, catalogArtist), c6956l), c6956l);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(369868389);
                        c6956l.startapp(false);
                    }
                }
                i6 = i3;
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C7537l c7537l3 = new C7537l(12.0f, true, new C8339l(12));
            boolean zAdmob2 = c6956l.admob(list2) | ((i6 & 14) == 4) | c6956l.admob(context) | c6956l.admob(list);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                C17796l c17796l = new C17796l(list2, function0, context, list, 2);
                c6956l.m2147try(c17796l);
                objM2132native3 = c17796l;
            }
            AbstractC16336l.loadAd(interfaceC17242lAmazon, null, c17253lLoadAd, c7537l3, c0086l, null, false, null, (Function1) objM2132native3, c6956l, 221574, 458);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(function0, list, list2, catalogArtist, i, 2);
        }
    }
}
