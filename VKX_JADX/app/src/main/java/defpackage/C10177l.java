package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lٌَؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10177l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f20734l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ EnumC6358l f20735l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C16553l f20736l;

    public C10177l(C16553l c16553l, EnumC6358l enumC6358l, List list) {
        this.f20736l = c16553l;
        this.f20735l = enumC6358l;
        this.f20734l = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C10244l c10244l = C10244l.purchase;
        CatalogArtist catalogArtist = this.f20736l.f32501l;
        c10244l.loadAd(new C17685l(new AudioPlaylist(0, 0L, null, null, catalogArtist.yandex + " - " + this.f20735l.f13326l, null, 0, 0, 0, 0L, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, null, false, false, -17, 7), this.f20734l, catalogArtist.yandex));
        return Unit.INSTANCE;
    }
}
