package defpackage;

import android.view.View;
import androidx.recyclerview.widget.subs;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: lؒٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1059l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C18480l f2932l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C5080l f2933l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final C17870l f2934l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public final /* synthetic */ C7711l f2935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1059l(C7711l c7711l) {
        super(null);
        this.f2935l = c7711l;
        this.f2933l = new C5080l(new C15578l(-70496995, true, new C4951l(2, this)));
        this.f2932l = new C18480l(c7711l);
        this.f2934l = new C17870l(1);
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public final C18480l isPro() {
        return this.f2932l;
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final Object mo779l(Catalog2Section catalog2Section, C9554l c9554l, InterfaceC14029l interfaceC14029l) {
        ArrayList arrayList;
        Object next;
        File file = AbstractC8474l.yandex;
        Iterable iterable = catalog2Section.amazon;
        if (iterable == null) {
            iterable = C2580l.f5619l;
        }
        Iterator it = iterable.iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Catalog2Block) next).getLoadAd() instanceof C7861l));
        Catalog2Block.LinksBlock linksBlock = next instanceof Catalog2Block.LinksBlock ? (Catalog2Block.LinksBlock) next : null;
        if (linksBlock == null) {
            return catalog2Section;
        }
        LinkedHashMap linkedHashMap = c9554l.purchase;
        List list = linksBlock.billing;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                LinkedHashMap linkedHashMap2 = AbstractC8474l.loadAd;
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) linkedHashMap.get((String) obj);
                String str = customCatalogBlockItem != null ? customCatalogBlockItem.mopub : null;
                if (str == null) {
                    str = "";
                }
                if (!linkedHashMap2.containsKey(str)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        linksBlock.billing = arrayList;
        return catalog2Section;
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void mo780l() {
        mo782this();
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final Cgoto mo781return() {
        return this.f2934l;
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void mo782this() {
        this.f2935l.m2197abstract();
        this.f2932l.admob();
        super.mo782this();
    }

    @Override // defpackage.AbstractC9694l, defpackage.AbstractC15988l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void mo783volatile(View view) {
        super.mo783volatile(view);
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        ((C2045l) subsVar).f4577l.yandex(0, this.f2933l);
    }
}
