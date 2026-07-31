package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٓۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14496l {
    public static final C14496l yandex = new C14496l();

    public static String loadAd() {
        return AbstractC16648l.advert(UUID.randomUUID().toString(), "-", "", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object yandex(String str, AbstractC0283l abstractC0283l) {
        C1510l c1510l;
        String str2 = str;
        if (abstractC0283l instanceof C1510l) {
            c1510l = (C1510l) abstractC0283l;
            int i = c1510l.f3765l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1510l.f3765l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1510l = new C1510l(abstractC0283l);
            }
        } else {
            c1510l = new C1510l(abstractC0283l);
        }
        Object objSubscription = c1510l.f3763l;
        int i2 = c1510l.f3765l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSubscription);
            C15718l c15718l = C15718l.f30869l;
            c1510l.f3764l = str2;
            c1510l.f3765l = 1;
            objSubscription = c15718l.subscription(str2, c1510l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubscription == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = c1510l.f3764l;
            AbstractC2829l.crashlytics(objSubscription);
        }
        C16187l c16187l = (C16187l) objSubscription;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(' ');
        VKXApplication.Companion companion = VKXApplication.f36628l;
        sb.append(VKXApplication.Companion.loadAd(R.string.in_cache));
        String string = sb.toString();
        C10227l c10227lAdmob = AbstractC14055l.admob();
        String str3 = "_synth_offline_search";
        if (!VKXApplication.Companion.crashlytics()) {
            c10227lAdmob.add(new Catalog2Block.TextsBlock(28, loadAd(), null, null, null, Collections.singletonList("_synth_offline_search"), C0385l.yandex));
        }
        InterfaceC13238l interfaceC13238l = c16187l.crashlytics;
        InterfaceC13238l interfaceC13238l2 = c16187l.loadAd;
        InterfaceC13238l interfaceC13238l3 = c16187l.yandex;
        if (!interfaceC13238l.isEmpty()) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(loadAd(), new Catalog2Layout.Header("Плейлисты и альбомы"), null, null, null, null, 60));
            String strLoadAd = loadAd();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
            Iterator<E> it = interfaceC13238l.iterator();
            while (it.hasNext()) {
                arrayList.add(((CachedPlaylist) it.next()).m4618throws());
            }
            c10227lAdmob.add(new Catalog2Block.MusicPlaylistsBlock(strLoadAd, C0567l.yandex, null, null, null, arrayList, null, 92));
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(loadAd(), new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
        }
        boolean zIsEmpty = interfaceC13238l3.isEmpty();
        C1188l c1188l = C1188l.yandex;
        if (!zIsEmpty) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(loadAd(), new Catalog2Layout.Header("Треки"), null, null, null, new Catalog2Badge("transparent", "по названию"), 28));
            String strLoadAd2 = loadAd();
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC13238l3, 10));
            Iterator<E> it2 = interfaceC13238l3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CachedTrack) it2.next()).m4635implements());
            }
            c10227lAdmob.add(new Catalog2Block.MusicAudiosBlock(28, strLoadAd2, null, null, null, arrayList2, c1188l));
            if (!interfaceC13238l2.isEmpty()) {
                c10227lAdmob.add(new Catalog2Block.NoDataBlock(loadAd(), new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
            }
        }
        if (!interfaceC13238l2.isEmpty()) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(loadAd(), new Catalog2Layout.Header("Треки"), null, null, null, new Catalog2Badge("transparent", "по исполнителю"), 28));
            String strLoadAd3 = loadAd();
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC13238l2, 10));
            Iterator<E> it3 = interfaceC13238l2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((CachedTrack) it3.next()).m4635implements());
            }
            c10227lAdmob.add(new Catalog2Block.MusicAudiosBlock(28, strLoadAd3, null, null, null, arrayList3, c1188l));
        }
        Catalog2Section catalog2Section = new Catalog2Section("synth_c2sug", string, null, AbstractC14055l.purchase(c10227lAdmob), null, 20);
        C10227l c10227lAdmob2 = AbstractC14055l.admob();
        c10227lAdmob2.addAll(interfaceC13238l3);
        c10227lAdmob2.addAll(interfaceC13238l2);
        Unit unit = Unit.INSTANCE;
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int i3 = 0;
        ListIterator listIterator = c10227lPurchase.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                break;
            }
            Object next = c13376l.next();
            if (hashSet.add(((CachedTrack) next).m4635implements())) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((CachedTrack) it4.next()).crashlytics());
        }
        C10227l c10227lAdmob3 = AbstractC14055l.admob();
        ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
        Iterator<E> it5 = interfaceC13238l.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((CachedPlaylist) it5.next()).crashlytics());
        }
        c10227lAdmob3.addAll(arrayList6);
        Unit unit2 = Unit.INSTANCE;
        return new Catalog2Response(null, catalog2Section, null, null, null, null, null, null, null, arrayList5, AbstractC16901l.m4245throws(AbstractC14055l.purchase(c10227lAdmob3)), null, null, null, null, Collections.singletonList(new Catalog2Text(i3, 4, str3, "Так как подключение к Интернету отсуствует, был произведен поиск по кешированному контенту.")), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073707517);
    }
}
