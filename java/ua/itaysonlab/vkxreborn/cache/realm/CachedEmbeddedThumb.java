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
import defpackage.C12409l;
import defpackage.C1332l;
import defpackage.C13794l;
import defpackage.C1385l;
import defpackage.C14161l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3821l;
import defpackage.C3971l;
import defpackage.C4272l;
import defpackage.C7507l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.InterfaceC13166l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedEmbeddedThumb;", "Llؘْٙ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedEmbeddedThumb implements InterfaceC13166l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final InterfaceC1388l f36680l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final String f36681l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final int f36682l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Map f36683l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f36684l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f36685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36686l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f36687l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f36688l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C1332l f36689l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedEmbeddedThumb$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedEmbeddedThumb.f36682l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedEmbeddedThumb();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedEmbeddedThumb.f36683l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedEmbeddedThumb.f36680l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            Companion companion = CachedEmbeddedThumb.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            return new C3971l(new C7507l("CachedEmbeddedThumb", "", 5L, 0L, AbstractC10340l.crashlytics(), 1), AbstractC14055l.remoteconfig(AbstractC0593l.loadAd("photo135", 3, 1, null, "", true, false, false), AbstractC0593l.loadAd("photo270", 3, 1, null, "", true, false, false), AbstractC0593l.loadAd("photo300", 3, 1, null, "", true, false, false), AbstractC0593l.loadAd("photo600", 3, 1, null, "", true, false, false), AbstractC0593l.loadAd("photo1200", 3, 1, null, "", true, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedEmbeddedThumb.f36681l;
        }
    }

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        f36680l = c2336l.loadAd(CachedEmbeddedThumb.class);
        f36681l = "CachedEmbeddedThumb";
        f36683l = AbstractC8676l.remoteconfig(new C8195l("photo135", new C8195l(c2336l.loadAd(String.class), C3821l.f7940l)), new C8195l("photo270", new C8195l(c2336l.loadAd(String.class), C13794l.f26926l)), new C8195l("photo300", new C8195l(c2336l.loadAd(String.class), C12409l.f24503l)), new C8195l("photo600", new C8195l(c2336l.loadAd(String.class), C1385l.f3546l)), new C8195l("photo1200", new C8195l(c2336l.loadAd(String.class), C14161l.f27693l)));
        f36682l = 2;
    }

    public CachedEmbeddedThumb(AlbumThumb albumThumb) {
        remoteconfig(albumThumb.yandex);
        vip(albumThumb.loadAd);
        metrica(albumThumb.crashlytics);
        startapp(albumThumb.amazon);
        isPro(albumThumb.purchase);
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36689l() {
        return this.f36689l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36689l = c1332l;
    }

    public final String billing() {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            return this.f36684l;
        }
        long j = c1332l.crashlytics("photo300").amazon;
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

    public final String crashlytics() {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            return this.f36686l;
        }
        long j = c1332l.crashlytics("photo135").amazon;
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

    public final void isPro(String str) {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            this.f36687l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo1200").amazon;
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

    public final String loadAd() {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            return this.f36687l;
        }
        long j = c1332l.crashlytics("photo1200").amazon;
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
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            this.f36684l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo300").amazon;
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

    public final String purchase() {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            return this.f36685l;
        }
        long j = c1332l.crashlytics("photo270").amazon;
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

    public final void remoteconfig(String str) {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            this.f36686l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo135").amazon;
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

    public final void startapp(String str) {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            this.f36688l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo600").amazon;
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

    public final String subs() {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            return this.f36688l;
        }
        long j = c1332l.crashlytics("photo600").amazon;
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

    public final void vip(String str) {
        C1332l c1332l = this.f36689l;
        if (c1332l == null) {
            this.f36685l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("photo270").amazon;
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

    public final AlbumThumb yandex() {
        return new AlbumThumb(crashlytics(), purchase(), billing(), subs(), loadAd());
    }
}
