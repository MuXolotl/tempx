package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13379l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C3664l f26263l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final boolean f26264l;

    public C13379l(String str) {
        super(null);
        this.f26264l = true;
        this.f26263l = new C3664l(str, this, 0);
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public final void ad(CatalogArtist catalogArtist) {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        ((C3497l) abstractC14412l).smaato(new C0464l(catalogArtist, this, 8));
        C7206l c7206l = C7206l.yandex;
        AbstractC14412l abstractC14412l2 = this.f5279l;
        if (abstractC14412l2 == null) {
            abstractC14412l2 = null;
        }
        AppCompatImageView appCompatImageView = ((C3497l) abstractC14412l2).subs;
        c7206l.yandex(appCompatImageView != null ? appCompatImageView : null, EnumC10788l.f21802l);
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: class */
    public final boolean mo1142class() {
        return this.f26264l;
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final */
    public final void mo852final() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        ((C3497l) abstractC14412l).mopub.setBackgroundResource(R.drawable.scrim_top);
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final Object mo779l(Catalog2Section catalog2Section, C9554l c9554l, InterfaceC14029l interfaceC14029l) {
        C10892l c10892l = C10892l.yandex;
        c10892l.getClass();
        C8634l c8634l = C10892l.vip;
        InterfaceC13922l interfaceC13922l = C10892l.loadAd[8];
        if (!((Boolean) c8634l.pro(c10892l)).booleanValue()) {
            return catalog2Section;
        }
        List list = catalog2Section.amazon;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Catalog2Block catalog2Block = (Catalog2Block) obj;
                Catalog2Layout loadAd = catalog2Block.getLoadAd();
                Catalog2Layout.ExtendedHeader extendedHeader = loadAd instanceof Catalog2Layout.ExtendedHeader ? (Catalog2Layout.ExtendedHeader) loadAd : null;
                if (!AbstractC8576l.yandex(extendedHeader != null ? extendedHeader.crashlytics : null, "legal_notice") && !(catalog2Block.getLoadAd() instanceof C7348l)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return Catalog2Section.yandex(catalog2Section, arrayList);
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return */
    public final Cgoto mo781return() {
        return this.f26263l;
    }
}
