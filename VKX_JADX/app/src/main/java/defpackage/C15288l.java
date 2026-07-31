package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٔۤۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15288l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final /* synthetic */ Object f29889l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final /* synthetic */ int f29890l = 0;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final Cgoto f29891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288l(String str) {
        super(null);
        this.f29889l = str;
        this.f29891l = new C16504l(str, 1);
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public boolean amazon() {
        switch (this.f29890l) {
            case 3:
                return true;
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.AbstractC9694l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        switch (this.f29890l) {
            case 2:
                if (((CharSequence) ((C11148l) this.f29889l).f22411l.getValue()).length() != 0) {
                    return AbstractC9694l.m2716l(this, i, (AbstractC0283l) interfaceC14029l);
                }
                C10227l c10227lAdmob = AbstractC14055l.admob();
                c10227lAdmob.add(new Catalog2Block.PlaceholdersBlock(28, "x1", null, null, null, Collections.singletonList("synth_search"), C7750l.yandex));
                Unit unit = Unit.INSTANCE;
                return Collections.singletonList(new Catalog2Response(null, new Catalog2Section("x0", "", null, AbstractC14055l.purchase(c10227lAdmob), null, 20), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Collections.singletonList(new Catalog2Placeholder("synth_search", "", null, null, null)), null, null, null, null, null, null, null, null, null, null, 1073217533));
            default:
                return super.mo850break(i, interfaceC14029l);
        }
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public void license(String str) {
        switch (this.f29890l) {
            case 3:
                C5663l.f12024l.getClass();
                C5663l.loadAd(str);
                ((C13220l) this.f29889l).m3621instanceof(str, true);
                break;
        }
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: lؔٙؕ */
    public Object mo779l(Catalog2Section catalog2Section, C9554l c9554l, InterfaceC14029l interfaceC14029l) {
        switch (this.f29890l) {
            case 3:
                if (AbstractC12024l.m3315catch((CharSequence) ((C13220l) this.f29889l).f26001l.getValue())) {
                    C5663l.f12024l.getClass();
                    if (!C5663l.yandex().isEmpty()) {
                        List<String> listYandex = C5663l.yandex();
                        for (String str : listYandex) {
                            c9554l.billing.put("synth_" + str.hashCode(), new SmartSuggestion(str, "", "synth_fc", null, "synth_" + str.hashCode()));
                        }
                        ArrayList arrayList = new ArrayList(catalog2Section.amazon);
                        arrayList.add(0, new Catalog2Block.NoDataBlock("_synth_search_history", new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
                        C5459l c5459l = C5459l.yandex;
                        List listSingletonList = Collections.singletonList(new Catalog2Button(c5459l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070));
                        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listYandex, 10));
                        Iterator it = listYandex.iterator();
                        while (it.hasNext()) {
                            arrayList2.add("synth_" + ((String) it.next()).hashCode());
                        }
                        arrayList.add(0, new Catalog2Block.SearchSuggestionsBlock(24, "_synth_actual_search_history", null, listSingletonList, null, arrayList2, C1188l.yandex));
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        arrayList.add(0, new Catalog2Block.NoDataBlock("_synth_search_history", new Catalog2Layout.CompactHeader(VKXApplication.Companion.loadAd(R.string.recent_searches)), Collections.singletonList(new Catalog2Button(c5459l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070)), null, null, null, 56));
                        catalog2Section.amazon = arrayList;
                    }
                }
                break;
        }
        return catalog2Section;
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return */
    public final Cgoto mo781return() {
        switch (this.f29890l) {
            case 0:
                return (C16504l) this.f29891l;
            case 1:
                return (C16504l) this.f29891l;
            case 2:
                return (C3664l) this.f29891l;
            default:
                return (C9351l) this.f29891l;
        }
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public String smaato() {
        int i = this.f29890l;
        Object obj = this.f29889l;
        switch (i) {
            case 0:
                return "Поиск: " + ((String) obj);
            case 1:
                return "Поиск: ".concat((String) obj);
            case 2:
            default:
                return super.smaato();
            case 3:
                return "";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288l(C13220l c13220l) {
        super(null);
        this.f29889l = c13220l;
        this.f29891l = new C9351l(3, c13220l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288l(C11148l c11148l, String str) {
        super(null);
        this.f29889l = c11148l;
        this.f29891l = new C3664l(c11148l, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288l(String str, String str2) {
        super(null);
        this.f29889l = str2;
        this.f29891l = new C16504l(str, 2);
    }
}
