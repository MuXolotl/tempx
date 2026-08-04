package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Root;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lؚؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7015l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AudioPlaylist f14710l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f14711l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C6069l f14712l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f14713l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f14714l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ArrayList f14715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7015l(C6069l c6069l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f14712l = c6069l;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x030e A[LOOP:4: B:101:0x0308->B:103:0x030e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ad A[EDGE_INSN: B:118:0x00ad->B:31:0x00ad BREAK  A[LOOP:6: B:23:0x008b->B:119:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[LOOP:5: B:19:0x006c->B:21:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0136 A[LOOP:1: B:56:0x0130->B:58:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x022c A[LOOP:2: B:66:0x0226->B:68:0x022c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x02df  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e6  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objMetrica;
        List<AudioTrack> list;
        Object objSmaato;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        Object next;
        AudioPlaylist audioPlaylist;
        int i;
        Object objBilling;
        AudioPlaylist audioPlaylist2;
        ArrayList<AudioPlaylist> arrayList2;
        AudioPlaylist audioPlaylist3;
        long j;
        C10227l c10227lAdmob;
        AudioPlaylist audioPlaylist4;
        boolean zIsEmpty;
        C2580l c2580l;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List list2;
        List list3;
        List list4;
        List list5;
        AudioAlbum audioAlbum;
        AudioAlbum audioAlbumYandex;
        ArrayList arrayList5;
        Iterator it3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Iterator it4;
        AudioPlaylist audioPlaylist5;
        long j2;
        int i2 = this.f14714l;
        int i3 = -1337;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1083l c1083l = C1083l.f2987l;
            this.f14714l = 1;
            objMetrica = C1083l.metrica(c1083l, 0, 0, this, 13);
            if (objMetrica != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            AbstractC2829l.crashlytics(obj);
            objMetrica = obj;
        } else {
            if (i2 == 2) {
                list = this.f14713l;
                AbstractC2829l.crashlytics(obj);
                objSmaato = obj;
                Iterable iterable = (Iterable) objSmaato;
                arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(AudioPlaylist.firebase(((CachedPlaylist) it.next()).crashlytics(), null, -17825793));
                }
                it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    audioPlaylist3 = (AudioPlaylist) next;
                    if (audioPlaylist3.crashlytics == -1337) {
                        j = audioPlaylist3.amazon;
                        C16287l.yandex.getClass();
                        if (j == C16287l.crashlytics()) {
                            break;
                        }
                    }
                }
                audioPlaylist = (AudioPlaylist) next;
                i = ((audioPlaylist != null || arrayList.size() <= 1) && (audioPlaylist != null || arrayList.isEmpty())) ? 0 : 1;
                this.f14713l = list;
                this.f14715l = arrayList;
                this.f14710l = audioPlaylist;
                this.f14711l = i;
                this.f14714l = 3;
                C6336l c6336l = C6336l.yandex;
                objBilling = C6336l.billing(new C8578l(7), this);
                if (objBilling != enumC9342l) {
                    audioPlaylist2 = audioPlaylist;
                    arrayList2 = arrayList;
                }
                return enumC9342l;
            }
            if (i2 != 3) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.f14711l;
            audioPlaylist2 = this.f14710l;
            arrayList2 = this.f14715l;
            List list6 = this.f14713l;
            AbstractC2829l.crashlytics(obj);
            i = i4;
            list = list6;
            objBilling = obj;
        }
        long jLongValue = ((Number) objBilling).longValue();
        c10227lAdmob = AbstractC14055l.admob();
        if (i != 0) {
            arrayList6 = new ArrayList();
            for (Object obj2 : arrayList2) {
                audioPlaylist5 = (AudioPlaylist) obj2;
                AudioPlaylist audioPlaylist6 = audioPlaylist2;
                if (audioPlaylist5.crashlytics == i3) {
                    j2 = audioPlaylist5.amazon;
                    C16287l.yandex.getClass();
                    if (j2 == C16287l.crashlytics()) {
                        arrayList6.add(obj2);
                    }
                } else {
                    arrayList6.add(obj2);
                }
                i3 = -1337;
                audioPlaylist2 = audioPlaylist6;
            }
            audioPlaylist4 = audioPlaylist2;
            arrayList7 = new ArrayList(AbstractC14055l.billing(arrayList6, 10));
            it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(AbstractC14770l.vip((AudioPlaylist) it4.next()));
            }
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Header("Плейлисты и альбомы"), Collections.singletonList(new Catalog2Button(new Catalog2ButtonAction.SynthCustomAction("Показать все", null, 0, new C17049l(9)), null, null, null, null, null, null, null, null, "Показать все", null, null, null, null, null, null, null, 130558)), null, null, new Catalog2Badge("transparent", String.valueOf(arrayList7.size())), 24));
            c10227lAdmob.add(new Catalog2Block.MusicPlaylistsBlock(AbstractC16778l.tapsense(), C0567l.yandex, null, null, null, arrayList7, null, 92));
            if (!list.isEmpty()) {
                c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
            }
        } else {
            audioPlaylist4 = audioPlaylist2;
        }
        zIsEmpty = list.isEmpty();
        c2580l = C2580l.f5619l;
        if (!zIsEmpty) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Header("Треки"), c2580l, null, null, new Catalog2Badge("transparent", String.valueOf(list.size())), 24));
            arrayList5 = new ArrayList(AbstractC14055l.billing(list, 10));
            it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList5.add(AbstractC16676l.mopub((AudioTrack) it3.next()));
            }
            c10227lAdmob.add(new Catalog2Block.MusicAudiosBlock(28, "persist_trackContent", null, null, null, arrayList5, C1188l.yandex));
        }
        if (list.isEmpty() && arrayList2.isEmpty() && jLongValue == 0 && audioPlaylist4 == null) {
            c10227lAdmob.add(new Catalog2Block.PlaceholdersBlock(28, AbstractC16778l.tapsense(), null, null, null, Collections.singletonList("_synth_trackEmpty"), C7750l.yandex));
        }
        Unit unit = Unit.INSTANCE;
        Catalog2Root catalog2Root = new Catalog2Root("vkxSynth", Collections.singletonList(new Catalog2Section("vkxSynth", "Кешированный контент", null, AbstractC14055l.purchase(c10227lAdmob), null, 20)));
        arrayList3 = new ArrayList(AbstractC14055l.billing(list, 10));
        for (AudioTrack audioTrack : list) {
            list2 = audioTrack.adcel;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                list3 = list2;
            } else {
                list3 = null;
            }
            list4 = audioTrack.startapp;
            if (list4 != null) {
                if (list4.isEmpty()) {
                    list4 = null;
                }
                list5 = list4;
            } else {
                list5 = null;
            }
            audioAlbum = audioTrack.vip;
            if (audioAlbum != null) {
                audioAlbumYandex = AudioAlbum.yandex(audioAlbum);
            } else {
                audioAlbumYandex = null;
            }
            arrayList3.add(AudioTrack.Signature(audioTrack, null, audioAlbumYandex, list5, list3, 0, -106497, 7));
        }
        arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        for (AudioPlaylist audioPlaylist7 : arrayList2) {
            arrayList4.add(AudioPlaylist.firebase(audioPlaylist7, audioPlaylist7.isVip, -9306113));
        }
        return new Catalog2Response(catalog2Root, null, null, null, null, null, null, null, null, arrayList3, arrayList4, null, null, null, null, null, null, null, null, Collections.singletonList(new Catalog2Placeholder("_synth_trackEmpty", "Похоже, тут пусто", "Кешированный контент автоматически появится тут после завершения загрузки в VK X", null, c2580l)), null, null, null, null, null, null, null, null, null, null, 1073215998);
        list = (List) objMetrica;
        C11485l c11485l = C11485l.f23075l;
        this.f14713l = list;
        this.f14714l = 2;
        objSmaato = c11485l.smaato(this);
        if (objSmaato != enumC9342l) {
            Iterable iterable2 = (Iterable) objSmaato;
            arrayList = new ArrayList(AbstractC14055l.billing(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(AudioPlaylist.firebase(((CachedPlaylist) it.next()).crashlytics(), null, -17825793));
            }
            it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                audioPlaylist3 = (AudioPlaylist) next;
                if (audioPlaylist3.crashlytics == -1337) {
                    j = audioPlaylist3.amazon;
                    C16287l.yandex.getClass();
                    if (j == C16287l.crashlytics()) {
                        break;
                        break;
                    }
                }
            }
            audioPlaylist = (AudioPlaylist) next;
            if (audioPlaylist != null) {
            }
            this.f14713l = list;
            this.f14715l = arrayList;
            this.f14710l = audioPlaylist;
            this.f14711l = i;
            this.f14714l = 3;
            C6336l c6336l2 = C6336l.yandex;
            objBilling = C6336l.billing(new C8578l(7), this);
            if (objBilling != enumC9342l) {
                audioPlaylist2 = audioPlaylist;
                arrayList2 = arrayList;
                long jLongValue2 = ((Number) objBilling).longValue();
                c10227lAdmob = AbstractC14055l.admob();
                if (i != 0) {
                    arrayList6 = new ArrayList();
                    while (r13.hasNext()) {
                        audioPlaylist5 = (AudioPlaylist) obj2;
                        AudioPlaylist audioPlaylist8 = audioPlaylist2;
                        if (audioPlaylist5.crashlytics == i3) {
                            j2 = audioPlaylist5.amazon;
                            C16287l.yandex.getClass();
                            if (j2 == C16287l.crashlytics()) {
                                arrayList6.add(obj2);
                            }
                        } else {
                            arrayList6.add(obj2);
                        }
                        i3 = -1337;
                        audioPlaylist2 = audioPlaylist8;
                    }
                    audioPlaylist4 = audioPlaylist2;
                    arrayList7 = new ArrayList(AbstractC14055l.billing(arrayList6, 10));
                    it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(AbstractC14770l.vip((AudioPlaylist) it4.next()));
                    }
                    c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Header("Плейлисты и альбомы"), Collections.singletonList(new Catalog2Button(new Catalog2ButtonAction.SynthCustomAction("Показать все", null, 0, new C17049l(9)), null, null, null, null, null, null, null, null, "Показать все", null, null, null, null, null, null, null, 130558)), null, null, new Catalog2Badge("transparent", String.valueOf(arrayList7.size())), 24));
                    c10227lAdmob.add(new Catalog2Block.MusicPlaylistsBlock(AbstractC16778l.tapsense(), C0567l.yandex, null, null, null, arrayList7, null, 92));
                    if (!list.isEmpty()) {
                        c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
                    }
                } else {
                    audioPlaylist4 = audioPlaylist2;
                }
                zIsEmpty = list.isEmpty();
                c2580l = C2580l.f5619l;
                if (!zIsEmpty) {
                    c10227lAdmob.add(new Catalog2Block.NoDataBlock(AbstractC16778l.tapsense(), new Catalog2Layout.Header("Треки"), c2580l, null, null, new Catalog2Badge("transparent", String.valueOf(list.size())), 24));
                    arrayList5 = new ArrayList(AbstractC14055l.billing(list, 10));
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(AbstractC16676l.mopub((AudioTrack) it3.next()));
                    }
                    c10227lAdmob.add(new Catalog2Block.MusicAudiosBlock(28, "persist_trackContent", null, null, null, arrayList5, C1188l.yandex));
                }
                if (list.isEmpty()) {
                    c10227lAdmob.add(new Catalog2Block.PlaceholdersBlock(28, AbstractC16778l.tapsense(), null, null, null, Collections.singletonList("_synth_trackEmpty"), C7750l.yandex));
                }
                Unit unit2 = Unit.INSTANCE;
                Catalog2Root catalog2Root2 = new Catalog2Root("vkxSynth", Collections.singletonList(new Catalog2Section("vkxSynth", "Кешированный контент", null, AbstractC14055l.purchase(c10227lAdmob), null, 20)));
                arrayList3 = new ArrayList(AbstractC14055l.billing(list, 10));
                while (r1.hasNext()) {
                    list2 = audioTrack.adcel;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        list3 = list2;
                    } else {
                        list3 = null;
                    }
                    list4 = audioTrack.startapp;
                    if (list4 != null) {
                        if (list4.isEmpty()) {
                            list4 = null;
                        }
                        list5 = list4;
                    } else {
                        list5 = null;
                    }
                    audioAlbum = audioTrack.vip;
                    if (audioAlbum != null) {
                        audioAlbumYandex = AudioAlbum.yandex(audioAlbum);
                    } else {
                        audioAlbumYandex = null;
                    }
                    arrayList3.add(AudioTrack.Signature(audioTrack, null, audioAlbumYandex, list5, list3, 0, -106497, 7));
                }
                arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                while (r3.hasNext()) {
                    arrayList4.add(AudioPlaylist.firebase(audioPlaylist7, audioPlaylist7.isVip, -9306113));
                }
                return new Catalog2Response(catalog2Root2, null, null, null, null, null, null, null, null, arrayList3, arrayList4, null, null, null, null, null, null, null, null, Collections.singletonList(new Catalog2Placeholder("_synth_trackEmpty", "Похоже, тут пусто", "Кешированный контент автоматически появится тут после завершения загрузки в VK X", null, c2580l)), null, null, null, null, null, null, null, null, null, null, 1073215998);
            }
        }
        return enumC9342l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C7015l(this.f14712l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7015l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
