package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Root;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘۗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5891l extends AbstractC11801l implements InterfaceC2262l, InterfaceC17091l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f12414l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f12415l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f12416l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f12417l;

    public C5891l() {
        super(0);
        this.f12416l = AbstractC11990l.loadAd();
        this.f12417l = AbstractC8020l.smaato(C2609l.yandex);
        this.f12415l = AbstractC8020l.smaato(AbstractC16901l.m4213const(AbstractC8474l.loadAd.keySet()));
        C2491l.yandex.getClass();
        this.f12414l = AbstractC8020l.smaato(C2491l.crashlytics.yandex());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final Serializable m1864abstract(C5891l c5891l, AbstractC0283l abstractC0283l) {
        C17222l c17222l;
        List<Catalog2Block> list;
        List list2;
        Catalog2Section catalog2Section;
        if (abstractC0283l instanceof C17222l) {
            c17222l = (C17222l) abstractC0283l;
            int i = c17222l.f33433l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17222l.f33433l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17222l = new C17222l(c5891l, abstractC0283l);
            }
        } else {
            c17222l = new C17222l(c5891l, abstractC0283l);
        }
        Object objAdmob = c17222l.f33432l;
        int i2 = c17222l.f33433l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C4842l c4842l = new C4842l();
            C8688l c8688l = C10328l.purchase;
            c4842l.loadAd = AbstractC10409l.crashlytics().loadAd.ads();
            c17222l.f33433l = 1;
            objAdmob = AbstractC8189l.admob(c4842l, c17222l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        Catalog2Response catalog2Response = (Catalog2Response) objAdmob;
        C9554l c9554l = new C9554l(catalog2Response);
        Catalog2Root catalog2Root = catalog2Response.yandex;
        Catalog2Section catalog2Section2 = catalog2Response.loadAd;
        if (catalog2Section2 == null || (list = catalog2Section2.amazon) == null) {
            if (catalog2Root == null || (list2 = catalog2Root.loadAd) == null) {
                list = null;
            } else {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        C1759l.firebase("Collection contains no element matching the predicate.");
                        return null;
                    }
                    catalog2Section = (Catalog2Section) it.next();
                } while (!AbstractC8576l.yandex(catalog2Section.yandex, catalog2Root.yandex));
                list = catalog2Section.amazon;
            }
        }
        if (list == null) {
            list = C2580l.f5619l;
        }
        for (Catalog2Block catalog2Block : list) {
            if (catalog2Block.getLoadAd() instanceof C7861l) {
                Map mapLoadAd = AbstractC9464l.loadAd(catalog2Block.crashlytics(c9554l));
                List listPurchase = catalog2Block.purchase();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listPurchase.iterator();
                while (it2.hasNext()) {
                    CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) mapLoadAd.get((String) it2.next());
                    if (customCatalogBlockItem != null) {
                        arrayList.add(customCatalogBlockItem);
                    }
                }
                return arrayList;
            }
        }
        C1759l.firebase("Collection contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        startapp();
        AbstractC11990l.billing(this, null);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1865import(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(874377520);
        int i2 = i | (c6956l.admob(customCatalogBlockItem) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C10086l c10086l = this.f12415l;
            boolean zBilling = c6956l.billing((List) c10086l.getValue()) | c6956l.billing(customCatalogBlockItem.mopub);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = Boolean.valueOf(((List) c10086l.getValue()).contains(customCatalogBlockItem.mopub));
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(1779492370, new C8056l(customCatalogBlockItem, i4), c6956l), AbstractC15788l.yandex(interfaceC17242l, ((Boolean) objM2132native).booleanValue() ? 0.5f : 1.0f), null, null, AbstractC14566l.amazon(1283555982, new C8056l(customCatalogBlockItem, i3), c6956l), null, null, c6956l, 24582, 492);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) customCatalogBlockItem, interfaceC17242l, i, 4);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-68135493);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-502228617, new C9772l(c13072lYandex, this, 7), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1860277260, new C7442l(this, c13072lYandex, 18), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6115l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        this.f12417l.setValue(C2609l.yandex);
        AbstractC10999l.mopub(this, null, 0, new C5163l(this, null, 26), 3);
    }

    @Override // defpackage.InterfaceC17091l
    public final void startapp() {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC12832l.mopub(C13865l.yandex, vKXApplication);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f12416l.f36440l;
    }
}
