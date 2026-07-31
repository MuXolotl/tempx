package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٌؚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3277l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f7012l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6069l f7013l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3277l(C6069l c6069l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7013l = c6069l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objSmaato;
        int i = this.f7012l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C11485l c11485l = C11485l.f23075l;
            this.f7012l = 1;
            objSmaato = c11485l.smaato(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSmaato == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            objSmaato = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objSmaato) {
            CachedPlaylist cachedPlaylist = (CachedPlaylist) obj2;
            if (cachedPlaylist.adcel() == -1337) {
                long jAdvert = cachedPlaylist.advert();
                C16287l.yandex.getClass();
                if (jAdvert == C16287l.crashlytics()) {
                }
            }
            arrayList.add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CachedPlaylist) it.next()).crashlytics());
        }
        String strTapsense = AbstractC16778l.tapsense();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(AbstractC14770l.vip((AudioPlaylist) it2.next()));
        }
        arrayList3.add(new Catalog2Block.MusicPlaylistsBlock("persist_", C1188l.yandex, null, null, null, arrayList4, null, 92));
        Unit unit = Unit.INSTANCE;
        Unit unit2 = Unit.INSTANCE;
        return new Catalog2Response(null, new Catalog2Section(strTapsense, "Плейлисты и альбомы", null, arrayList3, null, 20), null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740797);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C3277l(this.f7013l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3277l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
