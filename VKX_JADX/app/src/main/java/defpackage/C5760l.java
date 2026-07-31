package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lؘ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5760l implements InterfaceC3604l {
    public static final C5760l yandex = new C5760l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(String str, int i, int i2, C17425l c17425l, InterfaceC14029l interfaceC14029l) {
        C11667l c11667l;
        if (interfaceC14029l instanceof C11667l) {
            c11667l = (C11667l) interfaceC14029l;
            int i3 = c11667l.f23380l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11667l.f23380l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11667l = new C11667l(this, interfaceC14029l);
            }
        } else {
            c11667l = new C11667l(this, interfaceC14029l);
        }
        Object objBilling = c11667l.f23381l;
        int i4 = c11667l.f23380l;
        C2580l c2580l = C2580l.f5619l;
        try {
            if (i4 == 0) {
                AbstractC2829l.crashlytics(objBilling);
                if (str.length() == 0 || AbstractC12024l.m3315catch(str) || i != 0) {
                    return C9201l.crashlytics(c2580l, c17425l);
                }
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                c11667l.f23382l = c17425l;
                c11667l.f23380l = 1;
                C17464l c17464l = new C17464l("audio.searchMain", C15617l.f30499l);
                c17464l.yandex("q", str);
                c17464l.loadAd(AbstractC8576l.billing(5, new C8934l(0, 300, 1)), "count");
                c17464l.loadAd(0, "offset");
                objBilling = c7644lLoadAd.billing(c17464l, c11667l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objBilling == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i4 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c17425l = c11667l.f23382l;
                AbstractC2829l.crashlytics(objBilling);
            }
            C17761l c17761l = (C17761l) AbstractC10802l.subs((AbstractC14237l) objBilling);
            C10227l c10227lAdmob = AbstractC14055l.admob();
            List listM4247try = AbstractC16901l.m4247try(c17761l.crashlytics.loadAd, 2);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4247try, 10));
            Iterator it = listM4247try.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC7574l.loadAd((C6388l) it.next()));
            }
            c10227lAdmob.addAll(arrayList);
            List listM4247try2 = AbstractC16901l.m4247try(c17761l.mopub.loadAd, 2);
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM4247try2, 10));
            Iterator it2 = listM4247try2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC7574l.crashlytics((C3346l) it2.next(), "Добавленные альбомы"));
            }
            c10227lAdmob.addAll(arrayList2);
            List listM4247try3 = AbstractC16901l.m4247try(c17761l.billing.loadAd, 2);
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listM4247try3, 10));
            Iterator it3 = listM4247try3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AbstractC7574l.crashlytics((C3346l) it3.next(), "Добавленные плейлисты"));
            }
            c10227lAdmob.addAll(arrayList3);
            List listM4247try4 = AbstractC16901l.m4247try(c17761l.yandex.loadAd, 2);
            ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(listM4247try4, 10));
            Iterator it4 = listM4247try4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(AbstractC7574l.crashlytics((C3346l) it4.next(), "Альбомы"));
            }
            c10227lAdmob.addAll(arrayList4);
            List listM4247try5 = AbstractC16901l.m4247try(c17761l.amazon.loadAd, 2);
            ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(listM4247try5, 10));
            Iterator it5 = listM4247try5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(AbstractC7574l.crashlytics((C3346l) it5.next(), "Плейлисты"));
            }
            c10227lAdmob.addAll(arrayList5);
            return C9201l.crashlytics(AbstractC14055l.purchase(c10227lAdmob), c17425l);
        } catch (Exception e) {
            e.printStackTrace();
            return C9201l.crashlytics(c2580l, c17425l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0265  */
    /* JADX WARN: Code duplicated, block: B:103:0x0268  */
    /* JADX WARN: Code duplicated, block: B:106:0x026c  */
    /* JADX WARN: Code duplicated, block: B:110:0x027a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0288  */
    /* JADX WARN: Code duplicated, block: B:114:0x028e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0339  */
    /* JADX WARN: Code duplicated, block: B:125:0x0341  */
    /* JADX WARN: Code duplicated, block: B:127:0x0351  */
    /* JADX WARN: Code duplicated, block: B:129:0x0355  */
    /* JADX WARN: Code duplicated, block: B:132:0x036e A[LOOP:1: B:130:0x0368->B:132:0x036e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0389  */
    /* JADX WARN: Code duplicated, block: B:136:0x038d  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a4 A[LOOP:2: B:137:0x039e->B:139:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d8 A[LOOP:3: B:144:0x03d2->B:146:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:155:0x0412 A[LOOP:4: B:153:0x040c->B:155:0x0412, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x042c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0430  */
    /* JADX WARN: Code duplicated, block: B:161:0x0434  */
    /* JADX WARN: Code duplicated, block: B:164:0x044b A[LOOP:5: B:162:0x0445->B:164:0x044b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0463  */
    /* JADX WARN: Code duplicated, block: B:168:0x0467  */
    /* JADX WARN: Code duplicated, block: B:171:0x047e A[LOOP:6: B:169:0x0478->B:171:0x047e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:195:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db A[LOOP:7: B:50:0x00d5->B:52:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214 A[PHI: r19
  0x0214: PHI (r19v3 int) = (r19v0 int), (r19v4 int), (r19v6 int) binds: [B:85:0x0212, B:78:0x01f2, B:71:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00db, please report this as an issue */
    public final Object yandex(String str, int i, int i2, AbstractC0283l abstractC0283l) throws Throwable {
        C2337l c2337l;
        Object c18435l;
        Object obj;
        List list;
        ArrayList arrayList;
        int i3;
        Object objFirebase;
        String str2;
        int i4;
        int i5;
        List listPurchase;
        int i6;
        String str3;
        C10227l c10227lAdmob;
        C9554l c9554l;
        Catalog2Section catalog2Section;
        List list2;
        Iterator it;
        String str4;
        Catalog2Block catalog2Block;
        Catalog2Layout loadAd;
        String str5;
        Iterator it2;
        boolean z;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        Iterator it4;
        Catalog2Block.MusicAudiosBlock musicAudiosBlock;
        ArrayList arrayList4;
        Iterator it5;
        ArrayList arrayList5;
        Iterator it6;
        ArrayList arrayList6;
        Iterator it7;
        Catalog2Block.MusicAudiosBlock musicAudiosBlock2;
        ArrayList arrayList7;
        Iterator it8;
        List crashlytics;
        Catalog2Button catalog2Button;
        C5760l c5760l = this;
        if (abstractC0283l instanceof C2337l) {
            c2337l = (C2337l) abstractC0283l;
            int i7 = c2337l.f5064l;
            if ((i7 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2337l.f5064l = i7 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2337l = new C2337l(c5760l, abstractC0283l);
            }
        } else {
            c2337l = new C2337l(c5760l, abstractC0283l);
        }
        Object objAdmob = c2337l.f5063l;
        int i8 = c2337l.f5064l;
        List<AudioWidgetItem> list3 = C2580l.f5619l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i8 == 0) {
                AbstractC2829l.crashlytics(objAdmob);
                C16287l.yandex.getClass();
                if (!C16287l.yandex()) {
                    return C9201l.crashlytics(list3, null);
                }
                if (AbstractC8576l.yandex(str, "vkx:sysRecents")) {
                    SharedPreferences sharedPreferences = AbstractC3630l.yandex;
                    if (!AbstractC3630l.yandex(EnumC14530l.f28444l)) {
                        return C9201l.crashlytics(list3, null);
                    }
                    C16534l c16534l = new C16534l("large", "mymusic");
                    c2337l.f5066l = null;
                    c2337l.f5068l = i;
                    c2337l.f5062l = i2;
                    c2337l.f5064l = 1;
                    objAdmob = AbstractC8189l.admob(c16534l, c2337l);
                    if (objAdmob == enumC9342l) {
                    }
                    c18435l = (List) objAdmob;
                    if (c18435l instanceof C18435l) {
                        obj = null;
                    } else {
                        obj = c18435l;
                    }
                    list = (List) obj;
                    if (list != null) {
                        list3 = list;
                    }
                    arrayList = new ArrayList(AbstractC14055l.billing(list3, 10));
                    for (AudioWidgetItem audioWidgetItem : list3) {
                        C0935l c0935l = new C0935l();
                        C9258l c9258l = AbstractC1186l.f3181l;
                        C13708l c13708l = C13708l.f26763l;
                        List list4 = Collections.EMPTY_LIST;
                        C13708l c13708l2 = C13708l.f26763l;
                        C2410l c2410l = new C2410l();
                        C11470l c11470l = C11470l.amazon;
                        String str6 = "sysrecs:" + audioWidgetItem.purchase;
                        C3117l c3117l = new C3117l();
                        c3117l.yandex = audioWidgetItem.loadAd;
                        c3117l.billing = audioWidgetItem.amazon;
                        c3117l.vip = Uri.parse(audioWidgetItem.purchase);
                        c3117l.subscription = Boolean.TRUE;
                        c3117l.ads = Boolean.FALSE;
                        c3117l.f6662synchronized = new Integer(1);
                        arrayList.add(new C2427l(str6, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l));
                    }
                    return C9201l.crashlytics(arrayList, new C17425l(Bundle.EMPTY, true, false, false));
                }
                if (AbstractC8576l.yandex(str, "vkx:root")) {
                    C8565l c8565l = C8565l.f17655l;
                    c2337l.f5068l = i;
                    c2337l.f5062l = i2;
                    c2337l.f5064l = 2;
                    Object objAds = c8565l.ads(c2337l);
                    if (objAds != enumC9342l) {
                        return objAds;
                    }
                } else {
                    if (!AbstractC16648l.isVip(str, "vkcatalog", false)) {
                        return C9201l.crashlytics(list3, null);
                    }
                    String strM3334new = AbstractC12024l.m3334new(str, "vkcatalog:");
                    c2337l.f5066l = strM3334new;
                    c2337l.f5068l = i;
                    c2337l.f5062l = i2;
                    c2337l.f5064l = 3;
                    int iHashCode = strM3334new.hashCode();
                    if (iHashCode == -1446840107) {
                        i3 = 1;
                        if (strM3334new.equals("folder_albums")) {
                            C16552l c16552l = AbstractC11463l.yandex;
                            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18160l(2, null, 12), c2337l);
                            if (objFirebase != enumC9342l) {
                                objFirebase = (List) objFirebase;
                            }
                            objAdmob = objFirebase;
                        } else {
                            objAdmob = null;
                        }
                    } else if (iHashCode == -637952432) {
                        i3 = 1;
                        if (strM3334new.equals("folder_playlists")) {
                            C16552l c16552l2 = AbstractC11463l.yandex;
                            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18160l(2, null, 13), c2337l);
                            if (objFirebase != enumC9342l) {
                                objFirebase = (List) objFirebase;
                            }
                            objAdmob = objFirebase;
                        } else {
                            objAdmob = null;
                        }
                    } else if (iHashCode == 911328422 && strM3334new.equals("vkx_cache")) {
                        C10227l c10227lAdmob2 = AbstractC14055l.admob();
                        c10227lAdmob2.add(AbstractC0622l.admob("vkcatalog:folder_albums", "Альбомы", "Контент", true));
                        c10227lAdmob2.add(AbstractC0622l.admob("vkcatalog:folder_playlists", "Плейлисты", "Контент", true));
                        i3 = 1;
                        c10227lAdmob2.add(AbstractC0622l.admob("ext:cache:play_everything", "Воспроизвести все", "Быстрые действия с треками", false));
                        c10227lAdmob2.add(AbstractC0622l.admob("ext:cache:play_library", "Воспроизвести библиотеку", "Быстрые действия с треками", false));
                        c10227lAdmob2.add(AbstractC0622l.admob("ext:cache:play_manual", "Воспроизвести вручную загруженное", "Быстрые действия с треками", false));
                        objFirebase = AbstractC14055l.purchase(c10227lAdmob2);
                        objAdmob = objFirebase;
                    } else {
                        i3 = 1;
                        objAdmob = null;
                    }
                    if (objAdmob != enumC9342l) {
                        str2 = strM3334new;
                        i4 = i2;
                        i5 = i;
                        listPurchase = (List) objAdmob;
                        if (listPurchase == null) {
                            C12772l c12772l = new C12772l(str2, 13);
                            c2337l.f5066l = str2;
                            c2337l.f5065l = c5760l;
                            c2337l.f5068l = i5;
                            c2337l.f5062l = i4;
                            c2337l.f5064l = 4;
                            objAdmob = AbstractC8189l.admob(c12772l, c2337l);
                            if (objAdmob != enumC9342l) {
                                str3 = str2;
                                Catalog2Response catalog2Response = (Catalog2Response) objAdmob;
                                c5760l.getClass();
                                c10227lAdmob = AbstractC14055l.admob();
                                c9554l = new C9554l(catalog2Response);
                                catalog2Section = catalog2Response.loadAd;
                                if (catalog2Section != null) {
                                    list2 = catalog2Section.amazon;
                                } else {
                                    list2 = null;
                                }
                                if (list2 != null) {
                                    list3 = list2;
                                }
                                it = list3.iterator();
                                str4 = "";
                                while (it.hasNext()) {
                                    catalog2Block = (Catalog2Block) it.next();
                                    loadAd = catalog2Block.getLoadAd();
                                    if (loadAd instanceof Catalog2Layout.Header) {
                                        str4 = ((Catalog2Layout.Header) loadAd).yandex;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        crashlytics = catalog2Block.getCrashlytics();
                                        if (crashlytics != null) {
                                            str5 = str3;
                                            it2 = it;
                                        } else {
                                            str5 = str3;
                                            it2 = it;
                                        }
                                    } else {
                                        str5 = str3;
                                        it2 = it;
                                        z = loadAd instanceof C1188l;
                                        linkedHashMap = c9554l.purchase;
                                        linkedHashMap2 = c9554l.loadAd;
                                        linkedHashMap3 = c9554l.yandex;
                                        if (z) {
                                            if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                                                musicAudiosBlock2 = (Catalog2Block.MusicAudiosBlock) catalog2Block;
                                                arrayList7 = new ArrayList(linkedHashMap3.size());
                                                it8 = linkedHashMap3.entrySet().iterator();
                                                while (it8.hasNext()) {
                                                    arrayList7.add(AbstractC16714l.yandex((AudioTrack) ((Map.Entry) it8.next()).getValue(), musicAudiosBlock2.yandex, str4));
                                                }
                                                c10227lAdmob.addAll(arrayList7);
                                            } else if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                                                arrayList6 = new ArrayList(linkedHashMap2.size());
                                                it7 = linkedHashMap2.entrySet().iterator();
                                                while (it7.hasNext()) {
                                                    arrayList6.add(AbstractC16714l.crashlytics((AudioPlaylist) ((Map.Entry) it7.next()).getValue(), c9554l, str4));
                                                }
                                                c10227lAdmob.addAll(arrayList6);
                                            } else if (catalog2Block instanceof Catalog2Block.LinksBlock) {
                                                arrayList5 = new ArrayList(linkedHashMap.size());
                                                it6 = linkedHashMap.entrySet().iterator();
                                                while (it6.hasNext()) {
                                                    arrayList5.add(AbstractC16714l.loadAd((CustomCatalogBlockItem) ((Map.Entry) it6.next()).getValue(), str4));
                                                }
                                                c10227lAdmob.addAll(arrayList5);
                                            }
                                        } else if (loadAd instanceof C10431l) {
                                            if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                                                musicAudiosBlock = (Catalog2Block.MusicAudiosBlock) catalog2Block;
                                                arrayList4 = new ArrayList(linkedHashMap3.size());
                                                it5 = linkedHashMap3.entrySet().iterator();
                                                while (it5.hasNext()) {
                                                    arrayList4.add(AbstractC16714l.yandex((AudioTrack) ((Map.Entry) it5.next()).getValue(), musicAudiosBlock.yandex, str4));
                                                }
                                                c10227lAdmob.addAll(arrayList4);
                                            }
                                        } else if (!(loadAd instanceof C9203l)) {
                                            if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                                                arrayList3 = new ArrayList(linkedHashMap2.size());
                                                it4 = linkedHashMap2.entrySet().iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(AbstractC16714l.crashlytics((AudioPlaylist) ((Map.Entry) it4.next()).getValue(), c9554l, str4));
                                                }
                                                c10227lAdmob.addAll(arrayList3);
                                            } else if (catalog2Block instanceof Catalog2Block.LinksBlock) {
                                                arrayList2 = new ArrayList(linkedHashMap.size());
                                                it3 = linkedHashMap.entrySet().iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(AbstractC16714l.loadAd((CustomCatalogBlockItem) ((Map.Entry) it3.next()).getValue(), str4));
                                                }
                                                c10227lAdmob.addAll(arrayList2);
                                            }
                                        }
                                    }
                                    str3 = str5;
                                    it = it2;
                                }
                                i6 = 2;
                                listPurchase = AbstractC14055l.purchase(c10227lAdmob);
                                str2 = str3;
                            }
                        } else {
                            i6 = 2;
                        }
                    }
                }
                return enumC9342l;
            }
            if (i8 == 1) {
                AbstractC2829l.crashlytics(objAdmob);
                c18435l = (List) objAdmob;
                if (c18435l instanceof C18435l) {
                    obj = null;
                } else {
                    obj = c18435l;
                }
                list = (List) obj;
                if (list != null) {
                    list3 = list;
                }
                arrayList = new ArrayList(AbstractC14055l.billing(list3, 10));
                while (r1.hasNext()) {
                    C0935l c0935l2 = new C0935l();
                    C9258l c9258l2 = AbstractC1186l.f3181l;
                    C13708l c13708l3 = C13708l.f26763l;
                    List list5 = Collections.EMPTY_LIST;
                    C13708l c13708l4 = C13708l.f26763l;
                    C2410l c2410l2 = new C2410l();
                    C11470l c11470l2 = C11470l.amazon;
                    String str7 = "sysrecs:" + audioWidgetItem.purchase;
                    C3117l c3117l2 = new C3117l();
                    c3117l2.yandex = audioWidgetItem.loadAd;
                    c3117l2.billing = audioWidgetItem.amazon;
                    c3117l2.vip = Uri.parse(audioWidgetItem.purchase);
                    c3117l2.subscription = Boolean.TRUE;
                    c3117l2.ads = Boolean.FALSE;
                    c3117l2.f6662synchronized = new Integer(1);
                    arrayList.add(new C2427l(str7, new C9202l(c0935l2), null, new C7828l(c2410l2), new C3852l(c3117l2), c11470l2));
                }
                return C9201l.crashlytics(arrayList, new C17425l(Bundle.EMPTY, true, false, false));
            }
            if (i8 == 2) {
                AbstractC2829l.crashlytics(objAdmob);
                return objAdmob;
            }
            if (i8 == 3) {
                i4 = c2337l.f5062l;
                i5 = c2337l.f5068l;
                str2 = c2337l.f5066l;
                AbstractC2829l.crashlytics(objAdmob);
                i3 = 1;
                listPurchase = (List) objAdmob;
                if (listPurchase == null) {
                    C12772l c12772l2 = new C12772l(str2, 13);
                    c2337l.f5066l = str2;
                    c2337l.f5065l = c5760l;
                    c2337l.f5068l = i5;
                    c2337l.f5062l = i4;
                    c2337l.f5064l = 4;
                    objAdmob = AbstractC8189l.admob(c12772l2, c2337l);
                    if (objAdmob != enumC9342l) {
                        str3 = str2;
                    }
                    return enumC9342l;
                }
                i6 = 2;
            } else {
                if (i8 != 4) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c5760l = c2337l.f5065l;
                str3 = c2337l.f5066l;
                AbstractC2829l.crashlytics(objAdmob);
                i3 = 1;
            }
            Catalog2Response catalog2Response2 = (Catalog2Response) objAdmob;
            c5760l.getClass();
            c10227lAdmob = AbstractC14055l.admob();
            c9554l = new C9554l(catalog2Response2);
            catalog2Section = catalog2Response2.loadAd;
            if (catalog2Section != null) {
                list2 = catalog2Section.amazon;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                list3 = list2;
            }
            it = list3.iterator();
            str4 = "";
            while (it.hasNext()) {
                catalog2Block = (Catalog2Block) it.next();
                loadAd = catalog2Block.getLoadAd();
                if (loadAd instanceof Catalog2Layout.Header) {
                    str4 = ((Catalog2Layout.Header) loadAd).yandex;
                    if (str4 == null) {
                        str4 = "";
                    }
                    crashlytics = catalog2Block.getCrashlytics();
                    if (crashlytics != null || (catalog2Button = (Catalog2Button) AbstractC16901l.m4217extends(crashlytics)) == null) {
                        str5 = str3;
                        it2 = it;
                    } else {
                        int i9 = AbstractC8576l.yandex(catalog2Button.metrica, "music_audios") ? i3 : 2;
                        C0935l c0935l3 = new C0935l();
                        C9258l c9258l3 = AbstractC1186l.f3181l;
                        C13708l c13708l5 = C13708l.f26763l;
                        List list6 = Collections.EMPTY_LIST;
                        C2410l c2410l3 = new C2410l();
                        C11470l c11470l3 = C11470l.amazon;
                        StringBuilder sb = new StringBuilder("vkcatalog:");
                        str5 = str3;
                        sb.append(catalog2Button.loadAd);
                        String string = sb.toString();
                        C3117l c3117l3 = new C3117l();
                        c3117l3.yandex = catalog2Button.isPro;
                        c3117l3.f6662synchronized = 20;
                        c3117l3.subscription = Boolean.FALSE;
                        c3117l3.ads = Boolean.TRUE;
                        C8195l c8195l = new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str4);
                        it2 = it;
                        C8195l c8195l2 = new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", Integer.valueOf(i9));
                        C8195l c8195l3 = new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", Integer.valueOf(i9));
                        C8195l[] c8195lArr = new C8195l[3];
                        c8195lArr[0] = c8195l;
                        c8195lArr[i3] = c8195l2;
                        c8195lArr[2] = c8195l3;
                        c3117l3.f6661strictfp = AbstractC1315l.loadAd(c8195lArr);
                        c10227lAdmob.add(new C2427l(string, new C9202l(c0935l3), null, new C7828l(c2410l3), new C3852l(c3117l3), c11470l3));
                    }
                } else {
                    str5 = str3;
                    it2 = it;
                    z = loadAd instanceof C1188l;
                    linkedHashMap = c9554l.purchase;
                    linkedHashMap2 = c9554l.loadAd;
                    linkedHashMap3 = c9554l.yandex;
                    if (z) {
                        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                            musicAudiosBlock2 = (Catalog2Block.MusicAudiosBlock) catalog2Block;
                            arrayList7 = new ArrayList(linkedHashMap3.size());
                            it8 = linkedHashMap3.entrySet().iterator();
                            while (it8.hasNext()) {
                                arrayList7.add(AbstractC16714l.yandex((AudioTrack) ((Map.Entry) it8.next()).getValue(), musicAudiosBlock2.yandex, str4));
                            }
                            c10227lAdmob.addAll(arrayList7);
                        } else if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            arrayList6 = new ArrayList(linkedHashMap2.size());
                            it7 = linkedHashMap2.entrySet().iterator();
                            while (it7.hasNext()) {
                                arrayList6.add(AbstractC16714l.crashlytics((AudioPlaylist) ((Map.Entry) it7.next()).getValue(), c9554l, str4));
                            }
                            c10227lAdmob.addAll(arrayList6);
                        } else if (catalog2Block instanceof Catalog2Block.LinksBlock) {
                            arrayList5 = new ArrayList(linkedHashMap.size());
                            it6 = linkedHashMap.entrySet().iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(AbstractC16714l.loadAd((CustomCatalogBlockItem) ((Map.Entry) it6.next()).getValue(), str4));
                            }
                            c10227lAdmob.addAll(arrayList5);
                        }
                    } else if (loadAd instanceof C10431l) {
                        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                            musicAudiosBlock = (Catalog2Block.MusicAudiosBlock) catalog2Block;
                            arrayList4 = new ArrayList(linkedHashMap3.size());
                            it5 = linkedHashMap3.entrySet().iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(AbstractC16714l.yandex((AudioTrack) ((Map.Entry) it5.next()).getValue(), musicAudiosBlock.yandex, str4));
                            }
                            c10227lAdmob.addAll(arrayList4);
                        }
                    } else if (!(loadAd instanceof C9203l)) {
                        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            arrayList3 = new ArrayList(linkedHashMap2.size());
                            it4 = linkedHashMap2.entrySet().iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(AbstractC16714l.crashlytics((AudioPlaylist) ((Map.Entry) it4.next()).getValue(), c9554l, str4));
                            }
                            c10227lAdmob.addAll(arrayList3);
                        } else if (catalog2Block instanceof Catalog2Block.LinksBlock) {
                            arrayList2 = new ArrayList(linkedHashMap.size());
                            it3 = linkedHashMap.entrySet().iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(AbstractC16714l.loadAd((CustomCatalogBlockItem) ((Map.Entry) it3.next()).getValue(), str4));
                            }
                            c10227lAdmob.addAll(arrayList2);
                        }
                    }
                }
                str3 = str5;
                it = it2;
            }
            i6 = 2;
            listPurchase = AbstractC14055l.purchase(c10227lAdmob);
            str2 = str3;
            Bundle bundle = Bundle.EMPTY;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", (str2.equals("folder_playlists") || str2.equals("folder_albums")) ? i6 : i3);
            bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 3);
            Unit unit = Unit.INSTANCE;
            return C9201l.crashlytics(listPurchase, new C17425l(bundle2, false, false, false));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
    }
}
