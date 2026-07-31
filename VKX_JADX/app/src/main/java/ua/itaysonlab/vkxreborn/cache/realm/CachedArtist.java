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
import defpackage.C0717l;
import defpackage.C1332l;
import defpackage.C17514l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4215l;
import defpackage.C4272l;
import defpackage.C7194l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedArtist;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedArtist implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C4215l f36672l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int f36673l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f36674l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC1388l f36675l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Map f36676l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1332l f36677l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f36678l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36679l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedArtist$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedArtist.f36673l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedArtist();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedArtist.f36676l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedArtist.f36675l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedArtist.f36672l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedArtist", "id", 2L, 0L, AbstractC10340l.crashlytics(), 0), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("id", 3, 1, null, "", true, true, false), AbstractC0593l.loadAd("name", 3, 1, null, "", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedArtist.f36674l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36675l = c2336l.loadAd(CachedArtist.class);
        f36674l = "CachedArtist";
        f36676l = AbstractC8676l.remoteconfig(new C8195l("id", new C8195l(c2336l.loadAd(String.class), C7194l.f15024l)), new C8195l("name", new C8195l(c2336l.loadAd(String.class), C17514l.f34132l)));
        f36672l = C4215l.f8644l;
        f36673l = 1;
    }

    public CachedArtist(MainArtist mainArtist) {
        this();
        String str = mainArtist.yandex;
        purchase(str == null ? "" : str);
        billing(mainArtist.crashlytics);
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36677l() {
        return this.f36677l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36677l = c1332l;
    }

    public final void billing(String str) {
        C1332l c1332l = this.f36677l;
        if (c1332l == null) {
            this.f36678l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("name").amazon;
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

    public final String crashlytics() {
        C1332l c1332l = this.f36677l;
        if (c1332l == null) {
            return this.f36678l;
        }
        long j = c1332l.crashlytics("name").amazon;
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

    public final String loadAd() {
        C1332l c1332l = this.f36677l;
        if (c1332l == null) {
            return this.f36679l;
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
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final void purchase(String str) {
        C1332l c1332l = this.f36677l;
        if (c1332l == null) {
            this.f36679l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("id").amazon;
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

    public final MainArtist yandex() {
        return new MainArtist(loadAd(), loadAd(), crashlytics(), null, true);
    }

    public CachedArtist() {
        this.f36679l = "";
        this.f36678l = "";
    }
}
