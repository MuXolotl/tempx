package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.methods.execute.SearchInProfile$SearchPlaylistResponse;
import ua.itaysonlab.vkapi2.methods.execute.SearchInProfile$SearchResponse;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lُؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4817l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C9351l f9863l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public String f9864l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ long f9865l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4817l(long j) {
        super(null);
        this.f9865l = j;
        this.f9863l = new C9351l(2, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.AbstractC9694l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C10947l c10947l;
        C14496l c14496l;
        if (interfaceC14029l instanceof C10947l) {
            c10947l = (C10947l) interfaceC14029l;
            int i2 = c10947l.f22077l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10947l.f22077l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10947l = new C10947l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c10947l = new C10947l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAdmob = c10947l.f22078l;
        int i3 = c10947l.f22077l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            String str = this.f9864l;
            if (str == null) {
                str = "";
            }
            C12772l c12772l = new C12772l(this.f9865l, str);
            c14496l = C14496l.yandex;
            c10947l.f22079l = c14496l;
            c10947l.f22077l = 1;
            objAdmob = AbstractC8189l.admob(c12772l, c10947l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14496l = c10947l.f22079l;
            AbstractC2829l.crashlytics(objAdmob);
        }
        SearchInProfile$SearchResponse searchInProfile$SearchResponse = (SearchInProfile$SearchResponse) objAdmob;
        c14496l.getClass();
        List list = searchInProfile$SearchResponse.loadAd;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse = searchInProfile$SearchResponse.yandex;
        List list2 = searchInProfile$SearchPlaylistResponse.yandex;
        if (!list2.isEmpty()) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(C14496l.loadAd(), new Catalog2Layout.Header("Плейлисты и альбомы"), null, null, null, new Catalog2Badge("transparent", String.valueOf(list2.size())), 28));
            String strLoadAd = C14496l.loadAd();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC14770l.vip((AudioPlaylist) it.next()));
            }
            c10227lAdmob.add(new Catalog2Block.MusicPlaylistsBlock(strLoadAd, C0567l.yandex, null, null, null, arrayList, null, 92));
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(C14496l.loadAd(), new Catalog2Layout.Separator(null, 1), null, null, null, null, 60));
        }
        if (!list.isEmpty()) {
            c10227lAdmob.add(new Catalog2Block.NoDataBlock(C14496l.loadAd(), new Catalog2Layout.Header("Треки"), null, null, null, new Catalog2Badge("transparent", String.valueOf(list.size())), 28));
            String strLoadAd2 = C14496l.loadAd();
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC16676l.mopub((AudioTrack) it2.next()));
            }
            c10227lAdmob.add(new Catalog2Block.MusicAudiosBlock(28, strLoadAd2, null, null, null, arrayList2, C1188l.yandex));
        }
        Unit unit = Unit.INSTANCE;
        return Collections.singletonList(new Catalog2Response(null, new Catalog2Section("synth_c2sea", "", null, AbstractC14055l.purchase(c10227lAdmob), null, 20), null, null, searchInProfile$SearchPlaylistResponse.loadAd, searchInProfile$SearchPlaylistResponse.crashlytics, null, null, null, searchInProfile$SearchResponse.loadAd, searchInProfile$SearchPlaylistResponse.yandex, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740237));
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return */
    public final Cgoto mo781return() {
        return this.f9863l;
    }
}
