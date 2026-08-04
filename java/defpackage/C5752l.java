package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lؘ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5752l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f12145l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f12146l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f12147l = 1;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f12148l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5752l(C0228l c0228l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f12146l = c0228l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f12147l) {
            case 0:
                C15237l c15237l = (C15237l) this.f12148l;
                C15237l c15237l2 = (C15237l) this.f12145l;
                AbstractC2829l.crashlytics(obj);
                C0228l c0228l = (C0228l) this.f12146l;
                int i = C0228l.f1198l;
                AudioTrack audioTrack = (AudioTrack) c0228l.isVip().get(c15237l.yandex - 2);
                audioTrack.getClass();
                String strMopub = AbstractC16676l.mopub(audioTrack);
                C12376l c12376l = c0228l.f1205l;
                if (c12376l.get(strMopub) == EnumC11199l.f22552l) {
                    c12376l.put(strMopub, EnumC11199l.f22554l);
                }
                ArrayList arrayList = new ArrayList(c0228l.isVip());
                Collections.swap(arrayList, c15237l.yandex - 2, c15237l2.yandex - 2);
                c0228l.f1199l.setValue(AbstractC0509l.billing(arrayList));
                c0228l.advert();
                return Unit.INSTANCE;
            default:
                C16480l c16480l = (C16480l) this.f12148l;
                C16480l c16480l2 = (C16480l) this.f12145l;
                EnumC9736l enumC9736l = (EnumC9736l) this.f12146l;
                AbstractC2829l.crashlytics(obj);
                int iOrdinal = enumC9736l.ordinal();
                if (iOrdinal == 0) {
                    InterfaceC5130l<CachedPlaylist> interfaceC5130lYandex = c16480l.yandex();
                    ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC5130lYandex, 10));
                    for (CachedPlaylist cachedPlaylist : interfaceC5130lYandex) {
                        String str = "playlist_" + cachedPlaylist.m4618throws();
                        String strTapsense = AbstractC5309l.crashlytics(cachedPlaylist).f27331l.tapsense();
                        String strInmobi = cachedPlaylist.inmobi();
                        String strIsVip = cachedPlaylist.isVip();
                        if (strIsVip == null) {
                            strIsVip = "";
                        }
                        arrayList2.add(new C8643l(str, strTapsense, strInmobi, strIsVip, new C1733l(cachedPlaylist.m4618throws())));
                    }
                    return arrayList2;
                }
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return null;
                }
                InterfaceC5130l<CachedAlbum> interfaceC5130lYandex2 = c16480l2.yandex();
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC5130lYandex2, 10));
                for (CachedAlbum cachedAlbum : interfaceC5130lYandex2) {
                    String str2 = "album_" + cachedAlbum.remoteconfig();
                    String strRemoteconfig = cachedAlbum.remoteconfig();
                    if (strRemoteconfig == null) {
                        strRemoteconfig = "";
                    }
                    String strTapsense2 = AbstractC0825l.admob(4, strRemoteconfig).f27331l.tapsense();
                    String strIsPro = cachedAlbum.isPro();
                    String strLoadAd = cachedAlbum.loadAd();
                    String strRemoteconfig2 = cachedAlbum.remoteconfig();
                    if (strRemoteconfig2 == null) {
                        strRemoteconfig2 = "";
                    }
                    arrayList3.add(new C8643l(str2, strTapsense2, strIsPro, strLoadAd, new C4574l(strRemoteconfig2)));
                }
                return arrayList3;
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f12147l) {
            case 0:
                C5752l c5752l = new C5752l((C0228l) this.f12146l, (InterfaceC14029l) obj4);
                c5752l.f12148l = (C15237l) obj2;
                c5752l.f12145l = (C15237l) obj3;
                return c5752l.Signature(Unit.INSTANCE);
            default:
                C5752l c5752l2 = new C5752l(4, (InterfaceC14029l) obj4);
                c5752l2.f12148l = (C16480l) obj;
                c5752l2.f12145l = (C16480l) obj2;
                c5752l2.f12146l = (EnumC9736l) obj3;
                return c5752l2.Signature(Unit.INSTANCE);
        }
    }

    public /* synthetic */ C5752l(int i, InterfaceC14029l interfaceC14029l) {
        super(i, interfaceC14029l);
    }
}
