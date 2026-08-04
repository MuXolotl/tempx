package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9029l;
import defpackage.AbstractC9795l;
import defpackage.C0544l;
import defpackage.C0717l;
import defpackage.C10929l;
import defpackage.C11085l;
import defpackage.C11243l;
import defpackage.C11875l;
import defpackage.C12296l;
import defpackage.C1332l;
import defpackage.C13845l;
import defpackage.C14411l;
import defpackage.C15903l;
import defpackage.C18207l;
import defpackage.C18725l;
import defpackage.C18740l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C5501l;
import defpackage.C7507l;
import defpackage.C7517l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.C8499l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC13922l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedAlbum;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedAlbum implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final InterfaceC1388l f36655l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15903l f36656l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final int f36657l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final Map f36658l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f36659l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final String f36660l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f36661l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public CachedEmbeddedThumb f36662l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f36664l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f36667l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f36668l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C1332l f36671l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36665l = "";

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f36670l = "";

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f36663l = "";

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f36669l = "";

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C5501l f36666l = new C5501l(3, AbstractC18202l.yandex.loadAd(CachedTrack.class));

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedAlbum$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedAlbum.f36657l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedAlbum();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedAlbum.f36658l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedAlbum.f36655l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedAlbum.f36656l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            C7507l c7507l = new C7507l("CachedAlbum", "uid", 10L, 0L, AbstractC10340l.crashlytics(), 0);
            C11085l c11085lLoadAd = AbstractC0593l.loadAd("uid", 3, 1, null, "", true, true, false);
            C11085l c11085lLoadAd2 = AbstractC0593l.loadAd("id", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd3 = AbstractC0593l.loadAd("ownerId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd4 = AbstractC0593l.loadAd("accessKey", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd5 = AbstractC0593l.loadAd("mainColor", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd6 = AbstractC0593l.loadAd("title", 3, 1, null, "", false, false, false);
            C2336l c2336l = AbstractC18202l.yandex;
            return new C3971l(c7507l, AbstractC14055l.remoteconfig(c11085lLoadAd, c11085lLoadAd2, c11085lLoadAd3, c11085lLoadAd4, c11085lLoadAd5, c11085lLoadAd6, AbstractC0593l.loadAd("thumb", 9, 1, c2336l.loadAd(CachedEmbeddedThumb.class), "", true, false, false), AbstractC0593l.loadAd("localizedSearchTitle", 3, 1, null, "", false, false, true), AbstractC0593l.loadAd("artist", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("usedInTracks", 10, 2, c2336l.loadAd(CachedTrack.class), "album", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedAlbum.f36660l;
        }
    }

    static {
        C0544l c0544l = new C0544l(CachedAlbum.class, "usedInTracks", "getUsedInTracks()Lio/realm/kotlin/query/RealmResults;", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        f36659l = new InterfaceC13922l[]{c2336l.admob(c0544l)};
        INSTANCE = new Companion();
        f36655l = c2336l.loadAd(CachedAlbum.class);
        f36660l = "CachedAlbum";
        C8195l c8195l = new C8195l("uid", new C8195l(c2336l.loadAd(String.class), C7517l.f15530l));
        Class cls = Long.TYPE;
        f36658l = AbstractC8676l.remoteconfig(c8195l, new C8195l("id", new C8195l(c2336l.loadAd(cls), C18740l.f36522l)), new C8195l("ownerId", new C8195l(c2336l.loadAd(cls), C11243l.f22636l)), new C8195l("accessKey", new C8195l(c2336l.loadAd(String.class), C8499l.f17585l)), new C8195l("mainColor", new C8195l(c2336l.loadAd(String.class), C11875l.f23695l)), new C8195l("title", new C8195l(c2336l.loadAd(String.class), C10929l.f22050l)), new C8195l("thumb", new C8195l(c2336l.loadAd(CachedEmbeddedThumb.class), C12296l.f24368l)), new C8195l("localizedSearchTitle", new C8195l(c2336l.loadAd(String.class), C13845l.f27080l)), new C8195l("artist", new C8195l(c2336l.loadAd(String.class), C18207l.f35657l)), new C8195l("usedInTracks", new C8195l(c2336l.loadAd(CachedTrack.class), C14411l.f28228l)));
        f36656l = C15903l.f31212l;
        f36657l = 1;
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36671l() {
        return this.f36671l;
    }

    public final void ad(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36670l = str;
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

    public final void adcel(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36663l = str;
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

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36671l = c1332l;
    }

    public final void advert(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36665l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
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

    public final long billing() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36661l;
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

    public final long crashlytics() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36664l;
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

    public final int hashCode() {
        return C2782l.pro(this);
    }

    public final String isPro() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36670l;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void license(long j) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36661l = j;
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

    public final String loadAd() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36669l;
        }
        long j = c1332l.crashlytics("artist").amazon;
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

    public final void metrica(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36669l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("artist").amazon;
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

    public final void pro(CachedEmbeddedThumb cachedEmbeddedThumb) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36662l = cachedEmbeddedThumb;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1332l.yandex();
        long j = c1332l.crashlytics("thumb").amazon;
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

    public final String purchase() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36667l;
        }
        long j = c1332l.crashlytics("mainColor").amazon;
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

    public final String remoteconfig() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36665l;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void startapp(long j) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36664l = j;
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

    public final CachedEmbeddedThumb subs() {
        InterfaceC2851l interfaceC2851lIsPro;
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36662l;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("thumb").amazon;
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

    public final void subscription(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36667l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("mainColor").amazon;
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

    public final String toString() {
        return C2782l.ad(this);
    }

    public final void vip(String str) {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            this.f36668l = str;
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

    public final String yandex() {
        C1332l c1332l = this.f36671l;
        if (c1332l == null) {
            return this.f36668l;
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
