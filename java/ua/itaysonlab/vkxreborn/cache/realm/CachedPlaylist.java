package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC15684l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC5293l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9029l;
import defpackage.AbstractC9795l;
import defpackage.C0125l;
import defpackage.C0287l;
import defpackage.C0717l;
import defpackage.C10917l;
import defpackage.C11085l;
import defpackage.C11346l;
import defpackage.C11697l;
import defpackage.C12093l;
import defpackage.C12880l;
import defpackage.C13066l;
import defpackage.C1332l;
import defpackage.C13965l;
import defpackage.C14188l;
import defpackage.C14308l;
import defpackage.C1485l;
import defpackage.C16058l;
import defpackage.C17340l;
import defpackage.C17476l;
import defpackage.C18725l;
import defpackage.C2065l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2567l;
import defpackage.C2782l;
import defpackage.C3439l;
import defpackage.C3540l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4211l;
import defpackage.C4272l;
import defpackage.C4506l;
import defpackage.C5050l;
import defpackage.C5143l;
import defpackage.C5180l;
import defpackage.C5569l;
import defpackage.C5827l;
import defpackage.C6735l;
import defpackage.C7255l;
import defpackage.C7507l;
import defpackage.C7742l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.C9251l;
import defpackage.C9450l;
import defpackage.C9845l;
import defpackage.InterfaceC11334l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC3327l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylist;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedPlaylist implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final InterfaceC1388l f36707l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final Map f36708l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final C4506l f36709l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final int f36710l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final String f36711l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public long f36713l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public String f36714l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f36715l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f36716l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public long f36717l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public String f36718l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f36719l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f36722l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public String f36725l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f36726l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public boolean f36727l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f36729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f36731l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f36732l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f36733l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f36735l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C1332l f36736l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f36737l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f36738l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f36739l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public String f36740l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f36741l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public String f36742l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public CachedEmbeddedThumb f36743l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36723l = "";

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public String f36730l = "";

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public String f36720l = "";

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public String f36724l = "playlist";

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public InterfaceC11334l f36721l = AbstractC15684l.purchase(new CachedEmbeddedThumb[0]);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public InterfaceC11334l f36728l = AbstractC15684l.purchase(new CachedVkGenre[0]);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public InterfaceC11334l f36734l = AbstractC15684l.purchase(new CachedTrack[0]);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public InterfaceC11334l f36712l = AbstractC15684l.purchase(new CachedArtist[0]);

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPlaylist$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedPlaylist.f36710l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedPlaylist();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedPlaylist.f36708l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedPlaylist.f36707l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedPlaylist.f36709l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            C7507l c7507l = new C7507l("CachedPlaylist", "uid", 31L, 0L, AbstractC10340l.crashlytics(), 0);
            C11085l c11085lLoadAd = AbstractC0593l.loadAd("uid", 3, 1, null, "", false, true, false);
            C11085l c11085lLoadAd2 = AbstractC0593l.loadAd("id", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd3 = AbstractC0593l.loadAd("ownerId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd4 = AbstractC0593l.loadAd("origOwnerId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd5 = AbstractC0593l.loadAd("origPlaylistId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd6 = AbstractC0593l.loadAd("folPlaylistId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd7 = AbstractC0593l.loadAd("folOwnerId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd8 = AbstractC0593l.loadAd("type", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd9 = AbstractC0593l.loadAd("count", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd10 = AbstractC0593l.loadAd("followers", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd11 = AbstractC0593l.loadAd("plays", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd12 = AbstractC0593l.loadAd("year", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd13 = AbstractC0593l.loadAd("accessKey", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd14 = AbstractC0593l.loadAd("origAccessKey", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd15 = AbstractC0593l.loadAd("title", 3, 1, null, "", false, false, false);
            C11085l c11085lLoadAd16 = AbstractC0593l.loadAd("localizedSearchTitle", 3, 1, null, "", false, false, true);
            C11085l c11085lLoadAd17 = AbstractC0593l.loadAd("ownerTitle", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd18 = AbstractC0593l.loadAd("subtitle", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd19 = AbstractC0593l.loadAd("albumType", 3, 1, null, "", false, false, false);
            C11085l c11085lLoadAd20 = AbstractC0593l.loadAd("description", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd21 = AbstractC0593l.loadAd("createTime", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd22 = AbstractC0593l.loadAd("updateTime", 1, 1, null, "", false, false, false);
            C2336l c2336l = AbstractC18202l.yandex;
            return new C3971l(c7507l, AbstractC14055l.remoteconfig(c11085lLoadAd, c11085lLoadAd2, c11085lLoadAd3, c11085lLoadAd4, c11085lLoadAd5, c11085lLoadAd6, c11085lLoadAd7, c11085lLoadAd8, c11085lLoadAd9, c11085lLoadAd10, c11085lLoadAd11, c11085lLoadAd12, c11085lLoadAd13, c11085lLoadAd14, c11085lLoadAd15, c11085lLoadAd16, c11085lLoadAd17, c11085lLoadAd18, c11085lLoadAd19, c11085lLoadAd20, c11085lLoadAd21, c11085lLoadAd22, AbstractC0593l.loadAd("photo", 9, 1, c2336l.loadAd(CachedEmbeddedThumb.class), "", true, false, false), AbstractC0593l.loadAd("thumbs", 9, 2, c2336l.loadAd(CachedEmbeddedThumb.class), "", false, false, false), AbstractC0593l.loadAd("genres", 9, 2, c2336l.loadAd(CachedVkGenre.class), "", false, false, false), AbstractC0593l.loadAd("audios", 9, 2, c2336l.loadAd(CachedTrack.class), "", false, false, false), AbstractC0593l.loadAd("mainArtists", 9, 2, c2336l.loadAd(CachedArtist.class), "", false, false, false), AbstractC0593l.loadAd("isExplicit", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isFollowing", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isAvailableOffline", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isLegacyCachedArtwork", 2, 1, null, "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedPlaylist.f36711l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36707l = c2336l.loadAd(CachedPlaylist.class);
        f36711l = "CachedPlaylist";
        C8195l c8195l = new C8195l("uid", new C8195l(c2336l.loadAd(String.class), C10917l.f22040l));
        Class cls = Long.TYPE;
        C8195l c8195l2 = new C8195l("id", new C8195l(c2336l.loadAd(cls), C7742l.f16251l));
        C8195l c8195l3 = new C8195l("ownerId", new C8195l(c2336l.loadAd(cls), C6735l.f14107l));
        C8195l c8195l4 = new C8195l("origOwnerId", new C8195l(c2336l.loadAd(cls), C9251l.f19018l));
        C8195l c8195l5 = new C8195l("origPlaylistId", new C8195l(c2336l.loadAd(cls), C9845l.f20041l));
        C8195l c8195l6 = new C8195l("folPlaylistId", new C8195l(c2336l.loadAd(cls), C5569l.f11848l));
        C8195l c8195l7 = new C8195l("folOwnerId", new C8195l(c2336l.loadAd(cls), C13965l.f27255l));
        Class cls2 = Integer.TYPE;
        C8195l c8195l8 = new C8195l("type", new C8195l(c2336l.loadAd(cls2), C9450l.f19311l));
        C8195l c8195l9 = new C8195l("count", new C8195l(c2336l.loadAd(cls2), C13066l.f25582l));
        C8195l c8195l10 = new C8195l("followers", new C8195l(c2336l.loadAd(cls2), C5143l.f11186l));
        C8195l c8195l11 = new C8195l("plays", new C8195l(c2336l.loadAd(cls2), C14308l.f27999l));
        C8195l c8195l12 = new C8195l("year", new C8195l(c2336l.loadAd(cls2), C1485l.f3701l));
        C8195l c8195l13 = new C8195l("accessKey", new C8195l(c2336l.loadAd(String.class), C12880l.f25325l));
        C8195l c8195l14 = new C8195l("origAccessKey", new C8195l(c2336l.loadAd(String.class), C3540l.f7444l));
        C8195l c8195l15 = new C8195l("title", new C8195l(c2336l.loadAd(String.class), C16058l.f31462l));
        C8195l c8195l16 = new C8195l("localizedSearchTitle", new C8195l(c2336l.loadAd(String.class), C0287l.f1306l));
        C8195l c8195l17 = new C8195l("ownerTitle", new C8195l(c2336l.loadAd(String.class), C7255l.f15092l));
        C8195l c8195l18 = new C8195l("subtitle", new C8195l(c2336l.loadAd(String.class), C3439l.f7314l));
        C8195l c8195l19 = new C8195l("albumType", new C8195l(c2336l.loadAd(String.class), C12093l.f24019l));
        C8195l c8195l20 = new C8195l("description", new C8195l(c2336l.loadAd(String.class), C0125l.f1027l));
        C8195l c8195l21 = new C8195l("createTime", new C8195l(c2336l.loadAd(cls), C5827l.f12282l));
        C8195l c8195l22 = new C8195l("updateTime", new C8195l(c2336l.loadAd(cls), C11346l.f22885l));
        C8195l c8195l23 = new C8195l("photo", new C8195l(c2336l.loadAd(CachedEmbeddedThumb.class), C2065l.f4603l));
        C8195l c8195l24 = new C8195l("thumbs", new C8195l(c2336l.loadAd(CachedEmbeddedThumb.class), C17476l.f34045l));
        C8195l c8195l25 = new C8195l("genres", new C8195l(c2336l.loadAd(CachedVkGenre.class), C5180l.f11246l));
        C8195l c8195l26 = new C8195l("audios", new C8195l(c2336l.loadAd(CachedTrack.class), C17340l.f33700l));
        C8195l c8195l27 = new C8195l("mainArtists", new C8195l(c2336l.loadAd(CachedArtist.class), C11697l.f23445l));
        Class cls3 = Boolean.TYPE;
        f36708l = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, c8195l6, c8195l7, c8195l8, c8195l9, c8195l10, c8195l11, c8195l12, c8195l13, c8195l14, c8195l15, c8195l16, c8195l17, c8195l18, c8195l19, c8195l20, c8195l21, c8195l22, c8195l23, c8195l24, c8195l25, c8195l26, c8195l27, new C8195l("isExplicit", new C8195l(c2336l.loadAd(cls3), C5050l.f10317l)), new C8195l("isFollowing", new C8195l(c2336l.loadAd(cls3), C2567l.f5586l)), new C8195l("isAvailableOffline", new C8195l(c2336l.loadAd(cls3), C4211l.f8643l)), new C8195l("isLegacyCachedArtwork", new C8195l(c2336l.loadAd(cls3), C14188l.f27784l)));
        f36709l = C4506l.f9143l;
        f36710l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36807l() {
        return this.f36736l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4589abstract(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36715l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("ownerId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final long ad() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36731l;
        }
        long j = c1332l.crashlytics("origPlaylistId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final long adcel() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36722l;
        }
        long j = c1332l.crashlytics("id").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36736l = c1332l;
    }

    public final long advert() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36715l;
        }
        long j = c1332l.crashlytics("ownerId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final String applovin() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36742l;
        }
        long j = c1332l.crashlytics("subtitle").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final InterfaceC11334l appmetrica() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36721l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedEmbeddedThumb.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("thumbs"), interfaceC1388lLoadAd, i, false, false);
    }

    public final int billing() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36737l;
        }
        long j = c1332l.crashlytics("count").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m4590break(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36723l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("uid").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m4591case(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36718l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("description").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m4592catch(int i) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36737l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("count").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m4593class(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36738l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("folPlaylistId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m4594continue(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36716l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("folOwnerId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final AudioPlaylist crashlytics() {
        int iAdcel = (int) adcel();
        long jAdvert = advert();
        String strYandex = yandex();
        String str = AbstractC8576l.yandex(loadAd(), "playlist") ? "ugc" : "album";
        AudioPlaylist.AlbumMeta albumMeta = new AudioPlaylist.AlbumMeta("album", loadAd());
        String strInmobi = inmobi();
        String strIsPro = isPro();
        int iBilling = billing();
        int iMetrica = metrica();
        int iPremium = premium();
        long jSubs = subs();
        long jM4607package = m4607package();
        boolean zM4605native = m4605native();
        int iM4615synchronized = m4615synchronized();
        boolean zM4621volatile = m4621volatile();
        String strApplovin = applovin();
        String strIsVip = isVip();
        FollowedMetadata followedMetadata = (vip() == 0 || remoteconfig() == 0) ? null : new FollowedMetadata((int) vip(), remoteconfig());
        OriginalPlaylist originalPlaylist = (ad() == 0 || pro() == 0) ? null : new OriginalPlaylist(pro(), (int) ad(), license());
        CachedEmbeddedThumb cachedEmbeddedThumbSignatures = signatures();
        AlbumThumb albumThumbYandex = cachedEmbeddedThumbSignatures != null ? cachedEmbeddedThumbSignatures.yandex() : null;
        InterfaceC11334l<CachedVkGenre> interfaceC11334lStartapp = startapp();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC11334lStartapp, 10));
        for (CachedVkGenre cachedVkGenre : interfaceC11334lStartapp) {
            arrayList.add(new Genre(cachedVkGenre.yandex(), cachedVkGenre.loadAd()));
        }
        InterfaceC11334l interfaceC11334lPurchase = purchase();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC11334lPurchase, 10));
        Iterator<E> it = interfaceC11334lPurchase.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CachedTrack) it.next()).crashlytics());
        }
        InterfaceC11334l interfaceC11334lAppmetrica = appmetrica();
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC11334lAppmetrica, 10));
        Iterator<E> it2 = interfaceC11334lAppmetrica.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((CachedEmbeddedThumb) it2.next()).yandex());
        }
        InterfaceC11334l interfaceC11334lSubscription = subscription();
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(interfaceC11334lSubscription, 10));
        Iterator<E> it3 = interfaceC11334lSubscription.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((CachedArtist) it3.next()).yandex());
        }
        return new AudioPlaylist(iAdcel, jAdvert, str, albumMeta, strInmobi, strIsPro, iBilling, iMetrica, iPremium, jSubs, Long.valueOf(jM4607package), arrayList, Boolean.valueOf(zM4605native), null, arrayList2, iM4615synchronized, followedMetadata, originalPlaylist, albumThumbYandex, arrayList3, strYandex, Boolean.valueOf(zM4621volatile), strApplovin, arrayList4, false, false, null, null, null, null, null, true, strIsVip, m4612strictfp(), m4608private(), 2130714624, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m4595default(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36722l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("id").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m4596else(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36717l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("createTime").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
            if (AbstractC15011l.subs(interfaceC9671l) && AbstractC15011l.isPro(this) == AbstractC15011l.isPro(interfaceC9671l)) {
                return AbstractC8576l.yandex(AbstractC6710l.purchase(this), AbstractC6710l.purchase(interfaceC9671l));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m4597extends(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36714l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("accessKey").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m4598final(boolean z) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36726l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isLegacyCachedArtwork").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4599finally(int i) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36739l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("plays").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m4600for(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36724l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("albumType").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m4601goto(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36740l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("origAccessKey").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final int hashCode() {
        return C2782l.pro(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4602import(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36731l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("origPlaylistId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final String inmobi() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36730l;
        }
        long j = c1332l.crashlytics("title").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4603instanceof(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36725l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("ownerTitle").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m4604interface(int i) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36729l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("followers").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final String isPro() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36718l;
        }
        long j = c1332l.crashlytics("description").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final String isVip() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36725l;
        }
        long j = c1332l.crashlytics("ownerTitle").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final String license() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36740l;
        }
        long j = c1332l.crashlytics("origAccessKey").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final String loadAd() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36724l;
        }
        long j = c1332l.crashlytics("albumType").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final int metrica() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36729l;
        }
        long j = c1332l.crashlytics("followers").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean m4605native() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36733l;
        }
        long j = c1332l.crashlytics("isFollowing").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m4606new(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36720l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("localizedSearchTitle").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final long m4607package() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36713l;
        }
        long j = c1332l.crashlytics("updateTime").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final int premium() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36739l;
        }
        long j = c1332l.crashlytics("plays").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean m4608private() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36726l;
        }
        long j = c1332l.crashlytics("isLegacyCachedArtwork").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final long pro() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36732l;
        }
        long j = c1332l.crashlytics("origOwnerId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m4609protected(int i) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36735l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("year").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4610public(CachedEmbeddedThumb cachedEmbeddedThumb) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36743l = cachedEmbeddedThumb;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1332l.yandex();
        long j = c1332l.crashlytics("photo").amazon;
        if (cachedEmbeddedThumb == null) {
            C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
            C2782l.isVip(c1332l, j, c3585lRemoteconfig.signatures());
            Unit unit = Unit.INSTANCE;
            c3585lRemoteconfig.tapsense();
            return;
        }
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        C2782l.isPro(AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC18202l.yandex.loadAd(cachedEmbeddedThumb.getClass()), c1332l.f3423l, c1332l.f3419l), cachedEmbeddedThumb, 2, linkedHashMap);
    }

    public final InterfaceC11334l purchase() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36734l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedTrack.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("audios"), interfaceC1388lLoadAd, i, false, false);
    }

    public final long remoteconfig() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36716l;
        }
        long j = c1332l.crashlytics("folOwnerId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final CachedEmbeddedThumb signatures() {
        InterfaceC2851l interfaceC2851lIsPro;
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36743l;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo").amazon;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            interfaceC2851lIsPro = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.yandex, realm_value_tVar2);
            interfaceC2851lIsPro = AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), AbstractC18202l.yandex.loadAd(CachedEmbeddedThumb.class), c1332l.f3423l, c1332l.f3419l);
        }
        return (CachedEmbeddedThumb) interfaceC2851lIsPro;
    }

    public final InterfaceC11334l startapp() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36728l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedVkGenre.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("genres"), interfaceC1388lLoadAd, i, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m4611static(boolean z) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36733l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isFollowing").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m4612strictfp() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36741l;
        }
        long j = c1332l.crashlytics("isAvailableOffline").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final long subs() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36717l;
        }
        long j = c1332l.crashlytics("createTime").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    public final InterfaceC11334l subscription() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36712l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedArtist.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("mainArtists"), interfaceC1388lLoadAd, i, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m4613super(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36732l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("origOwnerId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m4614switch(boolean z) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36727l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isExplicit").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int m4615synchronized() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36735l;
        }
        long j = c1332l.crashlytics("year").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4616this(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36742l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("subtitle").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m4617throw(boolean z) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36741l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isAvailableOffline").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m4618throws() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36723l;
        }
        long j = c1332l.crashlytics("uid").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final String toString() {
        return C2782l.ad(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m4619transient(long j) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36713l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("updateTime").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m4620try(String str) {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            this.f36730l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("title").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    public final long vip() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36738l;
        }
        long j = c1332l.crashlytics("folPlaylistId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m4621volatile() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36727l;
        }
        long j = c1332l.crashlytics("isExplicit").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final String yandex() {
        C1332l c1332l = this.f36736l;
        if (c1332l == null) {
            return this.f36714l;
        }
        long j = c1332l.crashlytics("accessKey").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }
}
